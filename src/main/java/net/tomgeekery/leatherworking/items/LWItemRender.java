package net.tomgeekery.leatherworking.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class LWItemRender {
		
	public static void registerItemRenderer() {
		
		// Leatherstrip
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(LWItems.leatherStrip, 0, new ModelResourceLocation("leatherworking:leatherstrip", "inventory"));
		
	}
	
}
