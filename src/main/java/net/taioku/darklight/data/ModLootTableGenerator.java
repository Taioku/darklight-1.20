package net.taioku.darklight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.THUN_BLOCK);
        addDrop(ModBlocks.THUN_ORE, oreDrops(ModBlocks.THUN_ORE, ModItems.RAW_THUN));
        addDrop(ModBlocks.THUN_ORE, oreDrops(ModBlocks.DEEPSLATE_THUN_ORE, ModItems.RAW_THUN));
    }
}
