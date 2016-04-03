package net.tomgeekery.leatherworking;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	public static final String MODID = "Leatherworking";
	public static final String MODNAME = "Leatherworking";
	public static final String VERSION = "0.1";
	
	@SidedProxy(clientSide="net.tomgeekery.leatherworking.ClientProxy", serverSide="net.tomgeekery.leatherworking.ServerProxy")
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