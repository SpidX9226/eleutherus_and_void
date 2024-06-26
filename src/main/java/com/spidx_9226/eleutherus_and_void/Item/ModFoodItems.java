package com.spidx_9226.eleutherus_and_void.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodItems {
    public static final FoodProperties ELEUTHERUS_PIE = new FoodProperties.Builder().alwaysEdible().nutrition(6)
            .saturationModifier(2).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 1f).build();

    public static final FoodProperties ELEUTHERUS_MANGO = new FoodProperties.Builder().nutrition(7)
            .saturationModifier(0.7f).build();
}
