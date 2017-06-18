package com.jagex;

public class AnimationSequence extends DoublyNode {
    public static ReferenceCache sequenceCache = new ReferenceCache(64);
    public static ReferenceCache aReferenceCache2045 = new ReferenceCache(100);
    static ReferenceTable aReferenceTable2039;
    static ReferenceTable aReferenceTable2017;

    public int[] frameLengths;
    public int[] frames;
    public int[] anIntArray1319;
    public int priority = 5;
    public int loopOffset = -1;
    public boolean stretches = false;
    public int offHand = -1;
    public int mainHand = -1;
    public int maxLoops = 99;
    public int animatingPrecedence = -1;
    public int walkingPrecedence = -1;
    public int replayMode = 2;
    int[] interleaveOrder;
    int[] anIntArray934;

    public static AnimationSequence get(int id) {
        AnimationSequence var1 = (AnimationSequence) sequenceCache.get((long) id);
        if (var1 != null) {
            return var1;
        }
        byte[] buffer = Class44.sequenceTable.unpack(12, id);
        var1 = new AnimationSequence();
        if (buffer != null) {
            var1.decode(new Buffer(buffer));
        }

        var1.method556();
        sequenceCache.put(var1, (long) id);
        return var1;
    }

    public static void setTables(ReferenceTable var0, ReferenceTable var1, ReferenceTable var2) {
        Class44.sequenceTable = var0;
        aReferenceTable2017 = var1;
        aReferenceTable2039 = var2;
    }

    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.decode(var1, var2);
        }
    }

    void decode(Buffer var1, int var2) {
        int var3;
        int var4;
        if (var2 == 1) {
            var3 = var1.readUnsignedShort();
            this.frameLengths = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.frameLengths[var4] = var1.readUnsignedShort();
            }

            this.frames = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.frames[var4] = var1.readUnsignedShort();
            }

            for (var4 = 0; var4 < var3; ++var4) {
                this.frames[var4] += var1.readUnsignedShort() << 16;
            }
        } else if (var2 == 2) {
            this.loopOffset = var1.readUnsignedShort();
        } else if (var2 == 3) {
            var3 = var1.readUnsignedByte();
            this.interleaveOrder = new int[var3 + 1];

            for (var4 = 0; var4 < var3; ++var4) {
                this.interleaveOrder[var4] = var1.readUnsignedByte();
            }

            this.interleaveOrder[var3] = 9999999;
        } else if (var2 == 4) {
            this.stretches = true;
        } else if (var2 == 5) {
            this.priority = var1.readUnsignedByte();
        } else if (var2 == 6) {
            this.offHand = var1.readUnsignedShort();
        } else if (var2 == 7) {
            this.mainHand = var1.readUnsignedShort();
        } else if (var2 == 8) {
            this.maxLoops = var1.readUnsignedByte();
        } else if (var2 == 9) {
            this.animatingPrecedence = var1.readUnsignedByte();
        } else if (var2 == 10) {
            this.walkingPrecedence = var1.readUnsignedByte();
        } else if (var2 == 11) {
            this.replayMode = var1.readUnsignedByte();
        } else if (var2 == 12) {
            var3 = var1.readUnsignedByte();
            this.anIntArray934 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.anIntArray934[var4] = var1.readUnsignedShort();
            }

            for (var4 = 0; var4 < var3; ++var4) {
                this.anIntArray934[var4] += var1.readUnsignedShort() << 16;
            }
        } else if (var2 == 13) {
            var3 = var1.readUnsignedByte();
            this.anIntArray1319 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.anIntArray1319[var4] = var1.method868();
            }
        }

    }

    void method556() {
        if (this.animatingPrecedence == -1) {
            if (this.interleaveOrder != null) {
                this.animatingPrecedence = 2;
            } else {
                this.animatingPrecedence = 0;
            }
        }

        if (this.walkingPrecedence == -1) {
            if (this.interleaveOrder != null) {
                this.walkingPrecedence = 2;
            } else {
                this.walkingPrecedence = 0;
            }
        }

    }

    public Model method1195(Model var1, int var2) {
        var2 = this.frames[var2];
        AnimationFrame var3 = Class19.method143(var2 >> 16);
        var2 &= 65535;
        if (var3 == null) {
            return var1.method726(true);
        }
        Model var4 = var1.method726(!var3.method626(var2));
        var4.method727(var3, var2);
        return var4;
    }

    Model getAnimatedModel(Model base, int frameId) {
        frameId = this.frames[frameId];
        AnimationFrame frame = Class19.method143(frameId >> 16);
        frameId &= 65535;
        if (frame == null) {
            return base.method732(true);
        }
        Model animated = base.method732(!frame.method626(frameId));
        animated.method727(frame, frameId);
        return animated;
    }

    public Model method1193(Model var1, int var2) {
        int var3 = this.frames[var2];
        AnimationFrame var4 = Class19.method143(var3 >> 16);
        var3 &= 65535;
        if (var4 == null) {
            return var1.method726(true);
        }
        AnimationFrame var5 = null;
        int var6 = 0;
        if (this.anIntArray934 != null && var2 < this.anIntArray934.length) {
            var6 = this.anIntArray934[var2];
            var5 = Class19.method143(var6 >> 16);
            var6 &= 65535;
        }

        Model var7;
        if (var5 != null && var6 != 65535) {
            var7 = var1.method726(!var4.method626(var3) & !var5.method626(var6));
            var7.method727(var4, var3);
            var7.method727(var5, var6);
            return var7;
        }
        var7 = var1.method726(!var4.method626(var3));
        var7.method727(var4, var3);
        return var7;
    }

    public Model method1197(Model var1, int var2, AnimationSequence var3, int var4) {
        var2 = this.frames[var2];
        AnimationFrame var5 = Class19.method143(var2 >> 16);
        var2 &= 65535;
        if (var5 == null) {
            return var3.method1195(var1, var4);
        }
        var4 = var3.frames[var4];
        AnimationFrame var6 = Class19.method143(var4 >> 16);
        var4 &= 65535;
        Model var7;
        if (var6 == null) {
            var7 = var1.method726(!var5.method626(var2));
            var7.method727(var5, var2);
            return var7;
        }
        var7 = var1.method726(!var5.method626(var2) & !var6.method626(var4));
        var7.method735(var5, var2, var6, var4, this.interleaveOrder);
        return var7;
    }

    Model method1196(Model var1, int var2, int var3) {
        var2 = this.frames[var2];
        AnimationFrame var4 = Class19.method143(var2 >> 16);
        var2 &= 65535;
        if (var4 == null) {
            return var1.method726(true);
        }
        Model var5 = var1.method726(!var4.method626(var2));
        var3 &= 3;
        if (var3 == 1) {
            var5.method540();
        } else if (var3 == 2) {
            var5.method730();
        } else if (var3 == 3) {
            var5.method725();
        }

        var5.method727(var4, var2);
        if (var3 == 1) {
            var5.method725();
        } else if (var3 == 2) {
            var5.method730();
        } else if (var3 == 3) {
            var5.method540();
        }

        return var5;
    }
}
