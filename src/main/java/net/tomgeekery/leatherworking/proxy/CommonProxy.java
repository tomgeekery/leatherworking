package net.tomgeekery.leatherworking.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tomgeekery.leatherworking.blocks.LWBlocks;
import net.tomgeekery.leatherworking.crafting.LWCrafting;
import net.tomgeekery.leatherworking.events.LWEvents;
import net.tomgeekery.leatherworking.items.LWItems;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		LWBlocks.initBlocks();
		LWItems.initItems();
    }

    public void init(FMLInitializationEvent e) {
    	LWCrafting.LWCraftingInit();
    	MinecraftForge.EVENT_BUS.register(new LWEvents());
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
	
}
