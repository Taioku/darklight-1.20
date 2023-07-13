package net.taioku.darklight.block.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.taioku.darklight.block.entity.tile.PressureCapBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PressureCapBlockRenderer extends GeoBlockRenderer<PressureCapBlockEntity> {
    public PressureCapBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new PressureCapBlockModel());
    }
}
