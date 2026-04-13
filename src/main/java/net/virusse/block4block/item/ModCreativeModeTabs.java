package net.virusse.minecraftfriends.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.virusse.minecraftfriends.MinecraftFriends;
import net.virusse.minecraftfriends.item.ModItems;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftFriends.MOD_ID);

    public static final Supplier<CreativeModeTab> MINECRAFTFRIENDS_ITEMS_TAB = CREATIVE_MODE_TAB.register("minecraftfriends_items_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.BLOCK_4_BLOCK_MUSIC_DISC.get()))
                .title(Component.translatable("creativetab.minecraftfriends.friends_items"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.BLOCK_4_BLOCK_MUSIC_DISC);
                }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
}
}