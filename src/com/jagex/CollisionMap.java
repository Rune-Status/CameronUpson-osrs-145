package com.jagex;

public class CollisionMap {
    public static int anInt1323;
    public int[][] flags;
    int insetY = 0;
    int insetX = 0;
    int width;
    int height;

    public CollisionMap(int var1, int var2) {
        this.width = var1;
        this.height = var2;
        this.flags = new int[this.width][this.height];
        this.method757();
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
        for (int var1 = 0; var1 < this.width; ++var1) {
            for (int var2 = 0; var2 < this.height; ++var2) {
                if (var1 != 0 && var2 != 0 && var1 < this.width - 5 && var2 < this.height - 5) {
                    this.flags[var1][var2] = 16777216;
                } else {
                    this.flags[var1][var2] = 16777215;
                }
            }
        }

    }

    public void flagBlocked(int x, int y) {
        x -= this.insetX;
        y -= this.insetY;
        this.flags[x][y] |= 2097152;
    }

    public void flagSolidEntity(int var1, int var2, int var3, int var4, boolean var5) {
        int var6 = 256;
        if (var5) {
            var6 += 131072;
        }

        var1 -= this.insetX;
        var2 -= this.insetY;

        for (int var7 = var1; var7 < var3 + var1; ++var7) {
            if (var7 >= 0 && var7 < this.width) {
                for (int var8 = var2; var8 < var2 + var4; ++var8) {
                    if (var8 >= 0 && var8 < this.height) {
                        this.addFlag(var7, var8, var6);
                    }
                }
            }
        }

    }

    public void method762(int var1, int var2) {
        var1 -= this.insetX;
        var2 -= this.insetY;
        this.flags[var1][var2] |= 262144;
    }

    void addFlag(int i, int ii, int iii) {
        this.flags[i][ii] |= iii;
    }

    public void method759(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        int var7 = 256;
        if (var6) {
            var7 += 131072;
        }

        var1 -= this.insetX;
        var2 -= this.insetY;
        int var8;
        if (var5 == 1 || var5 == 3) {
            var8 = var3;
            var3 = var4;
            var4 = var8;
        }

        for (var8 = var1; var8 < var3 + var1; ++var8) {
            if (var8 >= 0 && var8 < this.width) {
                for (int var9 = var2; var9 < var4 + var2; ++var9) {
                    if (var9 >= 0 && var9 < this.height) {
                        this.removeFlag(var8, var9, var7);
                    }
                }
            }
        }

    }

    void removeFlag(int i, int ii, int iii) {
        this.flags[i][ii] &= ~iii;
    }

    public void markBlocked(int x, int y) {
        x -= this.insetX;
        y -= this.insetY;
        this.flags[x][y] &= -262145;
    }

