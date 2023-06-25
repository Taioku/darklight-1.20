package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.PillarItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PillarItemRenderer extends GeoItemRenderer<PillarItem> {
    public PillarItemRenderer() {
        super(new PillarItemModel());
    }
}
