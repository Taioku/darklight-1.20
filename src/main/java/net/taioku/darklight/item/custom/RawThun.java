package net.taioku.darklight.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class RawThun extends Item {
    public RawThun(Settings settings) {
        super(settings
                .fireproof()
                .maxCount(24));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("darklight.item.custom.raw_thun.tooltip"));
        if (Screen.hasAltDown()) {
            tooltip.add(Text.translatable("darklight.item.custom.raw_thun.alt_tooltip"));
        }
        else {
            tooltip.add(Text.translatable("darklight.item.custom.raw_thun.!alt_tooltip").formatted(Formatting.DARK_GRAY));
        }
    }
}
