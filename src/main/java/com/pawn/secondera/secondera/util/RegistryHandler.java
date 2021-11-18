package com.pawn.secondera.secondera.util;

import com.pawn.secondera.secondera.Secondera;
import com.pawn.secondera.secondera.blocks.BlockItemBase;
import com.pawn.secondera.secondera.blocks.Cosmicblock;
import com.pawn.secondera.secondera.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Secondera.MOD_ID);
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Secondera.MOD_ID);

        public static void init(){
                ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
                BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }

        //Items only

        public static final RegistryObject<Item> COSMIC_INGOT = ITEMS.register("cosmic_ingot", ItemBase::new);

        // Blocks

        public static final RegistryObject<Block> COSMIC_BLOCK = BLOCKS.register("cosmic_block", Cosmicblock:: new);

        //Block Items

        public static final RegistryObject<Item> COSMIC_BLOCK_ITEM = ITEMS.register("cosmic_block",() -> new BlockItemBase(COSMIC_BLOCK.get()));


}
