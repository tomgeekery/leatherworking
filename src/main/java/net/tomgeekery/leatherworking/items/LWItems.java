package net.tomgeekery.leatherworking.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LWItems {
	
public static Item leatherStrip;
	
	public static void createItems() {
		GameRegistry.registerItem(leatherStrip = new LWItem("leatherstrip"), "leatherstrip");
	}
	
}
