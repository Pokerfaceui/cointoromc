/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.cointoroqualtas.block.AstralplanesPortalBlock;
import net.mcreator.cointoroqualtas.block.AstraloreBlock;
import net.mcreator.cointoroqualtas.block.AstralinfectionBlock;
import net.mcreator.cointoroqualtas.CointoroQualtasMod;

import java.util.function.Function;

public class CointoroQualtasModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CointoroQualtasMod.MODID);
	public static final DeferredBlock<Block> ASTRALINFECTION = register("astralinfection", AstralinfectionBlock::new);
	public static final DeferredBlock<Block> ASTRALPLANES_PORTAL = register("astralplanes_portal", AstralplanesPortalBlock::new);
	public static final DeferredBlock<Block> ASTRALORE = register("astralore", AstraloreBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}