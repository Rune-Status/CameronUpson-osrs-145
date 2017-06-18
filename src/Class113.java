public abstract class Class113 {
    public int anInt1332;
    public int anInt1334;
    public int anInt1335;
    public int anInt1333;

    public static int method775(int var0, int var1, int var2, int var3, int var4, int var5) {
        if ((var5 & 1) == 1) {
            int var6 = var3;
            var3 = var4;
            var4 = var6;
        }

        var2 &= 3;
        if (var2 == 0) {
            return var1;
        } else if (var2 == 1) {
            return 7 - var0 - (var3 - 1);
        } else {
            return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
        }
    }

    protected abstract boolean method285(int var1, int var2, int var3, CollisionMap var4);
}
