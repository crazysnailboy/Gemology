package net.crazysnailboy.mods.gemology.item;

import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.crazysnailboy.mods.gemology.GemologyMod;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class ItemGemArmor extends ItemArmor
{

	public static class ArmorMaterial 
	{
		
//        LEATHER("leather", 5, new int[]{1, 3, 2, 1}, 15),
//        CHAIN("chainmail", 15, new int[]{2, 5, 4, 1}, 12),
//        IRON("iron", 15, new int[]{2, 6, 5, 2}, 9),
//        GOLD("gold", 7, new int[]{2, 5, 3, 1}, 25),
//        DIAMOND("diamond", 33, new int[]{3, 8, 6, 3}, 10);
		
		// gemscraft materials
		public static final net.minecraft.item.ItemArmor.ArmorMaterial AMETHYST = EnumHelper.addArmorMaterial("AMETHYST", GemologyMod.MOD_ID + ":amethyst", 22, new int[] {2, 6, 5, 2}, 9);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial BLACKDIAMOND = EnumHelper.addArmorMaterial("BLACKDIAMOND", GemologyMod.MOD_ID + ":blackdiamond", 40, new int[] {4, 10, 8, 4}, 13);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("EMERALD", GemologyMod.MOD_ID + ":emerald", 24, new int[] {3, 8, 7, 3}, 10);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", GemologyMod.MOD_ID + ":ruby", 25, new int[] {3, 8, 7, 3}, 10);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial SAPPHIRE = EnumHelper.addArmorMaterial("SAPPHIRE", GemologyMod.MOD_ID + ":sapphire", 23, new int[] {3, 7, 6, 2}, 9);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial TOPAZ = EnumHelper.addArmorMaterial("TOPAZ", GemologyMod.MOD_ID + ":topaz", 21, new int[] {2, 6, 5, 2}, 9);

		// shiny things materials
		public static final net.minecraft.item.ItemArmor.ArmorMaterial CLINOHUMITE = EnumHelper.addArmorMaterial("CLINOHUMITE", GemologyMod.MOD_ID + ":clinohumite", 25, new int[] { 3, 7, 5, 3 }, 9);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial GOSHENITE = EnumHelper.addArmorMaterial("GOSHENITE", GemologyMod.MOD_ID + ":goshenite", 37, new int[] { 3, 7, 5, 3 }, 9);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial HELIODOR = EnumHelper.addArmorMaterial("HELIODOR", GemologyMod.MOD_ID + ":heliodor", 29, new int[] { 3, 7, 5, 3 }, 9);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial MORGANITE = EnumHelper.addArmorMaterial("MORGANITE", GemologyMod.MOD_ID + ":morganite", 23, new int[] { 3, 7, 5, 3 }, 10);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial ONYX = EnumHelper.addArmorMaterial("ONYX", GemologyMod.MOD_ID + ":onyx", 37, new int[] { 3, 7, 5, 3 }, 9);
		public static final net.minecraft.item.ItemArmor.ArmorMaterial TURQUOISE = EnumHelper.addArmorMaterial("TURQUOISE", GemologyMod.MOD_ID + ":turquoise", 19, new int[] { 3, 7, 5, 3 }, 10);

		// minerals materials
		public static final net.minecraft.item.ItemArmor.ArmorMaterial PYRITE = EnumHelper.addArmorMaterial("PYRITE", GemologyMod.MOD_ID + ":pyrite", 13, new int[] { 2, 4, 4, 1 }, 13);
		
	}

	public ItemGemArmor(ItemArmor.ArmorMaterial material, int renderIndex, int armorType)
	{	
		super(material, renderIndex, armorType);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return (
				
			(this.getArmorMaterial() == ArmorMaterial.AMETHYST && repair.getItem() == GCItems.amethyst) ||
			(this.getArmorMaterial() == ArmorMaterial.BLACKDIAMOND && repair.getItem() == GCItems.blackdiamond) ||
			(this.getArmorMaterial() == ArmorMaterial.EMERALD && repair.getItem() == Items.emerald) ||
			(this.getArmorMaterial() == ArmorMaterial.RUBY && repair.getItem() == GCItems.ruby) ||
			(this.getArmorMaterial() == ArmorMaterial.SAPPHIRE && repair.getItem() == GCItems.sapphire) || 
			(this.getArmorMaterial() == ArmorMaterial.TOPAZ && repair.getItem() == GCItems.topaz) ||
			
			(this.getArmorMaterial() == ArmorMaterial.CLINOHUMITE && repair.getItem() == GCItems.clinohumite) ||
			(this.getArmorMaterial() == ArmorMaterial.GOSHENITE && repair.getItem() == GCItems.goshenite) ||
			(this.getArmorMaterial() == ArmorMaterial.HELIODOR && repair.getItem() == GCItems.heliodor) ||
			(this.getArmorMaterial() == ArmorMaterial.MORGANITE && repair.getItem() == GCItems.morganite) ||
			(this.getArmorMaterial() == ArmorMaterial.ONYX && repair.getItem() == GCItems.onyx) ||
			(this.getArmorMaterial() == ArmorMaterial.TURQUOISE && repair.getItem() == GCItems.turquoise) ||
			
			(this.getArmorMaterial() == ArmorMaterial.PYRITE && repair.getItem() == GCItems.pyrite)
			
		);
	}

}