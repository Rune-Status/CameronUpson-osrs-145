package com.jagex;

import java.io.IOException;

public final class TilePaint {
    int anInt1153;
    int anInt1159;
    int anInt1155;
    int anInt1154;
    int texture;
    boolean flatShade = true;
    int rgb;

    TilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.anInt1153 = var1;
        this.anInt1159 = var2;
        this.anInt1155 = var3;
        this.anInt1154 = var4;
        this.texture = var5;
        this.rgb = var6;
        this.flatShade = var7;
    }

    static void method663() {
        for (PendingSpawn var0 = Client.pendingSpawns.method995(); var0 != null; var0 = Client.pendingSpawns.next()) {
            if (var0.hitpoints > 0) {
                --var0.hitpoints;
            }

            if (var0.hitpoints == 0) {
                if (var0.anInt327 < 0 || Login.method413(var0.anInt327, var0.anInt221)) {
                    Class33.method219(var0.level, var0.type, var0.sceneX, var0.sceneY, var0.anInt327, var0.anInt328, var0.anInt221);
                    var0.unlink();
                }
            } else {
                if (var0.delay > 0) {
                    --var0.delay;
                }

                if (var0.delay == 0 && var0.sceneX >= 1 && var0.sceneY >= 1 && var0.sceneX <= 102 && var0.sceneY <= 102 && (var0.id < 0 || Login.method413(var0.id, var0.anInt214))) {
                    Class33.method219(var0.level, var0.type, var0.sceneX, var0.sceneY, var0.id, var0.orientation, var0.anInt214);
                    var0.delay = -1;
                    if (var0.anInt327 == var0.id && var0.anInt327 == -1) {
                        var0.unlink();
                    } else if (var0.anInt327 == var0.id && var0.orientation == var0.anInt328 && var0.anInt221 == var0.anInt214) {
                        var0.unlink();
                    }
                }
            }
        }

    }

    public static boolean method662() {
        long var0 = Class124.method873();
        int var2 = (int) (var0 - Class168.aLong2072);
        Class168.aLong2072 = var0;
        if (var2 > 200) {
            var2 = 200;
        }

        Class168.anInt2079 += var2;
        if (Class168.anInt2083 == 0 && Class168.anInt2077 == 0 && Class168.anInt2070 == 0 && Class168.anInt2087 == 0) {
            return true;
        }
        if (Class168.aSocket2082 == null) {
            return false;
        }
        try {
            if (Class168.anInt2079 > 30000) {
                throw new IOException();
            }
            Node_Sub21_Sub6 var3;
            Buffer var4;
            while (Class168.anInt2077 < 20 && Class168.anInt2087 > 0) {
                var3 = Class168.aNodeTable2086.first();
                var4 = new Buffer(4);
                var4.method451(1);
                var4.method867((int) var3.key);
                Class168.aSocket2082.method885(var4.payload, 0, 4);
                Class168.aNodeTable2089.put(var3, var3.key);
                --Class168.anInt2087;
                ++Class168.anInt2077;
            }

            while (Class168.anInt2083 < 20 && Class168.anInt2070 > 0) {
                var3 = Class168.aNodeQueue2076.method941();
                var4 = new Buffer(4);
                var4.method451(0);
                var4.method867((int) var3.key);
                Class168.aSocket2082.method885(var4.payload, 0, 4);
                var3.method977();
                Class168.aNodeTable2080.put(var3, var3.key);
                --Class168.anInt2070;
                ++Class168.anInt2083;
            }

            for (int var5 = 0; var5 < 100; ++var5) {
                int var6 = Class168.aSocket2082.method884();
                if (var6 < 0) {
                    throw new IOException();
                }

                if (var6 == 0) {
                    break;
                }

                Class168.anInt2079 = 0;
                byte var7 = 0;
                if (Class19.aNode_Sub21_Sub6_137 == null) {
                    var7 = 8;
                } else if (Class168.anInt2085 == 0) {
                    var7 = 1;
                }

                int var8;
                int var9;
                int var10;
                int var12;
                if (var7 > 0) {
                    var8 = var7 - Class168.aBuffer2074.caret;
                    if (var8 > var6) {
                        var8 = var6;
                    }

                    Class168.aSocket2082.method883(Class168.aBuffer2074.payload, Class168.aBuffer2074.caret, var8);
                    if (Class168.aByte2071 != 0) {
                        for (var9 = 0; var9 < var8; ++var9) {
                            Class168.aBuffer2074.payload[var9 + Class168.aBuffer2074.caret] ^= Class168.aByte2071;
                        }
                    }

                    Class168.aBuffer2074.caret += var8;
                    if (Class168.aBuffer2074.caret < var7) {
                        break;
                    }

                    if (Class19.aNode_Sub21_Sub6_137 == null) {
                        Class168.aBuffer2074.caret = 0;
                        var9 = Class168.aBuffer2074.readUnsignedByte();
                        var10 = Class168.aBuffer2074.readUnsignedShort();
                        int var11 = Class168.aBuffer2074.readUnsignedByte();
                        var12 = Class168.aBuffer2074.method835();
                        long var13 = (long) ((var9 << 16) + var10);
                        Node_Sub21_Sub6 var15 = Class168.aNodeTable2089.lookup(var13);
                        Class117.aBoolean1345 = true;
                        if (var15 == null) {
                            var15 = Class168.aNodeTable2080.lookup(var13);
                            Class117.aBoolean1345 = false;
                        }

                        if (var15 == null) {
                            throw new IOException();
                        }

                        int var16 = var11 == 0 ? 5 : 9;
                        Class19.aNode_Sub21_Sub6_137 = var15;
                        Class25.aBuffer177 = new Buffer(var12 + var16 + Class19.aNode_Sub21_Sub6_137.aByte2002);
                        Class25.aBuffer177.method451(var11);
                        Class25.aBuffer177.method869(var12);
                        Class168.anInt2085 = 8;
                        Class168.aBuffer2074.caret = 0;
                    } else if (Class168.anInt2085 == 0) {
                        if (Class168.aBuffer2074.payload[0] == -1) {
                            Class168.anInt2085 = 1;
                            Class168.aBuffer2074.caret = 0;
                        } else {
                            Class19.aNode_Sub21_Sub6_137 = null;
                        }
                    }
                } else {
                    var8 = Class25.aBuffer177.payload.length - Class19.aNode_Sub21_Sub6_137.aByte2002;
                    var9 = 512 - Class168.anInt2085;
                    if (var9 > var8 - Class25.aBuffer177.caret) {
                        var9 = var8 - Class25.aBuffer177.caret;
                    }

                    if (var9 > var6) {
                        var9 = var6;
                    }

                    Class168.aSocket2082.method883(Class25.aBuffer177.payload, Class25.aBuffer177.caret, var9);
                    if (Class168.aByte2071 != 0) {
                        for (var10 = 0; var10 < var9; ++var10) {
                            Class25.aBuffer177.payload[var10 + Class25.aBuffer177.caret] ^= Class168.aByte2071;
                        }
                    }

                    Class25.aBuffer177.caret += var9;
                    Class168.anInt2085 += var9;
                    if (var8 == Class25.aBuffer177.caret) {
                        if (16711935L == Class19.aNode_Sub21_Sub6_137.key) {
                            Class168.aBuffer2078 = Class25.aBuffer177;

                            for (var10 = 0; var10 < 256; ++var10) {
                                CacheReferenceTable var17 = Class168.aCacheReferenceTableArray2075[var10];
                                if (var17 != null) {
                                    Class168.aBuffer2078.caret = var10 * 8 + 5;
                                    var12 = Class168.aBuffer2078.method835();
                                    int var18 = Class168.aBuffer2078.method835();
                                    var17.method1134(var12, var18);
                                }
                            }
                        } else {
                            Class168.aCRC32_2084.reset();
                            Class168.aCRC32_2084.update(Class25.aBuffer177.payload, 0, var8);
                            var10 = (int) Class168.aCRC32_2084.getValue();
                            if (Class19.aNode_Sub21_Sub6_137.anInt209 != var10) {
                                try {
                                    Class168.aSocket2082.method882();
                                } catch (Exception var20) {
                                }

                                ++Class168.anInt2088;
                                Class168.aSocket2082 = null;
                                Class168.aByte2071 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                return false;
                            }

                            Class168.anInt2088 = 0;
                            Class168.anInt2069 = 0;
                            Class19.aNode_Sub21_Sub6_137.aCacheReferenceTable2001.method1135((int) (Class19.aNode_Sub21_Sub6_137.key & 65535L), Class25.aBuffer177.payload, (Class19.aNode_Sub21_Sub6_137.key & 16711680L) == 16711680L, Class117.aBoolean1345);
                        }

                        Class19.aNode_Sub21_Sub6_137.unlink();
                        if (Class117.aBoolean1345) {
                            --Class168.anInt2077;
                        } else {
                            --Class168.anInt2083;
                        }

                        Class168.anInt2085 = 0;
                        Class19.aNode_Sub21_Sub6_137 = null;
                        Class25.aBuffer177 = null;
                    } else {
                        if (Class168.anInt2085 != 512) {
                            break;
                        }

                        Class168.anInt2085 = 0;
                    }
                }
            }

            return true;
        } catch (IOException var21) {
            try {
                Class168.aSocket2082.method882();
            } catch (Exception var19) {
            }

            ++Class168.anInt2069;
            Class168.aSocket2082 = null;
            return false;
        }
    }
}
