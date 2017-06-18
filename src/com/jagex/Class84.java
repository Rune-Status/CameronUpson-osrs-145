package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ScheduledExecutorService;

public class Class84 {
    public static int anInt870;
    static ScheduledExecutorService aScheduledExecutorService860;
    static int anInt857;
    static Class79 aClass79_855;
    static int anInt861;
    protected int[] anIntArray853;
    long aLong872 = 0L;
    int anInt854 = 0;
    int anInt869 = 32;
    long aLong867 = Class124.method873();
    int anInt863;
    int anInt866;
    int anInt865;
    long aLong859 = 0L;
    int anInt856 = 0;
    int anInt871 = 0;
    Node_Sub10[] aNode_Sub10Array852 = new Node_Sub10[8];
    Node_Sub10[] aNode_Sub10Array864 = new Node_Sub10[8];
    boolean aBoolean868 = true;
    Node_Sub10 aNode_Sub10_858;
    int anInt862 = 0;

    static void method486(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int[] var7 = SceneGraph.method697(var0, var1, var2);
        int[] var8 = SceneGraph.method697(var3, var4, var5);
        Node_Sub21_Sub26.method1226(var7[0], var7[1], var8[0], var8[1], var6);
    }

    public static String method484(CharSequence var0, Class188 var1) {
        if (var0 == null) {
            return null;
        }
        int var2 = 0;

        int var3;
        char var4;
        boolean var5;
        for (var3 = var0.length(); var2 < var3; ++var2) {
            var4 = var0.charAt(var2);
            var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }
        }

        while (var3 > var2) {
            var4 = var0.charAt(var3 - 1);
            var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }

