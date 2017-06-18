public class Class170 {
    static char[] aCharArray2120 = new char[64];
    static char[] aCharArray2123;
    static int[] anIntArray2122;
    static short[] aShortArray2121;

    static {
        int var0;
        for (var0 = 0; var0 < 26; ++var0) {
            aCharArray2120[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            aCharArray2120[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            aCharArray2120[var0] = (char) (var0 + 48 - 52);
        }

        aCharArray2120[62] = '+';
        aCharArray2120[63] = '/';
        aCharArray2123 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            aCharArray2123[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            aCharArray2123[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            aCharArray2123[var0] = (char) (var0 + 48 - 52);
        }

        aCharArray2123[62] = '*';
        aCharArray2123[63] = '-';
        anIntArray2122 = new int[128];

        for (var0 = 0; var0 < anIntArray2122.length; ++var0) {
            anIntArray2122[var0] = -1;
        }

        for (var0 = 65; var0 <= 90; ++var0) {
            anIntArray2122[var0] = var0 - 65;
        }

        for (var0 = 97; var0 <= 122; ++var0) {
            anIntArray2122[var0] = var0 - 97 + 26;
        }

        for (var0 = 48; var0 <= 57; ++var0) {
            anIntArray2122[var0] = var0 - 48 + 52;
        }

        int[] var1 = anIntArray2122;
        anIntArray2122[43] = 62;
        var1[42] = 62;
        int[] var2 = anIntArray2122;
        anIntArray2122[47] = 63;
        var2[45] = 63;
    }

    public static boolean method1152(String var0, String var1, String var2, String var3) {
        if (var0 != null && var2 != null) {
            return !var0.startsWith("#") && !var2.startsWith("#") ? var1.equals(var3) : var0.equals(var2);
        } else {
            return false;
        }
    }
}
