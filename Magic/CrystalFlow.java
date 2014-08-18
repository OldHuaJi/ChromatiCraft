/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Magic;

import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.DragonAPI.Instantiable.WorldLocation;

import java.util.LinkedList;

public class CrystalFlow extends CrystalPath {

	private int remainingAmount;
	private final int maxFlow;
	public final CrystalReceiver receiver;

	public CrystalFlow(CrystalReceiver r, CrystalElement e, int amt, LinkedList<WorldLocation> li) {
		super(e, li);
		remainingAmount = amt;
		maxFlow = this.getMaxFlow();
		receiver = r;
	}

	@Override
	protected void initialize() {
		super.initialize();
		//nodes.getFirst().getTileEntity().NOT A TILE
		((CrystalTransmitter)nodes.getLast().getTileEntity()).markTarget(nodes.get(nodes.size()-2), element);
		for (int i = 1; i < nodes.size()-1; i++) {
			CrystalNetworkTile te = (CrystalNetworkTile)nodes.get(i).getTileEntity();
			WorldLocation src = nodes.get(i+1);
			WorldLocation tg = nodes.get(i-1);
			//te.markSource(src);
			te.markTarget(tg, element);
		}
	}

	public void resetTiles() {
		((CrystalTransmitter)nodes.getLast().getTileEntity()).clearTarget();
		for (int i = 1; i < nodes.size()-1; i++) {
			CrystalNetworkTile te = (CrystalNetworkTile)nodes.get(i).getTileEntity();
			WorldLocation src = nodes.get(i+1);
			WorldLocation tg = nodes.get(i-1);
			//te.markSource(null);
			te.clearTarget();
		}
	}

	private int getMaxFlow() {
		int max = transmitter.maxThroughput();
		for (int i = 1; i < nodes.size()-1; i++) {
			CrystalNetworkTile te = (CrystalNetworkTile)nodes.get(i).getTileEntity();
			max = Math.min(max, te.maxThroughput());
		}
		return max;
	}

	public boolean isComplete() {
		return remainingAmount <= 0;
	}

	int drain() {
		int ret = Math.min(maxFlow, remainingAmount)-this.getSignalLoss();
		if (ret <= 0)
			return 0;
		remainingAmount -= ret;
		return ret;
	}

}
