package com.jagex;

public class InterfaceComponent extends Node {
    public static ReferenceCache aReferenceCache1880 = new ReferenceCache(8);
    public static InterfaceComponent[][] interfaces;
    public static ReferenceCache aReferenceCache1886 = new ReferenceCache(50);
    public static boolean aBoolean1174 = false;
    public static ReferenceCache aReferenceCache1891 = new ReferenceCache(200);
    public static ReferenceCache aReferenceCache1873 = new ReferenceCache(20);
    static ReferenceTable aReferenceTable1878;
    static int[] anIntArray1271;
    public boolean aBoolean1926;
    public int config;
    public boolean aBoolean1882;
    public int yRotation;
    public boolean aBoolean1173 = false;
    public int type;
    public Object[] anObjectArray1907;
    public int anInt236 = 0;
    public int anInt213 = 0;
    public int anInt818 = 0;
    public int anInt233 = 0;
    public int anInt234 = 0;
    public int anInt765 = 0;
    public int anInt749 = 0;
    public int anInt748 = 0;
    public int relativeX = 0;
    public int relativeY = 0;
    public int width = 0;
    public int height = 0;
    public int componentIndex = -1;
    public Object[] scrollListeners;
    public int parentUid = -1;
    public int[] anIntArray1941;
    public InterfaceComponent[] components;
    public int insetY = 0;
    public int anInt1930;
    public boolean flippedVertically;
    public int anInt802;
    public int anInt756 = 0;
    public int anInt767 = 0;
    public boolean aBoolean1861 = false;
    public Class172 aClass172_1865;
    public int anInt1864;
    public int anInt1860;
    public int anInt1859;
    public boolean aBoolean1863;
    public int materialId;
    public int enabledMaterialId;
    public int spriteId;
    public boolean aBoolean789;
    public int borderThickness;
    public int shadowColor;
    public int modelType;
    public int anInt796;
    public int[][] functionOpcodes;
    public int modelId;
    public boolean explicitlyHidden = false;
    public Object[] anObjectArray1876;
    public int anInt771;
    public Object[] hoverListeners;
    public int contentType = 0;
    public int xRotation;
    public Object[] anObjectArray1920;
    public Object[] mouseEnterListeners;
    public int viewportHeight = 0;
    public int anInt772;
    public int anInt792;
    public boolean aBoolean1869;
    public int anInt777;
    public int fontId;
    public String text;
    public String aString1894;
    public int anInt1889;
    public int anInt795;
    public int itemId;
    public int anInt1931;
    public int yPadding;
    public int[] anIntArray1881;
    public int[] anIntArray1885;
    public int[] anIntArray1883;
    public String[] tableActions;
    public int zRotation;
    public String aString1895;
    public int anInt761 = 0;
    public InterfaceComponent parent;
    public int anInt1892;
    public int modelOffsetY;
    public String selectedAction;
    public boolean aBoolean1872;
    public Object[] anObjectArray1877;
    public boolean textShadowed;
    public int modelZoom;
    public Object[] anObjectArray1909;
    public Object[] anObjectArray1918;
    public Object[] anObjectArray1905;
    public String aString1925;
    public Object[] mouseExitListeners;
    public Object[] anObjectArray1903;
    public Object[] anObjectArray1906;
    public Object[] anObjectArray1904;
    public Object[] configListenerArgs;
    public int[] configTriggers;
    public Object[] tableListenerArgs;
    public int modelOffsetX;
    public Object[] skillListenerArgs;
    public int[] skillTriggers;
    public Object[] renderListeners;
    public int anInt755 = 1;
    public int uid = -1;
    public Object[] anObjectArray1902;
    public Object[] anObjectArray1916;
    public int anInt1929;
    public int anInt760 = 1;
    public int textColor = 0;
    public Object[] anObjectArray1912;
    public Object[] anObjectArray1922;
    public Object[] anObjectArray1898;
    public Object[] anObjectArray1948;
    public Object[] anObjectArray1947;
    public int viewportWidth = 0;
    public Object[] anObjectArray1901;
    public int[] anIntArray1940;
    public int buttonType = 0;
    public Object[] anObjectArray1893;
    public String aString1935;
    public int[] itemIds;
    public int[] itemStackSizes;
    public int xPadding;
    public int itemStackSize;
    public int anInt1932;
    public int anInt784;
    public int insetX = 0;
    public boolean aBoolean1928;
    public Object[] anObjectArray1913;
    public int anInt1927;
    public int[] tableTriggers;
    public int anInt1946;
    public int anInt1944;
    public int boundsIndex;
    public int renderCycle;
    public boolean aBoolean1936;
    public boolean aBoolean1945;
    public String[] actions;
    public boolean flippedHorizontally;
    int anInt791;
    int anInt790;

