package com.jagex;

import java.util.Date;

public class ScriptEvent extends Node {
    static Class176 aClass176_329;
    static CacheReferenceTable aCacheReferenceTable322;
    static Class103 aClass103_330;
    Object[] args;
    InterfaceComponent source;
    int anInt232;
    int anInt328;
    boolean aBoolean324;
    int anInt220;
    int anInt217;
    InterfaceComponent anInterfaceComponent323;
    int anInt226;
    Class147 aClass147_326;
    String aString320;
    int anInt327;

    public ScriptEvent() {
        this.aClass147_326 = Class147.aClass147_1803;
    }

    public static Node_Sub21_Sub21 method269(int var0) {
        Node_Sub21_Sub21 var1 = (Node_Sub21_Sub21) Node_Sub21_Sub21.aReferenceCache2013.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Node_Sub21_Sub21.aReferenceTable2012.method1085(3, var0);
            var1 = new Node_Sub21_Sub21();
            if (var2 != null) {
                var1.method1052(new Buffer(var2));
            }

            Node_Sub21_Sub21.aReferenceCache2013.method975(var1, (long) var0);
            return var1;
        }
    }

    static void method273() {
        if (Player.aClass84_231 != null) {
            Player.aClass84_231.method491();
        }

        if (Class105.aClass84_1244 != null) {
            Class105.aClass84_1244.method491();
        }

    }

    public static int method271(CharSequence var0) {
        int var1 = var0.length();
        int var2 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            var2 = (var2 << 5) - var2 + Class149.method1002(var0.charAt(var3));
        }

        return var2;
    }

    public static String method272(CharSequence var0) {
        int var1 = var0.length();
        char[] var2 = new char[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = '*';
        }

        return new String(var2);
    }

    static int method392(int var0, RuneScript var1, boolean var2) {
        int var3;
        if (var0 == 3903) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.grandExchangeOffers[var3].method421();
            return 1;
        } else if (var0 == 3904) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.grandExchangeOffers[var3].itemId;
            return 1;
        } else if (var0 == 3905) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.grandExchangeOffers[var3].itemPrice;
            return 1;
        } else if (var0 == 3906) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.grandExchangeOffers[var3].itemQuantity;
            return 1;
        } else if (var0 == 3907) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.grandExchangeOffers[var3].transferred;
            return 1;
        } else if (var0 == 3908) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.grandExchangeOffers[var3].spent;
            return 1;
        } else {
            int var12;
            if (var0 == 3910) {
                var3 = Class63.anIntArray645[--Class63.anInt644];
                var12 = Client.grandExchangeOffers[var3].method423();
                Class63.anIntArray645[++Class63.anInt644 - 1] = var12 == 0 ? 1 : 0;
                return 1;
            } else if (var0 == 3911) {
                var3 = Class63.anIntArray645[--Class63.anInt644];
                var12 = Client.grandExchangeOffers[var3].method423();
                Class63.anIntArray645[++Class63.anInt644 - 1] = var12 == 2 ? 1 : 0;
                return 1;
            } else if (var0 == 3912) {
                var3 = Class63.anIntArray645[--Class63.anInt644];
                var12 = Client.grandExchangeOffers[var3].method423();
                Class63.anIntArray645[++Class63.anInt644 - 1] = var12 == 5 ? 1 : 0;
                return 1;
            } else if (var0 == 3913) {
                var3 = Class63.anIntArray645[--Class63.anInt644];
                var12 = Client.grandExchangeOffers[var3].method423();
                Class63.anIntArray645[++Class63.anInt644 - 1] = var12 == 1 ? 1 : 0;
                return 1;
            } else {
                boolean var13;
                if (var0 == 3914) {
                    var13 = Class63.anIntArray645[--Class63.anInt644] == 1;
                    if (Client.aClass43_1459 != null) {
                        Client.aClass43_1459.method296(Class43.aComparator362, var13);
                    }

                    return 1;
                } else if (var0 == 3915) {
                    var13 = Class63.anIntArray645[--Class63.anInt644] == 1;
                    if (Client.aClass43_1459 != null) {
                        Client.aClass43_1459.method296(Class43.aComparator363, var13);
                    }

                    return 1;
                } else if (var0 == 3916) {
                    Class63.anInt644 -= 2;
                    var13 = Class63.anIntArray645[Class63.anInt644] == 1;
                    boolean var4 = Class63.anIntArray645[Class63.anInt644 + 1] == 1;
                    if (Client.aClass43_1459 != null) {
                        Client.aClass43_1459.method296(new Class44(var4), var13);
                    }

                    return 1;
                } else if (var0 == 3917) {
                    var13 = Class63.anIntArray645[--Class63.anInt644] == 1;
                    if (Client.aClass43_1459 != null) {
                        Client.aClass43_1459.method296(Class43.aComparator366, var13);
                    }

                    return 1;
                } else if (var0 == 3918) {
                    var13 = Class63.anIntArray645[--Class63.anInt644] == 1;
                    if (Client.aClass43_1459 != null) {
                        Client.aClass43_1459.method296(Class43.aComparator365, var13);
                    }

                    return 1;
                } else if (var0 == 3919) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = Client.aClass43_1459 == null ? 0 : Client.aClass43_1459.aList359.size();
                    return 1;
                } else {
                    Class53 var5;
                    if (var0 == 3920) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var5 = (Class53) Client.aClass43_1459.aList359.get(var3);
                        Class63.anIntArray645[++Class63.anInt644 - 1] = var5.anInt406;
                        return 1;
                    } else if (var0 == 3921) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var5 = (Class53) Client.aClass43_1459.aList359.get(var3);
                        Class63.aStringArray640[++Class77.anInt828 - 1] = var5.method336();
                        return 1;
                    } else if (var0 == 3922) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var5 = (Class53) Client.aClass43_1459.aList359.get(var3);
                        Class63.aStringArray640[++Class77.anInt828 - 1] = var5.method340();
                        return 1;
                    } else if (var0 == 3923) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var5 = (Class53) Client.aClass43_1459.aList359.get(var3);
                        long var6 = Class124.method873() - Tile.aLong1166 - var5.aLong412;
                        int var8 = (int) (var6 / 3600000L);
                        int var9 = (int) ((var6 - (long) (var8 * 3600000)) / 60000L);
                        int var10 = (int) ((var6 - (long) (var8 * 3600000) - (long) (var9 * '\uea60')) / 1000L);
                        String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                        Class63.aStringArray640[++Class77.anInt828 - 1] = var11;
                        return 1;
                    } else if (var0 == 3924) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var5 = (Class53) Client.aClass43_1459.aList359.get(var3);
                        Class63.anIntArray645[++Class63.anInt644 - 1] = var5.aGrandExchangeOffer408.itemQuantity;
                        return 1;
                    } else if (var0 == 3925) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var5 = (Class53) Client.aClass43_1459.aList359.get(var3);
                        Class63.anIntArray645[++Class63.anInt644 - 1] = var5.aGrandExchangeOffer408.itemPrice;
                        return 1;
                    } else if (var0 == 3926) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var5 = (Class53) Client.aClass43_1459.aList359.get(var3);
                        Class63.anIntArray645[++Class63.anInt644 - 1] = var5.aGrandExchangeOffer408.itemId;
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        }
    }

    static int method410(int var0, RuneScript var1, boolean var2) {
        if (var0 == 5630) {
            Client.specialScript = 250;
            return 1;
        } else {
            return 2;
        }
    }

    static int method359(int var0, RuneScript var1, boolean var2) {
        int var3;
        int var5;
        int var8;
        byte var11;
        int var24;
        InterfaceComponent var29;
        InterfaceComponent var67;
        if (var0 < 1000) {
            if (var0 == 100) {
                Class63.anInt644 -= 3;
                var3 = Class63.anIntArray645[Class63.anInt644];
                var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                var5 = Class63.anIntArray645[Class63.anInt644 + 2];
                if (var24 == 0) {
                    throw new RuntimeException();
                }

                var29 = Class161.method1016(var3);
                if (var29.components == null) {
                    var29.components = new InterfaceComponent[var5 + 1];
                }

                if (var29.components.length <= var5) {
                    InterfaceComponent[] var34 = new InterfaceComponent[var5 + 1];

                    for (var8 = 0; var8 < var29.components.length; ++var8) {
                        var34[var8] = var29.components[var8];
                    }

                    var29.components = var34;
                }

                if (var5 > 0 && var29.components[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }

                InterfaceComponent var35 = new InterfaceComponent();
                var35.type = var24;
                var35.parentUid = var35.uid = var29.uid;
                var35.componentIndex = var5;
                var35.aBoolean1173 = true;
                var29.components[var5] = var35;
                if (var2) {
                    Class18.anInterfaceComponent129 = var35;
                } else {
                    MapTile.anInterfaceComponent83 = var35;
                }

                ItemTable.method284(var29);
                var11 = 1;
            } else if (var0 == 101) {
                var67 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
                InterfaceComponent var65 = Class161.method1016(var67.uid);
                var65.components[var67.componentIndex] = null;
                ItemTable.method284(var65);
                var11 = 1;
            } else if (var0 == 102) {
                var67 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
                var67.components = null;
                ItemTable.method284(var67);
                var11 = 1;
            } else if (var0 == 200) {
                Class63.anInt644 -= 2;
                var3 = Class63.anIntArray645[Class63.anInt644];
                var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                InterfaceComponent var52 = Class127.method877(var3, var24);
                if (var52 != null && var24 != -1) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 1;
                    if (var2) {
                        Class18.anInterfaceComponent129 = var52;
                    } else {
                        MapTile.anInterfaceComponent83 = var52;
                    }
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                }

                var11 = 1;
            } else if (var0 == 201) {
                var67 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
                if (var67 != null) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 1;
                    if (var2) {
                        Class18.anInterfaceComponent129 = var67;
                    } else {
                        MapTile.anInterfaceComponent83 = var67;
                    }
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                }

                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 1100) {
            return Class53.method337(var0, var1, var2);
        } else if (var0 < 1200) {
            return MouseRecorder.method212(var0, var1, var2);
        } else if (var0 < 1300) {
            return Class119.method806(var0, var1, var2);
        } else if (var0 < 1400) {
            return Class12.method69(var0, var1, var2);
        } else if (var0 < 1500) {
            return TileDecor.method613(var0, var1, var2);
        } else if (var0 < 1600) {
            var29 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
            if (var0 == 1500) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.relativeX;
                var11 = 1;
            } else if (var0 == 1501) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.relativeY;
                var11 = 1;
            } else if (var0 == 1502) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.width;
                var11 = 1;
            } else if (var0 == 1503) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.height;
                var11 = 1;
            } else if (var0 == 1504) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.explicitlyHidden ? 1 : 0;
                var11 = 1;
            } else if (var0 == 1505) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.parentUid;
                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 1700) {
            var67 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
            if (var0 == 1600) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.insetX;
                var11 = 1;
            } else if (var0 == 1601) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.insetY;
                var11 = 1;
            } else if (var0 == 1602) {
                Class63.aStringArray640[++Class77.anInt828 - 1] = var67.text;
                var11 = 1;
            } else if (var0 == 1603) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.viewportWidth;
                var11 = 1;
            } else if (var0 == 1604) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.viewportHeight;
                var11 = 1;
            } else if (var0 == 1605) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.modelZoom;
                var11 = 1;
            } else if (var0 == 1606) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.xRotation;
                var11 = 1;
            } else if (var0 == 1607) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.yRotation;
                var11 = 1;
            } else if (var0 == 1608) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.zRotation;
                var11 = 1;
            } else if (var0 == 1609) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.anInt1864;
                var11 = 1;
            } else if (var0 == 1610) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.anInt1860;
                var11 = 1;
            } else if (var0 == 1611) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.textColor;
                var11 = 1;
            } else if (var0 == 1612) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.anInt761;
                var11 = 1;
            } else if (var0 == 1613) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.aClass172_1865.ordinal();
                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 1800) {
            var29 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
            if (var0 == 1700) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.itemId;
                var11 = 1;
            } else if (var0 == 1701) {
                if (var29.itemId != -1) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = var29.itemStackSize;
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                }

                var11 = 1;
            } else if (var0 == 1702) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var29.componentIndex;
                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 1900) {
            var67 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
            if (var0 == 1800) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Class15.method130(Class75.method448(var67));
                var11 = 1;
            } else if (var0 == 1801) {
                var24 = Class63.anIntArray645[--Class63.anInt644];
                --var24;
                if (var67.actions != null && var24 < var67.actions.length && var67.actions[var24] != null) {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var67.actions[var24];
                } else {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                }

                var11 = 1;
            } else if (var0 == 1802) {
                if (var67.aString1895 == null) {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                } else {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var67.aString1895;
                }

                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 2000) {
            return Class101.method654(var0, var1, var2);
        } else if (var0 < 2100) {
            return Class53.method337(var0, var1, var2);
        } else if (var0 < 2200) {
            return MouseRecorder.method212(var0, var1, var2);
        } else if (var0 < 2300) {
            return Class119.method806(var0, var1, var2);
        } else if (var0 < 2400) {
            return Class12.method69(var0, var1, var2);
        } else if (var0 < 2500) {
            return TileDecor.method613(var0, var1, var2);
        } else if (var0 < 2600) {
            var67 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
            if (var0 == 2500) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.relativeX;
                var11 = 1;
            } else if (var0 == 2501) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.relativeY;
                var11 = 1;
            } else if (var0 == 2502) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.width;
                var11 = 1;
            } else if (var0 == 2503) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.height;
                var11 = 1;
            } else if (var0 == 2504) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.explicitlyHidden ? 1 : 0;
                var11 = 1;
            } else if (var0 == 2505) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.parentUid;
                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 2700) {
            var67 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
            if (var0 == 2600) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.insetX;
                var11 = 1;
            } else if (var0 == 2601) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.insetY;
                var11 = 1;
            } else if (var0 == 2602) {
                Class63.aStringArray640[++Class77.anInt828 - 1] = var67.text;
                var11 = 1;
            } else if (var0 == 2603) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.viewportWidth;
                var11 = 1;
            } else if (var0 == 2604) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.viewportHeight;
                var11 = 1;
            } else if (var0 == 2605) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.modelZoom;
                var11 = 1;
            } else if (var0 == 2606) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.xRotation;
                var11 = 1;
            } else if (var0 == 2607) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.yRotation;
                var11 = 1;
            } else if (var0 == 2608) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.zRotation;
                var11 = 1;
            } else if (var0 == 2609) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.anInt1864;
                var11 = 1;
            } else if (var0 == 2610) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.anInt1860;
                var11 = 1;
            } else if (var0 == 2611) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.textColor;
                var11 = 1;
            } else if (var0 == 2612) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.anInt761;
                var11 = 1;
            } else if (var0 == 2613) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.aClass172_1865.ordinal();
                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 2800) {
            if (var0 == 2700) {
                var67 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
                Class63.anIntArray645[++Class63.anInt644 - 1] = var67.itemId;
                var11 = 1;
            } else if (var0 == 2701) {
                var67 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
                if (var67.itemId != -1) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = var67.itemStackSize;
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                }

                var11 = 1;
            } else if (var0 == 2702) {
                var3 = Class63.anIntArray645[--Class63.anInt644];
                InterfaceNode var64 = Client.interfaceNodes.lookup((long) var3);
                if (var64 != null) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 1;
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                }

                var11 = 1;
            } else if (var0 == 2706) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.anInt1632;
                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 2900) {
            var67 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
            if (var0 == 2800) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Class15.method130(Class75.method448(var67));
                var11 = 1;
            } else if (var0 == 2801) {
                var24 = Class63.anIntArray645[--Class63.anInt644];
                --var24;
                if (var67.actions != null && var24 < var67.actions.length && var67.actions[var24] != null) {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var67.actions[var24];
                } else {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                }

                var11 = 1;
            } else if (var0 == 2802) {
                if (var67.aString1895 == null) {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                } else {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var67.aString1895;
                }

                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 3000) {
            return Class101.method654(var0, var1, var2);
        } else if (var0 < 3200) {
            return Class178.method1191(var0, var1, var2);
        } else if (var0 < 3300) {
            if (var0 == 3200) {
                Class63.anInt644 -= 3;
                var3 = Class63.anIntArray645[Class63.anInt644];
                var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                var5 = Class63.anIntArray645[Class63.anInt644 + 2];
                if (Client.anInt1704 != 0 && var24 != 0 && Client.anInt1430 < 50) {
                    Client.anIntArray1709[Client.anInt1430] = var3;
                    Client.anIntArray1713[Client.anInt1430] = var24;
                    Client.anIntArray1712[Client.anInt1430] = var5;
                    Client.audioEffects[Client.anInt1430] = null;
                    Client.anIntArray1429[Client.anInt1430] = 0;
                    ++Client.anInt1430;
                }

                var11 = 1;
            } else if (var0 == 3201) {
                var3 = Class63.anIntArray645[--Class63.anInt644];
                if (var3 == -1 && !Client.aBoolean1707) {
                    Class133.aNode_Sub10_Sub3_1723.method916();
                    Class133.anInt1725 = 1;
                    Class133.aReferenceTable1727 = null;
                } else if (var3 != -1 && var3 != Client.anInt1703 && Client.anInt1694 != 0 && !Client.aBoolean1707) {
                    CacheReferenceTable var63 = Class100.aCacheReferenceTable1119;
                    var5 = Client.anInt1694;
                    Class133.anInt1725 = 1;
                    Class133.aReferenceTable1727 = var63;
                    Class133.anInt1728 = var3;
                    Class5.anInt38 = 0;
                    Class141.anInt1784 = var5;
                    Class46.aBoolean371 = false;
                    CollisionMap.anInt1323 = 2;
                }

                Client.anInt1703 = var3;
                var11 = 1;
            } else if (var0 == 3202) {
                Class63.anInt644 -= 2;
                Applet_Sub1.method226(Class63.anIntArray645[Class63.anInt644], Class63.anIntArray645[Class63.anInt644 + 1]);
                var11 = 1;
            } else {
                var11 = 2;
            }

            return var11;
        } else if (var0 < 3400) {
            return Class78.method470(var0, var1, var2);
        } else if (var0 < 3500) {
            return InterfaceNode.method266(var0, var1, var2);
        } else if (var0 < 3700) {
            return Node_Sub20.method972(var0, var1, var2);
        } else if (var0 < 4000) {
            return method392(var0, var1, var2);
        } else if (var0 < 4100) {
            return Entity.method658(var0, var1, var2);
        } else {
            boolean var15;
            int var16;
            String var38;
            String var40;
            int var47;
            int[] var56;
            if (var0 < 4200) {
                if (var0 == 4100) {
                    var40 = Class63.aStringArray640[--Class77.anInt828];
                    var24 = Class63.anIntArray645[--Class63.anInt644];
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var40 + var24;
                    var11 = 1;
                } else if (var0 == 4101) {
                    Class77.anInt828 -= 2;
                    var40 = Class63.aStringArray640[Class77.anInt828];
                    var38 = Class63.aStringArray640[Class77.anInt828 + 1];
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var40 + var38;
                    var11 = 1;
                } else if (var0 == 4102) {
                    var40 = Class63.aStringArray640[--Class77.anInt828];
                    var24 = Class63.anIntArray645[--Class63.anInt644];
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var40 + Class90.method584(var24, true);
                    var11 = 1;
                } else if (var0 == 4103) {
                    var40 = Class63.aStringArray640[--Class77.anInt828];
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var40.toLowerCase();
                    var11 = 1;
                } else if (var0 == 4104) {
                    var3 = Class63.anIntArray645[--Class63.anInt644];
                    long var13 = 86400000L * (11745L + (long) var3);
                    Class63.aCalendar643.setTime(new Date(var13));
                    var47 = Class63.aCalendar643.get(5);
                    var16 = Class63.aCalendar643.get(2);
                    var8 = Class63.aCalendar643.get(1);
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var47 + "-" + Class63.aStringArray641[var16] + "-" + var8;
                    var11 = 1;
                } else if (var0 == 4105) {
                    Class77.anInt828 -= 2;
                    var40 = Class63.aStringArray640[Class77.anInt828];
                    var38 = Class63.aStringArray640[Class77.anInt828 + 1];
                    if (Client.player.appearance != null && Client.player.appearance.female) {
                        Class63.aStringArray640[++Class77.anInt828 - 1] = var38;
                    } else {
                        Class63.aStringArray640[++Class77.anInt828 - 1] = var40;
                    }

                    var11 = 1;
                } else if (var0 == 4106) {
                    var3 = Class63.anIntArray645[--Class63.anInt644];
                    Class63.aStringArray640[++Class77.anInt828 - 1] = Integer.toString(var3);
                    var11 = 1;
                } else if (var0 == 4107) {
                    Class77.anInt828 -= 2;
                    int[] var66 = Class63.anIntArray645;
                    var24 = ++Class63.anInt644 - 1;
                    var47 = Node_Sub20.method970(Class63.aStringArray640[Class77.anInt828], Class63.aStringArray640[Class77.anInt828 + 1], Client.anInt1463);
                    byte var30;
                    if (var47 > 0) {
                        var30 = 1;
                    } else if (var47 < 0) {
                        var30 = -1;
                    } else {
                        var30 = 0;
                    }

                    var66[var24] = var30;
                    var11 = 1;
                } else {
                    byte[] var27;
                    Font var32;
                    if (var0 == 4108) {
                        var40 = Class63.aStringArray640[--Class77.anInt828];
                        Class63.anInt644 -= 2;
                        var24 = Class63.anIntArray645[Class63.anInt644];
                        var5 = Class63.anIntArray645[Class63.anInt644 + 1];
                        var27 = Class2.aCacheReferenceTable8.method1085(var5, 0);
                        var32 = new Font(var27);
                        Class63.anIntArray645[++Class63.anInt644 - 1] = var32.method1168(var40, var24);
                        var11 = 1;
                    } else if (var0 == 4109) {
                        var40 = Class63.aStringArray640[--Class77.anInt828];
                        Class63.anInt644 -= 2;
                        var24 = Class63.anIntArray645[Class63.anInt644];
                        var5 = Class63.anIntArray645[Class63.anInt644 + 1];
                        var27 = Class2.aCacheReferenceTable8.method1085(var5, 0);
                        var32 = new Font(var27);
                        Class63.anIntArray645[++Class63.anInt644 - 1] = var32.method1178(var40, var24);
                        var11 = 1;
                    } else if (var0 == 4110) {
                        Class77.anInt828 -= 2;
                        var40 = Class63.aStringArray640[Class77.anInt828];
                        var38 = Class63.aStringArray640[Class77.anInt828 + 1];
                        if (Class63.anIntArray645[--Class63.anInt644] == 1) {
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var40;
                        } else {
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var38;
                        }

                        var11 = 1;
                    } else if (var0 == 4111) {
                        var40 = Class63.aStringArray640[--Class77.anInt828];
                        Class63.aStringArray640[++Class77.anInt828 - 1] = Node_Sub21_Sub26_Sub3.method1177(var40);
                        var11 = 1;
                    } else if (var0 == 4112) {
                        var40 = Class63.aStringArray640[--Class77.anInt828];
                        var24 = Class63.anIntArray645[--Class63.anInt644];
                        Class63.aStringArray640[++Class77.anInt828 - 1] = var40 + (char) var24;
                        var11 = 1;
                    } else {
                        char var61;
                        if (var0 == 4113) {
                            var3 = Class63.anIntArray645[--Class63.anInt644];
                            var56 = Class63.anIntArray645;
                            var5 = ++Class63.anInt644 - 1;
                            var61 = (char) var3;
                            if (var61 >= ' ' && var61 <= '~') {
                                var15 = true;
                            } else if (var61 >= 160 && var61 <= 255) {
                                var15 = true;
                            } else
                                var15 = !(var61 != 8364 && var61 != 338 && var61 != 8212 && var61 != 339 && var61 != 376);

                            var56[var5] = var15 ? 1 : 0;
                            var11 = 1;
                        } else if (var0 == 4114) {
                            var3 = Class63.anIntArray645[--Class63.anInt644];
                            var56 = Class63.anIntArray645;
                            var5 = ++Class63.anInt644 - 1;
                            var61 = (char) var3;
                            var15 = var61 >= '0' && var61 <= '9' || var61 >= 'A' && var61 <= 'Z' || var61 >= 'a' && var61 <= 'z';
                            var56[var5] = var15 ? 1 : 0;
                            var11 = 1;
                        } else if (var0 == 4115) {
                            var3 = Class63.anIntArray645[--Class63.anInt644];
                            Class63.anIntArray645[++Class63.anInt644 - 1] = Class130.method888((char) var3) ? 1 : 0;
                            var11 = 1;
                        } else if (var0 == 4116) {
                            var3 = Class63.anIntArray645[--Class63.anInt644];
                            Class63.anIntArray645[++Class63.anInt644 - 1] = Boundary.method656((char) var3) ? 1 : 0;
                            var11 = 1;
                        } else if (var0 == 4117) {
                            var40 = Class63.aStringArray640[--Class77.anInt828];
                            if (var40 != null) {
                                Class63.anIntArray645[++Class63.anInt644 - 1] = var40.length();
                            } else {
                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                            }

                            var11 = 1;
                        } else if (var0 == 4118) {
                            var40 = Class63.aStringArray640[--Class77.anInt828];
                            Class63.anInt644 -= 2;
                            var24 = Class63.anIntArray645[Class63.anInt644];
                            var5 = Class63.anIntArray645[Class63.anInt644 + 1];
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var40.substring(var24, var5);
                            var11 = 1;
                        } else if (var0 == 4119) {
                            var40 = Class63.aStringArray640[--Class77.anInt828];
                            StringBuilder var62 = new StringBuilder(var40.length());
                            boolean var37 = false;

                            for (var47 = 0; var47 < var40.length(); ++var47) {
                                var61 = var40.charAt(var47);
                                if (var61 == '<') {
                                    var37 = true;
                                } else if (var61 == '>') {
                                    var37 = false;
                                } else if (!var37) {
                                    var62.append(var61);
                                }
                            }

                            Class63.aStringArray640[++Class77.anInt828 - 1] = var62.toString();
                            var11 = 1;
                        } else if (var0 == 4120) {
                            var40 = Class63.aStringArray640[--Class77.anInt828];
                            var24 = Class63.anIntArray645[--Class63.anInt644];
                            Class63.anIntArray645[++Class63.anInt644 - 1] = var40.indexOf(var24);
                            var11 = 1;
                        } else if (var0 == 4121) {
                            Class77.anInt828 -= 2;
                            var40 = Class63.aStringArray640[Class77.anInt828];
                            var38 = Class63.aStringArray640[Class77.anInt828 + 1];
                            var5 = Class63.anIntArray645[--Class63.anInt644];
                            Class63.anIntArray645[++Class63.anInt644 - 1] = var40.indexOf(var38, var5);
                            var11 = 1;
                        } else {
                            var11 = 2;
                        }
                    }
                }

                return var11;
            } else {
                String var48;
                if (var0 < 4300) {
                    if (var0 == 4200) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        Class63.aStringArray640[++Class77.anInt828 - 1] = Class149.method1001(var3).name;
                        var11 = 1;
                    } else {
                        ItemDefinition var49;
                        if (var0 == 4201) {
                            Class63.anInt644 -= 2;
                            var3 = Class63.anIntArray645[Class63.anInt644];
                            var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                            var49 = Class149.method1001(var3);
                            if (var24 >= 1 && var24 <= 5 && var49.groundActions[var24 - 1] != null) {
                                Class63.aStringArray640[++Class77.anInt828 - 1] = var49.groundActions[var24 - 1];
                            } else {
                                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                            }

                            var11 = 1;
                        } else if (var0 == 4202) {
                            Class63.anInt644 -= 2;
                            var3 = Class63.anIntArray645[Class63.anInt644];
                            var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                            var49 = Class149.method1001(var3);
                            if (var24 >= 1 && var24 <= 5 && var49.actions[var24 - 1] != null) {
                                Class63.aStringArray640[++Class77.anInt828 - 1] = var49.actions[var24 - 1];
                            } else {
                                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                            }

                            var11 = 1;
                        } else if (var0 == 4203) {
                            var3 = Class63.anIntArray645[--Class63.anInt644];
                            Class63.anIntArray645[++Class63.anInt644 - 1] = Class149.method1001(var3).value;
                            var11 = 1;
                        } else if (var0 == 4204) {
                            var3 = Class63.anIntArray645[--Class63.anInt644];
                            Class63.anIntArray645[++Class63.anInt644 - 1] = Class149.method1001(var3).stackable == 1 ? 1 : 0;
                            var11 = 1;
                        } else {
                            ItemDefinition var58;
                            if (var0 == 4205) {
                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                var58 = Class149.method1001(var3);
                                if (var58.anInt1864 == -1 && var58.noteId >= 0) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var58.noteId;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var3;
                                }

                                var11 = 1;
                            } else if (var0 == 4206) {
                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                var58 = Class149.method1001(var3);
                                if (var58.anInt1864 >= 0 && var58.noteId >= 0) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var58.noteId;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var3;
                                }

                                var11 = 1;
                            } else if (var0 == 4207) {
                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                Class63.anIntArray645[++Class63.anInt644 - 1] = Class149.method1001(var3).aBoolean1731 ? 1 : 0;
                                var11 = 1;
                            } else if (var0 == 4208) {
                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                var58 = Class149.method1001(var3);
                                if (var58.anInt785 == -1 && var58.anInt781 >= 0) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var58.anInt781;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var3;
                                }

                                var11 = 1;
                            } else if (var0 == 4209) {
                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                var58 = Class149.method1001(var3);
                                if (var58.anInt785 >= 0 && var58.anInt781 >= 0) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var58.anInt781;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var3;
                                }

                                var11 = 1;
                            } else if (var0 == 4210) {
                                var40 = Class63.aStringArray640[--Class77.anInt828];
                                var24 = Class63.anIntArray645[--Class63.anInt644];
                                var15 = var24 == 1;
                                var48 = var40.toLowerCase();
                                short[] var31 = new short[16];
                                var8 = 0;
                                int var17 = 0;

                                while (true) {
                                    if (var17 >= Class120.anInt1358) {
                                        Class170.aShortArray2121 = var31;
                                        Class10.anInt74 = 0;
                                        Class78.anInt840 = var8;
                                        String[] var60 = new String[Class78.anInt840];

                                        for (int var20 = 0; var20 < Class78.anInt840; ++var20) {
                                            var60[var20] = Class149.method1001(var31[var20]).name;
                                        }

                                        short[] var57 = Class170.aShortArray2121;
                                        Class62.method377(var60, var57, 0, var60.length - 1);
                                        break;
                                    }

                                    ItemDefinition var55 = Class149.method1001(var17);
                                    if ((!var15 || var55.aBoolean2114) && var55.anInt1864 == -1 && var55.name.toLowerCase().indexOf(var48) != -1) {
                                        if (var8 >= 250) {
                                            Class78.anInt840 = -1;
                                            Class170.aShortArray2121 = null;
                                            break;
                                        }

                                        if (var8 >= var31.length) {
                                            short[] var21 = new short[var31.length * 2];

                                            for (int var22 = 0; var22 < var8; ++var22) {
                                                var21[var22] = var31[var22];
                                            }

                                            var31 = var21;
                                        }

                                        var31[var8++] = (short) var17;
                                    }

                                    ++var17;
                                }

                                Class63.anIntArray645[++Class63.anInt644 - 1] = Class78.anInt840;
                                var11 = 1;
                            } else if (var0 == 4211) {
                                if (Class170.aShortArray2121 != null && Class10.anInt74 < Class78.anInt840) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = Class170.aShortArray2121[++Class10.anInt74 - 1] & '\uffff';
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                }

                                var11 = 1;
                            } else if (var0 == 4212) {
                                Class10.anInt74 = 0;
                                var11 = 1;
                            } else {
                                var11 = 2;
                            }
                        }
                    }

                    return var11;
                } else if (var0 < 5100) {
                    if (var0 == 5000) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.anInt1689;
                        var11 = 1;
                    } else if (var0 == 5001) {
                        Class63.anInt644 -= 3;
                        Client.anInt1689 = Class63.anIntArray645[Class63.anInt644];
                        PickableNode.aClass182_672 = Player.method197(Class63.anIntArray645[Class63.anInt644 + 1]);
                        if (PickableNode.aClass182_672 == null) {
                            PickableNode.aClass182_672 = Class182.aClass182_2158;
                        }

                        Client.anInt1687 = Class63.anIntArray645[Class63.anInt644 + 2];
                        Client.packet.writeHeader(225);
                        Client.packet.method451(Client.anInt1689);
                        Client.packet.method451(PickableNode.aClass182_672.anInt2156);
                        Client.packet.method451(Client.anInt1687);
                        var11 = 1;
                    } else if (var0 == 5002) {
                        var40 = Class63.aStringArray640[--Class77.anInt828];
                        Class63.anInt644 -= 2;
                        var24 = Class63.anIntArray645[Class63.anInt644];
                        var5 = Class63.anIntArray645[Class63.anInt644 + 1];
                        Client.packet.writeHeader(180);
                        Client.packet.method451(Class27.method179(var40) + 2);
                        Client.packet.method865(var40);
                        Client.packet.method451(var24 - 1);
                        Client.packet.method451(var5);
                        var11 = 1;
                    } else if (var0 == 5003) {
                        Class63.anInt644 -= 2;
                        var3 = Class63.anIntArray645[Class63.anInt644];
                        var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                        Class50 var26 = (Class50) Class59.aMap624.get(var3);
                        Node_Sub21_Sub1 var45 = var26.method318(var24);
                        if (var45 != null) {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = var45.anInt204;
                            Class63.anIntArray645[++Class63.anInt644 - 1] = var45.anInt209;
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var45.aString205 != null ? var45.aString205 : "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var45.aString207 != null ? var45.aString207 : "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var45.aString208 != null ? var45.aString208 : "";
                        } else {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                            Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                            Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                        }

                        var11 = 1;
                    } else if (var0 == 5004) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        Node_Sub21_Sub1 var54 = Node_Sub21_Sub1.method309(var3);
                        if (var54 != null) {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = var54.anInt206;
                            Class63.anIntArray645[++Class63.anInt644 - 1] = var54.anInt209;
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var54.aString205 != null ? var54.aString205 : "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var54.aString207 != null ? var54.aString207 : "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = var54.aString208 != null ? var54.aString208 : "";
                        } else {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                            Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                            Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                            Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                        }

                        var11 = 1;
                    } else if (var0 == 5005) {
                        if (PickableNode.aClass182_672 == null) {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                        } else {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = PickableNode.aClass182_672.anInt2156;
                        }

                        var11 = 1;
                    } else if (var0 == 5008) {
                        var40 = Class63.aStringArray640[--Class77.anInt828];
                        var24 = Class63.anIntArray645[--Class63.anInt644];
                        var48 = var40.toLowerCase();
                        byte var50 = 0;
                        if (var48.startsWith("yellow:")) {
                            var50 = 0;
                            var40 = var40.substring("yellow:".length());
                        } else if (var48.startsWith("red:")) {
                            var50 = 1;
                            var40 = var40.substring("red:".length());
                        } else if (var48.startsWith("green:")) {
                            var50 = 2;
                            var40 = var40.substring("green:".length());
                        } else if (var48.startsWith("cyan:")) {
                            var50 = 3;
                            var40 = var40.substring("cyan:".length());
                        } else if (var48.startsWith("purple:")) {
                            var50 = 4;
                            var40 = var40.substring("purple:".length());
                        } else if (var48.startsWith("white:")) {
                            var50 = 5;
                            var40 = var40.substring("white:".length());
                        } else if (var48.startsWith("flash1:")) {
                            var50 = 6;
                            var40 = var40.substring("flash1:".length());
                        } else if (var48.startsWith("flash2:")) {
                            var50 = 7;
                            var40 = var40.substring("flash2:".length());
                        } else if (var48.startsWith("flash3:")) {
                            var50 = 8;
                            var40 = var40.substring("flash3:".length());
                        } else if (var48.startsWith("glow1:")) {
                            var50 = 9;
                            var40 = var40.substring("glow1:".length());
                        } else if (var48.startsWith("glow2:")) {
                            var50 = 10;
                            var40 = var40.substring("glow2:".length());
                        } else if (var48.startsWith("glow3:")) {
                            var50 = 11;
                            var40 = var40.substring("glow3:".length());
                        } else if (Client.anInt1463 != 0) {
                            if (var48.startsWith("yellow:")) {
                                var50 = 0;
                                var40 = var40.substring("yellow:".length());
                            } else if (var48.startsWith("red:")) {
                                var50 = 1;
                                var40 = var40.substring("red:".length());
                            } else if (var48.startsWith("green:")) {
                                var50 = 2;
                                var40 = var40.substring("green:".length());
                            } else if (var48.startsWith("cyan:")) {
                                var50 = 3;
                                var40 = var40.substring("cyan:".length());
                            } else if (var48.startsWith("purple:")) {
                                var50 = 4;
                                var40 = var40.substring("purple:".length());
                            } else if (var48.startsWith("white:")) {
                                var50 = 5;
                                var40 = var40.substring("white:".length());
                            } else if (var48.startsWith("flash1:")) {
                                var50 = 6;
                                var40 = var40.substring("flash1:".length());
                            } else if (var48.startsWith("flash2:")) {
                                var50 = 7;
                                var40 = var40.substring("flash2:".length());
                            } else if (var48.startsWith("flash3:")) {
                                var50 = 8;
                                var40 = var40.substring("flash3:".length());
                            } else if (var48.startsWith("glow1:")) {
                                var50 = 9;
                                var40 = var40.substring("glow1:".length());
                            } else if (var48.startsWith("glow2:")) {
                                var50 = 10;
                                var40 = var40.substring("glow2:".length());
                            } else if (var48.startsWith("glow3:")) {
                                var50 = 11;
                                var40 = var40.substring("glow3:".length());
                            }
                        }

                        var48 = var40.toLowerCase();
                        byte var53 = 0;
                        if (var48.startsWith("wave:")) {
                            var53 = 1;
                            var40 = var40.substring("wave:".length());
                        } else if (var48.startsWith("wave2:")) {
                            var53 = 2;
                            var40 = var40.substring("wave2:".length());
                        } else if (var48.startsWith("shake:")) {
                            var53 = 3;
                            var40 = var40.substring("shake:".length());
                        } else if (var48.startsWith("scroll:")) {
                            var53 = 4;
                            var40 = var40.substring("scroll:".length());
                        } else if (var48.startsWith("slide:")) {
                            var53 = 5;
                            var40 = var40.substring("slide:".length());
                        } else if (Client.anInt1463 != 0) {
                            if (var48.startsWith("wave:")) {
                                var53 = 1;
                                var40 = var40.substring("wave:".length());
                            } else if (var48.startsWith("wave2:")) {
                                var53 = 2;
                                var40 = var40.substring("wave2:".length());
                            } else if (var48.startsWith("shake:")) {
                                var53 = 3;
                                var40 = var40.substring("shake:".length());
                            } else if (var48.startsWith("scroll:")) {
                                var53 = 4;
                                var40 = var40.substring("scroll:".length());
                            } else if (var48.startsWith("slide:")) {
                                var53 = 5;
                                var40 = var40.substring("slide:".length());
                            }
                        }

                        Client.packet.writeHeader(91);
                        Client.packet.method451(0);
                        var8 = Client.packet.caret;
                        Client.packet.method451(var24);
                        Client.packet.method451(var50);
                        Client.packet.method451(var53);
                        Node_Sub10_Sub4.method1030(Client.packet, var40);
                        Client.packet.method862(Client.packet.caret - var8);
                        var11 = 1;
                    } else if (var0 == 5009) {
                        Class77.anInt828 -= 2;
                        var40 = Class63.aStringArray640[Class77.anInt828];
                        var38 = Class63.aStringArray640[Class77.anInt828 + 1];
                        Client.packet.writeHeader(170);
                        Client.packet.method755(0);
                        var5 = Client.packet.caret;
                        Client.packet.method865(var40);
                        Node_Sub10_Sub4.method1030(Client.packet, var38);
                        Client.packet.method866(Client.packet.caret - var5);
                        var11 = 1;
                    } else if (var0 == 5015) {
                        if (Client.player != null && Client.player.name != null) {
                            var40 = Client.player.name;
                        } else {
                            var40 = "";
                        }

                        Class63.aStringArray640[++Class77.anInt828 - 1] = var40;
                        var11 = 1;
                    } else if (var0 == 5016) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.anInt1687;
                        var11 = 1;
                    } else if (var0 == 5017) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var56 = Class63.anIntArray645;
                        var5 = ++Class63.anInt644 - 1;
                        Class50 var7 = (Class50) Class59.aMap624.get(var3);
                        if (var7 == null) {
                            var47 = 0;
                        } else {
                            var47 = var7.method316();
                        }

                        var56[var5] = var47;
                        var11 = 1;
                    } else if (var0 == 5018) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        var56 = Class63.anIntArray645;
                        var5 = ++Class63.anInt644 - 1;
                        Node_Sub21_Sub1 var28 = (Node_Sub21_Sub1) Class59.A_ITERABLE_NODE_TABLE___628.lookup((long) var3);
                        if (var28 == null) {
                            var47 = -1;
                        } else if (var28.nextDoubly == Class59.aClass142_627.aDoublyNode1786) {
                            var47 = -1;
                        } else {
                            var47 = ((Node_Sub21_Sub1) var28.nextDoubly).anInt204;
                        }

                        var56[var5] = var47;
                        var11 = 1;
                    } else if (var0 == 5019) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Packet.method785(var3);
                        var11 = 1;
                    } else if (var0 == 5020) {
                        var40 = Class63.aStringArray640[--Class77.anInt828];
                        if (var40.equalsIgnoreCase("toggleroof")) {
                            Client.preferences.roofsHidden = !Client.preferences.roofsHidden;
                            Class78.method467();
                            if (Client.preferences.roofsHidden) {
                                Class78.method469(99, "", "Roofs are now all hidden");
                            } else {
                                Class78.method469(99, "", "Roofs will only be removed selectively");
                            }
                        }

                        if (var40.equalsIgnoreCase("displayfps")) {
                            Client.showFps = !Client.showFps;
                        }

                        if (var40.equalsIgnoreCase("clickbox")) {
                            BoundingBoxInfo.useAxisAlignedBoundingBoxes = false;
                            Class78.method469(99, "", "Clickbox Mode: " + (BoundingBoxInfo.useAxisAlignedBoundingBoxes ? "LEGACY_2D" : "Legacy"));
                        }

                        if (Client.rights >= 2) {
                            if (var40.equalsIgnoreCase("aabb")) {
                                if (!BoundingBoxInfo.drawAxisAlignedBoundingBoxes) {
                                    BoundingBoxInfo.drawAxisAlignedBoundingBoxes = true;
                                    BoundingBoxInfo.currentBoundingBoxType = BoundingBoxType.LEGACY_2D;
                                    Class78.method469(99, "", "AABB boxes: All");
                                } else if (BoundingBoxInfo.currentBoundingBoxType == BoundingBoxType.LEGACY_2D) {
                                    BoundingBoxInfo.drawAxisAlignedBoundingBoxes = true;
                                    BoundingBoxInfo.currentBoundingBoxType = BoundingBoxType.AABB;
                                    Class78.method469(99, "", "AABB boxes: Mouse Over");
                                } else {
                                    BoundingBoxInfo.drawAxisAlignedBoundingBoxes = false;
                                    Class78.method469(99, "", "AABB boxes: Off");
                                }
                            }

                            if (var40.equalsIgnoreCase("legacyboxes")) {
                                BoundingBoxInfo.useLegacyClickBoxes = !BoundingBoxInfo.useLegacyClickBoxes;
                                Class78.method469(99, "", "Show legacy boxes: " + BoundingBoxInfo.useLegacyClickBoxes);
                            }

                            if (var40.equalsIgnoreCase("geotests")) {
                                BoundingBoxInfo.drawLegacyClickBoxes = !BoundingBoxInfo.drawLegacyClickBoxes;
                                Class78.method469(99, "", "Show geometry tests: " + BoundingBoxInfo.drawLegacyClickBoxes);
                            }

                            if (var40.equalsIgnoreCase("fpson")) {
                                Client.showFps = true;
                            }

                            if (var40.equalsIgnoreCase("fpsoff")) {
                                Client.showFps = false;
                            }

                            if (var40.equalsIgnoreCase("gc")) {
                                System.gc();
                            }

                            if (var40.equalsIgnoreCase("clientdrop")) {
                                if (Client.specialScript > 0) {
                                    TextureProviderImpl.method499();
                                } else {
                                    Class45.method304(40);
                                    Class154.aSocket1833 = InterfaceNode.aSocket317;
                                    InterfaceNode.aSocket317 = null;
                                }
                            }

                            if (var40.equalsIgnoreCase("errortest") && Client.anInt1470 == 2) {
                                throw new RuntimeException();
                            }
                        }

                        Client.packet.writeHeader(146);
                        Client.packet.method451(var40.length() + 1);
                        Client.packet.method865(var40);
                        var11 = 1;
                    } else if (var0 == 5021) {
                        Client.aString1679 = Class63.aStringArray640[--Class77.anInt828].toLowerCase().trim();
                        var11 = 1;
                    } else if (var0 == 5022) {
                        Class63.aStringArray640[++Class77.anInt828 - 1] = Client.aString1679;
                        var11 = 1;
                    } else {
                        var11 = 2;
                    }

                    return var11;
                } else if (var0 < 5400) {
                    if (var0 == 5306) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Node_Sub21_Sub20.method1126();
                        var11 = 1;
                    } else if (var0 == 5307) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        if (var3 == 1 || var3 == 2) {
                            Class1.method4(var3);
                        }

                        var11 = 1;
                    } else if (var0 == 5308) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.preferences.resizable;
                        var11 = 1;
                    } else if (var0 == 5309) {
                        var3 = Class63.anIntArray645[--Class63.anInt644];
                        if (var3 == 1 || var3 == 2) {
                            Client.preferences.resizable = var3;
                            Class78.method467();
                        }

                        var11 = 1;
                    } else {
                        var11 = 2;
                    }

                    return var11;
                } else if (var0 < 5600) {
                    if (var0 == 5504) {
                        Class63.anInt644 -= 2;
                        var47 = Class63.anIntArray645[Class63.anInt644];
                        var16 = Class63.anIntArray645[Class63.anInt644 + 1];
                        if (!Client.cameraLocked) {
                            Client.anInt1541 = var47;
                            Client.mapRotation = var16;
                        }

                        var11 = 1;
                    } else if (var0 == 5505) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.anInt1541;
                        var11 = 1;
                    } else if (var0 == 5506) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.mapRotation;
                        var11 = 1;
                    } else if (var0 == 5530) {
                        var47 = Class63.anIntArray645[--Class63.anInt644];
                        if (var47 < 0) {
                            var47 = 0;
                        }

                        Client.anInt1573 = var47;
                        var11 = 1;
                    } else if (var0 == 5531) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.anInt1573;
                        var11 = 1;
                    } else {
                        var11 = 2;
                    }

                    return var11;
                } else if (var0 < 5700) {
                    return method410(var0, var1, var2);
                } else if (var0 < 6300) {
                    if (var0 == 6200) {
                        Class63.anInt644 -= 2;
                        Client.aShort1434 = (short) Class63.anIntArray645[Class63.anInt644];
                        if (Client.aShort1434 <= 0) {
                            Client.aShort1434 = 256;
                        }

                        Client.aShort1439 = (short) Class63.anIntArray645[Class63.anInt644 + 1];
                        if (Client.aShort1439 <= 0) {
                            Client.aShort1439 = 205;
                        }

                        var11 = 1;
                    } else if (var0 == 6201) {
                        Class63.anInt644 -= 2;
                        Client.aShort1435 = (short) Class63.anIntArray645[Class63.anInt644];
                        if (Client.aShort1435 <= 0) {
                            Client.aShort1435 = 256;
                        }

                        Client.aShort1452 = (short) Class63.anIntArray645[Class63.anInt644 + 1];
                        if (Client.aShort1452 <= 0) {
                            Client.aShort1452 = 320;
                        }

                        var11 = 1;
                    } else if (var0 == 6202) {
                        Class63.anInt644 -= 4;
                        Client.aShort1445 = (short) Class63.anIntArray645[Class63.anInt644];
                        if (Client.aShort1445 <= 0) {
                            Client.aShort1445 = 1;
                        }

                        Client.aShort1454 = (short) Class63.anIntArray645[Class63.anInt644 + 1];
                        if (Client.aShort1454 <= 0) {
                            Client.aShort1454 = 32767;
                        } else if (Client.aShort1454 < Client.aShort1445) {
                            Client.aShort1454 = Client.aShort1445;
                        }

                        Client.aShort1446 = (short) Class63.anIntArray645[Class63.anInt644 + 2];
                        if (Client.aShort1446 <= 0) {
                            Client.aShort1446 = 1;
                        }

                        Client.aShort1456 = (short) Class63.anIntArray645[Class63.anInt644 + 3];
                        if (Client.aShort1456 <= 0) {
                            Client.aShort1456 = 32767;
                        } else if (Client.aShort1456 < Client.aShort1446) {
                            Client.aShort1456 = Client.aShort1446;
                        }

                        var11 = 1;
                    } else if (var0 == 6203) {
                        if (Client.anInterfaceComponent1638 != null) {
                            Player.method193(0, 0, Client.anInterfaceComponent1638.width, Client.anInterfaceComponent1638.height, false);
                            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.viewportWidth;
                            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.viewportHeight;
                        } else {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                            Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                        }

                        var11 = 1;
                    } else if (var0 == 6204) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.aShort1435;
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.aShort1452;
                        var11 = 1;
                    } else if (var0 == 6205) {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.aShort1434;
                        Class63.anIntArray645[++Class63.anInt644 - 1] = Client.aShort1439;
                        var11 = 1;
                    } else {
                        var11 = 2;
                    }

                    return var11;
                } else {
                    boolean var4;
                    if (var0 >= 6600) {
                        if (var0 < 6700) {
                            if (var0 == 6600) {
                                var3 = Player.floorLevel;
                                var24 = Class62.anInt636 + (Client.player.strictX >> 7);
                                var5 = Class49.anInt377 + (Client.player.strictY >> 7);
                                InterfaceNode.method268().method1295(var3, var24, var5, true);
                                var11 = 1;
                            } else {
                                Class12 var41;
                                if (var0 == 6601) {
                                    var3 = Class63.anIntArray645[--Class63.anInt644];
                                    var38 = "";
                                    var41 = InterfaceNode.method268().method1276(var3);
                                    if (var41 != null) {
                                        var38 = var41.method73();
                                    }

                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var38;
                                    var11 = 1;
                                } else if (var0 == 6602) {
                                    var3 = Class63.anIntArray645[--Class63.anInt644];
                                    InterfaceNode.method268().method1297(var3);
                                    var11 = 1;
                                } else if (var0 == 6603) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1305();
                                    var11 = 1;
                                } else if (var0 == 6604) {
                                    var3 = Class63.anIntArray645[--Class63.anInt644];
                                    InterfaceNode.method268().method1287(var3);
                                    var11 = 1;
                                } else if (var0 == 6605) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1274() ? 1 : 0;
                                    var11 = 1;
                                } else {
                                    SceneOffset var36;
                                    if (var0 == 6606) {
                                        var36 = new SceneOffset(Class63.anIntArray645[--Class63.anInt644]);
                                        InterfaceNode.method268().method1258(var36.x, var36.y);
                                        var11 = 1;
                                    } else if (var0 == 6607) {
                                        var36 = new SceneOffset(Class63.anIntArray645[--Class63.anInt644]);
                                        InterfaceNode.method268().method1257(var36.x, var36.y);
                                        var11 = 1;
                                    } else if (var0 == 6608) {
                                        var36 = new SceneOffset(Class63.anIntArray645[--Class63.anInt644]);
                                        InterfaceNode.method268().method1268(var36.z, var36.x, var36.y);
                                        var11 = 1;
                                    } else if (var0 == 6609) {
                                        var36 = new SceneOffset(Class63.anIntArray645[--Class63.anInt644]);
                                        InterfaceNode.method268().method1263(var36.z, var36.x, var36.y);
                                        var11 = 1;
                                    } else if (var0 == 6610) {
                                        Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1264();
                                        Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1254();
                                        var11 = 1;
                                    } else {
                                        Class12 var42;
                                        if (var0 == 6611) {
                                            var3 = Class63.anIntArray645[--Class63.anInt644];
                                            var42 = InterfaceNode.method268().method1276(var3);
                                            if (var42 == null) {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                            } else {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var42.method62().getHash();
                                            }

                                            var11 = 1;
                                        } else if (var0 == 6612) {
                                            var3 = Class63.anIntArray645[--Class63.anInt644];
                                            var42 = InterfaceNode.method268().method1276(var3);
                                            if (var42 == null) {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                            } else {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = (var42.method78() - var42.method80() + 1) * 64;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = (var42.method77() - var42.method70() + 1) * 64;
                                            }

                                            var11 = 1;
                                        } else if (var0 == 6613) {
                                            var3 = Class63.anIntArray645[--Class63.anInt644];
                                            var42 = InterfaceNode.method268().method1276(var3);
                                            if (var42 == null) {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                            } else {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var42.method80() * 64;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var42.method70() * 64;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var42.method78() * 64 + 64 - 1;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var42.method77() * 64 + 64 - 1;
                                            }

                                            var11 = 1;
                                        } else if (var0 == 6614) {
                                            var3 = Class63.anIntArray645[--Class63.anInt644];
                                            var42 = InterfaceNode.method268().method1276(var3);
                                            if (var42 == null) {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                            } else {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var42.method67();
                                            }

                                            var11 = 1;
                                        } else if (var0 == 6615) {
                                            var36 = InterfaceNode.method268().method1265();
                                            if (var36 == null) {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                            } else {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var36.x;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var36.y;
                                            }

                                            var11 = 1;
                                        } else if (var0 == 6616) {
                                            Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1294();
                                            var11 = 1;
                                        } else if (var0 == 6617) {
                                            var36 = new SceneOffset(Class63.anIntArray645[--Class63.anInt644]);
                                            var42 = InterfaceNode.method268().method1284();
                                            if (var42 == null) {
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                var11 = 1;
                                            } else {
                                                int[] var43 = var42.method81(var36.z, var36.x, var36.y);
                                                if (var43 == null) {
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                } else {
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var43[0];
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var43[1];
                                                }

                                                var11 = 1;
                                            }
                                        } else {
                                            SceneOffset var44;
                                            if (var0 == 6618) {
                                                var36 = new SceneOffset(Class63.anIntArray645[--Class63.anInt644]);
                                                var42 = InterfaceNode.method268().method1284();
                                                if (var42 == null) {
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                    var11 = 1;
                                                } else {
                                                    var44 = var42.method83(var36.x, var36.y);
                                                    if (var44 == null) {
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                    } else {
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = var44.getHash();
                                                    }

                                                    var11 = 1;
                                                }
                                            } else {
                                                SceneOffset var46;
                                                if (var0 == 6619) {
                                                    Class63.anInt644 -= 2;
                                                    var3 = Class63.anIntArray645[Class63.anInt644];
                                                    var46 = new SceneOffset(Class63.anIntArray645[Class63.anInt644 + 1]);
                                                    var41 = InterfaceNode.method268().method1276(var3);
                                                    var47 = Client.player.combatLevel;
                                                    var16 = (Client.player.strictX >> 7) + Class62.anInt636;
                                                    var8 = Class49.anInt377 + (Client.player.strictY >> 7);
                                                    SceneOffset var59 = new SceneOffset(var47, var16, var8);
                                                    InterfaceNode.method268().method1299(var41, var59, var46, false);
                                                    var11 = 1;
                                                } else if (var0 == 6620) {
                                                    Class63.anInt644 -= 2;
                                                    var3 = Class63.anIntArray645[Class63.anInt644];
                                                    var46 = new SceneOffset(Class63.anIntArray645[Class63.anInt644 + 1]);
                                                    Node_Sub21_Sub19.method1124(var3, var46, true);
                                                    var11 = 1;
                                                } else if (var0 == 6621) {
                                                    Class63.anInt644 -= 2;
                                                    var3 = Class63.anIntArray645[Class63.anInt644];
                                                    var46 = new SceneOffset(Class63.anIntArray645[Class63.anInt644 + 1]);
                                                    var41 = InterfaceNode.method268().method1276(var3);
                                                    if (var41 == null) {
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                                        var11 = 1;
                                                    } else {
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = var41.method65(var46.z, var46.x, var46.y) ? 1 : 0;
                                                        var11 = 1;
                                                    }
                                                } else if (var0 == 6622) {
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1270();
                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1267();
                                                    var11 = 1;
                                                } else if (var0 == 6623) {
                                                    var36 = new SceneOffset(Class63.anIntArray645[--Class63.anInt644]);
                                                    var42 = InterfaceNode.method268().method1286(var36.z, var36.x, var36.y);
                                                    if (var42 == null) {
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                    } else {
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = var42.method63();
                                                    }

                                                    var11 = 1;
                                                } else if (var0 == 6624) {
                                                    InterfaceNode.method268().method1255(Class63.anIntArray645[--Class63.anInt644]);
                                                    var11 = 1;
                                                } else if (var0 == 6625) {
                                                    InterfaceNode.method268().method1253();
                                                    var11 = 1;
                                                } else if (var0 == 6626) {
                                                    InterfaceNode.method268().method1277(Class63.anIntArray645[--Class63.anInt644]);
                                                    var11 = 1;
                                                } else if (var0 == 6627) {
                                                    InterfaceNode.method268().method1262();
                                                    var11 = 1;
                                                } else {
                                                    boolean var33;
                                                    if (var0 == 6628) {
                                                        var33 = Class63.anIntArray645[--Class63.anInt644] == 1;
                                                        InterfaceNode.method268().method1259(var33);
                                                        var11 = 1;
                                                    } else if (var0 == 6629) {
                                                        var3 = Class63.anIntArray645[--Class63.anInt644];
                                                        InterfaceNode.method268().method1269(var3);
                                                        var11 = 1;
                                                    } else if (var0 == 6630) {
                                                        var3 = Class63.anIntArray645[--Class63.anInt644];
                                                        InterfaceNode.method268().method1271(var3);
                                                        var11 = 1;
                                                    } else if (var0 == 6631) {
                                                        InterfaceNode.method268().method1266();
                                                        var11 = 1;
                                                    } else if (var0 == 6632) {
                                                        var33 = Class63.anIntArray645[--Class63.anInt644] == 1;
                                                        InterfaceNode.method268().method1278(var33);
                                                        var11 = 1;
                                                    } else if (var0 == 6633) {
                                                        Class63.anInt644 -= 2;
                                                        var3 = Class63.anIntArray645[Class63.anInt644];
                                                        var4 = Class63.anIntArray645[Class63.anInt644 + 1] == 1;
                                                        InterfaceNode.method268().method1261(var3, var4);
                                                        var11 = 1;
                                                    } else if (var0 == 6634) {
                                                        Class63.anInt644 -= 2;
                                                        var3 = Class63.anIntArray645[Class63.anInt644];
                                                        var4 = Class63.anIntArray645[Class63.anInt644 + 1] == 1;
                                                        InterfaceNode.method268().method1275(var3, var4);
                                                        var11 = 1;
                                                    } else if (var0 == 6635) {
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1273() ? 1 : 0;
                                                        var11 = 1;
                                                    } else if (var0 == 6636) {
                                                        var3 = Class63.anIntArray645[--Class63.anInt644];
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1260(var3) ? 1 : 0;
                                                        var11 = 1;
                                                    } else if (var0 == 6637) {
                                                        var3 = Class63.anIntArray645[--Class63.anInt644];
                                                        Class63.anIntArray645[++Class63.anInt644 - 1] = InterfaceNode.method268().method1256(var3) ? 1 : 0;
                                                        var11 = 1;
                                                    } else if (var0 == 6638) {
                                                        Class63.anInt644 -= 2;
                                                        var3 = Class63.anIntArray645[Class63.anInt644];
                                                        var46 = new SceneOffset(Class63.anIntArray645[Class63.anInt644 + 1]);
                                                        var44 = InterfaceNode.method268().method1279(var3, var46);
                                                        if (var44 == null) {
                                                            Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                        } else {
                                                            Class63.anIntArray645[++Class63.anInt644 - 1] = var44.getHash();
                                                        }

                                                        var11 = 1;
                                                    } else {
                                                        Class24 var39;
                                                        if (var0 == 6639) {
                                                            var39 = InterfaceNode.method268().method1282();
                                                            if (var39 == null) {
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                            } else {
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var39.anInt160;
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var39.aSceneOffset_167.getHash();
                                                            }

                                                            var11 = 1;
                                                        } else if (var0 == 6640) {
                                                            var39 = InterfaceNode.method268().method1283();
                                                            if (var39 == null) {
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                            } else {
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var39.anInt160;
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var39.aSceneOffset_167.getHash();
                                                            }

                                                            var11 = 1;
                                                        } else {
                                                            Node_Sub21_Sub15 var51;
                                                            if (var0 == 6693) {
                                                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                                                var51 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var3];
                                                                if (var51.aString2091 == null) {
                                                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                                                } else {
                                                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var51.aString2091;
                                                                }

                                                                var11 = 1;
                                                            } else if (var0 == 6694) {
                                                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                                                var51 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var3];
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = var51.anInt214;
                                                                var11 = 1;
                                                            } else if (var0 == 6695) {
                                                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                                                var51 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var3];
                                                                if (var51 == null) {
                                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                                } else {
                                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var51.anInt236;
                                                                }

                                                                var11 = 1;
                                                            } else if (var0 == 6696) {
                                                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                                                var51 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var3];
                                                                if (var51 == null) {
                                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                                                } else {
                                                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var51.anInt328;
                                                                }

                                                                var11 = 1;
                                                            } else if (var0 == 6697) {
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = Class125.aClass22_1366.anInt145;
                                                                var11 = 1;
                                                            } else if (var0 == 6698) {
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = Class125.aClass22_1366.aSceneOffset_150.getHash();
                                                                var11 = 1;
                                                            } else if (var0 == 6699) {
                                                                Class63.anIntArray645[++Class63.anInt644 - 1] = Class125.aClass22_1366.aSceneOffset_146.getHash();
                                                                var11 = 1;
                                                            } else {
                                                                var11 = 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            return var11;
                        } else {
                            return 2;
                        }
                    } else {
                        if (var0 == 6500) {
                            Class63.anIntArray645[++Class63.anInt644 - 1] = Class60.method369() ? 1 : 0;
                            var11 = 1;
                        } else {
                            World var10;
                            if (var0 == 6501) {
                                World.anInt389 = 0;
                                if (World.anInt389 < World.anInt397) {
                                    var10 = World.aWorldArray396[++World.anInt389 - 1];
                                } else {
                                    var10 = null;
                                }

                                if (var10 != null) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.id;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.mask;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var10.activity;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.location;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.population;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var10.domain;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                }

                                var11 = 1;
                            } else if (var0 == 6502) {
                                World var9;
                                if (World.anInt389 < World.anInt397) {
                                    var9 = World.aWorldArray396[++World.anInt389 - 1];
                                } else {
                                    var9 = null;
                                }

                                if (var9 != null) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var9.id;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var9.mask;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var9.activity;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var9.location;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var9.population;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var9.domain;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                }

                                var11 = 1;
                            } else if (var0 == 6506) {
                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                var10 = null;

                                for (var5 = 0; var5 < World.anInt397; ++var5) {
                                    if (World.aWorldArray396[var5].id == var3) {
                                        var10 = World.aWorldArray396[var5];
                                        break;
                                    }
                                }

                                if (var10 != null) {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.id;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.mask;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var10.activity;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.location;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.population;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var10.domain;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                }

                                var11 = 1;
                            } else if (var0 == 6507) {
                                Class63.anInt644 -= 4;
                                var3 = Class63.anIntArray645[Class63.anInt644];
                                var4 = Class63.anIntArray645[Class63.anInt644 + 1] == 1;
                                var5 = Class63.anIntArray645[Class63.anInt644 + 2];
                                var15 = Class63.anIntArray645[Class63.anInt644 + 3] == 1;
                                if (World.aWorldArray396 != null) {
                                    Class159.method1014(0, World.aWorldArray396.length - 1, var3, var4, var5, var15);
                                }

                                var11 = 1;
                            } else if (var0 == 6511) {
                                var3 = Class63.anIntArray645[--Class63.anInt644];
                                if (var3 >= 0 && var3 < World.anInt397) {
                                    var10 = World.aWorldArray396[var3];
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.id;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.mask;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var10.activity;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.location;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = var10.population;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = var10.domain;
                                } else {
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                                }

                                var11 = 1;
                            } else if (var0 == 6512) {
                                Client.resizableMode = Class63.anIntArray645[--Class63.anInt644] == 1;
                                var11 = 1;
                            } else {
                                DefinitionProperty var12;
                                if (var0 == 6513) {
                                    Class63.anInt644 -= 2;
                                    var3 = Class63.anIntArray645[Class63.anInt644];
                                    var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                                    var12 = Class158.method1012(var24);
                                    if (var12.isString()) {
                                        Class63.aStringArray640[++Class77.anInt828 - 1] = Class122.getNpcDefinition(var3).getOrDefault(var24, var12.defaultString);
                                    } else {
                                        Class63.anIntArray645[++Class63.anInt644 - 1] = Class122.getNpcDefinition(var3).getOrDefault(var24, var12.defaultInteger);
                                    }

                                    var11 = 1;
                                } else if (var0 == 6514) {
                                    Class63.anInt644 -= 2;
                                    var3 = Class63.anIntArray645[Class63.anInt644];
                                    var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                                    var12 = Class158.method1012(var24);
                                    if (var12.isString()) {
                                        Class63.aStringArray640[++Class77.anInt828 - 1] = Class5.method17(var3).method1071(var24, var12.defaultString);
                                    } else {
                                        Class63.anIntArray645[++Class63.anInt644 - 1] = Class5.method17(var3).method1069(var24, var12.defaultInteger);
                                    }

                                    var11 = 1;
                                } else if (var0 == 6515) {
                                    Class63.anInt644 -= 2;
                                    var3 = Class63.anIntArray645[Class63.anInt644];
                                    var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                                    var12 = Class158.method1012(var24);
                                    if (var12.isString()) {
                                        Class63.aStringArray640[++Class77.anInt828 - 1] = Class149.method1001(var3).getOrDefault(var24, var12.defaultString);
                                    } else {
                                        Class63.anIntArray645[++Class63.anInt644 - 1] = Class149.method1001(var3).getOrDefault(var24, var12.defaultInteger);
                                    }

                                    var11 = 1;
                                } else if (var0 == 6516) {
                                    Class63.anInt644 -= 2;
                                    var3 = Class63.anIntArray645[Class63.anInt644];
                                    var24 = Class63.anIntArray645[Class63.anInt644 + 1];
                                    var12 = Class158.method1012(var24);
                                    byte[] var18;
                                    Node_Sub21_Sub10 var19;
                                    Node_Sub21_Sub10 var23;
                                    if (var12.isString()) {
                                        String[] var6 = Class63.aStringArray640;
                                        var16 = ++Class77.anInt828 - 1;
                                        var19 = (Node_Sub21_Sub10) Node_Sub21_Sub10.aReferenceCache2025.method973((long) var3);
                                        if (var19 != null) {
                                            var23 = var19;
                                        } else {
                                            var18 = Class156.aReferenceTable1843.method1085(34, var3);
                                            var19 = new Node_Sub21_Sub10();
                                            if (var18 != null) {
                                                var19.method1066(new Buffer(var18));
                                            }

                                            var19.method756();
                                            Node_Sub21_Sub10.aReferenceCache2025.method975(var19, (long) var3);
                                            var23 = var19;
                                        }

                                        var6[var16] = var23.method1068(var24, var12.defaultString);
                                    } else {
                                        int[] var25 = Class63.anIntArray645;
                                        var16 = ++Class63.anInt644 - 1;
                                        var19 = (Node_Sub21_Sub10) Node_Sub21_Sub10.aReferenceCache2025.method973((long) var3);
                                        if (var19 != null) {
                                            var23 = var19;
                                        } else {
                                            var18 = Class156.aReferenceTable1843.method1085(34, var3);
                                            var19 = new Node_Sub21_Sub10();
                                            if (var18 != null) {
                                                var19.method1066(new Buffer(var18));
                                            }

                                            var19.method756();
                                            Node_Sub21_Sub10.aReferenceCache2025.method975(var19, (long) var3);
                                            var23 = var19;
                                        }

                                        var25[var16] = var23.method1067(var24, var12.defaultInteger);
                                    }

                                    var11 = 1;
                                } else {
                                    var11 = 2;
                                }
                            }
                        }

                        return var11;
                    }
                }
            }
        }
    }

    public void method274(Class147 var1) {
        this.aClass147_326 = var1;
    }

    public void method270(Object[] var1) {
        this.args = var1;
    }
}
