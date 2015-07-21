package net.crazysnailboy.mods.gemology.item;

import net.crazysnailboy.mods.gemology.common.config.GCConfiguration;
import net.crazysnailboy.mods.gemology.init.GCItems;
import net.crazysnailboy.mods.gemology.util.WorldHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemGemSpade extends ItemSpade
{
	
	public ItemGemSpade(Item.ToolMaterial material)
	{
		super(material);
	}


	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		// if this is a black diamond spade...
		if ((!world.isRemote) && (stack.getItem() == GCItems.blackdiamond_shovel))
		{
			ItemStack output = null;
			
			// why??
			if (stack.getItemDamage() < 2116)
			{
				Block block = world.getBlockState(pos).getBlock();
				
				// if we're digging sand, drop glass
				if (block == Blocks.sand)
					output = new ItemStack(Blocks.glass, 1, 0);
				// if we're digging clay, drop bricks
				else if (block == Blocks.clay)
					output = new ItemStack(Items.brick, 4, 0);
			}

			// if we're not dropping the item we're digging...
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
			(toRepair.getItem() == GCItems.amethyst_shovel && repair.getItem() == GCItems.amethyst) ||
			(toRepair.getItem() == GCItems.blackdiamond_shovel && repair.getItem() == GCItems.blackdiamond) ||
			(toRepair.getItem() == GCItems.emerald_shovel && repair.getItem() == Items.emerald) ||
			(toRepair.getItem() == GCItems.pyrite_shovel && repair.getItem() == GCItems.pyrite) ||
			(toRepair.getItem() == GCItems.ruby_shovel && repair.getItem() == GCItems.ruby) ||
			(toRepair.getItem() == GCItems.sapphire_shovel && repair.getItem() == GCItems.sapphire) || 
			(toRepair.getItem() == GCItems.topaz_shovel && repair.getItem() == GCItems.topaz) ||
			
			(toRepair.getItem() == GCItems.clinohumite_shovel && repair.getItem() == GCItems.clinohumite) ||
			(toRepair.getItem() == GCItems.goshenite_shovel && repair.getItem() == GCItems.goshenite) ||
			(toRepair.getItem() == GCItems.heliodor_shovel && repair.getItem() == GCItems.heliodor) ||
			(toRepair.getItem() == GCItems.morganite_shovel && repair.getItem() == GCItems.morganite) ||
			(toRepair.getItem() == GCItems.onyx_shovel && repair.getItem() == GCItems.onyx) ||
			(toRepair.getItem() == GCItems.turquoise_shovel && repair.getItem() == GCItems.turquoise)
			
		);
	}
}