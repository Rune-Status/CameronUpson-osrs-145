package com.jagex;

public final class Class90 {
    Entity anEntity963;
    int anInt960;
    int anInt959;
    int anInt958;
    Entity anEntity965;
    Entity anEntity961;
    int anInt964;
    int anInt962;

    static void method585(String var0, boolean var1) {
        if (var0 != null) {
            if ((Client.anInt1450 < 100 || Client.anInt1593 == 1) && Client.anInt1450 < 400) {
                String var2 = Class84.method484(var0, Class2.aClass188_13);
                if (var2 != null) {
                    int var3;
                    String var5;
                    String var6;
                    for (var3 = 0; var3 < Client.anInt1450; ++var3) {
                        IgnoredPlayer var4 = Client.ignoredPlayers[var3];
                        var5 = Class84.method484(var4.aString242, Class2.aClass188_13);
                        if (var5 != null && var5.equals(var2)) {
                            Class78.method469(31, "", var0 + " is already on your ignore list");
                            return;
                        }

                        if (var4.aString243 != null) {
                            var6 = Class84.method484(var4.aString243, Class2.aClass188_13);
                            if (var6 != null && var6.equals(var2)) {
                                Class78.method469(31, "", var0 + " is already on your ignore list");
                                return;
                            }
                        }
                    }

                    for (var3 = 0; var3 < Client.anInt1431; ++var3) {
                        Class27 var7 = Client.aClass27Array1449[var3];
                        var5 = Class84.method484(var7.aString198, Class2.aClass188_13);
                        if (var5 != null && var5.equals(var2)) {
                            Class78.method469(31, "", "Please remove " + var0 + " from your friend list first");
                            return;
                        }

                        if (var7.aString203 != null) {
                            var6 = Class84.method484(var7.aString203, Class2.aClass188_13);
                            if (var6 != null && var6.equals(var2)) {
                                Class78.method469(31, "", "Please remove " + var0 + " from your friend list first");
                                return;
                            }
                        }
                    }

                    if (Class84.method484(Client.player.name, Class2.aClass188_13).equals(var2)) {
                        Class78.method469(31, "", "You can't insert yourself to your own ignore list");
                    } else {
                        Client.packet.writeHeader(148);
                        Client.packet.method451(Class27.method179(var0));
                        Client.packet.method865(var0);
                    }
                }
            } else {
                Class78.method469(31, "", "Your ignore list is full. Max of 100 for free users, and 400 for members");
            }
        }
    }

    public static String method584(int var0, boolean var1) {
        if (var1 && var0 >= 0) {
            int var2 = var0;
            String var3;
            if (var1 && var0 >= 0) {
                int var4 = 2;

                for (int var5 = var0 / 10; var5 != 0; ++var4) {
                    var5 /= 10;
                }

                char[] var6 = new char[var4];
                var6[0] = '+';

                for (int var7 = var4 - 1; var7 > 0; --var7) {
                    int var8 = var2;
                    var2 /= 10;
                    int var9 = var8 - var2 * 10;
                    if (var9 >= 10) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                }

                var3 = new String(var6);
            } else {
                var3 = Integer.toString(var0, 10);
            }

            return var3;
        }
        return Integer.toString(var0);
    }
}
