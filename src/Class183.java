public class Class183 {
    static byte[][][] aByteArrayArrayArray2159;

    static void method1201(InterfaceComponent[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        for (int var8 = 0; var8 < var0.length; ++var8) {
            InterfaceComponent var9 = var0[var8];
            if (var9 != null && (!var9.aBoolean1173 || var9.type == 0 || var9.aBoolean1872 || Class75.method448(var9) != 0 || var9 == Client.anInterfaceComponent1653 || var9.contentType == 1338) && var9.parentUid == var1 && (!var9.aBoolean1173 || !Class1.method6(var9))) {
                int var10 = var6 + var9.relativeX;
                int var11 = var9.relativeY + var7;
                int var12;
                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var19;
                if (var9.type == 2) {
                    var12 = var2;
                    var13 = var3;
                    var14 = var4;
                    var15 = var5;
                } else if (var9.type == 9) {
                    var16 = var10;
                    var17 = var11;
                    int var18 = var9.width + var10;
                    var19 = var11 + var9.height;
                    if (var18 < var10) {
                        var16 = var18;
                        var18 = var10;
                    }

                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }

                    ++var18;
                    ++var19;
                    var12 = var16 > var2 ? var16 : var2;
                    var13 = var17 > var3 ? var17 : var3;
                    var14 = var18 < var4 ? var18 : var4;
                    var15 = var19 < var5 ? var19 : var5;
                } else {
                    var16 = var10 + var9.width;
                    var17 = var9.height + var11;
                    var12 = var10 > var2 ? var10 : var2;
                    var13 = var11 > var3 ? var11 : var3;
                    var14 = var16 < var4 ? var16 : var4;
                    var15 = var17 < var5 ? var17 : var5;
                }

                if (var9 == Client.anInterfaceComponent1647) {
                    Client.aBoolean1639 = true;
                    Client.anInt1643 = var10;
                    Client.anInt1633 = var11;
                }

                if (!var9.aBoolean1173 || var12 < var14 && var13 < var15) {
                    var16 = Class33.anInt261;
                    var17 = Class33.anInt260;
                    if (Class33.anInt265 != 0) {
                        var16 = Class33.anInt255;
                        var17 = Class33.anInt259;
                    }

                    boolean var34 = var16 >= var12 && var17 >= var13 && var16 < var14 && var17 < var15;
                    if (var9.contentType == 1337) {
                        if (!Client.aBoolean1484 && !Client.menuOpen && var34) {
                            Class180.method1198(var16, var17, var12, var13);
                        }
                    } else {
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        int var27;
                        int var37;
                        int var38;
                        if (var9.contentType == 1338) {
                            if ((Client.anInt1698 == 0 || Client.anInt1698 == 3) && (Class33.anInt265 == 1 || !Class163.aBoolean1965 && Class33.anInt265 == 4)) {
                                Node_Sub21_Sub5 var39 = var9.method1025(true);
                                if (var39 != null) {
                                    var37 = Class33.anInt255 - var10;
                                    var38 = Class33.anInt259 - var11;
                                    if (var39.method1010(var37, var38)) {
                                        var37 -= var39.anInt204 / 2;
                                        var38 -= var39.anInt209 / 2;
                                        var23 = Client.mapScale + Client.mapRotation & 2047;
                                        var24 = Node_Sub21_Sub26_Sub1.SINE[var23];
                                        var25 = Node_Sub21_Sub26_Sub1.COS[var23];
                                        var24 = (Client.mapOffset + 256) * var24 >> 8;
                                        var25 = var25 * (Client.mapOffset + 256) >> 8;
                                        var26 = var38 * var24 + var25 * var37 >> 11;
                                        var27 = var38 * var25 - var37 * var24 >> 11;
                                        int var28 = Client.player.strictX + var26 >> 7;
                                        int var29 = Client.player.strictY - var27 >> 7;
                                        Client.packet.writeHeader(220);
                                        Client.packet.method451(18);
                                        Client.packet.method845(var28 + Class62.anInt636);
                                        Client.packet.method845(Class49.anInt377 + var29);
                                        Client.packet.method823(Class4.aBooleanArray23[82] ? (Class4.aBooleanArray23[81] ? 2 : 1) : 0);
                                        Client.packet.method451(var37);
                                        Client.packet.method451(var38);
                                        Client.packet.method755(Client.mapRotation);
                                        Client.packet.method451(57);
                                        Client.packet.method451(Client.mapScale);
                                        Client.packet.method451(Client.mapOffset);
                                        Client.packet.method451(89);
                                        Client.packet.method755(Client.player.strictX);
                                        Client.packet.method755(Client.player.strictY);
                                        Client.packet.method451(63);
                                        Client.destinationX = var28;
                                        Client.destinationY = var29;
                                    }
                                }
                            }
                        } else {
                            if (var9.contentType == 1400) {
                                Class9.aClass189_68.method1288(Class33.anInt261, Class33.anInt260, var34, var10, var11, var9.width, var9.height);
                            }

                            if (!Client.menuOpen && var34) {
                                if (var9.contentType == 1400) {
                                    Class9.aClass189_68.method1280(var10, var11, var9.width, var9.height, var16, var17);
                                } else {
                                    Class112.method773(var9, var16 - var10, var17 - var11);
                                }
                            }

                            if (var9.type == 0) {
                                if (!var9.aBoolean1173 && Class1.method6(var9) && var9 != PickableNode.anInterfaceComponent673) {
                                    continue;
                                }

                                method1201(var0, var9.uid, var12, var13, var14, var15, var10 - var9.insetX, var11 - var9.insetY);
                                if (var9.components != null) {
                                    method1201(var9.components, var9.uid, var12, var13, var14, var15, var10 - var9.insetX, var11 - var9.insetY);
                                }

                                InterfaceNode var21 = Client.interfaceNodes.lookup((long) var9.uid);
                                if (var21 != null) {
                                    if (var21.state == 0 && Class33.anInt261 >= var12 && Class33.anInt260 >= var13 && Class33.anInt261 < var14 && Class33.anInt260 < var15 && !Client.menuOpen && !Client.aBoolean1637) {
                                        for (ScriptEvent var30 = Client.aNodeDeque1661.method995(); var30 != null; var30 = Client.aNodeDeque1661.next()) {
                                            if (var30.aBoolean324) {
                                                var30.unlink();
                                                var30.source.aBoolean1928 = false;
                                            }
                                        }

                                        if (Class2.anInt9 == 0) {
                                            Client.anInterfaceComponent1647 = null;
                                            Client.anInterfaceComponent1653 = null;
                                        }

                                        if (!Client.menuOpen) {
                                            Client.menuRowCount = 0;
                                            Client.anInt1624 = -1;
                                            Client.menuOpen = false;
                                            Client.menuActions[0] = "Cancel";
                                            Client.menuTargets[0] = "";
                                            Client.menuOpcodes[0] = 1006;
                                            Client.menuRowCount = 1;
                                        }
                                    }

                                    Class141.method978(var21.id, var12, var13, var14, var15, var10, var11);
                                }
                            }

                            if (var9.aBoolean1173) {
                                ScriptEvent var36;
                                if (!var9.aBoolean1936) {
                                    if (var9.aBoolean1945 && Class33.anInt261 >= var12 && Class33.anInt260 >= var13 && Class33.anInt261 < var14 && Class33.anInt260 < var15) {
                                        for (var36 = Client.aNodeDeque1661.method995(); var36 != null; var36 = Client.aNodeDeque1661.next()) {
                                            if (var36.aBoolean324 && var36.args == var36.source.scrollListeners) {
                                                var36.unlink();
                                            }
                                        }
                                    }
                                } else if (Class33.anInt261 >= var12 && Class33.anInt260 >= var13 && Class33.anInt261 < var14 && Class33.anInt260 < var15) {
                                    for (var36 = Client.aNodeDeque1661.method995(); var36 != null; var36 = Client.aNodeDeque1661.next()) {
                                        if (var36.aBoolean324) {
                                            var36.unlink();
                                            var36.source.aBoolean1928 = false;
                                        }
                                    }

                                    if (Class2.anInt9 == 0) {
                                        Client.anInterfaceComponent1647 = null;
                                        Client.anInterfaceComponent1653 = null;
                                    }

                                    if (!Client.menuOpen) {
                                        Client.menuActions[0] = "Cancel";
                                        Client.menuTargets[0] = "";
                                        Client.menuOpcodes[0] = 1006;
                                        Client.menuRowCount = 1;
                                    }
                                }

                                var34 = Class33.anInt261 >= var12 && Class33.anInt260 >= var13 && Class33.anInt261 < var14 && Class33.anInt260 < var15;

                                boolean var35 = false;
                                if ((Class33.anInt272 == 1 || !Class163.aBoolean1965 && Class33.anInt272 == 4) && var34) {
                                    var35 = true;
                                }

                                boolean var20 = false;
                                if ((Class33.anInt265 == 1 || !Class163.aBoolean1965 && Class33.anInt265 == 4) && Class33.anInt255 >= var12 && Class33.anInt259 >= var13 && Class33.anInt255 < var14 && Class33.anInt259 < var15) {
                                    var20 = true;
                                }

                                if (var20) {
                                    Class38.method283(var9, Class33.anInt255 - var10, Class33.anInt259 - var11);
                                }

                                if (var9.contentType == 1400) {
                                    Class9.aClass189_68.method1300(Class33.anInt261, Class33.anInt260, var34 & var35);
                                }

                                if (Client.anInterfaceComponent1647 != null && Client.anInterfaceComponent1647 != var9 && var34) {
                                    var23 = Class75.method448(var9);
                                    boolean var22 = (var23 >> 20 & 1) != 0;
                                    if (var22) {
                                        Client.anInterfaceComponent1642 = var9;
                                    }
                                }

                                if (Client.anInterfaceComponent1653 == var9) {
                                    Client.aBoolean1648 = true;
                                    Client.anInt1635 = var10;
                                    Client.anInt1646 = var11;
                                }

                                if (var9.aBoolean1872) {
                                    ScriptEvent var31;
                                    if (var34 && Client.anInt1671 != 0 && var9.scrollListeners != null) {
                                        var31 = new ScriptEvent();
                                        var31.aBoolean324 = true;
                                        var31.source = var9;
                                        var31.anInt327 = Client.anInt1671;
                                        var31.args = var9.scrollListeners;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (Client.anInterfaceComponent1647 != null || Class118.anInterfaceComponent1348 != null || Client.menuOpen) {
                                        var20 = false;
                                        var35 = false;
                                        var34 = false;
                                    }

                                    if (!var9.aBoolean1926 && var20) {
                                        var9.aBoolean1926 = true;
                                        if (var9.anObjectArray1893 != null) {
                                            var31 = new ScriptEvent();
                                            var31.aBoolean324 = true;
                                            var31.source = var9;
                                            var31.anInt232 = Class33.anInt255 - var10;
                                            var31.anInt327 = Class33.anInt259 - var11;
                                            var31.args = var9.anObjectArray1893;
                                            Client.aNodeDeque1661.method997(var31);
                                        }
                                    }

                                    if (var9.aBoolean1926 && var35 && var9.anObjectArray1876 != null) {
                                        var31 = new ScriptEvent();
                                        var31.aBoolean324 = true;
                                        var31.source = var9;
                                        var31.anInt232 = Class33.anInt261 - var10;
                                        var31.anInt327 = Class33.anInt260 - var11;
                                        var31.args = var9.anObjectArray1876;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (var9.aBoolean1926 && !var35) {
                                        var9.aBoolean1926 = false;
                                        if (var9.anObjectArray1909 != null) {
                                            var31 = new ScriptEvent();
                                            var31.aBoolean324 = true;
                                            var31.source = var9;
                                            var31.anInt232 = Class33.anInt261 - var10;
                                            var31.anInt327 = Class33.anInt260 - var11;
                                            var31.args = var9.anObjectArray1909;
                                            Client.aNodeDeque1669.method997(var31);
                                        }
                                    }

                                    if (var35 && var9.anObjectArray1918 != null) {
                                        var31 = new ScriptEvent();
                                        var31.aBoolean324 = true;
                                        var31.source = var9;
                                        var31.anInt232 = Class33.anInt261 - var10;
                                        var31.anInt327 = Class33.anInt260 - var11;
                                        var31.args = var9.anObjectArray1918;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (!var9.aBoolean1928 && var34) {
                                        var9.aBoolean1928 = true;
                                        if (var9.mouseEnterListeners != null) {
                                            var31 = new ScriptEvent();
                                            var31.aBoolean324 = true;
                                            var31.source = var9;
                                            var31.anInt232 = Class33.anInt261 - var10;
                                            var31.anInt327 = Class33.anInt260 - var11;
                                            var31.args = var9.mouseEnterListeners;
                                            Client.aNodeDeque1661.method997(var31);
                                        }
                                    }

                                    if (var9.aBoolean1928 && var34 && var9.hoverListeners != null) {
                                        var31 = new ScriptEvent();
                                        var31.aBoolean324 = true;
                                        var31.source = var9;
                                        var31.anInt232 = Class33.anInt261 - var10;
                                        var31.anInt327 = Class33.anInt260 - var11;
                                        var31.args = var9.hoverListeners;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (var9.aBoolean1928 && !var34) {
                                        var9.aBoolean1928 = false;
                                        if (var9.mouseExitListeners != null) {
                                            var31 = new ScriptEvent();
                                            var31.aBoolean324 = true;
                                            var31.source = var9;
                                            var31.anInt232 = Class33.anInt261 - var10;
                                            var31.anInt327 = Class33.anInt260 - var11;
                                            var31.args = var9.mouseExitListeners;
                                            Client.aNodeDeque1669.method997(var31);
                                        }
                                    }

                                    if (var9.renderListeners != null) {
                                        var31 = new ScriptEvent();
                                        var31.source = var9;
                                        var31.args = var9.renderListeners;
                                        Client.aNodeDeque1675.method997(var31);
                                    }

                                    ScriptEvent var33;
                                    if (var9.configListenerArgs != null && Client.anInt1654 > var9.anInt1930) {
                                        if (var9.configTriggers != null && Client.anInt1654 - var9.anInt1930 <= 32) {
                                            label860:
                                            for (var38 = var9.anInt1930; var38 < Client.anInt1654; ++var38) {
                                                var23 = Client.anIntArray1666[var38 & 31];

                                                for (var24 = 0; var24 < var9.configTriggers.length; ++var24) {
                                                    if (var9.configTriggers[var24] == var23) {
                                                        var33 = new ScriptEvent();
                                                        var33.source = var9;
                                                        var33.args = var9.configListenerArgs;
                                                        Client.aNodeDeque1661.method997(var33);
                                                        break label860;
                                                    }
                                                }
                                            }
                                        } else {
                                            var31 = new ScriptEvent();
                                            var31.source = var9;
                                            var31.args = var9.configListenerArgs;
                                            Client.aNodeDeque1661.method997(var31);
                                        }

                                        var9.anInt1930 = Client.anInt1654;
                                    }

                                    if (var9.tableListenerArgs != null && Client.anInt1663 > var9.anInt1946) {
                                        if (var9.tableTriggers != null && Client.anInt1663 - var9.anInt1946 <= 32) {
                                            label836:
                                            for (var38 = var9.anInt1946; var38 < Client.anInt1663; ++var38) {
                                                var23 = Client.anIntArray1670[var38 & 31];

                                                for (var24 = 0; var24 < var9.tableTriggers.length; ++var24) {
                                                    if (var9.tableTriggers[var24] == var23) {
                                                        var33 = new ScriptEvent();
                                                        var33.source = var9;
                                                        var33.args = var9.tableListenerArgs;
                                                        Client.aNodeDeque1661.method997(var33);
                                                        break label836;
                                                    }
                                                }
                                            }
                                        } else {
                                            var31 = new ScriptEvent();
                                            var31.source = var9;
                                            var31.args = var9.tableListenerArgs;
                                            Client.aNodeDeque1661.method997(var31);
                                        }

                                        var9.anInt1946 = Client.anInt1663;
                                    }

                                    if (var9.skillListenerArgs != null && Client.anInt1662 > var9.anInt1944) {
                                        if (var9.skillTriggers != null && Client.anInt1662 - var9.anInt1944 <= 32) {
                                            label812:
                                            for (var38 = var9.anInt1944; var38 < Client.anInt1662; ++var38) {
                                                var23 = Client.anIntArray1659[var38 & 31];

                                                for (var24 = 0; var24 < var9.skillTriggers.length; ++var24) {
                                                    if (var9.skillTriggers[var24] == var23) {
                                                        var33 = new ScriptEvent();
                                                        var33.source = var9;
                                                        var33.args = var9.skillListenerArgs;
                                                        Client.aNodeDeque1661.method997(var33);
                                                        break label812;
                                                    }
                                                }
                                            }
                                        } else {
                                            var31 = new ScriptEvent();
                                            var31.source = var9;
                                            var31.args = var9.skillListenerArgs;
                                            Client.aNodeDeque1661.method997(var31);
                                        }

                                        var9.anInt1944 = Client.anInt1662;
                                    }

                                    if (Client.anInt1668 > var9.anInt1927 && var9.anObjectArray1902 != null) {
                                        var31 = new ScriptEvent();
                                        var31.source = var9;
                                        var31.args = var9.anObjectArray1902;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (Client.anInt1660 > var9.anInt1927 && var9.anObjectArray1901 != null) {
                                        var31 = new ScriptEvent();
                                        var31.source = var9;
                                        var31.args = var9.anObjectArray1901;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (Client.anInt1657 > var9.anInt1927 && var9.anObjectArray1905 != null) {
                                        var31 = new ScriptEvent();
                                        var31.source = var9;
                                        var31.args = var9.anObjectArray1905;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (Client.anInt1667 > var9.anInt1927 && var9.anObjectArray1948 != null) {
                                        var31 = new ScriptEvent();
                                        var31.source = var9;
                                        var31.args = var9.anObjectArray1948;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (Client.anInt1672 > var9.anInt1927 && var9.anObjectArray1947 != null) {
                                        var31 = new ScriptEvent();
                                        var31.source = var9;
                                        var31.args = var9.anObjectArray1947;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    if (Client.anInt1658 > var9.anInt1927 && var9.anObjectArray1913 != null) {
                                        var31 = new ScriptEvent();
                                        var31.source = var9;
                                        var31.args = var9.anObjectArray1913;
                                        Client.aNodeDeque1661.method997(var31);
                                    }

                                    var9.anInt1927 = Client.anInt1644;
                                    if (var9.anObjectArray1916 != null) {
                                        for (var38 = 0; var38 < Client.anInt1681; ++var38) {
                                            ScriptEvent var32 = new ScriptEvent();
                                            var32.source = var9;
                                            var32.anInt220 = Client.anIntArray1692[var38];
                                            var32.anInt217 = Client.anIntArray1688[var38];
                                            var32.args = var9.anObjectArray1916;
                                            Client.aNodeDeque1661.method997(var32);
                                        }
                                    }
                                }
                            }

                            if (!var9.aBoolean1173 && Client.anInterfaceComponent1647 == null && Class118.anInterfaceComponent1348 == null && !Client.menuOpen) {
                                if ((var9.anInt1931 >= 0 || var9.anInt756 != 0) && Class33.anInt261 >= var12 && Class33.anInt260 >= var13 && Class33.anInt261 < var14 && Class33.anInt260 < var15) {
                                    if (var9.anInt1931 >= 0) {
                                        PickableNode.anInterfaceComponent673 = var0[var9.anInt1931];
                                    } else {
                                        PickableNode.anInterfaceComponent673 = var9;
                                    }
                                }

                                if (var9.type == 8 && Class33.anInt261 >= var12 && Class33.anInt260 >= var13 && Class33.anInt261 < var14 && Class33.anInt260 < var15) {
                                    Class65.anInterfaceComponent663 = var9;
                                }

                                if (var9.viewportHeight > var9.height) {
                                    var19 = var10 + var9.width;
                                    var37 = var9.height;
                                    var38 = var9.viewportHeight;
                                    var23 = Class33.anInt261;
                                    var24 = Class33.anInt260;
                                    if (Client.aBoolean1550) {
                                        Client.anInt1547 = 32;
                                    } else {
                                        Client.anInt1547 = 0;
                                    }

                                    Client.aBoolean1550 = false;
                                    if (Class33.anInt272 == 1 || !Class163.aBoolean1965 && Class33.anInt272 == 4) {
                                        if (var23 >= var19 && var23 < var19 + 16 && var24 >= var11 && var24 < var11 + 16) {
                                            var9.insetY -= 4;
                                            ItemTable.method284(var9);
                                        } else if (var23 >= var19 && var23 < var19 + 16 && var24 >= var37 + var11 - 16 && var24 < var37 + var11) {
                                            var9.insetY += 4;
                                            ItemTable.method284(var9);
                                        } else if (var23 >= var19 - Client.anInt1547 && var23 < Client.anInt1547 + var19 + 16 && var24 >= var11 + 16 && var24 < var37 + var11 - 16) {
                                            var25 = var37 * (var37 - 32) / var38;
                                            if (var25 < 8) {
                                                var25 = 8;
                                            }

                                            var26 = var24 - var11 - 16 - var25 / 2;
                                            var27 = var37 - 32 - var25;
                                            var9.insetY = (var38 - var37) * var26 / var27;
                                            ItemTable.method284(var9);
                                            Client.aBoolean1550 = true;
                                        }
                                    }

                                    if (Client.anInt1671 != 0) {
                                        var25 = var9.width;
                                        if (var23 >= var19 - var25 && var24 >= var11 && var23 < var19 + 16 && var24 <= var37 + var11) {
                                            var9.insetY += Client.anInt1671 * 45;
                                            ItemTable.method284(var9);
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
