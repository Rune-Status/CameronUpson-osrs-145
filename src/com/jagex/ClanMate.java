package com.jagex;

public class ClanMate extends Node {
    static int[] anIntArray240;
    String name;
    int world;
    byte rank;
    String aString227;

    static void method206(PathingEntity var0) {
        var0.anInt768 = var0.anInt754;
        if (var0.queueSize == 0) {
            var0.anInt801 = 0;
        } else {
            if (var0.animation != -1 && var0.anInt791 == 0) {
                AnimationSequence var1 = Applet_Sub1.method251(var0.animation);
                if (var0.anInt799 > 0 && var1.animatingPrecedence == 0) {
                    ++var0.anInt801;
                    return;
                }

                if (var0.anInt799 <= 0 && var1.walkingPrecedence == 0) {
                    ++var0.anInt801;
                    return;
                }
            }

            int var2 = var0.strictX;
            int var3 = var0.strictY;
            int var4 = var0.anInt753 * 64 + var0.anIntArray800[var0.queueSize - 1] * 128;
            int var5 = var0.anIntArray804[var0.queueSize - 1] * 128 + var0.anInt753 * 64;
            if (var2 < var4) {
                if (var3 < var5) {
                    var0.orientation = 1280;
                } else if (var3 > var5) {
                    var0.orientation = 1792;
                } else {
                    var0.orientation = 1536;
                }
            } else if (var2 > var4) {
                if (var3 < var5) {
                    var0.orientation = 768;
                } else if (var3 > var5) {
                    var0.orientation = 256;
                } else {
                    var0.orientation = 512;
                }
            } else if (var3 < var5) {
                var0.orientation = 1024;
            } else if (var3 > var5) {
                var0.orientation = 0;
            }

            byte var6 = var0.aByteArray798[var0.queueSize - 1];
            if (var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                int var7 = var0.orientation - var0.anInt748 & 2047;
                if (var7 > 1024) {
                    var7 -= 2048;
                }

                int var8 = var0.anInt757;
                if (var7 >= -256 && var7 <= 256) {
                    var8 = var0.anInt760;
                } else if (var7 >= 256 && var7 < 768) {
                    var8 = var0.anInt744;
                } else if (var7 >= -768 && var7 <= -256) {
                    var8 = var0.anInt746;
                }

                if (var8 == -1) {
                    var8 = var0.anInt760;
                }

                var0.anInt768 = var8;
                int var9 = 4;
                boolean var10 = true;
                if (var0 instanceof Npc) {
                    var10 = ((Npc) var0).definition.aBoolean2016;
                }

                if (var10) {
                    if (var0.anInt748 != var0.orientation && var0.targetIndex == -1 && var0.anInt795 != 0) {
                        var9 = 2;
                    }

                    if (var0.queueSize > 2) {
                        var9 = 6;
                    }

                    if (var0.queueSize > 3) {
                        var9 = 8;
                    }

                    if (var0.anInt801 > 0 && var0.queueSize > 1) {
                        var9 = 8;
                        --var0.anInt801;
                    }
                } else {
                    if (var0.queueSize > 1) {
                        var9 = 6;
                    }

                    if (var0.queueSize > 2) {
                        var9 = 8;
                    }

                    if (var0.anInt801 > 0 && var0.queueSize > 1) {
                        var9 = 8;
                        --var0.anInt801;
                    }
                }

                if (var6 == 2) {
                    var9 <<= 1;
                }

                if (var9 >= 8 && var0.anInt768 == var0.anInt760 && var0.anInt766 != -1) {
                    var0.anInt768 = var0.anInt766;
                }

                if (var4 != var2 || var3 != var5) {
                    if (var2 < var4) {
                        var0.strictX += var9;
                        if (var0.strictX > var4) {
                            var0.strictX = var4;
                        }
                    } else if (var2 > var4) {
                        var0.strictX -= var9;
                        if (var0.strictX < var4) {
                            var0.strictX = var4;
                        }
                    }

                    if (var3 < var5) {
                        var0.strictY += var9;
                        if (var0.strictY > var5) {
                            var0.strictY = var5;
                        }
                    } else if (var3 > var5) {
                        var0.strictY -= var9;
                        if (var0.strictY < var5) {
                            var0.strictY = var5;
                        }
                    }
                }

                if (var4 == var0.strictX && var5 == var0.strictY) {
                    --var0.queueSize;
                    if (var0.anInt799 > 0) {
                        --var0.anInt799;
                    }
                }

            } else {
                var0.strictX = var4;
                var0.strictY = var5;
                --var0.queueSize;
                if (var0.anInt799 > 0) {
                    --var0.anInt799;
                }

            }
        }
    }

    static void method207(InterfaceComponent[] var0, int var1, int var2, int var3, boolean var4) {
        for (int var5 = 0; var5 < var0.length; ++var5) {
            InterfaceComponent var6 = var0[var5];
            if (var6 != null && var1 == var6.parentUid) {
                Node_Sub21_Sub7.method1053(var6, var2, var3, var4);
                RuntimeException_Sub1.method743(var6, var2, var3);
                if (var6.insetX > var6.viewportWidth - var6.width) {
                    var6.insetX = var6.viewportWidth - var6.width;
                }

                if (var6.insetX < 0) {
                    var6.insetX = 0;
                }

                if (var6.insetY > var6.viewportHeight - var6.height) {
                    var6.insetY = var6.viewportHeight - var6.height;
                }

                if (var6.insetY < 0) {
                    var6.insetY = 0;
                }

                if (var6.type == 0) {
                    Class44.method303(var0, var6, var4);
                }
            }
        }

    }

    static Sprite method208() {
        Sprite var0 = new Sprite();
        var0.anInt328 = Class160.anInt1857;
        var0.anInt221 = Class191.anInt2246;
        var0.anInt232 = Class191.anIntArray2245[0];
        var0.anInt327 = Class191.anIntArray2248[0];
        var0.width = Class191.anIntArray2249[0];
        var0.height = Class109.anIntArray1305[0];
        int var1 = var0.width * var0.height;
        byte[] var2 = Class191.aByteArrayArray2247[0];
        var0.pixels = new int[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            var0.pixels[var3] = Class94.anIntArray1043[var2[var3] & 255];
        }

        Class191.anIntArray2245 = null;
        Class191.anIntArray2248 = null;
        Class191.anIntArray2249 = null;
        Class109.anIntArray1305 = null;
        Class94.anIntArray1043 = null;
        Class191.aByteArrayArray2247 = null;
        return var0;
    }
}
