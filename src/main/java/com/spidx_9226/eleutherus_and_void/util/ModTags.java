package com.spidx_9226.eleutherus_and_void.util;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_ELEUTHERUS_TOOL = tag("incorrect_for_eleutherus_tool");
        public static final TagKey<Block> INCORRECT_FOR_VOID_TOOL = tag("incorrect_for_void_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, name));
        }
    }
}
