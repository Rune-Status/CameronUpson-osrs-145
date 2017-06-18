package com.jagex;

public class Class181 {
    static Class118 aClass118_2154;

    public static Node_Sub21_Sub26_Sub2 method1199(ReferenceTable var0, int var1) {
        byte[] var2 = var0.method1093(var1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            IsaacCipher.method794(var2);
            var3 = true;
        }

        if (!var3) {
            return null;
        }
        Node_Sub21_Sub26_Sub2 var4 = new Node_Sub21_Sub26_Sub2();
        var4.anInt221 = Class160.anInt1857;
        var4.anInt220 = Class191.anInt2246;
        var4.anInt327 = Class191.anIntArray2245[0];
        var4.anInt328 = Class191.anIntArray2248[0];
        var4.anInt206 = Class191.anIntArray2249[0];
        var4.anInt232 = Class109.anIntArray1305[0];
        var4.anIntArray342 = Class94.anIntArray1043;
        var4.aByteArray1361 = Class191.aByteArrayArray2247[0];
        Class191.anIntArray2245 = null;
        Class191.anIntArray2248 = null;
        Class191.anIntArray2249 = null;
        Class109.anIntArray1305 = null;
        Class94.anIntArray1043 = null;
        Class191.aByteArrayArray2247 = null;
        return var4;
    }
}
