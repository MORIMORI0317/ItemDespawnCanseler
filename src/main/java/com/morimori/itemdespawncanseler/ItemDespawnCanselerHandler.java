package com.morimori.itemdespawncanseler;

import net.minecraftforge.event.entity.item.ItemExpireEvent;

public class ItemDespawnCanselerHandler {

	public void onItemExpire(ItemExpireEvent event) {

		event.setCanceled(true);
	}
}
