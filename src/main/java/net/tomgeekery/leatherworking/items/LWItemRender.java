package net.tomgeekery.leatherworking.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class LWItemRender {
		
	public static void registerItemRenderer() {
		
		// Leatherstrip
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    	.register(LWItems.leatherStrip, 0, new ModelResourceLocation("leatherworking:leatherstrip", "inventory"));
		
		// Waterskin Empty
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(LWItems.waterSkinEmpty, 0, new ModelResourceLocation("leatherworking:waterskin_empty", "inventory"));
		
		// Waterskin Water
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(LWItems.waterSkinWater, 0, new ModelResourceLocation("leatherworking:waterskin_water", "inventory"));
		
	}
	
}
