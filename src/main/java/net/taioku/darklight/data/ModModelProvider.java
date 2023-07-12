package net.taioku.darklight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.fluid.ModFluids;
import net.taioku.darklight.item.ModItemGroup;
import net.taioku.darklight.item.ModItems;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {



        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEVA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEVB);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEVC);
        blockStateModelGenerator.registerMirrorable(ModBlocks.DEVD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THUN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_THUN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THUN_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.SHINE_LOG).log(ModBlocks.SHINE_LOG).wood(ModBlocks.SHINE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SHINE_LOG).log(ModBlocks.STRIPPED_SHINE_LOG).wood(ModBlocks.STRIPPED_SHINE_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_BARK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_LEAVES);

        blockStateModelGenerator.registerTintableCross(ModBlocks.SHINE_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.SHINE_TALL_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCross(ModBlocks.SHINE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.SHINE_GRASS_BLOCK, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_DIRT);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_COBBLESTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_CALCITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_TUFF);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_STONE_BRICKS, TexturedModel.CUBE_ALL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_CRACKED_STONE_BRICKS, TexturedModel.CUBE_ALL);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_DEEPSLATE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_COBBLED_DEEPSLATE);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_DEEPSLATE_BRICKS, TexturedModel.CUBE_ALL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_CRACKED_DEEPSLATE_BRICKS, TexturedModel.CUBE_ALL);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_DEEPSLATE_TILES, TexturedModel.CUBE_ALL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_CRACKED_DEEPSLATE_TILES, TexturedModel.CUBE_ALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHINE_POLISHED_DEEPSLATE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SHINE_CHISELED_DEEPSLATE, TexturedModel.CUBE_ALL);

        blockStateModelGenerator.registerParentedItemModel(ModItems.LIGHTBUG_SPAWN_EGG, ModelIds.getMinecraftNamespacedItem("lightbug_spawn_egg"));
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

        itemModelGenerator.register(ModFluids.SHINE_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_LEATHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHINE_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHINE_DUST, Models.GENERATED);
    }
}
