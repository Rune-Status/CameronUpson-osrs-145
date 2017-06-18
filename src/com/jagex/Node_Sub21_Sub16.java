package com.jagex;

public class Node_Sub21_Sub16 extends DoublyNode {
    public static ReferenceTable aReferenceTable2012;
    static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    static Class42 aClass42_2097;
    public boolean aBoolean316 = false;

    void method1051(Buffer var1, int var2) {
        if (var2 == 2) {
            this.aBoolean316 = true;
        }

    }

    void method1052(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1051(var1, var2);
        }
    }
}
