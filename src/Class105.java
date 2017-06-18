import java.io.IOException;

public class Class105 {
    public static int anInt1251 = 0;
    public static int anInt1246 = 0;
    public static int onCursorCount = 0;
    public static int[] onCursorUids = new int[1000];
    public static boolean aBoolean1245 = false;
    public static boolean aBoolean1242 = false;
    static int anInt1248;
    static int anInt1252;
    static int anInt1250;
    static int anInt1247;
    static Class84 aClass84_1244;

    public static void method721(Socket var0, boolean var1) {
        if (Class168.aSocket2082 != null) {
            try {
                Class168.aSocket2082.method882();
            } catch (Exception var6) {
            }

            Class168.aSocket2082 = null;
        }

        Class168.aSocket2082 = var0;
        Class123.method814(var1);
        Class168.aBuffer2074.caret = 0;
        Class19.aNode_Sub21_Sub6_137 = null;
        Class25.aBuffer177 = null;
        Class168.anInt2085 = 0;

        while (true) {
            Node_Sub21_Sub6 var2 = Class168.aNodeTable2089.first();
            if (var2 == null) {
                while (true) {
                    var2 = Class168.aNodeTable2080.first();
                    if (var2 == null) {
                        if (Class168.aByte2071 != 0) {
                            try {
                                Buffer var7 = new Buffer(4);
                                var7.method451(4);
                                var7.method451(Class168.aByte2071);
                                var7.method755(0);
                                Class168.aSocket2082.method885(var7.payload, 0, 4);
                            } catch (IOException var5) {
                                try {
                                    Class168.aSocket2082.method882();
                                } catch (Exception var4) {
                                }

                                ++Class168.anInt2069;
                                Class168.aSocket2082 = null;
                            }
                        }

                        Class168.anInt2079 = 0;
                        Class168.aLong2072 = Class124.method873();
                        return;
                    }

                    Class168.aNodeQueue2076.method944(var2);
                    Class168.aNodeTable2073.put(var2, var2.key);
                    ++Class168.anInt2070;
                    --Class168.anInt2083;
                }
            }

            Class168.aNodeTable2086.put(var2, var2.key);
            ++Class168.anInt2087;
            --Class168.anInt2077;
        }
    }
}
