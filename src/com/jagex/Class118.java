package com.jagex;

public class Class118 {
    static InterfaceComponent anInterfaceComponent1348;
    byte[] aByteArray1349;
    int[] anIntArray1347;
    int[] anIntArray1346;

    public Class118(byte[] var1) {
        int var2 = var1.length;
        this.anIntArray1346 = new int[var2];
        this.aByteArray1349 = var1;
        int[] var3 = new int[33];
        this.anIntArray1347 = new int[8];
        int var4 = 0;

        for (int var5 = 0; var5 < var2; ++var5) {
            byte var6 = var1[var5];
            if (var6 != 0) {
                int var7 = 1 << 32 - var6;
                int var8 = var3[var6];
                this.anIntArray1346[var5] = var8;
                int var9;
                int var10;
                int var11;
                int var12;
                if ((var8 & var7) != 0) {
                    var9 = var3[var6 - 1];
                } else {
                    var9 = var8 | var7;

                    for (var10 = var6 - 1; var10 >= 1; --var10) {
                        var11 = var3[var10];
                        if (var11 != var8) {
                            break;
                        }

                        var12 = 1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }

                        var3[var10] = var11 | var12;
                    }
                }

                var3[var6] = var9;

                for (var10 = var6 + 1; var10 <= 32; ++var10) {
                    if (var3[var10] == var8) {
                        var3[var10] = var9;
                    }
                }

                var10 = 0;

                for (var11 = 0; var11 < var6; ++var11) {
                    var12 = Integer.MIN_VALUE >>> var11;
                    if ((var8 & var12) != 0) {
                        if (this.anIntArray1347[var10] == 0) {
                            this.anIntArray1347[var10] = var4;
                        }

                        var10 = this.anIntArray1347[var10];
                    } else {
                        ++var10;
                    }

                    if (var10 >= this.anIntArray1347.length) {
                        int[] var13 = new int[this.anIntArray1347.length * 2];

                        for (int var14 = 0; var14 < this.anIntArray1347.length; ++var14) {
                            var13[var14] = this.anIntArray1347[var14];
                        }

                        this.anIntArray1347 = var13;
                    }

                    var12 >>>= 1;
                }

                this.anIntArray1347[var10] = ~var5;
                if (var10 >= var4) {
                    var4 = var10 + 1;
                }
            }
        }

    }

    static void method798() {
        Class113_Sub1.method287(false);
        Client.anInt1510 = 0;
        boolean var0 = true;

        int var1;
        for (var1 = 0; var1 < InterfaceNode.aByteArrayArray318.length; ++var1) {
            if (Boundary.anIntArray1148[var1] != -1 && InterfaceNode.aByteArrayArray318[var1] == null) {
                InterfaceNode.aByteArrayArray318[var1] = Class126.landscapes.unpack(Boundary.anIntArray1148[var1], 0);
                if (InterfaceNode.aByteArrayArray318[var1] == null) {
                    var0 = false;
                    ++Client.anInt1510;
                }
            }

            if (Class121.anIntArray1359[var1] != -1 && Class10.aByteArrayArray72[var1] == null) {
                Class10.aByteArrayArray72[var1] = Class126.landscapes.unpack(Class121.anIntArray1359[var1], 0, Class14.anIntArrayArray118[var1]);
                if (Class10.aByteArrayArray72[var1] == null) {
                    var0 = false;
                    ++Client.anInt1510;
                }
            }
        }

        if (!var0) {
            Client.anInt1539 = 1;
        } else {
            Client.anInt1540 = 0;
            var0 = true;

            int var3;
            int var4;
            Buffer var7;
            int var8;
            int var9;
            int var11;
            int var13;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            for (var1 = 0; var1 < InterfaceNode.aByteArrayArray318.length; ++var1) {
                byte[] var2 = Class10.aByteArrayArray72[var1];
                if (var2 != null) {
                    var3 = (Class43.anIntArray364[var1] >> 8) * 64 - Class62.anInt636;
                    var4 = (Class43.anIntArray364[var1] & 255) * 64 - Class49.anInt377;
                    if (Client.inInstancedScene) {
                        var3 = 10;
                        var4 = 10;
                    }

                    boolean var6 = true;
                    var7 = new Buffer(var2);
                    var8 = -1;

                    label1459:
                    while (true) {
                        var9 = var7.method541();
                        if (var9 == 0) {
                            var0 &= var6;
                            break;
                        }

                        var8 += var9;
                        var11 = 0;
                        boolean var12 = false;

                        while (true) {
                            while (!var12) {
                                var13 = var7.method541();
                                if (var13 == 0) {
                                    continue label1459;
                                }

                                var11 += var13 - 1;
                                var17 = var11 & 63;
                                var18 = var11 >> 6 & 63;
                                var19 = var7.readUnsignedByte() >> 2;
                                var20 = var3 + var18;
                                var21 = var4 + var17;
                                if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                    ObjectDefinition var22 = ObjectDefinition.get(var8);
                                    if (var19 != 22 || !Client.lowMemory || var22.anInt219 != 0 || var22.anInt229 == 1 || var22.aBoolean2037) {
                                        if (!var22.method1079()) {
                                            ++Client.anInt1540;
                                            var6 = false;
                                        }

                                        var12 = true;
                                    }
                                }
                            }

                            var13 = var7.method541();
                            if (var13 == 0) {
                                break;
                            }

                            var7.readUnsignedByte();
                        }
                    }
                }
            }

            if (!var0) {
                Client.anInt1539 = 2;
            } else {
                if (Client.anInt1539 != 0) {
                    Class122.method811("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
                }

                ScriptEvent.method273();
                ReferenceCache.clearCaches();
                ScriptEvent.method273();
                Class60.aSceneGraph631.method710();
                ScriptEvent.method273();
                System.gc();

                for (var1 = 0; var1 < 4; ++var1) {
                    Client.collisionMaps[var1].method757();
                }

                int var14;
                for (var1 = 0; var1 < 4; ++var1) {
                    for (var14 = 0; var14 < 104; ++var14) {
                        for (var3 = 0; var3 < 104; ++var3) {
                            Class26.aByteArrayArrayArray189[var1][var14][var3] = 0;
                        }
                    }
                }

                ScriptEvent.method273();
                IgnoredPlayer.method209();
                var1 = InterfaceNode.aByteArrayArray318.length;
                Class34.method223();
                Class113_Sub1.method287(true);
                int var5;
                int var10;
                int var29;
                int var30;
                int var31;
                int var62;
                int var64;
                if (!Client.inInstancedScene) {
                    byte[] var15;
                    for (var14 = 0; var14 < var1; ++var14) {
                        var3 = (Class43.anIntArray364[var14] >> 8) * 64 - Class62.anInt636;
                        var4 = (Class43.anIntArray364[var14] & 255) * 64 - Class49.anInt377;
                        var15 = InterfaceNode.aByteArrayArray318[var14];
                        if (var15 != null) {
                            ScriptEvent.method273();
                            var10 = Class13.anInt102 * 8 - 48;
                            var62 = Class43.anInt361 * 8 - 48;
                            CollisionMap[] var63 = Client.collisionMaps;

                            for (var8 = 0; var8 < 4; ++var8) {
                                for (var9 = 0; var9 < 64; ++var9) {
                                    for (var11 = 0; var11 < 64; ++var11) {
                                        if (var9 + var3 > 0 && var9 + var3 < 103 && var11 + var4 > 0 && var4 + var11 < 103) {
                                            var63[var8].flags[var9 + var3][var4 + var11] &= -16777217;
                                        }
                                    }
                                }
                            }

                            Buffer var16 = new Buffer(var15);

                            for (var9 = 0; var9 < 4; ++var9) {
                                for (var11 = 0; var11 < 64; ++var11) {
                                    for (var64 = 0; var64 < 64; ++var64) {
                                        Class84.method487(var16, var9, var3 + var11, var64 + var4, var10, var62, 0);
                                    }
                                }
                            }
                        }
                    }

                    for (var14 = 0; var14 < var1; ++var14) {
                        var3 = (Class43.anIntArray364[var14] >> 8) * 64 - Class62.anInt636;
                        var4 = (Class43.anIntArray364[var14] & 255) * 64 - Class49.anInt377;
                        var15 = InterfaceNode.aByteArrayArray318[var14];
                        if (var15 == null && Class43.anInt361 < 800) {
                            ScriptEvent.method273();
                            Class128.method879(var3, var4, 64, 64);
                        }
                    }

                    Class113_Sub1.method287(true);

                    for (var14 = 0; var14 < var1; ++var14) {
                        byte[] var23 = Class10.aByteArrayArray72[var14];
                        if (var23 != null) {
                            var4 = (Class43.anIntArray364[var14] >> 8) * 64 - Class62.anInt636;
                            var5 = (Class43.anIntArray364[var14] & 255) * 64 - Class49.anInt377;
                            ScriptEvent.method273();
                            SceneGraph var24 = Class60.aSceneGraph631;
                            CollisionMap[] var25 = Client.collisionMaps;
                            var7 = new Buffer(var23);
                            var8 = -1;

                            while (true) {
                                var9 = var7.method541();
                                if (var9 == 0) {
                                    break;
                                }

                                var8 += var9;
                                var11 = 0;

                                while (true) {
                                    var64 = var7.method541();
                                    if (var64 == 0) {
                                        break;
                                    }

                                    var11 += var64 - 1;
                                    var13 = var11 & 63;
                                    var17 = var11 >> 6 & 63;
                                    var18 = var11 >> 12;
                                    var19 = var7.readUnsignedByte();
                                    var20 = var19 >> 2;
                                    var21 = var19 & 3;
                                    var29 = var4 + var17;
                                    var30 = var5 + var13;
                                    if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                                        var31 = var18;
                                        if ((Class26.aByteArrayArrayArray189[1][var29][var30] & 2) == 2) {
                                            var31 = var18 - 1;
                                        }

                                        CollisionMap var32 = null;
                                        if (var31 >= 0) {
                                            var32 = var25[var31];
                                        }

                                        Class22.method147(var18, var29, var30, var8, var21, var20, var24, var32);
                                    }
                                }
                            }
                        }
                    }
                }

                int var26;
                int var35;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var45;
                int var46;
                int var47;
                if (Client.inInstancedScene) {
                    CollisionMap[] var28;
                    Buffer var67;
                    for (var14 = 0; var14 < 4; ++var14) {
                        ScriptEvent.method273();

                        for (var3 = 0; var3 < 13; ++var3) {
                            for (var4 = 0; var4 < 13; ++var4) {
                                boolean var61 = false;
                                var10 = Client.anIntArrayArrayArray1530[var14][var3][var4];
                                if (var10 != -1) {
                                    var62 = var10 >> 24 & 3;
                                    var26 = var10 >> 1 & 3;
                                    var8 = var10 >> 14 & 1023;
                                    var9 = var10 >> 3 & 2047;
                                    var11 = (var8 / 8 << 8) + var9 / 8;

                                    for (var64 = 0; var64 < Class43.anIntArray364.length; ++var64) {
                                        if (Class43.anIntArray364[var64] == var11 && InterfaceNode.aByteArrayArray318[var64] != null) {
                                            byte[] var27 = InterfaceNode.aByteArrayArray318[var64];
                                            var17 = var3 * 8;
                                            var18 = var4 * 8;
                                            var19 = (var8 & 7) * 8;
                                            var20 = (var9 & 7) * 8;
                                            var28 = Client.collisionMaps;

                                            for (var29 = 0; var29 < 8; ++var29) {
                                                for (var30 = 0; var30 < 8; ++var30) {
                                                    if (var29 + var17 > 0 && var29 + var17 < 103 && var30 + var18 > 0 && var18 + var30 < 103) {
                                                        var28[var14].flags[var29 + var17][var18 + var30] &= -16777217;
                                                    }
                                                }
                                            }

                                            var67 = new Buffer(var27);

                                            for (var30 = 0; var30 < 4; ++var30) {
                                                for (var31 = 0; var31 < 64; ++var31) {
                                                    for (var35 = 0; var35 < 64; ++var35) {
                                                        if (var62 == var30 && var31 >= var19 && var31 < var19 + 8 && var35 >= var20 && var35 < var20 + 8) {
                                                            var39 = var31 & 7;
                                                            var40 = var35 & 7;
                                                            var41 = var26 & 3;
                                                            if (var41 == 0) {
                                                                var42 = var39;
                                                            } else if (var41 == 1) {
                                                                var42 = var40;
                                                            } else if (var41 == 2) {
                                                                var42 = 7 - var39;
                                                            } else {
                                                                var42 = 7 - var40;
                                                            }

                                                            Class84.method487(var67, var14, var42 + var17, var18 + Class67.method397(var31 & 7, var35 & 7, var26), 0, 0, var26);
                                                        } else {
                                                            Class84.method487(var67, 0, -1, -1, 0, 0, 0);
                                                        }
                                                    }
                                                }
                                            }

                                            var61 = true;
                                            break;
                                        }
                                    }
                                }

                                if (!var61) {
                                    var62 = var14;
                                    var26 = var3 * 8;
                                    var8 = var4 * 8;

                                    for (var9 = 0; var9 < 8; ++var9) {
                                        for (var11 = 0; var11 < 8; ++var11) {
                                            Class26.anIntArrayArrayArray191[var62][var26 + var9][var11 + var8] = 0;
                                        }
                                    }

                                    if (var26 > 0) {
                                        for (var9 = 1; var9 < 8; ++var9) {
                                            Class26.anIntArrayArrayArray191[var62][var26][var9 + var8] = Class26.anIntArrayArrayArray191[var62][var26 - 1][var9 + var8];
                                        }
                                    }

                                    if (var8 > 0) {
                                        for (var9 = 1; var9 < 8; ++var9) {
                                            Class26.anIntArrayArrayArray191[var62][var9 + var26][var8] = Class26.anIntArrayArrayArray191[var62][var9 + var26][var8 - 1];
                                        }
                                    }

                                    if (var26 > 0 && Class26.anIntArrayArrayArray191[var62][var26 - 1][var8] != 0) {
                                        Class26.anIntArrayArrayArray191[var62][var26][var8] = Class26.anIntArrayArrayArray191[var62][var26 - 1][var8];
                                    } else if (var8 > 0 && Class26.anIntArrayArrayArray191[var62][var26][var8 - 1] != 0) {
                                        Class26.anIntArrayArrayArray191[var62][var26][var8] = Class26.anIntArrayArrayArray191[var62][var26][var8 - 1];
                                    } else if (var26 > 0 && var8 > 0 && Class26.anIntArrayArrayArray191[var62][var26 - 1][var8 - 1] != 0) {
                                        Class26.anIntArrayArrayArray191[var62][var26][var8] = Class26.anIntArrayArrayArray191[var62][var26 - 1][var8 - 1];
                                    }
                                }
                            }
                        }
                    }

                    for (var14 = 0; var14 < 13; ++var14) {
                        for (var3 = 0; var3 < 13; ++var3) {
                            var4 = Client.anIntArrayArrayArray1530[0][var14][var3];
                            if (var4 == -1) {
                                Class128.method879(var14 * 8, var3 * 8, 8, 8);
                            }
                        }
                    }

                    Class113_Sub1.method287(true);

                    for (var14 = 0; var14 < 4; ++var14) {
                        ScriptEvent.method273();

                        for (var3 = 0; var3 < 13; ++var3) {
                            label1217:
                            for (var4 = 0; var4 < 13; ++var4) {
                                var5 = Client.anIntArrayArrayArray1530[var14][var3][var4];
                                if (var5 != -1) {
                                    var10 = var5 >> 24 & 3;
                                    var62 = var5 >> 1 & 3;
                                    var26 = var5 >> 14 & 1023;
                                    var8 = var5 >> 3 & 2047;
                                    var9 = var8 / 8 + (var26 / 8 << 8);

                                    for (var11 = 0; var11 < Class43.anIntArray364.length; ++var11) {
                                        if (var9 == Class43.anIntArray364[var11] && Class10.aByteArrayArray72[var11] != null) {
                                            byte[] var33 = Class10.aByteArrayArray72[var11];
                                            var13 = var3 * 8;
                                            var17 = var4 * 8;
                                            var18 = (var26 & 7) * 8;
                                            var19 = (var8 & 7) * 8;
                                            SceneGraph var34 = Class60.aSceneGraph631;
                                            var28 = Client.collisionMaps;
                                            var67 = new Buffer(var33);
                                            var30 = -1;

                                            while (true) {
                                                var31 = var67.method541();
                                                if (var31 == 0) {
                                                    continue label1217;
                                                }

                                                var30 += var31;
                                                var35 = 0;

                                                while (true) {
                                                    var43 = var67.method541();
                                                    if (var43 == 0) {
                                                        break;
                                                    }

                                                    var35 += var43 - 1;
                                                    var37 = var35 & 63;
                                                    var38 = var35 >> 6 & 63;
                                                    var42 = var35 >> 12;
                                                    var39 = var67.readUnsignedByte();
                                                    var40 = var39 >> 2;
                                                    var41 = var39 & 3;
                                                    if (var10 == var42 && var38 >= var18 && var38 < var18 + 8 && var37 >= var19 && var37 < var19 + 8) {
                                                        ObjectDefinition var44 = ObjectDefinition.get(var30);
                                                        var45 = var13 + Class112.method774(var38 & 7, var37 & 7, var62, var44.anInt230, var44.anInt222, var41);
                                                        var46 = var17 + Class113.method775(var38 & 7, var37 & 7, var62, var44.anInt230, var44.anInt222, var41);
                                                        if (var45 > 0 && var46 > 0 && var45 < 103 && var46 < 103) {
                                                            var47 = var14;
                                                            if ((Class26.aByteArrayArrayArray189[1][var45][var46] & 2) == 2) {
                                                                var47 = var14 - 1;
                                                            }

                                                            CollisionMap var48 = null;
                                                            if (var47 >= 0) {
                                                                var48 = var28[var47];
                                                            }

                                                            Class22.method147(var14, var45, var46, var30, var62 + var41 & 3, var40, var34, var48);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                Class113_Sub1.method287(true);
                ReferenceCache.clearCaches();
                ScriptEvent.method273();
                SceneGraph var60 = Class60.aSceneGraph631;
                CollisionMap[] var69 = Client.collisionMaps;

                for (var4 = 0; var4 < 4; ++var4) {
                    for (var5 = 0; var5 < 104; ++var5) {
                        for (var10 = 0; var10 < 104; ++var10) {
                            if ((Class26.aByteArrayArrayArray189[var4][var5][var10] & 1) == 1) {
                                var62 = var4;
                                if ((Class26.aByteArrayArrayArray189[1][var5][var10] & 2) == 2) {
                                    var62 = var4 - 1;
                                }

                                if (var62 >= 0) {
                                    var69[var62].flagBlocked(var5, var10);
                                }
                            }
                        }
                    }
                }

                Class26.anInt197 += (int) (Math.random() * 5.0D) - 2;
                if (Class26.anInt197 < -8) {
                    Class26.anInt197 = -8;
                }

                if (Class26.anInt197 > 8) {
                    Class26.anInt197 = 8;
                }

                Class26.anInt194 += (int) (Math.random() * 5.0D) - 2;
                if (Class26.anInt194 < -16) {
                    Class26.anInt194 = -16;
                }

                if (Class26.anInt194 > 16) {
                    Class26.anInt194 = 16;
                }

                for (var4 = 0; var4 < 4; ++var4) {
                    byte[][] var65 = Class179.aByteArrayArrayArray2145[var4];
                    var11 = (int) Math.sqrt(5100.0D);
                    var64 = var11 * 768 >> 8;

                    for (var13 = 1; var13 < 103; ++var13) {
                        for (var17 = 1; var17 < 103; ++var17) {
                            var18 = Class26.anIntArrayArrayArray191[var4][var17 + 1][var13] - Class26.anIntArrayArrayArray191[var4][var17 - 1][var13];
                            var19 = Class26.anIntArrayArrayArray191[var4][var17][var13 + 1] - Class26.anIntArrayArrayArray191[var4][var17][var13 - 1];
                            var20 = (int) Math.sqrt((double) (var18 * var18 + 65536 + var19 * var19));
                            var21 = (var18 << 8) / var20;
                            var29 = 65536 / var20;
                            var30 = (var19 << 8) / var20;
                            var31 = (var21 * -50 + var29 * -10 + var30 * -50) / var64 + 96;
                            var35 = (var65[var17][var13] >> 1) + (var65[var17 + 1][var13] >> 3) + (var65[var17 - 1][var13] >> 2) + (var65[var17][var13 - 1] >> 2) + (var65[var17][var13 + 1] >> 3);
                            ItemTable.anIntArrayArray341[var17][var13] = var31 - var35;
                        }
                    }

                    for (var13 = 0; var13 < 104; ++var13) {
                        InterfaceComponent.anIntArray1271[var13] = 0;
                        Class26.anIntArray190[var13] = 0;
                        Boundary.anIntArray1140[var13] = 0;
                        Class10.anIntArray79[var13] = 0;
                        InterfaceNode.anIntArray315[var13] = 0;
                    }

                    for (var13 = -5; var13 < 109; ++var13) {
                        for (var17 = 0; var17 < 104; ++var17) {
                            var18 = var13 + 5;
                            if (var18 >= 0 && var18 < 104) {
                                var19 = Class26.aByteArrayArrayArray193[var4][var18][var17] & 255;
                                if (var19 > 0) {
                                    Node_Sub21_Sub24 var71 = ClientPreferences.method293(var19 - 1);
                                    InterfaceComponent.anIntArray1271[var17] += var71.anInt232;
                                    Class26.anIntArray190[var17] += var71.anInt327;
                                    Boundary.anIntArray1140[var17] += var71.anInt328;
                                    Class10.anIntArray79[var17] += var71.anInt221;
                                    ++InterfaceNode.anIntArray315[var17];
                                }
                            }

                            var19 = var13 - 5;
                            if (var19 >= 0 && var19 < 104) {
                                var20 = Class26.aByteArrayArrayArray193[var4][var19][var17] & 255;
                                if (var20 > 0) {
                                    Node_Sub21_Sub24 var70 = ClientPreferences.method293(var20 - 1);
                                    InterfaceComponent.anIntArray1271[var17] -= var70.anInt232;
                                    Class26.anIntArray190[var17] -= var70.anInt327;
                                    Boundary.anIntArray1140[var17] -= var70.anInt328;
                                    Class10.anIntArray79[var17] -= var70.anInt221;
                                    --InterfaceNode.anIntArray315[var17];
                                }
                            }
                        }

                        if (var13 >= 1 && var13 < 103) {
                            var17 = 0;
                            var18 = 0;
                            var19 = 0;
                            var20 = 0;
                            var21 = 0;

                            for (var29 = -5; var29 < 109; ++var29) {
                                var30 = var29 + 5;
                                if (var30 >= 0 && var30 < 104) {
                                    var17 += InterfaceComponent.anIntArray1271[var30];
                                    var18 += Class26.anIntArray190[var30];
                                    var19 += Boundary.anIntArray1140[var30];
                                    var20 += Class10.anIntArray79[var30];
                                    var21 += InterfaceNode.anIntArray315[var30];
                                }

                                var31 = var29 - 5;
                                if (var31 >= 0 && var31 < 104) {
                                    var17 -= InterfaceComponent.anIntArray1271[var31];
                                    var18 -= Class26.anIntArray190[var31];
                                    var19 -= Boundary.anIntArray1140[var31];
                                    var20 -= Class10.anIntArray79[var31];
                                    var21 -= InterfaceNode.anIntArray315[var31];
                                }

                                if (var29 >= 1 && var29 < 103 && (!Client.lowMemory || (Class26.aByteArrayArrayArray189[0][var13][var29] & 2) != 0 || (Class26.aByteArrayArrayArray189[var4][var13][var29] & 16) == 0)) {
                                    if (var4 < Class26.anInt185) {
                                        Class26.anInt185 = var4;
                                    }

                                    var35 = Class26.aByteArrayArrayArray193[var4][var13][var29] & 255;
                                    var43 = Class26.aByteArrayArrayArray195[var4][var13][var29] & 255;
                                    if (var35 > 0 || var43 > 0) {
                                        var37 = Class26.anIntArrayArrayArray191[var4][var13][var29];
                                        var38 = Class26.anIntArrayArrayArray191[var4][var13 + 1][var29];
                                        var42 = Class26.anIntArrayArrayArray191[var4][var13 + 1][var29 + 1];
                                        var39 = Class26.anIntArrayArrayArray191[var4][var13][var29 + 1];
                                        var40 = ItemTable.anIntArrayArray341[var13][var29];
                                        var41 = ItemTable.anIntArrayArray341[var13 + 1][var29];
                                        int var49 = ItemTable.anIntArrayArray341[var13 + 1][var29 + 1];
                                        var45 = ItemTable.anIntArrayArray341[var13][var29 + 1];
                                        var46 = -1;
                                        var47 = -1;
                                        int var50;
                                        int var51;
                                        if (var35 > 0) {
                                            var50 = var17 * 256 / var20;
                                            var51 = var18 / var21;
                                            int var52 = var19 / var21;
                                            var46 = method311(var50, var51, var52);
                                            var50 = Class26.anInt197 + var50 & 255;
                                            var52 += Class26.anInt194;
                                            if (var52 < 0) {
                                                var52 = 0;
                                            } else if (var52 > 255) {
                                                var52 = 255;
                                            }

                                            var47 = method311(var50, var51, var52);
                                        }

                                        if (var4 > 0) {
                                            boolean var72 = true;
                                            if (var35 == 0 && Class57.aByteArrayArrayArray433[var4][var13][var29] != 0) {
                                                var72 = false;
                                            }

                                            if (var43 > 0 && !Node_Sub21_Sub10.method1063(var43 - 1).aBoolean845) {
                                                var72 = false;
                                            }

                                            if (var72 && var37 == var38 && var42 == var37 && var37 == var39) {
                                                Class26.anIntArrayArrayArray186[var4][var13][var29] |= 2340;
                                            }
                                        }

                                        var50 = 0;
                                        if (var47 != -1) {
                                            var50 = Node_Sub21_Sub26_Sub1.anIntArray240[Class6_Sub1.method167(var47, 96)];
                                        }

                                        if (var43 == 0) {
                                            var60.method720(var4, var13, var29, 0, 0, -1, var37, var38, var42, var39, Class6_Sub1.method167(var46, var40), Class6_Sub1.method167(var46, var41), Class6_Sub1.method167(var46, var49), Class6_Sub1.method167(var46, var45), 0, 0, 0, 0, var50, 0);
                                        } else {
                                            var51 = Class57.aByteArrayArrayArray433[var4][var13][var29] + 1;
                                            byte var73 = Class183.aByteArrayArrayArray2159[var4][var13][var29];
                                            Node_Sub21_Sub12 var53 = Node_Sub21_Sub10.method1063(var43 - 1);
                                            int var54 = var53.anInt232;
                                            int var55;
                                            int var56;
                                            int var57;
                                            int var58;
                                            if (var54 >= 0) {
                                                var55 = Node_Sub21_Sub26_Sub1.aTextureProvider1085.method501(var54);
                                                var56 = -1;
                                            } else if (var53.anInt206 == 16711935) {
                                                var56 = -2;
                                                var54 = -1;
                                                var55 = -2;
                                            } else {
                                                var56 = method311(var53.anInt221, var53.anInt220, var53.anInt217);
                                                var57 = Class26.anInt197 + var53.anInt221 & 255;
                                                var58 = Class26.anInt194 + var53.anInt217;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 255) {
                                                    var58 = 255;
                                                }

                                                var55 = method311(var57, var53.anInt220, var58);
                                            }

                                            var57 = 0;
                                            if (var55 != -2) {
                                                var57 = Node_Sub21_Sub26_Sub1.anIntArray240[Class15.method132(var55, 96)];
                                            }

                                            if (var53.anInt328 != -1) {
                                                var58 = Class26.anInt197 + var53.anInt214 & 255;
                                                int var59 = Class26.anInt194 + var53.anInt228;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 255) {
                                                    var59 = 255;
                                                }

                                                var55 = method311(var58, var53.anInt226, var59);
                                                var57 = Node_Sub21_Sub26_Sub1.anIntArray240[Class15.method132(var55, 96)];
                                            }

                                            var60.method720(var4, var13, var29, var51, var73, var54, var37, var38, var42, var39, Class6_Sub1.method167(var46, var40), Class6_Sub1.method167(var46, var41), Class6_Sub1.method167(var46, var49), Class6_Sub1.method167(var46, var45), Class15.method132(var56, var40), Class15.method132(var56, var41), Class15.method132(var56, var49), Class15.method132(var56, var45), var50, var57);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    for (var13 = 1; var13 < 103; ++var13) {
                        for (var17 = 1; var17 < 103; ++var17) {
                            var60.method717(var4, var17, var13, Class65.method389(var4, var17, var13));
                        }
                    }

                    Class26.aByteArrayArrayArray193[var4] = null;
                    Class26.aByteArrayArrayArray195[var4] = null;
                    Class57.aByteArrayArrayArray433[var4] = null;
                    Class183.aByteArrayArrayArray2159[var4] = null;
                    Class179.aByteArrayArrayArray2145[var4] = null;
                }

                var60.method679(-50, -10, -50);

                for (var4 = 0; var4 < 104; ++var4) {
                    for (var5 = 0; var5 < 104; ++var5) {
                        if ((Class26.aByteArrayArrayArray189[1][var4][var5] & 2) == 2) {
                            var60.method702(var4, var5);
                        }
                    }
                }

                var4 = 1;
                var5 = 2;
                var10 = 4;

                for (var62 = 0; var62 < 4; ++var62) {
                    if (var62 > 0) {
                        var4 <<= 3;
                        var5 <<= 3;
                        var10 <<= 3;
                    }

                    for (var26 = 0; var26 <= var62; ++var26) {
                        for (var8 = 0; var8 <= 104; ++var8) {
                            for (var9 = 0; var9 <= 104; ++var9) {
                                short var68;
                                if ((Class26.anIntArrayArrayArray186[var26][var9][var8] & var4) != 0) {
                                    var11 = var8;
                                    var64 = var8;
                                    var13 = var26;

                                    for (var17 = var26; var11 > 0 && (Class26.anIntArrayArrayArray186[var26][var9][var11 - 1] & var4) != 0; --var11) {
                                    }

                                    while (var64 < 104 && (Class26.anIntArrayArrayArray186[var26][var9][var64 + 1] & var4) != 0) {
                                        ++var64;
                                    }

                                    label952:
                                    while (var13 > 0) {
                                        for (var18 = var11; var18 <= var64; ++var18) {
                                            if ((Class26.anIntArrayArrayArray186[var13 - 1][var9][var18] & var4) == 0) {
                                                break label952;
                                            }
                                        }

                                        --var13;
                                    }

                                    label941:
                                    while (var17 < var62) {
                                        for (var18 = var11; var18 <= var64; ++var18) {
                                            if ((Class26.anIntArrayArrayArray186[var17 + 1][var9][var18] & var4) == 0) {
                                                break label941;
                                            }
                                        }

                                        ++var17;
                                    }

                                    var18 = (var64 - var11 + 1) * (var17 + 1 - var13);
                                    if (var18 >= 8) {
                                        var68 = 240;
                                        var20 = Class26.anIntArrayArrayArray191[var17][var9][var11] - var68;
                                        var21 = Class26.anIntArrayArrayArray191[var13][var9][var11];
                                        SceneGraph.method714(var62, 1, var9 * 128, var9 * 128, var11 * 128, var64 * 128 + 128, var20, var21);

                                        for (var29 = var13; var29 <= var17; ++var29) {
                                            for (var30 = var11; var30 <= var64; ++var30) {
                                                Class26.anIntArrayArrayArray186[var29][var9][var30] &= ~var4;
                                            }
                                        }
                                    }
                                }

                                if ((Class26.anIntArrayArrayArray186[var26][var9][var8] & var5) != 0) {
                                    var11 = var9;
                                    var64 = var9;
                                    var13 = var26;

                                    for (var17 = var26; var11 > 0 && (Class26.anIntArrayArrayArray186[var26][var11 - 1][var8] & var5) != 0; --var11) {
                                    }

                                    while (var64 < 104 && (Class26.anIntArrayArrayArray186[var26][var64 + 1][var8] & var5) != 0) {
                                        ++var64;
                                    }

                                    label1005:
                                    while (var13 > 0) {
                                        for (var18 = var11; var18 <= var64; ++var18) {
                                            if ((Class26.anIntArrayArrayArray186[var13 - 1][var18][var8] & var5) == 0) {
                                                break label1005;
                                            }
                                        }

                                        --var13;
                                    }

                                    label994:
                                    while (var17 < var62) {
                                        for (var18 = var11; var18 <= var64; ++var18) {
                                            if ((Class26.anIntArrayArrayArray186[var17 + 1][var18][var8] & var5) == 0) {
                                                break label994;
                                            }
                                        }

                                        ++var17;
                                    }

                                    var18 = (var64 - var11 + 1) * (var17 + 1 - var13);
                                    if (var18 >= 8) {
                                        var68 = 240;
                                        var20 = Class26.anIntArrayArrayArray191[var17][var11][var8] - var68;
                                        var21 = Class26.anIntArrayArrayArray191[var13][var11][var8];
                                        SceneGraph.method714(var62, 2, var11 * 128, var64 * 128 + 128, var8 * 128, var8 * 128, var20, var21);

                                        for (var29 = var13; var29 <= var17; ++var29) {
                                            for (var30 = var11; var30 <= var64; ++var30) {
                                                Class26.anIntArrayArrayArray186[var29][var30][var8] &= ~var5;
                                            }
                                        }
                                    }
                                }

                                if ((Class26.anIntArrayArrayArray186[var26][var9][var8] & var10) != 0) {
                                    var11 = var9;
                                    var64 = var9;
                                    var13 = var8;

                                    for (var17 = var8; var13 > 0 && (Class26.anIntArrayArrayArray186[var26][var9][var13 - 1] & var10) != 0; --var13) {
                                    }

                                    while (var17 < 104 && (Class26.anIntArrayArrayArray186[var26][var9][var17 + 1] & var10) != 0) {
                                        ++var17;
                                    }

                                    label1058:
                                    while (var11 > 0) {
                                        for (var18 = var13; var18 <= var17; ++var18) {
                                            if ((Class26.anIntArrayArrayArray186[var26][var11 - 1][var18] & var10) == 0) {
                                                break label1058;
                                            }
                                        }

                                        --var11;
                                    }

                                    label1047:
                                    while (var64 < 104) {
                                        for (var18 = var13; var18 <= var17; ++var18) {
                                            if ((Class26.anIntArrayArrayArray186[var26][var64 + 1][var18] & var10) == 0) {
                                                break label1047;
                                            }
                                        }

                                        ++var64;
                                    }

                                    if ((var17 - var13 + 1) * (var64 - var11 + 1) >= 4) {
                                        var18 = Class26.anIntArrayArrayArray191[var26][var11][var13];
                                        SceneGraph.method714(var62, 4, var11 * 128, var64 * 128 + 128, var13 * 128, var17 * 128 + 128, var18, var18);

                                        for (var19 = var11; var19 <= var64; ++var19) {
                                            for (var20 = var13; var20 <= var17; ++var20) {
                                                Class26.anIntArrayArrayArray186[var26][var19][var20] &= ~var10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                Class113_Sub1.method287(true);
                var4 = Class26.anInt185;
                if (var4 > PlayerEntity.floorLevel) {
                    var4 = PlayerEntity.floorLevel;
                }

                if (var4 < PlayerEntity.floorLevel - 1) {
                    var4 = PlayerEntity.floorLevel - 1;
                }

                if (Client.lowMemory) {
                    Class60.aSceneGraph631.method707(Class26.anInt185);
                } else {
                    Class60.aSceneGraph631.method707(0);
                }

                for (var5 = 0; var5 < 104; ++var5) {
                    for (var10 = 0; var10 < 104; ++var10) {
                        Class22.method146(var5, var10);
                    }
                }

                ScriptEvent.method273();

                for (PendingSpawn var66 = Client.pendingSpawns.method995(); var66 != null; var66 = Client.pendingSpawns.next()) {
                    if (var66.hitpoints == -1) {
                        var66.delay = 0;
                        Class4.method14(var66);
                    } else {
                        var66.unlink();
                    }
                }

                ObjectDefinition.aReferenceCache2045.clear();
                if (Class160.aClient1856.method232()) {
                    Client.packet.writeHeader(194);
                    Client.packet.method869(1057001181);
                }

                if (!Client.inInstancedScene) {
                    var5 = (Class13.anInt102 - 6) / 8;
                    var10 = (Class13.anInt102 + 6) / 8;
                    var62 = (Class43.anInt361 - 6) / 8;
                    var26 = (Class43.anInt361 + 6) / 8;

                    for (var8 = var5 - 1; var8 <= var10 + 1; ++var8) {
                        for (var9 = var62 - 1; var9 <= var26 + 1; ++var9) {
                            if (var8 < var5 || var8 > var10 || var9 < var62 || var9 > var26) {
                                Class126.landscapes.method1103("m" + var8 + "_" + var9);
                                Class126.landscapes.method1103("l" + var8 + "_" + var9);
                            }
                        }
                    }
                }

                Class45.method304(30);
                ScriptEvent.method273();
                Class4.method16();
                Client.packet.writeHeader(9);
                Client.aClass122_303.method665();

                for (var5 = 0; var5 < 32; ++var5) {
                    Client.aLongArray282[var5] = 0L;
                }

                for (var5 = 0; var5 < 32; ++var5) {
                    Client.aLongArray310[var5] = 0L;
                }

                Client.anInt290 = 0;
            }
        }
    }

    static int method311(int var0, int var1, int var2) {
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

    public int method800(byte[] var1, int var2, byte[] var3, int var4, int var5) {
        if (var5 == 0) {
            return 0;
        }
        int var6 = 0;
        var5 += var4;
        int var7 = var2;

        while (true) {
            byte var8 = var1[var7];
            if (var8 < 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            int var9;
            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            if ((var8 & 64) != 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            if ((var8 & 32) != 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            if ((var8 & 16) != 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            if ((var8 & 8) != 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            if ((var8 & 4) != 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            if ((var8 & 2) != 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            if ((var8 & 1) != 0) {
                var6 = this.anIntArray1347[var6];
            } else {
                ++var6;
            }

            if ((var9 = this.anIntArray1347[var6]) < 0) {
                var3[var4++] = (byte) (~var9);
                if (var4 >= var5) {
                    break;
                }

                var6 = 0;
            }

            ++var7;
        }

        return var7 + 1 - var2;
    }

    public int method797(byte[] var1, int var2, int var3, byte[] var4, int var5) {
        int var6 = 0;
        int var7 = var5 << 3;

        for (var3 += var2; var2 < var3; ++var2) {
            int var8 = var1[var2] & 255;
            int var9 = this.anIntArray1346[var8];
            byte var10 = this.aByteArray1349[var8];
            if (var10 == 0) {
                throw new RuntimeException("");
            }

            int var11 = var7 >> 3;
            int var12 = var7 & 7;
            var6 &= -var12 >> 31;
            int var13 = var11 + (var10 + var12 - 1 >> 3);
            var12 += 24;
            var4[var11] = (byte) (var6 |= var9 >>> var12);
            if (var11 < var13) {
                ++var11;
                var12 -= 8;
                var4[var11] = (byte) (var6 = var9 >>> var12);
                if (var11 < var13) {
                    ++var11;
                    var12 -= 8;
                    var4[var11] = (byte) (var6 = var9 >>> var12);
                    if (var11 < var13) {
                        ++var11;
                        var12 -= 8;
                        var4[var11] = (byte) (var6 = var9 >>> var12);
                        if (var11 < var13) {
                            ++var11;
                            var12 -= 8;
                            var4[var11] = (byte) (var6 = var9 << -var12);
                        }
                    }
                }
            }

            var7 += var10;
        }

        return (var7 + 7 >> 3) - var5;
    }
}
