package net.taioku.darklight.block.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.taioku.darklight.block.entity.entities.JarEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class JarBlockRenderer extends GeoBlockRenderer<JarEntity> {
    public JarBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new JarBlockModel());
    }
}
