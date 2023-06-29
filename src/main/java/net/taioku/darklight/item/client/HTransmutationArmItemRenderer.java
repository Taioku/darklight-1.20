package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.HTransmutationArmItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class HTransmutationArmItemRenderer extends GeoItemRenderer<HTransmutationArmItem> {
    public HTransmutationArmItemRenderer() {
        super(new HTransmutationArmItemModel());
    }
}
