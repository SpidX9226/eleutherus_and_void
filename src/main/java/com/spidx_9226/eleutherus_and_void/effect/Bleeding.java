package com.spidx_9226.eleutherus_and_void.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class Bleeding extends MobEffect {
    protected Bleeding(MobEffectCategory p_301256_, int p_299285_) {
        super(p_301256_, p_299285_);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int p_299074_) {
        if (livingEntity.getHealth() > 1.0F) {
            livingEntity.hurt(livingEntity.damageSources().magic(), 1.0F);
        }

        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int p_297494_, int p_301016_) {
        int i = 25 >> p_301016_;
        return i > 0 ? p_297494_ % i == 0 : true;
    }
}