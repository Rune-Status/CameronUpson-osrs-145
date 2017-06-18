package com.jagex;

public class Hitbar extends Node {
    static int anInt221;
    static Sprite[] aSpriteArray1827;
    int health;
    int anInt232;
    int anInt206;
    int cycle;

    Hitbar(int var1, int var2, int var3, int var4) {
        this.cycle = var1;
        this.health = var2;
        this.anInt206 = var3;
        this.anInt232 = var4;
    }

    static void method435(PathingEntity var0, int var1, int var2, int var3, int var4, int var5) {
        if (var0 != null && var0.method194()) {
            if (var0 instanceof Npc) {
                NpcDefinition var6 = ((Npc) var0).definition;
                if (var6.transformIds != null) {
                    var6 = var6.transform();
                }

                if (var6 == null) {
                    return;
                }
            }

            int var7 = Class71.anInt729;
            int[] var8 = Class71.anIntArray723;
            int var9 = 3;
            int var16;
            int var22;
            int var23;
            if (!var0.healthBars.method906()) {
                Node_Sub20.method971(var0, var0.anInt803 + 15);

                for (HealthBar var10 = var0.healthBars.method909(); var10 != null; var10 = var0.healthBars.method911()) {
                    Hitbar var11 = var10.method346(Client.engineCycle);
                    if (var11 == null) {
                        if (var10.method345()) {
                            var10.unlink();
                        }
                    } else {
                        HealthBarDefinition var12 = var10.definition;
                        Sprite var13 = var12.method1122();
                        Sprite var14 = var12.method1121();
                        int var15 = 0;
                        if (var13 != null && var14 != null) {
                            if (var12.anInt235 * 2 < var14.width) {
                                var15 = var12.anInt235;
                            }

                            var16 = var14.width - var15 * 2;
                        } else {
                            var16 = var12.anInt919;
                        }

                        int var17 = 255;
                        boolean var18 = true;
                        int var19 = Client.engineCycle - var11.cycle;
                        int var20 = var11.anInt206 * var16 / var12.anInt919;
                        int var21;
                        int var88;
                        if (var11.anInt232 > var19) {
                            var21 = var12.anInt226 == 0 ? 0 : var12.anInt226 * (var19 / var12.anInt226);
                            var22 = var16 * var11.health / var12.anInt919;
                            var88 = var22 + (var20 - var22) * var21 / var11.anInt232;
                        } else {
                            var88 = var20;
                            var21 = var12.anInt228 + var11.anInt232 - var19;
                            if (var12.anInt214 >= 0) {
                                var17 = (var21 << 8) / (var12.anInt228 - var12.anInt214);
                            }
                        }

                        if (var11.anInt206 > 0 && var88 < 1) {
                            var88 = 1;
                        }

                        var21 = var2 + Client.anInt1561 - (var16 >> 1);
                        var22 = Client.anInt1571 + var3 - var9;
                        if (var13 != null && var14 != null) {
                            var21 -= var15;
                            if (var88 == var16) {
                                var88 += var15 * 2;
                            } else {
                                var88 += var15;
                            }

                            var23 = var13.height;
                            var9 += var23;
                            if (var17 >= 0 && var17 < 255) {
                                var13.method1237(var21, var22, var17);
                                DrawingArea.method1228(var21, var22, var88 + var21, var23 + var22);
                                var14.method1237(var21, var22, var17);
                            } else {
                                var13.method1230(var21, var22);
                                DrawingArea.method1228(var21, var22, var21 + var88, var23 + var22);
                                var14.method1230(var21, var22);
                            }

                            DrawingArea.setClip(var2, var3, var2 + var4, var5 + var3);
                            var9 += 2;
                        } else {
                            if (Client.anInt1561 > -1) {
                                DrawingArea.method1223(var21, var22, var88, 5, 65280);
                                DrawingArea.method1223(var88 + var21, var22, var16 - var88, 5, 16711680);
                            }

                            var9 += 7;
                        }
                    }
                }
            }

            if (var9 < 30) {
                var9 = 30;
            }

            if (var1 < var7) {
                Player var85 = (Player) var0;
                if (var85.aBoolean215) {
                    return;
                }

                if (var85.prayerIcon != -1 || var85.skullIcon != -1) {
                    Node_Sub20.method971(var0, var0.anInt803 + 15);
                    if (Client.anInt1561 > -1) {
                        if (var85.prayerIcon != -1) {
                            aSpriteArray1827[var85.prayerIcon].method1230(var2 + Client.anInt1561 - 12, Client.anInt1571 + var3 - var9);
                            var9 += 25;
                        }

                        if (var85.skullIcon != -1) {
                            Class169.aSpriteArray2119[var85.skullIcon].method1230(var2 + Client.anInt1561 - 12, Client.anInt1571 + var3 - var9);
                            var9 += 25;
                        }
                    }
                }

                if (var1 >= 0 && Client.anInt1485 == 10 && Client.anInt1472 == var8[var1]) {
                    Node_Sub20.method971(var0, var0.anInt803 + 15);
                    if (Client.anInt1561 > -1) {
                        Class70.aSpriteArray715[1].method1230(Client.anInt1561 + var2 - 12, Client.anInt1571 + var3 - var9);
                    }
                }
            } else {
                NpcDefinition var86 = ((Npc) var0).definition;
                if (var86.transformIds != null) {
                    var86 = var86.transform();
                }

                if (var86.anInt749 >= 0 && var86.anInt749 < Class169.aSpriteArray2119.length) {
                    Node_Sub20.method971(var0, var0.anInt803 + 15);
                    if (Client.anInt1561 > -1) {
                        Class169.aSpriteArray2119[var86.anInt749].method1230(Client.anInt1561 + var2 - 12, var3 + Client.anInt1571 - 30);
                    }
                }

                if (Client.anInt1485 == 1 && Client.npcIndices[var1 - var7] == Client.hintArrowNpcIndex && Client.engineCycle % 20 < 10) {
                    Node_Sub20.method971(var0, var0.anInt803 + 15);
                    if (Client.anInt1561 > -1) {
                        Class70.aSpriteArray715[0].method1230(Client.anInt1561 + var2 - 12, var3 + Client.anInt1571 - 28);
                    }
                }
            }

            if (var0.aString752 != null && (var1 >= var7 || !var0.aBoolean759 && (Client.anInt1689 == 4 || !var0.aBoolean750 && (Client.anInt1689 == 0 || Client.anInt1689 == 3 || Client.anInt1689 == 1 && Class112.method771(((Player) var0).name, false))))) {
                Node_Sub20.method971(var0, var0.anInt803);
                if (Client.anInt1561 > -1 && Client.anInt1552 < Client.anInt1567) {
                    Client.anIntArray1554[Client.anInt1552] = Class35.aFont313.getTextWidth(var0.aString752) / 2;
                    Client.anIntArray1568[Client.anInt1552] = Class35.aFont313.anInt221;
                    Client.anIntArray1572[Client.anInt1552] = Client.anInt1561;
                    Client.anIntArray1560[Client.anInt1552] = Client.anInt1571;
                    Client.anIntArray1566[Client.anInt1552] = var0.anInt756;
                    Client.anIntArray1555[Client.anInt1552] = var0.anInt767;
                    Client.anIntArray1556[Client.anInt1552] = var0.anInt761;
                    Client.aStringArray1553[Client.anInt1552] = var0.aString752;
                    ++Client.anInt1552;
                }
            }

            for (int var24 = 0; var24 < 4; ++var24) {
                int var25 = var0.hitsplatCycles[var24];
                int var26 = var0.hitsplatTypes[var24];
                HitsplatDefinition var87 = null;
                int var27 = 0;
                if (var26 >= 0) {
                    if (var25 <= Client.engineCycle) {
                        continue;
                    }

                    var87 = HitsplatDefinition.get(var0.hitsplatTypes[var24]);
                    var27 = var87.duration;
                    if (var87 != null && var87.transformIds != null) {
                        var87 = var87.transform();
                        if (var87 == null) {
                            var0.hitsplatCycles[var24] = -1;
                            continue;
                        }
                    }
                } else if (var25 < 0) {
                    continue;
                }

                var16 = var0.hitsplatIds[var24];
                HitsplatDefinition var28 = null;
                if (var16 >= 0) {
                    var28 = HitsplatDefinition.get(var16);
                    if (var28 != null && var28.transformIds != null) {
                        var28 = var28.transform();
                    }
                }

                if (var25 - var27 <= Client.engineCycle) {
                    if (var87 == null) {
                        var0.hitsplatCycles[var24] = -1;
                    } else {
                        Node_Sub20.method971(var0, var0.anInt803 / 2);
                        if (Client.anInt1561 > -1) {
                            if (var24 == 1) {
                                Client.anInt1571 -= 20;
                            }

                            if (var24 == 2) {
                                Client.anInt1561 -= 15;
                                Client.anInt1571 -= 10;
                            }

                            if (var24 == 3) {
                                Client.anInt1561 += 15;
                                Client.anInt1571 -= 10;
                            }

                            Sprite var29 = null;
                            Sprite var30 = null;
                            Sprite var31 = null;
                            Sprite var32 = null;
                            var22 = 0;
                            var23 = 0;
                            int var33 = 0;
                            int var34 = 0;
                            int var35 = 0;
                            int var36 = 0;
                            int var37 = 0;
                            int var38 = 0;
                            Sprite var39 = null;
                            Sprite var40 = null;
                            Sprite var41 = null;
                            Sprite var42 = null;
                            int var43 = 0;
                            int var44 = 0;
                            int var45 = 0;
                            int var46 = 0;
                            int var47 = 0;
                            int var48 = 0;
                            int var49 = 0;
                            int var50 = 0;
                            int var51 = 0;
                            var29 = var87.getIcon();
                            int var52;
                            if (var29 != null) {
                                var22 = var29.width;
                                var52 = var29.height;
                                if (var52 > var51) {
                                    var51 = var52;
                                }

                                var35 = var29.anInt232;
                            }

                            var30 = var87.getMiddleSpriteId();
                            if (var30 != null) {
                                var23 = var30.width;
                                var52 = var30.height;
                                if (var52 > var51) {
                                    var51 = var52;
                                }

                                var36 = var30.anInt232;
                            }

                            var31 = var87.getLeftSprite();
                            if (var31 != null) {
                                var33 = var31.width;
                                var52 = var31.height;
                                if (var52 > var51) {
                                    var51 = var52;
                                }

                                var37 = var31.anInt232;
                            }

                            var32 = var87.getRightSprite();
                            if (var32 != null) {
                                var34 = var32.width;
                                var52 = var32.height;
                                if (var52 > var51) {
                                    var51 = var52;
                                }

                                var38 = var32.anInt232;
                            }

                            if (var28 != null) {
                                var39 = var28.getIcon();
                                if (var39 != null) {
                                    var43 = var39.width;
                                    var52 = var39.height;
                                    if (var52 > var51) {
                                        var51 = var52;
                                    }

                                    var47 = var39.anInt232;
                                }

                                var40 = var28.getMiddleSpriteId();
                                if (var40 != null) {
                                    var44 = var40.width;
                                    var52 = var40.height;
                                    if (var52 > var51) {
                                        var51 = var52;
                                    }

                                    var48 = var40.anInt232;
                                }

                                var41 = var28.getLeftSprite();
                                if (var41 != null) {
                                    var45 = var41.width;
                                    var52 = var41.height;
                                    if (var52 > var51) {
                                        var51 = var52;
                                    }

                                    var49 = var41.anInt232;
                                }

                                var42 = var28.getRightSprite();
                                if (var42 != null) {
                                    var46 = var42.width;
                                    var52 = var42.height;
                                    if (var52 > var51) {
                                        var51 = var52;
                                    }

                                    var50 = var42.anInt232;
                                }
                            }

                            Font var53 = var87.getFont();
                            if (var53 == null) {
                                var53 = Class78.aFont838;
                            }

                            Font var54;
                            if (var28 != null) {
                                var54 = var28.getFont();
                                if (var54 == null) {
                                    var54 = Class78.aFont838;
                                }
                            } else {
                                var54 = Class78.aFont838;
                            }

                            String var55 = null;
                            String var56 = null;
                            boolean var57 = false;
                            int var58 = 0;
                            var55 = var87.formatAmount(var0.hitsplats[var24]);
                            int var89 = var53.getTextWidth(var55);
                            if (var28 != null) {
                                var56 = var28.formatAmount(var0.specialHitsplats[var24]);
                                var58 = var54.getTextWidth(var56);
                            }

                            int var59 = 0;
                            int var60 = 0;
                            if (var23 > 0) {
                                if (var31 == null && var32 == null) {
                                    var59 = 1;
                                } else {
                                    var59 = var89 / var23 + 1;
                                }
                            }

                            if (var28 != null && var44 > 0) {
                                if (var41 == null && var42 == null) {
                                    var60 = 1;
                                } else {
                                    var60 = var58 / var44 + 1;
                                }
                            }

                            int var61 = 0;
                            int var62 = var61;
                            if (var22 > 0) {
                                var61 += var22;
                            }

                            var61 += 2;
                            int var63 = var61;
                            if (var33 > 0) {
                                var61 += var33;
                            }

                            int var64 = var61;
                            int var65 = var61;
                            int var66;
                            if (var23 > 0) {
                                var66 = var59 * var23;
                                var61 += var66;
                                var65 += (var66 - var89) / 2;
                            } else {
                                var61 += var89;
                            }

                            var66 = var61;
                            if (var34 > 0) {
                                var61 += var34;
                            }

                            int var67 = 0;
                            int var68 = 0;
                            int var69 = 0;
                            int var70 = 0;
                            int var71 = 0;
                            int var72;
                            if (var28 != null) {
                                var61 += 2;
                                var67 = var61;
                                if (var43 > 0) {
                                    var61 += var43;
                                }

                                var61 += 2;
                                var68 = var61;
                                if (var45 > 0) {
                                    var61 += var45;
                                }

                                var69 = var61;
                                var71 = var61;
                                if (var44 > 0) {
                                    var72 = var60 * var44;
                                    var61 += var72;
                                    var71 += (var72 - var58) / 2;
                                } else {
                                    var61 += var58;
                                }

                                var70 = var61;
                                if (var46 > 0) {
                                    var61 += var46;
                                }
                            }

                            var72 = var0.hitsplatCycles[var24] - Client.engineCycle;
                            int var73 = var87.offsetX - var87.offsetX * var72 / var87.duration;
                            int var74 = -var87.offsetY + var72 * var87.offsetY / var87.duration;
                            int var75 = Client.anInt1561 + var2 - (var61 >> 1) + var73;
                            int var76 = var74 + (Client.anInt1571 + var3 - 12);
                            int var77 = var76;
                            int var78 = var51 + var76;
                            int var79 = var87.anInt213 + var76 + 15;
                            int var80 = var79 - var53.anInt220;
                            int var81 = var79 + var53.anInt217;
                            if (var80 < var76) {
                                var77 = var80;
                            }

                            if (var81 > var78) {
                                var78 = var81;
                            }

                            int var82 = 0;
                            int var83;
                            int var84;
                            if (var28 != null) {
                                var82 = var76 + 15 + var28.anInt213;
                                var83 = var82 - var54.anInt220;
                                var84 = var54.anInt217 + var82;
                                if (var83 < var77) {
                                }

                                if (var84 > var78) {
                                }
                            }

                            var83 = 255;
                            if (var87.fade >= 0) {
                                var83 = (var72 << 8) / (var87.duration - var87.fade);
                            }

                            if (var83 >= 0 && var83 < 255) {
                                if (var29 != null) {
                                    var29.method1237(var75 + var62 - var35, var76, var83);
                                }

                                if (var31 != null) {
                                    var31.method1237(var63 + var75 - var37, var76, var83);
                                }

                                if (var30 != null) {
                                    for (var84 = 0; var84 < var59; ++var84) {
                                        var30.method1237(var84 * var23 + (var75 + var64 - var36), var76, var83);
                                    }
                                }

                                if (var32 != null) {
                                    var32.method1237(var66 + var75 - var38, var76, var83);
                                }

                                var53.method1163(var55, var75 + var65, var79, var87.textColor, 0, var83);
                                if (var28 != null) {
                                    if (var39 != null) {
                                        var39.method1237(var75 + var67 - var47, var76, var83);
                                    }

                                    if (var41 != null) {
                                        var41.method1237(var68 + var75 - var49, var76, var83);
                                    }

                                    if (var40 != null) {
                                        for (var84 = 0; var84 < var60; ++var84) {
                                            var40.method1237(var75 + var69 - var48 + var44 * var84, var76, var83);
                                        }
                                    }

                                    if (var42 != null) {
                                        var42.method1237(var70 + var75 - var50, var76, var83);
                                    }

                                    var54.method1163(var56, var71 + var75, var82, var28.textColor, 0, var83);
                                }
                            } else {
                                if (var29 != null) {
                                    var29.method1230(var75 + var62 - var35, var76);
                                }

                                if (var31 != null) {
                                    var31.method1230(var75 + var63 - var37, var76);
                                }

                                if (var30 != null) {
                                    for (var84 = 0; var84 < var59; ++var84) {
                                        var30.method1230(var75 + var64 - var36 + var23 * var84, var76);
                                    }
                                }

                                if (var32 != null) {
                                    var32.method1230(var66 + var75 - var38, var76);
                                }

                                var53.method1170(var55, var75 + var65, var79, var87.textColor | -16777216, 0);
                                if (var28 != null) {
                                    if (var39 != null) {
                                        var39.method1230(var75 + var67 - var47, var76);
                                    }

                                    if (var41 != null) {
                                        var41.method1230(var75 + var68 - var49, var76);
                                    }

                                    if (var40 != null) {
                                        for (var84 = 0; var84 < var60; ++var84) {
                                            var40.method1230(var84 * var44 + (var75 + var69 - var48), var76);
                                        }
                                    }

                                    if (var42 != null) {
                                        var42.method1230(var75 + var70 - var50, var76);
                                    }

                                    var54.method1170(var56, var71 + var75, var82, var28.textColor | -16777216, 0);
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    void method341(int var1, int var2, int var3, int var4) {
        this.cycle = var1;
        this.health = var2;
        this.anInt206 = var3;
        this.anInt232 = var4;
    }
}
