package com.jagex;

public class Class178 {
    public int anInt2142;
    public int anInt2141;

    Class178(int var1, int var2, int var3, int var4) {
        this.method1190(var1, var2);
        this.method1192(var3, var4);
    }

    public Class178(int var1, int var2) {
        this(0, 0, var1, var2);
    }

    static int method1191(int var0, RuneScript var1, boolean var2) {
        String var3;
        if (var0 == 3100) {
            var3 = Class63.aStringArray640[--Class77.anInt828];
            Class78.addChatMessage(0, "", var3);
            return 1;
        }
        if (var0 == 3101) {
            Class63.anInt644 -= 2;
            Player.method394(Client.player, Class63.anIntArray645[Class63.anInt644], Class63.anIntArray645[Class63.anInt644 + 1]);
            return 1;
        }
        if (var0 == 3103) {
            Class174.method1186();
            return 1;
        }
        int var13;
        if (var0 == 3104) {
            var3 = Class63.aStringArray640[--Class77.anInt828];
            var13 = 0;
            if (CacheIndex.method803(var3)) {
                var13 = Class85.method495(var3);
            }

            Client.packet.writeHeader(192);
            Client.packet.method869(var13);
            return 1;
        }
        if (var0 == 3105) {
            var3 = Class63.aStringArray640[--Class77.anInt828];
            Client.packet.writeHeader(98);
            Client.packet.method451(var3.length() + 1);
            Client.packet.method865(var3);
            return 1;
        }
        if (var0 == 3106) {
            var3 = Class63.aStringArray640[--Class77.anInt828];
            Client.packet.writeHeader(141);
            Client.packet.method451(var3.length() + 1);
            Client.packet.method865(var3);
            return 1;
        }
        int var5;
        String var6;
        int var7;
        if (var0 != 3107) {
            if (var0 == 3108) {
                Class63.anInt644 -= 3;
                var5 = Class63.anIntArray645[Class63.anInt644];
                var13 = Class63.anIntArray645[Class63.anInt644 + 1];
                var7 = Class63.anIntArray645[Class63.anInt644 + 2];
                InterfaceComponent var14 = InterfaceComponent.method1016(var7);
                Class38.method283(var14, var5, var13);
                return 1;
            }
            if (var0 == 3109) {
                Class63.anInt644 -= 2;
                var5 = Class63.anIntArray645[Class63.anInt644];
                var13 = Class63.anIntArray645[Class63.anInt644 + 1];
                InterfaceComponent var15 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
                Class38.method283(var15, var5, var13);
                return 1;
            }
            if (var0 == 3110) {
                Class163.aBoolean1965 = Class63.anIntArray645[--Class63.anInt644] == 1;
                return 1;
            }
            if (var0 == 3111) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.preferences.roofsHidden ? 1 : 0;
                return 1;
            }
            if (var0 == 3112) {
                Client.preferences.roofsHidden = Class63.anIntArray645[--Class63.anInt644] == 1;
                Class78.method467();
                return 1;
            }
            if (var0 == 3113) {
                var3 = Class63.aStringArray640[--Class77.anInt828];
                boolean var4 = Class63.anIntArray645[--Class63.anInt644] == 1;
                Class54.method348(var3, var4, false);
                return 1;
            }
            if (var0 == 3115) {
                var5 = Class63.anIntArray645[--Class63.anInt644];
                Client.packet.writeHeader(193);
                Client.packet.method755(var5);
                return 1;
            }
            if (var0 == 3116) {
                var5 = Class63.anIntArray645[--Class63.anInt644];
                Class77.anInt828 -= 2;
                var6 = Class63.aStringArray640[Class77.anInt828];
                String var12 = Class63.aStringArray640[Class77.anInt828 + 1];
                if (var6.length() > 500) {
                    return 1;
                }
                if (var12.length() > 500) {
                    return 1;
                }
                Client.packet.writeHeader(49);
                Client.packet.method755(BefriendedPlayer.method179(var6) + 1 + BefriendedPlayer.method179(var12));
                Client.packet.method865(var12);
                Client.packet.method823(var5);
                Client.packet.method865(var6);
                return 1;
            }
            if (var0 == 3117) {
                Client.aBoolean1628 = Class63.anIntArray645[--Class63.anInt644] == 1;
                return 1;
            }
            return 2;
        }
        var5 = Class63.anIntArray645[--Class63.anInt644];
        var6 = Class63.aStringArray640[--Class77.anInt828];
        var7 = Class71.anInt729;
        int[] var8 = Class71.anIntArray723;
        boolean var9 = false;

        for (int var10 = 0; var10 < var7; ++var10) {
            Player var11 = Client.players[var8[var10]];
            if (var11 != null && var11 != Client.player && var11.name != null && var11.name.equalsIgnoreCase(var6)) {
                if (var5 == 1) {
                    Client.packet.writeHeader(187);
                    Client.packet.method853(var8[var10]);
                    Client.packet.method836(0);
                } else if (var5 == 4) {
                    Client.packet.writeHeader(90);
                    Client.packet.method836(0);
                    Client.packet.method843(var8[var10]);
                } else if (var5 == 6) {
                    Client.packet.writeHeader(196);
                    Client.packet.method755(var8[var10]);
                    Client.packet.method839(0);
                } else if (var5 == 7) {
                    Client.packet.writeHeader(165);
                    Client.packet.method843(var8[var10]);
                    Client.packet.method451(0);
                }

                var9 = true;
                break;
            }
        }

        if (!var9) {
            Class78.addChatMessage(4, "", "Unable to find " + var6);
        }

        return 1;
    }

    void method1190(int var1, int var2) {
    }

    void method1192(int var1, int var2) {
        this.anInt2141 = var1;
        this.anInt2142 = var2;
    }
}
