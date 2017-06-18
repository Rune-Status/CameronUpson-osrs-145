package com.jagex;

import java.util.zip.Inflater;

public class Class124 {
    Inflater anInflater1364;

    public Class124() {
        this(-1, 1000000, 1000000);
    }

    Class124(int var1, int var2, int var3) {
    }

    public static synchronized long currentTime() {
        long var0 = System.currentTimeMillis();
        if (var0 < Class125.aLong1365) {
            Class125.aLong1367 += Class125.aLong1365 - var0;
        }

        Class125.aLong1365 = var0;
        return var0 + Class125.aLong1367;
    }

    public void method874(Buffer var1, byte[] var2) {
        if (var1.payload[var1.caret] == 31 && var1.payload[var1.caret + 1] == -117) {
            if (this.anInflater1364 == null) {
                this.anInflater1364 = new Inflater(true);
            }

            try {
                this.anInflater1364.setInput(var1.payload, var1.caret + 10, var1.payload.length - (var1.caret + 10 + 8));
                this.anInflater1364.inflate(var2);
            } catch (Exception var4) {
                this.anInflater1364.reset();
                throw new RuntimeException("");
            }

            this.anInflater1364.reset();
        } else {
            throw new RuntimeException("");
        }
    }
}
