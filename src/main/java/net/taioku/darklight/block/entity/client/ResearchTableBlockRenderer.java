package net.taioku.darklight.block.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.taioku.darklight.block.entity.ResearchTableEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ResearchTableBlockRenderer extends GeoBlockRenderer<ResearchTableEntity> {
    public ResearchTableBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new ResearchTableBlockModel());
    }
}
