package com.jagex;

public class Varps {
    public static int[] anIntArray2000;
    public static int[] anIntArray1998 = new int[32];
    public static int[] values;

    static {
        int var0 = 2;

        for (int var1 = 0; var1 < 32; ++var1) {
            anIntArray1998[var1] = var0 - 1;
            var0 += var0;
        }

        anIntArray2000 = new int[2000];
        values = new int[2000];
    }

    static void method1047() {
        if (Class9.aClass189_68 != null) {
            Class9.aClass189_68.method1295(Player.floorLevel, Class62.anInt636 + (Client.player.strictX >> 7), (Client.player.strictY >> 7) + Class49.anInt377, false);
            Class9.aClass189_68.method1301();
        }

    }

    static void method1045(String var0) {
        if (var0 != null) {
            String var1 = Class84.method484(var0, Class2.aClass188_13);
            if (var1 != null) {
                for (int var2 = 0; var2 < Client.anInt1450; ++var2) {
                    IgnoredPlayer var3 = Client.ignoredPlayers[var2];
                    String var4 = var3.aString242;
                    String var5 = Class84.method484(var4, Class2.aClass188_13);
                    if (Class170.method1152(var0, var1, var4, var5)) {
                        --Client.anInt1450;

                        for (int var6 = var2; var6 < Client.anInt1450; ++var6) {
                            Client.ignoredPlayers[var6] = Client.ignoredPlayers[var6 + 1];
                        }

                        Client.anInt1660 = Client.anInt1644;
                        Client.packet.writeHeader(163);
                        Client.packet.method451(Class27.method179(var0));
                        Client.packet.method865(var0);
                        break;
                    }
                }

            }
        }
    }

    static void method1046(int var0) {
        ItemTable var1 = ItemTable.itemTables.lookup((long) var0);
        if (var1 != null) {
            var1.unlink();
        }
    }
}
