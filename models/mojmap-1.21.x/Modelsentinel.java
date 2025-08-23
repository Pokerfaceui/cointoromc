// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsentinel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sentinel"), "main");
	private final ModelPart bone4;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart bone;

	public Modelsentinel(ModelPart root) {
		this.bone4 = root.getChild("bone4");
		this.bone3 = root.getChild("bone3");
		this.bone2 = root.getChild("bone2");
		this.bone6 = root.getChild("bone6");
		this.bone5 = root.getChild("bone5");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(3.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = bone4.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 12.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 22.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(3.0F, 2.0F, 0.0F));

		PartDefinition cube_r2 = bone3
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 12.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(3.0F, 2.0F, 0.0F));

		PartDefinition cube_r3 = bone2
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 16.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 4.0F, -1.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(3.0F, 2.0F, 0.0F));

		PartDefinition cube_r4 = bone6
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(-10, -3).addBox(-8.0F, -12.0F, -3.0F, 9.0F, 12.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(3.0F, 2.0F, 0.0F));

		PartDefinition cube_r5 = bone5
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(-14, -7).addBox(-8.0F, -9.0F, -5.0F, 9.0F, 9.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(3.0F, 2.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 16.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 4.0F, -1.0F, -3.0543F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bone2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bone4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bone.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}