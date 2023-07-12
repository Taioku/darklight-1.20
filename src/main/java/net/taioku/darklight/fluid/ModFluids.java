package net.taioku.darklight.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.fluid.custom.ShineWaterFluid;
import net.taioku.darklight.item.ModItemGroup;

public class ModFluids {
    public static FlowableFluid STILL_SHINE_WATER;
    public static FlowableFluid FLOWING_SHINE_WATER;
    public static Block SHINE_WATER_BLOCK;
    public static Item SHINE_WATER_BUCKET;

    public static void register() {
        STILL_SHINE_WATER = Registry.register(Registries.FLUID,
                new Identifier(Darklight.MOD_ID, "shine_water"), new ShineWaterFluid.Still());
        FLOWING_SHINE_WATER = Registry.register(Registries.FLUID,
                new Identifier(Darklight.MOD_ID, "flowing_shine_water"), new ShineWaterFluid.Flowing());

        SHINE_WATER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Darklight.MOD_ID, "shine_water_block"),
                new FluidBlock(ModFluids.STILL_SHINE_WATER, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        SHINE_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(Darklight.MOD_ID, "shine_water_bucket"),
                new BucketItem(ModFluids.STILL_SHINE_WATER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.DARKLIGHT).register(entries -> entries.add(SHINE_WATER_BUCKET));
    }
}
