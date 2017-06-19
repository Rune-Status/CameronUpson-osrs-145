package com.jagex;

public class AnimationFrame extends DoublyNode {
    Identikit[] anIdentikitArray1075;

    AnimationFrame(ReferenceTable var1, ReferenceTable var2, int var3, boolean var4) {
        NodeDeque<AnimationSkin> var5 = new NodeDeque<>();
        int var6 = var1.method1101(var3);
        this.anIdentikitArray1075 = new Identikit[var6];
        int[] var7 = var1.method1087(var3);

        for (int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.unpack(var3, var7[var8]);
            AnimationSkin var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for (AnimationSkin var12 = var5.method995(); var12 != null; var12 = var5.next()) {
                if (var12.anInt204 == var11) {
                    var10 = var12;
                    break;
                }
            }

            if (var10 == null) {
                byte[] var13;
                if (var4) {
                    var13 = var2.get(0, var11);
                } else {
                    var13 = var2.get(var11, 0);
                }

                var10 = new AnimationSkin(var11, var13);
                var5.method997(var10);
            }

            this.anIdentikitArray1075[var7[var8]] = new Identikit(var9, var10);
        }

    }

    public boolean method626(int var1) {
        return this.anIdentikitArray1075[var1].showing;
    }
}