    public InterfaceComponent() {
        this.aClass172_1865 = Class172.aClass172_2126;
        this.anInt1864 = 0;
        this.anInt1860 = 0;
        this.anInt1859 = 1;
        this.aBoolean1863 = false;
        this.materialId = -1;
        this.enabledMaterialId = -1;
        this.spriteId = 0;
        this.aBoolean789 = false;
        this.borderThickness = 0;
        this.shadowColor = 0;
        this.modelType = 1;
        this.modelId = -1;
        this.anInt790 = 1;
        this.anInt791 = -1;
        this.anInt784 = -1;
        this.anInt771 = -1;
        this.modelOffsetX = 0;
        this.modelOffsetY = 0;
        this.xRotation = 0;
        this.zRotation = 0;
        this.yRotation = 0;
        this.modelZoom = 100;
        this.anInt772 = 0;
        this.anInt792 = 0;
        this.aBoolean1869 = false;
        this.anInt777 = 2;
        this.fontId = -1;
        this.text = "";
        this.aString1894 = "";
        this.anInt802 = 0;
        this.anInt796 = 0;
        this.anInt795 = 0;
        this.textShadowed = false;
        this.xPadding = 0;
        this.yPadding = 0;
        this.config = 0;
        this.aString1895 = "";
        this.parent = null;
        this.anInt1892 = 0;
        this.anInt1889 = 0;
        this.aBoolean1882 = false;
        this.selectedAction = "";
        this.aBoolean1872 = false;
        this.anInt1931 = -1;
        this.aString1925 = "";
        this.aString1935 = "Ok";
        this.itemId = -1;
        this.itemStackSize = 0;
        this.anInt1932 = 0;
        this.anInt1929 = 0;
        this.aBoolean1928 = false;
        this.aBoolean1926 = false;
        this.anInt1927 = -1;
        this.anInt1930 = 0;
        this.anInt1946 = 0;
        this.anInt1944 = 0;
        this.boundsIndex = -1;
        this.renderCycle = -1;
        this.aBoolean1936 = false;
        this.aBoolean1945 = false;
    }

    static String method333(InterfaceComponent var0, int var1) {
        int var2 = Class75.method448(var0);
        boolean var3 = (var2 >> var1 + 1 & 1) != 0;
        if (!var3 && var0.anObjectArray1907 == null) {
            return null;
        }
        return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
    }

    static void method409(InterfaceComponent var0, int var1, int var2, int var3) {
        Node_Sub21_Sub5 var4 = var0.method1025(false);
        if (var4 != null) {
            if (Client.anInt1698 < 3) {
                Class122.aSprite1360.method1245(var1, var2, var4.anInt204, var4.anInt209, 25, 25, Client.mapRotation, 256, var4.anIntArray950, var4.anIntArray340);
            } else {
                Node_Sub21_Sub26.method1225(var1, var2, 0, var4.anIntArray950, var4.anIntArray340);
            }

        }
    }

