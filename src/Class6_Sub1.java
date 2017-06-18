public class Class6_Sub1 extends Class6 {
    int anInt171;
    int anInt168;
    int anInt170;
    int anInt169;

    static int method167(int var0, int var1) {
        if (var0 == -1) {
            return 12345678;
        } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return (var0 & 'ﾀ') + var1;
        }
    }

    static RuneScript method158(int var0) {
        RuneScript var1 = (RuneScript) RuneScript.aReferenceCache664.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = ScriptEvent.aCacheReferenceTable322.method1085(var0, 0);
            if (var2 == null) {
                return null;
            } else {
                var1 = Class22.method150(var2);
                RuneScript.aReferenceCache664.method975(var1, (long) var0);
                return var1;
            }
        }
    }

    public static boolean method159(ReferenceTable var0, ReferenceTable var1) {
        Node_Sub21_Sub15.aReferenceTable2012 = var1;
        if (!var0.method1088()) {
            return false;
        } else {
            Class126.anInt1369 = var0.method1101(35);
            Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093 = new Node_Sub21_Sub15[Class126.anInt1369];

            for (int var2 = 0; var2 < Class126.anInt1369; ++var2) {
                byte[] var3 = var0.method1085(35, var2);
                if (var3 != null) {
                    Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var2] = new Node_Sub21_Sub15(var2);
                    Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var2].method1052(new Buffer(var3));
                    Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var2].method935();
                }
            }

            return true;
        }
    }

    void method157(Buffer var1, Buffer var2) {
        int var3 = var2.readUnsignedByte();
        if (Class14.aClass14_117.anInt115 != var3) {
            throw new IllegalStateException("");
        } else {
            this.anInt45 = var2.readUnsignedByte();
            this.anInt48 = var2.readUnsignedByte();
            this.anInt40 = var2.readUnsignedShort();
            this.anInt49 = var2.readUnsignedShort();
            this.anInt169 = var2.readUnsignedByte();
            this.anInt171 = var2.readUnsignedByte();
            this.anInt43 = var2.readUnsignedShort();
            this.anInt42 = var2.readUnsignedShort();
            this.anInt168 = var2.readUnsignedByte();
            this.anInt170 = var2.readUnsignedByte();
            this.anInt48 = Math.min(this.anInt48, 4);
            this.aShortArrayArrayArray47 = new short[1][64][64];
            this.aShortArrayArrayArray46 = new short[this.anInt48][64][64];
            this.aByteArrayArrayArray44 = new byte[this.anInt48][64][64];
            this.aByteArrayArrayArray41 = new byte[this.anInt48][64][64];
            this.aClass11ArrayArrayArrayArray50 = new Class11[this.anInt48][64][64][];
            var3 = var1.readUnsignedByte();
            if (Class17.aClass17_127.anInt125 != var3) {
                throw new IllegalStateException("");
            } else {
                int var4 = var1.readUnsignedByte();
                int var5 = var1.readUnsignedByte();
                int var6 = var1.readUnsignedByte();
                int var7 = var1.readUnsignedByte();
                if (var4 == this.anInt43 && this.anInt42 == var5 && this.anInt168 == var6 && this.anInt170 == var7) {
                    for (int var8 = 0; var8 < 8; ++var8) {
                        for (int var9 = 0; var9 < 8; ++var9) {
                            this.method23(this.anInt168 * 8 + var8, var9 + this.anInt170 * 8, var1);
                        }
                    }

                } else {
                    throw new IllegalStateException("");
                }
            }
        }
    }

    boolean method166(int var1, int var2) {
        if (var1 < this.anInt168 * 8) {
            return false;
        } else if (var2 < this.anInt170 * 8) {
            return false;
        } else if (var1 >= this.anInt168 * 8 + 8) {
            return false;
        } else {
            return var2 < this.anInt170 * 8 + 8;
        }
    }

    public boolean method163(Object var1) {
        if (!(var1 instanceof Class6_Sub1)) {
            return false;
        } else {
            Class6_Sub1 var2 = (Class6_Sub1) var1;
            if (this.anInt43 == var2.anInt43 && this.anInt42 == var2.anInt42) {
                return this.anInt168 == var2.anInt168 && this.anInt170 == var2.anInt170;
            } else {
                return false;
            }
        }
    }

    public int method162() {
        return this.anInt43 | this.anInt42 << 8 | this.anInt168 << 16 | this.anInt170 << 24;
    }

    int method161() {
        return this.anInt169;
    }

    int method160() {
        return this.anInt171;
    }

    int method165() {
        return this.anInt170;
    }

    int method164() {
        return this.anInt168;
    }
}
