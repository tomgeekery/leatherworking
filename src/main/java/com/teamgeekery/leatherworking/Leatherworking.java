
package com.teamgeekery.leatherworking;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
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
