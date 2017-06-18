package com.jagex;

import java.util.Comparator;

final class Class65 implements Comparator {
    static Class155 aClass155_662;
    static InterfaceComponent anInterfaceComponent663;

    public static int method388(CharSequence var0, int var1, boolean var2) {
        if (var1 >= 2 && var1 <= 36) {
            boolean var3 = false;
            boolean var4 = false;
            int var5 = 0;
            int var6 = var0.length();

            for (int var7 = 0; var7 < var6; ++var7) {
                char var8 = var0.charAt(var7);
                if (var7 == 0) {
                    if (var8 == '-') {
                        var3 = true;
                        continue;
                    }

                    if (var8 == '+') {
                        continue;
                    }
                }

                int var10;
                if (var8 >= '0' && var8 <= '9') {
                    var10 = var8 - 48;
                } else if (var8 >= 'A' && var8 <= 'Z') {
                    var10 = var8 - 55;
                } else {
                    if (var8 < 'a' || var8 > 'z') {
                        throw new NumberFormatException();
                    }

                    var10 = var8 - 87;
                }

                if (var10 >= var1) {
                    throw new NumberFormatException();
                }

                if (var3) {
                    var10 = -var10;
                }

                int var9 = var10 + var1 * var5;
                if (var5 != var9 / var1) {
                    throw new NumberFormatException();
                }

                var5 = var9;
                var4 = true;
            }

            if (!var4) {
                throw new NumberFormatException();
            } else {
                return var5;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    static int method389(int var0, int var1, int var2) {
        if ((Class26.aByteArrayArrayArray189[var0][var1][var2] & 8) != 0) {
            return 0;
        } else {
            return var0 > 0 && (Class26.aByteArrayArrayArray189[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
        }
    }

    public static Font loadFont(byte[] var0) {
        if (var0 == null) {
            return null;
        } else {
            Font var1 = new Font(var0, Class191.anIntArray2245, Class191.anIntArray2248, Class191.anIntArray2249, Class109.anIntArray1305, Class94.anIntArray1043, Class191.aByteArrayArray2247);
            Class191.anIntArray2245 = null;
            Class191.anIntArray2248 = null;
            Class191.anIntArray2249 = null;
            Class109.anIntArray1305 = null;
            Class94.anIntArray1043 = null;
            Class191.aByteArrayArray2247 = null;
            return var1;
        }
    }

    int method386(Class53 var1, Class53 var2) {
        return var1.anInt406 < var2.anInt406 ? -1 : (var1.anInt406 == var2.anInt406 ? 0 : 1);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method386((Class53) var1, (Class53) var2);
    }
}
