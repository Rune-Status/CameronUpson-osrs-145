package com.jagex;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ClientPreferences {
    static int anInt345 = 4;
    static int anInt346;
    static String[] aStringArray351;

    boolean roofsHidden;
    boolean loginScreenAudioDisabled;
    LinkedHashMap properties = new LinkedHashMap();
    int resizable = 1;

    ClientPreferences() {
        this.method289(true);
    }

    ClientPreferences(Buffer var1) {
        if (var1 != null && var1.payload != null) {
            int var2 = var1.readUnsignedByte();
            if (var2 >= 0 && var2 <= anInt345) {
                if (var1.readUnsignedByte() == 1) {
                    this.roofsHidden = true;
                }

                if (var2 > 1) {
                    this.loginScreenAudioDisabled = var1.readUnsignedByte() == 1;
                }

                if (var2 > 3) {
                    this.resizable = var1.readUnsignedByte();
                }

                if (var2 > 2) {
                    int var3 = var1.readUnsignedByte();

                    for (int var4 = 0; var4 < var3; ++var4) {
                        int var5 = var1.method835();
                        int var6 = var1.method835();
                        this.properties.put(var5, var6);
                    }
                }
            } else {
                this.method289(true);
            }
        } else {
            this.method289(true);
        }

    }

    static void method290() {
        if (Client.spellSelected) {
            InterfaceComponent var0 = Class127.method877(Class22.anInt149, Client.anInt1629);
            if (var0 != null && var0.anObjectArray1904 != null) {
                ScriptEvent var1 = new ScriptEvent();
                var1.source = var0;
                var1.args = var0.anObjectArray1904;
                Class25.method174(var1);
            }

            Client.spellSelected = false;
            ItemTable.method284(var0);
        }
    }

    public static void method291() {
        Node_Sub21_Sub21.aReferenceCache2013.clear();
    }

    public static Node_Sub21_Sub24 method293(int var0) {
        Node_Sub21_Sub24 var1 = (Node_Sub21_Sub24) Node_Sub21_Sub24.aReferenceCache2025.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Class19.aReferenceTable136.method1085(1, var0);
            var1 = new Node_Sub21_Sub24();
            if (var2 != null) {
                var1.method1065(new Buffer(var2), var0);
            }

            var1.method335();
            Node_Sub21_Sub24.aReferenceCache2025.method975(var1, (long) var0);
            return var1;
        }
    }

    void method289(boolean var1) {
    }

    Buffer writeBuffer() {
        Buffer var1 = new Buffer(100);
        var1.method451(anInt345);
        var1.method451(this.roofsHidden ? 1 : 0);
        var1.method451(this.loginScreenAudioDisabled ? 1 : 0);
        var1.method451(this.resizable);
        var1.method451(this.properties.size());
        Iterator var2 = this.properties.entrySet().iterator();

        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method869((Integer) var3.getKey());
            var1.method869((Integer) var3.getValue());
        }

        return var1;
    }
}
