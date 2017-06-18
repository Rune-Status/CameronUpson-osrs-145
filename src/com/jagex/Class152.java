package com.jagex;

public final class Class152 {
    static String method1007(int var0, int var1) {
        int var2 = var1 - var0;
        if (var2 < -9) {
            return Class75.method449(16711680);
        }
        if (var2 < -6) {
            return Class75.method449(16723968);
        }
        if (var2 < -3) {
            return Class75.method449(16740352);
        }
        if (var2 < 0) {
            return Class75.method449(16756736);
        }
        if (var2 > 9) {
            return Class75.method449(65280);
        }
        if (var2 > 6) {
            return Class75.method449(4259584);
        }
        if (var2 > 3) {
            return Class75.method449(8453888);
        }
        return var2 > 0 ? Class75.method449(12648192) : Class75.method449(16776960);
    }
}
