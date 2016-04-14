package net.tomgeekery.leatherworking;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tomgeekery.leatherworking.proxy.CommonProxy;

@Mod(modid = LWGlobal.MOD_ID, name = LWGlobal.MOD_NAME, version = LWGlobal.MOD_VERSION)
public class LWMain {
	
	@Instance(LWGlobal.MOD_ID)
	public static LWMain instance;
	
	@SidedProxy(clientSide = LWGlobal.TG_CLIENT_PROXY, serverSide = LWGlobal.TG_COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
	
}