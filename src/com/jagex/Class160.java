package com.jagex;

public class Class160 {
    static Client aClient1856;
    static int anInt1857;

    public static Font method1015(ReferenceTable var0, ReferenceTable var1, String var2, String var3) {
        int var4 = var0.method1084(var2);
        int var5 = var0.method1104(var4, var3);
        Font var6;
        if (!Class64.method381(var0, var4, var5)) {
            var6 = null;
        } else {
            var6 = Class65.loadFont(var1.method1085(var4, var5));
        }

        return var6;
    }
}
