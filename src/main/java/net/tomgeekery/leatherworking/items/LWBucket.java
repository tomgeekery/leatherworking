package net.tomgeekery.leatherworking.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.tomgeekery.leatherworking.LWGlobal;

public class LWBucket extends ItemBucket {
	
	private Block isFull;

	public LWBucket(Block containedBlock, String name) {
		super(containedBlock);
		
		this.setUnlocalizedName(name);
		this.maxStackSize = 1;
        this.isFull = containedBlock;
        this.setCreativeTab(LWGlobal.lwCreativeTab);  
	}
	
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        boolean flag = this.isFull == Blocks.air;
        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(worldIn, playerIn, flag);

        if (movingobjectposition == null) {
            return itemStackIn;
        }
        else {
            ItemStack ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(playerIn, worldIn, itemStackIn, movingobjectposition);
            if (ret != null) return ret;

            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                BlockPos blockpos = movingobjectposition.getBlockPos();

                if (!worldIn.isBlockModifiable(playerIn, blockpos)) {
                    return itemStackIn;
                }

                if (flag) {
                	if (!playerIn.canPlayerEdit(blockpos.offset(movingobjectposition.sideHit), movingobjectposition.sideHit, itemStackIn)) {
                        return itemStackIn;
                    }

                    IBlockState iblockstate = worldIn.getBlockState(blockpos);
                    Material material = iblockstate.getBlock().getMaterial();

                    if (material == Material.water && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
                        worldIn.setBlockToAir(blockpos);
                        playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
                        return this.fillBucket(itemStackIn, playerIn, LWItems.waterSkinFull);
                    }

                }
                else {
                    if (this.isFull == Blocks.air) {
                        return new ItemStack(LWItems.waterSkin);
                    }

                    BlockPos blockpos1 = blockpos.offset(movingobjectposition.sideHit);

                    if (!playerIn.canPlayerEdit(blockpos1, movingobjectposition.sideHit, itemStackIn)) {
                        return itemStackIn;
                    }

                    if (this.tryPlaceContainedLiquid(worldIn, blockpos1) && !playerIn.capabilities.isCreativeMode) {
                        playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
                        return new ItemStack(LWItems.waterSkin);
                    }
                }
            }

            return itemStackIn;
        }
    }
	
	private ItemStack fillBucket(ItemStack emptyBuckets, EntityPlayer player, Item fullBucket) {
        if (player.capabilities.isCreativeMode) {
            return emptyBuckets;
        }
        else if (--emptyBuckets.stackSize <= 0) {
            return new ItemStack(fullBucket);
        }
        else {
            if (!player.inventory.addItemStackToInventory(new ItemStack(fullBucket))) {
                player.dropPlayerItemWithRandomChoice(new ItemStack(fullBucket, 1, 0), false);
            }

            return emptyBuckets;
        }
    }
	
}
