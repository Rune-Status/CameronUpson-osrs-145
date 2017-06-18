package com.jagex;

public class Class15 implements Class16 {
    static Node_Sub10_Sub1 aNode_Sub10_Sub1_123;
    int anInt122;
    int anInt6;
    int anInt2;
    int anInt4;
    int anInt5;
    int anInt121;
    int anInt1;
    int anInt120;
    int anInt3;
    int anInt119;

    public static int method130(int var0) {
        return var0 >> 11 & 63;
    }

    static void method133(PathingEntity var0, int var1) {
        int var2;
        int var3;
        int var4;
        if (var0.anInt775 > Client.engineCycle) {
            var2 = var0.anInt775 - Client.engineCycle;
            var3 = var0.anInt753 * 64 + var0.anInt778 * 128;
            var4 = var0.anInt772 * 128 + var0.anInt753 * 64;
            var0.strictX += (var3 - var0.strictX) / var2;
            var0.strictY += (var4 - var0.strictY) / var2;
            var0.anInt801 = 0;
            var0.orientation = var0.anInt788;
        } else if (var0.anInt777 >= Client.engineCycle) {
            if (var0.anInt777 == Client.engineCycle || var0.animation == -1 || var0.anInt791 != 0 || var0.anInt790 + 1 > AnimationSequence.get(var0.animation).frameLengths[var0.animationFrame]) {
                var2 = var0.anInt777 - var0.anInt775;
                var3 = Client.engineCycle - var0.anInt775;
                var4 = var0.anInt753 * 64 + var0.anInt778 * 128;
                int var5 = var0.anInt753 * 64 + var0.anInt772 * 128;
                int var6 = var0.anInt779 * 128 + var0.anInt753 * 64;
                int var7 = var0.anInt792 * 128 + var0.anInt753 * 64;
                var0.strictX = (var4 * (var2 - var3) + var6 * var3) / var2;
                var0.strictY = (var5 * (var2 - var3) + var7 * var3) / var2;
            }

            var0.anInt801 = 0;
            var0.orientation = var0.anInt788;
            var0.anInt748 = var0.orientation;
        } else {
            ClanMate.method206(var0);
        }

        if (var0.strictX < 128 || var0.strictY < 128 || var0.strictX >= 13184 || var0.strictY >= 13184) {
            var0.animation = -1;
            var0.anInt771 = -1;
            var0.anInt775 = 0;
            var0.anInt777 = 0;
            var0.strictX = var0.anInt753 * 64 + var0.anIntArray800[0] * 128;
            var0.strictY = var0.anIntArray804[0] * 128 + var0.anInt753 * 64;
            var0.method441();
        }

        if (var0 == Client.player && (var0.strictX < 1536 || var0.strictY < 1536 || var0.strictX >= 11776 || var0.strictY >= 11776)) {
            var0.animation = -1;
            var0.anInt771 = -1;
            var0.anInt775 = 0;
            var0.anInt777 = 0;
            var0.strictX = var0.anInt753 * 64 + var0.anIntArray800[0] * 128;
            var0.strictY = var0.anIntArray804[0] * 128 + var0.anInt753 * 64;
            var0.method441();
        }

        CollisionMap.method765(var0);
        var0.aBoolean758 = false;
        AnimationSequence var8;
        if (var0.anInt768 != -1) {
            var8 = AnimationSequence.get(var0.anInt768);
            if (var8 != null && var8.frames != null) {
                ++var0.anInt781;
                if (var0.subAnimationFrame < var8.frames.length && var0.anInt781 > var8.frameLengths[var0.subAnimationFrame]) {
                    var0.anInt781 = 1;
                    ++var0.subAnimationFrame;
                    Class100.method651(var8, var0.subAnimationFrame, var0.strictX, var0.strictY);
                }

                if (var0.subAnimationFrame >= var8.frames.length) {
                    var0.anInt781 = 0;
                    var0.subAnimationFrame = 0;
                    Class100.method651(var8, var0.subAnimationFrame, var0.strictX, var0.strictY);
                }
            } else {
                var0.anInt768 = -1;
            }
        }

        if (var0.anInt771 != -1 && Client.engineCycle >= var0.anInt786) {
            if (var0.anInt782 < 0) {
                var0.anInt782 = 0;
            }

            var2 = GraphicDefinition.get(var0.anInt771).animation;
            if (var2 != -1) {
                AnimationSequence var9 = AnimationSequence.get(var2);
                if (var9 != null && var9.frames != null) {
                    ++var0.anInt780;
                    if (var0.anInt782 < var9.frames.length && var0.anInt780 > var9.frameLengths[var0.anInt782]) {
                        var0.anInt780 = 1;
                        ++var0.anInt782;
                        Class100.method651(var9, var0.anInt782, var0.strictX, var0.strictY);
                    }

                    if (var0.anInt782 >= var9.frames.length && (var0.anInt782 < 0 || var0.anInt782 >= var9.frames.length)) {
                        var0.anInt771 = -1;
                    }
                } else {
                    var0.anInt771 = -1;
                }
            } else {
                var0.anInt771 = -1;
            }
        }

        if (var0.animation != -1 && var0.anInt791 <= 1) {
            var8 = AnimationSequence.get(var0.animation);
            if (var8.animatingPrecedence == 1 && var0.anInt799 > 0 && var0.anInt775 <= Client.engineCycle && var0.anInt777 < Client.engineCycle) {
                var0.anInt791 = 1;
                return;
            }
        }

        if (var0.animation != -1 && var0.anInt791 == 0) {
            var8 = AnimationSequence.get(var0.animation);
            if (var8 != null && var8.frames != null) {
                ++var0.anInt790;
                if (var0.animationFrame < var8.frames.length && var0.anInt790 > var8.frameLengths[var0.animationFrame]) {
                    var0.anInt790 = 1;
                    ++var0.animationFrame;
                    Class100.method651(var8, var0.animationFrame, var0.strictX, var0.strictY);
                }

                if (var0.animationFrame >= var8.frames.length) {
                    var0.animationFrame -= var8.loopOffset;
                    ++var0.anInt784;
                    if (var0.anInt784 >= var8.maxLoops) {
                        var0.animation = -1;
                    } else if (var0.animationFrame >= 0 && var0.animationFrame < var8.frames.length) {
                        Class100.method651(var8, var0.animationFrame, var0.strictX, var0.strictY);
                    } else {
                        var0.animation = -1;
                    }
                }

                var0.aBoolean758 = var8.stretches;
            } else {
                var0.animation = -1;
            }
        }

        if (var0.anInt791 > 0) {
            --var0.anInt791;
        }

    }

