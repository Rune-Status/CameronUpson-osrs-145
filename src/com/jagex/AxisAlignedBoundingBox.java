package com.jagex;

//instances of this and com.jagex.Legacy2DBoundingBox are stored in a com.jagex.LinkedList type field: com.jagex.BoundingBoxInfo.boundingBoxes
public final class AxisAlignedBoundingBox extends BoundingBox {

    final int x2;
    final int z1;
    final int y1;
    final int color;
    final int y2;
    final int z2;
    final int x1;

    public static int appletWidth;
    static int[] anIntArray669;

    public AxisAlignedBoundingBox(Model model, int x, int z, int y, int color) {
        x1 = x + model.anInt754 - model.anInt760;
        z1 = z + model.anInt745 - model.anInt757;
        y1 = y + model.anInt755 - model.anInt746;
        x2 = x + model.anInt760 + model.anInt754;
        z2 = z + model.anInt745 + model.anInt757;
        y2 = y + model.anInt755 + model.anInt746;
        this.color = color;
    }

    public final void draw() {
        for (int var1 = 0; var1 < 8; ++var1) {
            int var2 = (var1 & 1) == 0 ? x1 : x2;
            int var3 = (var1 & 2) == 0 ? z1 : z2;
            int var4 = (var1 & 4) == 0 ? y1 : y2;
            if ((var1 & 1) == 0) {
                Class84.method486(var2, var3, var4, x2, var3, var4, color);
            }

            if ((var1 & 2) == 0) {
                Class84.method486(var2, var3, var4, var2, z2, var4, color);
            }

            if ((var1 & 4) == 0) {
                Class84.method486(var2, var3, var4, var2, var3, y2, color);
            }
        }

    }
}
