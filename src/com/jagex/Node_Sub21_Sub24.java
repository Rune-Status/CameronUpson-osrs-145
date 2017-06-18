package com.jagex;

public class Node_Sub21_Sub24 extends DoublyNode {
    public static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    public int anInt327;
    public int anInt328;
    public int anInt221;
    public int anInt232;
    int anInt206 = 0;

    void method335() {
        this.method740(this.anInt206);
    }

    void method1065(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUnsignedByte();
            if (var3 == 0) {
                return;
            }

            this.method1148(var1, var3, var2);
        }
    }

    void method740(int var1) {
        double var2 = (double) (var1 >> 16 & 255) / 256.0D;
        double var4 = (double) (var1 >> 8 & 255) / 256.0D;
        double var6 = (double) (var1 & 255) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }

        if (var6 < var8) {
            var8 = var6;
        }

        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }

        if (var6 > var10) {
            var10 = var6;
        }

        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var10 != var8) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }

            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }

            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = 4.0D + (var2 - var4) / (var10 - var8);
            }
        }

        var12 /= 6.0D;
        this.anInt327 = (int) (256.0D * var14);
        this.anInt328 = (int) (var16 * 256.0D);
        if (this.anInt327 < 0) {
            this.anInt327 = 0;
        } else if (this.anInt327 > 255) {
            this.anInt327 = 255;
        }

        if (this.anInt328 < 0) {
            this.anInt328 = 0;
        } else if (this.anInt328 > 255) {
            this.anInt328 = 255;
        }

        if (var16 > 0.5D) {
            this.anInt221 = (int) (512.0D * (1.0D - var16) * var14);
        } else {
            this.anInt221 = (int) (512.0D * var14 * var16);
        }

        if (this.anInt221 < 1) {
            this.anInt221 = 1;
        }

        this.anInt232 = (int) (var12 * (double) this.anInt221);
    }

    void method1148(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.anInt206 = var1.method868();
        }

    }
}
