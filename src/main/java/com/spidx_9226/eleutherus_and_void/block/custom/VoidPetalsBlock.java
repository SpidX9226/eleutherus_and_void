package com.spidx_9226.eleutherus_and_void.block.custom;

import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class VoidPetalsBlock extends PinkPetalsBlock {
    public VoidPetalsBlock(Properties p_273335_) {
        super(p_273335_);
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter p_51043_, BlockPos p_51044_) {
        return blockState.is(ModBlocks.ELEUTHERUS_NYLIUM.get()) || blockState.is(ModBlocks.VOID_NYLIUM.get());
    }
}
