package com.jagex;

public final class IsaacCipher {

    int[] anIntArray1342 = new int[256]; //results or memory
    int[] results = new int[256];
    int anInt1338;
    int anInt1343;
    int anInt1341;
    int anInt1339;

    IsaacCipher(int[] seed) {
        for (int i = 0; i < seed.length; ++i) {
            this.results[i] = seed[i];
        }

        method793();
    }

    public static boolean method795(int var0) {
        return var0 >= Class163.aClass163_1975.anInt1960 && var0 <= Class163.aClass163_1979.anInt1960 || var0 == Class163.aClass163_1981.anInt1960;
    }

    static void method794(byte[] var0) {
        Buffer var1 = new Buffer(var0);
        var1.caret = var0.length - 2;
        Class191.anInt2244 = var1.readUnsignedShort();
        Class191.anIntArray2245 = new int[Class191.anInt2244];
        Class191.anIntArray2248 = new int[Class191.anInt2244];
        Class191.anIntArray2249 = new int[Class191.anInt2244];
        Class109.anIntArray1305 = new int[Class191.anInt2244];
        Class191.aByteArrayArray2247 = new byte[Class191.anInt2244][];
        var1.caret = var0.length - 7 - Class191.anInt2244 * 8;
        Class160.anInt1857 = var1.readUnsignedShort();
        Class191.anInt2246 = var1.readUnsignedShort();
        int var2 = (var1.readUnsignedByte() & 255) + 1;

        int var3;
        for (var3 = 0; var3 < Class191.anInt2244; ++var3) {
            Class191.anIntArray2245[var3] = var1.readUnsignedShort();
        }

        for (var3 = 0; var3 < Class191.anInt2244; ++var3) {
            Class191.anIntArray2248[var3] = var1.readUnsignedShort();
        }

        for (var3 = 0; var3 < Class191.anInt2244; ++var3) {
            Class191.anIntArray2249[var3] = var1.readUnsignedShort();
        }

        for (var3 = 0; var3 < Class191.anInt2244; ++var3) {
            Class109.anIntArray1305[var3] = var1.readUnsignedShort();
        }

        var1.caret = var0.length - 7 - Class191.anInt2244 * 8 - (var2 - 1) * 3;
        Class94.anIntArray1043 = new int[var2];

        for (var3 = 1; var3 < var2; ++var3) {
            Class94.anIntArray1043[var3] = var1.method868();
            if (Class94.anIntArray1043[var3] == 0) {
                Class94.anIntArray1043[var3] = 1;
            }
        }

        var1.caret = 0;

        for (var3 = 0; var3 < Class191.anInt2244; ++var3) {
            int var4 = Class191.anIntArray2249[var3];
            int var5 = Class109.anIntArray1305[var3];
            int var6 = var4 * var5;
            byte[] var7 = new byte[var6];
            Class191.aByteArrayArray2247[var3] = var7;
            int var8 = var1.readUnsignedByte();
            int var9;
            if (var8 == 0) {
                for (var9 = 0; var9 < var6; ++var9) {
                    var7[var9] = var1.method870();
                }
            } else if (var8 == 1) {
                for (var9 = 0; var9 < var4; ++var9) {
                    for (int var10 = 0; var10 < var5; ++var10) {
                        var7[var9 + var10 * var4] = var1.method870();
                    }
                }
            }
        }

    }

    final int method792() {
        if (--this.anInt1338 + 1 == 0) {
            this.method796();
            this.anInt1338 = 255;
        }

        return this.results[this.anInt1338];
    }

    final void method796() {
        this.anInt1341 += ++this.anInt1339;

        for (int var1 = 0; var1 < 256; ++var1) {
            int var2 = this.anIntArray1342[var1];
            if ((var1 & 2) == 0) {
                if ((var1 & 1) == 0) {
                    this.anInt1343 ^= this.anInt1343 << 13;
                } else {
                    this.anInt1343 ^= this.anInt1343 >>> 6;
                }
            } else if ((var1 & 1) == 0) {
                this.anInt1343 ^= this.anInt1343 << 2;
            } else {
                this.anInt1343 ^= this.anInt1343 >>> 16;
            }

            this.anInt1343 += this.anIntArray1342[var1 + 128 & 255];
            int var3;
            this.anIntArray1342[var1] = var3 = this.anInt1343 + this.anIntArray1342[(var2 & 1020) >> 2] + this.anInt1341;
            this.results[var1] = this.anInt1341 = var2 + this.anIntArray1342[(var3 >> 8 & 1020) >> 2];
        }

    }

