package com.jagex;

public final class Class26 {
    static final int[] anIntArray192 = new int[]{1, 2, 4, 8};
    static final int[] anIntArray196 = new int[]{1, -1, -1, 1};
    static final int[] anIntArray188 = new int[]{16, 32, 64, 128};
    static final int[] anIntArray187 = new int[]{1, 0, -1, 0};
    static final int[] anIntArray184 = new int[]{0, -1, 0, 1};
    static final int[] anIntArray183 = new int[]{-1, -1, 1, 1};
    static byte[][][] aByteArrayArrayArray189 = new byte[4][104][104];
    static int[][][] anIntArrayArrayArray186;
    static byte[][][] aByteArrayArrayArray193;
    static int[] anIntArray190;
    static byte[][][] aByteArrayArrayArray195;
    static int anInt185 = 99;
    static int anInt197 = (int) (Math.random() * 17.0D) - 8;
    static int anInt194 = (int) (Math.random() * 33.0D) - 16;
    static int[][][] anIntArrayArrayArray191 = new int[4][105][105];

    static void method177(Buffer var0, int var1) {
        byte[] var2 = var0.payload;
        if (Client.aByteArray1500 == null) {
            Client.aByteArray1500 = new byte[24];
        }

        Class144.method981(var2, var1, Client.aByteArray1500, 0, 24);
        if (Class97.aClass93_1076 != null) {
            try {
                Class97.aClass93_1076.method605(0L);
                Class97.aClass93_1076.method604(var0.payload, var1, 24);
            } catch (Exception var4) {
            }
        }

    }

    static boolean method178(InterfaceComponent var0) {
        int var1 = var0.contentType;
        if (var1 == 205) {
            Client.specialScript = 250;
            return true;
        } else {
            int var2;
            int var3;
            if (var1 >= 300 && var1 <= 313) {
                var2 = (var1 - 300) / 2;
                var3 = var1 & 1;
                Client.aPlayerAppearance1455.method1035(var2, var3 == 1);
            }

            if (var1 >= 314 && var1 <= 323) {
                var2 = (var1 - 314) / 2;
                var3 = var1 & 1;
                Client.aPlayerAppearance1455.method1033(var2, var3 == 1);
            }

            if (var1 == 324) {
                Client.aPlayerAppearance1455.method1039(false);
            }

            if (var1 == 325) {
                Client.aPlayerAppearance1455.method1039(true);
            }

            if (var1 == 326) {
                Client.packet.writeHeader(222);
                Client.aPlayerAppearance1455.method1040(Client.packet);
                return true;
            } else {
                return false;
            }
        }
    }
}
