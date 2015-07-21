package net.crazysnailboy.mods.gemology.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.crazysnailboy.mods.gemology.init.GCItems;
import net.crazysnailboy.mods.gemology.util.WorldHelper;

public class BlockGem extends Block
{
	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

	public BlockGem()
	{
		super(Material.iron);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.AMETHYST));
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return this.getMetaFromState(state);
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
	{
		for (EnumType variant : EnumType.values()) {
			list.add(new ItemStack(itemIn, 1, variant.getMetadata()));
		}
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, EnumType.byMetadata(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((EnumType)state.getValue(VARIANT)).getMetadata();
	}
	
	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] { VARIANT });
	}

	
	@Override
	public MapColor getMapColor(IBlockState state)
	{
		switch (((BlockGem.EnumType)state.getValue(VARIANT)))
		{
			case AMETHYST: return MapColor.purpleColor;
			case BLACKDIAMOND: return MapColor.blackColor;
			case PYRITE: return MapColor.silverColor;
			case RUBY: return MapColor.redColor;
			case SAPPHIRE: return MapColor.blueColor;
			case TOPAZ: return MapColor.adobeColor;
			
			default: return null; // should never get here
		}
	}
	
	
	
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side)
	{
		if ((EnumType)world.getBlockState(pos).getValue(VARIANT) == EnumType.BLACKDIAMOND && side == EnumFacing.UP)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		// if the block is a black diamond block...
		if ((EnumType)worldIn.getBlockState(pos).getValue(VARIANT) == EnumType.BLACKDIAMOND)
		{
			// ...and the block above it is a fire block...
			if (worldIn.getBlockState(pos.up()).getBlock() == Blocks.fire)
			{
				// ...and the player is holding an item...
				if (playerIn.getCurrentEquippedItem() != null)
				{
					// ...and that item(stack) is at least two diamonds...
					if (playerIn.getCurrentEquippedItem().getItem() == Items.diamond && playerIn.getCurrentEquippedItem().stackSize > 1)
					{
						// remove 2 diamonds from the player's inventory slot
						playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, new ItemStack(playerIn.getCurrentEquippedItem().getItem(), playerIn.getCurrentEquippedItem().stackSize - 2, 0));
						// put out the fire
						worldIn.setBlockToAir(pos.up());
						// drop one black diamond
						WorldHelper.dropItemInWorld(worldIn, pos, new ItemStack(GCItems.blackdiamond, 1));
						// cause the player 8 hearts of damage
						playerIn.attackEntityFrom(DamageSource.onFire, 16);
						return true;
					}

					// ...and that item(stack) is at least two gold ingots...
					if (playerIn.getCurrentEquippedItem().getItem() == Items.gold_ingot && playerIn.getCurrentEquippedItem().stackSize > 1)
					{
						// remove 2 gold ingots from the player's inventory slot
						playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, new ItemStack(playerIn.getCurrentEquippedItem().getItem(), playerIn.getCurrentEquippedItem().stackSize - 2, 0));
						// put out the fire
						worldIn.setBlockToAir(pos.up());
						// drop one diamond
						WorldHelper.dropItemInWorld(worldIn, pos, new ItemStack(Items.diamond, 1));
						// cause the player 6 hearts of damage
						playerIn.attackEntityFrom(DamageSource.onFire, 12);
						return true;
					}
				}
			}

		}
		return false;
	}
	
	
	
	public static enum EnumType implements IStringSerializable
	{
		AMETHYST(0, "amethyst"),
		BLACKDIAMOND(1, "blackdiamond"),
		CLINOHUMITE(2, "clinohumite"),
		GOSHENITE(3, "goshenite"),
		HELIODOR(4, "heliodor"),
		MORGANITE(5, "morganite"),
		ONYX(6, "onyx"),
		PYRITE(7, "pyrite"),
		RUBY(8, "ruby"),
		SAPPHIRE(9, "sapphire"),
		TOPAZ(10, "topaz"),
		TURQUOISE(11, "turquoise");
		

		public int getMetadata()
		{
			return this.meta;
		}

		@Override
		public String toString()
		{
			return this.name;
		}

		public static EnumType byMetadata(int meta)
		{
			if (meta < 0 || meta >= META_LOOKUP.length)
			{
				meta = 0;
			}

			return META_LOOKUP[meta];
		}

		public String getName()
		{
			return this.name;
		}

		private final int meta;
		private final String name;
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];

		private EnumType(int i_meta, String i_name)
		{
			this.meta = i_meta;
			this.name = i_name;
		}

		static
		{
			for (EnumType variant : values()) { META_LOOKUP[variant.getMetadata()] = variant; }
		}
	}

}
