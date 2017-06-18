package com.jagex;

public class DrawingArea extends DoublyNode {
    public static int areaLeft = 0;
    public static int areaWidth;
    public static int areaHeight;
    public static int areaTop = 0;
    public static int areaBottom = 0;
    public static int[] buffer;
    protected static int areaRight = 0;

    public static void setTarget(int[] var0, int var1, int var2) {
        buffer = var0;
        areaWidth = var1;
        areaHeight = var2;
        clip(0, 0, var1, var2);
    }

    static void method1222(int x, int y, int height, int colour, int alpha) {
        if (y >= areaTop && y < areaBottom) {
            if (x < areaLeft) {
                height -= areaLeft - x;
                x = areaLeft;
            }

            if (x + height > areaRight) {
                height = areaRight - x;
            }

            int intensity = 256 - alpha;
            int red = (colour >> 16 & 255) * alpha;
            int green = (colour >> 8 & 255) * alpha;
            int blue = (colour & 255) * alpha;
            int offset = x + y * areaWidth;

            for (int var10 = 0; var10 < height; ++var10) {
                int r = (buffer[offset] >> 16 & 255) * intensity;
                int g = (buffer[offset] >> 8 & 255) * intensity;
                int b = (buffer[offset] & 255) * intensity;
                int rgb = (red + r >> 8 << 16) + (green + g >> 8 << 8) + (blue + b >> 8);
                buffer[offset++] = rgb;
            }

        }
    }