    final void method793() {
        int var1 = -1640531527;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;

        int var9;
        for (var9 = 0; var9 < 4; ++var9) {
            var8 ^= var7 << 11;
            var5 += var8;
            var7 += var6;
            var7 ^= var6 >>> 2;
            var4 += var7;
            var6 += var5;
            var6 ^= var5 << 8;
            var3 += var6;
            var5 += var4;
            var5 ^= var4 >>> 16;
            var2 += var5;
            var4 += var3;
            var4 ^= var3 << 10;
            var1 += var4;
            var3 += var2;
            var3 ^= var2 >>> 4;
            var8 += var3;
            var2 += var1;
            var2 ^= var1 << 8;
            var7 += var2;
            var1 += var8;
            var1 ^= var8 >>> 9;
            var6 += var1;
            var8 += var7;
        }

        for (var9 = 0; var9 < 256; var9 += 8) {
            var8 += this.results[var9];
            var7 += this.results[var9 + 1];
            var6 += this.results[var9 + 2];
            var5 += this.results[var9 + 3];
            var4 += this.results[var9 + 4];
            var3 += this.results[var9 + 5];
            var2 += this.results[var9 + 6];
            var1 += this.results[var9 + 7];
            var8 ^= var7 << 11;
            var5 += var8;
            var7 += var6;
            var7 ^= var6 >>> 2;
            var4 += var7;
            var6 += var5;
            var6 ^= var5 << 8;
            var3 += var6;
            var5 += var4;
            var5 ^= var4 >>> 16;
            var2 += var5;
            var4 += var3;
            var4 ^= var3 << 10;
            var1 += var4;
            var3 += var2;
            var3 ^= var2 >>> 4;
            var8 += var3;
            var2 += var1;
            var2 ^= var1 << 8;
            var7 += var2;
            var1 += var8;
            var1 ^= var8 >>> 9;
            var6 += var1;
            var8 += var7;
            this.anIntArray1342[var9] = var8;
            this.anIntArray1342[var9 + 1] = var7;
            this.anIntArray1342[var9 + 2] = var6;
            this.anIntArray1342[var9 + 3] = var5;
            this.anIntArray1342[var9 + 4] = var4;
            this.anIntArray1342[var9 + 5] = var3;
            this.anIntArray1342[var9 + 6] = var2;
            this.anIntArray1342[var9 + 7] = var1;
        }

        for (var9 = 0; var9 < 256; var9 += 8) {
            var8 += this.anIntArray1342[var9];
            var7 += this.anIntArray1342[var9 + 1];
            var6 += this.anIntArray1342[var9 + 2];
            var5 += this.anIntArray1342[var9 + 3];
            var4 += this.anIntArray1342[var9 + 4];
            var3 += this.anIntArray1342[var9 + 5];
            var2 += this.anIntArray1342[var9 + 6];
            var1 += this.anIntArray1342[var9 + 7];
            var8 ^= var7 << 11;
            var5 += var8;
            var7 += var6;
            var7 ^= var6 >>> 2;
            var4 += var7;
            var6 += var5;
            var6 ^= var5 << 8;
            var3 += var6;
            var5 += var4;
            var5 ^= var4 >>> 16;
            var2 += var5;
            var4 += var3;
            var4 ^= var3 << 10;
            var1 += var4;
            var3 += var2;
            var3 ^= var2 >>> 4;
            var8 += var3;
            var2 += var1;
            var2 ^= var1 << 8;
            var7 += var2;
            var1 += var8;
            var1 ^= var8 >>> 9;
            var6 += var1;
            var8 += var7;
            this.anIntArray1342[var9] = var8;
            this.anIntArray1342[var9 + 1] = var7;
            this.anIntArray1342[var9 + 2] = var6;
            this.anIntArray1342[var9 + 3] = var5;
            this.anIntArray1342[var9 + 4] = var4;
            this.anIntArray1342[var9 + 5] = var3;
            this.anIntArray1342[var9 + 6] = var2;
            this.anIntArray1342[var9 + 7] = var1;
        }

        this.method796();
        this.anInt1338 = 256;
    }
}
