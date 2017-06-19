package com.jagex;

public class DefinitionProperty extends DoublyNode {
    public static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    public static ReferenceTable aReferenceTable2012;

    public int defaultInteger;
    public String defaultString;
    boolean deleteOnUse = true;
    char propertyType; //s for string, ?? for int

    public boolean isString() {
        return this.propertyType == 's';
    }

    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.decode(var1, var2);
        }
    }

    void decode(Buffer var1, int var2) {
        if (var2 == 1) {
            this.propertyType = Node_Sub10_Sub3.method927(var1.method870());
        } else if (var2 == 2) {
            this.defaultInteger = var1.readInt();
        } else if (var2 == 4) {
            this.deleteOnUse = false;
        } else if (var2 == 5) {
            this.defaultString = var1.method819();
        }

    }

    void method756() {
    }
}
