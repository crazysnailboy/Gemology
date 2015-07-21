package net.crazysnailboy.mods.gemology.item;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class ItemGem {

	public static class ToolMaterial {
		
//        WOOD(0, 59, 2.0F, 0.0F, 15),
//        STONE(1, 131, 4.0F, 1.0F, 5),
//        IRON(2, 250, 6.0F, 2.0F, 14),
//        EMERALD(3, 1561, 8.0F, 3.0F, 10),
//        GOLD(0, 32, 12.0F, 0.0F, 22);
		
		// gemscraft materials
		public static final net.minecraft.item.Item.ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 3, 600, 7F, 3, 9);
		public static final net.minecraft.item.Item.ToolMaterial BLACKDIAMOND = EnumHelper.addToolMaterial("BLACKDIAMOND", 3, 2125, 9F, 7, 25);
		public static final net.minecraft.item.Item.ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 700, 7F, 3, 10);
		public static final net.minecraft.item.Item.ToolMaterial PYRITE = EnumHelper.addToolMaterial("PYRITE", 1, 100, 12F, 4, 20);
		public static final net.minecraft.item.Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 3, 750, 8F, 3, 12);
		public static final net.minecraft.item.Item.ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 3, 650, 7F, 3, 10);
		public static final net.minecraft.item.Item.ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 550, 7F, 3, 8);

		// shiny things materials
		public static final net.minecraft.item.Item.ToolMaterial CLINOHUMITE = EnumHelper.addToolMaterial("CLINOHUMITE", 2, 875, 7.0F, 2, 12);
		public static final net.minecraft.item.Item.ToolMaterial GOSHENITE = EnumHelper.addToolMaterial("GOSHENITE", 3, 1750, 9.0F, 4, 10);
		public static final net.minecraft.item.Item.ToolMaterial HELIODOR = EnumHelper.addToolMaterial("HELIODOR", 2, 1125, 8.0F, 3, 11);
		public static final net.minecraft.item.Item.ToolMaterial MORGANITE = EnumHelper.addToolMaterial("MORGANITE", 1, 750, 7.0F, 2, 12);
		public static final net.minecraft.item.Item.ToolMaterial ONYX = EnumHelper.addToolMaterial("ONYX", 3, 1750, 9.0F, 4, 10);
		public static final net.minecraft.item.Item.ToolMaterial TURQUOISE = EnumHelper.addToolMaterial("TURQUOISE", 1, 500, 6.0F, 2, 13);

	}
	
	
}
