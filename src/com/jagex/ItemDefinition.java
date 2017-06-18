package com.jagex;

public class ItemDefinition extends DoublyNode {
    public static ReferenceCache aReferenceCache2115 = new ReferenceCache(64);
    public static ReferenceCache aReferenceCache2116 = new ReferenceCache(50);
    public static ReferenceCache aReferenceCache1891 = new ReferenceCache(200);
    public String[] actions = new String[]{null, null, null, null, "Drop"};
    public String[] groundActions = new String[]{null, null, "Take", null, null};
    public int stackable = 0;
    public int anInt668 = 0;
    public int anInt236 = 0;
    public boolean aBoolean1731 = false;
    public int anInt219 = 2000;
    public int anInt233 = 0;
    public boolean aBoolean2114 = false;
    public int value = 1;
    public int anInt818 = 0;
    public int id;
    public int noteId = -1;
    public String name = "null";
    public int anInt1868 = 0;
    public int anInt1867 = 0;
    public int anInt776 = 0;
    public int anInt213 = 0;
    public int anInt1864 = -1;
    public int anInt781 = -1;
    public int anInt785 = -1;
    short[] aShortArray947;
    int anInt1860 = 128;
    short[] aShortArray2020;
    short[] aShortArray936;
    int anInt745 = -1;
    short[] aShortArray938;
    RS3CopyPastedNodeTable properties;
    int anInt919;
    int anInt754 = -2;
    int anInt755 = -1;
    int anInt760 = 0;
    int anInt757 = -1;
    int anInt746 = -1;
    int anInt744 = 0;
    int anInt766 = -1;
    int anInt933 = -1;
    int anInt928 = -1;
    int anInt1862 = -1;
    int anInt761 = -1;
    int anInt756 = -1;
    int[] anIntArray956;
    int[] anIntArray930;
    int anInt1859 = 128;
    int anInt2112 = 128;
    int anInt768 = -1;
    int anInt783 = -1;

    void method756() {
    }

