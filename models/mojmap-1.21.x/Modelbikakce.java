// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbikakce<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bikakce"), "main");
	private final ModelPart bone6;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone7;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart bone8;
	private final ModelPart bone;

	public Modelbikakce(ModelPart root) {
		this.bone6 = root.getChild("bone6");
		this.bone4 = this.bone6.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone3 = this.bone7.getChild("bone3");
		this.bone2 = this.bone7.getChild("bone2");
		this.bone8 = this.bone2.getChild("bone8");
		this.bone = this.bone7.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-6.0F, -5.0F, 0.0F));

		PartDefinition cube_r1 = bone6.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(42, 28).addBox(-4.0F, -8.0F, -8.0F, 6.0F, 8.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0059F, -0.0278F, 0.033F));

		PartDefinition bone4 = bone6.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, 17.0F, -4.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(78, 125).addBox(-4.0F, -16.0F, -4.0F, 5.0F, 16.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 16.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r3 = bone4.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 132)
						.addBox(-4.0F, -16.0F, -4.0F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(108, 117)
						.addBox(-4.0F, -14.0F, -10.0F, 5.0F, 24.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(132, 0)
						.addBox(-4.0F, -15.0F, -5.0F, 5.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 13.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r4 = bone5.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(128, 117).addBox(-4.0F, -16.0F, -4.0F, 5.0F, 16.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r5 = bone5.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(60, 124)
						.addBox(-4.0F, -14.0F, 0.0F, 5.0F, 24.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 132)
						.addBox(-4.0F, -15.0F, -1.0F, 5.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(130, 18)
						.addBox(-4.0F, -16.0F, -6.0F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0F, 13.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -38.0F, -7.0F, 13.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-9.0F, -39.0F, -8.0F, 5.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(-9.0F, -32.0F, 6.0F, 10.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(44, 76)
						.addBox(-9.0F, -32.0F, -19.0F, 11.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone7.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(86, 21).addBox(-9.0F, -8.0F, 2.0F, 11.0F, 8.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -35.0F, -18.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone7.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 76).addBox(-9.0F, -8.0F, 2.0F, 11.0F, 8.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.7F, 4.0F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone7.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(86, 40).addBox(-9.0F, -8.0F, 2.0F, 10.0F, 8.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -29.7F, 4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone3 = bone7.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -16.0F, 16.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(84, 96).addBox(-4.0F, -8.0F, -8.0F, 6.0F, 23.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 7.0F, 0.0F, 0.0F, 0.0F, -2.3126F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(40, 95).addBox(-4.0F, -6.0F, -3.0F, 6.0F, 33.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 9.0F, 2.0F, 0.0F, 0.0F, -2.3126F));

		PartDefinition cube_r11 = bone3
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(88, 59).addBox(-4.0F, -6.0F, -3.0F, 6.0F, 33.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 3.0F, 2.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(132, 73).addBox(-4.0F, -6.0F, -3.0F, 6.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 7.0F, 1.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(20, 132)
						.addBox(-4.0F, -6.0F, -3.0F, 6.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 95)
						.addBox(-4.0F, -8.0F, -9.0F, 6.0F, 23.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition bone2 = bone7.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -16.0F, -6.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(108, 88).addBox(-4.0F, -8.0F, -8.0F, 6.0F, 23.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 7.0F, 0.0F, 0.0F, 0.0F, -2.3126F));

		PartDefinition cube_r15 = bone2
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(108, 59).addBox(-4.0F, -8.0F, -8.0F, 6.0F, 23.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 95).addBox(-4.0F, -6.0F, -3.0F, 6.0F, 33.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, -10.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(20, 95).addBox(-4.0F, -6.0F, -3.0F, 6.0F, 33.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 10.0F, -10.0F, 3.1302F, -0.0431F, 0.8724F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(132, 54).addBox(-4.0F, -6.0F, -3.0F, 6.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 6.0F, -6.0F, 0.0F, 0.0F, -2.3126F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(34, 132).addBox(-4.0F, -6.0F, -3.0F, 6.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition bone8 = bone2.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(28.0F, -7.0F, -6.0F, -1.4701F, 0.5214F, 0.0503F));

		PartDefinition cube_r20 = bone8.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(100, 0).addBox(1.0F, -7.0F, 0.0F, 13.0F, 15.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -8.0F, 0.0F, 0.0F, 0.0F, -2.1817F));

		PartDefinition cube_r21 = bone8.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(54, 21).addBox(5.0F, -6.0F, 0.0F, 2.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -15.0F, 0.0F, 0.0F, 0.0F, -2.1817F));

		PartDefinition cube_r22 = bone8
				.addOrReplaceChild("cube_r22",
						CubeListBuilder.create().texOffs(0, 59).addBox(-7.0F, -6.0F, 0.0F, 18.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.1817F));

		PartDefinition bone = bone7.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(128, 40)
						.addBox(-7.0F, 0.0F, 2.9F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 52)
						.addBox(-7.0F, -8.0F, -2.1F, 6.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -14.0F, -5.9F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone3.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bone2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.bone5.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bone4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}