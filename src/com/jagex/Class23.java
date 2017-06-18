package com.jagex;

public class Class23 implements EnumOrdinal {
    static final Class23 aClass23_159 = new Class23(0, (byte) 1);
    static final Class23 aClass23_155 = new Class23(2, (byte) 2);
    static final Class23 aClass23_154 = new Class23(3, (byte) 3);
    static final Class23 aClass23_152 = new Class23(1, (byte) 0);
    static int anInt153;
    static int anInt156;
    final byte aByte158;
    final int anInt157;

    Class23(int var1, byte var2) {
        this.anInt157 = var1;
        this.aByte158 = var2;
    }

    static int method152(int var0, int var1) {
        if (var0 == -2) {
            return 12345678;
        } else if (var0 == -1) {
            if (var1 < 0) {
                var1 = 0;
            } else if (var1 > 127) {
                var1 = 127;
            }

            var1 = 127 - var1;
            return var1;
        } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1 + (var0 & 'ﾀ');
        }
    }

    static int method153(int var0, int var1) {
        int var2 = Class43.method297(var0 - 1, var1 - 1) + Class43.method297(var0 + 1, var1 - 1) + Class43.method297(var0 - 1, var1 + 1) + Class43.method297(var0 + 1, var1 + 1);
        int var3 = Class43.method297(var0 - 1, var1) + Class43.method297(var0 + 1, var1) + Class43.method297(var0, var1 - 1) + Class43.method297(var0, var1 + 1);
        int var4 = Class43.method297(var0, var1);
        return var4 / 4 + var3 / 8 + var2 / 16;
    }

    public int ordinal() {
        return this.aByte158;
    }
}
