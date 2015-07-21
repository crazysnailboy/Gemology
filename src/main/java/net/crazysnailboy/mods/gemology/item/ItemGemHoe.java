package net.crazysnailboy.mods.gemology.item;

import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class ItemGemHoe extends ItemHoe
{
	public ItemGemHoe(ToolMaterial material)
	{
		super(material);
	}


	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return (
			(toRepair.getItem() == GCItems.amethyst_hoe && repair.getItem() == GCItems.amethyst) ||
			(toRepair.getItem() == GCItems.blackdiamond_hoe && repair.getItem() == GCItems.blackdiamond) ||
			(toRepair.getItem() == GCItems.emerald_hoe && repair.getItem() == Items.emerald) ||
			(toRepair.getItem() == GCItems.pyrite_hoe && repair.getItem() == GCItems.pyrite) ||
			(toRepair.getItem() == GCItems.ruby_hoe && repair.getItem() == GCItems.ruby) ||
			(toRepair.getItem() == GCItems.sapphire_hoe && repair.getItem() == GCItems.sapphire) || 
			(toRepair.getItem() == GCItems.topaz_hoe && repair.getItem() == GCItems.topaz) ||
			
			(toRepair.getItem() == GCItems.clinohumite_hoe && repair.getItem() == GCItems.clinohumite) ||
			(toRepair.getItem() == GCItems.goshenite_hoe && repair.getItem() == GCItems.goshenite) ||
			(toRepair.getItem() == GCItems.heliodor_hoe && repair.getItem() == GCItems.heliodor) ||
			(toRepair.getItem() == GCItems.morganite_hoe && repair.getItem() == GCItems.morganite) ||
			(toRepair.getItem() == GCItems.onyx_hoe && repair.getItem() == GCItems.onyx) ||
			(toRepair.getItem() == GCItems.turquoise_hoe && repair.getItem() == GCItems.turquoise)
			
		);
	}	
	
}