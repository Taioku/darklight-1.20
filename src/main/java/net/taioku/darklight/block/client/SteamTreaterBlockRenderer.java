package net.taioku.darklight.block.client;

import net.minecraft.block.BlockState;
import net.minecraft.block.enums.ArmPart;
import net.minecraft.block.enums.TreaterPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.custom.ModDTransmutationArmBlock;
import net.taioku.darklight.block.custom.ModSteamTreaterBlock;
import net.taioku.darklight.block.entity.tile.SteamTreaterBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class SteamTreaterBlockRenderer extends GeoBlockRenderer<SteamTreaterBlockEntity> {
    public SteamTreaterBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new SteamTreaterBlockModel());
    }

    @Override
    public void defaultRender(MatrixStack poseStack, SteamTreaterBlockEntity animatable, VertexConsumerProvider bufferSource, RenderLayer renderType, VertexConsumer buffer, float yaw, float partialTick, int packedLight) {
        BlockState state = animatable.getWorld().getBlockState(animatable.getPos());
        if (state.getBlock() == ModBlocks.STEAM_TREATER && state.get(ModSteamTreaterBlock.PART).equals(TreaterPart.BOTTOM)) {
            super.defaultRender(poseStack, animatable, bufferSource, null, null, 0, partialTick, packedLight);
        }
    }
}
