package net.morimori.itemdespawncanseler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("itemdespawncanseler")
public class ItemDespawnCanseler {
    public ItemDespawnCanseler() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onItemExpire(ItemExpireEvent event) {
        event.setCanceled(true);
    }
}
