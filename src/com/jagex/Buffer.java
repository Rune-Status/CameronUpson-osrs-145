package com.jagex;

import java.math.BigInteger;

public class Buffer extends Node {
    public static int[] anIntArray340 = new int[256];
    static long[] aLongArray1362;
    static int anInt1363;

    static {
        int var2;
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;

            for (var2 = 0; var2 < 8; ++var2) {
                if ((var1 & 1) == 1) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }

            anIntArray340[var0] = var1;
        }

        aLongArray1362 = new long[256];

        for (var2 = 0; var2 < 256; ++var2) {
            long var3 = (long) var2;

            for (int var5 = 0; var5 < 8; ++var5) {
                if (1L == (var3 & 1L)) {
                    var3 = var3 >>> 1 ^ -3932672073523589310L;
                } else {
                    var3 >>>= 1;
                }
            }

            aLongArray1362[var2] = var3;
        }

    }

    public int caret;
    public byte[] payload;

    public Buffer(byte[] var1) {
        payload = var1;
        caret = 0;
    }

    public Buffer(int var1) {
        payload = Class128.method878(var1);
        caret = 0;
    }

    public int method841() {
        caret += 2;
        int var1 = ((payload[caret - 1] & 255) << 8) + (payload[caret - 2] - 128 & 255);
        if (var1 > 32767) {
            var1 -= 65536;
        }

        return var1;
    }

    public void method867(int var1) {
        payload[++caret - 1] = (byte) (var1 >> 16);
        payload[++caret - 1] = (byte) (var1 >> 8);
        payload[++caret - 1] = (byte) var1;
    }

    public void method869(int var1) {
        payload[++caret - 1] = (byte) (var1 >> 24);
        payload[++caret - 1] = (byte) (var1 >> 16);
        payload[++caret - 1] = (byte) (var1 >> 8);
        payload[++caret - 1] = (byte) var1;
    }

    public void method872(long var1) {
        payload[++caret - 1] = (byte) ((int) (var1 >> 40));
        payload[++caret - 1] = (byte) ((int) (var1 >> 32));
        payload[++caret - 1] = (byte) ((int) (var1 >> 24));
        payload[++caret - 1] = (byte) ((int) (var1 >> 16));
        payload[++caret - 1] = (byte) ((int) (var1 >> 8));
        payload[++caret - 1] = (byte) ((int) var1);
    }

    public int method840() {
        caret += 2;
        return ((payload[caret - 2] & 255) << 8) + (payload[caret - 1] - 128 & 255);
    }

    public void method861(long var1) {
        payload[++caret - 1] = (byte) ((int) (var1 >> 56));
        payload[++caret - 1] = (byte) ((int) (var1 >> 48));
        payload[++caret - 1] = (byte) ((int) (var1 >> 40));
        payload[++caret - 1] = (byte) ((int) (var1 >> 32));
        payload[++caret - 1] = (byte) ((int) (var1 >> 24));
        payload[++caret - 1] = (byte) ((int) (var1 >> 16));
        payload[++caret - 1] = (byte) ((int) (var1 >> 8));
        payload[++caret - 1] = (byte) ((int) var1);
    }

    public void method864(String var1) {
        int var2 = var1.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        payload[++caret - 1] = 0;
        caret += Node_Sub21_Sub20.method1125(var1, 0, var1.length(), payload, caret);
        payload[++caret - 1] = 0;
    }

    public int readInt() {
        caret += 4;
        return (payload[caret - 1] & 255) + ((payload[caret - 4] & 255) << 24) + ((payload[caret - 3] & 255) << 16) + ((payload[caret - 2] & 255) << 8);
    }

    public void method860(byte[] var1, int var2, int var3) {
        for (int var4 = var2; var4 < var3 + var2; ++var4) {
            payload[++caret - 1] = var1[var4];
        }

    }

    public void method862(int var1) {
        payload[caret - var1 - 1] = (byte) var1;
    }

    public void method547(int var1) {
        if (var1 >= 0 && var1 < 128) {
            method451(var1);
        } else if (var1 >= 0 && var1 < 32768) {
            method755(var1 + '耀');
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method863(int var1) {
        if ((var1 & -128) != 0) {
            if ((var1 & -16384) != 0) {
                if ((var1 & -2097152) != 0) {
                    if ((var1 & -268435456) != 0) {
                        method451(var1 >>> 28 | 128);
                    }

                    method451(var1 >>> 21 | 128);
                }

                method451(var1 >>> 14 | 128);
            }

            method451(var1 >>> 7 | 128);
        }

        method451(var1 & 127);
    }

    public int readUnsignedByte() {
        return payload[++caret - 1] & 255;
    }

    public byte method870() {
        return payload[++caret - 1];
    }

    public long method837() {
        long var1 = (long) readInt() & 4294967295L;
        long var3 = (long) readInt() & 4294967295L;
        return var3 + (var1 << 32);
    }

    public String method820() {
        if (payload[caret] == 0) {
            ++caret;
            return null;
        }
        return method819();
    }

    public String method819() {
        int var1 = caret;

        while (payload[++caret - 1] != 0) {
        }

        int var2 = caret - var1 - 1;
        return var2 == 0 ? "" : Class6_Sub2.method458(payload, var1, var2);
    }

    public String readPrefixedString() {
        byte var1 = payload[++caret - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = caret;

        while (payload[++caret - 1] != 0) {
        }

        int var3 = caret - var2 - 1;
        return var3 == 0 ? "" : Class6_Sub2.method458(payload, var2, var3);
    }

    public int method541() {
        int var1 = payload[caret] & 255;
        return var1 < 128 ? readUnsignedByte() : readUnsignedShort() - '耀';
    }

    public int readUnsignedShort() {
        caret += 2;
        return ((payload[caret - 2] & 255) << 8) + (payload[caret - 1] & 255);
    }

    public int readSmart32() {
        if (payload[caret] < 0) {
            return readInt() & Integer.MAX_VALUE;
        }
        int var1 = readUnsignedShort();
        return var1 == 32767 ? -1 : var1;
    }

    public int method817() {
        byte var1 = payload[++caret - 1];

        int var2;
        for (var2 = 0; var1 < 0; var1 = payload[++caret - 1]) {
            var2 = (var2 | var1 & 127) << 7;
        }

        return var2 | var1;
    }

    public void method815(int[] var1) {
        int var2 = caret / 8;
        caret = 0;

        for (int var3 = 0; var3 < var2; ++var3) {
            int var4 = readInt();
            int var5 = readInt();
            int var6 = 0;
            int var7 = -1640531527;

            for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3]) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var6 & 3] + var6;
                var6 += var7;
            }

            caret -= 8;
            method869(var4);
            method869(var5);
        }

    }

    public void method824(int[] var1, int var2, int var3) {
        int var4 = caret;
        caret = var2;
        int var5 = (var3 - var2) / 8;

        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = readInt();
            int var8 = readInt();
            int var9 = 0;
            int var10 = -1640531527;

            for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var9 + var1[var9 >>> 11 & 3]) {
                var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var9 & 3] + var9;
                var9 += var10;
            }

            caret -= 8;
            method869(var7);
            method869(var8);
        }

        caret = var4;
    }

    public void method821(int[] var1, int var2, int var3) {
        int var4 = caret;
        caret = var2;
        int var5 = (var3 - var2) / 8;

        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = readInt();
            int var8 = readInt();
            int var9 = -957401312;
            int var10 = -1640531527;

            for (int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
                var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
                var9 -= var10;
            }

            caret -= 8;
            method869(var7);
            method869(var8);
        }

        caret = var4;
    }

    public void method830(BigInteger var1, BigInteger var2) {
        int var3 = caret;
        caret = 0;
        byte[] var4 = new byte[var3];
        read(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(var1, var2);
        byte[] var7 = var6.toByteArray();
        caret = 0;
        method755(var7.length);
        method860(var7, 0, var7.length);
    }

    public int method868() {
        caret += 3;
        return ((payload[caret - 2] & 255) << 8) + ((payload[caret - 3] & 255) << 16) + (payload[caret - 1] & 255);
    }

    public boolean method827() {
        caret -= 4;
        byte[] var1 = payload;
        int var2 = caret;
        int var3 = -1;

        int var4;
        for (var4 = 0; var4 < var2; ++var4) {
            var3 = var3 >>> 8 ^ anIntArray340[(var3 ^ var1[var4]) & 255];
        }

        var3 = ~var3;
        var4 = readInt();
        return var3 == var4;
    }

    public void method855(int var1) {
        payload[++caret - 1] = (byte) var1;
        payload[++caret - 1] = (byte) (var1 >> 8);
        payload[++caret - 1] = (byte) (var1 >> 16);
        payload[++caret - 1] = (byte) (var1 >> 24);
    }

    public void method836(int var1) {
        payload[++caret - 1] = (byte) (128 - var1);
    }

    public int method834() {
        return payload[++caret - 1] - 128 & 255;
    }

    public int method818() {
        return 128 - payload[++caret - 1] & 255;
    }

    public byte method833() {
        return (byte) (payload[++caret - 1] - 128);
    }

    public void method843(int var1) {
        payload[++caret - 1] = (byte) var1;
        payload[++caret - 1] = (byte) (var1 >> 8);
    }

    public void method845(int var1) {
        payload[++caret - 1] = (byte) (var1 >> 8);
        payload[++caret - 1] = (byte) (var1 + 128);
    }

    public void method853(int var1) {
        payload[++caret - 1] = (byte) (var1 + 128);
        payload[++caret - 1] = (byte) (var1 >> 8);
    }

    public int method856() {
        caret += 2;
        return (payload[caret - 2] & 255) + ((payload[caret - 1] & 255) << 8);
    }

    public void method839(int var1) {
        payload[++caret - 1] = (byte) (var1 + 128);
    }

    public int method849() {
        caret += 2;
        return ((payload[caret - 1] & 255) << 8) + (payload[caret - 2] - 128 & 255);
    }

    public int method847() {
        caret += 2;
        int var1 = ((payload[caret - 1] & 255) << 8) + (payload[caret - 2] & 255);
        if (var1 > 32767) {
            var1 -= 65536;
        }

        return var1;
    }

    public void method842(int var1) {
        payload[++caret - 1] = (byte) (var1 >> 16);
        payload[++caret - 1] = (byte) (var1 >> 24);
        payload[++caret - 1] = (byte) var1;
        payload[++caret - 1] = (byte) (var1 >> 8);
    }

    public int method848() {
        caret += 4;
        return (payload[caret - 4] & 255) + ((payload[caret - 2] & 255) << 16) + ((payload[caret - 1] & 255) << 24) + ((payload[caret - 3] & 255) << 8);
    }

    public String method825() {
        byte var1 = payload[++caret - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = method817();
        if (var2 + caret > payload.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = payload;
        int var4 = caret;
        char[] var5 = new char[var2];
        int var6 = 0;
        int var7 = var4;

        int var10;
        for (int var8 = var4 + var2; var7 < var8; var5[var6++] = (char) var10) {
            int var9 = var3[var7++] & 255;
            if (var9 < 128) {
                if (var9 == 0) {
                    var10 = 65533;
                } else {
                    var10 = var9;
                }
            } else if (var9 < 192) {
                var10 = 65533;
            } else if (var9 < 224) {
                if (var7 < var8 && (var3[var7] & 192) == 128) {
                    var10 = (var9 & 31) << 6 | var3[var7++] & 63;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 < 240) {
                if (var7 + 1 < var8 && (var3[var7] & 192) == 128 && (var3[var7 + 1] & 192) == 128) {
                    var10 = (var9 & 15) << 12 | (var3[var7++] & 63) << 6 | var3[var7++] & 63;
                    if (var10 < 2048) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 < 248) {
                if (var7 + 2 < var8 && (var3[var7] & 192) == 128 && (var3[var7 + 1] & 192) == 128 && (var3[var7 + 2] & 192) == 128) {
                    var10 = (var9 & 7) << 18 | (var3[var7++] & 63) << 12 | (var3[var7++] & 63) << 6 | var3[var7++] & 63;
                    if (var10 >= 65536 && var10 <= 1114111) {
                        var10 = 65533;
                    } else {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else {
                var10 = 65533;
            }
        }

        String var11 = new String(var5, 0, var6);
        caret += var2;
        return var11;
    }

    public int method832(int var1) {
        byte[] var2 = payload;
        int var3 = caret;
        int var4 = -1;

        for (int var5 = var1; var5 < var3; ++var5) {
            var4 = var4 >>> 8 ^ anIntArray340[(var4 ^ var2[var5]) & 255];
        }

        var4 = ~var4;
        method869(var4);
        return var4;
    }

    public void method850(int var1) {
        payload[++caret - 1] = (byte) (var1 >> 8);
        payload[++caret - 1] = (byte) var1;
        payload[++caret - 1] = (byte) (var1 >> 24);
        payload[++caret - 1] = (byte) (var1 >> 16);
    }

    public int method852() {
        caret += 4;
        return ((payload[caret - 3] & 255) << 24) + ((payload[caret - 4] & 255) << 16) + ((payload[caret - 1] & 255) << 8) + (payload[caret - 2] & 255);
    }

    public void method865(String var1) {
        int var2 = var1.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        caret += Node_Sub21_Sub20.method1125(var1, 0, var1.length(), payload, caret);
        payload[++caret - 1] = 0;
    }

    public void method854(int var1) {
        payload[++caret - 1] = (byte) (var1 >> 16);
        payload[++caret - 1] = (byte) var1;
        payload[++caret - 1] = (byte) (var1 >> 8);
    }

    public int method816() {
        int var1 = payload[caret] & 255;
        return var1 < 128 ? readUnsignedByte() - 64 : readUnsignedShort() - '쀀';
    }

    public void method857(CharSequence var1) {
        int var2 = Class54.method347(var1);
        payload[++caret - 1] = 0;
        method863(var2);
        caret += Class17.method135(payload, caret, var1);
    }

    public int method831() {
        return payload[caret] < 0 ? readInt() & Integer.MAX_VALUE : readUnsignedShort();
    }

    public void method866(int var1) {
        payload[caret - var1 - 2] = (byte) (var1 >> 8);
        payload[caret - var1 - 1] = (byte) var1;
    }

    public int method846() {
        caret += 4;
        return ((payload[caret - 1] & 255) << 16) + ((payload[caret - 2] & 255) << 24) + ((payload[caret - 4] & 255) << 8) + (payload[caret - 3] & 255);
    }

    public byte method844() {
        return (byte) (0 - payload[++caret - 1]);
    }

    public void method755(int var1) {
        payload[++caret - 1] = (byte) (var1 >> 8);
        payload[++caret - 1] = (byte) var1;
    }

    public void method838(int[] var1) {
        int var2 = caret / 8;
        caret = 0;

        for (int var3 = 0; var3 < var2; ++var3) {
            int var4 = readInt();
            int var5 = readInt();
            int var6 = -957401312;
            int var7 = -1640531527;

            for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
                var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
                var6 -= var7;
            }

            caret -= 8;
            method869(var4);
            method869(var5);
        }

    }

    public void method451(int var1) {
        payload[++caret - 1] = (byte) var1;
    }

    public void method823(int var1) {
        payload[++caret - 1] = (byte) (0 - var1);
    }

    public int method851() {
        caret += 2;
        int var1 = (payload[caret - 1] - 128 & 255) + ((payload[caret - 2] & 255) << 8);
        if (var1 > 32767) {
            var1 -= 65536;
        }

        return var1;
    }

    public int method822() {
        return 0 - payload[++caret - 1] & 255;
    }

    public void method578(int var1) {
        payload[caret - var1 - 4] = (byte) (var1 >> 24);
        payload[caret - var1 - 3] = (byte) (var1 >> 16);
        payload[caret - var1 - 2] = (byte) (var1 >> 8);
        payload[caret - var1 - 1] = (byte) var1;
    }

    public int readShort() {
        caret += 2;
        int var1 = (payload[caret - 1] & 255) + ((payload[caret - 2] & 255) << 8);
        if (var1 > 32767) {
            var1 -= 65536;
        }

        return var1;
    }

    public void read(byte[] var1, int var2, int var3) {
        for (int var4 = var2; var4 < var2 + var3; ++var4) {
            var1[var4] = payload[++caret - 1];
        }

    }
}
