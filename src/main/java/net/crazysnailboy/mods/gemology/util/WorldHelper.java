package net.crazysnailboy.mods.gemology.util;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class WorldHelper 
{
	public static void dropItemInWorld(World worldIn, BlockPos pos, ItemStack stack)
	{
		float f = 0.7F;
		double d0 = (double)(worldIn.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
		double d1 = (double)(worldIn.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
		double d2 = (double)(worldIn.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
		EntityItem entityitem = new EntityItem(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
		entityitem.setDefaultPickupDelay();
		worldIn.spawnEntityInWorld(entityitem);
	}
	
}
