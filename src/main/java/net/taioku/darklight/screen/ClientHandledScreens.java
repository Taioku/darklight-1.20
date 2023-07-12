package net.taioku.darklight.screen;

import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.taioku.darklight.screen.InfusionTable.InfusionTableScreen;
import net.taioku.darklight.screen.mortar.MortarScreen;

public class ClientHandledScreens {
    public static void registerHandledScreens() {
        HandledScreens.register(ModScreenHandlers.MORTAR_SCREEN_HANDLER, MortarScreen::new);
        HandledScreens.register(ModScreenHandlers.INFUSION_TABLE, InfusionTableScreen::new);
    }
}
