public class Node_Sub18 extends Node {
    short[] aShortArray1714 = new short[128];
    Node_Sub11_Sub1[] aNode_Sub11_Sub1Array1717 = new Node_Sub11_Sub1[128];
    byte[] aByteArray1715 = new byte[128];
    byte[] aByteArray1278 = new byte[128];
    int[] anIntArray932 = new int[128];
    Class138[] aClass138Array1716 = new Class138[128];
    byte[] aByteArray978 = new byte[128];
    int anInt204;

    Node_Sub18(byte[] var1) {
        Buffer var2 = new Buffer(var1);

        int var3;
        for (var3 = 0; var2.payload[var2.caret + var3] != 0; ++var3) {
        }

        byte[] var4 = new byte[var3];

        int var5;
        for (var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var2.method870();
        }

        ++var2.caret;
        ++var3;
        var5 = var2.caret;
        var2.caret += var3;

        int var6;
        for (var6 = 0; var2.payload[var6 + var2.caret] != 0; ++var6) {
        }

        byte[] var7 = new byte[var6];

        int var8;
        for (var8 = 0; var8 < var6; ++var8) {
            var7[var8] = var2.method870();
        }

        ++var2.caret;
        ++var6;
        var8 = var2.caret;
        var2.caret += var6;

        int var9;
        for (var9 = 0; var2.payload[var9 + var2.caret] != 0; ++var9) {
        }

        byte[] var10 = new byte[var9];

        for (int var11 = 0; var11 < var9; ++var11) {
            var10[var11] = var2.method870();
        }

        ++var2.caret;
        ++var9;
        byte[] var12 = new byte[var9];
        int var14;
        int var15;
        if (var9 > 1) {
            var12[1] = 1;
            int var13 = 1;
            var14 = 2;

            for (var15 = 2; var15 < var9; ++var15) {
                int var16 = var2.readUnsignedByte();
                if (var16 == 0) {
                    var13 = var14++;
                } else {
                    if (var16 <= var13) {
                        --var16;
                    }

                    var13 = var16;
                }

                var12[var15] = (byte) var13;
            }
        } else {
            var14 = var9;
        }

        Class138[] var17 = new Class138[var14];

        Class138 var18;
        for (var15 = 0; var15 < var17.length; ++var15) {
            var18 = var17[var15] = new Class138();
            int var19 = var2.readUnsignedByte();
            if (var19 > 0) {
                var18.aByteArray1759 = new byte[var19 * 2];
            }

            var19 = var2.readUnsignedByte();
            if (var19 > 0) {
                var18.aByteArray1768 = new byte[var19 * 2 + 2];
                var18.aByteArray1768[1] = 64;
            }
        }

        var15 = var2.readUnsignedByte();
        byte[] var42 = var15 > 0 ? new byte[var15 * 2] : null;
        var15 = var2.readUnsignedByte();
        byte[] var20 = var15 > 0 ? new byte[var15 * 2] : null;

        int var21;
        for (var21 = 0; var2.payload[var2.caret + var21] != 0; ++var21) {
        }

        byte[] var22 = new byte[var21];

        int var23;
        for (var23 = 0; var23 < var21; ++var23) {
            var22[var23] = var2.method870();
        }

        ++var2.caret;
        ++var21;
        var23 = 0;

        int var24;
        for (var24 = 0; var24 < 128; ++var24) {
            var23 += var2.readUnsignedByte();
            this.aShortArray1714[var24] = (short) var23;
        }

        var23 = 0;

        for (var24 = 0; var24 < 128; ++var24) {
            var23 += var2.readUnsignedByte();
            this.aShortArray1714[var24] = (short) (this.aShortArray1714[var24] + (var23 << 8));
        }

        var24 = 0;
        int var25 = 0;
        int var26 = 0;

        int var27;
        for (var27 = 0; var27 < 128; ++var27) {
            if (var24 == 0) {
                if (var25 < var22.length) {
                    var24 = var22[var25++];
                } else {
                    var24 = -1;
                }

                var26 = var2.method817();
            }

            this.aShortArray1714[var27] = (short) (this.aShortArray1714[var27] + ((var26 - 1 & 2) << 14));
            this.anIntArray932[var27] = var26;
            --var24;
        }

        var24 = 0;
        var25 = 0;
        var27 = 0;

        int var28;
        for (var28 = 0; var28 < 128; ++var28) {
            if (this.anIntArray932[var28] != 0) {
                if (var24 == 0) {
                    if (var25 < var4.length) {
                        var24 = var4[var25++];
                    } else {
                        var24 = -1;
                    }

                    var27 = var2.payload[var5++] - 1;
                }

                this.aByteArray978[var28] = (byte) var27;
                --var24;
            }
        }

        var24 = 0;
        var25 = 0;
        var28 = 0;

        for (int var29 = 0; var29 < 128; ++var29) {
            if (this.anIntArray932[var29] != 0) {
                if (var24 == 0) {
                    if (var25 < var7.length) {
                        var24 = var7[var25++];
                    } else {
                        var24 = -1;
                    }

                    var28 = var2.payload[var8++] + 16 << 2;
                }

                this.aByteArray1715[var29] = (byte) var28;
                --var24;
            }
        }

        var24 = 0;
        var25 = 0;
        Class138 var30 = null;

        int var31;
        for (var31 = 0; var31 < 128; ++var31) {
            if (this.anIntArray932[var31] != 0) {
                if (var24 == 0) {
                    var30 = var17[var12[var25]];
                    if (var25 < var10.length) {
                        var24 = var10[var25++];
                    } else {
                        var24 = -1;
                    }
                }

                this.aClass138Array1716[var31] = var30;
                --var24;
            }
        }

        var24 = 0;
        var25 = 0;
        var31 = 0;

        int var32;
        for (var32 = 0; var32 < 128; ++var32) {
            if (var24 == 0) {
                if (var25 < var22.length) {
                    var24 = var22[var25++];
                } else {
                    var24 = -1;
                }

                if (this.anIntArray932[var32] > 0) {
                    var31 = var2.readUnsignedByte() + 1;
                }
            }

            this.aByteArray1278[var32] = (byte) var31;
            --var24;
        }

        this.anInt204 = var2.readUnsignedByte() + 1;

        Class138 var33;
        int var34;
        for (var32 = 0; var32 < var14; ++var32) {
            var33 = var17[var32];
            if (var33.aByteArray1759 != null) {
                for (var34 = 1; var34 < var33.aByteArray1759.length; var34 += 2) {
                    var33.aByteArray1759[var34] = var2.method870();
                }
            }

            if (var33.aByteArray1768 != null) {
                for (var34 = 3; var34 < var33.aByteArray1768.length - 2; var34 += 2) {
                    var33.aByteArray1768[var34] = var2.method870();
                }
            }
        }

        if (var42 != null) {
            for (var32 = 1; var32 < var42.length; var32 += 2) {
                var42[var32] = var2.method870();
            }
        }

        if (var20 != null) {
            for (var32 = 1; var32 < var20.length; var32 += 2) {
                var20[var32] = var2.method870();
            }
        }

        for (var32 = 0; var32 < var14; ++var32) {
            var33 = var17[var32];
            if (var33.aByteArray1768 != null) {
                var23 = 0;

                for (var34 = 2; var34 < var33.aByteArray1768.length; var34 += 2) {
                    var23 = var23 + 1 + var2.readUnsignedByte();
                    var33.aByteArray1768[var34] = (byte) var23;
                }
            }
        }

        for (var32 = 0; var32 < var14; ++var32) {
            var33 = var17[var32];
            if (var33.aByteArray1759 != null) {
                var23 = 0;

                for (var34 = 2; var34 < var33.aByteArray1759.length; var34 += 2) {
                    var23 = var23 + 1 + var2.readUnsignedByte();
                    var33.aByteArray1759[var34] = (byte) var23;
                }
            }
        }

        byte var36;
        int var38;
        int var39;
        int var40;
        int var45;
        byte var46;
        if (var42 != null) {
            var23 = var2.readUnsignedByte();
            var42[0] = (byte) var23;

            for (var32 = 2; var32 < var42.length; var32 += 2) {
                var23 = var23 + 1 + var2.readUnsignedByte();
                var42[var32] = (byte) var23;
            }

            var46 = var42[0];
            byte var35 = var42[1];

            for (var34 = 0; var34 < var46; ++var34) {
                this.aByteArray1278[var34] = (byte) (var35 * this.aByteArray1278[var34] + 32 >> 6);
            }

            for (var34 = 2; var34 < var42.length; var34 += 2) {
                var36 = var42[var34];
                byte var37 = var42[var34 + 1];
                var38 = (var36 - var46) / 2 + var35 * (var36 - var46);

                for (var39 = var46; var39 < var36; ++var39) {
                    var40 = Class94.method617(var38, var36 - var46);
                    this.aByteArray1278[var39] = (byte) (this.aByteArray1278[var39] * var40 + 32 >> 6);
                    var38 += var37 - var35;
                }

                var46 = var36;
                var35 = var37;
            }

            for (var45 = var46; var45 < 128; ++var45) {
                this.aByteArray1278[var45] = (byte) (this.aByteArray1278[var45] * var35 + 32 >> 6);
            }

            var18 = null;
        }

        if (var20 != null) {
            var23 = var2.readUnsignedByte();
            var20[0] = (byte) var23;

            for (var32 = 2; var32 < var20.length; var32 += 2) {
                var23 = var23 + 1 + var2.readUnsignedByte();
                var20[var32] = (byte) var23;
            }

            var46 = var20[0];
            int var44 = var20[1] << 1;

            for (var34 = 0; var34 < var46; ++var34) {
                var45 = (this.aByteArray1715[var34] & 255) + var44;
                if (var45 < 0) {
                    var45 = 0;
                }

                if (var45 > 128) {
                    var45 = 128;
                }

                this.aByteArray1715[var34] = (byte) var45;
            }

            int var47;
            for (var34 = 2; var34 < var20.length; var34 += 2) {
                var36 = var20[var34];
                var47 = var20[var34 + 1] << 1;
                var38 = var44 * (var36 - var46) + (var36 - var46) / 2;

                for (var39 = var46; var39 < var36; ++var39) {
                    var40 = Class94.method617(var38, var36 - var46);
                    int var41 = (this.aByteArray1715[var39] & 255) + var40;
                    if (var41 < 0) {
                        var41 = 0;
                    }

                    if (var41 > 128) {
                        var41 = 128;
                    }

                    this.aByteArray1715[var39] = (byte) var41;
                    var38 += var47 - var44;
                }

                var46 = var36;
                var44 = var47;
            }

            for (var45 = var46; var45 < 128; ++var45) {
                var47 = var44 + (this.aByteArray1715[var45] & 255);
                if (var47 < 0) {
                    var47 = 0;
                }

                if (var47 > 128) {
                    var47 = 128;
                }

                this.aByteArray1715[var45] = (byte) var47;
            }

            Object var43 = null;
        }

        for (var32 = 0; var32 < var14; ++var32) {
            var17[var32].anInt1762 = var2.readUnsignedByte();
        }

        for (var32 = 0; var32 < var14; ++var32) {
            var33 = var17[var32];
            if (var33.aByteArray1759 != null) {
                var33.anInt1761 = var2.readUnsignedByte();
            }

            if (var33.aByteArray1768 != null) {
                var33.anInt1764 = var2.readUnsignedByte();
            }

            if (var33.anInt1762 > 0) {
                var33.anInt1766 = var2.readUnsignedByte();
            }
        }

        for (var32 = 0; var32 < var14; ++var32) {
            var17[var32].anInt1765 = var2.readUnsignedByte();
        }

        for (var32 = 0; var32 < var14; ++var32) {
            var33 = var17[var32];
            if (var33.anInt1765 > 0) {
                var33.anInt1767 = var2.readUnsignedByte();
            }
        }

        for (var32 = 0; var32 < var14; ++var32) {
            var33 = var17[var32];
            if (var33.anInt1767 > 0) {
                var33.anInt1763 = var2.readUnsignedByte();
            }
        }

    }

    void method335() {
        this.anIntArray932 = null;
    }

    boolean method904(Class85 var1, byte[] var2, int[] var3) {
        boolean var4 = true;
        int var5 = 0;
        Node_Sub11_Sub1 var6 = null;

        for (int var7 = 0; var7 < 128; ++var7) {
            if (var2 == null || var2[var7] != 0) {
                int var8 = this.anIntArray932[var7];
                if (var8 != 0) {
                    if (var5 != var8) {
                        var5 = var8--;
                        if ((var8 & 1) == 0) {
                            var6 = var1.method494(var8 >> 2, var3);
                        } else {
                            var6 = var1.method493(var8 >> 2, var3);
                        }

                        if (var6 == null) {
                            var4 = false;
                        }
                    }

                    if (var6 != null) {
                        this.aNode_Sub11_Sub1Array1717[var7] = var6;
                        this.anIntArray932[var7] = 0;
                    }
                }
            }
        }

        return var4;
    }
}
