package com.jagex;

import java.io.File;

final class Class78 implements Class66 {
    static Class103 aClass103_839;
    static Font aFont838;
    static File aFile841;
    static int anInt840;

    static int method470(int var0, RuneScript var1, boolean var2) {
        if (var0 == 3300) {
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.engineCycle;
            return 1;
        }
        int var3;
        int var4;
        int[] var5;
        int var6;
        ItemTable var7;
        int var8;
        if (var0 == 3301) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            var5 = Class63.anIntArray645;
            var6 = ++Class63.anInt644 - 1;
            var7 = ItemTable.itemTables.lookup((long) var3);
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.ids.length) {
                var8 = var7.ids[var4];
            } else {
                var8 = -1;
            }

            var5[var6] = var8;
            return 1;
        }
        if (var0 == 3302) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            var5 = Class63.anIntArray645;
            var6 = ++Class63.anInt644 - 1;
            var7 = ItemTable.itemTables.lookup((long) var3);
            if (var7 == null) {
                var8 = 0;
            } else if (var4 >= 0 && var4 < var7.stackSizes.length) {
                var8 = var7.stackSizes[var4];
            } else {
                var8 = 0;
            }

            var5[var6] = var8;
            return 1;
        }
        if (var0 == 3303) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Class18.method137(var3, var4);
            return 1;
        }
        int var10;
        if (var0 == 3304) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            int[] var9 = Class63.anIntArray645;
            var10 = ++Class63.anInt644 - 1;
            Node_Sub21_Sub19 var11 = (Node_Sub21_Sub19) Node_Sub21_Sub19.aReferenceCache2025.get((long) var3);
            Node_Sub21_Sub19 var12;
            if (var11 != null) {
                var12 = var11;
            } else {
                byte[] var13 = Node_Sub21_Sub19.aReferenceTable2012.unpack(5, var3);
                var11 = new Node_Sub21_Sub19();
                if (var13 != null) {
                    var11.method1052(new Buffer(var13));
                }

                Node_Sub21_Sub19.aReferenceCache2025.put(var11, (long) var3);
                var12 = var11;
            }

            var9[var10] = var12.anInt206;
            return 1;
        }
        if (var0 == 3305) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.currentLevels[var3];
            return 1;
        }
        if (var0 == 3306) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.levels[var3];
            return 1;
        }
        if (var0 == 3307) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.experiences[var3];
            return 1;
        }
        if (var0 == 3308) {
            var3 = Player.floorLevel;
            var4 = (Client.player.strictX >> 7) + Class62.anInt636;
            var10 = (Client.player.strictY >> 7) + Class49.anInt377;
            Class63.anIntArray645[++Class63.anInt644 - 1] = (var3 << 28) + (var4 << 14) + var10;
            return 1;
        }
        if (var0 == 3309) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 >> 14 & 16383;
            return 1;
        }
        if (var0 == 3310) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 >> 28;
            return 1;
        }
        if (var0 == 3311) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 & 16383;
            return 1;
        }
        if (var0 == 3312) {
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.membersWorld ? 1 : 0;
            return 1;
        }
        if (var0 == 3313) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644] + '耀';
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            var5 = Class63.anIntArray645;
            var6 = ++Class63.anInt644 - 1;
            var7 = ItemTable.itemTables.lookup((long) var3);
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.ids.length) {
                var8 = var7.ids[var4];
            } else {
                var8 = -1;
            }

            var5[var6] = var8;
            return 1;
        }
        if (var0 != 3314) {
            if (var0 == 3315) {
                Class63.anInt644 -= 2;
                var3 = Class63.anIntArray645[Class63.anInt644] + '耀';
                var4 = Class63.anIntArray645[Class63.anInt644 + 1];
                Class63.anIntArray645[++Class63.anInt644 - 1] = Class18.method137(var3, var4);
                return 1;
            }
            if (var0 == 3316) {
                if (Client.rights >= 2) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = Client.rights;
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                }

                return 1;
            }
            if (var0 == 3317) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.anInt1466;
                return 1;
            }
            if (var0 == 3318) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.currentWorld;
                return 1;
            }
            if (var0 == 3321) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.energy;
                return 1;
            }
            if (var0 == 3322) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.weight;
                return 1;
            }
            if (var0 == 3323) {
                if (Client.aBoolean1636) {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 1;
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
                }

                return 1;
            }
            if (var0 == 3324) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.currentWorldMask;
                return 1;
            }
            if (var0 == 3325) {
                Class63.anInt644 -= 4;
                var3 = Class63.anIntArray645[Class63.anInt644];
                var4 = Class63.anIntArray645[Class63.anInt644 + 1];
                var10 = Class63.anIntArray645[Class63.anInt644 + 2];
                var6 = Class63.anIntArray645[Class63.anInt644 + 3];
                var3 += var4 << 14;
                var3 += var10 << 28;
                var3 += var6;
                Class63.anIntArray645[++Class63.anInt644 - 1] = var3;
                return 1;
            }
            return 2;
        }
        Class63.anInt644 -= 2;
        var3 = Class63.anIntArray645[Class63.anInt644] + '耀';
        var4 = Class63.anIntArray645[Class63.anInt644 + 1];
        var5 = Class63.anIntArray645;
        var6 = ++Class63.anInt644 - 1;
        var7 = ItemTable.itemTables.lookup((long) var3);
        if (var7 == null) {
            var8 = 0;
        } else if (var4 >= 0 && var4 < var7.stackSizes.length) {
            var8 = var7.stackSizes[var4];
        } else {
            var8 = 0;
        }

        var5[var6] = var8;
        return 1;
    }

    static void method468(boolean var0) {
        for (int var1 = 0; var1 < Client.anInt1501; ++var1) {
            Npc var2 = Client.npcs[Client.npcIndices[var1]];
            int var3 = (Client.npcIndices[var1] << 14) + 536870912;
            if (var2 != null && var2.method194() && var0 == var2.definition.aBoolean2021 && var2.definition.transforms()) {
                int var4 = var2.strictX >> 7;
                int var5 = var2.strictY >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.anInt753 == 1 && (var2.strictX & 127) == 64 && (var2.strictY & 127) == 64) {
                        if (Client.anInt1565 == Client.anIntArrayArray1559[var4][var5]) {
                            continue;
                        }

                        Client.anIntArrayArray1559[var4][var5] = Client.anInt1565;
                    }

                    if (!var2.definition.aBoolean2014) {
                        var3 -= Integer.MIN_VALUE;
                    }

                    Class60.aSceneGraph631.method698(Player.floorLevel, var2.strictX, var2.strictY, Class25.method175(var2.strictX + (var2.anInt753 * 64 - 64), var2.anInt753 * 64 - 64 + var2.strictY, Player.floorLevel), var2.anInt753 * 64 - 64 + 60, var2, var2.anInt748, var3, var2.aBoolean758);
                }
            }
        }

    }

    static void method467() {
        Class82 var0 = null;

        try {
            var0 = TextureProviderImpl.method502("", Client.aClass162_1468.aString1955, true);
            Buffer var1 = Client.preferences.writeBuffer();
            var0.method478(var1.payload, 0, var1.caret);
        } catch (Exception var3) {
        }

        try {
            if (var0 != null) {
                var0.method476();
            }
        } catch (Exception var2) {
        }

    }

    public static void method466(ReferenceTable var0, ReferenceTable var1) {
        HealthBarDefinition.aReferenceTable2012 = var0;
        Class171.aReferenceTable2125 = var1;
    }

    static void method469(int var0, String var1, String var2) {
        Class75.method447(var0, var1, var2, null);
    }
}