    static void method1053(InterfaceComponent var0, int var1, int var2, boolean var3) {
        int var4 = var0.width;
        int var5 = var0.height;
        if (var0.anInt818 == 0) {
            var0.width = var0.anInt749;
        } else if (var0.anInt818 == 1) {
            var0.width = var1 - var0.anInt749;
        } else if (var0.anInt818 == 2) {
            var0.width = var1 * var0.anInt749 >> 14;
        }

        if (var0.anInt233 == 0) {
            var0.height = var0.anInt748;
        } else if (var0.anInt233 == 1) {
            var0.height = var2 - var0.anInt748;
        } else if (var0.anInt233 == 2) {
            var0.height = var2 * var0.anInt748 >> 14;
        }

        if (var0.anInt818 == 4) {
            var0.width = var0.anInt755 * var0.height / var0.anInt760;
        }

        if (var0.anInt233 == 4) {
            var0.height = var0.width * var0.anInt760 / var0.anInt755;
        }

        if (Client.aBoolean1637 && var0.type == 0) {
            if (var0.height < 5 && var0.width < 5) {
                var0.height = 5;
                var0.width = 5;
            } else {
                if (var0.height <= 0) {
                    var0.height = 5;
                }

                if (var0.width <= 0) {
                    var0.width = 5;
                }
            }
        }

        if (var0.contentType == 1337) {
            Client.anInterfaceComponent1638 = var0;
        }

        if (var3 && var0.anObjectArray1920 != null && (var4 != var0.width || var0.height != var5)) {
            ScriptEvent var6 = new ScriptEvent();
            var6.source = var0;
            var6.args = var0.anObjectArray1920;
            Client.aNodeDeque1661.method997(var6);
        }

    }

    public static InterfaceComponent method1016(int var0) {
        int var1 = var0 >> 16;
        int var2 = var0 & '\uffff';
        if (interfaces[var1] == null || interfaces[var1][var2] == null) {
            boolean var3 = Class33.method220(var1);
            if (!var3) {
                return null;
            }
        }

        return interfaces[var1][var2];
    }

    static void method978(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (Class33.method220(var0)) {
            Class183.method1201(interfaces[var0], -1, var1, var2, var3, var4, var5, var6);
        }
    }

    static void method215(InterfaceComponent[] var0, int var1) {
        for (int var2 = 0; var2 < var0.length; ++var2) {
            InterfaceComponent var3 = var0[var2];
            if (var3 != null) {
                if (var3.type == 0) {
                    if (var3.components != null) {
                        method215(var3.components, var1);
                    }

                    InterfaceNode var4 = Client.interfaceNodes.lookup((long) var3.uid);
                    if (var4 != null) {
                        Class76.method452(var4.id, var1);
                    }
                }

                ScriptEvent var5;
                if (var1 == 0 && var3.anObjectArray1912 != null) {
                    var5 = new ScriptEvent();
                    var5.source = var3;
                    var5.args = var3.anObjectArray1912;
                    Class25.method174(var5);
                }

                if (var1 == 1 && var3.anObjectArray1922 != null) {
                    if (var3.componentIndex >= 0) {
                        InterfaceComponent var6 = method1016(var3.uid);
                        if (var6 == null || var6.components == null || var3.componentIndex >= var6.components.length || var6.components[var3.componentIndex] != var3) {
                            continue;
                        }
                    }

                    var5 = new ScriptEvent();
                    var5.source = var3;
                    var5.args = var3.anObjectArray1922;
                    Class25.method174(var5);
                }
            }
        }

    }

    public Sprite method1017(int var1) {
        aBoolean1174 = false;
        if (var1 >= 0 && var1 < this.anIntArray1883.length) {
            int var2 = this.anIntArray1883[var1];
            if (var2 == -1) {
                return null;
            }
            Sprite var3 = (Sprite) aReferenceCache1891.get((long) var2);
            if (var3 != null) {
                return var3;
            }
            var3 = Class176.method1188(Legacy2DBoundingBox.aReferenceTable398, var2, 0);
            if (var3 != null) {
                aReferenceCache1891.put(var3, (long) var2);
            } else {
                aBoolean1174 = true;
            }

            return var3;
        }
        return null;
    }

