package com.jagex;

public abstract class Class111 {
    static boolean aBoolean1326 = false;

    public static Node_Sub21_Sub13 method770(int var0) {
        Node_Sub21_Sub13 var1 = (Node_Sub21_Sub13) Node_Sub21_Sub13.aReferenceCache2025.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Node_Sub21_Sub13.aReferenceTable2012.method1085(8, var0);
            var1 = new Node_Sub21_Sub13();
            if (var2 != null) {
                var1.method1066(new Buffer(var2));
            }

            Node_Sub21_Sub13.aReferenceCache2025.method975(var1, (long) var0);
            return var1;
        }
    }

    abstract byte[] method768();

    abstract void method769(byte[] var1);
}
