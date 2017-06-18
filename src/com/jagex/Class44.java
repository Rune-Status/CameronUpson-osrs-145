package com.jagex;

import java.applet.Applet;
import java.util.Comparator;

final class Class44 implements Comparator {
    public static ReferenceTable aReferenceTable369;
    static ReferenceTable aReferenceTable368;
    // $FF: synthetic field
    final boolean aBoolean367;

    Class44(boolean var1) {
        this.aBoolean367 = var1;
    }

    static void method303(InterfaceComponent[] var0, InterfaceComponent var1, boolean var2) {
        int var3 = var1.viewportWidth != 0 ? var1.viewportWidth : var1.width;
        int var4 = var1.viewportHeight != 0 ? var1.viewportHeight : var1.height;
        ClanMate.method207(var0, var1.uid, var3, var4, var2);
        if (var1.components != null) {
            ClanMate.method207(var1.components, var1.uid, var3, var4, var2);
        }

        InterfaceNode var5 = Client.interfaceNodes.lookup((long) var1.uid);
        if (var5 != null) {
            int var6 = var5.id;
            if (Class33.method220(var6)) {
                ClanMate.method207(InterfaceComponent.interfaces[var6], -1, var3, var4, var2);
            }
        }

        if (var1.contentType == 1337) {
        }

    }

    static long method300(CharSequence var0) {
        long var1 = 0L;
        int var3 = var0.length();

        for (int var4 = 0; var4 < var3; ++var4) {
            var1 *= 37L;
            char var5 = var0.charAt(var4);
            if (var5 >= 'A' && var5 <= 'Z') {
                var1 += (long) (var5 + 1 - 65);
            } else if (var5 >= 'a' && var5 <= 'z') {
                var1 += (long) (var5 + 1 - 97);
            } else if (var5 >= '0' && var5 <= '9') {
                var1 += (long) (var5 + 27 - 48);
            }

            if (var1 >= 177917621779460413L) {
                break;
            }
        }

        while (0L == var1 % 37L && 0L != var1) {
            var1 /= 37L;
        }

        return var1;
    }

    public static void method301(Applet var0, String var1) {
        Class40.anApplet343 = var0;
        Class40.aString344 = var1;
    }

    public static void method302(boolean var0) {
        if (var0 != Node_Sub21_Sub19.aBoolean2098) {
            ItemDefinition.aReferenceCache2115.clear();
            ItemDefinition.aReferenceCache2116.clear();
            ItemDefinition.aReferenceCache1891.clear();
            Node_Sub21_Sub19.aBoolean2098 = var0;
        }

    }

    int method299(Class53 var1, Class53 var2) {
        if (var1.anInt406 == var2.anInt406) {
            return 0;
        } else {
            if (this.aBoolean367) {
                if (var1.anInt406 == Client.currentWorld) {
                    return -1;
                }

                if (Client.currentWorld == var2.anInt406) {
                    return 1;
                }
            }

            return var1.anInt406 < var2.anInt406 ? -1 : 1;
        }
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method299((Class53) var1, (Class53) var2);
    }
}
