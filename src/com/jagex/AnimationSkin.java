package com.jagex;

import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;

public class AnimationSkin extends Node {
    static int anInt919;
    static CompressedImage aCompressedImage_1290;
    int count;
    int[] transforms;
    int[][] labels;
    int id;

    AnimationSkin(int var1, byte[] var2) {
        id = var1;
        Buffer var3 = new Buffer(var2);
        count = var3.readUnsignedByte();
        transforms = new int[count];
        labels = new int[count][];

        int var4;
        for (var4 = 0; var4 < count; ++var4) {
            transforms[var4] = var3.readUnsignedByte();
        }

        for (var4 = 0; var4 < count; ++var4) {
            labels[var4] = new int[var3.readUnsignedByte()];
        }

        for (var4 = 0; var4 < count; ++var4) {
            for (int var5 = 0; var5 < labels[var4].length; ++var5) {
                labels[var4][var5] = var3.readUnsignedByte();
            }
        }

    }

    static void method744(String var0, boolean var1, String var2, boolean var3) {
        if (var1) {
            if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(var0));
                    return;
                } catch (Exception var5) {
                }
            }

            if (Class40.aString344.startsWith("win") && !var3) {
                Class4.method15(var0, 0, "openjs");
                return;
            }

            if (Class40.aString344.startsWith("mac")) {
                Class4.method15(var0, 1, var2);
                return;
            }

            Class4.method15(var0, 2, "openjs");
        } else {
            Class4.method15(var0, 3, "openjs");
        }

    }

    public static int method745(int var0) {
        var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
        var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
        var0 = (var0 >>> 4) + var0 & 252645135;
        var0 += var0 >>> 8;
        var0 += var0 >>> 16;
        return var0 & 255;
    }
}
