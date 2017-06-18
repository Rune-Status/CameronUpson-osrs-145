package com.jagex;

public class NpcDefinition extends DoublyNode {
    static ReferenceTable aReferenceTable2017;
    static ReferenceTable definitionTable;
    static ReferenceCache definitionCache = new ReferenceCache(64);
    static ReferenceCache aReferenceCache2013 = new ReferenceCache(50);
    public boolean aBoolean215 = true;
    public int id;
    public int anInt214 = -1;
    public int anInt221 = 1;
    public int anInt212 = -1;
    public String name = "null";
    public int anInt226 = -1;
    public int anInt228 = -1;
    public int anInt225 = -1;
    public int anInt919 = -1;
    public int anInt235 = -1;
    public boolean aBoolean2019 = false;
    public String[] actions = new String[5];
    public int anInt236 = -1;
    public boolean aBoolean2021 = false;
    public int anInt749 = -1;
    public int anInt748 = 32;
    public int[] transformIds;
    public boolean aBoolean2014 = true;
    public boolean aBoolean2016 = true;
    short[] replacementTextures;
    short[] originalTextures;
    int varpIndex = -1;
    int[] anIntArray932;
    short[] originalColors;
    int[] anIntArray1319;
    int varpbitIndex = -1;
    short[] replacementColors;
    int scaleXZ = 128;
    int scaleY = 128;
    int anInt234 = 0;
    int anInt765 = 0;
    RS3CopyPastedNodeTable properties;

    public static void method335() {
        synchronized (Class165.anObject2005) {
            if (Class165.anInt2004 != 0) {
                Class165.anInt2004 = 1;
                try {
                    Class165.anObject2005.wait();
                } catch (InterruptedException var3) {

                }
            }
        }
    }

    public static NpcDefinition get(int id) {
        NpcDefinition var1 = (NpcDefinition) definitionCache.get((long) id);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = definitionTable.unpack(9, id);
        var1 = new NpcDefinition();
        var1.id = id;
        if (var2 != null) {
            var1.decode(new Buffer(var2));
        }
        definitionCache.put(var1, (long) id);
        return var1;
    }

