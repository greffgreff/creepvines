package com.greffgreff.creepvines.registries;

import com.greffgreff.creepvines.Main;
import com.greffgreff.creepvines.blocks.Creepvine;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> CREEPVINE = registerBlock("creepvine", new Creepvine(), CreativeModeTab.TAB_MISC);

    public static RegistryObject<Block> registerBlock(String name, Block block, CreativeModeTab tab) {
        ItemRegistry.registerBlockItem(name, block, tab);
        return BLOCKS.register(name, () -> block);
    }
}