package net.taioku.darklight.block.client;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.RotationAxis;
import net.taioku.darklight.block.entity.tile.InfusionTableBlockEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.layer.BlockAndItemGeoLayer;

public class InfusionTableBlockRenderer extends GeoBlockRenderer<InfusionTableBlockEntity> {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    ItemStack item0;
    ItemStack item1;
    ItemStack item2;
    ItemStack item3;
    ItemStack item4;
    ItemStack item5;
    ItemStack item6;
    ItemStack item7;
    ItemStack item8;

    public InfusionTableBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new InfusionTableBlockModel());

        addRenderLayer(new BlockAndItemGeoLayer<>(this) {
            @Override
            protected ItemStack getStackForBone(GeoBone bone, InfusionTableBlockEntity animatable) {
                return switch (bone.getName()) {
                    case "item0" -> item0;
                    case "item1" -> item1;
                    case "item2" -> item2;
                    case "item3" -> item3;
                    case "item4" -> item4;
                    case "item5" -> item5;
                    case "item6" -> item6;
                    case "item7" -> item7;
                    case "item8" -> item8;
                    default -> null;
                };
            }

            @Override
            protected ModelTransformationMode getTransformTypeForStack(GeoBone bone, ItemStack stack, InfusionTableBlockEntity animatable) {
                return ModelTransformationMode.GROUND;
            }

            @Override
            protected void renderStackForBone(MatrixStack poseStack, GeoBone bone, ItemStack stack, InfusionTableBlockEntity animatable,
                                              VertexConsumerProvider bufferSource, float partialTick, int packedLight, int packedOverlay) {
                if (stack.getItem() instanceof BlockItem) {
                    poseStack.scale(0.5f, 0.5f, 0.5f);
                    switch (bone.getName()) {
                        case "item0" -> poseStack.translate(0.375f, 1.94, 0.375);
                        case "item1" -> poseStack.translate(0f, 1.94, 0.375);
                        case "item2" -> poseStack.translate(-0.375, 1.94, 0.375);

                        case "item3" -> poseStack.translate(0.375, 1.94, 0f);
                        case "item4" -> poseStack.translate(0f, 1.94, 0f);
                        case "item5" -> poseStack.translate(-0.375, 1.94, 0f);

                        case "item6" -> poseStack.translate(0.375, 1.94, -0.375);
                        case "item7" -> poseStack.translate(0f, 1.94, -0.375);
                        case "item8" -> poseStack.translate(-0.375, 1.94, -0.375);
                    }
                } else {
                    switch (bone.getName()) {
                        case "item0" -> poseStack.translate(0.187f, 1.005, 0.156f);
                        case "item1" -> poseStack.translate(0f, 1.005, 0.156f);
                        case "item2" -> poseStack.translate(-0.187f, 1.005, 0.156f);

                        case "item3" -> poseStack.translate(0.187f, 1.005, -0.032f);
                        case "item4" -> poseStack.translate(0f, 1.005, -0.032f);
                        case "item5" -> poseStack.translate(-0.187f, 1.005, -0.032f);

                        case "item6" -> poseStack.translate(0.187f, 1.005, -0.22f);
                        case "item7" -> poseStack.translate(0f, 1.005, -0.22f);
                        case "item8" -> poseStack.translate(-0.187f, 1.005   , -0.22f);
                    }
                    poseStack.scale(0.25f, 0.25f, 0.25f);
                    poseStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90f));
                }
                poseStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(animatable.getFacing()));
                super.renderStackForBone(poseStack, bone, stack, animatable, bufferSource, partialTick, packedLight, packedOverlay);
            }
        });
    }

    @Override
    public void preRender(MatrixStack poseStack, InfusionTableBlockEntity animatable, BakedGeoModel model, VertexConsumerProvider bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
        item0 = animatable.getRenderStack(0);
        item1 = animatable.getRenderStack(1);
        item2 = animatable.getRenderStack(2);
        item3 = animatable.getRenderStack(3);
        item4 = animatable.getRenderStack(4);
        item5 = animatable.getRenderStack(5);
        item6 = animatable.getRenderStack(6);
        item7 = animatable.getRenderStack(7);
        item8 = animatable.getRenderStack(8);
    }
}
