package com.spidx_9226.eleutherus_and_void.block.custom;

import com.spidx_9226.eleutherus_and_void.particle.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class VoidLeavesBlock extends LeavesBlock {
    public VoidLeavesBlock(Properties p_54422_) {
        super(p_54422_);
    }

    public void animateTick(BlockState p_272714_, Level p_272837_, BlockPos p_273218_, RandomSource p_273360_) {
        super.animateTick(p_272714_, p_272837_, p_273218_, p_273360_);
        if (p_273360_.nextInt(10) == 0) {
            BlockPos $$4 = p_273218_.below();
            BlockState $$5 = p_272837_.getBlockState($$4);
            if (!isFaceFull($$5.getCollisionShape(p_272837_, $$4), Direction.UP)) {
                ParticleUtils.spawnParticleBelow(p_272837_, p_273218_, p_273360_, ModParticles.VOID_LEAVES_PARTICLES.get());
            }
        }
    }
}
