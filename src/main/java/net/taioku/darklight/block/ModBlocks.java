package net.taioku.darklight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.sapling.DarkOakSaplingGenerator;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.custom.*;
import net.taioku.darklight.item.ModItemGroup;
import net.taioku.darklight.world.tree.ShineSaplingGenerator;

public class ModBlocks {

    public static final Block THUN_ORE = registerBlock("thun_ore",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block DEEPSLATE_THUN_ORE = registerBlock("deepslate_thun_ore",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block THUN_BLOCK = registerBlock("thun_block",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);

    public static final Block MORTAR = Registry.register(Registries.BLOCK, new Identifier(Darklight.MOD_ID, "mortar"),
            new MortarBlock(AbstractBlock.Settings.create().strength(4.0f).requiresTool()));
    public static final Block RESEARCH_TABLE = Registry.register(Registries.BLOCK, new Identifier(Darklight.MOD_ID, "research_table"),
            new ResearchTable(AbstractBlock.Settings.create().strength(4.0f).requiresTool()));

    // -------------------------------------------------- SHINE --------------------------------------------------

    public static final Block SHINE_LOG = registerBlock("shine_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_WOOD = registerBlock("shine_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)), ModItemGroup.DARKLIGHT);
    public static final Block STRIPPED_SHINE_LOG = registerBlock("stripped_shine_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.DARKLIGHT);
    public static final Block STRIPPED_SHINE_WOOD = registerBlock("stripped_shine_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_PLANKS = registerBlock("shine_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_LEAVES = registerBlock("shine_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_GRASS = registerBlock("shine_grass",
            new FernBlock(AbstractBlock.Settings.copy(Blocks.GRASS).luminance(state -> 3)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_TALL_GRASS = registerBlock("shine_tall_grass",
            new ShineTallPlantBlock(AbstractBlock.Settings.copy(Blocks.TALL_GRASS).luminance(state -> 5)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_SAPLING = registerBlock("shine_sapling",
            new ShineSaplingBlock(new ShineSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).luminance(state -> 3)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_GRASS_BLOCK = registerBlock("shine_grass_block",
            new ShineGrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_DIRT = registerBlock("shine_dirt",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_CALCITE = registerBlock("shine_calcite",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_TUFF = registerBlock("shine_tuff",
            new Block(AbstractBlock.Settings.copy(Blocks.TUFF)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_STONE = registerBlock("shine_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_COBBLESTONE = registerBlock("shine_cobblestone",
            new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_STONE_BRICKS = registerBlock("shine_stone_bricks",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_CRACKED_STONE_BRICKS = registerBlock("shine_cracked_stone_bricks",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_DEEPSLATE = registerBlock("shine_deepslate",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_COBBLED_DEEPSLATE = registerBlock("shine_cobbled_deepslate",
            new Block(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_DEEPSLATE_BRICKS = registerBlock("shine_deepslate_bricks",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_CRACKED_DEEPSLATE_BRICKS = registerBlock("shine_cracked_deepslate_bricks",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_DEEPSLATE_TILES = registerBlock("shine_deepslate_tiles",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_CRACKED_DEEPSLATE_TILES = registerBlock("shine_cracked_deepslate_tiles",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_POLISHED_DEEPSLATE = registerBlock("shine_polished_deepslate",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE)), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_CHISELED_DEEPSLATE = registerBlock("shine_chiseled_deepslate",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)), ModItemGroup.DARKLIGHT);

    // -------------------------------------------------- SHINE --------------------------------------------------



    // -------------------------------------------------- DARK --------------------------------------------------



    // -------------------------------------------------- DARK --------------------------------------------------

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Darklight.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Darklight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        Darklight.LOGGER.info("Registering ModBlocks for " + Darklight.MOD_ID);
    }
}
