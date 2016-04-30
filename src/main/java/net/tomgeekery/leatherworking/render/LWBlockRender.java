package net.tomgeekery.leatherworking.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.tomgeekery.leatherworking.LWGlobal;
import net.tomgeekery.leatherworking.blocks.LWBlocks;

public class LWBlockRender {
	
	public static void registerBlockRender() {
		regBlock(LWBlocks.logCork);
	}
	
	public static void regBlock(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(LWGlobal.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
