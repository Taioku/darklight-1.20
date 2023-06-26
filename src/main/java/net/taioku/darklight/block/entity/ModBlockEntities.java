package net.taioku.darklight.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.entity.entities.JarEntity;
import net.taioku.darklight.block.entity.entities.MortarEntity;
import net.taioku.darklight.block.entity.entities.PillarEntity;
import net.taioku.darklight.block.entity.entities.ResearchTableEntity;

public class ModBlockEntities {
    public static BlockEntityType<MortarEntity> MORTAR_ENTITY;
    public static BlockEntityType<ResearchTableEntity> RESEARCH_TABLE_ENTITY;
    public static BlockEntityType<PillarEntity> PILLAR_ENTITY;
    public static BlockEntityType<JarEntity> JAR_ENTITY;

    public static void registerAllBlockEntities() {
        MORTAR_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "mortar_entity"),
                FabricBlockEntityTypeBuilder.create(MortarEntity::new,
                        ModBlocks.MORTAR).build());

        RESEARCH_TABLE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "research_table_entity"),
                FabricBlockEntityTypeBuilder.create(ResearchTableEntity::new,
                        ModBlocks.RESEARCH_TABLE).build());

        PILLAR_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "pillar_entity"),
                FabricBlockEntityTypeBuilder.create(PillarEntity::new,
                        ModBlocks.PILLAR).build());

        JAR_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "jar_entity"),
                FabricBlockEntityTypeBuilder.create(JarEntity::new,
                        ModBlocks.JAR).build());
    }
}
