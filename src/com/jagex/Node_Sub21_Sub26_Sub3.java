package com.jagex;

import java.util.Random;

public abstract class Node_Sub21_Sub26_Sub3 extends Node_Sub21_Sub26 {
    public static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array2131;
    static int anInt235 = 0;
    static String[] aStringArray2132 = new String[100];
    static int anInt981 = 0;
    static Random aRandom2133 = new Random();
    static int anInt225 = -1;
    static int anInt212 = -1;
    static int anInt919 = -1;
    static int anInt222 = 256;
    static int anInt229 = 0;
    static int anInt230 = 0;
    static int anInt228 = -1;
    public int anInt221 = 0;
    public int anInt217;
    public int anInt220;
    int[] anIntArray342;
    int[] anIntArray950;
    int[] anIntArray2134;
    int[] anIntArray340;
    byte[] aByteArray943;
    byte[][] aByteArrayArray984 = new byte[256][];
    int[] anIntArray957;

    Node_Sub21_Sub26_Sub3(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        this.anIntArray2134 = var2;
        this.anIntArray957 = var3;
        this.anIntArray340 = var4;
        this.anIntArray950 = var5;
        this.method1176(var1);
        this.aByteArrayArray984 = var7;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;

        for (int var10 = 0; var10 < 256; ++var10) {
            if (this.anIntArray957[var10] < var8 && this.anIntArray950[var10] != 0) {
                var8 = this.anIntArray957[var10];
            }

            if (this.anIntArray957[var10] + this.anIntArray950[var10] > var9) {
                var9 = this.anIntArray957[var10] + this.anIntArray950[var10];
            }
        }

        this.anInt220 = this.anInt221 - var8;
        this.anInt217 = var9 - this.anInt221;
    }

    Node_Sub21_Sub26_Sub3(byte[] var1) {
        this.method1176(var1);
    }