    void decode(Buffer var1, int var2) {
        int var3;
        int var4;
        if (var2 == 1) {
            var3 = var1.readUnsignedByte();
            this.anIntArray932 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.anIntArray932[var4] = var1.readUnsignedShort();
            }
        } else if (var2 == 2) {
            this.name = var1.method819();
        } else if (var2 == 12) {
            this.anInt221 = var1.readUnsignedByte();
        } else if (var2 == 13) {
            this.anInt214 = var1.readUnsignedShort();
        } else if (var2 == 14) {
            this.anInt225 = var1.readUnsignedShort();
        } else if (var2 == 15) {
            this.anInt226 = var1.readUnsignedShort();
        } else if (var2 == 16) {
            this.anInt228 = var1.readUnsignedShort();
        } else if (var2 == 17) {
            this.anInt225 = var1.readUnsignedShort();
            this.anInt212 = var1.readUnsignedShort();
            this.anInt919 = var1.readUnsignedShort();
            this.anInt235 = var1.readUnsignedShort();
        } else if (var2 >= 30 && var2 < 35) {
            this.actions[var2 - 30] = var1.method819();
            if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
                this.actions[var2 - 30] = null;
            }
        } else if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.originalColors = new short[var3];
            this.replacementColors = new short[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.originalColors[var4] = (short) var1.readUnsignedShort();
                this.replacementColors[var4] = (short) var1.readUnsignedShort();
            }
        } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.originalTextures = new short[var3];
            this.replacementTextures = new short[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.originalTextures[var4] = (short) var1.readUnsignedShort();
                this.replacementTextures[var4] = (short) var1.readUnsignedShort();
            }
        } else if (var2 == 60) {
            var3 = var1.readUnsignedByte();
            this.anIntArray1319 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.anIntArray1319[var4] = var1.readUnsignedShort();
            }
        } else if (var2 == 93) {
            this.aBoolean215 = false;
        } else if (var2 == 95) {
            this.anInt236 = var1.readUnsignedShort();
        } else if (var2 == 97) {
            this.scaleXZ = var1.readUnsignedShort();
        } else if (var2 == 98) {
            this.scaleY = var1.readUnsignedShort();
        } else if (var2 == 99) {
            this.aBoolean2021 = true;
        } else if (var2 == 100) {
            this.anInt234 = var1.method870();
        } else if (var2 == 101) {
            this.anInt765 = var1.method870() * 5;
        } else if (var2 == 102) {
            this.anInt749 = var1.readUnsignedShort();
        } else if (var2 == 103) {
            this.anInt748 = var1.readUnsignedShort();
        } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
                this.aBoolean2014 = false;
            } else if (var2 == 109) {
                this.aBoolean2016 = false;
            } else if (var2 == 111) {
                this.aBoolean2019 = true;
            } else if (var2 == 249) {
                this.properties = RS3CopyPastedNodeTable.readFrom(var1, this.properties);
            }
        } else {
            this.varpbitIndex = var1.readUnsignedShort();
            if (this.varpbitIndex == 65535) {
                this.varpbitIndex = -1;
            }

            this.varpIndex = var1.readUnsignedShort();
            if (this.varpIndex == 65535) {
                this.varpIndex = -1;
            }

            var3 = -1;
            if (var2 == 118) {
                var3 = var1.readUnsignedShort();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }

            var4 = var1.readUnsignedByte();
            this.transformIds = new int[var4 + 2];

            for (int var5 = 0; var5 <= var4; ++var5) {
                this.transformIds[var5] = var1.readUnsignedShort();
                if (this.transformIds[var5] == 65535) {
                    this.transformIds[var5] = -1;
                }
            }

            this.transformIds[var4 + 1] = var3;
        }

    }

    public final Model method1058(AnimationSequence var1, int var2, AnimationSequence var3, int var4) {
        if (this.transformIds != null) {
            NpcDefinition var12 = this.transform();
            return var12 == null ? null : var12.method1058(var1, var2, var3, var4);
        }
        Model var5 = (Model) aReferenceCache2013.get((long) this.id);
        if (var5 == null) {
            boolean var6 = false;

            for (int var7 = 0; var7 < this.anIntArray932.length; ++var7) {
                if (!aReferenceTable2017.method1102(this.anIntArray932[var7], 0)) {
                    var6 = true;
                }
            }

            if (var6) {
                return null;
            }

            ModelHeader[] var9 = new ModelHeader[this.anIntArray932.length];

            int var10;
            for (var10 = 0; var10 < this.anIntArray932.length; ++var10) {
                var9[var10] = ModelHeader.method571(aReferenceTable2017, this.anIntArray932[var10], 0);
            }

            ModelHeader var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new ModelHeader(var9, var9.length);
            }

            if (this.originalColors != null) {
                for (var10 = 0; var10 < this.originalColors.length; ++var10) {
                    var11.recolor(this.originalColors[var10], this.replacementColors[var10]);
                }
            }

            if (this.originalTextures != null) {
                for (var10 = 0; var10 < this.originalTextures.length; ++var10) {
                    var11.retexture(this.originalTextures[var10], this.replacementTextures[var10]);
                }
            }

            var5 = var11.light(this.anInt234 + 64, this.anInt765 + 850, -30, -50, -30);
            aReferenceCache2013.put(var5, (long) this.id);
        }

        Model var8;
        if (var1 != null && var3 != null) {
            var8 = var1.method1197(var5, var2, var3, var4);
        } else if (var1 != null) {
            var8 = var1.method1195(var5, var2);
        } else if (var3 != null) {
            var8 = var3.method1195(var5, var4);
        } else {
            var8 = var5.method726(true);
        }

        if (this.scaleXZ != 128 || this.scaleY != 128) {
            var8.rotate(this.scaleXZ, this.scaleY, this.scaleXZ);
        }

        return var8;
    }

    public boolean transforms() {
        if (this.transformIds == null) {
            return true;
        }
        int var1 = -1;
        if (this.varpbitIndex != -1) {
            var1 = Varpbit.getValue(this.varpbitIndex);
        } else if (this.varpIndex != -1) {
            var1 = Varps.values[this.varpIndex];
        }

        if (var1 >= 0 && var1 < this.transformIds.length) {
            return this.transformIds[var1] != -1;
        }
        return this.transformIds[this.transformIds.length - 1] != -1;
    }

    public int getOrDefault(int var1, int var2) {
        return RS3CopyPastedNodeTable.getOrDefault(this.properties, var1, var2);
    }

    public String getOrDefault(int var1, String var2) {
        return RS3CopyPastedNodeTable.getObjectOrDefault(this.properties, var1, var2);
    }

    public final ModelHeader method1059() {
        if (this.transformIds != null) {
            NpcDefinition var1 = this.transform();
            return var1 == null ? null : var1.method1059();
        }
        if (this.anIntArray1319 == null) {
            return null;
        }
        boolean var2 = false;

        for (int var3 = 0; var3 < this.anIntArray1319.length; ++var3) {
            if (!aReferenceTable2017.method1102(this.anIntArray1319[var3], 0)) {
                var2 = true;
            }
        }

        if (var2) {
            return null;
        }
        ModelHeader[] var4 = new ModelHeader[this.anIntArray1319.length];

        for (int var5 = 0; var5 < this.anIntArray1319.length; ++var5) {
            var4[var5] = ModelHeader.method571(aReferenceTable2017, this.anIntArray1319[var5], 0);
        }

        ModelHeader var6;
        if (var4.length == 1) {
            var6 = var4[0];
        } else {
            var6 = new ModelHeader(var4, var4.length);
        }

        int var7;
        if (this.originalColors != null) {
            for (var7 = 0; var7 < this.originalColors.length; ++var7) {
                var6.recolor(this.originalColors[var7], this.replacementColors[var7]);
            }
        }

        if (this.originalTextures != null) {
            for (var7 = 0; var7 < this.originalTextures.length; ++var7) {
                var6.retexture(this.originalTextures[var7], this.replacementTextures[var7]);
            }
        }

        return var6;
    }

    public final NpcDefinition transform() {
        int var1 = -1;
        if (this.varpbitIndex != -1) {
            var1 = Varpbit.getValue(this.varpbitIndex);
        } else if (this.varpIndex != -1) {
            var1 = Varps.values[this.varpIndex];
        }

        int var2;
        if (var1 >= 0 && var1 < this.transformIds.length - 1) {
            var2 = this.transformIds[var1];
        } else {
            var2 = this.transformIds[this.transformIds.length - 1];
        }

        return var2 != -1 ? get(var2) : null;
    }

    void decode(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0) {
                return;
            }
            decode(buffer, opcode);
        }
    }
}
