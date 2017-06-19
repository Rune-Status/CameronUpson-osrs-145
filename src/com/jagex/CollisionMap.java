package com.jagex;

public class CollisionMap {
    public static int anInt1323;
    public int[][] flags;
    int insetY = 0;
    int insetX = 0;
    int width;
    int height;

    public CollisionMap(int var1, int var2) {
        width = var1;
        height = var2;
        flags = new int[width][height];
        method757();
    }

    static void method765(PathingEntity var0) {
        if (var0.anInt795 != 0) {
            if (var0.targetIndex != -1) {
                Object var1 = null;
                if (var0.targetIndex < 32768) {
                    var1 = Client.npcEntities[var0.targetIndex];
                } else if (var0.targetIndex >= 32768) {
                    var1 = Client.playerEntities[var0.targetIndex - '耀'];
                }

                if (var1 != null) {
                    int var2 = var0.strictX - ((PathingEntity) var1).strictX;
                    int var3 = var0.strictY - ((PathingEntity) var1).strictY;
                    if (var2 != 0 || var3 != 0) {
                        var0.orientation = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 2047;
                    }
                } else if (var0.aBoolean789) {
                    var0.targetIndex = -1;
                    var0.aBoolean789 = false;
                }
            }

            if (var0.anInt793 != -1 && (var0.queueSize == 0 || var0.anInt801 > 0)) {
                var0.orientation = var0.anInt793;
                var0.anInt793 = -1;
            }

            int var4 = var0.orientation - var0.anInt748 & 2047;
            if (var4 == 0 && var0.aBoolean789) {
                var0.targetIndex = -1;
                var0.aBoolean789 = false;
            }

            if (var4 != 0) {
                ++var0.anInt796;
                boolean var6;
                if (var4 > 1024) {
                    var0.anInt748 -= var0.anInt795;
                    var6 = true;
                    if (var4 < var0.anInt795 || var4 > 2048 - var0.anInt795) {
                        var0.anInt748 = var0.orientation;
                        var6 = false;
                    }

                    if (var0.anInt754 == var0.anInt768 && (var0.anInt796 > 25 || var6)) {
                        if (var0.anInt745 != -1) {
                            var0.anInt768 = var0.anInt745;
                        } else {
                            var0.anInt768 = var0.anInt760;
                        }
                    }
                } else {
                    var0.anInt748 += var0.anInt795;
                    var6 = true;
                    if (var4 < var0.anInt795 || var4 > 2048 - var0.anInt795) {
                        var0.anInt748 = var0.orientation;
                        var6 = false;
                    }

                    if (var0.anInt768 == var0.anInt754 && (var0.anInt796 > 25 || var6)) {
                        if (var0.anInt755 != -1) {
                            var0.anInt768 = var0.anInt755;
                        } else {
                            var0.anInt768 = var0.anInt760;
                        }
                    }
                }

                var0.anInt748 &= 2047;
            } else {
                var0.anInt796 = 0;
            }

        }
    }

    public void method757() {
        for (int var1 = 0; var1 < width; ++var1) {
            for (int var2 = 0; var2 < height; ++var2) {
                if (var1 != 0 && var2 != 0 && var1 < width - 5 && var2 < height - 5) {
                    flags[var1][var2] = 16777216;
                } else {
                    flags[var1][var2] = 16777215;
                }
            }
        }

    }

    public void flagBlocked(int x, int y) {
        x -= insetX;
        y -= insetY;
        flags[x][y] |= 2097152;
    }

    public void flagSolidEntity(int var1, int var2, int var3, int var4, boolean var5) {
        int var6 = 256;
        if (var5) {
            var6 += 131072;
        }

        var1 -= insetX;
        var2 -= insetY;

        for (int var7 = var1; var7 < var3 + var1; ++var7) {
            if (var7 >= 0 && var7 < width) {
                for (int var8 = var2; var8 < var2 + var4; ++var8) {
                    if (var8 >= 0 && var8 < height) {
                        addFlag(var7, var8, var6);
                    }
                }
            }
        }

    }

