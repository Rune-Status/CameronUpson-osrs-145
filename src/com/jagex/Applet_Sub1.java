package com.jagex;

import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
    public static Class108 aClass108_301;
    protected static int anInt290;
    protected static long[] aLongArray282 = new long[32];
    protected static long[] aLongArray310 = new long[32];
    protected static Class122 aClass122_303;
    protected static int anInt300 = 0;
    static int anInt287 = 20;
    static int anInt285 = 0;
    static long aLong307 = 0L;
    static Applet_Sub1 anApplet_Sub1_297 = null;
    static volatile boolean aBoolean298 = true;
    static boolean aBoolean312 = false;
    static int anInt284 = 1;
    static Image anImage296;
    static int anInt304 = 500;
    static CacheReferenceTable aCacheReferenceTable681;
    final EventQueue anEventQueue306;
    protected int anInt293;
    protected int anInt305;
    int anInt289 = 0;
    volatile boolean aBoolean281 = true;
    Frame aFrame291;
    int anInt295 = 0;
    int anInt308;
    int anInt309;
    int anInt311;
    int anInt286;
    boolean aBoolean292 = false;
    boolean aBoolean299 = false;
    volatile boolean aBoolean283 = false;
    volatile long aLong280 = 0L;
    Class8 aClass8_288;
    Clipboard aClipboard302;
    java.awt.Canvas aCanvas294;

    protected Applet_Sub1() {
        EventQueue var1 = null;

        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }

        this.anEventQueue306 = var1;
        method356(new Class19());
    }

    static void method233() {
        for (InterfaceNode var0 = Client.interfaceNodes.first(); var0 != null; var0 = Client.interfaceNodes.next()) {
            int var1 = var0.id;
            if (Class33.method220(var1)) {
                boolean var2 = true;
                InterfaceComponent[] var3 = InterfaceComponent.interfaces[var1];

                int var4;
                for (var4 = 0; var4 < var3.length; ++var4) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].aBoolean1173;
                        break;
                    }
                }

                if (!var2) {
                    var4 = (int) var0.key;
                    InterfaceComponent var5 = InterfaceComponent.method1016(var4);
                    if (var5 != null) {
                        ItemTable.method284(var5);
                    }
                }
            }
        }

    }

    static void method254(int var0) {
        short var1 = 256;
        Login.anInt691 += var0 * 128;
        int var2;
        if (Login.anInt691 > Class53.anIntArray411.length) {
            Login.anInt691 -= Class53.anIntArray411.length;
            var2 = (int) (Math.random() * 12.0D);
            Entity.method659(Class17.aCompressedImageArray126[var2]);
        }

        var2 = 0;
        int var3 = var0 * 128;
        int var4 = (var1 - var0) * 128;

        int var5;
        int var6;
        for (var5 = 0; var5 < var4; ++var5) {
            var6 = AxisAlignedBoundingBox.anIntArray669[var2 + var3] - var0 * Class53.anIntArray411[Login.anInt691 + var2 & Class53.anIntArray411.length - 1] / 6;
            if (var6 < 0) {
                var6 = 0;
            }

            AxisAlignedBoundingBox.anIntArray669[var2++] = var6;
        }

        int var7;
        int var8;
        for (var5 = var1 - var0; var5 < var1; ++var5) {
            var6 = var5 * 128;

            for (var7 = 0; var7 < 128; ++var7) {
                var8 = (int) (Math.random() * 100.0D);
                if (var8 < 50 && var7 > 10 && var7 < 118) {
                    AxisAlignedBoundingBox.anIntArray669[var6 + var7] = 255;
                } else {
                    AxisAlignedBoundingBox.anIntArray669[var7 + var6] = 0;
                }
            }
        }

        if (Login.anInt712 > 0) {
            Login.anInt712 -= var0 * 4;
        }

        if (Login.anInt687 > 0) {
            Login.anInt687 -= var0 * 4;
        }

        if (Login.anInt712 == 0 && Login.anInt687 == 0) {
            var5 = (int) (Math.random() * (double) (2000 / var0));
            if (var5 == 0) {
                Login.anInt712 = 1024;
            }

            if (var5 == 1) {
                Login.anInt687 = 1024;
            }
        }

        for (var5 = 0; var5 < var1 - var0; ++var5) {
            Login.anIntArray700[var5] = Login.anIntArray700[var0 + var5];
        }

        for (var5 = var1 - var0; var5 < var1; ++var5) {
            Login.anIntArray700[var5] = (int) (Math.sin((double) Login.anInt698 / 14.0D) * 16.0D + Math.sin((double) Login.anInt698 / 15.0D) * 14.0D + Math.sin((double) Login.anInt698 / 16.0D) * 12.0D);
            ++Login.anInt698;
        }

        Login.anInt689 += var0;
        var5 = (var0 + (Client.engineCycle & 1)) / 2;
        if (var5 > 0) {
            for (var6 = 0; var6 < Login.anInt689 * 100; ++var6) {
                var7 = (int) (Math.random() * 124.0D) + 2;
                var8 = (int) (Math.random() * 128.0D) + 128;
                AxisAlignedBoundingBox.anIntArray669[(var8 << 7) + var7] = 192;
            }

            Login.anInt689 = 0;

            int var9;
            for (var6 = 0; var6 < var1; ++var6) {
                var7 = 0;
                var8 = var6 * 128;

                for (var9 = -var5; var9 < 128; ++var9) {
                    if (var9 + var5 < 128) {
                        var7 += AxisAlignedBoundingBox.anIntArray669[var5 + var9 + var8];
                    }

                    if (var9 - (var5 + 1) >= 0) {
                        var7 -= AxisAlignedBoundingBox.anIntArray669[var9 + var8 - (var5 + 1)];
                    }

                    if (var9 >= 0) {
                        Class117.anIntArray1344[var8 + var9] = var7 / (var5 * 2 + 1);
                    }
                }
            }

            for (var6 = 0; var6 < 128; ++var6) {
                var7 = 0;

                for (var8 = -var5; var8 < var1; ++var8) {
                    var9 = var8 * 128;
                    if (var8 + var5 < var1) {
                        var7 += Class117.anIntArray1344[var9 + var6 + var5 * 128];
                    }

                    if (var8 - (var5 + 1) >= 0) {
                        var7 -= Class117.anIntArray1344[var6 + var9 - (var5 + 1) * 128];
                    }

                    if (var8 >= 0) {
                        AxisAlignedBoundingBox.anIntArray669[var9 + var6] = var7 / (var5 * 2 + 1);
                    }
                }
            }
        }

    }

    static void method226(int var0, int var1) {
        if (Client.anInt1694 != 0 && var0 != -1) {
            Class43.method298(aCacheReferenceTable681, var0, 0, Client.anInt1694, false);
            Client.aBoolean1707 = true;
        }

    }

    static void method351(Applet_Sub1 var0) {
        if (Login.aBoolean694) {
            Canvas.method188(var0);
        } else {
            if ((Class33.anInt265 == 1 || !Class163.aBoolean1965 && Class33.anInt265 == 4) && Class33.anInt255 >= Login.anInt702 + 765 - 50 && Class33.anInt259 >= 453) {
                Client.preferences.loginScreenAudioDisabled = !Client.preferences.loginScreenAudioDisabled;
                Class78.method467();
                if (!Client.preferences.loginScreenAudioDisabled) {
                    Class120.method807(Class100.aCacheReferenceTable1119, "scape main", "", 255, false);
                } else {
                    Class133.aNode_Sub10_Sub3_1723.method916();
                    Class133.anInt1725 = 1;
                    Class133.aReferenceTable1727 = null;
                }
            }

            if (Client.connectionState != 5) {
                ++Login.anInt705;
                if (Client.connectionState == 10 || Client.connectionState == 11) {
                    int var1;
                    if (Client.anInt1463 == 0) {
                        if (Class33.anInt265 == 1 || !Class163.aBoolean1965 && Class33.anInt265 == 4) {
                            var1 = Login.anInt702 + 5;
                            short var2 = 463;
                            byte var3 = 100;
                            byte var4 = 35;
                            if (Class33.anInt255 >= var1 && Class33.anInt255 <= var3 + var1 && Class33.anInt259 >= var2 && Class33.anInt259 <= var4 + var2) {
                                PickableNode.method396();
                                return;
                            }
                        }

                        if (World.aClass25_384 != null) {
                            PickableNode.method396();
                        }
                    }

                    var1 = Class33.anInt265;
                    int var9 = Class33.anInt255;
                    int var10 = Class33.anInt259;
                    if (!Class163.aBoolean1965 && var1 == 4) {
                        var1 = 1;
                    }

                    int var5;
                    short var6;
                    if (Login.anInt701 == 0) {
                        boolean var11 = false;

                        while (method353()) {
                            if (Class99.anInt1087 == 84) {
                                var11 = true;
                            }
                        }

                        var5 = Login.anInt710 + 180 - 80;
                        var6 = 291;
                        if (var1 == 1 && var9 >= var5 - 75 && var9 <= var5 + 75 && var10 >= var6 - 20 && var10 <= var6 + 20) {
                            Class54.method348(Class113_Sub1.method286("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }

                        var5 = Login.anInt710 + 180 + 80;
                        if (var1 == 1 && var9 >= var5 - 75 && var9 <= var5 + 75 && var10 >= var6 - 20 && var10 <= var6 + 20 || var11) {
                            if ((Client.currentWorldMask & 33554432) != 0) {
                                Login.aString707 = "";
                                Login.loginResponseLine1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                                Login.loginResponseLine2 = "Your normal account will not be affected.";
                                Login.loginResponseLine3 = "";
                                Login.anInt701 = 1;
                                Login.anInt713 = 0;
                            } else if ((Client.currentWorldMask & 4) != 0) {
                                if ((Client.currentWorldMask & 1024) != 0) {
                                    Login.loginResponseLine1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                                    Login.loginResponseLine2 = "Players can attack each other almost everywhere";
                                    Login.loginResponseLine3 = "and the Protect Item prayer won't work.";
                                } else {
                                    Login.loginResponseLine1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                                    Login.loginResponseLine2 = "Players can attack each other";
                                    Login.loginResponseLine3 = "almost everywhere.";
                                }

                                Login.aString707 = "Warning!";
                                Login.anInt701 = 1;
                                Login.anInt713 = 0;
                            } else if ((Client.currentWorldMask & 1024) != 0) {
                                Login.loginResponseLine1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                                Login.loginResponseLine2 = "The Protect Item prayer will";
                                Login.loginResponseLine3 = "not work on this world.";
                                Login.aString707 = "Warning!";
                                Login.anInt701 = 1;
                                Login.anInt713 = 0;
                            } else {
                                Login.loginResponseLine1 = "";
                                Login.loginResponseLine2 = "Enter your username/email & password.";
                                Login.loginResponseLine3 = "";
                                Login.anInt701 = 2;
                                Login.anInt713 = 0;
                            }
                        }
                    } else {
                        int var12;
                        short var14;
                        if (Login.anInt701 != 1) {
                            short var13;
                            if (Login.anInt701 == 2) {
                                var13 = 231;
                                var12 = var13 + 30;
                                if (var1 == 1 && var10 >= var12 - 15 && var10 < var12) {
                                    Login.anInt713 = 0;
                                }

                                var12 += 15;
                                if (var1 == 1 && var10 >= var12 - 15 && var10 < var12) {
                                    Login.anInt713 = 1;
                                }

                                var12 += 15;
                                var13 = 361;
                                if (var1 == 1 && var10 >= var13 - 15 && var10 < var13) {
                                    Class22.setLoginResponse("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    Login.anInt701 = 5;
                                    return;
                                }

                                var5 = Login.anInt710 + 180 - 80;
                                var6 = 321;
                                if (var1 == 1 && var9 >= var5 - 75 && var9 <= var5 + 75 && var10 >= var6 - 20 && var10 <= var6 + 20) {
                                    Login.username = Login.username.trim();
                                    if (Login.username.length() == 0) {
                                        Class22.setLoginResponse("", "Please enter your username/email address.", "");
                                        return;
                                    }

                                    if (Login.password.length() == 0) {
                                        Class22.setLoginResponse("", "Please enter your password.", "");
                                        return;
                                    }

                                    Class22.setLoginResponse("", "Connecting to server...", "");
                                    Login.aClass109_693 = Client.preferences.properties.containsKey(Class71.method418(Login.username)) ? Class109.aClass109_1300 : Class109.aClass109_1303;
                                    Class45.method304(20);
                                    return;
                                }

                                var5 = Login.anInt710 + 180 + 80;
                                if (var1 == 1 && var9 >= var5 - 75 && var9 <= var5 + 75 && var10 >= var6 - 20 && var10 <= var6 + 20) {
                                    Login.anInt701 = 0;
                                    Login.username = "";
                                    Login.password = "";
                                    World.anInt392 = 0;
                                    Node_Sub7.aString405 = "";
                                    Login.aBoolean703 = true;
                                }

                                while (true) {
                                    while (method353()) {
                                        boolean var7 = false;

                                        for (int var8 = 0; var8 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var8) {
                                            if (Class77.aChar836 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var8)) {
                                                var7 = true;
                                                break;
                                            }
                                        }

                                        if (Class99.anInt1087 == 13) {
                                            Login.anInt701 = 0;
                                            Login.username = "";
                                            Login.password = "";
                                            World.anInt392 = 0;
                                            Node_Sub7.aString405 = "";
                                            Login.aBoolean703 = true;
                                        } else if (Login.anInt713 == 0) {
                                            if (Class99.anInt1087 == 85 && Login.username.length() > 0) {
                                                Login.username = Login.username.substring(0, Login.username.length() - 1);
                                            }

                                            if (Class99.anInt1087 == 84 || Class99.anInt1087 == 80) {
                                                Login.anInt713 = 1;
                                            }

                                            if (var7 && Login.username.length() < 320) {
                                                Login.username = Login.username + Class77.aChar836;
                                            }
                                        } else if (Login.anInt713 == 1) {
                                            if (Class99.anInt1087 == 85 && Login.password.length() > 0) {
                                                Login.password = Login.password.substring(0, Login.password.length() - 1);
                                            }

                                            if (Class99.anInt1087 == 84 || Class99.anInt1087 == 80) {
                                                Login.anInt713 = 0;
                                            }

                                            if (Class99.anInt1087 == 84) {
                                                Login.username = Login.username.trim();
                                                if (Login.username.length() == 0) {
                                                    Class22.setLoginResponse("", "Please enter your username/email address.", "");
                                                    return;
                                                }

                                                if (Login.password.length() == 0) {
                                                    Class22.setLoginResponse("", "Please enter your password.", "");
                                                    return;
                                                }

                                                Class22.setLoginResponse("", "Connecting to server...", "");
                                                Login.aClass109_693 = Client.preferences.properties.containsKey(Class71.method418(Login.username)) ? Class109.aClass109_1300 : Class109.aClass109_1303;
                                                Class45.method304(20);
                                                return;
                                            }

                                            if (var7 && Login.password.length() < 20) {
                                                Login.password = Login.password + Class77.aChar836;
                                            }
                                        }
                                    }

                                    return;
                                }
                            }
                            if (Login.anInt701 == 3) {
                                var12 = Login.anInt710 + 180;
                                var14 = 276;
                                if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                    Login.loginResponseLine1 = "";
                                    Login.loginResponseLine2 = "Enter your username/email & password.";
                                    Login.loginResponseLine3 = "";
                                    Login.anInt701 = 2;
                                    Login.anInt713 = 0;
                                }

                                var12 = Login.anInt710 + 180;
                                var14 = 326;
                                if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                    Class22.setLoginResponse("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    Login.anInt701 = 5;
                                }
                            } else {
                                boolean var15;
                                int var16;
                                if (Login.anInt701 == 4) {
                                    var12 = Login.anInt710 + 180 - 80;
                                    var14 = 321;
                                    if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                        Node_Sub7.aString405.trim();
                                        if (Node_Sub7.aString405.length() != 6) {
                                            Class22.setLoginResponse("", "Please enter a 6-digit PIN.", "");
                                            return;
                                        }

                                        World.anInt392 = Integer.parseInt(Node_Sub7.aString405);
                                        Node_Sub7.aString405 = "";
                                        Login.aClass109_693 = Login.aBoolean703 ? Class109.aClass109_1306 : Class109.aClass109_1302;
                                        Class22.setLoginResponse("", "Connecting to server...", "");
                                        Class45.method304(20);
                                        return;
                                    }

                                    if (var1 == 1 && var9 >= Login.anInt710 + 180 - 9 && var9 <= Login.anInt710 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                                        Login.aBoolean703 = !Login.aBoolean703;
                                    }

                                    if (var1 == 1 && var9 >= Login.anInt710 + 180 - 34 && var9 <= Login.anInt710 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                                        Class54.method348(Class113_Sub1.method286("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                                    }

                                    var12 = Login.anInt710 + 180 + 80;
                                    if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                        Login.anInt701 = 0;
                                        Login.username = "";
                                        Login.password = "";
                                        World.anInt392 = 0;
                                        Node_Sub7.aString405 = "";
                                    }

                                    while (method353()) {
                                        var15 = false;

                                        for (var16 = 0; var16 < "1234567890".length(); ++var16) {
                                            if (Class77.aChar836 == "1234567890".charAt(var16)) {
                                                var15 = true;
                                                break;
                                            }
                                        }

                                        if (Class99.anInt1087 == 13) {
                                            Login.anInt701 = 0;
                                            Login.username = "";
                                            Login.password = "";
                                            World.anInt392 = 0;
                                            Node_Sub7.aString405 = "";
                                        } else {
                                            if (Class99.anInt1087 == 85 && Node_Sub7.aString405.length() > 0) {
                                                Node_Sub7.aString405 = Node_Sub7.aString405.substring(0, Node_Sub7.aString405.length() - 1);
                                            }

                                            if (Class99.anInt1087 == 84) {
                                                Node_Sub7.aString405.trim();
                                                if (Node_Sub7.aString405.length() != 6) {
                                                    Class22.setLoginResponse("", "Please enter a 6-digit PIN.", "");
                                                    return;
                                                }

                                                World.anInt392 = Integer.parseInt(Node_Sub7.aString405);
                                                Node_Sub7.aString405 = "";
                                                Login.aClass109_693 = Login.aBoolean703 ? Class109.aClass109_1306 : Class109.aClass109_1302;
                                                Class22.setLoginResponse("", "Connecting to server...", "");
                                                Class45.method304(20);
                                                return;
                                            }

                                            if (var15 && Node_Sub7.aString405.length() < 6) {
                                                Node_Sub7.aString405 = Node_Sub7.aString405 + Class77.aChar836;
                                            }
                                        }
                                    }
                                } else if (Login.anInt701 == 5) {
                                    var12 = Login.anInt710 + 180 - 80;
                                    var14 = 321;
                                    if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                        Class184.method1202();
                                        return;
                                    }

                                    var12 = Login.anInt710 + 180 + 80;
                                    if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                        Login.loginResponseLine1 = "";
                                        Login.loginResponseLine2 = "Enter your username/email & password.";
                                        Login.loginResponseLine3 = "";
                                        Login.anInt701 = 2;
                                        Login.anInt713 = 0;
                                        Login.password = "";
                                    }

                                    while (method353()) {
                                        var15 = false;

                                        for (var16 = 0; var16 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var16) {
                                            if (Class77.aChar836 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var16)) {
                                                var15 = true;
                                                break;
                                            }
                                        }

                                        if (Class99.anInt1087 == 13) {
                                            Login.loginResponseLine1 = "";
                                            Login.loginResponseLine2 = "Enter your username/email & password.";
                                            Login.loginResponseLine3 = "";
                                            Login.anInt701 = 2;
                                            Login.anInt713 = 0;
                                            Login.password = "";
                                        } else {
                                            if (Class99.anInt1087 == 85 && Login.username.length() > 0) {
                                                Login.username = Login.username.substring(0, Login.username.length() - 1);
                                            }

                                            if (Class99.anInt1087 == 84) {
                                                Class184.method1202();
                                                return;
                                            }

                                            if (var15 && Login.username.length() < 320) {
                                                Login.username = Login.username + Class77.aChar836;
                                            }
                                        }
                                    }
                                } else if (Login.anInt701 == 6) {
                                    while (true) {
                                        do {
                                            if (!method353()) {
                                                var13 = 321;
                                                if (var1 == 1 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                                                    Login.loginResponseLine1 = "";
                                                    Login.loginResponseLine2 = "Enter your username/email & password.";
                                                    Login.loginResponseLine3 = "";
                                                    Login.anInt701 = 2;
                                                    Login.anInt713 = 0;
                                                    Login.password = "";
                                                }

                                                return;
                                            }
                                        } while (Class99.anInt1087 != 84 && Class99.anInt1087 != 13);

                                        Login.loginResponseLine1 = "";
                                        Login.loginResponseLine2 = "Enter your username/email & password.";
                                        Login.loginResponseLine3 = "";
                                        Login.anInt701 = 2;
                                        Login.anInt713 = 0;
                                        Login.password = "";
                                    }
                                }
                            }
                        } else {
                            while (method353()) {
                                if (Class99.anInt1087 == 84) {
                                    Login.loginResponseLine1 = "";
                                    Login.loginResponseLine2 = "Enter your username/email & password.";
                                    Login.loginResponseLine3 = "";
                                    Login.anInt701 = 2;
                                    Login.anInt713 = 0;
                                } else if (Class99.anInt1087 == 13) {
                                    Login.anInt701 = 0;
                                }
                            }

                            var12 = Login.anInt710 + 180 - 80;
                            var14 = 321;
                            if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                Login.loginResponseLine1 = "";
                                Login.loginResponseLine2 = "Enter your username/email & password.";
                                Login.loginResponseLine3 = "";
                                Login.anInt701 = 2;
                                Login.anInt713 = 0;
                            }

                            var12 = Login.anInt710 + 180 + 80;
                            if (var1 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var14 - 20 && var10 <= var14 + 20) {
                                Login.anInt701 = 0;
                            }
                        }
                    }

                }
            }
        }
    }

    public static void method356(Class48 var0) {
        Class57.aClass48_435 = var0;
    }

    public static boolean method353() {
        Class4 var0 = Class4.aClass4_26;
        synchronized (Class4.aClass4_26) {
            if (Class4.anInt22 == Class4.anInt29) {
                return false;
            }
            Class99.anInt1087 = Class4.anIntArray30[Class4.anInt29];
            Class77.aChar836 = Class4.aCharArray28[Class4.anInt29];
            Class4.anInt29 = Class4.anInt29 + 1 & 127;
            return true;
        }
    }

    void method243() {
        long var1 = Class124.currentTime();
        long var3 = aLongArray310[Class138.anInt1760];
        aLongArray310[Class138.anInt1760] = var1;
        Class138.anInt1760 = Class138.anInt1760 + 1 & 31;
        if (var3 != 0L && var1 > var3) {
        }

        synchronized (this) {
            Class42.aBoolean356 = aBoolean298;
        }

        this.method228();
    }

    protected final void method260(int var1, int var2) {
        if (this.anInt311 != var1 || var2 != this.anInt286) {
            this.method239();
        }

        this.anInt311 = var1;
        this.anInt286 = var2;
    }

    protected void method253() {
        this.aClipboard302 = this.getToolkit().getSystemClipboard();
    }

    protected final void method252() {
        if (Class108.aString1292.toLowerCase().indexOf("microsoft") != -1) {
            Class4.anIntArray18[186] = 57;
            Class4.anIntArray18[187] = 27;
            Class4.anIntArray18[188] = 71;
            Class4.anIntArray18[189] = 26;
            Class4.anIntArray18[190] = 72;
            Class4.anIntArray18[191] = 73;
            Class4.anIntArray18[192] = 58;
            Class4.anIntArray18[219] = 42;
            Class4.anIntArray18[220] = 74;
            Class4.anIntArray18[221] = 43;
            Class4.anIntArray18[222] = 59;
            Class4.anIntArray18[223] = 28;
        } else {
            Class4.anIntArray18[44] = 71;
            Class4.anIntArray18[45] = 26;
            Class4.anIntArray18[46] = 72;
            Class4.anIntArray18[47] = 73;
            Class4.anIntArray18[59] = 57;
            Class4.anIntArray18[61] = 27;
            Class4.anIntArray18[91] = 42;
            Class4.anIntArray18[92] = 74;
            Class4.anIntArray18[93] = 43;
            Class4.anIntArray18[192] = 28;
            Class4.anIntArray18[222] = 58;
            Class4.anIntArray18[520] = 59;
        }

        Class75.method444(this.aCanvas294);
    }

    final void method248() {
        Container var1 = this.method244();
        if (var1 != null) {
            Class178 var2 = this.method234();
            this.anInt293 = Math.max(var2.anInt2141, this.anInt308);
            this.anInt305 = Math.max(var2.anInt2142, this.anInt309);
            if (this.anInt293 <= 0) {
                this.anInt293 = 1;
            }

            if (this.anInt305 <= 0) {
                this.anInt305 = 1;
            }

            AxisAlignedBoundingBox.appletWidth = Math.min(this.anInt293, this.anInt311);
            Class64.appletHeight = Math.min(this.anInt305, this.anInt286);
            this.anInt295 = (this.anInt293 - AxisAlignedBoundingBox.appletWidth) / 2;
            this.anInt289 = 0;
            this.aCanvas294.setSize(AxisAlignedBoundingBox.appletWidth, Class64.appletHeight);
            World.graphicsProvider = new GraphicsProvider(AxisAlignedBoundingBox.appletWidth, Class64.appletHeight, this.aCanvas294);
            if (var1 == this.aFrame291) {
                Insets var3 = this.aFrame291.getInsets();
                this.aCanvas294.setLocation(var3.left + this.anInt295, this.anInt289 + var3.top);
            } else {
                this.aCanvas294.setLocation(this.anInt295, this.anInt289);
            }

            this.aBoolean281 = true;
            this.method259();
        }
    }

    public final void focusLost(FocusEvent var1) {
        aBoolean298 = false;
    }

    final void method250() {
        java.awt.Canvas var1 = this.aCanvas294;
        var1.removeKeyListener(Class4.aClass4_26);
        var1.removeFocusListener(Class4.aClass4_26);
        Class4.anInt20 = -1;
        java.awt.Canvas var2 = this.aCanvas294;
        var2.removeMouseListener(Class33.aClass33_267);
        var2.removeMouseMotionListener(Class33.aClass33_267);
        var2.removeFocusListener(Class33.aClass33_267);
        Class33.anInt257 = 0;
        if (this.aClass8_288 != null) {
            this.aClass8_288.method44(this.aCanvas294);
        }

        this.method258();
        Class75.method444(this.aCanvas294);
        java.awt.Canvas var3 = this.aCanvas294;
        var3.addMouseListener(Class33.aClass33_267);
        var3.addMouseMotionListener(Class33.aClass33_267);
        var3.addFocusListener(Class33.aClass33_267);
        if (this.aClass8_288 != null) {
            this.aClass8_288.method42(this.aCanvas294);
        }

        this.method239();
    }

    protected final boolean method242() {
        String var1 = this.getDocumentBase().getHost().toLowerCase();
        if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
            if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
                if (var1.endsWith("127.0.0.1")) {
                    return true;
                }
                while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                    var1 = var1.substring(0, var1.length() - 1);
                }

                if (var1.endsWith("192.168.1.")) {
                    return true;
                }
                this.method227("invalidhost");
                return false;
            }
            return true;
        }
        return true;
    }

    public void run() {
        try {
            if (Class108.aString1292 != null) {
                String var1 = Class108.aString1292.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Class108.aString1298;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method227("wrongjava");
                        return;
                    }

                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && Boundary.method656(var2.charAt(var3)); ++var3) {
                        }

                        String var5 = var2.substring(6, var3);
                        if (CacheIndex.method803(var5) && Class85.method495(var5) < 10) {
                            this.method227("wrongjava");
                            return;
                        }
                    }

                    anInt284 = 5;
                }
            }

            this.setFocusCycleRoot(true);
            this.method258();
            this.method236();

            Object var8;
            try {
                var8 = new Class122_Sub2();
            } catch (Throwable var6) {
                var8 = new Class122_Sub1();
            }

            aClass122_303 = (Class122) var8;

            while (aLong307 == 0L || Class124.currentTime() < aLong307) {
                anInt290 = aClass122_303.method666(anInt287, anInt284);

                for (int var4 = 0; var4 < anInt290; ++var4) {
                    this.method243();
                }

                this.method231();
                this.method249(this.aCanvas294);
            }
        } catch (Exception var7) {
            Client.method332(null, var7);
            this.method227("crash");
        }

        this.method235();
    }

    void method231() {
        Container var1 = this.method244();
        long var2 = Class124.currentTime();
        long var4 = aLongArray282[AnimationSkin.anInt919];
        aLongArray282[AnimationSkin.anInt919] = var2;
        AnimationSkin.anInt919 = AnimationSkin.anInt919 + 1 & 31;
        if (0L != var4 && var2 > var4) {
            int var6 = (int) (var2 - var4);
            anInt300 = ((var6 >> 1) + 32000) / var6;
        }

        if (++anInt304 - 1 > 50) {
            anInt304 -= 50;
            this.aBoolean281 = true;
            this.aCanvas294.setSize(AxisAlignedBoundingBox.appletWidth, Class64.appletHeight);
            this.aCanvas294.setVisible(true);
            if (var1 == this.aFrame291) {
                Insets var7 = this.aFrame291.getInsets();
                this.aCanvas294.setLocation(var7.left + this.anInt295, this.anInt289 + var7.top);
            } else {
                this.aCanvas294.setLocation(this.anInt295, this.anInt289);
            }
        }

        if (this.aBoolean283) {
            this.method250();
        }

        this.method230();
        this.method237(this.aBoolean281);
        if (this.aBoolean281) {
            this.method257();
        }

        this.aBoolean281 = false;
    }

    public final void method245(Graphics var1) {
        this.method225(var1);
    }

    protected Class115 method247() {
        if (this.aClass8_288 == null) {
            this.aClass8_288 = new Class8();
            this.aClass8_288.method42(this.aCanvas294);
        }

        return this.aClass8_288;
    }

    final synchronized void method235() {
        if (!aBoolean312) {
            aBoolean312 = true;

            try {
                this.aCanvas294.removeFocusListener(this);
            } catch (Exception var5) {
            }

            try {
                this.method241();
            } catch (Exception var4) {
            }

            if (this.aFrame291 != null) {
                try {
                    System.exit(0);
                } catch (Throwable var3) {
                }
            }

            if (aClass108_301 != null) {
                try {
                    aClass108_301.method746();
                } catch (Exception var2) {
                }
            }

            this.method240();
        }
    }

    public final void stop() {
        if (anApplet_Sub1_297 == this && !aBoolean312) {
            aLong307 = Class124.currentTime() + 4000L;
        }
    }

    public final void destroy() {
        if (this == anApplet_Sub1_297 && !aBoolean312) {
            aLong307 = Class124.currentTime();
            Class127.method875(5000L);
            this.method235();
        }
    }

    protected void method255(String var1) {
        this.aClipboard302.setContents(new StringSelection(var1), null);
    }

    public final synchronized void method225(Graphics var1) {
        if (anApplet_Sub1_297 == this && !aBoolean312) {
            this.aBoolean281 = true;
            if (Class124.currentTime() - this.aLong280 > 1000L) {
                Rectangle var2 = var1.getClipBounds();
                if (var2 == null || var2.width >= AxisAlignedBoundingBox.appletWidth && var2.height >= Class64.appletHeight) {
                    this.aBoolean283 = true;
                }
            }

        }
    }

    public final void focusGained(FocusEvent var1) {
        aBoolean298 = true;
        this.aBoolean281 = true;
    }

    public final void windowClosing(WindowEvent var1) {
        this.destroy();
    }

    public final void windowActivated(WindowEvent var1) {
    }

    protected final void method256(int var1, int var2, int var3) {
        try {
            if (anApplet_Sub1_297 != null) {
                ++anInt285;
                if (anInt285 >= 3) {
                    this.method227("alreadyloaded");
                    return;
                }

                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }

            anApplet_Sub1_297 = this;
            AxisAlignedBoundingBox.appletWidth = var1;
            Class64.appletHeight = var2;
            RuntimeException_Sub1.revision = var3;
            RuntimeException_Sub1.anApplet1283 = this;
            if (aClass108_301 == null) {
                aClass108_301 = new Class108();
            }

            aClass108_301.method747(this, 1);
        } catch (Exception var5) {
            Client.method332(null, var5);
            this.method227("crash");
        }

    }

    protected void method227(String var1) {
        if (!this.aBoolean292) {
            this.aBoolean292 = true;
            System.out.println("error_game_" + var1);

            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var3) {
            }

        }
    }

    public final void windowDeiconified(WindowEvent var1) {
    }

    protected abstract void method240();

    public abstract void init();

    protected abstract void method236();

    final void method230() {
        Class178 var1 = this.method234();
        if (this.anInt293 != var1.anInt2141 || this.anInt305 != var1.anInt2142 || this.aBoolean299) {
            this.method248();
            this.aBoolean299 = false;
        }

    }

    protected abstract void method241();

    protected final void method238(int var1, String var2, boolean var3) {
        try {
            Graphics var4 = this.aCanvas294.getGraphics();
            if (Class64.aFont652 == null) {
                Class64.aFont652 = new java.awt.Font("Helvetica", 1, 13);
                Class168.aFontMetrics2081 = this.aCanvas294.getFontMetrics(Class64.aFont652);
            }

            if (var3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, AxisAlignedBoundingBox.appletWidth, Class64.appletHeight);
            }

            Color var5 = new Color(140, 17, 17);

            try {
                if (anImage296 == null) {
                    anImage296 = this.aCanvas294.createImage(304, 34);
                }

                Graphics var6 = anImage296.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, var1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
                var6.setFont(Class64.aFont652);
                var6.setColor(Color.white);
                var6.drawString(var2, (304 - Class168.aFontMetrics2081.stringWidth(var2)) / 2, 22);
                var4.drawImage(anImage296, AxisAlignedBoundingBox.appletWidth / 2 - 152, Class64.appletHeight / 2 - 18, null);
            } catch (Exception var9) {
                int var7 = AxisAlignedBoundingBox.appletWidth / 2 - 152;
                int var8 = Class64.appletHeight / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(var7 + 2 + var1 * 3, var8 + 2, 300 - var1 * 3, 30);
                var4.setFont(Class64.aFont652);
                var4.setColor(Color.white);
                var4.drawString(var2, var7 + (304 - Class168.aFontMetrics2081.stringWidth(var2)) / 2, var8 + 22);
            }
        } catch (Exception var10) {
            this.aCanvas294.repaint();
        }

    }

    protected final void method229() {
        anImage296 = null;
        Class64.aFont652 = null;
        Class168.aFontMetrics2081 = null;
    }

    final void method249(Object var1) {
        if (this.anEventQueue306 != null) {
            for (int var2 = 0; var2 < 50 && this.anEventQueue306.peekEvent() != null; ++var2) {
                Class127.method875(1L);
            }

            if (var1 != null) {
                this.anEventQueue306.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }

        }
    }

    Container method244() {
        return this.aFrame291 != null ? this.aFrame291 : this;
    }

    Class178 method234() {
        Container var1 = this.method244();
        int var2 = Math.max(var1.getWidth(), this.anInt308);
        int var3 = Math.max(var1.getHeight(), this.anInt309);
        if (this.aFrame291 != null) {
            Insets var4 = this.aFrame291.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.bottom + var4.top;
        }

        return new Class178(var2, var3);
    }

    protected final boolean method232() {
        return this.aFrame291 != null;
    }

    public final void windowClosed(WindowEvent var1) {
    }

    protected final void method246() {
        java.awt.Canvas var1 = this.aCanvas294;
        var1.addMouseListener(Class33.aClass33_267);
        var1.addMouseMotionListener(Class33.aClass33_267);
        var1.addFocusListener(Class33.aClass33_267);
    }

    public final void windowOpened(WindowEvent var1) {
    }

    final void method239() {
        this.aBoolean299 = true;
    }

    protected abstract void method259();

    final synchronized void method258() {
        Container var1 = this.method244();
        if (this.aCanvas294 != null) {
            this.aCanvas294.removeFocusListener(this);
            var1.remove(this.aCanvas294);
        }

        AxisAlignedBoundingBox.appletWidth = Math.max(var1.getWidth(), this.anInt308);
        Class64.appletHeight = Math.max(var1.getHeight(), this.anInt309);
        Insets var2;
        if (this.aFrame291 != null) {
            var2 = this.aFrame291.getInsets();
            AxisAlignedBoundingBox.appletWidth -= var2.right + var2.left;
            Class64.appletHeight -= var2.bottom + var2.top;
        }

        this.aCanvas294 = new Canvas(this);
        var1.add(this.aCanvas294);
        this.aCanvas294.setSize(AxisAlignedBoundingBox.appletWidth, Class64.appletHeight);
        this.aCanvas294.setVisible(true);
        this.aCanvas294.setBackground(Color.BLACK);
        if (var1 == this.aFrame291) {
            var2 = this.aFrame291.getInsets();
            this.aCanvas294.setLocation(var2.left + this.anInt295, var2.top + this.anInt289);
        } else {
            this.aCanvas294.setLocation(this.anInt295, this.anInt289);
        }

        this.aCanvas294.addFocusListener(this);
        this.aCanvas294.requestFocus();
        this.aBoolean281 = true;
        if (World.graphicsProvider != null && World.graphicsProvider.anInt2180 == AxisAlignedBoundingBox.appletWidth && World.graphicsProvider.anInt2182 == Class64.appletHeight) {
            ((GraphicsProvider) World.graphicsProvider).method168(this.aCanvas294);
            World.graphicsProvider.method172(0, 0);
        } else {
            World.graphicsProvider = new GraphicsProvider(AxisAlignedBoundingBox.appletWidth, Class64.appletHeight, this.aCanvas294);
        }

        this.aBoolean283 = false;
        this.aLong280 = Class124.currentTime();
    }

    void method257() {
        int var1 = this.anInt295;
        int var2 = this.anInt289;
        int var3 = this.anInt293 - AxisAlignedBoundingBox.appletWidth - var1;
        int var4 = this.anInt305 - Class64.appletHeight - var2;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                Container var5 = this.method244();
                int var6 = 0;
                int var7 = 0;
                if (var5 == this.aFrame291) {
                    Insets var8 = this.aFrame291.getInsets();
                    var6 = var8.left;
                    var7 = var8.top;
                }

                Graphics var10 = var5.getGraphics();
                var10.setColor(Color.black);
                if (var1 > 0) {
                    var10.fillRect(var6, var7, var1, this.anInt305);
                }

                if (var2 > 0) {
                    var10.fillRect(var6, var7, this.anInt293, var2);
                }

                if (var3 > 0) {
                    var10.fillRect(this.anInt293 + var6 - var3, var7, var3, this.anInt305);
                }

                if (var4 > 0) {
                    var10.fillRect(var6, var7 + this.anInt305 - var4, this.anInt293, var4);
                }
            } catch (Exception var9) {
            }
        }

    }

    public final void start() {
        if (this == anApplet_Sub1_297 && !aBoolean312) {
            aLong307 = 0L;
        }
    }

    public final void windowIconified(WindowEvent var1) {
    }

    protected abstract void method237(boolean var1);

    public final void windowDeactivated(WindowEvent var1) {
    }

    protected abstract void method228();
}
