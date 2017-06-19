package com.jagex;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;

public class Class93 {
    long aLong1005;
    byte[] aByteArray1004;
    int anInt1002 = 0;
    int anInt997;
    byte[] aByteArray1000;
    long aLong996;
    long aLong1003 = -1L;
    long aLong998 = -1L;
    long aLong999;
    Class82 aClass82_995;
    long aLong1001;

    public Class93(Class82 var1, int var2, int var3) throws IOException {
        this.aClass82_995 = var1;
        this.aLong996 = this.aLong999 = var1.method475();
        this.aByteArray1004 = new byte[var2];
        this.aByteArray1000 = new byte[var3];
        this.aLong1001 = 0L;
    }

    static void method601(ReferenceTable var0, ReferenceTable var1, boolean var2, int var3) {
        if (Login.aBoolean706) {
            if (var3 == 4) {
                Login.anInt701 = 4;
            }

        } else {
            Login.anInt701 = var3;
            DrawingArea.method1218();
            byte[] var4 = var0.method1105("title.jpg", "");
            BufferedImage var5 = null;

            int var6;
            int var7;
            Sprite var10;
            label155:
            {
                try {
                    var5 = ImageIO.read(new ByteArrayInputStream(var4));
                    var6 = var5.getWidth();
                    var7 = var5.getHeight();
                    int[] var8 = new int[var6 * var7];
                    PixelGrabber var9 = new PixelGrabber(var5, 0, 0, var6, var7, var8, 0, var6);
                    var9.grabPixels();
                    var10 = new Sprite(var8, var6, var7);
                    break label155;
                } catch (IOException var13) {
                } catch (InterruptedException var14) {
                }

                var10 = new Sprite(0, 0);
            }

            Class3.aSprite17 = var10;
            Login.aSprite697 = Class3.aSprite17.method1241();
            if ((Client.currentWorldMask & 536870912) != 0) {
                Login.aCompressedImage_695 = Class185.method1203(var1, "logo_deadman_mode", "");
            } else {
                Login.aCompressedImage_695 = Class185.method1203(var1, "logo", "");
            }

            Login.aCompressedImage_690 = Class185.method1203(var1, "titlebox", "");
            Login.aCompressedImage_709 = Class185.method1203(var1, "titlebutton", "");
            Class17.aCompressedImageArray126 = InterfaceNode.method267(var1, "runes", "");
            Login.aCompressedImageArray692 = InterfaceNode.method267(var1, "title_mute", "");
            Class49.aCompressedImage_375 = Class185.method1203(var1, "options_radio_buttons,0", "");
            AnimationSkin.aCompressedImage_1290 = Class185.method1203(var1, "options_radio_buttons,2", "");
            Class20.anIntArray138 = new int[256];

            int var11;
            for (var11 = 0; var11 < 64; ++var11) {
                Class20.anIntArray138[var11] = var11 * 262144;
            }

            for (var11 = 0; var11 < 64; ++var11) {
                Class20.anIntArray138[var11 + 64] = var11 * 1024 + 16711680;
            }

            for (var11 = 0; var11 < 64; ++var11) {
                Class20.anIntArray138[var11 + 128] = var11 * 4 + 16776960;
            }

            for (var11 = 0; var11 < 64; ++var11) {
                Class20.anIntArray138[var11 + 192] = 16777215;
            }

            Class18.anIntArray133 = new int[256];

            for (var11 = 0; var11 < 64; ++var11) {
                Class18.anIntArray133[var11] = var11 * 1024;
            }

            for (var11 = 0; var11 < 64; ++var11) {
                Class18.anIntArray133[var11 + 64] = var11 * 4 + '\uff00';
            }

            for (var11 = 0; var11 < 64; ++var11) {
                Class18.anIntArray133[var11 + 128] = var11 * 262144 + '\uffff';
            }

            for (var11 = 0; var11 < 64; ++var11) {
                Class18.anIntArray133[var11 + 192] = 16777215;
            }

            ClanMate.anIntArray240 = new int[256];

            for (var11 = 0; var11 < 64; ++var11) {
                ClanMate.anIntArray240[var11] = var11 * 4;
            }

            for (var11 = 0; var11 < 64; ++var11) {
                ClanMate.anIntArray240[var11 + 64] = var11 * 262144 + 255;
            }

            for (var11 = 0; var11 < 64; ++var11) {
                ClanMate.anIntArray240[var11 + 128] = var11 * 1024 + 16711935;
            }

            for (var11 = 0; var11 < 64; ++var11) {
                ClanMate.anIntArray240[var11 + 192] = 16777215;
            }

            Class173.anIntArray2135 = new int[256];
            Class53.anIntArray411 = new int['耀'];
            RuneScript.anIntArray666 = new int['耀'];
            Entity.method659(null);
            AxisAlignedBoundingBox.anIntArray669 = new int['耀'];
            Class117.anIntArray1344 = new int['耀'];
            if (var2) {
                Login.username = Loader.DEFAULT_USERNAME;
                Login.password = Loader.DEFAULT_PASSWORD;
            }

            World.anInt392 = 0;
            Node_Sub7.aString405 = "";
            Login.aBoolean703 = true;
            Login.aBoolean694 = false;
            if (!Client.preferences.loginScreenAudioDisabled) {
                CacheReferenceTable var15 = Class100.midi;
                var6 = var15.method1084("scape main");
                var7 = var15.method1104(var6, "");
                Class133.anInt1725 = 1;
                Class133.aReferenceTable1727 = var15;
                Class133.anInt1728 = var6;
                Class5.anInt38 = var7;
                Class141.anInt1784 = 255;
                Class46.aBoolean371 = false;
                CollisionMap.anInt1323 = 2;
            } else {
                Class133.anInt1725 = 1;
                Class133.aReferenceTable1727 = null;
                Class133.anInt1728 = -1;
                Class5.anInt38 = -1;
                Class141.anInt1784 = 0;
                Class46.aBoolean371 = false;
                CollisionMap.anInt1323 = 2;
            }

            Class123.method814(false);
            Login.aBoolean706 = true;
            Login.anInt702 = (AxisAlignedBoundingBox.appletWidth - 765) / 2;
            Login.anInt710 = Login.anInt702 + 202;
            Class3.aSprite17.method1242(Login.anInt702, 0);
            Login.aSprite697.method1242(Login.anInt702 + 382, 0);
            Login.aCompressedImage_695.method1155(Login.anInt702 + 382 - Login.aCompressedImage_695.anInt206 / 2, 18);
        }
    }

