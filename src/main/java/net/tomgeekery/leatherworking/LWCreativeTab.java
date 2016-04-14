package net.tomgeekery.leatherworking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class LWCreativeTab extends CreativeTabs {

	public LWCreativeTab(String label) {
		super(label);
	}
	
	public Item getTabIconItem() {
		return Items.leather;
	}
	
}
