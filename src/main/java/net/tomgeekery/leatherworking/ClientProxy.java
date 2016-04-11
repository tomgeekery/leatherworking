package net.tomgeekery.leatherworking;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tomgeekery.leatherworking.items.LWItemRender;
import net.tomgeekery.leatherworking.items.LWWaterskin.LWWaterskinHandler;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
    	LWItemRender.registerItemRenderer();
    	MinecraftForge.EVENT_BUS.register(new LWWaterskinHandler());
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
}
