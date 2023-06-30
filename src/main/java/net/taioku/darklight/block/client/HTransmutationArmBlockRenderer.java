package net.taioku.darklight.block.client;

import net.minecraft.block.BlockState;
import net.minecraft.block.enums.ArmPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.custom.ModHTransmutationArmBlock;
import net.taioku.darklight.block.entity.tile.HTransmutationArmBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class HTransmutationArmBlockRenderer extends GeoBlockRenderer<HTransmutationArmBlockEntity> {
    public HTransmutationArmBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new HTransmutationArmBlockModel());
    }

    @Override
    public void defaultRender(MatrixStack poseStack, HTransmutationArmBlockEntity animatable, VertexConsumerProvider bufferSource, RenderLayer renderType, VertexConsumer buffer, float yaw, float partialTick, int packedLight) {
        BlockState state = animatable.getWorld().getBlockState(animatable.getPos());
        if (state.getBlock() == ModBlocks.H_TRANSMUTATION_ARM && state.get(ModHTransmutationArmBlock.PART).equals(ArmPart.BOTTOM)) {
            super.defaultRender(poseStack, animatable, bufferSource, null, null, 0, partialTick, packedLight);
        }
    }
}
