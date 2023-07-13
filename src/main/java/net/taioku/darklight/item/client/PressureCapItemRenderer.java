package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.PressureCapItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PressureCapItemRenderer extends GeoItemRenderer<PressureCapItem> {
    public PressureCapItemRenderer() {
        super(new PressureCapItemModel());
    }
}
