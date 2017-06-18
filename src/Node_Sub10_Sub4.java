public class Node_Sub10_Sub4 extends Node_Sub10 {
    NodeDeque<Node_Sub20> aNodeDeque739 = new NodeDeque<>();
    Node_Sub10_Sub3 aNode_Sub10_Sub3_1949;
    Node_Sub10_Sub1 aNode_Sub10_Sub1_1950 = new Node_Sub10_Sub1();

    Node_Sub10_Sub4(Node_Sub10_Sub3 var1) {
        this.aNode_Sub10_Sub3_1949 = var1;
    }

    public static int method1030(Buffer var0, String var1) {
        int var2 = var0.caret;
        int var3 = var1.length();
        byte[] var4 = new byte[var3];

        for (int var5 = 0; var5 < var3; ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 > 0 && var6 < 128 || var6 >= 160 && var6 <= 255) {
                var4[var5] = (byte) var6;
            } else if (var6 == 8364) {
                var4[var5] = -128;
            } else if (var6 == 8218) {
                var4[var5] = -126;
            } else if (var6 == 402) {
                var4[var5] = -125;
            } else if (var6 == 8222) {
                var4[var5] = -124;
            } else if (var6 == 8230) {
                var4[var5] = -123;
            } else if (var6 == 8224) {
                var4[var5] = -122;
            } else if (var6 == 8225) {
                var4[var5] = -121;
            } else if (var6 == 710) {
                var4[var5] = -120;
            } else if (var6 == 8240) {
                var4[var5] = -119;
            } else if (var6 == 352) {
                var4[var5] = -118;
            } else if (var6 == 8249) {
                var4[var5] = -117;
            } else if (var6 == 338) {
                var4[var5] = -116;
            } else if (var6 == 381) {
                var4[var5] = -114;
            } else if (var6 == 8216) {
                var4[var5] = -111;
            } else if (var6 == 8217) {
                var4[var5] = -110;
            } else if (var6 == 8220) {
                var4[var5] = -109;
            } else if (var6 == 8221) {
                var4[var5] = -108;
            } else if (var6 == 8226) {
                var4[var5] = -107;
            } else if (var6 == 8211) {
                var4[var5] = -106;
            } else if (var6 == 8212) {
                var4[var5] = -105;
            } else if (var6 == 732) {
                var4[var5] = -104;
            } else if (var6 == 8482) {
                var4[var5] = -103;
            } else if (var6 == 353) {
                var4[var5] = -102;
            } else if (var6 == 8250) {
                var4[var5] = -101;
            } else if (var6 == 339) {
                var4[var5] = -100;
            } else if (var6 == 382) {
                var4[var5] = -98;
            } else if (var6 == 376) {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }

        var0.method547(var4.length);
        var0.caret += Class181.aClass118_2154.method797(var4, 0, var4.length, var0.payload, var0.caret);
        return var0.caret - var2;
    }

    void method1029(Node_Sub20 var1, int var2) {
        if ((this.aNode_Sub10_Sub3_1949.anIntArray1734[var1.anInt204] & 4) != 0 && var1.anInt919 < 0) {
            int var3 = this.aNode_Sub10_Sub3_1949.anIntArray661[var1.anInt204] / Class84.anInt870;
            int var4 = (var3 + 1048575 - var1.anInt668) / var3;
            var1.anInt668 = var1.anInt668 + var2 * var3 & 1048575;
            if (var4 <= var2) {
                if (this.aNode_Sub10_Sub3_1949.anIntArray1281[var1.anInt204] == 0) {
                    var1.aNode_Sub10_Sub2_1773 = Node_Sub10_Sub2.method551(var1.aNode_Sub11_Sub1_1771, var1.aNode_Sub10_Sub2_1773.method541(), var1.aNode_Sub10_Sub2_1773.method549(), var1.aNode_Sub10_Sub2_1773.method539());
                } else {
                    var1.aNode_Sub10_Sub2_1773 = Node_Sub10_Sub2.method551(var1.aNode_Sub11_Sub1_1771, var1.aNode_Sub10_Sub2_1773.method541(), 0, var1.aNode_Sub10_Sub2_1773.method539());
                    this.aNode_Sub10_Sub3_1949.method926(var1, var1.aNode_Sub18_1772.aShortArray1714[var1.anInt328] < 0);
                }

                if (var1.aNode_Sub18_1772.aShortArray1714[var1.anInt328] < 0) {
                    var1.aNode_Sub10_Sub2_1773.method546(-1);
                }

                var2 = var1.anInt668 / var3;
            }
        }

        var1.aNode_Sub10_Sub2_1773.method428(var2);
    }

    protected Node_Sub10 method434() {
        Node_Sub20 var1 = this.aNodeDeque739.method995();
        if (var1 == null) {
            return null;
        } else {
            return var1.aNode_Sub10_Sub2_1773 != null ? var1.aNode_Sub10_Sub2_1773 : this.method426();
        }
    }

    protected int method425() {
        return 0;
    }

    protected void method428(int var1) {
        this.aNode_Sub10_Sub1_1950.method428(var1);

        for (Node_Sub20 var2 = this.aNodeDeque739.method995(); var2 != null; var2 = this.aNodeDeque739.next()) {
            if (!this.aNode_Sub10_Sub3_1949.method933(var2)) {
                int var3 = var1;

                do {
                    if (var3 <= var2.anInt981) {
                        this.method1029(var2, var3);
                        var2.anInt981 -= var3;
                        break;
                    }

                    this.method1029(var2, var2.anInt981);
                    var3 -= var2.anInt981;
                } while (!this.aNode_Sub10_Sub3_1949.method915(var2, null, 0, var3));
            }
        }

    }

    protected void method429(int[] var1, int var2, int var3) {
        this.aNode_Sub10_Sub1_1950.method429(var1, var2, var3);

        for (Node_Sub20 var4 = this.aNodeDeque739.method995(); var4 != null; var4 = this.aNodeDeque739.next()) {
            if (!this.aNode_Sub10_Sub3_1949.method933(var4)) {
                int var5 = var2;
                int var6 = var3;

                do {
                    if (var6 <= var4.anInt981) {
                        this.method1028(var4, var1, var5, var6, var6 + var5);
                        var4.anInt981 -= var6;
                        break;
                    }

                    this.method1028(var4, var1, var5, var4.anInt981, var6 + var5);
                    var5 += var4.anInt981;
                    var6 -= var4.anInt981;
                } while (!this.aNode_Sub10_Sub3_1949.method915(var4, var1, var5, var6));
            }
        }

    }

    void method1028(Node_Sub20 var1, int[] var2, int var3, int var4, int var5) {
        if ((this.aNode_Sub10_Sub3_1949.anIntArray1734[var1.anInt204] & 4) != 0 && var1.anInt919 < 0) {
            int var6 = this.aNode_Sub10_Sub3_1949.anIntArray661[var1.anInt204] / Class84.anInt870;

            while (true) {
                int var7 = (var6 + 1048575 - var1.anInt668) / var6;
                if (var7 > var4) {
                    var1.anInt668 += var4 * var6;
                    break;
                }

                var1.aNode_Sub10_Sub2_1773.method429(var2, var3, var7);
                var3 += var7;
                var4 -= var7;
                var1.anInt668 += var7 * var6 - 1048576;
                int var8 = Class84.anInt870 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }

                Node_Sub10_Sub2 var10 = var1.aNode_Sub10_Sub2_1773;
                if (this.aNode_Sub10_Sub3_1949.anIntArray1281[var1.anInt204] == 0) {
                    var1.aNode_Sub10_Sub2_1773 = Node_Sub10_Sub2.method551(var1.aNode_Sub11_Sub1_1771, var10.method541(), var10.method549(), var10.method539());
                } else {
                    var1.aNode_Sub10_Sub2_1773 = Node_Sub10_Sub2.method551(var1.aNode_Sub11_Sub1_1771, var10.method541(), 0, var10.method539());
                    this.aNode_Sub10_Sub3_1949.method926(var1, var1.aNode_Sub18_1772.aShortArray1714[var1.anInt328] < 0);
                    var1.aNode_Sub10_Sub2_1773.method557(var8, var10.method549());
                }

                if (var1.aNode_Sub18_1772.aShortArray1714[var1.anInt328] < 0) {
                    var1.aNode_Sub10_Sub2_1773.method546(-1);
                }

                var10.method558(var8);
                var10.method429(var2, var3, var5 - var3);
                if (var10.method543()) {
                    this.aNode_Sub10_Sub1_1950.method430(var10);
                }
            }
        }

        var1.aNode_Sub10_Sub2_1773.method429(var2, var3, var4);
    }

    protected Node_Sub10 method426() {
        Node_Sub20 var1;
        do {
            var1 = this.aNodeDeque739.next();
            if (var1 == null) {
                return null;
            }
        } while (var1.aNode_Sub10_Sub2_1773 == null);

        return var1.aNode_Sub10_Sub2_1773;
    }
}
