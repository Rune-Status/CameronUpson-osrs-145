package com.jagex;

public class Class163 implements EnumOrdinal {
    public static final Class163 aClass163_1963 = new Class163(2, 0);
    public static final Class163 aClass163_1982 = new Class163(22, 3);
    public static final Class163 aClass163_1981 = new Class163(9, 2);
    public static final Class163 aClass163_1975 = new Class163(0, 0);
    public static final Class163 aClass163_1967 = new Class163(10, 2);
    public static final Class163 aClass163_1962 = new Class163(11, 2);
    public static final Class163 aClass163_1979 = new Class163(3, 0);
    static final Class163 aClass163_1973 = new Class163(14, 2);
    static final Class163 aClass163_1977 = new Class163(20, 2);
    static final Class163 aClass163_1980 = new Class163(17, 2);
    static final Class163 aClass163_1968 = new Class163(6, 1);
    static final Class163 aClass163_1964 = new Class163(7, 1);
    static final Class163 aClass163_1961 = new Class163(8, 1);
    static final Class163 aClass163_1974 = new Class163(12, 2);
    static final Class163 aClass163_1976 = new Class163(13, 2);
    static final Class163 aClass163_1978 = new Class163(18, 2);
    static final Class163 aClass163_1959 = new Class163(15, 2);
    static final Class163 aClass163_1966 = new Class163(16, 2);
    static final Class163 aClass163_1972 = new Class163(1, 0);
    static final Class163 aClass163_1970 = new Class163(19, 2);
    static final Class163 aClass163_1983 = new Class163(4, 1);
    static final Class163 aClass163_1971 = new Class163(21, 2);
    static final Class163 aClass163_1969 = new Class163(5, 1);
    static boolean aBoolean1965;
    public final int anInt1960;

    Class163(int var1, int var2) {
        this.anInt1960 = var1;
    }

    public static Node_Sub21_Sub16 method1031(int var0) {
        Node_Sub21_Sub16 var1 = (Node_Sub21_Sub16) Node_Sub21_Sub16.aReferenceCache2025.get((long) var0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Node_Sub21_Sub16.aReferenceTable2012.unpack(19, var0);
        var1 = new Node_Sub21_Sub16();
        if (var2 != null) {
            var1.method1052(new Buffer(var2));
        }

        Node_Sub21_Sub16.aReferenceCache2025.put(var1, (long) var0);
        return var1;
    }

    public int ordinal() {
        return this.anInt1960;
    }
}
