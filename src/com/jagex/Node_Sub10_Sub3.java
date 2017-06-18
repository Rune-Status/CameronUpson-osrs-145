package com.jagex;

public class Node_Sub10_Sub3 extends Node_Sub10 {
    int[] anIntArray932 = new int[16];
    int anInt209 = 256;
    int anInt206 = 1000000;
    Class135 aClass135_1737 = new Class135();
    int[] anIntArray957 = new int[16];
    int[] anIntArray934 = new int[16];
    int[] anIntArray950 = new int[16];
    int anInt748;
    int[] anIntArray1271 = new int[16];
    int[] anIntArray1276 = new int[16];
    int[] anIntArray240 = new int[16];
    int[] anIntArray1081 = new int[16];
    int[] anIntArray1734 = new int[16];
    int[] anIntArray1082 = new int[16];
    boolean aBoolean1731;
    int[] anIntArray404 = new int[16];
    int[] anIntArray661 = new int[16];
    Node_Sub20[][] aNode_Sub20ArrayArray1735 = new Node_Sub20[16][128];
    NodeTable<Node_Sub18> aNodeTable339 = new NodeTable<>(128);
    int[] anIntArray1171 = new int[16];
    int[] anIntArray1319 = new int[16];
    Node_Sub20[][] aNode_Sub20ArrayArray1736 = new Node_Sub20[16][128];
    int anInt1257;
    long aLong1732;
    long aLong1733;
    Node_Sub10_Sub4 aNode_Sub10_Sub4_1730 = new Node_Sub10_Sub4(this);
    int[] anIntArray1281 = new int[16];

    public Node_Sub10_Sub3() {
        this.method928();
    }

    public static char method927(byte var0) {
        int var1 = var0 & 255;
        if (var1 == 0) {
            throw new IllegalArgumentException("");
        }
        if (var1 >= 128 && var1 < 160) {
            char var2 = Class169.aCharArray2118[var1 - 128];
            if (var2 == 0) {
                var2 = '?';
            }

            var1 = var2;
        }

        return (char) var1;
    }

    void method938(int var1, int var2) {
        this.anIntArray1276[var1] = var2;
    }

    boolean method933(Node_Sub20 var1) {
        if (var1.aNode_Sub10_Sub2_1773 == null) {
            if (var1.anInt919 >= 0) {
                var1.unlink();
                if (var1.anInt327 > 0 && this.aNode_Sub20ArrayArray1736[var1.anInt204][var1.anInt327] == var1) {
                    this.aNode_Sub20ArrayArray1736[var1.anInt204][var1.anInt327] = null;
                }
            }

            return true;
        }
        return false;
    }

    int method195() {
        return this.anInt209;
    }

    public synchronized boolean method920(Node_Sub26 var1, ReferenceTable var2, Class85 var3, int var4) {
        var1.method756();
        boolean var5 = true;
        Object var6 = null;
        int[] var10 = new int[]{var4};

        for (Node_Sub22 var7 = var1.aNodeTable339.first(); var7 != null; var7 = var1.aNodeTable339.next()) {
            int var8 = (int) var7.key;
            Node_Sub18 var9 = this.aNodeTable339.lookup((long) var8);
            if (var9 == null) {
                var9 = World.method324(var2, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }

                this.aNodeTable339.put(var9, (long) var8);
            }

            if (!var9.method904(var3, var7.aByteArray1361, var10)) {
                var5 = false;
            }
        }

        if (var5) {
            var1.method335();
        }

        return var5;
    }

    public synchronized void method935() {
        for (Node_Sub18 var1 = this.aNodeTable339.first(); var1 != null; var1 = this.aNodeTable339.next()) {
            var1.method335();
        }

    }

    public synchronized void method929(Node_Sub26 var1, boolean var2) {
        this.method916();
        this.aClass135_1737.method953(var1.aByteArray846);
        this.aBoolean1731 = var2;
        this.aLong1732 = 0L;
        int var3 = this.aClass135_1737.method956();

        for (int var4 = 0; var4 < var3; ++var4) {
            this.aClass135_1737.method958(var4);
            this.aClass135_1737.method946(var4);
            this.aClass135_1737.method959(var4);
        }

        this.anInt748 = this.aClass135_1737.method948();
        this.anInt1257 = this.aClass135_1737.anIntArray1746[this.anInt748];
        this.aLong1733 = this.aClass135_1737.method945(this.anInt1257);
    }

