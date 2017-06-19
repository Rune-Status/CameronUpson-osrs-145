package com.jagex;

public interface EnumOrdinal {
    static EnumOrdinal getByOrdinal(EnumOrdinal[] var0, int var1) {

        for (int var3 = 0; var3 < var0.length; ++var3) {
            EnumOrdinal var4 = var0[var3];
            if (var1 == var4.ordinal()) {
                return var4;
            }
        }

        return null;
    }

    int ordinal();
}
