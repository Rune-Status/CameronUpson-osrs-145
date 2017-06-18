package com.jagex;

public class Node_Sub10_Sub2 extends Node_Sub10 {
    int anInt226;
    int anInt209;
    int anInt206;
    int anInt232;
    int anInt220;
    int anInt225;
    int anInt221;
    int anInt204;
    int anInt214;
    int anInt217;
    boolean aBoolean813;
    int anInt235;
    int anInt212;
    int anInt919;
    int anInt328;

    Node_Sub10_Sub2(Node_Sub11_Sub1 var1, int var2, int var3) {
        this.aNode_Sub11_843 = var1;
        this.anInt214 = var1.anInt206;
        this.anInt226 = var1.anInt232;
        this.aBoolean813 = var1.aBoolean845;
        this.anInt209 = var2;
        this.anInt206 = var3;
        this.anInt232 = 8192;
        this.anInt204 = 0;
        this.method556();
    }

    Node_Sub10_Sub2(Node_Sub11_Sub1 var1, int var2, int var3, int var4) {
        this.aNode_Sub11_843 = var1;
        this.anInt214 = var1.anInt206;
        this.anInt226 = var1.anInt232;
        this.aBoolean813 = var1.aBoolean845;
        this.anInt209 = var2;
        this.anInt206 = var3;
        this.anInt232 = var4;
        this.anInt204 = 0;
        this.method556();
    }

    static int method542(int var0, int var1) {
        return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
    }

    public static Node_Sub10_Sub2 method535(Node_Sub11_Sub1 var0, int var1, int var2) {
        return var0.aByteArray846 != null && var0.aByteArray846.length != 0 ? new Node_Sub10_Sub2(var0, (int) ((long) var0.anInt204 * 256L * (long) var1 / (long) (Class84.anInt870 * 100)), var2 << 6) : null;
    }

    public static Node_Sub10_Sub2 method551(Node_Sub11_Sub1 var0, int var1, int var2, int var3) {
        return var0.aByteArray846 != null && var0.aByteArray846.length != 0 ? new Node_Sub10_Sub2(var0, var1, var2, var3) : null;
    }

    static int method527(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Node_Sub10_Sub2 var11, int var12, int var13) {
        var11.anInt221 -= var11.anInt919 * var5;
        var11.anInt220 -= var11.anInt235 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        byte var14;
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.anInt221 += var11.anInt919 * var5;
        var11.anInt220 += var11.anInt235 * var5;
        var11.anInt328 = var6;
        var11.anInt204 = var4;
        return var5;
    }

    static int method533(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Node_Sub10_Sub2 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
            var7 = var8;
        }

