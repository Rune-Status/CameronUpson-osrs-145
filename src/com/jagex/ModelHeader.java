package com.jagex;

public class ModelHeader extends Entity {
    static int[] anIntArray930;
    static int[] anIntArray944 = new int[10000];
    static int[] anIntArray948 = new int[10000];
    static int anInt756 = 0;
    static int[] anIntArray956;

    static {
        anIntArray956 = Node_Sub21_Sub26_Sub1.SINE;
        anIntArray930 = Node_Sub21_Sub26_Sub1.COS;
    }

    public short aShort939;
    public short aShort946;
    byte[] aByteArray945;
    short[] aShortArray924;
    int[] yVertices;
    int[] zVertices;
    int anInt327 = 0;
    int[] anIntArray957;
    int anInt204 = 0;
    short[] aShortArray938;
    byte[] aByteArray927;
    byte[] aByteArray923;
    byte[] aByteArray951;
    int[] anIntArray953;
    short[] aShortArray940;
    short[] aShortArray952;
    byte defaultRenderPriority = 0;
    int anInt235;
    short[] aShortArray936;
    int[] anIntArray934;
    int[] anIntArray932;
    short[] aShortArray931;
    int[][] anIntArrayArray942;
    short[] aShortArray954;
    short[] aShortArray922;
    short[] aShortArray955;
    short[] aShortArray947;
    byte[] aByteArray943;
    int[] anIntArray926;
    int[][] anIntArrayArray925;
    Class100[] aClass100Array935;
    int[] xVertices;
    Class101[] aClass101Array937;
    Class101[] aClass101Array920;
    byte[] aByteArray949;
    boolean aBoolean941 = false;
    short[] aShortArray921;
    int anInt744;
    int anInt766;
    int anInt933;
    int anInt928;
    int anInt746;

