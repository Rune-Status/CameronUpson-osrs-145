package com.jagex;

import java.io.IOException;

public class Class74 {
    int anInt742;
    SceneOffset aSceneOffset_743;

    Class74(int var1, SceneOffset var2) {
        this.anInt742 = var1;
        this.aSceneOffset_743 = var2;
    }

    public static byte[] method437() {
        byte[] var0 = new byte[24];

        try {
            Class97.aClass93_1076.method605(0L);
            Class97.aClass93_1076.method599(var0);

            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
            }

            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; ++var3) {
                var0[var3] = -1;
            }
        }

        return var0;
    }

    static void method438(int var0, int var1, int var2, int var3) {
        InterfaceComponent var4 = Class127.method877(var0, var1);
        if (var4 != null && var4.anObjectArray1898 != null) {
            ScriptEvent var5 = new ScriptEvent();
            var5.source = var4;
            var5.args = var4.anObjectArray1898;
            Class25.method174(var5);
        }

        Client.anInt1619 = var3;
        Client.spellSelected = true;
        Class22.anInt149 = var0;
        Client.anInt1629 = var1;
        Class162.anInt1957 = var2;
        ItemTable.method284(var4);
    }

    public static Node_Sub21_Sub20 method436(int var0) {
        Node_Sub21_Sub20 var1 = (Node_Sub21_Sub20) Node_Sub21_Sub20.aReferenceCache2008.method973((long) var0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Node_Sub21_Sub20.aReferenceTable2012.method1085(16, var0);
        var1 = new Node_Sub21_Sub20();
        if (var2 != null) {
            var1.method1052(new Buffer(var2));
        }

        Node_Sub21_Sub20.aReferenceCache2008.method975(var1, (long) var0);
        return var1;
    }
}
