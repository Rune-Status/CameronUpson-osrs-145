package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;

public final class Player extends PathingEntity {
    static Class84 aClass84_231;
    static int floorLevel;
    PlayerAppearance appearance;
    int prayerIcon = -1;
    int skullIcon = -1;
    String[] aStringArray238 = new String[3];
    int anInt221;
    int totalLevel;
    int anInt235;
    int anInt214;
    String name;
    int anInt228;
    int anInt225;
    int anInt212;
    Model aModel218;
    boolean aBoolean237;
    int anInt230;
    int anInt217;
    int anInt229;
    int anInt219;
    int anInt226;
    boolean aBoolean215;
    int combatLevel;
    int anInt222;
    boolean aBoolean223;
    int anInt233;
    int anInt234;
    int anInt213;

    Player() {
        for (int var1 = 0; var1 < 3; ++var1) {
            this.aStringArray238[var1] = "";
        }

        this.anInt221 = 0;
        this.totalLevel = 0;
        this.anInt214 = 0;
        this.anInt226 = 0;
        this.aBoolean223 = false;
        this.anInt219 = 0;
        this.aBoolean215 = false;
        this.aBoolean237 = false;
    }

    static void method193(int var0, int var1, int var2, int var3, boolean var4) {
        if (var2 < 1) {
            var2 = 1;
        }

        if (var3 < 1) {
            var3 = 1;
        }

        int var5 = var3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }

        int var6 = var5 * (Client.aShort1439 - Client.aShort1434) / 100 + Client.aShort1434;
        int var7 = var6 * var3 * 512 / (var2 * 334);
        int var8;
        int var9;
        short var15;
        if (var7 < Client.aShort1446) {
            var15 = Client.aShort1446;
            var6 = var15 * var2 * 334 / (var3 * 512);
            if (var6 > Client.aShort1454) {
                var6 = Client.aShort1454;
                var8 = var6 * var3 * 512 / (var15 * 334);
                var9 = (var2 - var8) / 2;
                if (var4) {
                    Node_Sub21_Sub26.method1206();
                    Node_Sub21_Sub26.method1223(var0, var1, var9, var3, -16777216);
                    Node_Sub21_Sub26.method1223(var0 + var2 - var9, var1, var9, var3, -16777216);
                }

                var0 += var9;
                var2 -= var9 * 2;
            }
        } else if (var7 > Client.aShort1456) {
            var15 = Client.aShort1456;
            var6 = var15 * var2 * 334 / (var3 * 512);
            if (var6 < Client.aShort1445) {
                var6 = Client.aShort1445;
                var8 = var2 * var15 * 334 / (var6 * 512);
                var9 = (var3 - var8) / 2;
                if (var4) {
                    Node_Sub21_Sub26.method1206();
                    Node_Sub21_Sub26.method1223(var0, var1, var2, var9, -16777216);
                    Node_Sub21_Sub26.method1223(var0, var3 + var1 - var9, var2, var9, -16777216);
                }

                var1 += var9;
                var3 -= var9 * 2;
            }
        }

        var8 = Client.aShort1435 + var5 * (Client.aShort1452 - Client.aShort1435) / 100;
        Client.viewportScale = var8 * var3 * var6 / 85504 << 1;
        if (Client.viewportWidth != var2 || Client.viewportHeight != var3) {
            int[] var10 = new int[9];

            for (int var11 = 0; var11 < 9; ++var11) {
                int var12 = var11 * 32 + 128 + 15;
                int var13 = var12 * 3 + 600;
                int var14 = Node_Sub21_Sub26_Sub1.SINE[var12];
                var10[var11] = var13 * var14 >> 16;
            }

            SceneGraph.method667(var10, 500, 800, var2, var3);
        }

