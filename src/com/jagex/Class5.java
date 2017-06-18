package com.jagex;

public final class Class5 {
    public static int anInt38;
    static int anInt37;
    static int anInt35;
    // $FF: synthetic field
    final Class7 aClass7_36;
    int anInt33;
    int anInt39;
    int anInt34;
    int anInt32;

    Class5(Class7 var1) {
        this.aClass7_36 = var1;
    }

    static void method19(InterfaceComponent[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        Node_Sub21_Sub26.method1209(var2, var3, var4, var5);
        Node_Sub21_Sub26_Sub1.method308();

        for (int var9 = 0; var9 < var0.length; ++var9) {
            InterfaceComponent component = var0[var9];
            if (component != null && (component.parentUid == var1 || var1 == -1412584499 && component == Client.anInterfaceComponent1647)) {
                int var11;
                if (var8 == -1) {
                    Client.interfacePositionsX[Client.anInt1673] = component.relativeX + var6;
                    Client.interfacePositionsY[Client.anInt1673] = component.relativeY + var7;
                    Client.interfaceWidths[Client.anInt1673] = component.width;
                    Client.interfaceHeights[Client.anInt1673] = component.height;
                    var11 = ++Client.anInt1673 - 1;
                } else {
                    var11 = var8;
                }

                component.boundsIndex = var11;
                component.renderCycle = Client.engineCycle;
                if (!component.aBoolean1173 || !Class1.method6(component)) {
                    int var12;
                    if (component.contentType > 0) {
                        var12 = component.contentType;
                        if (var12 == 324) {
                            if (Client.anInt1440 == -1) {
                                Client.anInt1440 = component.materialId;
                                Client.anInt1436 = component.enabledMaterialId * -1;
                            }

                            if (Client.aPlayerAppearance1455.female) {
                                component.materialId = Client.anInt1440;
                            } else {
                                component.materialId = Client.anInt1436 * -1;
                            }
                        } else if (var12 == 325) {
                            if (Client.anInt1440 == -1) {
                                Client.anInt1440 = component.materialId;
                                Client.anInt1436 = component.enabledMaterialId * -1;
                            }

                            if (Client.aPlayerAppearance1455.female) {
                                component.materialId = Client.anInt1436 * -1;
                            } else {
                                component.materialId = Client.anInt1440;
                            }
                        } else if (var12 == 327) {
                            component.xRotation = 150;
                            component.zRotation = (int) (Math.sin((double) Client.engineCycle / 40.0D) * 256.0D) & 2047;
                            component.modelType = 5;
                            component.modelId = 0;
                        } else if (var12 == 328) {
                            component.xRotation = 150;
                            component.zRotation = (int) (Math.sin((double) Client.engineCycle / 40.0D) * 256.0D) & 2047;
                            component.modelType = 5;
                            component.modelId = 1;
                        }
                    }

                    var12 = component.relativeX + var6;
                    int var13 = var7 + component.relativeY;
                    int var14 = component.anInt1864;
                    int var15;
                    int var16;
                    if (component == Client.anInterfaceComponent1647) {
                        if (var1 != -1412584499 && !component.aBoolean1882) {
                            Class35.anInterfaceComponentArray314 = var0;
                            Class75.anInt806 = var6;
                            MouseRecorder.anInt249 = var7;
                            continue;
                        }

                        if (Client.aBoolean1634 && Client.aBoolean1648) {
                            var15 = Class33.anInt261;
                            var16 = Class33.anInt260;
                            var15 -= Client.anInt1651;
                            var16 -= Client.anInt1645;
                            if (var15 < Client.anInt1635) {
                                var15 = Client.anInt1635;
                            }

                            if (component.width + var15 > Client.anInterfaceComponent1653.width + Client.anInt1635) {
                                var15 = Client.anInterfaceComponent1653.width + Client.anInt1635 - component.width;
                            }

                            if (var16 < Client.anInt1646) {
                                var16 = Client.anInt1646;
                            }

                            if (var16 + component.height > Client.anInterfaceComponent1653.height + Client.anInt1646) {
                                var16 = Client.anInt1646 + Client.anInterfaceComponent1653.height - component.height;
                            }

                            var12 = var15;
                            var13 = var16;
                        }

                        if (!component.aBoolean1882) {
                            var14 = 128;
                        }
                    }

                    int var17;
                    int var18;
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (component.type == 2) {
                        var15 = var2;
                        var16 = var3;
                        var17 = var4;
                        var18 = var5;
                    } else if (component.type == 9) {
                        var22 = var12;
                        var20 = var13;
                        var21 = var12 + component.width;
                        var23 = var13 + component.height;
                        if (var21 < var12) {
                            var22 = var21;
                            var21 = var12;
                        }

                        if (var23 < var13) {
                            var20 = var23;
                            var23 = var13;
                        }

                        ++var21;
                        ++var23;
                        var15 = var22 > var2 ? var22 : var2;
                        var16 = var20 > var3 ? var20 : var3;
                        var17 = var21 < var4 ? var21 : var4;
                        var18 = var23 < var5 ? var23 : var5;
                    } else {
                        var22 = component.width + var12;
                        var20 = var13 + component.height;
                        var15 = var12 > var2 ? var12 : var2;
                        var16 = var13 > var3 ? var13 : var3;
                        var17 = var22 < var4 ? var22 : var4;
                        var18 = var20 < var5 ? var20 : var5;
                    }

                    if (!component.aBoolean1173 || var15 < var17 && var16 < var18) {
                        if (component.contentType != 0) {
                            if (component.contentType == 1336) {
                                if (Client.showFps) {
                                    var13 += 15;
                                    Boundary.aFont1150.method1183("Fps:" + Client.anInt300, component.width + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var38 = Runtime.getRuntime();
                                    var20 = (int) ((var38.totalMemory() - var38.freeMemory()) / 1024L);
                                    var21 = 16776960;
                                    if (var20 > 32768 && Client.lowMemory) {
                                        var21 = 16711680;
                                    }

                                    if (var20 > 65536 && !Client.lowMemory) {
                                        var21 = 16711680;
                                    }

                                    Boundary.aFont1150.method1183("Mem:" + var20 + "k", component.width + var12, var13, var21, -1);
                                    var13 += 15;
                                }
                                continue;
                            }

                            if (component.contentType == 1337) {
                                Client.anInt1618 = var12;
                                Client.anInt1617 = var13;
                                Class49.method314(var12, var13, component.width, component.height);
                                Client.aBooleanArray1656[component.boundsIndex] = true;
                                Node_Sub21_Sub26.method1209(var2, var3, var4, var5);
                                continue;
                            }

                            if (component.contentType == 1338) {
                                Class182.method1200(component, var12, var13, var11);
                                Node_Sub21_Sub26.method1209(var2, var3, var4, var5);
                                continue;
                            }

                            if (component.contentType == 1339) {
                                InterfaceComponent.method409(component, var12, var13, var11);
                                Node_Sub21_Sub26.method1209(var2, var3, var4, var5);
                                continue;
                            }

                            if (component.contentType == 1400) {
                                Class9.aClass189_68.method1298(var12, var13, component.width, component.height, Client.engineCycle);
                            }

                            if (component.contentType == 1401) {
                                Class9.aClass189_68.method1292(var12, var13, component.width, component.height);
                            }
                        }

                        if (component.type == 0) {
                            if (!component.aBoolean1173 && Class1.method6(component) && PickableNode.anInterfaceComponent673 != component) {
                                continue;
                            }

                            if (!component.aBoolean1173) {
                                if (component.insetY > component.viewportHeight - component.height) {
                                    component.insetY = component.viewportHeight - component.height;
                                }

                                if (component.insetY < 0) {
                                    component.insetY = 0;
                                }
                            }

                            method19(var0, component.uid, var15, var16, var17, var18, var12 - component.insetX, var13 - component.insetY, var11);
                            if (component.components != null) {
                                method19(component.components, component.uid, var15, var16, var17, var18, var12 - component.insetX, var13 - component.insetY, var11);
                            }

                            InterfaceNode var19 = Client.interfaceNodes.lookup((long) component.uid);
                            if (var19 != null) {
                                Class122.method810(var19.id, var15, var16, var17, var18, var12, var13, var11);
                            }

                            Node_Sub21_Sub26.method1209(var2, var3, var4, var5);
                            Node_Sub21_Sub26_Sub1.method308();
                        }

                        if (Client.aBoolean1690 || Client.aBooleanArray1665[var11] || Client.redrawMode > 1) {
                            int var24;
                            int var25;
                            if (component.type == 0 && !component.aBoolean1173 && component.viewportHeight > component.height) {
                                var22 = component.width + var12;
                                var20 = component.insetY;
                                var21 = component.height;
                                var23 = component.viewportHeight;
                                Class64.aNode_Sub21_Sub26_Sub2Array656[0].method1155(var22, var13);
                                Class64.aNode_Sub21_Sub26_Sub2Array656[1].method1155(var22, var13 + var21 - 16);
                                Node_Sub21_Sub26.method1223(var22, var13 + 16, 16, var21 - 32, Client.anInt1543);
                                var24 = (var21 - 32) * var21 / var23;
                                if (var24 < 8) {
                                    var24 = 8;
                                }

                                var25 = (var21 - 32 - var24) * var20 / (var23 - var21);
                                Node_Sub21_Sub26.method1223(var22, var13 + 16 + var25, 16, var24, Client.anInt1545);
                                Node_Sub21_Sub26.method1220(var22, var25 + var13 + 16, var24, Client.anInt1549);
                                Node_Sub21_Sub26.method1220(var22 + 1, var13 + 16 + var25, var24, Client.anInt1549);
                                Node_Sub21_Sub26.method1214(var22, var13 + 16 + var25, 16, Client.anInt1549);
                                Node_Sub21_Sub26.method1214(var22, var25 + var13 + 17, 16, Client.anInt1549);
                                Node_Sub21_Sub26.method1220(var22 + 15, var25 + var13 + 16, var24, Client.anInt1551);
                                Node_Sub21_Sub26.method1220(var22 + 14, var25 + var13 + 17, var24 - 1, Client.anInt1551);
                                Node_Sub21_Sub26.method1214(var22, var24 + var13 + 15 + var25, 16, Client.anInt1551);
                                Node_Sub21_Sub26.method1214(var22 + 1, var24 + var13 + 14 + var25, 15, Client.anInt1551);
                            }

                            if (component.type != 1) {
                                int var26;
                                int var27;
                                if (component.type == 2) {
                                    var22 = 0;

                                    for (var20 = 0; var20 < component.anInt748; ++var20) {
                                        for (var21 = 0; var21 < component.anInt749; ++var21) {
                                            var23 = var21 * (component.xPadding + 32) + var12;
                                            var24 = (component.yPadding + 32) * var20 + var13;
                                            if (var22 < 20) {
                                                var23 += component.anIntArray1881[var22];
                                                var24 += component.anIntArray1885[var22];
                                            }

                                            if (component.itemIds[var22] <= 0) {
                                                if (component.anIntArray1883 != null && var22 < 20) {
                                                    Sprite var46 = component.method1017(var22);
                                                    if (var46 != null) {
                                                        var46.method1230(var23, var24);
                                                    } else if (InterfaceComponent.aBoolean1174) {
                                                        ItemTable.method284(component);
                                                    }
                                                }
                                            } else {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                var27 = component.itemIds[var22] - 1;
                                                if (var23 + 32 > var2 && var23 < var4 && var24 + 32 > var3 && var24 < var5 || Class118.anInterfaceComponent1348 == component && Client.anInt1588 == var22) {
                                                    Sprite var28;
                                                    if (Client.itemSelectionState == 1 && var22 == Class55.anInt421 && Class2.anInt15 == component.uid) {
                                                        var28 = Key.method365(var27, component.itemStackSizes[var22], 2, 0, 2, false);
                                                    } else {
                                                        var28 = Key.method365(var27, component.itemStackSizes[var22], 1, 3153952, 2, false);
                                                    }

                                                    if (var28 != null) {
                                                        if (component == Class118.anInterfaceComponent1348 && Client.anInt1588 == var22) {
                                                            var25 = Class33.anInt261 - Client.anInt1579;
                                                            var26 = Class33.anInt260 - Client.anInt1592;
                                                            if (var25 < 5 && var25 > -5) {
                                                                var25 = 0;
                                                            }

                                                            if (var26 < 5 && var26 > -5) {
                                                                var26 = 0;
                                                            }

                                                            if (Client.anInt1582 < 5) {
                                                                var25 = 0;
                                                                var26 = 0;
                                                            }

                                                            var28.method1237(var23 + var25, var24 + var26, 128);
                                                            if (var1 != -1) {
                                                                InterfaceComponent var34 = var0[var1 & '\uffff'];
                                                                int var35;
                                                                if (var26 + var24 < Node_Sub21_Sub26.anInt1257 && var34.insetY > 0) {
                                                                    var35 = Client.anInt1544 * (Node_Sub21_Sub26.anInt1257 - var24 - var26) / 3;
                                                                    if (var35 > Client.anInt1544 * 10) {
                                                                        var35 = Client.anInt1544 * 10;
                                                                    }

                                                                    if (var35 > var34.insetY) {
                                                                        var35 = var34.insetY;
                                                                    }

                                                                    var34.insetY -= var35;
                                                                    Client.anInt1592 += var35;
                                                                    ItemTable.method284(var34);
                                                                }

                                                                if (var26 + var24 + 32 > Node_Sub21_Sub26.anInt753 && var34.insetY < var34.viewportHeight - var34.height) {
                                                                    var35 = Client.anInt1544 * (var26 + var24 + 32 - Node_Sub21_Sub26.anInt753) / 3;
                                                                    if (var35 > Client.anInt1544 * 10) {
                                                                        var35 = Client.anInt1544 * 10;
                                                                    }

                                                                    if (var35 > var34.viewportHeight - var34.height - var34.insetY) {
                                                                        var35 = var34.viewportHeight - var34.height - var34.insetY;
                                                                    }

                                                                    var34.insetY += var35;
                                                                    Client.anInt1592 -= var35;
                                                                    ItemTable.method284(var34);
                                                                }
                                                            }
                                                        } else if (component == Class33.anInterfaceComponent264 && Client.anInt1581 == var22) {
                                                            var28.method1237(var23, var24, 128);
                                                        } else {
                                                            var28.method1230(var23, var24);
                                                        }
                                                    } else {
                                                        ItemTable.method284(component);
                                                    }
                                                }
                                            }

                                            ++var22;
                                        }
                                    }
                                } else if (component.type == 3) {
                                    if (Class30.method205(component)) {
                                        var22 = component.anInt761;
                                        if (PickableNode.anInterfaceComponent673 == component && component.anInt767 != 0) {
                                            var22 = component.anInt767;
                                        }
                                    } else {
                                        var22 = component.textColor;
                                        if (component == PickableNode.anInterfaceComponent673 && component.anInt756 != 0) {
                                            var22 = component.anInt756;
                                        }
                                    }

                                    if (component.aBoolean1861) {
                                        switch (component.aClass172_1865.index) {
                                            case 1:
                                                Node_Sub21_Sub26.method1229(var12, var13, component.width, component.height, component.textColor, component.anInt761, 256 - (component.anInt1864 & 255), 256 - (component.anInt1860 & 255));
                                                break;
                                            case 2:
                                                Node_Sub21_Sub26.method1210(var12, var13, component.width, component.height, component.textColor, component.anInt761, 256 - (component.anInt1864 & 255), 256 - (component.anInt1860 & 255));
                                                break;
                                            case 3:
                                                Node_Sub21_Sub26.method1219(var12, var13, component.width, component.height, component.textColor, component.anInt761, 256 - (component.anInt1864 & 255), 256 - (component.anInt1860 & 255));
                                                break;
                                            case 4:
                                                Node_Sub21_Sub26.method1205(var12, var13, component.width, component.height, component.textColor, component.anInt761, 256 - (component.anInt1864 & 255), 256 - (component.anInt1860 & 255));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    Node_Sub21_Sub26.method1223(var12, var13, component.width, component.height, var22);
                                                } else {
                                                    Node_Sub21_Sub26.method1212(var12, var13, component.width, component.height, var22, 256 - (var14 & 255));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        Node_Sub21_Sub26.method1208(var12, var13, component.width, component.height, var22);
                                    } else {
                                        Node_Sub21_Sub26.method1215(var12, var13, component.width, component.height, var22, 256 - (var14 & 255));
                                    }
                                } else {
                                    Font var36;
                                    if (component.type == 4) {
                                        var36 = component.getFont();
                                        if (var36 == null) {
                                            if (InterfaceComponent.aBoolean1174) {
                                                ItemTable.method284(component);
                                            }
                                        } else {
                                            String var44 = component.text;
                                            if (Class30.method205(component)) {
                                                var20 = component.anInt761;
                                                if (component == PickableNode.anInterfaceComponent673 && component.anInt767 != 0) {
                                                    var20 = component.anInt767;
                                                }

                                                if (component.aString1894.length() > 0) {
                                                    var44 = component.aString1894;
                                                }
                                            } else {
                                                var20 = component.textColor;
                                                if (PickableNode.anInterfaceComponent673 == component && component.anInt756 != 0) {
                                                    var20 = component.anInt756;
                                                }
                                            }

                                            if (component.aBoolean1173 && component.itemId != -1) {
                                                ItemDefinition var47 = Class149.method1001(component.itemId);
                                                var44 = var47.name;
                                                if (var44 == null) {
                                                    var44 = "null";
                                                }

                                                if ((var47.stackable == 1 || component.itemStackSize != 1) && component.itemStackSize != -1) {
                                                    var44 = Class75.method449(16748608) + var44 + "</col>" + " " + 'x' + Class59.method366(component.itemStackSize);
                                                }
                                            }

                                            if (component == Client.anInterfaceComponent1627) {
                                                Object var10000 = null;
                                                var44 = "Please wait...";
                                                var20 = component.textColor;
                                            }

                                            if (!component.aBoolean1173) {
                                                var44 = Class33.method217(var44, component);
                                            }

                                            var36.method1184(var44, var12, var13, component.width, component.height, var20, component.textShadowed ? 0 : -1, component.anInt796, component.anInt795, component.anInt802);
                                        }
                                    } else if (component.type == 5) {
                                        Sprite var37;
                                        if (!component.aBoolean1173) {
                                            var37 = component.getMaterial(Class30.method205(component));
                                            if (var37 != null) {
                                                var37.method1230(var12, var13);
                                            } else if (InterfaceComponent.aBoolean1174) {
                                                ItemTable.method284(component);
                                            }
                                        } else {
                                            if (component.itemId != -1) {
                                                var37 = Key.method365(component.itemId, component.itemStackSize, component.borderThickness, component.shadowColor, component.anInt777, false);
                                            } else {
                                                var37 = component.getMaterial(false);
                                            }

                                            if (var37 == null) {
                                                if (InterfaceComponent.aBoolean1174) {
                                                    ItemTable.method284(component);
                                                }
                                            } else {
                                                var20 = var37.anInt328;
                                                var21 = var37.anInt221;
                                                if (!component.aBoolean789) {
                                                    var23 = component.width * 4096 / var20;
                                                    if (component.spriteId != 0) {
                                                        var37.method1248(var12 + component.width / 2, var13 + component.height / 2, component.spriteId, var23);
                                                    } else if (var14 != 0) {
                                                        var37.method1249(var12, var13, component.width, component.height, 256 - (var14 & 255));
                                                    } else if (component.width == var20 && component.height == var21) {
                                                        var37.method1230(var12, var13);
                                                    } else {
                                                        var37.method1247(var12, var13, component.width, component.height);
                                                    }
                                                } else {
                                                    Node_Sub21_Sub26.method1228(var12, var13, component.width + var12, component.height + var13);
                                                    var23 = (component.width + (var20 - 1)) / var20;
                                                    var24 = (var21 - 1 + component.height) / var21;

                                                    for (var25 = 0; var25 < var23; ++var25) {
                                                        for (var26 = 0; var26 < var24; ++var26) {
                                                            if (component.spriteId != 0) {
                                                                var37.method1248(var12 + var25 * var20 + var20 / 2, var21 * var26 + var13 + var21 / 2, component.spriteId, 4096);
                                                            } else if (var14 != 0) {
                                                                var37.method1237(var12 + var25 * var20, var21 * var26 + var13, 256 - (var14 & 255));
                                                            } else {
                                                                var37.method1230(var25 * var20 + var12, var26 * var21 + var13);
                                                            }
                                                        }
                                                    }

                                                    Node_Sub21_Sub26.method1209(var2, var3, var4, var5);
                                                }
                                            }
                                        }
                                    } else {
                                        ItemDefinition var30;
                                        if (component.type == 6) {
                                            boolean var39 = Class30.method205(component);
                                            if (var39) {
                                                var20 = component.anInt771;
                                            } else {
                                                var20 = component.anInt784;
                                            }

                                            Model var42 = null;
                                            var23 = 0;
                                            if (component.itemId != -1) {
                                                var30 = Class149.method1001(component.itemId);
                                                if (var30 != null) {
                                                    var30 = var30.method1142(component.itemStackSize);
                                                    var42 = var30.method1141(1);
                                                    if (var42 != null) {
                                                        var42.method724();
                                                        var23 = var42.height / 2;
                                                    } else {
                                                        ItemTable.method284(component);
                                                    }
                                                }
                                            } else if (component.modelType == 5) {
                                                if (component.modelId == 0) {
                                                    var42 = Client.aPlayerAppearance1455.getModel(null, -1, null, -1);
                                                } else {
                                                    var42 = Client.player.method191();
                                                }
                                            } else if (var20 == -1) {
                                                var42 = component.method1019(null, -1, var39, Client.player.appearance);
                                                if (var42 == null && InterfaceComponent.aBoolean1174) {
                                                    ItemTable.method284(component);
                                                }
                                            } else {
                                                AnimationSequence var45 = Applet_Sub1.method251(var20);
                                                var42 = component.method1019(var45, component.anInt1932, var39, Client.player.appearance);
                                                if (var42 == null && InterfaceComponent.aBoolean1174) {
                                                    ItemTable.method284(component);
                                                }
                                            }

                                            Node_Sub21_Sub26_Sub1.method641(var12 + component.width / 2, var13 + component.height / 2);
                                            var24 = Node_Sub21_Sub26_Sub1.SINE[component.xRotation] * component.modelZoom >> 16;
                                            var25 = component.modelZoom * Node_Sub21_Sub26_Sub1.COS[component.xRotation] >> 16;
                                            if (var42 != null) {
                                                if (!component.aBoolean1173) {
                                                    var42.method739(0, component.zRotation, 0, component.xRotation, 0, var24, var25);
                                                } else {
                                                    var42.method724();
                                                    if (component.aBoolean1869) {
                                                        var42.method733(0, component.zRotation, component.yRotation, component.xRotation, component.modelOffsetX, var24 + var23 + component.modelOffsetY, component.modelOffsetY + var25, component.modelZoom);
                                                    } else {
                                                        var42.method739(0, component.zRotation, component.yRotation, component.xRotation, component.modelOffsetX, var23 + var24 + component.modelOffsetY, component.modelOffsetY + var25);
                                                    }
                                                }
                                            }

                                            Node_Sub21_Sub26_Sub1.method335();
                                        } else {
                                            if (component.type == 7) {
                                                var36 = component.getFont();
                                                if (var36 == null) {
                                                    if (InterfaceComponent.aBoolean1174) {
                                                        ItemTable.method284(component);
                                                    }
                                                    continue;
                                                }

                                                var20 = 0;

                                                for (var21 = 0; var21 < component.anInt748; ++var21) {
                                                    for (var23 = 0; var23 < component.anInt749; ++var23) {
                                                        if (component.itemIds[var20] > 0) {
                                                            var30 = Class149.method1001(component.itemIds[var20] - 1);
                                                            String var32;
                                                            if (var30.stackable != 1 && component.itemStackSizes[var20] == 1) {
                                                                var32 = Class75.method449(16748608) + var30.name + "</col>";
                                                            } else {
                                                                var32 = Class75.method449(16748608) + var30.name + "</col>" + " " + 'x' + Class59.method366(component.itemStackSizes[var20]);
                                                            }

                                                            var26 = (component.xPadding + 115) * var23 + var12;
                                                            var27 = var13 + (component.yPadding + 12) * var21;
                                                            if (component.anInt796 == 0) {
                                                                var36.method1170(var32, var26, var27, component.textColor, component.textShadowed ? 0 : -1);
                                                            } else if (component.anInt796 == 1) {
                                                                var36.method1161(var32, var26 + component.width / 2, var27, component.textColor, component.textShadowed ? 0 : -1);
                                                            } else {
                                                                var36.method1183(var32, component.width + var26 - 1, var27, component.textColor, component.textShadowed ? 0 : -1);
                                                            }
                                                        }

                                                        ++var20;
                                                    }
                                                }
                                            }

                                            if (component.type == 8 && component == Class65.anInterfaceComponent663 && Client.anInt1614 == Client.anInt1625) {
                                                var22 = 0;
                                                var20 = 0;
                                                Font var29 = Boundary.aFont1150;
                                                String var31 = component.text;

                                                String var43;
                                                for (var31 = Class33.method217(var31, component); var31.length() > 0; var20 += var29.anInt221 + 1) {
                                                    var25 = var31.indexOf("<br>");
                                                    if (var25 != -1) {
                                                        var43 = var31.substring(0, var25);
                                                        var31 = var31.substring(var25 + 4);
                                                    } else {
                                                        var43 = var31;
                                                        var31 = "";
                                                    }

                                                    var26 = var29.getTextWidth(var43);
                                                    if (var26 > var22) {
                                                        var22 = var26;
                                                    }
                                                }

                                                var22 += 6;
                                                var20 += 7;
                                                var25 = var12 + component.width - 5 - var22;
                                                var26 = var13 + component.height + 5;
                                                if (var25 < var12 + 5) {
                                                    var25 = var12 + 5;
                                                }

                                                if (var25 + var22 > var4) {
                                                    var25 = var4 - var22;
                                                }

                                                if (var20 + var26 > var5) {
                                                    var26 = var5 - var20;
                                                }

                                                Node_Sub21_Sub26.method1223(var25, var26, var22, var20, 16777120);
                                                Node_Sub21_Sub26.method1208(var25, var26, var22, var20, 0);
                                                var31 = component.text;
                                                var27 = var26 + var29.anInt221 + 2;

                                                for (var31 = Class33.method217(var31, component); var31.length() > 0; var27 += var29.anInt221 + 1) {
                                                    int var33 = var31.indexOf("<br>");
                                                    if (var33 != -1) {
                                                        var43 = var31.substring(0, var33);
                                                        var31 = var31.substring(var33 + 4);
                                                    } else {
                                                        var43 = var31;
                                                        var31 = "";
                                                    }

                                                    var29.method1170(var43, var25 + 3, var27, 0, -1);
                                                }
                                            }

                                            if (component.type == 9) {
                                                if (component.aBoolean1863) {
                                                    var22 = var12;
                                                    var20 = component.height + var13;
                                                    var21 = var12 + component.width;
                                                    var23 = var13;
                                                } else {
                                                    var22 = var12;
                                                    var20 = var13;
                                                    var21 = component.width + var12;
                                                    var23 = var13 + component.height;
                                                }

                                                if (component.anInt1859 == 1) {
                                                    Node_Sub21_Sub26.method1226(var22, var20, var21, var23, component.textColor);
                                                } else {
                                                    Class6_Sub2.method460(var22, var20, var21, var23, component.textColor, component.anInt1859);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static ObjectDefinition method17(int var0) {
        ObjectDefinition var1 = (ObjectDefinition) ObjectDefinition.aReferenceCache2013.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = ObjectDefinition.aReferenceTable2017.method1085(6, var0);
            var1 = new ObjectDefinition();
            var1.id = var0;
            if (var2 != null) {
                var1.method1066(new Buffer(var2));
            }

            var1.method756();
            if (var1.aBoolean2033) {
                var1.anInt229 = 0;
                var1.aBoolean223 = false;
            }

            ObjectDefinition.aReferenceCache2013.method975(var1, (long) var0);
            return var1;
        }
    }

    static boolean method18(Packet var0, int var1) {
        int var2 = var0.method788(2);
        int var3;
        int var4;
        int var7;
        int var8;
        int var9;
        int var10;
        if (var2 == 0) {
            if (var0.method788(1) != 0) {
                method18(var0, var1);
            }

            var3 = var0.method788(13);
            var4 = var0.method788(13);
            boolean var12 = var0.method788(1) == 1;
            if (var12) {
                Class71.anIntArray717[++Class71.anInt724 - 1] = var1;
            }

            if (Client.players[var1] != null) {
                throw new RuntimeException();
            } else {
                Player var6 = Client.players[var1] = new Player();
                var6.anInt213 = var1;
                if (Class71.aBufferArray728[var1] != null) {
                    var6.method198(Class71.aBufferArray728[var1]);
                }

                var6.orientation = Class71.anIntArray725[var1];
                var6.targetIndex = Class71.anIntArray726[var1];
                var7 = Class71.anIntArray718[var1];
                var8 = var7 >> 28;
                var9 = var7 >> 14 & 255;
                var10 = var7 & 255;
                var6.aByteArray798[0] = Class71.aByteArray727[var1];
                var6.combatLevel = (byte) var8;
                var6.method200(var3 + (var9 << 13) - Class62.anInt636, var4 + (var10 << 13) - Class49.anInt377);
                var6.aBoolean237 = false;
                return true;
            }
        } else if (var2 == 1) {
            var3 = var0.method788(2);
            var4 = Class71.anIntArray718[var1];
            Class71.anIntArray718[var1] = ((var3 + (var4 >> 28) & 3) << 28) + (var4 & 268435455);
            return false;
        } else {
            int var5;
            int var11;
            if (var2 == 2) {
                var3 = var0.method788(5);
                var4 = var3 >> 3;
                var5 = var3 & 7;
                var11 = Class71.anIntArray718[var1];
                var7 = var4 + (var11 >> 28) & 3;
                var8 = var11 >> 14 & 255;
                var9 = var11 & 255;
                if (var5 == 0) {
                    --var8;
                    --var9;
                }

                if (var5 == 1) {
                    --var9;
                }

                if (var5 == 2) {
                    ++var8;
                    --var9;
                }

                if (var5 == 3) {
                    --var8;
                }

                if (var5 == 4) {
                    ++var8;
                }

                if (var5 == 5) {
                    --var8;
                    ++var9;
                }

                if (var5 == 6) {
                    ++var9;
                }

                if (var5 == 7) {
                    ++var8;
                    ++var9;
                }

                Class71.anIntArray718[var1] = var9 + (var8 << 14) + (var7 << 28);
                return false;
            } else {
                var3 = var0.method788(18);
                var4 = var3 >> 16;
                var5 = var3 >> 8 & 255;
                var11 = var3 & 255;
                var7 = Class71.anIntArray718[var1];
                var8 = var4 + (var7 >> 28) & 3;
                var9 = var5 + (var7 >> 14) & 255;
                var10 = var7 + var11 & 255;
                Class71.anIntArray718[var1] = var10 + (var8 << 28) + (var9 << 14);
                return false;
            }
        }
    }
}
