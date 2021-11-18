package com.pawn.secondera.secondera.blocks;

import com.pawn.secondera.secondera.Secondera;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {


    public BlockItemBase(Block block) {
        super( block, new Item.Properties().group(Secondera.TAB));
    }
}
