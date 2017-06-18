package com.jagex;

public class Class85 {
    static int cameraZ;
    static String[] aStringArray874;
    ReferenceTable aReferenceTable877;
    NodeTable<Node_Sub11_Sub1> aNodeTable875 = new NodeTable<>(256);
    ReferenceTable aReferenceTable873;
    NodeTable<Node_Sub13> aNodeTable876 = new NodeTable<>(256);

    public Class85(ReferenceTable var1, ReferenceTable var2) {
        this.aReferenceTable873 = var1;
        this.aReferenceTable877 = var2;
    }

    public static int method495(CharSequence var0) {
        return Class65.method388(var0, 10, true);
    }

    static void method497() {
        Object var0 = Class165.anObject2005;
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

    public Node_Sub11_Sub1 method494(int var1, int[] var2) {
        if (this.aReferenceTable873.method1097() == 1) {
            return this.method492(0, var1, var2);
        } else if (this.aReferenceTable873.method1101(var1) == 1) {
            return this.method492(var1, 0, var2);
        } else {
            throw new RuntimeException();
        }
    }

    public Node_Sub11_Sub1 method493(int var1, int[] var2) {
        if (this.aReferenceTable877.method1097() == 1) {
            return this.method496(0, var1, var2);
        } else if (this.aReferenceTable877.method1101(var1) == 1) {
            return this.method496(var1, 0, var2);
        } else {
            throw new RuntimeException();
        }
    }

    Node_Sub11_Sub1 method496(int var1, int var2, int[] var3) {
        int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
        var4 |= var1 << 16;
        long var5 = (long) var4 ^ 4294967296L;
        Node_Sub11_Sub1 var7 = this.aNodeTable875.lookup(var5);
        if (var7 != null) {
            return var7;
        } else if (var3 != null && var3[0] <= 0) {
            return null;
        } else {
            Node_Sub13 var8 = this.aNodeTable876.lookup(var5);
            if (var8 == null) {
                var8 = Node_Sub13.method596(this.aReferenceTable877, var1, var2);
                if (var8 == null) {
                    return null;
                }

                this.aNodeTable876.put(var8, var5);
            }

            var7 = var8.method588(var3);
            if (var7 == null) {
                return null;
            } else {
                var8.unlink();
                this.aNodeTable875.put(var7, var5);
                return var7;
            }
        }
    }

    Node_Sub11_Sub1 method492(int var1, int var2, int[] var3) {
        int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
        var4 |= var1 << 16;
        long var5 = (long) var4;
        Node_Sub11_Sub1 var7 = this.aNodeTable875.lookup(var5);
        if (var7 != null) {
            return var7;
        } else if (var3 != null && var3[0] <= 0) {
            return null;
        } else {
            AudioEffect var8 = AudioEffect.method606(this.aReferenceTable873, var1, var2);
            if (var8 == null) {
                return null;
            } else {
                var7 = var8.method609();
                this.aNodeTable875.put(var7, var5);
                if (var3 != null) {
                    var3[0] -= var7.aByteArray846.length;
                }

                return var7;
            }
        }
    }
}
