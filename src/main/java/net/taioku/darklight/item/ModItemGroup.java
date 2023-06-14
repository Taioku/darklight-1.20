package net.taioku.darklight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup>
            DARKLIGHT = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            new Identifier(Darklight.MOD_ID, "tome_group"));

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, DARKLIGHT, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.THUN_BLOCK))
                .displayName(Text.translatable("itemGroup.darklight.tome"))
                .build());
    }
}
