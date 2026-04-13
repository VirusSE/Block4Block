package net.virusse.block4block.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.WeatherCheck;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.virusse.block4block.Block4Block;
import net.virusse.block4block.item.ModItems;
import net.virusse.block4block.loot.AddItemModifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Block4Block.MOD_ID);
    }

    @Override
    protected void start() {
        // Call #add to add a new GLM. This also adds a corresponding entry in global_loot_modifiers.json.
        this.add("block_4_block_music_disc_from_jungle_temple",
                new AddItemModifier(new LootItemCondition[] {
                    new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/jungle_temple")).build(),
                        LootItemRandomChanceCondition.randomChance(0.2f).build()
                }, ModItems.BLOCK_4_BLOCK_MUSIC_DISC.get())
        );
        this.add("block_4_block_music_disc_from_abandoned_mineshaft",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/abandoned_mineshaft")).build(),
                        LootItemRandomChanceCondition.randomChance(0.01f).build()
                }, ModItems.BLOCK_4_BLOCK_MUSIC_DISC.get())
        );
        this.add("block_4_block_music_disc_from_woodland_mansion",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/woodland_mansion")).build(),
                        LootItemRandomChanceCondition.randomChance(0.01f).build()
                }, ModItems.BLOCK_4_BLOCK_MUSIC_DISC.get())
        );
    }
}
