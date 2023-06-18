package net.minecraft.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum TablePart implements StringIdentifiable
{
    LEFT("left"),
    RIGHT("right");

    private final String name;

    private TablePart(String name) {
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

