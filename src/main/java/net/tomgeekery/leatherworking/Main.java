package net.tomgeekery.leatherworking;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	public static final String MODID = "Leatherworking";
	public static final String VERSION = "0.1";
	public static Item leatherStrip;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		/* Items */
		
		// Leather Strip
		leatherStrip = new LeatherStrip();
		GameRegistry.registerItem(leatherStrip, "leatherStrip");
		
		/* Recipes */
		
		// Leather Strip
		GameRegistry.addRecipe(
				new ItemStack(leatherStrip, 3),
				"l",
				'l', Items.leather
		);
		
		// Saddle
		GameRegistry.addRecipe(
				new ItemStack(Items.saddle),
				"lll",
				" s ",
				" i ",
				'l', Items.leather,
				's', leatherStrip,
				'i', Items.iron_ingot
		);
		
		/* Textures */
		
		// Leather Strip
		Item leatherStripItem = GameRegistry.findItem("leatherworking", "leatherStrip");
		ModelResourceLocation leatherStripModel =
				new ModelResourceLocation("leatherworking:leatherStrip", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(leatherStripItem, 0, leatherStripModel);
	}
}