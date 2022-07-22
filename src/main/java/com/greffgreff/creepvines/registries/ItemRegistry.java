package com.greffgreff.creepvines.registries;

import com.greffgreff.creepvines.Main;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final RegistryObject<Item> CREEPVINE_ITEM = registerBlockItem("creepvine", BlockRegistry.CREEPVINE.get(), CreativeModeTab.TAB_MISC);

    public static RegistryObject<Item> registerBlockItem(String name, Block block, CreativeModeTab tab) {
        return Main.ITEMS.register(name, () -> new BlockItem(block, new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Item> registerItem(String name, Item item, CreativeModeTab tab) {
        return null;
    }
}
