package com.greffgreff.creepvines.init;

import com.greffgreff.creepvines.Main;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> CREEPVINE_ITEM = registerBlockItem("creepvine", ModBlocks.CREEPVINE.get(), CreativeModeTab.TAB_MISC);

    public static RegistryObject<Item> registerBlockItem(String name, Block block, CreativeModeTab tab) {
        return Main.ITEMS.register(name, () -> new BlockItem(block, new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Item> registerItem(String name, CreativeModeTab tab) {
        return null;
    }
}