    public synchronized void method916() {
        this.aClass135_1737.method950();
        this.method928();
    }

    synchronized void method556() {
        for (Node_Sub18 var1 = this.aNodeTable339.first(); var1 != null; var1 = this.aNodeTable339.next()) {
            var1.unlink();
        }

    }

    void method934(int var1, int var2) {
        this.anIntArray932[var1] = var2;
        this.anIntArray1271[var1] = var2 & -128;
        this.method924(var1, var2);
    }

    void method924(int var1, int var2) {
        if (this.anIntArray1319[var1] != var2) {
            this.anIntArray1319[var1] = var2;

            for (int var3 = 0; var3 < 128; ++var3) {
                this.aNode_Sub20ArrayArray1736[var1][var3] = null;
            }
        }

    }

    void method931(int var1, int var2, int var3) {
        this.method564(var1, var2, 64);
        if ((this.anIntArray1734[var1] & 2) != 0) {
            for (Node_Sub20 var4 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.current(); var4 != null; var4 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.method990()) {
                if (var1 == var4.anInt204 && var4.anInt919 < 0) {
                    this.aNode_Sub20ArrayArray1735[var1][var4.anInt328] = null;
                    this.aNode_Sub20ArrayArray1735[var1][var2] = var4;
                    int var5 = var4.anInt217 + (var4.anInt214 * var4.anInt226 >> 12);
                    var4.anInt217 += var2 - var4.anInt328 << 8;
                    var4.anInt214 = var5 - var4.anInt217;
                    var4.anInt226 = 4096;
                    var4.anInt328 = var2;
                    return;
                }
            }
        }

        Node_Sub18 var9 = this.aNodeTable339.lookup((long) this.anIntArray1319[var1]);
        if (var9 != null) {
            Node_Sub11_Sub1 var6 = var9.aNode_Sub11_Sub1Array1717[var2];
            if (var6 != null) {
                Node_Sub20 var7 = new Node_Sub20();
                var7.anInt204 = var1;
                var7.aNode_Sub18_1772 = var9;
                var7.aNode_Sub11_Sub1_1771 = var6;
                var7.aClass138_1774 = var9.aClass138Array1716[var2];
                var7.anInt327 = var9.aByteArray978[var2];
                var7.anInt328 = var2;
                var7.anInt221 = var9.aByteArray1278[var2] * var9.anInt204 * var3 * var3 + 1024 >> 11;
                var7.anInt220 = var9.aByteArray1715[var2] & 255;
                var7.anInt217 = (var2 << 8) - (var9.aShortArray1714[var2] & 32767);
                var7.anInt228 = 0;
                var7.anInt225 = 0;
                var7.anInt212 = 0;
                var7.anInt919 = -1;
                var7.anInt235 = 0;
                if (this.anIntArray1281[var1] == 0) {
                    var7.aNode_Sub10_Sub2_1773 = Node_Sub10_Sub2.method551(var6, this.method937(var7), this.method936(var7), this.method921(var7));
                } else {
                    var7.aNode_Sub10_Sub2_1773 = Node_Sub10_Sub2.method551(var6, this.method937(var7), 0, this.method921(var7));
                    this.method926(var7, var9.aShortArray1714[var2] < 0);
                }

                if (var9.aShortArray1714[var2] < 0) {
                    var7.aNode_Sub10_Sub2_1773.method546(-1);
                }

                if (var7.anInt327 >= 0) {
                    Node_Sub20 var8 = this.aNode_Sub20ArrayArray1736[var1][var7.anInt327];
                    if (var8 != null && var8.anInt919 < 0) {
                        this.aNode_Sub20ArrayArray1735[var1][var8.anInt328] = null;
                        var8.anInt919 = 0;
                    }

                    this.aNode_Sub20ArrayArray1736[var1][var7.anInt327] = var7;
                }

                this.aNode_Sub10_Sub4_1730.aNodeDeque739.method997(var7);
                this.aNode_Sub20ArrayArray1735[var1][var2] = var7;
            }
        }
    }

