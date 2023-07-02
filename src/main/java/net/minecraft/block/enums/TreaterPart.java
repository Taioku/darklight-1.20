package net.minecraft.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum TreaterPart implements StringIdentifiable
{
    BOTTOM("bottom"),
    MIDDLE("middle"),
    TOP("top");

    private final String name;

    private TreaterPart(String name) {
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