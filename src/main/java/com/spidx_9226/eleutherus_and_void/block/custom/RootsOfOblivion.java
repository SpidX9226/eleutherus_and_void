package com.spidx_9226.eleutherus_and_void.block.custom;

import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RootsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RootsOfOblivion extends RootsBlock {
    public RootsOfOblivion(Properties p_55912_) {
        super(p_55912_);
    }

    @Override
    protected boolean mayPlaceOn(BlockState p_55920_, BlockGetter p_55921_, BlockPos p_55922_) {
        return p_55920_.is(ModBlocks.VOID_NYLIUM.get()) || p_55920_.is(ModBlocks.ELEUTHERUS_BLOCK.get()) || super.mayPlaceOn(p_55920_, p_55921_, p_55922_);
    }
}
