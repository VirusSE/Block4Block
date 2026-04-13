package net.virusse.minecraftfriends.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.virusse.minecraftfriends.MinecraftFriends;
import net.virusse.minecraftfriends.sound.ModSounds;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MinecraftFriends.MOD_ID);

    public static final DeferredItem<Item> BLOCK_4_BLOCK_MUSIC_DISC = ITEMS.register("block_4_block_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLOCK_4_BLOCK_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
