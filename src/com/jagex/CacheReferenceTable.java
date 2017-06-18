package com.jagex;

import java.util.zip.CRC32;

public class CacheReferenceTable extends ReferenceTable {
    static CRC32 aCRC32_2103 = new CRC32();
    int anInt2105;
    CacheIndex aCacheIndex2109;
    int anInt2101;
    boolean aBoolean2100 = false;
    int anInt2102 = -1;
    volatile boolean[] aBooleanArray2108;
    int anInt2104;
    volatile boolean aBoolean2106 = false;
    CacheIndex aCacheIndex2107;

    public CacheReferenceTable(CacheIndex var1, CacheIndex var2, int var3, boolean var4, boolean var5, boolean var6) {
        super(var4, var5);
        this.aCacheIndex2109 = var1;
        this.aCacheIndex2107 = var2;
        this.anInt2101 = var3;
        this.aBoolean2100 = var6;
        int var8 = this.anInt2101;
        if (Class168.aBuffer2078 != null) {
            Class168.aBuffer2078.caret = var8 * 8 + 5;
            int var9 = Class168.aBuffer2078.method835();
            int var10 = Class168.aBuffer2078.method835();
            this.method1134(var9, var10);
        } else {
            method310(null, 255, 255, 0, (byte) 0, true);
            Class168.aCacheReferenceTableArray2075[var8] = this;
        }

    }

    static void method310(CacheReferenceTable var0, int var1, int var2, int var3, byte var4, boolean var5) {
        long var6 = (long) ((var1 << 16) + var2);
        Node_Sub21_Sub6 var8 = Class168.aNodeTable2086.lookup(var6);
        if (var8 == null) {
            var8 = Class168.aNodeTable2089.lookup(var6);
            if (var8 == null) {
                var8 = Class168.aNodeTable2073.lookup(var6);
                if (var8 != null) {
                    if (var5) {
                        var8.method977();
                        Class168.aNodeTable2086.put(var8, var6);
                        --Class168.anInt2070;
                        ++Class168.anInt2087;
                    }

                } else {
                    if (!var5) {
                        var8 = Class168.aNodeTable2080.lookup(var6);
                        if (var8 != null) {
                            return;
                        }
                    }

                    var8 = new Node_Sub21_Sub6();
                    var8.aCacheReferenceTable2001 = var0;
                    var8.anInt209 = var3;
                    var8.aByte2002 = var4;
                    if (var5) {
                        Class168.aNodeTable2086.put(var8, var6);
                        ++Class168.anInt2087;
                    } else {
                        Class168.aNodeQueue2076.method940(var8);
                        Class168.aNodeTable2073.put(var8, var6);
                        ++Class168.anInt2070;
                    }

                }
            }
        }
    }

    public int method1130() {
        if (this.aBoolean2106) {
            return 100;
        } else if (this.anObjectArray2057 != null) {
            return 99;
        } else {
            int var1 = Class57.method360(255, this.anInt2101);
            if (var1 >= 100) {
                var1 = 99;
            }

            return var1;
        }
    }

    void method1091(int var1) {
        int var2 = this.anInt2101;
        long var3 = (long) (var1 + (var2 << 16));
        Node_Sub21_Sub6 var5 = Class168.aNodeTable2073.lookup(var3);
        if (var5 != null) {
            Class168.aNodeQueue2076.method944(var5);
        }

    }

    void method1081(int var1) {
        if (this.aCacheIndex2109 != null && this.aBooleanArray2108 != null && this.aBooleanArray2108[var1]) {
            CacheIndex var2 = this.aCacheIndex2109;
            byte[] var4 = null;
            NodeDeque var5 = Class165.aNodeDeque2003;
            synchronized (Class165.aNodeDeque2003) {
                for (CacheFile var6 = Class165.aNodeDeque2003.method995(); var6 != null; var6 = Class165.aNodeDeque2003.next()) {
                    if ((long) var1 == var6.key && var2 == var6.index && var6.anInt204 == 0) {
                        var4 = var6.buffer;
                        break;
                    }
                }
            }

            if (var4 != null) {
                this.method1131(var2, var1, var4, true);
            } else {
                byte[] var9 = var2.method801(var1);
                this.method1131(var2, var1, var9, true);
            }
        } else {
            method310(this, this.anInt2101, var1, this.anIntArray2063[var1], (byte) 2, true);
        }

    }

    int method1083(int var1) {
        if (this.anObjectArray2057[var1] != null) {
            return 100;
        } else {
            return this.aBooleanArray2108[var1] ? 100 : Class57.method360(this.anInt2101, var1);
        }
    }

