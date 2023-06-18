package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.ResearchTable;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ResearchTableItemRenderer extends GeoItemRenderer<ResearchTable> {
    public ResearchTableItemRenderer() {
        super(new ResearchTableItemModel());
    }
}
