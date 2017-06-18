public class Class55 implements EnumOrdinal {
    static final Class55 aClass55_425 = new Class55(1);
    static final Class55 aClass55_420 = new Class55(0);
    static final Class55 aClass55_423 = new Class55(2);
    static final Class55 aClass55_422 = new Class55(3);
    public static ReferenceTable aReferenceTable424;
    static int anInt421;
    final int anInt157;

    Class55(int var1) {
        this.anInt157 = var1;
    }

    static void method350(int var0, int var1, int var2, ObjectDefinition var3, int var4) {
        Node_Sub7 var5 = new Node_Sub7();
        var5.anInt209 = var0;
        var5.anInt206 = var1 * 128;
        var5.anInt232 = var2 * 128;
        int var6 = var3.anInt230;
        int var7 = var3.anInt222;
        if (var4 == 1 || var4 == 3) {
            var6 = var3.anInt222;
            var7 = var3.anInt230;
        }

        var5.anInt327 = (var6 + var1) * 128;
        var5.anInt328 = (var2 + var7) * 128;
        var5.anInt220 = var3.anInt767;
        var5.anInt221 = var3.anInt2032 * 128;
        var5.anInt214 = var3.anInt2036;
        var5.anInt226 = var3.anInt1864;
        var5.anIntArray404 = var3.anIntArray751;
        if (var3.transformIds != null) {
            var5.anObjectDefinition402 = var3;
            var5.method335();
        }

        Node_Sub7.aNodeDeque403.method997(var5);
        if (var5.anIntArray404 != null) {
            var5.anInt225 = var5.anInt214 + (int) (Math.random() * (double) (var5.anInt226 - var5.anInt214));
        }

    }

    public int ordinal() {
        return this.anInt157;
    }
}
