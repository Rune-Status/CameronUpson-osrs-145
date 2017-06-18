package com.jagex;

import java.math.BigInteger;

public class Class61 {
    static final BigInteger aBigInteger633 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    static final BigInteger aBigInteger634 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    static int anInt632;

    static void method373(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
        if (!Client.menuOpen) {
            if (Client.menuRowCount < 500) {
                Client.menuActions[Client.menuRowCount] = var0;
                Client.menuTargets[Client.menuRowCount] = var1;
                Client.menuOpcodes[Client.menuRowCount] = var2;
                Client.menuPrimaryArgs[Client.menuRowCount] = var3;
                Client.menuSecondaryArgs[Client.menuRowCount] = var4;
                Client.menuTertiaryArgs[Client.menuRowCount] = var5;
                if (var6) {
                    Client.anInt1624 = Client.menuRowCount;
                }

                ++Client.menuRowCount;
            }

        }
    }

    static boolean method372(String var0) {
        if (var0 == null) {
            return false;
        }
        String var1 = Class84.method484(var0, Class2.aClass188_13);

        for (int var2 = 0; var2 < Client.anInt1450; ++var2) {
            IgnoredPlayer var3 = Client.ignoredPlayers[var2];
            if (var1.equalsIgnoreCase(Class84.method484(var3.aString242, Class2.aClass188_13))) {
                return true;
            }

            if (var1.equalsIgnoreCase(Class84.method484(var3.aString243, Class2.aClass188_13))) {
                return true;
            }
        }

        return false;
    }

    public static void method375() {
        try {
            Class97.aClass93_1080.method597();

            for (int var0 = 0; var0 < ItemTable.anInt328; ++var0) {
                Class21.aClass93Array141[var0].method597();
            }

            Class97.aClass93_1077.method597();
            Class97.aClass93_1076.method597();
        } catch (Exception var2) {
        }

    }

    public static void method374(int var0) {
        if (Class133.anInt1725 != 0) {
            Class141.anInt1784 = var0;
        } else {
            Class133.aNode_Sub10_Sub3_1723.method454(var0);
        }

    }
}
