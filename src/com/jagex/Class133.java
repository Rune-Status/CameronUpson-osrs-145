package com.jagex;

public class Class133 {
    public static ReferenceTable aReferenceTable1722;
    public static ReferenceTable aReferenceTable1729;
    public static ReferenceTable aReferenceTable1724;
    public static Node_Sub10_Sub3 aNode_Sub10_Sub3_1723;
    public static int anInt1725 = 0;
    public static ReferenceTable aReferenceTable1727;
    public static int anInt1728;
    static int cameraPitch;

    public static String method914(CharSequence[] var0, int var1, int var2) {
        if (var2 == 0) {
            return "";
        } else if (var2 == 1) {
            CharSequence var3 = var0[var1];
            return var3 == null ? "null" : var3.toString();
        } else {
            int var4 = var1 + var2;
            int var5 = 0;

            for (int var6 = var1; var6 < var4; ++var6) {
                CharSequence var7 = var0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }

            StringBuilder var8 = new StringBuilder(var5);

            for (int var9 = var1; var9 < var4; ++var9) {
                CharSequence var10 = var0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }

            return var8.toString();
        }
    }
}