    void method1027(Buffer var1) {
        var1.readUnsignedByte();
        this.aBoolean1173 = true;
        this.type = var1.readUnsignedByte();
        this.contentType = var1.readUnsignedShort();
        this.anInt234 = var1.readShort();
        this.anInt765 = var1.readShort();
        this.anInt749 = var1.readUnsignedShort();
        if (this.type == 9) {
            this.anInt748 = var1.readShort();
        } else {
            this.anInt748 = var1.readUnsignedShort();
        }

        this.anInt818 = var1.method870();
        this.anInt233 = var1.method870();
        this.anInt236 = var1.method870();
        this.anInt213 = var1.method870();
        this.parentUid = var1.readUnsignedShort();
        if (this.parentUid == 65535) {
            this.parentUid = -1;
        } else {
            this.parentUid += this.uid & -65536;
        }

        this.explicitlyHidden = var1.readUnsignedByte() == 1;
        if (this.type == 0) {
            this.viewportWidth = var1.readUnsignedShort();
            this.viewportHeight = var1.readUnsignedShort();
            this.aBoolean1936 = var1.readUnsignedByte() == 1;
        }

        if (this.type == 5) {
            this.materialId = var1.method835();
            this.spriteId = var1.readUnsignedShort();
            this.aBoolean789 = var1.readUnsignedByte() == 1;
            this.anInt1864 = var1.readUnsignedByte();
            this.borderThickness = var1.readUnsignedByte();
            this.shadowColor = var1.method835();
            this.flippedVertically = var1.readUnsignedByte() == 1;
            this.flippedHorizontally = var1.readUnsignedByte() == 1;
        }

        if (this.type == 6) {
            this.modelType = 1;
            this.modelId = var1.readUnsignedShort();
            if (this.modelId == 65535) {
                this.modelId = -1;
            }

            this.modelOffsetX = var1.readShort();
            this.modelOffsetY = var1.readShort();
            this.xRotation = var1.readUnsignedShort();
            this.zRotation = var1.readUnsignedShort();
            this.yRotation = var1.readUnsignedShort();
            this.modelZoom = var1.readUnsignedShort();
            this.anInt784 = var1.readUnsignedShort();
            if (this.anInt784 == 65535) {
                this.anInt784 = -1;
            }

            this.aBoolean1869 = var1.readUnsignedByte() == 1;
            var1.readUnsignedShort();
            if (this.anInt818 != 0) {
                this.anInt772 = var1.readUnsignedShort();
            }

            if (this.anInt233 != 0) {
                var1.readUnsignedShort();
            }
        }

        if (this.type == 4) {
            this.fontId = var1.readUnsignedShort();
            if (this.fontId == 65535) {
                this.fontId = -1;
            }

            this.text = var1.method819();
            this.anInt802 = var1.readUnsignedByte();
            this.anInt796 = var1.readUnsignedByte();
            this.anInt795 = var1.readUnsignedByte();
            this.textShadowed = var1.readUnsignedByte() == 1;
            this.textColor = var1.method835();
        }

        if (this.type == 3) {
            this.textColor = var1.method835();
            this.aBoolean1861 = var1.readUnsignedByte() == 1;
            this.anInt1864 = var1.readUnsignedByte();
        }

        if (this.type == 9) {
            this.anInt1859 = var1.readUnsignedByte();
            this.textColor = var1.method835();
            this.aBoolean1863 = var1.readUnsignedByte() == 1;
        }

        this.config = var1.method868();
        this.aString1895 = var1.method819();
        int var2 = var1.readUnsignedByte();
        if (var2 > 0) {
            this.actions = new String[var2];

            for (int var3 = 0; var3 < var2; ++var3) {
                this.actions[var3] = var1.method819();
            }
        }

        this.anInt1892 = var1.readUnsignedByte();
        this.anInt1889 = var1.readUnsignedByte();
        this.aBoolean1882 = var1.readUnsignedByte() == 1;
        this.selectedAction = var1.method819();
        this.anObjectArray1877 = this.readObjectArray(var1);
        this.mouseEnterListeners = this.readObjectArray(var1);
        this.mouseExitListeners = this.readObjectArray(var1);
        this.anObjectArray1904 = this.readObjectArray(var1);
        this.anObjectArray1898 = this.readObjectArray(var1);
        this.configListenerArgs = this.readObjectArray(var1);
        this.tableListenerArgs = this.readObjectArray(var1);
        this.skillListenerArgs = this.readObjectArray(var1);
        this.renderListeners = this.readObjectArray(var1);
        this.anObjectArray1907 = this.readObjectArray(var1);
        this.hoverListeners = this.readObjectArray(var1);
        this.anObjectArray1893 = this.readObjectArray(var1);
        this.anObjectArray1876 = this.readObjectArray(var1);
        this.anObjectArray1909 = this.readObjectArray(var1);
        this.anObjectArray1918 = this.readObjectArray(var1);
        this.anObjectArray1903 = this.readObjectArray(var1);
        this.anObjectArray1906 = this.readObjectArray(var1);
        this.scrollListeners = this.readObjectArray(var1);
        this.configTriggers = this.readIntArray(var1);
        this.tableTriggers = this.readIntArray(var1);
        this.skillTriggers = this.readIntArray(var1);
    }

