package com.jagex;

public class Node_Sub21_Sub10 extends DoublyNode {
    public static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    RS3CopyPastedNodeTable properties;

    public static Node_Sub21_Sub12 method1063(int var0) {
        Node_Sub21_Sub12 var1 = (Node_Sub21_Sub12) Node_Sub21_Sub12.aReferenceCache2025.method973((long) var0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Node_Sub21_Sub12.aReferenceTable2012.method1085(4, var0);
        var1 = new Node_Sub21_Sub12();
        if (var2 != null) {
            var1.method1051(new Buffer(var2), var0);
        }

        var1.method756();
        Node_Sub21_Sub12.aReferenceCache2025.method975(var1, (long) var0);
        return var1;
    }

    public static void method1064(ReferenceTable var0, ReferenceTable var1) {
        NpcDefinition.aReferenceTable2012 = var0;
        NpcDefinition.aReferenceTable2017 = var1;
    }

    public void method756() {
    }

    public void method1066(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1065(var1, var2);
        }
    }

    void method1065(Buffer var1, int var2) {
        if (var2 == 249) {
            this.properties = RS3CopyPastedNodeTable.readFrom(var1, this.properties);
        }

    }

    public int method1067(int var1, int var2) {
        return RS3CopyPastedNodeTable.getOrDefault(this.properties, var1, var2);
    }

    public String method1068(int var1, String var2) {
        return RS3CopyPastedNodeTable.getObjectOrDefault(this.properties, var1, var2);
    }
}
