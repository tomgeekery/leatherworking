
package com.teamgeekery.leatherworking;

import com.teamgeekery.leatherworking.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Leatherworking.MODID, name = Leatherworking.NAME, version = Leatherworking.VERSION)
public class Leatherworking
{
    public static final String MODID = "leatherworking";
    public static final String NAME = "Leatherworking";
    public static final String VERSION = "1.0";
    
    @Mod.Instance(MODID)
    public static Leatherworking instance;
    
    @SidedProxy(serverSide = "com.teamgeekery.leadtherworking.proxy.CommonProxy", clientSide = "com.teamgeekery.leatherworking.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
    
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
    	System.out.println(NAME + " is loading!");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}   
}
