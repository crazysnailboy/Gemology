package net.crazysnailboy.mods.gemology.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.crazysnailboy.mods.gemology.common.config.GCConfiguration;
import net.crazysnailboy.mods.gemology.init.GCItems;
import net.crazysnailboy.mods.gemology.util.WorldHelper;

public class ItemGemPickaxe extends ItemPickaxe
{
	public ItemGemPickaxe(Item.ToolMaterial material)
	{
		super(material);
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		// if this is a black diamond pickaxe...
		if ((!world.isRemote) && (stack.getItem() == GCItems.blackdiamond_pickaxe))
		{
			ItemStack output = null;
			
			// why??
			if (stack.getItemDamage() < 2116)
			{
				IBlockState state = world.getBlockState(pos);
				Block block = state.getBlock();

				// if we're mining stone or cobblestone, drop stone
				if ((block == Blocks.stone && block.getMetaFromState(state) == BlockStone.EnumType.STONE.getMetadata()) || (block == Blocks.cobblestone))
					output = new ItemStack(Blocks.stone, 1, 0);
				// if we're mining iron ore, drop an iron ingot
				else if (block == Blocks.iron_ore)
					output = new ItemStack(Items.iron_ingot, 1, 0);
				// if we're mining gold ore, drop a gold ingot
				else if (block == Blocks.gold_ore)
					output = new ItemStack(Items.gold_ingot, 1, 0);
			}
			
			// if we're not dropping the item we're mining...
			if (output != null)
			{
				// drop the block we want to drop
				world.setBlockToAir(pos);
				WorldHelper.dropItemInWorld(world, pos, output);
				// increment item damage by 5
				stack.setItemDamage(stack.getItemDamage() + 5);
			}
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return (
			(toRepair.getItem() == GCItems.amethyst_pickaxe && repair.getItem() == GCItems.amethyst) ||
			(toRepair.getItem() == GCItems.blackdiamond_pickaxe && repair.getItem() == GCItems.blackdiamond) ||
			(toRepair.getItem() == GCItems.emerald_pickaxe && repair.getItem() == Items.emerald) ||
			(toRepair.getItem() == GCItems.pyrite_pickaxe && repair.getItem() == GCItems.pyrite) ||
			(toRepair.getItem() == GCItems.ruby_pickaxe && repair.getItem() == GCItems.ruby) ||
			(toRepair.getItem() == GCItems.sapphire_pickaxe && repair.getItem() == GCItems.sapphire) || 
			(toRepair.getItem() == GCItems.topaz_pickaxe && repair.getItem() == GCItems.topaz) ||
			
			(toRepair.getItem() == GCItems.clinohumite_pickaxe && repair.getItem() == GCItems.clinohumite) ||
			(toRepair.getItem() == GCItems.goshenite_pickaxe && repair.getItem() == GCItems.goshenite) ||
			(toRepair.getItem() == GCItems.heliodor_pickaxe && repair.getItem() == GCItems.heliodor) ||
			(toRepair.getItem() == GCItems.morganite_pickaxe && repair.getItem() == GCItems.morganite) ||
			(toRepair.getItem() == GCItems.onyx_pickaxe && repair.getItem() == GCItems.onyx) ||
			(toRepair.getItem() == GCItems.turquoise_pickaxe && repair.getItem() == GCItems.turquoise)
			
		);
	}
}