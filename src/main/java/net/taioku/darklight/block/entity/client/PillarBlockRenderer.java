package net.taioku.darklight.block.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.taioku.darklight.block.entity.entities.PillarEntity;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.layer.BlockAndItemGeoLayer;

public class PillarBlockRenderer extends GeoBlockRenderer<PillarEntity> {
    public PillarBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new PillarBlockModel());
        this.addRenderLayer(new BlockAndItemGeoLayer<PillarEntity>(this) {
            @Override
            protected void renderStackForBone(MatrixStack poseStack, GeoBone bone, ItemStack stack, PillarEntity animatable, VertexConsumerProvider bufferSource, float partialTick, int packedLight, int packedOverlay) {
                ItemStack item = animatable.getRenderStack();
                super.renderStackForBone(poseStack, bone, item, animatable, bufferSource, partialTick, packedLight, packedOverlay);
            }
        });
    }
}
