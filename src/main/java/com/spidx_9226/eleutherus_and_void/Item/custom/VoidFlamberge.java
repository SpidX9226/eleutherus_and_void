package com.spidx_9226.eleutherus_and_void.Item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

import static net.minecraft.world.item.MaceItem.canSmashAttack;

public class VoidFlamberge extends SwordItem {

    public VoidFlamberge(Tier p_43269_, Properties p_43272_) {
        super(p_43269_, p_43272_);
    }

    public boolean canAttackBlock(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        return !player.isCreative();
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 200), attacker);
        target.addEffect(new MobEffectInstance(MobEffects.WITHER, 200), attacker);
        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200), attacker);

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
        return 64;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.eleutherus_and_void.void_flamberge").withColor(4915330));
        super.appendHoverText(itemStack, tooltipContext, components, tooltipFlag);
    }
}
