package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.ReinforcedCraftingTableItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ReinforcedCraftingTableItemRenderer extends GeoItemRenderer<ReinforcedCraftingTableItem> {
    public ReinforcedCraftingTableItemRenderer() {
        super(new ReinforcedCraftingTableItemModel());
    }
}
