package com.jagex;

public abstract class ReferenceTable {
    static int maxContainerSize = 0;
    static GzipDecompresser aGzipDecompresser_2056 = new GzipDecompresser();
    public int anInt2048;
    boolean aBoolean2062;
    LookupTable entry;
    LookupTable[] children;
    int[] entryVersions;
    int[] childCounts;
    int[] entryCrcs;
    int[][] childNames;
    int[] anIntArray2050;
    Object[] anObjectArray2057;
    Object[][] buffer;
    int entryCount;
    int[][] childIndices;
    int[] entryIndices;
    boolean aBoolean2052;

    ReferenceTable(boolean var1, boolean var2) {
        this.aBoolean2052 = var1;
        this.aBoolean2062 = var2;
    }

    static void method408(int var0, CacheIndex var1, CacheReferenceTable var2) {
        CacheFile var3 = new CacheFile();
        var3.anInt204 = 1;
        var3.key = (long) var0;
        var3.index = var1;
        var3.table = var2;
        NodeDeque var4 = Class165.aNodeDeque2003;
        synchronized (Class165.aNodeDeque2003) {
            Class165.aNodeDeque2003.method997(var3);
        }

        Class85.method497();
    }

    static byte[] decodeContainer(byte[] var0) {
        Buffer buffer = new Buffer(var0);
        int type = buffer.readUnsignedByte();
        int compressed = buffer.readInt();
        if (compressed < 0 || maxContainerSize != 0 && compressed > maxContainerSize) {
            throw new RuntimeException();
        }
        if (type == 0) {
            byte[] data = new byte[compressed];
            buffer.read(data, 0, compressed);
            return data;
        }
        int len = buffer.readInt();
        if (len >= 0 && (maxContainerSize == 0 || len <= maxContainerSize)) {
            byte[] data = new byte[len];
            if (type == 1) {
                Bzip2Decompressor.decompress(data, len, var0, compressed, 9);
            } else {
                aGzipDecompresser_2056.decompress(buffer, data);
            }

            return data;
        }
        throw new RuntimeException();
    }

    public static CompressedImage readCompressedImage(ReferenceTable var0, int var1) {
        byte[] var2 = var0.method1093(var1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            IsaacCipher.method794(var2);
            var3 = true;
        }

        if (!var3) {
            return null;
        }
        CompressedImage var4 = new CompressedImage();
        var4.anInt221 = Class160.anInt1857;
        var4.anInt220 = Class191.anInt2246;
        var4.anInt327 = Class191.anIntArray2245[0];
        var4.anInt328 = Class191.anIntArray2248[0];
        var4.anInt206 = Class191.anIntArray2249[0];
        var4.anInt232 = Class109.anIntArray1305[0];
        var4.anIntArray342 = Class94.anIntArray1043;
        var4.aByteArray1361 = Class191.aByteArrayArray2247[0];
        Class191.anIntArray2245 = null;
        Class191.anIntArray2248 = null;
        Class191.anIntArray2249 = null;
        Class109.anIntArray1305 = null;
        Class94.anIntArray1043 = null;
        Class191.aByteArrayArray2247 = null;
        return var4;
    }

