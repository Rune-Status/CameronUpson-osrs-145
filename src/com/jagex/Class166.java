package com.jagex;

public class Class166 implements EnumOrdinal {
    static final Class166 aClass166_2023 = new Class166(1, 2);
    static final Class166 aClass166_2022 = new Class166(2, 0);
    static final Class166 aClass166_2024 = new Class166(0, 1);
    public final int anInt820;
    final int anInt157;

    Class166(int var1, int var2) {
        this.anInt820 = var1;
        this.anInt157 = var2;
    }

    public static String method1062(long var0) {
        if (var0 > 0L && var0 < 6582952005840035281L) {
            if (0L == var0 % 37L) {
                return null;
            }
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
                ++var2;
            }

            StringBuilder var5;
            char var8;
            for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
                long var6 = var0;
                var0 /= 37L;
                var8 = Class177.aCharArray2140[(int) (var6 - 37L * var0)];
                if (var8 == '_') {
                    int var9 = var5.length() - 1;
                    var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                    var8 = 160;
                }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
        }
        return null;
    }

    public int ordinal() {
        return this.anInt157;
    }
}
