package net.virusse.block4block.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.virusse.block4block.Block4Block;
import net.virusse.block4block.item.ModItems;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Block4Block.MOD_ID);

    public static final Supplier<CreativeModeTab> BLOCK4BLOCK_ITEMS_TAB = CREATIVE_MODE_TAB.register("block4block_items_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.BLOCK_4_BLOCK_MUSIC_DISC.get()))
                .title(Component.translatable("creativetab.block4block.friends_items"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.BLOCK_4_BLOCK_MUSIC_DISC);
                }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
}
}