    void decode(byte[] var1) {
        int var2 = var1.length;
        int var3 = -1;

        int var4;
        for (var4 = 0; var4 < var2; ++var4) {
            var3 = var3 >>> 8 ^ Buffer.anIntArray340[(var3 ^ var1[var4]) & 255];
        }

        var3 = ~var3;
        this.anInt2048 = var3;
        Buffer var7 = new Buffer(decodeContainer(var1));
        var3 = var7.readUnsignedByte();
        if (var3 >= 5 && var3 <= 7) {
            if (var3 >= 6) {
                var7.readInt();
            }

            var4 = var7.readUnsignedByte();
            if (var3 >= 7) {
                this.entryCount = var7.method831();
            } else {
                this.entryCount = var7.readUnsignedShort();
            }

            int var8 = 0;
            int var9 = -1;
            this.entryIndices = new int[this.entryCount];
            int var10;
            if (var3 >= 7) {
                for (var10 = 0; var10 < this.entryCount; ++var10) {
                    this.entryIndices[var10] = var8 += var7.method831();
                    if (this.entryIndices[var10] > var9) {
                        var9 = this.entryIndices[var10];
                    }
                }
            } else {
                for (var10 = 0; var10 < this.entryCount; ++var10) {
                    this.entryIndices[var10] = var8 += var7.readUnsignedShort();
                    if (this.entryIndices[var10] > var9) {
                        var9 = this.entryIndices[var10];
                    }
                }
            }

            this.entryCrcs = new int[var9 + 1];
            this.entryVersions = new int[var9 + 1];
            this.childCounts = new int[var9 + 1];
            this.childIndices = new int[var9 + 1][];
            this.anObjectArray2057 = new Object[var9 + 1];
            this.buffer = new Object[var9 + 1][];
            if (var4 != 0) {
                this.anIntArray2050 = new int[var9 + 1];

                for (var10 = 0; var10 < this.entryCount; ++var10) {
                    this.anIntArray2050[this.entryIndices[var10]] = var7.readInt();
                }

                this.entry = new LookupTable(this.anIntArray2050);
            }

            for (var10 = 0; var10 < this.entryCount; ++var10) {
                this.entryCrcs[this.entryIndices[var10]] = var7.readInt();
            }

            for (var10 = 0; var10 < this.entryCount; ++var10) {
                this.entryVersions[this.entryIndices[var10]] = var7.readInt();
            }

            for (var10 = 0; var10 < this.entryCount; ++var10) {
                this.childCounts[this.entryIndices[var10]] = var7.readUnsignedShort();
            }

            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            if (var3 >= 7) {
                for (var10 = 0; var10 < this.entryCount; ++var10) {
                    var11 = this.entryIndices[var10];
                    var12 = this.childCounts[var11];
                    var8 = 0;
                    var13 = -1;
                    this.childIndices[var11] = new int[var12];

                    for (var14 = 0; var14 < var12; ++var14) {
                        var15 = this.childIndices[var11][var14] = var8 += var7.method831();
                        if (var15 > var13) {
                            var13 = var15;
                        }
                    }

                    this.buffer[var11] = new Object[var13 + 1];
                }
            } else {
                for (var10 = 0; var10 < this.entryCount; ++var10) {
                    var11 = this.entryIndices[var10];
                    var12 = this.childCounts[var11];
                    var8 = 0;
                    var13 = -1;
                    this.childIndices[var11] = new int[var12];

                    for (var14 = 0; var14 < var12; ++var14) {
                        var15 = this.childIndices[var11][var14] = var8 += var7.readUnsignedShort();
                        if (var15 > var13) {
                            var13 = var15;
                        }
                    }

                    this.buffer[var11] = new Object[var13 + 1];
                }
            }

            if (var4 != 0) {
                this.childNames = new int[var9 + 1][];
                this.children = new LookupTable[var9 + 1];

                for (var10 = 0; var10 < this.entryCount; ++var10) {
                    var11 = this.entryIndices[var10];
                    var12 = this.childCounts[var11];
                    this.childNames[var11] = new int[this.buffer[var11].length];

                    for (var13 = 0; var13 < var12; ++var13) {
                        this.childNames[var11][this.childIndices[var11][var13]] = var7.readInt();
                    }

                    this.children[var11] = new LookupTable(this.childNames[var11]);
                }
            }

        } else {
            throw new RuntimeException("");
        }
    }

    void method1091(int var1) {
    }

    public byte[] unpack(int var1, int var2, int[] var3) {
        if (var1 >= 0 && var1 < this.buffer.length && this.buffer[var1] != null && var2 >= 0 && var2 < this.buffer[var1].length) {
            if (this.buffer[var1][var2] == null) {
                boolean var4 = this.method1090(var1, var3);
                if (!var4) {
                    this.method1081(var1);
                    var4 = this.method1090(var1, var3);
                    if (!var4) {
                        return null;
                    }
                }
            }

            byte[] var5 = Class148.method1000(this.buffer[var1][var2], false);
            if (this.aBoolean2062) {
                this.buffer[var1][var2] = null;
            }

            return var5;
        }
        return null;
    }

    public boolean method1102(int var1, int var2) {
        if (var1 >= 0 && var1 < this.buffer.length && this.buffer[var1] != null && var2 >= 0 && var2 < this.buffer[var1].length) {
            if (this.buffer[var1][var2] != null) {
                return true;
            }
            if (this.anObjectArray2057[var1] != null) {
                return true;
            }
            this.method1081(var1);
            return this.anObjectArray2057[var1] != null;
        }
        return false;
    }

    public boolean method1106(int var1) {
        if (this.anObjectArray2057[var1] != null) {
            return true;
        }
        this.method1081(var1);
        return this.anObjectArray2057[var1] != null;
    }

    public boolean method1088() {
        boolean var1 = true;

        for (int var2 = 0; var2 < this.entryIndices.length; ++var2) {
            int var3 = this.entryIndices[var2];
            if (this.anObjectArray2057[var3] == null) {
                this.method1081(var3);
                if (this.anObjectArray2057[var3] == null) {
                    var1 = false;
                }
            }
        }

        return var1;
    }

    int method1083(int var1) {
        return this.anObjectArray2057[var1] != null ? 100 : 0;
    }

    public byte[] method1093(int var1) {
        if (this.buffer.length == 1) {
            return this.unpack(0, var1);
        }
        if (this.buffer[var1].length == 1) {
            return this.unpack(var1, 0);
        }
        throw new RuntimeException();
    }

    public byte[] get(int var1, int var2) {
        if (var1 >= 0 && var1 < this.buffer.length && this.buffer[var1] != null && var2 >= 0 && var2 < this.buffer[var1].length) {
            if (this.buffer[var1][var2] == null) {
                boolean var3 = this.method1090(var1, null);
                if (!var3) {
                    this.method1081(var1);
                    var3 = this.method1090(var1, null);
                    if (!var3) {
                        return null;
                    }
                }
            }

            return Class148.method1000(this.buffer[var1][var2], false);
        }
        return null;
    }

