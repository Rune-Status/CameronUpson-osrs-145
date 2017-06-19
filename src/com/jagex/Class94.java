package com.jagex;

import java.util.Date;

public class Class94 {
    static int[] anIntArray1043;
    int anInt1041;
    int anInt1042;
    int[][] anIntArrayArray1044;

    public Class94(int var1, int var2) {
        if (var1 != var2) {
            int var3 = Class9.method54(var1, var2);
            var1 /= var3;
            var2 /= var3;
            this.anInt1041 = var1;
            this.anInt1042 = var2;
            this.anIntArrayArray1044 = new int[var1][14];

            for (int var4 = 0; var4 < var1; ++var4) {
                int[] var5 = this.anIntArrayArray1044[var4];
                double var6 = (double) var4 / (double) var1 + 6.0D;
                int var8 = (int) Math.floor(var6 - 7.0D + 1.0D);
                if (var8 < 0) {
                    var8 = 0;
                }

                int var9 = (int) Math.ceil(7.0D + var6);
                if (var9 > 14) {
                    var9 = 14;
                }

                for (double var10 = (double) var2 / (double) var1; var8 < var9; ++var8) {
                    double var12 = 3.141592653589793D * ((double) var8 - var6);
                    double var14 = var10;
                    if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var12) / var12);
                    }

                    var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double) var8 - var6));
                    var5[var8] = (int) Math.floor(0.5D + var14 * 65536.0D);
                }
            }

        }
    }

    public static void method619() {
        if (Class4.aClass4_26 != null) {
            Class4 var0 = Class4.aClass4_26;
            synchronized (Class4.aClass4_26) {
                Class4.aClass4_26 = null;
            }
        }

    }

    public static int method617(int var0, int var1) {
        int var2 = var0 >>> 31;
        return (var2 + var0) / var1 - var2;
    }

    public static String method615(long var0) {
        Class141.aCalendar1783.setTime(new Date(var0));
        int var2 = Class141.aCalendar1783.get(7);
        int var3 = Class141.aCalendar1783.get(5);
        int var4 = Class141.aCalendar1783.get(2);
        int var5 = Class141.aCalendar1783.get(1);
        int var6 = Class141.aCalendar1783.get(11);
        int var7 = Class141.aCalendar1783.get(12);
        int var8 = Class141.aCalendar1783.get(13);
        return Class141.days[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Class141.months[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }

    static void method620(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
        if (var2 >= 2000) {
            var2 -= 2000;
        }

        NpcEntity var8;
        if (var2 == 7) {
            var8 = Client.npcEntities[var3];
            if (var8 != null) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(202);
                Client.packet.method845(GrandExchangeOffer.anInt731);
                Client.packet.method843(var3);
                Client.packet.method755(Class55.anInt421);
                Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method850(Class2.anInt15);
            }
        }

        if (var2 == 1001) {
            Client.anInt1557 = var6;
            Client.anInt1577 = var7;
            Client.cursorState = 2;
            Client.anInt1585 = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            Client.packet.writeHeader(197);
            Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
            Client.packet.method755(var1 + Class49.anInt377);
            Client.packet.method845(var0 + Class62.anInt636);
            Client.packet.method845(var3 >> 14 & 32767);
        }

        if (var2 == 1) {
            Client.anInt1557 = var6;
            Client.anInt1577 = var7;
            Client.cursorState = 2;
            Client.anInt1585 = 0;
            Client.destinationX = var0;
            Client.destinationY = var1;
            Client.packet.writeHeader(59);
            Client.packet.method755(var3 >> 14 & 32767);
            Client.packet.method755(Class55.anInt421);
            Client.packet.method853(Class49.anInt377 + var1);
            Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
            Client.packet.method850(Class2.anInt15);
            Client.packet.method843(GrandExchangeOffer.anInt731);
            Client.packet.method853(Class62.anInt636 + var0);
        }

        if (var2 == 32) {
            Client.packet.writeHeader(223);
            Client.packet.method842(Class22.anInt149);
            Client.packet.method853(var0);
            Client.packet.method845(var3);
            Client.packet.method853(Client.anInt1629);
            Client.packet.method850(var1);
            Client.anInt1587 = 0;
            Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
            Client.anInt1581 = var0;
        }

        int var9;
        InterfaceComponent var17;
        if (var2 == 29) {
            Client.packet.writeHeader(26);
            Client.packet.method869(var1);
            var17 = InterfaceComponent.method1016(var1);
            if (var17.functionOpcodes != null && var17.functionOpcodes[0][0] == 5) {
                var9 = var17.functionOpcodes[0][1];
                if (Varps.values[var9] != var17.anIntArray1940[0]) {
                    Varps.values[var9] = var17.anIntArray1940[0];
                    Class14.method129(var9);
                }
            }
        }

        PlayerEntity var18;
        if (var2 == 15) {
            var18 = Client.playerEntities[var3];
            if (var18 != null) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(113);
                Client.packet.method845(Client.anInt1629);
                Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method845(var3);
                Client.packet.method869(Class22.anInt149);
            }
        }

        if (var2 == 28) {
            Client.packet.writeHeader(26);
            Client.packet.method869(var1);
            var17 = InterfaceComponent.method1016(var1);
            if (var17.functionOpcodes != null && var17.functionOpcodes[0][0] == 5) {
                var9 = var17.functionOpcodes[0][1];
                Varps.values[var9] = 1 - Varps.values[var9];
                Class14.method129(var9);
            }
        }

        if (var2 == 25) {
            var17 = Class127.method877(var1, var0);
            if (var17 != null) {
                ClientPreferences.method290();
                Class74.method438(var1, var0, Class15.method130(Class75.method448(var17)), var17.itemId);
                Client.itemSelectionState = 0;
                String var20;
                if (Class15.method130(Class75.method448(var17)) == 0) {
                    var20 = null;
                } else if (var17.selectedAction != null && var17.selectedAction.trim().length() != 0) {
                    var20 = var17.selectedAction;
                } else {
                    var20 = null;
                }

                Client.aString1623 = var20;
                if (Client.aString1623 == null) {
                    Client.aString1623 = "Null";
                }

                if (var17.aBoolean1173) {
                    Client.aString1616 = var17.aString1895 + Class75.method449(16777215);
                } else {
                    Client.aString1616 = Class75.method449(65280) + var17.aString1925 + Class75.method449(16777215);
                }
            }

        } else {
            if (var2 == 12) {
                var8 = Client.npcEntities[var3];
                if (var8 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(250);
                    Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                    Client.packet.method843(var3);
                }
            }

            if (var2 == 44) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(187);
                    Client.packet.method853(var3);
                    Client.packet.method836(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 46) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(129);
                    Client.packet.method843(var3);
                    Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 20) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(7);
                Client.packet.method843(var3);
                Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method845(Class62.anInt636 + var0);
                Client.packet.method853(Class49.anInt377 + var1);
            }

            if (var2 == 50) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(165);
                    Client.packet.method843(var3);
                    Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 8) {
                var8 = Client.npcEntities[var3];
                if (var8 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(57);
                    Client.packet.method842(Class22.anInt149);
                    Client.packet.method836(Class4.aBooleanArray23[82] ? 1 : 0);
                    Client.packet.method843(var3);
                    Client.packet.method845(Client.anInt1629);
                }
            }

            if (var2 == 39) {
                Client.packet.writeHeader(251);
                Client.packet.method843(var3);
                Client.packet.method842(var1);
                Client.packet.method843(var0);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 17) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(0);
                Client.packet.method755(var3);
                Client.packet.method850(Class22.anInt149);
                Client.packet.method853(var1 + Class49.anInt377);
                Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method843(Client.anInt1629);
                Client.packet.method845(Class62.anInt636 + var0);
            }

            if (var2 == 5) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(76);
                Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method853(var3 >> 14 & 32767);
                Client.packet.method755(Class49.anInt377 + var1);
                Client.packet.method755(Class62.anInt636 + var0);
            }

            if (var2 == 40) {
                Client.packet.writeHeader(100);
                Client.packet.method845(var0);
                Client.packet.method845(var3);
                Client.packet.method842(var1);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 11) {
                var8 = Client.npcEntities[var3];
                if (var8 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(118);
                    Client.packet.method836(Class4.aBooleanArray23[82] ? 1 : 0);
                    Client.packet.method845(var3);
                }
            }

            if (var2 == 36) {
                Client.packet.writeHeader(110);
                Client.packet.method850(var1);
                Client.packet.method843(var3);
                Client.packet.method843(var0);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 9) {
                var8 = Client.npcEntities[var3];
                if (var8 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(85);
                    Client.packet.method843(var3);
                    Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 37) {
                Client.packet.writeHeader(229);
                Client.packet.method842(var1);
                Client.packet.method755(var3);
                Client.packet.method845(var0);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 22) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(62);
                Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method845(var3);
                Client.packet.method845(var0 + Class62.anInt636);
                Client.packet.method845(Class49.anInt377 + var1);
            }

            if (var2 == 51) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(218);
                    Client.packet.method853(var3);
                    Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 10) {
                var8 = Client.npcEntities[var3];
                if (var8 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(64);
                    Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
                    Client.packet.method755(var3);
                }
            }

            if (var2 == 24) {
                var17 = InterfaceComponent.method1016(var1);
                boolean var19 = true;
                if (var17.contentType > 0) {
                    var19 = Class26.method178(var17);
                }

                if (var19) {
                    Client.packet.writeHeader(26);
                    Client.packet.method869(var1);
                }
            }

            if (var2 == 1004) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.packet.writeHeader(104);
                Client.packet.method755(var3);
            }

            if (var2 == 31) {
                Client.packet.writeHeader(207);
                Client.packet.method853(var0);
                Client.packet.method855(Class2.anInt15);
                Client.packet.method869(var1);
                Client.packet.method853(Class55.anInt421);
                Client.packet.method845(GrandExchangeOffer.anInt731);
                Client.packet.method755(var3);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
                Class9.worldMap.method1281(var2, var3, new SceneOffset(var0), new SceneOffset(var1));
            }

            if (var2 == 6) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(79);
                Client.packet.method853(Class62.anInt636 + var0);
                Client.packet.method755(var1 + Class49.anInt377);
                Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method843(var3 >> 14 & 32767);
            }

            if (var2 == 26) {
                Class174.method1186();
            }

            if (var2 == 16) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(39);
                Client.packet.method845(Class49.anInt377 + var1);
                Client.packet.method855(Class2.anInt15);
                Client.packet.method845(GrandExchangeOffer.anInt731);
                Client.packet.method845(Class55.anInt421);
                Client.packet.method845(var3);
                Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method853(var0 + Class62.anInt636);
            }

            if (var2 == 14) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(199);
                    Client.packet.method842(Class2.anInt15);
                    Client.packet.method843(var3);
                    Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                    Client.packet.method853(Class55.anInt421);
                    Client.packet.method843(GrandExchangeOffer.anInt731);
                }
            }

            if (var2 == 41) {
                Client.packet.writeHeader(68);
                Client.packet.method755(var3);
                Client.packet.method755(var0);
                Client.packet.method869(var1);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 1005) {
                var17 = InterfaceComponent.method1016(var1);
                if (var17 != null && var17.itemStackSizes[var0] >= 100000) {
                    Class78.addChatMessage(27, "", var17.itemStackSizes[var0] + " x " + Class149.method1001(var3).name);
                } else {
                    Client.packet.writeHeader(104);
                    Client.packet.method755(var3);
                }

                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 2) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(77);
                Client.packet.method755(var3 >> 14 & 32767);
                Client.packet.method869(Class22.anInt149);
                Client.packet.method853(Client.anInt1629);
                Client.packet.method845(var0 + Class62.anInt636);
                Client.packet.method853(Class49.anInt377 + var1);
                Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
            }

            if (var2 == 58) {
                var17 = Class127.method877(var1, var0);
                if (var17 != null) {
                    Client.packet.writeHeader(63);
                    Client.packet.method845(var0);
                    Client.packet.method843(Client.anInt1629);
                    Client.packet.method869(var1);
                    Client.packet.method850(Class22.anInt149);
                    Client.packet.method843(var17.itemId);
                    Client.packet.method843(Client.anInt1619);
                }
            }

            if (var2 == 35) {
                Client.packet.writeHeader(184);
                Client.packet.method843(var3);
                Client.packet.method869(var1);
                Client.packet.method843(var0);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 49) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(196);
                    Client.packet.method755(var3);
                    Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 33) {
                Client.packet.writeHeader(154);
                Client.packet.method853(var0);
                Client.packet.method845(var3);
                Client.packet.method842(var1);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 42) {
                Client.packet.writeHeader(139);
                Client.packet.method853(var0);
                Client.packet.method869(var1);
                Client.packet.method843(var3);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 13) {
                var8 = Client.npcEntities[var3];
                if (var8 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(46);
                    Client.packet.method845(var3);
                    Client.packet.method836(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 34) {
                Client.packet.writeHeader(133);
                Client.packet.method755(var3);
                Client.packet.method855(var1);
                Client.packet.method845(var0);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 47) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(90);
                    Client.packet.method836(Class4.aBooleanArray23[82] ? 1 : 0);
                    Client.packet.method843(var3);
                }
            }

            if (var2 == 19) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(120);
                Client.packet.method853(var3);
                Client.packet.method853(var1 + Class49.anInt377);
                Client.packet.method853(var0 + Class62.anInt636);
                Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
            }

            if (var2 == 1002) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.packet.writeHeader(177);
                Client.packet.method755(var3 >> 14 & 32767);
            }

            if (var2 == 21) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(56);
                Client.packet.method853(Class49.anInt377 + var1);
                Client.packet.method755(Class62.anInt636 + var0);
                Client.packet.method853(var3);
                Client.packet.method836(Class4.aBooleanArray23[82] ? 1 : 0);
            }

            if (var2 == 30 && Client.anInterfaceComponent1627 == null) {
                Class45.method306(var1, var0);
                Client.anInterfaceComponent1627 = Class127.method877(var1, var0);
                ItemTable.method284(Client.anInterfaceComponent1627);
            }

            if (var2 == 43) {
                Client.packet.writeHeader(227);
                Client.packet.method755(var3);
                Client.packet.method869(var1);
                Client.packet.method845(var0);
                Client.anInt1587 = 0;
                Class33.anInterfaceComponent264 = InterfaceComponent.method1016(var1);
                Client.anInt1581 = var0;
            }

            if (var2 == 4) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(198);
                Client.packet.method755(var3 >> 14 & 32767);
                Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method845(Class62.anInt636 + var0);
                Client.packet.method843(Class49.anInt377 + var1);
            }

            if (var2 == 3) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(47);
                Client.packet.method853(var3 >> 14 & 32767);
                Client.packet.method755(var0 + Class62.anInt636);
                Client.packet.method845(Class49.anInt377 + var1);
                Client.packet.method839(Class4.aBooleanArray23[82] ? 1 : 0);
            }

            if (var2 == 48) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(43);
                    Client.packet.method845(var3);
                    Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 18) {
                Client.anInt1557 = var6;
                Client.anInt1577 = var7;
                Client.cursorState = 2;
                Client.anInt1585 = 0;
                Client.destinationX = var0;
                Client.destinationY = var1;
                Client.packet.writeHeader(167);
                Client.packet.method755(Class49.anInt377 + var1);
                Client.packet.method451(Class4.aBooleanArray23[82] ? 1 : 0);
                Client.packet.method843(var3);
                Client.packet.method843(var0 + Class62.anInt636);
            }

            if (var2 == 45) {
                var18 = Client.playerEntities[var3];
                if (var18 != null) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    Client.destinationX = var0;
                    Client.destinationY = var1;
                    Client.packet.writeHeader(41);
                    Client.packet.method845(var3);
                    Client.packet.method823(Class4.aBooleanArray23[82] ? 1 : 0);
                }
            }

            if (var2 == 38) {
                ClientPreferences.method290();
                var17 = InterfaceComponent.method1016(var1);
                Client.itemSelectionState = 1;
                Class55.anInt421 = var0;
                Class2.anInt15 = var1;
                GrandExchangeOffer.anInt731 = var3;
                ItemTable.method284(var17);
                Client.latestSelectedItemName = Class75.method449(16748608) + Class149.method1001(var3).name + Class75.method449(16777215);
                if (Client.latestSelectedItemName == null) {
                    Client.latestSelectedItemName = "null";
                }

            } else {
                if (var2 == 23) {
                    if (Client.menuOpen) {
                        Class60.aSceneGraph631.method673();
                    } else {
                        Class60.aSceneGraph631.method676(PlayerEntity.floorLevel, var0, var1, true);
                    }
                }

                if (var2 == 1003) {
                    Client.anInt1557 = var6;
                    Client.anInt1577 = var7;
                    Client.cursorState = 2;
                    Client.anInt1585 = 0;
                    var8 = Client.npcEntities[var3];
                    if (var8 != null) {
                        NpcDefinition var10 = var8.definition;
                        if (var10.transformIds != null) {
                            var10 = var10.transform();
                        }

                        if (var10 != null) {
                            Client.packet.writeHeader(109);
                            Client.packet.method845(var10.id);
                        }
                    }
                }

                if (var2 == 57 || var2 == 1007) {
                    var17 = Class127.method877(var1, var0);
                    if (var17 != null) {
                        var9 = var17.itemId;
                        InterfaceComponent var11 = Class127.method877(var1, var0);
                        if (var11 != null) {
                            if (var11.anObjectArray1907 != null) {
                                ScriptEvent var12 = new ScriptEvent();
                                var12.source = var11;
                                var12.anInt328 = var3;
                                var12.aString320 = var5;
                                var12.args = var11.anObjectArray1907;
                                Class25.method174(var12);
                            }

                            boolean var13 = true;
                            if (var11.contentType > 0) {
                                var13 = Class26.method178(var11);
                            }

                            if (var13) {
                                int var14 = Class75.method448(var11);
                                int var15 = var3 - 1;
                                boolean var16 = (var14 >> var15 + 1 & 1) != 0;
                                if (var16) {
                                    if (var3 == 1) {
                                        Client.packet.writeHeader(221);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 2) {
                                        Client.packet.writeHeader(52);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 3) {
                                        Client.packet.writeHeader(206);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 4) {
                                        Client.packet.writeHeader(61);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 5) {
                                        Client.packet.writeHeader(103);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 6) {
                                        Client.packet.writeHeader(111);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 7) {
                                        Client.packet.writeHeader(5);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 8) {
                                        Client.packet.writeHeader(31);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 9) {
                                        Client.packet.writeHeader(135);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }

                                    if (var3 == 10) {
                                        Client.packet.writeHeader(28);
                                        Client.packet.method869(var1);
                                        Client.packet.method755(var0);
                                        Client.packet.method755(var9);
                                    }
                                }
                            }
                        }
                    }
                }

                if (Client.itemSelectionState != 0) {
                    Client.itemSelectionState = 0;
                    ItemTable.method284(InterfaceComponent.method1016(Class2.anInt15));
                }

                if (Client.spellSelected) {
                    ClientPreferences.method290();
                }

                if (Class33.anInterfaceComponent264 != null && Client.anInt1587 == 0) {
                    ItemTable.method284(Class33.anInterfaceComponent264);
                }

            }
        }
    }

    int method618(int var1) {
        if (this.anIntArrayArray1044 != null) {
            var1 = (int) ((long) var1 * (long) this.anInt1042 / (long) this.anInt1041);
        }

        return var1;
    }

    byte[] method614(byte[] var1) {
        if (this.anIntArrayArray1044 != null) {
            int var2 = (int) ((long) this.anInt1042 * (long) var1.length / (long) this.anInt1041) + 14;
            int[] var3 = new int[var2];
            int var4 = 0;
            int var5 = 0;

            int var6;
            for (var6 = 0; var6 < var1.length; ++var6) {
                byte var7 = var1[var6];
                int[] var8 = this.anIntArrayArray1044[var5];

                int var9;
                for (var9 = 0; var9 < 14; ++var9) {
                    var3[var9 + var4] += var7 * var8[var9];
                }

                var5 += this.anInt1042;
                var9 = var5 / this.anInt1041;
                var4 += var9;
                var5 -= this.anInt1041 * var9;
            }

            var1 = new byte[var2];

            for (var6 = 0; var6 < var2; ++var6) {
                int var10 = var3[var6] + '耀' >> 16;
                if (var10 < -128) {
                    var1[var6] = -128;
                } else if (var10 > 127) {
                    var1[var6] = 127;
                } else {
                    var1[var6] = (byte) var10;
                }
            }
        }

        return var1;
    }

    int method616(int var1) {
        if (this.anIntArrayArray1044 != null) {
            var1 = (int) ((long) var1 * (long) this.anInt1042 / (long) this.anInt1041) + 6;
        }

        return var1;
    }
}
