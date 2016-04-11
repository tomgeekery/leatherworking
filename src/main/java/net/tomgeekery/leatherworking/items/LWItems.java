package net.tomgeekery.leatherworking.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tomgeekery.leatherworking.items.LWWaterskin.LWWaterskin;

public class LWItems {
	
	public static Item leatherStrip;
	public static Item waterSkinEmpty;
	public static Item waterSkinWater;
	
	public static void createItems() {
		waterSkinEmpty = new LWWaterskin(Blocks.air, "waterskin_empty");
		waterSkinWater = new LWWaterskin(Blocks.flowing_water, "waterskin_water");
		
		GameRegistry.registerItem(leatherStrip = new LWItem("leatherstrip"), "leatherstrip");
        GameRegistry.registerItem(waterSkinEmpty, "waterskin_empty");
        GameRegistry.registerItem(waterSkinWater, "waterskin_water");
	}
	
}
