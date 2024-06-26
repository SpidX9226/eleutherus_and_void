package com.spidx_9226.eleutherus_and_void.Item.custom;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class ModSmithingTemplate {
    public static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    public static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    public static final ChatFormatting ELEUTHERUS_FORMAT = ChatFormatting.DARK_PURPLE;

    public static final Component ELEUTHERUS_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID,"smithing_template.eleutherus_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    public static final Component ELEUTHERUS_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID,"smithing_template.eleutherus_upgrade.ingredients"))).withStyle(ELEUTHERUS_FORMAT);
    public static final Component ELEUTHERUS_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade",
            ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID,"eleutherus_upgrade"))).withStyle(TITLE_FORMAT);

    public static final Component ELEUTHERUS_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID,"smithing_template.eleutherus_upgrade.base_slot_description")));
    public static final Component ELEUTHERUS_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID,"smithing_template.eleutherus_upgrade.additions_slot_description")));

    public static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet");
    public static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate");
    public static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings");
    public static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots");
    public static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace("item/empty_slot_hoe");
    public static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace("item/empty_slot_axe");
    public static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");
    public static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace("item/empty_slot_shovel");
    public static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe");

    public static final ResourceLocation EMPTY_SLOT_ELEUTHERUS = ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID,"item/empty_slot_eleutherus");

    public static List<ResourceLocation> createEleutherusUpgradeIconList() {
        return List.of (
                EMPTY_SLOT_HELMET,
                EMPTY_SLOT_SWORD,
                EMPTY_SLOT_CHESTPLATE,
                EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS,
                EMPTY_SLOT_AXE,
                EMPTY_SLOT_BOOTS,
                EMPTY_SLOT_HOE,
                EMPTY_SLOT_SHOVEL
        );
    }

    public static List<ResourceLocation> createEleutherusUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_ELEUTHERUS);
    }

    public static Item get() {
        SmithingTemplateItem modUpdateSmithingTemplate = new SmithingTemplateItem(
                ELEUTHERUS_UPGRADE_APPLIES_TO,
                ELEUTHERUS_UPGRADE_INGREDIENTS,
                ELEUTHERUS_UPGRADE,
                ELEUTHERUS_UPGRADE_BASE_SLOT_DESCRIPTION,
                ELEUTHERUS_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createEleutherusUpgradeIconList(),
                createEleutherusUpgradeMaterialList());
        return modUpdateSmithingTemplate;
    }
}
