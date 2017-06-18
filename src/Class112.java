public class Class112 {
    static int anInt1331;
    static int[][] anIntArrayArray1327 = new int[128][128];
    static int[][] anIntArrayArray1328 = new int[128][128];
    static int[] anIntArray1330 = new int[4096];
    static int[] anIntArray1329 = new int[4096];

    static void method773(InterfaceComponent var0, int var1, int var2) {
        if (var0.buttonType == 1) {
            Class12_Sub1.method125(var0.aString1935, "", 24, 0, 0, var0.uid);
        }

        String var3;
        if (var0.buttonType == 2 && !Client.spellSelected) {
            if (Class15.method130(Class75.method448(var0)) == 0) {
                var3 = null;
            } else if (var0.selectedAction != null && var0.selectedAction.trim().length() != 0) {
                var3 = var0.selectedAction;
            } else {
                var3 = null;
            }

            if (var3 != null) {
                Class12_Sub1.method125(var3, Class75.method449(65280) + var0.aString1925, 25, 0, -1, var0.uid);
            }
        }

        if (var0.buttonType == 3) {
            Class12_Sub1.method125("Close", "", 26, 0, 0, var0.uid);
        }

        if (var0.buttonType == 4) {
            Class12_Sub1.method125(var0.aString1935, "", 28, 0, 0, var0.uid);
        }

        if (var0.buttonType == 5) {
            Class12_Sub1.method125(var0.aString1935, "", 29, 0, 0, var0.uid);
        }

        if (var0.buttonType == 6 && Client.anInterfaceComponent1627 == null) {
            Class12_Sub1.method125(var0.aString1935, "", 30, 0, -1, var0.uid);
        }

        int var5;
        int var7;
        int var8;
        if (var0.type == 2) {
            var5 = 0;

            for (int var6 = 0; var6 < var0.height; ++var6) {
                for (var7 = 0; var7 < var0.width; ++var7) {
                    var8 = var7 * (var0.xPadding + 32);
                    int var9 = (var0.yPadding + 32) * var6;
                    if (var5 < 20) {
                        var8 += var0.anIntArray1881[var5];
                        var9 += var0.anIntArray1885[var5];
                    }

                    if (var1 >= var8 && var2 >= var9 && var1 < var8 + 32 && var2 < var9 + 32) {
                        Client.anInt1590 = var5;
                        Projectile.anInterfaceComponent809 = var0;
                        if (var0.itemIds[var5] > 0) {
                            ItemDefinition var10 = Class149.method1001(var0.itemIds[var5] - 1);
                            if (Client.itemSelectionState == 1 && Class1.method3(Class75.method448(var0))) {
                                if (var0.uid != Class2.anInt15 || var5 != Class55.anInt421) {
                                    Class12_Sub1.method125("Use", Client.latestSelectedItemName + " " + "->" + " " + Class75.method449(16748608) + var10.name, 31, var10.id, var5, var0.uid);
                                }
                            } else if (Client.spellSelected && Class1.method3(Class75.method448(var0))) {
                                if ((Class162.anInt1957 & 16) == 16) {
                                    Class12_Sub1.method125(Client.aString1623, Client.aString1616 + " " + "->" + " " + Class75.method449(16748608) + var10.name, 32, var10.id, var5, var0.uid);
                                }
                            } else {
                                String[] var11 = var10.actions;
                                if (Client.aBoolean1650) {
                                    var11 = Class51.method323(var11);
                                }

                                int var12 = var10.method859();
                                int var13;
                                boolean var14;
                                byte var15;
                                if (Class1.method3(Class75.method448(var0))) {
                                    for (var13 = 4; var13 >= 3; --var13) {
                                        var14 = var12 == var13;
                                        if (var11 != null && var11[var13] != null) {
                                            if (var13 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }

                                            Class61.method373(var11[var13], Class75.method449(16748608) + var10.name, var15, var10.id, var5, var0.uid, var14);
                                        } else if (var13 == 4) {
                                            Class61.method373("Drop", Class75.method449(16748608) + var10.name, 37, var10.id, var5, var0.uid, var14);
                                        }
                                    }
                                }

                                if (Class62.method378(Class75.method448(var0))) {
                                    Class12_Sub1.method125("Use", Class75.method449(16748608) + var10.name, 38, var10.id, var5, var0.uid);
                                }

                                if (Class1.method3(Class75.method448(var0)) && var11 != null) {
                                    for (var13 = 2; var13 >= 0; --var13) {
                                        var14 = var12 == var13;
                                        if (var11[var13] != null) {
                                            var15 = 0;
                                            if (var13 == 0) {
                                                var15 = 33;
                                            }

                                            if (var13 == 1) {
                                                var15 = 34;
                                            }

                                            if (var13 == 2) {
                                                var15 = 35;
                                            }

                                            Class61.method373(var11[var13], Class75.method449(16748608) + var10.name, var15, var10.id, var5, var0.uid, var14);
                                        }
                                    }
                                }

                                var11 = var0.tableActions;
                                if (Client.aBoolean1650) {
                                    var11 = Class51.method323(var11);
                                }

                                if (var11 != null) {
                                    for (var13 = 4; var13 >= 0; --var13) {
                                        if (var11[var13] != null) {
                                            byte var19 = 0;
                                            if (var13 == 0) {
                                                var19 = 39;
                                            }

                                            if (var13 == 1) {
                                                var19 = 40;
                                            }

                                            if (var13 == 2) {
                                                var19 = 41;
                                            }

                                            if (var13 == 3) {
                                                var19 = 42;
                                            }

                                            if (var13 == 4) {
                                                var19 = 43;
                                            }

                                            Class12_Sub1.method125(var11[var13], Class75.method449(16748608) + var10.name, var19, var10.id, var5, var0.uid);
                                        }
                                    }
                                }

                                Class12_Sub1.method125("Examine", Class75.method449(16748608) + var10.name, 1005, var10.id, var5, var0.uid);
                            }
                        }
                    }

                    ++var5;
                }
            }
        }

        if (var0.aBoolean1173) {
            if (Client.spellSelected) {
                if (Class153.method1008(Class75.method448(var0)) && (Class162.anInt1957 & 32) == 32) {
                    Class12_Sub1.method125(Client.aString1623, Client.aString1616 + " " + "->" + " " + var0.aString1895, 58, 0, var0.componentIndex, var0.uid);
                }
            } else {
                boolean var18;
                for (var5 = 9; var5 >= 5; --var5) {
                    var8 = Class75.method448(var0);
                    var18 = (var8 >> var5 + 1 & 1) != 0;
                    String var4;
                    if (!var18 && var0.anObjectArray1907 == null) {
                        var4 = null;
                    } else if (var0.actions != null && var0.actions.length > var5 && var0.actions[var5] != null && var0.actions[var5].trim().length() != 0) {
                        var4 = var0.actions[var5];
                    } else {
                        var4 = null;
                    }

                    if (var4 != null) {
                        Class12_Sub1.method125(var4, var0.aString1895, 1007, var5 + 1, var0.componentIndex, var0.uid);
                    }
                }

                if (Class15.method130(Class75.method448(var0)) == 0) {
                    var3 = null;
                } else if (var0.selectedAction != null && var0.selectedAction.trim().length() != 0) {
                    var3 = var0.selectedAction;
                } else {
                    var3 = null;
                }

                if (var3 != null) {
                    Class12_Sub1.method125(var3, var0.aString1895, 25, 0, var0.componentIndex, var0.uid);
                }

                for (var7 = 4; var7 >= 0; --var7) {
                    String var17 = InterfaceComponent.method333(var0, var7);
                    if (var17 != null) {
                        Class12_Sub1.method125(var17, var0.aString1895, 57, var7 + 1, var0.componentIndex, var0.uid);
                    }
                }

                var8 = Class75.method448(var0);
                var18 = (var8 & 1) != 0;
                if (var18) {
                    Class12_Sub1.method125("Continue", "", 30, 0, var0.componentIndex, var0.uid);
                }
            }
        }

    }

    static boolean method771(String var0, boolean var1) {
        if (var0 == null) {
            return false;
        } else {
            String var2 = Class84.method484(var0, Class2.aClass188_13);

            for (int var3 = 0; var3 < Client.anInt1431; ++var3) {
                if (var2.equalsIgnoreCase(Class84.method484(Client.aClass27Array1449[var3].aString198, Class2.aClass188_13)) && (!var1 || Client.aClass27Array1449[var3].anInt200 != 0)) {
                    return true;
                }
            }

            return var2.equalsIgnoreCase(Class84.method484(Client.player.name, Class2.aClass188_13));
        }
    }

    public static String method772(Buffer var0, int var1) {
        try {
            int var2 = var0.method541();
            if (var2 > var1) {
                var2 = var1;
            }

            byte[] var3 = new byte[var2];
            var0.caret += Class181.aClass118_2154.method800(var0.payload, var0.caret, var3, 0, var2);
            return Class6_Sub2.method458(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    public static int method774(int var0, int var1, int var2, int var3, int var4, int var5) {
        if ((var5 & 1) == 1) {
            int var6 = var3;
            var3 = var4;
            var4 = var6;
        }

        var2 &= 3;
        if (var2 == 0) {
            return var0;
        } else if (var2 == 1) {
            return var1;
        } else {
            return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
        }
    }
}
