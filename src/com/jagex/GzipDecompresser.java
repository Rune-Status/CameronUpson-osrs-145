package com.jagex;

import java.util.zip.Inflater;

public class GzipDecompresser {

    Inflater inflater;

    public GzipDecompresser() {
        this(-1, 1000000, 1000000);
    }

    GzipDecompresser(int var1, int var2, int var3) {
    }

    public static synchronized long currentTime() {
        long var0 = System.currentTimeMillis();
        if (var0 < Class125.aLong1365) {
            Class125.aLong1367 += Class125.aLong1365 - var0;
        }

        Class125.aLong1365 = var0;
        return var0 + Class125.aLong1367;
    }

    public void decompress(Buffer var1, byte[] var2) {
        if (var1.payload[var1.caret] == 31 && var1.payload[var1.caret + 1] == -117) {
            if (this.inflater == null) {
                this.inflater = new Inflater(true);
            }

            try {
                this.inflater.setInput(var1.payload, var1.caret + 10, var1.payload.length - (var1.caret + 10 + 8));
                this.inflater.inflate(var2);
            } catch (Exception var4) {
                this.inflater.reset();
                throw new RuntimeException("");
            }

            this.inflater.reset();
        } else {
            throw new RuntimeException("");
        }
    }
}
