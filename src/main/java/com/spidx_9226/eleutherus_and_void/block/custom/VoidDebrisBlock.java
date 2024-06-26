package com.spidx_9226.eleutherus_and_void.block.custom;

import com.spidx_9226.eleutherus_and_void.particle.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class VoidDebrisBlock extends MyceliumBlock {

    public VoidDebrisBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource random) {
        super.animateTick(blockState, level, blockPos, random);
        if ((random.nextInt(10) == 7)) {
            level.addParticle(
                    ParticleTypes.MYCELIUM,
                    (double)blockPos.getX() + random.nextDouble(),
                    (double)blockPos.getY() + 1,
                    (double)blockPos.getZ() + random.nextDouble(),
                    0.0,
                    0.0,
                    0.0
            );
        }
    }
}
