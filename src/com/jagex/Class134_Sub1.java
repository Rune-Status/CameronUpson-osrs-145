package com.jagex;

public class Class134_Sub1 extends Class134 {
    String aString253;
    short aShort252;
    int anInt251 = (int) (Class124.method873() / 1000L);

    Class134_Sub1(String var1, int var2) {
        this.aString253 = var1;
        this.aShort252 = (short) var2;
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
        InterfaceComponent var4 = Class161.method1016(var3);
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
        InterfaceComponent var4 = Class161.method1016(var0);
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

    static void method215(InterfaceComponent[] var0, int var1) {
        for (int var2 = 0; var2 < var0.length; ++var2) {
            InterfaceComponent var3 = var0[var2];
            if (var3 != null) {
                if (var3.type == 0) {
                    if (var3.components != null) {
                        method215(var3.components, var1);
                    }

                    InterfaceNode var4 = Client.interfaceNodes.lookup((long) var3.uid);
                    if (var4 != null) {
                        Class76.method452(var4.id, var1);
                    }
                }

                ScriptEvent var5;
                if (var1 == 0 && var3.anObjectArray1912 != null) {
                    var5 = new ScriptEvent();
                    var5.source = var3;
                    var5.args = var3.anObjectArray1912;
                    Class25.method174(var5);
                }

                if (var1 == 1 && var3.anObjectArray1922 != null) {
                    if (var3.componentIndex >= 0) {
                        InterfaceComponent var6 = Class161.method1016(var3.uid);
                        if (var6 == null || var6.components == null || var3.componentIndex >= var6.components.length || var6.components[var3.componentIndex] != var3) {
                            continue;
                        }
                    }

                    var5 = new ScriptEvent();
                    var5.source = var3;
                    var5.args = var3.anObjectArray1922;
                    Class25.method174(var5);
                }
            }
        }

    }
}
