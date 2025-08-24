package net.mcreator.cointoroqualtas.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelchesteys extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("cointoro_qualtas", "modelchesteys"), "main");
	public final ModelPart bb_main;

	public Modelchesteys(ModelPart root) {
		super(root);
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(-8, -7).addBox(-2.0F, -12.0F, -5.0F, 4.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(-14, -13).addBox(-2.0F, -12.0F, -8.0F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(3, 1)
						.addBox(-3.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 1).addBox(-3.0F, -17.0F, -11.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 1)
						.addBox(-3.0F, -15.0F, 10.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, -1).addBox(-3.0F, -16.0F, -11.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
						.addBox(-3.0F, -15.0F, 9.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-1, -3).addBox(1.0F, -12.0F, -1.0F, 1.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -5.75F, -0.5F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-1, -3).addBox(1.0F, -12.0F, -5.0F, 1.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(3, 1).addBox(1.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -4.75F, -0.5F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(3, 1).addBox(1.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -10.75F, -0.5F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 1).addBox(1.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -10.0F, 0.0F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 1).addBox(1.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, -1.1345F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}