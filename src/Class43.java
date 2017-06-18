import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class43 {
    public static Comparator aComparator366 = new Class62();
    public static Comparator aComparator363;
    public static Comparator aComparator362;
    public static Comparator aComparator365;
    static int cameraYaw;
    static int[] anIntArray364;
    static int anInt361;

    static {
        new Class65();
        aComparator363 = new Class60();
        aComparator362 = new Class70();
        aComparator365 = new Class75();
    }

    public final List aList359;

    public Class43(Buffer var1, boolean var2) {
        int var3 = var1.readUnsignedShort();
        boolean var4 = var1.readUnsignedByte() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }

        int var6 = var1.readUnsignedShort();
        this.aList359 = new ArrayList(var6);

        for (int var7 = 0; var7 < var6; ++var7) {
            this.aList359.add(new Class53(var1, var5, var3));
        }

    }

    public static void method298(ReferenceTable var0, int var1, int var2, int var3, boolean var4) {
        Class133.anInt1725 = 1;
        Class133.aReferenceTable1727 = var0;
        Class133.anInt1728 = var1;
        Class5.anInt38 = var2;
        Class141.anInt1784 = var3;
        Class46.aBoolean371 = var4;
        CollisionMap.anInt1323 = 10000;
    }

    static int method297(int var0, int var1) {
        int var2 = var0 + var1 * 57;
        var2 ^= var2 << 13;
        int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return var3 >> 19 & 255;
    }

    public void method296(Comparator var1, boolean var2) {
        if (var2) {
            Collections.sort(this.aList359, var1);
        } else {
            Collections.sort(this.aList359, Collections.reverseOrder(var1));
        }

    }
}
