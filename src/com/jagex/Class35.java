package com.jagex;

public class Class35 {
    static Font aFont313;
    static InterfaceComponent[] anInterfaceComponentArray314;

    static void method262(Node_Sub10 var0) {
        var0.aBoolean845 = false;
        if (var0.aNode_Sub11_843 != null) {
            var0.aNode_Sub11_843.anInt328 = 0;
        }

        for (Node_Sub10 var1 = var0.method434(); var1 != null; var1 = var0.method426()) {
            method262(var1);
        }

    }

    static void method261(int var0) {
        if (var0 != -1) {
            if (Class33.method220(var0)) {
                InterfaceComponent[] var1 = InterfaceComponent.interfaces[var0];

                for (int var2 = 0; var2 < var1.length; ++var2) {
                    InterfaceComponent var3 = var1[var2];
                    if (var3.anObjectArray1877 != null) {
                        ScriptEvent var4 = new ScriptEvent();
                        var4.source = var3;
                        var4.args = var3.anObjectArray1877;
                        Class9.method50(var4, 2000000);
                    }
                }

            }
        }
    }
}
