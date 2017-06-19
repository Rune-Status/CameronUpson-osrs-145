package com.jagex;

import java.util.Random;

public class AudioInstrument {
    static int[] anIntArray1028;
    static int[] anIntArray1018;
    static int[] anIntArray1025 = new int['耀'];
    static int[] anIntArray1019;
    static int[] anIntArray1012;
    static int[] anIntArray1031;
    static int[] anIntArray1010;
    static int[] anIntArray1032;

    static {
        Random var0 = new Random(0L);

        int var1;
        for (var1 = 0; var1 < 32768; ++var1) {
            anIntArray1025[var1] = (var0.nextInt() & 2) - 1;
        }

        anIntArray1019 = new int['耀'];

        for (var1 = 0; var1 < 32768; ++var1) {
            anIntArray1019[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }

        anIntArray1018 = new int[220500];
        anIntArray1012 = new int[5];
        anIntArray1031 = new int[5];
        anIntArray1010 = new int[5];
        anIntArray1032 = new int[5];
        anIntArray1028 = new int[5];
    }

    AudioEnvelope anAudioEnvelope1016;
    AudioEnvelope anAudioEnvelope1020;
    AudioEnvelope anAudioEnvelope1013;
    int anInt1029 = 500;
    AudioEnvelope anAudioEnvelope1030;
    AudioEnvelope anAudioEnvelope1033;
    AudioEnvelope pitchEnvelope;
    int[] anIntArray1022 = new int[]{0, 0, 0, 0, 0};
    int[] anIntArray1014 = new int[]{0, 0, 0, 0, 0};
    int anInt1026 = 0;
    int[] oscillatorPitch = new int[]{0, 0, 0, 0, 0};
    AudioEnvelope anAudioEnvelope1027;
    int anInt1021 = 100;
    int anInt1024 = 0;
    AudioEnvelope anAudioEnvelope1015;
    AudioEnvelope anAudioEnvelope1017;
    Class95 aClass95_1009;

    final int[] method610(int var1, int var2) {
        Class144.method982(anIntArray1018, 0, var1);
        if (var2 < 10) {
            return anIntArray1018;
        }
        double var3 = (double) var1 / ((double) var2 + 0.0D);
        pitchEnvelope.method509();
        anAudioEnvelope1020.method509();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (anAudioEnvelope1013 != null) {
            anAudioEnvelope1013.method509();
            anAudioEnvelope1027.method509();
            var5 = (int) ((double) (anAudioEnvelope1013.end - anAudioEnvelope1013.start) * 32.768D / var3);
            var6 = (int) ((double) anAudioEnvelope1013.start * 32.768D / var3);
        }

        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (anAudioEnvelope1030 != null) {
            anAudioEnvelope1030.method509();
            anAudioEnvelope1033.method509();
            var8 = (int) ((double) (anAudioEnvelope1030.end - anAudioEnvelope1030.start) * 32.768D / var3);
            var9 = (int) ((double) anAudioEnvelope1030.start * 32.768D / var3);
        }

        int var11;
        for (var11 = 0; var11 < 5; ++var11) {
            if (anIntArray1014[var11] != 0) {
                anIntArray1012[var11] = 0;
                anIntArray1031[var11] = (int) ((double) anIntArray1022[var11] * var3);
                anIntArray1010[var11] = (anIntArray1014[var11] << 14) / 100;
                anIntArray1032[var11] = (int) ((double) (pitchEnvelope.end - pitchEnvelope.start) * 32.768D * Math.pow(1.0057929410678534D, (double) oscillatorPitch[var11]) / var3);
                anIntArray1028[var11] = (int) ((double) pitchEnvelope.start * 32.768D / var3);
            }
        }

        int var12;
        int var13;
        int var14;
        int var15;
        for (var11 = 0; var11 < var1; ++var11) {
            var12 = pitchEnvelope.method508(var1);
            var13 = anAudioEnvelope1020.method508(var1);
            if (anAudioEnvelope1013 != null) {
                var14 = anAudioEnvelope1013.method508(var1);
                var15 = anAudioEnvelope1027.method508(var1);
                var12 += method612(var7, var15, anAudioEnvelope1013.anInt893) >> 1;
                var7 += (var14 * var5 >> 16) + var6;
            }

            if (anAudioEnvelope1030 != null) {
                var14 = anAudioEnvelope1030.method508(var1);
                var15 = anAudioEnvelope1033.method508(var1);
                var13 = var13 * ((method612(var10, var15, anAudioEnvelope1030.anInt893) >> 1) + '耀') >> 15;
                var10 += (var14 * var8 >> 16) + var9;
            }

            for (var14 = 0; var14 < 5; ++var14) {
                if (anIntArray1014[var14] != 0) {
                    var15 = var11 + anIntArray1031[var14];
                    if (var15 < var1) {
                        anIntArray1018[var15] += method612(anIntArray1012[var14], var13 * anIntArray1010[var14] >> 15, pitchEnvelope.anInt893);
                        anIntArray1012[var14] += (var12 * anIntArray1032[var14] >> 16) + anIntArray1028[var14];
                    }
                }
            }
        }

        int var16;
        if (anAudioEnvelope1017 != null) {
            anAudioEnvelope1017.method509();
            anAudioEnvelope1016.method509();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for (var14 = 0; var14 < var1; ++var14) {
                var15 = anAudioEnvelope1017.method508(var1);
                var16 = anAudioEnvelope1016.method508(var1);
                if (var20) {
                    var12 = anAudioEnvelope1017.start + ((anAudioEnvelope1017.end - anAudioEnvelope1017.start) * var15 >> 8);
                } else {
                    var12 = anAudioEnvelope1017.start + ((anAudioEnvelope1017.end - anAudioEnvelope1017.start) * var16 >> 8);
                }

                var11 += 256;
                if (var11 >= var12) {
                    var11 = 0;
                    var20 = !var20;
                }

                if (var20) {
                    anIntArray1018[var14] = 0;
                }
            }
        }

        if (anInt1024 > 0 && anInt1021 > 0) {
            var11 = (int) ((double) anInt1024 * var3);

            for (var12 = var11; var12 < var1; ++var12) {
                anIntArray1018[var12] += anIntArray1018[var12 - var11] * anInt1021 / 100;
            }
        }

        if (aClass95_1009.anIntArray1067[0] > 0 || aClass95_1009.anIntArray1067[1] > 0) {
            anAudioEnvelope1015.method509();
            var11 = anAudioEnvelope1015.method508(var1 + 1);
            var12 = aClass95_1009.method622(0, (float) var11 / 65536.0F);
            var13 = aClass95_1009.method622(1, (float) var11 / 65536.0F);
            if (var1 >= var12 + var13) {
                var14 = 0;
                var15 = var13;
                if (var13 > var1 - var12) {
                    var15 = var1 - var12;
                }

                int var17;
                while (var14 < var15) {
                    var16 = (int) ((long) anIntArray1018[var14 + var12] * (long) Class95.anInt1070 >> 16);

                    for (var17 = 0; var17 < var12; ++var17) {
                        var16 += (int) ((long) anIntArray1018[var14 + var12 - 1 - var17] * (long) Class95.anIntArrayArray1073[0][var17] >> 16);
                    }

                    for (var17 = 0; var17 < var14; ++var17) {
                        var16 -= (int) ((long) anIntArray1018[var14 - 1 - var17] * (long) Class95.anIntArrayArray1073[1][var17] >> 16);
                    }

                    anIntArray1018[var14] = var16;
                    var11 = anAudioEnvelope1015.method508(var1 + 1);
                    ++var14;
                }

                var15 = 128;

                while (true) {
                    if (var15 > var1 - var12) {
                        var15 = var1 - var12;
                    }

                    int var18;
                    while (var14 < var15) {
                        var17 = (int) ((long) anIntArray1018[var14 + var12] * (long) Class95.anInt1070 >> 16);

                        for (var18 = 0; var18 < var12; ++var18) {
                            var17 += (int) ((long) anIntArray1018[var14 + var12 - 1 - var18] * (long) Class95.anIntArrayArray1073[0][var18] >> 16);
                        }

                        for (var18 = 0; var18 < var13; ++var18) {
                            var17 -= (int) ((long) anIntArray1018[var14 - 1 - var18] * (long) Class95.anIntArrayArray1073[1][var18] >> 16);
                        }

                        anIntArray1018[var14] = var17;
                        var11 = anAudioEnvelope1015.method508(var1 + 1);
                        ++var14;
                    }

                    if (var14 >= var1 - var12) {
                        while (var14 < var1) {
                            var17 = 0;

                            for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                                var17 += (int) ((long) anIntArray1018[var14 + var12 - 1 - var18] * (long) Class95.anIntArrayArray1073[0][var18] >> 16);
                            }

                            for (var18 = 0; var18 < var13; ++var18) {
                                var17 -= (int) ((long) anIntArray1018[var14 - 1 - var18] * (long) Class95.anIntArrayArray1073[1][var18] >> 16);
                            }

                            anIntArray1018[var14] = var17;
                            anAudioEnvelope1015.method508(var1 + 1);
                            ++var14;
                        }
                        break;
                    }

                    var12 = aClass95_1009.method622(0, (float) var11 / 65536.0F);
                    var13 = aClass95_1009.method622(1, (float) var11 / 65536.0F);
                    var15 += 128;
                }
            }
        }

        for (var11 = 0; var11 < var1; ++var11) {
            if (anIntArray1018[var11] < -32768) {
                anIntArray1018[var11] = -32768;
            }

            if (anIntArray1018[var11] > 32767) {
                anIntArray1018[var11] = 32767;
            }
        }

        return anIntArray1018;
    }

