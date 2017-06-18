package com.jagex;

public final class Class36 {
    static void method263(Packet var0) {
        var0.method790();
        int var1 = Client.playerIndex;
        Player var2 = Client.player = Client.players[var1] = new Player();
        var2.anInt213 = var1;
        int var3 = var0.method788(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 16383;
        int var6 = var3 & 16383;
        var2.anIntArray800[0] = var5 - Class62.anInt636;
        var2.strictX = (var2.anIntArray800[0] << 7) + (var2.method195() << 6);
        var2.anIntArray804[0] = var6 - Class49.anInt377;
        var2.strictY = (var2.anIntArray804[0] << 7) + (var2.method195() << 6);
        Player.floorLevel = var2.combatLevel = var4;
        if (Class71.aBufferArray728[var1] != null) {
            var2.method198(Class71.aBufferArray728[var1]);
        }

        Class71.anInt729 = 0;
        Class71.anIntArray723[++Class71.anInt729 - 1] = var1;
        Class71.aByteArray719[var1] = 0;
        Class71.anInt722 = 0;

        for (int var7 = 1; var7 < 2048; ++var7) {
            if (var1 != var7) {
                int var8 = var0.method788(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 597;
                int var11 = var8 & 597;
                Class71.anIntArray718[var7] = (var10 << 14) + (var9 << 28) + var11;
                Class71.anIntArray725[var7] = 0;
                Class71.anIntArray726[var7] = -1;
                Class71.anIntArray720[++Class71.anInt722 - 1] = var7;
                Class71.aByteArray719[var7] = 0;
            }
        }

        var0.method789();
    }

    static InterfaceComponent method264(InterfaceComponent var0) {
        int var1 = Class75.method450(Class75.method448(var0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; ++var2) {
            var0 = Class161.method1016(var0.parentUid);
            if (var0 == null) {
                return null;
            }
        }

        return var0;
    }
}
