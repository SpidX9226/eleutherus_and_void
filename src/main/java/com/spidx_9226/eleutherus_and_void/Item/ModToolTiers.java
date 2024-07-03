package com.spidx_9226.eleutherus_and_void.Item;

import com.google.common.base.Suppliers;
import com.spidx_9226.eleutherus_and_void.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {

    ELEUTHERUS(ModTags.Blocks.INCORRECT_FOR_ELEUTHERUS_TOOL, 2542, 12.0F, 7.0F, 32, () -> Ingredient.of(ModItems.ELEUTHERUS.get())),

    VOID(ModTags.Blocks.INCORRECT_FOR_VOID_TOOL, 7521, 14.0F, 8.0F, 64, () -> Ingredient.of(ModItems.VOID_INGOT.get()));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolTiers( final TagKey<Block> p_334032_, final int p_43332_, final float p_43334_, final float p_43335_, final int p_43333_, final Supplier<Ingredient> p_43337_ ) {
        this.incorrectBlocksForDrops = p_334032_;
        this.uses = p_43332_;
        this.speed = p_43334_;
        this.damage = p_43335_;
        this.enchantmentValue = p_43333_;
        this.repairIngredient = Suppliers.memoize(p_43337_::get);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
