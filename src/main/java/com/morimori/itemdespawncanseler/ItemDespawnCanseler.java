package com.morimori.itemdespawncanseler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(ItemDespawnCanseler.MODID)
public class ItemDespawnCanseler {
	public static final String MODID = "itemdespawncanseler";
	public static final String MODNAME = "ItemDespawnCanseler";
	public static final String MODVER = "1.0";

	public ItemDespawnCanseler() {

		MinecraftForge.EVENT_BUS.register(this);

	}

	@SubscribeEvent
	public void onItemExpire(ItemExpireEvent event) {

		event.setCanceled(true);
	}
}
