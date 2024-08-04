package net.fellter.vanillatoolsplus;

import net.fabricmc.api.ModInitializer;
import net.fellter.vanillatoolsplus.item.ModItemGroups;
import net.fellter.vanillatoolsplus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaToolsPlus implements ModInitializer {
	public static final String MOD_ID = "vanillatoolsplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}