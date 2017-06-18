public class Class50 {
    Node_Sub21_Sub1[] aNode_Sub21_Sub1Array379 = new Node_Sub21_Sub1[100];
    int anInt378;

    static void method317() {
        Class71.anInt729 = 0;

        for (int var0 = 0; var0 < 2048; ++var0) {
            Class71.aBufferArray728[var0] = null;
            Class71.aByteArray727[var0] = 1;
        }

    }

    static void method319(int var0, int var1, int var2, int var3) {
        for (int var4 = 0; var4 < Client.anInt1673; ++var4) {
            if (Client.interfaceWidths[var4] + Client.interfacePositionsX[var4] > var0 && Client.interfacePositionsX[var4] < var0 + var2 && Client.interfaceHeights[var4] + Client.interfacePositionsY[var4] > var1 && Client.interfacePositionsY[var4] < var1 + var3) {
                Client.aBooleanArray1656[var4] = true;
            }
        }

    }

    Node_Sub21_Sub1 method318(int var1) {
        return var1 >= 0 && var1 < this.anInt378 ? this.aNode_Sub21_Sub1Array379[var1] : null;
    }

    int method316() {
        return this.anInt378;
    }

    Node_Sub21_Sub1 method315(int var1, String var2, String var3, String var4) {
        Node_Sub21_Sub1 var5 = this.aNode_Sub21_Sub1Array379[99];

        for (int var6 = this.anInt378; var6 > 0; --var6) {
            if (var6 != 100) {
                this.aNode_Sub21_Sub1Array379[var6] = this.aNode_Sub21_Sub1Array379[var6 - 1];
            }
        }

        if (var5 == null) {
            var5 = new Node_Sub21_Sub1(var1, var2, var4, var3);
        } else {
            var5.unlink();
            var5.method977();
            var5.method180(var1, var2, var4, var3);
        }

        this.aNode_Sub21_Sub1Array379[0] = var5;
        if (this.anInt378 < 100) {
            ++this.anInt378;
        }

        return var5;
    }
}
