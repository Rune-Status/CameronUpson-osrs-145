package com.jagex;

public class Identikit {
    static int[] anIntArray1309 = new int[500];
    static int[] anIntArray1307 = new int[500];
    static int[] anIntArray1310 = new int[500];
    static int[] anIntArray1316 = new int[500];
    int[] anIntArray1311;
    AnimationSkin aAnimationSkin_1312 = null;
    int id = -1;
    int[] anIntArray1313;
    int[] anIntArray1315;
    int[] anIntArray1308;
    boolean showing = false;

    Identikit(byte[] var1, AnimationSkin var2) {
        this.aAnimationSkin_1312 = var2;
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        var3.caret = 2;
        int var5 = var3.readUnsignedByte();
        int var6 = -1;
        int var7 = 0;
        var4.caret = var3.caret + var5;

        int var8;
        for (var8 = 0; var8 < var5; ++var8) {
            int var9 = var3.readUnsignedByte();
            if (var9 > 0) {
                if (this.aAnimationSkin_1312.transforms[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; --var10) {
                        if (this.aAnimationSkin_1312.transforms[var10] == 0) {
                            anIntArray1307[var7] = var10;
                            anIntArray1316[var7] = 0;
                            anIntArray1310[var7] = 0;
                            anIntArray1309[var7] = 0;
                            ++var7;
                            break;
                        }
                    }
                }

                anIntArray1307[var7] = var8;
                short var11 = 0;
                if (this.aAnimationSkin_1312.transforms[var8] == 3) {
                    var11 = 128;
                }

                if ((var9 & 1) != 0) {
                    anIntArray1316[var7] = var4.method816();
                } else {
                    anIntArray1316[var7] = var11;
                }

                if ((var9 & 2) != 0) {
                    anIntArray1310[var7] = var4.method816();
                } else {
                    anIntArray1310[var7] = var11;
                }

                if ((var9 & 4) != 0) {
                    anIntArray1309[var7] = var4.method816();
                } else {
                    anIntArray1309[var7] = var11;
                }

                var6 = var8;
                ++var7;
                if (this.aAnimationSkin_1312.transforms[var8] == 5) {
                    this.showing = true;
                }
            }
        }

        if (var4.caret != var1.length) {
            throw new RuntimeException();
        }
        this.id = var7;
        this.anIntArray1315 = new int[var7];
        this.anIntArray1313 = new int[var7];
        this.anIntArray1311 = new int[var7];
        this.anIntArray1308 = new int[var7];

        for (var8 = 0; var8 < var7; ++var8) {
            this.anIntArray1315[var8] = anIntArray1307[var8];
            this.anIntArray1313[var8] = anIntArray1316[var8];
            this.anIntArray1311[var8] = anIntArray1310[var8];
            this.anIntArray1308[var8] = anIntArray1309[var8];
        }

    }
}
