package com.jagex;

import java.applet.Applet;

public class RuntimeException_Sub1 extends RuntimeException {
    public static String aString1288;
    public static int revision;
    public static Applet anApplet1283;
    static int anInt1284;
    Throwable aThrowable1287;
    String aString1286;

    public static Sprite[] method742(ReferenceTable var0, String var1, String var2) {
        int var3 = var0.method1084(var1);
        int var4 = var0.method1104(var3, var2);
        return MapTile.method60(var0, var3, var4);
    }

    static void method743(InterfaceComponent var0, int var1, int var2) {
        if (var0.anInt236 == 0) {
            var0.relativeX = var0.anInt234;
        } else if (var0.anInt236 == 1) {
            var0.relativeX = (var1 - var0.width) / 2 + var0.anInt234;
        } else if (var0.anInt236 == 2) {
            var0.relativeX = var1 - var0.width - var0.anInt234;
        } else if (var0.anInt236 == 3) {
            var0.relativeX = var0.anInt234 * var1 >> 14;
        } else if (var0.anInt236 == 4) {
            var0.relativeX = (var1 - var0.width) / 2 + (var1 * var0.anInt234 >> 14);
        } else {
            var0.relativeX = var1 - var0.width - (var1 * var0.anInt234 >> 14);
        }

        if (var0.anInt213 == 0) {
            var0.relativeY = var0.anInt765;
        } else if (var0.anInt213 == 1) {
            var0.relativeY = var0.anInt765 + (var2 - var0.height) / 2;
        } else if (var0.anInt213 == 2) {
            var0.relativeY = var2 - var0.height - var0.anInt765;
        } else if (var0.anInt213 == 3) {
            var0.relativeY = var2 * var0.anInt765 >> 14;
        } else if (var0.anInt213 == 4) {
            var0.relativeY = (var0.anInt765 * var2 >> 14) + (var2 - var0.height) / 2;
        } else {
            var0.relativeY = var2 - var0.height - (var0.anInt765 * var2 >> 14);
        }

        if (Client.aBoolean1637 && var0.type == 0) {
            if (var0.relativeX < 0) {
                var0.relativeX = 0;
            } else if (var0.width + var0.relativeX > var1) {
                var0.relativeX = var1 - var0.width;
            }

            if (var0.relativeY < 0) {
                var0.relativeY = 0;
            } else if (var0.relativeY + var0.height > var2) {
                var0.relativeY = var2 - var0.height;
            }
        }

    }

    static void method741(int var0, int var1, int var2) {
        if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
            int var3 = Class25.method175(var0, var1, PlayerEntity.floorLevel) - var2;
            var0 -= Class53.cameraX;
            var3 -= Class85.cameraZ;
            var1 -= Class34.cameraY;
            int var4 = Node_Sub21_Sub26_Sub1.SINE[Class133.cameraPitch];
            int var5 = Node_Sub21_Sub26_Sub1.COS[Class133.cameraPitch];
            int var6 = Node_Sub21_Sub26_Sub1.SINE[Class43.cameraYaw];
            int var7 = Node_Sub21_Sub26_Sub1.COS[Class43.cameraYaw];
            int var8 = var1 * var6 + var7 * var0 >> 16;
            var1 = var1 * var7 - var0 * var6 >> 16;
            var0 = var8;
            var8 = var3 * var5 - var4 * var1 >> 16;
            var1 = var3 * var4 + var5 * var1 >> 16;
            if (var1 >= 50) {
                Client.anInt1561 = Client.viewportWidth / 2 + Client.viewportScale * var0 / var1;
                Client.anInt1571 = Client.viewportHeight / 2 + Client.viewportScale * var8 / var1;
            } else {
                Client.anInt1561 = -1;
                Client.anInt1571 = -1;
            }

        } else {
            Client.anInt1561 = -1;
            Client.anInt1571 = -1;
        }
    }
}
