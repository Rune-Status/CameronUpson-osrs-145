package com.jagex;

public class Class95 {
    static int anInt1070;
    static int[][] anIntArrayArray1073 = new int[2][8];
    static float[][] aFloatArrayArray1074 = new float[2][8];
    static float aFloat1072;
    int[][][] anIntArrayArrayArray1068 = new int[2][2][4];
    int[][][] anIntArrayArrayArray1069 = new int[2][2][4];
    int[] anIntArray1071 = new int[2];
    int[] anIntArray1067 = new int[2];

    static float method625(float var0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
        return var1 * 3.1415927F / 11025.0F;
    }

    float method623(int var1, int var2, float var3) {
        float var4 = (float) this.anIntArrayArrayArray1069[var1][0][var2] + var3 * (float) (this.anIntArrayArrayArray1069[var1][1][var2] - this.anIntArrayArrayArray1069[var1][0][var2]);
        var4 *= 1.2207031E-4F;
        return method625(var4);
    }

    int method622(int var1, float var2) {
        float var3;
        if (var1 == 0) {
            var3 = (float) this.anIntArray1071[0] + (float) (this.anIntArray1071[1] - this.anIntArray1071[0]) * var2;
            var3 *= 0.0030517578F;
            aFloat1072 = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
            anInt1070 = (int) (aFloat1072 * 65536.0F);
        }

        if (this.anIntArray1067[var1] == 0) {
            return 0;
        }
        var3 = this.method621(var1, 0, var2);
        aFloatArrayArray1074[var1][0] = -2.0F * var3 * (float) Math.cos((double) this.method623(var1, 0, var2));
        aFloatArrayArray1074[var1][1] = var3 * var3;

        int var4;
        for (var4 = 1; var4 < this.anIntArray1067[var1]; ++var4) {
            var3 = this.method621(var1, var4, var2);
            float var5 = -2.0F * var3 * (float) Math.cos((double) this.method623(var1, var4, var2));
            float var6 = var3 * var3;
            aFloatArrayArray1074[var1][var4 * 2 + 1] = aFloatArrayArray1074[var1][var4 * 2 - 1] * var6;
            aFloatArrayArray1074[var1][var4 * 2] = aFloatArrayArray1074[var1][var4 * 2 - 1] * var5 + aFloatArrayArray1074[var1][var4 * 2 - 2] * var6;

            for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
                aFloatArrayArray1074[var1][var7] += aFloatArrayArray1074[var1][var7 - 1] * var5 + aFloatArrayArray1074[var1][var7 - 2] * var6;
            }

            aFloatArrayArray1074[var1][1] += aFloatArrayArray1074[var1][0] * var5 + var6;
            aFloatArrayArray1074[var1][0] += var5;
        }

        if (var1 == 0) {
            for (var4 = 0; var4 < this.anIntArray1067[0] * 2; ++var4) {
                aFloatArrayArray1074[0][var4] *= aFloat1072;
            }
        }

        for (var4 = 0; var4 < this.anIntArray1067[var1] * 2; ++var4) {
            anIntArrayArray1073[var1][var4] = (int) (aFloatArrayArray1074[var1][var4] * 65536.0F);
        }

        return this.anIntArray1067[var1] * 2;
    }

    float method621(int var1, int var2, float var3) {
        float var4 = (float) this.anIntArrayArrayArray1068[var1][0][var2] + var3 * (float) (this.anIntArrayArrayArray1068[var1][1][var2] - this.anIntArrayArrayArray1068[var1][0][var2]);
        var4 *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
    }

    final void method624(Buffer var1, AudioEnvelope var2) {
        int var3 = var1.readUnsignedByte();
        this.anIntArray1067[0] = var3 >> 4;
        this.anIntArray1067[1] = var3 & 15;
        if (var3 != 0) {
            this.anIntArray1071[0] = var1.readUnsignedShort();
            this.anIntArray1071[1] = var1.readUnsignedShort();
            int var4 = var1.readUnsignedByte();

            int var5;
            int var6;
            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.anIntArray1067[var5]; ++var6) {
                    this.anIntArrayArrayArray1069[var5][0][var6] = var1.readUnsignedShort();
                    this.anIntArrayArrayArray1068[var5][0][var6] = var1.readUnsignedShort();
                }
            }

            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.anIntArray1067[var5]; ++var6) {
                    if ((var4 & 1 << var5 * 4 << var6) != 0) {
                        this.anIntArrayArrayArray1069[var5][1][var6] = var1.readUnsignedShort();
                        this.anIntArrayArrayArray1068[var5][1][var6] = var1.readUnsignedShort();
                    } else {
                        this.anIntArrayArrayArray1069[var5][1][var6] = this.anIntArrayArrayArray1069[var5][0][var6];
                        this.anIntArrayArrayArray1068[var5][1][var6] = this.anIntArrayArrayArray1068[var5][0][var6];
                    }
                }
            }

            if (var4 != 0 || this.anIntArray1071[1] != this.anIntArray1071[0]) {
                var2.method510(var1);
            }
        } else {
            int[] var7 = this.anIntArray1071;
            this.anIntArray1071[1] = 0;
            var7[0] = 0;
        }

    }
}
