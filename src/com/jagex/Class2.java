package com.jagex;

public class Class2 {
    static CacheReferenceTable aCacheReferenceTable8;
    static int anInt9;
    static int anInt15;
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array12;
    static Class188 aClass188_13;
    String aString7;
    int anInt14;
    int anInt11;
    Class77 aClass77_10;

    Class2(String var1, int var2, int var3, Class77 var4) {
        this.aString7 = var1;
        this.anInt14 = var2;
        this.anInt11 = var3;
        this.aClass77_10 = var4;
    }

    static void method12(Font var0, Font var1, Font var2, boolean var3) {
        if (var3) {
            Login.anInt702 = (AxisAlignedBoundingBox.appletWidth - 765) / 2;
            Login.anInt710 = Login.anInt702 + 202;
        }

        byte var4;
        int var5;
        int var7;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var26;
        int var28;
        int var29;
        int var30;
        if (Login.aBoolean694) {
            if (Class158.aSpriteArray1847 == null) {
                Class158.aSpriteArray1847 = RuntimeException_Sub1.method742(Class21.aCacheReferenceTable139, "sl_back", "");
            }

            if (Login.aNode_Sub21_Sub26_Sub2Array708 == null) {
                Login.aNode_Sub21_Sub26_Sub2Array708 = InterfaceNode.method267(Class21.aCacheReferenceTable139, "sl_flags", "");
            }

            if (Class22.aNode_Sub21_Sub26_Sub2Array147 == null) {
                Class22.aNode_Sub21_Sub26_Sub2Array147 = InterfaceNode.method267(Class21.aCacheReferenceTable139, "sl_arrows", "");
            }

            if (WorldMapTransportation.aNode_Sub21_Sub26_Sub2Array85 == null) {
                WorldMapTransportation.aNode_Sub21_Sub26_Sub2Array85 = InterfaceNode.method267(Class21.aCacheReferenceTable139, "sl_stars", "");
            }

            Node_Sub21_Sub26.method1223(Login.anInt702, 23, 765, 480, 0);
            Node_Sub21_Sub26.method1217(Login.anInt702, 0, 125, 23, 12425273, 9135624);
            Node_Sub21_Sub26.method1217(Login.anInt702 + 125, 0, 640, 23, 5197647, 2697513);
            var0.method1161("Select a world", Login.anInt702 + 62, 15, 0, -1);
            if (WorldMapTransportation.aNode_Sub21_Sub26_Sub2Array85 != null) {
                WorldMapTransportation.aNode_Sub21_Sub26_Sub2Array85[1].method1155(Login.anInt702 + 140, 1);
                var1.method1170("Members only world", Login.anInt702 + 152, 10, 16777215, -1);
                WorldMapTransportation.aNode_Sub21_Sub26_Sub2Array85[0].method1155(Login.anInt702 + 140, 12);
                var1.method1170("Free world", Login.anInt702 + 152, 21, 16777215, -1);
            }

            if (Class22.aNode_Sub21_Sub26_Sub2Array147 != null) {
                var26 = Login.anInt702 + 280;
                if (World.anIntArray385[0] == 0 && World.anIntArray387[0] == 0) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[2].method1155(var26, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[0].method1155(var26, 4);
                }

                if (World.anIntArray385[0] == 0 && World.anIntArray387[0] == 1) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[3].method1155(var26 + 15, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[1].method1155(var26 + 15, 4);
                }

                var0.method1170("World", var26 + 32, 17, 16777215, -1);
                var5 = Login.anInt702 + 390;
                if (World.anIntArray385[0] == 1 && World.anIntArray387[0] == 0) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[2].method1155(var5, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[0].method1155(var5, 4);
                }

                if (World.anIntArray385[0] == 1 && World.anIntArray387[0] == 1) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[3].method1155(var5 + 15, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[1].method1155(var5 + 15, 4);
                }

                var0.method1170("Players", var5 + 32, 17, 16777215, -1);
                var28 = Login.anInt702 + 500;
                if (World.anIntArray385[0] == 2 && World.anIntArray387[0] == 0) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[2].method1155(var28, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[0].method1155(var28, 4);
                }

                if (World.anIntArray385[0] == 2 && World.anIntArray387[0] == 1) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[3].method1155(var28 + 15, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[1].method1155(var28 + 15, 4);
                }

                var0.method1170("Location", var28 + 32, 17, 16777215, -1);
                var7 = Login.anInt702 + 610;
                if (World.anIntArray385[0] == 3 && World.anIntArray387[0] == 0) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[2].method1155(var7, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[0].method1155(var7, 4);
                }

                if (World.anIntArray385[0] == 3 && World.anIntArray387[0] == 1) {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[3].method1155(var7 + 15, 4);
                } else {
                    Class22.aNode_Sub21_Sub26_Sub2Array147[1].method1155(var7 + 15, 4);
                }

                var0.method1170("Type", var7 + 32, 17, 16777215, -1);
            }

            Node_Sub21_Sub26.method1223(Login.anInt702 + 708, 4, 50, 16, 0);
            var1.method1161("Cancel", Login.anInt702 + 708 + 25, 16, 16777215, -1);
            Login.anInt684 = -1;
            if (Class158.aSpriteArray1847 != null) {
                var4 = 88;
                byte var33 = 19;
                var28 = 765 / (var4 + 1);
                var7 = 480 / (var33 + 1);

                do {
                    var29 = var7;
                    var30 = var28;
                    if (var7 * (var28 - 1) >= World.anInt397) {
                        --var28;
                    }

                    if (var28 * (var7 - 1) >= World.anInt397) {
                        --var7;
                    }

                    if (var28 * (var7 - 1) >= World.anInt397) {
                        --var7;
                    }
                } while (var7 != var29 || var30 != var28);

                var29 = (765 - var28 * var4) / (var28 + 1);
                if (var29 > 5) {
                    var29 = 5;
                }

                var30 = (480 - var7 * var33) / (var7 + 1);
                if (var30 > 5) {
                    var30 = 5;
                }

                var10 = (765 - var28 * var4 - (var28 - 1) * var29) / 2;
                var11 = (480 - var33 * var7 - (var7 - 1) * var30) / 2;
                var12 = var11 + 23;
                var13 = var10 + Login.anInt702;
                var14 = 0;
                boolean var15 = false;

                int var16;
                for (var16 = 0; var16 < World.anInt397; ++var16) {
                    World var17 = World.worlds[var16];
                    boolean var18 = true;
                    String var19 = Integer.toString(var17.population);
                    if (var17.population == -1) {
                        var19 = "OFF";
                        var18 = false;
                    } else if (var17.population > 1980) {
                        var19 = "FULL";
                        var18 = false;
                    }

                    int var20 = 0;
                    byte var21;
                    if (var17.method330()) {
                        if (var17.method327()) {
                            var21 = 7;
                        } else {
                            var21 = 6;
                        }
                    } else if (var17.method325()) {
                        var20 = 16711680;
                        if (var17.method327()) {
                            var21 = 5;
                        } else {
                            var21 = 4;
                        }
                    } else if (var17.method326()) {
                        if (var17.method327()) {
                            var21 = 3;
                        } else {
                            var21 = 2;
                        }
                    } else if (var17.method327()) {
                        var21 = 1;
                    } else {
                        var21 = 0;
                    }

                    if (Class33.anInt261 >= var13 && Class33.anInt260 >= var12 && Class33.anInt261 < var4 + var13 && Class33.anInt260 < var12 + var33 && var18) {
                        Login.anInt684 = var16;
                        Class158.aSpriteArray1847[var21].method1236(var13, var12, 128, 16777215);
                        var15 = true;
                    } else {
                        Class158.aSpriteArray1847[var21].method1242(var13, var12);
                    }

                    if (Login.aNode_Sub21_Sub26_Sub2Array708 != null) {
                        Login.aNode_Sub21_Sub26_Sub2Array708[(var17.method327() ? 8 : 0) + var17.location].method1155(var13 + 29, var12);
                    }

                    var0.method1161(Integer.toString(var17.id), var13 + 15, var33 / 2 + var12 + 5, var20, -1);
                    var1.method1161(var19, var13 + 60, var12 + var33 / 2 + 5, 268435455, -1);
                    var12 += var30 + var33;
                    ++var14;
                    if (var14 >= var7) {
                        var12 = var11 + 23;
                        var13 += var29 + var4;
                        var14 = 0;
                    }
                }

                if (var15) {
                    var16 = var1.getTextWidth(World.worlds[Login.anInt684].activity) + 6;
                    int var22 = var1.anInt221 + 8;
                    Node_Sub21_Sub26.method1223(Class33.anInt261 - var16 / 2, Class33.anInt260 + 20 + 5, var16, var22, 16777120);
                    Node_Sub21_Sub26.method1208(Class33.anInt261 - var16 / 2, Class33.anInt260 + 20 + 5, var16, var22, 0);
                    var1.method1161(World.worlds[Login.anInt684].activity, Class33.anInt261, Class33.anInt260 + 20 + 5 + var1.anInt221 + 4, 0, -1);
                }
            }

            World.graphicsProvider.method172(0, 0);
        } else {
            if (var3) {
                Class3.aSprite17.method1242(Login.anInt702, 0);
                Login.aSprite697.method1242(Login.anInt702 + 382, 0);
                Login.aNode_Sub21_Sub26_Sub2_695.method1155(Login.anInt702 + 382 - Login.aNode_Sub21_Sub26_Sub2_695.anInt206 / 2, 18);
            }

            if (Client.connectionState == 0 || Client.connectionState == 5) {
                var4 = 20;
                var0.method1161("RuneScape is loading - please wait...", Login.anInt710 + 180, 245 - var4, 16777215, -1);
                var5 = 253 - var4;
                Node_Sub21_Sub26.method1208(Login.anInt710 + 180 - 152, var5, 304, 34, 9179409);
                Node_Sub21_Sub26.method1208(Login.anInt710 + 180 - 151, var5 + 1, 302, 32, 0);
                Node_Sub21_Sub26.method1223(Login.anInt710 + 180 - 150, var5 + 2, Login.anInt699 * 3, 30, 9179409);
                Node_Sub21_Sub26.method1223(Login.anInt710 + 180 - 150 + Login.anInt699 * 3, var5 + 2, 300 - Login.anInt699 * 3, 30, 0);
                var0.method1161(Login.aString686, Login.anInt710 + 180, 276 - var4, 16777215, -1);
            }

            String var23;
            short var25;
            short var27;
            if (Client.connectionState == 20) {
                Login.aNode_Sub21_Sub26_Sub2_690.method1155(Login.anInt710 + 180 - Login.aNode_Sub21_Sub26_Sub2_690.anInt206 / 2, 271 - Login.aNode_Sub21_Sub26_Sub2_690.anInt232 / 2);
                var25 = 211;
                var0.method1161(Login.loginResponseLine1, Login.anInt710 + 180, var25, 16776960, 0);
                var26 = var25 + 15;
                var0.method1161(Login.loginResponseLine2, Login.anInt710 + 180, var26, 16776960, 0);
                var26 += 15;
                var0.method1161(Login.loginResponseLine3, Login.anInt710 + 180, var26, 16776960, 0);
                var26 += 15;
                var26 += 10;
                if (Login.anInt701 != 4) {
                    var0.method1170("Login: ", Login.anInt710 + 180 - 110, var26, 16777215, 0);
                    var27 = 200;

                    for (var23 = Login.username; var0.getTextWidth(var23) > var27; var23 = var23.substring(0, var23.length() - 1)) {
                    }

                    var0.method1170(Node_Sub21_Sub26_Sub3.method1177(var23), Login.anInt710 + 180 - 70, var26, 16777215, 0);
                    var26 += 15;
                    var0.method1170("Password: " + ScriptEvent.method272(Login.password), Login.anInt710 + 180 - 108, var26, 16777215, 0);
                    var26 += 15;
                }
            }

            if (Client.connectionState == 10 || Client.connectionState == 11) {
                Login.aNode_Sub21_Sub26_Sub2_690.method1155(Login.anInt710, 171);
                short var6;
                if (Login.anInt701 == 0) {
                    var25 = 251;
                    var0.method1161("Welcome to RuneScape", Login.anInt710 + 180, var25, 16776960, 0);
                    var26 = var25 + 30;
                    var5 = Login.anInt710 + 180 - 80;
                    var6 = 291;
                    Login.aNode_Sub21_Sub26_Sub2_709.method1155(var5 - 73, var6 - 20);
                    var0.method1184("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    var5 = Login.anInt710 + 180 + 80;
                    Login.aNode_Sub21_Sub26_Sub2_709.method1155(var5 - 73, var6 - 20);
                    var0.method1184("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (Login.anInt701 == 1) {
                    var0.method1161(Login.aString707, Login.anInt710 + 180, 211, 16776960, 0);
                    var25 = 236;
                    var0.method1161(Login.loginResponseLine1, Login.anInt710 + 180, var25, 16777215, 0);
                    var26 = var25 + 15;
                    var0.method1161(Login.loginResponseLine2, Login.anInt710 + 180, var26, 16777215, 0);
                    var26 += 15;
                    var0.method1161(Login.loginResponseLine3, Login.anInt710 + 180, var26, 16777215, 0);
                    var26 += 15;
                    var5 = Login.anInt710 + 180 - 80;
                    var6 = 321;
                    Login.aNode_Sub21_Sub26_Sub2_709.method1155(var5 - 73, var6 - 20);
                    var0.method1161("Continue", var5, var6 + 5, 16777215, 0);
                    var5 = Login.anInt710 + 180 + 80;
                    Login.aNode_Sub21_Sub26_Sub2_709.method1155(var5 - 73, var6 - 20);
                    var0.method1161("Cancel", var5, var6 + 5, 16777215, 0);
                } else {
                    short var8;
                    if (Login.anInt701 == 2) {
                        var25 = 211;
                        var0.method1161(Login.loginResponseLine1, Login.anInt710 + 180, var25, 16776960, 0);
                        var26 = var25 + 15;
                        var0.method1161(Login.loginResponseLine2, Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var0.method1161(Login.loginResponseLine3, Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var26 += 10;
                        var0.method1170("Login: ", Login.anInt710 + 180 - 110, var26, 16777215, 0);
                        var27 = 200;

                        for (var23 = Login.username; var0.getTextWidth(var23) > var27; var23 = var23.substring(1)) {
                        }

                        var0.method1170(Node_Sub21_Sub26_Sub3.method1177(var23) + (Login.anInt713 == 0 & Client.engineCycle % 40 < 20 ? Class75.method449(16776960) + "|" : ""), Login.anInt710 + 180 - 70, var26, 16777215, 0);
                        var26 += 15;
                        var0.method1170("Password: " + ScriptEvent.method272(Login.password) + (Login.anInt713 == 1 & Client.engineCycle % 40 < 20 ? Class75.method449(16776960) + "|" : ""), Login.anInt710 + 180 - 108, var26, 16777215, 0);
                        var26 += 15;
                        var7 = Login.anInt710 + 180 - 80;
                        var8 = 321;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var7 - 73, var8 - 20);
                        var0.method1161("Login", var7, var8 + 5, 16777215, 0);
                        var7 = Login.anInt710 + 180 + 80;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var7 - 73, var8 - 20);
                        var0.method1161("Cancel", var7, var8 + 5, 16777215, 0);
                        var25 = 357;
                        var1.method1161("Forgotten your password? <col=ffffff>Click here.", Login.anInt710 + 180, var25, 16776960, 0);
                    } else if (Login.anInt701 == 3) {
                        var25 = 201;
                        var0.method1161("Invalid username or password.", Login.anInt710 + 180, var25, 16776960, 0);
                        var26 = var25 + 20;
                        var1.method1161("For accounts created after 24th November 2010, please use your", Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var1.method1161("email address to login. Otherwise please login with your username.", Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var5 = Login.anInt710 + 180;
                        var6 = 276;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var5 - 73, var6 - 20);
                        var2.method1161("Try again", var5, var6 + 5, 16777215, 0);
                        var5 = Login.anInt710 + 180;
                        var6 = 326;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var5 - 73, var6 - 20);
                        var2.method1161("Forgotten password?", var5, var6 + 5, 16777215, 0);
                    } else if (Login.anInt701 == 4) {
                        var0.method1161("Authenticator", Login.anInt710 + 180, 211, 16776960, 0);
                        var25 = 236;
                        var0.method1161(Login.loginResponseLine1, Login.anInt710 + 180, var25, 16777215, 0);
                        var26 = var25 + 15;
                        var0.method1161(Login.loginResponseLine2, Login.anInt710 + 180, var26, 16777215, 0);
                        var26 += 15;
                        var0.method1161(Login.loginResponseLine3, Login.anInt710 + 180, var26, 16777215, 0);
                        var26 += 15;
                        var0.method1170("PIN: " + ScriptEvent.method272(Node_Sub7.aString405) + (Client.engineCycle % 40 < 20 ? Class75.method449(16776960) + "|" : ""), Login.anInt710 + 180 - 108, var26, 16777215, 0);
                        var26 -= 8;
                        var0.method1170("Trust this computer", Login.anInt710 + 180 - 9, var26, 16776960, 0);
                        var26 += 15;
                        var0.method1170("for 30 days: ", Login.anInt710 + 180 - 9, var26, 16776960, 0);
                        var5 = Login.anInt710 + 180 - 9 + var0.getTextWidth("for 30 days: ") + 15;
                        var28 = var26 - var0.anInt221;
                        Node_Sub21_Sub26_Sub2 var24;
                        if (Login.aBoolean703) {
                            var24 = AnimationSkin.aNode_Sub21_Sub26_Sub2_1290;
                        } else {
                            var24 = Class49.aNode_Sub21_Sub26_Sub2_375;
                        }

                        var24.method1155(var5, var28);
                        var26 += 15;
                        var29 = Login.anInt710 + 180 - 80;
                        short var9 = 321;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var29 - 73, var9 - 20);
                        var0.method1161("Continue", var29, var9 + 5, 16777215, 0);
                        var29 = Login.anInt710 + 180 + 80;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var29 - 73, var9 - 20);
                        var0.method1161("Cancel", var29, var9 + 5, 16777215, 0);
                        var1.method1161("<u=ff>Can't Log In?</u>", Login.anInt710 + 180, var9 + 36, 255, 0);
                    } else if (Login.anInt701 == 5) {
                        var0.method1161("Forgotten your password?", Login.anInt710 + 180, 201, 16776960, 0);
                        var25 = 221;
                        var2.method1161(Login.loginResponseLine1, Login.anInt710 + 180, var25, 16776960, 0);
                        var26 = var25 + 15;
                        var2.method1161(Login.loginResponseLine2, Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var2.method1161(Login.loginResponseLine3, Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var26 += 14;
                        var0.method1170("Username/email: ", Login.anInt710 + 180 - 145, var26, 16777215, 0);
                        var27 = 174;

                        for (var23 = Login.username; var0.getTextWidth(var23) > var27; var23 = var23.substring(1)) {
                        }

                        var0.method1170(Node_Sub21_Sub26_Sub3.method1177(var23) + (Client.engineCycle % 40 < 20 ? Class75.method449(16776960) + "|" : ""), Login.anInt710 + 180 - 34, var26, 16777215, 0);
                        var26 += 15;
                        var7 = Login.anInt710 + 180 - 80;
                        var8 = 321;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var7 - 73, var8 - 20);
                        var0.method1161("Recover", var7, var8 + 5, 16777215, 0);
                        var7 = Login.anInt710 + 180 + 80;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var7 - 73, var8 - 20);
                        var0.method1161("Back", var7, var8 + 5, 16777215, 0);
                    } else if (Login.anInt701 == 6) {
                        var25 = 211;
                        var0.method1161(Login.loginResponseLine1, Login.anInt710 + 180, var25, 16776960, 0);
                        var26 = var25 + 15;
                        var0.method1161(Login.loginResponseLine2, Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var0.method1161(Login.loginResponseLine3, Login.anInt710 + 180, var26, 16776960, 0);
                        var26 += 15;
                        var5 = Login.anInt710 + 180;
                        var6 = 321;
                        Login.aNode_Sub21_Sub26_Sub2_709.method1155(var5 - 73, var6 - 20);
                        var0.method1161("Back", var5, var6 + 5, 16777215, 0);
                    }
                }
            }

            if (Login.anInt705 > 0) {
                Applet_Sub1.method254(Login.anInt705);
                Login.anInt705 = 0;
            }

            var25 = 256;
            if (Login.anInt712 > 0) {
                for (var5 = 0; var5 < 256; ++var5) {
                    if (Login.anInt712 > 768) {
                        Class173.anIntArray2135[var5] = Class188.method1252(Class20.anIntArray138[var5], Class18.anIntArray133[var5], 1024 - Login.anInt712);
                    } else if (Login.anInt712 > 256) {
                        Class173.anIntArray2135[var5] = Class18.anIntArray133[var5];
                    } else {
                        Class173.anIntArray2135[var5] = Class188.method1252(Class18.anIntArray133[var5], Class20.anIntArray138[var5], 256 - Login.anInt712);
                    }
                }
            } else if (Login.anInt687 > 0) {
                for (var5 = 0; var5 < 256; ++var5) {
                    if (Login.anInt687 > 768) {
                        Class173.anIntArray2135[var5] = Class188.method1252(Class20.anIntArray138[var5], ClanMate.anIntArray240[var5], 1024 - Login.anInt687);
                    } else if (Login.anInt687 > 256) {
                        Class173.anIntArray2135[var5] = ClanMate.anIntArray240[var5];
                    } else {
                        Class173.anIntArray2135[var5] = Class188.method1252(ClanMate.anIntArray240[var5], Class20.anIntArray138[var5], 256 - Login.anInt687);
                    }
                }
            } else {
                for (var5 = 0; var5 < 256; ++var5) {
                    Class173.anIntArray2135[var5] = Class20.anIntArray138[var5];
                }
            }

            Node_Sub21_Sub26.method1209(Login.anInt702, 9, Login.anInt702 + 128, var25 + 7);
            Class3.aSprite17.method1242(Login.anInt702, 0);
            Node_Sub21_Sub26.method1206();
            var5 = 0;
            var28 = World.graphicsProvider.anInt2180 * 9 + Login.anInt702;

            for (var7 = 1; var7 < var25 - 1; ++var7) {
                var29 = (var25 - var7) * Login.anIntArray700[var7] / var25;
                var30 = var29 + 22;
                if (var30 < 0) {
                    var30 = 0;
                }

                var5 += var30;

                for (var10 = var30; var10 < 128; ++var10) {
                    var11 = AxisAlignedBoundingBox.anIntArray669[var5++];
                    if (var11 != 0) {
                        var12 = var11;
                        var13 = 256 - var11;
                        var11 = Class173.anIntArray2135[var11];
                        var14 = World.graphicsProvider.anIntArray2181[var28];
                        World.graphicsProvider.anIntArray2181[var28++] = ((var11 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var11 & '\uff00') + var13 * (var14 & '\uff00') & 16711680) >> 8;
                    } else {
                        ++var28;
                    }
                }

                var28 += var30 + World.graphicsProvider.anInt2180 - 128;
            }

            Node_Sub21_Sub26.method1209(Login.anInt702 + 765 - 128, 9, Login.anInt702 + 765, var25 + 7);
            Login.aSprite697.method1242(Login.anInt702 + 382, 0);
            Node_Sub21_Sub26.method1206();
            var5 = 0;
            var28 = Login.anInt702 + World.graphicsProvider.anInt2180 * 9 + 24 + 637;

            for (var7 = 1; var7 < var25 - 1; ++var7) {
                var29 = Login.anIntArray700[var7] * (var25 - var7) / var25;
                var30 = 103 - var29;
                var28 += var29;

                for (var10 = 0; var10 < var30; ++var10) {
                    var11 = AxisAlignedBoundingBox.anIntArray669[var5++];
                    if (var11 != 0) {
                        var12 = var11;
                        var13 = 256 - var11;
                        var11 = Class173.anIntArray2135[var11];
                        var14 = World.graphicsProvider.anIntArray2181[var28];
                        World.graphicsProvider.anIntArray2181[var28++] = ((var14 & 16711935) * var13 + var12 * (var11 & 16711935) & -16711936) + ((var14 & '\uff00') * var13 + var12 * (var11 & '\uff00') & 16711680) >> 8;
                    } else {
                        ++var28;
                    }
                }

                var5 += 128 - var30;
                var28 += World.graphicsProvider.anInt2180 - var30 - var29;
            }

            Login.aNode_Sub21_Sub26_Sub2Array692[Client.preferences.loginScreenAudioDisabled ? 1 : 0].method1155(Login.anInt702 + 765 - 40, 463);
            if (Client.connectionState > 5 && Client.anInt1463 == 0) {
                if (Class108.aNode_Sub21_Sub26_Sub2_1296 != null) {
                    var26 = Login.anInt702 + 5;
                    var27 = 463;
                    byte var32 = 100;
                    byte var31 = 35;
                    Class108.aNode_Sub21_Sub26_Sub2_1296.method1155(var26, var27);
                    var0.method1161("World" + " " + Client.currentWorld, var32 / 2 + var26, var31 / 2 + var27 - 2, 16777215, 0);
                    if (World.aClass25_384 != null) {
                        var1.method1161("Loading...", var32 / 2 + var26, var31 / 2 + var27 + 12, 16777215, 0);
                    } else {
                        var1.method1161("Click to switch", var26 + var32 / 2, var27 + var31 / 2 + 12, 16777215, 0);
                    }
                } else {
                    Class108.aNode_Sub21_Sub26_Sub2_1296 = Class185.method1203(Class21.aCacheReferenceTable139, "sl_button", "");
                }
            }

        }
    }
}
