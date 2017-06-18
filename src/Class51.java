final class Class51 implements Class66 {
    public static ReferenceTable aReferenceTable382;
    static int anInt381;
    static Socket aSocket380;

    static void method321(Packet var0, int var1) {
        boolean var2 = var0.method788(1) == 1;
        if (var2) {
            Class71.anIntArray717[++Class71.anInt724 - 1] = var1;
        }

        int var3 = var0.method788(2);
        Player var4 = Client.players[var1];
        if (var3 == 0) {
            if (var2) {
                var4.aBoolean237 = false;
            } else if (var1 == Client.playerIndex) {
                throw new RuntimeException();
            } else {
                Class71.anIntArray718[var1] = (var4.anIntArray804[0] + Class49.anInt377 >> 13) + (var4.combatLevel << 28) + (Class62.anInt636 + var4.anIntArray800[0] >> 13 << 14);
                if (var4.anInt793 != -1) {
                    Class71.anIntArray725[var1] = var4.anInt793;
                } else {
                    Class71.anIntArray725[var1] = var4.orientation;
                }

                Class71.anIntArray726[var1] = var4.targetIndex;
                Client.players[var1] = null;
                if (var0.method788(1) != 0) {
                    Class5.method18(var0, var1);
                }

            }
        } else {
            int var5;
            int var6;
            int var7;
            if (var3 == 1) {
                var5 = var0.method788(3);
                var6 = var4.anIntArray800[0];
                var7 = var4.anIntArray804[0];
                if (var5 == 0) {
                    --var6;
                    --var7;
                } else if (var5 == 1) {
                    --var7;
                } else if (var5 == 2) {
                    ++var6;
                    --var7;
                } else if (var5 == 3) {
                    --var6;
                } else if (var5 == 4) {
                    ++var6;
                } else if (var5 == 5) {
                    --var6;
                    ++var7;
                } else if (var5 == 6) {
                    ++var7;
                } else if (var5 == 7) {
                    ++var6;
                    ++var7;
                }

                if (Client.playerIndex != var1 || var4.strictX >= 1536 && var4.strictY >= 1536 && var4.strictX < 11776 && var4.strictY < 11776) {
                    if (var2) {
                        var4.aBoolean237 = true;
                        var4.anInt233 = var6;
                        var4.anInt234 = var7;
                    } else {
                        var4.aBoolean237 = false;
                        var4.method199(var6, var7, Class71.aByteArray727[var1]);
                    }
                } else {
                    var4.method200(var6, var7);
                    var4.aBoolean237 = false;
                }

            } else if (var3 == 2) {
                var5 = var0.method788(4);
                var6 = var4.anIntArray800[0];
                var7 = var4.anIntArray804[0];
                if (var5 == 0) {
                    var6 -= 2;
                    var7 -= 2;
                } else if (var5 == 1) {
                    --var6;
                    var7 -= 2;
                } else if (var5 == 2) {
                    var7 -= 2;
                } else if (var5 == 3) {
                    ++var6;
                    var7 -= 2;
                } else if (var5 == 4) {
                    var6 += 2;
                    var7 -= 2;
                } else if (var5 == 5) {
                    var6 -= 2;
                    --var7;
                } else if (var5 == 6) {
                    var6 += 2;
                    --var7;
                } else if (var5 == 7) {
                    var6 -= 2;
                } else if (var5 == 8) {
                    var6 += 2;
                } else if (var5 == 9) {
                    var6 -= 2;
                    ++var7;
                } else if (var5 == 10) {
                    var6 += 2;
                    ++var7;
                } else if (var5 == 11) {
                    var6 -= 2;
                    var7 += 2;
                } else if (var5 == 12) {
                    --var6;
                    var7 += 2;
                } else if (var5 == 13) {
                    var7 += 2;
                } else if (var5 == 14) {
                    ++var6;
                    var7 += 2;
                } else if (var5 == 15) {
                    var6 += 2;
                    var7 += 2;
                }

                if (var1 == Client.playerIndex && (var4.strictX < 1536 || var4.strictY < 1536 || var4.strictX >= 11776 || var4.strictY >= 11776)) {
                    var4.method200(var6, var7);
                    var4.aBoolean237 = false;
                } else if (var2) {
                    var4.aBoolean237 = true;
                    var4.anInt233 = var6;
                    var4.anInt234 = var7;
                } else {
                    var4.aBoolean237 = false;
                    var4.method199(var6, var7, Class71.aByteArray727[var1]);
                }

            } else {
                var5 = var0.method788(1);
                int var8;
                int var9;
                int var10;
                int var11;
                if (var5 == 0) {
                    var6 = var0.method788(12);
                    var7 = var6 >> 10;
                    var8 = var6 >> 5 & 31;
                    if (var8 > 15) {
                        var8 -= 32;
                    }

                    var9 = var6 & 31;
                    if (var9 > 15) {
                        var9 -= 32;
                    }

                    var10 = var8 + var4.anIntArray800[0];
                    var11 = var4.anIntArray804[0] + var9;
                    if (var1 != Client.playerIndex || var4.strictX >= 1536 && var4.strictY >= 1536 && var4.strictX < 11776 && var4.strictY < 11776) {
                        if (var2) {
                            var4.aBoolean237 = true;
                            var4.anInt233 = var10;
                            var4.anInt234 = var11;
                        } else {
                            var4.aBoolean237 = false;
                            var4.method199(var10, var11, Class71.aByteArray727[var1]);
                        }
                    } else {
                        var4.method200(var10, var11);
                        var4.aBoolean237 = false;
                    }

                    var4.combatLevel = (byte) (var4.combatLevel + var7 & 3);
                    if (Client.playerIndex == var1) {
                        Player.floorLevel = var4.combatLevel;
                    }

                } else {
                    var6 = var0.method788(30);
                    var7 = var6 >> 28;
                    var8 = var6 >> 14 & 16383;
                    var9 = var6 & 16383;
                    var10 = (var8 + Class62.anInt636 + var4.anIntArray800[0] & 16383) - Class62.anInt636;
                    var11 = (var9 + var4.anIntArray804[0] + Class49.anInt377 & 16383) - Class49.anInt377;
                    if (Client.playerIndex != var1 || var4.strictX >= 1536 && var4.strictY >= 1536 && var4.strictX < 11776 && var4.strictY < 11776) {
                        if (var2) {
                            var4.aBoolean237 = true;
                            var4.anInt233 = var10;
                            var4.anInt234 = var11;
                        } else {
                            var4.aBoolean237 = false;
                            var4.method199(var10, var11, Class71.aByteArray727[var1]);
                        }
                    } else {
                        var4.method200(var10, var11);
                        var4.aBoolean237 = false;
                    }

                    var4.combatLevel = (byte) (var4.combatLevel + var7 & 3);
                    if (Client.playerIndex == var1) {
                        Player.floorLevel = var4.combatLevel;
                    }

                }
            }
        }
    }

    static void method322(int var0, int var1, boolean var2) {
        if (!var2 || Class13.anInt102 != var0 || Class43.anInt361 != var1) {
            Class13.anInt102 = var0;
            Class43.anInt361 = var1;
            Class45.method304(25);
            Class122.method811("Loading - please wait.", true);
            int var3 = Class62.anInt636;
            int var4 = Class49.anInt377;
            Class62.anInt636 = (var0 - 6) * 8;
            Class49.anInt377 = (var1 - 6) * 8;
            int var5 = Class62.anInt636 - var3;
            int var6 = Class49.anInt377 - var4;
            var3 = Class62.anInt636;
            var4 = Class49.anInt377;

            int var7;
            int var9;
            for (var7 = 0; var7 < 32768; ++var7) {
                Npc var8 = Client.npcs[var7];
                if (var8 != null) {
                    for (var9 = 0; var9 < 10; ++var9) {
                        var8.anIntArray800[var9] -= var5;
                        var8.anIntArray804[var9] -= var6;
                    }

                    var8.strictX -= var5 * 128;
                    var8.strictY -= var6 * 128;
                }
            }

            for (var7 = 0; var7 < 2048; ++var7) {
                Player var21 = Client.players[var7];
                if (var21 != null) {
                    for (var9 = 0; var9 < 10; ++var9) {
                        var21.anIntArray800[var9] -= var5;
                        var21.anIntArray804[var9] -= var6;
                    }

                    var21.strictX -= var5 * 128;
                    var21.strictY -= var6 * 128;
                }
            }

            byte var20 = 0;
            byte var10 = 104;
            byte var22 = 1;
            if (var5 < 0) {
                var20 = 103;
                var10 = -1;
                var22 = -1;
            }

            byte var11 = 0;
            byte var12 = 104;
            byte var13 = 1;
            if (var6 < 0) {
                var11 = 103;
                var12 = -1;
                var13 = -1;
            }

            int var15;
            for (int var14 = var20; var14 != var10; var14 += var22) {
                for (var15 = var11; var12 != var15; var15 += var13) {
                    int var16 = var14 + var5;
                    int var17 = var6 + var15;

                    for (int var18 = 0; var18 < 4; ++var18) {
                        if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                            Client.pickableNodes[var18][var14][var15] = Client.pickableNodes[var18][var16][var17];
                        } else {
                            Client.pickableNodes[var18][var14][var15] = null;
                        }
                    }
                }
            }

            for (PendingSpawn var19 = Client.pendingSpawns.method995(); var19 != null; var19 = Client.pendingSpawns.next()) {
                var19.sceneX -= var5;
                var19.sceneY -= var6;
                if (var19.sceneX < 0 || var19.sceneY < 0 || var19.sceneX >= 104 || var19.sceneY >= 104) {
                    var19.unlink();
                }
            }

            if (Client.destinationX != 0) {
                Client.destinationX -= var5;
                Client.destinationY -= var6;
            }

            Client.anInt1430 = 0;
            Client.cameraLocked = false;
            Client.anInt1705 = -1;
            Client.graphicsObjects.method989();
            Client.projectiles.method989();

            for (var15 = 0; var15 < 4; ++var15) {
                Client.collisionMaps[var15].method757();
            }

        }
    }

    static void method320(World var0) {
        if (var0.method327() != Client.membersWorld) {
            Client.membersWorld = var0.method327();
            Class44.method302(var0.method327());
        }

        Class10.aString69 = var0.domain;
        Client.currentWorld = var0.id;
        Client.currentWorldMask = var0.mask;
        Class22.anInt151 = Client.anInt1470 == 0 ? 'ꩊ' : var0.id + '鱀';
        Class61.anInt632 = Client.anInt1470 == 0 ? 443 : var0.id + '썐';
        Buffer.anInt1363 = Class22.anInt151;
    }

    static String[] method323(String[] var0) {
        String[] var1 = new String[5];

        for (int var2 = 0; var2 < 5; ++var2) {
            var1[var2] = var2 + ": ";
            if (var0 != null && var0[var2] != null) {
                var1[var2] = var1[var2] + var0[var2];
            }
        }

        return var1;
    }
}
