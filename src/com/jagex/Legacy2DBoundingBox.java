package com.jagex;

public final class Legacy2DBoundingBox extends BoundingBox {

    public static short[][] aShortArrayArray399;
    static ReferenceTable aReferenceTable398;

    final int minY;
    final int maxY;
    final int color;
    final int maxX;
    final int minX;

    Legacy2DBoundingBox(int minX, int minY, int maxX, int maxY, int color) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        this.color = color;
    }

    public final void draw() {
        DrawingArea.drawRectangle(DrawingArea.areaLeft + this.minX, DrawingArea.areaTop + this.minY, this.maxX - this.minX, this.maxY - this.minY, this.color);
    }
}
