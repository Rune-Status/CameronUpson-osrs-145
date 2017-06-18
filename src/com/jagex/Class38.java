package com.jagex;

public class Class38 {
    int anInt338 = -1;
    String[] aStringArray336;
    int[] anIntArray337;
    RuneScript aRuneScript335;

    static void method283(InterfaceComponent var0, int var1, int var2) {
        if (Client.anInterfaceComponent1647 == null && !Client.menuOpen) {
            if (var0 != null && Class22.method148(var0) != null) {
                Client.anInterfaceComponent1647 = var0;
                Client.anInterfaceComponent1653 = Class22.method148(var0);
                Client.anInt1651 = var1;
                Client.anInt1645 = var2;
                Class2.anInt9 = 0;
                Client.aBoolean1634 = false;
                int var3 = Class158.method1013();
                if (var3 != -1) {
                    Client.method393(var3);
                }

            }
        }
    }
}
