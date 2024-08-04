package net.fellter.vanillatoolsplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fellter.vanillatoolsplus.VanillaToolsPlus;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VTP_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaToolsPlus.MOD_ID, "vtp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vanillatoolsplus"))
                    .icon(() -> new ItemStack(ModItems.VTP_TITLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OAK_WOOD_SWORD);
                        entries.add(ModItems.OAK_WOOD_SHOVEL);
                        entries.add(ModItems.OAK_WOOD_PICKAXE);
                        entries.add(ModItems.OAK_WOOD_AXE);
                        entries.add(ModItems.OAK_WOOD_HOE);

                        entries.add(ModItems.STR_OAK_WOOD_SWORD);
                        entries.add(ModItems.STR_OAK_WOOD_SHOVEL);
                        entries.add(ModItems.STR_OAK_WOOD_PICKAXE);
                        entries.add(ModItems.STR_OAK_WOOD_AXE);
                        entries.add(ModItems.STR_OAK_WOOD_HOE);

                        entries.add(ModItems.SPRUCE_WOOD_SWORD);
                        entries.add(ModItems.SPRUCE_WOOD_SHOVEL);
                        entries.add(ModItems.SPRUCE_WOOD_PICKAXE);
                        entries.add(ModItems.SPRUCE_WOOD_AXE);
                        entries.add(ModItems.SPRUCE_WOOD_HOE);

                        entries.add(ModItems.STR_SPRUCE_WOOD_SWORD);
                        entries.add(ModItems.STR_SPRUCE_WOOD_SHOVEL);
                        entries.add(ModItems.STR_SPRUCE_WOOD_PICKAXE);
                        entries.add(ModItems.STR_SPRUCE_WOOD_AXE);
                        entries.add(ModItems.STR_SPRUCE_WOOD_HOE);
                        
                        entries.add(ModItems.BIRCH_WOOD_SWORD);
                        entries.add(ModItems.BIRCH_WOOD_SHOVEL);
                        entries.add(ModItems.BIRCH_WOOD_PICKAXE);
                        entries.add(ModItems.BIRCH_WOOD_AXE);
                        entries.add(ModItems.BIRCH_WOOD_HOE);

                        entries.add(ModItems.STR_BIRCH_WOOD_SWORD);
                        entries.add(ModItems.STR_BIRCH_WOOD_SHOVEL);
                        entries.add(ModItems.STR_BIRCH_WOOD_PICKAXE);
                        entries.add(ModItems.STR_BIRCH_WOOD_AXE);
                        entries.add(ModItems.STR_BIRCH_WOOD_HOE);

                    }).build());

    public static void registerItemGroups() {
        VanillaToolsPlus.LOGGER.info("Registering Mod Item Groups for " + VanillaToolsPlus.MOD_ID);
    }
}
