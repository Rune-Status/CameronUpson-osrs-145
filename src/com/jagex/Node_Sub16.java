package com.jagex;

public class Node_Sub16 extends Node {
    static int[] anIntArray1273;
    int[] anIntArray1319;
    int anInt327;
    boolean aBoolean994;
    int[] anIntArray932;
    int[] anIntArray934;
    int[] anIntArray1271;
    int anInt226;
    int anInt228;
    int[] anIntArray1171;
    boolean aBoolean1318 = false;

    Node_Sub16(Buffer var1) {
        this.anInt327 = var1.readUnsignedShort();
        this.aBoolean994 = var1.readUnsignedByte() == 1;
        int var2 = var1.readUnsignedByte();
        if (var2 >= 1 && var2 <= 4) {
            this.anIntArray934 = new int[var2];

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                this.anIntArray934[var3] = var1.readUnsignedShort();
            }

            if (var2 > 1) {
                this.anIntArray932 = new int[var2 - 1];

                for (var3 = 0; var3 < var2 - 1; ++var3) {
                    this.anIntArray932[var3] = var1.readUnsignedByte();
                }
            }

            if (var2 > 1) {
                this.anIntArray1319 = new int[var2 - 1];

                for (var3 = 0; var3 < var2 - 1; ++var3) {
                    this.anIntArray1319[var3] = var1.readUnsignedByte();
                }
            }

            this.anIntArray1271 = new int[var2];

            for (var3 = 0; var3 < var2; ++var3) {
                this.anIntArray1271[var3] = var1.method835();
            }

            this.anInt226 = var1.readUnsignedByte();
            this.anInt228 = var1.readUnsignedByte();
            this.anIntArray1171 = null;
        } else {
            throw new RuntimeException();
        }
    }

    void method756() {
        this.anIntArray1171 = null;
    }

    boolean method754(double var1, int var3, ReferenceTable var4) {
        int var5;
        for (var5 = 0; var5 < this.anIntArray934.length; ++var5) {
            if (var4.method1092(this.anIntArray934[var5]) == null) {
                return false;
            }
        }

        var5 = var3 * var3;
        this.anIntArray1171 = new int[var5];

        for (int var6 = 0; var6 < this.anIntArray934.length; ++var6) {
            Node_Sub21_Sub26_Sub2 var7 = Class181.method1199(var4, this.anIntArray934[var6]);
            var7.method308();
            byte[] var8 = var7.aByteArray1361;
            int[] var9 = var7.anIntArray342;
            int var10 = this.anIntArray1271[var6];
            if ((var10 & -16777216) == 16777216) {
            }

            if ((var10 & -16777216) == 33554432) {
            }

            int var11;
            int var12;
            int var13;
            int var14;
            if ((var10 & -16777216) == 50331648) {
                var11 = var10 & 16711935;
                var12 = var10 >> 8 & 255;

                for (var13 = 0; var13 < var9.length; ++var13) {
                    var14 = var9[var13];
                    if ((var14 & '\uffff') == var14 >> 8) {
                        var14 &= 255;
                        var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
                    }
                }
            }

            for (var11 = 0; var11 < var9.length; ++var11) {
                var9[var11] = Node_Sub21_Sub26_Sub1.method629(var9[var11], var1);
            }

            if (var6 == 0) {
                var11 = 0;
            } else {
                var11 = this.anIntArray932[var6 - 1];
            }

            if (var11 == 0) {
                if (var7.anInt206 == var3) {
                    for (var12 = 0; var12 < var5; ++var12) {
                        this.anIntArray1171[var12] = var9[var8[var12] & 255];
                    }
                } else if (var7.anInt206 == 64 && var3 == 128) {
                    var12 = 0;

                    for (var13 = 0; var13 < var3; ++var13) {
                        for (var14 = 0; var14 < var3; ++var14) {
                            this.anIntArray1171[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                        }
                    }
                } else {
                    if (var7.anInt206 != 128 || var3 != 64) {
                        throw new RuntimeException();
                    }

                    var12 = 0;

                    for (var13 = 0; var13 < var3; ++var13) {
                        for (var14 = 0; var14 < var3; ++var14) {
                            this.anIntArray1171[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                        }
                    }
                }
            }

            if (var11 == 1) {
            }

            if (var11 == 2) {
            }

            if (var11 == 3) {
            }
        }

        return true;
    }

    void method755(int var1) {
        if (this.anIntArray1171 != null) {
            short var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int[] var10;
            if (this.anInt226 == 1 || this.anInt226 == 3) {
                if (anIntArray1273 == null || anIntArray1273.length < this.anIntArray1171.length) {
                    anIntArray1273 = new int[this.anIntArray1171.length];
                }

                if (this.anIntArray1171.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.anIntArray1171.length;
                var4 = var2 * var1 * this.anInt228;
                var5 = var3 - 1;
                if (this.anInt226 == 1) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; ++var6) {
                    var7 = var6 + var4 & var5;
                    anIntArray1273[var6] = this.anIntArray1171[var7];
                }

                var10 = this.anIntArray1171;
                this.anIntArray1171 = anIntArray1273;
                anIntArray1273 = var10;
            }

            if (this.anInt226 == 2 || this.anInt226 == 4) {
                if (anIntArray1273 == null || anIntArray1273.length < this.anIntArray1171.length) {
                    anIntArray1273 = new int[this.anIntArray1171.length];
                }

                if (this.anIntArray1171.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.anIntArray1171.length;
                var4 = var1 * this.anInt228;
                var5 = var2 - 1;
                if (this.anInt226 == 2) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; var6 += var2) {
                    for (var7 = 0; var7 < var2; ++var7) {
                        int var8 = var6 + var7;
                        int var9 = var6 + (var7 + var4 & var5);
                        anIntArray1273[var8] = this.anIntArray1171[var9];
                    }
                }

                var10 = this.anIntArray1171;
                this.anIntArray1171 = anIntArray1273;
                anIntArray1273 = var10;
            }

        }
    }
}
