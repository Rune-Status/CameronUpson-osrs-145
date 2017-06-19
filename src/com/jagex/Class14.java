package com.jagex;

public class Class14 {
    static final Class14 aClass14_114 = new Class14(0);
    static final Class14 aClass14_117 = new Class14(1);
    static int[][] anIntArrayArray118;
    static Class115 aClass115_116;
    final int anInt115;

    Class14(int var1) {
        this.anInt115 = var1;
    }

    public static void method128() {
        Class105.aBoolean1242 = false;
        Class105.onCursorCount = 0;
    }

    static void method129(int var0) {
        Applet_Sub1.method233();
        Boundary.method655();
        int var1 = Class74.method436(var0).anInt232;
        if (var1 != 0) {
            int var2 = Varps.values[var0];
            if (var1 == 1) {
                if (var2 == 1) {
                    Node_Sub21_Sub26_Sub1.method648(0.9D);
                    ((TextureProviderImpl) Node_Sub21_Sub26_Sub1.aTextureProvider1085).method498(0.9D);
                }

                if (var2 == 2) {
                    Node_Sub21_Sub26_Sub1.method648(0.8D);
                    ((TextureProviderImpl) Node_Sub21_Sub26_Sub1.aTextureProvider1085).method498(0.8D);
                }

                if (var2 == 3) {
                    Node_Sub21_Sub26_Sub1.method648(0.7D);
                    ((TextureProviderImpl) Node_Sub21_Sub26_Sub1.aTextureProvider1085).method498(0.7D);
                }

                if (var2 == 4) {
                    Node_Sub21_Sub26_Sub1.method648(0.6D);
                    ((TextureProviderImpl) Node_Sub21_Sub26_Sub1.aTextureProvider1085).method498(0.6D);
                }

                PlayerAppearance.method1041();
            }

            if (var1 == 3) {
                short var3 = 0;
                if (var2 == 0) {
                    var3 = 255;
                }

                if (var2 == 1) {
                    var3 = 192;
                }

                if (var2 == 2) {
                    var3 = 128;
                }

                if (var2 == 3) {
                    var3 = 64;
                }

                if (var2 == 4) {
                    var3 = 0;
                }

                if (Client.anInt1694 != var3) {
                    if (Client.anInt1694 == 0 && Client.anInt1703 != -1) {
                        Class43.method298(Class100.midi, Client.anInt1703, 0, var3, false);
                        Client.aBoolean1707 = false;
                    } else if (var3 == 0) {
                        Class133.aNode_Sub10_Sub3_1723.method916();
                        Class133.anInt1725 = 1;
                        Class133.aReferenceTable1727 = null;
                        Client.aBoolean1707 = false;
                    } else {
                        Class61.method374(var3);
                    }

                    Client.anInt1694 = var3;
                }
            }

            if (var1 == 4) {
                if (var2 == 0) {
                    Client.anInt1704 = 127;
                }

                if (var2 == 1) {
                    Client.anInt1704 = 96;
                }

                if (var2 == 2) {
                    Client.anInt1704 = 64;
                }

                if (var2 == 3) {
                    Client.anInt1704 = 32;
                }

                if (var2 == 4) {
                    Client.anInt1704 = 0;
                }
            }

            if (var1 == 5) {
                Client.anInt1610 = var2;
            }

            if (var1 == 6) {
                Client.anInt1626 = var2;
            }

            if (var1 == 9) {
                Client.anInt1620 = var2;
            }

            if (var1 == 10) {
                if (var2 == 0) {
                    Client.anInt1699 = 127;
                }

                if (var2 == 1) {
                    Client.anInt1699 = 96;
                }

                if (var2 == 2) {
                    Client.anInt1699 = 64;
                }

                if (var2 == 3) {
                    Client.anInt1699 = 32;
                }

                if (var2 == 4) {
                    Client.anInt1699 = 0;
                }
            }

            if (var1 == 17) {
                Client.anInt1641 = var2 & '\uffff';
            }

            Class55[] var4;
            if (var1 == 18) {
                var4 = new Class55[]{Class55.aClass55_423, Class55.aClass55_420, Class55.aClass55_425, Class55.aClass55_422};
                Client.aClass55_1491 = (Class55) EnumOrdinal.getByOrdinal(var4, var2);
                if (Client.aClass55_1491 == null) {
                    Client.aClass55_1491 = Class55.aClass55_420;
                }
            }

            if (var1 == 19) {
                if (var2 == -1) {
                    Client.anInt1608 = -1;
                } else {
                    Client.anInt1608 = var2 & 2047;
                }
            }

            if (var1 == 22) {
                var4 = new Class55[]{Class55.aClass55_423, Class55.aClass55_420, Class55.aClass55_425, Class55.aClass55_422};
                Client.aClass55_1497 = (Class55) EnumOrdinal.getByOrdinal(var4, var2);
                if (Client.aClass55_1497 == null) {
                    Client.aClass55_1497 = Class55.aClass55_420;
                }
            }

        }
    }
}
