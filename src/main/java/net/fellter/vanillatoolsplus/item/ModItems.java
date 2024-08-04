package net.fellter.vanillatoolsplus.item;

import net.fellter.vanillatoolsplus.VanillaToolsPlus;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //oak wood
    public static final Item OAK_WOOD_PICKAXE = registerItem("oak_wood_pickaxe",
            new PickaxeItem(ModToolMaterial.OAK_WOOD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.OAK_WOOD, 1.2f, -2.8f)).maxCount(1)));
    public static final Item OAK_WOOD_AXE = registerItem("oak_wood_axe",
            new AxeItem(ModToolMaterial.OAK_WOOD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.OAK_WOOD, 6.0f, -3.2f)).maxCount(1)));
    public static final Item OAK_WOOD_SHOVEL = registerItem("oak_wood_shovel",
            new ShovelItem(ModToolMaterial.OAK_WOOD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.OAK_WOOD, 1.5f, -3.0f)).maxCount(1)));
    public static final Item OAK_WOOD_SWORD = registerItem("oak_wood_sword",
            new SwordItem(ModToolMaterial.OAK_WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.OAK_WOOD, 3, -2.4f)).maxCount(1)));
    public static final Item OAK_WOOD_HOE = registerItem("oak_wood_hoe",
            new HoeItem(ModToolMaterial.OAK_WOOD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.OAK_WOOD, 0f, -3.0f)).maxCount(1)));
    
    //str oak wood
    public static final Item STR_OAK_WOOD_PICKAXE = registerItem("str_oak_wood_pickaxe",
            new PickaxeItem(ModToolMaterial.STR_OAK_WOOD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.STR_OAK_WOOD, 1.2f, -2.8f)).maxCount(1)));
    public static final Item STR_OAK_WOOD_AXE = registerItem("str_oak_wood_axe",
            new AxeItem(ModToolMaterial.STR_OAK_WOOD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.STR_OAK_WOOD, 6.0f, -3.2f)).maxCount(1)));
    public static final Item STR_OAK_WOOD_SHOVEL = registerItem("str_oak_wood_shovel",
            new ShovelItem(ModToolMaterial.STR_OAK_WOOD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.STR_OAK_WOOD, 1.5f, -3.0f)).maxCount(1)));
    public static final Item STR_OAK_WOOD_SWORD = registerItem("str_oak_wood_sword",
            new SwordItem(ModToolMaterial.STR_OAK_WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.STR_OAK_WOOD, 3, -2.4f)).maxCount(1)));
    public static final Item STR_OAK_WOOD_HOE = registerItem("str_oak_wood_hoe",
            new HoeItem(ModToolMaterial.STR_OAK_WOOD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.STR_OAK_WOOD, 0f, -3.0f)).maxCount(1)));

    //spruce wood
    public static final Item SPRUCE_WOOD_PICKAXE = registerItem("spruce_wood_pickaxe",
            new PickaxeItem(ModToolMaterial.SPRUCE_WOOD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.SPRUCE_WOOD, 1.2f, -2.8f)).maxCount(1)));
    public static final Item SPRUCE_WOOD_AXE = registerItem("spruce_wood_axe",
            new AxeItem(ModToolMaterial.SPRUCE_WOOD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.SPRUCE_WOOD, 6.0f, -3.2f)).maxCount(1)));
    public static final Item SPRUCE_WOOD_SHOVEL = registerItem("spruce_wood_shovel",
            new ShovelItem(ModToolMaterial.SPRUCE_WOOD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.SPRUCE_WOOD, 1.5f, -3.0f)).maxCount(1)));
    public static final Item SPRUCE_WOOD_SWORD = registerItem("spruce_wood_sword",
            new SwordItem(ModToolMaterial.SPRUCE_WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.SPRUCE_WOOD, 3, -2.4f)).maxCount(1)));
    public static final Item SPRUCE_WOOD_HOE = registerItem("spruce_wood_hoe",
            new HoeItem(ModToolMaterial.SPRUCE_WOOD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.SPRUCE_WOOD, 0f, -3.0f)).maxCount(1)));
    
    //str spruce wood
    public static final Item STR_SPRUCE_WOOD_PICKAXE = registerItem("str_spruce_wood_pickaxe",
            new PickaxeItem(ModToolMaterial.STR_SPRUCE_WOOD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.STR_SPRUCE_WOOD, 1.2f, -2.8f)).maxCount(1)));
    public static final Item STR_SPRUCE_WOOD_AXE = registerItem("str_spruce_wood_axe",
            new AxeItem(ModToolMaterial.STR_SPRUCE_WOOD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.STR_SPRUCE_WOOD, 6.0f, -3.2f)).maxCount(1)));
    public static final Item STR_SPRUCE_WOOD_SHOVEL = registerItem("str_spruce_wood_shovel",
            new ShovelItem(ModToolMaterial.STR_SPRUCE_WOOD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.STR_SPRUCE_WOOD, 1.5f, -3.0f)).maxCount(1)));
    public static final Item STR_SPRUCE_WOOD_SWORD = registerItem("str_spruce_wood_sword",
            new SwordItem(ModToolMaterial.STR_SPRUCE_WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.STR_SPRUCE_WOOD, 3, -2.4f)).maxCount(1)));
    public static final Item STR_SPRUCE_WOOD_HOE = registerItem("str_spruce_wood_hoe",
            new HoeItem(ModToolMaterial.STR_SPRUCE_WOOD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.STR_SPRUCE_WOOD, 0f, -3.0f)).maxCount(1)));
    
    //oak wood
    public static final Item BIRCH_WOOD_PICKAXE = registerItem("birch_wood_pickaxe",
            new PickaxeItem(ModToolMaterial.BIRCH_WOOD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.BIRCH_WOOD, 1.2f, -2.8f)).maxCount(1)));
    public static final Item BIRCH_WOOD_AXE = registerItem("birch_wood_axe",
            new AxeItem(ModToolMaterial.BIRCH_WOOD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.BIRCH_WOOD, 6.0f, -3.2f)).maxCount(1)));
    public static final Item BIRCH_WOOD_SHOVEL = registerItem("birch_wood_shovel",
            new ShovelItem(ModToolMaterial.BIRCH_WOOD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.BIRCH_WOOD, 1.5f, -3.0f)).maxCount(1)));
    public static final Item BIRCH_WOOD_SWORD = registerItem("birch_wood_sword",
            new SwordItem(ModToolMaterial.BIRCH_WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.BIRCH_WOOD, 3, -2.4f)).maxCount(1)));
    public static final Item BIRCH_WOOD_HOE = registerItem("birch_wood_hoe",
            new HoeItem(ModToolMaterial.BIRCH_WOOD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.BIRCH_WOOD, 0f, -3.0f)).maxCount(1)));
    
    //str oak wood
    public static final Item STR_BIRCH_WOOD_PICKAXE = registerItem("str_birch_wood_pickaxe",
            new PickaxeItem(ModToolMaterial.STR_BIRCH_WOOD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.STR_BIRCH_WOOD, 1.2f, -2.8f)).maxCount(1)));
    public static final Item STR_BIRCH_WOOD_AXE = registerItem("str_birch_wood_axe",
            new AxeItem(ModToolMaterial.STR_BIRCH_WOOD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.STR_BIRCH_WOOD, 6.0f, -3.2f)).maxCount(1)));
    public static final Item STR_BIRCH_WOOD_SHOVEL = registerItem("str_birch_wood_shovel",
            new ShovelItem(ModToolMaterial.STR_BIRCH_WOOD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.STR_BIRCH_WOOD, 1.5f, -3.0f)).maxCount(1)));
    public static final Item STR_BIRCH_WOOD_SWORD = registerItem("str_birch_wood_sword",
            new SwordItem(ModToolMaterial.STR_BIRCH_WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.STR_BIRCH_WOOD, 3, -2.4f)).maxCount(1)));
    public static final Item STR_BIRCH_WOOD_HOE = registerItem("str_birch_wood_hoe",
            new HoeItem(ModToolMaterial.STR_BIRCH_WOOD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.STR_BIRCH_WOOD, 0f, -3.0f)).maxCount(1)));








    public static final Item VTP_TITLE = registerItem("vtp_title", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaToolsPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaToolsPlus.LOGGER.info("Registering Mod Items for " + VanillaToolsPlus.MOD_ID);

    }
}
