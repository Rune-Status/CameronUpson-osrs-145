package com.jagex;

public class DrawingArea extends DoublyNode {
    public static int anInt754 = 0;
    public static int drawingAreaWidth;
    public static int anInt748;
    public static int anInt1257 = 0;
    public static int anInt753 = 0;
    public static int[] drawingAreaPixels;
    protected static int anInt745 = 0;

    public static void method1211(int[] var0, int var1, int var2) {
        drawingAreaPixels = var0;
        drawingAreaWidth = var1;
        anInt748 = var2;
        setClip(0, 0, var1, var2);
    }

    static void method1222(int x, int y, int height, int colour, int alpha) {
        if (y >= anInt1257 && y < anInt753) {
            if (x < anInt754) {
                height -= anInt754 - x;
                x = anInt754;
            }

            if (x + height > anInt745) {
                height = anInt745 - x;
            }

            int intensity = 256 - alpha;
            int red = (colour >> 16 & 255) * alpha;
            int green = (colour >> 8 & 255) * alpha;
            int blue = (colour & 255) * alpha;
            int offset = x + y * drawingAreaWidth;

            for (int var10 = 0; var10 < height; ++var10) {
                int r = (drawingAreaPixels[offset] >> 16 & 255) * intensity;
                int g = (drawingAreaPixels[offset] >> 8 & 255) * intensity;
                int b = (drawingAreaPixels[offset] & 255) * intensity;
                int rgb = (red + r >> 8 << 16) + (green + g >> 8 << 8) + (blue + b >> 8);
                drawingAreaPixels[offset++] = rgb;
            }

        }
    }

    public static void method1219(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;
        int var9 = 65536 / var3;
        int var10 = var6;
        int var11 = 256 - var6;
        if (var0 < anInt754) {
            var2 -= anInt754 - var0;
            var0 = anInt754;
        }

        if (var1 < anInt1257) {
            var8 += (anInt1257 - var1) * var9;
            var3 -= anInt1257 - var1;
            var1 = anInt1257;
        }

        if (var0 + var2 > anInt745) {
            var2 = anInt745 - var0;
        }

        if (var1 + var3 > anInt753) {
            var3 = anInt753 - var1;
        }

        int var12 = var4 & 16711680;
        int var13 = var4 & '\uff00';
        int var14 = var4 & 255;
        int var15 = var12 * var6 >> 8;
        int var16 = var13 * var6 >> 8;
        int var17 = var14 * var6 >> 8;
        int var18 = drawingAreaWidth - var2;
        int var19 = var0 + var1 * drawingAreaWidth;

        for (int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for (var21 = -var2; var21 < 0; ++var21) {
                var22 = drawingAreaPixels[var19];
                var23 = var22 & 16711680;
                int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
                int var25 = var22 & '\uff00';
                int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
                int var27 = var22 & 255;
                int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
                drawingAreaPixels[var19++] = var24 + var26 + var28;
            }

            if (var9 > 0) {
                var8 += var9;
                var21 = 65536 - var8 >> 8;
                var22 = var8 >> 8;
                if (var6 != var7) {
                    var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
                    var11 = 256 - var10;
                }

                if (var4 != var5) {
                    var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
                    var12 = var23 & 16711680;
                    var13 = var23 & '\uff00';
                    var14 = var23 & 255;
                    var15 = var12 * var10 >> 8;
                    var16 = var13 * var10 >> 8;
                    var17 = var14 * var10 >> 8;
                }
            }

            var19 += var18;
        }

    }

