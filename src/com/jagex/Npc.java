package com.jagex;

public final class Npc extends PathingEntity {
    static int[] anIntArray661;
    NpcDefinition definition;

    final void method384(int var1, byte var2) {
        int var3 = this.anIntArray800[0];
        int var4 = this.anIntArray804[0];
        if (var1 == 0) {
            --var3;
            ++var4;
        }

        if (var1 == 1) {
            ++var4;
        }

        if (var1 == 2) {
            ++var3;
            ++var4;
        }

        if (var1 == 3) {
            --var3;
        }

        if (var1 == 4) {
            ++var3;
        }

        if (var1 == 5) {
            --var3;
            --var4;
        }

        if (var1 == 6) {
            --var4;
        }

        if (var1 == 7) {
            ++var3;
            --var4;
        }

        if (this.animation != -1 && Applet_Sub1.method251(this.animation).walkingPrecedence == 1) {
            this.animation = -1;
        }

        if (this.queueSize < 9) {
            ++this.queueSize;
        }

        for (int var5 = this.queueSize; var5 > 0; --var5) {
            this.anIntArray800[var5] = this.anIntArray800[var5 - 1];
            this.anIntArray804[var5] = this.anIntArray804[var5 - 1];
            this.aByteArray798[var5] = this.aByteArray798[var5 - 1];
        }

        this.anIntArray800[0] = var3;
        this.anIntArray804[0] = var4;
        this.aByteArray798[0] = var2;
    }

    final void method385(int var1, int var2, boolean var3) {
        if (this.animation != -1 && Applet_Sub1.method251(this.animation).walkingPrecedence == 1) {
            this.animation = -1;
        }

        if (!var3) {
            int var4 = var1 - this.anIntArray800[0];
            int var5 = var2 - this.anIntArray804[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.queueSize < 9) {
                    ++this.queueSize;
                }

                for (int var6 = this.queueSize; var6 > 0; --var6) {
                    this.anIntArray800[var6] = this.anIntArray800[var6 - 1];
                    this.anIntArray804[var6] = this.anIntArray804[var6 - 1];
                    this.aByteArray798[var6] = this.aByteArray798[var6 - 1];
                }

                this.anIntArray800[0] = var1;
                this.anIntArray804[0] = var2;
                this.aByteArray798[0] = 1;
                return;
            }
        }

        this.queueSize = 0;
        this.anInt799 = 0;
        this.anInt801 = 0;
        this.anIntArray800[0] = var1;
        this.anIntArray804[0] = var2;
        this.strictX = this.anIntArray800[0] * 128 + this.anInt753 * 64;
        this.strictY = this.anInt753 * 64 + this.anIntArray804[0] * 128;
    }

    final boolean method194() {
        return this.definition != null;
    }

    protected final Model method191() {
        if (this.definition == null) {
            return null;
        } else {
            AnimationSequence var1 = this.animation != -1 && this.anInt791 == 0 ? Applet_Sub1.method251(this.animation) : null;
            AnimationSequence var2 = this.anInt768 != -1 && (this.anInt754 != this.anInt768 || var1 == null) ? Applet_Sub1.method251(this.anInt768) : null;
            Model var3 = this.definition.method1058(var1, this.animationFrame, var2, this.subAnimationFrame);
            if (var3 == null) {
                return null;
            } else {
                var3.method724();
                this.anInt803 = var3.height;
                if (this.anInt771 != -1 && this.anInt782 != -1) {
                    Model var4 = Node_Sub21_Sub15.method1115(this.anInt771).method1050(this.anInt782);
                    if (var4 != null) {
                        var4.method738(0, -this.anInt787, 0);
                        Model[] var5 = new Model[]{var3, var4};
                        var3 = new Model(var5, 2);
                    }
                }

                if (this.definition.anInt221 == 1) {
                    var3.aBoolean1259 = true;
                }

                return var3;
            }
        }
    }
}
