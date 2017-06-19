package com.jagex;

public class Class34 {
    static final Class34 aClass34_275 = new Class34();
    static final Class34 aClass34_276 = new Class34();
    static final Class34 aClass34_273 = new Class34();
    static final Class34 aClass34_278 = new Class34();
    static CacheReferenceTable audioEffects;
    static int cameraY;
    static Class67 aClass67_277;

    static void method224() {
        Client.packet.writeHeader(144);
        Client.packet.method451(Node_Sub21_Sub20.method1126());
        Client.packet.method755(AxisAlignedBoundingBox.appletWidth);
        Client.packet.method755(Class64.appletHeight);
    }

    public static int method222(int var0, int var1, int var2, Class113 var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
        int var9;
        for (int var8 = 0; var8 < 128; ++var8) {
            for (var9 = 0; var9 < 128; ++var9) {
                Class112.anIntArrayArray1328[var8][var9] = 0;
                Class112.anIntArrayArray1327[var8][var9] = 99999999;
            }
        }

        int var10;
        int var11;
        byte var12;
        byte var13;
        int var14;
        int var15;
        byte var16;
        int var17;
        int[][] var18;
        int var19;
        int var20;
        int var22;
        int var23;
        boolean var28;
        boolean var29;
        int var30;
        int var31;
        int var33;
        if (var2 == 1) {
            var10 = var0;
            var11 = var1;
            var12 = 64;
            var13 = 64;
            var14 = var0 - var12;
            var15 = var1 - var13;
            Class112.anIntArrayArray1328[var12][var13] = 99;
            Class112.anIntArrayArray1327[var12][var13] = 0;
            var16 = 0;
            var17 = 0;
            Class112.anIntArray1330[var16] = var0;
            var33 = var16 + 1;
            Class112.anIntArray1329[var16] = var1;
            var18 = var4.flags;

            while (true) {
                if (var17 == var33) {
                    Class119.anInt1356 = var10;
                    Class112.anInt1331 = var11;
                    var29 = false;
                    break;
                }

                var10 = Class112.anIntArray1330[var17];
                var11 = Class112.anIntArray1329[var17];
                var17 = var17 + 1 & 4095;
                var30 = var10 - var14;
                var31 = var11 - var15;
                var19 = var10 - var4.insetX;
                var20 = var11 - var4.insetY;
                if (var3.method285(1, var10, var11, var4)) {
                    Class119.anInt1356 = var10;
                    Class112.anInt1331 = var11;
                    var29 = true;
                    break;
                }

                var22 = Class112.anIntArrayArray1327[var30][var31] + 1;
                if (var30 > 0 && Class112.anIntArrayArray1328[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
                    Class112.anIntArray1330[var33] = var10 - 1;
                    Class112.anIntArray1329[var33] = var11;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30 - 1][var31] = 2;
                    Class112.anIntArrayArray1327[var30 - 1][var31] = var22;
                }

                if (var30 < 127 && Class112.anIntArrayArray1328[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) {
                    Class112.anIntArray1330[var33] = var10 + 1;
                    Class112.anIntArray1329[var33] = var11;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30 + 1][var31] = 8;
                    Class112.anIntArrayArray1327[var30 + 1][var31] = var22;
                }

                if (var31 > 0 && Class112.anIntArrayArray1328[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
                    Class112.anIntArray1330[var33] = var10;
                    Class112.anIntArray1329[var33] = var11 - 1;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30][var31 - 1] = 1;
                    Class112.anIntArrayArray1327[var30][var31 - 1] = var22;
                }

                if (var31 < 127 && Class112.anIntArrayArray1328[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
                    Class112.anIntArray1330[var33] = var10;
                    Class112.anIntArray1329[var33] = var11 + 1;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30][var31 + 1] = 4;
                    Class112.anIntArrayArray1327[var30][var31 + 1] = var22;
                }

                if (var30 > 0 && var31 > 0 && Class112.anIntArrayArray1328[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
                    Class112.anIntArray1330[var33] = var10 - 1;
                    Class112.anIntArray1329[var33] = var11 - 1;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30 - 1][var31 - 1] = 3;
                    Class112.anIntArrayArray1327[var30 - 1][var31 - 1] = var22;
                }

                if (var30 < 127 && var31 > 0 && Class112.anIntArrayArray1328[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
                    Class112.anIntArray1330[var33] = var10 + 1;
                    Class112.anIntArray1329[var33] = var11 - 1;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30 + 1][var31 - 1] = 9;
                    Class112.anIntArrayArray1327[var30 + 1][var31 - 1] = var22;
                }

                if (var30 > 0 && var31 < 127 && Class112.anIntArrayArray1328[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
                    Class112.anIntArray1330[var33] = var10 - 1;
                    Class112.anIntArray1329[var33] = var11 + 1;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30 - 1][var31 + 1] = 6;
                    Class112.anIntArrayArray1327[var30 - 1][var31 + 1] = var22;
                }

                if (var30 < 127 && var31 < 127 && Class112.anIntArrayArray1328[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
                    Class112.anIntArray1330[var33] = var10 + 1;
                    Class112.anIntArray1329[var33] = var11 + 1;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30 + 1][var31 + 1] = 12;
                    Class112.anIntArrayArray1327[var30 + 1][var31 + 1] = var22;
                }
            }

            var28 = var29;
        } else if (var2 == 2) {
            var28 = Class64.method383(var0, var1, var3, var4);
        } else {
            var10 = var0;
            var11 = var1;
            var12 = 64;
            var13 = 64;
            var14 = var0 - var12;
            var15 = var1 - var13;
            Class112.anIntArrayArray1328[var12][var13] = 99;
            Class112.anIntArrayArray1327[var12][var13] = 0;
            var16 = 0;
            var17 = 0;
            Class112.anIntArray1330[var16] = var0;
            var33 = var16 + 1;
            Class112.anIntArray1329[var16] = var1;
            var18 = var4.flags;

            label642:
            while (true) {
                label640:
                while (true) {
                    do {
                        do {
                            do {
                                label617:
                                do {
                                    if (var33 == var17) {
                                        Class119.anInt1356 = var10;
                                        Class112.anInt1331 = var11;
                                        var29 = false;
                                        break label642;
                                    }

                                    var10 = Class112.anIntArray1330[var17];
                                    var11 = Class112.anIntArray1329[var17];
                                    var17 = var17 + 1 & 4095;
                                    var30 = var10 - var14;
                                    var31 = var11 - var15;
                                    var19 = var10 - var4.insetX;
                                    var20 = var11 - var4.insetY;
                                    if (var3.method285(var2, var10, var11, var4)) {
                                        Class119.anInt1356 = var10;
                                        Class112.anInt1331 = var11;
                                        var29 = true;
                                        break label642;
                                    }

                                    var22 = Class112.anIntArrayArray1327[var30][var31] + 1;
                                    if (var30 > 0 && Class112.anIntArrayArray1328[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var2 + var20 - 1] & 19136824) == 0) {
                                        var23 = 1;

                                        while (true) {
                                            if (var23 >= var2 - 1) {
                                                Class112.anIntArray1330[var33] = var10 - 1;
                                                Class112.anIntArray1329[var33] = var11;
                                                var33 = var33 + 1 & 4095;
                                                Class112.anIntArrayArray1328[var30 - 1][var31] = 2;
                                                Class112.anIntArrayArray1327[var30 - 1][var31] = var22;
                                                break;
                                            }

                                            if ((var18[var19 - 1][var20 + var23] & 19136830) != 0) {
                                                break;
                                            }

                                            ++var23;
                                        }
                                    }

                                    if (var30 < 128 - var2 && Class112.anIntArrayArray1328[var30 + 1][var31] == 0 && (var18[var19 + var2][var20] & 19136899) == 0 && (var18[var19 + var2][var20 + var2 - 1] & 19136992) == 0) {
                                        var23 = 1;

                                        while (true) {
                                            if (var23 >= var2 - 1) {
                                                Class112.anIntArray1330[var33] = var10 + 1;
                                                Class112.anIntArray1329[var33] = var11;
                                                var33 = var33 + 1 & 4095;
                                                Class112.anIntArrayArray1328[var30 + 1][var31] = 8;
                                                Class112.anIntArrayArray1327[var30 + 1][var31] = var22;
                                                break;
                                            }

                                            if ((var18[var19 + var2][var20 + var23] & 19136995) != 0) {
                                                break;
                                            }

                                            ++var23;
                                        }
                                    }

                                    if (var31 > 0 && Class112.anIntArrayArray1328[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + var2 - 1][var20 - 1] & 19136899) == 0) {
                                        var23 = 1;

                                        while (true) {
                                            if (var23 >= var2 - 1) {
                                                Class112.anIntArray1330[var33] = var10;
                                                Class112.anIntArray1329[var33] = var11 - 1;
                                                var33 = var33 + 1 & 4095;
                                                Class112.anIntArrayArray1328[var30][var31 - 1] = 1;
                                                Class112.anIntArrayArray1327[var30][var31 - 1] = var22;
                                                break;
                                            }

                                            if ((var18[var23 + var19][var20 - 1] & 19136911) != 0) {
                                                break;
                                            }

                                            ++var23;
                                        }
                                    }

                                    if (var31 < 128 - var2 && Class112.anIntArrayArray1328[var30][var31 + 1] == 0 && (var18[var19][var2 + var20] & 19136824) == 0 && (var18[var2 + var19 - 1][var2 + var20] & 19136992) == 0) {
                                        var23 = 1;

                                        while (true) {
                                            if (var23 >= var2 - 1) {
                                                Class112.anIntArray1330[var33] = var10;
                                                Class112.anIntArray1329[var33] = var11 + 1;
                                                var33 = var33 + 1 & 4095;
                                                Class112.anIntArrayArray1328[var30][var31 + 1] = 4;
                                                Class112.anIntArrayArray1327[var30][var31 + 1] = var22;
                                                break;
                                            }

                                            if ((var18[var19 + var23][var2 + var20] & 19137016) != 0) {
                                                break;
                                            }

                                            ++var23;
                                        }
                                    }

                                    if (var30 > 0 && var31 > 0 && Class112.anIntArrayArray1328[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0) {
                                        var23 = 1;

                                        while (true) {
                                            if (var23 >= var2) {
                                                Class112.anIntArray1330[var33] = var10 - 1;
                                                Class112.anIntArray1329[var33] = var11 - 1;
                                                var33 = var33 + 1 & 4095;
                                                Class112.anIntArrayArray1328[var30 - 1][var31 - 1] = 3;
                                                Class112.anIntArrayArray1327[var30 - 1][var31 - 1] = var22;
                                                break;
                                            }

                                            if ((var18[var19 - 1][var23 + (var20 - 1)] & 19136830) != 0 || (var18[var23 + (var19 - 1)][var20 - 1] & 19136911) != 0) {
                                                break;
                                            }

                                            ++var23;
                                        }
                                    }

                                    if (var30 < 128 - var2 && var31 > 0 && Class112.anIntArrayArray1328[var30 + 1][var31 - 1] == 0 && (var18[var19 + var2][var20 - 1] & 19136899) == 0) {
                                        var23 = 1;

                                        while (true) {
                                            if (var23 >= var2) {
                                                Class112.anIntArray1330[var33] = var10 + 1;
                                                Class112.anIntArray1329[var33] = var11 - 1;
                                                var33 = var33 + 1 & 4095;
                                                Class112.anIntArrayArray1328[var30 + 1][var31 - 1] = 9;
                                                Class112.anIntArrayArray1327[var30 + 1][var31 - 1] = var22;
                                                break;
                                            }

                                            if ((var18[var2 + var19][var23 + (var20 - 1)] & 19136995) != 0 || (var18[var23 + var19][var20 - 1] & 19136911) != 0) {
                                                break;
                                            }

                                            ++var23;
                                        }
                                    }

                                    if (var30 > 0 && var31 < 128 - var2 && Class112.anIntArrayArray1328[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + var2] & 19136824) == 0) {
                                        for (var23 = 1; var23 < var2; ++var23) {
                                            if ((var18[var19 - 1][var20 + var23] & 19136830) != 0 || (var18[var19 - 1 + var23][var20 + var2] & 19137016) != 0) {
                                                continue label617;
                                            }
                                        }

                                        Class112.anIntArray1330[var33] = var10 - 1;
                                        Class112.anIntArray1329[var33] = var11 + 1;
                                        var33 = var33 + 1 & 4095;
                                        Class112.anIntArrayArray1328[var30 - 1][var31 + 1] = 6;
                                        Class112.anIntArrayArray1327[var30 - 1][var31 + 1] = var22;
                                    }
                                } while (var30 >= 128 - var2);
                            } while (var31 >= 128 - var2);
                        } while (Class112.anIntArrayArray1328[var30 + 1][var31 + 1] != 0);
                    } while ((var18[var19 + var2][var2 + var20] & 19136992) != 0);

                    for (var23 = 1; var23 < var2; ++var23) {
                        if ((var18[var19 + var23][var2 + var20] & 19137016) != 0 || (var18[var2 + var19][var20 + var23] & 19136995) != 0) {
                            continue label640;
                        }
                    }

                    Class112.anIntArray1330[var33] = var10 + 1;
                    Class112.anIntArray1329[var33] = var11 + 1;
                    var33 = var33 + 1 & 4095;
                    Class112.anIntArrayArray1328[var30 + 1][var31 + 1] = 12;
                    Class112.anIntArrayArray1327[var30 + 1][var31 + 1] = var22;
                }
            }

