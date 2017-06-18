package com.jagex;

public class HitsplatDefinition extends DoublyNode {

    public static ReferenceTable spriteTable;
    public static ReferenceTable fontTable;
    public static ReferenceTable definitionTable;

    public static ReferenceCache<HitsplatDefinition> definitionCache = new ReferenceCache<>(64);
    public static ReferenceCache<Sprite> spriteCache = new ReferenceCache<>(64);
    public static ReferenceCache<Font> fontCache = new ReferenceCache<>(20);

    public int offsetX = 0;
    public int offsetY = 0;

    public int duration = 70;
    public int fade = -1;

    public int anInt213 = 0;

    public int textColor = 16777215;
    public int comparisonType = -1;

    int fontId = -1;
    int iconId = -1;

    int leftSpriteId = -1;
    int rightSpriteId = -1;
    int middleSpriteId = -1;

    int varpbitIndex = -1;
    int varpIndex = -1;
    public int[] transformIds;

    String amount = "";

    public static HitsplatDefinition get(int var0) {
        HitsplatDefinition var1 = definitionCache.get((long) var0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = definitionTable.unpack(32, var0);
        var1 = new HitsplatDefinition();
        if (var2 != null) {
            var1.decode(new Buffer(var2));
        }

        definitionCache.put(var1, (long) var0);
        return var1;
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

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1) {
            fontId = buffer.readSmart32();
        } else if (opcode == 2) {
            textColor = buffer.method868();
        } else if (opcode == 3) {
            iconId = buffer.readSmart32();
        } else if (opcode == 4) {
            leftSpriteId = buffer.readSmart32();
        } else if (opcode == 5) {
            middleSpriteId = buffer.readSmart32();
        } else if (opcode == 6) {
            rightSpriteId = buffer.readSmart32();
        } else if (opcode == 7) {
            offsetX = buffer.readShort();
        } else if (opcode == 8) {
            amount = buffer.readPrefixedString();
        } else if (opcode == 9) {
            duration = buffer.readUnsignedShort();
        } else if (opcode == 10) {
            offsetY = buffer.readShort();
        } else if (opcode == 11) {
            fade = 0;
        } else if (opcode == 12) {
            comparisonType = buffer.readUnsignedByte();
        } else if (opcode == 13) {
            anInt213 = buffer.readShort();
        } else if (opcode == 14) {
            fade = buffer.readUnsignedShort();
        } else if (opcode == 17 || opcode == 18) {
            varpbitIndex = buffer.readUnsignedShort();
            if (varpbitIndex == 65535) {
                varpbitIndex = -1;
            }

            varpIndex = buffer.readUnsignedShort();
            if (varpIndex == 65535) {
                varpIndex = -1;
            }

            int transformId = -1;
            if (opcode == 18) {
                transformId = buffer.readUnsignedShort();
                if (transformId == 65535) {
                    transformId = -1;
                }
            }

            int transformCount = buffer.readUnsignedByte();
            transformIds = new int[transformCount + 2];

            for (int i = 0; i <= transformCount; ++i) {
                transformIds[i] = buffer.readUnsignedShort();
                if (transformIds[i] == 65535) {
                    transformIds[i] = -1;
                }
            }

            transformIds[transformCount + 1] = transformId;
        }

    }

    public final HitsplatDefinition transform() {
        int var1 = -1;
        if (varpbitIndex != -1) {
            var1 = Varpbit.getValue(varpbitIndex);
        } else if (varpIndex != -1) {
            var1 = Varps.values[varpIndex];
        }

        int var2;
        if (var1 >= 0 && var1 < transformIds.length - 1) {
            var2 = transformIds[var1];
        } else {
            var2 = transformIds[transformIds.length - 1];
        }

        return var2 != -1 ? HitsplatDefinition.get(var2) : null;
    }

    public String formatAmount(int var1) {
        String formatted = amount;

        while (true) {
            int var3 = formatted.indexOf("%1");
            if (var3 < 0) {
                return formatted;
            }

            formatted = formatted.substring(0, var3) + Class90.method584(var1, false) + formatted.substring(var3 + 2);
        }
    }

    public Font getFont() {
        if (fontId == -1) {
            return null;
        }
        Font var1 = fontCache.get((long) fontId);
        if (var1 != null) {
            return var1;
        }
        ReferenceTable var2 = spriteTable;
        ReferenceTable var3 = fontTable;
        int var4 = fontId;
        Font var5;
        if (!Class64.method381(var2, var4, 0)) {
            var5 = null;
        } else {
            var5 = Class65.loadFont(var3.unpack(var4, 0));
        }

        if (var5 != null) {
            fontCache.put(var5, (long) fontId);
        }

        return var5;
    }

    public Sprite getMiddleSpriteId() {
        if (middleSpriteId < 0) {
            return null;
        }
        Sprite var1 = spriteCache.get((long) middleSpriteId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(spriteTable, middleSpriteId, 0);
        if (var1 != null) {
            spriteCache.put(var1, (long) middleSpriteId);
        }

        return var1;
    }

    public Sprite getLeftSprite() {
        if (leftSpriteId < 0) {
            return null;
        }
        Sprite var1 = spriteCache.get((long) leftSpriteId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(spriteTable, leftSpriteId, 0);
        if (var1 != null) {
            spriteCache.put(var1, (long) leftSpriteId);
        }

        return var1;
    }

    public Sprite getIcon() {
        if (iconId < 0) {
            return null;
        }
        Sprite var1 = spriteCache.get((long) iconId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(spriteTable, iconId, 0);
        if (var1 != null) {
            spriteCache.put(var1, (long) iconId);
        }

        return var1;
    }

    public Sprite getRightSprite() {
        if (rightSpriteId < 0) {
            return null;
        }
        Sprite var1 = spriteCache.get((long) rightSpriteId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(spriteTable, rightSpriteId, 0);
        if (var1 != null) {
            spriteCache.put(var1, (long) rightSpriteId);
        }

        return var1;
    }
}
