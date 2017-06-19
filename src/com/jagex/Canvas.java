package com.jagex;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class Canvas extends java.awt.Canvas {
    Component aComponent211;

    Canvas(Component var1) {
        this.aComponent211 = var1;
    }

    public static Sprite method186(byte[] var0) {
        BufferedImage var1 = null;

        try {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
            int var2 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var3 * var2];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
            var5.grabPixels();
            return new Sprite(var4, var2, var3);
        } catch (IOException var7) {
        } catch (InterruptedException var8) {
        }

        return new Sprite(0, 0);
    }

    static String method187(int var0) {
        return "<img=" + var0 + ">";
    }

    static void method188(Applet_Sub1 var0) {
        if (Class33.anInt265 == 1 || !Class163.aBoolean1965 && Class33.anInt265 == 4) {
            int var1 = Login.anInt702 + 280;
            if (Class33.anInt255 >= var1 && Class33.anInt255 <= var1 + 14 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(0, 0);
                return;
            }

            if (Class33.anInt255 >= var1 + 15 && Class33.anInt255 <= var1 + 80 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(0, 1);
                return;
            }

            int var2 = Login.anInt702 + 390;
            if (Class33.anInt255 >= var2 && Class33.anInt255 <= var2 + 14 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(1, 0);
                return;
            }

            if (Class33.anInt255 >= var2 + 15 && Class33.anInt255 <= var2 + 80 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(1, 1);
                return;
            }

            int var3 = Login.anInt702 + 500;
            if (Class33.anInt255 >= var3 && Class33.anInt255 <= var3 + 14 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(2, 0);
                return;
            }

            if (Class33.anInt255 >= var3 + 15 && Class33.anInt255 <= var3 + 80 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(2, 1);
                return;
            }

            int var4 = Login.anInt702 + 610;
            if (Class33.anInt255 >= var4 && Class33.anInt255 <= var4 + 14 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(3, 0);
                return;
            }

            if (Class33.anInt255 >= var4 + 15 && Class33.anInt255 <= var4 + 80 && Class33.anInt259 >= 4 && Class33.anInt259 <= 18) {
                Class138.method966(3, 1);
                return;
            }

            if (Class33.anInt255 >= Login.anInt702 + 708 && Class33.anInt259 >= 4 && Class33.anInt255 <= Login.anInt702 + 708 + 50 && Class33.anInt259 <= 20) {
                Login.aBoolean694 = false;
                Class3.aSprite17.method1242(Login.anInt702, 0);
                Login.aSprite697.method1242(Login.anInt702 + 382, 0);
                Login.aCompressedImage_695.method1155(Login.anInt702 + 382 - Login.aCompressedImage_695.anInt206 / 2, 18);
                return;
            }

            if (Login.anInt684 != -1) {
                World var5 = World.worlds[Login.anInt684];
                Class51.method320(var5);
                Login.aBoolean694 = false;
                Class3.aSprite17.method1242(Login.anInt702, 0);
                Login.aSprite697.method1242(Login.anInt702 + 382, 0);
                Login.aCompressedImage_695.method1155(Login.anInt702 + 382 - Login.aCompressedImage_695.anInt206 / 2, 18);
            }
        }

    }

    public final void paint(Graphics var1) {
        this.aComponent211.paint(var1);
    }

    public final void update(Graphics var1) {
        this.aComponent211.update(var1);
    }
}
