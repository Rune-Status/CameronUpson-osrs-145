public class Class188 {
    public static final Class188 aClass188_2190 = new Class188(8, 0, "", "");
    public static final Class188 aClass188_2194;
    static final Class188 aClass188_2196 = new Class188(4, 7, "", "");
    static final Class188 aClass188_2199 = new Class188(6, 1, "", "");
    static final Class188 aClass188_2195 = new Class188(5, 4, "", "");
    static final Class188 aClass188_2197 = new Class188(7, 5, "", "");
    static final Class188 aClass188_2198 = new Class188(0, 6, "", "");
    static final Class188 aClass188_2192 = new Class188(1, 3, "", "");
    static final Class188 aClass188_2193 = new Class188(2, 2, "", "");

    static {
        aClass188_2194 = new Class188(3, -1, "", "", true, new Class188[]{aClass188_2190, aClass188_2199, aClass188_2193, aClass188_2195, aClass188_2192});
    }

    public final int anInt2191;
    final String aString2200;

    Class188(int var1, int var2, String var3, String var4, boolean var5, Class188[] var6) {
        this.anInt2191 = var1;
        this.aString2200 = var4;
    }

    Class188(int var1, int var2, String var3, String var4) {
        this.anInt2191 = var1;
        this.aString2200 = var4;
    }

    static int method1252(int var0, int var1, int var2) {
        int var3 = 256 - var2;
        return (var2 * (var1 & 16711935) + var3 * (var0 & 16711935) & -16711936) + (var3 * (var0 & '\uff00') + (var1 & '\uff00') * var2 & 16711680) >> 8;
    }

    public String toString() {
        return this.aString2200;
    }
}
