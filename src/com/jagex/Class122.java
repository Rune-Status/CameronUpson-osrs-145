package com.jagex;

public abstract class Class122 {
    static Sprite aSprite1360;

    static void method810(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (Class33.method220(var0)) {
            Class35.anInterfaceComponentArray314 = null;
            Class5.method19(InterfaceComponent.interfaces[var0], -1, var1, var2, var3, var4, var5, var6, var7);
            if (Class35.anInterfaceComponentArray314 != null) {
                Class5.method19(Class35.anInterfaceComponentArray314, -1412584499, var1, var2, var3, var4, Class75.anInt806, MouseRecorder.anInt249, var7);
                Class35.anInterfaceComponentArray314 = null;
            }

        } else {
            if (var7 != -1) {
                Client.aBooleanArray1656[var7] = true;
            } else {
                for (int var8 = 0; var8 < 100; ++var8) {
                    Client.aBooleanArray1656[var8] = true;
                }
            }

        }
    }

    public static String method808(int var0) {
        return (var0 >> 24 & 255) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
    }

    public static NpcDefinition getNpcDefinition(int var0) {
        NpcDefinition var1 = (NpcDefinition) NpcDefinition.aReferenceCache2008.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = NpcDefinition.aReferenceTable2012.method1085(9, var0);
            var1 = new NpcDefinition();
            var1.id = var0;
            if (var2 != null) {
                var1.method1056(new Buffer(var2));
            }
            NpcDefinition.aReferenceCache2008.method975(var1, (long) var0);
            return var1;
        }
    }

    public static int method809(int var0) {
        int var1 = 0;
        if (var0 < 0 || var0 >= 65536) {
            var0 >>>= 16;
            var1 += 16;
        }

        if (var0 >= 256) {
            var0 >>>= 8;
            var1 += 8;
        }

        if (var0 >= 16) {
            var0 >>>= 4;
            var1 += 4;
        }

        if (var0 >= 4) {
            var0 >>>= 2;
            var1 += 2;
        }

        if (var0 >= 1) {
            var0 >>>= 1;
            ++var1;
        }

        return var0 + var1;
    }

    static void method811(String var0, boolean var1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Boundary.aFont1150.method1178(var0, 250);
        int var6 = Boundary.aFont1150.method1168(var0, 250) * 13;
        Node_Sub21_Sub26.method1223(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        Node_Sub21_Sub26.method1208(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2, 16777215);
        Boundary.aFont1150.method1184(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Class50.method319(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2);
        if (var1) {
            World.graphicsProvider.method172(0, 0);
        } else {

            for (int var11 = 0; var11 < Client.anInt1673; ++var11) {
                if (Client.interfaceWidths[var11] + Client.interfacePositionsX[var11] > var3 && Client.interfacePositionsX[var11] < var3 + var5 && Client.interfaceHeights[var11] + Client.interfacePositionsY[var11] > var4 && Client.interfacePositionsY[var11] < var4 + var6) {
                    Client.aBooleanArray1674[var11] = true;
                }
            }
        }

    }

    public abstract int method666(int var1, int var2);

    public abstract void method665();
}