    void method928() {
        this.method553(-1);
        this.method925(-1);

        int var1;
        for (var1 = 0; var1 < 16; ++var1) {
            this.anIntArray1319[var1] = this.anIntArray932[var1];
        }

        for (var1 = 0; var1 < 16; ++var1) {
            this.anIntArray1271[var1] = this.anIntArray932[var1] & -128;
        }

    }

    void method917(int var1, int var2) {
    }

    void method553(int var1) {
        for (Node_Sub20 var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.method995(); var2 != null; var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.next()) {
            if (var1 < 0 || var1 == var2.anInt204) {
                if (var2.aNode_Sub10_Sub2_1773 != null) {
                    var2.aNode_Sub10_Sub2_1773.method558(Class84.anInt870 / 100);
                    if (var2.aNode_Sub10_Sub2_1773.method543()) {
                        this.aNode_Sub10_Sub4_1730.aNode_Sub10_Sub1_1950.method430(var2.aNode_Sub10_Sub2_1773);
                    }

                    var2.method308();
                }

                if (var2.anInt919 < 0) {
                    this.aNode_Sub20ArrayArray1735[var2.anInt204][var2.anInt328] = null;
                }

                var2.unlink();
            }
        }

    }

    void method925(int var1) {
        if (var1 >= 0) {
            this.anIntArray950[var1] = 12800;
            this.anIntArray957[var1] = 8192;
            this.anIntArray934[var1] = 16383;
            this.anIntArray1276[var1] = 8192;
            this.anIntArray404[var1] = 0;
            this.anIntArray1171[var1] = 8192;
            this.method918(var1);
            this.method932(var1);
            this.anIntArray1734[var1] = 0;
            this.anIntArray1082[var1] = 32767;
            this.anIntArray240[var1] = 256;
            this.anIntArray1281[var1] = 0;
            this.method923(var1, 8192);
        } else {
            for (var1 = 0; var1 < 16; ++var1) {
                this.method925(var1);
            }

        }
    }

    void method930(int var1) {
        for (Node_Sub20 var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.method995(); var2 != null; var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.next()) {
            if ((var1 < 0 || var2.anInt204 == var1) && var2.anInt919 < 0) {
                this.aNode_Sub20ArrayArray1735[var2.anInt204][var2.anInt328] = null;
                var2.anInt919 = 0;
            }
        }

    }

    public synchronized void method454(int var1) {
        this.anInt209 = var1;
    }

    void method918(int var1) {
        if ((this.anIntArray1734[var1] & 2) != 0) {
            for (Node_Sub20 var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.method995(); var2 != null; var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.next()) {
                if (var1 == var2.anInt204 && this.aNode_Sub20ArrayArray1735[var1][var2.anInt328] == null && var2.anInt919 < 0) {
                    var2.anInt919 = 0;
                }
            }
        }

    }

    void method932(int var1) {
        if ((this.anIntArray1734[var1] & 4) != 0) {
            for (Node_Sub20 var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.method995(); var2 != null; var2 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.next()) {
                if (var1 == var2.anInt204) {
                    var2.anInt668 = 0;
                }
            }
        }

    }

    void method923(int var1, int var2) {
        this.anIntArray1081[var1] = var2;
        this.anIntArray661[var1] = (int) (2097152.0D * Math.pow(2.0D, (double) var2 * 5.4931640625E-4D) + 0.5D);
    }

    int method936(Node_Sub20 var1) {
        Class138 var2 = var1.aClass138_1774;
        int var3 = this.anIntArray950[var1.anInt204] * this.anIntArray934[var1.anInt204] + 4096 >> 13;
        var3 = var3 * var3 + 16384 >> 15;
        var3 = var1.anInt221 * var3 + 16384 >> 15;
        var3 = this.anInt209 * var3 + 128 >> 8;
        if (var2.anInt1762 > 0) {
            var3 = (int) ((double) var3 * Math.pow(0.5D, (double) var1.anInt228 * 1.953125E-5D * (double) var2.anInt1762) + 0.5D);
        }

        int var4;
        int var5;
        int var6;
        int var7;
        if (var2.aByteArray1759 != null) {
            var4 = var1.anInt225;
            var5 = var2.aByteArray1759[var1.anInt212 + 1];
            if (var1.anInt212 < var2.aByteArray1759.length - 2) {
                var6 = (var2.aByteArray1759[var1.anInt212] & 255) << 8;
                var7 = (var2.aByteArray1759[var1.anInt212 + 2] & 255) << 8;
                var5 += (var4 - var6) * (var2.aByteArray1759[var1.anInt212 + 3] - var5) / (var7 - var6);
            }

            var3 = var5 * var3 + 32 >> 6;
        }

        if (var1.anInt919 > 0 && var2.aByteArray1768 != null) {
            var4 = var1.anInt919;
            var5 = var2.aByteArray1768[var1.anInt235 + 1];
            if (var1.anInt235 < var2.aByteArray1768.length - 2) {
                var6 = (var2.aByteArray1768[var1.anInt235] & 255) << 8;
                var7 = (var2.aByteArray1768[var1.anInt235 + 2] & 255) << 8;
                var5 += (var2.aByteArray1768[var1.anInt235 + 3] - var5) * (var4 - var6) / (var7 - var6);
            }

            var3 = var5 * var3 + 32 >> 6;
        }

        return var3;
    }

