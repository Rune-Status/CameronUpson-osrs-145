package com.jagex;

public class Node_Sub21_Sub21 extends DoublyNode {
    public static int anInt206;
    public static ReferenceTable aReferenceTable2012;
    public static ReferenceTable aReferenceTable2017;
    static ReferenceCache aReferenceCache2013 = new ReferenceCache(64);
    public int anInt327 = -1;
    public boolean aBoolean813 = false;
    short[] aShortArray2007;
    short[] aShortArray2009;
    int[] anIntArray957;
    short[] aShortArray2099;
    short[] aShortArray2010;
    int[] anIntArray1276 = new int[]{-1, -1, -1, -1, -1};

    void method1052(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1051(var1, var2);
        }
    }

    public boolean method1079() {
        boolean var1 = true;

        for (int var2 = 0; var2 < 5; ++var2) {
            if (this.anIntArray1276[var2] != -1 && !aReferenceTable2017.method1102(this.anIntArray1276[var2], 0)) {
                var1 = false;
            }
        }

        return var1;
    }

    public ModelHeader method1059() {
        ModelHeader[] var1 = new ModelHeader[5];
        int var2 = 0;

        for (int var3 = 0; var3 < 5; ++var3) {
            if (this.anIntArray1276[var3] != -1) {
                var1[var2++] = ModelHeader.method571(aReferenceTable2017, this.anIntArray1276[var3], 0);
            }
        }

        ModelHeader var4 = new ModelHeader(var1, var2);
        int var5;
        if (this.aShortArray2099 != null) {
            for (var5 = 0; var5 < this.aShortArray2099.length; ++var5) {
                var4.recolor(this.aShortArray2099[var5], this.aShortArray2010[var5]);
            }
        }

        if (this.aShortArray2009 != null) {
            for (var5 = 0; var5 < this.aShortArray2009.length; ++var5) {
                var4.method573(this.aShortArray2009[var5], this.aShortArray2007[var5]);
            }
        }

        return var4;
    }

    void method1051(Buffer var1, int var2) {
        if (var2 == 1) {
            this.anInt327 = var1.readUnsignedByte();
        } else {
            int var3;
            int var4;
            if (var2 == 2) {
                var3 = var1.readUnsignedByte();
                this.anIntArray957 = new int[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.anIntArray957[var4] = var1.readUnsignedShort();
                }
            } else if (var2 == 3) {
                this.aBoolean813 = true;
            } else if (var2 == 40) {
                var3 = var1.readUnsignedByte();
                this.aShortArray2099 = new short[var3];
                this.aShortArray2010 = new short[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.aShortArray2099[var4] = (short) var1.readUnsignedShort();
                    this.aShortArray2010[var4] = (short) var1.readUnsignedShort();
                }
            } else if (var2 == 41) {
                var3 = var1.readUnsignedByte();
                this.aShortArray2009 = new short[var3];
                this.aShortArray2007 = new short[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.aShortArray2009[var4] = (short) var1.readUnsignedShort();
                    this.aShortArray2007[var4] = (short) var1.readUnsignedShort();
                }
            } else if (var2 >= 60 && var2 < 70) {
                this.anIntArray1276[var2 - 60] = var1.readUnsignedShort();
            }
        }

    }

    public boolean method1128() {
        if (this.anIntArray957 == null) {
            return true;
        } else {
            boolean var1 = true;

            for (int var2 = 0; var2 < this.anIntArray957.length; ++var2) {
                if (!aReferenceTable2017.method1102(this.anIntArray957[var2], 0)) {
                    var1 = false;
                }
            }

            return var1;
        }
    }

    public ModelHeader method1129() {
        if (this.anIntArray957 == null) {
            return null;
        } else {
            ModelHeader[] var1 = new ModelHeader[this.anIntArray957.length];

            for (int var2 = 0; var2 < this.anIntArray957.length; ++var2) {
                var1[var2] = ModelHeader.method571(aReferenceTable2017, this.anIntArray957[var2], 0);
            }

            ModelHeader var3;
            if (var1.length == 1) {
                var3 = var1[0];
            } else {
                var3 = new ModelHeader(var1, var1.length);
            }

            int var4;
            if (this.aShortArray2099 != null) {
                for (var4 = 0; var4 < this.aShortArray2099.length; ++var4) {
                    var3.recolor(this.aShortArray2099[var4], this.aShortArray2010[var4]);
                }
            }

            if (this.aShortArray2009 != null) {
                for (var4 = 0; var4 < this.aShortArray2009.length; ++var4) {
                    var3.method573(this.aShortArray2009[var4], this.aShortArray2007[var4]);
                }
            }

            return var3;
        }
    }
}
