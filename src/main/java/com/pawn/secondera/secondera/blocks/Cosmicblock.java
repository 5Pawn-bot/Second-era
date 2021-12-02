package com.pawn.secondera.secondera.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Cosmicblock extends Block {


    public Cosmicblock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(6.0F,10.0F)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()


        );
    }
}
