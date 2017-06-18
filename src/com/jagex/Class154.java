package com.jagex;

public class Class154 {
    public static final boolean[] aBooleanArray1836 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    public static int[] anIntArray1834 = new int[99];
    protected static boolean aBoolean1835;
    static Socket aSocket1833;

    static {
        int var0 = 0;

        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            anIntArray1834[var1] = var0 / 4;
        }

    }
}
