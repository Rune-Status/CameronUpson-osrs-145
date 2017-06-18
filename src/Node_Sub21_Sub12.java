public class Node_Sub21_Sub12 extends DoublyNode {
    public static ReferenceTable aReferenceTable2012;
    static ReferenceCache aReferenceCache2025 = new ReferenceCache(64);
    public int anInt220;
    public int anInt217;
    public int anInt206 = 0;
    public boolean aBoolean845 = true;
    public int anInt328 = -1;
    public int anInt221;
    public int anInt228;
    public int anInt214;
    public int anInt226;
    public int anInt232 = -1;

    void method756() {
        if (this.anInt328 != -1) {
            this.method869(this.anInt328);
            this.anInt214 = this.anInt221;
            this.anInt226 = this.anInt220;
            this.anInt228 = this.anInt217;
        }

        this.method869(this.anInt206);
    }

    void method1051(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUnsignedByte();
            if (var3 == 0) {
                return;
            }

            this.method1080(var1, var3, var2);
        }
    }

    void method1080(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.anInt206 = var1.method868();
        } else if (var2 == 2) {
            this.anInt232 = var1.readUnsignedByte();
        } else if (var2 == 5) {
            this.aBoolean845 = false;
        } else if (var2 == 7) {
            this.anInt328 = var1.method868();
        } else if (var2 == 8) {
        }

    }

    void method869(int var1) {
        double var2 = (double) (var1 >> 16 & 255) / 256.0D;
        double var4 = (double) (var1 >> 8 & 255) / 256.0D;
        double var6 = (double) (var1 & 255) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }

        if (var6 < var8) {
            var8 = var6;
        }

        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }

        if (var6 > var10) {
            var10 = var6;
        }

        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var10 + var8);
            }

            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }

            if (var10 == var2) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var10 == var4) {
                var12 = 2.0D + (var6 - var2) / (var10 - var8);
            } else if (var10 == var6) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }

        var12 /= 6.0D;
        this.anInt221 = (int) (256.0D * var12);
        this.anInt220 = (int) (256.0D * var14);
        this.anInt217 = (int) (var16 * 256.0D);
        if (this.anInt220 < 0) {
            this.anInt220 = 0;
        } else if (this.anInt220 > 255) {
            this.anInt220 = 255;
        }

        if (this.anInt217 < 0) {
            this.anInt217 = 0;
        } else if (this.anInt217 > 255) {
            this.anInt217 = 255;
        }

    }
}
