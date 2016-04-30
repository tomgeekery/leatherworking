package net.tomgeekery.leatherworking.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.tomgeekery.leatherworking.LWGlobal;

public class LWBlock extends Block {

	public LWBlock(String name, Material material, float hardness, float resistance) {
		super(material);
		
		this.setUnlocalizedName(name);
		this.setHardness(blockHardness);
		this.setResistance(resistance);
		this.setCreativeTab(LWGlobal.lwCreativeTab);
	}
	
}
