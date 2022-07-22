package com.greffgreff.creepvines.registries;

import com.greffgreff.creepvines.Main;
import com.greffgreff.creepvines.blocks.Creepvine;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final RegistryObject<Block> CREEPVINE = registerBlock("creepvine", new Creepvine());

    public static RegistryObject<Block> registerBlock(String name, Block block) {
        return Main.BLOCKS.register(name, () -> block);
    }
}