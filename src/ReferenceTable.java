public abstract class ReferenceTable {
    static int anInt2060 = 0;
    static Class124 aClass124_2056 = new Class124();
    public int anInt2048;
    boolean aBoolean2062;
    IdentityTable entry;
    IdentityTable[] children;
    int[] anIntArray2064;
    int[] anIntArray2054;
    int[] anIntArray2063;
    int[][] anIntArrayArray2051;
    int[] anIntArray2050;
    Object[] anObjectArray2057;
    Object[][] buffer;
    int anInt2058;
    int[][] anIntArrayArray2053;
    int[] anIntArray2055;
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

    void method1094(byte[] var1) {
        int var2 = var1.length;
        int var3 = -1;

        int var4;
        for (var4 = 0; var4 < var2; ++var4) {
            var3 = var3 >>> 8 ^ Buffer.anIntArray340[(var3 ^ var1[var4]) & 255];
        }

        var3 = ~var3;
        this.anInt2048 = var3;
        Buffer var7 = new Buffer(Class150.method1003(var1));
        var3 = var7.readUnsignedByte();
        if (var3 >= 5 && var3 <= 7) {
            if (var3 >= 6) {
                var7.method835();
            }

            var4 = var7.readUnsignedByte();
            if (var3 >= 7) {
                this.anInt2058 = var7.method831();
            } else {
                this.anInt2058 = var7.readUnsignedShort();
            }

            int var8 = 0;
            int var9 = -1;
            this.anIntArray2055 = new int[this.anInt2058];
            int var10;
            if (var3 >= 7) {
                for (var10 = 0; var10 < this.anInt2058; ++var10) {
                    this.anIntArray2055[var10] = var8 += var7.method831();
                    if (this.anIntArray2055[var10] > var9) {
                        var9 = this.anIntArray2055[var10];
                    }
                }
            } else {
                for (var10 = 0; var10 < this.anInt2058; ++var10) {
                    this.anIntArray2055[var10] = var8 += var7.readUnsignedShort();
                    if (this.anIntArray2055[var10] > var9) {
                        var9 = this.anIntArray2055[var10];
                    }
                }
            }

            this.anIntArray2063 = new int[var9 + 1];
            this.anIntArray2064 = new int[var9 + 1];
            this.anIntArray2054 = new int[var9 + 1];
            this.anIntArrayArray2053 = new int[var9 + 1][];
            this.anObjectArray2057 = new Object[var9 + 1];
            this.buffer = new Object[var9 + 1][];
            if (var4 != 0) {
                this.anIntArray2050 = new int[var9 + 1];

                for (var10 = 0; var10 < this.anInt2058; ++var10) {
                    this.anIntArray2050[this.anIntArray2055[var10]] = var7.method835();
                }

                this.entry = new IdentityTable(this.anIntArray2050);
            }

            for (var10 = 0; var10 < this.anInt2058; ++var10) {
                this.anIntArray2063[this.anIntArray2055[var10]] = var7.method835();
            }

            for (var10 = 0; var10 < this.anInt2058; ++var10) {
                this.anIntArray2064[this.anIntArray2055[var10]] = var7.method835();
            }

            for (var10 = 0; var10 < this.anInt2058; ++var10) {
                this.anIntArray2054[this.anIntArray2055[var10]] = var7.readUnsignedShort();
            }

            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            if (var3 >= 7) {
                for (var10 = 0; var10 < this.anInt2058; ++var10) {
                    var11 = this.anIntArray2055[var10];
                    var12 = this.anIntArray2054[var11];
                    var8 = 0;
                    var13 = -1;
                    this.anIntArrayArray2053[var11] = new int[var12];

                    for (var14 = 0; var14 < var12; ++var14) {
                        var15 = this.anIntArrayArray2053[var11][var14] = var8 += var7.method831();
                        if (var15 > var13) {
                            var13 = var15;
                        }
                    }

                    this.buffer[var11] = new Object[var13 + 1];
                }
            } else {
                for (var10 = 0; var10 < this.anInt2058; ++var10) {
                    var11 = this.anIntArray2055[var10];
                    var12 = this.anIntArray2054[var11];
                    var8 = 0;
                    var13 = -1;
                    this.anIntArrayArray2053[var11] = new int[var12];

                    for (var14 = 0; var14 < var12; ++var14) {
                        var15 = this.anIntArrayArray2053[var11][var14] = var8 += var7.readUnsignedShort();
                        if (var15 > var13) {
                            var13 = var15;
                        }
                    }

                    this.buffer[var11] = new Object[var13 + 1];
                }
            }

            if (var4 != 0) {
                this.anIntArrayArray2051 = new int[var9 + 1][];
                this.children = new IdentityTable[var9 + 1];

                for (var10 = 0; var10 < this.anInt2058; ++var10) {
                    var11 = this.anIntArray2055[var10];
                    var12 = this.anIntArray2054[var11];
                    this.anIntArrayArray2051[var11] = new int[this.buffer[var11].length];

                    for (var13 = 0; var13 < var12; ++var13) {
                        this.anIntArrayArray2051[var11][this.anIntArrayArray2053[var11][var13]] = var7.method835();
                    }

                    this.children[var11] = new IdentityTable(this.anIntArrayArray2051[var11]);
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
        } else {
            return null;
        }
    }

    public boolean method1102(int var1, int var2) {
        if (var1 >= 0 && var1 < this.buffer.length && this.buffer[var1] != null && var2 >= 0 && var2 < this.buffer[var1].length) {
            if (this.buffer[var1][var2] != null) {
                return true;
            } else if (this.anObjectArray2057[var1] != null) {
                return true;
            } else {
                this.method1081(var1);
                return this.anObjectArray2057[var1] != null;
            }
        } else {
            return false;
        }
    }

    public boolean method1106(int var1) {
        if (this.anObjectArray2057[var1] != null) {
            return true;
        } else {
            this.method1081(var1);
            return this.anObjectArray2057[var1] != null;
        }
    }

    public boolean method1088() {
        boolean var1 = true;

        for (int var2 = 0; var2 < this.anIntArray2055.length; ++var2) {
            int var3 = this.anIntArray2055[var2];
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
            return this.method1085(0, var1);
        } else if (this.buffer[var1].length == 1) {
            return this.method1085(var1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public byte[] method1095(int var1, int var2) {
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
        } else {
            return null;
        }
    }

    public byte[] method1092(int var1) {
        if (this.buffer.length == 1) {
            return this.method1095(0, var1);
        } else if (this.buffer[var1].length == 1) {
            return this.method1095(var1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    void method1081(int var1) {
    }

    public int[] method1087(int var1) {
        return this.anIntArrayArray2053[var1];
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
        } else {
            int var3 = this.anIntArray2054[var1];
            int[] var4 = this.anIntArrayArray2053[var1];
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
            } else {
                byte[] var8;
                if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
                    var8 = Class148.method1000(this.anObjectArray2057[var1], true);
                    Buffer var9 = new Buffer(var8);
                    var9.method821(var2, 5, var9.payload.length);
                } else {
                    var8 = Class148.method1000(this.anObjectArray2057[var1], false);
                }

                byte[] var20 = Class150.method1003(var8);
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
                            var15 += var12.method835();
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
                            var18 += var12.method835();
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
        }
    }

    public byte[] method1085(int var1, int var2) {
        return this.unpack(var1, var2, null);
    }

    public boolean method1082(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.entry.method913(ScriptEvent.method271(var1));
        if (var3 < 0) {
            return false;
        } else {
            int var4 = this.children[var3].method913(ScriptEvent.method271(var2));
            return var4 >= 0;
        }
    }

    public byte[] method1105(String var1, String var2) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var3 = this.entry.method913(ScriptEvent.method271(var1));
        int var4 = this.children[var3].method913(ScriptEvent.method271(var2));
        return this.method1085(var3, var4);
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
