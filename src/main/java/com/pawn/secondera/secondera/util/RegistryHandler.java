package com.pawn.secondera.secondera.util;

import com.pawn.secondera.secondera.Secondera;
import com.pawn.secondera.secondera.blocks.BlockItemBase;
import com.pawn.secondera.secondera.blocks.Cosmicblock;
import com.pawn.secondera.secondera.blocks.Cosmicore;
import com.pawn.secondera.secondera.items.ItemBase;
import com.pawn.secondera.secondera.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.*;
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

        //Tools

        public static final RegistryObject<SwordItem> COSMIC_SWORD = ITEMS.register("cosmic_sword",()->
                new SwordItem(ModItemTier.COSMIC, 5,0.0F,new Item.Properties().group(Secondera.TAB).isImmuneToFire()));

        public static final RegistryObject<PickaxeItem> COSMIC_PICKAXE = ITEMS.register("cosmic_pickaxe",()->
                new PickaxeItem(ModItemTier.COSMIC, 2,-2.0F,new Item.Properties().group(Secondera.TAB).isImmuneToFire()));

        public static final RegistryObject<AxeItem> COSMIC_AXE = ITEMS.register("cosmic_axe",()->
                new AxeItem(ModItemTier.COSMIC, 4,-3.0F,new Item.Properties().group(Secondera.TAB).isImmuneToFire()));

        public static final RegistryObject<HoeItem> COSMIC_HOE = ITEMS.register("cosmic_hoe",()->
                new HoeItem(ModItemTier.COSMIC, 2,-1.0F,new Item.Properties().group(Secondera.TAB).isImmuneToFire()));

        public static final RegistryObject<ShovelItem> COSMIC_SHOVEL = ITEMS.register("cosmic_shovel",()->
                new ShovelItem(ModItemTier.COSMIC, 1,-1.0F,new Item.Properties().group(Secondera.TAB).isImmuneToFire()));

        // Blocks

        public static final RegistryObject<Block> COSMIC_BLOCK = BLOCKS.register("cosmic_block", Cosmicblock:: new);
        public static final RegistryObject<Block> COSMIC_ORE = BLOCKS.register("cosmic_ore", Cosmicore::new);

        //Block Items

        public static final RegistryObject<Item> COSMIC_BLOCK_ITEM = ITEMS.register("cosmic_block",() -> new BlockItemBase(COSMIC_BLOCK.get()));
        public static final RegistryObject<Item> COSMIC_ORE_ITEM = ITEMS.register("cosmic_ore",()->new BlockItemBase(COSMIC_ORE.get()));



}
