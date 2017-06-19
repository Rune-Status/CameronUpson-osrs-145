package com.jagex;

public final class TileDecor {
    static int anInt1035;
    public int uid;
    public Entity entity;
    int level;
    int sceneY;
    int sceneX;
    int config;

    static int method613(int var0, RuneScript var1, boolean var2) {
        InterfaceComponent var3;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = InterfaceComponent.method1016(Class63.anIntArray645[--Class63.anInt644]);
        } else {
            var3 = var2 ? Class18.anInterfaceComponent129 : WorldMapObject.anInterfaceComponent83;
        }

        String var4 = Class63.aStringArray640[--Class77.anInt828];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = Class63.anIntArray645[--Class63.anInt644];
            if (var6 > 0) {
                for (var5 = new int[var6]; var6-- > 0; var5[var6] = Class63.anIntArray645[--Class63.anInt644]) {
                }
            }

            var4 = var4.substring(0, var4.length() - 1);
        }

        Object[] var7 = new Object[var4.length() + 1];

        int var8;
        for (var8 = var7.length - 1; var8 >= 1; --var8) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = Class63.aStringArray640[--Class77.anInt828];
            } else {
                var7[var8] = new Integer(Class63.anIntArray645[--Class63.anInt644]);
            }
        }

        var8 = Class63.anIntArray645[--Class63.anInt644];
        if (var8 != -1) {
            var7[0] = new Integer(var8);
        } else {
            var7 = null;
        }

        if (var0 == 1400) {
            var3.anObjectArray1893 = var7;
        } else if (var0 == 1401) {
            var3.anObjectArray1918 = var7;
        } else if (var0 == 1402) {
            var3.anObjectArray1909 = var7;
        } else if (var0 == 1403) {
            var3.mouseEnterListeners = var7;
        } else if (var0 == 1404) {
            var3.mouseExitListeners = var7;
        } else if (var0 == 1405) {
            var3.anObjectArray1903 = var7;
        } else if (var0 == 1406) {
            var3.anObjectArray1904 = var7;
        } else if (var0 == 1407) {
            var3.configListenerArgs = var7;
            var3.configTriggers = var5;
        } else if (var0 == 1408) {
            var3.renderListeners = var7;
        } else if (var0 == 1409) {
            var3.anObjectArray1907 = var7;
        } else if (var0 == 1410) {
            var3.anObjectArray1906 = var7;
        } else if (var0 == 1411) {
            var3.anObjectArray1876 = var7;
        } else if (var0 == 1412) {
            var3.hoverListeners = var7;
        } else if (var0 == 1414) {
            var3.tableListenerArgs = var7;
            var3.tableTriggers = var5;
        } else if (var0 == 1415) {
            var3.skillListenerArgs = var7;
            var3.skillTriggers = var5;
        } else if (var0 == 1416) {
            var3.anObjectArray1898 = var7;
        } else if (var0 == 1417) {
            var3.scrollListeners = var7;
        } else if (var0 == 1418) {
            var3.anObjectArray1902 = var7;
        } else if (var0 == 1419) {
            var3.anObjectArray1916 = var7;
        } else if (var0 == 1420) {
            var3.anObjectArray1901 = var7;
        } else if (var0 == 1421) {
            var3.anObjectArray1905 = var7;
        } else if (var0 == 1422) {
            var3.anObjectArray1913 = var7;
        } else if (var0 == 1423) {
            var3.anObjectArray1912 = var7;
        } else if (var0 == 1424) {
            var3.anObjectArray1922 = var7;
        } else if (var0 == 1425) {
            var3.anObjectArray1948 = var7;
        } else if (var0 == 1426) {
            var3.anObjectArray1947 = var7;
        } else {
            if (var0 != 1427) {
                return 2;
            }

            var3.anObjectArray1920 = var7;
        }

        var3.aBoolean1872 = true;
        return 1;
    }
}
