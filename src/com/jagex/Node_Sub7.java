package com.jagex;

public final class Node_Sub7 extends Node {
    static String aString405;
    static NodeDeque<Node_Sub7> aNodeDeque403 = new NodeDeque<>();
    int anInt209;
    int anInt214;
    int anInt220;
    int anInt327;
    int anInt232;
    int anInt221;
    Node_Sub10_Sub2 aNode_Sub10_Sub2_401;
    int anInt226;
    int[] anIntArray404;
    int anInt225;
    Node_Sub10_Sub2 aNode_Sub10_Sub2_400;
    ObjectDefinition anObjectDefinition402;
    int anInt328;
    int anInt206;

    static void method334(int var0, int var1, int var2, int var3, Sprite var4, Node_Sub21_Sub5 var5) {
        if (var4 != null) {
            int var6 = Client.mapScale + Client.mapRotation & 2047;
            int var7 = var2 * var2 + var3 * var3;
            if (var7 <= 6400) {
                int var8 = Node_Sub21_Sub26_Sub1.SINE[var6];
                int var9 = Node_Sub21_Sub26_Sub1.COS[var6];
                var8 = var8 * 256 / (Client.mapOffset + 256);
                var9 = var9 * 256 / (Client.mapOffset + 256);
                int var10 = var3 * var8 + var9 * var2 >> 16;
                int var11 = var9 * var3 - var8 * var2 >> 16;
                if (var7 > 2500) {
                    var4.method1250(var10 + var5.anInt204 / 2 - var4.anInt328 / 2, var5.anInt209 / 2 - var11 - var4.anInt221 / 2, var0, var1, var5.anInt204, var5.anInt209, var5.anIntArray950, var5.anIntArray340);
                } else {
                    var4.method1230(var0 + var5.anInt204 / 2 + var10 - var4.anInt328 / 2, var1 + var5.anInt209 / 2 - var11 - var4.anInt221 / 2);
                }

            }
        }
    }

    void method335() {
        int var1 = this.anInt220;
        ObjectDefinition var2 = this.anObjectDefinition402.method1073();
        if (var2 != null) {
            this.anInt220 = var2.anInt767;
            this.anInt221 = var2.anInt2032 * 128;
            this.anInt214 = var2.anInt2036;
            this.anInt226 = var2.anInt1864;
            this.anIntArray404 = var2.anIntArray751;
        } else {
            this.anInt220 = -1;
            this.anInt221 = 0;
            this.anInt214 = 0;
            this.anInt226 = 0;
            this.anIntArray404 = null;
        }

        if (var1 != this.anInt220 && this.aNode_Sub10_Sub2_401 != null) {
            Class15.aNode_Sub10_Sub1_123.method427(this.aNode_Sub10_Sub2_401);
            this.aNode_Sub10_Sub2_401 = null;
        }

    }
}
