package com.jagex;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class GraphicsProvider extends Class186 {
    Component aComponent172;
    Image image;

    GraphicsProvider(int var1, int var2, Component var3) {
        if (var1 == 0) {
            var1 = 765;
            var2 = 503;
        }
        this.anInt2180 = var1;
        this.anInt2182 = var2;
        this.anIntArray2181 = new int[var1 * var2 + 1];
        DataBufferInt var4 = new DataBufferInt(this.anIntArray2181, this.anIntArray2181.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.anInt2180, this.anInt2182), var4, null);
        this.image = new BufferedImage(var5, var6, false, new Hashtable());
        this.method168(var3);
        this.method1251();
    }

    final void method168(Component var1) {
        this.aComponent172 = var1;
    }

    public final void method172(int var1, int var2) {
        this.drawGame(this.aComponent172.getGraphics(), var1, var2);
    }

    public final void method170(int var1, int var2, int var3, int var4) {
        this.method171(this.aComponent172.getGraphics(), var1, var2, var3, var4);
    }

    final void drawGame(Graphics gameGraphics, int x, int y) {
        try {
            Graphics paint = image.getGraphics().create();
            if (Client.connectionState == 30 && Client.player != null) {
                Model model = Client.player.getModel();
                if (model != null) {
                    BoundingBox bb = model.boundingBox;
                    if (bb != null) {
                        bb.draw();
                    }
                }
            }
            gameGraphics.drawImage(this.image, x, y, this.aComponent172);
        } catch (Exception var5) {
            this.aComponent172.repaint();
        }

    }

    final void method171(Graphics var1, int var2, int var3, int var4, int var5) {
        try {
            Shape var6 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.image, 0, 0, this.aComponent172);
            var1.setClip(var6);
        } catch (Exception var7) {
            this.aComponent172.repaint();
        }

    }
}
