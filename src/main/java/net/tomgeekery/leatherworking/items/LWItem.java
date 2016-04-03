package net.tomgeekery.leatherworking.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LWItem extends Item {
	
	public LWItem(String unlocalizedName) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
}
