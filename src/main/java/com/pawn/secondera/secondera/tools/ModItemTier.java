package com.pawn.secondera.secondera.tools;

import com.pawn.secondera.secondera.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    COSMIC(4,1700,9.0F,9.0F,17, () -> {
        return Ingredient.fromItems(RegistryHandler.COSMIC_INGOT.get());
    }
    );

    //repairMaterial

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier( int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability , Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.maxUses = maxUses;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
