package com.jagex;

public class Node_Sub21_Sub6 extends DoublyNode {
    byte aByte2002;
    int anInt209;
    CacheReferenceTable aCacheReferenceTable2001;

    static boolean calcAxisAlignedBoundingBox(Model model, int x, int z, int y) {
        if (!ObjectDefinition.method345()) {
            return false;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        int var10;
        int var11;
        int var12;
        int var15;
        int var16;
        if (!Class105.aBoolean1245) {
            var4 = SceneGraph.pitchSin;
            var5 = SceneGraph.pitchCos;
            var6 = SceneGraph.yawSin;
            var7 = SceneGraph.yawCos;
            byte var8 = 50;
            short var9 = 3500;
            var10 = (Class105.anInt1251 - Node_Sub21_Sub26_Sub1.viewportCenterX) * var8 / Node_Sub21_Sub26_Sub1.anInt228;
            var11 = var8 * (Class105.anInt1246 - Node_Sub21_Sub26_Sub1.viewportCenterY) / Node_Sub21_Sub26_Sub1.anInt228;
            var12 = (Class105.anInt1251 - Node_Sub21_Sub26_Sub1.viewportCenterX) * var9 / Node_Sub21_Sub26_Sub1.anInt228;
            int var13 = (Class105.anInt1246 - Node_Sub21_Sub26_Sub1.viewportCenterY) * var9 / Node_Sub21_Sub26_Sub1.anInt228;
            int var14 = Node_Sub21_Sub26_Sub1.method642(var11, var8, var5, var4);
            var15 = Node_Sub21_Sub26_Sub1.method643(var11, var8, var5, var4);
            var11 = var14;
            var14 = Node_Sub21_Sub26_Sub1.method642(var13, var9, var5, var4);
            var16 = Node_Sub21_Sub26_Sub1.method643(var13, var9, var5, var4);
            var13 = var14;
            var14 = Node_Sub21_Sub26_Sub1.method628(var10, var15, var7, var6);
            var15 = Node_Sub21_Sub26_Sub1.method647(var10, var15, var7, var6);
            var10 = var14;
            var14 = Node_Sub21_Sub26_Sub1.method628(var12, var16, var7, var6);
            var16 = Node_Sub21_Sub26_Sub1.method647(var12, var16, var7, var6);
            Class105.anInt1248 = (var14 + var10) / 2;
            Class105.anInt1250 = (var11 + var13) / 2;
            Hitbar.anInt221 = (var16 + var15) / 2;
            Class186.anInt2183 = (var14 - var10) / 2;
            Class105.anInt1247 = (var13 - var11) / 2;
            ClientPreferences.anInt346 = (var16 - var15) / 2;
            RuneScript.anInt226 = Math.abs(Class186.anInt2183);
            Class109.anInt1301 = Math.abs(Class105.anInt1247);
            Class105.anInt1252 = Math.abs(ClientPreferences.anInt346);
        }

        var4 = x + model.anInt754;
        var5 = z + model.anInt745;
        var6 = y + model.anInt755;
        var7 = model.anInt760;
        var15 = model.anInt757;
        var16 = model.anInt746;
        var10 = Class105.anInt1248 - var4;
        var11 = Class105.anInt1250 - var5;
        var12 = Hitbar.anInt221 - var6;
        if (Math.abs(var10) > var7 + RuneScript.anInt226) {
            return false;
        }
        if (Math.abs(var11) > var15 + Class109.anInt1301) {
            return false;
        }
        if (Math.abs(var12) > Class105.anInt1252 + var16) {
            return false;
        }
        if (Math.abs(Class105.anInt1247 * var12 - var11 * ClientPreferences.anInt346) > Class109.anInt1301 * var16 + Class105.anInt1252 * var15) {
            return false;
        }
        if (Math.abs(ClientPreferences.anInt346 * var10 - var12 * Class186.anInt2183) > Class105.anInt1252 * var7 + RuneScript.anInt226 * var16) {
            return false;
        }
        return Math.abs(Class186.anInt2183 * var11 - var10 * Class105.anInt1247) <= var7 * Class109.anInt1301 + var15 * RuneScript.anInt226;
    }
}
