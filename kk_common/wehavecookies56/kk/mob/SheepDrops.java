package wehavecookies56.kk.mob;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import wehavecookies56.kk.item.AddedItems;

public class SheepDrops {
	public static double rand;

	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntitySheep) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 0.25d){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Heart.itemID, 1);

				}
			}
		}
	}
}