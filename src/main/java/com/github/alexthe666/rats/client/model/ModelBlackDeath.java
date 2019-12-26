package com.github.alexthe666.rats.client.model;

import com.github.alexthe666.rats.server.entity.EntityBlackDeath;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class ModelBlackDeath<T extends EntityBlackDeath> extends EntityModel<T> {
    public RendererModel head;
    public RendererModel hat;
    public RendererModel body;
    public RendererModel arms;
    public RendererModel leg0;
    public RendererModel leg1;
    public RendererModel nose;
    public RendererModel rightArm;
    public RendererModel leftArm;
    public RendererModel plagueMaskNose;
    public RendererModel brim;
    public RendererModel plagueMaskNose_1;

    public ModelBlackDeath() {
        this(0, 0, 64, 128);
    }

    public ModelBlackDeath(float scaleFactor, float p_i47227_2_, int textureWidthIn, int textureHeightIn) {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.head = (new RendererModel(this)).setTextureSize(textureWidthIn, textureHeightIn);
        this.head.setRotationPoint(0.0F, 0.0F + p_i47227_2_, 0.0F);
        this.head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, scaleFactor);
        this.hat = (new RendererModel(this, 32, 0)).setTextureSize(textureWidthIn, textureHeightIn);
        this.hat.addBox(-4.0F, -10.0F, -4.0F, 8, 12, 8, scaleFactor + 0.45F);
        this.head.addChild(this.hat);
        this.hat.showModel = false;
        this.nose = (new RendererModel(this)).setTextureSize(textureWidthIn, textureHeightIn);
        this.nose.setRotationPoint(0.0F, p_i47227_2_ - 2.0F, 0.0F);
        this.nose.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, scaleFactor);
        this.head.addChild(this.nose);
        this.body = (new RendererModel(this)).setTextureSize(textureWidthIn, textureHeightIn);
        this.body.setRotationPoint(0.0F, 0.0F + p_i47227_2_, 0.0F);
        this.body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, scaleFactor);
        this.body.setTextureOffset(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, scaleFactor + 0.5F);
        this.arms = (new RendererModel(this)).setTextureSize(textureWidthIn, textureHeightIn);
        this.arms.setRotationPoint(0.0F, 0.0F + p_i47227_2_ + 2.0F, 0.0F);
        this.arms.setTextureOffset(44, 22).addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, scaleFactor);
        RendererModel RendererModel = (new RendererModel(this, 44, 22)).setTextureSize(textureWidthIn, textureHeightIn);
        RendererModel.mirror = true;
        RendererModel.addBox(4.0F, -2.0F, -2.0F, 4, 8, 4, scaleFactor);
        this.arms.addChild(RendererModel);
        this.arms.setTextureOffset(40, 38).addBox(-4.0F, 2.0F, -2.0F, 8, 4, 4, scaleFactor);
        this.leg0 = (new RendererModel(this, 0, 22)).setTextureSize(textureWidthIn, textureHeightIn);
        this.leg0.setRotationPoint(-2.0F, 12.0F + p_i47227_2_, 0.0F);
        this.leg0.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, scaleFactor);
        this.leg1 = (new RendererModel(this, 0, 22)).setTextureSize(textureWidthIn, textureHeightIn);
        this.leg1.mirror = true;
        this.leg1.setRotationPoint(2.0F, 12.0F + p_i47227_2_, 0.0F);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, scaleFactor);
        this.rightArm = (new RendererModel(this, 40, 46)).setTextureSize(textureWidthIn, textureHeightIn);
        this.rightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, scaleFactor);
        this.rightArm.setRotationPoint(-5.0F, 2.0F + p_i47227_2_, 0.0F);
        this.leftArm = (new RendererModel(this, 40, 46)).setTextureSize(textureWidthIn, textureHeightIn);
        this.leftArm.mirror = true;
        this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, scaleFactor);
        this.leftArm.setRotationPoint(5.0F, 2.0F + p_i47227_2_, 0.0F);
        this.plagueMaskNose_1 = new RendererModel(this, 16, 87);
        this.plagueMaskNose_1.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.plagueMaskNose_1.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 4, 0.1F);
        this.setRotateAngle(plagueMaskNose_1, 0.17453292519943295F, 0.0F, 0.0F);
        this.plagueMaskNose = new RendererModel(this, 0, 87);
        this.plagueMaskNose.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.plagueMaskNose.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 5, 0.1F);
        this.setRotateAngle(plagueMaskNose, 0.17453292519943295F, 0.0F, 0.0F);
        this.brim = new RendererModel(this, -14, 95);
        this.brim.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.brim.addBox(-7.0F, 1.0F, -7.0F, 14, 0, 14, 0.1F);
        this.plagueMaskNose.addChild(this.plagueMaskNose_1);
        this.head.addChild(this.plagueMaskNose);
        this.head.addChild(this.brim);
    }

    public void render(EntityBlackDeath abstractillager, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, abstractillager);
        this.head.render(scale);
        this.body.render(scale);
        this.leg0.render(scale);
        this.leg1.render(scale);
        if (!abstractillager.isSummoning()) {
            this.arms.render(scale);
        } else {
            this.rightArm.render(scale);
            this.leftArm.render(scale);
        }
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.arms.rotationPointY = 3.0F;
        this.arms.rotationPointZ = -1.0F;
        this.arms.rotateAngleX = -0.75F;
        this.leg0.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount * 0.5F;
        this.leg0.rotateAngleY = 0.0F;
        this.leg1.rotateAngleY = 0.0F;
        EntityBlackDeath abstractillager = (EntityBlackDeath) entityIn;
        if (abstractillager.isSummoning()) {
            this.rightArm.rotationPointZ = 0.0F;
            this.rightArm.rotationPointX = -5.0F;
            this.leftArm.rotationPointZ = 0.0F;
            this.leftArm.rotationPointX = 5.0F;
            this.rightArm.rotateAngleX = MathHelper.cos(ageInTicks * 0.6662F) * 0.25F;
            this.leftArm.rotateAngleX = MathHelper.cos(ageInTicks * 0.6662F) * 0.25F;
            this.rightArm.rotateAngleZ = 2.3561945F;
            this.leftArm.rotateAngleZ = -2.3561945F;
            this.rightArm.rotateAngleY = 0.0F;
            this.leftArm.rotateAngleY = 0.0F;
        }
    }

    public RendererModel getArm(HandSide p_191216_1_) {
        return p_191216_1_ == HandSide.LEFT ? this.leftArm : this.rightArm;
    }

    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}