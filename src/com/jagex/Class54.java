package com.jagex;

public class Class54 {
    static Sprite[] aSpriteArray419;
    static int anInt418;

    public static void method348(String var0, boolean var1, boolean var2) {
        AnimationSkin.method744(var0, var1, "openjs", var2);
    }

    public static Object method349(byte[] var0, boolean var1) {
        if (var0 == null) {
            return null;
        }
        if (var0.length > 136 && !Class111.aBoolean1326) {
            try {
                Class111_Sub1 var2 = new Class111_Sub1();
                var2.method769(var0);
                return var2;
            } catch (Throwable var3) {
                Class111.aBoolean1326 = true;
            }
        }

        return var0;
    }

    public static int method347(CharSequence var0) {
        int var1 = var0.length();
        int var2 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            char var4 = var0.charAt(var3);
            if (var4 <= 127) {
                ++var2;
            } else if (var4 <= 2047) {
                var2 += 2;
            } else {
                var2 += 3;
            }
        }

        return var2;
    }
}
