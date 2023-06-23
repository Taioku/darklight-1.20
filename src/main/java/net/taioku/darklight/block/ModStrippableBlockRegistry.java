package net.taioku.darklight.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.SHINE_LOG, ModBlocks.STRIPPED_SHINE_LOG);
        StrippableBlockRegistry.register(ModBlocks.SHINE_WOOD, ModBlocks.STRIPPED_SHINE_WOOD);
     }
}
