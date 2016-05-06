package net.tomgeekery.leatherworking.events;

import java.util.Random;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LWEvents {
	
	@SubscribeEvent
	public void dropLeather(LivingDeathEvent event) {
		// Pigs, sheep, and chickens drop leather.
		if (event.entity instanceof EntityPig 
				|| event.entity instanceof EntitySheep
				|| event.entity instanceof EntityChicken) {
			
			Random random = new Random();
			
			if (!event.entity.worldObj.isRemote) {
				event.entity.dropItem(Items.leather, random.nextInt(2));
			}
		}
	}
}
