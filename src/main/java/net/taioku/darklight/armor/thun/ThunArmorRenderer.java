package net.taioku.darklight.armor.thun;

import net.taioku.darklight.item.custom.ThunArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ThunArmorRenderer extends GeoArmorRenderer<ThunArmorItem> {
    public ThunArmorRenderer() {
        super(new ThunArmorModel());
    }
}
