package net.taioku.darklight.block.tags;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.fluid.ModFluids;

public class ClientBlockRenderLayers {
    public static void mapLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_TALL_GRASS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER);
    }
}
