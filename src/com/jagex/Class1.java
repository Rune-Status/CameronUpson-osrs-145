package com.jagex;

public class Class1 implements Class16 {
    int anInt4;
    int anInt2;
    int anInt1;
    int anInt5;
    int anInt6;
    int anInt3;

    public static boolean method3(int var0) {
        return (var0 >> 30 & 1) != 0;
    }

    static void method4(int var0) {
        Client.aLong1691 = 0L;
        Client.aBoolean1690 = var0 >= 2;

        if (Node_Sub21_Sub20.method1126() == 1) {
            Class160.aClient1856.method260(765, 503);
        } else {
            Class160.aClient1856.method260(7680, 2160);
        }

        if (Client.connectionState >= 25) {
            Class34.method224();
        }

    }

    static boolean method6(InterfaceComponent var0) {
        if (Client.aBoolean1637) {
            if (Class75.method448(var0) != 0) {
                return false;
            }

            if (var0.type == 0) {
                return false;
            }
        }

        return var0.explicitlyHidden;
    }

    static void method11(int var0) {
        for (IntegerNode var1 = Client.interfaceConfigs.first(); var1 != null; var1 = Client.interfaceConfigs.next()) {
            if ((long) var0 == (var1.key >> 48 & 65535L)) {
                var1.unlink();
            }
        }

    }

    public void method1(Class12 var1) {
        if (var1.anInt89 > this.anInt4) {
            var1.anInt89 = this.anInt4;
        }

        if (var1.anInt88 < this.anInt4) {
            var1.anInt88 = this.anInt4;
        }

        if (var1.anInt87 > this.anInt5) {
            var1.anInt87 = this.anInt5;
        }

        if (var1.anInt84 < this.anInt5) {
            var1.anInt84 = this.anInt5;
        }

    }

    public boolean method5(int var1, int var2) {
        return var1 >> 6 == this.anInt4 && this.anInt5 == var2 >> 6;
    }

    public int[] method2(int var1, int var2, int var3) {
        if (!this.method10(var1, var2, var3)) {
            return null;
        } else {
            return new int[]{var2 + (this.anInt4 * 64 - this.anInt3 * 64), this.anInt5 * 64 - this.anInt2 * 64 + var3};
        }
    }

    void method8() {
    }

    public boolean method10(int var1, int var2, int var3) {
        if (var1 >= this.anInt1 && var1 < this.anInt1 + this.anInt6) {
            return var2 >> 6 == this.anInt3 && this.anInt2 == var3 >> 6;
        } else {
            return false;
        }
    }

    public void decode(Buffer var1) {
        this.anInt1 = var1.readUnsignedByte();
        this.anInt6 = var1.readUnsignedByte();
        this.anInt3 = var1.readUnsignedShort();
        this.anInt2 = var1.readUnsignedShort();
        this.anInt4 = var1.readUnsignedShort();
        this.anInt5 = var1.readUnsignedShort();
        this.method8();
    }

    public SceneOffset method7(int var1, int var2) {
        if (!this.method5(var1, var2)) {
            return null;
        } else {
            int var3 = this.anInt3 * 64 - this.anInt4 * 64 + var1;
            int var4 = this.anInt2 * 64 - this.anInt5 * 64 + var2;
            return new SceneOffset(this.anInt1, var3, var4);
        }
    }
}
