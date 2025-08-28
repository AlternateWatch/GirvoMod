package net.mcreator.girvomod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class KiriteSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1561, 6f, 0, 1, TagKey.create(Registries.ITEM, ResourceLocation.parse("girvo_mod:kirite_sword_repair_items")));

	public KiriteSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5f, -2f, properties);
	}
}