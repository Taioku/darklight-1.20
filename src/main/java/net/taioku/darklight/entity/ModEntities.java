package net.taioku.darklight.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.entity.custom.LightbugEntity;

public class ModEntities {
    public static final EntityType<LightbugEntity> LIGHTBUG = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Darklight.MOD_ID, "lightbug"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, LightbugEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static void setAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.LIGHTBUG, LightbugEntity.setAttributes());
    }
}
