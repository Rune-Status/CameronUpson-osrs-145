package com.jagex;

public final class EntityMarker {
    public Entity entity;
    public int uid = 0;
    int anInt1125;
    int height;
    int endSceneX;
    int endSceneY;
    int sceneX;
    int level;
    int anInt1122;
    int sceneY;
    int anInt1129;
    int anInt1131;
    int config = 0;
    int anInt1127;

    static void method652(int var0) {
        int[] var1 = PathingEntity.aSprite794.pixels;
        int var2 = var1.length;

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            var1[var3] = 0;
        }

        int var4;
        int var5;
        for (var3 = 1; var3 < 103; ++var3) {
            var4 = (103 - var3) * 2048 + 24628;

            for (var5 = 1; var5 < 103; ++var5) {
                if ((Class26.aByteArrayArrayArray189[var0][var5][var3] & 24) == 0) {
                    Class60.aSceneGraph631.method669(var1, var4, 512, var0, var5, var3);
                }

                if (var0 < 3 && (Class26.aByteArrayArrayArray189[var0 + 1][var5][var3] & 8) != 0) {
                    Class60.aSceneGraph631.method669(var1, var4, 512, var0 + 1, var5, var3);
                }

                var4 += 4;
            }
        }

        var3 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
        var4 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        PathingEntity.aSprite794.method335();

        int var6;
        for (var5 = 1; var5 < 103; ++var5) {
            for (var6 = 1; var6 < 103; ++var6) {
                if ((Class26.aByteArrayArrayArray189[var0][var6][var5] & 24) == 0) {
                    Class6_Sub2.method457(var0, var6, var5, var3, var4);
                }

                if (var0 < 3 && (Class26.aByteArrayArrayArray189[var0 + 1][var6][var5] & 8) != 0) {
                    Class6_Sub2.method457(var0 + 1, var6, var5, var3, var4);
                }
            }
        }

        Client.anInt1693 = 0;

        for (var5 = 0; var5 < 104; ++var5) {
            for (var6 = 0; var6 < 104; ++var6) {
                int var7 = Class60.aSceneGraph631.method678(PlayerEntity.floorLevel, var5, var6);
                if (var7 != 0) {
                    var7 = var7 >> 14 & 32767;
                    int mapFunction = ObjectDefinition.get(var7).mapFunction;
                    if (mapFunction >= 0) {
                        int var9 = var5;
                        int var10 = var6;
                        if (mapFunction != 22 && mapFunction != 29 && mapFunction != 34 && mapFunction != 36 && mapFunction != 46 && mapFunction != 47 && mapFunction != 48) {
                            int[][] flags = Client.collisionMaps[PlayerEntity.floorLevel].flags;

                            for (int var12 = 0; var12 < 10; ++var12) {
                                int var13 = (int) (Math.random() * 4.0D);
                                if (var13 == 0 && var9 > 0 && var9 > var5 - 3 && (flags[var9 - 1][var10] & 0x1240108) == 0) {
                                    --var9;
                                }

                                if (var13 == 1 && var9 < 103 && var9 < var5 + 3 && (flags[var9 + 1][var10] & 0x1240180) == 0) {
                                    ++var9;
                                }

                                if (var13 == 2 && var10 > 0 && var10 > var6 - 3 && (flags[var9][var10 - 1] & 0x1240102) == 0) {
                                    --var10;
                                }

                                if (var13 == 3 && var10 < 103 && var10 < var6 + 3 && (flags[var9][var10 + 1] & 0x1240120) == 0) {
                                    ++var10;
                                }
                            }
                        }

                        Client.aSpriteArray1706[Client.anInt1693] = MapFunction.mapFunctions[mapFunction].getSprite(false);
                        Client.anIntArray1696[Client.anInt1693] = var9;
                        Client.anIntArray1700[Client.anInt1693] = var10;
                        ++Client.anInt1693;
                    }
                }
            }
        }

        World.graphicsProvider.method1251();
    }
}
