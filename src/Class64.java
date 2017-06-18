public class Class64 {
    static final Class64 aClass64_659 = new Class64(5);
    static final Class64 aClass64_651 = new Class64(4);
    static final Class64 aClass64_657 = new Class64(1);
    static final Class64 aClass64_658 = new Class64(0);
    static final Class64 aClass64_649 = new Class64(3);
    static final Class64 aClass64_653 = new Class64(2);
    static final Class64 aClass64_654 = new Class64(6);
    protected static int appletHeight;
    static java.awt.Font aFont652;
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array656;
    final int anInt655;

    Class64(int var1) {
        this.anInt655 = var1;
    }

    static void method382(boolean var0) {
        Client.anInt1580 = 0;
        Client.anInt1508 = 0;
        Node_Sub21_Sub1.method182();
        InterfaceNode.method265(var0);

        int var1;
        int var2;
        for (var1 = 0; var1 < Client.anInt1508; ++var1) {
            var2 = Client.anIntArray1507[var1];
            Npc var3 = Client.npcs[var2];
            int var4 = Client.aPacket1521.readUnsignedByte();
            int var5;
            int var6;
            int var7;
            int var8;
            if ((var4 & 16) != 0) {
                var5 = Client.aPacket1521.method840();
                var6 = Client.aPacket1521.readUnsignedShort();
                var7 = var3.strictX - (var5 - Class62.anInt636 - Class62.anInt636) * 64;
                var8 = var3.strictY - (var6 - Class49.anInt377 - Class49.anInt377) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.anInt793 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 2047;
                }
            }

            if ((var4 & 2) != 0) {
                var5 = Client.aPacket1521.readUnsignedByte();
                int var9;
                int var10;
                int var11;
                if (var5 > 0) {
                    for (var6 = 0; var6 < var5; ++var6) {
                        var8 = -1;
                        var9 = -1;
                        var10 = -1;
                        var7 = Client.aPacket1521.method541();
                        if (var7 == 32767) {
                            var7 = Client.aPacket1521.method541();
                            var9 = Client.aPacket1521.method541();
                            var8 = Client.aPacket1521.method541();
                            var10 = Client.aPacket1521.method541();
                        } else if (var7 != 32766) {
                            var9 = Client.aPacket1521.method541();
                        } else {
                            var7 = -1;
                        }

                        var11 = Client.aPacket1521.method541();
                        var3.method440(var7, var9, var8, var10, Client.engineCycle, var11);
                    }
                }

                var6 = Client.aPacket1521.readUnsignedByte();
                if (var6 > 0) {
                    for (var7 = 0; var7 < var6; ++var7) {
                        var8 = Client.aPacket1521.method541();
                        var9 = Client.aPacket1521.method541();
                        if (var9 != 32767) {
                            var10 = Client.aPacket1521.method541();
                            var11 = Client.aPacket1521.method822();
                            int var12 = var9 > 0 ? Client.aPacket1521.readUnsignedByte() : var11;
                            var3.method439(var8, Client.engineCycle, var9, var10, var11, var12);
                        } else {
                            var3.method442(var8);
                        }
                    }
                }
            }

            if ((var4 & 1) != 0) {
                var3.definition = Class122.getNpcDefinition(Client.aPacket1521.method856());
                var3.anInt753 = var3.definition.anInt221;
                var3.anInt795 = var3.definition.anInt748;
                var3.anInt760 = var3.definition.anInt225;
                var3.anInt757 = var3.definition.anInt212;
                var3.anInt746 = var3.definition.anInt919;
                var3.anInt744 = var3.definition.anInt235;
                var3.anInt754 = var3.definition.anInt214;
                var3.anInt745 = var3.definition.anInt226;
                var3.anInt755 = var3.definition.anInt228;
            }

            if ((var4 & 8) != 0) {
                var3.aString752 = Client.aPacket1521.method819();
                var3.anInt761 = 100;
            }

            if ((var4 & 32) != 0) {
                var3.targetIndex = Client.aPacket1521.method849();
                if (var3.targetIndex == 65535) {
                    var3.targetIndex = -1;
                }
            }

            if ((var4 & 4) != 0) {
                var3.anInt771 = Client.aPacket1521.method840();
                var5 = Client.aPacket1521.method846();
                var3.anInt787 = var5 >> 16;
                var3.anInt786 = Client.engineCycle + (var5 & '\uffff');
                var3.anInt782 = 0;
                var3.anInt780 = 0;
                if (var3.anInt786 > Client.engineCycle) {
                    var3.anInt782 = -1;
                }

                if (var3.anInt771 == 65535) {
                    var3.anInt771 = -1;
                }
            }

            if ((var4 & 64) != 0) {
                var5 = Client.aPacket1521.method840();
                if (var5 == 65535) {
                    var5 = -1;
                }

                var6 = Client.aPacket1521.method822();
                if (var3.animation == var5 && var5 != -1) {
                    var7 = Applet_Sub1.method251(var5).replayMode;
                    if (var7 == 1) {
                        var3.animationFrame = 0;
                        var3.anInt790 = 0;
                        var3.anInt791 = var6;
                        var3.anInt784 = 0;
                    }

                    if (var7 == 2) {
                        var3.anInt784 = 0;
                    }
                } else if (var5 == -1 || var3.animation == -1 || Applet_Sub1.method251(var5).priority >= Applet_Sub1.method251(var3.animation).priority) {
                    var3.animation = var5;
                    var3.animationFrame = 0;
                    var3.anInt790 = 0;
                    var3.anInt791 = var6;
                    var3.anInt784 = 0;
                    var3.anInt799 = var3.queueSize;
                }
            }
        }

        for (var1 = 0; var1 < Client.anInt1580; ++var1) {
            var2 = Client.anIntArray1584[var1];
            if (Client.npcs[var2].anInt769 != Client.engineCycle) {
                Client.npcs[var2].definition = null;
                Client.npcs[var2] = null;
            }
        }

        if (Client.aPacket1521.caret != Client.anInt1514) {
            throw new RuntimeException(Client.aPacket1521.caret + "," + Client.anInt1514);
        } else {
            for (var1 = 0; var1 < Client.anInt1501; ++var1) {
                if (Client.npcs[Client.npcIndices[var1]] == null) {
                    throw new RuntimeException(var1 + "," + Client.anInt1501);
                }
            }

        }
    }

    static boolean method383(int var0, int var1, Class113 var2, CollisionMap var3) {
        int var4 = var0;
        int var5 = var1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = var0 - var6;
        int var9 = var1 - var7;
        Class112.anIntArrayArray1328[var6][var7] = 99;
        Class112.anIntArrayArray1327[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        Class112.anIntArray1330[var10] = var0;
        int var18 = var10 + 1;
        Class112.anIntArray1329[var10] = var1;
        int[][] var12 = var3.flags;

        while (var18 != var11) {
            var4 = Class112.anIntArray1330[var11];
            var5 = Class112.anIntArray1329[var11];
            var11 = var11 + 1 & 4095;
            int var16 = var4 - var8;
            int var17 = var5 - var9;
            int var13 = var4 - var3.insetX;
            int var14 = var5 - var3.insetY;
            if (var2.method285(2, var4, var5, var3)) {
                Class119.anInt1356 = var4;
                Class112.anInt1331 = var5;
                return true;
            }

            int var15 = Class112.anIntArrayArray1327[var16][var17] + 1;
            if (var16 > 0 && Class112.anIntArrayArray1328[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
                Class112.anIntArray1330[var18] = var4 - 1;
                Class112.anIntArray1329[var18] = var5;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16 - 1][var17] = 2;
                Class112.anIntArrayArray1327[var16 - 1][var17] = var15;
            }

            if (var16 < 126 && Class112.anIntArrayArray1328[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
                Class112.anIntArray1330[var18] = var4 + 1;
                Class112.anIntArray1329[var18] = var5;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16 + 1][var17] = 8;
                Class112.anIntArrayArray1327[var16 + 1][var17] = var15;
            }

            if (var17 > 0 && Class112.anIntArrayArray1328[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
                Class112.anIntArray1330[var18] = var4;
                Class112.anIntArray1329[var18] = var5 - 1;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16][var17 - 1] = 1;
                Class112.anIntArrayArray1327[var16][var17 - 1] = var15;
            }

            if (var17 < 126 && Class112.anIntArrayArray1328[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
                Class112.anIntArray1330[var18] = var4;
                Class112.anIntArray1329[var18] = var5 + 1;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16][var17 + 1] = 4;
                Class112.anIntArrayArray1327[var16][var17 + 1] = var15;
            }

            if (var16 > 0 && var17 > 0 && Class112.anIntArrayArray1328[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
                Class112.anIntArray1330[var18] = var4 - 1;
                Class112.anIntArray1329[var18] = var5 - 1;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16 - 1][var17 - 1] = 3;
                Class112.anIntArrayArray1327[var16 - 1][var17 - 1] = var15;
            }

            if (var16 < 126 && var17 > 0 && Class112.anIntArrayArray1328[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
                Class112.anIntArray1330[var18] = var4 + 1;
                Class112.anIntArray1329[var18] = var5 - 1;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16 + 1][var17 - 1] = 9;
                Class112.anIntArrayArray1327[var16 + 1][var17 - 1] = var15;
            }

            if (var16 > 0 && var17 < 126 && Class112.anIntArrayArray1328[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
                Class112.anIntArray1330[var18] = var4 - 1;
                Class112.anIntArray1329[var18] = var5 + 1;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16 - 1][var17 + 1] = 6;
                Class112.anIntArrayArray1327[var16 - 1][var17 + 1] = var15;
            }

            if (var16 < 126 && var17 < 126 && Class112.anIntArrayArray1328[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
                Class112.anIntArray1330[var18] = var4 + 1;
                Class112.anIntArray1329[var18] = var5 + 1;
                var18 = var18 + 1 & 4095;
                Class112.anIntArrayArray1328[var16 + 1][var17 + 1] = 12;
                Class112.anIntArrayArray1327[var16 + 1][var17 + 1] = var15;
            }
        }

        Class119.anInt1356 = var4;
        Class112.anInt1331 = var5;
        return false;
    }

    public static String method380(CharSequence var0) {
        String var1 = Class166.method1062(Class44.method300(var0));
        if (var1 == null) {
            var1 = "";
        }

        return var1;
    }

    public static boolean method381(ReferenceTable var0, int var1, int var2) {
        byte[] var3 = var0.method1085(var1, var2);
        if (var3 == null) {
            return false;
        } else {
            Class116.method794(var3);
            return true;
        }
    }
}
