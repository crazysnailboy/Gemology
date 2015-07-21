package net.crazysnailboy.mods.gemology.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class ItemGemSword extends ItemSword
{
	public ItemGemSword(ToolMaterial material)
	{
		super(material);
	}


	@Override
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target)
	{
		// if this is a black diamond sword...
		if (stack.getItem() == GCItems.amethyst_sword)
		{
			// why??
			if (stack.getItemDamage() < 2116)
			{
				// set the target on fire
				target.setFire(12);
				// increment item damage by 5
				stack.setItemDamage(stack.getItemDamage() + 5);
			}
		}

		return true;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return (
			(toRepair.getItem() == GCItems.amethyst_sword && repair.getItem() == GCItems.amethyst) ||
			(toRepair.getItem() == GCItems.blackdiamond_sword && repair.getItem() == GCItems.blackdiamond) ||
			(toRepair.getItem() == GCItems.emerald_sword && repair.getItem() == Items.emerald) ||
			(toRepair.getItem() == GCItems.pyrite_sword && repair.getItem() == GCItems.pyrite) ||
			(toRepair.getItem() == GCItems.ruby_sword && repair.getItem() == GCItems.ruby) ||
			(toRepair.getItem() == GCItems.sapphire_sword && repair.getItem() == GCItems.sapphire) || 
			(toRepair.getItem() == GCItems.topaz_sword && repair.getItem() == GCItems.topaz) ||
			
			(toRepair.getItem() == GCItems.clinohumite_sword && repair.getItem() == GCItems.clinohumite) ||
			(toRepair.getItem() == GCItems.goshenite_sword && repair.getItem() == GCItems.goshenite) ||
			(toRepair.getItem() == GCItems.heliodor_sword && repair.getItem() == GCItems.heliodor) ||
			(toRepair.getItem() == GCItems.morganite_sword && repair.getItem() == GCItems.morganite) ||
			(toRepair.getItem() == GCItems.onyx_sword && repair.getItem() == GCItems.onyx) ||
			(toRepair.getItem() == GCItems.turquoise_sword && repair.getItem() == GCItems.turquoise)
			
		);
	}	

}