    public long method600() {
        return this.aLong996;
    }

    public void method599(byte[] var1) throws IOException {
        this.method602(var1, 0, var1.length);
    }

    public void method602(byte[] var1, int var2, int var3) throws IOException {
        try {
            if (var2 + var3 > var1.length) {
                throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
            }

            if (this.aLong1003 != -1L && this.aLong1001 >= this.aLong1003 && (long) var3 + this.aLong1001 <= (long) this.anInt1002 + this.aLong1003) {
                System.arraycopy(this.aByteArray1000, (int) (this.aLong1001 - this.aLong1003), var1, var2, var3);
                this.aLong1001 += (long) var3;
                return;
            }

            long var4 = this.aLong1001;
            int var7 = var3;
            int var8;
            if (this.aLong1001 >= this.aLong998 && this.aLong1001 < this.aLong998 + (long) this.anInt997) {
                var8 = (int) ((long) this.anInt997 - (this.aLong1001 - this.aLong998));
                if (var8 > var3) {
                    var8 = var3;
                }

                System.arraycopy(this.aByteArray1004, (int) (this.aLong1001 - this.aLong998), var1, var2, var8);
                this.aLong1001 += (long) var8;
                var2 += var8;
                var3 -= var8;
            }

            if (var3 > this.aByteArray1004.length) {
                this.aClass82_995.method474(this.aLong1001);

                for (this.aLong1005 = this.aLong1001; var3 > 0; var3 -= var8) {
                    var8 = this.aClass82_995.method477(var1, var2, var3);
                    if (var8 == -1) {
                        break;
                    }

                    this.aLong1005 += (long) var8;
                    this.aLong1001 += (long) var8;
                    var2 += var8;
                }
            } else if (var3 > 0) {
                this.method603();
                var8 = var3;
                if (var3 > this.anInt997) {
                    var8 = this.anInt997;
                }

                System.arraycopy(this.aByteArray1004, 0, var1, var2, var8);
                var2 += var8;
                var3 -= var8;
                this.aLong1001 += (long) var8;
            }

            if (-1L != this.aLong1003) {
                if (this.aLong1003 > this.aLong1001 && var3 > 0) {
                    var8 = (int) (this.aLong1003 - this.aLong1001) + var2;
                    if (var8 > var3 + var2) {
                        var8 = var3 + var2;
                    }

                    while (var2 < var8) {
                        var1[var2++] = 0;
                        --var3;
                        ++this.aLong1001;
                    }
                }

                long var9 = -1L;
                long var11 = -1L;
                if (this.aLong1003 >= var4 && this.aLong1003 < (long) var7 + var4) {
                    var9 = this.aLong1003;
                } else if (var4 >= this.aLong1003 && var4 < this.aLong1003 + (long) this.anInt1002) {
                    var9 = var4;
                }

                if ((long) this.anInt1002 + this.aLong1003 > var4 && this.aLong1003 + (long) this.anInt1002 <= var4 + (long) var7) {
                    var11 = this.aLong1003 + (long) this.anInt1002;
                } else if (var4 + (long) var7 > this.aLong1003 && (long) var7 + var4 <= (long) this.anInt1002 + this.aLong1003) {
                    var11 = (long) var7 + var4;
                }

                if (var9 > -1L && var11 > var9) {
                    int var13 = (int) (var11 - var9);
                    System.arraycopy(this.aByteArray1000, (int) (var9 - this.aLong1003), var1, (int) (var9 - var4) + var2, var13);
                    if (var11 > this.aLong1001) {
                        var3 = (int) ((long) var3 - (var11 - this.aLong1001));
                        this.aLong1001 = var11;
                    }
                }
            }
        } catch (IOException var15) {
            this.aLong1005 = -1L;
            throw var15;
        }

        if (var3 > 0) {
            throw new EOFException();
        }
    }

