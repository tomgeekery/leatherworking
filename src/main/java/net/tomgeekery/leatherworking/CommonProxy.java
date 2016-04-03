package net.tomgeekery.leatherworking;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tomgeekery.leatherworking.crafting.LWCrafting;
import net.tomgeekery.leatherworking.items.LWItemRender;
import net.tomgeekery.leatherworking.items.LWItems;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		LWItems.createItems();
    }

    public void init(FMLInitializationEvent e) {
    	LWCrafting.LWCraftingInit();
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
	
}
