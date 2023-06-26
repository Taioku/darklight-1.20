package net.taioku.util;

import net.minecraft.nbt.NbtCompound;

public class TestData {
    public static int addTest(IEntityDataSaver player, int amm) {
        NbtCompound nbt = player.getPersistentData();
        int test = nbt.getInt("test");
        if (test + amm >= 10) {
            test = 10;
        } else {
            test += amm;
        }
        nbt.putInt("test", test);

        return test;
    }
    public static int removeTest(IEntityDataSaver player, int amm) {
        NbtCompound nbt = player.getPersistentData();
        int test = nbt.getInt("test");
        if (test - amm < 0) {
            test = 0;
        } else {
            test -= amm;
        }
        nbt.putInt("test", test);

        return test;
    }
}