        byte var13;
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            var13 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
            var7 = var8;
        }

        for (var1 = var12; var5 < var7; var4 += var11) {
            var13 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
        }

        var10.anInt204 = var4;
        return var5;
    }

    static int method538(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Node_Sub10_Sub2 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var7 - var2) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
        }

        var8.anInt204 = var2 << 8;
        return var3;
    }

    static int method524(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Node_Sub10_Sub2 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            byte var13 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        var0 = var12;

        for (var1 = var11; var5 < var7; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
        }

        var10.anInt204 = var4;
        return var5;
    }

    static int method523(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Node_Sub10_Sub2 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.anInt204 = var4;
        return var5 >> 1;
    }

    static int method552(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Node_Sub10_Sub2 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
        }

        var8.anInt204 = var2 << 8;
        return var3;
    }

    static int method529(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Node_Sub10_Sub2 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var11 - var3) > var10) {
            var9 = var10;
        }

        var12.anInt328 += var12.anInt212 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.anInt221 = var5 >> 2;
        var12.anInt220 = var6 >> 2;
        var12.anInt204 = var3 << 8;
        return var4 >> 1;
    }

    static int method530(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Node_Sub10_Sub2 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
            var6 = var7;
        }

        var9.anInt221 += var9.anInt919 * (var6 - var3);
        var9.anInt220 += var9.anInt235 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        var9.anInt328 = var4 >> 2;
        var9.anInt204 = var2 << 8;
        return var3;
    }

    static int method560(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Node_Sub10_Sub2 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
            var9 = var10;
        }

        var12.anInt328 += var12.anInt212 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.anInt221 = var5 >> 2;
        var12.anInt220 = var6 >> 2;
        var12.anInt204 = var3 << 8;
        return var4 >> 1;
    }

    static int method526(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Node_Sub10_Sub2 var13, int var14, int var15) {
        var13.anInt328 -= var13.anInt212 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        byte var16;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            var16 = var2[var1];
            var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var16 = var2[var4 >> 8];
            var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.anInt328 += var13.anInt212 * var5;
        var13.anInt221 = var6;
        var13.anInt220 = var7;
        var13.anInt204 = var4;
        return var5;
    }

    static int method528(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Node_Sub10_Sub2 var11, int var12, int var13) {
        var11.anInt221 -= var11.anInt919 * var5;
        var11.anInt220 -= var11.anInt235 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var0 = var13;

        for (var1 = var12; var5 < var8; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.anInt221 += var11.anInt919 * var5;
        var11.anInt220 += var11.anInt235 * var5;
        var11.anInt328 = var6;
        var11.anInt204 = var4;
        return var5;
    }

    static int method522(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Node_Sub10_Sub2 var13, int var14, int var15) {
        var13.anInt328 -= var13.anInt212 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            byte var16 = var2[var1 - 1];
            var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.anInt328 += var13.anInt212 * var5;
        var13.anInt221 = var6;
        var13.anInt220 = var7;
        var13.anInt204 = var4;
        return var5;
    }

    static int method555(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Node_Sub10_Sub2 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var9 - var3) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.anInt204 = var3 << 8;
        return var4 >> 1;
    }

    static int method525(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Node_Sub10_Sub2 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var8 - var2) > var7) {
            var6 = var7;
        }

        var9.anInt221 += var9.anInt919 * (var6 - var3);
        var9.anInt220 += var9.anInt235 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        var9.anInt328 = var4 >> 2;
        var9.anInt204 = var2 << 8;
        return var3;
    }

    static int method544(int var0, int var1) {
        return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
    }

    static int method550(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Node_Sub10_Sub2 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        byte var14;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.anInt204 = var4;
        return var5 >> 1;
    }

    static int method537(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Node_Sub10_Sub2 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.anInt204 = var3 << 8;
        return var4 >> 1;
    }

    void method556() {
        this.anInt328 = this.anInt206;
        this.anInt221 = method544(this.anInt206, this.anInt232);
        this.anInt220 = method542(this.anInt206, this.anInt232);
    }

    public synchronized void method424(int var1) {
        this.method554(var1 << 6, this.method539());
    }

    synchronized void method536(int var1) {
        this.method554(var1, this.method539());
    }

    synchronized void method554(int var1, int var2) {
        this.anInt206 = var1;
        this.anInt232 = var2;
        this.anInt225 = 0;
        this.method556();
    }

    public synchronized int method539() {
        return this.anInt232 < 0 ? -1 : this.anInt232;
    }

    public synchronized void method547(int var1) {
        int var2 = ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846.length << 8;
        if (var1 < -1) {
            var1 = -1;
        }

        if (var1 > var2) {
            var1 = var2;
        }

        this.anInt204 = var1;
    }

    public synchronized void method540() {
        this.anInt209 = (this.anInt209 ^ this.anInt209 >> 31) + (this.anInt209 >>> 31);
        this.anInt209 = -this.anInt209;
    }

    void method534() {
        if (this.anInt225 != 0) {
            if (this.anInt206 == Integer.MIN_VALUE) {
                this.anInt206 = 0;
            }

            this.anInt225 = 0;
            this.method556();
        }

    }

    public synchronized void method557(int var1, int var2) {
        this.method531(var1, var2, this.method539());
    }

    public synchronized void method531(int var1, int var2, int var3) {
        if (var1 == 0) {
            this.method554(var2, var3);
        } else {
            int var4 = method544(var2, var3);
            int var5 = method542(var2, var3);
            if (this.anInt221 == var4 && this.anInt220 == var5) {
                this.anInt225 = 0;
            } else {
                int var6 = var2 - this.anInt328;
                if (this.anInt328 - var2 > var6) {
                    var6 = this.anInt328 - var2;
                }

                if (var4 - this.anInt221 > var6) {
                    var6 = var4 - this.anInt221;
                }

                if (this.anInt221 - var4 > var6) {
                    var6 = this.anInt221 - var4;
                }

                if (var5 - this.anInt220 > var6) {
                    var6 = var5 - this.anInt220;
                }

                if (this.anInt220 - var5 > var6) {
                    var6 = this.anInt220 - var5;
                }

                if (var1 > var6) {
                    var1 = var6;
                }

                this.anInt225 = var1;
                this.anInt206 = var2;
                this.anInt232 = var3;
                this.anInt212 = (var2 - this.anInt328) / var1;
                this.anInt919 = (var4 - this.anInt221) / var1;
                this.anInt235 = (var5 - this.anInt220) / var1;
            }
        }
    }

    public synchronized void method558(int var1) {
        if (var1 == 0) {
            this.method536(0);
            this.unlink();
        } else if (this.anInt221 == 0 && this.anInt220 == 0) {
            this.anInt225 = 0;
            this.anInt206 = 0;
            this.anInt328 = 0;
            this.unlink();
        } else {
            int var2 = -this.anInt328;
            if (this.anInt328 > var2) {
                var2 = this.anInt328;
            }

            if (-this.anInt221 > var2) {
                var2 = -this.anInt221;
            }

            if (this.anInt221 > var2) {
                var2 = this.anInt221;
            }

            if (-this.anInt220 > var2) {
                var2 = -this.anInt220;
            }

            if (this.anInt220 > var2) {
                var2 = this.anInt220;
            }

            if (var1 > var2) {
                var1 = var2;
            }

            this.anInt225 = var1;
            this.anInt206 = Integer.MIN_VALUE;
            this.anInt212 = -this.anInt328 / var1;
            this.anInt919 = -this.anInt221 / var1;
            this.anInt235 = -this.anInt220 / var1;
        }
    }

    public boolean method545() {
        return this.anInt204 < 0 || this.anInt204 >= ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846.length << 8;
    }

    boolean method559() {
        int var1 = this.anInt206;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method544(var1, this.anInt232);
            var2 = method542(var1, this.anInt232);
        }

        if (this.anInt328 == var1 && this.anInt221 == var3 && this.anInt220 == var2) {
            if (this.anInt206 == Integer.MIN_VALUE) {
                this.anInt206 = 0;
                this.anInt220 = 0;
                this.anInt221 = 0;
                this.anInt328 = 0;
                this.unlink();
                return true;
            }
            this.method556();
            return false;
        }
        if (this.anInt328 < var1) {
            this.anInt212 = 1;
            this.anInt225 = var1 - this.anInt328;
        } else if (this.anInt328 > var1) {
            this.anInt212 = -1;
            this.anInt225 = this.anInt328 - var1;
        } else {
            this.anInt212 = 0;
        }

        if (this.anInt221 < var3) {
            this.anInt919 = 1;
            if (this.anInt225 == 0 || this.anInt225 > var3 - this.anInt221) {
                this.anInt225 = var3 - this.anInt221;
            }
        } else if (this.anInt221 > var3) {
            this.anInt919 = -1;
            if (this.anInt225 == 0 || this.anInt225 > this.anInt221 - var3) {
                this.anInt225 = this.anInt221 - var3;
            }
        } else {
            this.anInt919 = 0;
        }

        if (this.anInt220 < var2) {
            this.anInt235 = 1;
            if (this.anInt225 == 0 || this.anInt225 > var2 - this.anInt220) {
                this.anInt225 = var2 - this.anInt220;
            }
        } else if (this.anInt220 > var2) {
            this.anInt235 = -1;
            if (this.anInt225 == 0 || this.anInt225 > this.anInt220 - var2) {
                this.anInt225 = this.anInt220 - var2;
            }
        } else {
            this.anInt235 = 0;
        }

        return false;
    }

    protected Node_Sub10 method434() {
        return null;
    }

    protected Node_Sub10 method426() {
        return null;
    }

    protected int method425() {
        return this.anInt206 == 0 && this.anInt225 == 0 ? 0 : 1;
    }

    public synchronized void method429(int[] var1, int var2, int var3) {
        if (this.anInt206 == 0 && this.anInt225 == 0) {
            this.method428(var3);
        } else {
            Node_Sub11_Sub1 var4 = (Node_Sub11_Sub1) this.aNode_Sub11_843;
            int var5 = this.anInt214 << 8;
            int var6 = this.anInt226 << 8;
            int var7 = var4.aByteArray846.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.anInt217 = 0;
            }

            int var9 = var2;
            var3 += var2;
            if (this.anInt204 < 0) {
                if (this.anInt209 <= 0) {
                    this.method534();
                    this.unlink();
                    return;
                }

                this.anInt204 = 0;
            }

            if (this.anInt204 >= var7) {
                if (this.anInt209 >= 0) {
                    this.method534();
                    this.unlink();
                    return;
                }

                this.anInt204 = var7 - 1;
            }

            if (this.anInt217 < 0) {
                if (this.aBoolean813) {
                    if (this.anInt209 < 0) {
                        var9 = this.method548(var1, var2, var5, var3, var4.aByteArray846[this.anInt214]);
                        if (this.anInt204 >= var5) {
                            return;
                        }

                        this.anInt204 = var5 + var5 - 1 - this.anInt204;
                        this.anInt209 = -this.anInt209;
                    }

                    while (true) {
                        var9 = this.method532(var1, var9, var6, var3, var4.aByteArray846[this.anInt226 - 1]);
                        if (this.anInt204 < var6) {
                            return;
                        }

                        this.anInt204 = var6 + var6 - 1 - this.anInt204;
                        this.anInt209 = -this.anInt209;
                        var9 = this.method548(var1, var9, var5, var3, var4.aByteArray846[this.anInt214]);
                        if (this.anInt204 >= var5) {
                            return;
                        }

                        this.anInt204 = var5 + var5 - 1 - this.anInt204;
                        this.anInt209 = -this.anInt209;
                    }
                }
                if (this.anInt209 < 0) {
                    while (true) {
                        var9 = this.method548(var1, var9, var5, var3, var4.aByteArray846[this.anInt226 - 1]);
                        if (this.anInt204 >= var5) {
                            return;
                        }

                        this.anInt204 = var6 - 1 - (var6 - 1 - this.anInt204) % var8;
                    }
                }
                while (true) {
                    var9 = this.method532(var1, var9, var6, var3, var4.aByteArray846[this.anInt214]);
                    if (this.anInt204 < var6) {
                        return;
                    }

                    this.anInt204 = var5 + (this.anInt204 - var5) % var8;
                }
            }
            if (this.anInt217 > 0) {
                if (this.aBoolean813) {
                    label142:
                    {
                        if (this.anInt209 < 0) {
                            var9 = this.method548(var1, var2, var5, var3, var4.aByteArray846[this.anInt214]);
                            if (this.anInt204 >= var5) {
                                return;
                            }

                            this.anInt204 = var5 + var5 - 1 - this.anInt204;
                            this.anInt209 = -this.anInt209;
                            if (--this.anInt217 == 0) {
                                break label142;
                            }
                        }

                        do {
                            var9 = this.method532(var1, var9, var6, var3, var4.aByteArray846[this.anInt226 - 1]);
                            if (this.anInt204 < var6) {
                                return;
                            }

                            this.anInt204 = var6 + var6 - 1 - this.anInt204;
                            this.anInt209 = -this.anInt209;
                            if (--this.anInt217 == 0) {
                                break;
                            }

                            var9 = this.method548(var1, var9, var5, var3, var4.aByteArray846[this.anInt214]);
                            if (this.anInt204 >= var5) {
                                return;
                            }

                            this.anInt204 = var5 + var5 - 1 - this.anInt204;
                            this.anInt209 = -this.anInt209;
                        } while (--this.anInt217 != 0);
                    }
                } else {
                    int var10;
                    if (this.anInt209 < 0) {
                        while (true) {
                            var9 = this.method548(var1, var9, var5, var3, var4.aByteArray846[this.anInt226 - 1]);
                            if (this.anInt204 >= var5) {
                                return;
                            }

                            var10 = (var6 - 1 - this.anInt204) / var8;
                            if (var10 >= this.anInt217) {
                                this.anInt204 += var8 * this.anInt217;
                                this.anInt217 = 0;
                                break;
                            }

                            this.anInt204 += var8 * var10;
                            this.anInt217 -= var10;
                        }
                    } else {
                        while (true) {
                            var9 = this.method532(var1, var9, var6, var3, var4.aByteArray846[this.anInt214]);
                            if (this.anInt204 < var6) {
                                return;
                            }

                            var10 = (this.anInt204 - var5) / var8;
                            if (var10 >= this.anInt217) {
                                this.anInt204 -= var8 * this.anInt217;
                                this.anInt217 = 0;
                                break;
                            }

                            this.anInt204 -= var8 * var10;
                            this.anInt217 -= var10;
                        }
                    }
                }
            }

            if (this.anInt209 < 0) {
                this.method548(var1, var9, 0, var3, 0);
                if (this.anInt204 < 0) {
                    this.anInt204 = -1;
                    this.method534();
                    this.unlink();
                }
            } else {
                this.method532(var1, var9, var7, var3, 0);
                if (this.anInt204 >= var7) {
                    this.anInt204 = var7;
                    this.method534();
                    this.unlink();
                }
            }

        }
    }

    int method532(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.anInt225 > 0) {
                int var6 = var2 + this.anInt225;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.anInt225 += var2;
                if (this.anInt209 == 256 && (this.anInt204 & 255) == 0) {
                    if (Class154.aBoolean1835) {
                        var2 = method529(0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, this.anInt919, this.anInt235, 0, var6, var3, this);
                    } else {
                        var2 = method525(((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, this.anInt212, 0, var6, var3, this);
                    }
                } else if (Class154.aBoolean1835) {
                    var2 = method526(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, this.anInt919, this.anInt235, 0, var6, var3, this, this.anInt209, var5);
                } else {
                    var2 = method527(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, this.anInt212, 0, var6, var3, this, this.anInt209, var5);
                }

                this.anInt225 -= var2;
                if (this.anInt225 != 0) {
                    return var2;
                }

                if (!this.method559()) {
                    continue;
                }

                return var4;
            }

            if (this.anInt209 == 256 && (this.anInt204 & 255) == 0) {
                if (Class154.aBoolean1835) {
                    return method555(0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, 0, var4, var3, this);
                }

                return method538(((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, 0, var4, var3, this);
            }

            if (Class154.aBoolean1835) {
                return method550(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, 0, var4, var3, this, this.anInt209, var5);
            }

            return method533(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, 0, var4, var3, this, this.anInt209, var5);
        }
    }

    int method548(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.anInt225 > 0) {
                int var6 = var2 + this.anInt225;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.anInt225 += var2;
                if (this.anInt209 == -256 && (this.anInt204 & 255) == 0) {
                    if (Class154.aBoolean1835) {
                        var2 = method560(0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, this.anInt919, this.anInt235, 0, var6, var3, this);
                    } else {
                        var2 = method530(((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, this.anInt212, 0, var6, var3, this);
                    }
                } else if (Class154.aBoolean1835) {
                    var2 = method522(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, this.anInt919, this.anInt235, 0, var6, var3, this, this.anInt209, var5);
                } else {
                    var2 = method528(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, this.anInt212, 0, var6, var3, this, this.anInt209, var5);
                }

                this.anInt225 -= var2;
                if (this.anInt225 != 0) {
                    return var2;
                }

                if (!this.method559()) {
                    continue;
                }

                return var4;
            }

            if (this.anInt209 == -256 && (this.anInt204 & 255) == 0) {
                if (Class154.aBoolean1835) {
                    return method537(0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, 0, var4, var3, this);
                }

                return method552(((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, 0, var4, var3, this);
            }

            if (Class154.aBoolean1835) {
                return method523(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt221, this.anInt220, 0, var4, var3, this, this.anInt209, var5);
            }

            return method524(0, 0, ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846, var1, this.anInt204, var2, this.anInt328, 0, var4, var3, this, this.anInt209, var5);
        }
    }

    public synchronized int method549() {
        return this.anInt206 == Integer.MIN_VALUE ? 0 : this.anInt206;
    }

    public synchronized void method428(int var1) {
        if (this.anInt225 > 0) {
            if (var1 >= this.anInt225) {
                if (this.anInt206 == Integer.MIN_VALUE) {
                    this.anInt206 = 0;
                    this.anInt220 = 0;
                    this.anInt221 = 0;
                    this.anInt328 = 0;
                    this.unlink();
                    var1 = this.anInt225;
                }

                this.anInt225 = 0;
                this.method556();
            } else {
                this.anInt328 += this.anInt212 * var1;
                this.anInt221 += this.anInt919 * var1;
                this.anInt220 += this.anInt235 * var1;
                this.anInt225 -= var1;
            }
        }

        Node_Sub11_Sub1 var2 = (Node_Sub11_Sub1) this.aNode_Sub11_843;
        int var3 = this.anInt214 << 8;
        int var4 = this.anInt226 << 8;
        int var5 = var2.aByteArray846.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.anInt217 = 0;
        }

        if (this.anInt204 < 0) {
            if (this.anInt209 <= 0) {
                this.method534();
                this.unlink();
                return;
            }

            this.anInt204 = 0;
        }

        if (this.anInt204 >= var5) {
            if (this.anInt209 >= 0) {
                this.method534();
                this.unlink();
                return;
            }

            this.anInt204 = var5 - 1;
        }

        this.anInt204 += this.anInt209 * var1;
        if (this.anInt217 < 0) {
            if (!this.aBoolean813) {
                if (this.anInt209 < 0) {
                    if (this.anInt204 >= var3) {
                        return;
                    }

                    this.anInt204 = var4 - 1 - (var4 - 1 - this.anInt204) % var6;
                } else {
                    if (this.anInt204 < var4) {
                        return;
                    }

                    this.anInt204 = var3 + (this.anInt204 - var3) % var6;
                }

            } else {
                if (this.anInt209 < 0) {
                    if (this.anInt204 >= var3) {
                        return;
                    }

                    this.anInt204 = var3 + var3 - 1 - this.anInt204;
                    this.anInt209 = -this.anInt209;
                }

                while (this.anInt204 >= var4) {
                    this.anInt204 = var4 + var4 - 1 - this.anInt204;
                    this.anInt209 = -this.anInt209;
                    if (this.anInt204 >= var3) {
                        return;
                    }

                    this.anInt204 = var3 + var3 - 1 - this.anInt204;
                    this.anInt209 = -this.anInt209;
                }

            }
        } else {
            if (this.anInt217 > 0) {
                if (this.aBoolean813) {
                    label123:
                    {
                        if (this.anInt209 < 0) {
                            if (this.anInt204 >= var3) {
                                return;
                            }

                            this.anInt204 = var3 + var3 - 1 - this.anInt204;
                            this.anInt209 = -this.anInt209;
                            if (--this.anInt217 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (this.anInt204 < var4) {
                                return;
                            }

                            this.anInt204 = var4 + var4 - 1 - this.anInt204;
                            this.anInt209 = -this.anInt209;
                            if (--this.anInt217 == 0) {
                                break;
                            }

                            if (this.anInt204 >= var3) {
                                return;
                            }

                            this.anInt204 = var3 + var3 - 1 - this.anInt204;
                            this.anInt209 = -this.anInt209;
                        } while (--this.anInt217 != 0);
                    }
                } else {
                    int var7;
                    if (this.anInt209 < 0) {
                        if (this.anInt204 >= var3) {
                            return;
                        }

                        var7 = (var4 - 1 - this.anInt204) / var6;
                        if (var7 < this.anInt217) {
                            this.anInt204 += var6 * var7;
                            this.anInt217 -= var7;
                            return;
                        }

                        this.anInt204 += var6 * this.anInt217;
                        this.anInt217 = 0;
                    } else {
                        if (this.anInt204 < var4) {
                            return;
                        }

                        var7 = (this.anInt204 - var3) / var6;
                        if (var7 < this.anInt217) {
                            this.anInt204 -= var6 * var7;
                            this.anInt217 -= var7;
                            return;
                        }

                        this.anInt204 -= var6 * this.anInt217;
                        this.anInt217 = 0;
                    }
                }
            }

            if (this.anInt209 < 0) {
                if (this.anInt204 < 0) {
                    this.anInt204 = -1;
                    this.method534();
                    this.unlink();
                }
            } else if (this.anInt204 >= var5) {
                this.anInt204 = var5;
                this.method534();
                this.unlink();
            }

        }
    }

    public synchronized int method541() {
        return this.anInt209 < 0 ? -this.anInt209 : this.anInt209;
    }

    int method472() {
        int var1 = this.anInt328 * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.anInt217 == 0) {
            var1 -= var1 * this.anInt204 / (((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846.length << 8);
        } else if (this.anInt217 >= 0) {
            var1 -= var1 * this.anInt214 / ((Node_Sub11_Sub1) this.aNode_Sub11_843).aByteArray846.length;
        }

        return var1 > 255 ? 255 : var1;
    }

    public synchronized void method553(int var1) {
        if (this.anInt209 < 0) {
            this.anInt209 = -var1;
        } else {
            this.anInt209 = var1;
        }

    }

    public synchronized void method546(int var1) {
        this.anInt217 = var1;
    }

    public boolean method543() {
        return this.anInt225 != 0;
    }
}
