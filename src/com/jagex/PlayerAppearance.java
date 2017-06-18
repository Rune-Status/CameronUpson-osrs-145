package com.jagex;

public class PlayerAppearance {
    static final int[] anIntArray1993 = new int[]{8, 11, 4, 6, 9, 7, 10};
    public static short[] aShortArray1991;
    public static short[] aShortArray1988;
    public static ReferenceCache aReferenceCache1985 = new ReferenceCache(260);
    public static short[][] equipmentColorReplacements;
    public boolean female;
    public int transformedNpcId;
    int[] ids;
    int[] equipmentIds;
    long aLong1989;
    long aLong1990;

    public static void method1041() {
        ItemDefinition.aReferenceCache1891.clear();
    }

    public static void method1038(ReferenceTable var0) {
        Class19.aReferenceTable136 = var0;
    }

    public void method1037(int[] var1, int[] var2, boolean var3, int var4) {
        if (var1 == null) {
            var1 = new int[12];

            for (int var5 = 0; var5 < 7; ++var5) {
                for (int var6 = 0; var6 < Node_Sub21_Sub21.anInt206; ++var6) {
                    Node_Sub21_Sub21 var7 = ScriptEvent.method269(var6);
                    if (var7 != null && !var7.aBoolean813 && (var3 ? 7 : 0) + var5 == var7.anInt327) {
                        var1[anIntArray1993[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }

        this.equipmentIds = var1;
        this.ids = var2;
        this.female = var3;
        this.transformedNpcId = var4;
        this.method1042();
    }

    public void method1033(int var1, boolean var2) {
        int var3 = this.ids[var1];
        boolean var4;
        if (!var2) {
            do {
                --var3;
                if (var3 < 0) {
                    var3 = Legacy2DBoundingBox.aShortArrayArray399[var1].length - 1;
                }

                var4 = !(var1 == 4 && var3 >= 8);
            } while (!var4);
        } else {
            do {
                ++var3;
                if (var3 >= Legacy2DBoundingBox.aShortArrayArray399[var1].length) {
                    var3 = 0;
                }

                var4 = !(var1 == 4 && var3 >= 8);
            } while (!var4);
        }

        this.ids[var1] = var3;
        this.method1042();
    }

    public void method1039(boolean var1) {
        if (this.female != var1) {
            this.method1037(null, this.ids, var1, -1);
        }
    }

    public void method1040(Buffer var1) {
        var1.method451(this.female ? 1 : 0);

        int var2;
        for (var2 = 0; var2 < 7; ++var2) {
            int var3 = this.equipmentIds[anIntArray1993[var2]];
            if (var3 == 0) {
                var1.method451(-1);
            } else {
                var1.method451(var3 - 256);
            }
        }

        for (var2 = 0; var2 < 5; ++var2) {
            var1.method451(this.ids[var2]);
        }

    }

    void method1042() {
        long var1 = this.aLong1989;
        int var3 = this.equipmentIds[5];
        int var4 = this.equipmentIds[9];
        this.equipmentIds[5] = var4;
        this.equipmentIds[9] = var3;
        this.aLong1989 = 0L;

        int var5;
        for (var5 = 0; var5 < 12; ++var5) {
            this.aLong1989 <<= 4;
            if (this.equipmentIds[var5] >= 256) {
                this.aLong1989 += (long) (this.equipmentIds[var5] - 256);
            }
        }

        if (this.equipmentIds[0] >= 256) {
            this.aLong1989 += (long) (this.equipmentIds[0] - 256 >> 4);
        }

        if (this.equipmentIds[1] >= 256) {
            this.aLong1989 += (long) (this.equipmentIds[1] - 256 >> 8);
        }

        for (var5 = 0; var5 < 5; ++var5) {
            this.aLong1989 <<= 3;
            this.aLong1989 += (long) this.ids[var5];
        }

        this.aLong1989 <<= 1;
        this.aLong1989 += (long) (this.female ? 1 : 0);
        this.equipmentIds[5] = var3;
        this.equipmentIds[9] = var4;
        if (var1 != 0L && var1 != this.aLong1989) {
            aReferenceCache1985.method976(var1);
        }

    }

    public Model getModel(AnimationSequence var1, int var2, AnimationSequence var3, int var4) {
        if (this.transformedNpcId != -1) {
            return Class122.getNpcDefinition(this.transformedNpcId).method1058(var1, var2, var3, var4);
        }
        long var5 = this.aLong1989;
        int[] var7 = this.equipmentIds;
        if (var1 != null && (var1.offHand >= 0 || var1.mainHand >= 0)) {
            var7 = new int[12];

            for (int var8 = 0; var8 < 12; ++var8) {
                var7[var8] = this.equipmentIds[var8];
            }

            if (var1.offHand >= 0) {
                var5 += (long) (var1.offHand - this.equipmentIds[5] << 40);
                var7[5] = var1.offHand;
            }

            if (var1.mainHand >= 0) {
                var5 += (long) (var1.mainHand - this.equipmentIds[3] << 48);
                var7[3] = var1.mainHand;
            }
        }

        Model var9 = (Model) aReferenceCache1985.method973(var5);
        if (var9 == null) {
            boolean var10 = false;

            int var12;
            for (int var11 = 0; var11 < 12; ++var11) {
                var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !ScriptEvent.method269(var12 - 256).method1128()) {
                    var10 = true;
                }

                if (var12 >= 512 && !Class149.method1001(var12 - 512).method1137(this.female)) {
                    var10 = true;
                }
            }

            if (var10) {
                if (-1L != this.aLong1990) {
                    var9 = (Model) aReferenceCache1985.method973(this.aLong1990);
                }

                if (var9 == null) {
                    return null;
                }
            }

            if (var9 == null) {
                ModelHeader[] var13 = new ModelHeader[12];
                var12 = 0;

                int var15;
                for (int var14 = 0; var14 < 12; ++var14) {
                    var15 = var7[var14];
                    ModelHeader var16;
                    if (var15 >= 256 && var15 < 512) {
                        var16 = ScriptEvent.method269(var15 - 256).method1129();
                        if (var16 != null) {
                            var13[var12++] = var16;
                        }
                    }

                    if (var15 >= 512) {
                        var16 = Class149.method1001(var15 - 512).getEquipmentModel(this.female);
                        if (var16 != null) {
                            var13[var12++] = var16;
                        }
                    }
                }

                ModelHeader var18 = new ModelHeader(var13, var12);

                for (var15 = 0; var15 < 5; ++var15) {
                    if (this.ids[var15] < Legacy2DBoundingBox.aShortArrayArray399[var15].length) {
                        var18.recolor(aShortArray1991[var15], Legacy2DBoundingBox.aShortArrayArray399[var15][this.ids[var15]]);
                    }

                    if (this.ids[var15] < equipmentColorReplacements[var15].length) {
                        var18.recolor(aShortArray1988[var15], equipmentColorReplacements[var15][this.ids[var15]]);
                    }
                }

                var9 = var18.light(64, 850, -30, -50, -30);
                aReferenceCache1985.method975(var9, var5);
                this.aLong1990 = var5;
            }
        }

        if (var1 == null && var3 == null) {
            return var9;
        }
        Model var17;
        if (var1 != null && var3 != null) {
            var17 = var1.method1197(var9, var2, var3, var4);
        } else if (var1 != null) {
            var17 = var1.method1195(var9, var2);
        } else {
            var17 = var3.method1195(var9, var4);
        }

        return var17;
    }

    ModelHeader method1032() {
        if (this.transformedNpcId != -1) {
            return Class122.getNpcDefinition(this.transformedNpcId).method1059();
        }
        boolean var1 = false;

        int var3;
        for (int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipmentIds[var2];
            if (var3 >= 256 && var3 < 512 && !ScriptEvent.method269(var3 - 256).method1079()) {
                var1 = true;
            }

            if (var3 >= 512 && !Class149.method1001(var3 - 512).method1144(this.female)) {
                var1 = true;
            }
        }

        if (var1) {
            return null;
        }
        ModelHeader[] var4 = new ModelHeader[12];
        var3 = 0;

        int var6;
        for (int var5 = 0; var5 < 12; ++var5) {
            var6 = this.equipmentIds[var5];
            ModelHeader var7;
            if (var6 >= 256 && var6 < 512) {
                var7 = ScriptEvent.method269(var6 - 256).method1059();
                if (var7 != null) {
                    var4[var3++] = var7;
                }
            }

            if (var6 >= 512) {
                var7 = Class149.method1001(var6 - 512).method1139(this.female);
                if (var7 != null) {
                    var4[var3++] = var7;
                }
            }
        }

        ModelHeader var8 = new ModelHeader(var4, var3);

        for (var6 = 0; var6 < 5; ++var6) {
            if (this.ids[var6] < Legacy2DBoundingBox.aShortArrayArray399[var6].length) {
                var8.recolor(aShortArray1991[var6], Legacy2DBoundingBox.aShortArrayArray399[var6][this.ids[var6]]);
            }

            if (this.ids[var6] < equipmentColorReplacements[var6].length) {
                var8.recolor(aShortArray1988[var6], equipmentColorReplacements[var6][this.ids[var6]]);
            }
        }

        return var8;
    }

    public void method1035(int var1, boolean var2) {
        if (var1 != 1 || !this.female) {
            int var3 = this.equipmentIds[anIntArray1993[var1]];
            if (var3 != 0) {
                var3 -= 256;

                Node_Sub21_Sub21 var4;
                do {
                    if (!var2) {
                        --var3;
                        if (var3 < 0) {
                            var3 = Node_Sub21_Sub21.anInt206 - 1;
                        }
                    } else {
                        ++var3;
                        if (var3 >= Node_Sub21_Sub21.anInt206) {
                            var3 = 0;
                        }
                    }

                    var4 = ScriptEvent.method269(var3);
                } while (var4 == null || var4.aBoolean813 || var1 + (this.female ? 7 : 0) != var4.anInt327);

                this.equipmentIds[anIntArray1993[var1]] = var3 + 256;
                this.method1042();
            }
        }
    }

    public int method1036() {
        return this.transformedNpcId == -1 ? (this.equipmentIds[11] << 5) + (this.ids[4] << 20) + (this.ids[0] << 25) + (this.equipmentIds[0] << 15) + (this.equipmentIds[8] << 10) + this.equipmentIds[1] : Class122.getNpcDefinition(this.transformedNpcId).id + 305419896;
    }
}
