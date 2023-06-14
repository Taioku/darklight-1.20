package net.taioku.darklight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_THUN_ORE), RecipeCategory.MISC, ModItems.RAW_THUN,
                3f, 300, "thun");
        offerSmelting(exporter, List.of(ModBlocks.THUN_ORE), RecipeCategory.MISC, ModItems.RAW_THUN,
                3f, 300, "thun");
        offerSmelting(exporter, List.of(ModItems.RAW_THUN), RecipeCategory.MISC, ModItems.THUN,
                3f, 300, "thun");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOME)
                .pattern("#P#")
                .pattern("P#P") // Tome Recipe doesn't work
                .pattern("#P#")
                .input('#', Items.AIR)
                .input('P', Items.PAPER)
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER),
                        FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TOME)));
    }
}
