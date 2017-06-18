public final class Node_Sub21_Sub26_Sub2 extends Node_Sub21_Sub26 {
    public byte[] aByteArray1361;
    public int[] anIntArray342;
    public int anInt206;
    public int anInt232;
    public int anInt327;
    public int anInt328;
    public int anInt221;
    public int anInt220;

    static void method1154(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            byte var12;
            for (var11 = var9; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1157(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = var3;

        for (int var13 = -var8; var13 < 0; ++var13) {
            int var14 = (var4 >> 16) * var11;

            for (int var15 = -var7; var15 < 0; ++var15) {
                byte var16 = var1[(var3 >> 16) + var14];
                if (var16 != 0) {
                    var0[var5++] = var2[var16 & 255];
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var12;
            var5 += var6;
        }

    }

    public void method308() {
        if (this.anInt206 != this.anInt221 || this.anInt232 != this.anInt220) {
            byte[] var1 = new byte[this.anInt221 * this.anInt220];
            int var2 = 0;

            for (int var3 = 0; var3 < this.anInt232; ++var3) {
                for (int var4 = 0; var4 < this.anInt206; ++var4) {
                    var1[var4 + this.anInt327 + (var3 + this.anInt328) * this.anInt221] = this.aByteArray1361[var2++];
                }
            }

            this.aByteArray1361 = var1;
            this.anInt206 = this.anInt221;
            this.anInt232 = this.anInt220;
            this.anInt327 = 0;
            this.anInt328 = 0;
        }
    }

    public void method1158(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anIntArray342.length; ++var4) {
            int var5 = this.anIntArray342[var4] >> 16 & 255;
            var5 += var1;
            if (var5 < 0) {
                var5 = 0;
            } else if (var5 > 255) {
                var5 = 255;
            }

            int var6 = this.anIntArray342[var4] >> 8 & 255;
            var6 += var2;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }

            int var7 = this.anIntArray342[var4] & 255;
            var7 += var3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }

            this.anIntArray342[var4] = (var5 << 16) + (var6 << 8) + var7;
        }

    }

    public void method1156(int var1, int var2, int var3, int var4) {
        int var5 = this.anInt206;
        int var6 = this.anInt232;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.anInt221;
        int var10 = this.anInt220;
        int var11 = (var9 << 16) / var3;
        int var12 = (var10 << 16) / var4;
        int var13;
        if (this.anInt327 > 0) {
            var13 = ((this.anInt327 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.anInt327 << 16);
        }

        if (this.anInt328 > 0) {
            var13 = ((this.anInt328 << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.anInt328 << 16);
        }

        if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }

        if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }

        var13 = var1 + var2 * anInt749;
        int var14 = anInt749 - var3;
        if (var2 + var4 > anInt753) {
            var4 -= var2 + var4 - anInt753;
        }

        int var15;
        if (var2 < anInt1257) {
            var15 = anInt1257 - var2;
            var4 -= var15;
            var13 += var15 * anInt749;
            var8 += var12 * var15;
        }

        if (var1 + var3 > anInt745) {
            var15 = var1 + var3 - anInt745;
            var3 -= var15;
            var14 += var15;
        }

        if (var1 < anInt754) {
            var15 = anInt754 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
        }

        method1157(anIntArray953, this.aByteArray1361, this.anIntArray342, var7, var8, var13, var14, var3, var4, var11, var12, var5);
    }

    public void method1155(int var1, int var2) {
        var1 += this.anInt327;
        var2 += this.anInt328;
        int var3 = var1 + var2 * anInt749;
        int var4 = 0;
        int var5 = this.anInt232;
        int var6 = this.anInt206;
        int var7 = anInt749 - var6;
        int var8 = 0;
        int var9;
        if (var2 < anInt1257) {
            var9 = anInt1257 - var2;
            var5 -= var9;
            var2 = anInt1257;
            var4 += var9 * var6;
            var3 += var9 * anInt749;
        }

        if (var2 + var5 > anInt753) {
            var5 -= var2 + var5 - anInt753;
        }

        if (var1 < anInt754) {
            var9 = anInt754 - var1;
            var6 -= var9;
            var1 = anInt754;
            var4 += var9;
            var3 += var9;
            var8 += var9;
            var7 += var9;
        }

        if (var1 + var6 > anInt745) {
            var9 = var1 + var6 - anInt745;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method1154(anIntArray953, this.aByteArray1361, this.anIntArray342, var4, var3, var6, var5, var7, var8);
        }
    }
}
