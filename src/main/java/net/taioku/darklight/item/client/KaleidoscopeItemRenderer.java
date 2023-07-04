package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.KaleidoscopeItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class KaleidoscopeItemRenderer extends GeoItemRenderer<KaleidoscopeItem> {
    public KaleidoscopeItemRenderer() {
        super(new KaleidoscopeItemModel());
    }
}
