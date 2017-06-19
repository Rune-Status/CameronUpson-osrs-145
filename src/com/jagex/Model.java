package com.jagex;

public class Model extends Entity {
    public static int[] anIntArray1253 = new int[4700];
    public static int[] anIntArray944 = new int[4700];
    static byte[] aByteArray846 = new byte[1];
    static int[] anIntArray1264 = new int[2000];
    static int[] anIntArray1256 = new int[4700];
    static int[][] anIntArrayArray1258 = new int[12][2000];
    static int[] anIntArray1267;
    static int[] anIntArray1269 = new int[10];
    static boolean[] aBooleanArray1260 = new boolean[4700];
    static boolean[] aBooleanArray1255 = new boolean[4700];
    static byte[] aByteArray1278 = new byte[1];
    static int[] anIntArray948 = new int[4700];
    static int[] anIntArray1263;
    static int[] anIntArray956 = new int[4700];
    static int[] anIntArray930 = new int[4700];
    static int[] anIntArray763 = new int[1600];
    static int[][] anIntArrayArray1254 = new int[1600][512];
    static int[] anIntArray747 = new int[12];
    static int[] anIntArray774 = new int[2000];
    static int[] anIntArray1261 = new int[10];
    static int[] anIntArray1270 = new int[10];
    static int anInt783;
    static int anInt781;
    static int anInt785;
    static Model aModel1277 = new Model();
    static int[] anIntArray1268;
    static Model aModel1272 = new Model();
    static int[] anIntArray1265 = new int[12];
    static int[] anIntArray1266;

    static {
        anIntArray1268 = Node_Sub21_Sub26_Sub1.SINE;
        anIntArray1263 = Node_Sub21_Sub26_Sub1.COS;
        anIntArray1267 = Node_Sub21_Sub26_Sub1.anIntArray240;
        anIntArray1266 = Node_Sub21_Sub26_Sub1.anIntArray661;
    }

    public int anInt746 = -1;
    public int anInt217 = 0;
    public int[] xTriangles;
    public int[] yTriangles;
    public int[] zTriangles;
    public boolean aBoolean1259 = false;
    public int anInt754;
    public int anInt745;
    public int anInt755;
    public int anInt760 = -1;
    public int anInt757 = -1;
    public int[] anIntArray1273;
    int[] zVertices;
    int[] anIntArray240;
    int anInt327 = 0;
    int[] yVertices;
    int[] anIntArray1171;
    int[] anIntArray315;
    byte[] aByteArray1280;
    byte[] aByteArray949;
    short[] aShortArray947;
    int[] anIntArray1281;
    int[] anIntArray1081;
    int[][] anIntArrayArray1282;
    int anInt765;
    int anInt749;
    int anInt748;
    int anInt1257;
    int anInt753;
    int vertexCount = 0;
    byte[] aByteArray1274;
    int[][] anIntArrayArray1279;
    byte aByte1275 = 0;
    int[] anIntArray932;

    public Model(Model[] var1, int var2) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.anInt327 = 0;
        this.anInt217 = 0;
        this.vertexCount = 0;
        this.aByte1275 = -1;

        int var7;
        Model var8;
        for (var7 = 0; var7 < var2; ++var7) {
            var8 = var1[var7];
            if (var8 != null) {
                this.anInt327 += var8.anInt327;
                this.anInt217 += var8.anInt217;
                this.vertexCount += var8.vertexCount;
                if (var8.aByteArray1280 != null) {
                    var3 = true;
                } else {
                    if (this.aByte1275 == -1) {
                        this.aByte1275 = var8.aByte1275;
                    }

                    if (this.aByte1275 != var8.aByte1275) {
                        var3 = true;
                    }
                }

                var4 |= var8.aByteArray949 != null;
                var5 |= var8.aShortArray947 != null;
                var6 |= var8.aByteArray1274 != null;
            }
        }

        this.zVertices = new int[this.anInt327];
        this.yVertices = new int[this.anInt327];
        this.anIntArray932 = new int[this.anInt327];
        this.xTriangles = new int[this.anInt217];
        this.yTriangles = new int[this.anInt217];
        this.zTriangles = new int[this.anInt217];
        this.anIntArray1171 = new int[this.anInt217];
        this.anIntArray315 = new int[this.anInt217];
        this.anIntArray1273 = new int[this.anInt217];
        if (var3) {
            this.aByteArray1280 = new byte[this.anInt217];
        }

        if (var4) {
            this.aByteArray949 = new byte[this.anInt217];
        }

        if (var5) {
            this.aShortArray947 = new short[this.anInt217];
        }

        if (var6) {
            this.aByteArray1274 = new byte[this.anInt217];
        }

        if (this.vertexCount > 0) {
            this.anIntArray240 = new int[this.vertexCount];
            this.anIntArray1281 = new int[this.vertexCount];
            this.anIntArray1081 = new int[this.vertexCount];
        }

        this.anInt327 = 0;
        this.anInt217 = 0;
        this.vertexCount = 0;

