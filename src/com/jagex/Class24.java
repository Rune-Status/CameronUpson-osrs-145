package com.jagex;

public class Class24 {
    public final SceneOffset aSceneOffset_167;
    public final int anInt160;
    public final SceneOffset aSceneOffset_162;
    final int anInt163;
    final int anInt161;
    final Class2 aClass2_166;
    int anInt165;
    int anInt164;

    Class24(int var1, SceneOffset var2, SceneOffset var3, Class2 var4) {
        this.anInt160 = var1;
        this.aSceneOffset_162 = var2;
        this.aSceneOffset_167 = var3;
        this.aClass2_166 = var4;
        Node_Sub21_Sub15 var5 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[this.anInt160];
        Sprite var6 = var5.method1117(false);
        if (var6 != null) {
            this.anInt161 = var6.width;
            this.anInt163 = var6.height;
        } else {
            this.anInt161 = 0;
            this.anInt163 = 0;
        }

    }

    boolean method156(int var1, int var2) {
        Node_Sub21_Sub15 var3 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[this.anInt160];
        switch (var3.aClass167_2096.anInt820) {
            case 0:
                if (var1 >= this.anInt165 - this.anInt161 / 2 && var1 <= this.anInt161 / 2 + this.anInt165) {
                    break;
                }

                return false;
            case 1:
                if (var1 >= this.anInt165 && var1 < this.anInt165 + this.anInt161) {
                    break;
                }

                return false;
            case 2:
                if (var1 <= this.anInt165 - this.anInt161 || var1 > this.anInt165) {
                    return false;
                }
        }

        switch (var3.aClass166_2092.anInt820) {
            case 0:
                if (var2 >= this.anInt164 - this.anInt163 / 2 && var2 <= this.anInt164 + this.anInt163 / 2) {
                    break;
                }

                return false;
            case 1:
                if (var2 < this.anInt164 || var2 >= this.anInt164 + this.anInt163) {
                    return false;
                }
                break;
            case 2:
                if (var2 <= this.anInt164 - this.anInt163 || var2 > this.anInt164) {
                    return false;
                }
        }

        return true;
    }

    boolean method154(int var1, int var2) {
        if (this.method156(var1, var2)) {
            return true;
        }
        return this.method155(var1, var2);
    }

    boolean method155(int var1, int var2) {
        if (this.aClass2_166 == null) {
            return false;
        }
        if (var1 >= this.anInt165 - this.aClass2_166.anInt14 / 2 && var1 <= this.aClass2_166.anInt14 / 2 + this.anInt165) {
            return var2 >= this.anInt164 && var2 <= this.aClass2_166.anInt11 + this.anInt164;
        }
        return false;
    }
}
