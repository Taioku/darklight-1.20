package net.taioku.darklight.armor.dreamers_hat;

import net.taioku.darklight.item.custom.DreamersHatItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DreamersHatRenderer extends GeoArmorRenderer<DreamersHatItem> {
    public DreamersHatRenderer() {
        super(new DreamersHatModel());
    }
}