    final void method611(Buffer var1) {
        pitchEnvelope = new AudioEnvelope();
        pitchEnvelope.method507(var1);
        anAudioEnvelope1020 = new AudioEnvelope();
        anAudioEnvelope1020.method507(var1);
        int var2 = var1.readUnsignedByte();
        if (var2 != 0) {
            --var1.caret;
            anAudioEnvelope1013 = new AudioEnvelope();
            anAudioEnvelope1013.method507(var1);
            anAudioEnvelope1027 = new AudioEnvelope();
            anAudioEnvelope1027.method507(var1);
        }

        var2 = var1.readUnsignedByte();
        if (var2 != 0) {
            --var1.caret;
            anAudioEnvelope1030 = new AudioEnvelope();
            anAudioEnvelope1030.method507(var1);
            anAudioEnvelope1033 = new AudioEnvelope();
            anAudioEnvelope1033.method507(var1);
        }

        var2 = var1.readUnsignedByte();
        if (var2 != 0) {
            --var1.caret;
            anAudioEnvelope1017 = new AudioEnvelope();
            anAudioEnvelope1017.method507(var1);
            anAudioEnvelope1016 = new AudioEnvelope();
            anAudioEnvelope1016.method507(var1);
        }

        for (int var3 = 0; var3 < 10; ++var3) {
            int var4 = var1.method541();
            if (var4 == 0) {
                break;
            }

            anIntArray1014[var3] = var4;
            oscillatorPitch[var3] = var1.method816();
            anIntArray1022[var3] = var1.method541();
        }

        anInt1024 = var1.method541();
        anInt1021 = var1.method541();
        anInt1029 = var1.readUnsignedShort();
        anInt1026 = var1.readUnsignedShort();
        aClass95_1009 = new Class95();
        anAudioEnvelope1015 = new AudioEnvelope();
        aClass95_1009.method624(var1, anAudioEnvelope1015);
    }

    final int method612(int var1, int var2, int var3) {
        if (var3 == 1) {
            return (var1 & 32767) < 16384 ? var2 : -var2;
        }
        if (var3 == 2) {
            return anIntArray1019[var1 & 32767] * var2 >> 14;
        }
        if (var3 == 3) {
            return ((var1 & 32767) * var2 >> 14) - var2;
        }
        return var3 == 4 ? anIntArray1025[var1 / 2607 & 32767] * var2 : 0;
    }
}
