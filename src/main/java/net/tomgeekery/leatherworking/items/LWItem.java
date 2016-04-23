package net.tomgeekery.leatherworking.items;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.tomgeekery.leatherworking.LWGlobal;

public class LWItem extends Item {
	
	public LWItem(String name) {
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(LWGlobal.lwCreativeTab);
	}
	
}
