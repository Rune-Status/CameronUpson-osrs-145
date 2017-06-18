package com.jagex;

import java.util.Iterator;

//name comes from this: http://i.imgur.com/F3PnKrJ.png
public class WorldMapTransportation {
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array85;
    int maxY = 0;
    int minX = Integer.MAX_VALUE;
    String areaName;
    int anInt94 = -1;
    String fileName;

    SceneOffset offset = null;
    int maxX = 0;
    int minY = Integer.MAX_VALUE;
    int fileId = -1;
    boolean onSurface = false;
    java.util.LinkedList aLinkedList93;
    int defaultScale = -1;

    public void read(Buffer var1, int var2) {
        this.fileId = var2;
        this.fileName = var1.method819();
        this.areaName = var1.method819();
        this.offset = new SceneOffset(var1.method835());
        this.anInt94 = var1.method835();
        var1.readUnsignedByte();
        this.onSurface = var1.readUnsignedByte() == 1;
        this.defaultScale = var1.readUnsignedByte(); //default world map zoom for this area
        int var3 = var1.readUnsignedByte();
        this.aLinkedList93 = new java.util.LinkedList();

        for (int var4 = 0; var4 < var3; ++var4) {
            this.aLinkedList93.add(this.method72(var1));
        }

        this.method68();
    }

    public boolean method65(int var1, int var2, int var3) {
        Iterator var4 = this.aLinkedList93.iterator();

        Class16 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }

            var5 = (Class16) var4.next();
        } while (!var5.method10(var1, var2, var3));

        return true;
    }

    public boolean method79(int var1, int var2) {
        int baseX = var1 / 64;
        int baseY = var2 / 64;
        if (baseX >= this.minX && baseX <= this.maxX) {
            if (baseY >= this.minY && baseY <= this.maxY) {
                Iterator var5 = this.aLinkedList93.iterator();
                Class16 var6;
                do {
                    if (!var5.hasNext()) {
                        return false;
                    }
                    var6 = (Class16) var5.next();
                } while (!var6.method5(var1, var2));

                return true;
            }
            return false;
        }
        return false;
    }

    public int getBaseY() {
        return this.offset.y;
    }

    public int getFileId() {
        return this.fileId;
    }

    public boolean isOnSurface() {
        return this.onSurface;
    }

    void method68() {
        Iterator var1 = this.aLinkedList93.iterator();

        while (var1.hasNext()) {
            Class16 var2 = (Class16) var1.next();
            var2.method1(this);
        }

    }

    int method61() {
        return this.anInt94;
    }

    public int getMinX() {
        return this.minX;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public int getMaxY() {
        return this.maxY;
    }

    public int getBaseX() {
        return this.offset.x;
    }

    public int getFloorLevel() {
        return this.offset.z;
    }

    public SceneOffset cloneOffset() {
        return new SceneOffset(this.offset);
    }

    public int getMinY() {
        return this.minY;
    }

    public int getDefaultScale() {
        return this.defaultScale;
    }

    public String getFileName() {
        return this.fileName;
    }

    public SceneOffset method83(int var1, int var2) {
        Iterator var3 = this.aLinkedList93.iterator();

        Class16 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            var4 = (Class16) var3.next();
        } while (!var4.method5(var1, var2));

        return var4.method7(var1, var2);
    }

    public String getAreaName() {
        return this.areaName;
    }

    public int[] method81(int var1, int var2, int var3) {
        Iterator var4 = this.aLinkedList93.iterator();

        Class16 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }

            var5 = (Class16) var4.next();
        } while (!var5.method10(var1, var2, var3));

        return var5.method2(var1, var2, var3);
    }

    Class16 method72(Buffer var1) {
        int var2 = var1.readUnsignedByte();
        Class23[] var3 = new Class23[]{Class23.aClass23_152, Class23.aClass23_155, Class23.aClass23_154, Class23.aClass23_159};
        Class23 var4 = (Class23) Canvas.method185(var3, var2);
        Object var5 = null;
        switch (var4.anInt157) {
            case 0:
                var5 = new Class1();
                break;
            case 1:
                var5 = new Class15();
                break;
            case 2:
                var5 = new Class21();
                break;
            case 3:
                var5 = new Class20();
                break;
            default:
                throw new IllegalStateException("");
        }

        ((Class16) var5).decode(var1);
        return (Class16) var5;
    }
}
