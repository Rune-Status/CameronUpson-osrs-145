package com.jagex;

public class Class45 {
    static int anInt370;

    static void method304(int var0) {
        if (var0 != Client.connectionState) {
            if (Client.connectionState == 0) {
                Class160.aClient1856.method229();
            }

            if (var0 == 20 || var0 == 40 || var0 == 45) {
                Client.anInt1505 = 0;
                Client.anInt1499 = 0;
                Client.anInt1503 = 0;
            }

            if (var0 != 20 && var0 != 40 && Class154.aSocket1833 != null) {
                Class154.aSocket1833.method882();
                Class154.aSocket1833 = null;
            }

            if (Client.connectionState == 25) {
                Client.anInt1539 = 0;
                Client.anInt1510 = 0;
                Client.anInt1527 = 1;
                Client.anInt1540 = 0;
                Client.anInt1531 = 1;
            }

            if (var0 != 5 && var0 != 10) {
                if (var0 == 20) {
                    Class93.method601(Class82.aCacheReferenceTable848, Class21.aCacheReferenceTable139, true, Client.connectionState == 11 ? 4 : 0);
                } else if (var0 == 11) {
                    Class93.method601(Class82.aCacheReferenceTable848, Class21.aCacheReferenceTable139, false, 4);
                } else if (Login.aBoolean706) {
                    Login.aNode_Sub21_Sub26_Sub2_690 = null;
                    Login.aNode_Sub21_Sub26_Sub2_709 = null;
                    Class17.aNode_Sub21_Sub26_Sub2Array126 = null;
                    Class3.aSprite17 = null;
                    Login.aSprite697 = null;
                    Login.aNode_Sub21_Sub26_Sub2_695 = null;
                    Login.aNode_Sub21_Sub26_Sub2Array692 = null;
                    Class49.aNode_Sub21_Sub26_Sub2_375 = null;
                    AnimationSkin.aNode_Sub21_Sub26_Sub2_1290 = null;
                    Class158.aSpriteArray1847 = null;
                    Login.aNode_Sub21_Sub26_Sub2Array708 = null;
                    Class22.aNode_Sub21_Sub26_Sub2Array147 = null;
                    WorldMapTransportation.aNode_Sub21_Sub26_Sub2Array85 = null;
                    Class108.aNode_Sub21_Sub26_Sub2_1296 = null;
                    Class20.anIntArray138 = null;
                    Class18.anIntArray133 = null;
                    ClanMate.anIntArray240 = null;
                    Class173.anIntArray2135 = null;
                    Class53.anIntArray411 = null;
                    RuneScript.anIntArray666 = null;
                    AxisAlignedBoundingBox.anIntArray669 = null;
                    Class117.anIntArray1344 = null;
                    Class133.anInt1725 = 1;
                    Class133.aReferenceTable1727 = null;
                    Class133.anInt1728 = -1;
                    Class5.anInt38 = -1;
                    Class141.anInt1784 = 0;
                    Class46.aBoolean371 = false;
                    CollisionMap.anInt1323 = 2;
                    Class123.method814(true);
                    Login.aBoolean706 = false;
                }
            } else {
                Class93.method601(Class82.aCacheReferenceTable848, Class21.aCacheReferenceTable139, true, 0);
            }

            Client.connectionState = var0;
        }
    }

    static void method305(boolean var0) {
        Client.inInstancedScene = var0;
        int var1;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (!Client.inInstancedScene) {
            var1 = Client.aPacket1521.readUnsignedShort();
            int var2 = Client.aPacket1521.method840();
            var3 = Client.aPacket1521.readUnsignedShort();
            Class14.anIntArrayArray118 = new int[var3][4];

            for (var4 = 0; var4 < var3; ++var4) {
                for (var5 = 0; var5 < 4; ++var5) {
                    Class14.anIntArrayArray118[var4][var5] = Client.aPacket1521.method835();
                }
            }

            Class43.anIntArray364 = new int[var3];
            Boundary.anIntArray1148 = new int[var3];
            Class121.anIntArray1359 = new int[var3];
            InterfaceNode.aByteArrayArray318 = new byte[var3][];
            Class10.aByteArrayArray72 = new byte[var3][];
            boolean var15 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var15 = true;
            }

            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var15 = true;
            }

