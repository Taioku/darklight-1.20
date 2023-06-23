package net.taioku.darklight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.custom.MortarBlock;
import net.taioku.darklight.block.custom.ResearchTable;
import net.taioku.darklight.item.ModItemGroup;
import net.taioku.darklight.world.tree.ShineSaplingGenerator;

public class ModBlocks {

    public static final Block THUN_ORE = registerBlock("thun_ore",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block DEEPSLATE_THUN_ORE = registerBlock("deepslate_thun_ore",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block THUN_BLOCK = registerBlock("thun_block",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_LOG = registerBlock("shine_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_WOOD = registerBlock("shine_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block STRIPPED_SHINE_LOG = registerBlock("stripped_shine_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block STRIPPED_SHINE_WOOD = registerBlock("stripped_shine_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_PLANKS = registerBlock("shine_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block SHINE_LEAVES = registerBlock("shine_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);

    public static final Block SHINE_SAPLING = registerBlock("shine_sapling",
            new SaplingBlock(new ShineSaplingGenerator(),AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);


    public static final Block SHINE_GRASS = registerBlock("shine_grass",
            new GrassBlock(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);

    public static final Block MORTAR = Registry.register(Registries.BLOCK, new Identifier(Darklight.MOD_ID, "mortar"),
            new MortarBlock(AbstractBlock.Settings.create().strength(4.0f).requiresTool()));
    public static final Block RESEARCH_TABLE = Registry.register(Registries.BLOCK, new Identifier(Darklight.MOD_ID, "research_table"),
            new ResearchTable(AbstractBlock.Settings.create().strength(4.0f).requiresTool()));



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
