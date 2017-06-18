package com.jagex;

public class MapTile {
    static InterfaceComponent anInterfaceComponent83;
    final int x;
    final int y;
    final int z;

    MapTile(int z, int x, int y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    static void method59(Player var0, int var1, int var2, byte var3) {
        int var4 = var0.anIntArray800[0];
        int var5 = var0.anIntArray804[0];
        int var6 = var0.method195();
        if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
            if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
                int var9 = var0.method195();
                Client.aClass113_Sub1_1462.anInt1332 = var1;
                Client.aClass113_Sub1_1462.anInt1335 = var2;
                Client.aClass113_Sub1_1462.anInt1334 = 1;
                Client.aClass113_Sub1_1462.anInt1333 = 1;
                Class113_Sub1 var10 = Client.aClass113_Sub1_1462;
                int var11 = Class34.method222(var4, var5, var9, var10, Client.collisionMaps[var0.combatLevel], true, Client.anIntArray1457, Client.anIntArray1467);
                if (var11 >= 1) {
                    for (int var12 = 0; var12 < var11 - 1; ++var12) {
                        var0.method201(Client.anIntArray1457[var12], Client.anIntArray1467[var12], var3);
                    }

                }
            }
        }
    }

    static Sprite[] method60(ReferenceTable var0, int var1, int var2) {
        return !Class64.method381(var0, var1, var2) ? null : HealthBar.method343();
    }
}
