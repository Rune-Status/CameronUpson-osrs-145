package com.jagex;

public class World {
    public static Class186 graphicsProvider;
    static World[] worlds;
    static int anInt397 = 0;
    static Class25 aClass25_384;
    static int[] anIntArray387 = new int[]{1, 1, 1, 1};
    static int[] anIntArray385 = new int[]{0, 1, 2, 3};
    static int anInt392;
    static int anInt389 = 0;
    int id;
    String domain;
    int population;
    int mask;
    String activity;
    int location;
    int anInt394;

    static int method329(Packet var0) {
        int var1 = var0.method788(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = var0.method788(5);
        } else if (var1 == 2) {
            var2 = var0.method788(8);
        } else {
            var2 = var0.method788(11);
        }

        return var2;
    }

    static Node_Sub18 method324(ReferenceTable var0, int var1) {
        byte[] var2 = var0.method1093(var1);
        return var2 == null ? null : new Node_Sub18(var2);
    }

    static int method312(World var0, World var1, int var2, boolean var3) {
        if (var2 == 1) {
            int var4 = var0.population;
            int var5 = var1.population;
            if (!var3) {
                if (var4 == -1) {
                    var4 = 2001;
                }

                if (var5 == -1) {
                    var5 = 2001;
                }
            }

            return var4 - var5;
        }
        if (var2 == 2) {
            return var0.location - var1.location;
        }
        if (var2 == 3) {
            if (var0.activity.equals("-")) {
                if (var1.activity.equals("-")) {
                    return 0;
                }
                return var3 ? -1 : 1;
            }
            if (var1.activity.equals("-")) {
                return var3 ? 1 : -1;
            }
            return var0.activity.compareTo(var1.activity);
        }
        if (var2 == 4) {
            return var0.method331() ? (var1.method331() ? 0 : 1) : (var1.method331() ? -1 : 0);
        }
        if (var2 == 5) {
            return var0.method328() ? (var1.method328() ? 0 : 1) : (var1.method328() ? -1 : 0);
        }
        if (var2 == 6) {
            return var0.method326() ? (var1.method326() ? 0 : 1) : (var1.method326() ? -1 : 0);
        }
        if (var2 == 7) {
            return var0.method327() ? (var1.method327() ? 0 : 1) : (var1.method327() ? -1 : 0);
        }
        return var0.id - var1.id;
    }

    static void method1014(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
        if (var0 < var1) {
            int var6 = (var0 + var1) / 2;
            int var7 = var0;
            World var8 = worlds[var6];
            worlds[var6] = worlds[var1];
            worlds[var1] = var8;

            for (int var9 = var0; var9 < var1; ++var9) {
                World var10 = worlds[var9];
                int var11 = method312(var10, var8, var2, var3);
                int var12;
                if (var11 != 0) {
                    if (var3) {
                        var12 = -var11;
                    } else {
                        var12 = var11;
                    }
                } else if (var4 == -1) {
                    var12 = 0;
                } else {
                    int var14 = method312(var10, var8, var4, var5);
                    if (var5) {
                        var12 = -var14;
                    } else {
                        var12 = var14;
                    }
                }

                if (var12 <= 0) {
                    World var13 = worlds[var9];
                    worlds[var9] = worlds[var7];
                    worlds[var7++] = var13;
                }
            }

            worlds[var1] = worlds[var7];
            worlds[var7] = var8;
            method1014(var0, var7 - 1, var2, var3, var4, var5);
            method1014(var7 + 1, var1, var2, var3, var4, var5);
        }

    }

    boolean method327() {
        return (1 & this.mask) != 0;
    }

    boolean method328() {
        return (2 & this.mask) != 0;
    }

    boolean method325() {
        return (536870912 & this.mask) != 0;
    }

    boolean method330() {
        return (33554432 & this.mask) != 0;
    }

    boolean method326() {
        return (4 & this.mask) != 0;
    }

    boolean method331() {
        return (8 & this.mask) != 0;
    }
}
