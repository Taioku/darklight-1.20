package net.taioku.darklight.item.client;


import net.taioku.darklight.item.custom.SteamTreaterItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SteamTreaterItemRenderer extends GeoItemRenderer<SteamTreaterItem> {
    public SteamTreaterItemRenderer() {
        super(new SteamTreaterItemModel());
    }
}