    Object[] readObjectArray(Buffer var1) {
        int var2 = var1.readUnsignedByte();
        if (var2 == 0) {
            return null;
        }
        Object[] var3 = new Object[var2];

        for (int var4 = 0; var4 < var2; ++var4) {
            int var5 = var1.readUnsignedByte();
            if (var5 == 0) {
                var3[var4] = var1.method835();
            } else if (var5 == 1) {
                var3[var4] = var1.method819();
            }
        }

        this.aBoolean1872 = true;
        return var3;
    }

    int[] readIntArray(Buffer var1) {
        int var2 = var1.readUnsignedByte();
        if (var2 == 0) {
            return null;
        }
        int[] var3 = new int[var2];

        for (int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.method835();
        }

        return var3;
    }

    public Sprite getMaterial(boolean enabled) {
        aBoolean1174 = false;
        int var2;
        if (enabled) {
            var2 = this.enabledMaterialId;
        } else {
            var2 = this.materialId;
        }

        if (var2 == -1) {
            return null;
        }
        long var3 = ((long) this.borderThickness << 36) + (long) var2 + ((this.flippedVertically ? 1L : 0L) << 38) + ((this.flippedHorizontally ? 1L : 0L) << 39) + ((long) this.shadowColor << 40);
        Sprite var5 = (Sprite) aReferenceCache1891.get(var3);
        if (var5 != null) {
            return var5;
        }
        var5 = Class176.method1188(Legacy2DBoundingBox.aReferenceTable398, var2, 0);
        if (var5 == null) {
            aBoolean1174 = true;
            return null;
        }
        if (this.flippedVertically) {
            var5.method724();
        }

        if (this.flippedHorizontally) {
            var5.method1123();
        }

        if (this.borderThickness > 0) {
            var5.method869(this.borderThickness);
        }

        if (this.borderThickness >= 1) {
            var5.method1232(1);
        }

        if (this.borderThickness >= 2) {
            var5.method1232(16777215);
        }

        if (this.shadowColor != 0) {
            var5.method1240(this.shadowColor);
        }

        aReferenceCache1891.put(var5, var3);
        return var5;
    }

