package com.jagex;

public final class Font extends Node_Sub21_Sub26_Sub3 {
    public Font(byte[] var1) {
        super(var1);
    }

    public Font(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    final void method1150(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var2 + var3 * areaWidth;
        int var8 = areaWidth - var4;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var3 < areaTop) {
            var11 = areaTop - var3;
            var5 -= var11;
            var3 = areaTop;
            var10 += var11 * var4;
            var7 += var11 * areaWidth;
        }

        if (var3 + var5 > areaBottom) {
            var5 -= var3 + var5 - areaBottom;
        }

        if (var2 < areaLeft) {
            var11 = areaLeft - var2;
            var4 -= var11;
            var2 = areaLeft;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var2 + var4 > areaRight) {
            var11 = var2 + var4 - areaRight;
            var4 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var4 > 0 && var5 > 0) {
            method1175(buffer, var1, var6, var10, var7, var4, var5, var8, var9);
        }
    }

    final void method1151(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var2 + var3 * areaWidth;
        int var9 = areaWidth - var4;
        int var10 = 0;
        int var11 = 0;
        int var12;
        if (var3 < areaTop) {
            var12 = areaTop - var3;
            var5 -= var12;
            var3 = areaTop;
            var11 += var12 * var4;
            var8 += var12 * areaWidth;
        }

        if (var3 + var5 > areaBottom) {
            var5 -= var3 + var5 - areaBottom;
        }

        if (var2 < areaLeft) {
            var12 = areaLeft - var2;
            var4 -= var12;
            var2 = areaLeft;
            var11 += var12;
            var8 += var12;
            var10 += var12;
            var9 += var12;
        }

        if (var2 + var4 > areaRight) {
            var12 = var2 + var4 - areaRight;
            var4 -= var12;
            var10 += var12;
            var9 += var12;
        }

        if (var4 > 0 && var5 > 0) {
            method1162(buffer, var1, var6, var11, var8, var4, var5, var9, var10, var7);
        }
    }
}
