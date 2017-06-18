package com.jagex;

import java.util.Comparator;

final class Class62 implements Comparator {
    static Node_Sub28 aNode_Sub28_635;
    static int anInt636;

    public static boolean method378(int var0) {
        return (var0 >> 31 & 1) != 0;
    }

    public static void method377(String[] var0, short[] var1, int var2, int var3) {
        if (var2 < var3) {
            int var4 = (var2 + var3) / 2;
            int var5 = var2;
            String var6 = var0[var4];
            var0[var4] = var0[var3];
            var0[var3] = var6;
            short var7 = var1[var4];
            var1[var4] = var1[var3];
            var1[var3] = var7;

            for (int var8 = var2; var8 < var3; ++var8) {
                if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
                    String var9 = var0[var8];
                    var0[var8] = var0[var5];
                    var0[var5] = var9;
                    short var10 = var1[var8];
                    var1[var8] = var1[var5];
                    var1[var5++] = var10;
                }
            }

            var0[var3] = var0[var5];
            var0[var5] = var6;
            var1[var3] = var1[var5];
            var1[var5] = var7;
            method377(var0, var1, var2, var5 - 1);
            method377(var0, var1, var5 + 1, var3);
        }

    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    int method376(Class53 var1, Class53 var2) {
        return var1.aLong412 < var2.aLong412 ? -1 : (var2.aLong412 == var1.aLong412 ? 0 : 1);
    }

    public int compare(Object var1, Object var2) {
        return this.method376((Class53) var1, (Class53) var2);
    }
}
