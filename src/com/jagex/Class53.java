package com.jagex;

public class Class53 {
    public static Font aFont413;
    static int cameraX;
    static int[] anIntArray411;
    public final long aLong412;
    public final GrandExchangeOffer aGrandExchangeOffer408;
    public final int anInt406;
    String aString407;
    String aString410;

    Class53(Buffer var1, byte var2, int var3) {
        this.aString407 = var1.method819();
        this.aString410 = var1.method819();
        this.anInt406 = var1.readUnsignedShort();
        this.aLong412 = var1.method837();
        int var4 = var1.method835();
        int var5 = var1.method835();
        this.aGrandExchangeOffer408 = new GrandExchangeOffer();
        this.aGrandExchangeOffer408.method420(2);
        this.aGrandExchangeOffer408.method422(var2);
        this.aGrandExchangeOffer408.itemPrice = var4;
        this.aGrandExchangeOffer408.itemQuantity = var5;
        this.aGrandExchangeOffer408.transferred = 0;
        this.aGrandExchangeOffer408.spent = 0;
        this.aGrandExchangeOffer408.itemId = var3;
    }

    static void method338() {
        for (int var0 = 0; var0 < Client.anInt1501; ++var0) {
            int var1 = Client.npcIndices[var0];
            Npc var2 = Client.npcs[var1];
            if (var2 != null) {
                Class15.method133(var2, var2.definition.anInt221);
            }
        }

    }

    static int method339(int var0, int var1) {
        int var2 = Class119.method805(var0 + '넵', var1 + 91923, 4) - 128 + (Class119.method805(var0 + 10294, var1 + '鎽', 2) - 128 >> 1) + (Class119.method805(var0, var1, 1) - 128 >> 2);
        var2 = (int) ((double) var2 * 0.3D) + 35;
        if (var2 < 10) {
            var2 = 10;
        } else if (var2 > 60) {
            var2 = 60;
        }

        return var2;
    }

    static int method337(int var0, RuneScript var1, boolean var2) {
        int var3 = -1;
        InterfaceComponent var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = Class63.anIntArray645[--Class63.anInt644];
            var4 = Class161.method1016(var3);
        } else {
            var4 = var2 ? Class18.anInterfaceComponent129 : MapTile.anInterfaceComponent83;
        }

        if (var0 == 1000) {
            Class63.anInt644 -= 4;
            var4.anInt234 = Class63.anIntArray645[Class63.anInt644];
            var4.anInt765 = Class63.anIntArray645[Class63.anInt644 + 1];
            var4.anInt236 = Class63.anIntArray645[Class63.anInt644 + 2];
            var4.anInt213 = Class63.anIntArray645[Class63.anInt644 + 3];
            ItemTable.method284(var4);
            Class160.aClient1856.method900(var4);
            if (var3 != -1 && var4.type == 0) {
                Class44.method303(InterfaceComponent.interfaces[var3 >> 16], var4, false);
            }

            return 1;
        }
        if (var0 == 1001) {
            Class63.anInt644 -= 4;
            var4.anInt749 = Class63.anIntArray645[Class63.anInt644];
            var4.anInt748 = Class63.anIntArray645[Class63.anInt644 + 1];
            var4.anInt818 = Class63.anIntArray645[Class63.anInt644 + 2];
            var4.anInt233 = Class63.anIntArray645[Class63.anInt644 + 3];
            ItemTable.method284(var4);
            Class160.aClient1856.method900(var4);
            if (var3 != -1 && var4.type == 0) {
                Class44.method303(InterfaceComponent.interfaces[var3 >> 16], var4, false);
            }

            return 1;
        }
        if (var0 == 1003) {
            boolean var5 = Class63.anIntArray645[--Class63.anInt644] == 1;
            if (var5 != var4.explicitlyHidden) {
                var4.explicitlyHidden = var5;
                ItemTable.method284(var4);
            }

            return 1;
        }
        if (var0 == 1005) {
            var4.aBoolean1936 = Class63.anIntArray645[--Class63.anInt644] == 1;
            return 1;
        }
        if (var0 == 1006) {
            var4.aBoolean1945 = Class63.anIntArray645[--Class63.anInt644] == 1;
            return 1;
        }
        return 2;
    }

    public String method340() {
        return this.aString410;
    }

    public String method336() {
        return this.aString407;
    }
}