            var3 = 0;

            for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
                for (var6 = (var1 - 6) / 8; var6 <= (var1 + 6) / 8; ++var6) {
                    var7 = var6 + (var5 << 8);
                    if (!var15 || var6 != 49 && var6 != 149 && var6 != 147 && var5 != 50 && (var5 != 49 || var6 != 47)) {
                        Class43.anIntArray364[var3] = var7;
                        Boundary.anIntArray1148[var3] = Class126.aCacheReferenceTable1368.method1084("m" + var5 + "_" + var6);
                        Class121.anIntArray1359[var3] = Class126.aCacheReferenceTable1368.method1084("l" + var5 + "_" + var6);
                        ++var3;
                    }
                }
            }

            Class51.method322(var2, var1, true);
        } else {
            var1 = Client.aPacket1521.method856();
            boolean var14 = Client.aPacket1521.method834() == 1;
            var3 = Client.aPacket1521.method856();
            var4 = Client.aPacket1521.readUnsignedShort();
            Client.aPacket1521.method790();

            int var8;
            for (var5 = 0; var5 < 4; ++var5) {
                for (var6 = 0; var6 < 13; ++var6) {
                    for (var7 = 0; var7 < 13; ++var7) {
                        var8 = Client.aPacket1521.method788(1);
                        if (var8 == 1) {
                            Client.anIntArrayArrayArray1530[var5][var6][var7] = Client.aPacket1521.method788(26);
                        } else {
                            Client.anIntArrayArrayArray1530[var5][var6][var7] = -1;
                        }
                    }
                }
            }

            Client.aPacket1521.method789();
            Class14.anIntArrayArray118 = new int[var4][4];

            for (var5 = 0; var5 < var4; ++var5) {
                for (var6 = 0; var6 < 4; ++var6) {
                    Class14.anIntArrayArray118[var5][var6] = Client.aPacket1521.method835();
                }
            }

            Class43.anIntArray364 = new int[var4];
            Boundary.anIntArray1148 = new int[var4];
            Class121.anIntArray1359 = new int[var4];
            InterfaceNode.aByteArrayArray318 = new byte[var4][];
            Class10.aByteArrayArray72 = new byte[var4][];
            var4 = 0;

            for (var5 = 0; var5 < 4; ++var5) {
                for (var6 = 0; var6 < 13; ++var6) {
                    for (var7 = 0; var7 < 13; ++var7) {
                        var8 = Client.anIntArrayArrayArray1530[var5][var6][var7];
                        if (var8 != -1) {
                            int var9 = var8 >> 14 & 1023;
                            int var10 = var8 >> 3 & 2047;
                            int var11 = (var9 / 8 << 8) + var10 / 8;

                            int var12;
                            for (var12 = 0; var12 < var4; ++var12) {
                                if (Class43.anIntArray364[var12] == var11) {
                                    var11 = -1;
                                    break;
                                }
                            }

                            if (var11 != -1) {
                                Class43.anIntArray364[var4] = var11;
                                var12 = var11 >> 8 & 255;
                                int var13 = var11 & 255;
                                Boundary.anIntArray1148[var4] = Class126.aCacheReferenceTable1368.method1084("m" + var12 + "_" + var13);
                                Class121.anIntArray1359[var4] = Class126.aCacheReferenceTable1368.method1084("l" + var12 + "_" + var13);
                                ++var4;
                            }
                        }
                    }
                }
            }

            Class51.method322(var3, var1, !var14);
        }

    }

    static void method306(int var0, int var1) {
        Client.packet.writeHeader(84);
        Client.packet.method855(var0);
        Client.packet.method843(var1);
    }
}
