package net.taioku.darklight.block.entity.client;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.taioku.darklight.block.entity.entities.PillarEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.layer.BlockAndItemGeoLayer;

public class PillarBlockRenderer extends GeoBlockRenderer<PillarEntity> {
    ItemStack itemStack;

    public PillarBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new PillarBlockModel());

        addRenderLayer(new BlockAndItemGeoLayer<>(this) {
            @Override
            protected ItemStack getStackForBone(GeoBone bone, PillarEntity animatable) {
                return switch (bone.getName()) {
                    case "boneItem" -> itemStack;
                    default -> null;
                };
            }

            @Override
            protected ModelTransformationMode getTransformTypeForStack(GeoBone bone, ItemStack stack, PillarEntity animatable) {
                return switch (bone.getName()) {
                    case "boneItem" -> ModelTransformationMode.GROUND;
                    default -> ModelTransformationMode.NONE;
                };
            }

            @Override
            protected void renderStackForBone(MatrixStack poseStack, GeoBone bone, ItemStack stack, PillarEntity animatable,
                                              VertexConsumerProvider bufferSource, float partialTick, int packedLight, int packedOverlay) {
                if (stack == itemStack) {
                    poseStack.translate(0.0f, 1.0f, 0.0f);
                }
                super.renderStackForBone(poseStack, bone, stack, animatable, bufferSource, partialTick, packedLight, packedOverlay);
            }
        });
    }

    @Override
    public void preRender(MatrixStack poseStack, PillarEntity animatable, BakedGeoModel model, VertexConsumerProvider bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
        this.itemStack = animatable.getRenderStack();
    }
}
