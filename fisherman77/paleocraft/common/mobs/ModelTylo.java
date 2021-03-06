// Date: 1/26/2013 7:49:00 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTylo extends ModelBase
{
  //fields
    ModelRenderer RightBackFin;
    ModelRenderer LeftBackFin;
    ModelRenderer LeftFrontFin;
    ModelRenderer RightFrontFin;
    ModelRenderer TailFin;
    ModelRenderer Tail4;
    ModelRenderer Tail3;
    ModelRenderer Tail2;
    ModelRenderer Tail1;
    ModelRenderer JawsTip;
    ModelRenderer Jaws;
    ModelRenderer Head;
    ModelRenderer Body2;
    ModelRenderer Body1;
  
  public ModelTylo()
  {
    textureWidth = 200;
    textureHeight = 200;
    
      RightBackFin = new ModelRenderer(this, 45, 136);
      RightBackFin.addBox(-11F, 0F, -4F, 11, 1, 7);
      RightBackFin.setRotationPoint(-3F, 21F, 34F);
      RightBackFin.setTextureSize(200, 200);
      RightBackFin.mirror = true;
      setRotation(RightBackFin, 0F, 0F, -0.4363323F);
      LeftBackFin = new ModelRenderer(this, 120, 138);
      LeftBackFin.addBox(-1F, 0F, -4F, 11, 1, 7);
      LeftBackFin.setRotationPoint(4F, 21F, 34F);
      LeftBackFin.setTextureSize(200, 200);
      LeftBackFin.mirror = true;
      setRotation(LeftBackFin, 0F, 0F, 0.4363323F);
      LeftFrontFin = new ModelRenderer(this, 115, 168);
      LeftFrontFin.addBox(-1F, 0F, -4F, 12, 1, 9);
      LeftFrontFin.setRotationPoint(5F, 21F, 1F);
      LeftFrontFin.setTextureSize(200, 200);
      LeftFrontFin.mirror = true;
      setRotation(LeftFrontFin, 0F, 0F, 0.4363323F);
      RightFrontFin = new ModelRenderer(this, 21, 101);
      RightFrontFin.addBox(-13F, 0F, -4F, 12, 1, 9);
      RightFrontFin.setRotationPoint(-3F, 21F, 1F);
      RightFrontFin.setTextureSize(200, 200);
      RightFrontFin.mirror = true;
      setRotation(RightFrontFin, 0F, 0F, -0.4363323F);
      TailFin = new ModelRenderer(this, 80, 72);
      TailFin.addBox(0F, -25F, 16F, 0, 18, 25);
      TailFin.setRotationPoint(0F, 16F, 56F);
      TailFin.setTextureSize(200, 200);
      TailFin.mirror = true;
      setRotation(TailFin, -0.3490659F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 118, 71);
      Tail4.addBox(-1F, -8F, 33F, 2, 3, 14);
      Tail4.setRotationPoint(0F, 16F, 56F);
      Tail4.setTextureSize(200, 200);
      Tail4.mirror = true;
      setRotation(Tail4, -0.3665191F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 144, 39);
      Tail3.addBox(-2F, -7F, 16F, 4, 4, 18);
      Tail3.setRotationPoint(0F, 16F, 56F);
      Tail3.setTextureSize(200, 200);
      Tail3.mirror = true;
      setRotation(Tail3, -0.3316126F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 125, 5);
      Tail2.addBox(-2.5F, -2F, 0F, 5, 5, 18);
      Tail2.setRotationPoint(0F, 16F, 56F);
      Tail2.setTextureSize(200, 200);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 76, 27);
      Tail1.addBox(0F, 0F, 0F, 6, 6, 18);
      Tail1.setRotationPoint(-3F, 14F, 38F);
      Tail1.setTextureSize(200, 200);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      JawsTip = new ModelRenderer(this, 4, 2);
      JawsTip.addBox(-2.5F, -1F, -25F, 5, 5, 7);
      JawsTip.setRotationPoint(0F, 18F, -5F);
      JawsTip.setTextureSize(200, 200);
      JawsTip.mirror = true;
      setRotation(JawsTip, 0F, 0F, 0F);
      Jaws = new ModelRenderer(this, 30, 0);
      Jaws.addBox(-3F, -2F, -18F, 6, 6, 8);
      Jaws.setRotationPoint(0F, 18F, -5F);
      Jaws.setTextureSize(200, 200);
      Jaws.mirror = true;
      setRotation(Jaws, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 59, 0);
      Head.addBox(-3.5F, -3F, -10F, 7, 7, 10);
      Head.setRotationPoint(0F, 18F, -5F);
      Head.setTextureSize(200, 200);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 40, 56);
      Body2.addBox(0F, 0F, 0F, 7, 9, 18);
      Body2.setRotationPoint(-3.5F, 14F, 20F);
      Body2.setTextureSize(200, 200);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      Body1 = new ModelRenderer(this, 0, 21);
      Body1.addBox(0F, 0F, 0F, 8, 10, 25);
      Body1.setRotationPoint(-4F, 14F, -5F);
      Body1.setTextureSize(200, 200);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    RightBackFin.render(f5);
    LeftBackFin.render(f5);
    LeftFrontFin.render(f5);
    RightFrontFin.render(f5);
    TailFin.render(f5);
    Tail4.render(f5);
    Tail3.render(f5);
    Tail2.render(f5);
    Tail1.render(f5);
    JawsTip.render(f5);
    Jaws.render(f5);
    Head.render(f5);
    Body2.render(f5);
    Body1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    //super.setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.rotateAngleY = f3 / 57.29578F;
	  Head.rotateAngleX = f4 / 57.29578F;
	 Jaws.rotateAngleY = f3 / 57.29578F;
	  Jaws.rotateAngleX = f4 / 57.29578F;
	  JawsTip.rotateAngleY = f3 / 57.29578F;
	  JawsTip.rotateAngleX = f4 / 57.29578F;
  }

}
