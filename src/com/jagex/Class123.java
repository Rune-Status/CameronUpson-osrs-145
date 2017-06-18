package com.jagex;

import java.io.IOException;

public class Class123 {
    public static void method814(boolean var0) {
        if (Class168.aSocket2082 != null) {
            try {
                Buffer var1 = new Buffer(4);
                var1.method451(var0 ? 2 : 3);
                var1.method867(0);
                Class168.aSocket2082.method885(var1.payload, 0, 4);
            } catch (IOException var4) {
                try {
                    Class168.aSocket2082.method882();
                } catch (Exception var3) {
                }

                ++Class168.anInt2069;
                Class168.aSocket2082 = null;
            }

        }
    }

    static void method813(String var0, int var1) {
        Client.packet.writeHeader(11);
        Client.packet.method451(Class27.method179(var0) + 1);
        Client.packet.method865(var0);
        Client.packet.method836(var1);
    }
}
