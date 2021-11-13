package com.pawn.secondera.secondera.util;

import com.pawn.secondera.secondera.Secondera;
import com.pawn.secondera.secondera.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Secondera.MOD_ID);

        public static void init(){
                ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }

        //Items only

        public static final RegistryObject<Item> COSMIC_INGOT= ITEMS.register("cosmic_ingot", ItemBase::new);

}
