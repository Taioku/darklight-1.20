package net.taioku.darklight.block.tags;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.taioku.darklight.block.ModBlocks;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.SHINE_LOG, ModBlocks.STRIPPED_SHINE_LOG);
        StrippableBlockRegistry.register(ModBlocks.SHINE_WOOD, ModBlocks.STRIPPED_SHINE_WOOD);
     }
}
