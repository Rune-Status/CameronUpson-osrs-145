package com.jagex;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class33 implements MouseListener, MouseMotionListener, FocusListener {
    public static volatile int anInt269 = -1;
    public static volatile long aLong268 = 0L;
    public static int anInt272 = 0;
    public static int anInt261 = 0;
    public static int anInt260 = 0;
    public static int anInt259 = 0;
    public static volatile int anInt256 = 0;
    public static volatile int anInt266 = 0;
    public static int anInt265 = 0;
    public static int anInt255 = 0;
    public static volatile int anInt263 = 0;
    public static long aLong270 = 0L;
    public static volatile int anInt271 = -1;
    public static volatile int anInt257 = 0;
    public static volatile int anInt258 = 0;
    public static Class33 aClass33_267 = new Class33();
    static Class94 aClass94_254;
    static Class103 aClass103_262;
    static InterfaceComponent anInterfaceComponent264;

    static String method217(String var0, InterfaceComponent var1) {
        if (var0.indexOf("%") != -1) {
            int var2;
            for (var2 = 1; var2 <= 5; ++var2) {
                while (true) {
                    int var3 = var0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }

                    var0 = var0.substring(0, var3) + Key.method361(PlayerEntity.method190(var1, var2 - 1)) + var0.substring(var3 + 2);
                }
            }

            while (true) {
                var2 = var0.indexOf("%dns");
                if (var2 == -1) {
                    break;
                }

                String var4 = "";
                if (ScriptEvent.aClass103_330 != null) {
                    var4 = Class122.method808(ScriptEvent.aClass103_330.anInt1165);
                    if (ScriptEvent.aClass103_330.anObject1161 != null) {
                        var4 = (String) ScriptEvent.aClass103_330.anObject1161;
                    }
                }

                var0 = var0.substring(0, var2) + var4 + var0.substring(var2 + 4);
            }
        }

        return var0;
    }

    public static void method218(String var0, String var1, int var2, int var3) throws IOException {
        ItemTable.anInt328 = var3;
        Class102.anInt1151 = var2;

        try {
            Class97.aString1078 = System.getProperty("os.name");
        } catch (Exception var31) {
            Class97.aString1078 = "Unknown";
        }

        InterfaceNode.aString319 = Class97.aString1078.toLowerCase();

        try {
            Class10.aString76 = System.getProperty("user.home");
            if (Class10.aString76 != null) {
                Class10.aString76 = Class10.aString76 + "/";
            }
        } catch (Exception var30) {
        }

        try {
            if (InterfaceNode.aString319.startsWith("win")) {
                if (Class10.aString76 == null) {
                    Class10.aString76 = System.getenv("USERPROFILE");
                }
            } else if (Class10.aString76 == null) {
                Class10.aString76 = System.getenv("HOME");
            }

            if (Class10.aString76 != null) {
                Class10.aString76 = Class10.aString76 + "/";
            }
        } catch (Exception var29) {
        }

        if (Class10.aString76 == null) {
            Class10.aString76 = "~/";
        }

        Class85.aStringArray874 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class10.aString76, "/tmp/", ""};
        ClientPreferences.aStringArray351 = new String[]{".jagex_cache_" + Class102.anInt1151, ".file_store_" + Class102.anInt1151};
        int var4 = 0;

        File var21;
        label295:
        while (var4 < 4) {
            String var5 = var4 == 0 ? "" : "" + var4;
            Class97.aFile1079 = new File(Class10.aString76, "jagex_cl_" + var0 + "_" + var1 + var5 + ".dat");
            String var6 = null;
            String var7 = null;
            boolean var8 = false;
            Buffer var10;
            File var39;
            if (Class97.aFile1079.exists()) {
                try {
                    Class82 var9 = new Class82(Class97.aFile1079, "rw", 10000L);

                    int var11;
                    for (var10 = new Buffer((int) var9.method475()); var10.caret < var10.payload.length; var10.caret += var11) {
                        var11 = var9.method477(var10.payload, var10.caret, var10.payload.length - var10.caret);
                        if (var11 == -1) {
                            throw new IOException();
                        }
                    }

                    var10.caret = 0;
                    var11 = var10.readUnsignedByte();
                    if (var11 < 1 || var11 > 3) {
                        throw new IOException("" + var11);
                    }

                    int var12 = 0;
                    if (var11 > 1) {
                        var12 = var10.readUnsignedByte();
                    }

                    if (var11 <= 2) {
                        var6 = var10.readPrefixedString();
                        if (var12 == 1) {
                            var7 = var10.readPrefixedString();
                        }
                    } else {
                        var6 = var10.method825();
                        if (var12 == 1) {
                            var7 = var10.method825();
                        }
                    }

                    var9.method476();
                } catch (IOException var34) {
                    var34.printStackTrace();
                }

                if (var6 != null) {
                    var39 = new File(var6);
                    if (!var39.exists()) {
                        var6 = null;
                    }
                }

                if (var6 != null) {
                    var39 = new File(var6, "test.dat");
                    if (!PlayerEntity.method196(var39, true)) {
                        var6 = null;
                    }
                }
            }

            if (var6 == null && var4 == 0) {
                label269:
                for (int var13 = 0; var13 < ClientPreferences.aStringArray351.length; ++var13) {
                    for (int var14 = 0; var14 < Class85.aStringArray874.length; ++var14) {
                        File var15 = new File(Class85.aStringArray874[var14] + ClientPreferences.aStringArray351[var13] + File.separatorChar + var0 + File.separatorChar);
                        if (var15.exists() && PlayerEntity.method196(new File(var15, "test.dat"), true)) {
                            var6 = var15.toString();
                            var8 = true;
                            break label269;
                        }
                    }
                }
            }

            if (var6 == null) {
                var6 = Class10.aString76 + File.separatorChar + "jagexcache" + var5 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
                var8 = true;
            }

            File var38;
            if (var7 != null) {
                var38 = new File(var7);
                var39 = new File(var6);

                try {

                    for (int var17 = 0; var17 < var38.listFiles().length; ++var17) {
                        File var18 = var38.listFiles()[var17];
                        File var19 = new File(var39, var18.getName());
                        boolean var20 = var18.renameTo(var19);
                        if (!var20) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var33) {
                    var33.printStackTrace();
                }

                var8 = true;
            }

            if (var8) {
                var38 = new File(var6);
                var10 = null;

                try {
                    Class82 var42 = new Class82(Class97.aFile1079, "rw", 10000L);
                    Buffer var43 = new Buffer(500);
                    var43.method451(3);
                    var43.method451(var10 != null ? 1 : 0);
                    var43.method857(var38.getPath());
                    if (var10 != null) {
                        var43.method857("");
                    }

                    var42.method478(var43.payload, 0, var43.caret);
                    var42.method476();
                } catch (IOException var28) {
                    var28.printStackTrace();
                }
            }

            var21 = new File(var6);
            HealthBar.aFile416 = var21;
            if (!HealthBar.aFile416.exists()) {
                HealthBar.aFile416.mkdirs();
            }

            File[] var35 = HealthBar.aFile416.listFiles();
            if (var35 != null) {

                for (int var22 = 0; var22 < var35.length; ++var22) {
                    File var23 = var35[var22];
                    if (!PlayerEntity.method196(var23, false)) {
                        ++var4;
                        continue label295;
                    }
                }
            }
            break;
        }

        Class78.aFile841 = HealthBar.aFile416;
        if (!Class78.aFile841.exists()) {
            throw new RuntimeException("");
        }
        MouseRecorder.aBoolean1425 = true;

        try {
            var21 = new File(Class10.aString76, "random.dat");
            int var25;
            if (var21.exists()) {
                Class97.aClass93_1076 = new Class93(new Class82(var21, "rw", 25L), 24, 0);
            } else {
                label220:
                for (int var26 = 0; var26 < ClientPreferences.aStringArray351.length; ++var26) {
                    for (var25 = 0; var25 < Class85.aStringArray874.length; ++var25) {
                        File var37 = new File(Class85.aStringArray874[var25] + ClientPreferences.aStringArray351[var26] + File.separatorChar + "random.dat");
                        if (var37.exists()) {
                            Class97.aClass93_1076 = new Class93(new Class82(var37, "rw", 25L), 24, 0);
                            break label220;
                        }
                    }
                }
            }

            if (Class97.aClass93_1076 == null) {
                RandomAccessFile var36 = new RandomAccessFile(var21, "rw");
                var25 = var36.read();
                var36.seek(0L);
                var36.write(var25);
                var36.seek(0L);
                var36.close();
                Class97.aClass93_1076 = new Class93(new Class82(var21, "rw", 25L), 24, 0);
            }
        } catch (IOException var32) {
        }

        Class97.aClass93_1080 = new Class93(new Class82(MouseRecorder.method211("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        Class97.aClass93_1077 = new Class93(new Class82(MouseRecorder.method211("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Class21.aClass93Array141 = new Class93[ItemTable.anInt328];

        for (int var27 = 0; var27 < ItemTable.anInt328; ++var27) {
            Class21.aClass93Array141[var27] = new Class93(new Class82(MouseRecorder.method211("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
        }

    }

    public static boolean method220(int var0) {
        if (Class70.aBooleanArray716[var0]) {
            return true;
        }
        if (!Class51.aReferenceTable382.method1106(var0)) {
            return false;
        }
        int var1 = Class51.aReferenceTable382.method1101(var0);
        if (var1 == 0) {
            Class70.aBooleanArray716[var0] = true;
            return true;
        }
        if (InterfaceComponent.interfaces[var0] == null) {
            InterfaceComponent.interfaces[var0] = new InterfaceComponent[var1];
        }

        for (int var2 = 0; var2 < var1; ++var2) {
            if (InterfaceComponent.interfaces[var0][var2] == null) {
                byte[] var3 = Class51.aReferenceTable382.unpack(var0, var2);
                if (var3 != null) {
                    InterfaceComponent.interfaces[var0][var2] = new InterfaceComponent();
                    InterfaceComponent.interfaces[var0][var2].uid = var2 + (var0 << 16);
                    if (var3[0] == -1) {
                        InterfaceComponent.interfaces[var0][var2].method1027(new Buffer(var3));
                    } else {
                        InterfaceComponent.interfaces[var0][var2].method1026(new Buffer(var3));
                    }
                }
            }
        }

        Class70.aBooleanArray716[var0] = true;
        return true;
    }

    static void method219(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
            if (Client.lowMemory && PlayerEntity.floorLevel != var0) {
                return;
            }

            int var7 = 0;
            boolean var8 = true;
            boolean var9 = false;
            boolean var10 = false;
            if (var1 == 0) {
                var7 = Class60.aSceneGraph631.method671(var0, var2, var3);
            }

            if (var1 == 1) {
                var7 = Class60.aSceneGraph631.method682(var0, var2, var3);
            }

            if (var1 == 2) {
                var7 = Class60.aSceneGraph631.method677(var0, var2, var3);
            }

            if (var1 == 3) {
                var7 = Class60.aSceneGraph631.method678(var0, var2, var3);
            }

            int var11;
            if (var7 != 0) {
                var11 = Class60.aSceneGraph631.method668(var0, var2, var3, var7);
                int var34 = var7 >> 14 & 32767;
                int var35 = var11 & 31;
                int var36 = var11 >> 6 & 3;
                ObjectDefinition var12;
                if (var1 == 0) {
                    Class60.aSceneGraph631.method706(var0, var2, var3);
                    var12 = Class5.method17(var34);
                    if (var12.anInt229 != 0) {
                        Client.collisionMaps[var0].method764(var2, var3, var35, var36, var12.aBoolean223);
                    }
                }

                if (var1 == 1) {
                    Class60.aSceneGraph631.method701(var0, var2, var3);
                }

                if (var1 == 2) {
                    Class60.aSceneGraph631.method718(var0, var2, var3);
                    var12 = Class5.method17(var34);
                    if (var12.anInt230 + var2 > 103 || var3 + var12.anInt230 > 103 || var12.anInt222 + var2 > 103 || var3 + var12.anInt222 > 103) {
                        return;
                    }

                    if (var12.anInt229 != 0) {
                        Client.collisionMaps[var0].method759(var2, var3, var12.anInt230, var12.anInt222, var36, var12.aBoolean223);
                    }
                }

                if (var1 == 3) {
                    Class60.aSceneGraph631.method699(var0, var2, var3);
                    var12 = Class5.method17(var34);
                    if (var12.anInt229 == 1) {
                        Client.collisionMaps[var0].method758(var2, var3);
                    }
                }
            }

            if (var4 >= 0) {
                var11 = var0;
                if (var0 < 3 && (Class26.aByteArrayArrayArray189[1][var2][var3] & 2) == 2) {
                    var11 = var0 + 1;
                }

                SceneGraph var37 = Class60.aSceneGraph631;
                CollisionMap var13 = Client.collisionMaps[var0];
                ObjectDefinition var14 = Class5.method17(var4);
                int var15;
                int var16;
                if (var5 != 1 && var5 != 3) {
                    var15 = var14.anInt230;
                    var16 = var14.anInt222;
                } else {
                    var15 = var14.anInt222;
                    var16 = var14.anInt230;
                }

                int var17;
                int var18;
                if (var2 + var15 <= 104) {
                    var17 = (var15 >> 1) + var2;
                    var18 = var2 + (var15 + 1 >> 1);
                } else {
                    var17 = var2;
                    var18 = var2 + 1;
                }

                int var19;
                int var20;
                if (var3 + var16 <= 104) {
                    var19 = (var16 >> 1) + var3;
                    var20 = var3 + (var16 + 1 >> 1);
                } else {
                    var19 = var3;
                    var20 = var3 + 1;
                }

                int[][] var21 = Class26.anIntArrayArrayArray191[var11];
                int var22 = var21[var18][var20] + var21[var17][var20] + var21[var18][var19] + var21[var17][var19] >> 2;
                int var23 = (var15 << 6) + (var2 << 7);
                int var24 = (var16 << 6) + (var3 << 7);
                int var25 = var2 + (var3 << 7) + (var4 << 14) + 1073741824;
                if (var14.anInt219 == 0) {
                    var25 -= Integer.MIN_VALUE;
                }

                int var26 = (var5 << 6) + var6;
                if (var14.anInt928 == 1) {
                    var26 += 256;
                }

                Object var27;
                if (var6 == 22) {
                    if (var14.anInt818 == -1 && var14.transformIds == null) {
                        var27 = var14.method1070(22, var5, var21, var23, var22, var24);
                    } else {
                        var27 = new DynamicObject(var4, 22, var5, var11, var2, var3, var14.anInt818, true, null);
                    }

                    var37.method704(var0, var2, var3, var22, (Entity) var27, var25, var26);
                    if (var14.anInt229 == 1) {
                        var13.method762(var2, var3);
                    }
                } else if (var6 != 10 && var6 != 11) {
                    if (var6 >= 12) {
                        if (var14.anInt818 == -1 && var14.transformIds == null) {
                            var27 = var14.method1070(var6, var5, var21, var23, var22, var24);
                        } else {
                            var27 = new DynamicObject(var4, var6, var5, var11, var2, var3, var14.anInt818, true, null);
                        }

                        var37.method708(var0, var2, var3, var22, 1, 1, (Entity) var27, 0, var25, var26);
                        if (var14.anInt229 != 0) {
                            var13.method761(var2, var3, var15, var16, var14.aBoolean223);
                        }
                    } else if (var6 == 0) {
                        if (var14.anInt818 == -1 && var14.transformIds == null) {
                            var27 = var14.method1070(0, var5, var21, var23, var22, var24);
                        } else {
                            var27 = new DynamicObject(var4, 0, var5, var11, var2, var3, var14.anInt818, true, null);
                        }

                        var37.method709(var0, var2, var3, var22, (Entity) var27, null, Class26.anIntArray192[var5], 0, var25, var26);
                        if (var14.anInt229 != 0) {
                            var13.method766(var2, var3, var6, var5, var14.aBoolean223);
                        }
                    } else if (var6 == 1) {
                        if (var14.anInt818 == -1 && var14.transformIds == null) {
                            var27 = var14.method1070(1, var5, var21, var23, var22, var24);
                        } else {
                            var27 = new DynamicObject(var4, 1, var5, var11, var2, var3, var14.anInt818, true, null);
                        }

                        var37.method709(var0, var2, var3, var22, (Entity) var27, null, Class26.anIntArray188[var5], 0, var25, var26);
                        if (var14.anInt229 != 0) {
                            var13.method766(var2, var3, var6, var5, var14.aBoolean223);
                        }
                    } else {
                        int var28;
                        Object var30;
                        if (var6 == 2) {
                            var28 = var5 + 1 & 3;
                            Object var29;
                            if (var14.anInt818 == -1 && var14.transformIds == null) {
                                var29 = var14.method1070(2, var5 + 4, var21, var23, var22, var24);
                                var30 = var14.method1070(2, var28, var21, var23, var22, var24);
                            } else {
                                var29 = new DynamicObject(var4, 2, var5 + 4, var11, var2, var3, var14.anInt818, true, null);
                                var30 = new DynamicObject(var4, 2, var28, var11, var2, var3, var14.anInt818, true, null);
                            }

                            var37.method709(var0, var2, var3, var22, (Entity) var29, (Entity) var30, Class26.anIntArray192[var5], Class26.anIntArray192[var28], var25, var26);
                            if (var14.anInt229 != 0) {
                                var13.method766(var2, var3, var6, var5, var14.aBoolean223);
                            }
                        } else if (var6 == 3) {
                            if (var14.anInt818 == -1 && var14.transformIds == null) {
                                var27 = var14.method1070(3, var5, var21, var23, var22, var24);
                            } else {
                                var27 = new DynamicObject(var4, 3, var5, var11, var2, var3, var14.anInt818, true, null);
                            }

                            var37.method709(var0, var2, var3, var22, (Entity) var27, null, Class26.anIntArray188[var5], 0, var25, var26);
                            if (var14.anInt229 != 0) {
                                var13.method766(var2, var3, var6, var5, var14.aBoolean223);
                            }
                        } else if (var6 == 9) {
                            if (var14.anInt818 == -1 && var14.transformIds == null) {
                                var27 = var14.method1070(var6, var5, var21, var23, var22, var24);
                            } else {
                                var27 = new DynamicObject(var4, var6, var5, var11, var2, var3, var14.anInt818, true, null);
                            }

                            var37.method708(var0, var2, var3, var22, 1, 1, (Entity) var27, 0, var25, var26);
                            if (var14.anInt229 != 0) {
                                var13.method761(var2, var3, var15, var16, var14.aBoolean223);
                            }
                        } else if (var6 == 4) {
                            if (var14.anInt818 == -1 && var14.transformIds == null) {
                                var27 = var14.method1070(4, var5, var21, var23, var22, var24);
                            } else {
                                var27 = new DynamicObject(var4, 4, var5, var11, var2, var3, var14.anInt818, true, null);
                            }

                            var37.method711(var0, var2, var3, var22, (Entity) var27, null, Class26.anIntArray192[var5], 0, 0, 0, var25, var26);
                        } else {
                            int var31;
                            if (var6 == 5) {
                                var28 = 16;
                                var31 = var37.method671(var0, var2, var3);
                                if (var31 != 0) {
                                    var28 = Class5.method17(var31 >> 14 & 32767).anInt233;
                                }

                                if (var14.anInt818 == -1 && var14.transformIds == null) {
                                    var30 = var14.method1070(4, var5, var21, var23, var22, var24);
                                } else {
                                    var30 = new DynamicObject(var4, 4, var5, var11, var2, var3, var14.anInt818, true, null);
                                }

                                var37.method711(var0, var2, var3, var22, (Entity) var30, null, Class26.anIntArray192[var5], 0, var28 * Class26.anIntArray187[var5], var28 * Class26.anIntArray184[var5], var25, var26);
                            } else if (var6 == 6) {
                                var28 = 8;
                                var31 = var37.method671(var0, var2, var3);
                                if (var31 != 0) {
                                    var28 = Class5.method17(var31 >> 14 & 32767).anInt233 / 2;
                                }

                                if (var14.anInt818 == -1 && var14.transformIds == null) {
                                    var30 = var14.method1070(4, var5 + 4, var21, var23, var22, var24);
                                } else {
                                    var30 = new DynamicObject(var4, 4, var5 + 4, var11, var2, var3, var14.anInt818, true, null);
                                }

                                var37.method711(var0, var2, var3, var22, (Entity) var30, null, 256, var5, var28 * Class26.anIntArray196[var5], var28 * Class26.anIntArray183[var5], var25, var26);
                            } else if (var6 == 7) {
                                var31 = var5 + 2 & 3;
                                if (var14.anInt818 == -1 && var14.transformIds == null) {
                                    var27 = var14.method1070(4, var31 + 4, var21, var23, var22, var24);
                                } else {
                                    var27 = new DynamicObject(var4, 4, var31 + 4, var11, var2, var3, var14.anInt818, true, null);
                                }

                                var37.method711(var0, var2, var3, var22, (Entity) var27, null, 256, var31, 0, 0, var25, var26);
                            } else if (var6 == 8) {
                                var28 = 8;
                                var31 = var37.method671(var0, var2, var3);
                                if (var31 != 0) {
                                    var28 = Class5.method17(var31 >> 14 & 32767).anInt233 / 2;
                                }

                                int var32 = var5 + 2 & 3;
                                Object var33;
                                if (var14.anInt818 == -1 && var14.transformIds == null) {
                                    var30 = var14.method1070(4, var5 + 4, var21, var23, var22, var24);
                                    var33 = var14.method1070(4, var32 + 4, var21, var23, var22, var24);
                                } else {
                                    var30 = new DynamicObject(var4, 4, var5 + 4, var11, var2, var3, var14.anInt818, true, null);
                                    var33 = new DynamicObject(var4, 4, var32 + 4, var11, var2, var3, var14.anInt818, true, null);
                                }

                                var37.method711(var0, var2, var3, var22, (Entity) var30, (Entity) var33, 256, var5, Class26.anIntArray196[var5] * var28, Class26.anIntArray183[var5] * var28, var25, var26);
                            }
                        }
                    }
                } else {
                    if (var14.anInt818 == -1 && var14.transformIds == null) {
                        var27 = var14.method1070(10, var5, var21, var23, var22, var24);
                    } else {
                        var27 = new DynamicObject(var4, 10, var5, var11, var2, var3, var14.anInt818, true, null);
                    }

                    if (var27 != null) {
                        var37.method708(var0, var2, var3, var22, var15, var16, (Entity) var27, var6 == 11 ? 256 : 0, var25, var26);
                    }

                    if (var14.anInt229 != 0) {
                        var13.method761(var2, var3, var15, var16, var14.aBoolean223);
                    }
                }
            }
        }

    }

    public static Class172[] method221() {
        return new Class172[]{Class172.aClass172_2126, Class172.aClass172_2129, Class172.aClass172_2128, Class172.aClass172_2127, Class172.aClass172_2130};
    }

    public final synchronized void mousePressed(MouseEvent var1) {
        if (aClass33_267 != null) {
            anInt263 = 0;
            anInt256 = var1.getX();
            anInt266 = var1.getY();
            aLong268 = GzipDecompresser.currentTime();
            if (var1.isAltDown()) {
                anInt258 = 4;
                anInt257 = 4;
            } else if (var1.isMetaDown()) {
                anInt258 = 2;
                anInt257 = 2;
            } else {
                anInt258 = 1;
                anInt257 = 1;
            }
        }

        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final synchronized void mouseReleased(MouseEvent var1) {
        if (aClass33_267 != null) {
            anInt263 = 0;
            anInt257 = 0;
        }

        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final synchronized void mouseExited(MouseEvent var1) {
        if (aClass33_267 != null) {
            anInt263 = 0;
            anInt269 = -1;
            anInt271 = -1;
        }

    }

    public final synchronized void focusLost(FocusEvent var1) {
        if (aClass33_267 != null) {
            anInt257 = 0;
        }

    }

    public final synchronized void mouseMoved(MouseEvent var1) {
        if (aClass33_267 != null) {
            anInt263 = 0;
            anInt269 = var1.getX();
            anInt271 = var1.getY();
        }

    }

    public final void focusGained(FocusEvent var1) {
    }

    public final void mouseClicked(MouseEvent var1) {
        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final synchronized void mouseEntered(MouseEvent var1) {
        if (aClass33_267 != null) {
            anInt263 = 0;
            anInt269 = var1.getX();
            anInt271 = var1.getY();
        }

    }

    public final synchronized void mouseDragged(MouseEvent var1) {
        if (aClass33_267 != null) {
            anInt263 = 0;
            anInt269 = var1.getX();
            anInt271 = var1.getY();
        }

    }
}
