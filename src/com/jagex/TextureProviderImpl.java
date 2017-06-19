package com.jagex;

import java.io.File;
import java.io.IOException;

public class TextureProviderImpl implements TextureProvider {

    NodeDeque<Node_Sub16> aNodeDeque885 = new NodeDeque<>();
    int anInt881;
    int anInt883 = 128;
    ReferenceTable materials;
    Node_Sub16[] aNode_Sub16Array879;
    double aDouble882 = 1.0D;
    int anInt880 = 0;

    public TextureProviderImpl(ReferenceTable textures, ReferenceTable materials, int var3, double var4, int var6) {
        this.materials = materials;
        this.anInt881 = var3;
        this.anInt880 = this.anInt881;
        this.aDouble882 = var4;
        this.anInt883 = var6;
        int[] var7 = textures.method1087(0);
        int var8 = var7.length;
        this.aNode_Sub16Array879 = new Node_Sub16[textures.method1101(0)];

        for (int var9 = 0; var9 < var8; ++var9) {
            Buffer var10 = new Buffer(textures.unpack(0, var7[var9]));
            this.aNode_Sub16Array879[var7[var9]] = new Node_Sub16(var10);
        }

    }

    public boolean method503(int var1) {
        return this.anInt883 == 64;
    }

    public void method498(double var1) {
        this.aDouble882 = var1;
        this.method504();
    }

    public int method501(int var1) {
        return this.aNode_Sub16Array879[var1] != null ? this.aNode_Sub16Array879[var1].anInt327 : 0;
    }

    public boolean method500(int var1) {
        return this.aNode_Sub16Array879[var1].aBoolean994;
    }

    public void method504() {
        for (int var1 = 0; var1 < this.aNode_Sub16Array879.length; ++var1) {
            if (this.aNode_Sub16Array879[var1] != null) {
                this.aNode_Sub16Array879[var1].method756();
            }
        }

        this.aNodeDeque885 = new NodeDeque<>();
        this.anInt880 = this.anInt881;
    }

    public void method505(int var1) {
        for (int var2 = 0; var2 < this.aNode_Sub16Array879.length; ++var2) {
            Node_Sub16 var3 = this.aNode_Sub16Array879[var2];
            if (var3 != null && var3.anInt226 != 0 && var3.aBoolean1318) {
                var3.method755(var1);
                var3.aBoolean1318 = false;
            }
        }

    }

    public int[] getPixels(int var1) {
        Node_Sub16 var2 = this.aNode_Sub16Array879[var1];
        if (var2 != null) {
            if (var2.anIntArray1171 != null) {
                this.aNodeDeque885.method993(var2);
                var2.aBoolean1318 = true;
                return var2.anIntArray1171;
            }

            boolean var3 = var2.method754(this.aDouble882, this.anInt883, this.materials);
            if (var3) {
                if (this.anInt880 == 0) {
                    Node_Sub16 var4 = this.aNodeDeque885.method996();
                    var4.method756();
                } else {
                    --this.anInt880;
                }

                this.aNodeDeque885.method993(var2);
                var2.aBoolean1318 = true;
                return var2.anIntArray1171;
            }
        }

        return null;
    }
}
