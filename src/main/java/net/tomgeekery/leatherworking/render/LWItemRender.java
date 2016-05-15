package net.tomgeekery.leatherworking.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.tomgeekery.leatherworking.LWGlobal;
import net.tomgeekery.leatherworking.items.LWItems;

public final class LWItemRender {
		
	public static void registerItemRender() {
		regItem(LWItems.leatherStrip);
		regItem(LWItems.cork);
		regItem(LWItems.waterSkin);
		regItem(LWItems.waterSkinFull);
	}
	
	public static void regItem(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LWGlobal.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
