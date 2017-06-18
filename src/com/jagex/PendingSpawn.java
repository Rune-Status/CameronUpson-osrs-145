package com.jagex;

public final class PendingSpawn extends Node {
    int id;
    int hitpoints = -1;
    int sceneX;
    int sceneY;
    int anInt327;
    int type;
    int anInt221;
    int orientation;
    int anInt328;
    int anInt214;
    int level;
    int delay = 0;

    static boolean method275(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = Class105.anInt1246 + var6;
        if (var7 < var0 && var7 < var1 && var7 < var2) {
            return false;
        } else {
            var7 = Class105.anInt1246 - var6;
            if (var7 > var0 && var7 > var1 && var7 > var2) {
                return false;
            } else {
                var7 = Class105.anInt1251 + var6;
                if (var7 < var3 && var7 < var4 && var7 < var5) {
                    return false;
                } else {
                    var7 = Class105.anInt1251 - var6;
                    return var7 <= var3 || var7 <= var4 || var7 <= var5;
                }
            }
        }
    }

    static char method276(char var0, int var1) {
        if (var0 >= 192 && var0 <= 255) {
            if (var0 >= 192 && var0 <= 198) {
                return 'A';
            }

            if (var0 == 199) {
                return 'C';
            }

            if (var0 >= 200 && var0 <= 203) {
                return 'E';
            }

            if (var0 >= 204 && var0 <= 207) {
                return 'I';
            }

            if (var0 >= 210 && var0 <= 214) {
                return 'O';
            }

            if (var0 >= 217 && var0 <= 220) {
                return 'U';
            }

            if (var0 == 221) {
                return 'Y';
            }

            if (var0 == 223) {
                return 's';
            }

            if (var0 >= 224 && var0 <= 230) {
                return 'a';
            }

            if (var0 == 231) {
                return 'c';
            }

            if (var0 >= 232 && var0 <= 235) {
                return 'e';
            }

            if (var0 >= 236 && var0 <= 239) {
                return 'i';
            }

            if (var0 >= 242 && var0 <= 246) {
                return 'o';
            }

            if (var0 >= 249 && var0 <= 252) {
                return 'u';
            }

            if (var0 == 253 || var0 == 255) {
                return 'y';
            }
        }

        if (var0 == 338) {
            return 'O';
        } else if (var0 == 339) {
            return 'o';
        } else {
            return var0 == 376 ? 'Y' : var0;
        }
    }
}
