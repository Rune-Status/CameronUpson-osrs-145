package com.jagex;

public class Node_Sub21_Sub13 extends DoublyNode {
    static ReferenceTable aReferenceTable2012;
    static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    public int[] anIntArray932;
    public char aChar2067;
    public String aString207 = "null";
    public int[] anIntArray1319;
    public int anInt221 = 0;
    public int anInt328;
    public char aChar2066;
    public String[] aStringArray2065;

    void method1066(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1065(var1, var2);
        }
    }

    void method1065(Buffer var1, int var2) {
        if (var2 == 1) {
            this.aChar2067 = (char) var1.readUnsignedByte();
        } else if (var2 == 2) {
            this.aChar2066 = (char) var1.readUnsignedByte();
        } else if (var2 == 3) {
            this.aString207 = var1.method819();
        } else if (var2 == 4) {
            this.anInt328 = var1.method835();
        } else {
            int var3;
            if (var2 == 5) {
                this.anInt221 = var1.readUnsignedShort();
                this.anIntArray932 = new int[this.anInt221];
                this.aStringArray2065 = new String[this.anInt221];

                for (var3 = 0; var3 < this.anInt221; ++var3) {
                    this.anIntArray932[var3] = var1.method835();
                    this.aStringArray2065[var3] = var1.method819();
                }
            } else if (var2 == 6) {
                this.anInt221 = var1.readUnsignedShort();
                this.anIntArray932 = new int[this.anInt221];
                this.anIntArray1319 = new int[this.anInt221];

                for (var3 = 0; var3 < this.anInt221; ++var3) {
                    this.anIntArray932[var3] = var1.method835();
                    this.anIntArray1319[var3] = var1.method835();
                }
            }
        }

    }
}
