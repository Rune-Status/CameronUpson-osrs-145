package com.jagex;

public class Class122_Sub2 extends Class122 {
    long aLong1291 = System.nanoTime();

    public void method665() {
        this.aLong1291 = System.nanoTime();
    }

    public int method666(int var1, int var2) {
        long var3 = 1000000L * (long) var2;
        long var5 = this.aLong1291 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }

        Class127.method875(var5 / 1000000L);
        long var7 = System.nanoTime();

        int var9;
        for (var9 = 0; var9 < 10 && (var9 < 1 || this.aLong1291 < var7); this.aLong1291 += (long) var1 * 1000000L) {
            ++var9;
        }

        if (this.aLong1291 < var7) {
            this.aLong1291 = var7;
        }

        return var9;
    }
}
