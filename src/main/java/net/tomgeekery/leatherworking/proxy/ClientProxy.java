package net.tomgeekery.leatherworking.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tomgeekery.leatherworking.render.LWBlockRender;
import net.tomgeekery.leatherworking.render.LWItemRender;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
    	LWItemRender.registerItemRender();
    	LWBlockRender.registerBlockRender();
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
}
