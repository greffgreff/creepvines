package com.greffgreff.creepvines.init;

import com.greffgreff.creepvines.Main;
import com.greffgreff.creepvines.blocks.Creepvine;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final RegistryObject<Block> CREEPVINE = registerBlock("creepvine", new Creepvine());

    public static RegistryObject<Block> registerBlock(String name, Block block) {
        return Main.BLOCKS.register(name, () -> block);
    }
}