        for (var7 = 0; var7 < var2; ++var7) {
            var8 = var1[var7];
            if (var8 != null) {
                int var9;
                for (var9 = 0; var9 < var8.anInt217; ++var9) {
                    this.xTriangles[this.anInt217] = var8.xTriangles[var9] + this.anInt327;
                    this.yTriangles[this.anInt217] = var8.yTriangles[var9] + this.anInt327;
                    this.zTriangles[this.anInt217] = var8.zTriangles[var9] + this.anInt327;
                    this.anIntArray1171[this.anInt217] = var8.anIntArray1171[var9];
                    this.anIntArray315[this.anInt217] = var8.anIntArray315[var9];
                    this.anIntArray1273[this.anInt217] = var8.anIntArray1273[var9];
                    if (var3) {
                        if (var8.aByteArray1280 != null) {
                            this.aByteArray1280[this.anInt217] = var8.aByteArray1280[var9];
                        } else {
                            this.aByteArray1280[this.anInt217] = var8.aByte1275;
                        }
                    }

                    if (var4 && var8.aByteArray949 != null) {
                        this.aByteArray949[this.anInt217] = var8.aByteArray949[var9];
                    }

                    if (var5) {
                        if (var8.aShortArray947 != null) {
                            this.aShortArray947[this.anInt217] = var8.aShortArray947[var9];
                        } else {
                            this.aShortArray947[this.anInt217] = -1;
                        }
                    }

                    if (var6) {
                        if (var8.aByteArray1274 != null && var8.aByteArray1274[var9] != -1) {
                            this.aByteArray1274[this.anInt217] = (byte) (var8.aByteArray1274[var9] + this.vertexCount);
                        } else {
                            this.aByteArray1274[this.anInt217] = -1;
                        }
                    }

                    ++this.anInt217;
                }

                for (var9 = 0; var9 < var8.vertexCount; ++var9) {
                    this.anIntArray240[this.vertexCount] = var8.anIntArray240[var9] + this.anInt327;
                    this.anIntArray1281[this.vertexCount] = var8.anIntArray1281[var9] + this.anInt327;
                    this.anIntArray1081[this.vertexCount] = var8.anIntArray1081[var9] + this.anInt327;
                    ++this.vertexCount;
                }

                for (var9 = 0; var9 < var8.anInt327; ++var9) {
                    this.zVertices[this.anInt327] = var8.zVertices[var9];
                    this.yVertices[this.anInt327] = var8.yVertices[var9];
                    this.anIntArray932[this.anInt327] = var8.anIntArray932[var9];
                    ++this.anInt327;
                }
            }
        }

    }

    Model() {
    }

    public Model method729(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.method724();
        int var7 = var2 - this.anInt748;
        int var8 = var2 + this.anInt748;
        int var9 = var4 - this.anInt748;
        int var10 = var4 + this.anInt748;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
                return this;
            }
            Model var11;
            if (var5) {
                var11 = new Model();
                var11.anInt327 = this.anInt327;
                var11.anInt217 = this.anInt217;
                var11.vertexCount = this.vertexCount;
                var11.zVertices = this.zVertices;
                var11.anIntArray932 = this.anIntArray932;
                var11.xTriangles = this.xTriangles;
                var11.yTriangles = this.yTriangles;
                var11.zTriangles = this.zTriangles;
                var11.anIntArray1171 = this.anIntArray1171;
                var11.anIntArray315 = this.anIntArray315;
                var11.anIntArray1273 = this.anIntArray1273;
                var11.aByteArray1280 = this.aByteArray1280;
                var11.aByteArray949 = this.aByteArray949;
                var11.aByteArray1274 = this.aByteArray1274;
                var11.aShortArray947 = this.aShortArray947;
                var11.aByte1275 = this.aByte1275;
                var11.anIntArray240 = this.anIntArray240;
                var11.anIntArray1281 = this.anIntArray1281;
                var11.anIntArray1081 = this.anIntArray1081;
                var11.anIntArrayArray1282 = this.anIntArrayArray1282;
                var11.anIntArrayArray1279 = this.anIntArrayArray1279;
                var11.aBoolean1259 = this.aBoolean1259;
                var11.yVertices = new int[var11.anInt327];
            } else {
                var11 = this;
            }

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
                for (var12 = 0; var12 < var11.anInt327; ++var12) {
                    var13 = this.zVertices[var12] + var2;
                    var14 = this.anIntArray932[var12] + var4;
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
                for (var12 = 0; var12 < var11.anInt327; ++var12) {
                    var13 = (-this.yVertices[var12] << 16) / this.height;
                    if (var13 < var6) {
                        var14 = this.zVertices[var12] + var2;
                        var15 = this.anIntArray932[var12] + var4;
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

            var11.method572();
            return var11;
        }
        return this;
    }

    public Model method726(boolean var1) {
        if (!var1 && aByteArray846.length < this.anInt217) {
            aByteArray846 = new byte[this.anInt217 + 100];
        }

        return this.method736(var1, aModel1277, aByteArray846);
    }

    public Model method732(boolean var1) {
        if (!var1 && aByteArray1278.length < this.anInt217) {
            aByteArray1278 = new byte[this.anInt217 + 100];
        }

        return this.method736(var1, aModel1272, aByteArray1278);
    }

    Model method736(boolean var1, Model var2, byte[] var3) {
        var2.anInt327 = this.anInt327;
        var2.anInt217 = this.anInt217;
        var2.vertexCount = this.vertexCount;
        if (var2.zVertices == null || var2.zVertices.length < this.anInt327) {
            var2.zVertices = new int[this.anInt327 + 100];
            var2.yVertices = new int[this.anInt327 + 100];
            var2.anIntArray932 = new int[this.anInt327 + 100];
        }

        int var4;
        for (var4 = 0; var4 < this.anInt327; ++var4) {
            var2.zVertices[var4] = this.zVertices[var4];
            var2.yVertices[var4] = this.yVertices[var4];
            var2.anIntArray932[var4] = this.anIntArray932[var4];
        }

        if (var1) {
            var2.aByteArray949 = this.aByteArray949;
        } else {
            var2.aByteArray949 = var3;
            if (this.aByteArray949 == null) {
                for (var4 = 0; var4 < this.anInt217; ++var4) {
                    var2.aByteArray949[var4] = 0;
                }
            } else {
                for (var4 = 0; var4 < this.anInt217; ++var4) {
                    var2.aByteArray949[var4] = this.aByteArray949[var4];
                }
            }
        }

        var2.xTriangles = this.xTriangles;
        var2.yTriangles = this.yTriangles;
        var2.zTriangles = this.zTriangles;
        var2.anIntArray1171 = this.anIntArray1171;
        var2.anIntArray315 = this.anIntArray315;
        var2.anIntArray1273 = this.anIntArray1273;
        var2.aByteArray1280 = this.aByteArray1280;
        var2.aByteArray1274 = this.aByteArray1274;
        var2.aShortArray947 = this.aShortArray947;
        var2.aByte1275 = this.aByte1275;
        var2.anIntArray240 = this.anIntArray240;
        var2.anIntArray1281 = this.anIntArray1281;
        var2.anIntArray1081 = this.anIntArray1081;
        var2.anIntArrayArray1282 = this.anIntArrayArray1282;
        var2.anIntArrayArray1279 = this.anIntArrayArray1279;
        var2.aBoolean1259 = this.aBoolean1259;
        var2.method572();
        return var2;
    }

    void method740(int var1) {
        if (this.anInt760 == -1) {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = anIntArray1263[var1];
            int var9 = anIntArray1268[var1];

            for (int var10 = 0; var10 < this.anInt327; ++var10) {
                int var11 = Node_Sub21_Sub26_Sub1.method630(this.zVertices[var10], this.anIntArray932[var10], var8, var9);
                int var12 = this.yVertices[var10];
                int var13 = Node_Sub21_Sub26_Sub1.method646(this.zVertices[var10], this.anIntArray932[var10], var8, var9);
                if (var11 < var2) {
                    var2 = var11;
                }

                if (var11 > var5) {
                    var5 = var11;
                }

                if (var12 < var3) {
                    var3 = var12;
                }

                if (var12 > var6) {
                    var6 = var12;
                }

                if (var13 < var4) {
                    var4 = var13;
                }

                if (var13 > var7) {
                    var7 = var13;
                }
            }

            this.anInt754 = (var5 + var2) / 2;
            this.anInt745 = (var6 + var3) / 2;
            this.anInt755 = (var7 + var4) / 2;
            this.anInt760 = (var5 - var2 + 1) / 2;
            this.anInt757 = (var6 - var3 + 1) / 2;
            this.anInt746 = (var7 - var4 + 1) / 2;
            if (this.anInt760 < 32) {
                this.anInt760 = 32;
            }

            if (this.anInt746 < 32) {
                this.anInt746 = 32;
            }

            if (this.aBoolean1259) {
                this.anInt760 += 8;
                this.anInt746 += 8;
            }

        }
    }

    public void method724() {
        if (this.anInt765 != 1) {
            this.anInt765 = 1;
            this.height = 0;
            this.anInt749 = 0;
            this.anInt748 = 0;

            for (int var1 = 0; var1 < this.anInt327; ++var1) {
                int var2 = this.zVertices[var1];
                int var3 = this.yVertices[var1];
                int var4 = this.anIntArray932[var1];
                if (-var3 > this.height) {
                    this.height = -var3;
                }

                if (var3 > this.anInt749) {
                    this.anInt749 = var3;
                }

                int var5 = var2 * var2 + var4 * var4;
                if (var5 > this.anInt748) {
                    this.anInt748 = var5;
                }
            }

            this.anInt748 = (int) (Math.sqrt((double) this.anInt748) + 0.99D);
            this.anInt753 = (int) (Math.sqrt((double) (this.anInt748 * this.anInt748 + this.height * this.height)) + 0.99D);
            this.anInt1257 = this.anInt753 + (int) (Math.sqrt((double) (this.anInt748 * this.anInt748 + this.anInt749 * this.anInt749)) + 0.99D);
        }
    }

    void method563() {
        if (this.anInt765 != 2) {
            this.anInt765 = 2;
            this.anInt748 = 0;

            for (int var1 = 0; var1 < this.anInt327; ++var1) {
                int var2 = this.zVertices[var1];
                int var3 = this.yVertices[var1];
                int var4 = this.anIntArray932[var1];
                int var5 = var2 * var2 + var4 * var4 + var3 * var3;
                if (var5 > this.anInt748) {
                    this.anInt748 = var5;
                }
            }

            this.anInt748 = (int) (Math.sqrt((double) this.anInt748) + 0.99D);
            this.anInt753 = this.anInt748;
            this.anInt1257 = this.anInt748 + this.anInt748;
        }
    }

    public int method728() {
        this.method724();
        return this.anInt748;
    }

    void method572() {
        this.anInt765 = 0;
        this.anInt760 = -1;
    }

    public void method727(AnimationFrame var1, int var2) {
        if (this.anIntArrayArray1282 != null) {
            if (var2 != -1) {
                Identikit var3 = var1.identikits[var2];
                AnimationSkin var4 = var3.aAnimationSkin_1312;
                anInt783 = 0;
                anInt781 = 0;
                anInt785 = 0;

                for (int var5 = 0; var5 < var3.id; ++var5) {
                    int var6 = var3.anIntArray1315[var5];
                    this.method731(var4.transforms[var6], var4.labels[var6], var3.anIntArray1313[var5], var3.anIntArray1311[var5], var3.anIntArray1308[var5]);
                }

                this.method572();
            }
        }
    }

    void method731(int var1, int[] var2, int var3, int var4, int var5) {
        int var6 = var2.length;
        int var7;
        int var8;
        int var11;
        int var12;
        if (var1 == 0) {
            var7 = 0;
            anInt783 = 0;
            anInt781 = 0;
            anInt785 = 0;

            for (var8 = 0; var8 < var6; ++var8) {
                int var9 = var2[var8];
                if (var9 < this.anIntArrayArray1282.length) {
                    int[] var10 = this.anIntArrayArray1282[var9];

                    for (var11 = 0; var11 < var10.length; ++var11) {
                        var12 = var10[var11];
                        anInt783 += this.zVertices[var12];
                        anInt781 += this.yVertices[var12];
                        anInt785 += this.anIntArray932[var12];
                        ++var7;
                    }
                }
            }

            if (var7 > 0) {
                anInt783 = anInt783 / var7 + var3;
                anInt781 = anInt781 / var7 + var4;
                anInt785 = anInt785 / var7 + var5;
            } else {
                anInt783 = var3;
                anInt781 = var4;
                anInt785 = var5;
            }

        } else {
            int[] var13;
            int var14;
            if (var1 == 1) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.anIntArrayArray1282.length) {
                        var13 = this.anIntArrayArray1282[var8];

                        for (var14 = 0; var14 < var13.length; ++var14) {
                            var11 = var13[var14];
                            this.zVertices[var11] += var3;
                            this.yVertices[var11] += var4;
                            this.anIntArray932[var11] += var5;
                        }
                    }
                }

            } else if (var1 == 2) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.anIntArrayArray1282.length) {
                        var13 = this.anIntArrayArray1282[var8];

                        for (var14 = 0; var14 < var13.length; ++var14) {
                            var11 = var13[var14];
                            this.zVertices[var11] -= anInt783;
                            this.yVertices[var11] -= anInt781;
                            this.anIntArray932[var11] -= anInt785;
                            var12 = (var3 & 255) * 8;
                            int var15 = (var4 & 255) * 8;
                            int var16 = (var5 & 255) * 8;
                            int var17;
                            int var18;
                            int var19;
                            if (var16 != 0) {
                                var17 = anIntArray1268[var16];
                                var18 = anIntArray1263[var16];
                                var19 = this.yVertices[var11] * var17 + this.zVertices[var11] * var18 >> 16;
                                this.yVertices[var11] = this.yVertices[var11] * var18 - this.zVertices[var11] * var17 >> 16;
                                this.zVertices[var11] = var19;
                            }

                            if (var12 != 0) {
                                var17 = anIntArray1268[var12];
                                var18 = anIntArray1263[var12];
                                var19 = this.yVertices[var11] * var18 - this.anIntArray932[var11] * var17 >> 16;
                                this.anIntArray932[var11] = this.yVertices[var11] * var17 + this.anIntArray932[var11] * var18 >> 16;
                                this.yVertices[var11] = var19;
                            }

                            if (var15 != 0) {
                                var17 = anIntArray1268[var15];
                                var18 = anIntArray1263[var15];
                                var19 = this.anIntArray932[var11] * var17 + this.zVertices[var11] * var18 >> 16;
                                this.anIntArray932[var11] = this.anIntArray932[var11] * var18 - this.zVertices[var11] * var17 >> 16;
                                this.zVertices[var11] = var19;
                            }

                            this.zVertices[var11] += anInt783;
                            this.yVertices[var11] += anInt781;
                            this.anIntArray932[var11] += anInt785;
                        }
                    }
                }

            } else if (var1 == 3) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.anIntArrayArray1282.length) {
                        var13 = this.anIntArrayArray1282[var8];

                        for (var14 = 0; var14 < var13.length; ++var14) {
                            var11 = var13[var14];
                            this.zVertices[var11] -= anInt783;
                            this.yVertices[var11] -= anInt781;
                            this.anIntArray932[var11] -= anInt785;
                            this.zVertices[var11] = this.zVertices[var11] * var3 / 128;
                            this.yVertices[var11] = this.yVertices[var11] * var4 / 128;
                            this.anIntArray932[var11] = this.anIntArray932[var11] * var5 / 128;
                            this.zVertices[var11] += anInt783;
                            this.yVertices[var11] += anInt781;
                            this.anIntArray932[var11] += anInt785;
                        }
                    }
                }

            } else if (var1 == 5) {
                if (this.anIntArrayArray1279 != null && this.aByteArray949 != null) {
                    for (var7 = 0; var7 < var6; ++var7) {
                        var8 = var2[var7];
                        if (var8 < this.anIntArrayArray1279.length) {
                            var13 = this.anIntArrayArray1279[var8];

                            for (var14 = 0; var14 < var13.length; ++var14) {
                                var11 = var13[var14];
                                var12 = (this.aByteArray949[var11] & 255) + var3 * 8;
                                if (var12 < 0) {
                                    var12 = 0;
                                } else if (var12 > 255) {
                                    var12 = 255;
                                }

                                this.aByteArray949[var11] = (byte) var12;
                            }
                        }
                    }
                }

            }
        }
    }

    public void method730() {
        for (int var1 = 0; var1 < this.anInt327; ++var1) {
            this.zVertices[var1] = -this.zVertices[var1];
            this.anIntArray932[var1] = -this.anIntArray932[var1];
        }

        this.method572();
    }

    public void method735(AnimationFrame var1, int var2, AnimationFrame var3, int var4, int[] var5) {
        if (var2 != -1) {
            if (var5 != null && var4 != -1) {
                Identikit var6 = var1.identikits[var2];
                Identikit var7 = var3.identikits[var4];
                AnimationSkin var8 = var6.aAnimationSkin_1312;
                anInt783 = 0;
                anInt781 = 0;
                anInt785 = 0;
                byte var9 = 0;
                int var13 = var9 + 1;
                int var10 = var5[var9];

                int var11;
                int var12;
                for (var11 = 0; var11 < var6.id; ++var11) {
                    for (var12 = var6.anIntArray1315[var11]; var12 > var10; var10 = var5[var13++]) {
                    }

                    if (var12 != var10 || var8.transforms[var12] == 0) {
                        this.method731(var8.transforms[var12], var8.labels[var12], var6.anIntArray1313[var11], var6.anIntArray1311[var11], var6.anIntArray1308[var11]);
                    }
                }

                anInt783 = 0;
                anInt781 = 0;
                anInt785 = 0;
                var9 = 0;
                var13 = var9 + 1;
                var10 = var5[var9];

                for (var11 = 0; var11 < var7.id; ++var11) {
                    for (var12 = var7.anIntArray1315[var11]; var12 > var10; var10 = var5[var13++]) {
                    }

                    if (var12 == var10 || var8.transforms[var12] == 0) {
                        this.method731(var8.transforms[var12], var8.labels[var12], var7.anIntArray1313[var11], var7.anIntArray1311[var11], var7.anIntArray1308[var11]);
                    }
                }

                this.method572();
            } else {
                this.method727(var1, var2);
            }
        }
    }

    public void method722(int var1) {
        int var2 = anIntArray1268[var1];
        int var3 = anIntArray1263[var1];

        for (int var4 = 0; var4 < this.anInt327; ++var4) {
            int var5 = this.yVertices[var4] * var3 - this.anIntArray932[var4] * var2 >> 16;
            this.anIntArray932[var4] = this.yVertices[var4] * var2 + this.anIntArray932[var4] * var3 >> 16;
            this.yVertices[var4] = var5;
        }

        this.method572();
    }

    public void method738(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anInt327; ++var4) {
            this.zVertices[var4] += var1;
            this.yVertices[var4] += var2;
            this.anIntArray932[var4] += var3;
        }

        this.method572();
    }

    public void scale(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anInt327; ++var4) {
            this.zVertices[var4] = this.zVertices[var4] * var1 / 128;
            this.yVertices[var4] = this.yVertices[var4] * var2 / 128;
            this.anIntArray932[var4] = this.anIntArray932[var4] * var3 / 128;
        }

        this.method572();
    }

    public final void method733(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        anIntArray763[0] = -1;
        if (this.anInt765 != 2 && this.anInt765 != 1) {
            this.method563();
        }

        int var9 = Node_Sub21_Sub26_Sub1.viewportCenterX;
        int var10 = Node_Sub21_Sub26_Sub1.viewportCenterY;
        int var10000 = anIntArray1268[var1];
        var10000 = anIntArray1263[var1];
        int var13 = anIntArray1268[var2];
        int var14 = anIntArray1263[var2];
        int var15 = anIntArray1268[var3];
        int var16 = anIntArray1263[var3];
        int var17 = anIntArray1268[var4];
        int var18 = anIntArray1263[var4];
        int var19 = var6 * var17 + var7 * var18 >> 16;

        for (int var20 = 0; var20 < this.anInt327; ++var20) {
            int var21 = this.zVertices[var20];
            int var22 = this.yVertices[var20];
            int var23 = this.anIntArray932[var20];
            int var24;
            if (var3 != 0) {
                var24 = var22 * var15 + var21 * var16 >> 16;
                var22 = var22 * var16 - var21 * var15 >> 16;
                var21 = var24;
            }

            if (var2 != 0) {
                var24 = var23 * var13 + var21 * var14 >> 16;
                var23 = var23 * var14 - var21 * var13 >> 16;
                var21 = var24;
            }

            var21 += var5;
            var22 += var6;
            var23 += var7;
            var24 = var22 * var18 - var23 * var17 >> 16;
            var23 = var22 * var17 + var23 * var18 >> 16;
            anIntArray948[var20] = var23 - var19;
            anIntArray1253[var20] = var9 + var21 * Node_Sub21_Sub26_Sub1.anInt228 / var8;
            anIntArray944[var20] = var10 + var24 * Node_Sub21_Sub26_Sub1.anInt228 / var8;
            if (this.vertexCount > 0) {
                anIntArray1256[var20] = var21;
                anIntArray956[var20] = var24;
                anIntArray930[var20] = var23;
            }
        }

        try {
            this.method734(false, false, false, 0);
        } catch (Exception var26) {
        }

    }

    void render(int var1, int pitch_sin, int pitch_cos, int yaw_sin, int yaw_cos, int x, int z, int y, int uid) {
        anIntArray763[0] = -1;
        if (this.anInt765 != 1) {
            this.method724();
        }

        this.method740(var1);
        int var10 = y * yaw_cos - x * yaw_sin >> 16;
        int var11 = z * pitch_sin + var10 * pitch_cos >> 16;
        int var12 = this.anInt748 * pitch_cos >> 16;
        int var13 = var11 + var12;
        if (var13 > 50 && var11 < 3500) {
            int var14 = y * yaw_sin + x * yaw_cos >> 16;
            int var15 = (var14 - this.anInt748) * Node_Sub21_Sub26_Sub1.anInt228;
            if (var15 / var13 < Node_Sub21_Sub26_Sub1.anInt222) {
                int var16 = (var14 + this.anInt748) * Node_Sub21_Sub26_Sub1.anInt228;
                if (var16 / var13 > Node_Sub21_Sub26_Sub1.anInt230) {
                    int var17 = z * pitch_cos - var10 * pitch_sin >> 16;
                    int var18 = this.anInt748 * pitch_sin >> 16;
                    int var19 = (var17 + var18) * Node_Sub21_Sub26_Sub1.anInt228;
                    if (var19 / var13 > Node_Sub21_Sub26_Sub1.anInt229) {
                        int var20 = var18 + (this.height * pitch_cos >> 16);
                        int var21 = (var17 - var20) * Node_Sub21_Sub26_Sub1.anInt228;
                        if (var21 / var13 < Node_Sub21_Sub26_Sub1.anInt981) {
                            int var22 = var12 + (this.height * pitch_sin >> 16);
                            boolean var23 = false;
                            boolean var24 = false;
                            if (var11 - var22 <= 50) {
                                var24 = true;
                            }

                            boolean var25 = var24 || this.vertexCount > 0;
                            int var26 = Class105.anInt1251;
                            int var28 = Class105.anInt1246;
                            boolean var30 = ObjectDefinition.method345();
                            if (BoundingBoxInfo.drawAxisAlignedBoundingBoxes && uid > 0) {
                                if (Node_Sub21_Sub6.calcAxisAlignedBoundingBox(this, x, z, y)) {
                                    BoundingBoxInfo.boundingBoxes.method905(new AxisAlignedBoundingBox(this, x, z, y, 0xffff00ff));
                                } else if (BoundingBoxInfo.currentBoundingBoxDrawType == BoundingBoxDrawType.ALL) {
                                    BoundingBoxInfo.boundingBoxes.method905(new AxisAlignedBoundingBox(this, x, z, y, 0xff0000ff));
                                }
                            }

                            int var33;
                            int var34;
                            int var35;
                            int var36;
                            int var37;
                            int var38;
                            int var39;
                            if (BoundingBoxInfo.useLegacyClickBoxes && uid > 0) {
                                int var32 = var11 - var12;
                                if (var32 <= 50) {
                                    var32 = 50;
                                }

                                if (var14 > 0) {
                                    var33 = var15 / var13;
                                    var34 = var16 / var32;
                                } else {
                                    var34 = var16 / var13;
                                    var33 = var15 / var32;
                                }

                                if (var17 > 0) {
                                    var35 = var21 / var13;
                                    var36 = var19 / var32;
                                } else {
                                    var36 = var19 / var13;
                                    var35 = var21 / var32;
                                }

                                var37 = -8355840;
                                var38 = var26 - Node_Sub21_Sub26_Sub1.viewportCenterX;
                                var39 = var28 - Node_Sub21_Sub26_Sub1.viewportCenterY;
                                if (var38 > var33 && var38 < var34 && var39 > var35 && var39 < var36) {
                                    var37 = -256;
                                }

                                Class169.addLegacyBoundingBox(this, var33 + Node_Sub21_Sub26_Sub1.viewportCenterX, var35 + Node_Sub21_Sub26_Sub1.viewportCenterY, var34 + Node_Sub21_Sub26_Sub1.viewportCenterX, var36 + Node_Sub21_Sub26_Sub1.viewportCenterY, var37);
                            }

                            boolean var44 = false;
                            if (uid > 0 && var30) {
                                boolean var45 = false;
                                if (BoundingBoxInfo.useAxisAlignedBoundingBoxes) {
                                    var45 = Node_Sub21_Sub6.calcAxisAlignedBoundingBox(this, x, z, y);
                                } else {
                                    var34 = var11 - var12;
                                    if (var34 <= 50) {
                                        var34 = 50;
                                    }

                                    if (var14 > 0) {
                                        var15 /= var13;
                                        var16 /= var34;
                                    } else {
                                        var16 /= var13;
                                        var15 /= var34;
                                    }

                                    if (var17 > 0) {
                                        var21 /= var13;
                                        var19 /= var34;
                                    } else {
                                        var19 /= var13;
                                        var21 /= var34;
                                    }

                                    var35 = var26 - Node_Sub21_Sub26_Sub1.viewportCenterX;
                                    var36 = var28 - Node_Sub21_Sub26_Sub1.viewportCenterY;

                                    if (var35 > var15 && var35 < var16 && var36 > var21 && var36 < var19) {
                                        var45 = true;
                                    }
                                }

                                if (var45) {
                                    if (this.aBoolean1259) {
                                        Class82.addHoveredUid(uid);
                                    } else {
                                        var44 = true;
                                    }
                                }
                            }

                            var33 = Node_Sub21_Sub26_Sub1.viewportCenterX;
                            var34 = Node_Sub21_Sub26_Sub1.viewportCenterY;
                            var35 = 0;
                            var36 = 0;
                            if (var1 != 0) {
                                var35 = anIntArray1268[var1];
                                var36 = anIntArray1263[var1];
                            }

                            for (var37 = 0; var37 < this.anInt327; ++var37) {
                                var38 = this.zVertices[var37];
                                var39 = this.yVertices[var37];
                                int var40 = this.anIntArray932[var37];
                                int var41;
                                if (var1 != 0) {
                                    var41 = var40 * var35 + var38 * var36 >> 16;
                                    var40 = var40 * var36 - var38 * var35 >> 16;
                                    var38 = var41;
                                }

                                var38 += x;
                                var39 += z;
                                var40 += y;
                                var41 = var40 * yaw_sin + var38 * yaw_cos >> 16;
                                var40 = var40 * yaw_cos - var38 * yaw_sin >> 16;
                                var38 = var41;
                                var41 = var39 * pitch_cos - var40 * pitch_sin >> 16;
                                var40 = var39 * pitch_sin + var40 * pitch_cos >> 16;
                                anIntArray948[var37] = var40 - var11;
                                if (var40 >= 50) {
                                    anIntArray1253[var37] = var33 + var38 * Node_Sub21_Sub26_Sub1.anInt228 / var40;
                                    anIntArray944[var37] = var34 + var41 * Node_Sub21_Sub26_Sub1.anInt228 / var40;
                                } else {
                                    anIntArray1253[var37] = -5000;
                                    var23 = true;
                                }

                                if (var25) {
                                    anIntArray1256[var37] = var38;
                                    anIntArray956[var37] = var41;
                                    anIntArray930[var37] = var40;
                                }
                            }

                            try {
                                this.method734(var23, var44, this.aBoolean1259, uid);
                            } catch (Exception var43) {
                            }

                        }
                    }
                }
            }
        }
    }

    final void method734(boolean var1, boolean var2, boolean var3, int var4) {
        if (this.anInt1257 < 1600) {
            int var5;
            for (var5 = 0; var5 < this.anInt1257; ++var5) {
                anIntArray763[var5] = 0;
            }

            var5 = var3 ? 20 : 5;
            if (BoundingBoxInfo.drawLegacyClickBoxes && var2) {
                Class19.method142(this, var5);
            }

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var14;
            int var15;
            int var17;
            for (var6 = 0; var6 < this.anInt217; ++var6) {
                if (this.anIntArray1273[var6] != -2) {
                    var7 = this.xTriangles[var6];
                    var8 = this.yTriangles[var6];
                    var9 = this.zTriangles[var6];
                    var10 = anIntArray1253[var7];
                    var11 = anIntArray1253[var8];
                    var12 = anIntArray1253[var9];
                    int var13;
                    if (!var1 || var10 != -5000 && var11 != -5000 && var12 != -5000) {
                        if (var2 && PendingSpawn.method275(anIntArray944[var7], anIntArray944[var8], anIntArray944[var9], var10, var11, var12, var5)) {
                            Class82.addHoveredUid(var4);
                            var2 = false;
                        }

                        if ((var10 - var11) * (anIntArray944[var9] - anIntArray944[var8]) - (anIntArray944[var7] - anIntArray944[var8]) * (var12 - var11) > 0) {
                            aBooleanArray1255[var6] = false;
                            aBooleanArray1260[var6] = !(var10 >= 0 && var11 >= 0 && var12 >= 0 && var10 <= Node_Sub21_Sub26_Sub1.anInt919 && var11 <= Node_Sub21_Sub26_Sub1.anInt919 && var12 <= Node_Sub21_Sub26_Sub1.anInt919);

                            var13 = (anIntArray948[var7] + anIntArray948[var8] + anIntArray948[var9]) / 3 + this.anInt753;
                            anIntArrayArray1254[var13][anIntArray763[var13]++] = var6;
                        }
                    } else {
                        var13 = anIntArray1256[var7];
                        var14 = anIntArray1256[var8];
                        var15 = anIntArray1256[var9];
                        int var16 = anIntArray956[var7];
                        var17 = anIntArray956[var8];
                        int var19 = anIntArray956[var9];
                        int var20 = anIntArray930[var7];
                        int var21 = anIntArray930[var8];
                        int var22 = anIntArray930[var9];
                        var13 -= var14;
                        var15 -= var14;
                        var16 -= var17;
                        var19 -= var17;
                        var20 -= var21;
                        var22 -= var21;
                        int var23 = var16 * var22 - var20 * var19;
                        int var24 = var20 * var15 - var13 * var22;
                        int var25 = var13 * var19 - var16 * var15;
                        if (var14 * var23 + var17 * var24 + var21 * var25 > 0) {
                            aBooleanArray1255[var6] = true;
                            int var26 = (anIntArray948[var7] + anIntArray948[var8] + anIntArray948[var9]) / 3 + this.anInt753;
                            anIntArrayArray1254[var26][anIntArray763[var26]++] = var6;
                        }
                    }
                }
            }

            int[] var18;
            if (this.aByteArray1280 == null) {
                for (var6 = this.anInt1257 - 1; var6 >= 0; --var6) {
                    var7 = anIntArray763[var6];
                    if (var7 > 0) {
                        var18 = anIntArrayArray1254[var6];

                        for (var9 = 0; var9 < var7; ++var9) {
                            this.method737(var18[var9]);
                        }
                    }
                }

            } else {
                for (var6 = 0; var6 < 12; ++var6) {
                    anIntArray747[var6] = 0;
                    anIntArray1265[var6] = 0;
                }

                for (var6 = this.anInt1257 - 1; var6 >= 0; --var6) {
                    var7 = anIntArray763[var6];
                    if (var7 > 0) {
                        var18 = anIntArrayArray1254[var6];

                        for (var9 = 0; var9 < var7; ++var9) {
                            var10 = var18[var9];
                            byte var30 = this.aByteArray1280[var10];
                            var12 = anIntArray747[var30]++;
                            anIntArrayArray1258[var30][var12] = var10;
                            if (var30 < 10) {
                                anIntArray1265[var30] += var6;
                            } else if (var30 == 10) {
                                anIntArray774[var12] = var6;
                            } else {
                                anIntArray1264[var12] = var6;
                            }
                        }
                    }
                }

                var6 = 0;
                if (anIntArray747[1] > 0 || anIntArray747[2] > 0) {
                    var6 = (anIntArray1265[1] + anIntArray1265[2]) / (anIntArray747[1] + anIntArray747[2]);
                }

                var7 = 0;
                if (anIntArray747[3] > 0 || anIntArray747[4] > 0) {
                    var7 = (anIntArray1265[3] + anIntArray1265[4]) / (anIntArray747[3] + anIntArray747[4]);
                }

                var8 = 0;
                if (anIntArray747[6] > 0 || anIntArray747[8] > 0) {
                    var8 = (anIntArray1265[6] + anIntArray1265[8]) / (anIntArray747[6] + anIntArray747[8]);
                }

                var10 = 0;
                var11 = anIntArray747[10];
                int[] var27 = anIntArrayArray1258[10];
                int[] var28 = anIntArray774;
                if (var10 == var11) {
                    var10 = 0;
                    var11 = anIntArray747[11];
                    var27 = anIntArrayArray1258[11];
                    var28 = anIntArray1264;
                }

                if (var10 < var11) {
                    var9 = var28[var10];
                } else {
                    var9 = -1000;
                }

                for (var14 = 0; var14 < 10; ++var14) {
                    while (var14 == 0 && var9 > var6) {
                        this.method737(var27[var10++]);
                        if (var10 == var11 && var27 != anIntArrayArray1258[11]) {
                            var10 = 0;
                            var11 = anIntArray747[11];
                            var27 = anIntArrayArray1258[11];
                            var28 = anIntArray1264;
                        }

                        if (var10 < var11) {
                            var9 = var28[var10];
                        } else {
                            var9 = -1000;
                        }
                    }

                    while (var14 == 3 && var9 > var7) {
                        this.method737(var27[var10++]);
                        if (var10 == var11 && var27 != anIntArrayArray1258[11]) {
                            var10 = 0;
                            var11 = anIntArray747[11];
                            var27 = anIntArrayArray1258[11];
                            var28 = anIntArray1264;
                        }

                        if (var10 < var11) {
                            var9 = var28[var10];
                        } else {
                            var9 = -1000;
                        }
                    }

                    while (var14 == 5 && var9 > var8) {
                        this.method737(var27[var10++]);
                        if (var10 == var11 && var27 != anIntArrayArray1258[11]) {
                            var10 = 0;
                            var11 = anIntArray747[11];
                            var27 = anIntArrayArray1258[11];
                            var28 = anIntArray1264;
                        }

                        if (var10 < var11) {
                            var9 = var28[var10];
                        } else {
                            var9 = -1000;
                        }
                    }

                    var15 = anIntArray747[var14];
                    int[] var29 = anIntArrayArray1258[var14];

                    for (var17 = 0; var17 < var15; ++var17) {
                        this.method737(var29[var17]);
                    }
                }

                while (var9 != -1000) {
                    this.method737(var27[var10++]);
                    if (var10 == var11 && var27 != anIntArrayArray1258[11]) {
                        var10 = 0;
                        var27 = anIntArrayArray1258[11];
                        var11 = anIntArray747[11];
                        var28 = anIntArray1264;
                    }

                    if (var10 < var11) {
                        var9 = var28[var10];
                    } else {
                        var9 = -1000;
                    }
                }

            }
        }
    }

    final void method737(int var1) {
        if (aBooleanArray1255[var1]) {
            this.method723(var1);
        } else {
            int var2 = this.xTriangles[var1];
            int var3 = this.yTriangles[var1];
            int var4 = this.zTriangles[var1];
            Node_Sub21_Sub26_Sub1.aBoolean1083 = aBooleanArray1260[var1];
            if (this.aByteArray949 == null) {
                Node_Sub21_Sub26_Sub1.anInt327 = 0;
            } else {
                Node_Sub21_Sub26_Sub1.anInt327 = this.aByteArray949[var1] & 255;
            }

            if (this.aShortArray947 != null && this.aShortArray947[var1] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.aByteArray1274 != null && this.aByteArray1274[var1] != -1) {
                    int var5 = this.aByteArray1274[var1] & 255;
                    var6 = this.anIntArray240[var5];
                    var7 = this.anIntArray1281[var5];
                    var8 = this.anIntArray1081[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }

                if (this.anIntArray1273[var1] == -1) {
                    Node_Sub21_Sub26_Sub1.method644(anIntArray944[var2], anIntArray944[var3], anIntArray944[var4], anIntArray1253[var2], anIntArray1253[var3], anIntArray1253[var4], this.anIntArray1171[var1], this.anIntArray1171[var1], this.anIntArray1171[var1], anIntArray1256[var6], anIntArray1256[var7], anIntArray1256[var8], anIntArray956[var6], anIntArray956[var7], anIntArray956[var8], anIntArray930[var6], anIntArray930[var7], anIntArray930[var8], this.aShortArray947[var1]);
                } else {
                    Node_Sub21_Sub26_Sub1.method644(anIntArray944[var2], anIntArray944[var3], anIntArray944[var4], anIntArray1253[var2], anIntArray1253[var3], anIntArray1253[var4], this.anIntArray1171[var1], this.anIntArray315[var1], this.anIntArray1273[var1], anIntArray1256[var6], anIntArray1256[var7], anIntArray1256[var8], anIntArray956[var6], anIntArray956[var7], anIntArray956[var8], anIntArray930[var6], anIntArray930[var7], anIntArray930[var8], this.aShortArray947[var1]);
                }
            } else if (this.anIntArray1273[var1] == -1) {
                Node_Sub21_Sub26_Sub1.method627(anIntArray944[var2], anIntArray944[var3], anIntArray944[var4], anIntArray1253[var2], anIntArray1253[var3], anIntArray1253[var4], anIntArray1267[this.anIntArray1171[var1]]);
            } else {
                Node_Sub21_Sub26_Sub1.method638(anIntArray944[var2], anIntArray944[var3], anIntArray944[var4], anIntArray1253[var2], anIntArray1253[var3], anIntArray1253[var4], this.anIntArray1171[var1], this.anIntArray315[var1], this.anIntArray1273[var1]);
            }

        }
    }

    public void method725() {
        for (int var1 = 0; var1 < this.anInt327; ++var1) {
            int var2 = this.zVertices[var1];
            this.zVertices[var1] = this.anIntArray932[var1];
            this.anIntArray932[var1] = -var2;
        }

        this.method572();
    }

    public void method540() {
        for (int var1 = 0; var1 < this.anInt327; ++var1) {
            int var2 = this.anIntArray932[var1];
            this.anIntArray932[var1] = this.zVertices[var1];
            this.zVertices[var1] = -var2;
        }

        this.method572();
    }

    public final void method739(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        anIntArray763[0] = -1;
        if (this.anInt765 != 2 && this.anInt765 != 1) {
            this.method563();
        }

        int var8 = Node_Sub21_Sub26_Sub1.viewportCenterX;
        int var9 = Node_Sub21_Sub26_Sub1.viewportCenterY;
        int var10000 = anIntArray1268[var1];
        var10000 = anIntArray1263[var1];
        int var12 = anIntArray1268[var2];
        int var13 = anIntArray1263[var2];
        int var14 = anIntArray1268[var3];
        int var15 = anIntArray1263[var3];
        int var16 = anIntArray1268[var4];
        int var17 = anIntArray1263[var4];
        int var18 = var6 * var16 + var7 * var17 >> 16;

        for (int var19 = 0; var19 < this.anInt327; ++var19) {
            int var20 = this.zVertices[var19];
            int var21 = this.yVertices[var19];
            int var22 = this.anIntArray932[var19];
            int var23;
            if (var3 != 0) {
                var23 = var21 * var14 + var20 * var15 >> 16;
                var21 = var21 * var15 - var20 * var14 >> 16;
                var20 = var23;
            }

            if (var2 != 0) {
                var23 = var22 * var12 + var20 * var13 >> 16;
                var22 = var22 * var13 - var20 * var12 >> 16;
                var20 = var23;
            }

            var20 += var5;
            var21 += var6;
            var22 += var7;
            var23 = var21 * var17 - var22 * var16 >> 16;
            var22 = var21 * var16 + var22 * var17 >> 16;
            anIntArray948[var19] = var22 - var18;
            anIntArray1253[var19] = var8 + var20 * Node_Sub21_Sub26_Sub1.anInt228 / var22;
            anIntArray944[var19] = var9 + var23 * Node_Sub21_Sub26_Sub1.anInt228 / var22;
            if (this.vertexCount > 0) {
                anIntArray1256[var19] = var20;
                anIntArray956[var19] = var23;
                anIntArray930[var19] = var22;
            }
        }

        try {
            this.method734(false, false, false, 0);
        } catch (Exception var25) {
        }

    }

    final void method723(int var1) {
        int var2 = Node_Sub21_Sub26_Sub1.viewportCenterX;
        int var3 = Node_Sub21_Sub26_Sub1.viewportCenterY;
        int var4 = 0;
        int var5 = this.xTriangles[var1];
        int var6 = this.yTriangles[var1];
        int var7 = this.zTriangles[var1];
        int var8 = anIntArray930[var5];
        int var9 = anIntArray930[var6];
        int var10 = anIntArray930[var7];
        if (this.aByteArray949 == null) {
            Node_Sub21_Sub26_Sub1.anInt327 = 0;
        } else {
            Node_Sub21_Sub26_Sub1.anInt327 = this.aByteArray949[var1] & 255;
        }

        int var11;
        int var12;
        int var13;
        int var14;
        if (var8 >= 50) {
            anIntArray1269[var4] = anIntArray1253[var5];
            anIntArray1270[var4] = anIntArray944[var5];
            anIntArray1261[var4++] = this.anIntArray1171[var1];
        } else {
            var11 = anIntArray1256[var5];
            var12 = anIntArray956[var5];
            var13 = this.anIntArray1171[var1];
            if (var10 >= 50) {
                var14 = (50 - var8) * anIntArray1266[var10 - var8];
                anIntArray1269[var4] = var2 + (var11 + ((anIntArray1256[var7] - var11) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1270[var4] = var3 + (var12 + ((anIntArray956[var7] - var12) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1261[var4++] = var13 + ((this.anIntArray1273[var1] - var13) * var14 >> 16);
            }

            if (var9 >= 50) {
                var14 = (50 - var8) * anIntArray1266[var9 - var8];
                anIntArray1269[var4] = var2 + (var11 + ((anIntArray1256[var6] - var11) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1270[var4] = var3 + (var12 + ((anIntArray956[var6] - var12) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1261[var4++] = var13 + ((this.anIntArray315[var1] - var13) * var14 >> 16);
            }
        }

        if (var9 >= 50) {
            anIntArray1269[var4] = anIntArray1253[var6];
            anIntArray1270[var4] = anIntArray944[var6];
            anIntArray1261[var4++] = this.anIntArray315[var1];
        } else {
            var11 = anIntArray1256[var6];
            var12 = anIntArray956[var6];
            var13 = this.anIntArray315[var1];
            if (var8 >= 50) {
                var14 = (50 - var9) * anIntArray1266[var8 - var9];
                anIntArray1269[var4] = var2 + (var11 + ((anIntArray1256[var5] - var11) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1270[var4] = var3 + (var12 + ((anIntArray956[var5] - var12) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1261[var4++] = var13 + ((this.anIntArray1171[var1] - var13) * var14 >> 16);
            }

            if (var10 >= 50) {
                var14 = (50 - var9) * anIntArray1266[var10 - var9];
                anIntArray1269[var4] = var2 + (var11 + ((anIntArray1256[var7] - var11) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1270[var4] = var3 + (var12 + ((anIntArray956[var7] - var12) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1261[var4++] = var13 + ((this.anIntArray1273[var1] - var13) * var14 >> 16);
            }
        }

        if (var10 >= 50) {
            anIntArray1269[var4] = anIntArray1253[var7];
            anIntArray1270[var4] = anIntArray944[var7];
            anIntArray1261[var4++] = this.anIntArray1273[var1];
        } else {
            var11 = anIntArray1256[var7];
            var12 = anIntArray956[var7];
            var13 = this.anIntArray1273[var1];
            if (var9 >= 50) {
                var14 = (50 - var10) * anIntArray1266[var9 - var10];
                anIntArray1269[var4] = var2 + (var11 + ((anIntArray1256[var6] - var11) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1270[var4] = var3 + (var12 + ((anIntArray956[var6] - var12) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1261[var4++] = var13 + ((this.anIntArray315[var1] - var13) * var14 >> 16);
            }

            if (var8 >= 50) {
                var14 = (50 - var10) * anIntArray1266[var8 - var10];
                anIntArray1269[var4] = var2 + (var11 + ((anIntArray1256[var5] - var11) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1270[var4] = var3 + (var12 + ((anIntArray956[var5] - var12) * var14 >> 16)) * Node_Sub21_Sub26_Sub1.anInt228 / 50;
                anIntArray1261[var4++] = var13 + ((this.anIntArray1171[var1] - var13) * var14 >> 16);
            }
        }

        var11 = anIntArray1269[0];
        var12 = anIntArray1269[1];
        var13 = anIntArray1269[2];
        var14 = anIntArray1270[0];
        int var15 = anIntArray1270[1];
        int var16 = anIntArray1270[2];
        Node_Sub21_Sub26_Sub1.aBoolean1083 = false;
        int var17;
        int var18;
        int var19;
        int var20;
        if (var4 == 3) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Node_Sub21_Sub26_Sub1.anInt919 || var12 > Node_Sub21_Sub26_Sub1.anInt919 || var13 > Node_Sub21_Sub26_Sub1.anInt919) {
                Node_Sub21_Sub26_Sub1.aBoolean1083 = true;
            }

            if (this.aShortArray947 != null && this.aShortArray947[var1] != -1) {
                if (this.aByteArray1274 != null && this.aByteArray1274[var1] != -1) {
                    var17 = this.aByteArray1274[var1] & 255;
                    var18 = this.anIntArray240[var17];
                    var19 = this.anIntArray1281[var17];
                    var20 = this.anIntArray1081[var17];
                } else {
                    var18 = var5;
                    var19 = var6;
                    var20 = var7;
                }

                if (this.anIntArray1273[var1] == -1) {
                    Node_Sub21_Sub26_Sub1.method644(var14, var15, var16, var11, var12, var13, this.anIntArray1171[var1], this.anIntArray1171[var1], this.anIntArray1171[var1], anIntArray1256[var18], anIntArray1256[var19], anIntArray1256[var20], anIntArray956[var18], anIntArray956[var19], anIntArray956[var20], anIntArray930[var18], anIntArray930[var19], anIntArray930[var20], this.aShortArray947[var1]);
                } else {
                    Node_Sub21_Sub26_Sub1.method644(var14, var15, var16, var11, var12, var13, anIntArray1261[0], anIntArray1261[1], anIntArray1261[2], anIntArray1256[var18], anIntArray1256[var19], anIntArray1256[var20], anIntArray956[var18], anIntArray956[var19], anIntArray956[var20], anIntArray930[var18], anIntArray930[var19], anIntArray930[var20], this.aShortArray947[var1]);
                }
            } else if (this.anIntArray1273[var1] == -1) {
                Node_Sub21_Sub26_Sub1.method627(var14, var15, var16, var11, var12, var13, anIntArray1267[this.anIntArray1171[var1]]);
            } else {
                Node_Sub21_Sub26_Sub1.method638(var14, var15, var16, var11, var12, var13, anIntArray1261[0], anIntArray1261[1], anIntArray1261[2]);
            }
        }

        if (var4 == 4) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Node_Sub21_Sub26_Sub1.anInt919 || var12 > Node_Sub21_Sub26_Sub1.anInt919 || var13 > Node_Sub21_Sub26_Sub1.anInt919 || anIntArray1269[3] < 0 || anIntArray1269[3] > Node_Sub21_Sub26_Sub1.anInt919) {
                Node_Sub21_Sub26_Sub1.aBoolean1083 = true;
            }

            if (this.aShortArray947 != null && this.aShortArray947[var1] != -1) {
                if (this.aByteArray1274 != null && this.aByteArray1274[var1] != -1) {
                    var17 = this.aByteArray1274[var1] & 255;
                    var18 = this.anIntArray240[var17];
                    var19 = this.anIntArray1281[var17];
                    var20 = this.anIntArray1081[var17];
                } else {
                    var18 = var5;
                    var19 = var6;
                    var20 = var7;
                }

                short var21 = this.aShortArray947[var1];
                if (this.anIntArray1273[var1] == -1) {
                    Node_Sub21_Sub26_Sub1.method644(var14, var15, var16, var11, var12, var13, this.anIntArray1171[var1], this.anIntArray1171[var1], this.anIntArray1171[var1], anIntArray1256[var18], anIntArray1256[var19], anIntArray1256[var20], anIntArray956[var18], anIntArray956[var19], anIntArray956[var20], anIntArray930[var18], anIntArray930[var19], anIntArray930[var20], var21);
                    Node_Sub21_Sub26_Sub1.method644(var14, var16, anIntArray1270[3], var11, var13, anIntArray1269[3], this.anIntArray1171[var1], this.anIntArray1171[var1], this.anIntArray1171[var1], anIntArray1256[var18], anIntArray1256[var19], anIntArray1256[var20], anIntArray956[var18], anIntArray956[var19], anIntArray956[var20], anIntArray930[var18], anIntArray930[var19], anIntArray930[var20], var21);
                } else {
                    Node_Sub21_Sub26_Sub1.method644(var14, var15, var16, var11, var12, var13, anIntArray1261[0], anIntArray1261[1], anIntArray1261[2], anIntArray1256[var18], anIntArray1256[var19], anIntArray1256[var20], anIntArray956[var18], anIntArray956[var19], anIntArray956[var20], anIntArray930[var18], anIntArray930[var19], anIntArray930[var20], var21);
                    Node_Sub21_Sub26_Sub1.method644(var14, var16, anIntArray1270[3], var11, var13, anIntArray1269[3], anIntArray1261[0], anIntArray1261[2], anIntArray1261[3], anIntArray1256[var18], anIntArray1256[var19], anIntArray1256[var20], anIntArray956[var18], anIntArray956[var19], anIntArray956[var20], anIntArray930[var18], anIntArray930[var19], anIntArray930[var20], var21);
                }
            } else if (this.anIntArray1273[var1] == -1) {
                var18 = anIntArray1267[this.anIntArray1171[var1]];
                Node_Sub21_Sub26_Sub1.method627(var14, var15, var16, var11, var12, var13, var18);
                Node_Sub21_Sub26_Sub1.method627(var14, var16, anIntArray1270[3], var11, var13, anIntArray1269[3], var18);
            } else {
                Node_Sub21_Sub26_Sub1.method638(var14, var15, var16, var11, var12, var13, anIntArray1261[0], anIntArray1261[1], anIntArray1261[2]);
                Node_Sub21_Sub26_Sub1.method638(var14, var16, anIntArray1270[3], var11, var13, anIntArray1269[3], anIntArray1261[0], anIntArray1261[2], anIntArray1261[3]);
            }
        }

    }
}
