package com.spidx_9226.eleutherus_and_void.Item;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials extends ArmorMaterials {
    public static final Holder<ArmorMaterial> ELEUTHERUS = register("eleutherus", Util.make(new EnumMap<>(ArmorItem.Type.class), p_327103_ -> {
        p_327103_.put(ArmorItem.Type.BOOTS, 3);
        p_327103_.put(ArmorItem.Type.LEGGINGS, 6);
        p_327103_.put(ArmorItem.Type.CHESTPLATE, 8);
        p_327103_.put(ArmorItem.Type.HELMET, 3);
        p_327103_.put(ArmorItem.Type.BODY, 11);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(ModItems.ELEUTHERUS.get()));

    public static final Holder<ArmorMaterial> VOID = register("eleutherus", Util.make(new EnumMap<>(ArmorItem.Type.class), p_327103_ -> {
        p_327103_.put(ArmorItem.Type.BOOTS, 4);
        p_327103_.put(ArmorItem.Type.LEGGINGS, 7);
        p_327103_.put(ArmorItem.Type.CHESTPLATE, 9);
        p_327103_.put(ArmorItem.Type.HELMET, 4);
        p_327103_.put(ArmorItem.Type.BODY, 13);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.7F, () -> Ingredient.of(ModItems.VOID_INGOT.get()));

    private static Holder<ArmorMaterial> register(
            String p_334359_,
            EnumMap<ArmorItem.Type, Integer> p_329993_,
            int p_332696_,
            Holder<SoundEvent> p_333975_,
            float p_329381_,
            float p_334853_,
            Supplier<Ingredient> p_333678_
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, p_334359_)));
        return register(p_334359_, p_329993_, p_332696_, p_333975_, p_329381_, p_334853_, p_333678_, list);
    }

    private static Holder<ArmorMaterial> register(
            String p_332406_,
            EnumMap<ArmorItem.Type, Integer> p_331524_,
            int p_331490_,
            Holder<SoundEvent> p_331648_,
            float p_327988_,
            float p_328616_,
            Supplier<Ingredient> p_334412_,
            List<ArmorMaterial.Layer> p_330855_
    ) {
        EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enummap.put(armoritem$type, p_331524_.get(armoritem$type));
        }

        return Registry.registerForHolder(
                BuiltInRegistries.ARMOR_MATERIAL,
                ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, p_332406_),
                new ArmorMaterial(enummap, p_331490_, p_331648_, p_334412_, p_330855_, p_327988_, p_328616_)
        );
    }

}
