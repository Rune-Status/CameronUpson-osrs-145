package com.jagex;

public abstract class Class6 {
    short[][][] aShortArrayArrayArray46;
    int anInt49;
    int anInt43;
    int anInt42;
    int anInt45;
    int anInt40;
    short[][][] aShortArrayArrayArray47;
    byte[][][] aByteArrayArrayArray44;
    byte[][][] aByteArrayArrayArray41;
    MapTile[][][][] mapTiles;
    int anInt48;

    Class6() {
        new java.util.LinkedList();
    }

    static int method24() {
        return 9;
    }

    static boolean method27(int var0) {
        return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
    }

    void method23(int var1, int var2, Buffer var3) {
        int var4 = var3.readUnsignedByte();
        if (var4 != 0) {
            if ((var4 & 1) != 0) {
                this.method22(var1, var2, var3, var4);
            } else {
                this.method26(var1, var2, var3, var4);
            }

        }
    }

    void method22(int var1, int var2, Buffer var3, int var4) {
        boolean var5 = (var4 & 2) != 0;
        if (var5) {
            this.aShortArrayArrayArray46[0][var1][var2] = (short) var3.readUnsignedByte();
        }

        this.aShortArrayArrayArray47[0][var1][var2] = (short) var3.readUnsignedByte();
    }

    void method26(int var1, int var2, Buffer var3, int var4) {
        int var5 = ((var4 & 24) >> 3) + 1;
        boolean var6 = (var4 & 2) != 0;
        boolean var7 = (var4 & 4) != 0;
        this.aShortArrayArrayArray47[0][var1][var2] = (short) var3.readUnsignedByte();
        int var8;
        int var9;
        int var11;
        if (var6) {
            var8 = var3.readUnsignedByte();

            for (var9 = 0; var9 < var8; ++var9) {
                int var10 = var3.readUnsignedByte();
                if (var10 != 0) {
                    this.aShortArrayArrayArray46[var9][var1][var2] = (short) var10;
                    var11 = var3.readUnsignedByte();
                    this.aByteArrayArrayArray44[var9][var1][var2] = (byte) (var11 >> 2);
                    this.aByteArrayArrayArray41[var9][var1][var2] = (byte) (var11 & 3);
                }
            }
        }

        if (var7) {
            for (var8 = 0; var8 < var5; ++var8) {
                var9 = var3.readUnsignedByte();
                if (var9 != 0) {
                    MapTile[] var12 = this.mapTiles[var8][var1][var2] = new MapTile[var9];

                    for (var11 = 0; var11 < var9; ++var11) {
                        int var13 = var3.readSmart32();
                        int var14 = var3.readUnsignedByte();
                        var12[var11] = new MapTile(var13, var14 >> 2, var14 & 3);
                    }
                }
            }
        }

    }

    int method20(int var1, int var2) {
        if (var1 >= 0 && var2 >= 0) {
            return var1 < 64 && var2 < 64 ? this.aShortArrayArrayArray47[0][var1][var2] - 1 : -1;
        } else {
            return -1;
        }
    }

    int method25() {
        return this.anInt43;
    }

    int method21() {
        return this.anInt42;
    }
}
