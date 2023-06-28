package net.taioku.darklight.block.entity.client;

import net.minecraft.block.Block;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RotationAxis;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.PillarEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.layer.BlockAndItemGeoLayer;

public class PillarBlockRenderer extends GeoBlockRenderer<PillarEntity> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Darklight.MOD_ID);

    public PillarBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new PillarBlockModel());

        addRenderLayer(new BlockAndItemGeoLayer<>(this) {
            @Override
            protected ItemStack getStackForBone(GeoBone bone, PillarEntity animatable) {
                return switch (bone.getName()) {
                    case "boneItem" -> animatable.getRenderStack();
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
                LOGGER.info("\nrenderStackForBone -" + "\nBone: " + bone.getName() + "\nStack: " + stack + "\nAnimatable: " + animatable);
                if (stack == animatable.getRenderStack()) {
                    poseStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
                }
                super.renderStackForBone(poseStack, bone, stack, animatable, bufferSource, partialTick, packedLight, packedOverlay);
            }
        });
    }
}
