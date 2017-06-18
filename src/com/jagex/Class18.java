package com.jagex;

public class Class18 {
    static InterfaceComponent anInterfaceComponent129;
    static int[] anIntArray133;
    int anInt128;
    int[][] anIntArrayArray131;
    int[][] anIntArrayArray130;
    int[][] anIntArrayArray132;
    int[][] anIntArrayArray134;
    int anInt135;

    Class18(int var1, int var2) {
        this.anInt128 = var1;
        this.anInt135 = var2;
        this.anIntArrayArray131 = new int[var1][var2];
        this.anIntArrayArray130 = new int[var1][var2];
        this.anIntArrayArray132 = new int[var1][var2];
        this.anIntArrayArray134 = new int[var1][var2];
    }

    static void method139(int var0, int var1, int var2, int var3, Sprite var4, Node_Sub21_Sub5 var5) {
        int var6 = var2 * var2 + var3 * var3;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = Client.mapScale + Client.mapRotation & 2047;
            int var8 = Node_Sub21_Sub26_Sub1.SINE[var7];
            int var9 = Node_Sub21_Sub26_Sub1.COS[var7];
            var8 = var8 * 256 / (Client.mapOffset + 256);
            var9 = var9 * 256 / (Client.mapOffset + 256);
            int var10 = var8 * var3 + var9 * var2 >> 16;
            int var11 = var9 * var3 - var8 * var2 >> 16;
            double var12 = Math.atan2((double) var10, (double) var11);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (Math.cos(var12) * 57.0D);
            Class75.aSprite805.method1246(var14 + var0 + 94 + 4 - 10, var1 + 83 - var15 - 20, 20, 20, 15, 15, var12, 256);
        } else {
            Node_Sub7.method334(var0, var1, var2, var3, var4, var5);
        }

    }

    static int method137(int var0, int var1) {
        ItemTable var2 = ItemTable.itemTables.lookup((long) var0);
        if (var2 == null) {
            return 0;
        }
        if (var1 == -1) {
            return 0;
        }
        int var3 = 0;

        for (int var4 = 0; var4 < var2.stackSizes.length; ++var4) {
            if (var2.ids[var4] == var1) {
                var3 += var2.stackSizes[var4];
            }
        }

        return var3;
    }

    static CompressedImage[] method138(ReferenceTable var0, int var1, int var2) {
        if (!Class64.method381(var0, var1, var2)) {
            return null;
        }
        CompressedImage[] var3 = new CompressedImage[Class191.anInt2244];

        for (int var4 = 0; var4 < Class191.anInt2244; ++var4) {
            CompressedImage var5 = var3[var4] = new CompressedImage();
            var5.anInt221 = Class160.anInt1857;
            var5.anInt220 = Class191.anInt2246;
            var5.anInt327 = Class191.anIntArray2245[var4];
            var5.anInt328 = Class191.anIntArray2248[var4];
            var5.anInt206 = Class191.anIntArray2249[var4];
            var5.anInt232 = Class109.anIntArray1305[var4];
            var5.anIntArray342 = Class94.anIntArray1043;
            var5.aByteArray1361 = Class191.aByteArrayArray2247[var4];
        }

        Class191.anIntArray2245 = null;
        Class191.anIntArray2248 = null;
        Class191.anIntArray2249 = null;
        Class109.anIntArray1305 = null;
        Class94.anIntArray1043 = null;
        Class191.aByteArrayArray2247 = null;
        return var3;
    }

    void method136(int var1, int var2, int var3, Node_Sub21_Sub24 var4) {
        if (var4 != null) {
            if (var3 + var1 >= 0 && var3 + var2 >= 0) {
                if (var1 - var3 <= this.anInt128 && var2 - var3 <= this.anInt135) {
                    int var5 = Math.max(0, var1 - var3);
                    int var6 = Math.min(this.anInt128, var1 + var3);
                    int var7 = Math.max(0, var2 - var3);
                    int var8 = Math.min(this.anInt135, var2 + var3);

                    for (int var9 = var5; var9 < var6; ++var9) {
                        for (int var10 = var7; var10 < var8; ++var10) {
                            this.anIntArrayArray131[var9][var10] += var4.anInt232 * 256 / var4.anInt221;
                            this.anIntArrayArray130[var9][var10] += var4.anInt327;
                            this.anIntArrayArray132[var9][var10] += var4.anInt328;
                            ++this.anIntArrayArray134[var9][var10];
                        }
                    }

                }
            }
        }
    }

    int method140(int var1, int var2) {
        if (var1 >= 0 && var2 >= 0 && var1 < this.anInt128 && var2 < this.anInt135) {
            if (this.anIntArrayArray132[var1][var2] == 0) {
                return 0;
            }
            int var3 = this.anIntArrayArray131[var1][var2] / this.anIntArrayArray134[var1][var2];
            int var4 = this.anIntArrayArray130[var1][var2] / this.anIntArrayArray134[var1][var2];
            int var5 = this.anIntArrayArray132[var1][var2] / this.anIntArrayArray134[var1][var2];
            return DynamicObject.method294((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
        return 0;
    }
}
