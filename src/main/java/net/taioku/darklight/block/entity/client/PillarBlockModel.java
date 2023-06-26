package net.taioku.darklight.block.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.PillarEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class PillarBlockModel extends GeoModel<PillarEntity> implements GeoRenderer<PillarEntity> {
    @Override
    public Identifier getModelResource(PillarEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/pillar.geo.json");
    }

    @Override
    public Identifier getTextureResource(PillarEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/pillar.png");
    }

    @Override
    public Identifier getAnimationResource(PillarEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/pillar.animation.json");
    }

    @Override
    public GeoModel<PillarEntity> getGeoModel() {
        return null;
    }

    @Override
    public PillarEntity getAnimatable() {
        return null;
    }

    @Override
    public void fireCompileRenderLayersEvent() {

    }

    @Override
    public boolean firePreRenderEvent(MatrixStack poseStack, BakedGeoModel model, VertexConsumerProvider bufferSource, float partialTick, int packedLight) {
        return false;
    }

    @Override
    public void firePostRenderEvent(MatrixStack poseStack, BakedGeoModel model, VertexConsumerProvider bufferSource, float partialTick, int packedLight) {

    }

    @Override
    public void updateAnimatedTextureFrame(PillarEntity animatable) {

    }
}
