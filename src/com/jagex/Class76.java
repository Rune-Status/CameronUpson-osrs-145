package com.jagex;

public class Class76 implements EnumOrdinal {
    static final Class76 aClass76_822 = new Class76(2, 1, Long.class, new Class73());
    static final Class76 aClass76_821 = new Class76(1, 2, String.class, new Class78());
    static final Class76 aClass76_819 = new Class76(0, 0, Integer.class, new Class51());
    static CacheReferenceTable aCacheReferenceTable823;
    final int anInt820;
    final int anInt157;

    Class76(int var1, int var2, Class var3, Class66 var4) {
        this.anInt820 = var1;
        this.anInt157 = var2;
    }

    static void method453(Player var0, int var1, int var2, int var3) {
        if (Client.player != var0) {
            if (Client.menuRowCount < 400) {
                String var4;
                if (var0.totalLevel == 0) {
                    var4 = var0.aStringArray238[0] + var0.name + var0.aStringArray238[1] + Class152.method1007(var0.anInt221, Client.player.anInt221) + " " + " (" + "level-" + var0.anInt221 + ")" + var0.aStringArray238[2];
                } else {
                    var4 = var0.aStringArray238[0] + var0.name + var0.aStringArray238[1] + " " + " (" + "skill-" + var0.totalLevel + ")" + var0.aStringArray238[2];
                }

                int var5;
                if (Client.itemSelectionState == 1) {
                    Class12_Sub1.method125("Use", Client.latestSelectedItemName + " " + "->" + " " + Class75.method449(16777215) + var4, 14, var1, var2, var3);
                } else if (Client.spellSelected) {
                    if ((Class162.anInt1957 & 8) == 8) {
                        Class12_Sub1.method125(Client.aString1623, Client.aString1616 + " " + "->" + " " + Class75.method449(16777215) + var4, 15, var1, var2, var3);
                    }
                } else {
                    for (var5 = 7; var5 >= 0; --var5) {
                        if (Client.playerActions[var5] != null) {
                            short var6 = 0;
                            if (Client.playerActions[var5].equalsIgnoreCase("Attack")) {
                                if (Client.aClass55_1491 == Class55.aClass55_422) {
                                    continue;
                                }

                                if (Class55.aClass55_425 == Client.aClass55_1491 || Client.aClass55_1491 == Class55.aClass55_420 && var0.anInt221 > Client.player.anInt221) {
                                    var6 = 2000;
                                }

                                if (Client.player.anInt219 != 0 && var0.anInt219 != 0) {
                                    if (var0.anInt219 == Client.player.anInt219) {
                                        var6 = 2000;
                                    } else {
                                        var6 = 0;
                                    }
                                }
                            } else if (Client.aBooleanArray1595[var5]) {
                                var6 = 2000;
                            }

                            boolean var7 = false;
                            int var8 = Client.anIntArray1607[var5] + var6;
                            Class12_Sub1.method125(Client.playerActions[var5], Class75.method449(16777215) + var4, var8, var1, var2, var3);
                        }
                    }
                }

                for (var5 = 0; var5 < Client.menuRowCount; ++var5) {
                    if (Client.menuOpcodes[var5] == 23) {
                        Client.menuTargets[var5] = Class75.method449(16777215) + var4;
                        break;
                    }
                }

            }
        }
    }

    static void method452(int var0, int var1) {
        if (Class33.method220(var0)) {
            Class134_Sub1.method215(InterfaceComponent.interfaces[var0], var1);
        }
    }

    public int ordinal() {
        return this.anInt157;
    }
}