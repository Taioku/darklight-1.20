package net.taioku.darklight.screen.InfusionTable;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;

public class InfusionTableScreen extends HandledScreen<InfusionTableScreenHandler> {
    int customBgWidth = 187;
    int customBgHeight = 218;

    private static final Identifier TEXTURE =
            new Identifier(Darklight.MOD_ID, "textures/gui/infusion_table.png");

    public InfusionTableScreen(InfusionTableScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.enableBlend();
        int x = (width - customBgWidth) / 2;
        int y = (height - customBgHeight) / 2;
        context.drawTexture(TEXTURE, x, y, 0, 0, customBgWidth, customBgHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
