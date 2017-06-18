package com.jagex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class Class7 {
    final HashMap aHashMap53;
    boolean aBoolean56 = false;
    int anInt60;
    WorldMapTransportation_Sub1 aClass12_Sub1_52;
    Sprite aSprite61;
    HashMap aHashMap62;
    HashMap aHashMap55 = new HashMap();
    int anInt58;
    boolean aBoolean59 = false;
    int anInt51;
    Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array54;
    Class13[][] aClass13ArrayArray63;
    int anInt57;

    public Class7(Node_Sub21_Sub26_Sub2[] var1, HashMap var2) {
        this.aNode_Sub21_Sub26_Sub2Array54 = var1;
        this.aHashMap53 = var2;
    }

    static void method41(Packet var0, int var1, Player var2, int var3) {
        byte var4 = -1;
        int var5;
        if ((var3 & 4) != 0) {
            var5 = var0.readUnsignedByte();
            byte[] var6 = new byte[var5];
            Buffer var7 = new Buffer(var6);
            var0.method826(var6, 0, var5);
            Class71.aBufferArray728[var1] = var7;
            var2.method198(var7);
        }

        int var8;
        if ((var3 & 64) != 0) {
            var5 = var0.readUnsignedShort();
            if (var5 == 65535) {
                var5 = -1;
            }

            var8 = var0.readUnsignedByte();
            Player.method394(var2, var5, var8);
        }

        if ((var3 & 8) != 0) {
            var2.targetIndex = var0.readUnsignedShort();
            if (var2.targetIndex == 65535) {
                var2.targetIndex = -1;
            }
        }

        if ((var3 & 128) != 0) {
            var2.aString752 = var0.method819();
            if (var2.aString752.charAt(0) == '~') {
                var2.aString752 = var2.aString752.substring(1);
                Class78.addChatMessage(2, var2.name, var2.aString752);
            } else if (var2 == Client.player) {
                Class78.addChatMessage(2, var2.name, var2.aString752);
            }

            var2.aBoolean750 = false;
            var2.anInt756 = 0;
            var2.anInt767 = 0;
            var2.anInt761 = 150;
        }

        int var10;
        int var11;
        if ((var3 & 2) != 0) {
            var5 = var0.readUnsignedByte();
            int var9;
            int var12;
            int var13;
            if (var5 > 0) {
                for (var8 = 0; var8 < var5; ++var8) {
                    var9 = -1;
                    var10 = -1;
                    var11 = -1;
                    var12 = var0.method541();
                    if (var12 == 32767) {
                        var12 = var0.method541();
                        var10 = var0.method541();
                        var9 = var0.method541();
                        var11 = var0.method541();
                    } else if (var12 != 32766) {
                        var10 = var0.method541();
                    } else {
                        var12 = -1;
                    }

                    var13 = var0.method541();
                    var2.method440(var12, var10, var9, var11, Client.engineCycle, var13);
                }
            }

            var8 = var0.readUnsignedByte();
            if (var8 > 0) {
                for (var12 = 0; var12 < var8; ++var12) {
                    var9 = var0.method541();
                    var10 = var0.method541();
                    if (var10 != 32767) {
                        var11 = var0.method541();
                        var13 = var0.readUnsignedByte();
                        int var14 = var10 > 0 ? var0.readUnsignedByte() : var13;
                        var2.method439(var9, Client.engineCycle, var10, var11, var13, var14);
                    } else {
                        var2.method442(var9);
                    }
                }
            }
        }

        if ((var3 & 32) != 0) {
            var2.anInt793 = var0.readUnsignedShort();
            if (var2.queueSize == 0) {
                var2.orientation = var2.anInt793;
                var2.anInt793 = -1;
            }
        }

        if ((var3 & 16) != 0) {
            var5 = var0.readUnsignedShort();
            Class158[] var19 = new Class158[]{Class158.aClass158_1849, Class158.aClass158_1855, Class158.aClass158_1845, Class158.aClass158_1853, Class158.aClass158_1848, Class158.aClass158_1851};
            Class158 var20 = (Class158) Canvas.method185(var19, var0.readUnsignedByte());
            boolean var22 = var0.readUnsignedByte() == 1;
            var10 = var0.readUnsignedByte();
            var11 = var0.caret;
            if (var2.name != null && var2.appearance != null) {
                boolean var23 = false;
                if (var20.aBoolean1846 && Class61.method372(var2.name)) {
                    var23 = true;
                }

                if (!var23 && Client.anInt1589 == 0 && !var2.aBoolean215) {
                    Class71.aBuffer721.caret = 0;
                    var0.method826(Class71.aBuffer721.payload, 0, var10);
                    Class71.aBuffer721.caret = 0;
                    Buffer var15 = Class71.aBuffer721;
                    String var16 = Class112.method772(var15, 32767);
                    String var17 = Node_Sub21_Sub26_Sub3.method1177(Node_Sub21_Sub5.method1011(var16));
                    var2.aString752 = var17.trim();
                    var2.anInt756 = var5 >> 8;
                    var2.anInt767 = var5 & 255;
                    var2.anInt761 = 150;
                    var2.aBoolean750 = var22;
                    var2.aBoolean759 = var2 != Client.player && var20.aBoolean1846 && "" != Client.aString1679 && var17.toLowerCase().indexOf(Client.aString1679) == -1;
                    int var18;
                    if (var20.aBoolean1850) {
                        var18 = var22 ? 91 : 1;
                    } else {
                        var18 = var22 ? 90 : 2;
                    }

                    if (var20.anInt1852 != -1) {
                        Class78.addChatMessage(var18, Canvas.method187(var20.anInt1852) + var2.name, var17);
                    } else {
                        Class78.addChatMessage(var18, var2.name, var17);
                    }
                }
            }

            var0.caret = var10 + var11;
        }

        if ((var3 & 2048) != 0) {
            var2.anInt771 = var0.readUnsignedShort();
            var5 = var0.method835();
            var2.anInt787 = var5 >> 16;
            var2.anInt786 = Client.engineCycle + (var5 & '\uffff');
            var2.anInt782 = 0;
            var2.anInt780 = 0;
            if (var2.anInt786 > Client.engineCycle) {
                var2.anInt782 = -1;
            }

            if (var2.anInt771 == 65535) {
                var2.anInt771 = -1;
            }
        }

        if ((var3 & 1024) != 0) {
            var2.anInt778 = var0.method870();
            var2.anInt772 = var0.method870();
            var2.anInt779 = var0.method870();
            var2.anInt792 = var0.method870();
            var2.anInt775 = var0.readUnsignedShort() + Client.engineCycle;
            var2.anInt777 = var0.readUnsignedShort() + Client.engineCycle;
            var2.anInt788 = var0.readUnsignedShort();
            if (var2.aBoolean237) {
                var2.anInt778 += var2.anInt233;
                var2.anInt772 += var2.anInt234;
                var2.anInt779 += var2.anInt233;
                var2.anInt792 += var2.anInt234;
                var2.queueSize = 0;
            } else {
                var2.anInt778 += var2.anIntArray800[0];
                var2.anInt772 += var2.anIntArray804[0];
                var2.anInt779 += var2.anIntArray800[0];
                var2.anInt792 += var2.anIntArray804[0];
                var2.queueSize = 1;
            }

            var2.anInt799 = 0;
        }

        if ((var3 & 256) != 0) {
            Class71.aByteArray727[var1] = var0.method870();
        }

        if ((var3 & 4096) != 0) {
            var4 = var0.method870();
        }

        if ((var3 & 512) != 0) {
            for (var5 = 0; var5 < 3; ++var5) {
                var2.aStringArray238[var5] = var0.method819();
            }
        }

        if (var2.aBoolean237) {
            if (var4 == 127) {
                var2.method200(var2.anInt233, var2.anInt234);
            } else {
                byte var21;
                if (var4 != -1) {
                    var21 = var4;
                } else {
                    var21 = Class71.aByteArray727[var1];
                }

                var2.method199(var2.anInt233, var2.anInt234, var21);
            }
        }

    }

    public static Class84 method39(Class108 var0, int var1, int var2) {
        if (Class84.anInt870 == 0) {
            throw new IllegalStateException();
        }
        if (var1 >= 0 && var1 < 2) {
            if (var2 < 256) {
                var2 = 256;
            }

            try {
                Class84 var3 = Class57.aClass48_435.method141();
                var3.anIntArray853 = new int[(Class154.aBoolean1835 ? 2 : 1) * 256];
                var3.anInt866 = var2;
                var3.method277();
                var3.anInt863 = (var2 & -1024) + 1024;
                if (var3.anInt863 > 16384) {
                    var3.anInt863 = 16384;
                }

                var3.method282(var3.anInt863);
                if (Class84.anInt857 > 0 && Class84.aClass79_855 == null) {
                    Class84.aClass79_855 = new Class79();
                    Class84.aScheduledExecutorService860 = Executors.newScheduledThreadPool(1);
                    Class84.aScheduledExecutorService860.scheduleAtFixedRate(Class84.aClass79_855, 0L, 10L, TimeUnit.MILLISECONDS);
                }

                if (Class84.aClass79_855 != null) {
                    if (Class84.aClass79_855.aClass84Array842[var1] != null) {
                        throw new IllegalArgumentException();
                    }

                    Class84.aClass79_855.aClass84Array842[var1] = var3;
                }

                return var3;
            } catch (Throwable var4) {
                return new Class84();
            }
        }
        throw new IllegalArgumentException();
    }

    public void method35(ReferenceTable var1, String var2, boolean var3) {
        if (!this.aBoolean56) {
            this.aBoolean59 = false;
            this.aBoolean56 = true;
            System.nanoTime();
            int var4 = var1.method1084(Class10.aClass10_70.aString77);
            int var5 = var1.method1104(var4, var2);
            Buffer var6 = new Buffer(var1.method1105(Class10.aClass10_70.aString77, var2));
            Buffer var7 = new Buffer(var1.method1105(Class10.aClass10_78.aString77, var2));
            Buffer var8 = new Buffer(var1.method1105(var2, Class10.aClass10_71.aString77));
            System.nanoTime();
            System.nanoTime();
            this.aClass12_Sub1_52 = new WorldMapTransportation_Sub1();

            try {
                this.aClass12_Sub1_52.method126(var6, var8, var7, var5, var3);
            } catch (IllegalStateException var20) {
                return;
            }

            this.aClass12_Sub1_52.getBaseX();
            this.aClass12_Sub1_52.getFloorLevel();
            this.aClass12_Sub1_52.getBaseY();
            this.anInt51 = this.aClass12_Sub1_52.getMinX() * 64;
            this.anInt58 = this.aClass12_Sub1_52.getMinY() * 64;
            this.anInt60 = (this.aClass12_Sub1_52.getMaxX() - this.aClass12_Sub1_52.getMinX() + 1) * 64;
            this.anInt57 = (this.aClass12_Sub1_52.getMaxY() - this.aClass12_Sub1_52.getMinY() + 1) * 64;
            int var9 = this.aClass12_Sub1_52.getMaxX() - this.aClass12_Sub1_52.getMinX() + 1;
            int var10 = this.aClass12_Sub1_52.getMaxY() - this.aClass12_Sub1_52.getMinY() + 1;
            System.nanoTime();
            System.nanoTime();
            this.aClass13ArrayArray63 = new Class13[var9][var10];
            Iterator var11 = this.aClass12_Sub1_52.aHashSet113.iterator();

            while (var11.hasNext()) {
                Class6_Sub2 var12 = (Class6_Sub2) var11.next();
                int var13 = var12.anInt40;
                int var14 = var12.anInt49;
                int var15 = var13 - this.aClass12_Sub1_52.getMinX();
                int var16 = var14 - this.aClass12_Sub1_52.getMinY();
                this.aClass13ArrayArray63[var15][var16] = new Class13(var13, var14, this.aClass12_Sub1_52.method61(), this.aHashMap53);
                this.aClass13ArrayArray63[var15][var16].method104(var12, this.aClass12_Sub1_52.aList112);
            }

            for (int var17 = 0; var17 < var9; ++var17) {
                for (int var18 = 0; var18 < var10; ++var18) {
                    if (this.aClass13ArrayArray63[var17][var18] == null) {
                        this.aClass13ArrayArray63[var17][var18] = new Class13(this.aClass12_Sub1_52.getMinX() + var17, this.aClass12_Sub1_52.getMinY() + var18, this.aClass12_Sub1_52.method61(), this.aHashMap53);
                        this.aClass13ArrayArray63[var17][var18].method92(this.aClass12_Sub1_52.aHashSet111, this.aClass12_Sub1_52.aList112);
                    }
                }
            }

            System.nanoTime();
            System.nanoTime();
            if (var1.method1082(Class10.aClass10_73.aString77, var2)) {
                byte[] var21 = var1.method1105(Class10.aClass10_73.aString77, var2);
                this.aSprite61 = Canvas.method186(var21);
            }

            System.nanoTime();
            this.aBoolean59 = true;
        }
    }

    public final void method32() {
        this.aHashMap62 = null;
    }

    public final void method30(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int[] var9 = DrawingArea.drawingAreaPixels;
        int var10 = DrawingArea.drawingAreaWidth;
        int var11 = DrawingArea.anInt748;
        int[] var12 = new int[4];
        DrawingArea.method1207(var12);
        Class5 var13 = this.method29(var1, var2, var3, var4);
        float var14 = this.method28(var7 - var5, var3 - var1);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.aHashMap55.containsKey(var15)) {
            Class9 var16 = new Class9(var15);
            var16.method56();
            this.aHashMap55.put(var15, var16);
        }

        Class13[] var22 = new Class13[8];

        int var17;
        int var18;
        for (var17 = var13.anInt34; var17 < var13.anInt32 + var13.anInt34; ++var17) {
            for (var18 = var13.anInt33; var18 < var13.anInt39 + var13.anInt33; ++var18) {
                this.method38(var17, var18, var22);
                this.aClass13ArrayArray63[var17][var18].method124(var15, (Class9) this.aHashMap55.get(var15), var22, this.aNode_Sub21_Sub26_Sub2Array54);
            }
        }

        DrawingArea.method1211(var9, var10, var11);
        DrawingArea.method1213(var12);
        var17 = (int) (64.0F * var14);
        var18 = this.anInt51 + var1;
        int var19 = this.anInt58 + var2;

        for (int var20 = var13.anInt34; var20 < var13.anInt32 + var13.anInt34; ++var20) {
            for (int var21 = var13.anInt33; var21 < var13.anInt39 + var13.anInt33; ++var21) {
                this.aClass13ArrayArray63[var20][var21].method109(var5 + (this.aClass13ArrayArray63[var20][var21].anInt107 * 64 - var18) * var17 / 64, var8 - var17 * (this.aClass13ArrayArray63[var20][var21].anInt108 * 64 - var19 + 64) / 64, var17);
            }
        }

    }

    public final void method37(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
        Class5 var14 = this.method29(var1, var2, var3, var4);
        float var15 = this.method28(var7 - var5, var3 - var1);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.anInt51 + var1;
        int var18 = var2 + this.anInt58;

        int var19;
        int var20;
        for (var19 = var14.anInt34; var19 < var14.anInt32 + var14.anInt34; ++var19) {
            for (var20 = var14.anInt33; var20 < var14.anInt39 + var14.anInt33; ++var20) {
                if (var13) {
                    this.aClass13ArrayArray63[var19][var20].method100();
                }

                this.aClass13ArrayArray63[var19][var20].method97(var5 + (this.aClass13ArrayArray63[var19][var20].anInt107 * 64 - var17) * var16 / 64, var8 - (this.aClass13ArrayArray63[var19][var20].anInt108 * 64 - var18 + 64) * var16 / 64, var16, var9);
            }
        }

        if (var10 != null && var11 > 0) {
            for (var19 = var14.anInt34; var19 < var14.anInt34 + var14.anInt32; ++var19) {
                for (var20 = var14.anInt33; var20 < var14.anInt39 + var14.anInt33; ++var20) {
                    this.aClass13ArrayArray63[var19][var20].method89(var10, var11, var12);
                }
            }
        }

    }

    void method38(int var1, int var2, Class13[] var3) {
        boolean var4 = var1 <= 0;
        boolean var5 = var1 >= this.aClass13ArrayArray63.length - 1;
        boolean var6 = var2 <= 0;
        boolean var7 = var2 >= this.aClass13ArrayArray63[0].length - 1;
        if (var7) {
            var3[Class148.aClass148_1816.ordinal()] = null;
        } else {
            var3[Class148.aClass148_1816.ordinal()] = this.aClass13ArrayArray63[var1][var2 + 1];
        }

        var3[Class148.aClass148_1825.ordinal()] = !var7 && !var5 ? this.aClass13ArrayArray63[var1 + 1][var2 + 1] : null;
        var3[Class148.aClass148_1822.ordinal()] = !var7 && !var4 ? this.aClass13ArrayArray63[var1 - 1][var2 + 1] : null;
        var3[Class148.aClass148_1819.ordinal()] = var5 ? null : this.aClass13ArrayArray63[var1 + 1][var2];
        var3[Class148.aClass148_1824.ordinal()] = var4 ? null : this.aClass13ArrayArray63[var1 - 1][var2];
        var3[Class148.aClass148_1821.ordinal()] = var6 ? null : this.aClass13ArrayArray63[var1][var2 - 1];
        var3[Class148.aClass148_1818.ordinal()] = !var6 && !var5 ? this.aClass13ArrayArray63[var1 + 1][var2 - 1] : null;
        var3[Class148.aClass148_1823.ordinal()] = !var6 && !var4 ? this.aClass13ArrayArray63[var1 - 1][var2 - 1] : null;
    }

    public void method40(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
        if (this.aSprite61 != null) {
            this.aSprite61.method1247(var1, var2, var3, var4);
            if (var6 > 0 && var6 % var7 < var7 / 2) {
                if (this.aHashMap62 == null) {
                    this.method33();
                }

                Iterator var8 = var5.iterator();

                while (true) {
                    List var10;
                    do {
                        if (!var8.hasNext()) {
                            return;
                        }

                        int var9 = ((Integer) var8.next()).intValue();
                        var10 = (List) this.aHashMap62.get(var9);
                    } while (var10 == null);

                    Iterator var11 = var10.iterator();

                    while (var11.hasNext()) {
                        Class24 var12 = (Class24) var11.next();
                        int var13 = var3 * (var12.aSceneOffset_167.x - this.anInt51) / this.anInt60;
                        int var14 = var4 - var4 * (var12.aSceneOffset_167.y - this.anInt58) / this.anInt57;
                        DrawingArea.method1221(var13 + var1, var2 + var14, 2, 16776960, 256);
                    }
                }
            }
        }
    }

    void method33() {
        if (this.aHashMap62 == null) {
            this.aHashMap62 = new HashMap();
        }

        this.aHashMap62.clear();

        for (int var1 = 0; var1 < this.aClass13ArrayArray63.length; ++var1) {
            for (int var2 = 0; var2 < this.aClass13ArrayArray63[var1].length; ++var2) {
                List var3 = this.aClass13ArrayArray63[var1][var2].method96();
                Iterator var4 = var3.iterator();

                while (var4.hasNext()) {
                    Class24 var5 = (Class24) var4.next();
                    if (!this.aHashMap62.containsKey(var5.anInt160)) {
                        java.util.LinkedList var6 = new java.util.LinkedList();
                        var6.add(var5);
                        this.aHashMap62.put(var5.anInt160, var6);
                    } else {
                        List var7 = (List) this.aHashMap62.get(var5.anInt160);
                        var7.add(var5);
                    }
                }
            }
        }

    }

    public HashMap method36() {
        this.method33();
        return this.aHashMap62;
    }

    Class5 method29(int var1, int var2, int var3, int var4) {
        Class5 var5 = new Class5(this);
        int var6 = var1 + this.anInt51;
        int var7 = var2 + this.anInt58;
        int var8 = var3 + this.anInt51;
        int var9 = this.anInt58 + var4;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.anInt32 = var12 - var10 + 1;
        var5.anInt39 = var13 - var11 + 1;
        var5.anInt34 = var10 - this.aClass12_Sub1_52.getMinX();
        var5.anInt33 = var11 - this.aClass12_Sub1_52.getMinY();
        if (var5.anInt34 < 0) {
            var5.anInt32 += var5.anInt34;
            var5.anInt34 = 0;
        }

        if (var5.anInt34 > this.aClass13ArrayArray63.length - var5.anInt32) {
            var5.anInt32 = this.aClass13ArrayArray63.length - var5.anInt34;
        }

        if (var5.anInt33 < 0) {
            var5.anInt39 += var5.anInt33;
            var5.anInt33 = 0;
        }

        if (var5.anInt33 > this.aClass13ArrayArray63[0].length - var5.anInt39) {
            var5.anInt39 = this.aClass13ArrayArray63[0].length - var5.anInt33;
        }

        var5.anInt32 = Math.min(var5.anInt32, this.aClass13ArrayArray63.length);
        var5.anInt39 = Math.min(var5.anInt39, this.aClass13ArrayArray63[0].length);
        return var5;
    }

    float method28(int var1, int var2) {
        float var3 = (float) var1 / (float) var2;
        if (var3 > 8.0F) {
            return 8.0F;
        }
        if (var3 < 1.0F) {
            return 1.0F;
        }
        int var4 = Math.round(var3);
        return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
    }

    public boolean method34() {
        return this.aBoolean59;
    }

    public List method31(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        java.util.LinkedList var11 = new java.util.LinkedList();
        if (!this.aBoolean59) {
            return var11;
        }
        Class5 var12 = this.method29(var1, var2, var3, var4);
        float var13 = this.method28(var7, var3 - var1);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.anInt51 + var1;
        int var16 = this.anInt58 + var2;

        for (int var17 = var12.anInt34; var17 < var12.anInt34 + var12.anInt32; ++var17) {
            for (int var18 = var12.anInt33; var18 < var12.anInt39 + var12.anInt33; ++var18) {
                List var19 = this.aClass13ArrayArray63[var17][var18].method122(var5 + (this.aClass13ArrayArray63[var17][var18].anInt107 * 64 - var15) * var14 / 64, var6 + var8 - var14 * (this.aClass13ArrayArray63[var17][var18].anInt108 * 64 - var16 + 64) / 64, var14, var9, var10);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }

        return var11;
    }
}
