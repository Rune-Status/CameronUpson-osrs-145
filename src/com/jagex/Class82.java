package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class82 {
    static CacheReferenceTable binary;
    static ReferenceTable aReferenceTable851;
    long aLong850;
    long aLong849;
    RandomAccessFile aRandomAccessFile847;

    public Class82(File var1, String var2, long var3) throws IOException {
        if (var3 == -1L) {
            var3 = Long.MAX_VALUE;
        }

        if (var1.length() >= var3) {
            var1.delete();
        }

        this.aRandomAccessFile847 = new RandomAccessFile(var1, var2);
        this.aLong850 = var3;
        this.aLong849 = 0L;
        int var5 = this.aRandomAccessFile847.read();
        if (var5 != -1 && !var2.equals("r")) {
            this.aRandomAccessFile847.seek(0L);
            this.aRandomAccessFile847.write(var5);
        }

        this.aRandomAccessFile847.seek(0L);
    }

    static void addHoveredUid(int var0) {
        Class105.onCursorUids[++Class105.onCursorCount - 1] = var0;
    }

    final void method474(long var1) throws IOException {
        this.aRandomAccessFile847.seek(var1);
        this.aLong849 = var1;
    }

    public final void method478(byte[] var1, int var2, int var3) throws IOException {
        if (this.aLong849 + (long) var3 > this.aLong850) {
            this.aRandomAccessFile847.seek(this.aLong850 + 1L);
            this.aRandomAccessFile847.write(1);
            throw new EOFException();
        }
        this.aRandomAccessFile847.write(var1, var2, var3);
        this.aLong849 += (long) var3;
    }

    public final long method475() throws IOException {
        return this.aRandomAccessFile847.length();
    }

    public final int method477(byte[] var1, int var2, int var3) throws IOException {
        int var4 = this.aRandomAccessFile847.read(var1, var2, var3);
        if (var4 > 0) {
            this.aLong849 += (long) var4;
        }

        return var4;
    }

    protected void finalize() throws Throwable {
        if (this.aRandomAccessFile847 != null) {
            System.out.println("");
            this.method476();
        }

    }

    public final void method476() throws IOException {
        if (this.aRandomAccessFile847 != null) {
            this.aRandomAccessFile847.close();
            this.aRandomAccessFile847 = null;
        }

    }
}
