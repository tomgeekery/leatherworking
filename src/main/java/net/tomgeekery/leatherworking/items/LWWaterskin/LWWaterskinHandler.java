package net.tomgeekery.leatherworking.items.LWWaterskin;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.tomgeekery.leatherworking.items.LWItems;

public class LWWaterskinHandler {
	
	@SubscribeEvent
    public void bucketFill (FillBucketEvent event) {
		
		// Switch to empty water skin.
		if (event.current.getItem() == LWItems.waterSkinWater && event.target.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
			event.current.setItem(LWItems.waterSkinEmpty);
		}
		
		// Switch to full water skin.
		else if (event.current.getItem() == LWItems.waterSkinEmpty && event.target.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {

			// Grab block.
			BlockPos blockPos = event.target.getBlockPos();
			Block block = event.world.getBlockState(blockPos).getBlock();
			
			// Handle water.
			if (block == Blocks.water || block == Blocks.flowing_water) {
				event.current.setItem(LWItems.waterSkinWater);
			}
			// Handle everything else.
			else {
				// Cancel the event since this is called a WATER skin.
				event.setCanceled(true);
			}
			
			
			
		}
		
	}
	
}
