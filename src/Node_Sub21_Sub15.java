public class Node_Sub21_Sub15 extends DoublyNode {
    public static ReferenceCache aReferenceCache2013 = new ReferenceCache(256);
    public static Node_Sub21_Sub15[] aNode_Sub21_Sub15Array2093;
    static ReferenceTable aReferenceTable2012;
    public final int anInt327;
    public String aString2091;
    public int anInt217;
    public int anInt236;
    public String[] aStringArray2095 = new String[5];
    public String aString2094;
    public Class166 aClass166_2092;
    public int anInt328 = -1;
    public Class167 aClass167_2096;
    public int anInt214 = 0;
    int anInt919 = Integer.MAX_VALUE;
    int[] anIntArray315;
    int anInt221 = -1;
    int anInt230 = Integer.MIN_VALUE;
    int anInt235 = Integer.MAX_VALUE;
    int anInt222 = Integer.MIN_VALUE;
    int[] anIntArray1082;
    byte[] aByteArray2090;

    Node_Sub21_Sub15(int var1) {
        this.aClass167_2096 = Class167.aClass167_2029;
        this.aClass166_2092 = Class166.aClass166_2024;
        this.anInt236 = -1;
        this.anInt327 = var1;
    }

    public static Node_Sub21_Sub7 method1115(int var0) {
        Node_Sub21_Sub7 var1 = (Node_Sub21_Sub7) Node_Sub21_Sub7.aReferenceCache2008.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Node_Sub21_Sub7.aReferenceTable2012.method1085(13, var0);
            var1 = new Node_Sub21_Sub7();
            var1.anInt327 = var0;
            if (var2 != null) {
                var1.method1052(new Buffer(var2));
            }

            Node_Sub21_Sub7.aReferenceCache2008.method975(var1, (long) var0);
            return var1;
        }
    }

    static String method1116(int var0) {
        if (var0 < 100000) {
            return "<col=ffff00>" + var0 + "</col>";
        } else {
            return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
        }
    }

    void method1051(Buffer var1, int var2) {
        if (var2 == 1) {
            this.anInt328 = var1.readSmart32();
        } else if (var2 == 2) {
            this.anInt221 = var1.readSmart32();
        } else if (var2 == 3) {
            this.aString2091 = var1.method819();
        } else if (var2 == 4) {
            this.anInt217 = var1.method868();
        } else if (var2 == 5) {
            var1.method868();
        } else if (var2 == 6) {
            this.anInt214 = var1.readUnsignedByte();
        } else {
            int var3;
            if (var2 == 7) {
                var3 = var1.readUnsignedByte();
                if ((var3 & 1) == 0) {
                }

                if ((var3 & 2) == 2) {
                }
            } else if (var2 == 8) {
                var1.readUnsignedByte();
            } else if (var2 >= 10 && var2 <= 14) {
                this.aStringArray2095[var2 - 10] = var1.method819();
            } else if (var2 == 15) {
                var3 = var1.readUnsignedByte();
                this.anIntArray315 = new int[var3 * 2];

                int var4;
                for (var4 = 0; var4 < var3 * 2; ++var4) {
                    this.anIntArray315[var4] = var1.readShort();
                }

                var1.method835();
                var4 = var1.readUnsignedByte();
                this.anIntArray1082 = new int[var4];

                int var5;
                for (var5 = 0; var5 < this.anIntArray1082.length; ++var5) {
                    this.anIntArray1082[var5] = var1.method835();
                }

                this.aByteArray2090 = new byte[var3];

                for (var5 = 0; var5 < var3; ++var5) {
                    this.aByteArray2090[var5] = var1.method870();
                }
            } else if (var2 != 16) {
                if (var2 == 17) {
                    this.aString2094 = var1.method819();
                } else if (var2 == 18) {
                    var1.readSmart32();
                } else if (var2 == 19) {
                    this.anInt236 = var1.readUnsignedShort();
                } else if (var2 == 21) {
                    var1.method835();
                } else if (var2 == 22) {
                    var1.method835();
                } else if (var2 == 23) {
                    var1.readUnsignedByte();
                    var1.readUnsignedByte();
                    var1.readUnsignedByte();
                } else if (var2 == 24) {
                    var1.readShort();
                    var1.readShort();
                } else if (var2 == 25) {
                    var1.readSmart32();
                } else if (var2 == 28) {
                    var1.readUnsignedByte();
                } else if (var2 == 29) {
                    this.aClass167_2096 = (Class167) Canvas.method185(Class167.method354(), var1.readUnsignedByte());
                } else if (var2 == 30) {
                    Class166[] var6 = new Class166[]{Class166.aClass166_2024, Class166.aClass166_2023, Class166.aClass166_2022};
                    this.aClass166_2092 = (Class166) Canvas.method185(var6, var1.readUnsignedByte());
                }
            }
        }

    }

    void method935() {
        if (this.anIntArray315 != null) {
            for (int var1 = 0; var1 < this.anIntArray315.length; var1 += 2) {
                if (this.anIntArray315[var1] < this.anInt919) {
                    this.anInt919 = this.anIntArray315[var1];
                } else if (this.anIntArray315[var1] > this.anInt230) {
                    this.anInt230 = this.anIntArray315[var1];
                }

                if (this.anIntArray315[var1 + 1] < this.anInt235) {
                    this.anInt235 = this.anIntArray315[var1 + 1];
                } else if (this.anIntArray315[var1 + 1] > this.anInt222) {
                    this.anInt222 = this.anIntArray315[var1 + 1];
                }
            }
        }

    }

    public int method1118() {
        return this.anInt327;
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

    Sprite method1119(int var1) {
        if (var1 < 0) {
            return null;
        } else {
            Sprite var2 = (Sprite) aReferenceCache2013.method973((long) var1);
            if (var2 != null) {
                return var2;
            } else {
                var2 = Class176.method1188(aReferenceTable2012, var1, 0);
                if (var2 != null) {
                    aReferenceCache2013.method975(var2, (long) var1);
                }

                return var2;
            }
        }
    }

    public Sprite method1117(boolean var1) {
        int var2 = this.anInt328;
        return this.method1119(var2);
    }
}
