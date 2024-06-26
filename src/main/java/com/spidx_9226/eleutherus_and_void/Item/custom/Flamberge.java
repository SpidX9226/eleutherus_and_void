package com.spidx_9226.eleutherus_and_void.Item.custom;

import com.spidx_9226.eleutherus_and_void.effect.ModEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

import static net.minecraft.world.item.MaceItem.canSmashAttack;

public class Flamberge extends SwordItem {

    public Flamberge(Tier p_43269_, Properties p_43272_) {
        super(p_43269_, p_43272_);
    }

    public boolean canAttackBlock(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        return !player.isCreative();
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200), attacker);

        return super.hurtEnemy(itemStack, target, attacker);
    }

    public void postHurtEnemy(ItemStack itemStack, LivingEntity livingEntity, LivingEntity p_342605_) {
        itemStack.hurtAndBreak(1, p_342605_, EquipmentSlot.MAINHAND);
        if (canSmashAttack(p_342605_)) {
            p_342605_.resetFallDistance();
        }

    }

    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return 32;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.eleutherus_and_void.eleutherus_flamberge").withColor(4915330));
        super.appendHoverText(itemStack, tooltipContext, components, tooltipFlag);
    }
}
