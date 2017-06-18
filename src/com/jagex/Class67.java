package com.jagex;

import java.io.EOFException;

public class Class67 {
    boolean[] aBooleanArray675;
    boolean[] aBooleanArray674;
    int[] anIntArray676;
    String[] aStringArray678;
    boolean aBoolean679 = false;
    long aLong677;

    Class67() {
        this.anIntArray676 = new int[Class73.aCacheReferenceTable741.method1101(19)];
        this.aStringArray678 = new String[Class73.aCacheReferenceTable741.method1101(15)];
        this.aBooleanArray675 = new boolean[this.anIntArray676.length];

        int var1;
        for (var1 = 0; var1 < this.anIntArray676.length; ++var1) {
            Node_Sub21_Sub16 var2 = Class163.method1031(var1);
            this.aBooleanArray675[var1] = var2.aBoolean316;
        }

        this.aBooleanArray674 = new boolean[this.aStringArray678.length];

        for (var1 = 0; var1 < this.aStringArray678.length; ++var1) {
            Node_Sub21_Sub22 var3 = (Node_Sub21_Sub22) Node_Sub21_Sub22.aReferenceCache2025.get((long) var1);
            Node_Sub21_Sub22 var5;
            if (var3 != null) {
                var5 = var3;
            } else {
                byte[] var4 = Class49.aReferenceTable374.unpack(15, var1);
                var3 = new Node_Sub21_Sub22();
                if (var4 != null) {
                    var3.method1052(new Buffer(var4));
                }

                Node_Sub21_Sub22.aReferenceCache2025.put(var3, (long) var1);
                var5 = var3;
            }

            this.aBooleanArray674[var1] = var5.aBoolean316;
        }

        for (var1 = 0; var1 < this.anIntArray676.length; ++var1) {
            this.anIntArray676[var1] = -1;
        }

        this.method400();
    }

    public static int method397(int var0, int var1, int var2) {
        var2 &= 3;
        if (var2 == 0) {
            return var1;
        }
        if (var2 == 1) {
            return 7 - var0;
        }
        return var2 == 2 ? 7 - var1 : var0;
    }

    void method402(int var1, String var2) {
        this.aStringArray678[var1] = var2;
        if (this.aBooleanArray674[var1]) {
            this.aBoolean679 = true;
        }

    }

    void method403() {
        int var1;
        for (var1 = 0; var1 < this.anIntArray676.length; ++var1) {
            if (!this.aBooleanArray675[var1]) {
                this.anIntArray676[var1] = -1;
            }
        }

        for (var1 = 0; var1 < this.aStringArray678.length; ++var1) {
            if (!this.aBooleanArray674[var1]) {
                this.aStringArray678[var1] = null;
            }
        }

    }

    void method404() {
        Class82 var1 = this.method405(true);

        try {
            int var2 = 3;
            int var3 = 0;

            int var4;
            for (var4 = 0; var4 < this.anIntArray676.length; ++var4) {
                if (this.aBooleanArray675[var4] && this.anIntArray676[var4] != -1) {
                    var2 += 6;
                    ++var3;
                }
            }

            var2 += 2;
            var4 = 0;

            for (int var5 = 0; var5 < this.aStringArray678.length; ++var5) {
                if (this.aBooleanArray674[var5] && this.aStringArray678[var5] != null) {
                    var2 += Class27.method179(this.aStringArray678[var5]) + 2;
                    ++var4;
                }
            }

            Buffer var6 = new Buffer(var2);
            var6.method451(1);
            var6.method755(var3);

            int var7;
            for (var7 = 0; var7 < this.anIntArray676.length; ++var7) {
                if (this.aBooleanArray675[var7] && this.anIntArray676[var7] != -1) {
                    var6.method755(var7);
                    var6.method869(this.anIntArray676[var7]);
                }
            }

            var6.method755(var4);

            for (var7 = 0; var7 < this.aStringArray678.length; ++var7) {
                if (this.aBooleanArray674[var7] && this.aStringArray678[var7] != null) {
                    var6.method755(var7);
                    var6.method865(this.aStringArray678[var7]);
                }
            }

            var1.method478(var6.payload, 0, var6.caret);
        } catch (Exception var17) {
        } finally {
            try {
                var1.method476();
            } catch (Exception var16) {
            }

        }

        this.aBoolean679 = false;
        this.aLong677 = Class124.method873();
    }

    void method400() {
        Class82 var1 = this.method405(false);

        label202:
        {
            try {
                byte[] var2 = new byte[(int) var1.method475()];

                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method477(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }

                Buffer var5 = new Buffer(var2);
                if (var5.payload.length - var5.caret >= 1) {
                    int var6 = var5.readUnsignedByte();
                    if (var6 >= 0 && var6 <= 1) {
                        int var7 = var5.readUnsignedShort();

                        int var8;
                        int var9;
                        int var10;
                        for (var8 = 0; var8 < var7; ++var8) {
                            var9 = var5.readUnsignedShort();
                            var10 = var5.method835();
                            if (this.aBooleanArray675[var9]) {
                                this.anIntArray676[var9] = var10;
                            }
                        }

                        var8 = var5.readUnsignedShort();
                        var9 = 0;

                        while (true) {
                            if (var9 >= var8) {
                                break label202;
                            }

                            var10 = var5.readUnsignedShort();
                            String var11 = var5.method819();
                            if (this.aBooleanArray674[var10]) {
                                this.aStringArray678[var10] = var11;
                            }

                            ++var9;
                        }
                    }

                    return;
                }
            } catch (Exception var24) {
                break label202;
            } finally {
                try {
                    var1.method476();
                } catch (Exception var23) {
                }

            }

            return;
        }

        this.aBoolean679 = false;
    }

    void method407() {
        if (this.aBoolean679 && this.aLong677 < Class124.method873() - 60000L) {
            this.method404();
        }

    }

    boolean method399() {
        return this.aBoolean679;
    }

    Class82 method405(boolean var1) {
        return TextureProviderImpl.method502("2", Client.aClass162_1468.aString1955, var1);
    }

    int method406(int var1) {
        return this.anIntArray676[var1];
    }

    void method398(int var1, int var2) {
        this.anIntArray676[var1] = var2;
        if (this.aBooleanArray675[var1]) {
            this.aBoolean679 = true;
        }

    }

    String method401(int var1) {
        return this.aStringArray678[var1];
    }
}
