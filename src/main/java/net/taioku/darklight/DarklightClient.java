package net.taioku.darklight;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.util.Identifier;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.entity.ModBlockEntities;
import net.taioku.darklight.block.entity.client.MortarBlockRenderer;
import net.taioku.darklight.block.entity.client.ResearchTableBlockRenderer;
import net.taioku.darklight.fluid.ModFluids;

public class DarklightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_SAPLING, RenderLayer.getCutout());

		BlockEntityRendererFactories.register(ModBlockEntities.MORTAR, MortarBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.RESEARCH_TABLE, ResearchTableBlockRenderer::new);

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xA1D3C7FF
				));

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER);
	}
}