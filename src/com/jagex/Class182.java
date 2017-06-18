package com.jagex;

public class Class182 {
    public static final Class182 aClass182_2158 = new Class182(1);
    static final Class182 aClass182_2157 = new Class182(2);
    static final Class182 aClass182_2155 = new Class182(0);
    public final int anInt2156;

    Class182(int var1) {
        this.anInt2156 = var1;
    }

    static void method1200(InterfaceComponent var0, int var1, int var2, int var3) {
        ScriptEvent.method273();
        Node_Sub21_Sub5 var4 = var0.method1025(false);
        if (var4 != null) {
            DrawingArea.setClip(var1, var2, var1 + var4.anInt204, var2 + var4.anInt209);
            if (Client.anInt1698 != 2 && Client.anInt1698 != 5) {
                int var5 = Client.mapRotation + Client.mapScale & 2047;
                int var6 = Client.player.strictX / 32 + 48;
                int var7 = 464 - Client.player.strictY / 32;
                PathingEntity.aSprite794.method1245(var1, var2, var4.anInt204, var4.anInt209, var6, var7, var5, Client.mapOffset + 256, var4.anIntArray950, var4.anIntArray340);

                int var8;
                int var9;
                int var10;
                for (var8 = 0; var8 < Client.anInt1693; ++var8) {
                    var9 = Client.anIntArray1696[var8] * 4 + 2 - Client.player.strictX / 32;
                    var10 = Client.anIntArray1700[var8] * 4 + 2 - Client.player.strictY / 32;
                    Node_Sub7.method334(var1, var2, var9, var10, Client.aSpriteArray1706[var8], var4);
                }

                int var12;
                int var13;
                for (var8 = 0; var8 < 104; ++var8) {
                    for (var9 = 0; var9 < 104; ++var9) {
                        NodeDeque var11 = Client.pickableNodes[Player.floorLevel][var8][var9];
                        if (var11 != null) {
                            var12 = var8 * 4 + 2 - Client.player.strictX / 32;
                            var13 = var9 * 4 + 2 - Client.player.strictY / 32;
                            Node_Sub7.method334(var1, var2, var12, var13, Class6_Sub2.aSpriteArray825[0], var4);
                        }
                    }
                }

                for (var8 = 0; var8 < Client.anInt1501; ++var8) {
                    Npc var14 = Client.npcs[Client.npcIndices[var8]];
                    if (var14 != null && var14.method194()) {
                        NpcDefinition var20 = var14.definition;
                        if (var20 != null && var20.transformIds != null) {
                            var20 = var20.transform();
                        }

                        if (var20 != null && var20.aBoolean215 && var20.aBoolean2014) {
                            var12 = var14.strictX / 32 - Client.player.strictX / 32;
                            var13 = var14.strictY / 32 - Client.player.strictY / 32;
                            Node_Sub7.method334(var1, var2, var12, var13, Class6_Sub2.aSpriteArray825[1], var4);
                        }
                    }
                }

                var8 = Class71.anInt729;
                int[] var23 = Class71.anIntArray723;

                for (var10 = 0; var10 < var8; ++var10) {
                    Player var15 = Client.players[var23[var10]];
                    if (var15 != null && var15.method194() && !var15.aBoolean215 && Client.player != var15) {
                        var13 = var15.strictX / 32 - Client.player.strictX / 32;
                        int var16 = var15.strictY / 32 - Client.player.strictY / 32;
                        boolean var17 = false;
                        if (Class112.method771(var15.name, true)) {
                            var17 = true;
                        }

                        boolean var18 = false;

                        for (int var19 = 0; var19 < GrandExchangeOffer.anInt738; ++var19) {
                            if (var15.name.equals(Class126.aClanMateArray1370[var19].aString227)) {
                                var18 = true;
                                break;
                            }
                        }

                        boolean var24 = false;
                        if (Client.player.anInt219 != 0 && var15.anInt219 != 0 && var15.anInt219 == Client.player.anInt219) {
                            var24 = true;
                        }

                        if (var17) {
                            Node_Sub7.method334(var1, var2, var13, var16, Class6_Sub2.aSpriteArray825[3], var4);
                        } else if (var24) {
                            Node_Sub7.method334(var1, var2, var13, var16, Class6_Sub2.aSpriteArray825[4], var4);
                        } else if (var18) {
                            Node_Sub7.method334(var1, var2, var13, var16, Class6_Sub2.aSpriteArray825[5], var4);
                        } else {
                            Node_Sub7.method334(var1, var2, var13, var16, Class6_Sub2.aSpriteArray825[2], var4);
                        }
                    }
                }

                if (Client.anInt1485 != 0 && Client.engineCycle % 20 < 10) {
                    if (Client.anInt1485 == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
                        Npc var21 = Client.npcs[Client.hintArrowNpcIndex];
                        if (var21 != null) {
                            var12 = var21.strictX / 32 - Client.player.strictX / 32;
                            var13 = var21.strictY / 32 - Client.player.strictY / 32;
                            Class18.method139(var1, var2, var12, var13, Class54.aSpriteArray419[1], var4);
                        }
                    }

                    if (Client.anInt1485 == 2) {
                        var10 = Client.hintArrowX * 4 - Class62.anInt636 * 4 + 2 - Client.player.strictX / 32;
                        var12 = Client.hintArrowY * 4 - Class49.anInt377 * 4 + 2 - Client.player.strictY / 32;
                        Class18.method139(var1, var2, var10, var12, Class54.aSpriteArray419[1], var4);
                    }

                    if (Client.anInt1485 == 10 && Client.anInt1472 >= 0 && Client.anInt1472 < Client.players.length) {
                        Player var22 = Client.players[Client.anInt1472];
                        if (var22 != null) {
                            var12 = var22.strictX / 32 - Client.player.strictX / 32;
                            var13 = var22.strictY / 32 - Client.player.strictY / 32;
                            Class18.method139(var1, var2, var12, var13, Class54.aSpriteArray419[1], var4);
                        }
                    }
                }

                if (Client.destinationX != 0) {
                    var10 = Client.destinationX * 4 + 2 - Client.player.strictX / 32;
                    var12 = Client.destinationY * 4 + 2 - Client.player.strictY / 32;
                    Node_Sub7.method334(var1, var2, var10, var12, Class54.aSpriteArray419[0], var4);
                }

                if (!Client.player.aBoolean215) {
                    DrawingArea.method1223(var1 + var4.anInt204 / 2 - 1, var4.anInt209 / 2 + var2 - 1, 3, 3, 16777215);
                }
            } else {
                DrawingArea.method1225(var1, var2, 0, var4.anIntArray950, var4.anIntArray340);
            }

            Client.aBooleanArray1674[var3] = true;
        }
    }
}
