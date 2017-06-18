package com.jagex;

public final class IsaacCipher {

    int[] state = new int[256];
    int[] results = new int[256];
    int count;
    int accumulator;
    int mru;
    int counter;

    IsaacCipher(int[] seed) {
        for (int i = 0; i < seed.length; ++i) {
            this.results[i] = seed[i];
        }

        initialize();
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
        if (--this.count + 1 == 0) {
            this.isaac();
            this.count = 255;
        }

        return this.results[this.count];
    }

    final void isaac() {
        this.mru += ++this.counter;

        for (int i = 0; i < 256; ++i) {
            int state = this.state[i];
            if ((i & 2) == 0) {
                if ((i & 1) == 0) {
                    this.accumulator ^= this.accumulator << 13;
                } else {
                    this.accumulator ^= this.accumulator >>> 6;
                }
            } else if ((i & 1) == 0) {
                this.accumulator ^= this.accumulator << 2;
            } else {
                this.accumulator ^= this.accumulator >>> 16;
            }

            this.accumulator += this.state[i + 128 & 255];
            int var3;
            this.state[i] = var3 = this.accumulator + this.state[(state & 1020) >> 2] + this.mru;
            this.results[i] = this.mru = state + this.state[(var3 >> 8 & 1020) >> 2];
        }

    }

    final void initialize() {
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
            this.state[var9] = var8;
            this.state[var9 + 1] = var7;
            this.state[var9 + 2] = var6;
            this.state[var9 + 3] = var5;
            this.state[var9 + 4] = var4;
            this.state[var9 + 5] = var3;
            this.state[var9 + 6] = var2;
            this.state[var9 + 7] = var1;
        }

        for (var9 = 0; var9 < 256; var9 += 8) {
            var8 += this.state[var9];
            var7 += this.state[var9 + 1];
            var6 += this.state[var9 + 2];
            var5 += this.state[var9 + 3];
            var4 += this.state[var9 + 4];
            var3 += this.state[var9 + 5];
            var2 += this.state[var9 + 6];
            var1 += this.state[var9 + 7];
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
            this.state[var9] = var8;
            this.state[var9 + 1] = var7;
            this.state[var9 + 2] = var6;
            this.state[var9 + 3] = var5;
            this.state[var9 + 4] = var4;
            this.state[var9 + 5] = var3;
            this.state[var9 + 6] = var2;
            this.state[var9 + 7] = var1;
        }

        this.isaac();
        this.count = 256;
    }
}
