package com.nersind.testmod.items;

import com.nersind.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> KORABLI = ITEMS.register("korabli",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHITPOST_TAB)));

//    public static final RegistryObject<Item> DOLEKOV_INGOT = ITEMS.register("dolekov_ingot",
//            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHITPOST_TAB)));

//    public static final RegistryObject<Item> TENDO_INGOT = ITEMS.register("tendo_ingot",
//           () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHITPOST_TAB)));

    public static final RegistryObject<Item> WAFFLE = ITEMS.register("waffle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHITPOST_TAB).food(ModFoods.WAFFLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
