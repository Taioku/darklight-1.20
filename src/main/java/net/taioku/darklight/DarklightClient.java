package net.taioku.darklight;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.taioku.darklight.block.entity.ModBlockEntities;
import net.taioku.darklight.block.entity.client.MortarBlockRenderer;
import net.taioku.darklight.block.entity.client.ResearchTableBlockRenderer;

public class DarklightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockEntityRendererFactories.register(ModBlockEntities.MORTAR, MortarBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.RESEARCH_TABLE, ResearchTableBlockRenderer::new);
	}
}