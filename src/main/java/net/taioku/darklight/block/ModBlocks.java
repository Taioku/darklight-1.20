package net.taioku.darklight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.custom.MortarBlock;
import net.taioku.darklight.item.ModItemGroup;

public class ModBlocks {

    public static final Block THUN_ORE = registerBlock("thun_ore",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block DEEPSLATE_THUN_ORE = registerBlock("deepslate_thun_ore",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);
    public static final Block THUN_BLOCK = registerBlock("thun_block",
            new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()), ModItemGroup.DARKLIGHT);

    public static final Block MORTAR = Registry.register(Registries.BLOCK, new Identifier(Darklight.MOD_ID, "mortar"),
            new MortarBlock(AbstractBlock.Settings.create()));




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
