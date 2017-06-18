package com.jagex;

public class Class148 implements EnumOrdinal {
    public static final Class148 aClass148_1818 = new Class148(2, 3);
    public static final Class148 aClass148_1825 = new Class148(4, 1);
    public static final Class148 aClass148_1819 = new Class148(6, 2);
    public static final Class148 aClass148_1823 = new Class148(1, 5);
    public static final Class148 aClass148_1816 = new Class148(7, 0);
    public static final Class148 aClass148_1824 = new Class148(5, 6);
    public static final Class148 aClass148_1822 = new Class148(3, 7);
    public static final Class148 aClass148_1821 = new Class148(0, 4);
    public final int anInt1820;
    final int anInt1817;

    Class148(int var1, int var2) {
        this.anInt1820 = var1;
        this.anInt1817 = var2;
    }

    public static byte[] method1000(Object var0, boolean var1) {
        if (var0 == null) {
            return null;
        } else if (var0 instanceof byte[]) {
            if (var1) {
                int var3 = ((byte[]) var0).length;
                byte[] var4 = new byte[var3];
                System.arraycopy(var0, 0, var4, 0, var3);
                return var4;
            } else {
                return (byte[]) var0;
            }
        } else if (var0 instanceof Class111) {
            Class111 var2 = (Class111) var0;
            return var2.method768();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int ordinal() {
        return this.anInt1817;
    }
}
