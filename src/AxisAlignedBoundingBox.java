//instances of this and Legacy2DBoundingBox are stored in a LinkedList type field: BoundingBoxInfo.boundingBoxes
public final class AxisAlignedBoundingBox extends BoundingBox {

    final int x2;
    final int z1;
    final int y1;
    final int color; //0xffff00ff if Node_Sub21_Sub6.calcAxisAlignedBoundingBox returned true, else 0xff0000ff
    final int y2;
    final int z2;
    final int x1;

    public static int appletWidth;
    static int[] anIntArray669;

    public AxisAlignedBoundingBox(Model model, int x, int z, int y, int color) {
        this.x1 = x + model.anInt754 - model.anInt760;
        this.z1 = z + model.anInt745 - model.anInt757;
        this.y1 = y + model.anInt755 - model.anInt746;
        this.x2 = x + model.anInt760 + model.anInt754;
        this.z2 = z + model.anInt745 + model.anInt757;
        this.y2 = y + model.anInt755 + model.anInt746;
        this.color = color;
    }

    public final void draw() {
        for (int var1 = 0; var1 < 8; ++var1) {
            int var2 = (var1 & 1) == 0 ? this.x1 : this.x2;
            int var3 = (var1 & 2) == 0 ? this.z1 : this.z2;
            int var4 = (var1 & 4) == 0 ? this.y1 : this.y2;
            if ((var1 & 1) == 0) {
                Class84.method486(var2, var3, var4, this.x2, var3, var4, this.color);
            }

            if ((var1 & 2) == 0) {
                Class84.method486(var2, var3, var4, var2, this.z2, var4, this.color);
            }

            if ((var1 & 4) == 0) {
                Class84.method486(var2, var3, var4, var2, var3, this.y2, this.color);
            }
        }

    }
}
