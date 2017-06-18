public class HealthBarDefinition extends DoublyNode {
    public static ReferenceTable aReferenceTable2012;
    public static ReferenceCache aReferenceCache2013 = new ReferenceCache(64);
    public static ReferenceCache aReferenceCache2008 = new ReferenceCache(64);
    public int anInt327;
    public int anInt220 = 255;
    public int anInt217 = 255;
    public int anInt228 = 70;
    public int anInt226 = 1;
    public int anInt919 = 30;
    public int anInt235 = 0;
    public int anInt214 = -1;
    int anInt212 = -1;
    int anInt225 = -1;

    public static void method1123() {
        Node_Sub21_Sub12.aReferenceCache2025.clear();
    }

    public void method1052(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1051(var1, var2);
        }
    }

    public Sprite method1122() {
        if (this.anInt212 < 0) {
            return null;
        } else {
            Sprite var1 = (Sprite) aReferenceCache2013.method973((long) this.anInt212);
            if (var1 != null) {
                return var1;
            } else {
                var1 = Class176.method1188(Class171.aReferenceTable2125, this.anInt212, 0);
                if (var1 != null) {
                    aReferenceCache2013.method975(var1, (long) this.anInt212);
                }

                return var1;
            }
        }
    }

    public Sprite method1121() {
        if (this.anInt225 < 0) {
            return null;
        } else {
            Sprite var1 = (Sprite) aReferenceCache2013.method973((long) this.anInt225);
            if (var1 != null) {
                return var1;
            } else {
                var1 = Class176.method1188(Class171.aReferenceTable2125, this.anInt225, 0);
                if (var1 != null) {
                    aReferenceCache2013.method975(var1, (long) this.anInt225);
                }

                return var1;
            }
        }
    }

    void method1051(Buffer var1, int var2) {
        if (var2 == 1) {
            var1.readUnsignedShort();
        } else if (var2 == 2) {
            this.anInt220 = var1.readUnsignedByte();
        } else if (var2 == 3) {
            this.anInt217 = var1.readUnsignedByte();
        } else if (var2 == 4) {
            this.anInt214 = 0;
        } else if (var2 == 5) {
            this.anInt228 = var1.readUnsignedShort();
        } else if (var2 == 6) {
            var1.readUnsignedByte();
        } else if (var2 == 7) {
            this.anInt225 = var1.readSmart32();
        } else if (var2 == 8) {
            this.anInt212 = var1.readSmart32();
        } else if (var2 == 11) {
            this.anInt214 = var1.readUnsignedShort();
        } else if (var2 == 14) {
            this.anInt919 = var1.readUnsignedByte();
        } else if (var2 == 15) {
            this.anInt235 = var1.readUnsignedByte();
        }

    }
}
