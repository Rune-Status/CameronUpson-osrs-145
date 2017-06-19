package com.jagex;

public class AudioEffect {
    int end;
    AudioInstrument[] instruments = new AudioInstrument[10];
    int start;

    AudioEffect(Buffer var1) {
        for (int var2 = 0; var2 < 10; ++var2) {
            int var3 = var1.readUnsignedByte();
            if (var3 != 0) {
                --var1.caret;
                instruments[var2] = new AudioInstrument();
                instruments[var2].method611(var1);
            }
        }

        start = var1.readUnsignedShort();
        end = var1.readUnsignedShort();
    }

    public static AudioEffect method606(ReferenceTable var0, int var1, int var2) {
        byte[] var3 = var0.unpack(var1, var2);
        return var3 == null ? null : new AudioEffect(new Buffer(var3));
    }

    public static void method358(int var0, boolean notLowMemory, int var2) {
        if (var0 >= 8000 && var0 <= 48000) {
            Class84.anInt870 = var0;
            Class154.aBoolean1835 = notLowMemory;
            Class84.anInt857 = var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    final byte[] method607() {
        int var1 = 0;

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            if (instruments[var2] != null && instruments[var2].anInt1029 + instruments[var2].anInt1026 > var1) {
                var1 = instruments[var2].anInt1029 + instruments[var2].anInt1026;
            }
        }

        if (var1 == 0) {
            return new byte[0];
        }
        var2 = var1 * 22050 / 1000;
        byte[] var3 = new byte[var2];

        for (int var4 = 0; var4 < 10; ++var4) {
            if (instruments[var4] != null) {
                int var5 = instruments[var4].anInt1029 * 22050 / 1000;
                int var6 = instruments[var4].anInt1026 * 22050 / 1000;
                int[] var7 = instruments[var4].method610(var5, instruments[var4].anInt1029);

                for (int var8 = 0; var8 < var5; ++var8) {
                    int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                    if ((var9 + 128 & -256) != 0) {
                        var9 = var9 >> 31 ^ 127;
                    }

                    var3[var8 + var6] = (byte) var9;
                }
            }
        }

        return var3;
    }

    public final int method608() {
        int var1 = 9999999;

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            if (instruments[var2] != null && instruments[var2].anInt1026 / 20 < var1) {
                var1 = instruments[var2].anInt1026 / 20;
            }
        }

        if (start < end && start / 20 < var1) {
            var1 = start / 20;
        }

        if (var1 != 9999999 && var1 != 0) {
            for (var2 = 0; var2 < 10; ++var2) {
                if (instruments[var2] != null) {
                    instruments[var2].anInt1026 -= var1 * 20;
                }
            }

            if (start < end) {
                start -= var1 * 20;
                end -= var1 * 20;
            }

            return var1;
        }
        return 0;
    }

    public Node_Sub11_Sub1 method609() {
        byte[] var1 = method607();
        return new Node_Sub11_Sub1(22050, var1, start * 22050 / 1000, end * 22050 / 1000);
    }
}
