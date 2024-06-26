package com.spidx_9226.eleutherus_and_void.block.custom;

import com.mojang.logging.LogUtils;
import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.WitherRoseBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.slf4j.Logger;

import static java.lang.Math.abs;

public class EleutherusRoseBlock extends FlowerBlock {
    public EleutherusRoseBlock(Holder<MobEffect> p_334860_, float p_331000_, Properties p_309749_) {
        super(p_334860_, p_331000_, p_309749_);
    }

    @Override
    public void animateTick(BlockState p_222687_, Level p_222688_, BlockPos p_222689_, RandomSource p_222690_) {
        VoxelShape $$4 = this.getShape(p_222687_, p_222688_, p_222689_, CollisionContext.empty());
        Vec3 $$5 = $$4.bounds().getCenter();
        double $$6 = (double)p_222689_.getX() + $$5.x;
        double $$7 = (double)p_222689_.getZ() + $$5.z;

        for(int $$8 = 0; $$8 < 3; ++$$8) {
            if ((abs(((p_222690_.nextInt() * 9) % 10))) == 7) {
                p_222688_.addParticle(ParticleTypes.END_ROD, $$6 + p_222690_.nextDouble() / 5.0, (double)p_222689_.getY() + (0.5 - p_222690_.nextDouble()), $$7 + p_222690_.nextDouble() / 5.0, 0.0, 0.0, 0.0);
            }
        }

    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        if (!pLevel.isClientSide && pLevel.getDifficulty() != Difficulty.PEACEFUL) {
            if (pEntity instanceof LivingEntity) {
                LivingEntity $$4 = (LivingEntity)pEntity;
                if (!$$4.isInvulnerableTo(pLevel.damageSources().wither())) {
                    $$4.addEffect(new MobEffectInstance(MobEffects.GLOWING, 40));
                }
            }

        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(ModBlocks.ELEUTHERUS_NYLIUM.get()) || pState.is(ModBlocks.VOID_NYLIUM.get());
    }
}
