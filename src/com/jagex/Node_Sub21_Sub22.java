package com.jagex;

public class Node_Sub21_Sub22 extends DoublyNode {
    public static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    public boolean aBoolean316 = false;

    public void method1052(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1051(var1, var2);
        }
    }

    void method1051(Buffer var1, int var2) {
        if (var2 == 2) {
            this.aBoolean316 = true;
        }

    }
}
