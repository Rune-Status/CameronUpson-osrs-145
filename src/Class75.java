import java.awt.*;
import java.util.Comparator;

final class Class75 implements Comparator {
    static Sprite aSprite805;
    static int anInt806;

    static int method448(InterfaceComponent var0) {
        IntegerNode var1 = Client.interfaceConfigs.lookup((long) var0.componentIndex + ((long) var0.uid << 32));
        return var1 != null ? var1.value : var0.config;
    }

    static void method444(Component var0) {
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(Class4.aClass4_26);
        var0.addFocusListener(Class4.aClass4_26);
    }

    static void method447(int var0, String var1, String var2, String var3) {
        Class50 var4 = (Class50) Class59.aMap624.get(var0);
        if (var4 == null) {
            var4 = new Class50();
            Class59.aMap624.put(var0, var4);
        }

        Node_Sub21_Sub1 var5 = var4.method315(var0, var1, var2, var3);
        Class59.A_ITERABLE_NODE_TABLE___628.put(var5, (long) var5.anInt204);
        Class59.aClass142_627.method980(var5);
        Client.anInt1668 = Client.anInt1644;
    }

    static String method449(int var0) {
        return "<col=" + Integer.toHexString(var0) + ">";
    }

    public static int method450(int var0) {
        return var0 >> 17 & 7;
    }

    public static Class155[] method445() {
        return new Class155[]{Class155.aClass155_1838, Class155.aClass155_1839, Class155.aClass155_1837, Class155.aClass155_1842};
    }

    static Class182[] method446() {
        return new Class182[]{Class182.aClass182_2158, Class182.aClass182_2157, Class182.aClass182_2155};
    }

    public int compare(Object var1, Object var2) {
        return this.method443((Class53) var1, (Class53) var2);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    int method443(Class53 var1, Class53 var2) {
        return var1.aGrandExchangeOffer408.itemQuantity < var2.aGrandExchangeOffer408.itemQuantity ? -1 : (var1.aGrandExchangeOffer408.itemQuantity == var2.aGrandExchangeOffer408.itemQuantity ? 0 : 1);
    }
}
