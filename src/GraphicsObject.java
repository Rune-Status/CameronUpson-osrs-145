public final class GraphicsObject extends Entity {
    boolean aBoolean824 = false;
    int anInt209;
    int level;
    int sceneX;
    int id;
    int height;
    AnimationSequence anAnimationSequence358;
    int anInt217 = 0;
    int sceneY;
    int anInt220 = 0;

    GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.id = var1;
        this.level = var2;
        this.sceneX = var3;
        this.sceneY = var4;
        this.height = var5;
        this.anInt209 = var7 + var6;
        int var8 = Node_Sub21_Sub15.method1115(this.id).anInt221;
        if (var8 != -1) {
            this.aBoolean824 = false;
            this.anAnimationSequence358 = Applet_Sub1.method251(var8);
        } else {
            this.aBoolean824 = true;
        }

    }

    public static void method455(ReferenceTable var0) {
        Class156.aReferenceTable1843 = var0;
    }

    public static void method456(ReferenceTable var0, ReferenceTable var1, ReferenceTable var2) {
        Class44.aReferenceTable368 = var0;
        AnimationSequence.aReferenceTable2017 = var1;
        AnimationSequence.aReferenceTable2039 = var2;
    }

    final void method454(int var1) {
        if (!this.aBoolean824) {
            this.anInt217 += var1;

            while (this.anInt217 > this.anAnimationSequence358.frameLengths[this.anInt220]) {
                this.anInt217 -= this.anAnimationSequence358.frameLengths[this.anInt220];
                ++this.anInt220;
                if (this.anInt220 >= this.anAnimationSequence358.frames.length) {
                    this.aBoolean824 = true;
                    break;
                }
            }

        }
    }

    protected final Model method191() {
        Node_Sub21_Sub7 var1 = Node_Sub21_Sub15.method1115(this.id);
        Model var2;
        if (!this.aBoolean824) {
            var2 = var1.method1050(this.anInt220);
        } else {
            var2 = var1.method1050(-1);
        }

        return var2;
    }
}
