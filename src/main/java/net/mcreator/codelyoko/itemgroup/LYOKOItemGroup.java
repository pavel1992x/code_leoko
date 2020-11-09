
package net.mcreator.codelyoko.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.codelyoko.item.TowercItem;
import net.mcreator.codelyoko.CodeLyokoModElements;

@CodeLyokoModElements.ModElement.Tag
public class LYOKOItemGroup extends CodeLyokoModElements.ModElement {
	public LYOKOItemGroup(CodeLyokoModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablyoko") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TowercItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
