public class Class71 {
    static int anInt729 = 0;
    static byte[] aByteArray719 = new byte[2048];
    static int[] anIntArray718 = new int[2048];
    static int[] anIntArray723 = new int[2048];
    static int[] anIntArray726 = new int[2048];
    static int anInt724 = 0;
    static byte[] aByteArray727 = new byte[2048];
    static int[] anIntArray720 = new int[2048];
    static int[] anIntArray725 = new int[2048];
    static Buffer[] aBufferArray728 = new Buffer[2048];
    static int anInt722 = 0;
    static int[] anIntArray717 = new int[2048];
    static Buffer aBuffer721 = new Buffer(new byte[5000]);

    public static int method418(CharSequence var0) {
        int var1 = var0.length();
        int var2 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            var2 = (var2 << 5) - var2 + var0.charAt(var3);
        }

        return var2;
    }
}
