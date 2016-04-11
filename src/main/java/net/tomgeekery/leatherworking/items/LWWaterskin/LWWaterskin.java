package net.tomgeekery.leatherworking.items.LWWaterskin;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LWWaterskin extends ItemBucket {
	
    private Block isFull;
	    
    public LWWaterskin(Block containedBlock, String name) {
    	super(containedBlock);
    	
    	this.maxStackSize = 1;
        this.isFull = containedBlock;
    	this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
    }
        
}
