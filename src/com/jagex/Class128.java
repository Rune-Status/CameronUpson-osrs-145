package com.jagex;

public class Class128 {
    static byte[][] aByteArrayArray1412 = new byte[250][];
    static int anInt1414 = 0;
    static int anInt1411 = 0;
    static byte[][] aByteArrayArray1410 = new byte[1000][];
    static int anInt1409 = 0;
    static byte[][] aByteArrayArray1413 = new byte[50][];

    static synchronized byte[] method878(int var0) {
        byte[] var1;
        if (var0 == 100 && anInt1409 > 0) {
            var1 = aByteArrayArray1410[--anInt1409];
            aByteArrayArray1410[anInt1409] = null;
            return var1;
        }
        if (var0 == 5000 && anInt1414 > 0) {
            var1 = aByteArrayArray1412[--anInt1414];
            aByteArrayArray1412[anInt1414] = null;
            return var1;
        }
        if (var0 == 30000 && anInt1411 > 0) {
            var1 = aByteArrayArray1413[--anInt1411];
            aByteArrayArray1413[anInt1411] = null;
            return var1;
        }
        return new byte[var0];
    }

    static void method879(int var0, int var1, int var2, int var3) {
        for (int var4 = var1; var4 <= var1 + var3; ++var4) {
            for (int var5 = var0; var5 <= var2 + var0; ++var5) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Class179.aByteArrayArrayArray2145[0][var5][var4] = 127;
                    if (var5 == var0 && var5 > 0) {
                        Class26.anIntArrayArrayArray191[0][var5][var4] = Class26.anIntArrayArrayArray191[0][var5 - 1][var4];
                    }

                    if (var5 == var0 + var2 && var5 < 103) {
                        Class26.anIntArrayArrayArray191[0][var5][var4] = Class26.anIntArrayArrayArray191[0][var5 + 1][var4];
                    }

                    if (var4 == var1 && var4 > 0) {
                        Class26.anIntArrayArrayArray191[0][var5][var4] = Class26.anIntArrayArrayArray191[0][var5][var4 - 1];
                    }

                    if (var3 + var1 == var4 && var4 < 103) {
                        Class26.anIntArrayArrayArray191[0][var5][var4] = Class26.anIntArrayArrayArray191[0][var5][var4 + 1];
                    }
                }
            }
        }

    }

    public static String method881(long var0) {
        if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
                return null;
            }
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
                ++var2;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
                long var6 = var0;
                var0 /= 37L;
                var5.append(Class177.aCharArray2140[(int) (var6 - var0 * 37L)]);
            }

            return var5.reverse().toString();
        }
        return null;
    }

    static void method880(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        PendingSpawn var9 = null;

        for (PendingSpawn var10 = Client.pendingSpawns.method995(); var10 != null; var10 = Client.pendingSpawns.next()) {
            if (var10.level == var0 && var1 == var10.sceneX && var10.sceneY == var2 && var3 == var10.type) {
                var9 = var10;
                break;
            }
        }

        if (var9 == null) {
            var9 = new PendingSpawn();
            var9.level = var0;
            var9.type = var3;
            var9.sceneX = var1;
            var9.sceneY = var2;
            Class4.method14(var9);
            Client.pendingSpawns.method997(var9);
        }

        var9.id = var4;
        var9.anInt214 = var5;
        var9.orientation = var6;
        var9.delay = var7;
        var9.hitpoints = var8;
    }
}
