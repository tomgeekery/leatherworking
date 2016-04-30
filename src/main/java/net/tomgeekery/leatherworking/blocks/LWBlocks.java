package net.tomgeekery.leatherworking.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tomgeekery.leatherworking.items.LWBucket;
import net.tomgeekery.leatherworking.items.LWItem;

public class LWBlocks {
	
	public static Block logCork;
	
	public static void initBlocks() {
		// Blocks
		GameRegistry.registerBlock(logCork = new LWBlock("logCork", Material.wood, 2.0F, 0), "logCork");
	}

}
