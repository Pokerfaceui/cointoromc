package net.mcreator.cointoroqualtas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.definitions.CreakingAnimation;

import net.mcreator.cointoroqualtas.entity.AtlasEntity;
import net.mcreator.cointoroqualtas.client.model.Modelbikakce;

public class AtlasRenderer extends MobRenderer<AtlasEntity, LivingEntityRenderState, Modelbikakce> {
	private AtlasEntity entity = null;

	public AtlasRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbikakce.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AtlasEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("cointoro_qualtas:textures/entities/texture.png");
	}

	private static final class AnimatedModel extends Modelbikakce {
		private AtlasEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(AtlasEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, CreakingAnimation.CREAKING_WALK, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}