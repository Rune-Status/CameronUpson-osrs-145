package com.jagex;

public class Class49 {
    public static ReferenceTable aReferenceTable374;
    static Node_Sub21_Sub26_Sub2 aNode_Sub21_Sub26_Sub2_375;
    static Thread aThread376;
    static int anInt377;

    static int method313(ReferenceTable var0, ReferenceTable var1) {
        int var2 = 0;
        if (var0.method1100("title.jpg", "")) {
            ++var2;
        }

        if (var1.method1100("logo", "")) {
            ++var2;
        }

        if (var1.method1100("logo_deadman_mode", "")) {
            ++var2;
        }

        if (var1.method1100("titlebox", "")) {
            ++var2;
        }

        if (var1.method1100("titlebutton", "")) {
            ++var2;
        }

        if (var1.method1100("runes", "")) {
            ++var2;
        }

        if (var1.method1100("title_mute", "")) {
            ++var2;
        }

        if (var1.method1100("options_radio_buttons,0", "")) {
            ++var2;
        }

        if (var1.method1100("options_radio_buttons,2", "")) {
            ++var2;
        }

        var1.method1100("sl_back", "");
        var1.method1100("sl_flags", "");
        var1.method1100("sl_arrows", "");
        var1.method1100("sl_stars", "");
        var1.method1100("sl_button", "");
        return var2;
    }

