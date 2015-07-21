package net.crazysnailboy.mods.gemology.item;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.crazysnailboy.mods.gemology.init.GCItems;
import net.crazysnailboy.mods.gemology.util.WorldHelper;

public class ItemGemAxe extends ItemAxe
{
	
	public ItemGemAxe(Item.ToolMaterial material)
	{
		super(material);
	}
	
	
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		// if this is a black diamond axe...
		if ((!world.isRemote) && (stack.getItem() == GCItems.blackdiamond_axe))
		{
			ItemStack output = null;
			
			// why??
			if (stack.getItemDamage() < 2116)
			{
				Block block = world.getBlockState(pos).getBlock();

				// if we're chopping logs, drop charcoal
				if (block == Blocks.log || block == Blocks.log2)
					output = new ItemStack(Items.coal, 1, 1);
			}
			
			// if we're not dropping the item we're chopping...
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
				
			(toRepair.getItem() == GCItems.amethyst_axe && repair.getItem() == GCItems.amethyst) ||
			(toRepair.getItem() == GCItems.blackdiamond_axe && repair.getItem() == GCItems.blackdiamond) ||
			(toRepair.getItem() == GCItems.emerald_axe && repair.getItem() == Items.emerald) ||
			(toRepair.getItem() == GCItems.pyrite_axe && repair.getItem() == GCItems.pyrite) ||
			(toRepair.getItem() == GCItems.ruby_axe && repair.getItem() == GCItems.ruby) ||
			(toRepair.getItem() == GCItems.sapphire_axe && repair.getItem() == GCItems.sapphire) || 
			(toRepair.getItem() == GCItems.topaz_axe && repair.getItem() == GCItems.topaz) ||
			
			(toRepair.getItem() == GCItems.clinohumite_axe && repair.getItem() == GCItems.clinohumite) ||
			(toRepair.getItem() == GCItems.goshenite_axe && repair.getItem() == GCItems.goshenite) ||
			(toRepair.getItem() == GCItems.heliodor_axe && repair.getItem() == GCItems.heliodor) ||
			(toRepair.getItem() == GCItems.morganite_axe && repair.getItem() == GCItems.morganite) ||
			(toRepair.getItem() == GCItems.onyx_axe && repair.getItem() == GCItems.onyx) ||
			(toRepair.getItem() == GCItems.turquoise_axe && repair.getItem() == GCItems.turquoise)
			
		);
	}
}