package net.taioku.darklight.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<MortarEntity> MORTAR;
    public static BlockEntityType<ResearchTableEntity> RESEARCH_TABLE;

    public static void registerAllBlockEntities() {
        MORTAR = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "mortar_entity"),
                FabricBlockEntityTypeBuilder.create(MortarEntity::new,
                        ModBlocks.MORTAR).build());
        RESEARCH_TABLE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "research_table_entity"),
                FabricBlockEntityTypeBuilder.create(ResearchTableEntity::new,
                        ModBlocks.RESEARCH_TABLE).build());
    }
}
