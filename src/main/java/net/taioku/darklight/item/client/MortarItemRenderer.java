package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.MortarItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MortarItemRenderer extends GeoItemRenderer<MortarItem> {
    public MortarItemRenderer() {
        super(new MortarItemModel());
    }
}