    protected synchronized Node_Sub10 method434() {
        return this.aNode_Sub10_Sub4_1730;
    }

    protected synchronized Node_Sub10 method426() {
        return null;
    }

    protected synchronized int method425() {
        return 0;
    }

    protected synchronized void method429(int[] var1, int var2, int var3) {
        if (this.aClass135_1737.method947()) {
            int var4 = this.aClass135_1737.anInt1749 * this.anInt206 / Class84.anInt870;

            do {
                long var5 = this.aLong1732 + (long) var4 * (long) var3;
                if (this.aLong1733 - var5 >= 0L) {
                    this.aLong1732 = var5;
                    break;
                }

                int var7 = (int) ((this.aLong1733 - this.aLong1732 + (long) var4 - 1L) / (long) var4);
                this.aLong1732 += (long) var7 * (long) var4;
                this.aNode_Sub10_Sub4_1730.method429(var1, var2, var7);
                var2 += var7;
                var3 -= var7;
                this.method919();
            } while (this.aClass135_1737.method947());
        }

        this.aNode_Sub10_Sub4_1730.method429(var1, var2, var3);
    }

    protected synchronized void method428(int var1) {
        if (this.aClass135_1737.method947()) {
            int var2 = this.anInt206 * this.aClass135_1737.anInt1749 / Class84.anInt870;

            do {
                long var3 = (long) var1 * (long) var2 + this.aLong1732;
                if (this.aLong1733 - var3 >= 0L) {
                    this.aLong1732 = var3;
                    break;
                }

                int var5 = (int) ((this.aLong1733 - this.aLong1732 + (long) var2 - 1L) / (long) var2);
                this.aLong1732 += (long) var2 * (long) var5;
                this.aNode_Sub10_Sub4_1730.method428(var5);
                var1 -= var5;
                this.method919();
            } while (this.aClass135_1737.method947());
        }

        this.aNode_Sub10_Sub4_1730.method428(var1);
    }

    void method919() {
        int var1 = this.anInt748;
        int var2 = this.anInt1257;

        long var3;
        for (var3 = this.aLong1733; this.anInt1257 == var2; var3 = this.aClass135_1737.method945(var2)) {
            while (var2 == this.aClass135_1737.anIntArray1746[var1]) {
                this.aClass135_1737.method958(var1);
                int var5 = this.aClass135_1737.method952(var1);
                if (var5 == 1) {
                    this.aClass135_1737.method949();
                    this.aClass135_1737.method959(var1);
                    if (this.aClass135_1737.method957()) {
                        if (!this.aBoolean1731 || var2 == 0) {
                            this.method928();
                            this.aClass135_1737.method950();
                            return;
                        }

                        this.aClass135_1737.method955(var3);
                    }
                    break;
                }

                if ((var5 & 128) != 0) {
                    this.method839(var5);
                }

                this.aClass135_1737.method946(var1);
                this.aClass135_1737.method959(var1);
            }

            var1 = this.aClass135_1737.method948();
            var2 = this.aClass135_1737.anIntArray1746[var1];
        }

        this.anInt748 = var1;
        this.anInt1257 = var2;
        this.aLong1733 = var3;
    }

