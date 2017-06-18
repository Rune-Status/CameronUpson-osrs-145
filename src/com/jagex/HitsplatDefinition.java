package com.jagex;

public class HitsplatDefinition extends DoublyNode {

    public static ReferenceTable aReferenceTable2017;
    public static ReferenceCache aReferenceCache2013 = new ReferenceCache(64);
    public static ReferenceCache aReferenceCache2045 = new ReferenceCache(64);
    public static ReferenceCache aReferenceCache2047 = new ReferenceCache(20);
    public static ReferenceTable aReferenceTable2039;
    public static ReferenceTable aReferenceTable2012;

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

    void decode(Buffer var1) {
        while (true) {
            int opcode = var1.readUnsignedByte();
            if (opcode == 0) {
                return;
            }

            this.decode(var1, opcode);
        }
    }

    void decode(Buffer var1, int opcode) {
        if (opcode == 1) {
            this.fontId = var1.readSmart32();
        } else if (opcode == 2) {
            this.textColor = var1.method868();
        } else if (opcode == 3) {
            this.iconId = var1.readSmart32();
        } else if (opcode == 4) {
            this.leftSpriteId = var1.readSmart32();
        } else if (opcode == 5) {
            this.middleSpriteId = var1.readSmart32();
        } else if (opcode == 6) {
            this.rightSpriteId = var1.readSmart32();
        } else if (opcode == 7) {
            this.offsetX = var1.readShort();
        } else if (opcode == 8) {
            this.amount = var1.readPrefixedString();
        } else if (opcode == 9) {
            this.duration = var1.readUnsignedShort();
        } else if (opcode == 10) {
            this.offsetY = var1.readShort();
        } else if (opcode == 11) {
            this.fade = 0;
        } else if (opcode == 12) {
            this.comparisonType = var1.readUnsignedByte();
        } else if (opcode == 13) {
            this.anInt213 = var1.readShort();
        } else if (opcode == 14) {
            this.fade = var1.readUnsignedShort();
        } else if (opcode == 17 || opcode == 18) {
            this.varpbitIndex = var1.readUnsignedShort();
            if (this.varpbitIndex == 65535) {
                this.varpbitIndex = -1;
            }

            this.varpIndex = var1.readUnsignedShort();
            if (this.varpIndex == 65535) {
                this.varpIndex = -1;
            }

            int var3 = -1;
            if (opcode == 18) {
                var3 = var1.readUnsignedShort();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }

            int var4 = var1.readUnsignedByte();
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

    public final HitsplatDefinition transform() {
        int var1 = -1;
        if (this.varpbitIndex != -1) {
            var1 = Class4.getVarpbitValue(this.varpbitIndex);
        } else if (this.varpIndex != -1) {
            var1 = Varps.values[this.varpIndex];
        }

        int var2;
        if (var1 >= 0 && var1 < this.transformIds.length - 1) {
            var2 = this.transformIds[var1];
        } else {
            var2 = this.transformIds[this.transformIds.length - 1];
        }

        return var2 != -1 ? Class77.getHitsplatDefinition(var2) : null;
    }

    public String formatAmount(int var1) {
        String formatted = this.amount;

        while (true) {
            int var3 = formatted.indexOf("%1");
            if (var3 < 0) {
                return formatted;
            }

            formatted = formatted.substring(0, var3) + Class90.method584(var1, false) + formatted.substring(var3 + 2);
        }
    }

    public Font getFont() {
        if (this.fontId == -1) {
            return null;
        }
        Font var1 = (Font) aReferenceCache2047.method973((long) this.fontId);
        if (var1 != null) {
            return var1;
        }
        ReferenceTable var2 = aReferenceTable2017;
        ReferenceTable var3 = aReferenceTable2039;
        int var4 = this.fontId;
        Font var5;
        if (!Class64.method381(var2, var4, 0)) {
            var5 = null;
        } else {
            var5 = Class65.loadFont(var3.method1085(var4, 0));
        }

        if (var5 != null) {
            aReferenceCache2047.method975(var5, (long) this.fontId);
        }

        return var5;
    }

    public Sprite getMiddleSpriteId() {
        if (this.middleSpriteId < 0) {
            return null;
        }
        Sprite var1 = (Sprite) aReferenceCache2045.method973((long) this.middleSpriteId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(aReferenceTable2017, this.middleSpriteId, 0);
        if (var1 != null) {
            aReferenceCache2045.method975(var1, (long) this.middleSpriteId);
        }

        return var1;
    }

    public Sprite getLeftSprite() {
        if (this.leftSpriteId < 0) {
            return null;
        }
        Sprite var1 = (Sprite) aReferenceCache2045.method973((long) this.leftSpriteId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(aReferenceTable2017, this.leftSpriteId, 0);
        if (var1 != null) {
            aReferenceCache2045.method975(var1, (long) this.leftSpriteId);
        }

        return var1;
    }

    public Sprite getIcon() {
        if (this.iconId < 0) {
            return null;
        }
        Sprite var1 = (Sprite) aReferenceCache2045.method973((long) this.iconId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(aReferenceTable2017, this.iconId, 0);
        if (var1 != null) {
            aReferenceCache2045.method975(var1, (long) this.iconId);
        }

        return var1;
    }

    public Sprite getRightSprite() {
        if (this.rightSpriteId < 0) {
            return null;
        }
        Sprite var1 = (Sprite) aReferenceCache2045.method973((long) this.rightSpriteId);
        if (var1 != null) {
            return var1;
        }
        var1 = Class176.method1188(aReferenceTable2017, this.rightSpriteId, 0);
        if (var1 != null) {
            aReferenceCache2045.method975(var1, (long) this.rightSpriteId);
        }

        return var1;
    }
}
