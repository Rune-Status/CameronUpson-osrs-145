package com.jagex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class25 {
    static Buffer aBuffer177;
    int anInt178;
    Class103 aClass103_182;
    DataInputStream aDataInputStream176;
    long aLong179;
    byte[] aByteArray180;
    byte[] aByteArray175 = new byte[4];
    int anInt181;
    int anInt174;

    Class25(Class108 var1, URL var2) {
        this.aClass103_182 = var1.method752(var2);
        this.anInt174 = 0;
        this.aLong179 = Class124.method873() + 30000L;
    }

    static int method175(int var0, int var1, int var2) {
        int var3 = var0 >> 7;
        int var4 = var1 >> 7;
        if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
            int var5 = var2;
            if (var2 < 3 && (Class26.aByteArrayArrayArray189[1][var3][var4] & 2) == 2) {
                var5 = var2 + 1;
            }

            int var6 = var0 & 127;
            int var7 = var1 & 127;
            int var8 = Class26.anIntArrayArrayArray191[var5][var3 + 1][var4] * var6 + (128 - var6) * Class26.anIntArrayArrayArray191[var5][var3][var4] >> 7;
            int var9 = var6 * Class26.anIntArrayArrayArray191[var5][var3 + 1][var4 + 1] + Class26.anIntArrayArrayArray191[var5][var3][var4 + 1] * (128 - var6) >> 7;
            return (128 - var7) * var8 + var7 * var9 >> 7;
        } else {
            return 0;
        }
    }

    static void method176() {
        int var0 = Class84.anInt861;
        int var1 = Class77.anInt833;
        int var2 = Class108.anInt1299;
        int var3 = Class3.anInt16;
        int var4 = 6116423;
        Node_Sub21_Sub26.method1223(var0, var1, var2, var3, var4);
        Node_Sub21_Sub26.method1223(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        Node_Sub21_Sub26.method1208(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Class35.aFont313.method1170("Choose Option", var0 + 3, var1 + 14, var4, -1);
        int var5 = Class33.anInt261;
        int var6 = Class33.anInt260;

        int var7;
        int var8;
        int var9;
        for (var7 = 0; var7 < Client.menuRowCount; ++var7) {
            var8 = var1 + 31 + (Client.menuRowCount - 1 - var7) * 15;
            var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }

            Font var10 = Class35.aFont313;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (Client.menuTargets[var7].length() > 0) {
                var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
            } else {
                var11 = Client.menuActions[var7];
            }

            var10.method1170(var11, var0 + 3, var8, var9, 0);
        }

        var7 = Class84.anInt861;
        var8 = Class77.anInt833;
        var9 = Class108.anInt1299;
        int var12 = Class3.anInt16;

        for (int var13 = 0; var13 < Client.anInt1673; ++var13) {
            if (Client.interfacePositionsX[var13] + Client.interfaceWidths[var13] > var7 && Client.interfacePositionsX[var13] < var7 + var9 && Client.interfacePositionsY[var13] + Client.interfaceHeights[var13] > var8 && Client.interfacePositionsY[var13] < var8 + var12) {
                Client.aBooleanArray1674[var13] = true;
            }
        }

    }

    public static void method174(ScriptEvent var0) {
        Class9.method50(var0, 200000);
    }

    byte[] method173() throws IOException {
        if (Class124.method873() > this.aLong179) {
            throw new IOException();
        } else {
            if (this.anInt174 == 0) {
                if (this.aClass103_182.anInt1162 == 2) {
                    throw new IOException();
                }

                if (this.aClass103_182.anInt1162 == 1) {
                    this.aDataInputStream176 = (DataInputStream) this.aClass103_182.anObject1161;
                    this.anInt174 = 1;
                }
            }

            if (this.anInt174 == 1) {
                this.anInt178 += this.aDataInputStream176.read(this.aByteArray175, this.anInt178, this.aByteArray175.length - this.anInt178);
                if (this.anInt178 == 4) {
                    int var1 = (new Buffer(this.aByteArray175)).method835();
                    this.aByteArray180 = new byte[var1];
                    this.anInt174 = 2;
                }
            }

            if (this.anInt174 == 2) {
                this.anInt181 += this.aDataInputStream176.read(this.aByteArray180, this.anInt181, this.aByteArray180.length - this.anInt181);
                if (this.aByteArray180.length == this.anInt181) {
                    return this.aByteArray180;
                }
            }

            return null;
        }
    }
}
