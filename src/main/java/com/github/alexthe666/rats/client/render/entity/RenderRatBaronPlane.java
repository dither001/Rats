package com.github.alexthe666.rats.client.render.entity;

import com.github.alexthe666.rats.client.model.ModelBiplane;
import com.github.alexthe666.rats.client.model.ModelPiratBoat;
import com.github.alexthe666.rats.server.entity.EntityPiratBoat;
import com.github.alexthe666.rats.server.entity.EntityRatBaron;
import com.github.alexthe666.rats.server.entity.EntityRatBaronPlane;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderRatBaronPlane extends MobRenderer<EntityRatBaronPlane, ModelBiplane<EntityRatBaronPlane>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("rats:textures/entity/ratlantis/rat_baron_plane.png");

    public RenderRatBaronPlane() {
        super(Minecraft.getInstance().getRenderManager(), new ModelBiplane(), 1.65F);
    }

    protected void preRenderCallback(EntityRatBaronPlane entity, MatrixStack matrixStackIn, float partialTickTime) {
        float f7 = entity.prevPlanePitch + (entity.getPlanePitch() - entity.prevPlanePitch) * partialTickTime;
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(f7));
    }

    public ResourceLocation getEntityTexture(EntityRatBaronPlane entity) {
        return TEXTURE;
    }
}
