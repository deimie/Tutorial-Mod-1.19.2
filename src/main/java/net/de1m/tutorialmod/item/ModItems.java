package net.de1m.tutorialmod.item;

import net.de1m.tutorialmod.tutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorialMod.MOD_ID);

    public static final RegistryObject<Item> AMONGIUM_CRYSTAL = ITEMS.register("amongium_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.AMONGIUM_CORE)));
    public static final RegistryObject<Item> RAW_AMONGIUM = ITEMS.register("raw_amongium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.AMONGIUM_CORE)));
    public static final RegistryObject<Item> CREWMATE = ITEMS.register("crewmate",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.AMONGIUM_CORE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


