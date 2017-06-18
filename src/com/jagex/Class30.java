package com.jagex;

import javax.imageio.ImageIO;

public class Class30 {
    static {
        ImageIO.setUseCache(false);
    }

    public static void method202(ReferenceTable var0) {
        Varpbit.varpbitTable = var0;
    }

    static boolean method205(InterfaceComponent var0) {
        if (var0.anIntArray1941 == null) {
            return false;
        }
        for (int var1 = 0; var1 < var0.anIntArray1941.length; ++var1) {
            int var2 = Player.method190(var0, var1);
            int var3 = var0.anIntArray1940[var1];
            if (var0.anIntArray1941[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (var0.anIntArray1941[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (var0.anIntArray1941[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }

        return true;
    }

    public static String method203(CharSequence var0) {
        int var1 = var0.length();
        StringBuilder var2 = new StringBuilder(var1);

        for (int var3 = 0; var3 < var1; ++var3) {
            char var4 = var0.charAt(var3);
            if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
                if (var4 == ' ') {
                    var2.append('+');
                } else {
                    byte var5 = Class149.method1002(var4);
                    var2.append('%');
                    int var6 = var5 >> 4 & 15;
                    if (var6 >= 10) {
                        var2.append((char) (var6 + 55));
                    } else {
                        var2.append((char) (var6 + 48));
                    }

                    var6 = var5 & 15;
                    if (var6 >= 10) {
                        var2.append((char) (var6 + 55));
                    } else {
                        var2.append((char) (var6 + 48));
                    }
                }
            } else {
                var2.append(var4);
            }
        }

        return var2.toString();
    }

    static void method204(int var0) {
        ItemTable var1 = ItemTable.itemTables.lookup((long) var0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.ids.length; ++var2) {
                var1.ids[var2] = -1;
                var1.stackSizes[var2] = 0;
            }

        }
    }
}
