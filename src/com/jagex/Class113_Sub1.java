package com.jagex;

import java.io.IOException;

public class Class113_Sub1 extends Class113 {
    static void method287(boolean var0) {
        ScriptEvent.method273();
        ++Client.audioEffectCount;
        if (Client.audioEffectCount >= 50 || var0) {
            Client.audioEffectCount = 0;
            if (!Client.aBoolean1512 && InterfaceNode.aSocket317 != null) {
                Client.packet.writeHeader(71);

                try {
                    InterfaceNode.aSocket317.method885(Client.packet.payload, 0, Client.packet.caret);
                    Client.packet.caret = 0;
                } catch (IOException var2) {
                    Client.aBoolean1512 = true;
                }
            }

        }
    }

    static String method286(String var0, boolean var1) {
        String var2 = var1 ? "https://" : "http://";
        if (Client.anInt1470 == 1) {
            var0 = var0 + "-wtrc";
        } else if (Client.anInt1470 == 2) {
            var0 = var0 + "-wtqa";
        } else if (Client.anInt1470 == 3) {
            var0 = var0 + "-wtwip";
        } else if (Client.anInt1470 == 5) {
            var0 = var0 + "-wti";
        } else if (Client.anInt1470 == 4) {
            var0 = "local";
        }

        String var3 = "";
        if (Class147.aString1808 != null) {
            var3 = "/p=" + Class147.aString1808;
        }

        String var4 = "runescape.com";
        return var2 + var0 + "." + var4 + "/l=" + Client.anInt1463 + "/a=" + Client.anInt1478 + var3 + "/";
    }

    protected boolean method285(int var1, int var2, int var3, CollisionMap var4) {
        return var2 == this.anInt1332 && var3 == this.anInt1335;
    }
}
