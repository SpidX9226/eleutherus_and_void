package com.spidx_9226.eleutherus_and_void.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MagmaBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EleutherusMagmaBlock extends Block {
    public EleutherusMagmaBlock(Properties p_54800_) {
        super(p_54800_);
    }

    @Override
    public void stepOn(Level p_153777_, BlockPos p_153778_, BlockState p_153779_, Entity entity) {
        if (!entity.isSteppingCarefully() && entity instanceof LivingEntity) {
            entity.hurt(p_153777_.damageSources().hotFloor(), 1.0F);
            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.GLOWING, 40));
        }
        super.stepOn(p_153777_, p_153778_, p_153779_, entity);
    }

}
