package net.taioku.darklight;

import net.fabricmc.api.ModInitializer;

import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.ModFlammableBlockRegisty;
import net.taioku.darklight.block.ModStrippableBlockRegistry;
import net.taioku.darklight.block.entity.ModBlockEntities;
import net.taioku.darklight.fluid.ModFluids;
import net.taioku.darklight.item.ModItemGroup;
import net.taioku.darklight.item.ModItems;
import net.taioku.darklight.recipe.ModRecipes;
import net.taioku.darklight.screen.ModScreenHandlers;
import net.taioku.darklight.world.dimension.ModDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Darklight implements ModInitializer {

	public static final String MOD_ID = "darklight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerAllBlockEntities();

		GeckoLib.initialize();

		ModDimensions.register();

		ModFlammableBlockRegisty.registerFlammableBlocks();
		ModStrippableBlockRegistry.registerStrippableBlocks();

		ModFluids.register();

		ModScreenHandlers.registerAllScreenHandlers();

		ModRecipes.registerRecipes();
	}
}