    ModelHeader(byte[] var1) {
        if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
            this.method568(var1);
        } else {
            this.method575(var1);
        }

    }

    public ModelHeader(ModelHeader[] var1, int var2) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.anInt204 = 0;
        this.anInt327 = 0;
        this.anInt235 = 0;
        this.defaultRenderPriority = -1;

        int var9;
        ModelHeader var10;
        for (var9 = 0; var9 < var2; ++var9) {
            var10 = var1[var9];
            if (var10 != null) {
                this.anInt204 += var10.anInt204;
                this.anInt327 += var10.anInt327;
                this.anInt235 += var10.anInt235;
                if (var10.aByteArray923 != null) {
                    var4 = true;
                } else {
                    if (this.defaultRenderPriority == -1) {
                        this.defaultRenderPriority = var10.defaultRenderPriority;
                    }

                    if (this.defaultRenderPriority != var10.defaultRenderPriority) {
                        var4 = true;
                    }
                }

                var3 |= var10.aByteArray927 != null;
                var5 |= var10.aByteArray943 != null;
                var6 |= var10.anIntArray926 != null;
                var7 |= var10.aShortArray921 != null;
                var8 |= var10.aByteArray945 != null;
            }
        }

        this.xVertices = new int[this.anInt204];
        this.yVertices = new int[this.anInt204];
        this.zVertices = new int[this.anInt204];
        this.anIntArray953 = new int[this.anInt204];
        this.anIntArray957 = new int[this.anInt327];
        this.anIntArray934 = new int[this.anInt327];
        this.anIntArray932 = new int[this.anInt327];
        if (var3) {
            this.aByteArray927 = new byte[this.anInt327];
        }

        if (var4) {
            this.aByteArray923 = new byte[this.anInt327];
        }

        if (var5) {
            this.aByteArray943 = new byte[this.anInt327];
        }

        if (var6) {
            this.anIntArray926 = new int[this.anInt327];
        }

        if (var7) {
            this.aShortArray921 = new short[this.anInt327];
        }

        if (var8) {
            this.aByteArray945 = new byte[this.anInt327];
        }

        this.aShortArray940 = new short[this.anInt327];
        if (this.anInt235 > 0) {
            this.aByteArray949 = new byte[this.anInt235];
            this.aShortArray936 = new short[this.anInt235];
            this.aShortArray947 = new short[this.anInt235];
            this.aShortArray938 = new short[this.anInt235];
            this.aShortArray931 = new short[this.anInt235];
            this.aShortArray924 = new short[this.anInt235];
            this.aShortArray954 = new short[this.anInt235];
            this.aShortArray922 = new short[this.anInt235];
            this.aByteArray951 = new byte[this.anInt235];
            this.aShortArray955 = new short[this.anInt235];
            this.aShortArray952 = new short[this.anInt235];
        }

        this.anInt204 = 0;
        this.anInt327 = 0;
        this.anInt235 = 0;

        for (var9 = 0; var9 < var2; ++var9) {
            var10 = var1[var9];
            if (var10 != null) {
                int var11;
                for (var11 = 0; var11 < var10.anInt327; ++var11) {
                    if (var3 && var10.aByteArray927 != null) {
                        this.aByteArray927[this.anInt327] = var10.aByteArray927[var11];
                    }

                    if (var4) {
                        if (var10.aByteArray923 != null) {
                            this.aByteArray923[this.anInt327] = var10.aByteArray923[var11];
                        } else {
                            this.aByteArray923[this.anInt327] = var10.defaultRenderPriority;
                        }
                    }

                    if (var5 && var10.aByteArray943 != null) {
                        this.aByteArray943[this.anInt327] = var10.aByteArray943[var11];
                    }

                    if (var6 && var10.anIntArray926 != null) {
                        this.anIntArray926[this.anInt327] = var10.anIntArray926[var11];
                    }

                    if (var7) {
                        if (var10.aShortArray921 != null) {
                            this.aShortArray921[this.anInt327] = var10.aShortArray921[var11];
                        } else {
                            this.aShortArray921[this.anInt327] = -1;
                        }
                    }

                    if (var8) {
                        if (var10.aByteArray945 != null && var10.aByteArray945[var11] != -1) {
                            this.aByteArray945[this.anInt327] = (byte) (var10.aByteArray945[var11] + this.anInt235);
                        } else {
                            this.aByteArray945[this.anInt327] = -1;
                        }
                    }

                    this.aShortArray940[this.anInt327] = var10.aShortArray940[var11];
                    this.anIntArray957[this.anInt327] = this.method579(var10, var10.anIntArray957[var11]);
                    this.anIntArray934[this.anInt327] = this.method579(var10, var10.anIntArray934[var11]);
                    this.anIntArray932[this.anInt327] = this.method579(var10, var10.anIntArray932[var11]);
                    ++this.anInt327;
                }

                for (var11 = 0; var11 < var10.anInt235; ++var11) {
                    byte var12 = this.aByteArray949[this.anInt235] = var10.aByteArray949[var11];
                    if (var12 == 0) {
                        this.aShortArray936[this.anInt235] = (short) this.method579(var10, var10.aShortArray936[var11]);
                        this.aShortArray947[this.anInt235] = (short) this.method579(var10, var10.aShortArray947[var11]);
                        this.aShortArray938[this.anInt235] = (short) this.method579(var10, var10.aShortArray938[var11]);
                    }

                    if (var12 >= 1 && var12 <= 3) {
                        this.aShortArray936[this.anInt235] = var10.aShortArray936[var11];
                        this.aShortArray947[this.anInt235] = var10.aShortArray947[var11];
                        this.aShortArray938[this.anInt235] = var10.aShortArray938[var11];
                        this.aShortArray931[this.anInt235] = var10.aShortArray931[var11];
                        this.aShortArray924[this.anInt235] = var10.aShortArray924[var11];
                        this.aShortArray954[this.anInt235] = var10.aShortArray954[var11];
                        this.aShortArray922[this.anInt235] = var10.aShortArray922[var11];
                        this.aByteArray951[this.anInt235] = var10.aByteArray951[var11];
                        this.aShortArray955[this.anInt235] = var10.aShortArray955[var11];
                    }

                    if (var12 == 2) {
                        this.aShortArray952[this.anInt235] = var10.aShortArray952[var11];
                    }

                    ++this.anInt235;
                }
            }
        }

    }

    public ModelHeader(ModelHeader var1, boolean var2, boolean var3, boolean var4, boolean var5) {
        this.anInt204 = var1.anInt204;
        this.anInt327 = var1.anInt327;
        this.anInt235 = var1.anInt235;
        int var6;
        if (var2) {
            this.xVertices = var1.xVertices;
            this.yVertices = var1.yVertices;
            this.zVertices = var1.zVertices;
        } else {
            this.xVertices = new int[this.anInt204];
            this.yVertices = new int[this.anInt204];
            this.zVertices = new int[this.anInt204];

            for (var6 = 0; var6 < this.anInt204; ++var6) {
                this.xVertices[var6] = var1.xVertices[var6];
                this.yVertices[var6] = var1.yVertices[var6];
                this.zVertices[var6] = var1.zVertices[var6];
            }
        }

        if (var3) {
            this.aShortArray940 = var1.aShortArray940;
        } else {
            this.aShortArray940 = new short[this.anInt327];

            for (var6 = 0; var6 < this.anInt327; ++var6) {
                this.aShortArray940[var6] = var1.aShortArray940[var6];
            }
        }

        if (!var4 && var1.aShortArray921 != null) {
            this.aShortArray921 = new short[this.anInt327];

            for (var6 = 0; var6 < this.anInt327; ++var6) {
                this.aShortArray921[var6] = var1.aShortArray921[var6];
            }
        } else {
            this.aShortArray921 = var1.aShortArray921;
        }

        this.aByteArray943 = var1.aByteArray943;
        this.anIntArray957 = var1.anIntArray957;
        this.anIntArray934 = var1.anIntArray934;
        this.anIntArray932 = var1.anIntArray932;
        this.aByteArray927 = var1.aByteArray927;
        this.aByteArray923 = var1.aByteArray923;
        this.aByteArray945 = var1.aByteArray945;
        this.defaultRenderPriority = var1.defaultRenderPriority;
        this.aByteArray949 = var1.aByteArray949;
        this.aShortArray936 = var1.aShortArray936;
        this.aShortArray947 = var1.aShortArray947;
        this.aShortArray938 = var1.aShortArray938;
        this.aShortArray931 = var1.aShortArray931;
        this.aShortArray924 = var1.aShortArray924;
        this.aShortArray954 = var1.aShortArray954;
        this.aShortArray922 = var1.aShortArray922;
        this.aByteArray951 = var1.aByteArray951;
        this.aShortArray955 = var1.aShortArray955;
        this.aShortArray952 = var1.aShortArray952;
        this.anIntArray953 = var1.anIntArray953;
        this.anIntArray926 = var1.anIntArray926;
        this.anIntArrayArray925 = var1.anIntArrayArray925;
        this.anIntArrayArray942 = var1.anIntArrayArray942;
        this.aClass101Array937 = var1.aClass101Array937;
        this.aClass100Array935 = var1.aClass100Array935;
        this.aClass101Array920 = var1.aClass101Array920;
        this.aShort939 = var1.aShort939;
        this.aShort946 = var1.aShort946;
    }

    ModelHeader() {
    }

    public static ModelHeader method571(ReferenceTable var0, int var1, int var2) {
        byte[] var3 = var0.method1085(var1, var2);
        return var3 == null ? null : new ModelHeader(var3);
    }

    static int method580(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 'ﾀ') + var1;
    }

    static int method565(int var0) {
        if (var0 < 2) {
            var0 = 2;
        } else if (var0 > 126) {
            var0 = 126;
        }

        return var0;
    }

    static void method577(ModelHeader var0, ModelHeader var1, int var2, int var3, int var4, boolean var5) {
        var0.method582();
        var0.method581();
        var1.method582();
        var1.method581();
        ++anInt756;
        int var6 = 0;
        int[] var7 = var1.xVertices;
        int var8 = var1.anInt204;

        int var9;
        for (var9 = 0; var9 < var0.anInt204; ++var9) {
            Class101 var10 = var0.aClass101Array937[var9];
            if (var10.anInt1136 != 0) {
                int var11 = var0.yVertices[var9] - var3;
                if (var11 <= var1.anInt746) {
                    int var12 = var0.xVertices[var9] - var2;
                    if (var12 >= var1.anInt744 && var12 <= var1.anInt766) {
                        int var13 = var0.zVertices[var9] - var4;
                        if (var13 >= var1.anInt928 && var13 <= var1.anInt933) {
                            for (int var14 = 0; var14 < var8; ++var14) {
                                Class101 var15 = var1.aClass101Array937[var14];
                                if (var12 == var7[var14] && var13 == var1.zVertices[var14] && var11 == var1.yVertices[var14] && var15.anInt1136 != 0) {
                                    if (var0.aClass101Array920 == null) {
                                        var0.aClass101Array920 = new Class101[var0.anInt204];
                                    }

                                    if (var1.aClass101Array920 == null) {
                                        var1.aClass101Array920 = new Class101[var8];
                                    }

                                    Class101 var16 = var0.aClass101Array920[var9];
                                    if (var16 == null) {
                                        var16 = var0.aClass101Array920[var9] = new Class101(var10);
                                    }

                                    Class101 var17 = var1.aClass101Array920[var14];
                                    if (var17 == null) {
                                        var17 = var1.aClass101Array920[var14] = new Class101(var15);
                                    }

                                    var16.anInt1135 += var15.anInt1135;
                                    var16.anInt1138 += var15.anInt1138;
                                    var16.anInt1137 += var15.anInt1137;
                                    var16.anInt1136 += var15.anInt1136;
                                    var17.anInt1135 += var10.anInt1135;
                                    var17.anInt1138 += var10.anInt1138;
                                    var17.anInt1137 += var10.anInt1137;
                                    var17.anInt1136 += var10.anInt1136;
                                    ++var6;
                                    anIntArray944[var9] = anInt756;
                                    anIntArray948[var14] = anInt756;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var6 >= 3 && var5) {
            for (var9 = 0; var9 < var0.anInt327; ++var9) {
                if (anIntArray944[var0.anIntArray957[var9]] == anInt756 && anIntArray944[var0.anIntArray934[var9]] == anInt756 && anIntArray944[var0.anIntArray932[var9]] == anInt756) {
                    if (var0.aByteArray927 == null) {
                        var0.aByteArray927 = new byte[var0.anInt327];
                    }

                    var0.aByteArray927[var9] = 2;
                }
            }

            for (var9 = 0; var9 < var1.anInt327; ++var9) {
                if (anIntArray948[var1.anIntArray957[var9]] == anInt756 && anIntArray948[var1.anIntArray934[var9]] == anInt756 && anIntArray948[var1.anIntArray932[var9]] == anInt756) {
                    if (var1.aByteArray927 == null) {
                        var1.aByteArray927 = new byte[var1.anInt327];
                    }

                    var1.aByteArray927[var9] = 2;
                }
            }

        }
    }

    void method568(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var2.caret = var1.length - 23;
        int var9 = var2.readUnsignedShort();
        int var10 = var2.readUnsignedShort();
        int var11 = var2.readUnsignedByte();
        int var12 = var2.readUnsignedByte();
        int var13 = var2.readUnsignedByte();
        int var14 = var2.readUnsignedByte();
        int var15 = var2.readUnsignedByte();
        int var16 = var2.readUnsignedByte();
        int var17 = var2.readUnsignedByte();
        int var18 = var2.readUnsignedShort();
        int var19 = var2.readUnsignedShort();
        int var20 = var2.readUnsignedShort();
        int var21 = var2.readUnsignedShort();
        int var22 = var2.readUnsignedShort();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26;
        if (var11 > 0) {
            this.aByteArray949 = new byte[var11];
            var2.caret = 0;

            for (var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.aByteArray949[var26] = var2.method870();
                if (var27 == 0) {
                    ++var23;
                }

                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }

                if (var27 == 2) {
                    ++var25;
                }
            }
        }

        var26 = var11 + var9;
        int var28 = var26;
        if (var12 == 1) {
            var26 += var10;
        }

        int var29 = var26;
        var26 += var10;
        int var30 = var26;
        if (var13 == 255) {
            var26 += var10;
        }

        int var31 = var26;
        if (var15 == 1) {
            var26 += var10;
        }

        int var32 = var26;
        if (var17 == 1) {
            var26 += var9;
        }

        int var33 = var26;
        if (var14 == 1) {
            var26 += var10;
        }

        int var34 = var26;
        var26 += var21;
        int var35 = var26;
        if (var16 == 1) {
            var26 += var10 * 2;
        }

        int var36 = var26;
        var26 += var22;
        int var37 = var26;
        var26 += var10 * 2;
        int var38 = var26;
        var26 += var18;
        int var39 = var26;
        var26 += var19;
        int var40 = var26;
        var26 += var20;
        int var41 = var26;
        var26 += var23 * 6;
        int var42 = var26;
        var26 += var24 * 6;
        int var43 = var26;
        var26 += var24 * 6;
        int var44 = var26;
        var26 += var24 * 2;
        int var45 = var26;
        var26 += var24;
        int var46 = var26;
        var26 += var24 * 2 + var25 * 2;
        this.anInt204 = var9;
        this.anInt327 = var10;
        this.anInt235 = var11;
        this.xVertices = new int[var9];
        this.yVertices = new int[var9];
        this.zVertices = new int[var9];
        this.anIntArray957 = new int[var10];
        this.anIntArray934 = new int[var10];
        this.anIntArray932 = new int[var10];
        if (var17 == 1) {
            this.anIntArray953 = new int[var9];
        }

        if (var12 == 1) {
            this.aByteArray927 = new byte[var10];
        }

        if (var13 == 255) {
            this.aByteArray923 = new byte[var10];
        } else {
            this.defaultRenderPriority = (byte) var13;
        }

        if (var14 == 1) {
            this.aByteArray943 = new byte[var10];
        }

        if (var15 == 1) {
            this.anIntArray926 = new int[var10];
        }

        if (var16 == 1) {
            this.aShortArray921 = new short[var10];
        }

        if (var16 == 1 && var11 > 0) {
            this.aByteArray945 = new byte[var10];
        }

        this.aShortArray940 = new short[var10];
        if (var11 > 0) {
            this.aShortArray936 = new short[var11];
            this.aShortArray947 = new short[var11];
            this.aShortArray938 = new short[var11];
            if (var24 > 0) {
                this.aShortArray931 = new short[var24];
                this.aShortArray924 = new short[var24];
                this.aShortArray954 = new short[var24];
                this.aShortArray922 = new short[var24];
                this.aByteArray951 = new byte[var24];
                this.aShortArray955 = new short[var24];
            }

            if (var25 > 0) {
                this.aShortArray952 = new short[var25];
            }
        }

        var2.caret = var11;
        var3.caret = var38;
        var4.caret = var39;
        var5.caret = var40;
        var6.caret = var32;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;

        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        for (var51 = 0; var51 < var9; ++var51) {
            var52 = var2.readUnsignedByte();
            var53 = 0;
            if ((var52 & 1) != 0) {
                var53 = var3.method816();
            }

            var54 = 0;
            if ((var52 & 2) != 0) {
                var54 = var4.method816();
            }

            var55 = 0;
            if ((var52 & 4) != 0) {
                var55 = var5.method816();
            }

            this.xVertices[var51] = var48 + var53;
            this.yVertices[var51] = var49 + var54;
            this.zVertices[var51] = var50 + var55;
            var48 = this.xVertices[var51];
            var49 = this.yVertices[var51];
            var50 = this.zVertices[var51];
            if (var17 == 1) {
                this.anIntArray953[var51] = var6.readUnsignedByte();
            }
        }

        var2.caret = var37;
        var3.caret = var28;
        var4.caret = var30;
        var5.caret = var33;
        var6.caret = var31;
        var7.caret = var35;
        var8.caret = var36;

        for (var51 = 0; var51 < var10; ++var51) {
            this.aShortArray940[var51] = (short) var2.readUnsignedShort();
            if (var12 == 1) {
                this.aByteArray927[var51] = var3.method870();
            }

            if (var13 == 255) {
                this.aByteArray923[var51] = var4.method870();
            }

            if (var14 == 1) {
                this.aByteArray943[var51] = var5.method870();
            }

            if (var15 == 1) {
                this.anIntArray926[var51] = var6.readUnsignedByte();
            }

            if (var16 == 1) {
                this.aShortArray921[var51] = (short) (var7.readUnsignedShort() - 1);
            }

            if (this.aByteArray945 != null && this.aShortArray921[var51] != -1) {
                this.aByteArray945[var51] = (byte) (var8.readUnsignedByte() - 1);
            }
        }

        var2.caret = var34;
        var3.caret = var29;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        var54 = 0;

        int var56;
        for (var55 = 0; var55 < var10; ++var55) {
            var56 = var3.readUnsignedByte();
            if (var56 == 1) {
                var51 = var2.method816() + var54;
                var52 = var2.method816() + var51;
                var53 = var2.method816() + var52;
                var54 = var53;
                this.anIntArray957[var55] = var51;
                this.anIntArray934[var55] = var52;
                this.anIntArray932[var55] = var53;
            }

            if (var56 == 2) {
                var52 = var53;
                var53 = var2.method816() + var54;
                var54 = var53;
                this.anIntArray957[var55] = var51;
                this.anIntArray934[var55] = var52;
                this.anIntArray932[var55] = var53;
            }

            if (var56 == 3) {
                var51 = var53;
                var53 = var2.method816() + var54;
                var54 = var53;
                this.anIntArray957[var55] = var51;
                this.anIntArray934[var55] = var52;
                this.anIntArray932[var55] = var53;
            }

            if (var56 == 4) {
                int var57 = var51;
                var51 = var52;
                var52 = var57;
                var53 = var2.method816() + var54;
                var54 = var53;
                this.anIntArray957[var55] = var51;
                this.anIntArray934[var55] = var57;
                this.anIntArray932[var55] = var53;
            }
        }

        var2.caret = var41;
        var3.caret = var42;
        var4.caret = var43;
        var5.caret = var44;
        var6.caret = var45;
        var7.caret = var46;

        for (var55 = 0; var55 < var11; ++var55) {
            var56 = this.aByteArray949[var55] & 255;
            if (var56 == 0) {
                this.aShortArray936[var55] = (short) var2.readUnsignedShort();
                this.aShortArray947[var55] = (short) var2.readUnsignedShort();
                this.aShortArray938[var55] = (short) var2.readUnsignedShort();
            }

            if (var56 == 1) {
                this.aShortArray936[var55] = (short) var3.readUnsignedShort();
                this.aShortArray947[var55] = (short) var3.readUnsignedShort();
                this.aShortArray938[var55] = (short) var3.readUnsignedShort();
                this.aShortArray931[var55] = (short) var4.readUnsignedShort();
                this.aShortArray924[var55] = (short) var4.readUnsignedShort();
                this.aShortArray954[var55] = (short) var4.readUnsignedShort();
                this.aShortArray922[var55] = (short) var5.readUnsignedShort();
                this.aByteArray951[var55] = var6.method870();
                this.aShortArray955[var55] = (short) var7.readUnsignedShort();
            }

            if (var56 == 2) {
                this.aShortArray936[var55] = (short) var3.readUnsignedShort();
                this.aShortArray947[var55] = (short) var3.readUnsignedShort();
                this.aShortArray938[var55] = (short) var3.readUnsignedShort();
                this.aShortArray931[var55] = (short) var4.readUnsignedShort();
                this.aShortArray924[var55] = (short) var4.readUnsignedShort();
                this.aShortArray954[var55] = (short) var4.readUnsignedShort();
                this.aShortArray922[var55] = (short) var5.readUnsignedShort();
                this.aByteArray951[var55] = var6.method870();
                this.aShortArray955[var55] = (short) var7.readUnsignedShort();
                this.aShortArray952[var55] = (short) var7.readUnsignedShort();
            }

            if (var56 == 3) {
                this.aShortArray936[var55] = (short) var3.readUnsignedShort();
                this.aShortArray947[var55] = (short) var3.readUnsignedShort();
                this.aShortArray938[var55] = (short) var3.readUnsignedShort();
                this.aShortArray931[var55] = (short) var4.readUnsignedShort();
                this.aShortArray924[var55] = (short) var4.readUnsignedShort();
                this.aShortArray954[var55] = (short) var4.readUnsignedShort();
                this.aShortArray922[var55] = (short) var5.readUnsignedShort();
                this.aByteArray951[var55] = var6.method870();
                this.aShortArray955[var55] = (short) var7.readUnsignedShort();
            }
        }

        var2.caret = var26;
        var55 = var2.readUnsignedByte();
        if (var55 != 0) {
            new Class102();
            var2.readUnsignedShort();
            var2.readUnsignedShort();
            var2.readUnsignedShort();
            var2.method835();
        }

    }

    void method575(byte[] var1) {
        boolean var2 = false;
        boolean var3 = false;
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var4.caret = var1.length - 18;
        int var9 = var4.readUnsignedShort();
        int var10 = var4.readUnsignedShort();
        int var11 = var4.readUnsignedByte();
        int var12 = var4.readUnsignedByte();
        int var13 = var4.readUnsignedByte();
        int var14 = var4.readUnsignedByte();
        int var15 = var4.readUnsignedByte();
        int var16 = var4.readUnsignedByte();
        int var17 = var4.readUnsignedShort();
        int var18 = var4.readUnsignedShort();
        int var19 = var4.readUnsignedShort();
        int var20 = var4.readUnsignedShort();
        byte var21 = 0;
        int var45 = var21 + var9;
        int var23 = var45;
        var45 += var10;
        int var24 = var45;
        if (var13 == 255) {
            var45 += var10;
        }

        int var25 = var45;
        if (var15 == 1) {
            var45 += var10;
        }

        int var26 = var45;
        if (var12 == 1) {
            var45 += var10;
        }

        int var27 = var45;
        if (var16 == 1) {
            var45 += var9;
        }

        int var28 = var45;
        if (var14 == 1) {
            var45 += var10;
        }

        int var29 = var45;
        var45 += var20;
        int var30 = var45;
        var45 += var10 * 2;
        int var31 = var45;
        var45 += var11 * 6;
        int var32 = var45;
        var45 += var17;
        int var33 = var45;
        var45 += var18;
        int var10000 = var45 + var19;
        this.anInt204 = var9;
        this.anInt327 = var10;
        this.anInt235 = var11;
        this.xVertices = new int[var9];
        this.yVertices = new int[var9];
        this.zVertices = new int[var9];
        this.anIntArray957 = new int[var10];
        this.anIntArray934 = new int[var10];
        this.anIntArray932 = new int[var10];
        if (var11 > 0) {
            this.aByteArray949 = new byte[var11];
            this.aShortArray936 = new short[var11];
            this.aShortArray947 = new short[var11];
            this.aShortArray938 = new short[var11];
        }

        if (var16 == 1) {
            this.anIntArray953 = new int[var9];
        }

        if (var12 == 1) {
            this.aByteArray927 = new byte[var10];
            this.aByteArray945 = new byte[var10];
            this.aShortArray921 = new short[var10];
        }

        if (var13 == 255) {
            this.aByteArray923 = new byte[var10];
        } else {
            this.defaultRenderPriority = (byte) var13;
        }

        if (var14 == 1) {
            this.aByteArray943 = new byte[var10];
        }

        if (var15 == 1) {
            this.anIntArray926 = new int[var10];
        }

        this.aShortArray940 = new short[var10];
        var4.caret = var21;
        var5.caret = var32;
        var6.caret = var33;
        var7.caret = var45;
        var8.caret = var27;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;

        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        for (var38 = 0; var38 < var9; ++var38) {
            var39 = var4.readUnsignedByte();
            var40 = 0;
            if ((var39 & 1) != 0) {
                var40 = var5.method816();
            }

            var41 = 0;
            if ((var39 & 2) != 0) {
                var41 = var6.method816();
            }

            var42 = 0;
            if ((var39 & 4) != 0) {
                var42 = var7.method816();
            }

            this.xVertices[var38] = var35 + var40;
            this.yVertices[var38] = var36 + var41;
            this.zVertices[var38] = var37 + var42;
            var35 = this.xVertices[var38];
            var36 = this.yVertices[var38];
            var37 = this.zVertices[var38];
            if (var16 == 1) {
                this.anIntArray953[var38] = var8.readUnsignedByte();
            }
        }

        var4.caret = var30;
        var5.caret = var26;
        var6.caret = var24;
        var7.caret = var28;
        var8.caret = var25;

        for (var38 = 0; var38 < var10; ++var38) {
            this.aShortArray940[var38] = (short) var4.readUnsignedShort();
            if (var12 == 1) {
                var39 = var5.readUnsignedByte();
                if ((var39 & 1) == 1) {
                    this.aByteArray927[var38] = 1;
                    var2 = true;
                } else {
                    this.aByteArray927[var38] = 0;
                }

                if ((var39 & 2) == 2) {
                    this.aByteArray945[var38] = (byte) (var39 >> 2);
                    this.aShortArray921[var38] = this.aShortArray940[var38];
                    this.aShortArray940[var38] = 127;
                    if (this.aShortArray921[var38] != -1) {
                        var3 = true;
                    }
                } else {
                    this.aByteArray945[var38] = -1;
                    this.aShortArray921[var38] = -1;
                }
            }

            if (var13 == 255) {
                this.aByteArray923[var38] = var6.method870();
            }

            if (var14 == 1) {
                this.aByteArray943[var38] = var7.method870();
            }

            if (var15 == 1) {
                this.anIntArray926[var38] = var8.readUnsignedByte();
            }
        }

        var4.caret = var29;
        var5.caret = var23;
        var38 = 0;
        var39 = 0;
        var40 = 0;
        var41 = 0;

        int var43;
        int var44;
        for (var42 = 0; var42 < var10; ++var42) {
            var43 = var5.readUnsignedByte();
            if (var43 == 1) {
                var38 = var4.method816() + var41;
                var39 = var4.method816() + var38;
                var40 = var4.method816() + var39;
                var41 = var40;
                this.anIntArray957[var42] = var38;
                this.anIntArray934[var42] = var39;
                this.anIntArray932[var42] = var40;
            }

            if (var43 == 2) {
                var39 = var40;
                var40 = var4.method816() + var41;
                var41 = var40;
                this.anIntArray957[var42] = var38;
                this.anIntArray934[var42] = var39;
                this.anIntArray932[var42] = var40;
            }

            if (var43 == 3) {
                var38 = var40;
                var40 = var4.method816() + var41;
                var41 = var40;
                this.anIntArray957[var42] = var38;
                this.anIntArray934[var42] = var39;
                this.anIntArray932[var42] = var40;
            }

            if (var43 == 4) {
                var44 = var38;
                var38 = var39;
                var39 = var44;
                var40 = var4.method816() + var41;
                var41 = var40;
                this.anIntArray957[var42] = var38;
                this.anIntArray934[var42] = var44;
                this.anIntArray932[var42] = var40;
            }
        }

        var4.caret = var31;

        for (var42 = 0; var42 < var11; ++var42) {
            this.aByteArray949[var42] = 0;
            this.aShortArray936[var42] = (short) var4.readUnsignedShort();
            this.aShortArray947[var42] = (short) var4.readUnsignedShort();
            this.aShortArray938[var42] = (short) var4.readUnsignedShort();
        }

        if (this.aByteArray945 != null) {
            boolean var46 = false;

            for (var43 = 0; var43 < var10; ++var43) {
                var44 = this.aByteArray945[var43] & 255;
                if (var44 != 255) {
                    if ((this.aShortArray936[var44] & '\uffff') == this.anIntArray957[var43] && (this.aShortArray947[var44] & '\uffff') == this.anIntArray934[var43] && (this.aShortArray938[var44] & '\uffff') == this.anIntArray932[var43]) {
                        this.aByteArray945[var43] = -1;
                    } else {
                        var46 = true;
                    }
                }
            }

            if (!var46) {
                this.aByteArray945 = null;
            }
        }

        if (!var3) {
            this.aShortArray921 = null;
        }

        if (!var2) {
            this.aByteArray927 = null;
        }

    }

    final int method579(ModelHeader var1, int var2) {
        int var3 = -1;
        int var4 = var1.xVertices[var2];
        int var5 = var1.yVertices[var2];
        int var6 = var1.zVertices[var2];

        for (int var7 = 0; var7 < this.anInt204; ++var7) {
            if (var4 == this.xVertices[var7] && var5 == this.yVertices[var7] && var6 == this.zVertices[var7]) {
                var3 = var7;
                break;
            }
        }

        if (var3 == -1) {
            this.xVertices[this.anInt204] = var4;
            this.yVertices[this.anInt204] = var5;
            this.zVertices[this.anInt204] = var6;
            if (var1.anIntArray953 != null) {
                this.anIntArray953[this.anInt204] = var1.anIntArray953[var2];
            }

            var3 = this.anInt204++;
        }

        return var3;
    }

    public ModelHeader method583() {
        ModelHeader var1 = new ModelHeader();
        if (this.aByteArray927 != null) {
            var1.aByteArray927 = new byte[this.anInt327];

            for (int var2 = 0; var2 < this.anInt327; ++var2) {
                var1.aByteArray927[var2] = this.aByteArray927[var2];
            }
        }

        var1.anInt204 = this.anInt204;
        var1.anInt327 = this.anInt327;
        var1.anInt235 = this.anInt235;
        var1.xVertices = this.xVertices;
        var1.yVertices = this.yVertices;
        var1.zVertices = this.zVertices;
        var1.anIntArray957 = this.anIntArray957;
        var1.anIntArray934 = this.anIntArray934;
        var1.anIntArray932 = this.anIntArray932;
        var1.aByteArray923 = this.aByteArray923;
        var1.aByteArray943 = this.aByteArray943;
        var1.aByteArray945 = this.aByteArray945;
        var1.aShortArray940 = this.aShortArray940;
        var1.aShortArray921 = this.aShortArray921;
        var1.defaultRenderPriority = this.defaultRenderPriority;
        var1.aByteArray949 = this.aByteArray949;
        var1.aShortArray936 = this.aShortArray936;
        var1.aShortArray947 = this.aShortArray947;
        var1.aShortArray938 = this.aShortArray938;
        var1.aShortArray931 = this.aShortArray931;
        var1.aShortArray924 = this.aShortArray924;
        var1.aShortArray954 = this.aShortArray954;
        var1.aShortArray922 = this.aShortArray922;
        var1.aByteArray951 = this.aByteArray951;
        var1.aShortArray955 = this.aShortArray955;
        var1.aShortArray952 = this.aShortArray952;
        var1.anIntArray953 = this.anIntArray953;
        var1.anIntArray926 = this.anIntArray926;
        var1.anIntArrayArray925 = this.anIntArrayArray925;
        var1.anIntArrayArray942 = this.anIntArrayArray942;
        var1.aClass101Array937 = this.aClass101Array937;
        var1.aClass100Array935 = this.aClass100Array935;
        var1.aShort939 = this.aShort939;
        var1.aShort946 = this.aShort946;
        return var1;
    }

    public void method572() {
        for (int var1 = 0; var1 < this.anInt204; ++var1) {
            this.xVertices[var1] = -this.xVertices[var1];
            this.zVertices[var1] = -this.zVertices[var1];
        }

        this.method562();
    }

    public void method569() {
        for (int var1 = 0; var1 < this.anInt204; ++var1) {
            int var2 = this.zVertices[var1];
            this.zVertices[var1] = this.xVertices[var1];
            this.xVertices[var1] = -var2;
        }

        this.method562();
    }

    public void method573(short var1, short var2) {
        if (this.aShortArray921 != null) {
            for (int var3 = 0; var3 < this.anInt327; ++var3) {
                if (this.aShortArray921[var3] == var1) {
                    this.aShortArray921[var3] = var2;
                }
            }

        }
    }

    public final Model light(int var1, int var2, int var3, int var4, int var5) {
        this.method581();
        int var6 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
        int var7 = var2 * var6 >> 8;
        Model var8 = new Model();
        var8.anIntArray1171 = new int[this.anInt327];
        var8.anIntArray315 = new int[this.anInt327];
        var8.anIntArray1273 = new int[this.anInt327];
        if (this.anInt235 > 0 && this.aByteArray945 != null) {
            int[] var9 = new int[this.anInt235];

            int var10;
            for (var10 = 0; var10 < this.anInt327; ++var10) {
                if (this.aByteArray945[var10] != -1) {
                    ++var9[this.aByteArray945[var10] & 255];
                }
            }

            var8.vertexCount = 0;

            for (var10 = 0; var10 < this.anInt235; ++var10) {
                if (var9[var10] > 0 && this.aByteArray949[var10] == 0) {
                    ++var8.vertexCount;
                }
            }

            var8.anIntArray240 = new int[var8.vertexCount];
            var8.anIntArray1281 = new int[var8.vertexCount];
            var8.anIntArray1081 = new int[var8.vertexCount];
            var10 = 0;

            int var12;
            for (var12 = 0; var12 < this.anInt235; ++var12) {
                if (var9[var12] > 0 && this.aByteArray949[var12] == 0) {
                    var8.anIntArray240[var10] = this.aShortArray936[var12] & '\uffff';
                    var8.anIntArray1281[var10] = this.aShortArray947[var12] & '\uffff';
                    var8.anIntArray1081[var10] = this.aShortArray938[var12] & '\uffff';
                    var9[var12] = var10++;
                } else {
                    var9[var12] = -1;
                }
            }

            var8.aByteArray1274 = new byte[this.anInt327];

            for (var12 = 0; var12 < this.anInt327; ++var12) {
                if (this.aByteArray945[var12] != -1) {
                    var8.aByteArray1274[var12] = (byte) var9[this.aByteArray945[var12] & 255];
                } else {
                    var8.aByteArray1274[var12] = -1;
                }
            }
        }

        for (int var11 = 0; var11 < this.anInt327; ++var11) {
            byte var17;
            if (this.aByteArray927 == null) {
                var17 = 0;
            } else {
                var17 = this.aByteArray927[var11];
            }

            byte var18;
            if (this.aByteArray943 == null) {
                var18 = 0;
            } else {
                var18 = this.aByteArray943[var11];
            }

            short var13;
            if (this.aShortArray921 == null) {
                var13 = -1;
            } else {
                var13 = this.aShortArray921[var11];
            }

            if (var18 == -2) {
                var17 = 3;
            }

            if (var18 == -1) {
                var17 = 2;
            }

            Class101 var15;
            int var16;
            Class100 var19;
            if (var13 == -1) {
                if (var17 != 0) {
                    if (var17 == 1) {
                        var19 = this.aClass100Array935[var11];
                        var16 = var1 + (var3 * var19.anInt1117 + var4 * var19.anInt1120 + var5 * var19.anInt1118) / (var7 + var7 / 2);
                        var8.anIntArray1171[var11] = method580(this.aShortArray940[var11] & '\uffff', var16);
                        var8.anIntArray1273[var11] = -1;
                    } else if (var17 == 3) {
                        var8.anIntArray1171[var11] = 128;
                        var8.anIntArray1273[var11] = -1;
                    } else {
                        var8.anIntArray1273[var11] = -2;
                    }
                } else {
                    int var14 = this.aShortArray940[var11] & '\uffff';
                    if (this.aClass101Array920 != null && this.aClass101Array920[this.anIntArray957[var11]] != null) {
                        var15 = this.aClass101Array920[this.anIntArray957[var11]];
                    } else {
                        var15 = this.aClass101Array937[this.anIntArray957[var11]];
                    }

                    var16 = var1 + (var3 * var15.anInt1135 + var4 * var15.anInt1138 + var5 * var15.anInt1137) / (var7 * var15.anInt1136);
                    var8.anIntArray1171[var11] = method580(var14, var16);
                    if (this.aClass101Array920 != null && this.aClass101Array920[this.anIntArray934[var11]] != null) {
                        var15 = this.aClass101Array920[this.anIntArray934[var11]];
                    } else {
                        var15 = this.aClass101Array937[this.anIntArray934[var11]];
                    }

                    var16 = var1 + (var3 * var15.anInt1135 + var4 * var15.anInt1138 + var5 * var15.anInt1137) / (var7 * var15.anInt1136);
                    var8.anIntArray315[var11] = method580(var14, var16);
                    if (this.aClass101Array920 != null && this.aClass101Array920[this.anIntArray932[var11]] != null) {
                        var15 = this.aClass101Array920[this.anIntArray932[var11]];
                    } else {
                        var15 = this.aClass101Array937[this.anIntArray932[var11]];
                    }

                    var16 = var1 + (var3 * var15.anInt1135 + var4 * var15.anInt1138 + var5 * var15.anInt1137) / (var7 * var15.anInt1136);
                    var8.anIntArray1273[var11] = method580(var14, var16);
                }
            } else if (var17 != 0) {
                if (var17 == 1) {
                    var19 = this.aClass100Array935[var11];
                    var16 = var1 + (var3 * var19.anInt1117 + var4 * var19.anInt1120 + var5 * var19.anInt1118) / (var7 + var7 / 2);
                    var8.anIntArray1171[var11] = method565(var16);
                    var8.anIntArray1273[var11] = -1;
                } else {
                    var8.anIntArray1273[var11] = -2;
                }
            } else {
                if (this.aClass101Array920 != null && this.aClass101Array920[this.anIntArray957[var11]] != null) {
                    var15 = this.aClass101Array920[this.anIntArray957[var11]];
                } else {
                    var15 = this.aClass101Array937[this.anIntArray957[var11]];
                }

                var16 = var1 + (var3 * var15.anInt1135 + var4 * var15.anInt1138 + var5 * var15.anInt1137) / (var7 * var15.anInt1136);
                var8.anIntArray1171[var11] = method565(var16);
                if (this.aClass101Array920 != null && this.aClass101Array920[this.anIntArray934[var11]] != null) {
                    var15 = this.aClass101Array920[this.anIntArray934[var11]];
                } else {
                    var15 = this.aClass101Array937[this.anIntArray934[var11]];
                }

                var16 = var1 + (var3 * var15.anInt1135 + var4 * var15.anInt1138 + var5 * var15.anInt1137) / (var7 * var15.anInt1136);
                var8.anIntArray315[var11] = method565(var16);
                if (this.aClass101Array920 != null && this.aClass101Array920[this.anIntArray932[var11]] != null) {
                    var15 = this.aClass101Array920[this.anIntArray932[var11]];
                } else {
                    var15 = this.aClass101Array937[this.anIntArray932[var11]];
                }

                var16 = var1 + (var3 * var15.anInt1135 + var4 * var15.anInt1138 + var5 * var15.anInt1137) / (var7 * var15.anInt1136);
                var8.anIntArray1273[var11] = method565(var16);
            }
        }

        this.method563();
        var8.anInt327 = this.anInt204;
        var8.zVertices = this.xVertices;
        var8.yVertices = this.yVertices;
        var8.anIntArray932 = this.zVertices;
        var8.anInt217 = this.anInt327;
        var8.xTriangles = this.anIntArray957;
        var8.yTriangles = this.anIntArray934;
        var8.zTriangles = this.anIntArray932;
        var8.aByteArray1280 = this.aByteArray923;
        var8.aByteArray949 = this.aByteArray943;
        var8.aByte1275 = this.defaultRenderPriority;
        var8.anIntArrayArray1282 = this.anIntArrayArray925;
        var8.anIntArrayArray1279 = this.anIntArrayArray942;
        var8.aShortArray947 = this.aShortArray921;
        return var8;
    }

    public void recolor(short color, short replacement) {
        for (int var3 = 0; var3 < this.anInt327; ++var3) {
            if (this.aShortArray940[var3] == color) {
                this.aShortArray940[var3] = replacement;
            }
        }

    }

    void method582() {
        if (!this.aBoolean941) {
            this.height = 0;
            this.anInt746 = 0;
            this.anInt744 = 999999;
            this.anInt766 = -999999;
            this.anInt933 = -99999;
            this.anInt928 = 99999;

            for (int var1 = 0; var1 < this.anInt204; ++var1) {
                int var2 = this.xVertices[var1];
                int var3 = this.yVertices[var1];
                int var4 = this.zVertices[var1];
                if (var2 < this.anInt744) {
                    this.anInt744 = var2;
                }

                if (var2 > this.anInt766) {
                    this.anInt766 = var2;
                }

                if (var4 < this.anInt928) {
                    this.anInt928 = var4;
                }

                if (var4 > this.anInt933) {
                    this.anInt933 = var4;
                }

                if (-var3 > this.height) {
                    this.height = -var3;
                }

                if (var3 > this.anInt746) {
                    this.anInt746 = var3;
                }
            }

            this.aBoolean941 = true;
        }
    }

    public void method564(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anInt204; ++var4) {
            this.xVertices[var4] = this.xVertices[var4] * var1 / 128;
            this.yVertices[var4] = this.yVertices[var4] * var2 / 128;
            this.zVertices[var4] = this.zVertices[var4] * var3 / 128;
        }

        this.method562();
    }

    public void method581() {
        if (this.aClass101Array937 == null) {
            this.aClass101Array937 = new Class101[this.anInt204];

            int var1;
            for (var1 = 0; var1 < this.anInt204; ++var1) {
                this.aClass101Array937[var1] = new Class101();
            }

            for (var1 = 0; var1 < this.anInt327; ++var1) {
                int var2 = this.anIntArray957[var1];
                int var3 = this.anIntArray934[var1];
                int var4 = this.anIntArray932[var1];
                int var5 = this.xVertices[var3] - this.xVertices[var2];
                int var6 = this.yVertices[var3] - this.yVertices[var2];
                int var7 = this.zVertices[var3] - this.zVertices[var2];
                int var8 = this.xVertices[var4] - this.xVertices[var2];
                int var9 = this.yVertices[var4] - this.yVertices[var2];
                int var10 = this.zVertices[var4] - this.zVertices[var2];
                int var11 = var6 * var10 - var9 * var7;
                int var12 = var7 * var8 - var10 * var5;

                int var13;
                for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
                    var11 >>= 1;
                    var12 >>= 1;
                }

                int var14 = (int) Math.sqrt((double) (var11 * var11 + var12 * var12 + var13 * var13));
                if (var14 <= 0) {
                    var14 = 1;
                }

                var11 = var11 * 256 / var14;
                var12 = var12 * 256 / var14;
                var13 = var13 * 256 / var14;
                byte var15;
                if (this.aByteArray927 == null) {
                    var15 = 0;
                } else {
                    var15 = this.aByteArray927[var1];
                }

                if (var15 == 0) {
                    Class101 var16 = this.aClass101Array937[var2];
                    var16.anInt1135 += var11;
                    var16.anInt1138 += var12;
                    var16.anInt1137 += var13;
                    ++var16.anInt1136;
                    var16 = this.aClass101Array937[var3];
                    var16.anInt1135 += var11;
                    var16.anInt1138 += var12;
                    var16.anInt1137 += var13;
                    ++var16.anInt1136;
                    var16 = this.aClass101Array937[var4];
                    var16.anInt1135 += var11;
                    var16.anInt1138 += var12;
                    var16.anInt1137 += var13;
                    ++var16.anInt1136;
                } else if (var15 == 1) {
                    if (this.aClass100Array935 == null) {
                        this.aClass100Array935 = new Class100[this.anInt327];
                    }

                    Class100 var17 = this.aClass100Array935[var1] = new Class100();
                    var17.anInt1117 = var11;
                    var17.anInt1120 = var12;
                    var17.anInt1118 = var13;
                }
            }

        }
    }

    void method562() {
        this.aClass101Array937 = null;
        this.aClass101Array920 = null;
        this.aClass100Array935 = null;
        this.aBoolean941 = false;
    }

    public void method578(int var1) {
        int var2 = anIntArray956[var1];
        int var3 = anIntArray930[var1];

        for (int var4 = 0; var4 < this.anInt204; ++var4) {
            int var5 = this.zVertices[var4] * var2 + this.xVertices[var4] * var3 >> 16;
            this.zVertices[var4] = this.zVertices[var4] * var3 - this.xVertices[var4] * var2 >> 16;
            this.xVertices[var4] = var5;
        }

        this.method562();
    }

    public ModelHeader method566(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.method582();
        int var7 = var2 + this.anInt744;
        int var8 = var2 + this.anInt766;
        int var9 = var4 + this.anInt928;
        int var10 = var4 + this.anInt933;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
                return this;
            }
            ModelHeader var11 = new ModelHeader();
            var11.anInt204 = this.anInt204;
            var11.anInt327 = this.anInt327;
            var11.anInt235 = this.anInt235;
            var11.xVertices = this.xVertices;
            var11.zVertices = this.zVertices;
            var11.anIntArray957 = this.anIntArray957;
            var11.anIntArray934 = this.anIntArray934;
            var11.anIntArray932 = this.anIntArray932;
            var11.aByteArray927 = this.aByteArray927;
            var11.aByteArray923 = this.aByteArray923;
            var11.aByteArray943 = this.aByteArray943;
            var11.aByteArray945 = this.aByteArray945;
            var11.aShortArray940 = this.aShortArray940;
            var11.aShortArray921 = this.aShortArray921;
            var11.defaultRenderPriority = this.defaultRenderPriority;
            var11.aByteArray949 = this.aByteArray949;
            var11.aShortArray936 = this.aShortArray936;
            var11.aShortArray947 = this.aShortArray947;
            var11.aShortArray938 = this.aShortArray938;
            var11.aShortArray931 = this.aShortArray931;
            var11.aShortArray924 = this.aShortArray924;
            var11.aShortArray954 = this.aShortArray954;
            var11.aShortArray922 = this.aShortArray922;
            var11.aByteArray951 = this.aByteArray951;
            var11.aShortArray955 = this.aShortArray955;
            var11.aShortArray952 = this.aShortArray952;
            var11.anIntArray953 = this.anIntArray953;
            var11.anIntArray926 = this.anIntArray926;
            var11.anIntArrayArray925 = this.anIntArrayArray925;
            var11.anIntArrayArray942 = this.anIntArrayArray942;
            var11.aShort939 = this.aShort939;
            var11.aShort946 = this.aShort946;
            var11.yVertices = new int[var11.anInt204];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
                for (var12 = 0; var12 < var11.anInt204; ++var12) {
                    var13 = this.xVertices[var12] + var2;
                    var14 = this.zVertices[var12] + var4;
                    var15 = var13 & 127;
                    var16 = var14 & 127;
                    var17 = var13 >> 7;
                    var18 = var14 >> 7;
                    var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                    var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                    var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                    var11.yVertices[var12] = this.yVertices[var12] + var21 - var3;
                }
            } else {
                for (var12 = 0; var12 < var11.anInt204; ++var12) {
                    var13 = (-this.yVertices[var12] << 16) / this.height;
                    if (var13 < var6) {
                        var14 = this.xVertices[var12] + var2;
                        var15 = this.zVertices[var12] + var4;
                        var16 = var14 & 127;
                        var17 = var15 & 127;
                        var18 = var14 >> 7;
                        var19 = var15 >> 7;
                        var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                        var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                        int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                        var11.yVertices[var12] = this.yVertices[var12] + (var22 - var3) * (var6 - var13) / var6;
                    }
                }
            }

            var11.method562();
            return var11;
        }
        return this;
    }

    void method563() {
        int[] var1;
        int var2;
        int var3;
        int var4;
        if (this.anIntArray953 != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.anInt204; ++var3) {
                var4 = this.anIntArray953[var3];
                ++var1[var4];
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.anIntArrayArray925 = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.anIntArrayArray925[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.anInt204; this.anIntArrayArray925[var4][var1[var4]++] = var3++) {
                var4 = this.anIntArray953[var3];
            }

            this.anIntArray953 = null;
        }

        if (this.anIntArray926 != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.anInt327; ++var3) {
                var4 = this.anIntArray926[var3];
                ++var1[var4];
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.anIntArrayArray942 = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.anIntArrayArray942[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.anInt327; this.anIntArrayArray942[var4][var1[var4]++] = var3++) {
                var4 = this.anIntArray926[var3];
            }

            this.anIntArray926 = null;
        }

    }

    public void method570() {
        for (int var1 = 0; var1 < this.anInt204; ++var1) {
            int var2 = this.xVertices[var1];
            this.xVertices[var1] = this.zVertices[var1];
            this.zVertices[var1] = -var2;
        }

        this.method562();
    }

    public void method574(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anInt204; ++var4) {
            this.xVertices[var4] += var1;
            this.yVertices[var4] += var2;
            this.zVertices[var4] += var3;
        }

        this.method562();
    }

    public void method540() {
        int var1;
        for (var1 = 0; var1 < this.anInt204; ++var1) {
            this.zVertices[var1] = -this.zVertices[var1];
        }

        for (var1 = 0; var1 < this.anInt327; ++var1) {
            int var2 = this.anIntArray957[var1];
            this.anIntArray957[var1] = this.anIntArray932[var1];
            this.anIntArray932[var1] = var2;
        }

        this.method562();
    }
}
