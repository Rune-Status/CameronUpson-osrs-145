package com.jagex;

public class SceneGraph {
    static final int[] anIntArray1204;
    static final int[] anIntArray1206;
    static final int[] anIntArray1192;
    static final int[] anIntArray1191;
    static final int[] anIntArray1187;
    static final int[] anIntArray1212;
    static final int[] anIntArray1203;
    public static boolean aBoolean1232 = true;
    public static int anInt1201 = -1;
    public static int anInt1198 = -1;
    static int anInt1225 = 0;
    static NodeDeque<Tile> aNodeDeque1208;
    static int[] anIntArray1190;
    static int anInt1237 = 0;
    static Class99[][] aClass99ArrayArray1200;
    static int anInt1229;
    static int anInt1196 = 0;
    static int anInt1230;
    static int pitchSin;
    static int anInt1239;
    static int anInt1220;
    static int anInt1240;
    static int anInt1236;
    static int anInt1233;
    static int pitchCos;
    static int anInt1215;
    static int yawCos;
    static EntityMarker[] anEntityMarkerArray1199 = new EntityMarker[100];
    static int anInt1234;
    static int anInt1195 = 0;
    static int anInt1185 = 0;
    static int anInt1226;
    static boolean aBoolean1186 = false;
    static int anInt1222;
    static int anInt1193 = 4;
    static int anInt1210;
    static int anInt1202;
    static Class99[] aClass99Array1197;
    static int yawSin;
    static boolean[][][][] aBooleanArrayArrayArrayArray1217;
    static boolean[][] aBooleanArrayArray1219;
    static int anInt1209;
    static boolean aBoolean1194 = false;
    static int anInt1214;
    static int anInt1216;
    static int anInt1218;

    static {
        anIntArray1190 = new int[anInt1193];
        aClass99ArrayArray1200 = new Class99[anInt1193][500];
        anInt1202 = 0;
        aClass99Array1197 = new Class99[500];
        aNodeDeque1208 = new NodeDeque<>();
        anIntArray1192 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
        anIntArray1206 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
        anIntArray1204 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
        anIntArray1191 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
        anIntArray1187 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
        anIntArray1203 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
        anIntArray1212 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
        aBooleanArrayArrayArrayArray1217 = new boolean[8][32][51][51];
    }

