package net.frogybot.shopexperience;

import net.fabricmc.api.ModInitializer;

import net.frogybot.shopexperience.block.ModBlocks;
import net.frogybot.shopexperience.item.ModItemGroups;
import net.frogybot.shopexperience.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopExperience implements ModInitializer {
	public static final String MOD_ID = "shopexperience";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}