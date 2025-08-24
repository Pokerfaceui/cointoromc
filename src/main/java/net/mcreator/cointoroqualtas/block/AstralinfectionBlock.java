package net.mcreator.cointoroqualtas.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.cointoroqualtas.init.CointoroQualtasModFluids;

public class AstralinfectionBlock extends LiquidBlock {
	public AstralinfectionBlock(BlockBehaviour.Properties properties) {
		super(CointoroQualtasModFluids.ASTRALINFECTION.get(), properties.mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}