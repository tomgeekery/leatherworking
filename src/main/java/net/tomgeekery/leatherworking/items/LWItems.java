package net.tomgeekery.leatherworking.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LWItems {
	
	public static Item leatherStrip;
	public static Item cork;
	public static Item waterSkin;
	public static Item waterSkinFull;
	
	public static void initItems() {
		// Items
		GameRegistry.registerItem(leatherStrip = new LWItem("leatherStrip"), "leatherStrip");
		GameRegistry.registerItem(cork = new LWItem("cork"), "cork", "cork");
		
		// Buckets
		GameRegistry.registerItem(waterSkin = new LWBucket(Blocks.air, "waterSkin"), "waterSkin");
		GameRegistry.registerItem(waterSkinFull = new LWBucket(Blocks.flowing_water, "waterSkinFull"), "waterSkinFull");
	}
	
}