    public Node_Sub21_Sub5 method1025(boolean var1) {
        if (this.enabledMaterialId == -1) {
            var1 = false;
        }

        int var2 = var1 ? this.enabledMaterialId : this.materialId;
        if (var2 == -1) {
            return null;
        }
        long var3 = ((long) this.shadowColor << 40) + ((long) this.borderThickness << 36) + (long) var2 + ((this.flippedVertically ? 1L : 0L) << 38) + ((this.flippedHorizontally ? 1L : 0L) << 39);
        Node_Sub21_Sub5 var5 = (Node_Sub21_Sub5) aReferenceCache1880.get(var3);
        if (var5 != null) {
            return var5;
        }
        Sprite var6 = this.getMaterial(var1);
        if (var6 == null) {
            return null;
        }
        Sprite var7 = var6.method1238();
        int[] var8 = new int[var7.height];
        int[] var9 = new int[var7.height];

        for (int var10 = 0; var10 < var7.height; ++var10) {
            int var11 = 0;
            int var12 = var7.width;

            int var13;
            for (var13 = 0; var13 < var7.width; ++var13) {
                if (var7.pixels[var13 + var7.width * var10] == 0) {
                    var11 = var13;
                    break;
                }
            }

            for (var13 = var7.width - 1; var13 >= var11; --var13) {
                if (var7.pixels[var7.width * var10 + var13] == 0) {
                    var12 = var13 + 1;
                    break;
                }
            }

            var8[var10] = var11;
            var9[var10] = var12 - var11;
        }

        var5 = new Node_Sub21_Sub5(var7.width, var7.height, var9, var8, var2);
        aReferenceCache1880.put(var5, var3);
        return var5;
    }

    public void method1024(int var1, String var2) {
        if (this.actions == null || this.actions.length <= var1) {
            String[] var3 = new String[var1 + 1];
            if (this.actions != null) {
                for (int var4 = 0; var4 < this.actions.length; ++var4) {
                    var3[var4] = this.actions[var4];
                }
            }

            this.actions = var3;
        }

        this.actions[var1] = var2;
    }

    public Model method1019(AnimationSequence var1, int var2, boolean var3, PlayerAppearance var4) {
        aBoolean1174 = false;
        int var5;
        int var6;
        if (var3) {
            var5 = this.anInt790;
            var6 = this.anInt791;
        } else {
            var5 = this.modelType;
            var6 = this.modelId;
        }

        if (var5 == 0) {
            return null;
        }
        if (var5 == 1 && var6 == -1) {
            return null;
        }
        Model var7 = (Model) aReferenceCache1886.get((long) (var6 + (var5 << 16)));
        if (var7 == null) {
            ModelHeader var8;
            if (var5 == 1) {
                var8 = ModelHeader.method571(aReferenceTable1878, var6, 0);
                if (var8 == null) {
                    aBoolean1174 = true;
                    return null;
                }

                var7 = var8.light(64, 768, -50, -10, -50);
            }

            if (var5 == 2) {
                var8 = NpcDefinition.get(var6).method1059();
                if (var8 == null) {
                    aBoolean1174 = true;
                    return null;
                }

                var7 = var8.light(64, 768, -50, -10, -50);
            }

            if (var5 == 3) {
                if (var4 == null) {
                    return null;
                }

                var8 = var4.method1032();
                if (var8 == null) {
                    aBoolean1174 = true;
                    return null;
                }

                var7 = var8.light(64, 768, -50, -10, -50);
            }

            if (var5 == 4) {
                ItemDefinition var9 = Class149.method1001(var6);
                var8 = var9.method1136(10);
                if (var8 == null) {
                    aBoolean1174 = true;
                    return null;
                }

                var7 = var8.light(var9.anInt1868 + 64, var9.anInt1867 + 768, -50, -10, -50);
            }

            aReferenceCache1886.put(var7, (long) ((var5 << 16) + var6));
        }

        if (var1 != null) {
            var7 = var1.method1193(var7, var2);
        }

        return var7;
    }

    public Font getFont() {
        aBoolean1174 = false;
        if (this.fontId == -1) {
            return null;
        }
        Font var1 = (Font) aReferenceCache1873.get((long) this.fontId);
        if (var1 != null) {
            return var1;
        }
        ReferenceTable var2 = Legacy2DBoundingBox.aReferenceTable398;
        ReferenceTable var3 = Class82.aReferenceTable851;
        int var4 = this.fontId;
        Font var5;
        if (!Class64.method381(var2, var4, 0)) {
            var5 = null;
        } else {
            var5 = Class65.loadFont(var3.unpack(var4, 0));
        }

        if (var5 != null) {
            aReferenceCache1873.put(var5, (long) this.fontId);
        } else {
            aBoolean1174 = true;
        }

        return var5;
    }