        Client.anInt1437 = var0;
        Client.anInt1432 = var1;
        Client.viewportWidth = var2;
        Client.viewportHeight = var3;
    }

    static int method190(InterfaceComponent var0, int var1) {
        if (var0.functionOpcodes != null && var1 < var0.functionOpcodes.length) {
            try {
                int[] var2 = var0.functionOpcodes[var1];
                int var3 = 0;
                int var4 = 0;
                byte var5 = 0;

                while (true) {
                    int var6 = var2[var4++];
                    int var7 = 0;
                    byte var8 = 0;
                    if (var6 == 0) {
                        return var3;
                    }

                    if (var6 == 1) {
                        var7 = Client.currentLevels[var2[var4++]];
                    }

                    if (var6 == 2) {
                        var7 = Client.levels[var2[var4++]];
                    }

                    if (var6 == 3) {
                        var7 = Client.experiences[var2[var4++]];
                    }

                    int var9;
                    InterfaceComponent var10;
                    int var11;
                    int var12;
                    if (var6 == 4) {
                        var9 = var2[var4++] << 16;
                        var9 += var2[var4++];
                        var10 = InterfaceComponent.method1016(var9);
                        var11 = var2[var4++];
                        if (var11 != -1 && (!Class149.method1001(var11).aBoolean1731 || Client.membersWorld)) {
                            for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
                                if (var10.itemIds[var12] == var11 + 1) {
                                    var7 += var10.itemStackSizes[var12];
                                }
                            }
                        }
                    }

                    if (var6 == 5) {
                        var7 = Varps.values[var2[var4++]];
                    }

                    if (var6 == 6) {
                        var7 = Class154.anIntArray1834[Client.levels[var2[var4++]] - 1];
                    }

                    if (var6 == 7) {
                        var7 = Varps.values[var2[var4++]] * 100 / '뜛';
                    }

                    if (var6 == 8) {
                        var7 = Client.player.anInt221;
                    }

                    if (var6 == 9) {
                        for (var9 = 0; var9 < 25; ++var9) {
                            if (Class154.aBooleanArray1836[var9]) {
                                var7 += Client.levels[var9];
                            }
                        }
                    }

                    if (var6 == 10) {
                        var9 = var2[var4++] << 16;
                        var9 += var2[var4++];
                        var10 = InterfaceComponent.method1016(var9);
                        var11 = var2[var4++];
                        if (var11 != -1 && (!Class149.method1001(var11).aBoolean1731 || Client.membersWorld)) {
                            for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
                                if (var11 + 1 == var10.itemIds[var12]) {
                                    var7 = 999999999;
                                    break;
                                }
                            }
                        }
                    }

                    if (var6 == 11) {
                        var7 = Client.energy;
                    }

                    if (var6 == 12) {
                        var7 = Client.weight;
                    }

                    if (var6 == 13) {
                        var9 = Varps.values[var2[var4++]];
                        int var13 = var2[var4++];
                        var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
                    }

                    if (var6 == 14) {
                        var9 = var2[var4++];
                        var7 = Varpbit.getValue(var9);
                    }

                    if (var6 == 15) {
                        var8 = 1;
                    }

                    if (var6 == 16) {
                        var8 = 2;
                    }

                    if (var6 == 17) {
                        var8 = 3;
                    }

                    if (var6 == 18) {
                        var7 = (Client.player.strictX >> 7) + Class62.anInt636;
                    }

                    if (var6 == 19) {
                        var7 = (Client.player.strictY >> 7) + Class49.anInt377;
                    }

                    if (var6 == 20) {
                        var7 = var2[var4++];
                    }

                    if (var8 == 0) {
                        if (var5 == 0) {
                            var3 += var7;
                        }

                        if (var5 == 1) {
                            var3 -= var7;
                        }

                        if (var5 == 2 && var7 != 0) {
                            var3 /= var7;
                        }

                        if (var5 == 3) {
                            var3 *= var7;
                        }

                        var5 = 0;
                    } else {
                        var5 = var8;
                    }
                }
            } catch (Exception var14) {
                return -1;
            }
        }
        return -2;
    }

    static void method192(World[] var0, int var1, int var2, int[] var3, int[] var4) {
        if (var1 < var2) {
            int var5 = var1 - 1;
            int var6 = var2 + 1;
            int var7 = (var2 + var1) / 2;
            World var8 = var0[var7];
            var0[var7] = var0[var1];
            var0[var1] = var8;

            while (var5 < var6) {
                boolean var9 = true;

                int var10;
                int var11;
                int var12;
                do {
                    --var6;

                    for (var10 = 0; var10 < 4; ++var10) {
                        if (var3[var10] == 2) {
                            var11 = var0[var6].anInt394;
                            var12 = var8.anInt394;
                        } else if (var3[var10] == 1) {
                            var11 = var0[var6].population;
                            var12 = var8.population;
                            if (var11 == -1 && var4[var10] == 1) {
                                var11 = 2001;
                            }

                            if (var12 == -1 && var4[var10] == 1) {
                                var12 = 2001;
                            }
                        } else if (var3[var10] == 3) {
                            var11 = var0[var6].method327() ? 1 : 0;
                            var12 = var8.method327() ? 1 : 0;
                        } else {
                            var11 = var0[var6].id;
                            var12 = var8.id;
                        }

                        if (var12 != var11) {
                            if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                                var9 = false;
                            }
                            break;
                        }

                        if (var10 == 3) {
                            var9 = false;
                        }
                    }
                } while (var9);

                var9 = true;

                do {
                    ++var5;

                    for (var10 = 0; var10 < 4; ++var10) {
                        if (var3[var10] == 2) {
                            var11 = var0[var5].anInt394;
                            var12 = var8.anInt394;
                        } else if (var3[var10] == 1) {
                            var11 = var0[var5].population;
                            var12 = var8.population;
                            if (var11 == -1 && var4[var10] == 1) {
                                var11 = 2001;
                            }

                            if (var12 == -1 && var4[var10] == 1) {
                                var12 = 2001;
                            }
                        } else if (var3[var10] == 3) {
                            var11 = var0[var5].method327() ? 1 : 0;
                            var12 = var8.method327() ? 1 : 0;
                        } else {
                            var11 = var0[var5].id;
                            var12 = var8.id;
                        }

                        if (var11 != var12) {
                            if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                                var9 = false;
                            }
                            break;
                        }

                        if (var10 == 3) {
                            var9 = false;
                        }
                    }
                } while (var9);

                if (var5 < var6) {
                    World var13 = var0[var5];
                    var0[var5] = var0[var6];
                    var0[var6] = var13;
                }
            }

            method192(var0, var1, var6, var3, var4);
            method192(var0, var6 + 1, var2, var3, var4);
        }

    }

    static boolean method196(File var0, boolean var1) {
        try {
            RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
            int var3 = var2.read();
            var2.seek(0L);
            var2.write(var3);
            var2.seek(0L);
            var2.close();
            if (var1) {
                var0.delete();
            }

            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    public static Class182 method197(int var0) {
        Class182[] var1 = Class75.method446();

        for (int var2 = 0; var2 < var1.length; ++var2) {
            Class182 var3 = var1[var2];
            if (var0 == var3.anInt2156) {
                return var3;
            }
        }

        return null;
    }

    static void method394(Player var0, int var1, int var2) {
        if (var1 == var0.animation && var1 != -1) {
            int var3 = AnimationSequence.get(var1).replayMode;
            if (var3 == 1) {
                var0.animationFrame = 0;
                var0.anInt790 = 0;
                var0.anInt791 = var2;
                var0.anInt784 = 0;
            }

            if (var3 == 2) {
                var0.anInt784 = 0;
            }
        } else if (var1 == -1 || var0.animation == -1 || AnimationSequence.get(var1).priority >= AnimationSequence.get(var0.animation).priority) {
            var0.animation = var1;
            var0.animationFrame = 0;
            var0.anInt790 = 0;
            var0.anInt791 = var2;
            var0.anInt784 = 0;
            var0.anInt799 = var0.queueSize;
        }

    }

    protected final Model getModel() {
        if (this.appearance == null) {
            return null;
        }
        AnimationSequence var1 = this.animation != -1 && this.anInt791 == 0 ? AnimationSequence.get(this.animation) : null;
        AnimationSequence var2 = this.anInt768 == -1 || this.aBoolean223 || this.anInt754 == this.anInt768 && var1 != null ? null : AnimationSequence.get(this.anInt768);
        Model var3 = this.appearance.getModel(var1, this.animationFrame, var2, this.subAnimationFrame);
        if (var3 == null) {
            return null;
        }
        var3.method724();
        this.anInt803 = var3.height;
        Model var4;
        Model[] var5;
        if (!this.aBoolean223 && this.anInt771 != -1 && this.anInt782 != -1) {
            var4 = GraphicDefinition.get(this.anInt771).getModel(this.anInt782);
            if (var4 != null) {
                var4.method738(0, -this.anInt787, 0);
                var5 = new Model[]{var3, var4};
                var3 = new Model(var5, 2);
            }
        }

        if (!this.aBoolean223 && this.aModel218 != null) {
            if (Client.engineCycle >= this.anInt226) {
                this.aModel218 = null;
            }

            if (Client.engineCycle >= this.anInt214 && Client.engineCycle < this.anInt226) {
                var4 = this.aModel218;
                var4.method738(this.anInt228 - this.strictX, this.anInt225 - this.anInt217, this.anInt212 - this.strictY);
                if (this.orientation == 512) {
                    var4.method725();
                    var4.method725();
                    var4.method725();
                } else if (this.orientation == 1024) {
                    var4.method725();
                    var4.method725();
                } else if (this.orientation == 1536) {
                    var4.method725();
                }

                var5 = new Model[]{var3, var4};
                var3 = new Model(var5, 2);
                if (this.orientation == 512) {
                    var4.method725();
                } else if (this.orientation == 1024) {
                    var4.method725();
                    var4.method725();
                } else if (this.orientation == 1536) {
                    var4.method725();
                    var4.method725();
                    var4.method725();
                }

                var4.method738(this.strictX - this.anInt228, this.anInt217 - this.anInt225, this.strictY - this.anInt212);
            }
        }

        var3.aBoolean1259 = true;
        return var3;
    }

    final void method199(int var1, int var2, byte var3) {
        if (this.animation != -1 && AnimationSequence.get(this.animation).walkingPrecedence == 1) {
            this.animation = -1;
        }

        this.anInt793 = -1;
        if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
            if (this.anIntArray800[0] >= 0 && this.anIntArray800[0] < 104 && this.anIntArray804[0] >= 0 && this.anIntArray804[0] < 104) {
                if (var3 == 2) {
                    MapTile.method59(this, var1, var2, (byte) 2);
                }

                this.method201(var1, var2, var3);
            } else {
                this.method200(var1, var2);
            }
        } else {
            this.method200(var1, var2);
        }

    }

    int method195() {
        return this.appearance != null && this.appearance.transformedNpcId != -1 ? NpcDefinition.get(this.appearance.transformedNpcId).anInt221 : 1;
    }

    final void method201(int var1, int var2, byte var3) {
        if (this.queueSize < 9) {
            ++this.queueSize;
        }

        for (int var4 = this.queueSize; var4 > 0; --var4) {
            this.anIntArray800[var4] = this.anIntArray800[var4 - 1];
            this.anIntArray804[var4] = this.anIntArray804[var4 - 1];
            this.aByteArray798[var4] = this.aByteArray798[var4 - 1];
        }

        this.anIntArray800[0] = var1;
        this.anIntArray804[0] = var2;
        this.aByteArray798[0] = var3;
    }

    final boolean method194() {
        return this.appearance != null;
    }

    void method200(int var1, int var2) {
        this.queueSize = 0;
        this.anInt799 = 0;
        this.anInt801 = 0;
        this.anIntArray800[0] = var1;
        this.anIntArray804[0] = var2;
        int var3 = this.method195();
        this.strictX = this.anIntArray800[0] * 128 + var3 * 64;
        this.strictY = this.anIntArray804[0] * 128 + var3 * 64;
    }

    final void method198(Buffer var1) {
        var1.caret = 0;
        int var2 = var1.readUnsignedByte();
        this.prayerIcon = var1.method870();
        this.skullIcon = var1.method870();
        int var3 = -1;
        this.anInt219 = 0;
        int[] var4 = new int[12];

        int var6;
        int var8;
        for (int var5 = 0; var5 < 12; ++var5) {
            var6 = var1.readUnsignedByte();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                var8 = var1.readUnsignedByte();
                var4[var5] = (var6 << 8) + var8;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = var1.readUnsignedShort();
                    break;
                }

                if (var4[var5] >= 512) {
                    int var9 = Class149.method1001(var4[var5] - 512).anInt776;
                    if (var9 != 0) {
                        this.anInt219 = var9;
                    }
                }
            }
        }

        int[] var7 = new int[5];

        for (var6 = 0; var6 < 5; ++var6) {
            var8 = var1.readUnsignedByte();
            if (var8 < 0 || var8 >= Legacy2DBoundingBox.aShortArrayArray399[var6].length) {
                var8 = 0;
            }

            var7[var6] = var8;
        }

        this.anInt754 = var1.readUnsignedShort();
        if (this.anInt754 == 65535) {
            this.anInt754 = -1;
        }

        this.anInt745 = var1.readUnsignedShort();
        if (this.anInt745 == 65535) {
            this.anInt745 = -1;
        }

        this.anInt755 = this.anInt745;
        this.anInt760 = var1.readUnsignedShort();
        if (this.anInt760 == 65535) {
            this.anInt760 = -1;
        }

        this.anInt757 = var1.readUnsignedShort();
        if (this.anInt757 == 65535) {
            this.anInt757 = -1;
        }

        this.anInt746 = var1.readUnsignedShort();
        if (this.anInt746 == 65535) {
            this.anInt746 = -1;
        }

        this.anInt744 = var1.readUnsignedShort();
        if (this.anInt744 == 65535) {
            this.anInt744 = -1;
        }

        this.anInt766 = var1.readUnsignedShort();
        if (this.anInt766 == 65535) {
            this.anInt766 = -1;
        }

        this.name = var1.method819();
        if (this == Client.player) {
            RuntimeException_Sub1.aString1288 = this.name;
        }

        this.anInt221 = var1.readUnsignedByte();
        this.totalLevel = var1.readUnsignedShort();
        this.aBoolean215 = var1.readUnsignedByte() == 1;
        if (Client.anInt1470 == 0 && Client.rights >= 2) {
            this.aBoolean215 = false;
        }

        if (this.appearance == null) {
            this.appearance = new PlayerAppearance();
        }

        this.appearance.method1037(var4, var7, var2 == 1, var3);
    }
}
