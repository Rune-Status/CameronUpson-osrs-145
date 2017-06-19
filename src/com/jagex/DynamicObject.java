package com.jagex;

public class DynamicObject extends Entity {
    int sceneX;
    int type;
    int id;
    int orientation;
    int sceneY;
    AnimationSequence anAnimationSequence358;
    int anInt220;
    int anInt217;
    int level;

    DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
        this.id = var1;
        this.type = var2;
        this.orientation = var3;
        this.level = var4;
        this.sceneX = var5;
        this.sceneY = var6;
        if (var7 != -1) {
            this.anAnimationSequence358 = AnimationSequence.get(var7);
            this.anInt220 = 0;
            this.anInt217 = Client.engineCycle - 1;
            if (this.anAnimationSequence358.replayMode == 0 && var9 != null && var9 instanceof DynamicObject) {
                DynamicObject var10 = (DynamicObject) var9;
                if (var10.anAnimationSequence358 == this.anAnimationSequence358) {
                    this.anInt220 = var10.anInt220;
                    this.anInt217 = var10.anInt217;
                    return;
                }
            }

            if (var8 && this.anAnimationSequence358.loopOffset != -1) {
                this.anInt220 = (int) (Math.random() * (double) this.anAnimationSequence358.frames.length);
                this.anInt217 -= (int) (Math.random() * (double) this.anAnimationSequence358.frameLengths[this.anInt220]);
            }
        }

    }

    static void method295() {
        for (int var0 = 0; var0 < Client.menuRowCount; ++var0) {
            if (Class6.method27(Client.menuOpcodes[var0])) {
                if (var0 < Client.menuRowCount - 1) {
                    for (int var1 = var0; var1 < Client.menuRowCount - 1; ++var1) {
                        Client.menuActions[var1] = Client.menuActions[var1 + 1];
                        Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
                        Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
                        Client.menuPrimaryArgs[var1] = Client.menuPrimaryArgs[var1 + 1];
                        Client.menuSecondaryArgs[var1] = Client.menuSecondaryArgs[var1 + 1];
                        Client.menuTertiaryArgs[var1] = Client.menuTertiaryArgs[var1 + 1];
                    }
                }

                --Client.menuRowCount;
            }
        }

    }

    static int method294(double var0, double var2, double var4) {
        double var6 = var4;
        double var8 = var4;
        double var10 = var4;
        if (0.0D != var2) {
            double var12;
            if (var4 < 0.5D) {
                var12 = (var2 + 1.0D) * var4;
            } else {
                var12 = var2 + var4 - var4 * var2;
            }

            double var14 = var4 * 2.0D - var12;
            double var16 = var0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                --var16;
            }

            double var20 = var0 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                ++var20;
            }

            if (var16 * 6.0D < 1.0D) {
                var6 = var14 + (var12 - var14) * 6.0D * var16;
            } else if (var16 * 2.0D < 1.0D) {
                var6 = var12;
            } else if (3.0D * var16 < 2.0D) {
                var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
            } else {
                var6 = var14;
            }

            if (var0 * 6.0D < 1.0D) {
                var8 = var0 * (var12 - var14) * 6.0D + var14;
            } else if (var0 * 2.0D < 1.0D) {
                var8 = var12;
            } else if (3.0D * var0 < 2.0D) {
                var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14;
            } else {
                var8 = var14;
            }

            if (var20 * 6.0D < 1.0D) {
                var10 = 6.0D * (var12 - var14) * var20 + var14;
            } else if (var20 * 2.0D < 1.0D) {
                var10 = var12;
            } else if (var20 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - var20) * (var12 - var14) * 6.0D + var14;
            } else {
                var10 = var14;
            }
        }

        int var22 = (int) (256.0D * var6);
        int var23 = (int) (256.0D * var8);
        int var24 = (int) (256.0D * var10);
        return var24 + (var22 << 16) + (var23 << 8);
    }

    protected final Model getModel() {
        if (this.anAnimationSequence358 != null) {
            int var1 = Client.engineCycle - this.anInt217;
            if (var1 > 100 && this.anAnimationSequence358.loopOffset > 0) {
                var1 = 100;
            }

            label55:
            {
                do {
                    do {
                        if (var1 <= this.anAnimationSequence358.frameLengths[this.anInt220]) {
                            break label55;
                        }

                        var1 -= this.anAnimationSequence358.frameLengths[this.anInt220];
                        ++this.anInt220;
                    } while (this.anInt220 < this.anAnimationSequence358.frames.length);

                    this.anInt220 -= this.anAnimationSequence358.loopOffset;
                } while (this.anInt220 >= 0 && this.anInt220 < this.anAnimationSequence358.frames.length);

                this.anAnimationSequence358 = null;
            }

            this.anInt217 = Client.engineCycle - var1;
        }

        ObjectDefinition var2 = ObjectDefinition.get(this.id);
        if (var2.transformIds != null) {
            var2 = var2.transform();
        }

        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.orientation != 1 && this.orientation != 3) {
            var3 = var2.anInt230;
            var4 = var2.anInt222;
        } else {
            var3 = var2.anInt222;
            var4 = var2.anInt230;
        }

        int var5 = this.sceneX + (var3 >> 1);
        int var6 = this.sceneX + (var3 + 1 >> 1);
        int var7 = this.sceneY + (var4 >> 1);
        int var8 = (var4 + 1 >> 1) + this.sceneY;
        int[][] var9 = Class26.anIntArrayArrayArray191[this.level];
        int var10 = var9[var6][var8] + var9[var5][var7] + var9[var6][var7] + var9[var5][var8] >> 2;
        int var11 = (this.sceneX << 7) + (var3 << 6);
        int var12 = (var4 << 6) + (this.sceneY << 7);
        return var2.method1074(this.type, this.orientation, var9, var11, var10, var12, this.anAnimationSequence358, this.anInt220);
    }
}