    public void method762(int var1, int var2) {
        var1 -= insetX;
        var2 -= insetY;
        flags[var1][var2] |= 262144;
    }

    void addFlag(int i, int ii, int iii) {
        flags[i][ii] |= iii;
    }

    public void method759(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        int var7 = 256;
        if (var6) {
            var7 += 131072;
        }

        var1 -= insetX;
        var2 -= insetY;
        int var8;
        if (var5 == 1 || var5 == 3) {
            var8 = var3;
            var3 = var4;
            var4 = var8;
        }

        for (var8 = var1; var8 < var3 + var1; ++var8) {
            if (var8 >= 0 && var8 < width) {
                for (int var9 = var2; var9 < var4 + var2; ++var9) {
                    if (var9 >= 0 && var9 < height) {
                        removeFlag(var8, var9, var7);
                    }
                }
            }
        }

    }

    void removeFlag(int i, int ii, int iii) {
        flags[i][ii] &= ~iii;
    }

    public void markBlocked(int x, int y) {
        x -= insetX;
        y -= insetY;
        flags[x][y] &= -262145;
    }

    public void flagWall(int x, int y, int var3, int type, boolean var5) {
        x -= insetX;
        y -= insetY;
        if (var3 == 0) {
            if (type == 0) {
                addFlag(x, y, 128);
                addFlag(x - 1, y, 8);
            }

            if (type == 1) {
                addFlag(x, y, 2);
                addFlag(x, y + 1, 32);
            }

            if (type == 2) {
                addFlag(x, y, 8);
                addFlag(x + 1, y, 128);
            }

            if (type == 3) {
                addFlag(x, y, 32);
                addFlag(x, y - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (type == 0) {
                addFlag(x, y, 1);
                addFlag(x - 1, y + 1, 16);
            }

            if (type == 1) {
                addFlag(x, y, 4);
                addFlag(x + 1, y + 1, 64);
            }

            if (type == 2) {
                addFlag(x, y, 16);
                addFlag(x + 1, y - 1, 1);
            }

            if (type == 3) {
                addFlag(x, y, 64);
                addFlag(x - 1, y - 1, 4);
            }
        }

        if (var3 == 2) {
            if (type == 0) {
                addFlag(x, y, 130);
                addFlag(x - 1, y, 8);
                addFlag(x, y + 1, 32);
            }

            if (type == 1) {
                addFlag(x, y, 10);
                addFlag(x, y + 1, 32);
                addFlag(x + 1, y, 128);
            }

            if (type == 2) {
                addFlag(x, y, 40);
                addFlag(x + 1, y, 128);
                addFlag(x, y - 1, 2);
            }

            if (type == 3) {
                addFlag(x, y, 160);
                addFlag(x, y - 1, 2);
                addFlag(x - 1, y, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (type == 0) {
                    addFlag(x, y, 65536);
                    addFlag(x - 1, y, 4096);
                }

                if (type == 1) {
                    addFlag(x, y, 1024);
                    addFlag(x, y + 1, 16384);
                }

                if (type == 2) {
                    addFlag(x, y, 4096);
                    addFlag(x + 1, y, 65536);
                }

                if (type == 3) {
                    addFlag(x, y, 16384);
                    addFlag(x, y - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (type == 0) {
                    addFlag(x, y, 512);
                    addFlag(x - 1, y + 1, 8192);
                }

                if (type == 1) {
                    addFlag(x, y, 2048);
                    addFlag(x + 1, y + 1, 32768);
                }

                if (type == 2) {
                    addFlag(x, y, 8192);
                    addFlag(x + 1, y - 1, 512);
                }

                if (type == 3) {
                    addFlag(x, y, 32768);
                    addFlag(x - 1, y - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (type == 0) {
                    addFlag(x, y, 66560);
                    addFlag(x - 1, y, 4096);
                    addFlag(x, y + 1, 16384);
                }

                if (type == 1) {
                    addFlag(x, y, 5120);
                    addFlag(x, y + 1, 16384);
                    addFlag(x + 1, y, 65536);
                }

                if (type == 2) {
                    addFlag(x, y, 20480);
                    addFlag(x + 1, y, 65536);
                    addFlag(x, y - 1, 1024);
                }

                if (type == 3) {
                    addFlag(x, y, 81920);
                    addFlag(x, y - 1, 1024);
                    addFlag(x - 1, y, 4096);
                }
            }
        }

    }

    public void unflagWall(int x, int y, int var3, int type, boolean var5) {
        x -= insetX;
        y -= insetY;
        if (var3 == 0) {
            if (type == 0) {
                removeFlag(x, y, 128);
                removeFlag(x - 1, y, 8);
            }

            if (type == 1) {
                removeFlag(x, y, 2);
                removeFlag(x, y + 1, 32);
            }

            if (type == 2) {
                removeFlag(x, y, 8);
                removeFlag(x + 1, y, 128);
            }

            if (type == 3) {
                removeFlag(x, y, 32);
                removeFlag(x, y - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (type == 0) {
                removeFlag(x, y, 1);
                removeFlag(x - 1, y + 1, 16);
            }

            if (type == 1) {
                removeFlag(x, y, 4);
                removeFlag(x + 1, y + 1, 64);
            }

            if (type == 2) {
                removeFlag(x, y, 16);
                removeFlag(x + 1, y - 1, 1);
            }

            if (type == 3) {
                removeFlag(x, y, 64);
                removeFlag(x - 1, y - 1, 4);
            }
        }

        if (var3 == 2) {
            if (type == 0) {
                removeFlag(x, y, 130);
                removeFlag(x - 1, y, 8);
                removeFlag(x, y + 1, 32);
            }

            if (type == 1) {
                removeFlag(x, y, 10);
                removeFlag(x, y + 1, 32);
                removeFlag(x + 1, y, 128);
            }

            if (type == 2) {
                removeFlag(x, y, 40);
                removeFlag(x + 1, y, 128);
                removeFlag(x, y - 1, 2);
            }

            if (type == 3) {
                removeFlag(x, y, 160);
                removeFlag(x, y - 1, 2);
                removeFlag(x - 1, y, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (type == 0) {
                    removeFlag(x, y, 65536);
                    removeFlag(x - 1, y, 4096);
                }

                if (type == 1) {
                    removeFlag(x, y, 1024);
                    removeFlag(x, y + 1, 16384);
                }

                if (type == 2) {
                    removeFlag(x, y, 4096);
                    removeFlag(x + 1, y, 65536);
                }

                if (type == 3) {
                    removeFlag(x, y, 16384);
                    removeFlag(x, y - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (type == 0) {
                    removeFlag(x, y, 512);
                    removeFlag(x - 1, y + 1, 8192);
                }

                if (type == 1) {
                    removeFlag(x, y, 2048);
                    removeFlag(x + 1, y + 1, 32768);
                }

                if (type == 2) {
                    removeFlag(x, y, 8192);
                    removeFlag(x + 1, y - 1, 512);
                }

                if (type == 3) {
                    removeFlag(x, y, 32768);
                    removeFlag(x - 1, y - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (type == 0) {
                    removeFlag(x, y, 66560);
                    removeFlag(x - 1, y, 4096);
                    removeFlag(x, y + 1, 16384);
                }

                if (type == 1) {
                    removeFlag(x, y, 5120);
                    removeFlag(x, y + 1, 16384);
                    removeFlag(x + 1, y, 65536);
                }

                if (type == 2) {
                    removeFlag(x, y, 20480);
                    removeFlag(x + 1, y, 65536);
                    removeFlag(x, y - 1, 1024);
                }

                if (type == 3) {
                    removeFlag(x, y, 81920);
                    removeFlag(x, y - 1, 1024);
                    removeFlag(x - 1, y, 4096);
                }
            }
        }

    }
}
