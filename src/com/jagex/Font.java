package com.jagex;

public final class Font extends Node_Sub21_Sub26_Sub3 {
    public Font(byte[] var1) {
        super(var1);
    }

    public Font(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    final void method1150(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var2 + var3 * anInt749;
        int var8 = anInt749 - var4;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var3 < anInt1257) {
            var11 = anInt1257 - var3;
            var5 -= var11;
            var3 = anInt1257;
            var10 += var11 * var4;
            var7 += var11 * anInt749;
        }

        if (var3 + var5 > anInt753) {
            var5 -= var3 + var5 - anInt753;
        }

        if (var2 < anInt754) {
            var11 = anInt754 - var2;
            var4 -= var11;
            var2 = anInt754;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var2 + var4 > anInt745) {
            var11 = var2 + var4 - anInt745;
            var4 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var4 > 0 && var5 > 0) {
            method1175(anIntArray953, var1, var6, var10, var7, var4, var5, var8, var9);
        }
    }

    final void method1151(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var2 + var3 * anInt749;
        int var9 = anInt749 - var4;
        int var10 = 0;
        int var11 = 0;
        int var12;
        if (var3 < anInt1257) {
            var12 = anInt1257 - var3;
            var5 -= var12;
            var3 = anInt1257;
            var11 += var12 * var4;
            var8 += var12 * anInt749;
        }

        if (var3 + var5 > anInt753) {
            var5 -= var3 + var5 - anInt753;
        }

        if (var2 < anInt754) {
            var12 = anInt754 - var2;
            var4 -= var12;
            var2 = anInt754;
            var11 += var12;
            var8 += var12;
            var10 += var12;
            var9 += var12;
        }

        if (var2 + var4 > anInt745) {
            var12 = var2 + var4 - anInt745;
            var4 -= var12;
            var10 += var12;
            var9 += var12;
        }

        if (var4 > 0 && var5 > 0) {
            method1162(anIntArray953, var1, var6, var11, var8, var4, var5, var9, var10, var7);
        }
    }
}
