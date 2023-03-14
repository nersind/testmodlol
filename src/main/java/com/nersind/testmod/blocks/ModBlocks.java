package com.nersind.testmod.blocks;

import com.nersind.testmod.TestMod;
import com.nersind.testmod.items.ModCreativeModeTab;
import com.nersind.testmod.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MOD_ID);

    public  static final RegistryObject<Block> DOLEKOV_BLOCK = registerBlock("dolekov_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f)
                .requiresCorrectToolForDrops()),ModCreativeModeTab.SHITPOST_TAB);

    public  static final RegistryObject<Block> TENDO_BLOCK = registerBlock("tendo_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f)
                    .requiresCorrectToolForDrops()),ModCreativeModeTab.SHITPOST_TAB);
    public  static final RegistryObject<Block> WAFFLE_BLOCK = registerBlock("waffle_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.CAKE).strength(0f)
                    .requiresCorrectToolForDrops().instabreak()),ModCreativeModeTab.SHITPOST_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem  (String name,RegistryObject <T> block,
					CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    
    public static void register(IEventBus eventBus) {
        BLOKS.register(eventBus);
    }
}
