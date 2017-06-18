public final class Sprite extends Node_Sub21_Sub26 {
    public int width;
    public int height;
    public int[] pixels;
    public int anInt221;
    public int anInt328;
    public int anInt232;
    int anInt327;

    public Sprite(int var1, int var2) {
        this(new int[var1 * var2], var1, var2);
    }

    public Sprite(int[] var1, int var2, int var3) {
        this.pixels = var1;
        this.width = this.anInt328 = var2;
        this.height = this.anInt221 = var3;
        this.anInt327 = 0;
        this.anInt232 = 0;
    }

    Sprite() {
    }

    static void method1231(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        int var13 = 256 - var12;
        int var14 = var3;

        for (int var15 = -var8; var15 < 0; ++var15) {
            int var16 = (var4 >> 16) * var11;

            for (int var17 = -var7; var17 < 0; ++var17) {
                var2 = var1[(var3 >> 16) + var16];
                if (var2 != 0) {
                    int var18 = var0[var5];
                    var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var14;
            var5 += var6;
        }

    }

    static void method1244(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = var3;

        for (int var13 = -var8; var13 < 0; ++var13) {
            int var14 = (var4 >> 16) * var11;

            for (int var15 = -var7; var15 < 0; ++var15) {
                var2 = var1[(var3 >> 16) + var14];
                if (var2 != 0) {
                    var0[var5++] = var2;
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

    static void method1243(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        int var11 = 256 - var9;
        int var12 = (var10 & 16711935) * var11 & -16711936;
        int var13 = (var10 & '\uff00') * var11 & 16711680;
        var10 = (var12 | var13) >>> 8;

        for (int var14 = -var6; var14 < 0; ++var14) {
            for (int var15 = -var5; var15 < 0; ++var15) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var12 = (var2 & 16711935) * var9 & -16711936;
                    var13 = (var2 & '\uff00') * var9 & 16711680;
                    var0[var4++] = ((var12 | var13) >>> 8) + var10;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1233(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10 = 256 - var9;

        for (int var11 = -var6; var11 < 0; ++var11) {
            for (int var12 = -var5; var12 < 0; ++var12) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    int var13 = var0[var4];
                    var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1235(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            for (var11 = var9; var11 < 0; ++var11) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1239(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        for (int var8 = -var5; var8 < 0; ++var8) {
            int var9;
            for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
                var0[var3++] = var1[var2++];
                var0[var3++] = var1[var2++];
                var0[var3++] = var1[var2++];
            }

            for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            }

            var3 += var6;
            var2 += var7;
        }

    }

    public Sprite method1241() {
        Sprite var1 = new Sprite(this.width, this.height);
        var1.anInt328 = this.anInt328;
        var1.anInt221 = this.anInt221;
        var1.anInt232 = this.anInt328 - this.width - this.anInt232;
        var1.anInt327 = this.anInt327;

        for (int var2 = 0; var2 < this.height; ++var2) {
            for (int var3 = 0; var3 < this.width; ++var3) {
                var1.pixels[var2 * this.width + var3] = this.pixels[var2 * this.width + this.width - 1 - var3];
            }
        }

        return var1;
    }

    public void method335() {
        method1211(this.pixels, this.width, this.height);
    }

    public void method935() {
        if (this.width != this.anInt328 || this.height != this.anInt221) {
            int[] var1 = new int[this.anInt328 * this.anInt221];

            for (int var2 = 0; var2 < this.height; ++var2) {
                for (int var3 = 0; var3 < this.width; ++var3) {
                    var1[(var2 + this.anInt327) * this.anInt328 + var3 + this.anInt232] = this.pixels[var2 * this.width + var3];
                }
            }

            this.pixels = var1;
            this.width = this.anInt328;
            this.height = this.anInt221;
            this.anInt232 = 0;
            this.anInt327 = 0;
        }
    }

    public void method869(int var1) {
        if (this.width != this.anInt328 || this.height != this.anInt221) {
            int var2 = var1;
            if (var1 > this.anInt232) {
                var2 = this.anInt232;
            }

            int var3 = var1;
            if (var1 + this.anInt232 + this.width > this.anInt328) {
                var3 = this.anInt328 - this.anInt232 - this.width;
            }

            int var4 = var1;
            if (var1 > this.anInt327) {
                var4 = this.anInt327;
            }

            int var5 = var1;
            if (var1 + this.anInt327 + this.height > this.anInt221) {
                var5 = this.anInt221 - this.anInt327 - this.height;
            }

            int var6 = this.width + var2 + var3;
            int var7 = this.height + var4 + var5;
            int[] var8 = new int[var6 * var7];

            for (int var9 = 0; var9 < this.height; ++var9) {
                for (int var10 = 0; var10 < this.width; ++var10) {
                    var8[(var9 + var4) * var6 + var10 + var2] = this.pixels[var9 * this.width + var10];
                }
            }

            this.pixels = var8;
            this.width = var6;
            this.height = var7;
            this.anInt232 -= var2;
            this.anInt327 -= var4;
        }
    }

    public void method1123() {
        int[] var1 = new int[this.width * this.height];
        int var2 = 0;

        for (int var3 = 0; var3 < this.height; ++var3) {
            for (int var4 = this.width - 1; var4 >= 0; --var4) {
                var1[var2++] = this.pixels[var4 + var3 * this.width];
            }
        }

        this.pixels = var1;
        this.anInt232 = this.anInt328 - this.width - this.anInt232;
    }

    public void method1240(int var1) {
        for (int var2 = this.height - 1; var2 > 0; --var2) {
            int var3 = var2 * this.width;

            for (int var4 = this.width - 1; var4 > 0; --var4) {
                if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.width] != 0) {
                    this.pixels[var4 + var3] = var1;
                }
            }
        }

    }

    public Sprite method1238() {
        Sprite var1 = new Sprite(this.anInt328, this.anInt221);

        for (int var2 = 0; var2 < this.height; ++var2) {
            for (int var3 = 0; var3 < this.width; ++var3) {
                var1.pixels[(var2 + this.anInt327) * this.anInt328 + var3 + this.anInt232] = this.pixels[var2 * this.width + var3];
            }
        }

        return var1;
    }

    public void method1236(int var1, int var2, int var3, int var4) {
        var1 += this.anInt232;
        var2 += this.anInt327;
        int var5 = var1 + var2 * anInt749;
        int var6 = 0;
        int var7 = this.height;
        int var8 = this.width;
        int var9 = anInt749 - var8;
        int var10 = 0;
        int var11;
        if (var2 < anInt1257) {
            var11 = anInt1257 - var2;
            var7 -= var11;
            var2 = anInt1257;
            var6 += var11 * var8;
            var5 += var11 * anInt749;
        }

        if (var2 + var7 > anInt753) {
            var7 -= var2 + var7 - anInt753;
        }

        if (var1 < anInt754) {
            var11 = anInt754 - var1;
            var8 -= var11;
            var1 = anInt754;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
        }

        if (var1 + var8 > anInt745) {
            var11 = var1 + var8 - anInt745;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
        }

        if (var8 > 0 && var7 > 0) {
            method1243(anIntArray953, this.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4);
        }
    }

    public void method1245(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
        try {
            int var11 = -var3 / 2;
            int var12 = -var4 / 2;
            int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
            var13 = var13 * var8 >> 8;
            var14 = var14 * var8 >> 8;
            int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
            int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
            int var17 = var1 + var2 * anInt749;

            for (var2 = 0; var2 < var4; ++var2) {
                int var18 = var9[var2];
                int var19 = var17 + var18;
                int var20 = var15 + var14 * var18;
                int var21 = var16 - var13 * var18;

                for (var1 = -var10[var2]; var1 < 0; ++var1) {
                    anIntArray953[var19++] = this.pixels[(var20 >> 16) + (var21 >> 16) * this.width];
                    var20 += var14;
                    var21 -= var13;
                }

                var15 += var13;
                var16 += var14;
                var17 += anInt749;
            }
        } catch (Exception var23) {
        }

    }

    public void method1232(int var1) {
        int[] var2 = new int[this.width * this.height];
        int var3 = 0;

        for (int var4 = 0; var4 < this.height; ++var4) {
            for (int var5 = 0; var5 < this.width; ++var5) {
                int var6 = this.pixels[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.pixels[var3 - 1] != 0) {
                        var6 = var1;
                    } else if (var4 > 0 && this.pixels[var3 - this.width] != 0) {
                        var6 = var1;
                    } else if (var5 < this.width - 1 && this.pixels[var3 + 1] != 0) {
                        var6 = var1;
                    } else if (var4 < this.height - 1 && this.pixels[var3 + this.width] != 0) {
                        var6 = var1;
                    }
                }

                var2[var3++] = var6;
            }
        }

        this.pixels = var2;
    }

    public void method1242(int var1, int var2) {
        var1 += this.anInt232;
        var2 += this.anInt327;
        int var3 = var1 + var2 * anInt749;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
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
            method1239(anIntArray953, this.pixels, var4, var3, var6, var5, var7, var8);
        }
    }

    public void method1230(int var1, int var2) {
        var1 += this.anInt232;
        var2 += this.anInt327;
        int var3 = var1 + var2 * anInt749;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
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
            method1235(anIntArray953, this.pixels, 0, var4, var3, var6, var5, var7, var8);
        }
    }

    public void method1248(int var1, int var2, int var3, int var4) {
        this.method440(this.anInt328 << 3, this.anInt221 << 3, var1 << 4, var2 << 4, var3, var4);
    }

    void method440(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var6 != 0) {
            var1 -= this.anInt232 << 4;
            var2 -= this.anInt327 << 4;
            double var7 = (double) (var5 & '\uffff') * 9.587379924285257E-5D;
            int var9 = (int) Math.floor(Math.sin(var7) * (double) var6 + 0.5D);
            int var10 = (int) Math.floor(Math.cos(var7) * (double) var6 + 0.5D);
            int var11 = -var1 * var10 + -var2 * var9;
            int var12 = -(-var1) * var9 + -var2 * var10;
            int var13 = ((this.width << 4) - var1) * var10 + -var2 * var9;
            int var14 = -((this.width << 4) - var1) * var9 + -var2 * var10;
            int var15 = -var1 * var10 + ((this.height << 4) - var2) * var9;
            int var16 = -(-var1) * var9 + ((this.height << 4) - var2) * var10;
            int var17 = ((this.width << 4) - var1) * var10 + ((this.height << 4) - var2) * var9;
            int var18 = -((this.width << 4) - var1) * var9 + ((this.height << 4) - var2) * var10;
            int var19;
            int var20;
            if (var11 < var13) {
                var19 = var11;
                var20 = var13;
            } else {
                var19 = var13;
                var20 = var11;
            }

            if (var15 < var19) {
                var19 = var15;
            }

            if (var17 < var19) {
                var19 = var17;
            }

            if (var15 > var20) {
                var20 = var15;
            }

            if (var17 > var20) {
                var20 = var17;
            }

            int var21;
            int var22;
            if (var12 < var14) {
                var21 = var12;
                var22 = var14;
            } else {
                var21 = var14;
                var22 = var12;
            }

            if (var16 < var21) {
                var21 = var16;
            }

            if (var18 < var21) {
                var21 = var18;
            }

            if (var16 > var22) {
                var22 = var16;
            }

            if (var18 > var22) {
                var22 = var18;
            }

            var19 >>= 12;
            var20 = var20 + 4095 >> 12;
            var21 >>= 12;
            var22 = var22 + 4095 >> 12;
            var19 += var3;
            var20 += var3;
            var21 += var4;
            var22 += var4;
            var19 >>= 4;
            var20 = var20 + 15 >> 4;
            var21 >>= 4;
            var22 = var22 + 15 >> 4;
            if (var19 < anInt754) {
                var19 = anInt754;
            }

            if (var20 > anInt745) {
                var20 = anInt745;
            }

            if (var21 < anInt1257) {
                var21 = anInt1257;
            }

            if (var22 > anInt753) {
                var22 = anInt753;
            }

            var20 = var19 - var20;
            if (var20 < 0) {
                var22 = var21 - var22;
                if (var22 < 0) {
                    int var23 = var21 * anInt749 + var19;
                    double var24 = 1.6777216E7D / (double) var6;
                    int var26 = (int) Math.floor(Math.sin(var7) * var24 + 0.5D);
                    int var27 = (int) Math.floor(Math.cos(var7) * var24 + 0.5D);
                    int var28 = (var19 << 4) + 8 - var3;
                    int var29 = (var21 << 4) + 8 - var4;
                    int var30 = (var1 << 8) - (var29 * var26 >> 4);
                    int var31 = (var2 << 8) + (var29 * var27 >> 4);
                    int var32;
                    int var33;
                    int var34;
                    int var35;
                    int var36;
                    int var37;
                    int var38;
                    if (var27 == 0) {
                        if (var26 == 0) {
                            for (var32 = var22; var32 < 0; var23 += anInt749) {
                                var33 = var23;
                                var34 = var30;
                                var35 = var31;
                                var36 = var20;
                                if (var30 >= 0 && var31 >= 0 && var30 - (this.width << 12) < 0 && var31 - (this.height << 12) < 0) {
                                    for (; var36 < 0; ++var36) {
                                        var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                        if (var38 != 0) {
                                            anIntArray953[var33++] = var38;
                                        } else {
                                            ++var33;
                                        }
                                    }
                                }

                                ++var32;
                            }
                        } else if (var26 < 0) {
                            for (var32 = var22; var32 < 0; var23 += anInt749) {
                                var33 = var23;
                                var34 = var30;
                                var35 = var31 + (var28 * var26 >> 4);
                                var36 = var20;
                                if (var30 >= 0 && var30 - (this.width << 12) < 0) {
                                    if ((var37 = var35 - (this.height << 12)) >= 0) {
                                        var37 = (var26 - var37) / var26;
                                        var36 = var20 + var37;
                                        var35 += var26 * var37;
                                        var33 = var23 + var37;
                                    }

                                    if ((var37 = (var35 - var26) / var26) > var36) {
                                        var36 = var37;
                                    }

                                    while (var36 < 0) {
                                        var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                        if (var38 != 0) {
                                            anIntArray953[var33++] = var38;
                                        } else {
                                            ++var33;
                                        }

                                        var35 += var26;
                                        ++var36;
                                    }
                                }

                                ++var32;
                                var30 -= var26;
                            }
                        } else {
                            for (var32 = var22; var32 < 0; var23 += anInt749) {
                                var33 = var23;
                                var34 = var30;
                                var35 = var31 + (var28 * var26 >> 4);
                                var36 = var20;
                                if (var30 >= 0 && var30 - (this.width << 12) < 0) {
                                    if (var35 < 0) {
                                        var37 = (var26 - 1 - var35) / var26;
                                        var36 = var20 + var37;
                                        var35 += var26 * var37;
                                        var33 = var23 + var37;
                                    }

                                    if ((var37 = (var35 + 1 - (this.height << 12) - var26) / var26) > var36) {
                                        var36 = var37;
                                    }

                                    while (var36 < 0) {
                                        var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                        if (var38 != 0) {
                                            anIntArray953[var33++] = var38;
                                        } else {
                                            ++var33;
                                        }

                                        var35 += var26;
                                        ++var36;
                                    }
                                }

                                ++var32;
                                var30 -= var26;
                            }
                        }
                    } else if (var27 < 0) {
                        if (var26 == 0) {
                            for (var32 = var22; var32 < 0; var23 += anInt749) {
                                var33 = var23;
                                var34 = var30 + (var28 * var27 >> 4);
                                var35 = var31;
                                var36 = var20;
                                if (var31 >= 0 && var31 - (this.height << 12) < 0) {
                                    if ((var37 = var34 - (this.width << 12)) >= 0) {
                                        var37 = (var27 - var37) / var27;
                                        var36 = var20 + var37;
                                        var34 += var27 * var37;
                                        var33 = var23 + var37;
                                    }

                                    if ((var37 = (var34 - var27) / var27) > var36) {
                                        var36 = var37;
                                    }

                                    while (var36 < 0) {
                                        var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                        if (var38 != 0) {
                                            anIntArray953[var33++] = var38;
                                        } else {
                                            ++var33;
                                        }

                                        var34 += var27;
                                        ++var36;
                                    }
                                }

                                ++var32;
                                var31 += var27;
                            }
                        } else if (var26 < 0) {
                            for (var32 = var22; var32 < 0; var23 += anInt749) {
                                var33 = var23;
                                var34 = var30 + (var28 * var27 >> 4);
                                var35 = var31 + (var28 * var26 >> 4);
                                var36 = var20;
                                if ((var37 = var34 - (this.width << 12)) >= 0) {
                                    var37 = (var27 - var37) / var27;
                                    var36 = var20 + var37;
                                    var34 += var27 * var37;
                                    var35 += var26 * var37;
                                    var33 = var23 + var37;
                                }

                                if ((var37 = (var34 - var27) / var27) > var36) {
                                    var36 = var37;
                                }

                                if ((var37 = var35 - (this.height << 12)) >= 0) {
                                    var37 = (var26 - var37) / var26;
                                    var36 += var37;
                                    var34 += var27 * var37;
                                    var35 += var26 * var37;
                                    var33 += var37;
                                }

                                if ((var37 = (var35 - var26) / var26) > var36) {
                                    var36 = var37;
                                }

                                while (var36 < 0) {
                                    var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                    if (var38 != 0) {
                                        anIntArray953[var33++] = var38;
                                    } else {
                                        ++var33;
                                    }

                                    var34 += var27;
                                    var35 += var26;
                                    ++var36;
                                }

                                ++var32;
                                var30 -= var26;
                                var31 += var27;
                            }
                        } else {
                            for (var32 = var22; var32 < 0; var23 += anInt749) {
                                var33 = var23;
                                var34 = var30 + (var28 * var27 >> 4);
                                var35 = var31 + (var28 * var26 >> 4);
                                var36 = var20;
                                if ((var37 = var34 - (this.width << 12)) >= 0) {
                                    var37 = (var27 - var37) / var27;
                                    var36 = var20 + var37;
                                    var34 += var27 * var37;
                                    var35 += var26 * var37;
                                    var33 = var23 + var37;
                                }

                                if ((var37 = (var34 - var27) / var27) > var36) {
                                    var36 = var37;
                                }

                                if (var35 < 0) {
                                    var37 = (var26 - 1 - var35) / var26;
                                    var36 += var37;
                                    var34 += var27 * var37;
                                    var35 += var26 * var37;
                                    var33 += var37;
                                }

                                if ((var37 = (var35 + 1 - (this.height << 12) - var26) / var26) > var36) {
                                    var36 = var37;
                                }

                                while (var36 < 0) {
                                    var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                    if (var38 != 0) {
                                        anIntArray953[var33++] = var38;
                                    } else {
                                        ++var33;
                                    }

                                    var34 += var27;
                                    var35 += var26;
                                    ++var36;
                                }

                                ++var32;
                                var30 -= var26;
                                var31 += var27;
                            }
                        }
                    } else if (var26 == 0) {
                        for (var32 = var22; var32 < 0; var23 += anInt749) {
                            var33 = var23;
                            var34 = var30 + (var28 * var27 >> 4);
                            var35 = var31;
                            var36 = var20;
                            if (var31 >= 0 && var31 - (this.height << 12) < 0) {
                                if (var34 < 0) {
                                    var37 = (var27 - 1 - var34) / var27;
                                    var36 = var20 + var37;
                                    var34 += var27 * var37;
                                    var33 = var23 + var37;
                                }

                                if ((var37 = (var34 + 1 - (this.width << 12) - var27) / var27) > var36) {
                                    var36 = var37;
                                }

                                while (var36 < 0) {
                                    var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                    if (var38 != 0) {
                                        anIntArray953[var33++] = var38;
                                    } else {
                                        ++var33;
                                    }

                                    var34 += var27;
                                    ++var36;
                                }
                            }

                            ++var32;
                            var31 += var27;
                        }
                    } else if (var26 < 0) {
                        for (var32 = var22; var32 < 0; var23 += anInt749) {
                            var33 = var23;
                            var34 = var30 + (var28 * var27 >> 4);
                            var35 = var31 + (var28 * var26 >> 4);
                            var36 = var20;
                            if (var34 < 0) {
                                var37 = (var27 - 1 - var34) / var27;
                                var36 = var20 + var37;
                                var34 += var27 * var37;
                                var35 += var26 * var37;
                                var33 = var23 + var37;
                            }

                            if ((var37 = (var34 + 1 - (this.width << 12) - var27) / var27) > var36) {
                                var36 = var37;
                            }

                            if ((var37 = var35 - (this.height << 12)) >= 0) {
                                var37 = (var26 - var37) / var26;
                                var36 += var37;
                                var34 += var27 * var37;
                                var35 += var26 * var37;
                                var33 += var37;
                            }

                            if ((var37 = (var35 - var26) / var26) > var36) {
                                var36 = var37;
                            }

                            while (var36 < 0) {
                                var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                if (var38 != 0) {
                                    anIntArray953[var33++] = var38;
                                } else {
                                    ++var33;
                                }

                                var34 += var27;
                                var35 += var26;
                                ++var36;
                            }

                            ++var32;
                            var30 -= var26;
                            var31 += var27;
                        }
                    } else {
                        for (var32 = var22; var32 < 0; var23 += anInt749) {
                            var33 = var23;
                            var34 = var30 + (var28 * var27 >> 4);
                            var35 = var31 + (var28 * var26 >> 4);
                            var36 = var20;
                            if (var34 < 0) {
                                var37 = (var27 - 1 - var34) / var27;
                                var36 = var20 + var37;
                                var34 += var27 * var37;
                                var35 += var26 * var37;
                                var33 = var23 + var37;
                            }

                            if ((var37 = (var34 + 1 - (this.width << 12) - var27) / var27) > var36) {
                                var36 = var37;
                            }

                            if (var35 < 0) {
                                var37 = (var26 - 1 - var35) / var26;
                                var36 += var37;
                                var34 += var27 * var37;
                                var35 += var26 * var37;
                                var33 += var37;
                            }

                            if ((var37 = (var35 + 1 - (this.height << 12) - var26) / var26) > var36) {
                                var36 = var37;
                            }

                            while (var36 < 0) {
                                var38 = this.pixels[(var35 >> 12) * this.width + (var34 >> 12)];
                                if (var38 != 0) {
                                    anIntArray953[var33++] = var38;
                                } else {
                                    ++var33;
                                }

                                var34 += var27;
                                var35 += var26;
                                ++var36;
                            }

                            ++var32;
                            var30 -= var26;
                            var31 += var27;
                        }
                    }

                }
            }
        }
    }

    public void method1237(int var1, int var2, int var3) {
        var1 += this.anInt232;
        var2 += this.anInt327;
        int var4 = var1 + var2 * anInt749;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = anInt749 - var7;
        int var9 = 0;
        int var10;
        if (var2 < anInt1257) {
            var10 = anInt1257 - var2;
            var6 -= var10;
            var2 = anInt1257;
            var5 += var10 * var7;
            var4 += var10 * anInt749;
        }

        if (var2 + var6 > anInt753) {
            var6 -= var2 + var6 - anInt753;
        }

        if (var1 < anInt754) {
            var10 = anInt754 - var1;
            var7 -= var10;
            var1 = anInt754;
            var5 += var10;
            var4 += var10;
            var9 += var10;
            var8 += var10;
        }

        if (var1 + var7 > anInt745) {
            var10 = var1 + var7 - anInt745;
            var7 -= var10;
            var9 += var10;
            var8 += var10;
        }

        if (var7 > 0 && var6 > 0) {
            method1233(anIntArray953, this.pixels, 0, var5, var4, var7, var6, var8, var9, var3);
        }
    }

    public void method1247(int var1, int var2, int var3, int var4) {
        if (var3 > 0 && var4 > 0) {
            int var5 = this.width;
            int var6 = this.height;
            int var7 = 0;
            int var8 = 0;
            int var9 = this.anInt328;
            int var10 = this.anInt221;
            int var11 = (var9 << 16) / var3;
            int var12 = (var10 << 16) / var4;
            int var13;
            if (this.anInt232 > 0) {
                var13 = ((this.anInt232 << 16) + var11 - 1) / var11;
                var1 += var13;
                var7 += var13 * var11 - (this.anInt232 << 16);
            }

            if (this.anInt327 > 0) {
                var13 = ((this.anInt327 << 16) + var12 - 1) / var12;
                var2 += var13;
                var8 += var13 * var12 - (this.anInt327 << 16);
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

            method1244(anIntArray953, this.pixels, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
        }
    }

    public void method1234(int var1, int var2, int var3, int var4) {
        if (var3 <= this.anInt328 && var4 <= this.anInt221) {
            int var5 = var1 + this.anInt232 * var3 / this.anInt328;
            int var6 = var1 + ((this.anInt232 + this.width) * var3 + this.anInt328 - 1) / this.anInt328;
            int var7 = var2 + this.anInt327 * var4 / this.anInt221;
            int var8 = var2 + ((this.anInt327 + this.height) * var4 + this.anInt221 - 1) / this.anInt221;
            if (var5 < anInt754) {
                var5 = anInt754;
            }

            if (var6 > anInt745) {
                var6 = anInt745;
            }

            if (var7 < anInt1257) {
                var7 = anInt1257;
            }

            if (var8 > anInt753) {
                var8 = anInt753;
            }

            if (var5 < var6 && var7 < var8) {
                int var9 = var7 * anInt749 + var5;
                int var10 = anInt749 - (var6 - var5);
                if (var9 < anIntArray953.length) {
                    for (int var11 = var7; var11 < var8; ++var11) {
                        for (int var12 = var5; var12 < var6; ++var12) {
                            int var13 = var12 - var1 << 4;
                            int var14 = var11 - var2 << 4;
                            int var15 = var13 * this.anInt328 / var3 - (this.anInt232 << 4);
                            int var16 = (var13 + 16) * this.anInt328 / var3 - (this.anInt232 << 4);
                            int var17 = var14 * this.anInt221 / var4 - (this.anInt327 << 4);
                            int var18 = (var14 + 16) * this.anInt221 / var4 - (this.anInt327 << 4);
                            int var19 = (var16 - var15) * (var18 - var17) >> 1;
                            if (var19 != 0) {
                                if (var15 < 0) {
                                    var15 = 0;
                                }

                                if (var16 >= this.width << 4) {
                                    var16 = this.width << 4;
                                }

                                if (var17 < 0) {
                                    var17 = 0;
                                }

                                if (var18 >= this.height << 4) {
                                    var18 = this.height << 4;
                                }

                                --var16;
                                --var18;
                                int var20 = 16 - (var15 & 15);
                                int var21 = (var16 & 15) + 1;
                                int var22 = 16 - (var17 & 15);
                                int var23 = (var18 & 15) + 1;
                                var15 >>= 4;
                                var16 >>= 4;
                                var17 >>= 4;
                                var18 >>= 4;
                                int var24 = 0;
                                int var25 = 0;
                                int var26 = 0;
                                int var27 = 0;

                                int var28;
                                for (var28 = var17; var28 <= var18; ++var28) {
                                    int var29 = 16;
                                    if (var28 == var17) {
                                        var29 = var22;
                                    }

                                    if (var28 == var18) {
                                        var29 = var23;
                                    }

                                    for (int var30 = var15; var30 <= var16; ++var30) {
                                        int var31 = this.pixels[var28 * this.width + var30];
                                        if (var31 != 0) {
                                            int var32;
                                            if (var30 == var15) {
                                                var32 = var29 * var20;
                                            } else if (var30 == var16) {
                                                var32 = var29 * var21;
                                            } else {
                                                var32 = var29 << 4;
                                            }

                                            var27 += var32;
                                            var24 += (var31 >> 16 & 255) * var32;
                                            var25 += (var31 >> 8 & 255) * var32;
                                            var26 += (var31 & 255) * var32;
                                        }
                                    }
                                }

                                if (var27 >= var19) {
                                    var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                                    if (var28 == 0) {
                                        var28 = 1;
                                    }

                                    anIntArray953[var9] = var28;
                                }

                                ++var9;
                            }
                        }

                        var9 += var10;
                    }

                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method724() {
        int[] var1 = new int[this.width * this.height];
        int var2 = 0;

        for (int var3 = this.height - 1; var3 >= 0; --var3) {
            for (int var4 = 0; var4 < this.width; ++var4) {
                var1[var2++] = this.pixels[var4 + var3 * this.width];
            }
        }

        this.pixels = var1;
        this.anInt327 = this.anInt221 - this.height - this.anInt327;
    }

    public void method1250(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
        int var9 = var2 < 0 ? -var2 : 0;
        int var10 = var2 + this.height <= var6 ? this.height : var6 - var2;
        int var11 = var1 < 0 ? -var1 : 0;
        int var10000;
        if (var1 + this.width <= var5) {
            var10000 = this.width;
        } else {
            var10000 = var5 - var1;
        }

        int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * anInt749;
        int var14 = var2 + var9;

        for (int var15 = var9; var15 < var10; ++var15) {
            int var16 = var7[var14];
            int var17 = var8[var14++];
            int var18 = var13;
            int var19;
            if (var1 < var16) {
                var19 = var16 - var1;
                var18 = var13 + (var19 - var11);
            } else {
                var19 = var11;
            }

            int var12;
            if (var1 + this.width <= var16 + var17) {
                var12 = this.width;
            } else {
                var12 = var16 + var17 - var1;
            }

            for (int var20 = var19; var20 < var12; ++var20) {
                int var21 = this.pixels[var20 + var15 * this.width];
                if (var21 != 0) {
                    anIntArray953[var18++] = var21;
                } else {
                    ++var18;
                }
            }

            var13 += anInt749;
        }

    }

    public void method1246(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
        try {
            int var10 = -var3 / 2;
            int var11 = -var4 / 2;
            int var12 = (int) (Math.sin(var7) * 65536.0D);
            int var13 = (int) (Math.cos(var7) * 65536.0D);
            var12 = var12 * var9 >> 8;
            var13 = var13 * var9 >> 8;
            int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
            int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
            int var16 = var1 + var2 * anInt749;

            for (var2 = 0; var2 < var4; ++var2) {
                int var17 = var16;
                int var18 = var14;
                int var19 = var15;

                for (var1 = -var3; var1 < 0; ++var1) {
                    int var20 = this.pixels[(var18 >> 16) + (var19 >> 16) * this.width];
                    if (var20 != 0) {
                        anIntArray953[var17++] = var20;
                    } else {
                        ++var17;
                    }

                    var18 += var13;
                    var19 -= var12;
                }

                var14 += var12;
                var15 += var13;
                var16 += anInt749;
            }
        } catch (Exception var22) {
        }

    }

    public void method1249(int var1, int var2, int var3, int var4, int var5) {
        if (var3 > 0 && var4 > 0) {
            int var6 = this.width;
            int var7 = this.height;
            int var8 = 0;
            int var9 = 0;
            int var10 = this.anInt328;
            int var11 = this.anInt221;
            int var12 = (var10 << 16) / var3;
            int var13 = (var11 << 16) / var4;
            int var14;
            if (this.anInt232 > 0) {
                var14 = ((this.anInt232 << 16) + var12 - 1) / var12;
                var1 += var14;
                var8 += var14 * var12 - (this.anInt232 << 16);
            }

            if (this.anInt327 > 0) {
                var14 = ((this.anInt327 << 16) + var13 - 1) / var13;
                var2 += var14;
                var9 += var14 * var13 - (this.anInt327 << 16);
            }

            if (var6 < var10) {
                var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }

            if (var7 < var11) {
                var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }

            var14 = var1 + var2 * anInt749;
            int var15 = anInt749 - var3;
            if (var2 + var4 > anInt753) {
                var4 -= var2 + var4 - anInt753;
            }

            int var16;
            if (var2 < anInt1257) {
                var16 = anInt1257 - var2;
                var4 -= var16;
                var14 += var16 * anInt749;
                var9 += var13 * var16;
            }

            if (var1 + var3 > anInt745) {
                var16 = var1 + var3 - anInt745;
                var3 -= var16;
                var15 += var16;
            }

            if (var1 < anInt754) {
                var16 = anInt754 - var1;
                var3 -= var16;
                var14 += var16;
                var8 += var12 * var16;
                var15 += var16;
            }

            method1231(anIntArray953, this.pixels, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
        }
    }
}
