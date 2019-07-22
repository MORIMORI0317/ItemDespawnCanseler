package com.morimori.itemdespawncanseler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

@Mod(Variable.MODID)
public class ItemDespawnCanseler
{
    public ItemDespawnCanseler() {
        IEventBus EVENT_BUS = MinecraftForge.EVENT_BUS;
        EVENT_BUS.register(this);
        ItemDespawnCanselerHandler ItemDespawnCanselerHandler = new ItemDespawnCanselerHandler();
        EVENT_BUS.addListener(EventPriority.HIGH, false, ItemExpireEvent.class, ItemDespawnCanselerHandler::onItemExpire);

    }

}
