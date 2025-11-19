package net.banman.survivalevolved.item;

import net.banman.survivalevolved.survivalevolved;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(survivalevolved.MOD_ID);

    public static final DeferredItem<Item> FLINT_SHARD = ITEMS.register("flint_shard",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FLINT_DUST = ITEMS.register("flint_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TWIG = ITEMS.register("twig",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ROOT = ITEMS.register("root",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
