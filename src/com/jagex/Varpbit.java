package com.jagex;

public class Varpbit extends DoublyNode {
    public static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    public static ReferenceTable aReferenceTable2012;
    public int lower;
    public int upper;
    public int varpIndex;

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
        if (var2 == 1) {
            this.varpIndex = var1.readUnsignedShort();
            this.lower = var1.readUnsignedByte();
            this.upper = var1.readUnsignedByte();
        }

    }
}
