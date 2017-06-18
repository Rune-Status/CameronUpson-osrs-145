package com.jagex;

public class Node_Sub21_Sub5 extends DoublyNode {
    public final int anInt204;
    public final int[] anIntArray340;
    public final int[] anIntArray950;
    public final int anInt209;

    Node_Sub21_Sub5(int var1, int var2, int[] var3, int[] var4, int var5) {
        this.anInt204 = var1;
        this.anInt209 = var2;
        this.anIntArray340 = var3;
        this.anIntArray950 = var4;
    }

    public static String method1011(String var0) {
        int var1 = var0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;

        for (int var4 = 0; var4 < var1; ++var4) {
            char var5 = var0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                char var6;
                if (var5 != 181 && var5 != 131) {
                    var6 = Character.toTitleCase(var5);
                } else {
                    var6 = var5;
                }

                var5 = var6;
            }

            if (Character.isLetter(var5)) {
                var3 = 0;
            } else if (var5 != '.' && var5 != '?' && var5 != '!') {
                if (Character.isSpaceChar(var5)) {
                    if (var3 != 2) {
                        var3 = 1;
                    }
                } else {
                    var3 = 1;
                }
            } else {
                var3 = 2;
            }

            var2[var4] = var5;
        }

        return new String(var2);
    }

    public boolean method1010(int var1, int var2) {
        if (var2 >= 0 && var2 < this.anIntArray950.length) {
            int var3 = this.anIntArray950[var2];
            if (var1 >= var3 && var1 <= this.anIntArray340[var2] + var3) {
                return true;
            }
        }

        return false;
    }
}
