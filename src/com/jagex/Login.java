package com.jagex;

public class Login {
    static int anInt702 = 0;
    static Node_Sub21_Sub26_Sub2 aNode_Sub21_Sub26_Sub2_690;
    static Node_Sub21_Sub26_Sub2 aNode_Sub21_Sub26_Sub2_695;
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array708;
    static Sprite aSprite697;
    static int anInt710;
    static boolean aBoolean706;
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array692;
    static int anInt687;
    static int anInt691;
    static int anInt689;
    static int anInt705;
    static int anInt698;
    static int anInt699;
    static boolean aBoolean703;
    static int anInt701;
    static String loginResponseLine2;
    static String loginResponseLine1;
    static String loginResponseLine3;
    static String username;
    static String password;
    static Class109 aClass109_693;
    static int anInt713;
    static int[] anIntArray700;
    static int anInt712;
    static boolean aBoolean694;
    static String aString707;
    static int anInt684;
    static String aString686;
    static Node_Sub21_Sub26_Sub2 aNode_Sub21_Sub26_Sub2_709;

    static {
        anInt710 = anInt702 + 202;
        anIntArray700 = new int[256];
        anInt712 = 0;
        anInt687 = 0;
        anInt691 = 0;
        anInt689 = 0;
        anInt705 = 0;
        anInt698 = 0;
        anInt699 = 10;
        aString686 = "";
        anInt701 = 0;
        aString707 = "";
        loginResponseLine1 = "";
        loginResponseLine2 = "";
        loginResponseLine3 = "";
        username = "";
        password = "";
        aClass109_693 = Class109.aClass109_1303;
        aBoolean703 = true;
        anInt713 = 0;
        aBoolean694 = false;
        anInt684 = -1;
    }

    static boolean method413(int var0, int var1) {
        ObjectDefinition var2 = Class5.method17(var0);
        if (var1 == 11) {
            var1 = 10;
        }

        if (var1 >= 5 && var1 <= 8) {
            var1 = 4;
        }

        return var2.method1078(var1);
    }

    static void method415(int var0, int var1, int var2, int var3) {
        if (Client.cursorState == 1) {
            Class12_Sub1.aSpriteArray110[Client.anInt1585 / 100].method1230(Client.anInt1557 - 8, Client.anInt1577 - 8);
        }

        if (Client.cursorState == 2) {
            Class12_Sub1.aSpriteArray110[Client.anInt1585 / 100 + 4].method1230(Client.anInt1557 - 8, Client.anInt1577 - 8);
        }

        Class171.method1153();
    }

    static void method414(int var0, int var1, int var2, int var3) {
        ItemTable var4 = ItemTable.itemTables.lookup((long) var0);
        if (var4 == null) {
            var4 = new ItemTable();
            ItemTable.itemTables.put(var4, (long) var0);
        }

        if (var4.ids.length <= var1) {
            int[] var5 = new int[var1 + 1];
            int[] var6 = new int[var1 + 1];

            int var7;
            for (var7 = 0; var7 < var4.ids.length; ++var7) {
                var5[var7] = var4.ids[var7];
                var6[var7] = var4.stackSizes[var7];
            }

            for (var7 = var4.ids.length; var7 < var1; ++var7) {
                var5[var7] = -1;
                var6[var7] = 0;
            }

            var4.ids = var5;
            var4.stackSizes = var6;
        }

        var4.ids[var1] = var2;
        var4.stackSizes[var1] = var3;
    }

    public static void method411(ReferenceTable var0) {
        Node_Sub21_Sub13.aReferenceTable2012 = var0;
    }

    static void method412() {
        if (Player.floorLevel != Client.anInt1705) {
            Client.anInt1705 = Player.floorLevel;
            EntityMarker.method652(Player.floorLevel);
        }

    }
}
