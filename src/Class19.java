public class Class19 implements Class48 {
    static Node_Sub21_Sub6 aNode_Sub21_Sub6_137;
    static ReferenceTable aReferenceTable136;

    public static void method142(Model var0, int var1) {
        for (int var2 = 0; var2 < var0.anInt217; ++var2) {
            if (var0.anIntArray1273[var2] != -2) {
                int var3 = var0.xTriangles[var2];
                int var4 = var0.yTriangles[var2];
                int var5 = var0.zTriangles[var2];
                int var6 = Model.anIntArray1253[var3];
                int var7 = Model.anIntArray1253[var4];
                int var8 = Model.anIntArray1253[var5];
                int var9 = Model.anIntArray944[var3];
                int var10 = Model.anIntArray944[var4];
                int var11 = Model.anIntArray944[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - var1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + var1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - var1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + var1;
                //Class169.addLegacyBoundingBox(var12, var14, var13, var15, -49088);
            }
        }

    }

    static AnimationFrame method143(int var0) {
        AnimationFrame var1 = (AnimationFrame) AnimationSequence.aReferenceCache2045.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            var1 = Class77.method462(AnimationSequence.aReferenceTable2017, AnimationSequence.aReferenceTable2039, var0, false);
            if (var1 != null) {
                AnimationSequence.aReferenceCache2045.method975(var1, (long) var0);
            }

            return var1;
        }
    }

    public Class84 method141() {
        return new Class84_Sub1();
    }
}
