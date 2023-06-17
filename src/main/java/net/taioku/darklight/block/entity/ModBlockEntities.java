package net.taioku.darklight.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<AnimatedBlockEntity> MORTAR;

    public static void registerAllBlockEntities() {
        MORTAR = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Darklight.MOD_ID, "animated_block_entity"),
                FabricBlockEntityTypeBuilder.create(AnimatedBlockEntity::new,
                        ModBlocks.MORTAR).build());
    }
}
