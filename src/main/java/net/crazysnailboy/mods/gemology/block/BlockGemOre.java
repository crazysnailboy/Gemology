package net.crazysnailboy.mods.gemology.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class BlockGemOre extends BlockOre
{
	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockGem.EnumType.class);

	public BlockGemOre()
	{
		super();
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockGem.EnumType.AMETHYST));
	}
	
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
	{
		for (BlockGem.EnumType variant : BlockGem.EnumType.values()) {
			list.add(new ItemStack(itemIn, 1, variant.getMetadata()));
		}
	}

	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, BlockGem.EnumType.byMetadata(meta));
	}

	public int getMetaFromState(IBlockState state)
	{
		return ((BlockGem.EnumType)state.getValue(VARIANT)).getMetadata();
	}
	
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] { VARIANT });
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		switch (((BlockGem.EnumType)state.getValue(VARIANT)))
		{
			case AMETHYST: return GCItems.amethyst;
			case BLACKDIAMOND: return GCItems.blackdiamond;
			case CLINOHUMITE: return GCItems.clinohumite;
			case GOSHENITE: return GCItems.goshenite;
			case HELIODOR: return GCItems.heliodor;
			case MORGANITE: return GCItems.morganite;
			case ONYX: return GCItems.onyx;
			case PYRITE: return GCItems.pyrite;
			case RUBY: return GCItems.ruby;
			case SAPPHIRE: return GCItems.sapphire;
			case TOPAZ: return GCItems.topaz;
			case TURQUOISE: return GCItems.turquoise;
			
			default: return super.getItemDropped(state, rand, fortune); // should never get here
		}
	}

	@Override
    public int damageDropped(IBlockState state)
    {
        return 0;
//		return this.getMetaFromState(state);
    }
	
	
	@Override
	public int quantityDropped(Random random)
	{
		return 1;
	}
	
	@Override
	public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		return MathHelper.getRandomIntegerInRange(rand, 2, 5); // same as lapis and quartz
	}

}
