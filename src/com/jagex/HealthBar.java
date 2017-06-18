package com.jagex;

import java.io.File;

public class HealthBar extends Node {
    static File aFile416;
    HealthBarDefinition definition;
    LinkedList<Hitbar> hitsplats = new LinkedList<>();

    HealthBar(HealthBarDefinition var1) {
        this.definition = var1;
    }

    static void method342(Class34 var0) {
        if (Client.player.strictX >> 7 == Client.destinationX && Client.player.strictY >> 7 == Client.destinationY) {
            Client.destinationX = 0;
        }

        int var1 = Class71.anInt729;
        int[] var2 = Class71.anIntArray723;
        int var3 = var1;
        if (var0 == Class34.aClass34_273 || var0 == Class34.aClass34_278) {
            var3 = 1;
        }

        for (int var4 = 0; var4 < var3; ++var4) {
            Player var5;
            int var6;
            if (var0 == Class34.aClass34_273) {
                var5 = Client.player;
                var6 = Client.player.anInt213 << 14;
            } else if (var0 == Class34.aClass34_278) {
                var5 = Client.players[Client.anInt1608];
                var6 = Client.anInt1608 << 14;
            } else {
                var5 = Client.players[var2[var4]];
                var6 = var2[var4] << 14;
                if (var0 == Class34.aClass34_275 && Client.anInt1608 == var2[var4]) {
                    continue;
                }
            }

            if (var5 != null && var5.method194() && !var5.aBoolean215) {
                var5.aBoolean223 = (Client.lowMemory && var1 > 50 || var1 > 200) && var0 != Class34.aClass34_273 && var5.anInt754 == var5.anInt768;

                int var7 = var5.strictX >> 7;
                int var8 = var5.strictY >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.aModel218 != null && Client.engineCycle >= var5.anInt214 && Client.engineCycle < var5.anInt226) {
                        var5.aBoolean223 = false;
                        var5.anInt217 = Class25.method175(var5.strictX, var5.strictY, Player.floorLevel);
                        Class60.aSceneGraph631.method703(Player.floorLevel, var5.strictX, var5.strictY, var5.anInt217, 60, var5, var5.anInt748, var6, var5.anInt235, var5.anInt230, var5.anInt222, var5.anInt229);
                    } else {
                        if ((var5.strictX & 127) == 64 && (var5.strictY & 127) == 64) {
                            if (Client.anInt1565 == Client.anIntArrayArray1559[var7][var8]) {
                                continue;
                            }

                            Client.anIntArrayArray1559[var7][var8] = Client.anInt1565;
                        }

                        var5.anInt217 = Class25.method175(var5.strictX, var5.strictY, Player.floorLevel);
                        Class60.aSceneGraph631.method698(Player.floorLevel, var5.strictX, var5.strictY, var5.anInt217, 60, var5, var5.anInt748, var6, var5.aBoolean758);
                    }
                }
            }
        }

    }

    static Sprite[] method343() {
        Sprite[] var0 = new Sprite[Class191.anInt2244];

        for (int var1 = 0; var1 < Class191.anInt2244; ++var1) {
            Sprite var2 = var0[var1] = new Sprite();
            var2.anInt328 = Class160.anInt1857;
            var2.anInt221 = Class191.anInt2246;
            var2.anInt232 = Class191.anIntArray2245[var1];
            var2.anInt327 = Class191.anIntArray2248[var1];
            var2.width = Class191.anIntArray2249[var1];
            var2.height = Class109.anIntArray1305[var1];
            int var3 = var2.width * var2.height;
            byte[] var4 = Class191.aByteArrayArray2247[var1];
            var2.pixels = new int[var3];

            for (int var5 = 0; var5 < var3; ++var5) {
                var2.pixels[var5] = Class94.anIntArray1043[var4[var5] & 255];
            }
        }

        Class191.anIntArray2245 = null;
        Class191.anIntArray2248 = null;
        Class191.anIntArray2249 = null;
        Class109.anIntArray1305 = null;
        Class94.anIntArray1043 = null;
        Class191.aByteArrayArray2247 = null;
        return var0;
    }

    static void method344(String var0) {
        if (!var0.equals("")) {
            Client.packet.writeHeader(105);
            Client.packet.method451(BefriendedPlayer.method179(var0));
            Client.packet.method865(var0);
        }
    }

    void method341(int var1, int var2, int var3, int var4) {
        Hitbar var5 = null;
        int var6 = 0;

        for (Hitbar var7 = this.hitsplats.method909(); var7 != null; var7 = this.hitsplats.method911()) {
            ++var6;
            if (var7.cycle == var1) {
                var7.method341(var1, var2, var3, var4);
                return;
            }

            if (var7.cycle <= var1) {
                var5 = var7;
            }
        }

        if (var5 == null) {
            if (var6 < 4) {
                this.hitsplats.method912(new Hitbar(var1, var2, var3, var4));
            }

        } else {
            LinkedList.method908(new Hitbar(var1, var2, var3, var4), var5);
            if (var6 >= 4) {
                this.hitsplats.method909().unlink();
            }

        }
    }

    Hitbar method346(int var1) {
        Hitbar var2 = this.hitsplats.method909();
        if (var2 != null && var2.cycle <= var1) {
            for (Hitbar var3 = this.hitsplats.method911(); var3 != null && var3.cycle <= var1; var3 = this.hitsplats.method911()) {
                var2.unlink();
                var2 = var3;
            }

            if (var2.anInt232 + var2.cycle + this.definition.anInt228 > var1) {
                return var2;
            }
            var2.unlink();
            return null;
        }
        return null;
    }

    boolean method345() {
        return this.hitsplats.method906();
    }
}