    public static void method1219(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;
        int var9 = 65536 / var3;
        int var10 = var6;
        int var11 = 256 - var6;
        if (var0 < areaLeft) {
            var2 -= areaLeft - var0;
            var0 = areaLeft;
        }

        if (var1 < areaTop) {
            var8 += (areaTop - var1) * var9;
            var3 -= areaTop - var1;
            var1 = areaTop;
        }

        if (var0 + var2 > areaRight) {
            var2 = areaRight - var0;
        }

        if (var1 + var3 > areaBottom) {
            var3 = areaBottom - var1;
        }

        int var12 = var4 & 16711680;
        int var13 = var4 & '\uff00';
        int var14 = var4 & 255;
        int var15 = var12 * var6 >> 8;
        int var16 = var13 * var6 >> 8;
        int var17 = var14 * var6 >> 8;
        int var18 = areaWidth - var2;
        int var19 = var0 + var1 * areaWidth;

        for (int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for (var21 = -var2; var21 < 0; ++var21) {
                var22 = buffer[var19];
                var23 = var22 & 16711680;
                int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
                int var25 = var22 & '\uff00';
                int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
                int var27 = var22 & 255;
                int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
                buffer[var19++] = var24 + var26 + var28;
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
        if (var0 < areaLeft) {
            var2 -= areaLeft - var0;
            var0 = areaLeft;
        }

        if (var1 < areaTop) {
            var8 += (areaTop - var1) * var9;
            var3 -= areaTop - var1;
            var1 = areaTop;
        }

        if (var0 + var2 > areaRight) {
            var2 = areaRight - var0;
        }

        if (var1 + var3 > areaBottom) {
            var3 = areaBottom - var1;
        }

        int var12 = var4 & 16711680;
        int var13 = var4 & '\uff00';
        int var14 = var4 & 255;
        int var15 = var12 * var6 >> 8;
        int var16 = var13 * var6 >> 8;
        int var17 = var14 * var6 >> 8;
        int var18 = areaWidth - var2;
        int var19 = var0 + var1 * areaWidth;

        for (int var20 = 0; var20 < var3; ++var20) {
            int var21;
            int var22;
            int var23;
            for (var21 = -var2; var21 < 0; ++var21) {
                var22 = buffer[var19];
                var23 = var22 & 16711680;
                int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : var15 + (var23 * var11 >> 8) & 16711680);
                int var25 = var22 & '\uff00';
                int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : var16 + (var25 * var11 >> 8) & '\uff00');
                int var27 = var22 & 255;
                int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : var17 + (var27 * var11 >> 8));
                buffer[var19++] = var24 + var26 + var28;
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
        areaLeft = var0[0];
        areaTop = var0[1];
        areaRight = var0[2];
        areaBottom = var0[3];
    }

    public static void method1229(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;
        int var9 = var4 == var5 && var6 == var7 ? -1 : 65536 / var3;
        int var10 = var6;
        int var11 = 256 - var6;
        int var12 = var4;
        if (var0 < areaLeft) {
            var2 -= areaLeft - var0;
            var0 = areaLeft;
        }

        if (var1 < areaTop) {
            var8 += (areaTop - var1) * var9;
            var3 -= areaTop - var1;
            var1 = areaTop;
        }

        if (var0 + var2 > areaRight) {
            var2 = areaRight - var0;
        }

        if (var1 + var3 > areaBottom) {
            var3 = areaBottom - var1;
        }

        int var13 = areaWidth - var2;
        int var14 = var0 + var1 * areaWidth;

        for (int var15 = -var3; var15 < 0; ++var15) {
            int var16;
            int var17;
            for (var16 = -var2; var16 < 0; ++var16) {
                var17 = buffer[var14];
                int var18 = var12 + var17;
                int var19 = (var12 & 16711935) + (var17 & 16711935);
                int var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                if (var11 == 0) {
                    buffer[var14++] = var18 - var20 | var20 - (var20 >>> 8);
                } else {
                    int var21 = var18 - var20 | var20 - (var20 >>> 8);
                    buffer[var14++] = ((var21 & 16711935) * var10 >> 8 & 16711935) + ((var21 & '\uff00') * var10 >> 8 & '\uff00') + ((var17 & 16711935) * var11 >> 8 & 16711935) + ((var17 & '\uff00') * var11 >> 8 & '\uff00');
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
            if (var4 < areaTop) {
                var4 = areaTop;
            }

            int var5 = var1 + var2 + 1;
            if (var5 > areaBottom) {
                var5 = areaBottom;
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
                if (var12 < areaLeft) {
                    var12 = areaLeft;
                }

                var13 = var0 + var8;
                if (var13 > areaRight) {
                    var13 = areaRight;
                }

                var14 = var12 + var6 * areaWidth;

                for (var15 = var12; var15 < var13; ++var15) {
                    buffer[var14++] = var3;
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
                if (var12 < areaLeft) {
                    var12 = areaLeft;
                }

                var13 = var0 + var8;
                if (var13 > areaRight - 1) {
                    var13 = areaRight - 1;
                }

                var14 = var12 + var6 * areaWidth;

                for (var15 = var12; var15 <= var13; ++var15) {
                    buffer[var14++] = var3;
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
                if (var9 < areaTop) {
                    var9 = areaTop;
                }

                int var10 = var1 + var2 + 1;
                if (var10 > areaBottom) {
                    var10 = areaBottom;
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
                    if (var17 < areaLeft) {
                        var17 = areaLeft;
                    }

                    var18 = var0 + var13;
                    if (var18 > areaRight) {
                        var18 = areaRight;
                    }

                    var19 = var17 + var11 * areaWidth;

                    for (var20 = var17; var20 < var18; ++var20) {
                        var21 = (buffer[var19] >> 16 & 255) * var5;
                        var22 = (buffer[var19] >> 8 & 255) * var5;
                        var23 = (buffer[var19] & 255) * var5;
                        var24 = (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8) + (var8 + var23 >> 8);
                        buffer[var19++] = var24;
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
                    if (var17 < areaLeft) {
                        var17 = areaLeft;
                    }

                    var18 = var0 + var13;
                    if (var18 > areaRight - 1) {
                        var18 = areaRight - 1;
                    }

                    var19 = var17 + var11 * areaWidth;

                    for (var20 = var17; var20 <= var18; ++var20) {
                        var21 = (buffer[var19] >> 16 & 255) * var5;
                        var22 = (buffer[var19] >> 8 & 255) * var5;
                        var23 = (buffer[var19] & 255) * var5;
                        var24 = (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8) + (var8 + var23 >> 8);
                        buffer[var19++] = var24;
                    }

                    ++var11;
                    var16 += var14 + var14;
                }

            }
        }
    }

    public static void method1212(int var0, int var1, int var2, int var3, int var4, int var5) {
        if (var0 < areaLeft) {
            var2 -= areaLeft - var0;
            var0 = areaLeft;
        }

        if (var1 < areaTop) {
            var3 -= areaTop - var1;
            var1 = areaTop;
        }

        if (var0 + var2 > areaRight) {
            var2 = areaRight - var0;
        }

        if (var1 + var3 > areaBottom) {
            var3 = areaBottom - var1;
        }

        var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
        int var6 = 256 - var5;
        int var7 = areaWidth - var2;
        int var8 = var0 + var1 * areaWidth;

        for (int var9 = 0; var9 < var3; ++var9) {
            for (int var10 = -var2; var10 < 0; ++var10) {
                int var11 = buffer[var8];
                var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
                buffer[var8++] = var4 + var11;
            }

            var8 += var7;
        }

    }

    public static void method1223(int var0, int var1, int var2, int var3, int var4) {
        if (var0 < areaLeft) {
            var2 -= areaLeft - var0;
            var0 = areaLeft;
        }

        if (var1 < areaTop) {
            var3 -= areaTop - var1;
            var1 = areaTop;
        }

        if (var0 + var2 > areaRight) {
            var2 = areaRight - var0;
        }

        if (var1 + var3 > areaBottom) {
            var3 = areaBottom - var1;
        }

        int var5 = areaWidth - var2;
        int var6 = var0 + var1 * areaWidth;

        for (int var7 = -var3; var7 < 0; ++var7) {
            for (int var8 = -var2; var8 < 0; ++var8) {
                buffer[var6++] = var4;
            }

            var6 += var5;
        }

    }

    public static void method1218() {
        int var0 = 0;

        int var1;
        for (var1 = areaWidth * areaHeight - 7; var0 < var1; buffer[var0++] = 0) {
            buffer[var0++] = 0;
            buffer[var0++] = 0;
            buffer[var0++] = 0;
            buffer[var0++] = 0;
            buffer[var0++] = 0;
            buffer[var0++] = 0;
            buffer[var0++] = 0;
        }

        for (var1 += 7; var0 < var1; buffer[var0++] = 0) {
        }

    }

    public static void method1217(int var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = 0;
        int var7 = 65536 / var3;
        if (var0 < areaLeft) {
            var2 -= areaLeft - var0;
            var0 = areaLeft;
        }

        if (var1 < areaTop) {
            var6 += (areaTop - var1) * var7;
            var3 -= areaTop - var1;
            var1 = areaTop;
        }

        if (var0 + var2 > areaRight) {
            var2 = areaRight - var0;
        }

        if (var1 + var3 > areaBottom) {
            var3 = areaBottom - var1;
        }

        int var8 = areaWidth - var2;
        int var9 = var0 + var1 * areaWidth;

        for (int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for (int var14 = -var2; var14 < 0; ++var14) {
                buffer[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
        }

    }

    public static void method1204(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
        if (var0 + var2 >= 0 && var1 + var3 >= 0) {
            if (var0 < areaWidth && var1 < areaHeight) {
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

                if (var0 + var2 > areaWidth) {
                    var2 = areaWidth - var0;
                }

                if (var1 + var3 > areaHeight) {
                    var3 = areaHeight - var1;
                }

                int var10 = var6.length / var7;
                int var11 = areaWidth - var2;
                int var12 = var4 >>> 24;
                int var13 = var5 >>> 24;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                if (var12 == 255 && var13 == 255) {
                    var14 = (var1 + var9) * areaWidth + var0 + var8;

                    for (var15 = var1 + var9; var15 < var1 + var9 + var3; ++var15) {
                        for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                            var17 = (var15 - var1) % var10;
                            var18 = (var16 - var0) % var7;
                            if (var6[var17 * var7 + var18] != 0) {
                                buffer[var14++] = var5;
                            } else {
                                buffer[var14++] = var4;
                            }
                        }

                        var14 += var11;
                    }
                } else {
                    var14 = (var1 + var9) * areaWidth + var0 + var8;

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
                            int var22 = buffer[var14];
                            int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + ((var19 & '\uff00') * var20 + (var22 & '\uff00') * var21 & 16711680) >> 8;
                            buffer[var14++] = var23;
                        }

                        var14 += var11;
                    }
                }

            }
        }
    }

    public static void clip(int var0, int var1, int var2, int var3) {
        if (var0 < 0) {
            var0 = 0;
        }

        if (var1 < 0) {
            var1 = 0;
        }

        if (var2 > areaWidth) {
            var2 = areaWidth;
        }

        if (var3 > areaHeight) {
            var3 = areaHeight;
        }

        areaLeft = var0;
        areaTop = var1;
        areaRight = var2;
        areaBottom = var3;
    }

    public static void drawHLine(int x, int y, int size, int color) {
        if (y >= areaTop && y < areaBottom) {
            if (x < areaLeft) {
                size -= areaLeft - x;
                x = areaLeft;
            }

            if (x + size > areaRight) {
                size = areaRight - x;
            }

            int var4 = x + y * areaWidth;

            for (int var5 = 0; var5 < size; ++var5) {
                buffer[var4 + var5] = color;
            }

        }
    }

    public static void drawVLine(int x, int y, int size, int color) {
        if (x >= areaLeft && x < areaRight) {
            if (y < areaTop) {
                size -= areaTop - y;
                y = areaTop;
            }

            if (y + size > areaBottom) {
                size = areaBottom - y;
            }

            int var4 = x + y * areaWidth;

            for (int var5 = 0; var5 < size; ++var5) {
                buffer[var4 + var5 * areaWidth] = color;
            }

        }
    }

    static void method1227(int var0, int var1, int var2, int var3, int var4) {
        if (var0 >= areaLeft && var0 < areaRight) {
            if (var1 < areaTop) {
                var2 -= areaTop - var1;
                var1 = areaTop;
            }

            if (var1 + var2 > areaBottom) {
                var2 = areaBottom - var1;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var9 = var0 + var1 * areaWidth;

            for (int var10 = 0; var10 < var2; ++var10) {
                int var11 = (buffer[var9] >> 16 & 255) * var5;
                int var12 = (buffer[var9] >> 8 & 255) * var5;
                int var13 = (buffer[var9] & 255) * var5;
                int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
                buffer[var9] = var14;
                var9 += areaWidth;
            }

        }
    }

    public static void method1226(int var0, int var1, int var2, int var3, int var4) {
        var2 -= var0;
        var3 -= var1;
        if (var3 == 0) {
            if (var2 >= 0) {
                drawHLine(var0, var1, var2 + 1, var4);
            } else {
                drawHLine(var0 + var2, var1, -var2 + 1, var4);
            }

        } else if (var2 == 0) {
            if (var3 >= 0) {
                drawVLine(var0, var1, var3 + 1, var4);
            } else {
                drawVLine(var0, var1 + var3, -var3 + 1, var4);
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
                if (var0 < areaLeft) {
                    var1 += var5 * (areaLeft - var0);
                    var0 = areaLeft;
                }

                if (var2 >= areaRight) {
                    var2 = areaRight - 1;
                }

                while (var0 <= var2) {
                    var6 = var1 >> 16;
                    if (var6 >= areaTop && var6 < areaBottom) {
                        buffer[var0 + var6 * areaWidth] = var4;
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
                if (var1 < areaTop) {
                    var0 += var5 * (areaTop - var1);
                    var1 = areaTop;
                }

                if (var3 >= areaBottom) {
                    var3 = areaBottom - 1;
                }

                while (var1 <= var3) {
                    var6 = var0 >> 16;
                    if (var6 >= areaLeft && var6 < areaRight) {
                        buffer[var6 + var1 * areaWidth] = var4;
                    }

                    var0 += var5;
                    ++var1;
                }
            }

        }
    }

    static void method1224(int var0, int var1, int var2) {
        if (var0 >= areaLeft && var1 >= areaTop && var0 < areaRight && var1 < areaBottom) {
            buffer[var0 + var1 * areaWidth] = var2;
        }
    }

    public static void method1225(int var0, int var1, int var2, int[] var3, int[] var4) {
        int var5 = var0 + var1 * areaWidth;

        for (var1 = 0; var1 < var3.length; ++var1) {
            int var6 = var5 + var3[var1];

            for (var0 = -var4[var1]; var0 < 0; ++var0) {
                buffer[var6++] = var2;
            }

            var5 += areaWidth;
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
        if (areaLeft < var0) {
            areaLeft = var0;
        }

        if (areaTop < var1) {
            areaTop = var1;
        }

        if (areaRight > var2) {
            areaRight = var2;
        }

        if (areaBottom > var3) {
            areaBottom = var3;
        }

    }

    public static void method1210(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;
        int var9 = var4 == var5 && var6 == var7 ? -1 : 65536 / var3;
        int var10 = var6;
        int var11 = 256 - var6;
        if (var0 < areaLeft) {
            var2 -= areaLeft - var0;
            var0 = areaLeft;
        }

        if (var1 < areaTop) {
            var8 += (areaTop - var1) * var9;
            var3 -= areaTop - var1;
            var1 = areaTop;
        }

        if (var0 + var2 > areaRight) {
            var2 = areaRight - var0;
        }

        if (var1 + var3 > areaBottom) {
            var3 = areaBottom - var1;
        }

        int var12 = var4 >> 16;
        int var13 = (var4 & '\uff00') >> 8;
        int var14 = var4 & 255;
        int var15 = areaWidth - var2;
        int var16 = var0 + var1 * areaWidth;

        for (int var17 = 0; var17 < var3; ++var17) {
            int var18;
            int var19;
            int var20;
            for (var18 = -var2; var18 < 0; ++var18) {
                var19 = buffer[var16];
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

                buffer[var16++] = (var23 << 16) + (var24 << 8) + var25;
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
        areaLeft = 0;
        areaTop = 0;
        areaRight = areaWidth;
        areaBottom = areaHeight;
    }

    public static void method1207(int[] var0) {
        var0[0] = areaLeft;
        var0[1] = areaTop;
        var0[2] = areaRight;
        var0[3] = areaBottom;
    }

    public static void drawRectangle(int var0, int var1, int var2, int var3, int var4) {
        drawHLine(var0, var1, var2, var4);
        drawHLine(var0, var1 + var3 - 1, var2, var4);
        drawVLine(var0, var1, var3, var4);
        drawVLine(var0 + var2 - 1, var1, var3, var4);
    }
}