    boolean method915(Node_Sub20 var1, int[] var2, int var3, int var4) {
        var1.anInt981 = Class84.anInt870 / 100;
        if (var1.anInt919 < 0 || var1.aNode_Sub10_Sub2_1773 != null && !var1.aNode_Sub10_Sub2_1773.method545()) {
            int var5 = var1.anInt226;
            if (var5 > 0) {
                var5 -= (int) (16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double) this.anIntArray1171[var1.anInt204]) + 0.5D);
                if (var5 < 0) {
                    var5 = 0;
                }

                var1.anInt226 = var5;
            }

            var1.aNode_Sub10_Sub2_1773.method553(this.method937(var1));
            Class138 var6 = var1.aClass138_1774;
            boolean var7 = false;
            ++var1.anInt230;
            var1.anInt222 += var6.anInt1765;
            double var8 = 5.086263020833333E-6D * (double) ((var1.anInt214 * var1.anInt226 >> 12) + (var1.anInt328 - 60 << 8));
            if (var6.anInt1762 > 0) {
                if (var6.anInt1766 > 0) {
                    var1.anInt228 += (int) (128.0D * Math.pow(2.0D, (double) var6.anInt1766 * var8) + 0.5D);
                } else {
                    var1.anInt228 += 128;
                }
            }

            if (var6.aByteArray1759 != null) {
                if (var6.anInt1761 > 0) {
                    var1.anInt225 += (int) (128.0D * Math.pow(2.0D, (double) var6.anInt1761 * var8) + 0.5D);
                } else {
                    var1.anInt225 += 128;
                }

                while (var1.anInt212 < var6.aByteArray1759.length - 2 && var1.anInt225 > (var6.aByteArray1759[var1.anInt212 + 2] & 255) << 8) {
                    var1.anInt212 += 2;
                }

                if (var1.anInt212 == var6.aByteArray1759.length - 2 && var6.aByteArray1759[var1.anInt212 + 1] == 0) {
                    var7 = true;
                }
            }

            if (var1.anInt919 >= 0 && var6.aByteArray1768 != null && (this.anIntArray1734[var1.anInt204] & 1) == 0 && (var1.anInt327 < 0 || var1 != this.aNode_Sub20ArrayArray1736[var1.anInt204][var1.anInt327])) {
                if (var6.anInt1764 > 0) {
                    var1.anInt919 += (int) (128.0D * Math.pow(2.0D, var8 * (double) var6.anInt1764) + 0.5D);
                } else {
                    var1.anInt919 += 128;
                }

                while (var1.anInt235 < var6.aByteArray1768.length - 2 && var1.anInt919 > (var6.aByteArray1768[var1.anInt235 + 2] & 255) << 8) {
                    var1.anInt235 += 2;
                }

                if (var6.aByteArray1768.length - 2 == var1.anInt235) {
                    var7 = true;
                }
            }

