/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.cointoroqualtas.fluid.types.AstralinfectionFluidType;
import net.mcreator.cointoroqualtas.CointoroQualtasMod;

public class CointoroQualtasModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CointoroQualtasMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ASTRALINFECTION_TYPE = REGISTRY.register("astralinfection", () -> new AstralinfectionFluidType());
}