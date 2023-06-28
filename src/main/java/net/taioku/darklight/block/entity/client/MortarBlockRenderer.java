package net.taioku.darklight.block.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.taioku.darklight.block.entity.entities.MortarBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class MortarBlockRenderer extends GeoBlockRenderer<MortarBlockEntity> {
    public MortarBlockRenderer(BlockEntityRendererFactory.Context context) {
         super(new MortarBlockModel());
    }
}