            if (var7) {
                var1.aNode_Sub10_Sub2_1773.method558(var1.anInt981);
                if (var2 != null) {
                    var1.aNode_Sub10_Sub2_1773.method429(var2, var3, var4);
                } else {
                    var1.aNode_Sub10_Sub2_1773.method428(var4);
                }

                if (var1.aNode_Sub10_Sub2_1773.method543()) {
                    this.aNode_Sub10_Sub4_1730.aNode_Sub10_Sub1_1950.method430(var1.aNode_Sub10_Sub2_1773);
                }

                var1.method308();
                if (var1.anInt919 >= 0) {
                    var1.unlink();
                    if (var1.anInt327 > 0 && this.aNode_Sub20ArrayArray1736[var1.anInt204][var1.anInt327] == var1) {
                        this.aNode_Sub20ArrayArray1736[var1.anInt204][var1.anInt327] = null;
                    }
                }

                return true;
            }
            var1.aNode_Sub10_Sub2_1773.method531(var1.anInt981, this.method936(var1), this.method921(var1));
            return false;
        }
        var1.method308();
        var1.unlink();
        if (var1.anInt327 > 0 && this.aNode_Sub20ArrayArray1736[var1.anInt204][var1.anInt327] == var1) {
            this.aNode_Sub20ArrayArray1736[var1.anInt204][var1.anInt327] = null;
        }

        return true;
    }

    void method926(Node_Sub20 var1, boolean var2) {
        int var3 = var1.aNode_Sub11_Sub1_1771.aByteArray846.length;
        int var5;
        if (var2 && var1.aNode_Sub11_Sub1_1771.aBoolean845) {
            int var4 = var3 + var3 - var1.aNode_Sub11_Sub1_1771.anInt206;
            var5 = (int) ((long) var4 * (long) this.anIntArray1281[var1.anInt204] >> 6);
            var3 <<= 8;
            if (var5 >= var3) {
                var5 = var3 + var3 - 1 - var5;
                var1.aNode_Sub10_Sub2_1773.method540();
            }
        } else {
            var5 = (int) ((long) var3 * (long) this.anIntArray1281[var1.anInt204] >> 6);
        }

        var1.aNode_Sub10_Sub2_1773.method547(var5);
    }

    void method738(int var1, int var2, int var3) {
    }

    int method921(Node_Sub20 var1) {
        int var2 = this.anIntArray957[var1.anInt204];
        return var2 < 8192 ? var1.anInt220 * var2 + 32 >> 6 : 16384 - ((128 - var1.anInt220) * (16384 - var2) + 32 >> 6);
    }

    void method564(int var1, int var2, int var3) {
        Node_Sub20 var4 = this.aNode_Sub20ArrayArray1735[var1][var2];
        if (var4 != null) {
            this.aNode_Sub20ArrayArray1735[var1][var2] = null;
            if ((this.anIntArray1734[var1] & 2) != 0) {
                for (Node_Sub20 var5 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.method995(); var5 != null; var5 = this.aNode_Sub10_Sub4_1730.aNodeDeque739.next()) {
                    if (var4.anInt204 == var5.anInt204 && var5.anInt919 < 0 && var4 != var5) {
                        var4.anInt919 = 0;
                        break;
                    }
                }
            } else {
                var4.anInt919 = 0;
            }

        }
    }

    int method937(Node_Sub20 var1) {
        int var2 = var1.anInt217 + (var1.anInt214 * var1.anInt226 >> 12);
        var2 += this.anIntArray240[var1.anInt204] * (this.anIntArray1276[var1.anInt204] - 8192) >> 12;
        Class138 var3 = var1.aClass138_1774;
        int var4;
        if (var3.anInt1765 > 0 && (var3.anInt1767 > 0 || this.anIntArray404[var1.anInt204] > 0)) {
            var4 = var3.anInt1767 << 2;
            int var5 = var3.anInt1763 << 1;
            if (var1.anInt230 < var5) {
                var4 = var1.anInt230 * var4 / var5;
            }

            var4 += this.anIntArray404[var1.anInt204] >> 7;
            double var6 = Math.sin((double) (var1.anInt222 & 511) * 0.01227184630308513D);
            var2 += (int) (var6 * (double) var4);
        }

        var4 = (int) ((double) (var1.aNode_Sub11_Sub1_1771.anInt204 * 256) * Math.pow(2.0D, (double) var2 * 3.255208333333333E-4D) / (double) Class84.anInt870 + 0.5D);
        return var4 < 1 ? 1 : var4;
    }

    void method839(int var1) {
        int var2 = var1 & 240;
        int var3;
        int var4;
        int var5;
        if (var2 == 128) {
            var3 = var1 & 15;
            var4 = var1 >> 8 & 127;
            var5 = var1 >> 16 & 127;
            this.method564(var3, var4, var5);
        } else if (var2 == 144) {
            var3 = var1 & 15;
            var4 = var1 >> 8 & 127;
            var5 = var1 >> 16 & 127;
            if (var5 > 0) {
                this.method931(var3, var4, var5);
            } else {
                this.method564(var3, var4, 64);
            }

        } else if (var2 == 160) {
            var3 = var1 & 15;
            var4 = var1 >> 8 & 127;
            var5 = var1 >> 16 & 127;
            this.method738(var3, var4, var5);
        } else if (var2 == 176) {
            var3 = var1 & 15;
            var4 = var1 >> 8 & 127;
            var5 = var1 >> 16 & 127;
            if (var4 == 0) {
                this.anIntArray1271[var3] = (var5 << 14) + (this.anIntArray1271[var3] & -2080769);
            }

            if (var4 == 32) {
                this.anIntArray1271[var3] = (var5 << 7) + (this.anIntArray1271[var3] & -16257);
            }

            if (var4 == 1) {
                this.anIntArray404[var3] = (this.anIntArray404[var3] & -16257) + (var5 << 7);
            }

            if (var4 == 33) {
                this.anIntArray404[var3] = (this.anIntArray404[var3] & -128) + var5;
            }

            if (var4 == 5) {
                this.anIntArray1171[var3] = (this.anIntArray1171[var3] & -16257) + (var5 << 7);
            }

            if (var4 == 37) {
                this.anIntArray1171[var3] = (this.anIntArray1171[var3] & -128) + var5;
            }

            if (var4 == 7) {
                this.anIntArray950[var3] = (var5 << 7) + (this.anIntArray950[var3] & -16257);
            }

            if (var4 == 39) {
                this.anIntArray950[var3] = (this.anIntArray950[var3] & -128) + var5;
            }

            if (var4 == 10) {
                this.anIntArray957[var3] = (this.anIntArray957[var3] & -16257) + (var5 << 7);
            }

            if (var4 == 42) {
                this.anIntArray957[var3] = var5 + (this.anIntArray957[var3] & -128);
            }

            if (var4 == 11) {
                this.anIntArray934[var3] = (var5 << 7) + (this.anIntArray934[var3] & -16257);
            }

            if (var4 == 43) {
                this.anIntArray934[var3] = (this.anIntArray934[var3] & -128) + var5;
            }

            if (var4 == 64) {
                if (var5 >= 64) {
                    this.anIntArray1734[var3] |= 1;
                } else {
                    this.anIntArray1734[var3] &= -2;
                }
            }

            if (var4 == 65) {
                if (var5 >= 64) {
                    this.anIntArray1734[var3] |= 2;
                } else {
                    this.method918(var3);
                    this.anIntArray1734[var3] &= -3;
                }
            }

            if (var4 == 99) {
                this.anIntArray1082[var3] = (var5 << 7) + (this.anIntArray1082[var3] & 127);
            }

            if (var4 == 98) {
                this.anIntArray1082[var3] = (this.anIntArray1082[var3] & 16256) + var5;
            }

            if (var4 == 101) {
                this.anIntArray1082[var3] = (var5 << 7) + (this.anIntArray1082[var3] & 127) + 16384;
            }

            if (var4 == 100) {
                this.anIntArray1082[var3] = var5 + (this.anIntArray1082[var3] & 16256) + 16384;
            }

            if (var4 == 120) {
                this.method553(var3);
            }

            if (var4 == 121) {
                this.method925(var3);
            }

            if (var4 == 123) {
                this.method930(var3);
            }

            int var6;
            if (var4 == 6) {
                var6 = this.anIntArray1082[var3];
                if (var6 == 16384) {
                    this.anIntArray240[var3] = (var5 << 7) + (this.anIntArray240[var3] & -16257);
                }
            }

            if (var4 == 38) {
                var6 = this.anIntArray1082[var3];
                if (var6 == 16384) {
                    this.anIntArray240[var3] = var5 + (this.anIntArray240[var3] & -128);
                }
            }

            if (var4 == 16) {
                this.anIntArray1281[var3] = (var5 << 7) + (this.anIntArray1281[var3] & -16257);
            }

            if (var4 == 48) {
                this.anIntArray1281[var3] = (this.anIntArray1281[var3] & -128) + var5;
            }

            if (var4 == 81) {
                if (var5 >= 64) {
                    this.anIntArray1734[var3] |= 4;
                } else {
                    this.method932(var3);
                    this.anIntArray1734[var3] &= -5;
                }
            }

            if (var4 == 17) {
                this.method923(var3, (this.anIntArray1081[var3] & -16257) + (var5 << 7));
            }

            if (var4 == 49) {
                this.method923(var3, var5 + (this.anIntArray1081[var3] & -128));
            }

        } else if (var2 == 192) {
            var3 = var1 & 15;
            var4 = var1 >> 8 & 127;
            this.method924(var3, var4 + this.anIntArray1271[var3]);
        } else if (var2 == 208) {
            var3 = var1 & 15;
            var4 = var1 >> 8 & 127;
            this.method917(var3, var4);
        } else if (var2 == 224) {
            var3 = var1 & 15;
            var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
            this.method938(var3, var4);
        } else {
            var2 = var1 & 255;
            if (var2 == 255) {
                this.method928();
            }
        }
    }

    public synchronized boolean method922() {
        return this.aClass135_1737.method947();
    }

    public synchronized void method554(int var1, int var2) {
        this.method934(var1, var2);
    }
}
