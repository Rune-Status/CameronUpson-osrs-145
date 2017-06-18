package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class59 {
    static final Map aMap624 = new HashMap();
    static final RS3CopyPastedNodeTable A_ITERABLE_NODE_TABLE___628 = new RS3CopyPastedNodeTable(1024);
    static final Class142 aClass142_627 = new Class142();
    public static Node_Sub26 aNode_Sub26_625;
    static int anInt626 = 0;

    static String method366(int var0) {
        String var1 = Integer.toString(var0);

        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + "," + var1.substring(var2);
        }

        if (var1.length() > 9) {
            return " " + Class75.method449(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
        }
        return var1.length() > 6 ? " " + Class75.method449(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + Class75.method449(16776960) + var1 + "</col>";
    }
}
