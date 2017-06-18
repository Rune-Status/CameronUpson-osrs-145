package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import java.util.Iterator;

public class MouseRecorder implements Runnable {
    protected static String aString248;
    static int anInt249;
    static boolean aBoolean1425 = false;
    static Hashtable aHashtable1426 = new Hashtable(16);
    boolean enabled = true;
    Object anObject250 = new Object();
    int[] anIntArray245 = new int[500];
    int index = 0;
    int[] anIntArray247 = new int[500];

    static int method212(int var0, RuneScript var1, boolean var2) {
        int var3 = -1;
        InterfaceComponent var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = Class63.anIntArray645[--Class63.anInt644];
            var4 = InterfaceComponent.method1016(var3);
        } else {
            var4 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
        }

        if (var0 == 1100) {
            Class63.anInt644 -= 2;
            var4.insetX = Class63.anIntArray645[Class63.anInt644];
            if (var4.insetX > var4.viewportWidth - var4.width) {
                var4.insetX = var4.viewportWidth - var4.width;
            }

            if (var4.insetX < 0) {
                var4.insetX = 0;
            }

            var4.insetY = Class63.anIntArray645[Class63.anInt644 + 1];
            if (var4.insetY > var4.viewportHeight - var4.height) {
                var4.insetY = var4.viewportHeight - var4.height;
            }

            if (var4.insetY < 0) {
                var4.insetY = 0;
            }

            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1101) {
            var4.textColor = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1102) {
            var4.aBoolean1861 = Class63.anIntArray645[--Class63.anInt644] == 1;
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1103) {
            var4.anInt1864 = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1104) {
            var4.anInt1859 = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1105) {
            var4.materialId = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1106) {
            var4.spriteId = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1107) {
            var4.aBoolean789 = Class63.anIntArray645[--Class63.anInt644] == 1;
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1108) {
            var4.modelType = 1;
            var4.modelId = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1109) {
            Class63.anInt644 -= 6;
            var4.modelOffsetX = Class63.anIntArray645[Class63.anInt644];
            var4.modelOffsetY = Class63.anIntArray645[Class63.anInt644 + 1];
            var4.xRotation = Class63.anIntArray645[Class63.anInt644 + 2];
            var4.zRotation = Class63.anIntArray645[Class63.anInt644 + 3];
            var4.yRotation = Class63.anIntArray645[Class63.anInt644 + 4];
            var4.modelZoom = Class63.anIntArray645[Class63.anInt644 + 5];
            ItemTable.method284(var4);
            return 1;
        }
        int var8;
        if (var0 == 1110) {
            var8 = Class63.anIntArray645[--Class63.anInt644];
            if (var4.anInt784 != var8) {
                var4.anInt784 = var8;
                var4.anInt1932 = 0;
                var4.anInt1929 = 0;
                ItemTable.method284(var4);
            }

            return 1;
        }
        if (var0 == 1111) {
            var4.aBoolean1869 = Class63.anIntArray645[--Class63.anInt644] == 1;
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1112) {
            String var6 = Class63.aStringArray640[--Class77.anInt828];
            if (!var6.equals(var4.text)) {
                var4.text = var6;
                ItemTable.method284(var4);
            }

            return 1;
        }
        if (var0 == 1113) {
            var4.fontId = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1114) {
            Class63.anInt644 -= 3;
            var4.anInt796 = Class63.anIntArray645[Class63.anInt644];
            var4.anInt795 = Class63.anIntArray645[Class63.anInt644 + 1];
            var4.anInt802 = Class63.anIntArray645[Class63.anInt644 + 2];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1115) {
            var4.textShadowed = Class63.anIntArray645[--Class63.anInt644] == 1;
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1116) {
            var4.borderThickness = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1117) {
            var4.shadowColor = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1118) {
            var4.flippedVertically = Class63.anIntArray645[--Class63.anInt644] == 1;
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1119) {
            var4.flippedHorizontally = Class63.anIntArray645[--Class63.anInt644] == 1;
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1120) {
            Class63.anInt644 -= 2;
            var4.viewportWidth = Class63.anIntArray645[Class63.anInt644];
            var4.viewportHeight = Class63.anIntArray645[Class63.anInt644 + 1];
            ItemTable.method284(var4);
            if (var3 != -1 && var4.type == 0) {
                Class44.method303(InterfaceComponent.interfaces[var3 >> 16], var4, false);
            }

            return 1;
        }
        if (var0 == 1121) {
            Class45.method306(var4.uid, var4.componentIndex);
            Client.anInterfaceComponent1627 = var4;
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1122) {
            var4.enabledMaterialId = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1123) {
            var4.anInt761 = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1124) {
            var4.anInt1860 = Class63.anIntArray645[--Class63.anInt644];
            ItemTable.method284(var4);
            return 1;
        }
        if (var0 == 1125) {
            var8 = Class63.anIntArray645[--Class63.anInt644];
            Class172 var7 = (Class172) Canvas.method185(Class33.method221(), var8);
            if (var7 != null) {
                var4.aClass172_1865 = var7;
                ItemTable.method284(var4);
            }

            return 1;
        }
        if (var0 == 1126) {
            var4.aBoolean1863 = Class63.anIntArray645[--Class63.anInt644] == 1;
            return 1;
        }
        return 2;
    }

    static File method211(String var0) {
        if (!aBoolean1425) {
            throw new RuntimeException("");
        }
        File var1 = (File) aHashtable1426.get(var0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Class78.aFile841, var0);
        RandomAccessFile var3 = null;

        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            aHashtable1426.put(var0, var2);
            return var2;
        } catch (Exception var8) {
            try {
                if (var3 != null) {
                    var3.close();
                    var3 = null;
                }
            } catch (Exception var7) {
            }

            throw new RuntimeException();
        }
    }

    static String method213() {
        String var0 = "";

        Node_Sub21_Sub1 var2;
        for (Iterator var1 = Class59.A_ITERABLE_NODE_TABLE___628.iterator(); var1.hasNext(); var0 = var0 + var2.aString205 + ':' + var2.aString208 + '\n') {
            var2 = (Node_Sub21_Sub1) var1.next();
        }

        return var0;
    }

    public void run() {
        for (; this.enabled; Class127.method875(50L)) {
            Object var1 = this.anObject250;
            synchronized (this.anObject250) {
                if (this.index < 500) {
                    this.anIntArray245[this.index] = Class33.anInt261;
                    this.anIntArray247[this.index] = Class33.anInt260;
                    ++this.index;
                }
            }
        }

    }
}