            --var3;
        }

        int var15 = var3 - var2;
        if (var15 >= 1 && var15 <= ObjectDefinition.method1075(var1)) {
            StringBuilder var6 = new StringBuilder(var15);

            for (int var7 = var2; var7 < var3; ++var7) {
                char var8 = var0.charAt(var7);
                boolean var9;
                if (Character.isISOControl(var8)) {
                    var9 = false;
                } else {
                    boolean var10 = var8 >= '0' && var8 <= '9' || var8 >= 'A' && var8 <= 'Z' || var8 >= 'a' && var8 <= 'z';
                    if (var10) {
                        var9 = true;
                    } else {
                        char[] var11 = Class179.aCharArray2144;
                        int var12 = 0;

                        label123:
                        while (true) {
                            char var13;
                            if (var12 >= var11.length) {
                                var11 = Class179.aCharArray2143;

                                for (var12 = 0; var12 < var11.length; ++var12) {
                                    var13 = var11[var12];
                                    if (var13 == var8) {
                                        var9 = true;
                                        break label123;
                                    }
                                }

                                var9 = false;
                                break;
                            }

                            var13 = var11[var12];
                            if (var8 == var13) {
                                var9 = true;
                                break;
                            }

                            ++var12;
                        }
                    }
                }

                if (var9) {
                    char var16;
                    switch (var8) {
                        case ' ':
                        case '-':
                        case '_':
                        case ' ':
                            var16 = '_';
                            break;
                        case '#':
                        case '[':
                        case ']':
                            var16 = var8;
                            break;
                        case 'À':
                        case 'Á':
                        case 'Â':
                        case 'Ã':
                        case 'Ä':
                        case 'à':
                        case 'á':
                        case 'â':
                        case 'ã':
                        case 'ä':
                            var16 = 'a';
                            break;
                        case 'Ç':
                        case 'ç':
                            var16 = 'c';
                            break;
                        case 'È':
                        case 'É':
                        case 'Ê':
                        case 'Ë':
                        case 'è':
                        case 'é':
                        case 'ê':
                        case 'ë':
                            var16 = 'e';
                            break;
                        case 'Í':
                        case 'Î':
                        case 'Ï':
                        case 'í':
                        case 'î':
                        case 'ï':
                            var16 = 'i';
                            break;
                        case 'Ñ':
                        case 'ñ':
                            var16 = 'n';
                            break;
                        case 'Ò':
                        case 'Ó':
                        case 'Ô':
                        case 'Õ':
                        case 'Ö':
                        case 'ò':
                        case 'ó':
                        case 'ô':
                        case 'õ':
                        case 'ö':
                            var16 = 'o';
                            break;
                        case 'Ù':
                        case 'Ú':
                        case 'Û':
                        case 'Ü':
                        case 'ù':
                        case 'ú':
                        case 'û':
                        case 'ü':
                            var16 = 'u';
                            break;
                        case 'ß':
                            var16 = 'b';
                            break;
                        case 'ÿ':
                        case 'Ÿ':
                            var16 = 'y';
                            break;
                        default:
                            var16 = Character.toLowerCase(var8);
                    }

                    if (var16 != 0) {
                        var6.append(var16);
                    }
                }
            }

            if (var6.length() == 0) {
                return null;
            }
            return var6.toString();
        }
        return null;
    }

    static long method485() {
        try {
            URL var0 = new URL(Class113_Sub1.method286("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            Buffer var4 = new Buffer(new byte[1000]);

            do {
                int var5 = var3.read(var4.payload, var4.caret, 1000 - var4.caret);
                if (var5 == -1) {
                    var4.caret = 0;
                    return var4.method837();
                }

                var4.caret += var5;
            } while (var4.caret < 1000);

            return 0L;
        } catch (Exception var8) {
            return 0L;
        }
    }

    static void method487(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7;
        if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            Class26.aByteArrayArrayArray189[var1][var2][var3] = 0;

            while (true) {
                var7 = var0.readUnsignedByte();
                if (var7 == 0) {
                    if (var1 == 0) {
                        Class26.anIntArrayArrayArray191[0][var2][var3] = -Class53.method339(var2 + 932731 + var4, var3 + 556238 + var5) * 8;
                    } else {
                        Class26.anIntArrayArrayArray191[var1][var2][var3] = Class26.anIntArrayArrayArray191[var1 - 1][var2][var3] - 240;
                    }
                    break;
                }

                if (var7 == 1) {
                    int var8 = var0.readUnsignedByte();
                    if (var8 == 1) {
                        var8 = 0;
                    }

                    if (var1 == 0) {
                        Class26.anIntArrayArrayArray191[0][var2][var3] = -var8 * 8;
                    } else {
                        Class26.anIntArrayArrayArray191[var1][var2][var3] = Class26.anIntArrayArrayArray191[var1 - 1][var2][var3] - var8 * 8;
                    }
                    break;
                }

                if (var7 <= 49) {
                    Class26.aByteArrayArrayArray195[var1][var2][var3] = var0.method870();
                    Class57.aByteArrayArrayArray433[var1][var2][var3] = (byte) ((var7 - 2) / 4);
                    Class183.aByteArrayArrayArray2159[var1][var2][var3] = (byte) (var7 - 2 + var6 & 3);
                } else if (var7 <= 81) {
                    Class26.aByteArrayArrayArray189[var1][var2][var3] = (byte) (var7 - 49);
                } else {
                    Class26.aByteArrayArrayArray193[var1][var2][var3] = (byte) (var7 - 81);
                }
            }
        } else {
            while (true) {
                var7 = var0.readUnsignedByte();
                if (var7 == 0) {
                    break;
                }

                if (var7 == 1) {
                    var0.readUnsignedByte();
                    break;
                }

                if (var7 <= 49) {
                    var0.readUnsignedByte();
                }
            }
        }

    }

    public final synchronized void method491() {
        if (this.anIntArray853 != null) {
            long var1 = Class124.method873();

            try {
                if (0L != this.aLong859) {
                    if (var1 < this.aLong859) {
                        return;
                    }

                    this.method282(this.anInt863);
                    this.aLong859 = 0L;
                    this.aBoolean868 = true;
                }

                int var3 = this.method279();
                if (this.anInt854 - var3 > this.anInt856) {
                    this.anInt856 = this.anInt854 - var3;
                }

                int var4 = this.anInt866 + this.anInt865;
                if (var4 + 256 > 16384) {
                    var4 = 16128;
                }

                if (var4 + 256 > this.anInt863) {
                    this.anInt863 += 1024;
                    if (this.anInt863 > 16384) {
                        this.anInt863 = 16384;
                    }

                    this.method280();
                    this.method282(this.anInt863);
                    var3 = 0;
                    this.aBoolean868 = true;
                    if (var4 + 256 > this.anInt863) {
                        var4 = this.anInt863 - 256;
                        this.anInt865 = var4 - this.anInt866;
                    }
                }

                while (var3 < var4) {
                    this.method481(this.anIntArray853, 256);
                    this.method278();
                    var3 += 256;
                }

                if (var1 > this.aLong872) {
                    if (!this.aBoolean868) {
                        if (this.anInt856 == 0 && this.anInt871 == 0) {
                            this.method280();
                            this.aLong859 = var1 + 2000L;
                            return;
                        }

                        this.anInt865 = Math.min(this.anInt871, this.anInt856);
                        this.anInt871 = this.anInt856;
                    } else {
                        this.aBoolean868 = false;
                    }

                    this.anInt856 = 0;
                    this.aLong872 = var1 + 2000L;
                }

                this.anInt854 = var3;
            } catch (Exception var7) {
                this.method280();
                this.aLong859 = var1 + 2000L;
            }

            try {
                if (var1 > this.aLong867 + 500000L) {
                    var1 = this.aLong867;
                }

                while (var1 > this.aLong867 + 5000L) {
                    this.method482(256);
                    this.aLong867 += (long) (256000 / anInt870);
                }
            } catch (Exception var6) {
                this.aLong867 = var1;
            }

        }
    }

    public final void method488() {
        this.aBoolean868 = true;
    }

    final void method482(int var1) {
        this.anInt862 -= var1;
        if (this.anInt862 < 0) {
            this.anInt862 = 0;
        }

        if (this.aNode_Sub10_858 != null) {
            this.aNode_Sub10_858.method428(var1);
        }

    }

    final void method481(int[] var1, int var2) {
        int var3 = var2;
        if (Class154.aBoolean1835) {
            var3 = var2 << 1;
        }

        Class144.method982(var1, 0, var3);
        this.anInt862 -= var2;
        if (this.aNode_Sub10_858 != null && this.anInt862 <= 0) {
            this.anInt862 += anInt870 >> 4;
            Class35.method262(this.aNode_Sub10_858);
            this.method483(this.aNode_Sub10_858, this.aNode_Sub10_858.method472());
            int var4 = 0;
            int var5 = 255;

            int var6;
            Node_Sub10 var12;
            label104:
            for (var6 = 7; var5 != 0; --var6) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }

                for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
                    if ((var9 & 1) != 0) {
                        var5 &= ~(1 << var7);
                        var12 = null;
                        Node_Sub10 var13 = this.aNode_Sub10Array864[var7];

                        label98:
                        while (true) {
                            while (true) {
                                if (var13 == null) {
                                    break label98;
                                }

                                Node_Sub11 var14 = var13.aNode_Sub11_843;
                                if (var14 != null && var14.anInt328 > var8) {
                                    var5 |= 1 << var7;
                                    var12 = var13;
                                    var13 = var13.aNode_Sub10_844;
                                } else {
                                    var13.aBoolean845 = true;
                                    int var15 = var13.method425();
                                    var4 += var15;
                                    if (var14 != null) {
                                        var14.anInt328 += var15;
                                    }

                                    if (var4 >= this.anInt869) {
                                        break label104;
                                    }

                                    Node_Sub10 var16 = var13.method434();
                                    if (var16 != null) {
                                        for (int var17 = var13.anInt222; var16 != null; var16 = var13.method426()) {
                                            this.method483(var16, var17 * var16.method472() >> 8);
                                        }
                                    }

                                    Node_Sub10 var18 = var13.aNode_Sub10_844;
                                    var13.aNode_Sub10_844 = null;
                                    if (var12 == null) {
                                        this.aNode_Sub10Array864[var7] = var18;
                                    } else {
                                        var12.aNode_Sub10_844 = var18;
                                    }

                                    if (var18 == null) {
                                        this.aNode_Sub10Array852[var7] = var12;
                                    }

                                    var13 = var18;
                                }
                            }
                        }
                    }

                    var7 += 4;
                    ++var8;
                }
            }

            for (var6 = 0; var6 < 8; ++var6) {
                Node_Sub10 var10 = this.aNode_Sub10Array864[var6];
                Node_Sub10[] var11 = this.aNode_Sub10Array864;
                this.aNode_Sub10Array852[var6] = null;

                for (var11[var6] = null; var10 != null; var10 = var12) {
                    var12 = var10.aNode_Sub10_844;
                    var10.aNode_Sub10_844 = null;
                }
            }
        }

        if (this.anInt862 < 0) {
            this.anInt862 = 0;
        }

        if (this.aNode_Sub10_858 != null) {
            this.aNode_Sub10_858.method429(var1, 0, var2);
        }

        this.aLong867 = Class124.method873();
    }

    protected void method277() throws Exception {
    }

    protected void method278() throws Exception {
    }

    protected void method280() {
    }

    protected void method281() throws Exception {
    }

    public final synchronized void method480(Node_Sub10 var1) {
        this.aNode_Sub10_858 = var1;
    }

    protected void method282(int var1) throws Exception {
    }

    final void method483(Node_Sub10 var1, int var2) {
        int var3 = var2 >> 5;
        Node_Sub10 var4 = this.aNode_Sub10Array852[var3];
        if (var4 == null) {
            this.aNode_Sub10Array864[var3] = var1;
        } else {
            var4.aNode_Sub10_844 = var1;
        }

        this.aNode_Sub10Array852[var3] = var1;
        var1.anInt222 = var2;
    }

    public final synchronized void method490() {
        if (aClass79_855 != null) {
            boolean var1 = true;

            for (int var2 = 0; var2 < 2; ++var2) {
                if (this == aClass79_855.aClass84Array842[var2]) {
                    aClass79_855.aClass84Array842[var2] = null;
                }

                if (aClass79_855.aClass84Array842[var2] != null) {
                    var1 = false;
                }
            }

            if (var1) {
                aScheduledExecutorService860.shutdownNow();
                aScheduledExecutorService860 = null;
                aClass79_855 = null;
            }
        }

        this.method280();
        this.anIntArray853 = null;
    }

    protected int method279() throws Exception {
        return this.anInt863;
    }

    public final synchronized void method489() {
        this.aBoolean868 = true;

        try {
            this.method281();
        } catch (Exception var2) {
            this.method280();
            this.aLong859 = Class124.method873() + 2000L;
        }

    }
}
