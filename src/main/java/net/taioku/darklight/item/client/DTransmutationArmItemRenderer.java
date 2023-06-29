package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.DTransmutationArmItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class DTransmutationArmItemRenderer extends GeoItemRenderer<DTransmutationArmItem> {
    public DTransmutationArmItemRenderer() {
        super(new DTransmutationArmItemModel());
    }
}
