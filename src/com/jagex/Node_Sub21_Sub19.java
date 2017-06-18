package com.jagex;

public class Node_Sub21_Sub19 extends DoublyNode {
    public static boolean aBoolean2098;
    public static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    public static ReferenceTable aReferenceTable2012;
    public int anInt206 = 0;

    static void method1124(int var0, SceneOffset var1, boolean var2) {
        WorldMapTransportation var3 = InterfaceNode.method268().method1276(var0);
        int var4 = Client.player.combatLevel;
        int var5 = (Client.player.strictX >> 7) + Class62.anInt636;
        int var6 = (Client.player.strictY >> 7) + Class49.anInt377;
        SceneOffset var7 = new SceneOffset(var4, var5, var6);
        InterfaceNode.method268().method1299(var3, var7, var1, var2);
    }

    void method1051(Buffer var1, int var2) {
        if (var2 == 2) {
            this.anInt206 = var1.readUnsignedShort();
        }

    }

    public void method1052(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1051(var1, var2);
        }
    }
}
