package net.banman.survivalevolved.item;

import net.banman.survivalevolved.block.ModBlocks;
import net.banman.survivalevolved.survivalevolved;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, survivalevolved.MOD_ID);

    public static final Supplier<CreativeModeTab> NATURAL_RESOURCES_TAB = CREATIVE_MODE_TAB.register("natural_resources_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLINT_SHARD.get()))
                    .title(Component.translatable("creativetab.survivalevolved.natural_resources"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FLINT_SHARD);
                        output.accept(ModItems.FLINT_DUST);
                        output.accept(ModItems.TWIG);
                        output.accept(ModItems.ROOT);
                        output.accept(ModItems.RAW_NICKEL);
                        output.accept(ModItems.NICKEL_INGOT);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.ROASTED_ROOT);
                    }).build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ROOTED_DIRT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(survivalevolved.MOD_ID, "natural_resources_tab"))
                    .title(Component.translatable("creativetab.survivalevolved.blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.ROOTED_GRASS);
                        output.accept(ModBlocks.ROOTED_DIRT);
                        output.accept(ModBlocks.NICKEL_ORE);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
