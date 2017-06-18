package com.jagex;

public class Class119 {
    static CacheReferenceTable aCacheReferenceTable1357;
    static int anInt1356;

    static int method806(int var0, RuneScript var1, boolean var2) {
        InterfaceComponent var3;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = InterfaceComponent.method1016(Class63.anIntArray645[--Class63.anInt644]);
        } else {
            var3 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
        }

        ItemTable.method284(var3);
        if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
            if (var0 == 1201) {
                var3.modelType = 2;
                var3.modelId = Class63.anIntArray645[--Class63.anInt644];
                return 1;
            }
            if (var0 == 1202) {
                var3.modelType = 3;
                var3.modelId = Client.player.appearance.method1036();
                return 1;
            }
            return 2;
        }
        Class63.anInt644 -= 2;
        int var4 = Class63.anIntArray645[Class63.anInt644];
        int var5 = Class63.anIntArray645[Class63.anInt644 + 1];
        var3.itemId = var4;
        var3.itemStackSize = var5;
        ItemDefinition var6 = Class149.method1001(var4);
        var3.xRotation = var6.anInt668;
        var3.zRotation = var6.anInt236;
        var3.yRotation = var6.anInt213;
        var3.modelOffsetX = var6.anInt818;
        var3.modelOffsetY = var6.anInt233;
        var3.modelZoom = var6.anInt219;
        if (var0 == 1205) {
            var3.anInt777 = 0;
        } else if (var0 == 1212 | var6.stackable == 1) {
            var3.anInt777 = 1;
        } else {
            var3.anInt777 = 2;
        }

        if (var3.anInt772 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.anInt772;
        } else if (var3.anInt749 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.anInt749;
        }

        return 1;
    }

    static int method805(int var0, int var1, int var2) {
        int var3 = var0 / var2;
        int var4 = var0 & var2 - 1;
        int var5 = var1 / var2;
        int var6 = var1 & var2 - 1;
        int var7 = Class23.method153(var3, var5);
        int var8 = Class23.method153(var3 + 1, var5);
        int var9 = Class23.method153(var3, var5 + 1);
        int var10 = Class23.method153(var3 + 1, var5 + 1);
        int var11 = 65536 - Node_Sub21_Sub26_Sub1.COS[var4 * 1024 / var2] >> 1;
        int var12 = (var11 * var8 >> 16) + (var7 * (65536 - var11) >> 16);
        int var13 = 65536 - Node_Sub21_Sub26_Sub1.COS[var4 * 1024 / var2] >> 1;
        int var14 = (var10 * var13 >> 16) + ((65536 - var13) * var9 >> 16);
        int var15 = 65536 - Node_Sub21_Sub26_Sub1.COS[var6 * 1024 / var2] >> 1;
        return (var15 * var14 >> 16) + ((65536 - var15) * var12 >> 16);
    }
}
