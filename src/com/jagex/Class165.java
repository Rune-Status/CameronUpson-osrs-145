package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class165 implements Runnable {
    public static NodeDeque<CacheFile> aNodeDeque2006 = new NodeDeque<>();
    public static NodeDeque<CacheFile> aNodeDeque2003 = new NodeDeque<>();
    static Object anObject2005 = new Object();
    static int anInt2004 = 0;

    static int method1049(long var0, String var2) {
        Random var3 = new Random();
        Buffer var4 = new Buffer(128);
        Buffer var5 = new Buffer(128);
        int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int) (var0 >> 32), (int) var0};
        var4.method451(10);

        int var7;
        for (var7 = 0; var7 < 4; ++var7) {
            var4.method869(var3.nextInt());
        }

        var4.method869(var6[0]);
        var4.method869(var6[1]);
        var4.method861(var0);
        var4.method861(0L);

        for (var7 = 0; var7 < 4; ++var7) {
            var4.method869(var3.nextInt());
        }

        var4.method830(Class61.aBigInteger633, Class61.aBigInteger634);
        var5.method451(10);

        for (var7 = 0; var7 < 3; ++var7) {
            var5.method869(var3.nextInt());
        }

        var5.method861(var3.nextLong());
        var5.method872(var3.nextLong());
        Class177.method1189(var5);
        var5.method861(var3.nextLong());
        var5.method830(Class61.aBigInteger633, Class61.aBigInteger634);
        var7 = Class27.method179(var2);
        if (var7 % 8 != 0) {
            var7 += 8 - var7 % 8;
        }

        Buffer var8 = new Buffer(var7);
        var8.method865(var2);
        var8.caret = var7;
        var8.method815(var6);
        Buffer var9 = new Buffer(var5.caret + var4.caret + 5 + var8.caret);
        var9.method451(2);
        var9.method451(var4.caret);
        var9.method860(var4.payload, 0, var4.caret);
        var9.method451(var5.caret);
        var9.method860(var5.payload, 0, var5.caret);
        var9.method755(var8.caret);
        var9.method860(var8.payload, 0, var8.caret);
        String var10 = Class164.method1043(var9.payload);

        try {
            URL var11 = new URL(Class113_Sub1.method286("services", false) + "m=accountappeal/login.ws");
            URLConnection var12 = var11.openConnection();
            var12.setDoInput(true);
            var12.setDoOutput(true);
            var12.setConnectTimeout(5000);
            OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
            var13.write("data2=" + Class30.method203(var10) + "&dest=" + Class30.method203("passwordchoice.ws"));
            var13.flush();
            InputStream var14 = var12.getInputStream();
            var9 = new Buffer(new byte[1000]);

            do {
                int var15 = var14.read(var9.payload, var9.caret, 1000 - var9.caret);
                if (var15 == -1) {
                    var13.close();
                    var14.close();
                    String var16 = new String(var9.payload);
                    if (var16.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var16.startsWith("WRONG")) {
                        return 7;
                    } else if (var16.startsWith("RELOAD")) {
                        return 3;
                    } else if (var16.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var9.method838(var6);

                        while (var9.caret > 0 && var9.payload[var9.caret - 1] == 0) {
                            --var9.caret;
                        }

                        var16 = new String(var9.payload, 0, var9.caret);
                        if (Class173.method1185(var16)) {
                            Class54.method348(var16, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }

                var9.caret += var15;
            } while (var9.caret < 1000);

            return 5;
        } catch (Throwable var17) {
            var17.printStackTrace();
            return 5;
        }
    }

    public void run() {
        try {
            while (true) {
                NodeDeque var1 = aNodeDeque2003;
                CacheFile var2;
                synchronized (aNodeDeque2003) {
                    var2 = aNodeDeque2003.method995();
                }

                Object var14;
                if (var2 != null) {
                    if (var2.anInt204 == 0) {
                        var2.index.method804((int) var2.key, var2.buffer, var2.buffer.length);
                        var1 = aNodeDeque2003;
                        synchronized (aNodeDeque2003) {
                            var2.unlink();
                        }
                    } else if (var2.anInt204 == 1) {
                        var2.buffer = var2.index.method801((int) var2.key);
                        var1 = aNodeDeque2003;
                        synchronized (aNodeDeque2003) {
                            aNodeDeque2006.method997(var2);
                        }
                    }

                    var14 = anObject2005;
                    synchronized (anObject2005) {
                        if (anInt2004 <= 1) {
                            anInt2004 = 0;
                            anObject2005.notifyAll();
                            return;
                        }

                        anInt2004 = 600;
                    }
                } else {
                    Class127.method875(100L);
                    var14 = anObject2005;
                    synchronized (anObject2005) {
                        if (anInt2004 <= 1) {
                            anInt2004 = 0;
                            anObject2005.notifyAll();
                            return;
                        }

                        --anInt2004;
                    }
                }
            }
        } catch (Exception var13) {
            Client.method332(null, var13);
        }
    }
}