    void method603() throws IOException {
        this.anInt997 = 0;
        if (this.aLong1005 != this.aLong1001) {
            this.aClass82_995.method474(this.aLong1001);
            this.aLong1005 = this.aLong1001;
        }

        int var1;
        for (this.aLong998 = this.aLong1001; this.anInt997 < this.aByteArray1004.length; this.anInt997 += var1) {
            var1 = this.aClass82_995.method477(this.aByteArray1004, this.anInt997, this.aByteArray1004.length - this.anInt997);
            if (var1 == -1) {
                break;
            }

            this.aLong1005 += (long) var1;
        }

    }

    public void method604(byte[] var1, int var2, int var3) throws IOException {
        try {
            if (this.aLong1001 + (long) var3 > this.aLong996) {
                this.aLong996 = this.aLong1001 + (long) var3;
            }

            if (this.aLong1003 != -1L && (this.aLong1001 < this.aLong1003 || this.aLong1001 > (long) this.anInt1002 + this.aLong1003)) {
                this.method598();
            }

            if (this.aLong1003 != -1L && (long) var3 + this.aLong1001 > (long) this.aByteArray1000.length + this.aLong1003) {
                int var4 = (int) ((long) this.aByteArray1000.length - (this.aLong1001 - this.aLong1003));
                System.arraycopy(var1, var2, this.aByteArray1000, (int) (this.aLong1001 - this.aLong1003), var4);
                this.aLong1001 += (long) var4;
                var2 += var4;
                var3 -= var4;
                this.anInt1002 = this.aByteArray1000.length;
                this.method598();
            }

            if (var3 <= this.aByteArray1000.length) {
                if (var3 > 0) {
                    if (-1L == this.aLong1003) {
                        this.aLong1003 = this.aLong1001;
                    }

                    System.arraycopy(var1, var2, this.aByteArray1000, (int) (this.aLong1001 - this.aLong1003), var3);
                    this.aLong1001 += (long) var3;
                    if (this.aLong1001 - this.aLong1003 > (long) this.anInt1002) {
                        this.anInt1002 = (int) (this.aLong1001 - this.aLong1003);
                    }

                }
            } else {
                if (this.aLong1001 != this.aLong1005) {
                    this.aClass82_995.method474(this.aLong1001);
                    this.aLong1005 = this.aLong1001;
                }

                this.aClass82_995.method478(var1, var2, var3);
                this.aLong1005 += (long) var3;
                if (this.aLong1005 > this.aLong999) {
                    this.aLong999 = this.aLong1005;
                }

                long var5 = -1L;
                long var7 = -1L;
                if (this.aLong1001 >= this.aLong998 && this.aLong1001 < (long) this.anInt997 + this.aLong998) {
                    var5 = this.aLong1001;
                } else if (this.aLong998 >= this.aLong1001 && this.aLong998 < this.aLong1001 + (long) var3) {
                    var5 = this.aLong998;
                }

                if (this.aLong1001 + (long) var3 > this.aLong998 && (long) var3 + this.aLong1001 <= (long) this.anInt997 + this.aLong998) {
                    var7 = (long) var3 + this.aLong1001;
                } else if (this.aLong998 + (long) this.anInt997 > this.aLong1001 && this.aLong998 + (long) this.anInt997 <= this.aLong1001 + (long) var3) {
                    var7 = (long) this.anInt997 + this.aLong998;
                }

                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(var1, (int) ((long) var2 + var5 - this.aLong1001), this.aByteArray1004, (int) (var5 - this.aLong998), var9);
                }

                this.aLong1001 += (long) var3;
            }
        } catch (IOException var11) {
            this.aLong1005 = -1L;
            throw var11;
        }
    }

    void method598() throws IOException {
        if (this.aLong1003 != -1L) {
            if (this.aLong1005 != this.aLong1003) {
                this.aClass82_995.method474(this.aLong1003);
                this.aLong1005 = this.aLong1003;
            }

            this.aClass82_995.method478(this.aByteArray1000, 0, this.anInt1002);
            this.aLong1005 += 1293758729L * (long) (this.anInt1002 * -1212830407);
            if (this.aLong1005 > this.aLong999) {
                this.aLong999 = this.aLong1005;
            }

            long var1 = -1L;
            long var3 = -1L;
            if (this.aLong1003 >= this.aLong998 && this.aLong1003 < this.aLong998 + (long) this.anInt997) {
                var1 = this.aLong1003;
            } else if (this.aLong998 >= this.aLong1003 && this.aLong998 < (long) this.anInt1002 + this.aLong1003) {
                var1 = this.aLong998;
            }

            if ((long) this.anInt1002 + this.aLong1003 > this.aLong998 && (long) this.anInt1002 + this.aLong1003 <= (long) this.anInt997 + this.aLong998) {
                var3 = (long) this.anInt1002 + this.aLong1003;
            } else if (this.aLong998 + (long) this.anInt997 > this.aLong1003 && this.aLong998 + (long) this.anInt997 <= (long) this.anInt1002 + this.aLong1003) {
                var3 = (long) this.anInt997 + this.aLong998;
            }

            if (var1 > -1L && var3 > var1) {
                int var5 = (int) (var3 - var1);
                System.arraycopy(this.aByteArray1000, (int) (var1 - this.aLong1003), this.aByteArray1004, (int) (var1 - this.aLong998), var5);
            }

            this.aLong1003 = -1L;
            this.anInt1002 = 0;
        }

    }

    public void method597() throws IOException {
        this.method598();
        this.aClass82_995.method476();
    }

    public void method605(long var1) throws IOException {
        if (var1 < 0L) {
            throw new IOException("");
        }
        this.aLong1001 = var1;
    }
}
