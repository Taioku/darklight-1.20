package net.taioku.darklight.block.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.taioku.darklight.block.entity.entities.PillarEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PillarBlockRenderer extends GeoBlockRenderer<PillarEntity> {
    public PillarBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new PillarBlockModel());
    }
}
