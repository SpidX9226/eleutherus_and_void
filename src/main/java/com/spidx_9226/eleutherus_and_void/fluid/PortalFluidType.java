package com.spidx_9226.eleutherus_and_void.fluid;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class PortalFluidType extends FluidType{
    public PortalFluidType() {
        super(FluidType.Properties.create().canSwim(false).canDrown(false).pathType(PathType.LAVA).adjacentPathType(null).motionScale(-0.014D).density(1500).viscosity(1500).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.withDefaultNamespace("item.bucket.fill_lava"))).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL_TEXTURE = ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, "block/portal_fluid_still"),
                    FLOWING_TEXTURE = ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, "block/flowing_portal_fluid");

            @Override
            public ResourceLocation getStillTexture() {
                return STILL_TEXTURE;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLOWING_TEXTURE;
            }
        });
    }

}
