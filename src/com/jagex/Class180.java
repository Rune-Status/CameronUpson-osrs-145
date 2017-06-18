package com.jagex;

public class Class180 {
    public static final Class180 aClass180_2151 = new Class180("VERDANA15", "verdana_15pt_regular");
    public static final Class180 aClass180_2149 = new Class180("VERDANA13", "verdana_13pt_regular");
    public static final Class180 aClass180_2148 = new Class180("BOLD12", "b12_full");
    public static final Class180 aClass180_2147 = new Class180("VERDANA11", "verdana_11pt_regular");
    public static final Class180 aClass180_2146 = new Class180("PLAIN11", "p11_full");
    public static final Class180 aClass180_2153 = new Class180("PLAIN12", "p12_full");
    final String aString2152;
    String aString2150;

    Class180(String var1, String var2) {
        this.aString2152 = var1;
        this.aString2150 = var2;
    }

    static void method1198(int var0, int var1, int var2, int var3) {
        if (Client.itemSelectionState == 0 && !Client.spellSelected) {
            WorldMapTransportation_Sub1.method125("Walk here", "", 23, 0, var0 - var2, var1 - var3);
        }

        int var4 = -1;
        int var5 = -1;

        int var6;
        int var7;
        for (var6 = 0; var6 < Class105.onCursorCount; ++var6) {
            var7 = Class105.onCursorUids[var6];
            int var8 = var7 & 127;
            int var9 = var7 >> 7 & 127;
            int var10 = var7 >> 29 & 3;
            int var11 = var7 >> 14 & 32767;
            if (var7 != var5) {
                var5 = var7;
                if (var10 == 2 && Class60.aSceneGraph631.method668(Player.floorLevel, var8, var9, var7) >= 0) {
                    ObjectDefinition var13 = Class5.method17(var11);
                    if (var13.transformIds != null) {
                        var13 = var13.method1073();
                    }

                    if (var13 == null) {
                        continue;
                    }

                    if (Client.itemSelectionState == 1) {
                        WorldMapTransportation_Sub1.method125("Use", Client.latestSelectedItemName + " " + "->" + " " + Class75.method449(65535) + var13.name, 1, var7, var8, var9);
                    } else if (Client.spellSelected) {
                        if ((Class162.anInt1957 & 4) == 4) {
                            WorldMapTransportation_Sub1.method125(Client.aString1623, Client.aString1616 + " " + "->" + " " + Class75.method449(65535) + var13.name, 2, var7, var8, var9);
                        }
                    } else {
                        String[] var14 = var13.actions;
                        if (Client.aBoolean1650) {
                            var14 = Class51.method323(var14);
                        }

                        if (var14 != null) {
                            for (int var15 = 4; var15 >= 0; --var15) {
                                if (var14[var15] != null) {
                                    short var16 = 0;
                                    if (var15 == 0) {
                                        var16 = 3;
                                    }

                                    if (var15 == 1) {
                                        var16 = 4;
                                    }

                                    if (var15 == 2) {
                                        var16 = 5;
                                    }

                                    if (var15 == 3) {
                                        var16 = 6;
                                    }

                                    if (var15 == 4) {
                                        var16 = 1001;
                                    }

                                    WorldMapTransportation_Sub1.method125(var14[var15], Class75.method449(65535) + var13.name, var16, var7, var8, var9);
                                }
                            }
                        }

                        WorldMapTransportation_Sub1.method125("Examine", Class75.method449(65535) + var13.name, 1002, var13.id << 14, var8, var9);
                    }
                }

                int var17;
                Npc var18;
                Player var19;
                int[] var27;
                int var28;
                if (var10 == 1) {
                    Npc var23 = Client.npcs[var11];
                    if (var23 == null) {
                        continue;
                    }

                    if (var23.definition.anInt221 == 1 && (var23.strictX & 127) == 64 && (var23.strictY & 127) == 64) {
                        for (var17 = 0; var17 < Client.anInt1501; ++var17) {
                            var18 = Client.npcs[Client.npcIndices[var17]];
                            if (var18 != null && var18 != var23 && var18.definition.anInt221 == 1 && var23.strictX == var18.strictX && var23.strictY == var18.strictY) {
                                Key.method362(var18.definition, Client.npcIndices[var17], var8, var9);
                            }
                        }

                        var17 = Class71.anInt729;
                        var27 = Class71.anIntArray723;

                        for (var28 = 0; var28 < var17; ++var28) {
                            var19 = Client.players[var27[var28]];
                            if (var19 != null && var23.strictX == var19.strictX && var23.strictY == var19.strictY) {
                                Class76.method453(var19, var27[var28], var8, var9);
                            }
                        }
                    }

                    Key.method362(var23.definition, var11, var8, var9);
                }

                if (var10 == 0) {
                    Player var24 = Client.players[var11];
                    if (var24 == null) {
                        continue;
                    }

                    if ((var24.strictX & 127) == 64 && (var24.strictY & 127) == 64) {
                        for (var17 = 0; var17 < Client.anInt1501; ++var17) {
                            var18 = Client.npcs[Client.npcIndices[var17]];
                            if (var18 != null && var18.definition.anInt221 == 1 && var18.strictX == var24.strictX && var24.strictY == var18.strictY) {
                                Key.method362(var18.definition, Client.npcIndices[var17], var8, var9);
                            }
                        }

                        var17 = Class71.anInt729;
                        var27 = Class71.anIntArray723;

                        for (var28 = 0; var28 < var17; ++var28) {
                            var19 = Client.players[var27[var28]];
                            if (var19 != null && var19 != var24 && var24.strictX == var19.strictX && var24.strictY == var19.strictY) {
                                Class76.method453(var19, var27[var28], var8, var9);
                            }
                        }
                    }

                    if (Client.anInt1608 != var11) {
                        Class76.method453(var24, var11, var8, var9);
                    } else {
                        var4 = var7;
                    }
                }

                if (var10 == 3) {
                    NodeDeque var25 = Client.pickableNodes[Player.floorLevel][var8][var9];
                    if (var25 != null) {
                        for (PickableNode var26 = (PickableNode) var25.current(); var26 != null; var26 = (PickableNode) var25.method990()) {
                            ItemDefinition var29 = Class149.method1001(var26.id);
                            if (Client.itemSelectionState == 1) {
                                WorldMapTransportation_Sub1.method125("Use", Client.latestSelectedItemName + " " + "->" + " " + Class75.method449(16748608) + var29.name, 16, var26.id, var8, var9);
                            } else if (Client.spellSelected) {
                                if ((Class162.anInt1957 & 1) == 1) {
                                    WorldMapTransportation_Sub1.method125(Client.aString1623, Client.aString1616 + " " + "->" + " " + Class75.method449(16748608) + var29.name, 17, var26.id, var8, var9);
                                }
                            } else {
                                String[] var20 = var29.groundActions;
                                if (Client.aBoolean1650) {
                                    var20 = Class51.method323(var20);
                                }

                                for (int var21 = 4; var21 >= 0; --var21) {
                                    if (var20 != null && var20[var21] != null) {
                                        byte var22 = 0;
                                        if (var21 == 0) {
                                            var22 = 18;
                                        }

                                        if (var21 == 1) {
                                            var22 = 19;
                                        }

                                        if (var21 == 2) {
                                            var22 = 20;
                                        }

                                        if (var21 == 3) {
                                            var22 = 21;
                                        }

                                        if (var21 == 4) {
                                            var22 = 22;
                                        }

                                        WorldMapTransportation_Sub1.method125(var20[var21], Class75.method449(16748608) + var29.name, var22, var26.id, var8, var9);
                                    } else if (var21 == 2) {
                                        WorldMapTransportation_Sub1.method125("Take", Class75.method449(16748608) + var29.name, 20, var26.id, var8, var9);
                                    }
                                }

                                WorldMapTransportation_Sub1.method125("Examine", Class75.method449(16748608) + var29.name, 1004, var26.id, var8, var9);
                            }
                        }
                    }
                }
            }
        }

        if (var4 != -1) {
            var6 = var4 & 127;
            var7 = var4 >> 7 & 127;
            Player var12 = Client.players[Client.anInt1608];
            Class76.method453(var12, Client.anInt1608, var6, var7);
        }

    }
}
