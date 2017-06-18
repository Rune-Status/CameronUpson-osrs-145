package com.jagex;

public class Node_Sub13 extends Node {
    static int anInt214;
    static boolean aBoolean980 = false;
    static byte[] aByteArray978;
    static int anInt220;
    static int anInt217;
    static int anInt226;
    static Class88[] aClass88Array985;
    static float[] aFloatArray974;
    static Class91[] aClass91Array973;
    static Class86[] aClass86Array977;
    static boolean[] aBooleanArray990;
    static Class87[] aClass87Array982;
    static float[] aFloatArray992;
    static int[] anIntArray987;
    static float[] aFloatArray993;
    static float[] aFloatArray988;
    static float[] aFloatArray989;
    static float[] aFloatArray991;
    static float[] aFloatArray976;
    static int[] anIntArray975;
    static int[] anIntArray983;
    int anInt209;
    int anInt206;
    int anInt232;
    int anInt327;
    boolean aBoolean994;
    int anInt745;
    float[] aFloatArray986;
    int anInt981;
    boolean aBoolean215;
    int anInt219;
    byte[] aByteArray979;
    int anInt754;
    byte[][] aByteArrayArray984;

    Node_Sub13(byte[] var1) {
        this.method592(var1);
    }

    static void method595(byte[] var0, int var1) {
        aByteArray978 = var0;
        anInt220 = var1;
        anInt217 = 0;
    }

    static int method591() {
        int var0 = aByteArray978[anInt220] >> anInt217 & 1;
        ++anInt217;
        anInt220 += anInt217 >> 3;
        anInt217 &= 7;
        return var0;
    }

    static boolean method589(ReferenceTable var0) {
        if (!aBoolean980) {
            byte[] var1 = var0.unpack(0, 0);
            if (var1 == null) {
                return false;
            }

            method594(var1);
            aBoolean980 = true;
        }

        return true;
    }

    static Node_Sub13 method596(ReferenceTable var0, int var1, int var2) {
        if (!method589(var0)) {
            var0.method1102(var1, var2);
            return null;
        }
        byte[] var3 = var0.unpack(var1, var2);
        return var3 == null ? null : new Node_Sub13(var3);
    }

    static void method594(byte[] var0) {
        method595(var0, 0);
        anInt214 = 1 << method590(4);
        anInt226 = 1 << method590(4);
        aFloatArray992 = new float[anInt226];

        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        for (var1 = 0; var1 < 2; ++var1) {
            var2 = var1 != 0 ? anInt226 : anInt214;
            var3 = var2 >> 1;
            var4 = var2 >> 2;
            var5 = var2 >> 3;
            float[] var6 = new float[var3];

            for (int var7 = 0; var7 < var4; ++var7) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }

            float[] var8 = new float[var3];

            for (int var9 = 0; var9 < var4; ++var9) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }

            float[] var10 = new float[var4];

