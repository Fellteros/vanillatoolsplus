package net.fellter.vanillatoolsplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fellter.vanillatoolsplus.VanillaToolsPlus;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //oak wood
    public static final Item OAK_WOOD_PICKAXE = registerItem("oak_wood_pickaxe",
            new PickaxeItem(ModToolMaterial.OAK_WOOD, 1, -2.8f, new FabricItemSettings()));
    public static final Item OAK_WOOD_AXE = registerItem("oak_wood_axe",
            new AxeItem(ModToolMaterial.OAK_WOOD, 6, -3.2f, new FabricItemSettings()));
    public static final Item OAK_WOOD_SHOVEL = registerItem("oak_wood_shovel",
            new ShovelItem(ModToolMaterial.OAK_WOOD, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item OAK_WOOD_SWORD = registerItem("oak_wood_sword",
            new SwordItem(ModToolMaterial.OAK_WOOD, 3, -2.4f, new FabricItemSettings()));
    public static final Item OAK_WOOD_HOE = registerItem("oak_wood_hoe",
            new HoeItem(ModToolMaterial.OAK_WOOD, 0, -3f, new FabricItemSettings()));








    public static final Item VTP_TITLE = registerItem("vtp_title", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VanillaToolsPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaToolsPlus.LOGGER.info("Registering Mod Items for " + VanillaToolsPlus.MOD_ID);

    }
}
