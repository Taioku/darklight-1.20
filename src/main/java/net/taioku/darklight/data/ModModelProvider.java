package net.taioku.darklight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THUN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_THUN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THUN_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.THUN_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUN_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUN_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUN_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_THUN, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOME, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOST_PAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WRITTEN_LOST_PAGE, Models.GENERATED);
    }
}
