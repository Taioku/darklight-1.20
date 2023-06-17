package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.Mortar;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MortarItemRenderer extends GeoItemRenderer<Mortar> {
    public MortarItemRenderer() {
        super(new MortarItemModel());
    }
}
