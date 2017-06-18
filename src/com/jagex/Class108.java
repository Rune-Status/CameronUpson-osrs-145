package com.jagex;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.URL;

public class Class108 implements Runnable {
    public static String aString1292;
    public static String aString1298;
    static CompressedImage aCompressedImage_1296;
    static int anInt1299;
    Class103 aClass103_1293 = null;
    Thread aThread1295;
    Class103 aClass103_1294 = null;
    boolean aBoolean1297 = false;

    public Class108() {
        aString1292 = "Unknown";
        aString1298 = "1.6";

        try {
            aString1292 = System.getProperty("java.vendor");
            aString1298 = System.getProperty("java.version");
        } catch (Exception var2) {
        }

        this.aBoolean1297 = false;
        this.aThread1295 = new Thread(this);
        this.aThread1295.setPriority(10);
        this.aThread1295.setDaemon(true);
        this.aThread1295.start();
    }

    public static Sprite method751(ReferenceTable var0, String var1, String var2) {
        int var3 = var0.method1084(var1);
        int var4 = var0.method1104(var3, var2);
        return Class176.method1188(var0, var3, var4);
    }

    static boolean method748(CharSequence var0, int var1, boolean var2) {
        if (var1 >= 2 && var1 <= 36) {
            boolean var3 = false;
            boolean var4 = false;
            int var5 = 0;
            int var6 = var0.length();

            for (int var7 = 0; var7 < var6; ++var7) {
                char var8 = var0.charAt(var7);
                if (var7 == 0) {
                    if (var8 == '-') {
                        var3 = true;
                        continue;
                    }

                    if (var8 == '+') {
                        continue;
                    }
                }

                int var10;
                if (var8 >= '0' && var8 <= '9') {
                    var10 = var8 - 48;
                } else if (var8 >= 'A' && var8 <= 'Z') {
                    var10 = var8 - 55;
                } else {
                    if (var8 < 'a' || var8 > 'z') {
                        return false;
                    }

                    var10 = var8 - 87;
                }

                if (var10 >= var1) {
                    return false;
                }

                if (var3) {
                    var10 = -var10;
                }

                int var9 = var10 + var5 * var1;
                if (var5 != var9 / var1) {
                    return false;
                }

                var5 = var9;
                var4 = true;
            }

            return var4;
        }
        throw new IllegalArgumentException("");
    }

    public final Class103 method747(Runnable var1, int var2) {
        return this.method753(2, var2, 0, var1);
    }

    public final void method746() {
        synchronized (this) {
            this.aBoolean1297 = true;
            this.notifyAll();
        }

        try {
            this.aThread1295.join();
        } catch (InterruptedException var3) {
        }

    }

    public final Class103 method752(URL var1) {
        return this.method753(4, 0, 0, var1);
    }

    final Class103 method753(int var1, int var2, int var3, Object var4) {
        Class103 var5 = new Class103();
        var5.anInt1164 = var1;
        var5.anInt1165 = var2;
        var5.anObject1163 = var4;
        synchronized (this) {
            if (this.aClass103_1293 != null) {
                this.aClass103_1293.aClass103_1160 = var5;
                this.aClass103_1293 = var5;
            } else {
                this.aClass103_1293 = this.aClass103_1294 = var5;
            }

            this.notify();
            return var5;
        }
    }

    public final Class103 method750(int var1) {
        return this.method753(3, var1, 0, null);
    }

    public final void run() {
        while (true) {
            Class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.aBoolean1297) {
                        return;
                    }

                    if (this.aClass103_1294 != null) {
                        var2 = this.aClass103_1294;
                        this.aClass103_1294 = this.aClass103_1294.aClass103_1160;
                        if (this.aClass103_1294 == null) {
                            this.aClass103_1293 = null;
                        }
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
            }

            try {
                int var3 = var2.anInt1164;
                if (var3 == 1) {
                    var2.anObject1161 = new java.net.Socket(InetAddress.getByName((String) var2.anObject1163), var2.anInt1165);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.anObject1163);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.anInt1165);
                    var2.anObject1161 = var4;
                } else if (var3 == 4) {
                    var2.anObject1161 = new DataInputStream(((URL) var2.anObject1163).openStream());
                } else if (var3 == 3) {
                    String var10 = (var2.anInt1165 >> 24 & 255) + "." + (var2.anInt1165 >> 16 & 255) + "." + (var2.anInt1165 >> 8 & 255) + "." + (var2.anInt1165 & 255);
                    var2.anObject1161 = InetAddress.getByName(var10).getHostName();
                }

                var2.anInt1162 = 1;
            } catch (ThreadDeath var6) {
                throw var6;
            } catch (Throwable var7) {
                var2.anInt1162 = 2;
            }
        }
    }

    public final Class103 method749(String var1, int var2) {
        return this.method753(1, var2, 0, var1);
    }
}
