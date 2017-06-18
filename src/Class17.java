public class Class17 {
    static final Class17 aClass17_127 = new Class17(1);
    static final Class17 aClass17_124 = new Class17(0);
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array126;
    final int anInt125;

    Class17(int var1) {
        this.anInt125 = var1;
    }

    public static int method135(byte[] var0, int var1, CharSequence var2) {
        int var3 = var2.length();
        int var4 = var1;

        for (int var5 = 0; var5 < var3; ++var5) {
            char var6 = var2.charAt(var5);
            if (var6 <= 127) {
                var0[var4++] = (byte) var6;
            } else if (var6 <= 2047) {
                var0[var4++] = (byte) (192 | var6 >> 6);
                var0[var4++] = (byte) (128 | var6 & 63);
            } else {
                var0[var4++] = (byte) (224 | var6 >> 12);
                var0[var4++] = (byte) (128 | var6 >> 6 & 63);
                var0[var4++] = (byte) (128 | var6 & 63);
            }
        }

        return var4 - var1;
    }

    public static void method134(int var0) {
        Class33.anInt263 = var0;
    }
}
