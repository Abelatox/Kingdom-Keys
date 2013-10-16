package wehavecookies56.kk.battlegear;

import cpw.mods.fml.relauncher.Side;
import mods.battlegear2.api.weapons.OffhandAttackEvent;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public abstract class OneHandedWeapon extends ItemWeapon{

	public OneHandedWeapon(int par1, EnumToolMaterial material, String named) {
		super(par1, material);
	}
	
	@Override
	public boolean willAllowOffhandWeapon() {
		return true;
	}
	
	@Override
	public boolean willAllowShield() {
		return true;
	}

	@Override
	public boolean isOffhandHandDualWeapon() {
		return true;
	}

	@Override
	public boolean sheatheOnBack() {
		return false;
	}
	
	@Override
	public boolean offhandAttackEntity(OffhandAttackEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}

	@Override
	public boolean offhandClickAir(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}

	@Override
	public boolean offhandClickBlock(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}

	@Override
	public void performPassiveEffects(Side effectiveSide,
			ItemStack mainhandItem, ItemStack offhandItem) {		
	}

	@Override
	public int getItemEnchantability()
    {
        return this.getMaterial().getEnchantability();
    }
}
