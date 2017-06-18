package com.jagex;

public class Class185 {
    public static CompressedImage method1203(ReferenceTable var0, String var1, String var2) {
        int var3 = var0.method1084(var1);
        int var4 = var0.method1104(var3, var2);
        CompressedImage var5;
        if (!Class64.method381(var0, var3, var4)) {
            var5 = null;
        } else {
            CompressedImage var6 = new CompressedImage();
            var6.anInt221 = Class160.anInt1857;
            var6.anInt220 = Class191.anInt2246;
            var6.anInt327 = Class191.anIntArray2245[0];
            var6.anInt328 = Class191.anIntArray2248[0];
            var6.anInt206 = Class191.anIntArray2249[0];
            var6.anInt232 = Class109.anIntArray1305[0];
            var6.anIntArray342 = Class94.anIntArray1043;
            var6.aByteArray1361 = Class191.aByteArrayArray2247[0];
            Class191.anIntArray2245 = null;
            Class191.anIntArray2248 = null;
            Class191.anIntArray2249 = null;
            Class109.anIntArray1305 = null;
            Class94.anIntArray1043 = null;
            Class191.aByteArrayArray2247 = null;
            var5 = var6;
        }

        return var5;
    }
}
