public class Class91 {
    int[] anIntArray970;
    int anInt971 = Node_Sub13.method590(8);
    int anInt968 = Node_Sub13.method590(24);
    int anInt967 = Node_Sub13.method590(24) + 1;
    int anInt969 = Node_Sub13.method590(6) + 1;
    int anInt972 = Node_Sub13.method590(24);
    int anInt966 = Node_Sub13.method590(16);

    Class91() {
        int[] var1 = new int[this.anInt969];

        int var2;
        for (var2 = 0; var2 < this.anInt969; ++var2) {
            int var3 = 0;
            int var4 = Node_Sub13.method590(3);
            boolean var5 = Node_Sub13.method591() != 0;
            if (var5) {
                var3 = Node_Sub13.method590(5);
            }

            var1[var2] = var3 << 3 | var4;
        }

        this.anIntArray970 = new int[this.anInt969 * 8];

        for (var2 = 0; var2 < this.anInt969 * 8; ++var2) {
            this.anIntArray970[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? Node_Sub13.method590(8) : -1;
        }

    }

    void method586(float[] var1, int var2, boolean var3) {
        int var4;
        for (var4 = 0; var4 < var2; ++var4) {
            var1[var4] = 0.0F;
        }

        if (!var3) {
            var4 = Node_Sub13.aClass88Array985[this.anInt971].anInt913;
            int var5 = this.anInt968 - this.anInt972;
            int var6 = var5 / this.anInt967;
            int[] var7 = new int[var6];

            for (int var8 = 0; var8 < 8; ++var8) {
                int var9 = 0;

                while (var9 < var6) {
                    int var10;
                    int var11;
                    if (var8 == 0) {
                        var10 = Node_Sub13.aClass88Array985[this.anInt971].method520();

                        for (var11 = var4 - 1; var11 >= 0; --var11) {
                            if (var9 + var11 < var6) {
                                var7[var9 + var11] = var10 % this.anInt969;
                            }

                            var10 /= this.anInt969;
                        }
                    }

                    for (var10 = 0; var10 < var4; ++var10) {
                        var11 = var7[var9];
                        int var12 = this.anIntArray970[var11 * 8 + var8];
                        if (var12 >= 0) {
                            int var13 = this.anInt972 + var9 * this.anInt967;
                            Class88 var14 = Node_Sub13.aClass88Array985[var12];
                            int var15;
                            if (this.anInt966 == 0) {
                                var15 = this.anInt967 / var14.anInt913;

                                for (int var16 = 0; var16 < var15; ++var16) {
                                    float[] var17 = var14.method519();

                                    for (int var18 = 0; var18 < var14.anInt913; ++var18) {
                                        var1[var13 + var16 + var18 * var15] += var17[var18];
                                    }
                                }
                            } else {
                                var15 = 0;

                                while (var15 < this.anInt967) {
                                    float[] var19 = var14.method519();

                                    for (int var20 = 0; var20 < var14.anInt913; ++var20) {
                                        var1[var13 + var15] += var19[var20];
                                        ++var15;
                                    }
                                }
                            }
                        }

                        ++var9;
                        if (var9 >= var6) {
                            break;
                        }
                    }
                }
            }

        }
    }
}
