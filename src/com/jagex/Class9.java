package com.jagex;

public class Class9 {
    public static Class85 aClass85_67;
    static WorldMap worldMap;
    int anInt65;
    byte[][][] aByteArrayArrayArray66;

    Class9(int var1) {
        this.anInt65 = var1;
    }

    public static int method54(int var0, int var1) {
        int var2;
        if (var1 > var0) {
            var2 = var0;
            var0 = var1;
            var1 = var2;
        }

        while (var1 != 0) {
            var2 = var0 % var1;
            var0 = var1;
            var1 = var2;
        }

        return var0;
    }

    static void method50(ScriptEvent var0, int var1) {
        Object[] var2 = var0.args;
        Class147 var3 = var0.aClass147_326;
        boolean var4 = Class147.aClass147_1812 == var3 || var3 == Class147.aClass147_1809 || var3 == Class147.aClass147_1804 || var3 == Class147.aClass147_1813 || Class147.aClass147_1814 == var3 || Class147.aClass147_1815 == var3 || Class147.aClass147_1807 == var3 || Class147.aClass147_1806 == var3;
        int var7;
        int var8;
        int var9;
        RuneScript var13;
        int var14;
        int var17;
        int var21;
        String var25;
        int var26;
        if (var4) {
            Class125.aClass22_1366 = (Class22) var2[0];
            Node_Sub21_Sub15 var5 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[Class125.aClass22_1366.anInt145];
            Class147 var6 = var0.aClass147_326;
            var7 = var5.anInt327;
            var8 = var5.anInt236;
            var9 = Class60.method370(var7, var6);
            RuneScript var10 = (RuneScript) RuneScript.aReferenceCache664.get((long) (var9 << 16));
            RuneScript var11;
            if (var10 != null) {
                var11 = var10;
            } else {
                var25 = String.valueOf(var9);
                var26 = ScriptEvent.runescripts.method1084(var25);
                if (var26 == -1) {
                    var11 = null;
                } else {
                    label597:
                    {
                        byte[] var18 = ScriptEvent.runescripts.method1093(var26);
                        if (var18 != null) {
                            if (var18.length <= 1) {
                                var11 = null;
                                break label597;
                            }

                            var10 = Class22.method150(var18);
                            if (var10 != null) {
                                RuneScript.aReferenceCache664.put(var10, (long) (var9 << 16));
                                var11 = var10;
                                break label597;
                            }
                        }

                        var11 = null;
                    }
                }
            }

            RuneScript var12;
            if (var11 != null) {
                var12 = var11;
            } else {
                var17 = var6.anInt1811 + (var8 + '鱀' << 8);
                RuneScript var38 = (RuneScript) RuneScript.aReferenceCache664.get((long) (var17 << 16));
                RuneScript var19;
                if (var38 != null) {
                    var19 = var38;
                } else {
                    String var24 = String.valueOf(var17);
                    var21 = ScriptEvent.runescripts.method1084(var24);
                    if (var21 == -1) {
                        var19 = null;
                    } else {
                        label531:
                        {
                            byte[] var28 = ScriptEvent.runescripts.method1093(var21);
                            if (var28 != null) {
                                if (var28.length <= 1) {
                                    var19 = null;
                                    break label531;
                                }

                                var38 = Class22.method150(var28);
                                if (var38 != null) {
                                    RuneScript.aReferenceCache664.put(var38, (long) (var17 << 16));
                                    var19 = var38;
                                    break label531;
                                }
                            }

                            var19 = null;
                        }
                    }
                }

                if (var19 != null) {
                    var12 = var19;
                } else {
                    var12 = null;
                }
            }

            var13 = var12;
        } else {
            var14 = ((Integer) var2[0]).intValue();
            var13 = Class6_Sub1.method158(var14);
        }

        if (var13 != null) {
            Class63.anInt644 = 0;
            Class77.anInt828 = 0;
            var14 = -1;
            int[] var37 = var13.anIntArray342;
            int[] var32 = var13.anIntArray340;
            byte var33 = -1;
            Class63.anInt648 = 0;

            int var15;
            try {
                Class63.anIntArray639 = new int[var13.anInt327];
                var8 = 0;
                Class63.aStringArray638 = new String[var13.anInt328];
                var9 = 0;

                int var16;
                String var34;
                for (var15 = 1; var15 < var2.length; ++var15) {
                    if (var2[var15] instanceof Integer) {
                        var16 = ((Integer) var2[var15]).intValue();
                        if (var16 == -2147483647) {
                            var16 = var0.anInt232;
                        }

                        if (var16 == -2147483646) {
                            var16 = var0.anInt327;
                        }

                        if (var16 == -2147483645) {
                            var16 = var0.source != null ? var0.source.uid : -1;
                        }

                        if (var16 == -2147483644) {
                            var16 = var0.anInt328;
                        }

                        if (var16 == -2147483643) {
                            var16 = var0.source != null ? var0.source.componentIndex : -1;
                        }

                        if (var16 == -2147483642) {
                            var16 = var0.anInterfaceComponent323 != null ? var0.anInterfaceComponent323.uid : -1;
                        }

                        if (var16 == -2147483641) {
                            var16 = var0.anInterfaceComponent323 != null ? var0.anInterfaceComponent323.componentIndex : -1;
                        }

                        if (var16 == -2147483640) {
                            var16 = var0.anInt220;
                        }

                        if (var16 == -2147483639) {
                            var16 = var0.anInt217;
                        }

                        Class63.anIntArray639[var8++] = var16;
                    } else if (var2[var15] instanceof String) {
                        var34 = (String) var2[var15];
                        if (var34.equals("event_opbase")) {
                            var34 = var0.aString320;
                        }

                        Class63.aStringArray638[var9++] = var34;
                    }
                }

                var15 = 0;
                Class63.anInt647 = var0.anInt226;

                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                while (true) {
                                                    while (true) {
                                                        while (true) {
                                                            while (true) {
                                                                while (true) {
                                                                    while (true) {
                                                                        while (true) {
                                                                            while (true) {
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                    label352:
                                                                                                                    while (true) {
                                                                                                                        ++var15;
                                                                                                                        if (var15 > var1) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }

                                                                                                                        ++var14;
                                                                                                                        var7 = var37[var14];
                                                                                                                        if (var7 < 100) {
                                                                                                                            if (var7 != 0) {
                                                                                                                                if (var7 != 1) {
                                                                                                                                    if (var7 != 2) {
                                                                                                                                        if (var7 != 3) {
                                                                                                                                            if (var7 != 6) {
                                                                                                                                                if (var7 != 7) {
                                                                                                                                                    if (var7 != 8) {
                                                                                                                                                        if (var7 != 9) {
                                                                                                                                                            if (var7 != 10) {
                                                                                                                                                                if (var7 != 21) {
                                                                                                                                                                    if (var7 != 25) {
                                                                                                                                                                        int var20;
                                                                                                                                                                        if (var7 != 27) {
                                                                                                                                                                            if (var7 != 31) {
                                                                                                                                                                                if (var7 != 32) {
                                                                                                                                                                                    if (var7 != 33) {
                                                                                                                                                                                        if (var7 != 34) {
                                                                                                                                                                                            if (var7 != 35) {
                                                                                                                                                                                                if (var7 != 36) {
                                                                                                                                                                                                    if (var7 != 37) {
                                                                                                                                                                                                        if (var7 != 38) {
                                                                                                                                                                                                            if (var7 != 39) {
                                                                                                                                                                                                                if (var7 != 40) {
                                                                                                                                                                                                                    if (var7 != 42) {
                                                                                                                                                                                                                        if (var7 != 43) {
                                                                                                                                                                                                                            if (var7 == 44) {
                                                                                                                                                                                                                                var16 = var32[var14] >> 16;
                                                                                                                                                                                                                                var17 = var32[var14] & '\uffff';
                                                                                                                                                                                                                                var26 = Class63.anIntArray645[--Class63.anInt644];
                                                                                                                                                                                                                                if (var26 >= 0 && var26 <= 5000) {
                                                                                                                                                                                                                                    Class63.anIntArray642[var16] = var26;
                                                                                                                                                                                                                                    byte var27 = -1;
                                                                                                                                                                                                                                    if (var17 == 105) {
                                                                                                                                                                                                                                        var27 = 0;
                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                    var20 = 0;

                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                        if (var20 >= var26) {
                                                                                                                                                                                                                                            continue label352;
                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                        Class63.anIntArrayArray646[var16][var20] = var27;
                                                                                                                                                                                                                                        ++var20;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                throw new RuntimeException();
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (var7 == 45) {
                                                                                                                                                                                                                                var16 = var32[var14];
                                                                                                                                                                                                                                var17 = Class63.anIntArray645[--Class63.anInt644];
                                                                                                                                                                                                                                if (var17 < 0 || var17 >= Class63.anIntArray642[var16]) {
                                                                                                                                                                                                                                    throw new RuntimeException();
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = Class63.anIntArrayArray646[var16][var17];
                                                                                                                                                                                                                            } else if (var7 == 46) {
                                                                                                                                                                                                                                var16 = var32[var14];
                                                                                                                                                                                                                                Class63.anInt644 -= 2;
                                                                                                                                                                                                                                var17 = Class63.anIntArray645[Class63.anInt644];
                                                                                                                                                                                                                                if (var17 < 0 || var17 >= Class63.anIntArray642[var16]) {
                                                                                                                                                                                                                                    throw new RuntimeException();
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                Class63.anIntArrayArray646[var16][var17] = Class63.anIntArray645[Class63.anInt644 + 1];
                                                                                                                                                                                                                            } else if (var7 == 47) {
                                                                                                                                                                                                                                var34 = Class34.aClass67_277.method401(var32[var14]);
                                                                                                                                                                                                                                if (var34 == null) {
                                                                                                                                                                                                                                    var34 = "null";
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                Class63.aStringArray640[++Class77.anInt828 - 1] = var34;
                                                                                                                                                                                                                            } else if (var7 == 48) {
                                                                                                                                                                                                                                Class34.aClass67_277.method402(var32[var14], Class63.aStringArray640[--Class77.anInt828]);
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                if (var7 != 60) {
                                                                                                                                                                                                                                    throw new IllegalStateException();
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                RS3CopyPastedNodeTable var36 = var13.aIterableNodeTableArray667[var32[var14]];
                                                                                                                                                                                                                                IntegerNode var47 = (IntegerNode) var36.lookup((long) Class63.anIntArray645[--Class63.anInt644]);
                                                                                                                                                                                                                                if (var47 != null) {
                                                                                                                                                                                                                                    var14 += var47.value;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            Class34.aClass67_277.method398(var32[var14], Class63.anIntArray645[--Class63.anInt644]);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = Class34.aClass67_277.method406(var32[var14]);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    var16 = var32[var14];
                                                                                                                                                                                                                    RuneScript var46 = Class6_Sub1.method158(var16);
                                                                                                                                                                                                                    int[] var42 = new int[var46.anInt327];
                                                                                                                                                                                                                    String[] var40 = new String[var46.anInt328];

                                                                                                                                                                                                                    for (var20 = 0; var20 < var46.anInt221; ++var20) {
                                                                                                                                                                                                                        var42[var20] = Class63.anIntArray645[Class63.anInt644 - var46.anInt221 + var20];
                                                                                                                                                                                                                    }

                                                                                                                                                                                                                    for (var20 = 0; var20 < var46.anInt220; ++var20) {
                                                                                                                                                                                                                        var40[var20] = Class63.aStringArray640[var20 + (Class77.anInt828 - var46.anInt220)];
                                                                                                                                                                                                                    }

                                                                                                                                                                                                                    Class63.anInt644 -= var46.anInt221;
                                                                                                                                                                                                                    Class77.anInt828 -= var46.anInt220;
                                                                                                                                                                                                                    Class38 var45 = new Class38();
                                                                                                                                                                                                                    var45.aRuneScript335 = var13;
                                                                                                                                                                                                                    var45.anInt338 = var14;
                                                                                                                                                                                                                    var45.anIntArray337 = Class63.anIntArray639;
                                                                                                                                                                                                                    var45.aStringArray336 = Class63.aStringArray638;
                                                                                                                                                                                                                    Class63.aClass38Array637[++Class63.anInt648 - 1] = var45;
                                                                                                                                                                                                                    var13 = var46;
                                                                                                                                                                                                                    var37 = var46.anIntArray342;
                                                                                                                                                                                                                    var32 = var46.anIntArray340;
                                                                                                                                                                                                                    var14 = -1;
                                                                                                                                                                                                                    Class63.anIntArray639 = var42;
                                                                                                                                                                                                                    Class63.aStringArray638 = var40;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                --Class77.anInt828;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            --Class63.anInt644;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        var16 = var32[var14];
                                                                                                                                                                                                        Class77.anInt828 -= var16;
                                                                                                                                                                                                        var25 = Class133.method914(Class63.aStringArray640, Class77.anInt828, var16);
                                                                                                                                                                                                        Class63.aStringArray640[++Class77.anInt828 - 1] = var25;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    Class63.aStringArray638[var32[var14]] = Class63.aStringArray640[--Class77.anInt828];
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                Class63.aStringArray640[++Class77.anInt828 - 1] = Class63.aStringArray638[var32[var14]];
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            Class63.anIntArray639[var32[var14]] = Class63.anIntArray645[--Class63.anInt644];
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = Class63.anIntArray639[var32[var14]];
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    Class63.anInt644 -= 2;
                                                                                                                                                                                    if (Class63.anIntArray645[Class63.anInt644] >= Class63.anIntArray645[Class63.anInt644 + 1]) {
                                                                                                                                                                                        var14 += var32[var14];
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                Class63.anInt644 -= 2;
                                                                                                                                                                                if (Class63.anIntArray645[Class63.anInt644] <= Class63.anIntArray645[Class63.anInt644 + 1]) {
                                                                                                                                                                                    var14 += var32[var14];
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            var16 = var32[var14];
                                                                                                                                                                            var17 = Class63.anIntArray645[--Class63.anInt644];
                                                                                                                                                                            Varpbit var39 = (Varpbit) Varpbit.varpbitCache.get((long) var16);
                                                                                                                                                                            Varpbit var41;
                                                                                                                                                                            if (var39 != null) {
                                                                                                                                                                                var41 = var39;
                                                                                                                                                                            } else {
                                                                                                                                                                                byte[] var44 = Varpbit.varpbitTable.unpack(14, var16);
                                                                                                                                                                                var39 = new Varpbit();
                                                                                                                                                                                if (var44 != null) {
                                                                                                                                                                                    var39.decode(new Buffer(var44));
                                                                                                                                                                                }

                                                                                                                                                                                Varpbit.varpbitCache.put(var39, (long) var16);
                                                                                                                                                                                var41 = var39;
                                                                                                                                                                            }

                                                                                                                                                                            var20 = var41.varpIndex;
                                                                                                                                                                            var21 = var41.lower;
                                                                                                                                                                            int var22 = var41.upper;
                                                                                                                                                                            int var23 = Varps.masks[var22 - var21];
                                                                                                                                                                            if (var17 < 0 || var17 > var23) {
                                                                                                                                                                                var17 = 0;
                                                                                                                                                                            }

                                                                                                                                                                            var23 <<= var21;
                                                                                                                                                                            Varps.values[var20] = Varps.values[var20] & ~var23 | var17 << var21 & var23;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        var16 = var32[var14];
                                                                                                                                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = Varpbit.getValue(var16);
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    if (Class63.anInt648 == 0) {
                                                                                                                                                                        return;
                                                                                                                                                                    }

                                                                                                                                                                    Class38 var35 = Class63.aClass38Array637[--Class63.anInt648];
                                                                                                                                                                    var13 = var35.aRuneScript335;
                                                                                                                                                                    var37 = var13.anIntArray342;
                                                                                                                                                                    var32 = var13.anIntArray340;
                                                                                                                                                                    var14 = var35.anInt338;
                                                                                                                                                                    Class63.anIntArray639 = var35.anIntArray337;
                                                                                                                                                                    Class63.aStringArray638 = var35.aStringArray336;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                Class63.anInt644 -= 2;
                                                                                                                                                                if (Class63.anIntArray645[Class63.anInt644] > Class63.anIntArray645[Class63.anInt644 + 1]) {
                                                                                                                                                                    var14 += var32[var14];
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            Class63.anInt644 -= 2;
                                                                                                                                                            if (Class63.anIntArray645[Class63.anInt644] < Class63.anIntArray645[Class63.anInt644 + 1]) {
                                                                                                                                                                var14 += var32[var14];
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        Class63.anInt644 -= 2;
                                                                                                                                                        if (Class63.anIntArray645[Class63.anInt644 + 1] == Class63.anIntArray645[Class63.anInt644]) {
                                                                                                                                                            var14 += var32[var14];
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    Class63.anInt644 -= 2;
                                                                                                                                                    if (Class63.anIntArray645[Class63.anInt644] != Class63.anIntArray645[Class63.anInt644 + 1]) {
                                                                                                                                                        var14 += var32[var14];
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                var14 += var32[var14];
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            Class63.aStringArray640[++Class77.anInt828 - 1] = var13.aStringArray665[var14];
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var16 = var32[var14];
                                                                                                                                        Varps.values[var16] = Class63.anIntArray645[--Class63.anInt644];
                                                                                                                                        Class14.method129(var16);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var16 = var32[var14];
                                                                                                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = Varps.values[var16];
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var32[var14];
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            boolean var43;
                                                                                                                           var43 = var13.anIntArray340[var14] == 1;

                                                                                                                            var17 = ScriptEvent.method359(var7, var13, var43);
                                                                                                                            switch (var17) {
                                                                                                                                case 0:
                                                                                                                                    return;
                                                                                                                                case 1:
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                                case 2:
                                                                                                                                    throw new IllegalStateException();
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
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception var31) {
                StringBuilder var30 = new StringBuilder(30);
                var30.append("").append(var13.key).append(" ");

                for (var15 = Class63.anInt648 - 1; var15 >= 0; --var15) {
                    var30.append("").append(Class63.aClass38Array637[var15].aRuneScript335.key).append(" ");
                }

                var30.append("").append(var33);
                Client.method332(var30.toString(), var31);
            }
        }
    }

    void method53(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (var7 != 0 && this.anInt65 != 0 && this.aByteArrayArrayArray66 != null) {
            var8 = this.method49(var8, var7);
            var7 = this.method47(var7);
            DrawingArea.method1204(var1, var2, var5, var6, var3, var4, this.aByteArrayArrayArray66[var7 - 1][var8], this.anInt65);
        }
    }

    void method56() {
        if (this.aByteArrayArrayArray66 == null) {
            this.aByteArrayArrayArray66 = new byte[8][4][];
            this.method57();
            this.method58();
            this.method48();
            this.method46();
            this.method52();
            this.method55();
            this.method51();
            this.method45();
        }
    }

    void method57() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        int var2 = 0;

        int var3;
        int var4;
        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[0][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[0][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= var3) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[0][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= var3) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[0][3] = var1;
    }

    void method58() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        int var2 = 0;

        int var3;
        int var4;
        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[1][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var2 >= 0 && var2 < var1.length) {
                    if (var4 >= var3 << 1) {
                        var1[var2] = -1;
                    }

                    ++var2;
                } else {
                    ++var2;
                }
            }
        }

        this.aByteArrayArrayArray66[1][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[1][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 >= var3 << 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[1][3] = var1;
    }

    void method48() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        int var2 = 0;

        int var3;
        int var4;
        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[2][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= var3 << 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[2][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[2][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 >= var3 << 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[2][3] = var1;
    }

    void method46() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        int var2 = 0;

        int var3;
        int var4;
        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[3][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3 << 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[3][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[3][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 <= var3 << 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[3][3] = var1;
    }

    void method52() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        int var2 = 0;

        int var3;
        int var4;
        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[4][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3 << 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[4][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[4][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var2 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 <= var3 << 1) {
                    var1[var2] = -1;
                }

                ++var2;
            }
        }

        this.aByteArrayArrayArray66[4][3] = var1;
    }

    void method51() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        boolean var2 = false;
        var1 = new byte[this.anInt65 * this.anInt65];
        int var5 = 0;

        int var3;
        int var4;
        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[6][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[6][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 <= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[6][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 <= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[6][3] = var1;
    }

    void method55() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        boolean var2 = false;
        var1 = new byte[this.anInt65 * this.anInt65];
        int var5 = 0;

        int var3;
        int var4;
        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 <= this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[5][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var3 <= this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[5][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[5][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var3 >= this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[5][3] = var1;
    }

    int method49(int var1, int var2) {
        if (var2 == 9) {
            var1 = var1 + 1 & 3;
        }

        if (var2 == 10) {
            var1 = var1 + 3 & 3;
        }

        if (var2 == 11) {
            var1 = var1 + 3 & 3;
        }

        return var1;
    }

    void method45() {
        byte[] var1 = new byte[this.anInt65 * this.anInt65];
        boolean var2 = false;
        var1 = new byte[this.anInt65 * this.anInt65];
        int var5 = 0;

        int var3;
        int var4;
        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[7][0] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = 0; var4 < this.anInt65; ++var4) {
                if (var4 >= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[7][1] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = this.anInt65 - 1; var3 >= 0; --var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 >= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[7][2] = var1;
        var1 = new byte[this.anInt65 * this.anInt65];
        var5 = 0;

        for (var3 = 0; var3 < this.anInt65; ++var3) {
            for (var4 = this.anInt65 - 1; var4 >= 0; --var4) {
                if (var4 >= var3 - this.anInt65 / 2) {
                    var1[var5] = -1;
                }

                ++var5;
            }
        }

        this.aByteArrayArrayArray66[7][3] = var1;
    }

    int method47(int var1) {
        if (var1 != 9 && var1 != 10) {
            return var1 == 11 ? 8 : var1;
        }
        return 1;
    }
}
