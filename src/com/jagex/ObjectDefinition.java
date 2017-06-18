package com.jagex;

public class ObjectDefinition extends DoublyNode {
    public static ReferenceCache aReferenceCache2042 = new ReferenceCache(30);
    public static ReferenceTable aReferenceTable2017;
    public static ReferenceCache aReferenceCache2047 = new ReferenceCache(30);
    public static ReferenceCache aReferenceCache2045 = new ReferenceCache(500);
    public static ReferenceTable aReferenceTable2039;
    public static boolean aBoolean1083 = false;
    public static ReferenceCache aReferenceCache2013 = new ReferenceCache(4096);
    static ModelHeader[] aModelHeaderArray2041 = new ModelHeader[4];
    public int anInt1864 = 0;
    public int anInt219 = -1;
    public String name = "null";
    public int anInt230 = 1;
    public int anInt222 = 1;
    public int id;
    public int anInt818 = -1;
    public int anInt2032 = 0;
    public boolean aBoolean223 = true;
    public String[] actions = new String[5];
    public int mapFunction = -1;
    public int anInt1257 = -1;
    public boolean clipped = true;
    public int anInt767 = -1;
    public int anInt233 = 16;
    public int anInt229 = 2;
    public boolean clipped1 = false;
    public boolean aBoolean2037 = false;
    public int anInt928 = -1;
    public int[] transformIds;
    public int anInt2036 = 0;
    public int[] anIntArray751;
    int anInt745 = 128;
    int anInt760 = 128;
    int anInt234 = 0;
    int[] anIntArray1271;
    int[] anIntArray1276;
    short[] newColors;
    short[] aShortArray2040;
    short[] aShortArray2044;
    int anInt755 = 128;
    int clipType = -1;
    boolean aBoolean2046 = false;
    int anInt765 = 0;
    boolean aBoolean2034 = false;
    int anInt757 = 0;
    int anInt746 = 0;
    boolean aBoolean2033 = false;
    int varpbitIndex = -1;
    int anInt744 = 0;
    short[] colors;
    int varpIndex = -1;
    RS3CopyPastedNodeTable properties;

    static boolean method345() {
        return Class105.aBoolean1242;
    }

    static int method1075(Class188 var0) {
        if (var0 == null) {
            return 12;
        }
        switch (var0.anInt2191) {
            case 7:
                return 20;
            default:
                return 12;
        }
    }

    public boolean method1077() {
        if (this.transformIds == null) {
            return this.anInt767 != -1 || this.anIntArray751 != null;
        }
        for (int var1 = 0; var1 < this.transformIds.length; ++var1) {
            if (this.transformIds[var1] != -1) {
                ObjectDefinition var2 = Class5.method17(this.transformIds[var1]);
                if (var2.anInt767 != -1 || var2.anIntArray751 != null) {
                    return true;
                }
            }
        }

        return false;
    }

    void method756() {
        if (this.anInt219 == -1) {
            this.anInt219 = 0;
            if (this.anIntArray1271 != null && (this.anIntArray1276 == null || this.anIntArray1276[0] == 10)) {
                this.anInt219 = 1;
            }

            for (int var1 = 0; var1 < 5; ++var1) {
                if (this.actions[var1] != null) {
                    this.anInt219 = 1;
                }
            }
        }

        if (this.anInt928 == -1) {
            this.anInt928 = this.anInt229 != 0 ? 1 : 0;
        }

    }