    public byte[] get(int var1) {
        if (this.buffer.length == 1) {
            return this.get(0, var1);
        }
        if (this.buffer[var1].length == 1) {
            return this.get(var1, 0);
        }
        throw new RuntimeException();
    }

    void method1081(int var1) {
    }

    public int[] method1087(int var1) {
        return this.childIndices[var1];
    }

    public int method1097() {
        return this.buffer.length;
    }

    public void method1103(String var1) {
        var1 = var1.toLowerCase();
        int var2 = this.entry.method913(ScriptEvent.method271(var1));
        if (var2 >= 0) {
            this.method1091(var2);
        }
    }

    public void method1096() {
        for (int var1 = 0; var1 < this.buffer.length; ++var1) {
            if (this.buffer[var1] != null) {
                for (int var2 = 0; var2 < this.buffer[var1].length; ++var2) {
                    this.buffer[var1][var2] = null;
                }
            }
        }

    }

    boolean method1090(int var1, int[] var2) {
        if (this.anObjectArray2057[var1] == null) {
            return false;
        }
        int var3 = this.childCounts[var1];
        int[] var4 = this.childIndices[var1];
        Object[] var5 = this.buffer[var1];
        boolean var6 = true;

        for (int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
                var6 = false;
                break;
            }
        }

        if (var6) {
            return true;
        }
        byte[] var8;
        if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
            var8 = Class148.method1000(this.anObjectArray2057[var1], true);
            Buffer var9 = new Buffer(var8);
            var9.method821(var2, 5, var9.payload.length);
        } else {
            var8 = Class148.method1000(this.anObjectArray2057[var1], false);
        }

        byte[] var20 = decodeContainer(var8);
        if (this.aBoolean2052) {
            this.anObjectArray2057[var1] = null;
        }

        if (var3 > 1) {
            int var10 = var20.length;
            --var10;
            int var11 = var20[var10] & 255;
            var10 -= var11 * var3 * 4;
            Buffer var12 = new Buffer(var20);
            int[] var13 = new int[var3];
            var12.caret = var10;

            int var15;
            int var16;
            for (int var14 = 0; var14 < var11; ++var14) {
                var15 = 0;

                for (var16 = 0; var16 < var3; ++var16) {
                    var15 += var12.readInt();
                    var13[var16] += var15;
                }
            }

            byte[][] var17 = new byte[var3][];

            for (var15 = 0; var15 < var3; ++var15) {
                var17[var15] = new byte[var13[var15]];
                var13[var15] = 0;
            }

            var12.caret = var10;
            var15 = 0;

            for (var16 = 0; var16 < var11; ++var16) {
                int var18 = 0;

                for (int var19 = 0; var19 < var3; ++var19) {
                    var18 += var12.readInt();
                    System.arraycopy(var20, var15, var17[var19], var13[var19], var18);
                    var13[var19] += var18;
                    var15 += var18;
                }
            }

            for (var16 = 0; var16 < var3; ++var16) {
                if (!this.aBoolean2062) {
                    var5[var4[var16]] = Class54.method349(var17[var16], false);
                } else {
                    var5[var4[var16]] = var17[var16];
                }
            }
        } else if (!this.aBoolean2062) {
            var5[var4[0]] = Class54.method349(var20, false);
        } else {
            var5[var4[0]] = var20;
        }

        return true;
    }

    public byte[] unpack(int var1, int var2) {
        return this.unpack(var1, var2, null);
    }

    public boolean method1082(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.entry.method913(ScriptEvent.method271(var1));
        if (var3 < 0) {
            return false;
        }
        int var4 = this.children[var3].method913(ScriptEvent.method271(var2));
        return var4 >= 0;
    }

    public byte[] method1105(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.entry.method913(ScriptEvent.method271(var1));
        int var4 = this.children[var3].method913(ScriptEvent.method271(var2));
        return this.unpack(var3, var4);
    }

    public boolean method1099(String var1) {
        var1 = var1.toLowerCase();
        int var2 = this.entry.method913(ScriptEvent.method271(var1));
        return this.method1106(var2);
    }

    public int method1086(String var1) {
        var1 = var1.toLowerCase();
        int var2 = this.entry.method913(ScriptEvent.method271(var1));
        return this.method1083(var2);
    }

    public int method1104(int var1, String var2) {
        var2 = var2.toLowerCase();
        return this.children[var1].method913(ScriptEvent.method271(var2));
    }

    public boolean method1100(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.entry.method913(ScriptEvent.method271(var1));
        int var4 = this.children[var3].method913(ScriptEvent.method271(var2));
        return this.method1102(var3, var4);
    }

    public void method1089(int var1) {
        for (int var2 = 0; var2 < this.buffer[var1].length; ++var2) {
            this.buffer[var1][var2] = null;
        }

    }

    public int method1084(String var1) {
        var1 = var1.toLowerCase();
        return this.entry.method913(ScriptEvent.method271(var1));
    }

    public int method1101(int var1) {
        return this.buffer[var1].length;
    }
}
