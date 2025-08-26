package net.mcreator.girvomod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SupernovaOreBlock extends Block {
	public SupernovaOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(6f, 8.705505633f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.HARP));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}