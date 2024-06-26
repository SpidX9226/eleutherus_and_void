package com.spidx_9226.eleutherus_and_void.block.entity;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EleutherusAndVoid.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.VOID_SIGN.get(), ModBlocks.VOID_WALL_SIGN.get(), ModBlocks.ELEUTHERUS_SIGN.get(), ModBlocks.ELEUTHERUS_WALL_SIGN.get()).build(null));


    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.VOID_HANGING_SIGN.get(), ModBlocks.VOID_WALL_HANGING_SIGN.get(), ModBlocks.ELEUTHERUS_HANGING_SIGN.get(), ModBlocks.ELEUTHERUS_WALL_HANGING_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
