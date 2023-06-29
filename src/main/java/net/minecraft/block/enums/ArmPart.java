package net.minecraft.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum ArmPart implements StringIdentifiable
{
    BOTTOM("bottom"),
    TOP("top");

    private final String name;

    private ArmPart(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}

