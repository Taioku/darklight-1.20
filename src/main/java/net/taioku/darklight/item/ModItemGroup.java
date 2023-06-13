package net.taioku.darklight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class ModItemGroup {
    public static ItemGroup TOME;

    public static void registerItemGroups() {
        TOME = FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.tome"))
                .icon(() -> new ItemStack(ModItems.TOME)).build();
    }

}
