public class AudioEffect {
    int end;
    AudioInstrument[] instruments = new AudioInstrument[10];
    int start;

    AudioEffect(Buffer var1) {
        for (int var2 = 0; var2 < 10; ++var2) {
            int var3 = var1.readUnsignedByte();
            if (var3 != 0) {
                --var1.caret;
                this.instruments[var2] = new AudioInstrument();
                this.instruments[var2].method611(var1);
            }
        }

        this.start = var1.readUnsignedShort();
        this.end = var1.readUnsignedShort();
    }

    public static AudioEffect method606(ReferenceTable var0, int var1, int var2) {
        byte[] var3 = var0.method1085(var1, var2);
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
            if (this.instruments[var2] != null && this.instruments[var2].anInt1029 + this.instruments[var2].anInt1026 > var1) {
                var1 = this.instruments[var2].anInt1029 + this.instruments[var2].anInt1026;
            }
        }

        if (var1 == 0) {
            return new byte[0];
        } else {
            var2 = var1 * 22050 / 1000;
            byte[] var3 = new byte[var2];

            for (int var4 = 0; var4 < 10; ++var4) {
                if (this.instruments[var4] != null) {
                    int var5 = this.instruments[var4].anInt1029 * 22050 / 1000;
                    int var6 = this.instruments[var4].anInt1026 * 22050 / 1000;
                    int[] var7 = this.instruments[var4].method610(var5, this.instruments[var4].anInt1029);

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
    }

    public final int method608() {
        int var1 = 9999999;

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            if (this.instruments[var2] != null && this.instruments[var2].anInt1026 / 20 < var1) {
                var1 = this.instruments[var2].anInt1026 / 20;
            }
        }

        if (this.start < this.end && this.start / 20 < var1) {
            var1 = this.start / 20;
        }

        if (var1 != 9999999 && var1 != 0) {
            for (var2 = 0; var2 < 10; ++var2) {
                if (this.instruments[var2] != null) {
                    this.instruments[var2].anInt1026 -= var1 * 20;
                }
            }

            if (this.start < this.end) {
                this.start -= var1 * 20;
                this.end -= var1 * 20;
            }

            return var1;
        } else {
            return 0;
        }
    }

    public Node_Sub11_Sub1 method609() {
        byte[] var1 = this.method607();
        return new Node_Sub11_Sub1(22050, var1, this.start * 22050 / 1000, this.end * 22050 / 1000);
    }
}