    public void method1131(CacheIndex var1, int var2, byte[] var3, boolean var4) {
        int var5;
        if (var1 == this.aCacheIndex2107) {
            if (this.aBoolean2106) {
                throw new RuntimeException();
            }

            if (var3 == null) {
                method310(this, 255, this.anInt2101, this.anInt2104, (byte) 0, true);
                return;
            }

            aCRC32_2103.reset();
            aCRC32_2103.update(var3, 0, var3.length);
            var5 = (int) aCRC32_2103.getValue();
            Buffer var7 = new Buffer(Class150.method1003(var3));
            int var8 = var7.readUnsignedByte();
            if (var8 != 5 && var8 != 6) {
                throw new RuntimeException(var8 + "," + this.anInt2101 + "," + var2);
            }

            int var9 = 0;
            if (var8 >= 6) {
                var9 = var7.method835();
            }

            if (var5 != this.anInt2104 || this.anInt2105 != var9) {
                method310(this, 255, this.anInt2101, this.anInt2104, (byte) 0, true);
                return;
            }

            this.method1094(var3);
            this.method1133();
        } else {
            if (!var4 && var2 == this.anInt2102) {
                this.aBoolean2106 = true;
            }

            if (var3 == null || var3.length <= 2) {
                this.aBooleanArray2108[var2] = false;
                if (this.aBoolean2100 || var4) {
                    method310(this, this.anInt2101, var2, this.anIntArray2063[var2], (byte) 2, var4);
                }

                return;
            }

            aCRC32_2103.reset();
            aCRC32_2103.update(var3, 0, var3.length - 2);
            var5 = (int) aCRC32_2103.getValue();
            int var6 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
            if (this.anIntArray2063[var2] != var5 || this.anIntArray2064[var2] != var6) {
                this.aBooleanArray2108[var2] = false;
                if (this.aBoolean2100 || var4) {
                    method310(this, this.anInt2101, var2, this.anIntArray2063[var2], (byte) 2, var4);
                }

                return;
            }

            this.aBooleanArray2108[var2] = true;
            if (var4) {
                this.anObjectArray2057[var2] = Class54.method349(var3, false);
            }
        }

    }

    void method1133() {
        this.aBooleanArray2108 = new boolean[this.anObjectArray2057.length];

        int var1;
        for (var1 = 0; var1 < this.aBooleanArray2108.length; ++var1) {
            this.aBooleanArray2108[var1] = false;
        }

        if (this.aCacheIndex2109 == null) {
            this.aBoolean2106 = true;
        } else {
            this.anInt2102 = -1;

            for (var1 = 0; var1 < this.aBooleanArray2108.length; ++var1) {
                if (this.anIntArray2054[var1] > 0) {
                    ReferenceTable.method408(var1, this.aCacheIndex2109, this);
                    this.anInt2102 = var1;
                }
            }

            if (this.anInt2102 == -1) {
                this.aBoolean2106 = true;
            }

        }
    }

    public int method1132() {
        int var1 = 0;
        int var2 = 0;

        int var3;
        for (var3 = 0; var3 < this.anObjectArray2057.length; ++var3) {
            if (this.anIntArray2054[var3] > 0) {
                var1 += 100;
                var2 += this.method1083(var3);
            }
        }

        if (var1 == 0) {
            return 100;
        } else {
            var3 = var2 * 100 / var1;
            return var3;
        }
    }

    void method1135(int var1, byte[] var2, boolean var3, boolean var4) {
        if (var3) {
            if (this.aBoolean2106) {
                throw new RuntimeException();
            }

            if (this.aCacheIndex2107 != null) {
                int var5 = this.anInt2101;
                CacheIndex var6 = this.aCacheIndex2107;
                CacheFile var7 = new CacheFile();
                var7.anInt204 = 0;
                var7.key = (long) var5;
                var7.buffer = var2;
                var7.index = var6;
                NodeDeque var8 = Class165.aNodeDeque2003;
                synchronized (Class165.aNodeDeque2003) {
                    Class165.aNodeDeque2003.method997(var7);
                }

                Object var21 = Class165.anObject2005;
                synchronized (Class165.anObject2005) {
                    if (Class165.anInt2004 == 0) {
                        Class49.aThread376 = new Thread(new Class165());
                        Class49.aThread376.setDaemon(true);
                        Class49.aThread376.start();
                        Class49.aThread376.setPriority(5);
                    }

                    Class165.anInt2004 = 600;
                }
            }

            this.method1094(var2);
            this.method1133();
        } else {
            var2[var2.length - 2] = (byte) (this.anIntArray2064[var1] >> 8);
            var2[var2.length - 1] = (byte) this.anIntArray2064[var1];
            if (this.aCacheIndex2109 != null) {
                CacheIndex var9 = this.aCacheIndex2109;
                CacheFile var18 = new CacheFile();
                var18.anInt204 = 0;
                var18.key = (long) var1;
                var18.buffer = var2;
                var18.index = var9;
                NodeDeque var19 = Class165.aNodeDeque2003;
                synchronized (Class165.aNodeDeque2003) {
                    Class165.aNodeDeque2003.method997(var18);
                }

                Object var20 = Class165.anObject2005;
                synchronized (Class165.anObject2005) {
                    if (Class165.anInt2004 == 0) {
                        Class49.aThread376 = new Thread(new Class165());
                        Class49.aThread376.setDaemon(true);
                        Class49.aThread376.start();
                        Class49.aThread376.setPriority(5);
                    }

                    Class165.anInt2004 = 600;
                }

                this.aBooleanArray2108[var1] = true;
            }

            if (var4) {
                this.anObjectArray2057[var1] = Class54.method349(var2, false);
            }
        }

    }

    void method1134(int var1, int var2) {
        this.anInt2104 = var1;
        this.anInt2105 = var2;
        if (this.aCacheIndex2107 != null) {
            int var3 = this.anInt2101;
            CacheIndex var4 = this.aCacheIndex2107;
            byte[] var6 = null;
            NodeDeque var7 = Class165.aNodeDeque2003;
            synchronized (Class165.aNodeDeque2003) {
                for (CacheFile var8 = Class165.aNodeDeque2003.method995(); var8 != null; var8 = Class165.aNodeDeque2003.next()) {
                    if ((long) var3 == var8.key && var8.index == var4 && var8.anInt204 == 0) {
                        var6 = var8.buffer;
                        break;
                    }
                }
            }

            if (var6 != null) {
                this.method1131(var4, var3, var6, true);
            } else {
                byte[] var11 = var4.method801(var3);
                this.method1131(var4, var3, var11, true);
            }
        } else {
            method310(this, 255, this.anInt2101, this.anInt2104, (byte) 0, true);
        }

    }
}
