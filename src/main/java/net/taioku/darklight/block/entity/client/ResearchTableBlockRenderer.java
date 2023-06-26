package net.taioku.darklight.block.entity.client;

import net.minecraft.block.BlockState;
import net.minecraft.block.enums.TablePart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.custom.ModResearchTableBlock;
import net.taioku.darklight.block.entity.entities.ResearchTableEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ResearchTableBlockRenderer extends GeoBlockRenderer<ResearchTableEntity> {
    public ResearchTableBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new ResearchTableBlockModel());
    }

    @Override
    public void defaultRender(MatrixStack poseStack, ResearchTableEntity animatable, VertexConsumerProvider bufferSource, RenderLayer renderType, VertexConsumer buffer, float yaw, float partialTick, int packedLight) {
        BlockState state = animatable.getWorld().getBlockState(animatable.getPos());
        if (state.getBlock() == ModBlocks.RESEARCH_TABLE && state.get(ModResearchTableBlock.PART).equals(TablePart.LEFT)) {
            super.defaultRender(poseStack, animatable, bufferSource, null, null, 0, partialTick, packedLight);
        }
    }
}