    void method1026(Buffer var1) {
        this.aBoolean1173 = false;
        this.type = var1.readUnsignedByte();
        this.buttonType = var1.readUnsignedByte();
        this.contentType = var1.readUnsignedShort();
        this.anInt234 = var1.readShort();
        this.anInt765 = var1.readShort();
        this.anInt749 = var1.readUnsignedShort();
        this.anInt748 = var1.readUnsignedShort();
        this.anInt1864 = var1.readUnsignedByte();
        this.parentUid = var1.readUnsignedShort();
        if (this.parentUid == 65535) {
            this.parentUid = -1;
        } else {
            this.parentUid += this.uid & -65536;
        }

        this.anInt1931 = var1.readUnsignedShort();
        if (this.anInt1931 == 65535) {
            this.anInt1931 = -1;
        }

        int var2 = var1.readUnsignedByte();
        int var3;
        if (var2 > 0) {
            this.anIntArray1941 = new int[var2];
            this.anIntArray1940 = new int[var2];

            for (var3 = 0; var3 < var2; ++var3) {
                this.anIntArray1941[var3] = var1.readUnsignedByte();
                this.anIntArray1940[var3] = var1.readUnsignedShort();
            }
        }

        var3 = var1.readUnsignedByte();
        int var4;
        int var5;
        int var6;
        if (var3 > 0) {
            this.functionOpcodes = new int[var3][];

            for (var4 = 0; var4 < var3; ++var4) {
                var5 = var1.readUnsignedShort();
                this.functionOpcodes[var4] = new int[var5];

                for (var6 = 0; var6 < var5; ++var6) {
                    this.functionOpcodes[var4][var6] = var1.readUnsignedShort();
                    if (this.functionOpcodes[var4][var6] == 65535) {
                        this.functionOpcodes[var4][var6] = -1;
                    }
                }
            }
        }

        if (this.type == 0) {
            this.viewportHeight = var1.readUnsignedShort();
            this.explicitlyHidden = var1.readUnsignedByte() == 1;
        }

        if (this.type == 1) {
            var1.readUnsignedShort();
            var1.readUnsignedByte();
        }

        if (this.type == 2) {
            this.itemIds = new int[this.anInt749 * this.anInt748];
            this.itemStackSizes = new int[this.anInt749 * this.anInt748];
            var4 = var1.readUnsignedByte();
            if (var4 == 1) {
                this.config |= 268435456;
            }

            var5 = var1.readUnsignedByte();
            if (var5 == 1) {
                this.config |= 1073741824;
            }

            var6 = var1.readUnsignedByte();
            if (var6 == 1) {
                this.config |= Integer.MIN_VALUE;
            }

            int var7 = var1.readUnsignedByte();
            if (var7 == 1) {
                this.config |= 536870912;
            }

            this.xPadding = var1.readUnsignedByte();
            this.yPadding = var1.readUnsignedByte();
            this.anIntArray1881 = new int[20];
            this.anIntArray1885 = new int[20];
            this.anIntArray1883 = new int[20];

            int var8;
            for (var8 = 0; var8 < 20; ++var8) {
                int var9 = var1.readUnsignedByte();
                if (var9 == 1) {
                    this.anIntArray1881[var8] = var1.readShort();
                    this.anIntArray1885[var8] = var1.readShort();
                    this.anIntArray1883[var8] = var1.method835();
                } else {
                    this.anIntArray1883[var8] = -1;
                }
            }

            this.tableActions = new String[5];

            for (var8 = 0; var8 < 5; ++var8) {
                String var10 = var1.method819();
                if (var10.length() > 0) {
                    this.tableActions[var8] = var10;
                    this.config |= 1 << var8 + 23;
                }
            }
        }

        if (this.type == 3) {
            this.aBoolean1861 = var1.readUnsignedByte() == 1;
        }

        if (this.type == 4 || this.type == 1) {
            this.anInt796 = var1.readUnsignedByte();
            this.anInt795 = var1.readUnsignedByte();
            this.anInt802 = var1.readUnsignedByte();
            this.fontId = var1.readUnsignedShort();
            if (this.fontId == 65535) {
                this.fontId = -1;
            }

            this.textShadowed = var1.readUnsignedByte() == 1;
        }

        if (this.type == 4) {
            this.text = var1.method819();
            this.aString1894 = var1.method819();
        }

        if (this.type == 1 || this.type == 3 || this.type == 4) {
            this.textColor = var1.method835();
        }

        if (this.type == 3 || this.type == 4) {
            this.anInt761 = var1.method835();
            this.anInt756 = var1.method835();
            this.anInt767 = var1.method835();
        }

        if (this.type == 5) {
            this.materialId = var1.method835();
            this.enabledMaterialId = var1.method835();
        }

        if (this.type == 6) {
            this.modelType = 1;
            this.modelId = var1.readUnsignedShort();
            if (this.modelId == 65535) {
                this.modelId = -1;
            }

            this.anInt790 = 1;
            this.anInt791 = var1.readUnsignedShort();
            if (this.anInt791 == 65535) {
                this.anInt791 = -1;
            }

            this.anInt784 = var1.readUnsignedShort();
            if (this.anInt784 == 65535) {
                this.anInt784 = -1;
            }

            this.anInt771 = var1.readUnsignedShort();
            if (this.anInt771 == 65535) {
                this.anInt771 = -1;
            }

            this.modelZoom = var1.readUnsignedShort();
            this.xRotation = var1.readUnsignedShort();
            this.zRotation = var1.readUnsignedShort();
        }

        if (this.type == 7) {
            this.itemIds = new int[this.anInt749 * this.anInt748];
            this.itemStackSizes = new int[this.anInt748 * this.anInt749];
            this.anInt796 = var1.readUnsignedByte();
            this.fontId = var1.readUnsignedShort();
            if (this.fontId == 65535) {
                this.fontId = -1;
            }

            this.textShadowed = var1.readUnsignedByte() == 1;
            this.textColor = var1.method835();
            this.xPadding = var1.readShort();
            this.yPadding = var1.readShort();
            var4 = var1.readUnsignedByte();
            if (var4 == 1) {
                this.config |= 1073741824;
            }

            this.tableActions = new String[5];

            for (var5 = 0; var5 < 5; ++var5) {
                String var11 = var1.method819();
                if (var11.length() > 0) {
                    this.tableActions[var5] = var11;
                    this.config |= 1 << var5 + 23;
                }
            }
        }

        if (this.type == 8) {
            this.text = var1.method819();
        }

        if (this.buttonType == 2 || this.type == 2) {
            this.selectedAction = var1.method819();
            this.aString1925 = var1.method819();
            var4 = var1.readUnsignedShort() & 63;
            this.config |= var4 << 11;
        }

        if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
            this.aString1935 = var1.method819();
            if (this.aString1935.length() == 0) {
                if (this.buttonType == 1) {
                    this.aString1935 = "Ok";
                }

                if (this.buttonType == 4) {
                    this.aString1935 = "Select";
                }

                if (this.buttonType == 5) {
                    this.aString1935 = "Select";
                }

                if (this.buttonType == 6) {
                    this.aString1935 = "Continue";
                }
            }
        }

        if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
            this.config |= 4194304;
        }

        if (this.buttonType == 6) {
            this.config |= 1;
        }

    }

    public void method1022(int var1, int var2) {
        int var3 = this.itemIds[var2];
        this.itemIds[var2] = this.itemIds[var1];
        this.itemIds[var1] = var3;
        var3 = this.itemStackSizes[var2];
        this.itemStackSizes[var2] = this.itemStackSizes[var1];
        this.itemStackSizes[var1] = var3;
    }
}
