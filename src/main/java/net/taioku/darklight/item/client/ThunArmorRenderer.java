package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.ThunArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ThunArmorRenderer extends GeoArmorRenderer<ThunArmorItem> {
    public ThunArmorRenderer() {
        super(new ThunArmorModel());
    }
}
