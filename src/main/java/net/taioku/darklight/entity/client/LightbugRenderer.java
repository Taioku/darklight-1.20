package net.taioku.darklight.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.taioku.darklight.entity.custom.LightbugEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class LightbugRenderer extends GeoEntityRenderer<LightbugEntity> {
    public LightbugRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LightbugModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }

    @Override
    public void render(LightbugEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
