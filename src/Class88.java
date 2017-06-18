public class Class88 {
    int[] anIntArray917;
    int anInt918;
    int anInt913;
    int[] anIntArray914;
    float[][] aFloatArrayArray916;
    int[] anIntArray915;

    Class88() {
        Node_Sub13.method590(24);
        this.anInt913 = Node_Sub13.method590(16);
        this.anInt918 = Node_Sub13.method590(24);
        this.anIntArray915 = new int[this.anInt918];
        boolean var1 = Node_Sub13.method591() != 0;
        int var2;
        int var3;
        int var5;
        if (var1) {
            var2 = 0;

            for (var3 = Node_Sub13.method590(5) + 1; var2 < this.anInt918; ++var3) {
                int var4 = Node_Sub13.method590(Class122.method809(this.anInt918 - var2));

                for (var5 = 0; var5 < var4; ++var5) {
                    this.anIntArray915[var2++] = var3;
                }
            }
        } else {
            boolean var14 = Node_Sub13.method591() != 0;

            for (var3 = 0; var3 < this.anInt918; ++var3) {
                if (var14 && Node_Sub13.method591() == 0) {
                    this.anIntArray915[var3] = 0;
                } else {
                    this.anIntArray915[var3] = Node_Sub13.method590(5) + 1;
                }
            }
        }

        this.method521();
        var2 = Node_Sub13.method590(4);
        if (var2 > 0) {
            float var15 = Node_Sub13.method587(Node_Sub13.method590(32));
            float var16 = Node_Sub13.method587(Node_Sub13.method590(32));
            var5 = Node_Sub13.method590(4) + 1;
            boolean var6 = Node_Sub13.method591() != 0;
            int var7;
            if (var2 == 1) {
                var7 = method518(this.anInt918, this.anInt913);
            } else {
                var7 = this.anInt918 * this.anInt913;
            }

            this.anIntArray914 = new int[var7];

            int var8;
            for (var8 = 0; var8 < var7; ++var8) {
                this.anIntArray914[var8] = Node_Sub13.method590(var5);
            }

            this.aFloatArrayArray916 = new float[this.anInt918][this.anInt913];
            float var9;
            int var10;
            int var11;
            if (var2 == 1) {
                for (var8 = 0; var8 < this.anInt918; ++var8) {
                    var9 = 0.0F;
                    var10 = 1;

                    for (var11 = 0; var11 < this.anInt913; ++var11) {
                        int var12 = var8 / var10 % var7;
                        float var13 = (float) this.anIntArray914[var12] * var16 + var15 + var9;
                        this.aFloatArrayArray916[var8][var11] = var13;
                        if (var6) {
                            var9 = var13;
                        }

                        var10 *= var7;
                    }
                }
            } else {
                for (var8 = 0; var8 < this.anInt918; ++var8) {
                    var9 = 0.0F;
                    var10 = var8 * this.anInt913;

                    for (var11 = 0; var11 < this.anInt913; ++var11) {
                        float var17 = (float) this.anIntArray914[var10] * var16 + var15 + var9;
                        this.aFloatArrayArray916[var8][var11] = var17;
                        if (var6) {
                            var9 = var17;
                        }

                        ++var10;
                    }
                }
            }
        }

    }

    static int method518(int var0, int var1) {
        int var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1;

        while (true) {
            int var3 = var2;
            int var4 = var1;

            int var5;
            for (var5 = 1; var4 > 1; var4 >>= 1) {
                if ((var4 & 1) != 0) {
                    var5 *= var3;
                }

                var3 *= var3;
            }

            int var6;
            if (var4 == 1) {
                var6 = var5 * var3;
            } else {
                var6 = var5;
            }

            if (var6 <= var0) {
                return var2;
            }

            --var2;
        }
    }

    void method521() {
        int[] var1 = new int[this.anInt918];
        int[] var2 = new int[33];

        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        for (var3 = 0; var3 < this.anInt918; ++var3) {
            var4 = this.anIntArray915[var3];
            if (var4 != 0) {
                var6 = 1 << 32 - var4;
                var7 = var2[var4];
                var1[var3] = var7;
                int var10;
                if ((var7 & var6) != 0) {
                    var8 = var2[var4 - 1];
                } else {
                    var8 = var7 | var6;

                    for (var9 = var4 - 1; var9 >= 1; --var9) {
                        var10 = var2[var9];
                        if (var10 != var7) {
                            break;
                        }

                        var11 = 1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }

                        var2[var9] = var10 | var11;
                    }
                }

                var2[var4] = var8;

                for (var9 = var4 + 1; var9 <= 32; ++var9) {
                    var10 = var2[var9];
                    if (var10 == var7) {
                        var2[var9] = var8;
                    }
                }
            }
        }

        this.anIntArray917 = new int[8];
        int var5 = 0;

        for (var3 = 0; var3 < this.anInt918; ++var3) {
            var4 = this.anIntArray915[var3];
            if (var4 != 0) {
                var6 = var1[var3];
                var7 = 0;

                for (var8 = 0; var8 < var4; ++var8) {
                    var9 = Integer.MIN_VALUE >>> var8;
                    if ((var6 & var9) != 0) {
                        if (this.anIntArray917[var7] == 0) {
                            this.anIntArray917[var7] = var5;
                        }

                        var7 = this.anIntArray917[var7];
                    } else {
                        ++var7;
                    }

                    if (var7 >= this.anIntArray917.length) {
                        int[] var12 = new int[this.anIntArray917.length * 2];

                        for (var11 = 0; var11 < this.anIntArray917.length; ++var11) {
                            var12[var11] = this.anIntArray917[var11];
                        }

                        this.anIntArray917 = var12;
                    }

                    var9 >>>= 1;
                }

                this.anIntArray917[var7] = ~var3;
                if (var7 >= var5) {
                    var5 = var7 + 1;
                }
            }
        }

    }

    int method520() {
        int var1;
        for (var1 = 0; this.anIntArray917[var1] >= 0; var1 = Node_Sub13.method591() != 0 ? this.anIntArray917[var1] : var1 + 1) {
        }

        return ~this.anIntArray917[var1];
    }

    float[] method519() {
        return this.aFloatArrayArray916[this.method520()];
    }
}
