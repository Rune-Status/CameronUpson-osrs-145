public class Class159 {
    static void method1014(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
        if (var0 < var1) {
            int var6 = (var0 + var1) / 2;
            int var7 = var0;
            World var8 = World.aWorldArray396[var6];
            World.aWorldArray396[var6] = World.aWorldArray396[var1];
            World.aWorldArray396[var1] = var8;

            for (int var9 = var0; var9 < var1; ++var9) {
                World var10 = World.aWorldArray396[var9];
                int var11 = World.method312(var10, var8, var2, var3);
                int var12;
                if (var11 != 0) {
                    if (var3) {
                        var12 = -var11;
                    } else {
                        var12 = var11;
                    }
                } else if (var4 == -1) {
                    var12 = 0;
                } else {
                    int var14 = World.method312(var10, var8, var4, var5);
                    if (var5) {
                        var12 = -var14;
                    } else {
                        var12 = var14;
                    }
                }

                if (var12 <= 0) {
                    World var13 = World.aWorldArray396[var9];
                    World.aWorldArray396[var9] = World.aWorldArray396[var7];
                    World.aWorldArray396[var7++] = var13;
                }
            }

            World.aWorldArray396[var1] = World.aWorldArray396[var7];
            World.aWorldArray396[var7] = var8;
            method1014(var0, var7 - 1, var2, var3, var4, var5);
            method1014(var7 + 1, var1, var2, var3, var4, var5);
        }

    }
}
