package net.mcreator.cointoroqualtas.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.cointoroqualtas.init.CointoroQualtasModItems;
import net.mcreator.cointoroqualtas.init.CointoroQualtasModFluids;
import net.mcreator.cointoroqualtas.init.CointoroQualtasModFluidTypes;
import net.mcreator.cointoroqualtas.init.CointoroQualtasModBlocks;

public abstract class AstralinfectionFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CointoroQualtasModFluidTypes.ASTRALINFECTION_TYPE.get(), () -> CointoroQualtasModFluids.ASTRALINFECTION.get(),
			() -> CointoroQualtasModFluids.FLOWING_ASTRALINFECTION.get()).explosionResistance(100f).tickRate(19).bucket(() -> CointoroQualtasModItems.ASTRALINFECTION_BUCKET.get())
			.block(() -> (LiquidBlock) CointoroQualtasModBlocks.ASTRALINFECTION.get());

	private AstralinfectionFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_DRIPSTONE_LAVA;
	}

	public static class Source extends AstralinfectionFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AstralinfectionFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}