    static void method314(int var0, int var1, int var2, int var3) {
        ++Client.anInt1565;
        HealthBar.method342(Class34.aClass34_273);
        boolean var4 = false;
        int var5;
        int var7;
        if (Client.anInt1608 >= 0) {
            var5 = Class71.anInt729;
            int[] var6 = Class71.anIntArray723;

            for (var7 = 0; var7 < var5; ++var7) {
                if (var6[var7] == Client.anInt1608) {
                    var4 = true;
                    break;
                }
            }
        }

        if (var4) {
            HealthBar.method342(Class34.aClass34_278);
        }

        Class78.method468(true);
        HealthBar.method342(var4 ? Class34.aClass34_275 : Class34.aClass34_276);
        Class78.method468(false);

        for (Projectile var8 = Client.projectiles.method995(); var8 != null; var8 = Client.projectiles.next()) {
            if (Player.floorLevel == var8.anInt209 && Client.engineCycle <= var8.cycle) {
                if (Client.engineCycle >= var8.anInt221) {
                    if (var8.targetIndex > 0) {
                        Npc var34 = Client.npcs[var8.targetIndex - 1];
                        if (var34 != null && var34.strictX >= 0 && var34.strictX < 13312 && var34.strictY >= 0 && var34.strictY < 13312) {
                            var8.method341(var34.strictX, var34.strictY, Class25.method175(var34.strictX, var34.strictY, var8.anInt209) - var8.anInt328, Client.engineCycle);
                        }
                    }

                    if (var8.targetIndex < 0) {
                        var7 = -var8.targetIndex - 1;
                        Player var35;
                        if (Client.playerIndex == var7) {
                            var35 = Client.player;
                        } else {
                            var35 = Client.players[var7];
                        }

                        if (var35 != null && var35.strictX >= 0 && var35.strictX < 13312 && var35.strictY >= 0 && var35.strictY < 13312) {
                            var8.method341(var35.strictX, var35.strictY, Class25.method175(var35.strictX, var35.strictY, var8.anInt209) - var8.anInt328, Client.engineCycle);
                        }
                    }

                    var8.method451(Client.anInt1544);
                    Class60.aSceneGraph631.method698(Player.floorLevel, (int) var8.currentX, (int) var8.currentY, (int) var8.aDouble808, 60, var8, var8.xRotation, -1, false);
                }
            } else {
                var8.unlink();
            }
        }

        for (GraphicsObject var36 = Client.graphicsObjects.method995(); var36 != null; var36 = Client.graphicsObjects.next()) {
            if (var36.level == Player.floorLevel && !var36.inanimate) {
                if (Client.engineCycle >= var36.endCycle) {
                    var36.update(Client.anInt1544);
                    if (var36.inanimate) {
                        var36.unlink();
                    } else {
                        Class60.aSceneGraph631.method698(var36.level, var36.sceneX, var36.sceneY, var36.height, 60, var36, 0, -1, false);
                    }
                }
            } else {
                var36.unlink();
            }
        }

        Player.method193(var0, var1, var2, var3, true);
        var0 = Client.anInt1437;
        var1 = Client.anInt1432;
        var2 = Client.viewportWidth;
        var3 = Client.viewportHeight;
        DrawingArea.setClip(var0, var1, var2 + var0, var3 + var1);
        Node_Sub21_Sub26_Sub1.method308();
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var20;
        if (!Client.cameraLocked) {
            var5 = Client.anInt1541;
            if (Client.anInt1564 / 256 > var5) {
                var5 = Client.anInt1564 / 256;
            }

            if (Client.aBooleanArray1427[4] && Client.anIntArray1428[4] + 128 > var5) {
                var5 = Client.anIntArray1428[4] + 128;
            }

            var9 = Client.mapRotation + Client.anInt1524 & 2047;
            var7 = Class45.anInt370;
            var10 = Class25.method175(Client.player.strictX, Client.player.strictY, Player.floorLevel) - Client.anInt1573;
            var11 = BoundaryDecor.anInt1106;
            var12 = var5 * 3 + 600;
            var13 = 2048 - var5 & 2047;
            var14 = 2048 - var9 & 2047;
            var15 = 0;
            var16 = 0;
            var17 = var12;
            int var19;
            if (var13 != 0) {
                var18 = Node_Sub21_Sub26_Sub1.SINE[var13];
                var19 = Node_Sub21_Sub26_Sub1.COS[var13];
                var20 = var19 * var16 - var18 * var12 >> 16;
                var17 = var16 * var18 + var19 * var12 >> 16;
                var16 = var20;
            }

            if (var14 != 0) {
                var18 = Node_Sub21_Sub26_Sub1.SINE[var14];
                var19 = Node_Sub21_Sub26_Sub1.COS[var14];
                var20 = var15 * var19 + var17 * var18 >> 16;
                var17 = var19 * var17 - var18 * var15 >> 16;
                var15 = var20;
            }

            Class53.cameraX = var7 - var15;
            Class85.cameraZ = var10 - var16;
            Class34.cameraY = var11 - var17;
            Class133.cameraPitch = var5;
            Class43.cameraYaw = var9;
        }

        if (!Client.cameraLocked) {
            if (Client.preferences.roofsHidden) {
                var9 = Player.floorLevel;
            } else {
                label717:
                {
                    var7 = 3;
                    if (Class133.cameraPitch < 310) {
                        var10 = Class53.cameraX >> 7;
                        var11 = Class34.cameraY >> 7;
                        var12 = Client.player.strictX >> 7;
                        var13 = Client.player.strictY >> 7;
                        if (var10 < 0 || var11 < 0 || var10 >= 104 || var11 >= 104) {
                            var9 = Player.floorLevel;
                            break label717;
                        }

                        if ((Class26.aByteArrayArrayArray189[Player.floorLevel][var10][var11] & 4) != 0) {
                            var7 = Player.floorLevel;
                        }

                        if (var12 > var10) {
                            var14 = var12 - var10;
                        } else {
                            var14 = var10 - var12;
                        }

                        if (var13 > var11) {
                            var15 = var13 - var11;
                        } else {
                            var15 = var11 - var13;
                        }

                        if (var14 > var15) {
                            var16 = var15 * 65536 / var14;
                            var17 = 32768;

                            while (var10 != var12) {
                                if (var10 < var12) {
                                    ++var10;
                                } else if (var10 > var12) {
                                    --var10;
                                }

                                if ((Class26.aByteArrayArrayArray189[Player.floorLevel][var10][var11] & 4) != 0) {
                                    var7 = Player.floorLevel;
                                }

                                var17 += var16;
                                if (var17 >= 65536) {
                                    var17 -= 65536;
                                    if (var11 < var13) {
                                        ++var11;
                                    } else if (var11 > var13) {
                                        --var11;
                                    }

                                    if ((Class26.aByteArrayArrayArray189[Player.floorLevel][var10][var11] & 4) != 0) {
                                        var7 = Player.floorLevel;
                                    }
                                }
                            }
                        } else {
                            var16 = var14 * 65536 / var15;
                            var17 = 32768;

                            while (var11 != var13) {
                                if (var11 < var13) {
                                    ++var11;
                                } else if (var11 > var13) {
                                    --var11;
                                }

                                if ((Class26.aByteArrayArrayArray189[Player.floorLevel][var10][var11] & 4) != 0) {
                                    var7 = Player.floorLevel;
                                }

                                var17 += var16;
                                if (var17 >= 65536) {
                                    var17 -= 65536;
                                    if (var10 < var12) {
                                        ++var10;
                                    } else if (var10 > var12) {
                                        --var10;
                                    }

                                    if ((Class26.aByteArrayArrayArray189[Player.floorLevel][var10][var11] & 4) != 0) {
                                        var7 = Player.floorLevel;
                                    }
                                }
                            }
                        }
                    }

                    if (Client.player.strictX >= 0 && Client.player.strictY >= 0 && Client.player.strictX < 13312 && Client.player.strictY < 13312) {
                        if ((Class26.aByteArrayArrayArray189[Player.floorLevel][Client.player.strictX >> 7][Client.player.strictY >> 7] & 4) != 0) {
                            var7 = Player.floorLevel;
                        }

                        var9 = var7;
                    } else {
                        var9 = Player.floorLevel;
                    }
                }
            }

            var5 = var9;
        } else {
            if (Client.preferences.roofsHidden) {
                var9 = Player.floorLevel;
            } else {
                var7 = Class25.method175(Class53.cameraX, Class34.cameraY, Player.floorLevel);
                if (var7 - Class85.cameraZ < 800 && (Class26.aByteArrayArrayArray189[Player.floorLevel][Class53.cameraX >> 7][Class34.cameraY >> 7] & 4) != 0) {
                    var9 = Player.floorLevel;
                } else {
                    var9 = 3;
                }
            }

            var5 = var9;
        }

        var9 = Class53.cameraX;
        var7 = Class85.cameraZ;
        var10 = Class34.cameraY;
        var11 = Class133.cameraPitch;
        var12 = Class43.cameraYaw;

        for (var13 = 0; var13 < 5; ++var13) {
            if (Client.aBooleanArray1427[var13]) {
                var14 = (int) (Math.random() * (double) (Client.anIntArray1708[var13] * 2 + 1) - (double) Client.anIntArray1708[var13] + Math.sin((double) Client.anIntArray1444[var13] * ((double) Client.anIntArray1433[var13] / 100.0D)) * (double) Client.anIntArray1428[var13]);
                if (var13 == 0) {
                    Class53.cameraX += var14;
                }

                if (var13 == 1) {
                    Class85.cameraZ += var14;
                }

                if (var13 == 2) {
                    Class34.cameraY += var14;
                }

                if (var13 == 3) {
                    Class43.cameraYaw = Class43.cameraYaw + var14 & 2047;
                }

                if (var13 == 4) {
                    Class133.cameraPitch += var14;
                    if (Class133.cameraPitch < 128) {
                        Class133.cameraPitch = 128;
                    }

                    if (Class133.cameraPitch > 383) {
                        Class133.cameraPitch = 383;
                    }
                }
            }
        }

        var13 = Class33.anInt261;
        var14 = Class33.anInt260;
        if (Class33.anInt265 != 0) {
            var13 = Class33.anInt255;
            var14 = Class33.anInt259;
        }

        if (var13 >= var0 && var13 < var2 + var0 && var14 >= var1 && var14 < var1 + var3) {
            var15 = var13 - var0;
            var16 = var14 - var1;
            Class105.anInt1251 = var15;
            Class105.anInt1246 = var16;
            Class105.aBoolean1242 = true;
            Class105.onCursorCount = 0;
            Class105.aBoolean1245 = false;
        } else {
            Class14.method128();
        }

        ScriptEvent.method273();
        DrawingArea.method1223(var0, var1, var2, var3, 0);
        ScriptEvent.method273();
        var15 = Node_Sub21_Sub26_Sub1.anInt228;
        Node_Sub21_Sub26_Sub1.anInt228 = Client.viewportScale;
        Class60.aSceneGraph631.method680(Class53.cameraX, Class85.cameraZ, Class34.cameraY, Class133.cameraPitch, Class43.cameraYaw, var5);

        while (true) {
            BoundingBox boundingBox = BoundingBoxInfo.boundingBoxes.method907();
            if (boundingBox == null) {
                Node_Sub21_Sub26_Sub1.anInt228 = var15;
                ScriptEvent.method273();
                Class60.aSceneGraph631.method713();
                Client.anInt1552 = 0;
                boolean var37 = false;
                var17 = -1;
                var18 = Class71.anInt729;
                int[] var22 = Class71.anIntArray723;

                for (var20 = 0; var20 < var18 + Client.anInt1501; ++var20) {
                    Object var23;
                    if (var20 < var18) {
                        var23 = Client.players[var22[var20]];
                        if (var22[var20] == Client.anInt1608) {
                            var37 = true;
                            var17 = var20;
                            continue;
                        }
                    } else {
                        var23 = Client.npcs[Client.npcIndices[var20 - var18]];
                    }

                    Hitbar.method435((PathingEntity) var23, var20, var0, var1, var2, var3);
                }

                if (var37) {
                    Hitbar.method435(Client.players[Client.anInt1608], var17, var0, var1, var2, var3);
                }

                for (var20 = 0; var20 < Client.anInt1552; ++var20) {
                    int var24 = Client.anIntArray1572[var20];
                    int var25 = Client.anIntArray1560[var20];
                    int var26 = Client.anIntArray1554[var20];
                    int var27 = Client.anIntArray1568[var20];
                    boolean var28 = true;

                    while (var28) {
                        var28 = false;

                        for (int var29 = 0; var29 < var20; ++var29) {
                            if (var25 + 2 > Client.anIntArray1560[var29] - Client.anIntArray1568[var29] && var25 - var27 < Client.anIntArray1560[var29] + 2 && var24 - var26 < Client.anIntArray1554[var29] + Client.anIntArray1572[var29] && var26 + var24 > Client.anIntArray1572[var29] - Client.anIntArray1554[var29] && Client.anIntArray1560[var29] - Client.anIntArray1568[var29] < var25) {
                                var25 = Client.anIntArray1560[var29] - Client.anIntArray1568[var29];
                                var28 = true;
                            }
                        }
                    }

                    Client.anInt1561 = Client.anIntArray1572[var20];
                    Client.anInt1571 = Client.anIntArray1560[var20] = var25;
                    String var30 = Client.aStringArray1553[var20];
                    if (Client.anInt1626 == 0) {
                        int var31 = 16776960;
                        if (Client.anIntArray1566[var20] < 6) {
                            var31 = Client.anIntArray1686[Client.anIntArray1566[var20]];
                        }

                        if (Client.anIntArray1566[var20] == 6) {
                            var31 = Client.anInt1565 % 20 < 10 ? 16711680 : 16776960;
                        }

                        if (Client.anIntArray1566[var20] == 7) {
                            var31 = Client.anInt1565 % 20 < 10 ? 255 : '\uffff';
                        }

                        if (Client.anIntArray1566[var20] == 8) {
                            var31 = Client.anInt1565 % 20 < 10 ? '뀀' : 8454016;
                        }

                        int var32;
                        if (Client.anIntArray1566[var20] == 9) {
                            var32 = 150 - Client.anIntArray1556[var20];
                            if (var32 < 50) {
                                var31 = var32 * 1280 + 16711680;
                            } else if (var32 < 100) {
                                var31 = 16776960 - (var32 - 50) * 327680;
                            } else if (var32 < 150) {
                                var31 = (var32 - 100) * 5 + '\uff00';
                            }
                        }

                        if (Client.anIntArray1566[var20] == 10) {
                            var32 = 150 - Client.anIntArray1556[var20];
                            if (var32 < 50) {
                                var31 = var32 * 5 + 16711680;
                            } else if (var32 < 100) {
                                var31 = 16711935 - (var32 - 50) * 327680;
                            } else if (var32 < 150) {
                                var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
                            }
                        }

                        if (Client.anIntArray1566[var20] == 11) {
                            var32 = 150 - Client.anIntArray1556[var20];
                            if (var32 < 50) {
                                var31 = 16777215 - var32 * 327685;
                            } else if (var32 < 100) {
                                var31 = (var32 - 50) * 327685 + '\uff00';
                            } else if (var32 < 150) {
                                var31 = 16777215 - (var32 - 100) * 327680;
                            }
                        }

                        if (Client.anIntArray1555[var20] == 0) {
                            Class35.aFont313.method1161(var30, var0 + Client.anInt1561, Client.anInt1571 + var1, var31, 0);
                        }

                        if (Client.anIntArray1555[var20] == 1) {
                            Class35.aFont313.method1180(var30, var0 + Client.anInt1561, var1 + Client.anInt1571, var31, 0, Client.anInt1565);
                        }

                        if (Client.anIntArray1555[var20] == 2) {
                            Class35.aFont313.method1179(var30, var0 + Client.anInt1561, var1 + Client.anInt1571, var31, 0, Client.anInt1565);
                        }

                        if (Client.anIntArray1555[var20] == 3) {
                            Class35.aFont313.method1182(var30, var0 + Client.anInt1561, Client.anInt1571 + var1, var31, 0, Client.anInt1565, 150 - Client.anIntArray1556[var20]);
                        }

                        if (Client.anIntArray1555[var20] == 4) {
                            var32 = (150 - Client.anIntArray1556[var20]) * (Class35.aFont313.getTextWidth(var30) + 100) / 150;
                            DrawingArea.method1228(Client.anInt1561 + var0 - 50, var1, var0 + Client.anInt1561 + 50, var1 + var3);
                            Class35.aFont313.method1170(var30, var0 + Client.anInt1561 + 50 - var32, var1 + Client.anInt1571, var31, 0);
                            DrawingArea.setClip(var0, var1, var2 + var0, var1 + var3);
                        }

                        if (Client.anIntArray1555[var20] == 5) {
                            var32 = 150 - Client.anIntArray1556[var20];
                            int var33 = 0;
                            if (var32 < 25) {
                                var33 = var32 - 25;
                            } else if (var32 > 125) {
                                var33 = var32 - 125;
                            }

                            DrawingArea.method1228(var0, var1 + Client.anInt1571 - Class35.aFont313.anInt221 - 1, var2 + var0, Client.anInt1571 + var1 + 5);
                            Class35.aFont313.method1161(var30, var0 + Client.anInt1561, var33 + Client.anInt1571 + var1, var31, 0);
                            DrawingArea.setClip(var0, var1, var2 + var0, var1 + var3);
                        }
                    } else {
                        Class35.aFont313.method1161(var30, var0 + Client.anInt1561, var1 + Client.anInt1571, 16776960, 0);
                    }
                }

                Class60.method371(var0, var1);
                ((TextureProviderImpl) Node_Sub21_Sub26_Sub1.aTextureProvider1085).method505(Client.anInt1544);
                Login.method415(var0, var1, var2, var3);
                Class53.cameraX = var9;
                Class85.cameraZ = var7;
                Class34.cameraY = var10;
                Class133.cameraPitch = var11;
                Class43.cameraYaw = var12;
                if (Client.aBoolean1484) {
                    byte var38 = 0;
                    var17 = var38 + Class168.anInt2087 + Class168.anInt2077;
                    if (var17 == 0) {
                        Client.aBoolean1484 = false;
                    }
                }

                if (Client.aBoolean1484) {
                    DrawingArea.method1223(var0, var1, var2, var3, 0);
                    Class122.method811("Loading - please wait.", false);
                }

                return;
            }

            boundingBox.draw();
        }
    }
}
