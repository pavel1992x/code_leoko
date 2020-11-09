
package net.mcreator.codelyoko.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.codelyoko.itemgroup.LYOKOItemGroup;
import net.mcreator.codelyoko.CodeLyokoModElements;

import java.util.List;
import java.util.Collections;

@CodeLyokoModElements.ModElement.Tag
public class CoreBlock extends CodeLyokoModElements.ModElement {
	@ObjectHolder("code_lyoko:core")
	public static final Block block = null;
	public CoreBlock(CodeLyokoModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(LYOKOItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).lightValue(8));
			setRegistryName("core");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