    void method1066(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1065(var1, var2);
        }
    }

    void method1065(Buffer var1, int var2) {
        if (var2 == 1) {
            this.anInt919 = var1.readUnsignedShort();
        } else if (var2 == 2) {
            this.name = var1.method819();
        } else if (var2 == 4) {
            this.anInt219 = var1.readUnsignedShort();
        } else if (var2 == 5) {
            this.anInt668 = var1.readUnsignedShort();
        } else if (var2 == 6) {
            this.anInt236 = var1.readUnsignedShort();
        } else if (var2 == 7) {
            this.anInt818 = var1.readUnsignedShort();
            if (this.anInt818 > 32767) {
                this.anInt818 -= 65536;
            }
        } else if (var2 == 8) {
            this.anInt233 = var1.readUnsignedShort();
            if (this.anInt233 > 32767) {
                this.anInt233 -= 65536;
            }
        } else if (var2 == 11) {
            this.stackable = 1;
        } else if (var2 == 12) {
            this.value = var1.method835();
        } else if (var2 == 16) {
            this.aBoolean1731 = true;
        } else if (var2 == 23) {
            this.anInt745 = var1.readUnsignedShort();
            this.anInt760 = var1.readUnsignedByte();
        } else if (var2 == 24) {
            this.anInt755 = var1.readUnsignedShort();
        } else if (var2 == 25) {
            this.anInt757 = var1.readUnsignedShort();
            this.anInt744 = var1.readUnsignedByte();
        } else if (var2 == 26) {
            this.anInt746 = var1.readUnsignedShort();
        } else if (var2 >= 30 && var2 < 35) {
            this.groundActions[var2 - 30] = var1.method819();
            if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
                this.groundActions[var2 - 30] = null;
            }
        } else if (var2 >= 35 && var2 < 40) {
            this.actions[var2 - 35] = var1.method819();
        } else {
            int var3;
            int var4;
            if (var2 == 40) {
                var3 = var1.readUnsignedByte();
                this.aShortArray2020 = new short[var3];
                this.aShortArray936 = new short[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.aShortArray2020[var4] = (short) var1.readUnsignedShort();
                    this.aShortArray936[var4] = (short) var1.readUnsignedShort();
                }
            } else if (var2 == 41) {
                var3 = var1.readUnsignedByte();
                this.aShortArray947 = new short[var3];
                this.aShortArray938 = new short[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    this.aShortArray947[var4] = (short) var1.readUnsignedShort();
                    this.aShortArray938[var4] = (short) var1.readUnsignedShort();
                }
            } else if (var2 == 42) {
                this.anInt754 = var1.method870();
            } else if (var2 == 65) {
                this.aBoolean2114 = true;
            } else if (var2 == 78) {
                this.anInt766 = var1.readUnsignedShort();
            } else if (var2 == 79) {
                this.anInt933 = var1.readUnsignedShort();
            } else if (var2 == 90) {
                this.anInt928 = var1.readUnsignedShort();
            } else if (var2 == 91) {
                this.anInt761 = var1.readUnsignedShort();
            } else if (var2 == 92) {
                this.anInt1862 = var1.readUnsignedShort();
            } else if (var2 == 93) {
                this.anInt756 = var1.readUnsignedShort();
            } else if (var2 == 95) {
                this.anInt213 = var1.readUnsignedShort();
            } else if (var2 == 97) {
                this.noteId = var1.readUnsignedShort();
            } else if (var2 == 98) {
                this.anInt1864 = var1.readUnsignedShort();
            } else if (var2 >= 100 && var2 < 110) {
                if (this.anIntArray956 == null) {
                    this.anIntArray956 = new int[10];
                    this.anIntArray930 = new int[10];
                }

                this.anIntArray956[var2 - 100] = var1.readUnsignedShort();
                this.anIntArray930[var2 - 100] = var1.readUnsignedShort();
            } else if (var2 == 110) {
                this.anInt1860 = var1.readUnsignedShort();
            } else if (var2 == 111) {
                this.anInt1859 = var1.readUnsignedShort();
            } else if (var2 == 112) {
                this.anInt2112 = var1.readUnsignedShort();
            } else if (var2 == 113) {
                this.anInt1868 = var1.method870();
            } else if (var2 == 114) {
                this.anInt1867 = var1.method870() * 5;
            } else if (var2 == 115) {
                this.anInt776 = var1.readUnsignedByte();
            } else if (var2 == 139) {
                this.anInt768 = var1.readUnsignedShort();
            } else if (var2 == 140) {
                this.anInt783 = var1.readUnsignedShort();
            } else if (var2 == 148) {
                this.anInt781 = var1.readUnsignedShort();
            } else if (var2 == 149) {
                this.anInt785 = var1.readUnsignedShort();
            } else if (var2 == 249) {
                this.properties = RS3CopyPastedNodeTable.readFrom(var1, this.properties);
            }
        }

    }

    void method1147(ItemDefinition var1, ItemDefinition var2) {
        this.anInt919 = var1.anInt919;
        this.anInt219 = var1.anInt219;
        this.anInt668 = var1.anInt668;
        this.anInt236 = var1.anInt236;
        this.anInt213 = var1.anInt213;
        this.anInt818 = var1.anInt818;
        this.anInt233 = var1.anInt233;
        this.aShortArray2020 = var2.aShortArray2020;
        this.aShortArray936 = var2.aShortArray936;
        this.aShortArray947 = var2.aShortArray947;
        this.aShortArray938 = var2.aShortArray938;
        this.name = var2.name;
        this.aBoolean1731 = var2.aBoolean1731;
        this.stackable = var2.stackable;
        this.anInt745 = var2.anInt745;
        this.anInt755 = var2.anInt755;
        this.anInt766 = var2.anInt766;
        this.anInt757 = var2.anInt757;
        this.anInt746 = var2.anInt746;
        this.anInt933 = var2.anInt933;
        this.anInt928 = var2.anInt928;
        this.anInt1862 = var2.anInt1862;
        this.anInt761 = var2.anInt761;
        this.anInt756 = var2.anInt756;
        this.anInt776 = var2.anInt776;
        this.groundActions = var2.groundActions;
        this.actions = new String[5];
        if (var2.actions != null) {
            for (int var3 = 0; var3 < 4; ++var3) {
                this.actions[var3] = var2.actions[var3];
            }
        }

        this.actions[4] = "Discard";
        this.value = 0;
    }

    void method1146(ItemDefinition var1, ItemDefinition var2) {
        this.anInt919 = var1.anInt919;
        this.anInt219 = var1.anInt219;
        this.anInt668 = var1.anInt668;
        this.anInt236 = var1.anInt236;
        this.anInt213 = var1.anInt213;
        this.anInt818 = var1.anInt818;
        this.anInt233 = var1.anInt233;
        this.aShortArray2020 = var1.aShortArray2020;
        this.aShortArray936 = var1.aShortArray936;
        this.aShortArray947 = var1.aShortArray947;
        this.aShortArray938 = var1.aShortArray938;
        this.name = var2.name;
        this.aBoolean1731 = var2.aBoolean1731;
        this.value = var2.value;
        this.stackable = 1;
    }

    public final ModelHeader method1136(int var1) {
        int var3;
        if (this.anIntArray956 != null && var1 > 1) {
            int var2 = -1;

            for (var3 = 0; var3 < 10; ++var3) {
                if (var1 >= this.anIntArray930[var3] && this.anIntArray930[var3] != 0) {
                    var2 = this.anIntArray956[var3];
                }
            }

            if (var2 != -1) {
                return Class149.method1001(var2).method1136(1);
            }
        }

        ModelHeader var4 = ModelHeader.method571(Class44.aReferenceTable369, this.anInt919, 0);
        if (var4 == null) {
            return null;
        } else {
            if (this.anInt1860 != 128 || this.anInt1859 != 128 || this.anInt2112 != 128) {
                var4.method564(this.anInt1860, this.anInt1859, this.anInt2112);
            }

            if (this.aShortArray2020 != null) {
                for (var3 = 0; var3 < this.aShortArray2020.length; ++var3) {
                    var4.recolor(this.aShortArray2020[var3], this.aShortArray936[var3]);
                }
            }

            if (this.aShortArray947 != null) {
                for (var3 = 0; var3 < this.aShortArray947.length; ++var3) {
                    var4.method573(this.aShortArray947[var3], this.aShortArray938[var3]);
                }
            }

            return var4;
        }
    }

    public final boolean method1137(boolean var1) {
        int var2 = this.anInt745;
        int var3 = this.anInt755;
        int var4 = this.anInt766;
        if (var1) {
            var2 = this.anInt757;
            var3 = this.anInt746;
            var4 = this.anInt933;
        }

        if (var2 == -1) {
            return true;
        } else {
            boolean var5 = true;
            if (!Class44.aReferenceTable369.method1102(var2, 0)) {
                var5 = false;
            }

            if (var3 != -1 && !Class44.aReferenceTable369.method1102(var3, 0)) {
                var5 = false;
            }

            if (var4 != -1 && !Class44.aReferenceTable369.method1102(var4, 0)) {
                var5 = false;
            }

            return var5;
        }
    }

    public final ModelHeader getEquipmentModel(boolean var1) {
        int var2 = this.anInt745;
        int var3 = this.anInt755;
        int var4 = this.anInt766;
        if (var1) {
            var2 = this.anInt757;
            var3 = this.anInt746;
            var4 = this.anInt933;
        }

        if (var2 == -1) {
            return null;
        } else {
            ModelHeader var5 = ModelHeader.method571(Class44.aReferenceTable369, var2, 0);
            if (var3 != -1) {
                ModelHeader var6 = ModelHeader.method571(Class44.aReferenceTable369, var3, 0);
                if (var4 != -1) {
                    ModelHeader var7 = ModelHeader.method571(Class44.aReferenceTable369, var4, 0);
                    ModelHeader[] var8 = new ModelHeader[]{var5, var6, var7};
                    var5 = new ModelHeader(var8, 3);
                } else {
                    ModelHeader[] var10 = new ModelHeader[]{var5, var6};
                    var5 = new ModelHeader(var10, 2);
                }
            }

            if (!var1 && this.anInt760 != 0) {
                var5.method574(0, this.anInt760, 0);
            }

            if (var1 && this.anInt744 != 0) {
                var5.method574(0, this.anInt744, 0);
            }

            int var9;
            if (this.aShortArray2020 != null) {
                for (var9 = 0; var9 < this.aShortArray2020.length; ++var9) {
                    var5.recolor(this.aShortArray2020[var9], this.aShortArray936[var9]);
                }
            }

            if (this.aShortArray947 != null) {
                for (var9 = 0; var9 < this.aShortArray947.length; ++var9) {
                    var5.method573(this.aShortArray947[var9], this.aShortArray938[var9]);
                }
            }

            return var5;
        }
    }

    public final boolean method1144(boolean var1) {
        int var2 = this.anInt928;
        int var3 = this.anInt1862;
        if (var1) {
            var2 = this.anInt761;
            var3 = this.anInt756;
        }

        if (var2 == -1) {
            return true;
        } else {
            boolean var4 = true;
            if (!Class44.aReferenceTable369.method1102(var2, 0)) {
                var4 = false;
            }

            if (var3 != -1 && !Class44.aReferenceTable369.method1102(var3, 0)) {
                var4 = false;
            }

            return var4;
        }
    }

    public final ModelHeader method1139(boolean var1) {
        int var2 = this.anInt928;
        int var3 = this.anInt1862;
        if (var1) {
            var2 = this.anInt761;
            var3 = this.anInt756;
        }

        if (var2 == -1) {
            return null;
        } else {
            ModelHeader var4 = ModelHeader.method571(Class44.aReferenceTable369, var2, 0);
            if (var3 != -1) {
                ModelHeader var5 = ModelHeader.method571(Class44.aReferenceTable369, var3, 0);
                ModelHeader[] var6 = new ModelHeader[]{var4, var5};
                var4 = new ModelHeader(var6, 2);
            }

            int var7;
            if (this.aShortArray2020 != null) {
                for (var7 = 0; var7 < this.aShortArray2020.length; ++var7) {
                    var4.recolor(this.aShortArray2020[var7], this.aShortArray936[var7]);
                }
            }

            if (this.aShortArray947 != null) {
                for (var7 = 0; var7 < this.aShortArray947.length; ++var7) {
                    var4.method573(this.aShortArray947[var7], this.aShortArray938[var7]);
                }
            }

            return var4;
        }
    }

    public String getOrDefault(int key, String default_) {
        return RS3CopyPastedNodeTable.getObjectOrDefault(this.properties, key, default_);
    }

    public int getOrDefault(int key, int default_) {
        return RS3CopyPastedNodeTable.getOrDefault(this.properties, key, default_);
    }

    public ItemDefinition method1142(int var1) {
        if (this.anIntArray956 != null && var1 > 1) {
            int var2 = -1;

            for (int var3 = 0; var3 < 10; ++var3) {
                if (var1 >= this.anIntArray930[var3] && this.anIntArray930[var3] != 0) {
                    var2 = this.anIntArray956[var3];
                }
            }

            if (var2 != -1) {
                return Class149.method1001(var2);
            }
        }

        return this;
    }

    void method1138(ItemDefinition var1, ItemDefinition var2) {
        this.anInt919 = var1.anInt919;
        this.anInt219 = var1.anInt219;
        this.anInt668 = var1.anInt668;
        this.anInt236 = var1.anInt236;
        this.anInt213 = var1.anInt213;
        this.anInt818 = var1.anInt818;
        this.anInt233 = var1.anInt233;
        this.aShortArray2020 = var1.aShortArray2020;
        this.aShortArray936 = var1.aShortArray936;
        this.aShortArray947 = var1.aShortArray947;
        this.aShortArray938 = var1.aShortArray938;
        this.stackable = var1.stackable;
        this.name = var2.name;
        this.value = 0;
        this.aBoolean1731 = false;
        this.aBoolean2114 = false;
    }

    public int method859() {
        if (this.anInt754 != -1 && this.actions != null) {
            if (this.anInt754 >= 0) {
                return this.actions[this.anInt754] != null ? this.anInt754 : -1;
            } else {
                return "Drop".equalsIgnoreCase(this.actions[4]) ? 4 : -1;
            }
        } else {
            return -1;
        }
    }

    public final Model method1141(int var1) {
        if (this.anIntArray956 != null && var1 > 1) {
            int var2 = -1;

            for (int var3 = 0; var3 < 10; ++var3) {
                if (var1 >= this.anIntArray930[var3] && this.anIntArray930[var3] != 0) {
                    var2 = this.anIntArray956[var3];
                }
            }

            if (var2 != -1) {
                return Class149.method1001(var2).method1141(1);
            }
        }

        Model var4 = (Model) aReferenceCache2116.method973((long) this.id);
        if (var4 != null) {
            return var4;
        } else {
            ModelHeader var5 = ModelHeader.method571(Class44.aReferenceTable369, this.anInt919, 0);
            if (var5 == null) {
                return null;
            } else {
                if (this.anInt1860 != 128 || this.anInt1859 != 128 || this.anInt2112 != 128) {
                    var5.method564(this.anInt1860, this.anInt1859, this.anInt2112);
                }

                int var6;
                if (this.aShortArray2020 != null) {
                    for (var6 = 0; var6 < this.aShortArray2020.length; ++var6) {
                        var5.recolor(this.aShortArray2020[var6], this.aShortArray936[var6]);
                    }
                }

                if (this.aShortArray947 != null) {
                    for (var6 = 0; var6 < this.aShortArray947.length; ++var6) {
                        var5.method573(this.aShortArray947[var6], this.aShortArray938[var6]);
                    }
                }

                var4 = var5.light(this.anInt1868 + 64, this.anInt1867 + 768, -50, -10, -50);
                var4.aBoolean1259 = true;
                aReferenceCache2116.method975(var4, (long) this.id);
                return var4;
            }
        }
    }
}
