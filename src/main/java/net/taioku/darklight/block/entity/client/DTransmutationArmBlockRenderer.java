package net.taioku.darklight.block.entity.client;

import net.minecraft.block.BlockState;
import net.minecraft.block.enums.ArmPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.custom.ModDTransmutationArmBlock;
import net.taioku.darklight.block.custom.ModHTransmutationArmBlock;
import net.taioku.darklight.block.entity.entities.DTransmutationArmBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class DTransmutationArmBlockRenderer extends GeoBlockRenderer<DTransmutationArmBlockEntity> {
    public DTransmutationArmBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new DTransmutationArmBlockModel());
    }

    @Override
    public void defaultRender(MatrixStack poseStack, DTransmutationArmBlockEntity animatable, VertexConsumerProvider bufferSource, RenderLayer renderType, VertexConsumer buffer, float yaw, float partialTick, int packedLight) {
        BlockState state = animatable.getWorld().getBlockState(animatable.getPos());
        if (state.getBlock() == ModBlocks.D_TRANSMUTATION_ARM && state.get(ModDTransmutationArmBlock.PART).equals(ArmPart.BOTTOM)) {
            super.defaultRender(poseStack, animatable, bufferSource, null, null, 0, partialTick, packedLight);
        }
    }
}
