package net.de1m.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab AMONGIUM_CORE = new CreativeModeTab("amongium_core") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMONGIUM_CRYSTAL.get());
        }
    };
}
