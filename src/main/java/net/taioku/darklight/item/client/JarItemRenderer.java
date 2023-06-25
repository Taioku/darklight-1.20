package net.taioku.darklight.item.client;

import net.taioku.darklight.item.custom.JarItem;
import net.taioku.darklight.item.custom.PillarItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class JarItemRenderer extends GeoItemRenderer<JarItem> {
    public JarItemRenderer() {
        super(new JarItemModel());
    }
}
