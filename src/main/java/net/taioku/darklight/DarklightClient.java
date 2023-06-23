package net.taioku.darklight;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.entity.ModBlockEntities;
import net.taioku.darklight.block.entity.client.MortarBlockRenderer;
import net.taioku.darklight.block.entity.client.ResearchTableBlockRenderer;

public class DarklightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_SAPLING, RenderLayer.getCutout());

		BlockEntityRendererFactories.register(ModBlockEntities.MORTAR, MortarBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.RESEARCH_TABLE, ResearchTableBlockRenderer::new);
	}
}