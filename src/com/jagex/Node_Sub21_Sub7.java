package com.jagex;

public class Node_Sub21_Sub7 extends DoublyNode {
    public static ReferenceCache aReferenceCache2008 = new ReferenceCache(64);
    public static ReferenceCache aReferenceCache2013 = new ReferenceCache(30);
    public static ReferenceTable aReferenceTable2012;
    public int anInt221 = -1;
    short[] aShortArray2011;
    int anInt328;
    short[] aShortArray2010;
    short[] aShortArray2009;
    int anInt235 = 0;
    int anInt327;
    int anInt228 = 128;
    int anInt225 = 128;
    int anInt212 = 0;
    int anInt919 = 0;
    short[] aShortArray2007;

    static void method1053(InterfaceComponent var0, int var1, int var2, boolean var3) {
        int var4 = var0.width;
        int var5 = var0.height;
        if (var0.anInt818 == 0) {
            var0.width = var0.anInt749;
        } else if (var0.anInt818 == 1) {
            var0.width = var1 - var0.anInt749;
        } else if (var0.anInt818 == 2) {
            var0.width = var1 * var0.anInt749 >> 14;
        }

        if (var0.anInt233 == 0) {
            var0.height = var0.anInt748;
        } else if (var0.anInt233 == 1) {
            var0.height = var2 - var0.anInt748;
        } else if (var0.anInt233 == 2) {
            var0.height = var2 * var0.anInt748 >> 14;
        }

        if (var0.anInt818 == 4) {
            var0.width = var0.anInt755 * var0.height / var0.anInt760;
        }

        if (var0.anInt233 == 4) {
            var0.height = var0.width * var0.anInt760 / var0.anInt755;
        }

        if (Client.aBoolean1637 && var0.type == 0) {
            if (var0.height < 5 && var0.width < 5) {
                var0.height = 5;
                var0.width = 5;
            } else {
                if (var0.height <= 0) {
                    var0.height = 5;
                }

                if (var0.width <= 0) {
                    var0.width = 5;
                }
            }
        }

        if (var0.contentType == 1337) {
            Client.anInterfaceComponent1638 = var0;
        }

        if (var3 && var0.anObjectArray1920 != null && (var4 != var0.width || var0.height != var5)) {
            ScriptEvent var6 = new ScriptEvent();
            var6.source = var0;
            var6.args = var0.anObjectArray1920;
            Client.aNodeDeque1661.method997(var6);
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

    void method1051(Buffer var1, int var2) {
        if (var2 == 1) {
            this.anInt328 = var1.readUnsignedShort();
        } else if (var2 == 2) {
            this.anInt221 = var1.readUnsignedShort();
        } else if (var2 == 4) {
            this.anInt228 = var1.readUnsignedShort();
        } else if (var2 == 5) {
            this.anInt225 = var1.readUnsignedShort();
        } else if (var2 == 6) {
            this.anInt212 = var1.readUnsignedShort();
        } else if (var2 == 7) {
            this.anInt919 = var1.readUnsignedByte();
        } else if (var2 == 8) {
            this.anInt235 = var1.readUnsignedByte();
        } else {
            int var3;
            int var4;
            if (var2 == 40) {
                var3 = var1.readUnsignedByte();
                this.aShortArray2010 = new short[var3];
                this.aShortArray2009 = new short[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.aShortArray2010[var4] = (short) var1.readUnsignedShort();
                    this.aShortArray2009[var4] = (short) var1.readUnsignedShort();
                }
            } else if (var2 == 41) {
                var3 = var1.readUnsignedByte();
                this.aShortArray2007 = new short[var3];
                this.aShortArray2011 = new short[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.aShortArray2007[var4] = (short) var1.readUnsignedShort();
                    this.aShortArray2011[var4] = (short) var1.readUnsignedShort();
                }
            }
        }

    }

    public final Model method1050(int var1) {
        Model var2 = (Model) aReferenceCache2013.method973((long) this.anInt327);
        if (var2 == null) {
            ModelHeader var3 = ModelHeader.method571(Class156.aReferenceTable1844, this.anInt328, 0);
            if (var3 == null) {
                return null;
            }

            int var4;
            if (this.aShortArray2010 != null) {
                for (var4 = 0; var4 < this.aShortArray2010.length; ++var4) {
                    var3.recolor(this.aShortArray2010[var4], this.aShortArray2009[var4]);
                }
            }

            if (this.aShortArray2007 != null) {
                for (var4 = 0; var4 < this.aShortArray2007.length; ++var4) {
                    var3.method573(this.aShortArray2007[var4], this.aShortArray2011[var4]);
                }
            }

            var2 = var3.light(this.anInt919 + 64, this.anInt235 + 850, -30, -50, -30);
            aReferenceCache2013.method975(var2, (long) this.anInt327);
        }

        Model var5;
        if (this.anInt221 != -1 && var1 != -1) {
            var5 = Applet_Sub1.method251(this.anInt221).method1194(var2, var1);
        } else {
            var5 = var2.method732(true);
        }

        if (this.anInt228 != 128 || this.anInt225 != 128) {
            var5.method531(this.anInt228, this.anInt225, this.anInt228);
        }

        if (this.anInt212 != 0) {
            if (this.anInt212 == 90) {
                var5.method725();
            }

            if (this.anInt212 == 180) {
                var5.method725();
                var5.method725();
            }

            if (this.anInt212 == 270) {
                var5.method725();
                var5.method725();
                var5.method725();
            }
        }

        return var5;
    }
}
