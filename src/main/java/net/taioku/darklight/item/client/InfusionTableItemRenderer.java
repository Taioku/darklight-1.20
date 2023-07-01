package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.InfusionTableItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class InfusionTableItemRenderer extends GeoItemRenderer<InfusionTableItem> {
    public InfusionTableItemRenderer() {
        super(new InfusionTableItemModel());
    }
}