            for (int var11 = 0; var11 < var5; ++var11) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }

            int[] var12 = new int[var5];
            int var13 = Class122.method809(var5 - 1);

            for (int var14 = 0; var14 < var5; ++var14) {
                int var17 = var14;
                int var18 = var13;

                int var19;
                for (var19 = 0; var18 > 0; --var18) {
                    var19 = var19 << 1 | var17 & 1;
                    var17 >>>= 1;
                }

                var12[var14] = var19;
            }

            if (var1 != 0) {
                aFloatArray989 = var6;
                aFloatArray991 = var8;
                aFloatArray976 = var10;
                anIntArray983 = var12;
            } else {
                aFloatArray974 = var6;
                aFloatArray993 = var8;
                aFloatArray988 = var10;
                anIntArray975 = var12;
            }
        }

        var1 = method590(8) + 1;
        aClass88Array985 = new Class88[var1];

        for (var2 = 0; var2 < var1; ++var2) {
            aClass88Array985[var2] = new Class88();
        }

        var2 = method590(6) + 1;

        for (var3 = 0; var3 < var2; ++var3) {
            method590(16);
        }

        var2 = method590(6) + 1;
        aClass87Array982 = new Class87[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            aClass87Array982[var3] = new Class87();
        }

        var3 = method590(6) + 1;
        aClass91Array973 = new Class91[var3];

        for (var4 = 0; var4 < var3; ++var4) {
            aClass91Array973[var4] = new Class91();
        }

        var4 = method590(6) + 1;
        aClass86Array977 = new Class86[var4];

        for (var5 = 0; var5 < var4; ++var5) {
            aClass86Array977[var5] = new Class86();
        }

        var5 = method590(6) + 1;
        aBooleanArray990 = new boolean[var5];
        anIntArray987 = new int[var5];

        for (int var20 = 0; var20 < var5; ++var20) {
            aBooleanArray990[var20] = method591() != 0;
            method590(16);
            method590(16);
            anIntArray987[var20] = method590(8);
        }

    }

    static float method587(int var0) {
        int var1 = var0 & 2097151;
        int var2 = var0 & Integer.MIN_VALUE;
        int var3 = (var0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }

        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    static int method590(int var0) {
        int var1 = 0;

        int var2;
        int var3;
        for (var2 = 0; var0 >= 8 - anInt217; var0 -= var3) {
            var3 = 8 - anInt217;
            int var4 = (1 << var3) - 1;
            var1 += (aByteArray978[anInt220] >> anInt217 & var4) << var2;
            anInt217 = 0;
            ++anInt220;
            var2 += var3;
        }

        if (var0 > 0) {
            var3 = (1 << var0) - 1;
            var1 += (aByteArray978[anInt220] >> anInt217 & var3) << var2;
            anInt217 += var0;
        }

        return var1;
    }

    void method592(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        this.anInt209 = var2.method835();
        this.anInt206 = var2.method835();
        this.anInt232 = var2.method835();
        this.anInt327 = var2.method835();
        if (this.anInt327 < 0) {
            this.anInt327 = ~this.anInt327;
            this.aBoolean994 = true;
        }

        int var3 = var2.method835();
        this.aByteArrayArray984 = new byte[var3][];

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
                var6 = var2.readUnsignedByte();
                var5 += var6;
            } while (var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.method826(var7, 0, var5);
            this.aByteArrayArray984[var4] = var7;
        }

    }

    Node_Sub11_Sub1 method588(int[] var1) {
        if (var1 != null && var1[0] <= 0) {
            return null;
        }
        if (this.aByteArray979 == null) {
            this.anInt981 = 0;
            this.aFloatArray986 = new float[anInt226];
            this.aByteArray979 = new byte[this.anInt206];
            this.anInt754 = 0;
            this.anInt745 = 0;
        }

        for (; this.anInt745 < this.aByteArrayArray984.length; ++this.anInt745) {
            if (var1 != null && var1[0] <= 0) {
                return null;
            }

            float[] var2 = this.method593(this.anInt745);
            if (var2 != null) {
                int var3 = this.anInt754;
                int var4 = var2.length;
                if (var4 > this.anInt206 - var3) {
                    var4 = this.anInt206 - var3;
                }

                for (int var5 = 0; var5 < var4; ++var5) {
                    int var6 = (int) (128.0F + var2[var5] * 128.0F);
                    if ((var6 & -256) != 0) {
                        var6 = ~var6 >> 31;
                    }

                    this.aByteArray979[var3++] = (byte) (var6 - 128);
                }

                if (var1 != null) {
                    var1[0] -= var3 - this.anInt754;
                }

                this.anInt754 = var3;
            }
        }

        this.aFloatArray986 = null;
        byte[] var7 = this.aByteArray979;
        this.aByteArray979 = null;
        return new Node_Sub11_Sub1(this.anInt209, var7, this.anInt232, this.anInt327, this.aBoolean994);
    }

    float[] method593(int var1) {
        method595(this.aByteArrayArray984[var1], 0);
        method591();
        int var2 = method590(Class122.method809(anIntArray987.length - 1));
        boolean var3 = aBooleanArray990[var2];
        int var4 = var3 ? anInt226 : anInt214;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method591() != 0;
            var6 = method591() != 0;
        }

        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (anInt214 >> 2);
            var9 = (var4 >> 2) + (anInt214 >> 2);
            var10 = anInt214 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }

        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (anInt214 >> 2);
            var12 = var4 - (var4 >> 2) + (anInt214 >> 2);
            var13 = anInt214 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }

        Class86 var14 = aClass86Array977[anIntArray987[var2]];
        int var15 = var14.anInt900;
        int var16 = var14.anIntArray899[var15];
        boolean var17 = !aClass87Array982[var16].method515();

        for (var16 = 0; var16 < var14.anInt897; ++var16) {
            Class91 var18 = aClass91Array973[var14.anIntArray898[var16]];
            float[] var19 = aFloatArray992;
            var18.method586(var19, var4 >> 1, var17);
        }

        int var20;
        if (!var17) {
            var16 = var14.anInt900;
            var20 = var14.anIntArray899[var16];
            aClass87Array982[var20].method516(aFloatArray992, var4 >> 1);
        }

        int var21;
        if (var17) {
            for (var16 = var4 >> 1; var16 < var4; ++var16) {
                aFloatArray992[var16] = 0.0F;
            }
        } else {
            var16 = var4 >> 1;
            var20 = var4 >> 2;
            var21 = var4 >> 3;
            float[] var22 = aFloatArray992;

            int var23;
            for (var23 = 0; var23 < var16; ++var23) {
                var22[var23] *= 0.5F;
            }

            for (var23 = var16; var23 < var4; ++var23) {
                var22[var23] = -var22[var4 - var23 - 1];
            }

            float[] var26 = var3 ? aFloatArray989 : aFloatArray974;
            float[] var27 = var3 ? aFloatArray991 : aFloatArray993;
            float[] var28 = var3 ? aFloatArray976 : aFloatArray988;
            int[] var29 = var3 ? anIntArray983 : anIntArray975;

            int var30;
            float var31;
            float var32;
            float var33;
            float var34;
            for (var30 = 0; var30 < var20; ++var30) {
                var31 = var22[var30 * 4] - var22[var4 - var30 * 4 - 1];
                var32 = var22[var30 * 4 + 2] - var22[var4 - var30 * 4 - 3];
                var33 = var26[var30 * 2];
                var34 = var26[var30 * 2 + 1];
                var22[var4 - var30 * 4 - 1] = var31 * var33 - var32 * var34;
                var22[var4 - var30 * 4 - 3] = var31 * var34 + var32 * var33;
            }

            float var35;
            float var36;
            for (var30 = 0; var30 < var21; ++var30) {
                var31 = var22[var16 + 3 + var30 * 4];
                var32 = var22[var16 + 1 + var30 * 4];
                var33 = var22[var30 * 4 + 3];
                var34 = var22[var30 * 4 + 1];
                var22[var16 + 3 + var30 * 4] = var31 + var33;
                var22[var16 + 1 + var30 * 4] = var32 + var34;
                var35 = var26[var16 - 4 - var30 * 4];
                var36 = var26[var16 - 3 - var30 * 4];
                var22[var30 * 4 + 3] = (var31 - var33) * var35 - (var32 - var34) * var36;
                var22[var30 * 4 + 1] = (var32 - var34) * var35 + (var31 - var33) * var36;
            }

            var30 = Class122.method809(var4 - 1);

            int var47;
            int var48;
            int var49;
            int var50;
            for (var47 = 0; var47 < var30 - 3; ++var47) {
                var48 = var4 >> var47 + 2;
                var49 = 8 << var47;

                for (var50 = 0; var50 < 2 << var47; ++var50) {
                    int var51 = var4 - var48 * 2 * var50;
                    int var52 = var4 - var48 * (var50 * 2 + 1);

                    for (int var37 = 0; var37 < var4 >> var47 + 4; ++var37) {
                        int var38 = var37 * 4;
                        float var39 = var22[var51 - 1 - var38];
                        float var40 = var22[var51 - 3 - var38];
                        float var41 = var22[var52 - 1 - var38];
                        float var42 = var22[var52 - 3 - var38];
                        var22[var51 - 1 - var38] = var39 + var41;
                        var22[var51 - 3 - var38] = var40 + var42;
                        float var43 = var26[var37 * var49];
                        float var44 = var26[var37 * var49 + 1];
                        var22[var52 - 1 - var38] = (var39 - var41) * var43 - (var40 - var42) * var44;
                        var22[var52 - 3 - var38] = (var40 - var42) * var43 + (var39 - var41) * var44;
                    }
                }
            }

            for (var47 = 1; var47 < var21 - 1; ++var47) {
                var48 = var29[var47];
                if (var47 < var48) {
                    var49 = var47 * 8;
                    var50 = var48 * 8;
                    var35 = var22[var49 + 1];
                    var22[var49 + 1] = var22[var50 + 1];
                    var22[var50 + 1] = var35;
                    var35 = var22[var49 + 3];
                    var22[var49 + 3] = var22[var50 + 3];
                    var22[var50 + 3] = var35;
                    var35 = var22[var49 + 5];
                    var22[var49 + 5] = var22[var50 + 5];
                    var22[var50 + 5] = var35;
                    var35 = var22[var49 + 7];
                    var22[var49 + 7] = var22[var50 + 7];
                    var22[var50 + 7] = var35;
                }
            }

            for (var47 = 0; var47 < var16; ++var47) {
                var22[var47] = var22[var47 * 2 + 1];
            }

            for (var47 = 0; var47 < var21; ++var47) {
                var22[var4 - 1 - var47 * 2] = var22[var47 * 4];
                var22[var4 - 2 - var47 * 2] = var22[var47 * 4 + 1];
                var22[var4 - var20 - 1 - var47 * 2] = var22[var47 * 4 + 2];
                var22[var4 - var20 - 2 - var47 * 2] = var22[var47 * 4 + 3];
            }

            for (var47 = 0; var47 < var21; ++var47) {
                var32 = var28[var47 * 2];
                var33 = var28[var47 * 2 + 1];
                var34 = var22[var16 + var47 * 2];
                var35 = var22[var16 + var47 * 2 + 1];
                var36 = var22[var4 - 2 - var47 * 2];
                float var53 = var22[var4 - 1 - var47 * 2];
                float var54 = var33 * (var34 - var36) + var32 * (var35 + var53);
                var22[var16 + var47 * 2] = (var34 + var36 + var54) * 0.5F;
                var22[var4 - 2 - var47 * 2] = (var34 + var36 - var54) * 0.5F;
                var54 = var33 * (var35 + var53) - var32 * (var34 - var36);
                var22[var16 + var47 * 2 + 1] = (var35 - var53 + var54) * 0.5F;
                var22[var4 - 1 - var47 * 2] = (-var35 + var53 + var54) * 0.5F;
            }

            for (var47 = 0; var47 < var20; ++var47) {
                var22[var47] = var22[var47 * 2 + var16] * var27[var47 * 2] + var22[var47 * 2 + 1 + var16] * var27[var47 * 2 + 1];
                var22[var16 - 1 - var47] = var22[var47 * 2 + var16] * var27[var47 * 2 + 1] - var22[var47 * 2 + 1 + var16] * var27[var47 * 2];
            }

            for (var47 = 0; var47 < var20; ++var47) {
                var22[var4 - var20 + var47] = -var22[var47];
            }

            for (var47 = 0; var47 < var20; ++var47) {
                var22[var47] = var22[var20 + var47];
            }

            for (var47 = 0; var47 < var20; ++var47) {
                var22[var20 + var47] = -var22[var20 - var47 - 1];
            }

            for (var47 = 0; var47 < var20; ++var47) {
                var22[var16 + var47] = var22[var4 - var47 - 1];
            }

            for (var47 = var8; var47 < var9; ++var47) {
                var32 = (float) Math.sin(((double) (var47 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                aFloatArray992[var47] *= (float) Math.sin(1.5707963267948966D * (double) var32 * (double) var32);
            }

            for (var47 = var11; var47 < var12; ++var47) {
                var32 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                aFloatArray992[var47] *= (float) Math.sin(1.5707963267948966D * (double) var32 * (double) var32);
            }
        }

        float[] var24 = null;
        if (this.anInt981 > 0) {
            var20 = this.anInt981 + var4 >> 2;
            var24 = new float[var20];
            int var25;
            if (!this.aBoolean215) {
                for (var21 = 0; var21 < this.anInt219; ++var21) {
                    var25 = (this.anInt981 >> 1) + var21;
                    var24[var21] += this.aFloatArray986[var25];
                }
            }

            if (!var17) {
                for (var21 = var8; var21 < var4 >> 1; ++var21) {
                    var25 = var24.length - (var4 >> 1) + var21;
                    var24[var25] += aFloatArray992[var21];
                }
            }
        }

        float[] var46 = this.aFloatArray986;
        this.aFloatArray986 = aFloatArray992;
        aFloatArray992 = var46;
        this.anInt981 = var4;
        this.anInt219 = var12 - (var4 >> 1);
        this.aBoolean215 = var17;
        return var24;
    }
}