    public static void method1205(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;
        int var9 = 65536 / var3;
        int var10 = var6;
        int var11 = 256 - var6;
        if (var0 < anInt754) {
            var2 -= anInt754 - var0;
            var0 = anInt754;
        }

        if (var1 < anInt1257) {
            var8 += (anInt1257 - var1) * var9;
            var3 -= anInt1257 - var1;
            var1 = anInt1257;
        }

        if (var0 + var2 > anInt745) {
            var2 = anInt745 - var0;
        }

        if (var1 + var3 > anInt753) {
            var3 = anInt753 - var1;
        }

        int var12 = var4 & 16711680;
        int var13 = var4 & '\uff00';
        int var14 = var4 & 255;
        int var15 = var12 * var6 >> 8;
        int var16 = var13 * var6 >> 8;
        int var17 = var14 * var6 >> 8;
        int var18 = drawingAreaWidth - var2;
        int var19 = var0 + var1 * drawingAreaWidth;

        for (int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for (var21 = -var2; var21 < 0; ++var21) {
                var22 = drawingAreaPixels[var19];
                var23 = var22 & 16711680;
                int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
                int var25 = var22 & '\uff00';
                int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
                int var27 = var22 & 255;
                int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
                drawingAreaPixels[var19++] = var24 + var26 + var28;
            }

            if (var9 > 0) {
                var8 += var9;
                var21 = 65536 - var8 >> 8;
                var22 = var8 >> 8;
                if (var6 != var7) {
                    var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
                    var11 = 256 - var10;
                }

                if (var4 != var5) {
                    var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
                    var12 = var23 & 16711680;
                    var13 = var23 & '\uff00';
                    var14 = var23 & 255;
                    var15 = var12 * var10 >> 8;
                    var16 = var13 * var10 >> 8;
                    var17 = var14 * var10 >> 8;
                }
            }

            var19 += var18;
        }

    }

    public static void method1213(int[] var0) {
        anInt754 = var0[0];
        anInt1257 = var0[1];
        anInt745 = var0[2];
        anInt753 = var0[3];
    }

    public static void method1229(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;
        int var9 = var4 == var5 && var6 == var7 ? -1 : 65536 / var3;
        int var10 = var6;
        int var11 = 256 - var6;
        int var12 = var4;
        if (var0 < anInt754) {
            var2 -= anInt754 - var0;
            var0 = anInt754;
        }

        if (var1 < anInt1257) {
            var8 += (anInt1257 - var1) * var9;
            var3 -= anInt1257 - var1;
            var1 = anInt1257;
        }

        if (var0 + var2 > anInt745) {
            var2 = anInt745 - var0;
        }

        if (var1 + var3 > anInt753) {
            var3 = anInt753 - var1;
        }

        int var13 = drawingAreaWidth - var2;
        int var14 = var0 + var1 * drawingAreaWidth;

        for (int var15 = -var3; var15 < 0; ++var15) {
            int var16;
            int var17;
            for (var16 = -var2; var16 < 0; ++var16) {
                var17 = drawingAreaPixels[var14];
                int var18 = var12 + var17;
                int var19 = (var12 & 16711935) + (var17 & 16711935);
                int var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                if (var11 == 0) {
                    drawingAreaPixels[var14++] = var18 - var20 | var20 - (var20 >>> 8);
                } else {
                    int var21 = var18 - var20 | var20 - (var20 >>> 8);
                    drawingAreaPixels[var14++] = ((var21 & 16711935) * var10 >> 8 & 16711935) + ((var21 & '\uff00') * var10 >> 8 & '\uff00') + ((var17 & 16711935) * var11 >> 8 & 16711935) + ((var17 & '\uff00') * var11 >> 8 & '\uff00');
                }
            }

            if (var9 > 0) {
                var8 += var9;
                var16 = 65536 - var8 >> 8;
                var17 = var8 >> 8;
                if (var6 != var7) {
                    var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
                    var11 = 256 - var10;
                }

                if (var4 != var5) {
                    var12 = ((var4 & 16711935) * var16 + (var5 & 16711935) * var17 & -16711936) + ((var4 & '\uff00') * var16 + (var5 & '\uff00') * var17 & 16711680) >>> 8;
                }
            }

            var14 += var13;
        }

    }