    public void flagWall(int x, int y, int var3, int type, boolean var5) {
        x -= this.insetX;
        y -= this.insetY;
        if (var3 == 0) {
            if (type == 0) {
                this.addFlag(x, y, 128);
                this.addFlag(x - 1, y, 8);
            }

            if (type == 1) {
                this.addFlag(x, y, 2);
                this.addFlag(x, y + 1, 32);
            }

            if (type == 2) {
                this.addFlag(x, y, 8);
                this.addFlag(x + 1, y, 128);
            }

            if (type == 3) {
                this.addFlag(x, y, 32);
                this.addFlag(x, y - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (type == 0) {
                this.addFlag(x, y, 1);
                this.addFlag(x - 1, y + 1, 16);
            }

            if (type == 1) {
                this.addFlag(x, y, 4);
                this.addFlag(x + 1, y + 1, 64);
            }

            if (type == 2) {
                this.addFlag(x, y, 16);
                this.addFlag(x + 1, y - 1, 1);
            }

            if (type == 3) {
                this.addFlag(x, y, 64);
                this.addFlag(x - 1, y - 1, 4);
            }
        }

        if (var3 == 2) {
            if (type == 0) {
                this.addFlag(x, y, 130);
                this.addFlag(x - 1, y, 8);
                this.addFlag(x, y + 1, 32);
            }

            if (type == 1) {
                this.addFlag(x, y, 10);
                this.addFlag(x, y + 1, 32);
                this.addFlag(x + 1, y, 128);
            }

            if (type == 2) {
                this.addFlag(x, y, 40);
                this.addFlag(x + 1, y, 128);
                this.addFlag(x, y - 1, 2);
            }

            if (type == 3) {
                this.addFlag(x, y, 160);
                this.addFlag(x, y - 1, 2);
                this.addFlag(x - 1, y, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (type == 0) {
                    this.addFlag(x, y, 65536);
                    this.addFlag(x - 1, y, 4096);
                }

                if (type == 1) {
                    this.addFlag(x, y, 1024);
                    this.addFlag(x, y + 1, 16384);
                }

                if (type == 2) {
                    this.addFlag(x, y, 4096);
                    this.addFlag(x + 1, y, 65536);
                }

                if (type == 3) {
                    this.addFlag(x, y, 16384);
                    this.addFlag(x, y - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (type == 0) {
                    this.addFlag(x, y, 512);
                    this.addFlag(x - 1, y + 1, 8192);
                }

                if (type == 1) {
                    this.addFlag(x, y, 2048);
                    this.addFlag(x + 1, y + 1, 32768);
                }

                if (type == 2) {
                    this.addFlag(x, y, 8192);
                    this.addFlag(x + 1, y - 1, 512);
                }

                if (type == 3) {
                    this.addFlag(x, y, 32768);
                    this.addFlag(x - 1, y - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (type == 0) {
                    this.addFlag(x, y, 66560);
                    this.addFlag(x - 1, y, 4096);
                    this.addFlag(x, y + 1, 16384);
                }

                if (type == 1) {
                    this.addFlag(x, y, 5120);
                    this.addFlag(x, y + 1, 16384);
                    this.addFlag(x + 1, y, 65536);
                }

                if (type == 2) {
                    this.addFlag(x, y, 20480);
                    this.addFlag(x + 1, y, 65536);
                    this.addFlag(x, y - 1, 1024);
                }

                if (type == 3) {
                    this.addFlag(x, y, 81920);
                    this.addFlag(x, y - 1, 1024);
                    this.addFlag(x - 1, y, 4096);
                }
            }
        }

    }

    public void unflagWall(int x, int y, int var3, int type, boolean var5) {
        x -= this.insetX;
        y -= this.insetY;
        if (var3 == 0) {
            if (type == 0) {
                this.removeFlag(x, y, 128);
                this.removeFlag(x - 1, y, 8);
            }

            if (type == 1) {
                this.removeFlag(x, y, 2);
                this.removeFlag(x, y + 1, 32);
            }

            if (type == 2) {
                this.removeFlag(x, y, 8);
                this.removeFlag(x + 1, y, 128);
            }

            if (type == 3) {
                this.removeFlag(x, y, 32);
                this.removeFlag(x, y - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (type == 0) {
                this.removeFlag(x, y, 1);
                this.removeFlag(x - 1, y + 1, 16);
            }

            if (type == 1) {
                this.removeFlag(x, y, 4);
                this.removeFlag(x + 1, y + 1, 64);
            }

            if (type == 2) {
                this.removeFlag(x, y, 16);
                this.removeFlag(x + 1, y - 1, 1);
            }

            if (type == 3) {
                this.removeFlag(x, y, 64);
                this.removeFlag(x - 1, y - 1, 4);
            }
        }

        if (var3 == 2) {
            if (type == 0) {
                this.removeFlag(x, y, 130);
                this.removeFlag(x - 1, y, 8);
                this.removeFlag(x, y + 1, 32);
            }

            if (type == 1) {
                this.removeFlag(x, y, 10);
                this.removeFlag(x, y + 1, 32);
                this.removeFlag(x + 1, y, 128);
            }

            if (type == 2) {
                this.removeFlag(x, y, 40);
                this.removeFlag(x + 1, y, 128);
                this.removeFlag(x, y - 1, 2);
            }

            if (type == 3) {
                this.removeFlag(x, y, 160);
                this.removeFlag(x, y - 1, 2);
                this.removeFlag(x - 1, y, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (type == 0) {
                    this.removeFlag(x, y, 65536);
                    this.removeFlag(x - 1, y, 4096);
                }

                if (type == 1) {
                    this.removeFlag(x, y, 1024);
                    this.removeFlag(x, y + 1, 16384);
                }

                if (type == 2) {
                    this.removeFlag(x, y, 4096);
                    this.removeFlag(x + 1, y, 65536);
                }

                if (type == 3) {
                    this.removeFlag(x, y, 16384);
                    this.removeFlag(x, y - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (type == 0) {
                    this.removeFlag(x, y, 512);
                    this.removeFlag(x - 1, y + 1, 8192);
                }

                if (type == 1) {
                    this.removeFlag(x, y, 2048);
                    this.removeFlag(x + 1, y + 1, 32768);
                }

                if (type == 2) {
                    this.removeFlag(x, y, 8192);
                    this.removeFlag(x + 1, y - 1, 512);
                }

                if (type == 3) {
                    this.removeFlag(x, y, 32768);
                    this.removeFlag(x - 1, y - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (type == 0) {
                    this.removeFlag(x, y, 66560);
                    this.removeFlag(x - 1, y, 4096);
                    this.removeFlag(x, y + 1, 16384);
                }

                if (type == 1) {
                    this.removeFlag(x, y, 5120);
                    this.removeFlag(x, y + 1, 16384);
                    this.removeFlag(x + 1, y, 65536);
                }

                if (type == 2) {
                    this.removeFlag(x, y, 20480);
                    this.removeFlag(x + 1, y, 65536);
                    this.removeFlag(x, y - 1, 1024);
                }

                if (type == 3) {
                    this.removeFlag(x, y, 81920);
                    this.removeFlag(x, y - 1, 1024);
                    this.removeFlag(x - 1, y, 4096);
                }
            }
        }

    }
}
