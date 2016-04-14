package net.tomgeekery.leatherworking.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tomgeekery.leatherworking.items.LWItems;

public class LWCrafting {

	public static void LWCraftingInit() {
		
		// Leather Strip
		GameRegistry.addRecipe(new ItemStack(LWItems.leatherStrip, 3), "l", 'l', Items.leather);
		
		// Saddle
		GameRegistry.addRecipe(new ItemStack(Items.saddle),	"lll", " s ", " i ", 'l', Items.leather, 's', LWItems.leatherStrip,	'i', Items.iron_ingot);
				
	}
	
}
