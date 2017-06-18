package com.jagex;

public final class GraphicsObject extends Entity {

    boolean inanimate = false;
    int endCycle;
    int level;
    int sceneX;
    int id;
    int height;
    AnimationSequence sequence;
    int anInt217 = 0;
    int sceneY;
    int frame = 0;

    GraphicsObject(int id, int level, int sceneX, int sceneY, int height, int duration, int startCycle) {
        this.id = id;
        this.level = level;
        this.sceneX = sceneX;
        this.sceneY = sceneY;
        this.height = height;
        endCycle = startCycle + duration;
        int var8 = GraphicDefinition.get(id).animation;
        if (var8 != -1) {
            inanimate = false;
            sequence = AnimationSequence.get(var8);
        } else {
            inanimate = true;
        }

    }

    public static void method455(ReferenceTable var0) {
        ScriptEvent.aReferenceTable1843 = var0;
    }

    final void update(int var1) {
        if (!this.inanimate) {
            this.anInt217 += var1;
            while (this.anInt217 > this.sequence.frameLengths[this.frame]) {
                this.anInt217 -= this.sequence.frameLengths[this.frame];
                ++this.frame;
                if (this.frame >= this.sequence.frames.length) {
                    this.inanimate = true;
                    break;
                }
            }
        }
    }

    protected final Model getModel() {
        GraphicDefinition definition = GraphicDefinition.get(id);
        return !inanimate ? definition.getModel(this.frame) : definition.getModel(-1);
    }
}
