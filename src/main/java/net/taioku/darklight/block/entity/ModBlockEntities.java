package net.taioku.darklight.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.entity.tile.*;

public class ModBlockEntities {
    public static BlockEntityType<MortarBlockEntity> MORTAR_ENTITY;
    public static BlockEntityType<ResearchTableBlockEntity> RESEARCH_TABLE_ENTITY;
    public static BlockEntityType<PillarBlockEntity> PILLAR_ENTITY;
    public static BlockEntityType<JarBlockEntity> JAR_ENTITY;
    public static BlockEntityType<HTransmutationArmBlockEntity> H_TRANSMUTATION_ARM_ENTITY;
    public static BlockEntityType<DTransmutationArmBlockEntity> D_TRANSMUTATION_ARM_ENTITY;
    public static BlockEntityType<ReinforcedCraftingTableBlockEntity> REINFORCED_CRAFTING_TABLE;

    public static void registerAllBlockEntities() {
        MORTAR_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "mortar_entity"),
                FabricBlockEntityTypeBuilder.create(MortarBlockEntity::new,
                        ModBlocks.MORTAR).build());

        RESEARCH_TABLE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "research_table_entity"),
                FabricBlockEntityTypeBuilder.create(ResearchTableBlockEntity::new,
                        ModBlocks.RESEARCH_TABLE).build());

        PILLAR_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "pillar_entity"),
                FabricBlockEntityTypeBuilder.create(PillarBlockEntity::new,
                        ModBlocks.PILLAR).build());

        JAR_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "jar_entity"),
                FabricBlockEntityTypeBuilder.create(JarBlockEntity::new,
                        ModBlocks.JAR).build());

        H_TRANSMUTATION_ARM_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "h_transmutation_arm_entity"),
                FabricBlockEntityTypeBuilder.create(HTransmutationArmBlockEntity::new,
                        ModBlocks.H_TRANSMUTATION_ARM).build());

        D_TRANSMUTATION_ARM_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "d_transmutation_arm_entity"),
                FabricBlockEntityTypeBuilder.create(DTransmutationArmBlockEntity::new,
                        ModBlocks.D_TRANSMUTATION_ARM).build());

        REINFORCED_CRAFTING_TABLE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "reinforced_crafting_table"),
                FabricBlockEntityTypeBuilder.create(ReinforcedCraftingTableBlockEntity::new,
                        ModBlocks.REINFORCED_CRAFTING_TABLE).build());
    }
}
