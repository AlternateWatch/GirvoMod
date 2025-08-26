package net.mcreator.girvomod.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class KradelBlock extends FallingBlock {
	public static final MapCodec<KradelBlock> CODEC = simpleCodec(KradelBlock::new);

	public MapCodec<KradelBlock> codec() {
		return CODEC;
	}

	public KradelBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(15f, 10f).requiresCorrectToolForDrops().pushReaction(PushReaction.BLOCK));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}