package com.jagex;

public class Class122_Sub1 extends Class122 {
    static String aString1184;
    long aLong1179 = Class124.method873();
    int anInt1183 = 256;
    int anInt1181 = 0;
    long[] aLongArray1178 = new long[10];
    int anInt1182;
    int anInt1180 = 1;

    public Class122_Sub1() {
        for (int var1 = 0; var1 < 10; ++var1) {
            this.aLongArray1178[var1] = this.aLong1179;
        }

    }

    public void method665() {
        for (int var1 = 0; var1 < 10; ++var1) {
            this.aLongArray1178[var1] = 0L;
        }

    }

    public int method666(int var1, int var2) {
        int var3 = this.anInt1183;
        int var4 = this.anInt1180;
        this.anInt1183 = 300;
        this.anInt1180 = 1;
        this.aLong1179 = Class124.method873();
        if (this.aLongArray1178[this.anInt1182] == 0L) {
            this.anInt1183 = var3;
            this.anInt1180 = var4;
        } else if (this.aLong1179 > this.aLongArray1178[this.anInt1182]) {
            this.anInt1183 = (int) ((long) (var1 * 2560) / (this.aLong1179 - this.aLongArray1178[this.anInt1182]));
        }

        if (this.anInt1183 < 25) {
            this.anInt1183 = 25;
        }

        if (this.anInt1183 > 256) {
            this.anInt1183 = 256;
            this.anInt1180 = (int) ((long) var1 - (this.aLong1179 - this.aLongArray1178[this.anInt1182]) / 10L);
        }

        if (this.anInt1180 > var1) {
            this.anInt1180 = var1;
        }

        this.aLongArray1178[this.anInt1182] = this.aLong1179;
        this.anInt1182 = (this.anInt1182 + 1) % 10;
        int var5;
        if (this.anInt1180 > 1) {
            for (var5 = 0; var5 < 10; ++var5) {
                if (this.aLongArray1178[var5] != 0L) {
                    this.aLongArray1178[var5] += (long) this.anInt1180;
                }
            }
        }

        if (this.anInt1180 < var2) {
            this.anInt1180 = var2;
        }

        Class127.method875((long) this.anInt1180);

        for (var5 = 0; this.anInt1181 < 256; this.anInt1181 += this.anInt1183) {
            ++var5;
        }

        this.anInt1181 &= 255;
        return var5;
    }
}
