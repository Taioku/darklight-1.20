package net.taioku.darklight.entity.client;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.taioku.darklight.entity.custom.SoulEntity;
import net.taioku.darklight.particle.ModParticles;
import org.joml.Vector3d;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SoulRenderer extends GeoEntityRenderer<SoulEntity> {
    private int currentTick = -1;

    public SoulRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new SoulModel());
    }

    @Override
    public void renderFinal(MatrixStack poseStack, SoulEntity animatable, BakedGeoModel model, VertexConsumerProvider bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        if (this.currentTick < 0 || this.currentTick != animatable.age) {
            this.currentTick = animatable.age;

            this.model.getBone("bone").ifPresent(bone -> {
                Vector3d bonePos = bone.getWorldPosition();

                animatable.getEntityWorld().addParticle(ModParticles.SOUL_PARTICLE,
                        bonePos.x(),
                        bonePos.y() + 0.2,
                        bonePos.z(),
                        0,
                        0,
                        0);
            });
        }
        super.renderFinal(poseStack, animatable, model, bufferSource, buffer, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
