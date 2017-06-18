package com.jagex;

public class Class6_Sub2 extends Class6 {
    static byte aByte826;
    static Sprite[] aSpriteArray825;

    public static String method458(byte[] var0, int var1, int var2) {
        char[] var3 = new char[var2];
        int var4 = 0;

        for (int var5 = 0; var5 < var2; ++var5) {
            int var6 = var0[var5 + var1] & 255;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = Class169.aCharArray2118[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }

                    var6 = var7;
                }

                var3[var4++] = (char) var6;
            }
        }

        return new String(var3, 0, var4);
    }

    static int method459(int var0, int var1, int var2) {
        if (var2 > 179) {
            var1 /= 2;
        }

        if (var2 > 192) {
            var1 /= 2;
        }

        if (var2 > 217) {
            var1 /= 2;
        }

        if (var2 > 243) {
            var1 /= 2;
        }

        return (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
    }

    static void method460(int var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = var2 - var0;
        int var7 = var3 - var1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }

        if (var10 != 0) {
            int var11 = (var6 << 16) / var10;
            int var12 = (var7 << 16) / var10;
            if (var12 <= var11) {
                var11 = -var11;
            } else {
                var12 = -var12;
            }

            int var13 = var12 * var5 >> 17;
            int var14 = var12 * var5 + 1 >> 17;
            int var15 = var5 * var11 >> 17;
            int var16 = var5 * var11 + 1 >> 17;
            var0 -= DrawingArea.areaLeft;
            var1 -= DrawingArea.areaTop;
            int var17 = var0 + var13;
            int var18 = var0 - var14;
            int var19 = var0 + var6 - var14;
            int var20 = var0 + var6 + var13;
            int var21 = var1 + var15;
            int var22 = var1 - var16;
            int var23 = var7 + var1 - var16;
            int var24 = var7 + var1 + var15;
            Node_Sub21_Sub26_Sub1.method637(var17, var18, var19);
            Node_Sub21_Sub26_Sub1.method627(var21, var22, var23, var17, var18, var19, var4);
            Node_Sub21_Sub26_Sub1.method637(var17, var19, var20);
            Node_Sub21_Sub26_Sub1.method627(var21, var23, var24, var17, var19, var20, var4);
        }
    }

    static void method457(int var0, int var1, int var2, int var3, int var4) {
        int var5 = Class60.aSceneGraph631.method671(var0, var1, var2);
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        if (var5 != 0) {
            var6 = Class60.aSceneGraph631.method668(var0, var1, var2, var5);
            var7 = var6 >> 6 & 3;
            var8 = var6 & 31;
            var9 = var3;
            if (var5 > 0) {
                var9 = var4;
            }

            int[] var10 = PathingEntity.aSprite794.pixels;
            var11 = (103 - var2) * 2048 + var1 * 4 + 24624;
            var12 = var5 >> 14 & 32767;
            ObjectDefinition var13 = Class5.method17(var12);
            if (var13.anInt1257 != -1) {
                CompressedImage var14 = Client.aCompressedImageArray1542[var13.anInt1257];
                if (var14 != null) {
                    int var15 = (var13.anInt230 * 4 - var14.anInt206) / 2;
                    int var16 = (var13.anInt222 * 4 - var14.anInt232) / 2;
                    var14.method1155(var1 * 4 + 48 + var15, var16 + (104 - var2 - var13.anInt222) * 4 + 48);
                }
            } else {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }

                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }

                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            }
        }

        var5 = Class60.aSceneGraph631.method677(var0, var1, var2);
        if (var5 != 0) {
            var6 = Class60.aSceneGraph631.method668(var0, var1, var2, var5);
            var7 = var6 >> 6 & 3;
            var8 = var6 & 31;
            var9 = var5 >> 14 & 32767;
            ObjectDefinition var23 = Class5.method17(var9);
            int var18;
            if (var23.anInt1257 != -1) {
                CompressedImage var17 = Client.aCompressedImageArray1542[var23.anInt1257];
                if (var17 != null) {
                    var12 = (var23.anInt230 * 4 - var17.anInt206) / 2;
                    var18 = (var23.anInt222 * 4 - var17.anInt232) / 2;
                    var17.method1155(var12 + var1 * 4 + 48, var18 + (104 - var2 - var23.anInt222) * 4 + 48);
                }
            } else if (var8 == 9) {
                var11 = 15658734;
                if (var5 > 0) {
                    var11 = 15597568;
                }

                int[] var22 = PathingEntity.aSprite794.pixels;
                var18 = var1 * 4 + 24624 + (103 - var2) * 2048;
                if (var7 != 0 && var7 != 2) {
                    var22[var18] = var11;
                    var22[var18 + 512 + 1] = var11;
                    var22[var18 + 1024 + 2] = var11;
                    var22[var18 + 1536 + 3] = var11;
                } else {
                    var22[var18 + 1536] = var11;
                    var22[var18 + 1024 + 1] = var11;
                    var22[var18 + 512 + 2] = var11;
                    var22[var18 + 3] = var11;
                }
            }
        }

        var5 = Class60.aSceneGraph631.method678(var0, var1, var2);
        if (var5 != 0) {
            var6 = var5 >> 14 & 32767;
            ObjectDefinition var19 = Class5.method17(var6);
            if (var19.anInt1257 != -1) {
                CompressedImage var20 = Client.aCompressedImageArray1542[var19.anInt1257];
                if (var20 != null) {
                    var9 = (var19.anInt230 * 4 - var20.anInt206) / 2;
                    int var21 = (var19.anInt222 * 4 - var20.anInt232) / 2;
                    var20.method1155(var1 * 4 + 48 + var9, var21 + (104 - var2 - var19.anInt222) * 4 + 48);
                }
            }
        }

    }

    public boolean method163(Object var1) {
        if (!(var1 instanceof Class6_Sub2)) {
            return false;
        }
        Class6_Sub2 var2 = (Class6_Sub2) var1;
        return this.anInt43 == var2.anInt43 && this.anInt42 == var2.anInt42;
    }

    public int method162() {
        return this.anInt43 | this.anInt42 << 8;
    }

    void method157(Buffer var1, Buffer var2) {
        int var3 = var2.readUnsignedByte();
        if (var3 != Class14.aClass14_114.anInt115) {
            throw new IllegalStateException("");
        }
        this.anInt45 = var2.readUnsignedByte();
        this.anInt48 = var2.readUnsignedByte();
        this.anInt40 = var2.readUnsignedShort();
        this.anInt49 = var2.readUnsignedShort();
        this.anInt43 = var2.readUnsignedShort();
        this.anInt42 = var2.readUnsignedShort();
        this.anInt48 = Math.min(this.anInt48, 4);
        this.aShortArrayArrayArray47 = new short[1][64][64];
        this.aShortArrayArrayArray46 = new short[this.anInt48][64][64];
        this.aByteArrayArrayArray44 = new byte[this.anInt48][64][64];
        this.aByteArrayArrayArray41 = new byte[this.anInt48][64][64];
        this.mapTiles = new MapTile[this.anInt48][64][64][];
        var3 = var1.readUnsignedByte();
        if (Class17.aClass17_124.anInt125 != var3) {
            throw new IllegalStateException("");
        }
        int var4 = var1.readUnsignedByte();
        int var5 = var1.readUnsignedByte();
        if (this.anInt43 == var4 && var5 == this.anInt42) {
            for (int var6 = 0; var6 < 64; ++var6) {
                for (int var7 = 0; var7 < 64; ++var7) {
                    this.method23(var6, var7, var1);
                }
            }

        } else {
            throw new IllegalStateException("");
        }
    }
}
