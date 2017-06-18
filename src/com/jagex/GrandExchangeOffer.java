package com.jagex;

public class GrandExchangeOffer {
    static int anInt731;
    static int anInt738;
    static int anInt736;
    public int itemId;
    public int itemPrice;
    public int transferred;
    public int itemQuantity;
    public int spent;
    byte state;

    public GrandExchangeOffer(Buffer var1, boolean var2) {
        this.state = var1.method870();
        this.itemId = var1.readUnsignedShort();
        this.itemPrice = var1.method835();
        this.itemQuantity = var1.method835();
        this.transferred = var1.method835();
        this.spent = var1.method835();
    }

    public GrandExchangeOffer() {
    }

    public static void method419(Class118 var0) {
        Class181.aClass118_2154 = var0;
    }

    public int method423() {
        return this.state & 7;
    }

    public int method421() {
        return (this.state & 8) == 8 ? 1 : 0;
    }

    void method420(int var1) {
        this.state &= -8;
        this.state = (byte) (this.state | var1 & 7);
    }

    void method422(int var1) {
        this.state &= -9;
        if (var1 == 1) {
            this.state = (byte) (this.state | 8);
        }

    }
}
