package com.jagex;

public class Class138 {
    static int anInt1760;
    int anInt1762;
    int anInt1763;
    int anInt1764;
    byte[] aByteArray1768;
    int anInt1766;
    int anInt1767;
    int anInt1765;
    byte[] aByteArray1759;
    int anInt1761;

    static void method966(int var0, int var1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = var0;
        var3[0] = var1;
        int var4 = 1;

        for (int var5 = 0; var5 < 4; ++var5) {
            if (var0 != World.anIntArray385[var5]) {
                var2[var4] = World.anIntArray385[var5];
                var3[var4] = World.anIntArray387[var5];
                ++var4;
            }
        }

        World.anIntArray385 = var2;
        World.anIntArray387 = var3;
        Player.method192(World.aWorldArray396, 0, World.aWorldArray396.length - 1, World.anIntArray385, World.anIntArray387);
    }
}
