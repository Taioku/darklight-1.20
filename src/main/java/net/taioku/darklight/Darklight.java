package net.taioku.darklight;

import net.fabricmc.api.ModInitializer;

import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.item.ModItemGroup;
import net.taioku.darklight.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Darklight implements ModInitializer {
	public static final String MOD_ID = "darklight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);





	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}