package com.spidx_9226.eleutherus_and_void.block.custom;

import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FlowerOfOblivionBlock extends FlowerBlock {
    public FlowerOfOblivionBlock(Holder<MobEffect> mobEffectHolder, float p_331000_, Properties properties) {
        super(mobEffectHolder, p_331000_, properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockState.is(ModBlocks.ELEUTHERUS_NYLIUM.get()) || blockState.is(ModBlocks.VOID_NYLIUM.get());
    }
}