    public static void method131(ReferenceTable var0) {
        Class49.aReferenceTable374 = var0;
    }

    static int method132(int var0, int var1) {
        if (var0 == -2) {
            return 12345678;
        }
        if (var0 == -1) {
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1;
        }
        var1 = var1 * (var0 & 127) / 128;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 'ﾀ') + var1;
    }

    public void method1(WorldMapTransportation var1) {
        if (var1.minX > this.anInt122) {
            var1.minX = this.anInt122;
        }

        if (var1.maxX < this.anInt120) {
            var1.maxX = this.anInt120;
        }

        if (var1.minY > this.anInt121) {
            var1.minY = this.anInt121;
        }

        if (var1.maxY < this.anInt119) {
            var1.maxY = this.anInt119;
        }

    }

    public boolean method10(int var1, int var2, int var3) {
        if (var1 >= this.anInt1 && var1 < this.anInt6 + this.anInt1) {
            return var2 >> 6 >= this.anInt3 && var2 >> 6 <= this.anInt4 && var3 >> 6 >= this.anInt2 && var3 >> 6 <= this.anInt5;
        }
        return false;
    }

    public boolean method5(int var1, int var2) {
        return var1 >> 6 >= this.anInt122 && var1 >> 6 <= this.anInt120 && var2 >> 6 >= this.anInt121 && var2 >> 6 <= this.anInt119;
    }

    public int[] method2(int var1, int var2, int var3) {
        if (!this.method10(var1, var2, var3)) {
            return null;
        }
        return new int[]{this.anInt122 * 64 - this.anInt3 * 64 + var2, var3 + (this.anInt121 * 64 - this.anInt2 * 64)};
    }

    public SceneOffset method7(int var1, int var2) {
        if (!this.method5(var1, var2)) {
            return null;
        }
        int var3 = this.anInt3 * 64 - this.anInt122 * 64 + var1;
        int var4 = var2 + (this.anInt2 * 64 - this.anInt121 * 64);
        return new SceneOffset(this.anInt1, var3, var4);
    }

    public void decode(Buffer var1) {
        this.anInt1 = var1.readUnsignedByte();
        this.anInt6 = var1.readUnsignedByte();
        this.anInt3 = var1.readUnsignedShort();
        this.anInt2 = var1.readUnsignedShort();
        this.anInt4 = var1.readUnsignedShort();
        this.anInt5 = var1.readUnsignedShort();
        this.anInt122 = var1.readUnsignedShort();
        this.anInt121 = var1.readUnsignedShort();
        this.anInt120 = var1.readUnsignedShort();
        this.anInt119 = var1.readUnsignedShort();
        this.method8();
    }

    void method8() {
    }
}
