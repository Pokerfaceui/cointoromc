package net.mcreator.cointoroqualtas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cointoroqualtas.entity.SentinelEntity;
import net.mcreator.cointoroqualtas.client.model.Modelsentinel;

public class SentinelRenderer extends MobRenderer<SentinelEntity, LivingEntityRenderState, Modelsentinel> {
	private SentinelEntity entity = null;

	public SentinelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsentinel(context.bakeLayer(Modelsentinel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SentinelEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("cointoro_qualtas:textures/entities/download_1.png");
	}
}