    static int method1172(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
        int var7 = var2[var5];
        int var8 = var7 + var4[var5];
        int var9 = var2[var6];
        int var10 = var9 + var4[var6];
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }

        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }

        int var13 = var3[var5];
        if (var3[var6] < var13) {
            var13 = var3[var6];
        }

        byte[] var14 = var1[var5];
        byte[] var15 = var0[var6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;

        for (int var18 = var11; var18 < var12; ++var18) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }

        return -var13;
    }

    public static String method1177(String var0) {
        int var1 = var0.length();
        int var2 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            char var4 = var0.charAt(var3);
            if (var4 == '<' || var4 == '>') {
                var2 += 3;
            }
        }

        StringBuilder var5 = new StringBuilder(var1 + var2);

        for (int var7 = 0; var7 < var1; ++var7) {
            char var6 = var0.charAt(var7);
            if (var6 == '<') {
                var5.append("<lt>");
            } else if (var6 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var6);
            }
        }

        return var5.toString();
    }

    static void method1175(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            for (var11 = var9; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1173(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var1 + var2 * anInt749;
        int var8 = anInt749 - var3;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var2 < anInt1257) {
            var11 = anInt1257 - var2;
            var4 -= var11;
            var2 = anInt1257;
            var10 += var11 * var3;
            var7 += var11 * anInt749;
        }

        if (var2 + var4 > anInt753) {
            var4 -= var2 + var4 - anInt753;
        }

        if (var1 < anInt754) {
            var11 = anInt754 - var1;
            var3 -= var11;
            var1 = anInt754;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var1 + var3 > anInt745) {
            var11 = var1 + var3 - anInt745;
            var3 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var3 > 0 && var4 > 0) {
            method1162(anIntArray953, var0, var5, var10, var7, var3, var4, var8, var9, var6);
        }
    }

    static void method1162(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
        var9 = 256 - var9;

        for (int var10 = -var6; var10 < 0; ++var10) {
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    int var12 = var0[var4];
                    var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1171(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = var1 + var2 * anInt749;
        int var7 = anInt749 - var3;
        int var8 = 0;
        int var9 = 0;
        int var10;
        if (var2 < anInt1257) {
            var10 = anInt1257 - var2;
            var4 -= var10;
            var2 = anInt1257;
            var9 += var10 * var3;
            var6 += var10 * anInt749;
        }

        if (var2 + var4 > anInt753) {
            var4 -= var2 + var4 - anInt753;
        }

        if (var1 < anInt754) {
            var10 = anInt754 - var1;
            var3 -= var10;
            var1 = anInt754;
            var9 += var10;
            var6 += var10;
            var8 += var10;
            var7 += var10;
        }

        if (var1 + var3 > anInt745) {
            var10 = var1 + var3 - anInt745;
            var3 -= var10;
            var8 += var10;
            var7 += var10;
        }

        if (var3 > 0 && var4 > 0) {
            method1175(anIntArray953, var0, var5, var9, var6, var3, var4, var7, var8);
        }
    }

    abstract void method1150(byte[] var1, int var2, int var3, int var4, int var5, int var6);

    int method1159(char var1) {
        if (var1 == 160) {
            var1 = ' ';
        }

        return this.anIntArray342[Class149.method1002(var1) & 255];
    }

    public int method1181(String var1, int[] var2, String[] var3) {
        if (var1 == null) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            StringBuilder var6 = new StringBuilder(100);
            int var7 = -1;
            int var8 = 0;
            byte var9 = 0;
            int var10 = -1;
            char var11 = 0;
            int var12 = 0;
            int var13 = var1.length();

            for (int var14 = 0; var14 < var13; ++var14) {
                char var15 = var1.charAt(var14);
                if (var15 == '<') {
                    var10 = var14;
                } else {
                    if (var15 == '>' && var10 != -1) {
                        String var17 = var1.substring(var10 + 1, var14);
                        var10 = -1;
                        var6.append('<');
                        var6.append(var17);
                        var6.append('>');
                        if (var17.equals("br")) {
                            var3[var12] = var6.toString().substring(var5, var6.length());
                            ++var12;
                            var5 = var6.length();
                            var4 = 0;
                            var7 = -1;
                            var11 = 0;
                        } else if (var17.equals("lt")) {
                            var4 += this.method1159('<');
                            if (this.aByteArray943 != null && var11 != -1) {
                                var4 += this.aByteArray943[(var11 << 8) + 60];
                            }

                            var11 = '<';
                        } else if (var17.equals("gt")) {
                            var4 += this.method1159('>');
                            if (this.aByteArray943 != null && var11 != -1) {
                                var4 += this.aByteArray943[(var11 << 8) + 62];
                            }

                            var11 = '>';
                        } else if (var17.startsWith("img=")) {
                            try {
                                int var18 = Class85.method495(var17.substring(4));
                                var4 += aNode_Sub21_Sub26_Sub2Array2131[var18].anInt221;
                                var11 = 0;
                            } catch (Exception var20) {
                            }
                        }

                        var15 = 0;
                    }

                    if (var10 == -1) {
                        if (var15 != 0) {
                            var6.append(var15);
                            var4 += this.method1159(var15);
                            if (this.aByteArray943 != null && var11 != -1) {
                                var4 += this.aByteArray943[(var11 << 8) + var15];
                            }

                            var11 = var15;
                        }

                        if (var15 == ' ') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 1;
                        }

                        if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                            var3[var12] = var6.toString().substring(var5, var7 - var9);
                            ++var12;
                            var5 = var7;
                            var7 = -1;
                            var4 -= var8;
                            var11 = 0;
                        }

                        if (var15 == '-') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 0;
                        }
                    }
                }
            }

            String var16 = var6.toString();
            if (var16.length() > var5) {
                var3[var12++] = var16.substring(var5, var16.length());
            }

            return var12;
        }
    }

    public int method1178(String var1, int var2) {
        int var3 = this.method1181(var1, new int[]{var2}, aStringArray2132);
        int var4 = 0;

        for (int var5 = 0; var5 < var3; ++var5) {
            int var6 = this.getTextWidth(aStringArray2132[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }

        return var4;
    }

    public int method1168(String var1, int var2) {
        return this.method1181(var1, new int[]{var2}, aStringArray2132);
    }

    public void method1163(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method1164(var4, var5);
            anInt222 = var6;
            this.method1169(var1, var2, var3);
        }
    }

    public void method1161(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method1164(var4, var5);
            this.method1169(var1, var2 - this.getTextWidth(var1) / 2, var3);
        }
    }

    public int method1184(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        if (var1 == null) {
            return 0;
        } else {
            this.method1164(var6, var7);
            if (var10 == 0) {
                var10 = this.anInt221;
            }

            int[] var11 = new int[]{var4};
            if (var5 < this.anInt220 + this.anInt217 + var10 && var5 < var10 + var10) {
                var11 = null;
            }

            int var12 = this.method1181(var1, var11, aStringArray2132);
            if (var9 == 3 && var12 == 1) {
                var9 = 1;
            }

            int var13;
            int var14;
            if (var9 == 0) {
                var13 = var3 + this.anInt220;
            } else if (var9 == 1) {
                var13 = var3 + this.anInt220 + (var5 - this.anInt220 - this.anInt217 - (var12 - 1) * var10) / 2;
            } else if (var9 == 2) {
                var13 = var3 + var5 - this.anInt217 - (var12 - 1) * var10;
            } else {
                var14 = (var5 - this.anInt220 - this.anInt217 - (var12 - 1) * var10) / (var12 + 1);
                if (var14 < 0) {
                    var14 = 0;
                }

                var13 = var3 + this.anInt220 + var14;
                var10 += var14;
            }

            for (var14 = 0; var14 < var12; ++var14) {
                if (var8 == 0) {
                    this.method1169(aStringArray2132[var14], var2, var13);
                } else if (var8 == 1) {
                    this.method1169(aStringArray2132[var14], var2 + (var4 - this.getTextWidth(aStringArray2132[var14])) / 2, var13);
                } else if (var8 == 2) {
                    this.method1169(aStringArray2132[var14], var2 + var4 - this.getTextWidth(aStringArray2132[var14]), var13);
                } else if (var14 == var12 - 1) {
                    this.method1169(aStringArray2132[var14], var2, var13);
                } else {
                    this.method1167(aStringArray2132[var14], var4);
                    this.method1169(aStringArray2132[var14], var2, var13);
                    anInt229 = 0;
                }

                var13 += var10;
            }

            return var12;
        }
    }

    public void method1179(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method1164(var4, var5);
            int[] var7 = new int[var1.length()];
            int[] var8 = new int[var1.length()];

            for (int var9 = 0; var9 < var1.length(); ++var9) {
                var7[var9] = (int) (Math.sin((double) var9 / 5.0D + (double) var6 / 5.0D) * 5.0D);
                var8[var9] = (int) (Math.sin((double) var9 / 3.0D + (double) var6 / 5.0D) * 5.0D);
            }

            this.method1160(var1, var2 - this.getTextWidth(var1) / 2, var3, var7, var8);
        }
    }

    public void method1182(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (var1 != null) {
            this.method1164(var4, var5);
            double var8 = 7.0D - (double) var7 / 8.0D;
            if (var8 < 0.0D) {
                var8 = 0.0D;
            }

            int[] var10 = new int[var1.length()];

            for (int var11 = 0; var11 < var1.length(); ++var11) {
                var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) var6 / 1.0D) * var8);
            }

            this.method1160(var1, var2 - this.getTextWidth(var1) / 2, var3, null, var10);
        }
    }

    public void method1180(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method1164(var4, var5);
            int[] var7 = new int[var1.length()];

            for (int var8 = 0; var8 < var1.length(); ++var8) {
                var7[var8] = (int) (Math.sin((double) var8 / 2.0D + (double) var6 / 5.0D) * 5.0D);
            }

            this.method1160(var1, var2 - this.getTextWidth(var1) / 2, var3, null, var7);
        }
    }

    void method1174(String var1) {
        try {
            String var2;
            int var3;
            if (var1.startsWith("col=")) {
                var2 = var1.substring(4);
                var3 = Class65.method388(var2, 16, true);
                anInt230 = var3;
            } else if (var1.equals("/col")) {
                anInt230 = anInt235;
            } else if (var1.startsWith("str=")) {
                var2 = var1.substring(4);
                var3 = Class65.method388(var2, 16, true);
                anInt228 = var3;
            } else if (var1.equals("str")) {
                anInt228 = 8388608;
            } else if (var1.equals("/str")) {
                anInt228 = -1;
            } else if (var1.startsWith("u=")) {
                var2 = var1.substring(2);
                var3 = Class65.method388(var2, 16, true);
                anInt225 = var3;
            } else if (var1.equals("u")) {
                anInt225 = 0;
            } else if (var1.equals("/u")) {
                anInt225 = -1;
            } else if (var1.startsWith("shad=")) {
                var2 = var1.substring(5);
                var3 = Class65.method388(var2, 16, true);
                anInt919 = var3;
            } else if (var1.equals("shad")) {
                anInt919 = 0;
            } else if (var1.equals("/shad")) {
                anInt919 = anInt212;
            } else if (var1.equals("br")) {
                this.method1164(anInt235, anInt212);
            }
        } catch (Exception var5) {
        }

    }

    void method1169(String var1, int var2, int var3) {
        var3 -= this.anInt221;
        int var4 = -1;
        int var5 = -1;

        for (int var6 = 0; var6 < var1.length(); ++var6) {
            if (var1.charAt(var6) != 0) {
                char var7 = (char) (Class149.method1002(var1.charAt(var6)) & 255);
                if (var7 == '<') {
                    var4 = var6;
                } else {
                    int var10;
                    if (var7 == '>' && var4 != -1) {
                        String var8 = var1.substring(var4 + 1, var6);
                        var4 = -1;
                        if (var8.equals("lt")) {
                            var7 = '<';
                        } else {
                            if (!var8.equals("gt")) {
                                if (var8.startsWith("img=")) {
                                    try {
                                        var10 = Class85.method495(var8.substring(4));
                                        Node_Sub21_Sub26_Sub2 var12 = aNode_Sub21_Sub26_Sub2Array2131[var10];
                                        var12.method1155(var2, var3 + this.anInt221 - var12.anInt220);
                                        var2 += var12.anInt221;
                                        var5 = -1;
                                    } catch (Exception var14) {
                                    }
                                } else {
                                    this.method1174(var8);
                                }
                                continue;
                            }

                            var7 = '>';
                        }
                    }

                    if (var7 == 160) {
                        var7 = ' ';
                    }

                    if (var4 == -1) {
                        if (this.aByteArray943 != null && var5 != -1) {
                            var2 += this.aByteArray943[(var5 << 8) + var7];
                        }

                        int var9 = this.anIntArray340[var7];
                        var10 = this.anIntArray950[var7];
                        if (var7 != ' ') {
                            if (anInt222 == 256) {
                                if (anInt919 != -1) {
                                    method1171(this.aByteArrayArray984[var7], var2 + this.anIntArray2134[var7] + 1, var3 + this.anIntArray957[var7] + 1, var9, var10, anInt919);
                                }

                                this.method1150(this.aByteArrayArray984[var7], var2 + this.anIntArray2134[var7], var3 + this.anIntArray957[var7], var9, var10, anInt230);
                            } else {
                                if (anInt919 != -1) {
                                    method1173(this.aByteArrayArray984[var7], var2 + this.anIntArray2134[var7] + 1, var3 + this.anIntArray957[var7] + 1, var9, var10, anInt919, anInt222);
                                }

                                this.method1151(this.aByteArrayArray984[var7], var2 + this.anIntArray2134[var7], var3 + this.anIntArray957[var7], var9, var10, anInt230, anInt222);
                            }
                        } else if (anInt229 > 0) {
                            anInt981 += anInt229;
                            var2 += anInt981 >> 8;
                            anInt981 &= 255;
                        }

                        int var11 = this.anIntArray342[var7];
                        if (anInt228 != -1) {
                            method1214(var2, var3 + (int) ((double) this.anInt221 * 0.7D), var11, anInt228);
                        }

                        if (anInt225 != -1) {
                            method1214(var2, var3 + this.anInt221 + 1, var11, anInt225);
                        }

                        var2 += var11;
                        var5 = var7;
                    }
                }
            }
        }

    }

    void method1160(String var1, int var2, int var3, int[] var4, int[] var5) {
        var3 -= this.anInt221;
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;

        for (int var9 = 0; var9 < var1.length(); ++var9) {
            if (var1.charAt(var9) != 0) {
                char var10 = (char) (Class149.method1002(var1.charAt(var9)) & 255);
                if (var10 == '<') {
                    var6 = var9;
                } else {
                    int var13;
                    int var14;
                    int var15;
                    if (var10 == '>' && var6 != -1) {
                        String var11 = var1.substring(var6 + 1, var9);
                        var6 = -1;
                        if (var11.equals("lt")) {
                            var10 = '<';
                        } else {
                            if (!var11.equals("gt")) {
                                if (var11.startsWith("img=")) {
                                    try {
                                        if (var4 != null) {
                                            var13 = var4[var8];
                                        } else {
                                            var13 = 0;
                                        }

                                        if (var5 != null) {
                                            var14 = var5[var8];
                                        } else {
                                            var14 = 0;
                                        }

                                        ++var8;
                                        var15 = Class85.method495(var11.substring(4));
                                        Node_Sub21_Sub26_Sub2 var17 = aNode_Sub21_Sub26_Sub2Array2131[var15];
                                        var17.method1155(var2 + var13, var3 + this.anInt221 - var17.anInt220 + var14);
                                        var2 += var17.anInt221;
                                        var7 = -1;
                                    } catch (Exception var19) {
                                    }
                                } else {
                                    this.method1174(var11);
                                }
                                continue;
                            }

                            var10 = '>';
                        }
                    }

                    if (var10 == 160) {
                        var10 = ' ';
                    }

                    if (var6 == -1) {
                        if (this.aByteArray943 != null && var7 != -1) {
                            var2 += this.aByteArray943[(var7 << 8) + var10];
                        }

                        int var12 = this.anIntArray340[var10];
                        var13 = this.anIntArray950[var10];
                        if (var4 != null) {
                            var14 = var4[var8];
                        } else {
                            var14 = 0;
                        }

                        if (var5 != null) {
                            var15 = var5[var8];
                        } else {
                            var15 = 0;
                        }

                        ++var8;
                        if (var10 != ' ') {
                            if (anInt222 == 256) {
                                if (anInt919 != -1) {
                                    method1171(this.aByteArrayArray984[var10], var2 + this.anIntArray2134[var10] + 1 + var14, var3 + this.anIntArray957[var10] + 1 + var15, var12, var13, anInt919);
                                }

                                this.method1150(this.aByteArrayArray984[var10], var2 + this.anIntArray2134[var10] + var14, var3 + this.anIntArray957[var10] + var15, var12, var13, anInt230);
                            } else {
                                if (anInt919 != -1) {
                                    method1173(this.aByteArrayArray984[var10], var2 + this.anIntArray2134[var10] + 1 + var14, var3 + this.anIntArray957[var10] + 1 + var15, var12, var13, anInt919, anInt222);
                                }

                                this.method1151(this.aByteArrayArray984[var10], var2 + this.anIntArray2134[var10] + var14, var3 + this.anIntArray957[var10] + var15, var12, var13, anInt230, anInt222);
                            }
                        } else if (anInt229 > 0) {
                            anInt981 += anInt229;
                            var2 += anInt981 >> 8;
                            anInt981 &= 255;
                        }

                        int var16 = this.anIntArray342[var10];
                        if (anInt228 != -1) {
                            method1214(var2, var3 + (int) ((double) this.anInt221 * 0.7D), var16, anInt228);
                        }

                        if (anInt225 != -1) {
                            method1214(var2, var3 + this.anInt221, var16, anInt225);
                        }

                        var2 += var16;
                        var7 = var10;
                    }
                }
            }
        }

    }

    public void method1170(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method1164(var4, var5);
            this.method1169(var1, var2, var3);
        }
    }

    void method1164(int var1, int var2) {
        anInt228 = -1;
        anInt225 = -1;
        anInt212 = var2;
        anInt919 = var2;
        anInt235 = var1;
        anInt230 = var1;
        anInt222 = 256;
        anInt229 = 0;
        anInt981 = 0;
    }

    public void method1183(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method1164(var4, var5);
            this.method1169(var1, var2 - this.getTextWidth(var1), var3);
        }
    }

    public int getTextWidth(String var1) {
        if (var1 == null) {
            return 0;
        } else {
            int var2 = -1;
            int var3 = -1;
            int var4 = 0;

            for (int var5 = 0; var5 < var1.length(); ++var5) {
                char var6 = var1.charAt(var5);
                if (var6 == '<') {
                    var2 = var5;
                } else {
                    if (var6 == '>' && var2 != -1) {
                        String var7 = var1.substring(var2 + 1, var5);
                        var2 = -1;
                        if (var7.equals("lt")) {
                            var6 = '<';
                        } else {
                            if (!var7.equals("gt")) {
                                if (var7.startsWith("img=")) {
                                    try {
                                        int var8 = Class85.method495(var7.substring(4));
                                        var4 += aNode_Sub21_Sub26_Sub2Array2131[var8].anInt221;
                                        var3 = -1;
                                    } catch (Exception var10) {
                                    }
                                }
                                continue;
                            }

                            var6 = '>';
                        }
                    }

                    if (var6 == 160) {
                        var6 = ' ';
                    }

                    if (var2 == -1) {
                        var4 += this.anIntArray342[(char) (Class149.method1002(var6) & 255)];
                        if (this.aByteArray943 != null && var3 != -1) {
                            var4 += this.aByteArray943[(var3 << 8) + var6];
                        }

                        var3 = var6;
                    }
                }
            }

            return var4;
        }
    }

    void method1167(String var1, int var2) {
        int var3 = 0;
        boolean var4 = false;

        for (int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
                var4 = true;
            } else if (var6 == '>') {
                var4 = false;
            } else if (!var4 && var6 == ' ') {
                ++var3;
            }
        }

        if (var3 > 0) {
            anInt229 = (var2 - this.getTextWidth(var1) << 8) / var3;
        }

    }

    public void method1165(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method1164(var4, var5);
            aRandom2133.setSeed((long) var6);
            anInt222 = (aRandom2133.nextInt() & 31) + 192;
            int[] var7 = new int[var1.length()];
            int var8 = 0;

            for (int var9 = 0; var9 < var1.length(); ++var9) {
                var7[var9] = var8;
                if ((aRandom2133.nextInt() & 3) == 0) {
                    ++var8;
                }
            }

            this.method1160(var1, var2, var3, var7, null);
        }
    }

    abstract void method1151(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    void method1176(byte[] var1) {
        this.anIntArray342 = new int[256];
        int var2;
        if (var1.length == 257) {
            for (var2 = 0; var2 < this.anIntArray342.length; ++var2) {
                this.anIntArray342[var2] = var1[var2] & 255;
            }

            this.anInt221 = var1[256] & 255;
        } else {
            var2 = 0;

            for (int var3 = 0; var3 < 256; ++var3) {
                this.anIntArray342[var3] = var1[var2++] & 255;
            }

            int[] var4 = new int[256];
            int[] var5 = new int[256];

            int var6;
            for (var6 = 0; var6 < 256; ++var6) {
                var4[var6] = var1[var2++] & 255;
            }

            for (var6 = 0; var6 < 256; ++var6) {
                var5[var6] = var1[var2++] & 255;
            }

            byte[][] var7 = new byte[256][];

            int var10;
            for (int var8 = 0; var8 < 256; ++var8) {
                var7[var8] = new byte[var4[var8]];
                byte var9 = 0;

                for (var10 = 0; var10 < var7[var8].length; ++var10) {
                    var9 += var1[var2++];
                    var7[var8][var10] = var9;
                }
            }

            byte[][] var11 = new byte[256][];

            int var13;
            for (var13 = 0; var13 < 256; ++var13) {
                var11[var13] = new byte[var4[var13]];
                byte var14 = 0;

                for (int var12 = 0; var12 < var11[var13].length; ++var12) {
                    var14 += var1[var2++];
                    var11[var13][var12] = var14;
                }
            }

            this.aByteArray943 = new byte[65536];

            for (var13 = 0; var13 < 256; ++var13) {
                if (var13 != 32 && var13 != 160) {
                    for (var10 = 0; var10 < 256; ++var10) {
                        if (var10 != 32 && var10 != 160) {
                            this.aByteArray943[(var13 << 8) + var10] = (byte) method1172(var7, var11, var5, this.anIntArray342, var4, var13, var10);
                        }
                    }
                }
            }

            this.anInt221 = var5[32] + var4[32];
        }

    }
}
