package com.spidx_9226.eleutherus_and_void.util;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType VOID = WoodType.register(new WoodType(EleutherusAndVoid.MOD_ID + ":void", BlockSetType.CHERRY));
    public static final WoodType ELEUTHERUS = WoodType.register(new WoodType(EleutherusAndVoid.MOD_ID + ":eleutherus", BlockSetType.WARPED));
}
