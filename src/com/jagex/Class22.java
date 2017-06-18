package com.jagex;

public class Class22 {
    static int anInt151;
    static int anInt149;
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array147;
    static int anInt148;
    public SceneOffset aSceneOffset_146;
    public SceneOffset aSceneOffset_150;
    public int anInt145;

    public Class22(int var1, SceneOffset var2, SceneOffset var3) {
        this.anInt145 = var1;
        this.aSceneOffset_150 = var2;
        this.aSceneOffset_146 = var3;
    }

    static void method147(int var0, int var1, int var2, int var3, int var4, int var5, SceneGraph var6, CollisionMap var7) {
        if (!Client.lowMemory || (Class26.aByteArrayArrayArray189[0][var1][var2] & 2) != 0 || (Class26.aByteArrayArrayArray189[var0][var1][var2] & 16) == 0) {
            if (var0 < Class26.anInt185) {
                Class26.anInt185 = var0;
            }

            ObjectDefinition var8 = Class5.method17(var3);
            int var9;
            int var10;
            if (var4 != 1 && var4 != 3) {
                var9 = var8.anInt230;
                var10 = var8.anInt222;
            } else {
                var9 = var8.anInt222;
                var10 = var8.anInt230;
            }

            int var11;
            int var12;
            if (var1 + var9 <= 104) {
                var11 = (var9 >> 1) + var1;
                var12 = var1 + (var9 + 1 >> 1);
            } else {
                var11 = var1;
                var12 = var1 + 1;
            }

            int var13;
            int var14;
            if (var10 + var2 <= 104) {
                var13 = var2 + (var10 >> 1);
                var14 = var2 + (var10 + 1 >> 1);
            } else {
                var13 = var2;
                var14 = var2 + 1;
            }

            int[][] var15 = Class26.anIntArrayArrayArray191[var0];
            int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
            int var17 = (var1 << 7) + (var9 << 6);
            int var18 = (var10 << 6) + (var2 << 7);
            int var19 = (var3 << 14) + var1 + (var2 << 7) + 1073741824;
            if (var8.anInt219 == 0) {
                var19 -= Integer.MIN_VALUE;
            }

            int var20 = var5 + (var4 << 6);
            if (var8.anInt928 == 1) {
                var20 += 256;
            }

            if (var8.method1077()) {
                Class55.method350(var0, var1, var2, var8, var4);
            }

            Object var21;
            if (var5 == 22) {
                if (!Client.lowMemory || var8.anInt219 != 0 || var8.anInt229 == 1 || var8.aBoolean2037) {
                    if (var8.anInt818 == -1 && var8.transformIds == null) {
                        var21 = var8.method1072(22, var4, var15, var17, var16, var18);
                    } else {
                        var21 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.anInt818, true, null);
                    }

                    var6.method704(var0, var1, var2, var16, (Entity) var21, var19, var20);
                    if (var8.anInt229 == 1 && var7 != null) {
                        var7.method762(var1, var2);
                    }

                }
            } else {
                int var22;
                if (var5 != 10 && var5 != 11) {
                    if (var5 >= 12) {
                        if (var8.anInt818 == -1 && var8.transformIds == null) {
                            var21 = var8.method1072(var5, var4, var15, var17, var16, var18);
                        } else {
                            var21 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.anInt818, true, null);
                        }

                        var6.method708(var0, var1, var2, var16, 1, 1, (Entity) var21, 0, var19, var20);
                        if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                            Class26.anIntArrayArrayArray186[var0][var1][var2] |= 2340;
                        }

                        if (var8.anInt229 != 0 && var7 != null) {
                            var7.method761(var1, var2, var9, var10, var8.aBoolean223);
                        }

                    } else if (var5 == 0) {
                        if (var8.anInt818 == -1 && var8.transformIds == null) {
                            var21 = var8.method1072(0, var4, var15, var17, var16, var18);
                        } else {
                            var21 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.anInt818, true, null);
                        }

                        var6.method709(var0, var1, var2, var16, (Entity) var21, null, Class26.anIntArray192[var4], 0, var19, var20);
                        if (var4 == 0) {
                            if (var8.clipped) {
                                Class179.aByteArrayArrayArray2145[var0][var1][var2] = 50;
                                Class179.aByteArrayArrayArray2145[var0][var1][var2 + 1] = 50;
                            }

                            if (var8.clipped1) {
                                Class26.anIntArrayArrayArray186[var0][var1][var2] |= 585;
                            }
                        } else if (var4 == 1) {
                            if (var8.clipped) {
                                Class179.aByteArrayArrayArray2145[var0][var1][var2 + 1] = 50;
                                Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2 + 1] = 50;
                            }

                            if (var8.clipped1) {
                                Class26.anIntArrayArrayArray186[var0][var1][var2 + 1] |= 1170;
                            }
                        } else if (var4 == 2) {
                            if (var8.clipped) {
                                Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2] = 50;
                                Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2 + 1] = 50;
                            }

                            if (var8.clipped1) {
                                Class26.anIntArrayArrayArray186[var0][var1 + 1][var2] |= 585;
                            }
                        } else if (var4 == 3) {
                            if (var8.clipped) {
                                Class179.aByteArrayArrayArray2145[var0][var1][var2] = 50;
                                Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2] = 50;
                            }

                            if (var8.clipped1) {
                                Class26.anIntArrayArrayArray186[var0][var1][var2] |= 1170;
                            }
                        }

                        if (var8.anInt229 != 0 && var7 != null) {
                            var7.method766(var1, var2, var5, var4, var8.aBoolean223);
                        }

                        if (var8.anInt233 != 16) {
                            var6.method712(var0, var1, var2, var8.anInt233);
                        }

                    } else if (var5 == 1) {
                        if (var8.anInt818 == -1 && var8.transformIds == null) {
                            var21 = var8.method1072(1, var4, var15, var17, var16, var18);
                        } else {
                            var21 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.anInt818, true, null);
                        }

                        var6.method709(var0, var1, var2, var16, (Entity) var21, null, Class26.anIntArray188[var4], 0, var19, var20);
                        if (var8.clipped) {
                            if (var4 == 0) {
                                Class179.aByteArrayArrayArray2145[var0][var1][var2 + 1] = 50;
                            } else if (var4 == 1) {
                                Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2 + 1] = 50;
                            } else if (var4 == 2) {
                                Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2] = 50;
                            } else if (var4 == 3) {
                                Class179.aByteArrayArrayArray2145[var0][var1][var2] = 50;
                            }
                        }

                        if (var8.anInt229 != 0 && var7 != null) {
                            var7.method766(var1, var2, var5, var4, var8.aBoolean223);
                        }

                    } else {
                        int var25;
                        Object var27;
                        if (var5 == 2) {
                            var25 = var4 + 1 & 3;
                            Object var26;
                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var26 = var8.method1072(2, var4 + 4, var15, var17, var16, var18);
                                var27 = var8.method1072(2, var25, var15, var17, var16, var18);
                            } else {
                                var26 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.anInt818, true, null);
                                var27 = new DynamicObject(var3, 2, var25, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method709(var0, var1, var2, var16, (Entity) var26, (Entity) var27, Class26.anIntArray192[var4], Class26.anIntArray192[var25], var19, var20);
                            if (var8.clipped1) {
                                if (var4 == 0) {
                                    Class26.anIntArrayArrayArray186[var0][var1][var2] |= 585;
                                    Class26.anIntArrayArrayArray186[var0][var1][var2 + 1] |= 1170;
                                } else if (var4 == 1) {
                                    Class26.anIntArrayArrayArray186[var0][var1][var2 + 1] |= 1170;
                                    Class26.anIntArrayArrayArray186[var0][var1 + 1][var2] |= 585;
                                } else if (var4 == 2) {
                                    Class26.anIntArrayArrayArray186[var0][var1 + 1][var2] |= 585;
                                    Class26.anIntArrayArrayArray186[var0][var1][var2] |= 1170;
                                } else if (var4 == 3) {
                                    Class26.anIntArrayArrayArray186[var0][var1][var2] |= 1170;
                                    Class26.anIntArrayArrayArray186[var0][var1][var2] |= 585;
                                }
                            }

                            if (var8.anInt229 != 0 && var7 != null) {
                                var7.method766(var1, var2, var5, var4, var8.aBoolean223);
                            }

                            if (var8.anInt233 != 16) {
                                var6.method712(var0, var1, var2, var8.anInt233);
                            }

                        } else if (var5 == 3) {
                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var21 = var8.method1072(3, var4, var15, var17, var16, var18);
                            } else {
                                var21 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method709(var0, var1, var2, var16, (Entity) var21, null, Class26.anIntArray188[var4], 0, var19, var20);
                            if (var8.clipped) {
                                if (var4 == 0) {
                                    Class179.aByteArrayArrayArray2145[var0][var1][var2 + 1] = 50;
                                } else if (var4 == 1) {
                                    Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2 + 1] = 50;
                                } else if (var4 == 2) {
                                    Class179.aByteArrayArrayArray2145[var0][var1 + 1][var2] = 50;
                                } else if (var4 == 3) {
                                    Class179.aByteArrayArrayArray2145[var0][var1][var2] = 50;
                                }
                            }

                            if (var8.anInt229 != 0 && var7 != null) {
                                var7.method766(var1, var2, var5, var4, var8.aBoolean223);
                            }

                        } else if (var5 == 9) {
                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var21 = var8.method1072(var5, var4, var15, var17, var16, var18);
                            } else {
                                var21 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method708(var0, var1, var2, var16, 1, 1, (Entity) var21, 0, var19, var20);
                            if (var8.anInt229 != 0 && var7 != null) {
                                var7.method761(var1, var2, var9, var10, var8.aBoolean223);
                            }

                            if (var8.anInt233 != 16) {
                                var6.method712(var0, var1, var2, var8.anInt233);
                            }

                        } else if (var5 == 4) {
                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var21 = var8.method1072(4, var4, var15, var17, var16, var18);
                            } else {
                                var21 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method711(var0, var1, var2, var16, (Entity) var21, null, Class26.anIntArray192[var4], 0, 0, 0, var19, var20);
                        } else if (var5 == 5) {
                            var25 = 16;
                            var22 = var6.method671(var0, var1, var2);
                            if (var22 != 0) {
                                var25 = Class5.method17(var22 >> 14 & 32767).anInt233;
                            }

                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var27 = var8.method1072(4, var4, var15, var17, var16, var18);
                            } else {
                                var27 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method711(var0, var1, var2, var16, (Entity) var27, null, Class26.anIntArray192[var4], 0, var25 * Class26.anIntArray187[var4], Class26.anIntArray184[var4] * var25, var19, var20);
                        } else if (var5 == 6) {
                            var25 = 8;
                            var22 = var6.method671(var0, var1, var2);
                            if (var22 != 0) {
                                var25 = Class5.method17(var22 >> 14 & 32767).anInt233 / 2;
                            }

                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var27 = var8.method1072(4, var4 + 4, var15, var17, var16, var18);
                            } else {
                                var27 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method711(var0, var1, var2, var16, (Entity) var27, null, 256, var4, var25 * Class26.anIntArray196[var4], var25 * Class26.anIntArray183[var4], var19, var20);
                        } else if (var5 == 7) {
                            var22 = var4 + 2 & 3;
                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var21 = var8.method1072(4, var22 + 4, var15, var17, var16, var18);
                            } else {
                                var21 = new DynamicObject(var3, 4, var22 + 4, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method711(var0, var1, var2, var16, (Entity) var21, null, 256, var22, 0, 0, var19, var20);
                        } else if (var5 == 8) {
                            var25 = 8;
                            var22 = var6.method671(var0, var1, var2);
                            if (var22 != 0) {
                                var25 = Class5.method17(var22 >> 14 & 32767).anInt233 / 2;
                            }

                            int var28 = var4 + 2 & 3;
                            Object var29;
                            if (var8.anInt818 == -1 && var8.transformIds == null) {
                                var27 = var8.method1072(4, var4 + 4, var15, var17, var16, var18);
                                var29 = var8.method1072(4, var28 + 4, var15, var17, var16, var18);
                            } else {
                                var27 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.anInt818, true, null);
                                var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.anInt818, true, null);
                            }

                            var6.method711(var0, var1, var2, var16, (Entity) var27, (Entity) var29, 256, var4, var25 * Class26.anIntArray196[var4], Class26.anIntArray183[var4] * var25, var19, var20);
                        }
                    }
                } else {
                    if (var8.anInt818 == -1 && var8.transformIds == null) {
                        var21 = var8.method1072(10, var4, var15, var17, var16, var18);
                    } else {
                        var21 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.anInt818, true, null);
                    }

                    if (var21 != null && var6.method708(var0, var1, var2, var16, var9, var10, (Entity) var21, var5 == 11 ? 256 : 0, var19, var20) && var8.clipped) {
                        var22 = 15;
                        if (var21 instanceof Model) {
                            var22 = ((Model) var21).method728() / 4;
                            if (var22 > 30) {
                                var22 = 30;
                            }
                        }

                        for (int var23 = 0; var23 <= var9; ++var23) {
                            for (int var24 = 0; var24 <= var10; ++var24) {
                                if (var22 > Class179.aByteArrayArrayArray2145[var0][var23 + var1][var2 + var24]) {
                                    Class179.aByteArrayArrayArray2145[var0][var23 + var1][var2 + var24] = (byte) var22;
                                }
                            }
                        }
                    }

                    if (var8.anInt229 != 0 && var7 != null) {
                        var7.method761(var1, var2, var9, var10, var8.aBoolean223);
                    }

                }
            }
        }
    }

    static RuneScript method150(byte[] var0) {
        RuneScript var1 = new RuneScript();
        Buffer var2 = new Buffer(var0);
        var2.caret = var2.payload.length - 2;
        int var3 = var2.readUnsignedShort();
        int var4 = var2.payload.length - 2 - var3 - 12;
        var2.caret = var4;
        int var5 = var2.method835();
        var1.anInt327 = var2.readUnsignedShort();
        var1.anInt328 = var2.readUnsignedShort();
        var1.anInt221 = var2.readUnsignedShort();
        var1.anInt220 = var2.readUnsignedShort();
        int var6 = var2.readUnsignedByte();
        int var7;
        int var8;
        if (var6 > 0) {
            var1.aIterableNodeTableArray667 = var1.method390(var6);

            for (var7 = 0; var7 < var6; ++var7) {
                var8 = var2.readUnsignedShort();
                RS3CopyPastedNodeTable var9 = new RS3CopyPastedNodeTable(RS3CopyPastedNodeTable.nextPowerOf2(var8));
                var1.aIterableNodeTableArray667[var7] = var9;

                while (var8-- > 0) {
                    int var10 = var2.method835();
                    int var11 = var2.method835();
                    var9.put(new IntegerNode(var11), (long) var10);
                }
            }
        }

        var2.caret = 0;
        var2.method820();
        var1.anIntArray342 = new int[var5];
        var1.anIntArray340 = new int[var5];
        var1.aStringArray665 = new String[var5];

        for (var7 = 0; var2.caret < var4; var1.anIntArray342[var7++] = var8) {
            var8 = var2.readUnsignedShort();
            if (var8 == 3) {
                var1.aStringArray665[var7] = var2.method819();
            } else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
                var1.anIntArray340[var7] = var2.method835();
            } else {
                var1.anIntArray340[var7] = var2.readUnsignedByte();
            }
        }

        return var1;
    }

    static void setLoginResponse(String var0, String var1, String var2) {
        Login.loginResponseLine1 = var0;
        Login.loginResponseLine2 = var1;
        Login.loginResponseLine3 = var2;
    }

    static InterfaceComponent method148(InterfaceComponent var0) {
        InterfaceComponent var1 = Class36.method264(var0);
        if (var1 == null) {
            var1 = var0.parent;
        }

        return var1;
    }

    static void method146(int var0, int var1) {
        NodeDeque var2 = Client.pickableNodes[Player.floorLevel][var0][var1];
        if (var2 == null) {
            Class60.aSceneGraph631.method719(Player.floorLevel, var0, var1);
        } else {
            long var3 = -99999999L;
            PickableNode var5 = null;

            PickableNode var6;
            for (var6 = (PickableNode) var2.method995(); var6 != null; var6 = (PickableNode) var2.next()) {
                ItemDefinition var7 = Class149.method1001(var6.id);
                long var8 = (long) var7.value;
                if (var7.stackable == 1) {
                    var8 *= (long) (var6.stackSize + 1);
                }

                if (var8 > var3) {
                    var3 = var8;
                    var5 = var6;
                }
            }

            if (var5 == null) {
                Class60.aSceneGraph631.method719(Player.floorLevel, var0, var1);
            } else {
                var2.method993(var5);
                PickableNode var12 = null;
                PickableNode var10 = null;

                for (var6 = (PickableNode) var2.method995(); var6 != null; var6 = (PickableNode) var2.next()) {
                    if (var6.id != var5.id) {
                        if (var12 == null) {
                            var12 = var6;
                        }

                        if (var12.id != var6.id && var10 == null) {
                            var10 = var6;
                        }
                    }
                }

                int var11 = var0 + (var1 << 7) + 1610612736;
                Class60.aSceneGraph631.method700(Player.floorLevel, var0, var1, Class25.method175(var0 * 128 + 64, var1 * 128 + 64, Player.floorLevel), var5, var11, var12, var10);
            }
        }
    }
}
