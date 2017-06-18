package com.jagex;

public final class PickableNode extends Entity {
    static InterfaceComponent anInterfaceComponent673;
    static int anInt671;
    static Class182 aClass182_672;
    int id;
    int stackSize;

    static void method395(Packet var0) {
        for (int var1 = 0; var1 < Class71.anInt724; ++var1) {
            int var2 = Class71.anIntArray717[var1];
            Player var3 = Client.players[var2];
            int var4 = var0.readUnsignedByte();
            if ((var4 & 1) != 0) {
                var4 += var0.readUnsignedByte() << 8;
            }

            Class7.method41(var0, var2, var3, var4);
        }

    }

    static void method396() {
        if (Class60.method369()) {
            Login.aBoolean694 = true;
        }

    }

    protected final Model method191() {
        return Class149.method1001(this.id).method1141(this.stackSize);
    }
}
