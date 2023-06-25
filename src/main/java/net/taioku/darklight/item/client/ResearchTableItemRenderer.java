package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.ResearchTableItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ResearchTableItemRenderer extends GeoItemRenderer<ResearchTableItem> {
    public ResearchTableItemRenderer() {
        super(new ResearchTableItemModel());
    }
}
