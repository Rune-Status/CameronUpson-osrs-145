package com.jagex;

public class Class147 implements Class157 {
    public static final Class147 aClass147_1812 = new Class147("", 10);
    public static final Class147 aClass147_1809 = new Class147("", 11);
    public static final Class147 aClass147_1804 = new Class147("", 12);
    public static final Class147 aClass147_1813 = new Class147("", 13);
    public static final Class147 aClass147_1814 = new Class147("", 14);
    public static final Class147 aClass147_1807;
    public static final Class147 aClass147_1815;
    public static final Class147 aClass147_1803;
    public static final Class147 aClass147_1806;
    static final Class147 aClass147_1805;
    static CacheReferenceTable aCacheReferenceTable1810;
    static String aString1808;

    static {
        aClass147_1815 = new Class147("", 15, new Key[]{Key.aClass58_521, Key.aClass58_521}, null);
        aClass147_1807 = new Class147("", 16, new Key[]{Key.aClass58_521, Key.aClass58_521}, null);
        aClass147_1806 = new Class147("", 17, new Key[]{Key.aClass58_521, Key.aClass58_521}, null);
        aClass147_1805 = new Class147("", 73, true, true);
        aClass147_1803 = new Class147("", 76, true, false);
    }

    public final int anInt1811;

    Class147(String var1, int var2, Key[] var3, Key[] var4) {
        this(var1, var2, var3 != null, var3, null != var4, var4);
    }

    Class147(String var1, int var2, boolean var3, Key[] var4, boolean var5, Key[] var6) {
        this.anInt1811 = var2;
    }

    Class147(String var1, int var2, boolean var3, boolean var4) {
        this(var1, var2, var3, null, var4, null);
    }

    Class147(String var1, int var2) {
        this(var1, var2, false, null, false, null);
    }

    static void method999() {
        int var0 = Class5.anInt37 * 128 + 64;
        int var1 = Class51.anInt381 * 128 + 64;
        int var2 = Class25.method175(var0, var1, Player.floorLevel) - Class23.anInt156;
        if (Class53.cameraX < var0) {
            Class53.cameraX += (var0 - Class53.cameraX) * TileDecor.anInt1035 / 1000 + GrandExchangeOffer.anInt736;
            if (Class53.cameraX > var0) {
                Class53.cameraX = var0;
            }
        }

        if (Class53.cameraX > var0) {
            Class53.cameraX -= (Class53.cameraX - var0) * TileDecor.anInt1035 / 1000 + GrandExchangeOffer.anInt736;
            if (Class53.cameraX < var0) {
                Class53.cameraX = var0;
            }
        }

        if (Class85.cameraZ < var2) {
            Class85.cameraZ += GrandExchangeOffer.anInt736 + (var2 - Class85.cameraZ) * TileDecor.anInt1035 / 1000;
            if (Class85.cameraZ > var2) {
                Class85.cameraZ = var2;
            }
        }

        if (Class85.cameraZ > var2) {
            Class85.cameraZ -= (Class85.cameraZ - var2) * TileDecor.anInt1035 / 1000 + GrandExchangeOffer.anInt736;
            if (Class85.cameraZ < var2) {
                Class85.cameraZ = var2;
            }
        }

        if (Class34.cameraY < var1) {
            Class34.cameraY += GrandExchangeOffer.anInt736 + TileDecor.anInt1035 * (var1 - Class34.cameraY) / 1000;
            if (Class34.cameraY > var1) {
                Class34.cameraY = var1;
            }
        }

        if (Class34.cameraY > var1) {
            Class34.cameraY -= GrandExchangeOffer.anInt736 + TileDecor.anInt1035 * (Class34.cameraY - var1) / 1000;
            if (Class34.cameraY < var1) {
                Class34.cameraY = var1;
            }
        }

        var0 = PickableNode.anInt671 * 128 + 64;
        var1 = Class70.anInt714 * 128 + 64;
        var2 = Class25.method175(var0, var1, Player.floorLevel) - RuntimeException_Sub1.anInt1284;
        int var3 = var0 - Class53.cameraX;
        int var4 = var2 - Class85.cameraZ;
        int var5 = var1 - Class34.cameraY;
        int var6 = (int) Math.sqrt((double) (var5 * var5 + var3 * var3));
        int var7 = (int) (Math.atan2((double) var4, (double) var6) * 325.949D) & 2047;
        int var8 = (int) (Math.atan2((double) var3, (double) var5) * -325.949D) & 2047;
        if (var7 < 128) {
            var7 = 128;
        }

        if (var7 > 383) {
            var7 = 383;
        }

        if (Class133.cameraPitch < var7) {
            Class133.cameraPitch += (var7 - Class133.cameraPitch) * Class77.anInt832 / 1000 + Node_Sub21_Sub1.anInt210;
            if (Class133.cameraPitch > var7) {
                Class133.cameraPitch = var7;
            }
        }

        if (Class133.cameraPitch > var7) {
            Class133.cameraPitch -= Node_Sub21_Sub1.anInt210 + Class77.anInt832 * (Class133.cameraPitch - var7) / 1000;
            if (Class133.cameraPitch < var7) {
                Class133.cameraPitch = var7;
            }
        }

        int var9 = var8 - Class43.cameraYaw;
        if (var9 > 1024) {
            var9 -= 2048;
        }

        if (var9 < -1024) {
            var9 += 2048;
        }

        if (var9 > 0) {
            Class43.cameraYaw += Class77.anInt832 * var9 / 1000 + Node_Sub21_Sub1.anInt210;
            Class43.cameraYaw &= 2047;
        }

        if (var9 < 0) {
            Class43.cameraYaw -= -var9 * Class77.anInt832 / 1000 + Node_Sub21_Sub1.anInt210;
            Class43.cameraYaw &= 2047;
        }

        int var10 = var8 - Class43.cameraYaw;
        if (var10 > 1024) {
            var10 -= 2048;
        }

        if (var10 < -1024) {
            var10 += 2048;
        }

        if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
            Class43.cameraYaw = var8;
        }

    }

    @Override
    public int ordinal() {
        return this.anInt1811;
    }
}
