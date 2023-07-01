package net.taioku.darklight.screen;

import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.taioku.darklight.screen.InfusionTable.InfusionTableScreenHandler;
import net.taioku.darklight.screen.mortar.MortarScreenHandler;

public class ModScreenHandlers {
    public static ScreenHandlerType<MortarScreenHandler> MORTAR_SCREEN_HANDLER;
    public static ScreenHandlerType<InfusionTableScreenHandler> INFUSION_TABLE;

    public static void registerAllScreenHandlers() {
        MORTAR_SCREEN_HANDLER = new ScreenHandlerType<>(MortarScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
        INFUSION_TABLE = new ScreenHandlerType<>(InfusionTableScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
    }
}
