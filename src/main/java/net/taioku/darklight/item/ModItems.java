package net.taioku.darklight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.item.custom.*;

public class ModItems {

    public static final Item RAW_THUN = registerItem("raw_thun",
            new RawThun(new FabricItemSettings()));
    public static final Item THUN_INGOT = registerItem("thun_ingot",
            new ThunIngot(new FabricItemSettings()));

    public static final Item MORTAR = registerItem("mortar",
            new MortarItem(ModBlocks.MORTAR, new FabricItemSettings()));
    public static final Item RESEARCH_TABLE = registerItem("research_table",
            new ResearchTableItem(ModBlocks.RESEARCH_TABLE, new FabricItemSettings()));
    public static final Item PILLAR = registerItem("pillar",
            new PillarItem(ModBlocks.PILLAR, new FabricItemSettings()));
    public static final Item JAR = registerItem("jar",
            new JarItem(ModBlocks.JAR, new FabricItemSettings()));
    public static final Item H_TRANSMUTATION_ARM = registerItem("h_transmutation_arm",
            new HTransmutationArmItem(ModBlocks.H_TRANSMUTATION_ARM, new FabricItemSettings()));
    public static final Item D_TRANSMUTATION_ARM = registerItem("d_transmutation_arm",
            new DTransmutationArmItem(ModBlocks.D_TRANSMUTATION_ARM, new FabricItemSettings()));
    public static final Item INFUSION_TABLE = registerItem("infusion_table",
            new InfusionTableItem(ModBlocks.INFUSION_TABLE, new FabricItemSettings()));


    public static final Item REINFORCED_LEATHER = registerItem("reinforced_leather",
            new Item(new FabricItemSettings()));
    public static final Item REINFORCED_BOTTLE = registerItem("reinforced_bottle",
            new ReinforcedBottleItem(new FabricItemSettings()));
    public static final Item SHINE_BOTTLE = registerItem("shine_bottle",
            new Item(new FabricItemSettings().maxCount(16)));
    public static final Item SHINE_DUST = registerItem("shine_dust",
            new Item(new FabricItemSettings().maxCount(16)));

    public static final Item THUN_HELMET = registerItem("thun_helmet",
            new ThunArmorItem(ModArmorMaterials.THUN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item THUN_CHESTPLATE = registerItem("thun_chestplate",
            new ThunArmorItem(ModArmorMaterials.THUN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item THUN_LEGGINGS = registerItem("thun_leggings",
            new ThunArmorItem(ModArmorMaterials.THUN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item THUN_BOOTS = registerItem("thun_boots",
            new ThunArmorItem(ModArmorMaterials.THUN, ArmorItem.Type.BOOTS, new FabricItemSettings()));



    public static final Item TOME = registerItem("tome",
            new Item(new FabricItemSettings()));
    public static final Item LOST_PAGE = registerItem("lost_page",
            new Item(new FabricItemSettings()));
    public static final Item WRITTEN_LOST_PAGE = registerItem("written_lost_page",
            new Item(new FabricItemSettings()));

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.DARKLIGHT, RAW_THUN);
        addToItemGroup(ModItemGroup.DARKLIGHT, THUN_INGOT);
        addToItemGroup(ModItemGroup.DARKLIGHT, MORTAR);
        addToItemGroup(ModItemGroup.DARKLIGHT, RESEARCH_TABLE);
        addToItemGroup(ModItemGroup.DARKLIGHT, PILLAR);
        addToItemGroup(ModItemGroup.DARKLIGHT, JAR);
        addToItemGroup(ModItemGroup.DARKLIGHT, H_TRANSMUTATION_ARM);
        addToItemGroup(ModItemGroup.DARKLIGHT, D_TRANSMUTATION_ARM);
        addToItemGroup(ModItemGroup.DARKLIGHT, INFUSION_TABLE);
        addToItemGroup(ModItemGroup.DARKLIGHT, SHINE_BOTTLE);
        addToItemGroup(ModItemGroup.DARKLIGHT, SHINE_DUST);
        addToItemGroup(ModItemGroup.DARKLIGHT, REINFORCED_LEATHER);
        addToItemGroup(ModItemGroup.DARKLIGHT, REINFORCED_BOTTLE);

        addToItemGroup(ModItemGroup.DARKLIGHT, THUN_HELMET);
        addToItemGroup(ModItemGroup.DARKLIGHT, THUN_CHESTPLATE);
        addToItemGroup(ModItemGroup.DARKLIGHT, THUN_LEGGINGS);
        addToItemGroup(ModItemGroup.DARKLIGHT, THUN_BOOTS);

        addToItemGroup(ModItemGroup.DARKLIGHT, TOME);
        addToItemGroup(ModItemGroup.DARKLIGHT, LOST_PAGE);
        addToItemGroup(ModItemGroup.DARKLIGHT, WRITTEN_LOST_PAGE);
    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Darklight.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Darklight.LOGGER.info("Registering Mod Items for " + Darklight.MOD_ID);

        addItemsToItemGroup();
    }
}