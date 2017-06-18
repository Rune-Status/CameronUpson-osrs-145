package com.jagex;

public final class Projectile extends Entity {
    static InterfaceComponent anInterfaceComponent809;
    int slope;
    int anInt209;
    int strictX;
    int cycle;
    int strictY;
    int anInt328;
    int anInt221;
    double currentX;
    double speedZ;
    double heightOffset;
    int targetIndex;
    boolean inMotion = false;
    int anInt213 = 0;
    double currentY;
    double aDouble808;
    double speedY;
    int height;
    double speed;
    int id;
    int xRotation;
    int yRotation;
    AnimationSequence anAnimationSequence817;
    double speedX;
    int anInt818 = 0;
    int targetDistance;

    Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        this.id = var1;
        this.anInt209 = var2;
        this.strictX = var3;
        this.strictY = var4;
        this.height = var5;
        this.anInt221 = var6;
        this.cycle = var7;
        this.slope = var8;
        this.targetDistance = var9;
        this.targetIndex = var10;
        this.anInt328 = var11;
        this.inMotion = false;
        int var12 = Node_Sub21_Sub15.method1115(this.id).anInt221;
        if (var12 != -1) {
            this.anAnimationSequence817 = Applet_Sub1.method251(var12);
        } else {
            this.anAnimationSequence817 = null;
        }

    }

    final void method341(int var1, int var2, int var3, int var4) {
        double var5;
        if (!this.inMotion) {
            var5 = (double) (var1 - this.strictX);
            double var7 = (double) (var2 - this.strictY);
            double var9 = Math.sqrt(var7 * var7 + var5 * var5);
            this.currentX = (double) this.strictX + var5 * (double) this.targetDistance / var9;
            this.currentY = var7 * (double) this.targetDistance / var9 + (double) this.strictY;
            this.aDouble808 = (double) this.height;
        }

        var5 = (double) (this.cycle + 1 - var4);
        this.speedY = ((double) var1 - this.currentX) / var5;
        this.speedX = ((double) var2 - this.currentY) / var5;
        this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
        if (!this.inMotion) {
            this.speedZ = -this.speed * Math.tan(0.02454369D * (double) this.slope);
        }

        this.heightOffset = 2.0D * ((double) var3 - this.aDouble808 - this.speedZ * var5) / (var5 * var5);
    }

    final void method451(int var1) {
        this.inMotion = true;
        this.currentX += (double) var1 * this.speedY;
        this.currentY += this.speedX * (double) var1;
        this.aDouble808 += 0.5D * this.heightOffset * (double) var1 * (double) var1 + (double) var1 * this.speedZ;
        this.speedZ += (double) var1 * this.heightOffset;
        this.xRotation = (int) (Math.atan2(this.speedY, this.speedX) * 325.949D) + 1024 & 2047;
        this.yRotation = (int) (Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
        if (this.anAnimationSequence817 != null) {
            this.anInt818 += var1;

            while (true) {
                do {
                    do {
                        if (this.anInt818 <= this.anAnimationSequence817.frameLengths[this.anInt213]) {
                            return;
                        }

                        this.anInt818 -= this.anAnimationSequence817.frameLengths[this.anInt213];
                        ++this.anInt213;
                    } while (this.anInt213 < this.anAnimationSequence817.frames.length);

                    this.anInt213 -= this.anAnimationSequence817.loopOffset;
                } while (this.anInt213 >= 0 && this.anInt213 < this.anAnimationSequence817.frames.length);

                this.anInt213 = 0;
            }
        }
    }

    protected final Model method191() {
        Node_Sub21_Sub7 var1 = Node_Sub21_Sub15.method1115(this.id);
        Model var2 = var1.method1050(this.anInt213);
        if (var2 == null) {
            return null;
        } else {
            var2.method722(this.yRotation);
            return var2;
        }
    }
}
