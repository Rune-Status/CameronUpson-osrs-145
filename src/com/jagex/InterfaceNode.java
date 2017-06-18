package com.jagex;

public class InterfaceNode extends Node {
    public static String aString319;
    static int[] anIntArray315;
    static byte[][] aByteArrayArray318;
    static GameSocket aGameSocket317;
    int state;
    boolean aBoolean316 = false;
    int id;

    static Class189 method268() {
        return Class9.aClass189_68;
    }

    static void method265(boolean var0) {
        while (true) {
            if (Client.aPacket1521.method786(Client.anInt1514) >= 27) {
                int var1 = Client.aPacket1521.method788(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (Client.npcs[var1] == null) {
                        Client.npcs[var1] = new Npc();
                        var2 = true;
                    }

                    Npc var3 = Client.npcs[var1];
                    Client.npcIndices[++Client.anInt1501 - 1] = var1;
                    var3.anInt769 = Client.engineCycle;
                    int var4;
                    if (var0) {
                        var4 = Client.aPacket1521.method788(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = Client.aPacket1521.method788(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }

                    var3.definition = NpcDefinition.get(Client.aPacket1521.method788(14));
                    int var5 = Client.aPacket1521.method788(1);
                    if (var5 == 1) {
                        Client.anIntArray1507[++Client.anInt1508 - 1] = var1;
                    }

                    int var6 = Client.anIntArray1601[Client.aPacket1521.method788(3)];
                    if (var2) {
                        var3.orientation = var3.anInt748 = var6;
                    }

                    int var7 = Client.aPacket1521.method788(1);
                    int var8;
                    if (var0) {
                        var8 = Client.aPacket1521.method788(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = Client.aPacket1521.method788(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }

                    var3.anInt753 = var3.definition.anInt221;
                    var3.anInt795 = var3.definition.anInt748;
                    if (var3.anInt795 == 0) {
                        var3.anInt748 = 0;
                    }

                    var3.anInt760 = var3.definition.anInt225;
                    var3.anInt757 = var3.definition.anInt212;
                    var3.anInt746 = var3.definition.anInt919;
                    var3.anInt744 = var3.definition.anInt235;
                    var3.anInt754 = var3.definition.anInt214;
                    var3.anInt745 = var3.definition.anInt226;
                    var3.anInt755 = var3.definition.anInt228;
                    var3.method385(Client.player.anIntArray800[0] + var4, var8 + Client.player.anIntArray804[0], var7 == 1);
                    continue;
                }
            }

            Client.aPacket1521.method789();
            return;
        }
    }

    static int method266(int var0, RuneScript var1, boolean var2) {
        int var3;
        int var4;
        int var6;
        if (var0 == 3400) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Node_Sub21_Sub13 var5 = Class111.method770(var3);
            if (var5.aChar2066 != 's') {
            }

            for (var6 = 0; var6 < var5.anInt221; ++var6) {
                if (var4 == var5.anIntArray932[var6]) {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var5.aStringArray2065[var6];
                    var5 = null;
                    break;
                }
            }

            if (var5 != null) {
                Class63.aStringArray640[++Class77.anInt828 - 1] = var5.aString207;
            }

            return 1;
        }
        if (var0 != 3408) {
            return 2;
        }
        Class63.anInt644 -= 4;
        var3 = Class63.anIntArray645[Class63.anInt644];
        var4 = Class63.anIntArray645[Class63.anInt644 + 1];
        int var7 = Class63.anIntArray645[Class63.anInt644 + 2];
        var6 = Class63.anIntArray645[Class63.anInt644 + 3];
        Node_Sub21_Sub13 var8 = Class111.method770(var7);
        if (var8.aChar2067 == var3 && var8.aChar2066 == var4) {
            for (int var9 = 0; var9 < var8.anInt221; ++var9) {
                if (var6 == var8.anIntArray932[var9]) {
                    if (var4 == 115) {
                        Class63.aStringArray640[++Class77.anInt828 - 1] = var8.aStringArray2065[var9];
                    } else {
                        Class63.anIntArray645[++Class63.anInt644 - 1] = var8.anIntArray1319[var9];
                    }

                    var8 = null;
                    break;
                }
            }

            if (var8 != null) {
                if (var4 == 115) {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = var8.aString207;
                } else {
                    Class63.anIntArray645[++Class63.anInt644 - 1] = var8.anInt328;
                }
            }

            return 1;
        }
        if (var4 == 115) {
            Class63.aStringArray640[++Class77.anInt828 - 1] = "null";
        } else {
            Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
        }

        return 1;
    }

    public static Node_Sub21_Sub26_Sub2[] method267(ReferenceTable var0, String var1, String var2) {
        int var3 = var0.method1084(var1);
        int var4 = var0.method1104(var3, var2);
        return Class18.method138(var0, var3, var4);
    }

    static void method216(InterfaceNode var0, boolean var1) {
        int var2 = var0.id;
        int var3 = (int) var0.key;
        var0.unlink();
        if (var1 && var2 != -1 && Class70.aBooleanArray716[var2]) {
            Class51.aReferenceTable382.method1089(var2);
            if (InterfaceComponent.interfaces[var2] != null) {
                boolean var5 = true;

                for (int var6 = 0; var6 < InterfaceComponent.interfaces[var2].length; ++var6) {
                    if (InterfaceComponent.interfaces[var2][var6] != null) {
                        if (InterfaceComponent.interfaces[var2][var6].type != 2) {
                            InterfaceComponent.interfaces[var2][var6] = null;
                        } else {
                            var5 = false;
                        }
                    }
                }

                if (var5) {
                    InterfaceComponent.interfaces[var2] = null;
                }

                Class70.aBooleanArray716[var2] = false;
            }
        }

        Class1.method11(var2);
        InterfaceComponent var4 = InterfaceComponent.method1016(var3);
        if (var4 != null) {
            ItemTable.method284(var4);
        }

        DynamicObject.method295();
        if (Client.anInt1632 != -1) {
            Class76.method452(Client.anInt1632, 1);
        }

    }

    static InterfaceNode method214(int var0, int var1, int var2) {
        InterfaceNode var3 = new InterfaceNode();
        var3.id = var1;
        var3.state = var2;
        Client.interfaceNodes.put(var3, (long) var0);
        Class21.method144(var1);
        InterfaceComponent var4 = InterfaceComponent.method1016(var0);
        ItemTable.method284(var4);
        if (Client.anInterfaceComponent1627 != null) {
            ItemTable.method284(Client.anInterfaceComponent1627);
            Client.anInterfaceComponent1627 = null;
        }

        DynamicObject.method295();
        Class44.method303(InterfaceComponent.interfaces[var0 >> 16], var4, false);
        Class35.method261(var1);
        if (Client.anInt1632 != -1) {
            Class76.method452(Client.anInt1632, 1);
        }

        return var3;
    }
}
