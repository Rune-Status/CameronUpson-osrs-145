package com.jagex;

import netscape.javascript.JSObject;

import java.applet.Applet;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public final class Class4 implements KeyListener, FocusListener {
    public static int[] anIntArray31 = new int[128];
    public static volatile int anInt24 = 0;
    public static Class4 aClass4_26 = new Class4();
    public static int anInt21 = 0;
    public static int anInt20 = 0;
    public static int[] anIntArray25 = new int[128];
    public static int anInt19 = 0;
    public static int anInt29 = 0;
    public static int anInt27 = 0;
    public static boolean[] aBooleanArray23 = new boolean[112];
    public static int anInt22 = 0;
    static char[] aCharArray28 = new char[128];
    static int[] anIntArray30 = new int[128];
    static int[] anIntArray18 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    static boolean method15(String var0, int var1, String var2) {
        if (var1 == 0) {
            try {
                if (!Class40.aString344.startsWith("win")) {
                    throw new Exception();
                }
                if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
                    throw new Exception();
                }
                String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                for (int var4 = 0; var4 < var0.length(); ++var4) {
                    if (var11.indexOf(var0.charAt(var4)) == -1) {
                        throw new Exception();
                    }
                }

                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                return true;
            } catch (Throwable var5) {
                return false;
            }
        }
        if (var1 == 1) {
            try {
                Object var10 = Class29.method189(Class40.anApplet343, var2, new Object[]{(new URL(Class40.anApplet343.getCodeBase(), var0)).toString()});
                return var10 != null;
            } catch (Throwable var6) {
                return false;
            }
        }
        if (var1 == 2) {
            try {
                Class40.anApplet343.getAppletContext().showDocument(new URL(Class40.anApplet343.getCodeBase(), var0), "_blank");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
        if (var1 == 3) {
            try {
                Applet var3 = Class40.anApplet343;
                JSObject.getWindow(var3).call("loggedout", (Object[]) null);
            } catch (Throwable var9) {
            }

            try {
                Class40.anApplet343.getAppletContext().showDocument(new URL(Class40.anApplet343.getCodeBase(), var0), "_top");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
        throw new IllegalArgumentException();
    }

    static void method16() {
        Class26.aByteArrayArrayArray193 = null;
        Class26.aByteArrayArrayArray195 = null;
        Class57.aByteArrayArrayArray433 = null;
        Class183.aByteArrayArrayArray2159 = null;
        Class26.anIntArrayArrayArray186 = null;
        Class179.aByteArrayArrayArray2145 = null;
        ItemTable.anIntArrayArray341 = null;
        InterfaceComponent.anIntArray1271 = null;
        Class26.anIntArray190 = null;
        Boundary.anIntArray1140 = null;
        Class10.anIntArray79 = null;
        InterfaceNode.anIntArray315 = null;
    }

    static void method14(PendingSpawn var0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (var0.type == 0) {
            var1 = Class60.aSceneGraph631.method671(var0.level, var0.sceneX, var0.sceneY);
        }

        if (var0.type == 1) {
            var1 = Class60.aSceneGraph631.method682(var0.level, var0.sceneX, var0.sceneY);
        }

        if (var0.type == 2) {
            var1 = Class60.aSceneGraph631.method677(var0.level, var0.sceneX, var0.sceneY);
        }

        if (var0.type == 3) {
            var1 = Class60.aSceneGraph631.method678(var0.level, var0.sceneX, var0.sceneY);
        }

        if (var1 != 0) {
            int var5 = Class60.aSceneGraph631.method668(var0.level, var0.sceneX, var0.sceneY, var1);
            var2 = var1 >> 14 & 32767;
            var3 = var5 & 31;
            var4 = var5 >> 6 & 3;
        }

        var0.anInt327 = var2;
        var0.anInt221 = var3;
        var0.anInt328 = var4;
    }

    public static int getVarpbitValue(int var0) {
        Varpbit var1 = (Varpbit) Varpbit.aReferenceCache2025.method973((long) var0);
        Varpbit var2;
        if (var1 != null) {
            var2 = var1;
        } else {
            byte[] var7 = Varpbit.aReferenceTable2012.method1085(14, var0);
            var1 = new Varpbit();
            if (var7 != null) {
                var1.method1052(new Buffer(var7));
            }

            Varpbit.aReferenceCache2025.method975(var1, (long) var0);
            var2 = var1;
        }

        int var3 = var2.varpIndex;
        int var4 = var2.lower;
        int var5 = var2.upper;
        int var6 = Varps.anIntArray1998[var5 - var4];
        return Varps.values[var3] >> var4 & var6;
    }

    public final synchronized void keyPressed(KeyEvent var1) {
        if (aClass4_26 != null) {
            int var2 = var1.getKeyCode();
            if (var2 >= 0 && var2 < anIntArray18.length) {
                var2 = anIntArray18[var2];
                if ((var2 & 128) != 0) {
                    var2 = -1;
                }
            } else {
                var2 = -1;
            }

            if (anInt20 >= 0 && var2 >= 0) {
                anIntArray31[anInt20] = var2;
                anInt20 = anInt20 + 1 & 127;
                if (anInt21 == anInt20) {
                    anInt20 = -1;
                }
            }

            int var3;
            if (var2 >= 0) {
                var3 = anInt27 + 1 & 127;
                if (anInt29 != var3) {
                    anIntArray30[anInt27] = var2;
                    aCharArray28[anInt27] = 0;
                    anInt27 = var3;
                }
            }

            var3 = var1.getModifiers();
            if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
                var1.consume();
            }
        }

    }

    public final void keyTyped(KeyEvent var1) {
        if (aClass4_26 != null) {
            char var2 = var1.getKeyChar();
            if (var2 != 0 && var2 != '\uffff') {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label58:
                    {
                        if (var2 != 0) {
                            char[] var5 = Class169.aCharArray2118;

                            for (int var6 = 0; var6 < var5.length; ++var6) {
                                char var7 = var5[var6];
                                if (var2 == var7) {
                                    var3 = true;
                                    break label58;
                                }
                            }
                        }

                        var3 = false;
                    }
                }

                if (var3) {
                    int var4 = anInt27 + 1 & 127;
                    if (anInt29 != var4) {
                        anIntArray30[anInt27] = -1;
                        aCharArray28[anInt27] = var2;
                        anInt27 = var4;
                    }
                }
            }
        }

        var1.consume();
    }

    public final synchronized void focusLost(FocusEvent var1) {
        if (aClass4_26 != null) {
            anInt20 = -1;
        }

    }

    public final synchronized void keyReleased(KeyEvent var1) {
        if (aClass4_26 != null) {
            int var2 = var1.getKeyCode();
            if (var2 >= 0 && var2 < anIntArray18.length) {
                var2 = anIntArray18[var2] & -129;
            } else {
                var2 = -1;
            }

            if (anInt20 >= 0 && var2 >= 0) {
                anIntArray31[anInt20] = ~var2;
                anInt20 = anInt20 + 1 & 127;
                if (anInt20 == anInt21) {
                    anInt20 = -1;
                }
            }
        }

        var1.consume();
    }

    public final void focusGained(FocusEvent var1) {
    }
}
