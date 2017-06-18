package com.jagex;

public final class Boundary {
    static Font aFont1150;
    static int[] anIntArray1140;
    static int[] anIntArray1148;
    public int uid = 0;
    public Entity entity;
    public Entity anEntity1147;
    int anInt1144;
    int sceneX;
    int sceneY;
    int anInt1143 = 0;
    int level;
    int anInt1141;

    public static boolean method656(char var0) {
        return var0 >= '0' && var0 <= '9';
    }

    static void method655() {
        for (Node_Sub7 var0 = Node_Sub7.aNodeDeque403.method995(); var0 != null; var0 = Node_Sub7.aNodeDeque403.next()) {
            if (var0.anObjectDefinition402 != null) {
                var0.method335();
            }
        }

    }
}