            var28 = var29;
        }

        var9 = var0 - 64;
        var10 = var1 - 64;
        var11 = Class119.anInt1356;
        var30 = Class112.anInt1331;
        if (!var28) {
            var31 = Integer.MAX_VALUE;
            var14 = Integer.MAX_VALUE;
            byte var32 = 10;
            var33 = var3.anInt1332;
            var17 = var3.anInt1335;
            int var21 = var3.anInt1334;
            var19 = var3.anInt1333;

            for (var20 = var33 - var32; var20 <= var33 + var32; ++var20) {
                for (var22 = var17 - var32; var22 <= var32 + var17; ++var22) {
                    var23 = var20 - var9;
                    int var24 = var22 - var10;
                    if (var23 >= 0 && var24 >= 0 && var23 < 128 && var24 < 128 && Class112.anIntArrayArray1327[var23][var24] < 100) {
                        int var25 = 0;
                        if (var20 < var33) {
                            var25 = var33 - var20;
                        } else if (var20 > var33 + var21 - 1) {
                            var25 = var20 - (var21 + var33 - 1);
                        }

                        int var26 = 0;
                        if (var22 < var17) {
                            var26 = var17 - var22;
                        } else if (var22 > var17 + var19 - 1) {
                            var26 = var22 - (var19 + var17 - 1);
                        }

                        int var27 = var26 * var26 + var25 * var25;
                        if (var27 < var31 || var31 == var27 && Class112.anIntArrayArray1327[var23][var24] < var14) {
                            var31 = var27;
                            var14 = Class112.anIntArrayArray1327[var23][var24];
                            var11 = var20;
                            var30 = var22;
                        }
                    }
                }
            }

            if (var31 == Integer.MAX_VALUE) {
                return -1;
            }
        }

        if (var11 == var0 && var1 == var30) {
            return 0;
        }
        var13 = 0;
        Class112.anIntArray1330[var13] = var11;
        var31 = var13 + 1;
        Class112.anIntArray1329[var13] = var30;

        for (var14 = var15 = Class112.anIntArrayArray1328[var11 - var9][var30 - var10]; var11 != var0 || var1 != var30; var14 = Class112.anIntArrayArray1328[var11 - var9][var30 - var10]) {
            if (var14 != var15) {
                var15 = var14;
                Class112.anIntArray1330[var31] = var11;
                Class112.anIntArray1329[var31++] = var30;
            }

            if ((var14 & 2) != 0) {
                ++var11;
            } else if ((var14 & 8) != 0) {
                --var11;
            }

            if ((var14 & 1) != 0) {
                ++var30;
            } else if ((var14 & 4) != 0) {
                --var30;
            }
        }

        var33 = 0;

        while (var31-- > 0) {
            var6[var33] = Class112.anIntArray1330[var31];
            var7[var33++] = Class112.anIntArray1329[var31];
            if (var33 >= var6.length) {
                break;
            }
        }

        return var33;
    }

    static void method223() {
        for (Node_Sub7 var0 = Node_Sub7.aNodeDeque403.method995(); var0 != null; var0 = Node_Sub7.aNodeDeque403.next()) {
            if (var0.aNode_Sub10_Sub2_401 != null) {
                Class15.aNode_Sub10_Sub1_123.method427(var0.aNode_Sub10_Sub2_401);
                var0.aNode_Sub10_Sub2_401 = null;
            }

            if (var0.aNode_Sub10_Sub2_400 != null) {
                Class15.aNode_Sub10_Sub1_123.method427(var0.aNode_Sub10_Sub2_400);
                var0.aNode_Sub10_Sub2_400 = null;
            }
        }

        Node_Sub7.aNodeDeque403.method989();
    }
}
