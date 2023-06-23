package net.taioku.darklight.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegisty {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.SHINE_LOG, 5, 20);
        registry.add(ModBlocks.SHINE_PLANKS, 5, 20);
        registry.add(ModBlocks.STRIPPED_SHINE_LOG, 5, 20);
        registry.add(ModBlocks.STRIPPED_SHINE_WOOD, 5, 20);

        registry.add(ModBlocks.SHINE_LEAVES, 5, 20);
        registry.add(ModBlocks.SHINE_PLANKS, 5, 20);

        registry.add(ModBlocks.SHINE_SAPLING, 5, 20);
    }
}
