package com.jagex;

public final class Bzip2Decompressor {
    static Class127 aClass127_1336 = new Class127();

    public static int decompress(byte[] var0, int var1, byte[] var2, int var3, int var4) {
        Class127 var5 = aClass127_1336;
        synchronized (aClass127_1336) {
            aClass127_1336.aByteArray1386 = var2;
            aClass127_1336.anInt1384 = var4;
            aClass127_1336.aByteArray1376 = var0;
            aClass127_1336.anInt1394 = 0;
            aClass127_1336.anInt1397 = var1;
            aClass127_1336.anInt1400 = 0;
            aClass127_1336.anInt1404 = 0;
            aClass127_1336.anInt1381 = 0;
            aClass127_1336.anInt1392 = 0;
            method779(aClass127_1336);
            var1 -= aClass127_1336.anInt1397;
            aClass127_1336.aByteArray1386 = null;
            aClass127_1336.aByteArray1376 = null;
            return var1;
        }
    }

    static void method783(Class127 var0) {
        byte var1 = var0.aByte1372;
        int var2 = var0.anInt1382;
        int var3 = var0.anInt1407;
        int var4 = var0.anInt1383;
        int[] var5 = NpcEntity.anIntArray661;
        int var6 = var0.anInt1389;
        byte[] var7 = var0.aByteArray1376;
        int var8 = var0.anInt1394;
        int var9 = var0.anInt1397;
        int var11 = var0.anInt1371 + 1;

        label65:
        while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label65;
                    }

                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label65;
                        }

                        var7[var8] = var1;
                        ++var8;
                        --var9;
                        break;
                    }

                    var7[var8] = var1;
                    --var2;
                    ++var8;
                    --var9;
                }
            }

            boolean var13 = true;

            byte var14;
            while (var13) {
                var13 = false;
                if (var3 == var11) {
                    var2 = 0;
                    break label65;
                }

                var1 = (byte) var4;
                var6 = var5[var6];
                var14 = (byte) (var6 & 255);
                var6 >>= 8;
                ++var3;
                if (var14 != var4) {
                    var4 = var14;
                    if (var9 == 0) {
                        var2 = 1;
                        break label65;
                    }

                    var7[var8] = var1;
                    ++var8;
                    --var9;
                    var13 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label65;
                    }

                    var7[var8] = var1;
                    ++var8;
                    --var9;
                    var13 = true;
                }
            }

            var2 = 2;
            var6 = var5[var6];
            var14 = (byte) (var6 & 255);
            var6 >>= 8;
            ++var3;
            if (var3 != var11) {
                if (var14 != var4) {
                    var4 = var14;
                } else {
                    var2 = 3;
                    var6 = var5[var6];
                    var14 = (byte) (var6 & 255);
                    var6 >>= 8;
                    ++var3;
                    if (var3 != var11) {
                        if (var14 != var4) {
                            var4 = var14;
                        } else {
                            var6 = var5[var6];
                            var14 = (byte) (var6 & 255);
                            var6 >>= 8;
                            ++var3;
                            var2 = (var14 & 255) + 4;
                            var6 = var5[var6];
                            var4 = (byte) (var6 & 255);
                            var6 >>= 8;
                            ++var3;
                        }
                    }
                }
            }
        }

        int var12 = var0.anInt1392;
        var0.anInt1392 += var9 - var9;
        if (var0.anInt1392 < var12) {
        }

        var0.aByte1372 = var1;
        var0.anInt1382 = var2;
        var0.anInt1407 = var3;
        var0.anInt1383 = var4;
        NpcEntity.anIntArray661 = var5;
        var0.anInt1389 = var6;
        var0.aByteArray1376 = var7;
        var0.anInt1394 = var8;
        var0.anInt1397 = var9;
    }

    static void method779(Class127 var0) {
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        var0.anInt1387 = 1;
        if (NpcEntity.anIntArray661 == null) {
            NpcEntity.anIntArray661 = new int[var0.anInt1387 * 100000];
        }

        boolean var23 = true;

        while (true) {
            while (var23) {
                byte var24 = method778(var0);
                if (var24 == 23) {
                    return;
                }

                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method778(var0);
                var24 = method780(var0);
                if (var24 != 0) {
                }

                var0.anInt1399 = 0;
                var24 = method778(var0);
                var0.anInt1399 = var0.anInt1399 << 8 | var24 & 255;
                var24 = method778(var0);
                var0.anInt1399 = var0.anInt1399 << 8 | var24 & 255;
                var24 = method778(var0);
                var0.anInt1399 = var0.anInt1399 << 8 | var24 & 255;

                int var36;
                for (var36 = 0; var36 < 16; ++var36) {
                    var24 = method780(var0);
                    var0.aBooleanArray1406[var36] = var24 == 1;
                }

                for (var36 = 0; var36 < 256; ++var36) {
                    var0.aBooleanArray1402[var36] = false;
                }

                int var37;
                for (var36 = 0; var36 < 16; ++var36) {
                    if (var0.aBooleanArray1406[var36]) {
                        for (var37 = 0; var37 < 16; ++var37) {
                            var24 = method780(var0);
                            if (var24 == 1) {
                                var0.aBooleanArray1402[var36 * 16 + var37] = true;
                            }
                        }
                    }
                }

                method781(var0);
                int var39 = var0.anInt1403 + 2;
                int var40 = method782(3, var0);
                int var41 = method782(15, var0);

                for (var36 = 0; var36 < var41; ++var36) {
                    var37 = 0;

                    while (true) {
                        var24 = method780(var0);
                        if (var24 == 0) {
                            var0.aByteArray1388[var36] = (byte) var37;
                            break;
                        }

                        ++var37;
                    }
                }

                byte[] var25 = new byte[6];

                byte var26;
                for (var26 = 0; var26 < var40; var25[var26] = var26++) {
                }

                for (var36 = 0; var36 < var41; ++var36) {
                    var26 = var0.aByteArray1388[var36];

                    byte var27;
                    for (var27 = var25[var26]; var26 > 0; --var26) {
                        var25[var26] = var25[var26 - 1];
                    }

                    var25[0] = var27;
                    var0.aByteArray1385[var36] = var27;
                }

                int var38;
                for (var38 = 0; var38 < var40; ++var38) {
                    int var50 = method782(5, var0);

                    for (var36 = 0; var36 < var39; ++var36) {
                        while (true) {
                            var24 = method780(var0);
                            if (var24 == 0) {
                                var0.aByteArrayArray1373[var38][var36] = (byte) var50;
                                break;
                            }

                            var24 = method780(var0);
                            if (var24 == 0) {
                                ++var50;
                            } else {
                                --var50;
                            }
                        }
                    }
                }

                for (var38 = 0; var38 < var40; ++var38) {
                    byte var28 = 32;
                    byte var29 = 0;

                    for (var36 = 0; var36 < var39; ++var36) {
                        if (var0.aByteArrayArray1373[var38][var36] > var29) {
                            var29 = var0.aByteArrayArray1373[var38][var36];
                        }

                        if (var0.aByteArrayArray1373[var38][var36] < var28) {
                            var28 = var0.aByteArrayArray1373[var38][var36];
                        }
                    }

                    method777(var0.anIntArrayArray1390[var38], var0.anIntArrayArray1398[var38], var0.anIntArrayArray1393[var38], var0.aByteArrayArray1373[var38], var28, var29, var39);
                    var0.anIntArray1375[var38] = var28;
                }

                int var42 = var0.anInt1403 + 1;
                int var43 = -1;
                byte var44 = 0;

                for (var36 = 0; var36 <= 255; ++var36) {
                    var0.anIntArray1377[var36] = 0;
                }

                int var55 = 4095;

                int var30;
                int var56;
                for (var30 = 15; var30 >= 0; --var30) {
                    for (var56 = 15; var56 >= 0; --var56) {
                        var0.aByteArray1378[var55] = (byte) (var30 * 16 + var56);
                        --var55;
                    }

                    var0.anIntArray1395[var30] = var55 + 1;
                }

                int var47 = 0;
                byte var54;
                if (var44 == 0) {
                    ++var43;
                    var44 = 50;
                    var54 = var0.aByteArray1385[var43];
                    var19 = var0.anIntArray1375[var54];
                    var20 = var0.anIntArrayArray1390[var54];
                    var22 = var0.anIntArrayArray1393[var54];
                    var21 = var0.anIntArrayArray1398[var54];
                }

                int var45 = var44 - 1;
                int var51 = var19;

                int var52;
                byte var53;
                for (var52 = method782(var19, var0); var52 > var20[var51]; var52 = var52 << 1 | var53) {
                    ++var51;
                    var53 = method780(var0);
                }

                int var46 = var22[var52 - var21[var51]];

                while (true) {
                    while (var46 != var42) {
                        if (var46 != 0 && var46 != 1) {
                            int var31 = var46 - 1;
                            int var32;
                            if (var31 < 16) {
                                var32 = var0.anIntArray1395[0];

                                for (var24 = var0.aByteArray1378[var32 + var31]; var31 > 3; var31 -= 4) {
                                    int var33 = var32 + var31;
                                    var0.aByteArray1378[var33] = var0.aByteArray1378[var33 - 1];
                                    var0.aByteArray1378[var33 - 1] = var0.aByteArray1378[var33 - 2];
                                    var0.aByteArray1378[var33 - 2] = var0.aByteArray1378[var33 - 3];
                                    var0.aByteArray1378[var33 - 3] = var0.aByteArray1378[var33 - 4];
                                }

                                while (var31 > 0) {
                                    var0.aByteArray1378[var32 + var31] = var0.aByteArray1378[var32 + var31 - 1];
                                    --var31;
                                }

                                var0.aByteArray1378[var32] = var24;
                            } else {
                                int var34 = var31 / 16;
                                int var35 = var31 % 16;
                                var32 = var0.anIntArray1395[var34] + var35;

                                for (var24 = var0.aByteArray1378[var32]; var32 > var0.anIntArray1395[var34]; --var32) {
                                    var0.aByteArray1378[var32] = var0.aByteArray1378[var32 - 1];
                                }

                                ++var0.anIntArray1395[var34];

                                while (var34 > 0) {
                                    --var0.anIntArray1395[var34];
                                    var0.aByteArray1378[var0.anIntArray1395[var34]] = var0.aByteArray1378[var0.anIntArray1395[var34 - 1] + 16 - 1];
                                    --var34;
                                }

                                --var0.anIntArray1395[0];
                                var0.aByteArray1378[var0.anIntArray1395[0]] = var24;
                                if (var0.anIntArray1395[0] == 0) {
                                    var55 = 4095;

                                    for (var30 = 15; var30 >= 0; --var30) {
                                        for (var56 = 15; var56 >= 0; --var56) {
                                            var0.aByteArray1378[var55] = var0.aByteArray1378[var0.anIntArray1395[var30] + var56];
                                            --var55;
                                        }

                                        var0.anIntArray1395[var30] = var55 + 1;
                                    }
                                }
                            }

                            ++var0.anIntArray1377[var0.aByteArray1379[var24 & 255] & 255];
                            NpcEntity.anIntArray661[var47] = var0.aByteArray1379[var24 & 255] & 255;
                            ++var47;
                            if (var45 == 0) {
                                ++var43;
                                var45 = 50;
                                var54 = var0.aByteArray1385[var43];
                                var19 = var0.anIntArray1375[var54];
                                var20 = var0.anIntArrayArray1390[var54];
                                var22 = var0.anIntArrayArray1393[var54];
                                var21 = var0.anIntArrayArray1398[var54];
                            }

                            --var45;
                            var51 = var19;

                            for (var52 = method782(var19, var0); var52 > var20[var51]; var52 = var52 << 1 | var53) {
                                ++var51;
                                var53 = method780(var0);
                            }

                            var46 = var22[var52 - var21[var51]];
                        } else {
                            int var48 = -1;
                            int var49 = 1;

                            do {
                                if (var46 == 0) {
                                    var48 += var49;
                                } else if (var46 == 1) {
                                    var48 += var49 * 2;
                                }

                                var49 *= 2;
                                if (var45 == 0) {
                                    ++var43;
                                    var45 = 50;
                                    var54 = var0.aByteArray1385[var43];
                                    var19 = var0.anIntArray1375[var54];
                                    var20 = var0.anIntArrayArray1390[var54];
                                    var22 = var0.anIntArrayArray1393[var54];
                                    var21 = var0.anIntArrayArray1398[var54];
                                }

                                --var45;
                                var51 = var19;

                                for (var52 = method782(var19, var0); var52 > var20[var51]; var52 = var52 << 1 | var53) {
                                    ++var51;
                                    var53 = method780(var0);
                                }

                                var46 = var22[var52 - var21[var51]];
                            } while (var46 == 0 || var46 == 1);

                            ++var48;
                            var24 = var0.aByteArray1379[var0.aByteArray1378[var0.anIntArray1395[0]] & 255];

                            for (var0.anIntArray1377[var24 & 255] += var48; var48 > 0; --var48) {
                                NpcEntity.anIntArray661[var47] = var24 & 255;
                                ++var47;
                            }
                        }
                    }

                    var0.anInt1382 = 0;
                    var0.aByte1372 = 0;
                    var0.anIntArray1374[0] = 0;

                    for (var36 = 1; var36 <= 256; ++var36) {
                        var0.anIntArray1374[var36] = var0.anIntArray1377[var36 - 1];
                    }

                    for (var36 = 1; var36 <= 256; ++var36) {
                        var0.anIntArray1374[var36] += var0.anIntArray1374[var36 - 1];
                    }

                    for (var36 = 0; var36 < var47; ++var36) {
                        var24 = (byte) (NpcEntity.anIntArray661[var36] & 255);
                        NpcEntity.anIntArray661[var0.anIntArray1374[var24 & 255]] |= var36 << 8;
                        ++var0.anIntArray1374[var24 & 255];
                    }

                    var0.anInt1389 = NpcEntity.anIntArray661[var0.anInt1399] >> 8;
                    var0.anInt1407 = 0;
                    var0.anInt1389 = NpcEntity.anIntArray661[var0.anInt1389];
                    var0.anInt1383 = (byte) (var0.anInt1389 & 255);
                    var0.anInt1389 >>= 8;
                    ++var0.anInt1407;
                    var0.anInt1371 = var47;
                    method783(var0);
                    if (var0.anInt1407 == var0.anInt1371 + 1 && var0.anInt1382 == 0) {
                        var23 = true;
                        break;
                    }

                    var23 = false;
                    break;
                }
            }

            return;
        }
    }

    static byte method780(Class127 var0) {
        return (byte) method782(1, var0);
    }

    static void method781(Class127 var0) {
        var0.anInt1403 = 0;

        for (int var1 = 0; var1 < 256; ++var1) {
            if (var0.aBooleanArray1402[var1]) {
                var0.aByteArray1379[var0.anInt1403] = (byte) var1;
                ++var0.anInt1403;
            }
        }

    }

    static void method777(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
        int var7 = 0;

        int var8;
        for (var8 = var4; var8 <= var5; ++var8) {
            for (int var9 = 0; var9 < var6; ++var9) {
                if (var3[var9] == var8) {
                    var2[var7] = var9;
                    ++var7;
                }
            }
        }

        for (var8 = 0; var8 < 23; ++var8) {
            var1[var8] = 0;
        }

        for (var8 = 0; var8 < var6; ++var8) {
            ++var1[var3[var8] + 1];
        }

        for (var8 = 1; var8 < 23; ++var8) {
            var1[var8] += var1[var8 - 1];
        }

        for (var8 = 0; var8 < 23; ++var8) {
            var0[var8] = 0;
        }

        int var10 = 0;

        for (var8 = var4; var8 <= var5; ++var8) {
            var10 += var1[var8 + 1] - var1[var8];
            var0[var8] = var10 - 1;
            var10 <<= 1;
        }

        for (var8 = var4 + 1; var8 <= var5; ++var8) {
            var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
        }

    }

    static int method782(int var0, Class127 var1) {
        while (var1.anInt1400 < var0) {
            var1.anInt1404 = var1.anInt1404 << 8 | var1.aByteArray1386[var1.anInt1384] & 255;
            var1.anInt1400 += 8;
            ++var1.anInt1384;
            ++var1.anInt1381;
            if (var1.anInt1381 == 0) {
            }
        }

        int var2 = var1.anInt1404 >> var1.anInt1400 - var0 & (1 << var0) - 1;
        var1.anInt1400 -= var0;
        return var2;
    }

    static byte method778(Class127 var0) {
        return (byte) method782(8, var0);
    }
}
