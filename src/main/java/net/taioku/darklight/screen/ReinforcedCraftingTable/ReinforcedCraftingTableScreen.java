package net.taioku.darklight.screen.ReinforcedCraftingTable;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;

public class ReinforcedCraftingTableScreen extends HandledScreen<ReinforcedCraftingTableScreenHandler> {
    int customBgWidth = 188;
    int customBgHeight = 218;

    private static final Identifier TEXTURE =
            new Identifier(Darklight.MOD_ID, "textures/gui/reinforced_crafting_table_gui.png");

    public ReinforcedCraftingTableScreen(ReinforcedCraftingTableScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        int x = (width - customBgWidth) / 2;
        int y = (height - customBgHeight) / 2;
        RenderSystem.enableBlend();
        context.drawTexture(TEXTURE, x, y, 0, 0, customBgWidth, customBgHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
