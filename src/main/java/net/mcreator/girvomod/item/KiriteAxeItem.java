package net.mcreator.girvomod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class KiriteAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1561, 6f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("girvo_mod:kirite_axe_repair_items")));

	public KiriteAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 11f, -3f, properties);
	}
}