    static void method1216(int var0, int var1, int var2, int var3) {
        if (var2 == 0) {
            method1224(var0, var1, var3);
        } else {
            if (var2 < 0) {
                var2 = -var2;
            }

            int var4 = var1 - var2;
            if (var4 < anInt1257) {
                var4 = anInt1257;
            }

            int var5 = var1 + var2 + 1;
            if (var5 > anInt753) {
                var5 = anInt753;
            }

            int var6 = var4;
            int var7 = var2 * var2;
            int var8 = 0;
            int var9 = var1 - var4;
            int var10 = var9 * var9;
            int var11 = var10 - var9;
            if (var1 > var5) {
                var1 = var5;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            while (var6 < var1) {
                while (var11 <= var7 || var10 <= var7) {
                    var10 += var8 + var8;
                    var11 += var8++ + var8;
                }

                var12 = var0 - var8 + 1;
                if (var12 < anInt754) {
                    var12 = anInt754;
                }

                var13 = var0 + var8;
                if (var13 > anInt745) {
                    var13 = anInt745;
                }

                var14 = var12 + var6 * drawingAreaWidth;

                for (var15 = var12; var15 < var13; ++var15) {
                    drawingAreaPixels[var14++] = var3;
                }

                ++var6;
                var10 -= var9-- + var9;
                var11 -= var9 + var9;
            }

            var8 = var2;
            var9 = var6 - var1;
            var11 = var9 * var9 + var7;
            var10 = var11 - var2;

            for (var11 -= var9; var6 < var5; var10 += var9++ + var9) {
                while (var11 > var7 && var10 > var7) {
                    var11 -= var8-- + var8;
                    var10 -= var8 + var8;
                }

                var12 = var0 - var8;
                if (var12 < anInt754) {
                    var12 = anInt754;
                }

                var13 = var0 + var8;
                if (var13 > anInt745 - 1) {
                    var13 = anInt745 - 1;
                }

                var14 = var12 + var6 * drawingAreaWidth;

                for (var15 = var12; var15 <= var13; ++var15) {
                    drawingAreaPixels[var14++] = var3;
                }

                ++var6;
                var11 += var9 + var9;
            }

        }
    }

    public static void method1221(int var0, int var1, int var2, int var3, int var4) {
        if (var4 != 0) {
            if (var4 == 256) {
                method1216(var0, var1, var2, var3);
            } else {
                if (var2 < 0) {
                    var2 = -var2;
                }

                int var5 = 256 - var4;
                int var6 = (var3 >> 16 & 255) * var4;
                int var7 = (var3 >> 8 & 255) * var4;
                int var8 = (var3 & 255) * var4;
                int var9 = var1 - var2;
                if (var9 < anInt1257) {
                    var9 = anInt1257;
                }

                int var10 = var1 + var2 + 1;
                if (var10 > anInt753) {
                    var10 = anInt753;
                }

                int var11 = var9;
                int var12 = var2 * var2;
                int var13 = 0;
                int var14 = var1 - var9;
                int var15 = var14 * var14;
                int var16 = var15 - var14;
                if (var1 > var10) {
                    var1 = var10;
                }

                int var17;
                int var18;
                int var19;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                while (var11 < var1) {
                    while (var16 <= var12 || var15 <= var12) {
                        var15 += var13 + var13;
                        var16 += var13++ + var13;
                    }

                    var17 = var0 - var13 + 1;
                    if (var17 < anInt754) {
                        var17 = anInt754;
                    }

                    var18 = var0 + var13;
                    if (var18 > anInt745) {
                        var18 = anInt745;
                    }

                    var19 = var17 + var11 * drawingAreaWidth;

                    for (var20 = var17; var20 < var18; ++var20) {
                        var21 = (drawingAreaPixels[var19] >> 16 & 255) * var5;
                        var22 = (drawingAreaPixels[var19] >> 8 & 255) * var5;
                        var23 = (drawingAreaPixels[var19] & 255) * var5;
                        var24 = (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8) + (var8 + var23 >> 8);
                        drawingAreaPixels[var19++] = var24;
                    }

                    ++var11;
                    var15 -= var14-- + var14;
                    var16 -= var14 + var14;
                }

                var13 = var2;
                var14 = -var14;
                var16 = var14 * var14 + var12;
                var15 = var16 - var2;

                for (var16 -= var14; var11 < var10; var15 += var14++ + var14) {
                    while (var16 > var12 && var15 > var12) {
                        var16 -= var13-- + var13;
                        var15 -= var13 + var13;
                    }

                    var17 = var0 - var13;
                    if (var17 < anInt754) {
                        var17 = anInt754;
                    }

                    var18 = var0 + var13;
                    if (var18 > anInt745 - 1) {
                        var18 = anInt745 - 1;
                    }

                    var19 = var17 + var11 * drawingAreaWidth;

                    for (var20 = var17; var20 <= var18; ++var20) {
                        var21 = (drawingAreaPixels[var19] >> 16 & 255) * var5;
                        var22 = (drawingAreaPixels[var19] >> 8 & 255) * var5;
                        var23 = (drawingAreaPixels[var19] & 255) * var5;
                        var24 = (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8) + (var8 + var23 >> 8);
                        drawingAreaPixels[var19++] = var24;
                    }

                    ++var11;
                    var16 += var14 + var14;
                }

            }
        }
    }

    public static void method1212(int var0, int var1, int var2, int var3, int var4, int var5) {
        if (var0 < anInt754) {
            var2 -= anInt754 - var0;
            var0 = anInt754;
        }

        if (var1 < anInt1257) {
            var3 -= anInt1257 - var1;
            var1 = anInt1257;
        }

        if (var0 + var2 > anInt745) {
            var2 = anInt745 - var0;
        }

        if (var1 + var3 > anInt753) {
            var3 = anInt753 - var1;
        }

        var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
        int var6 = 256 - var5;
        int var7 = drawingAreaWidth - var2;
        int var8 = var0 + var1 * drawingAreaWidth;

        for (int var9 = 0; var9 < var3; ++var9) {
            for (int var10 = -var2; var10 < 0; ++var10) {
                int var11 = drawingAreaPixels[var8];
                var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
                drawingAreaPixels[var8++] = var4 + var11;
            }

            var8 += var7;
        }

    }

    public static void method1223(int var0, int var1, int var2, int var3, int var4) {
        if (var0 < anInt754) {
            var2 -= anInt754 - var0;
            var0 = anInt754;
        }

        if (var1 < anInt1257) {
            var3 -= anInt1257 - var1;
            var1 = anInt1257;
        }

        if (var0 + var2 > anInt745) {
            var2 = anInt745 - var0;
        }

        if (var1 + var3 > anInt753) {
            var3 = anInt753 - var1;
        }

        int var5 = drawingAreaWidth - var2;
        int var6 = var0 + var1 * drawingAreaWidth;

        for (int var7 = -var3; var7 < 0; ++var7) {
            for (int var8 = -var2; var8 < 0; ++var8) {
                drawingAreaPixels[var6++] = var4;
            }

            var6 += var5;
        }

    }

    public static void method1218() {
        int var0 = 0;

        int var1;
        for (var1 = drawingAreaWidth * anInt748 - 7; var0 < var1; drawingAreaPixels[var0++] = 0) {
            drawingAreaPixels[var0++] = 0;
            drawingAreaPixels[var0++] = 0;
            drawingAreaPixels[var0++] = 0;
            drawingAreaPixels[var0++] = 0;
            drawingAreaPixels[var0++] = 0;
            drawingAreaPixels[var0++] = 0;
            drawingAreaPixels[var0++] = 0;
        }

        for (var1 += 7; var0 < var1; drawingAreaPixels[var0++] = 0) {
        }

    }

    public static void method1217(int var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = 0;
        int var7 = 65536 / var3;
        if (var0 < anInt754) {
            var2 -= anInt754 - var0;
            var0 = anInt754;
        }

        if (var1 < anInt1257) {
            var6 += (anInt1257 - var1) * var7;
            var3 -= anInt1257 - var1;
            var1 = anInt1257;
        }

        if (var0 + var2 > anInt745) {
            var2 = anInt745 - var0;
        }

        if (var1 + var3 > anInt753) {
            var3 = anInt753 - var1;
        }

        int var8 = drawingAreaWidth - var2;
        int var9 = var0 + var1 * drawingAreaWidth;

        for (int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for (int var14 = -var2; var14 < 0; ++var14) {
                drawingAreaPixels[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
        }

    }

    public static void method1204(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
        if (var0 + var2 >= 0 && var1 + var3 >= 0) {
            if (var0 < drawingAreaWidth && var1 < anInt748) {
                int var8 = 0;
                int var9 = 0;
                if (var0 < 0) {
                    var8 -= var0;
                    var2 += var0;
                }

                if (var1 < 0) {
                    var9 -= var1;
                    var3 += var1;
                }

                if (var0 + var2 > drawingAreaWidth) {
                    var2 = drawingAreaWidth - var0;
                }

                if (var1 + var3 > anInt748) {
                    var3 = anInt748 - var1;
                }

                int var10 = var6.length / var7;
                int var11 = drawingAreaWidth - var2;
                int var12 = var4 >>> 24;
                int var13 = var5 >>> 24;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                if (var12 == 255 && var13 == 255) {
                    var14 = (var1 + var9) * drawingAreaWidth + var0 + var8;

                    for (var15 = var1 + var9; var15 < var1 + var9 + var3; ++var15) {
                        for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                            var17 = (var15 - var1) % var10;
                            var18 = (var16 - var0) % var7;
                            if (var6[var17 * var7 + var18] != 0) {
                                drawingAreaPixels[var14++] = var5;
                            } else {
                                drawingAreaPixels[var14++] = var4;
                            }
                        }

                        var14 += var11;
                    }
                } else {
                    var14 = (var1 + var9) * drawingAreaWidth + var0 + var8;

                    for (var15 = var1 + var9; var15 < var1 + var9 + var3; ++var15) {
                        for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                            var17 = (var15 - var1) % var10;
                            var18 = (var16 - var0) % var7;
                            int var19 = var4;
                            if (var6[var17 * var7 + var18] != 0) {
                                var19 = var5;
                            }

                            int var20 = var19 >>> 24;
                            int var21 = 255 - var20;
                            int var22 = drawingAreaPixels[var14];
                            int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + ((var19 & '\uff00') * var20 + (var22 & '\uff00') * var21 & 16711680) >> 8;
                            drawingAreaPixels[var14++] = var23;
                        }

                        var14 += var11;
                    }
                }

            }
        }
    }

    public static void setClip(int var0, int var1, int var2, int var3) {
        if (var0 < 0) {
            var0 = 0;
        }

        if (var1 < 0) {
            var1 = 0;
        }

        if (var2 > drawingAreaWidth) {
            var2 = drawingAreaWidth;
        }

        if (var3 > anInt748) {
            var3 = anInt748;
        }

        anInt754 = var0;
        anInt1257 = var1;
        anInt745 = var2;
        anInt753 = var3;
    }

    public static void method1214(int var0, int var1, int var2, int var3) {
        if (var1 >= anInt1257 && var1 < anInt753) {
            if (var0 < anInt754) {
                var2 -= anInt754 - var0;
                var0 = anInt754;
            }

            if (var0 + var2 > anInt745) {
                var2 = anInt745 - var0;
            }

            int var4 = var0 + var1 * drawingAreaWidth;

            for (int var5 = 0; var5 < var2; ++var5) {
                drawingAreaPixels[var4 + var5] = var3;
            }

        }
    }

    public static void method1220(int var0, int var1, int var2, int var3) {
        if (var0 >= anInt754 && var0 < anInt745) {
            if (var1 < anInt1257) {
                var2 -= anInt1257 - var1;
                var1 = anInt1257;
            }

            if (var1 + var2 > anInt753) {
                var2 = anInt753 - var1;
            }

            int var4 = var0 + var1 * drawingAreaWidth;

            for (int var5 = 0; var5 < var2; ++var5) {
                drawingAreaPixels[var4 + var5 * drawingAreaWidth] = var3;
            }

        }
    }

    static void method1227(int var0, int var1, int var2, int var3, int var4) {
        if (var0 >= anInt754 && var0 < anInt745) {
            if (var1 < anInt1257) {
                var2 -= anInt1257 - var1;
                var1 = anInt1257;
            }

            if (var1 + var2 > anInt753) {
                var2 = anInt753 - var1;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var9 = var0 + var1 * drawingAreaWidth;

            for (int var10 = 0; var10 < var2; ++var10) {
                int var11 = (drawingAreaPixels[var9] >> 16 & 255) * var5;
                int var12 = (drawingAreaPixels[var9] >> 8 & 255) * var5;
                int var13 = (drawingAreaPixels[var9] & 255) * var5;
                int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
                drawingAreaPixels[var9] = var14;
                var9 += drawingAreaWidth;
            }

        }
    }

    public static void method1226(int var0, int var1, int var2, int var3, int var4) {
        var2 -= var0;
        var3 -= var1;
        if (var3 == 0) {
            if (var2 >= 0) {
                method1214(var0, var1, var2 + 1, var4);
            } else {
                method1214(var0 + var2, var1, -var2 + 1, var4);
            }

        } else if (var2 == 0) {
            if (var3 >= 0) {
                method1220(var0, var1, var3 + 1, var4);
            } else {
                method1220(var0, var1 + var3, -var3 + 1, var4);
            }

        } else {
            if (var2 + var3 < 0) {
                var0 += var2;
                var2 = -var2;
                var1 += var3;
                var3 = -var3;
            }

            int var5;
            int var6;
            if (var2 > var3) {
                var1 <<= 16;
                var1 += 32768;
                var3 <<= 16;
                var5 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
                var2 += var0;
                if (var0 < anInt754) {
                    var1 += var5 * (anInt754 - var0);
                    var0 = anInt754;
                }

                if (var2 >= anInt745) {
                    var2 = anInt745 - 1;
                }

                while (var0 <= var2) {
                    var6 = var1 >> 16;
                    if (var6 >= anInt1257 && var6 < anInt753) {
                        drawingAreaPixels[var0 + var6 * drawingAreaWidth] = var4;
                    }

                    var1 += var5;
                    ++var0;
                }
            } else {
                var0 <<= 16;
                var0 += 32768;
                var2 <<= 16;
                var5 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
                var3 += var1;
                if (var1 < anInt1257) {
                    var0 += var5 * (anInt1257 - var1);
                    var1 = anInt1257;
                }

                if (var3 >= anInt753) {
                    var3 = anInt753 - 1;
                }

                while (var1 <= var3) {
                    var6 = var0 >> 16;
                    if (var6 >= anInt754 && var6 < anInt745) {
                        drawingAreaPixels[var6 + var1 * drawingAreaWidth] = var4;
                    }

                    var0 += var5;
                    ++var1;
                }
            }

        }
    }

    static void method1224(int var0, int var1, int var2) {
        if (var0 >= anInt754 && var1 >= anInt1257 && var0 < anInt745 && var1 < anInt753) {
            drawingAreaPixels[var0 + var1 * drawingAreaWidth] = var2;
        }
    }

    public static void method1225(int var0, int var1, int var2, int[] var3, int[] var4) {
        int var5 = var0 + var1 * drawingAreaWidth;

        for (var1 = 0; var1 < var3.length; ++var1) {
            int var6 = var5 + var3[var1];

            for (var0 = -var4[var1]; var0 < 0; ++var0) {
                drawingAreaPixels[var6++] = var2;
            }

            var5 += drawingAreaWidth;
        }

    }

    public static void method1215(int var0, int var1, int var2, int var3, int var4, int var5) {
        method1222(var0, var1, var2, var4, var5);
        method1222(var0, var1 + var3 - 1, var2, var4, var5);
        if (var3 >= 3) {
            method1227(var0, var1 + 1, var3 - 2, var4, var5);
            method1227(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
        }

    }

    public static void method1228(int var0, int var1, int var2, int var3) {
        if (anInt754 < var0) {
            anInt754 = var0;
        }

        if (anInt1257 < var1) {
            anInt1257 = var1;
        }

        if (anInt745 > var2) {
            anInt745 = var2;
        }

        if (anInt753 > var3) {
            anInt753 = var3;
        }

    }

    public static void method1210(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;
        int var9 = var4 == var5 && var6 == var7 ? -1 : 65536 / var3;
        int var10 = var6;
        int var11 = 256 - var6;
        if (var0 < anInt754) {
            var2 -= anInt754 - var0;
            var0 = anInt754;
        }

        if (var1 < anInt1257) {
            var8 += (anInt1257 - var1) * var9;
            var3 -= anInt1257 - var1;
            var1 = anInt1257;
        }

        if (var0 + var2 > anInt745) {
            var2 = anInt745 - var0;
        }

        if (var1 + var3 > anInt753) {
            var3 = anInt753 - var1;
        }

        int var12 = var4 >> 16;
        int var13 = (var4 & '\uff00') >> 8;
        int var14 = var4 & 255;
        int var15 = drawingAreaWidth - var2;
        int var16 = var0 + var1 * drawingAreaWidth;

        for (int var17 = 0; var17 < var3; ++var17) {
            int var18;
            int var19;
            int var20;
            for (var18 = -var2; var18 < 0; ++var18) {
                var19 = drawingAreaPixels[var16];
                var20 = var19 >> 16;
                int var21 = (var19 & '\uff00') >> 8;
                int var22 = var19 & 255;
                int var23;
                int var24;
                int var25;
                if (var11 == 0) {
                    var23 = var20 < 127 ? var12 * var20 >> 7 : 255 - ((255 - var12) * (255 - var20) >> 7);
                    var24 = var21 < 127 ? var13 * var21 >> 7 : 255 - ((255 - var13) * (255 - var21) >> 7);
                    var25 = var22 < 127 ? var14 * var22 >> 7 : 255 - ((255 - var14) * (255 - var22) >> 7);
                } else {
                    var23 = var20 < 127 ? (var12 * var20 * var10 >> 7) + var20 * var11 >> 8 : (255 - ((255 - var12) * (255 - var20) >> 7)) * var10 + var20 * var11 >> 8;
                    var24 = var21 < 127 ? (var13 * var21 * var10 >> 7) + var21 * var11 >> 8 : (255 - ((255 - var13) * (255 - var21) >> 7)) * var10 + var21 * var11 >> 8;
                    var25 = var22 < 127 ? (var14 * var22 * var10 >> 7) + var22 * var11 >> 8 : (255 - ((255 - var14) * (255 - var22) >> 7)) * var10 + var22 * var11 >> 8;
                }

                drawingAreaPixels[var16++] = (var23 << 16) + (var24 << 8) + var25;
            }

            if (var9 > 0) {
                var8 += var9;
                var18 = 65536 - var8 >> 8;
                var19 = var8 >> 8;
                if (var6 != var7) {
                    var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
                    var11 = 256 - var10;
                }

                if (var4 != var5) {
                    var20 = ((var4 & 16711935) * var18 + (var5 & 16711935) * var19 & -16711936) + ((var4 & '\uff00') * var18 + (var5 & '\uff00') * var19 & 16711680) >>> 8;
                    var12 = var20 >> 16;
                    var13 = (var20 & '\uff00') >> 8;
                    var14 = var20 & 255;
                }
            }

            var16 += var15;
        }

    }

    public static void method1206() {
        anInt754 = 0;
        anInt1257 = 0;
        anInt745 = drawingAreaWidth;
        anInt753 = anInt748;
    }

    public static void method1207(int[] var0) {
        var0[0] = anInt754;
        var0[1] = anInt1257;
        var0[2] = anInt745;
        var0[3] = anInt753;
    }

    public static void method1208(int var0, int var1, int var2, int var3, int var4) {
        method1214(var0, var1, var2, var4);
        method1214(var0, var1 + var3 - 1, var2, var4);
        method1220(var0, var1, var3, var4);
        method1220(var0 + var2 - 1, var1, var3, var4);
    }
}