    void method1066(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1065(var1, var2);
        }
    }

    public final Entity method1072(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
        long var7;
        if (this.anIntArray1276 == null) {
            var7 = (long) (var2 + (this.id << 10));
        } else {
            var7 = (long) ((var1 << 3) + (this.id << 10) + var2);
        }

        Object var9 = aReferenceCache2047.method973(var7);
        if (var9 == null) {
            ModelHeader var10 = this.method1076(var1, var2);
            if (var10 == null) {
                return null;
            }

            if (!this.aBoolean2046) {
                var9 = var10.light(this.anInt234 + 64, this.anInt765 + 768, -50, -10, -50);
            } else {
                var10.aShort939 = (short) (this.anInt234 + 64);
                var10.aShort946 = (short) (this.anInt765 + 768);
                var10.method581();
                var9 = var10;
            }

            aReferenceCache2047.method975((DoublyNode) var9, var7);
        }

        if (this.aBoolean2046) {
            var9 = ((ModelHeader) var9).method583();
        }

        if (this.clipType >= 0) {
            if (var9 instanceof Model) {
                var9 = ((Model) var9).method729(var3, var4, var5, var6, true, this.clipType);
            } else if (var9 instanceof ModelHeader) {
                var9 = ((ModelHeader) var9).method566(var3, var4, var5, var6, true, this.clipType);
            }
        }

        return (Entity) var9;
    }

    public final Model method1070(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
        long var7;
        if (this.anIntArray1276 == null) {
            var7 = (long) (var2 + (this.id << 10));
        } else {
            var7 = (long) ((var1 << 3) + (this.id << 10) + var2);
        }

        Model var9 = (Model) aReferenceCache2042.method973(var7);
        if (var9 == null) {
            ModelHeader var10 = this.method1076(var1, var2);
            if (var10 == null) {
                return null;
            }

            var9 = var10.light(this.anInt234 + 64, this.anInt765 + 768, -50, -10, -50);
            aReferenceCache2042.method975(var9, var7);
        }

        if (this.clipType >= 0) {
            var9 = var9.method729(var3, var4, var5, var6, true, this.clipType);
        }

        return var9;
    }

    public final Model method1074(int var1, int var2, int[][] var3, int var4, int var5, int var6, AnimationSequence var7, int var8) {
        long var9;
        if (this.anIntArray1276 == null) {
            var9 = (long) (var2 + (this.id << 10));
        } else {
            var9 = (long) ((this.id << 10) + (var1 << 3) + var2);
        }

        Model var11 = (Model) aReferenceCache2042.method973(var9);
        if (var11 == null) {
            ModelHeader var12 = this.method1076(var1, var2);
            if (var12 == null) {
                return null;
            }

            var11 = var12.light(this.anInt234 + 64, this.anInt765 + 768, -50, -10, -50);
            aReferenceCache2042.method975(var11, var9);
        }

        if (var7 == null && this.clipType == -1) {
            return var11;
        }
        if (var7 != null) {
            var11 = var7.method1196(var11, var8, var2);
        } else {
            var11 = var11.method726(true);
        }

        if (this.clipType >= 0) {
            var11 = var11.method729(var3, var4, var5, var6, false, this.clipType);
        }

        return var11;
    }

    final ModelHeader method1076(int var1, int var2) {
        ModelHeader var3 = null;
        boolean var4;
        int var5;
        int var8;
        if (this.anIntArray1276 == null) {
            if (var1 != 10) {
                return null;
            }

            if (this.anIntArray1271 == null) {
                return null;
            }

            var4 = this.aBoolean2034;
            if (var1 == 2 && var2 > 3) {
                var4 = !var4;
            }

            var5 = this.anIntArray1271.length;

            for (int var6 = 0; var6 < var5; ++var6) {
                var8 = this.anIntArray1271[var6];
                if (var4) {
                    var8 += 65536;
                }

                var3 = (ModelHeader) aReferenceCache2045.method973((long) var8);
                if (var3 == null) {
                    var3 = ModelHeader.method571(aReferenceTable2039, var8 & '\uffff', 0);
                    if (var3 == null) {
                        return null;
                    }

                    if (var4) {
                        var3.method540();
                    }

                    aReferenceCache2045.method975(var3, (long) var8);
                }

                if (var5 > 1) {
                    aModelHeaderArray2041[var6] = var3;
                }
            }

            if (var5 > 1) {
                var3 = new ModelHeader(aModelHeaderArray2041, var5);
            }
        } else {
            int var9 = -1;

            for (var5 = 0; var5 < this.anIntArray1276.length; ++var5) {
                if (this.anIntArray1276[var5] == var1) {
                    var9 = var5;
                    break;
                }
            }

            if (var9 == -1) {
                return null;
            }

            var5 = this.anIntArray1271[var9];
            boolean var10 = this.aBoolean2034 ^ var2 > 3;
            if (var10) {
                var5 += 65536;
            }

            var3 = (ModelHeader) aReferenceCache2045.method973((long) var5);
            if (var3 == null) {
                var3 = ModelHeader.method571(aReferenceTable2039, var5 & '\uffff', 0);
                if (var3 == null) {
                    return null;
                }

                if (var10) {
                    var3.method540();
                }

                aReferenceCache2045.method975(var3, (long) var5);
            }
        }

        var4 = !(this.anInt745 == 128 && this.anInt755 == 128 && this.anInt760 == 128);

        boolean var11;
        var11 = !(this.anInt757 == 0 && this.anInt746 == 0 && this.anInt744 == 0);

        ModelHeader var7 = new ModelHeader(var3, var2 == 0 && !var4 && !var11, this.colors == null, this.aShortArray2040 == null, true);
        if (var1 == 4 && var2 > 3) {
            var7.method578(256);
            var7.method574(45, 0, -45);
        }

        var2 &= 3;
        if (var2 == 1) {
            var7.method570();
        } else if (var2 == 2) {
            var7.method572();
        } else if (var2 == 3) {
            var7.method569();
        }

        if (this.colors != null) {
            for (var8 = 0; var8 < this.colors.length; ++var8) {
                var7.recolor(this.colors[var8], this.newColors[var8]);
            }
        }

        if (this.aShortArray2040 != null) {
            for (var8 = 0; var8 < this.aShortArray2040.length; ++var8) {
                var7.method573(this.aShortArray2040[var8], this.aShortArray2044[var8]);
            }
        }

        if (var4) {
            var7.method564(this.anInt745, this.anInt755, this.anInt760);
        }

        if (var11) {
            var7.method574(this.anInt757, this.anInt746, this.anInt744);
        }

        return var7;
    }

    public String method1071(int var1, String var2) {
        return RS3CopyPastedNodeTable.getObjectOrDefault(this.properties, var1, var2);
    }

    void method1065(Buffer var1, int var2) {
        int var3;
        int var4;
        if (var2 == 1) {
            var3 = var1.readUnsignedByte();
            if (var3 > 0) {
                if (this.anIntArray1271 != null && !aBoolean1083) {
                    var1.caret += var3 * 3;
                } else {
                    this.anIntArray1276 = new int[var3];
                    this.anIntArray1271 = new int[var3];

                    for (var4 = 0; var4 < var3; ++var4) {
                        this.anIntArray1271[var4] = var1.readUnsignedShort();
                        this.anIntArray1276[var4] = var1.readUnsignedByte();
                    }
                }
            }
        } else if (var2 == 2) {
            this.name = var1.method819();
        } else if (var2 == 5) {
            var3 = var1.readUnsignedByte();
            if (var3 > 0) {
                if (this.anIntArray1271 != null && !aBoolean1083) {
                    var1.caret += var3 * 2;
                } else {
                    this.anIntArray1276 = null;
                    this.anIntArray1271 = new int[var3];

                    for (var4 = 0; var4 < var3; ++var4) {
                        this.anIntArray1271[var4] = var1.readUnsignedShort();
                    }
                }
            }
        } else if (var2 == 14) {
            this.anInt230 = var1.readUnsignedByte();
        } else if (var2 == 15) {
            this.anInt222 = var1.readUnsignedByte();
        } else if (var2 == 17) {
            this.anInt229 = 0;
            this.aBoolean223 = false;
        } else if (var2 == 18) {
            this.aBoolean223 = false;
        } else if (var2 == 19) {
            this.anInt219 = var1.readUnsignedByte();
        } else if (var2 == 21) {
            this.clipType = 0;
        } else if (var2 == 22) {
            this.aBoolean2046 = true;
        } else if (var2 == 23) {
            this.clipped1 = true;
        } else if (var2 == 24) {
            this.anInt818 = var1.readUnsignedShort();
            if (this.anInt818 == 65535) {
                this.anInt818 = -1;
            }
        } else if (var2 == 27) {
            this.anInt229 = 1;
        } else if (var2 == 28) {
            this.anInt233 = var1.readUnsignedByte();
        } else if (var2 == 29) {
            this.anInt234 = var1.method870();
        } else if (var2 == 39) {
            this.anInt765 = var1.method870() * 25;
        } else if (var2 >= 30 && var2 < 35) {
            this.actions[var2 - 30] = var1.method819();
            if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
                this.actions[var2 - 30] = null;
            }
        } else if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.colors = new short[var3];
            this.newColors = new short[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.colors[var4] = (short) var1.readUnsignedShort();
                this.newColors[var4] = (short) var1.readUnsignedShort();
            }
        } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.aShortArray2040 = new short[var3];
            this.aShortArray2044 = new short[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.aShortArray2040[var4] = (short) var1.readUnsignedShort();
                this.aShortArray2044[var4] = (short) var1.readUnsignedShort();
            }
        } else if (var2 == 62) {
            this.aBoolean2034 = true;
        } else if (var2 == 64) {
            this.clipped = false;
        } else if (var2 == 65) {
            this.anInt745 = var1.readUnsignedShort();
        } else if (var2 == 66) {
            this.anInt755 = var1.readUnsignedShort();
        } else if (var2 == 67) {
            this.anInt760 = var1.readUnsignedShort();
        } else if (var2 == 68) {
            this.anInt1257 = var1.readUnsignedShort();
        } else if (var2 == 69) {
            var1.readUnsignedByte();
        } else if (var2 == 70) {
            this.anInt757 = var1.readShort();
        } else if (var2 == 71) {
            this.anInt746 = var1.readShort();
        } else if (var2 == 72) {
            this.anInt744 = var1.readShort();
        } else if (var2 == 73) {
            this.aBoolean2037 = true;
        } else if (var2 == 74) {
            this.aBoolean2033 = true;
        } else if (var2 == 75) {
            this.anInt928 = var1.readUnsignedByte();
        } else if (var2 != 77 && var2 != 92) {
            if (var2 == 78) {
                this.anInt767 = var1.readUnsignedShort();
                this.anInt2032 = var1.readUnsignedByte();
            } else if (var2 == 79) {
                this.anInt2036 = var1.readUnsignedShort();
                this.anInt1864 = var1.readUnsignedShort();
                this.anInt2032 = var1.readUnsignedByte();
                var3 = var1.readUnsignedByte();
                this.anIntArray751 = new int[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.anIntArray751[var4] = var1.readUnsignedShort();
                }
            } else if (var2 == 81) {
                this.clipType = var1.readUnsignedByte() * 256;
            } else if (var2 == 82) {
                this.mapFunction = var1.readUnsignedShort();
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
            if (var2 == 92) {
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

    public int method1069(int var1, int var2) {
        return RS3CopyPastedNodeTable.getOrDefault(this.properties, var1, var2);
    }

    public final ObjectDefinition method1073() {
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

        return var2 != -1 ? Class5.method17(var2) : null;
    }

    public final boolean method1078(int var1) {
        if (this.anIntArray1276 != null) {
            for (int var4 = 0; var4 < this.anIntArray1276.length; ++var4) {
                if (this.anIntArray1276[var4] == var1) {
                    return aReferenceTable2039.method1102(this.anIntArray1271[var4] & '\uffff', 0);
                }
            }

            return true;
        }
        if (this.anIntArray1271 == null) {
            return true;
        }
        if (var1 != 10) {
            return true;
        }
        boolean var2 = true;

        for (int var3 = 0; var3 < this.anIntArray1271.length; ++var3) {
            var2 &= aReferenceTable2039.method1102(this.anIntArray1271[var3] & '\uffff', 0);
        }

        return var2;
    }

    public final boolean method1079() {
        if (this.anIntArray1271 == null) {
            return true;
        }
        boolean var1 = true;

        for (int var2 = 0; var2 < this.anIntArray1271.length; ++var2) {
            var1 &= aReferenceTable2039.method1102(this.anIntArray1271[var2] & '\uffff', 0);
        }

        return var1;
    }
}
