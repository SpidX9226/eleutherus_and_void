package com.spidx_9226.eleutherus_and_void.Item;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import com.spidx_9226.eleutherus_and_void.Item.custom.EleutherusItem;
import com.spidx_9226.eleutherus_and_void.Item.custom.Flamberge;
import com.spidx_9226.eleutherus_and_void.Item.custom.ModSmithingTemplate;
import com.spidx_9226.eleutherus_and_void.Item.custom.VoidFlamberge;
import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import com.spidx_9226.eleutherus_and_void.fluid.ModFluids;
import com.spidx_9226.eleutherus_and_void.soud.ModJukeboxSongs;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems extends Items{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EleutherusAndVoid.MOD_ID);

    public static final RegistryObject<Item> ELEUTHERUS = ITEMS.register("eleutherus",
            () -> new EleutherusItem(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ELEUTHERUS_RASPBERRY = ITEMS.register("eleutherus_raspberry",
            () -> new ItemNameBlockItem(ModBlocks.ELEUTHERUS_RASPBERRY_BUSH.get(), new Item.Properties().food(ModFoodItems.ELEUTHERUS_RASPBERRY)));

    public static final RegistryObject<Item> VOID_INGOT = ITEMS.register("void_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> RAW_VOID = ITEMS.register("raw_void",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> PORTAL_FLUID_BUCKET = ITEMS.register("portal_fluid_bucket",
            () -> new BucketItem(ModFluids.PORTAL_FLUID,new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> ELEUTHERUS_DUST = ITEMS.register("eleutherus_dust",
            () -> new EleutherusItem(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELEUTHERUS_AND_VOID_MUSIC_DISK = ITEMS.register("eleutherus_and_void_music_disk",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ELEUTHERUS_POEM)));

    public static final RegistryObject<Item> ELEUTHERUS_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("eleutherus_upgrade_smithing_template",
            ModSmithingTemplate::get);

    public static final RegistryObject<Item> ELEUTHERUS_PIE = ITEMS.register("eleutherus_pie",
            () -> new Item(new Item.Properties().food(ModFoodItems.ELEUTHERUS_PIE)));

    public static final RegistryObject<Item> ELEUTHERUS_MANGO = ITEMS.register("eleutherus_mango",
            () -> new Item(new Item.Properties().food(ModFoodItems.ELEUTHERUS_MANGO)));

    public static final RegistryObject<Item> ELEUTHERUS_SWORD = ITEMS.register("eleutherus_sword",
            () -> new SwordItem(ModToolTiers.ELEUTHERUS, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.ELEUTHERUS, 3, -2.4F))));
    public static final RegistryObject<Item> ELEUTHERUS_PICKAXE = ITEMS.register("eleutherus_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ELEUTHERUS, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.ELEUTHERUS, 3, -2.4F))));
    public static final RegistryObject<Item> ELEUTHERUS_AXE = ITEMS.register("eleutherus_axe",
            () -> new AxeItem(ModToolTiers.ELEUTHERUS, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.ELEUTHERUS, 3, -2.4F))));
    public static final RegistryObject<Item> ELEUTHERUS_SHOVEL = ITEMS.register("eleutherus_shovel",
            () -> new ShovelItem(ModToolTiers.ELEUTHERUS, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.ELEUTHERUS, 3, -2.4F))));
    public static final RegistryObject<Item> ELEUTHERUS_HOE = ITEMS.register("eleutherus_hoe",
            () -> new HoeItem(ModToolTiers.ELEUTHERUS, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.ELEUTHERUS, 3, -2.4F))));

    public static final RegistryObject<Item> ELEUTHERUS_FLAMBERGE = ITEMS.register("eleutherus_flamberge",
            () -> new Flamberge(ModToolTiers.ELEUTHERUS, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.ELEUTHERUS, 7, -2.6F))));

    public static final RegistryObject<Item> VOID_FLAMBERGE = ITEMS.register("void_flamberge",
            () -> new VoidFlamberge(ModToolTiers.VOID, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.VOID, 8, -2.6F))));

    public static final RegistryObject<Item> ELEUTHERUS_HELMET = ITEMS.register("eleutherus_helmet",
            () -> new ArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELEUTHERUS_CHESTPLATE = ITEMS.register("eleutherus_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELEUTHERUS_LEGGINGS = ITEMS.register("eleutherus_leggings",
            () -> new ArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELEUTHERUS_BOOTS = ITEMS.register("eleutherus_boots",
            () -> new ArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> VOID_SIGN = ITEMS.register("void_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.VOID_SIGN.get(), ModBlocks.VOID_WALL_SIGN.get()));
    public static final RegistryObject<Item> VOID_HANGING_SIGN = ITEMS.register("void_hanging_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.VOID_HANGING_SIGN.get(), ModBlocks.VOID_WALL_HANGING_SIGN.get()));

    public static final RegistryObject<Item> ELEUTHERUS_SIGN = ITEMS.register("eleutherus_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ELEUTHERUS_SIGN.get(), ModBlocks.ELEUTHERUS_WALL_SIGN.get()));
    public static final RegistryObject<Item> ELEUTHERUS_HANGING_SIGN = ITEMS.register("eleutherus_hanging_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ELEUTHERUS_HANGING_SIGN.get(), ModBlocks.ELEUTHERUS_WALL_HANGING_SIGN.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
