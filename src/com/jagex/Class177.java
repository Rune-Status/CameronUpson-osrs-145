package com.jagex;

public final class Class177 {
    static final char[] aCharArray2140 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    static void method1189(Buffer var0) {
        if (Client.aByteArray1500 != null) {
            var0.method860(Client.aByteArray1500, 0, Client.aByteArray1500.length);
        } else {
            byte[] var1 = Class74.method437();
            var0.method860(var1, 0, var1.length);
        }
    }
}