    int anInt1231;
    int anInt1223;
    int anInt1228 = 0;
    int anInt1227 = 0;
    EntityMarker[] tempMarkers = new EntityMarker[5000];
    int[][][] anIntArrayArrayArray1221;
    int[][][] anIntArrayArrayArray1238;
    Tile[][][] tiles;
    int[][] anIntArrayArray1211 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    int anInt1235;
    int[][] anIntArrayArray1213 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};

    public SceneGraph(int var1, int var2, int var3, int[][][] var4) {
        this.anInt1231 = var1;
        this.anInt1223 = var2;
        this.anInt1235 = var3;
        this.tiles = new Tile[var1][var2][var3];
        this.anIntArrayArrayArray1221 = new int[var1][var2 + 1][var3 + 1];
        this.anIntArrayArrayArray1238 = var4;
        this.method710();
    }

    public static int[] method697(int var0, int var1, int var2) {
        int var3 = var2 * yawSin + var0 * yawCos >> 16;
        var2 = var2 * yawCos - var0 * yawSin >> 16;
        var0 = var3;
        var3 = var1 * pitchCos - var2 * pitchSin >> 16;
        var2 = var1 * pitchSin + var2 * pitchCos >> 16;
        var2 |= 1;
        int var4 = Node_Sub21_Sub26_Sub1.viewportCenterX + var0 * Node_Sub21_Sub26_Sub1.anInt228 / var2 + DrawingArea.areaLeft;
        int var5 = Node_Sub21_Sub26_Sub1.viewportCenterY + var3 * Node_Sub21_Sub26_Sub1.anInt228 / var2 + DrawingArea.areaTop;
        return new int[]{var4, var5};
    }

    public static void method714(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        Class99 var8 = new Class99();
        var8.anInt1098 = var2 / 128;
        var8.anInt1095 = var3 / 128;
        var8.anInt1089 = var4 / 128;
        var8.anInt1101 = var5 / 128;
        var8.anInt1103 = var1;
        var8.anInt1104 = var2;
        var8.anInt1093 = var3;
        var8.anInt1092 = var4;
        var8.anInt1090 = var5;
        var8.anInt1088 = var6;
        var8.anInt1097 = var7;
        aClass99ArrayArray1200[var0][anIntArray1190[var0]++] = var8;
    }

    static boolean method691(int var0, int var1, int var2) {
        int var3 = var2 * yawSin + var0 * yawCos >> 16;
        int var4 = var2 * yawCos - var0 * yawSin >> 16;
        int var5 = var1 * pitchSin + var4 * pitchCos >> 16;
        int var6 = var1 * pitchCos - var4 * pitchSin >> 16;
        if (var5 >= 50 && var5 <= 3500) {
            int var7 = anInt1209 + var3 * 390 / var5;
            int var8 = anInt1215 + var6 * 390 / var5;
            return var7 >= anInt1214 && var7 <= anInt1210 && var8 >= anInt1216 && var8 <= anInt1218;
        }
        return false;
    }

    public static boolean method683() {
        return aBoolean1186 && anInt1201 != -1;
    }

    public static void method685() {
        anInt1201 = -1;
        aBoolean1186 = false;
    }

    static int method687(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 'ﾀ') + var1;
    }

    public static void method667(int[] var0, int var1, int var2, int var3, int var4) {
        anInt1214 = 0;
        anInt1216 = 0;
        anInt1210 = var3;
        anInt1218 = var4;
        anInt1209 = var3 / 2;
        anInt1215 = var4 / 2;
        boolean[][][][] var5 = new boolean[9][32][53][53];

        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        for (var6 = 128; var6 <= 384; var6 += 32) {
            for (var7 = 0; var7 < 2048; var7 += 64) {
                pitchSin = Node_Sub21_Sub26_Sub1.SINE[var6];
                pitchCos = Node_Sub21_Sub26_Sub1.COS[var6];
                yawSin = Node_Sub21_Sub26_Sub1.SINE[var7];
                yawCos = Node_Sub21_Sub26_Sub1.COS[var7];
                var8 = (var6 - 128) / 32;
                var9 = var7 / 64;

                for (int var10 = -26; var10 <= 26; ++var10) {
                    for (var11 = -26; var11 <= 26; ++var11) {
                        var12 = var10 * 128;
                        int var13 = var11 * 128;
                        boolean var14 = false;

                        for (int var15 = -var1; var15 <= var2; var15 += 128) {
                            if (method691(var12, var0[var8] + var15, var13)) {
                                var14 = true;
                                break;
                            }
                        }

                        var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                    }
                }
            }
        }

        for (var6 = 0; var6 < 8; ++var6) {
            for (var7 = 0; var7 < 32; ++var7) {
                for (var8 = -25; var8 < 25; ++var8) {
                    for (var9 = -25; var9 < 25; ++var9) {
                        boolean var16 = false;

                        label76:
                        for (var11 = -1; var11 <= 1; ++var11) {
                            for (var12 = -1; var12 <= 1; ++var12) {
                                if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                                    var16 = true;
                                    break label76;
                                }
                            }
                        }

                        aBooleanArrayArrayArrayArray1217[var6][var7][var8 + 25][var9 + 25] = var16;
                    }
                }
            }
        }

    }

    public void method702(int var1, int var2) {
        Tile var3 = this.tiles[0][var1][var2];

        for (int var4 = 0; var4 < 3; ++var4) {
            Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
            if (var5 != null) {
                --var5.level;

                for (int var6 = 0; var6 < var5.anInt226; ++var6) {
                    EntityMarker var7 = var5.markers[var6];
                    if ((var7.uid >> 29 & 3) == 2 && var7.sceneX == var1 && var7.sceneY == var2) {
                        --var7.level;
                    }
                }
            }
        }

        if (this.tiles[0][var1][var2] == null) {
            this.tiles[0][var1][var2] = new Tile(0, var1, var2);
        }

        this.tiles[0][var1][var2].aTile1176 = var3;
        this.tiles[3][var1][var2] = null;
    }

    public void method717(int var1, int var2, int var3, int var4) {
        Tile var5 = this.tiles[var1][var2][var3];
        if (var5 != null) {
            this.tiles[var1][var2][var3].anInt919 = var4;
        }
    }

    public void method720(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
        TilePaint var21;
        int var22;
        if (var4 == 0) {
            var21 = new TilePaint(var11, var12, var13, var14, -1, var19, false);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.tiles[var22][var2][var3] == null) {
                    this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].paint = var21;
        } else if (var4 != 1) {
            TileModel var23 = new TileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.tiles[var22][var2][var3] == null) {
                    this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].model = var23;
        } else {
            var21 = new TilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.tiles[var22][var2][var3] == null) {
                    this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].paint = var21;
        }
    }

    public int method671(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        return var4 != null && var4.boundary != null ? var4.boundary.uid : 0;
    }

    public void method700(int var1, int var2, int var3, int var4, Entity var5, int var6, Entity var7, Entity var8) {
        Class90 var9 = new Class90();
        var9.anEntity961 = var5;
        var9.anInt960 = var2 * 128 + 64;
        var9.anInt959 = var3 * 128 + 64;
        var9.anInt958 = var4;
        var9.anInt964 = var6;
        var9.anEntity965 = var7;
        var9.anEntity963 = var8;
        int var10 = 0;
        Tile var11 = this.tiles[var1][var2][var3];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.anInt226; ++var12) {
                if ((var11.markers[var12].config & 256) == 256 && var11.markers[var12].entity instanceof Model) {
                    Model var13 = (Model) var11.markers[var12].entity;
                    var13.method724();
                    if (var13.height > var10) {
                        var10 = var13.height;
                    }
                }
            }
        }

        var9.anInt962 = var10;
        if (this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
        }

        this.tiles[var1][var2][var3].aClass90_1167 = var9;
    }

    public void method709(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10) {
        if (var5 != null || var6 != null) {
            Boundary var11 = new Boundary();
            var11.uid = var9;
            var11.config = var10;
            var11.sceneX = var2 * 128 + 64;
            var11.sceneY = var3 * 128 + 64;
            var11.level = var4;
            var11.entity = var5;
            var11.anEntity1147 = var6;
            var11.anInt1141 = var7;
            var11.anInt1144 = var8;

            for (int var12 = var1; var12 >= 0; --var12) {
                if (this.tiles[var12][var2][var3] == null) {
                    this.tiles[var12][var2][var3] = new Tile(var12, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].boundary = var11;
        }
    }

    public boolean method703(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        return var6 == null || this.method716(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0);
    }

    public boolean method708(int var1, int var2, int var3, int var4, int var5, int var6, Entity var7, int var8, int var9, int var10) {
        if (var7 == null) {
            return true;
        }
        int var11 = var2 * 128 + var5 * 64;
        int var12 = var3 * 128 + var6 * 64;
        return this.method716(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
    }

    public void method710() {
        int var1;
        int var2;
        for (var1 = 0; var1 < this.anInt1231; ++var1) {
            for (var2 = 0; var2 < this.anInt1223; ++var2) {
                for (int var3 = 0; var3 < this.anInt1235; ++var3) {
                    this.tiles[var1][var2][var3] = null;
                }
            }
        }

        for (var1 = 0; var1 < anInt1193; ++var1) {
            for (var2 = 0; var2 < anIntArray1190[var1]; ++var2) {
                aClass99ArrayArray1200[var1][var2] = null;
            }

            anIntArray1190[var1] = 0;
        }

        for (var1 = 0; var1 < this.anInt1227; ++var1) {
            this.tempMarkers[var1] = null;
        }

        this.anInt1227 = 0;

        for (var1 = 0; var1 < anEntityMarkerArray1199.length; ++var1) {
            anEntityMarkerArray1199[var1] = null;
        }

    }

    public EntityMarker method690(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        if (var4 == null) {
            return null;
        }
        for (int var5 = 0; var5 < var4.anInt226; ++var5) {
            EntityMarker var6 = var4.markers[var5];
            if ((var6.uid >> 29 & 3) == 2 && var6.sceneX == var2 && var6.sceneY == var3) {
                return var6;
            }
        }

        return null;
    }

    boolean method716(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9, int var10, boolean var11, int var12, int var13) {
        int var15;
        for (int var14 = var2; var14 < var2 + var4; ++var14) {
            for (var15 = var3; var15 < var3 + var5; ++var15) {
                if (var14 < 0 || var15 < 0 || var14 >= this.anInt1223 || var15 >= this.anInt1235) {
                    return false;
                }

                Tile var16 = this.tiles[var1][var14][var15];
                if (var16 != null && var16.anInt226 >= 5) {
                    return false;
                }
            }
        }

        EntityMarker var17 = new EntityMarker();
        var17.uid = var12;
        var17.config = var13;
        var17.level = var1;
        var17.endSceneX = var6;
        var17.endSceneY = var7;
        var17.height = var8;
        var17.entity = var9;
        var17.anInt1127 = var10;
        var17.sceneX = var2;
        var17.sceneY = var3;
        var17.anInt1125 = var2 + var4 - 1;
        var17.anInt1122 = var3 + var5 - 1;

        for (var15 = var2; var15 < var2 + var4; ++var15) {
            for (int var18 = var3; var18 < var3 + var5; ++var18) {
                int var19 = 0;
                if (var15 > var2) {
                    ++var19;
                }

                if (var15 < var2 + var4 - 1) {
                    var19 += 4;
                }

                if (var18 > var3) {
                    var19 += 8;
                }

                if (var18 < var3 + var5 - 1) {
                    var19 += 2;
                }

                for (int var20 = var1; var20 >= 0; --var20) {
                    if (this.tiles[var20][var15][var18] == null) {
                        this.tiles[var20][var15][var18] = new Tile(var20, var15, var18);
                    }
                }

                Tile var21 = this.tiles[var1][var15][var18];
                var21.markers[var21.anInt226] = var17;
                var21.anIntArray1171[var21.anInt226] = var19;
                var21.anInt212 |= var19;
                ++var21.anInt226;
            }
        }

        if (var11) {
            this.tempMarkers[this.anInt1227++] = var17;
        }

        return true;
    }

    public void method712(int var1, int var2, int var3, int var4) {
        Tile var5 = this.tiles[var1][var2][var3];
        if (var5 != null) {
            BoundaryDecor var6 = var5.boundaryDecor;
            if (var6 != null) {
                var6.anInt1113 = var6.anInt1113 * var4 / 16;
                var6.anInt1114 = var6.anInt1114 * var4 / 16;
            }
        }
    }

    public void method701(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        if (var4 != null) {
            var4.boundaryDecor = null;
        }
    }

    public void method718(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        if (var4 != null) {
            for (int var5 = 0; var5 < var4.anInt226; ++var5) {
                EntityMarker var6 = var4.markers[var5];
                if ((var6.uid >> 29 & 3) == 2 && var6.sceneX == var2 && var6.sceneY == var3) {
                    this.method705(var6);
                    return;
                }
            }

        }
    }

    public void method719(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        if (var4 != null) {
            var4.aClass90_1167 = null;
        }
    }

    public Boundary method715(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        return var4 == null ? null : var4.boundary;
    }

    public BoundaryDecor method688(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        return var4 == null ? null : var4.boundaryDecor;
    }

    public TileDecor method672(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        return var4 != null && var4.decor != null ? var4.decor : null;
    }

    public int method682(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        return var4 != null && var4.boundaryDecor != null ? var4.boundaryDecor.uid : 0;
    }

    public int method677(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.anInt226; ++var5) {
            EntityMarker var6 = var4.markers[var5];
            if ((var6.uid >> 29 & 3) == 2 && var6.sceneX == var2 && var6.sceneY == var3) {
                return var6.uid;
            }
        }

        return 0;
    }

    public void method679(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anInt1231; ++var4) {
            for (int var5 = 0; var5 < this.anInt1223; ++var5) {
                for (int var6 = 0; var6 < this.anInt1235; ++var6) {
                    Tile var7 = this.tiles[var4][var5][var6];
                    if (var7 != null) {
                        Boundary var8 = var7.boundary;
                        ModelHeader var10;
                        if (var8 != null && var8.entity instanceof ModelHeader) {
                            ModelHeader var9 = (ModelHeader) var8.entity;
                            this.method681(var9, var4, var5, var6, 1, 1);
                            if (var8.anEntity1147 instanceof ModelHeader) {
                                var10 = (ModelHeader) var8.anEntity1147;
                                this.method681(var10, var4, var5, var6, 1, 1);
                                ModelHeader.method577(var9, var10, 0, 0, 0, false);
                                var8.anEntity1147 = var10.light(var10.aShort939, var10.aShort946, var1, var2, var3);
                            }

                            var8.entity = var9.light(var9.aShort939, var9.aShort946, var1, var2, var3);
                        }

                        for (int var11 = 0; var11 < var7.anInt226; ++var11) {
                            EntityMarker var14 = var7.markers[var11];
                            if (var14 != null && var14.entity instanceof ModelHeader) {
                                ModelHeader var12 = (ModelHeader) var14.entity;
                                this.method681(var12, var4, var5, var6, var14.anInt1125 - var14.sceneX + 1, var14.anInt1122 - var14.sceneY + 1);
                                var14.entity = var12.light(var12.aShort939, var12.aShort946, var1, var2, var3);
                            }
                        }

                        TileDecor var13 = var7.decor;
                        if (var13 != null && var13.entity instanceof ModelHeader) {
                            var10 = (ModelHeader) var13.entity;
                            this.method684(var10, var4, var5, var6);
                            var13.entity = var10.light(var10.aShort939, var10.aShort946, var1, var2, var3);
                        }
                    }
                }
            }
        }

    }

    public boolean method698(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, int var8, boolean var9) {
        if (var6 == null) {
            return true;
        }
        int var10 = var2 - var5;
        int var11 = var3 - var5;
        int var12 = var2 + var5;
        int var13 = var3 + var5;
        if (var9) {
            if (var7 > 640 && var7 < 1408) {
                var13 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
                var12 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
                var11 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
                var10 -= 128;
            }
        }

        var10 /= 128;
        var11 /= 128;
        var12 /= 128;
        var13 /= 128;
        return this.method716(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
    }

    public void method669(int[] var1, int var2, int var3, int var4, int var5, int var6) {
        Tile var7 = this.tiles[var4][var5][var6];
        if (var7 != null) {
            TilePaint var8 = var7.paint;
            int var11;
            if (var8 != null) {
                int var9 = var8.rgb;
                if (var9 != 0) {
                    for (var11 = 0; var11 < 4; ++var11) {
                        var1[var2] = var9;
                        var1[var2 + 1] = var9;
                        var1[var2 + 2] = var9;
                        var1[var2 + 3] = var9;
                        var2 += var3;
                    }

                }
            } else {
                TileModel var10 = var7.model;
                if (var10 != null) {
                    var11 = var10.shape;
                    int var12 = var10.rotation;
                    int var13 = var10.underlay;
                    int var14 = var10.overlay;
                    int[] var15 = this.anIntArrayArray1211[var11];
                    int[] var16 = this.anIntArrayArray1213[var12];
                    int var17 = 0;
                    int var18;
                    if (var13 != 0) {
                        for (var18 = 0; var18 < 4; ++var18) {
                            var1[var2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            var1[var2 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            var1[var2 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            var1[var2 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            var2 += var3;
                        }
                    } else {
                        for (var18 = 0; var18 < 4; ++var18) {
                            if (var15[var16[var17++]] != 0) {
                                var1[var2] = var14;
                            }

                            if (var15[var16[var17++]] != 0) {
                                var1[var2 + 1] = var14;
                            }

                            if (var15[var16[var17++]] != 0) {
                                var1[var2 + 2] = var14;
                            }

                            if (var15[var16[var17++]] != 0) {
                                var1[var2 + 3] = var14;
                            }

                            var2 += var3;
                        }
                    }

                }
            }
        }
    }

    boolean method674(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (var2 < var3 && var2 < var4 && var2 < var5) {
            return false;
        }
        if (var2 > var3 && var2 > var4 && var2 > var5) {
            return false;
        }
        if (var1 < var6 && var1 < var7 && var1 < var8) {
            return false;
        }
        if (var1 > var6 && var1 > var7 && var1 > var8) {
            return false;
        }
        int var9 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
        int var10 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
        int var11 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
        return var9 * var11 > 0 && var11 * var10 > 0;
    }

    public void method676(int var1, int var2, int var3, boolean var4) {
        if (!method683() || var4) {
            aBoolean1194 = true;
            aBoolean1186 = var4;
            anInt1195 = var1;
            anInt1185 = var2;
            anInt1196 = var3;
            anInt1201 = -1;
            anInt1198 = -1;
        }
    }

    public void method673() {
        aBoolean1186 = true;
    }

    public void method680(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 < 0) {
            var1 = 0;
        } else if (var1 >= this.anInt1223 * 128) {
            var1 = this.anInt1223 * 128 - 1;
        }

        if (var3 < 0) {
            var3 = 0;
        } else if (var3 >= this.anInt1235 * 128) {
            var3 = this.anInt1235 * 128 - 1;
        }

        ++anInt1234;
        pitchSin = Node_Sub21_Sub26_Sub1.SINE[var4];
        pitchCos = Node_Sub21_Sub26_Sub1.COS[var4];
        yawSin = Node_Sub21_Sub26_Sub1.SINE[var5];
        yawCos = Node_Sub21_Sub26_Sub1.COS[var5];
        aBooleanArrayArray1219 = aBooleanArrayArrayArrayArray1217[(var4 - 128) / 32][var5 / 64];
        anInt1220 = var1;
        anInt1240 = var2;
        anInt1236 = var3;
        anInt1222 = var1 / 128;
        anInt1239 = var3 / 128;
        anInt1237 = var6;
        anInt1229 = anInt1222 - 25;
        if (anInt1229 < 0) {
            anInt1229 = 0;
        }

        anInt1230 = anInt1239 - 25;
        if (anInt1230 < 0) {
            anInt1230 = 0;
        }

        anInt1233 = anInt1222 + 25;
        if (anInt1233 > this.anInt1223) {
            anInt1233 = this.anInt1223;
        }

        anInt1226 = anInt1239 + 25;
        if (anInt1226 > this.anInt1235) {
            anInt1226 = this.anInt1235;
        }

        this.method670();
        anInt1225 = 0;

        int var7;
        Tile[][] var8;
        int var9;
        int var10;
        for (var7 = this.anInt1228; var7 < this.anInt1231; ++var7) {
            var8 = this.tiles[var7];

            for (var9 = anInt1229; var9 < anInt1233; ++var9) {
                for (var10 = anInt1230; var10 < anInt1226; ++var10) {
                    Tile var11 = var8[var9][var10];
                    if (var11 != null) {
                        if (var11.anInt919 <= var6 && (aBooleanArrayArray1219[var9 - anInt1222 + 25][var10 - anInt1239 + 25] || this.anIntArrayArrayArray1238[var7][var9][var10] - var2 >= 2000)) {
                            var11.aBoolean1174 = true;
                            var11.aBoolean1173 = true;
                            var11.aBoolean980 = var11.anInt226 > 0;

                            ++anInt1225;
                        } else {
                            var11.aBoolean1174 = false;
                            var11.aBoolean1173 = false;
                            var11.anInt229 = 0;
                        }
                    }
                }
            }
        }

        int var12;
        int var13;
        int var14;
        int var15;
        Tile var16;
        for (var7 = this.anInt1228; var7 < this.anInt1231; ++var7) {
            var8 = this.tiles[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = anInt1222 + var9;
                var12 = anInt1222 - var9;
                if (var10 >= anInt1229 || var12 < anInt1233) {
                    for (var13 = -25; var13 <= 0; ++var13) {
                        var14 = anInt1239 + var13;
                        var15 = anInt1239 - var13;
                        if (var10 >= anInt1229) {
                            if (var14 >= anInt1230) {
                                var16 = var8[var10][var14];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, true);
                                }
                            }

                            if (var15 < anInt1226) {
                                var16 = var8[var10][var15];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, true);
                                }
                            }
                        }

                        if (var12 < anInt1233) {
                            if (var14 >= anInt1230) {
                                var16 = var8[var12][var14];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, true);
                                }
                            }

                            if (var15 < anInt1226) {
                                var16 = var8[var12][var15];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, true);
                                }
                            }
                        }

                        if (anInt1225 == 0) {
                            aBoolean1194 = false;
                            return;
                        }
                    }
                }
            }
        }

        for (var7 = this.anInt1228; var7 < this.anInt1231; ++var7) {
            var8 = this.tiles[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = anInt1222 + var9;
                var12 = anInt1222 - var9;
                if (var10 >= anInt1229 || var12 < anInt1233) {
                    for (var13 = -25; var13 <= 0; ++var13) {
                        var14 = anInt1239 + var13;
                        var15 = anInt1239 - var13;
                        if (var10 >= anInt1229) {
                            if (var14 >= anInt1230) {
                                var16 = var8[var10][var14];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, false);
                                }
                            }

                            if (var15 < anInt1226) {
                                var16 = var8[var10][var15];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, false);
                                }
                            }
                        }

                        if (var12 < anInt1233) {
                            if (var14 >= anInt1230) {
                                var16 = var8[var12][var14];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, false);
                                }
                            }

                            if (var15 < anInt1226) {
                                var16 = var8[var12][var15];
                                if (var16 != null && var16.aBoolean1174) {
                                    this.method692(var16, false);
                                }
                            }
                        }

                        if (anInt1225 == 0) {
                            aBoolean1194 = false;
                            return;
                        }
                    }
                }
            }
        }

        aBoolean1194 = false;
    }

    void method675(TilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9;
        int var10 = var9 = (var7 << 7) - anInt1220;
        int var11;
        int var12 = var11 = (var8 << 7) - anInt1236;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.anIntArrayArrayArray1238[var2][var7][var8] - anInt1240;
        int var18 = this.anIntArrayArrayArray1238[var2][var7 + 1][var8] - anInt1240;
        int var19 = this.anIntArrayArrayArray1238[var2][var7 + 1][var8 + 1] - anInt1240;
        int var20 = this.anIntArrayArrayArray1238[var2][var7][var8 + 1] - anInt1240;
        int var21 = var12 * var5 + var10 * var6 >> 16;
        var12 = var12 * var6 - var10 * var5 >> 16;
        var10 = var21;
        var21 = var17 * var4 - var12 * var3 >> 16;
        var12 = var17 * var3 + var12 * var4 >> 16;
        var17 = var21;
        if (var12 >= 50) {
            var21 = var11 * var5 + var14 * var6 >> 16;
            var11 = var11 * var6 - var14 * var5 >> 16;
            var14 = var21;
            var21 = var18 * var4 - var11 * var3 >> 16;
            var11 = var18 * var3 + var11 * var4 >> 16;
            var18 = var21;
            if (var11 >= 50) {
                var21 = var16 * var5 + var13 * var6 >> 16;
                var16 = var16 * var6 - var13 * var5 >> 16;
                var13 = var21;
                var21 = var19 * var4 - var16 * var3 >> 16;
                var16 = var19 * var3 + var16 * var4 >> 16;
                var19 = var21;
                if (var16 >= 50) {
                    var21 = var15 * var5 + var9 * var6 >> 16;
                    var15 = var15 * var6 - var9 * var5 >> 16;
                    var9 = var21;
                    var21 = var20 * var4 - var15 * var3 >> 16;
                    var15 = var20 * var3 + var15 * var4 >> 16;
                    if (var15 >= 50) {
                        int var22 = Node_Sub21_Sub26_Sub1.viewportCenterX + var10 * Node_Sub21_Sub26_Sub1.anInt228 / var12;
                        int var23 = Node_Sub21_Sub26_Sub1.viewportCenterY + var17 * Node_Sub21_Sub26_Sub1.anInt228 / var12;
                        int var24 = Node_Sub21_Sub26_Sub1.viewportCenterX + var14 * Node_Sub21_Sub26_Sub1.anInt228 / var11;
                        int var25 = Node_Sub21_Sub26_Sub1.viewportCenterY + var18 * Node_Sub21_Sub26_Sub1.anInt228 / var11;
                        int var26 = Node_Sub21_Sub26_Sub1.viewportCenterX + var13 * Node_Sub21_Sub26_Sub1.anInt228 / var16;
                        int var27 = Node_Sub21_Sub26_Sub1.viewportCenterY + var19 * Node_Sub21_Sub26_Sub1.anInt228 / var16;
                        int var28 = Node_Sub21_Sub26_Sub1.viewportCenterX + var9 * Node_Sub21_Sub26_Sub1.anInt228 / var15;
                        int var29 = Node_Sub21_Sub26_Sub1.viewportCenterY + var21 * Node_Sub21_Sub26_Sub1.anInt228 / var15;
                        Node_Sub21_Sub26_Sub1.anInt327 = 0;
                        int var30;
                        if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                            Node_Sub21_Sub26_Sub1.aBoolean1083 = var26 < 0 || var28 < 0 || var24 < 0 || var26 > Node_Sub21_Sub26_Sub1.anInt919 || var28 > Node_Sub21_Sub26_Sub1.anInt919 || var24 > Node_Sub21_Sub26_Sub1.anInt919;

                            if (aBoolean1194 && this.method674(anInt1185, anInt1196, var27, var29, var25, var26, var28, var24)) {
                                anInt1201 = var7;
                                anInt1198 = var8;
                            }

                            if (var1.texture == -1) {
                                if (var1.anInt1155 != 12345678) {
                                    Node_Sub21_Sub26_Sub1.method638(var27, var29, var25, var26, var28, var24, var1.anInt1155, var1.anInt1154, var1.anInt1159);
                                }
                            } else if (!aBoolean1232) {
                                if (var1.flatShade) {
                                    Node_Sub21_Sub26_Sub1.method633(var27, var29, var25, var26, var28, var24, var1.anInt1155, var1.anInt1154, var1.anInt1159, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
                                } else {
                                    Node_Sub21_Sub26_Sub1.method633(var27, var29, var25, var26, var28, var24, var1.anInt1155, var1.anInt1154, var1.anInt1159, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture);
                                }
                            } else {
                                var30 = Node_Sub21_Sub26_Sub1.aTextureProvider1085.method501(var1.texture);
                                Node_Sub21_Sub26_Sub1.method638(var27, var29, var25, var26, var28, var24, method687(var30, var1.anInt1155), method687(var30, var1.anInt1154), method687(var30, var1.anInt1159));
                            }
                        }

                        if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                            Node_Sub21_Sub26_Sub1.aBoolean1083 = var22 < 0 || var24 < 0 || var28 < 0 || var22 > Node_Sub21_Sub26_Sub1.anInt919 || var24 > Node_Sub21_Sub26_Sub1.anInt919 || var28 > Node_Sub21_Sub26_Sub1.anInt919;

                            if (aBoolean1194 && this.method674(anInt1185, anInt1196, var23, var25, var29, var22, var24, var28)) {
                                anInt1201 = var7;
                                anInt1198 = var8;
                            }

                            if (var1.texture == -1) {
                                if (var1.anInt1153 != 12345678) {
                                    Node_Sub21_Sub26_Sub1.method638(var23, var25, var29, var22, var24, var28, var1.anInt1153, var1.anInt1159, var1.anInt1154);
                                }
                            } else if (!aBoolean1232) {
                                Node_Sub21_Sub26_Sub1.method633(var23, var25, var29, var22, var24, var28, var1.anInt1153, var1.anInt1159, var1.anInt1154, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
                            } else {
                                var30 = Node_Sub21_Sub26_Sub1.aTextureProvider1085.method501(var1.texture);
                                Node_Sub21_Sub26_Sub1.method638(var23, var25, var29, var22, var24, var28, method687(var30, var1.anInt1153), method687(var30, var1.anInt1159), method687(var30, var1.anInt1154));
                            }
                        }

                    }
                }
            }
        }
    }

    void method689(TileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var1.anIntArray1059.length;

        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.anIntArray1059[var9] - anInt1220;
            var11 = var1.anIntArray1056[var9] - anInt1240;
            var12 = var1.anIntArray1048[var9] - anInt1236;
            var13 = var12 * var4 + var10 * var5 >> 16;
            var12 = var12 * var5 - var10 * var4 >> 16;
            var10 = var13;
            var13 = var11 * var3 - var12 * var2 >> 16;
            var12 = var11 * var2 + var12 * var3 >> 16;
            if (var12 < 50) {
                return;
            }

            if (var1.anIntArray1046 != null) {
                TileModel.anIntArray1054[var9] = var10;
                TileModel.anIntArray1061[var9] = var13;
                TileModel.anIntArray1055[var9] = var12;
            }

            TileModel.anIntArray1064[var9] = Node_Sub21_Sub26_Sub1.viewportCenterX + var10 * Node_Sub21_Sub26_Sub1.anInt228 / var12;
            TileModel.anIntArray1062[var9] = Node_Sub21_Sub26_Sub1.viewportCenterY + var13 * Node_Sub21_Sub26_Sub1.anInt228 / var12;
        }

        Node_Sub21_Sub26_Sub1.anInt327 = 0;
        var8 = var1.anIntArray1053.length;

        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.anIntArray1053[var9];
            var11 = var1.anIntArray1052[var9];
            var12 = var1.anIntArray1049[var9];
            var13 = TileModel.anIntArray1064[var10];
            int var14 = TileModel.anIntArray1064[var11];
            int var15 = TileModel.anIntArray1064[var12];
            int var16 = TileModel.anIntArray1062[var10];
            int var17 = TileModel.anIntArray1062[var11];
            int var18 = TileModel.anIntArray1062[var12];
            if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
                Node_Sub21_Sub26_Sub1.aBoolean1083 = var13 < 0 || var14 < 0 || var15 < 0 || var13 > Node_Sub21_Sub26_Sub1.anInt919 || var14 > Node_Sub21_Sub26_Sub1.anInt919 || var15 > Node_Sub21_Sub26_Sub1.anInt919;

                if (aBoolean1194 && this.method674(anInt1185, anInt1196, var16, var17, var18, var13, var14, var15)) {
                    anInt1201 = var6;
                    anInt1198 = var7;
                }

                if (var1.anIntArray1046 != null && var1.anIntArray1046[var9] != -1) {
                    if (!aBoolean1232) {
                        if (var1.flatShade) {
                            Node_Sub21_Sub26_Sub1.method633(var16, var17, var18, var13, var14, var15, var1.anIntArray1063[var9], var1.anIntArray1065[var9], var1.anIntArray1066[var9], TileModel.anIntArray1054[0], TileModel.anIntArray1054[1], TileModel.anIntArray1054[3], TileModel.anIntArray1061[0], TileModel.anIntArray1061[1], TileModel.anIntArray1061[3], TileModel.anIntArray1055[0], TileModel.anIntArray1055[1], TileModel.anIntArray1055[3], var1.anIntArray1046[var9]);
                        } else {
                            Node_Sub21_Sub26_Sub1.method633(var16, var17, var18, var13, var14, var15, var1.anIntArray1063[var9], var1.anIntArray1065[var9], var1.anIntArray1066[var9], TileModel.anIntArray1054[var10], TileModel.anIntArray1054[var11], TileModel.anIntArray1054[var12], TileModel.anIntArray1061[var10], TileModel.anIntArray1061[var11], TileModel.anIntArray1061[var12], TileModel.anIntArray1055[var10], TileModel.anIntArray1055[var11], TileModel.anIntArray1055[var12], var1.anIntArray1046[var9]);
                        }
                    } else {
                        int var19 = Node_Sub21_Sub26_Sub1.aTextureProvider1085.method501(var1.anIntArray1046[var9]);
                        Node_Sub21_Sub26_Sub1.method638(var16, var17, var18, var13, var14, var15, method687(var19, var1.anIntArray1063[var9]), method687(var19, var1.anIntArray1065[var9]), method687(var19, var1.anIntArray1066[var9]));
                    }
                } else if (var1.anIntArray1063[var9] != 12345678) {
                    Node_Sub21_Sub26_Sub1.method638(var16, var17, var18, var13, var14, var15, var1.anIntArray1063[var9], var1.anIntArray1065[var9], var1.anIntArray1066[var9]);
                }
            }
        }

    }

    void method670() {
        int var1 = anIntArray1190[anInt1237];
        Class99[] var2 = aClass99ArrayArray1200[anInt1237];
        anInt1202 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            Class99 var4 = var2[var3];
            int var5;
            int var6;
            int var7;
            int var9;
            boolean var13;
            if (var4.anInt1103 == 1) {
                var5 = var4.anInt1098 - anInt1222 + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.anInt1089 - anInt1239 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.anInt1101 - anInt1239 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var13 = false;

                    while (var6 <= var7) {
                        if (aBooleanArrayArray1219[var5][var6++]) {
                            var13 = true;
                            break;
                        }
                    }

                    if (var13) {
                        var9 = anInt1220 - var4.anInt1104;
                        if (var9 > 32) {
                            var4.anInt1099 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.anInt1099 = 2;
                            var9 = -var9;
                        }

                        var4.anInt1091 = (var4.anInt1092 - anInt1236 << 8) / var9;
                        var4.anInt1102 = (var4.anInt1090 - anInt1236 << 8) / var9;
                        var4.anInt1100 = (var4.anInt1088 - anInt1240 << 8) / var9;
                        var4.anInt1094 = (var4.anInt1097 - anInt1240 << 8) / var9;
                        aClass99Array1197[anInt1202++] = var4;
                    }
                }
            } else if (var4.anInt1103 == 2) {
                var5 = var4.anInt1089 - anInt1239 + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.anInt1098 - anInt1222 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.anInt1095 - anInt1222 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var13 = false;

                    while (var6 <= var7) {
                        if (aBooleanArrayArray1219[var6++][var5]) {
                            var13 = true;
                            break;
                        }
                    }

                    if (var13) {
                        var9 = anInt1236 - var4.anInt1092;
                        if (var9 > 32) {
                            var4.anInt1099 = 3;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.anInt1099 = 4;
                            var9 = -var9;
                        }

                        var4.anInt1096 = (var4.anInt1104 - anInt1220 << 8) / var9;
                        var4.anInt1086 = (var4.anInt1093 - anInt1220 << 8) / var9;
                        var4.anInt1100 = (var4.anInt1088 - anInt1240 << 8) / var9;
                        var4.anInt1094 = (var4.anInt1097 - anInt1240 << 8) / var9;
                        aClass99Array1197[anInt1202++] = var4;
                    }
                }
            } else if (var4.anInt1103 == 4) {
                var5 = var4.anInt1088 - anInt1240;
                if (var5 > 128) {
                    var6 = var4.anInt1089 - anInt1239 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.anInt1101 - anInt1239 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    if (var6 <= var7) {
                        int var8 = var4.anInt1098 - anInt1222 + 25;
                        if (var8 < 0) {
                            var8 = 0;
                        }

                        var9 = var4.anInt1095 - anInt1222 + 25;
                        if (var9 > 50) {
                            var9 = 50;
                        }

                        boolean var10 = false;

                        label144:
                        for (int var11 = var8; var11 <= var9; ++var11) {
                            for (int var12 = var6; var12 <= var7; ++var12) {
                                if (aBooleanArrayArray1219[var11][var12]) {
                                    var10 = true;
                                    break label144;
                                }
                            }
                        }

                        if (var10) {
                            var4.anInt1099 = 5;
                            var4.anInt1096 = (var4.anInt1104 - anInt1220 << 8) / var5;
                            var4.anInt1086 = (var4.anInt1093 - anInt1220 << 8) / var5;
                            var4.anInt1091 = (var4.anInt1092 - anInt1236 << 8) / var5;
                            var4.anInt1102 = (var4.anInt1090 - anInt1236 << 8) / var5;
                            aClass99Array1197[anInt1202++] = var4;
                        }
                    }
                }
            }
        }

    }

    boolean method686(int var1, int var2, int var3) {
        int var4 = this.anIntArrayArrayArray1221[var1][var2][var3];
        if (var4 == -anInt1234) {
            return false;
        }
        if (var4 == anInt1234) {
            return true;
        }
        int var5 = var2 << 7;
        int var6 = var3 << 7;
        if (this.method696(var5 + 1, this.anIntArrayArrayArray1238[var1][var2][var3], var6 + 1) && this.method696(var5 + 128 - 1, this.anIntArrayArrayArray1238[var1][var2 + 1][var3], var6 + 1) && this.method696(var5 + 128 - 1, this.anIntArrayArrayArray1238[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method696(var5 + 1, this.anIntArrayArrayArray1238[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.anIntArrayArrayArray1221[var1][var2][var3] = anInt1234;
            return true;
        }
        this.anIntArrayArrayArray1221[var1][var2][var3] = -anInt1234;
        return false;
    }

    boolean method694(int var1, int var2, int var3, int var4) {
        if (!this.method686(var1, var2, var3)) {
            return false;
        }
        int var5 = var2 << 7;
        int var6 = var3 << 7;
        int var7 = this.anIntArrayArrayArray1238[var1][var2][var3] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (var4 < 16) {
            if (var4 == 1) {
                if (var5 > anInt1220) {
                    if (!this.method696(var5, var7, var6)) {
                        return false;
                    }

                    if (!this.method696(var5, var7, var6 + 128)) {
                        return false;
                    }
                }

                if (var1 > 0) {
                    if (!this.method696(var5, var8, var6)) {
                        return false;
                    }

                    if (!this.method696(var5, var8, var6 + 128)) {
                        return false;
                    }
                }

                if (!this.method696(var5, var9, var6)) {
                    return false;
                }

                return this.method696(var5, var9, var6 + 128);
            }

            if (var4 == 2) {
                if (var6 < anInt1236) {
                    if (!this.method696(var5, var7, var6 + 128)) {
                        return false;
                    }

                    if (!this.method696(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }

                if (var1 > 0) {
                    if (!this.method696(var5, var8, var6 + 128)) {
                        return false;
                    }

                    if (!this.method696(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }

                if (!this.method696(var5, var9, var6 + 128)) {
                    return false;
                }

                return this.method696(var5 + 128, var9, var6 + 128);
            }

            if (var4 == 4) {
                if (var5 < anInt1220) {
                    if (!this.method696(var5 + 128, var7, var6)) {
                        return false;
                    }

                    if (!this.method696(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }

                if (var1 > 0) {
                    if (!this.method696(var5 + 128, var8, var6)) {
                        return false;
                    }

                    if (!this.method696(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }

                if (!this.method696(var5 + 128, var9, var6)) {
                    return false;
                }

                return this.method696(var5 + 128, var9, var6 + 128);
            }

            if (var4 == 8) {
                if (var6 > anInt1236) {
                    if (!this.method696(var5, var7, var6)) {
                        return false;
                    }

                    if (!this.method696(var5 + 128, var7, var6)) {
                        return false;
                    }
                }

                if (var1 > 0) {
                    if (!this.method696(var5, var8, var6)) {
                        return false;
                    }

                    if (!this.method696(var5 + 128, var8, var6)) {
                        return false;
                    }
                }

                if (!this.method696(var5, var9, var6)) {
                    return false;
                }

                return this.method696(var5 + 128, var9, var6);
            }
        }

        if (!this.method696(var5 + 64, var10, var6 + 64)) {
            return false;
        }
        if (var4 == 16) {
            return this.method696(var5, var9, var6 + 128);
        }
        if (var4 == 32) {
            return this.method696(var5 + 128, var9, var6 + 128);
        }
        if (var4 == 64) {
            return this.method696(var5 + 128, var9, var6);
        }
        if (var4 == 128) {
            return this.method696(var5, var9, var6);
        }
        return true;
    }

    boolean method693(int var1, int var2, int var3, int var4) {
        if (!this.method686(var1, var2, var3)) {
            return false;
        }
        int var5 = var2 << 7;
        int var6 = var3 << 7;
        return this.method696(var5 + 1, this.anIntArrayArrayArray1238[var1][var2][var3] - var4, var6 + 1) && this.method696(var5 + 128 - 1, this.anIntArrayArrayArray1238[var1][var2 + 1][var3] - var4, var6 + 1) && this.method696(var5 + 128 - 1, this.anIntArrayArrayArray1238[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method696(var5 + 1, this.anIntArrayArrayArray1238[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
    }

    boolean method696(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < anInt1202; ++var4) {
            Class99 var5 = aClass99Array1197[var4];
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            if (var5.anInt1099 == 1) {
                var6 = var5.anInt1104 - var1;
                if (var6 > 0) {
                    var7 = var5.anInt1092 + (var5.anInt1091 * var6 >> 8);
                    var8 = var5.anInt1090 + (var5.anInt1102 * var6 >> 8);
                    var9 = var5.anInt1088 + (var5.anInt1100 * var6 >> 8);
                    var10 = var5.anInt1097 + (var5.anInt1094 * var6 >> 8);
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.anInt1099 == 2) {
                var6 = var1 - var5.anInt1104;
                if (var6 > 0) {
                    var7 = var5.anInt1092 + (var5.anInt1091 * var6 >> 8);
                    var8 = var5.anInt1090 + (var5.anInt1102 * var6 >> 8);
                    var9 = var5.anInt1088 + (var5.anInt1100 * var6 >> 8);
                    var10 = var5.anInt1097 + (var5.anInt1094 * var6 >> 8);
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.anInt1099 == 3) {
                var6 = var5.anInt1092 - var3;
                if (var6 > 0) {
                    var7 = var5.anInt1104 + (var5.anInt1096 * var6 >> 8);
                    var8 = var5.anInt1093 + (var5.anInt1086 * var6 >> 8);
                    var9 = var5.anInt1088 + (var5.anInt1100 * var6 >> 8);
                    var10 = var5.anInt1097 + (var5.anInt1094 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.anInt1099 == 4) {
                var6 = var3 - var5.anInt1092;
                if (var6 > 0) {
                    var7 = var5.anInt1104 + (var5.anInt1096 * var6 >> 8);
                    var8 = var5.anInt1093 + (var5.anInt1086 * var6 >> 8);
                    var9 = var5.anInt1088 + (var5.anInt1100 * var6 >> 8);
                    var10 = var5.anInt1097 + (var5.anInt1094 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.anInt1099 == 5) {
                var6 = var2 - var5.anInt1088;
                if (var6 > 0) {
                    var7 = var5.anInt1104 + (var5.anInt1096 * var6 >> 8);
                    var8 = var5.anInt1093 + (var5.anInt1086 * var6 >> 8);
                    var9 = var5.anInt1092 + (var5.anInt1091 * var6 >> 8);
                    var10 = var5.anInt1090 + (var5.anInt1102 * var6 >> 8);
                    if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void method707(int var1) {
        this.anInt1228 = var1;

        for (int var2 = 0; var2 < this.anInt1223; ++var2) {
            for (int var3 = 0; var3 < this.anInt1235; ++var3) {
                if (this.tiles[var1][var2][var3] == null) {
                    this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
                }
            }
        }

    }

    public void method704(int var1, int var2, int var3, int var4, Entity var5, int var6, int var7) {
        if (var5 != null) {
            TileDecor var8 = new TileDecor();
            var8.entity = var5;
            var8.sceneX = var2 * 128 + 64;
            var8.sceneY = var3 * 128 + 64;
            var8.level = var4;
            var8.uid = var6;
            var8.config = var7;
            if (this.tiles[var1][var2][var3] == null) {
                this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }

            this.tiles[var1][var2][var3].decor = var8;
        }
    }

    public void method699(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        if (var4 != null) {
            var4.decor = null;
        }
    }

    public int method678(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        return var4 != null && var4.decor != null ? var4.decor.uid : 0;
    }

    void method681(ModelHeader var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var7 = true;
        int var8 = var3;
        int var9 = var3 + var5;
        int var10 = var4 - 1;
        int var11 = var4 + var6;

        for (int var12 = var2; var12 <= var2 + 1; ++var12) {
            if (var12 != this.anInt1231) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < this.anInt1223) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < this.anInt1235 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                                Tile var15 = this.tiles[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (this.anIntArrayArrayArray1238[var12][var13][var14] + this.anIntArrayArrayArray1238[var12][var13 + 1][var14] + this.anIntArrayArrayArray1238[var12][var13][var14 + 1] + this.anIntArrayArrayArray1238[var12][var13 + 1][var14 + 1]) / 4 - (this.anIntArrayArrayArray1238[var2][var3][var4] + this.anIntArrayArrayArray1238[var2][var3 + 1][var4] + this.anIntArrayArrayArray1238[var2][var3][var4 + 1] + this.anIntArrayArrayArray1238[var2][var3 + 1][var4 + 1]) / 4;
                                    Boundary var17 = var15.boundary;
                                    if (var17 != null) {
                                        ModelHeader var18;
                                        if (var17.entity instanceof ModelHeader) {
                                            var18 = (ModelHeader) var17.entity;
                                            ModelHeader.method577(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                                        }

                                        if (var17.anEntity1147 instanceof ModelHeader) {
                                            var18 = (ModelHeader) var17.anEntity1147;
                                            ModelHeader.method577(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                                        }
                                    }

                                    for (int var19 = 0; var19 < var15.anInt226; ++var19) {
                                        EntityMarker var20 = var15.markers[var19];
                                        if (var20 != null && var20.entity instanceof ModelHeader) {
                                            ModelHeader var21 = (ModelHeader) var20.entity;
                                            int var22 = var20.anInt1125 - var20.sceneX + 1;
                                            int var23 = var20.anInt1122 - var20.sceneY + 1;
                                            ModelHeader.method577(var1, var21, (var20.sceneX - var3) * 128 + (var22 - var5) * 64, var16, (var20.sceneY - var4) * 128 + (var23 - var6) * 64, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                --var8;
                var7 = false;
            }
        }

    }

    void method684(ModelHeader var1, int var2, int var3, int var4) {
        Tile var5;
        ModelHeader var6;
        if (var3 < this.anInt1223) {
            var5 = this.tiles[var2][var3 + 1][var4];
            if (var5 != null && var5.decor != null && var5.decor.entity instanceof ModelHeader) {
                var6 = (ModelHeader) var5.decor.entity;
                ModelHeader.method577(var1, var6, 128, 0, 0, true);
            }
        }

        if (var4 < this.anInt1223) {
            var5 = this.tiles[var2][var3][var4 + 1];
            if (var5 != null && var5.decor != null && var5.decor.entity instanceof ModelHeader) {
                var6 = (ModelHeader) var5.decor.entity;
                ModelHeader.method577(var1, var6, 0, 0, 128, true);
            }
        }

        if (var3 < this.anInt1223 && var4 < this.anInt1235) {
            var5 = this.tiles[var2][var3 + 1][var4 + 1];
            if (var5 != null && var5.decor != null && var5.decor.entity instanceof ModelHeader) {
                var6 = (ModelHeader) var5.decor.entity;
                ModelHeader.method577(var1, var6, 128, 0, 128, true);
            }
        }

        if (var3 < this.anInt1223 && var4 > 0) {
            var5 = this.tiles[var2][var3 + 1][var4 - 1];
            if (var5 != null && var5.decor != null && var5.decor.entity instanceof ModelHeader) {
                var6 = (ModelHeader) var5.decor.entity;
                ModelHeader.method577(var1, var6, 128, 0, -128, true);
            }
        }

    }

    void method692(Tile var1, boolean var2) {
        aNodeDeque1208.method997(var1);

        while (true) {
            Tile var3;
            int var4;
            int var5;
            int var6;
            int var7;
            Tile[][] var8;
            Tile var9;
            int var11;
            int var15;
            int var16;
            int var18;
            int var19;
            int var20;
            do {
                do {
                    do {
                        do {
                            do {
                                do {
                                    while (true) {
                                        Boundary var10;
                                        EntityMarker var12;
                                        boolean var13;
                                        int var14;
                                        int var22;
                                        int var23;
                                        Tile var34;
                                        while (true) {
                                            do {
                                                var3 = aNodeDeque1208.method994();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.aBoolean1173);

                                            var4 = var3.sceneX;
                                            var5 = var3.sceneY;
                                            var6 = var3.level;
                                            var7 = var3.anInt232;
                                            var8 = this.tiles[var6];
                                            if (!var3.aBoolean1174) {
                                                break;
                                            }

                                            if (var2) {
                                                if (var6 > 0) {
                                                    var9 = this.tiles[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.aBoolean1173) {
                                                        continue;
                                                    }
                                                }

                                                if (var4 <= anInt1222 && var4 > anInt1229) {
                                                    var9 = var8[var4 - 1][var5];
                                                    if (var9 != null && var9.aBoolean1173 && (var9.aBoolean1174 || (var3.anInt212 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var4 >= anInt1222 && var4 < anInt1233 - 1) {
                                                    var9 = var8[var4 + 1][var5];
                                                    if (var9 != null && var9.aBoolean1173 && (var9.aBoolean1174 || (var3.anInt212 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var5 <= anInt1239 && var5 > anInt1230) {
                                                    var9 = var8[var4][var5 - 1];
                                                    if (var9 != null && var9.aBoolean1173 && (var9.aBoolean1174 || (var3.anInt212 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var5 >= anInt1239 && var5 < anInt1226 - 1) {
                                                    var9 = var8[var4][var5 + 1];
                                                    if (var9 != null && var9.aBoolean1173 && (var9.aBoolean1174 || (var3.anInt212 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                var2 = true;
                                            }

                                            var3.aBoolean1174 = false;
                                            if (var3.aTile1176 != null) {
                                                var9 = var3.aTile1176;
                                                if (var9.paint != null) {
                                                    if (!this.method686(0, var4, var5)) {
                                                        this.method675(var9.paint, 0, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                                    }
                                                } else if (var9.model != null && !this.method686(0, var4, var5)) {
                                                    this.method689(var9.model, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                                }

                                                var10 = var9.boundary;
                                                if (var10 != null) {
                                                    var10.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var10.sceneX - anInt1220, var10.level - anInt1240, var10.sceneY - anInt1236, var10.uid);
                                                }

                                                for (var11 = 0; var11 < var9.anInt226; ++var11) {
                                                    var12 = var9.markers[var11];
                                                    if (var12 != null) {
                                                        var12.entity.render(var12.anInt1127, pitchSin, pitchCos, yawSin, yawCos, var12.endSceneX - anInt1220, var12.height - anInt1240, var12.endSceneY - anInt1236, var12.uid);
                                                    }
                                                }
                                            }

                                            var13 = false;
                                            if (var3.paint != null) {
                                                if (!this.method686(var7, var4, var5)) {
                                                    var13 = true;
                                                    if (var3.paint.anInt1155 != 12345678 || aBoolean1194 && var6 <= anInt1195) {
                                                        this.method675(var3.paint, var7, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                                    }
                                                }
                                            } else if (var3.model != null && !this.method686(var7, var4, var5)) {
                                                var13 = true;
                                                this.method689(var3.model, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                            }

                                            var14 = 0;
                                            var11 = 0;
                                            Boundary var31 = var3.boundary;
                                            BoundaryDecor var24 = var3.boundaryDecor;
                                            if (var31 != null || var24 != null) {
                                                if (anInt1222 == var4) {
                                                    ++var14;
                                                } else if (anInt1222 < var4) {
                                                    var14 += 2;
                                                }

                                                if (anInt1239 == var5) {
                                                    var14 += 3;
                                                } else if (anInt1239 > var5) {
                                                    var14 += 6;
                                                }

                                                var11 = anIntArray1192[var14];
                                                var3.anInt668 = anIntArray1204[var14];
                                            }

                                            if (var31 != null) {
                                                if ((var31.anInt1141 & anIntArray1206[var14]) != 0) {
                                                    if (var31.anInt1141 == 16) {
                                                        var3.anInt229 = 3;
                                                        var3.anInt981 = anIntArray1191[var14];
                                                        var3.anInt219 = 3 - var3.anInt981;
                                                    } else if (var31.anInt1141 == 32) {
                                                        var3.anInt229 = 6;
                                                        var3.anInt981 = anIntArray1187[var14];
                                                        var3.anInt219 = 6 - var3.anInt981;
                                                    } else if (var31.anInt1141 == 64) {
                                                        var3.anInt229 = 12;
                                                        var3.anInt981 = anIntArray1203[var14];
                                                        var3.anInt219 = 12 - var3.anInt981;
                                                    } else {
                                                        var3.anInt229 = 9;
                                                        var3.anInt981 = anIntArray1212[var14];
                                                        var3.anInt219 = 9 - var3.anInt981;
                                                    }
                                                } else {
                                                    var3.anInt229 = 0;
                                                }

                                                if ((var31.anInt1141 & var11) != 0 && !this.method694(var7, var4, var5, var31.anInt1141)) {
                                                    var31.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var31.sceneX - anInt1220, var31.level - anInt1240, var31.sceneY - anInt1236, var31.uid);
                                                }

                                                if ((var31.anInt1144 & var11) != 0 && !this.method694(var7, var4, var5, var31.anInt1144)) {
                                                    var31.anEntity1147.render(0, pitchSin, pitchCos, yawSin, yawCos, var31.sceneX - anInt1220, var31.level - anInt1240, var31.sceneY - anInt1236, var31.uid);
                                                }
                                            }

                                            if (var24 != null && !this.method693(var7, var4, var5, var24.entity.height)) {
                                                if ((var24.anInt1108 & var11) != 0) {
                                                    var24.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var24.sceneX - anInt1220 + var24.anInt1113, var24.level - anInt1240, var24.sceneY - anInt1236 + var24.anInt1114, var24.uid);
                                                } else if (var24.anInt1108 == 256) {
                                                    var16 = var24.sceneX - anInt1220;
                                                    var18 = var24.level - anInt1240;
                                                    var19 = var24.sceneY - anInt1236;
                                                    var22 = var24.anInt1111;
                                                    if (var22 != 1 && var22 != 2) {
                                                        var23 = var16;
                                                    } else {
                                                        var23 = -var16;
                                                    }

                                                    int var27;
                                                    if (var22 != 2 && var22 != 3) {
                                                        var27 = var19;
                                                    } else {
                                                        var27 = -var19;
                                                    }

                                                    if (var27 < var23) {
                                                        var24.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var16 + var24.anInt1113, var18, var19 + var24.anInt1114, var24.uid);
                                                    } else if (var24.anEntity1110 != null) {
                                                        var24.anEntity1110.render(0, pitchSin, pitchCos, yawSin, yawCos, var16, var18, var19, var24.uid);
                                                    }
                                                }
                                            }

                                            if (var13) {
                                                TileDecor var21 = var3.decor;
                                                if (var21 != null) {
                                                    var21.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var21.sceneX - anInt1220, var21.level - anInt1240, var21.sceneY - anInt1236, var21.uid);
                                                }

                                                Class90 var17 = var3.aClass90_1167;
                                                if (var17 != null && var17.anInt962 == 0) {
                                                    if (var17.anEntity965 != null) {
                                                        var17.anEntity965.render(0, pitchSin, pitchCos, yawSin, yawCos, var17.anInt960 - anInt1220, var17.anInt958 - anInt1240, var17.anInt959 - anInt1236, var17.anInt964);
                                                    }

                                                    if (var17.anEntity963 != null) {
                                                        var17.anEntity963.render(0, pitchSin, pitchCos, yawSin, yawCos, var17.anInt960 - anInt1220, var17.anInt958 - anInt1240, var17.anInt959 - anInt1236, var17.anInt964);
                                                    }

                                                    if (var17.anEntity961 != null) {
                                                        var17.anEntity961.render(0, pitchSin, pitchCos, yawSin, yawCos, var17.anInt960 - anInt1220, var17.anInt958 - anInt1240, var17.anInt959 - anInt1236, var17.anInt964);
                                                    }
                                                }
                                            }

                                            var16 = var3.anInt212;
                                            if (var16 != 0) {
                                                if (var4 < anInt1222 && (var16 & 4) != 0) {
                                                    var34 = var8[var4 + 1][var5];
                                                    if (var34 != null && var34.aBoolean1173) {
                                                        aNodeDeque1208.method997(var34);
                                                    }
                                                }

                                                if (var5 < anInt1239 && (var16 & 2) != 0) {
                                                    var34 = var8[var4][var5 + 1];
                                                    if (var34 != null && var34.aBoolean1173) {
                                                        aNodeDeque1208.method997(var34);
                                                    }
                                                }

                                                if (var4 > anInt1222 && (var16 & 1) != 0) {
                                                    var34 = var8[var4 - 1][var5];
                                                    if (var34 != null && var34.aBoolean1173) {
                                                        aNodeDeque1208.method997(var34);
                                                    }
                                                }

                                                if (var5 > anInt1239 && (var16 & 8) != 0) {
                                                    var34 = var8[var4][var5 - 1];
                                                    if (var34 != null && var34.aBoolean1173) {
                                                        aNodeDeque1208.method997(var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }

                                        if (var3.anInt229 != 0) {
                                            var13 = true;

                                            for (var14 = 0; var14 < var3.anInt226; ++var14) {
                                                if (var3.markers[var14].anInt1131 != anInt1234 && (var3.anIntArray1171[var14] & var3.anInt229) == var3.anInt981) {
                                                    var13 = false;
                                                    break;
                                                }
                                            }

                                            if (var13) {
                                                var10 = var3.boundary;
                                                if (!this.method694(var7, var4, var5, var10.anInt1141)) {
                                                    var10.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var10.sceneX - anInt1220, var10.level - anInt1240, var10.sceneY - anInt1236, var10.uid);
                                                }

                                                var3.anInt229 = 0;
                                            }
                                        }

                                        if (!var3.aBoolean980) {
                                            break;
                                        }

                                        try {
                                            int var33 = var3.anInt226;
                                            var3.aBoolean980 = false;
                                            var14 = 0;

                                            label583:
                                            for (var11 = 0; var11 < var33; ++var11) {
                                                var12 = var3.markers[var11];
                                                if (var12.anInt1131 != anInt1234) {
                                                    for (var15 = var12.sceneX; var15 <= var12.anInt1125; ++var15) {
                                                        for (var16 = var12.sceneY; var16 <= var12.anInt1122; ++var16) {
                                                            var34 = var8[var15][var16];
                                                            if (var34.aBoolean1174) {
                                                                var3.aBoolean980 = true;
                                                                continue label583;
                                                            }

                                                            if (var34.anInt229 != 0) {
                                                                var19 = 0;
                                                                if (var15 > var12.sceneX) {
                                                                    ++var19;
                                                                }

                                                                if (var15 < var12.anInt1125) {
                                                                    var19 += 4;
                                                                }

                                                                if (var16 > var12.sceneY) {
                                                                    var19 += 8;
                                                                }

                                                                if (var16 < var12.anInt1122) {
                                                                    var19 += 2;
                                                                }

                                                                if ((var19 & var34.anInt229) == var3.anInt219) {
                                                                    var3.aBoolean980 = true;
                                                                    continue label583;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    anEntityMarkerArray1199[var14++] = var12;
                                                    var15 = anInt1222 - var12.sceneX;
                                                    var16 = var12.anInt1125 - anInt1222;
                                                    if (var16 > var15) {
                                                        var15 = var16;
                                                    }

                                                    var18 = anInt1239 - var12.sceneY;
                                                    var19 = var12.anInt1122 - anInt1239;
                                                    if (var19 > var18) {
                                                        var12.anInt1129 = var15 + var19;
                                                    } else {
                                                        var12.anInt1129 = var15 + var18;
                                                    }
                                                }
                                            }

                                            while (var14 > 0) {
                                                var11 = -50;
                                                var20 = -1;

                                                for (var15 = 0; var15 < var14; ++var15) {
                                                    EntityMarker var35 = anEntityMarkerArray1199[var15];
                                                    if (var35.anInt1131 != anInt1234) {
                                                        if (var35.anInt1129 > var11) {
                                                            var11 = var35.anInt1129;
                                                            var20 = var15;
                                                        } else if (var35.anInt1129 == var11) {
                                                            var18 = var35.endSceneX - anInt1220;
                                                            var19 = var35.endSceneY - anInt1236;
                                                            var22 = anEntityMarkerArray1199[var20].endSceneX - anInt1220;
                                                            var23 = anEntityMarkerArray1199[var20].endSceneY - anInt1236;
                                                            if (var18 * var18 + var19 * var19 > var22 * var22 + var23 * var23) {
                                                                var20 = var15;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (var20 == -1) {
                                                    break;
                                                }

                                                EntityMarker var36 = anEntityMarkerArray1199[var20];
                                                var36.anInt1131 = anInt1234;
                                                if (!this.method695(var7, var36.sceneX, var36.anInt1125, var36.sceneY, var36.anInt1122, var36.entity.height)) {
                                                    var36.entity.render(var36.anInt1127, pitchSin, pitchCos, yawSin, yawCos, var36.endSceneX - anInt1220, var36.height - anInt1240, var36.endSceneY - anInt1236, var36.uid);
                                                }

                                                for (var16 = var36.sceneX; var16 <= var36.anInt1125; ++var16) {
                                                    for (var18 = var36.sceneY; var18 <= var36.anInt1122; ++var18) {
                                                        Tile var25 = var8[var16][var18];
                                                        if (var25.anInt229 != 0) {
                                                            aNodeDeque1208.method997(var25);
                                                        } else if ((var16 != var4 || var18 != var5) && var25.aBoolean1173) {
                                                            aNodeDeque1208.method997(var25);
                                                        }
                                                    }
                                                }
                                            }

                                            if (!var3.aBoolean980) {
                                                break;
                                            }
                                        } catch (Exception var28) {
                                            var3.aBoolean980 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.aBoolean1173);
                            } while (var3.anInt229 != 0);

                            if (var4 > anInt1222 || var4 <= anInt1229) {
                                break;
                            }

                            var9 = var8[var4 - 1][var5];
                        } while (var9 != null && var9.aBoolean1173);

                        if (var4 < anInt1222 || var4 >= anInt1233 - 1) {
                            break;
                        }

                        var9 = var8[var4 + 1][var5];
                    } while (var9 != null && var9.aBoolean1173);

                    if (var5 > anInt1239 || var5 <= anInt1230) {
                        break;
                    }

                    var9 = var8[var4][var5 - 1];
                } while (var9 != null && var9.aBoolean1173);

                if (var5 < anInt1239 || var5 >= anInt1226 - 1) {
                    break;
                }

                var9 = var8[var4][var5 + 1];
            } while (var9 != null && var9.aBoolean1173);

            var3.aBoolean1173 = false;
            --anInt1225;
            Class90 var32 = var3.aClass90_1167;
            if (var32 != null && var32.anInt962 != 0) {
                if (var32.anEntity965 != null) {
                    var32.anEntity965.render(0, pitchSin, pitchCos, yawSin, yawCos, var32.anInt960 - anInt1220, var32.anInt958 - anInt1240 - var32.anInt962, var32.anInt959 - anInt1236, var32.anInt964);
                }

                if (var32.anEntity963 != null) {
                    var32.anEntity963.render(0, pitchSin, pitchCos, yawSin, yawCos, var32.anInt960 - anInt1220, var32.anInt958 - anInt1240 - var32.anInt962, var32.anInt959 - anInt1236, var32.anInt964);
                }

                if (var32.anEntity961 != null) {
                    var32.anEntity961.render(0, pitchSin, pitchCos, yawSin, yawCos, var32.anInt960 - anInt1220, var32.anInt958 - anInt1240 - var32.anInt962, var32.anInt959 - anInt1236, var32.anInt964);
                }
            }

            if (var3.anInt668 != 0) {
                BoundaryDecor var29 = var3.boundaryDecor;
                if (var29 != null && !this.method693(var7, var4, var5, var29.entity.height)) {
                    if ((var29.anInt1108 & var3.anInt668) != 0) {
                        var29.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var29.sceneX - anInt1220 + var29.anInt1113, var29.level - anInt1240, var29.sceneY - anInt1236 + var29.anInt1114, var29.uid);
                    } else if (var29.anInt1108 == 256) {
                        var11 = var29.sceneX - anInt1220;
                        var20 = var29.level - anInt1240;
                        var15 = var29.sceneY - anInt1236;
                        var16 = var29.anInt1111;
                        if (var16 != 1 && var16 != 2) {
                            var18 = var11;
                        } else {
                            var18 = -var11;
                        }

                        if (var16 != 2 && var16 != 3) {
                            var19 = var15;
                        } else {
                            var19 = -var15;
                        }

                        if (var19 >= var18) {
                            var29.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var11 + var29.anInt1113, var20, var15 + var29.anInt1114, var29.uid);
                        } else if (var29.anEntity1110 != null) {
                            var29.anEntity1110.render(0, pitchSin, pitchCos, yawSin, yawCos, var11, var20, var15, var29.uid);
                        }
                    }
                }

                Boundary var26 = var3.boundary;
                if (var26 != null) {
                    if ((var26.anInt1144 & var3.anInt668) != 0 && !this.method694(var7, var4, var5, var26.anInt1144)) {
                        var26.anEntity1147.render(0, pitchSin, pitchCos, yawSin, yawCos, var26.sceneX - anInt1220, var26.level - anInt1240, var26.sceneY - anInt1236, var26.uid);
                    }

                    if ((var26.anInt1141 & var3.anInt668) != 0 && !this.method694(var7, var4, var5, var26.anInt1141)) {
                        var26.entity.render(0, pitchSin, pitchCos, yawSin, yawCos, var26.sceneX - anInt1220, var26.level - anInt1240, var26.sceneY - anInt1236, var26.uid);
                    }
                }
            }

            Tile var30;
            if (var6 < this.anInt1231 - 1) {
                var30 = this.tiles[var6 + 1][var4][var5];
                if (var30 != null && var30.aBoolean1173) {
                    aNodeDeque1208.method997(var30);
                }
            }

            if (var4 < anInt1222) {
                var30 = var8[var4 + 1][var5];
                if (var30 != null && var30.aBoolean1173) {
                    aNodeDeque1208.method997(var30);
                }
            }

            if (var5 < anInt1239) {
                var30 = var8[var4][var5 + 1];
                if (var30 != null && var30.aBoolean1173) {
                    aNodeDeque1208.method997(var30);
                }
            }

            if (var4 > anInt1222) {
                var30 = var8[var4 - 1][var5];
                if (var30 != null && var30.aBoolean1173) {
                    aNodeDeque1208.method997(var30);
                }
            }

            if (var5 > anInt1239) {
                var30 = var8[var4][var5 - 1];
                if (var30 != null && var30.aBoolean1173) {
                    aNodeDeque1208.method997(var30);
                }
            }
        }
    }

    public void method713() {
        for (int var1 = 0; var1 < this.anInt1227; ++var1) {
            EntityMarker var2 = this.tempMarkers[var1];
            this.method705(var2);
            this.tempMarkers[var1] = null;
        }

        this.anInt1227 = 0;
    }

    public void method711(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        if (var5 != null) {
            BoundaryDecor var13 = new BoundaryDecor();
            var13.uid = var11;
            var13.config = var12;
            var13.sceneX = var2 * 128 + 64;
            var13.sceneY = var3 * 128 + 64;
            var13.level = var4;
            var13.entity = var5;
            var13.anEntity1110 = var6;
            var13.anInt1108 = var7;
            var13.anInt1111 = var8;
            var13.anInt1113 = var9;
            var13.anInt1114 = var10;

            for (int var14 = var1; var14 >= 0; --var14) {
                if (this.tiles[var14][var2][var3] == null) {
                    this.tiles[var14][var2][var3] = new Tile(var14, var2, var3);
                }
            }

            this.tiles[var1][var2][var3].boundaryDecor = var13;
        }
    }

    boolean method695(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7;
        int var8;
        if (var2 == var3 && var4 == var5) {
            if (!this.method686(var1, var2, var4)) {
                return false;
            }
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method696(var7 + 1, this.anIntArrayArrayArray1238[var1][var2][var4] - var6, var8 + 1) && this.method696(var7 + 128 - 1, this.anIntArrayArrayArray1238[var1][var2 + 1][var4] - var6, var8 + 1) && this.method696(var7 + 128 - 1, this.anIntArrayArrayArray1238[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method696(var7 + 1, this.anIntArrayArrayArray1238[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
        }
        for (var7 = var2; var7 <= var3; ++var7) {
            for (var8 = var4; var8 <= var5; ++var8) {
                if (this.anIntArrayArrayArray1221[var1][var7][var8] == -anInt1234) {
                    return false;
                }
            }
        }

        var7 = (var2 << 7) + 1;
        var8 = (var4 << 7) + 2;
        int var9 = this.anIntArrayArrayArray1238[var1][var2][var4] - var6;
        if (!this.method696(var7, var9, var8)) {
            return false;
        }
        int var10 = (var3 << 7) - 1;
        if (!this.method696(var10, var9, var8)) {
            return false;
        }
        int var11 = (var5 << 7) - 1;
        if (!this.method696(var7, var9, var11)) {
            return false;
        }
        return this.method696(var10, var9, var11);
    }

    void method705(EntityMarker var1) {
        for (int var2 = var1.sceneX; var2 <= var1.anInt1125; ++var2) {
            for (int var3 = var1.sceneY; var3 <= var1.anInt1122; ++var3) {
                Tile var4 = this.tiles[var1.level][var2][var3];
                if (var4 != null) {
                    int var5;
                    for (var5 = 0; var5 < var4.anInt226; ++var5) {
                        if (var4.markers[var5] == var1) {
                            --var4.anInt226;

                            for (int var6 = var5; var6 < var4.anInt226; ++var6) {
                                var4.markers[var6] = var4.markers[var6 + 1];
                                var4.anIntArray1171[var6] = var4.anIntArray1171[var6 + 1];
                            }

                            var4.markers[var4.anInt226] = null;
                            break;
                        }
                    }

                    var4.anInt212 = 0;

                    for (var5 = 0; var5 < var4.anInt226; ++var5) {
                        var4.anInt212 |= var4.anIntArray1171[var5];
                    }
                }
            }
        }

    }

    public int method668(int var1, int var2, int var3, int var4) {
        Tile var5 = this.tiles[var1][var2][var3];
        if (var5 == null) {
            return -1;
        }
        if (var5.boundary != null && var5.boundary.uid == var4) {
            return var5.boundary.config & 255;
        }
        if (var5.boundaryDecor != null && var5.boundaryDecor.uid == var4) {
            return var5.boundaryDecor.config & 255;
        }
        if (var5.decor != null && var5.decor.uid == var4) {
            return var5.decor.config & 255;
        }
        for (int var6 = 0; var6 < var5.anInt226; ++var6) {
            if (var5.markers[var6].uid == var4) {
                return var5.markers[var6].config & 255;
            }
        }

        return -1;
    }

    public void method706(int var1, int var2, int var3) {
        Tile var4 = this.tiles[var1][var2][var3];
        if (var4 != null) {
            var4.boundary = null;
        }
    }
}
