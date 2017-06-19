package com.jagex;

public class Class158 implements EnumOrdinal {
    public static final Class158 aClass158_1855 = new Class158(1, 0, true, true, true);
    public static final Class158 aClass158_1848 = new Class158(3, 2, false, false, true);
    public static final Class158 aClass158_1849 = new Class158(2, 1, true, true, false);
    public static final Class158 aClass158_1851 = new Class158(4, 3, false, false, true);
    public static final Class158 aClass158_1853 = new Class158(5, 10, false, false, true);
    public static final Class158 aClass158_1845 = new Class158(0, -1, true, false, true);
    static Sprite[] aSpriteArray1847;
    public final int anInt1852;
    public final boolean aBoolean1850;
    public final boolean aBoolean1846;
    final int anInt1854;

    Class158(int var1, int var2, boolean var3, boolean var4, boolean var5) {
        this.anInt1854 = var1;
        this.anInt1852 = var2;
        this.aBoolean1850 = var4;
        this.aBoolean1846 = var5;
    }

    static int method1013() {
        if (Client.menuRowCount <= 0) {
            return -1;
        }
        return Client.aBoolean1628 && Class4.aBooleanArray23[81] && Client.anInt1624 != -1 ? Client.anInt1624 : Client.menuRowCount - 1;
    }

    public static DefinitionProperty method1012(int var0) {
        DefinitionProperty var1 = DefinitionProperty.propertyCache.get((long) var0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = DefinitionProperty.propertyTable.unpack(11, var0);
        var1 = new DefinitionProperty();
        if (var2 != null) {
            var1.decode(new Buffer(var2));
        }

        var1.method756();
        DefinitionProperty.propertyCache.put(var1, (long) var0);
        return var1;
    }

    public int ordinal() {
        return this.anInt1854;
    }
}
