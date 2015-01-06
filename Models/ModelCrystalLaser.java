/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 21/08/2014 1:17:22 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;

public class ModelCrystalLaser extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape6;
	LODModelPart Shape6a;

	public ModelCrystalLaser()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 50, 0);
		Shape1.addBox(-1F, -1F, 0F, 2, 2, 2);
		Shape1.setRotationPoint(0F, 16F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 50, 6);
		Shape1a.addBox(-2F, -2F, 0F, 4, 4, 2);
		Shape1a.setRotationPoint(0F, 16F, -6F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 38, 14);
		Shape1b.addBox(-3F, -3F, 0F, 6, 6, 3);
		Shape1b.setRotationPoint(0F, 16F, -4F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape1c = new LODModelPart(this, 34, 0);
		Shape1c.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape1c.setRotationPoint(0F, 16F, 7F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0F);
		Shape1d = new LODModelPart(this, 0, 0);
		Shape1d.addBox(-4F, -4F, 0F, 8, 8, 8);
		Shape1d.setRotationPoint(0F, 16F, -1F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 64, 0);
		Shape3.addBox(0F, 0F, 0F, 16, 16, 5);
		Shape3.setRotationPoint(-8F, 8F, 1F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 10, 94);
		Shape4.addBox(0F, 0F, 0F, 2, 14, 2);
		Shape4.setRotationPoint(-7F, 9F, 6F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 94);
		Shape4a.addBox(0F, 0F, 0F, 2, 14, 2);
		Shape4a.setRotationPoint(5F, 9F, 6F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 89);
		Shape5.addBox(0F, 0F, 0F, 10, 2, 2);
		Shape5.setRotationPoint(-5F, 21F, 6F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 0, 84);
		Shape5a.addBox(0F, 0F, 0F, 10, 2, 2);
		Shape5a.setRotationPoint(-5F, 9F, 6F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 65);
		Shape2.addBox(-5F, -4F, 1F, 1, 8, 10);
		Shape2.setRotationPoint(0F, 16F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, -0.2181662F, 0F);
		Shape2a = new LODModelPart(this, 0, 46);
		Shape2a.addBox(4F, -4F, 1F, 1, 8, 10);
		Shape2a.setRotationPoint(0F, 16F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0.2181662F, 0F);
		Shape6 = new LODModelPart(this, 0, 33);
		Shape6.addBox(-4F, 4F, 1F, 8, 1, 10);
		Shape6.setRotationPoint(0F, 16F, -8F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, -0.2181662F, 0F, 0F);
		Shape6a = new LODModelPart(this, 0, 21);
		Shape6a.addBox(-4F, -5F, 1F, 8, 1, 10);
		Shape6a.setRotationPoint(0F, 16F, -8F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0.2181662F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li)
	{
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape1d.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape5.render(te, f5);
		Shape5a.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
