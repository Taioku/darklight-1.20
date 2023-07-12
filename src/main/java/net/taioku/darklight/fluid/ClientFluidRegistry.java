package net.taioku.darklight.fluid;

import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;

public class ClientFluidRegistry {
    public static void registerFluids() {
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1D3C7FF
                ));
    }
}
