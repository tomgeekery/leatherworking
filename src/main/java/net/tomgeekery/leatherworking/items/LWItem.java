package net.tomgeekery.leatherworking.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.tomgeekery.leatherworking.LWGlobal;

public class LWItem extends Item {
	
	public LWItem(String name) {
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(LWGlobal.lwCreativeTab);
	}
	
}
