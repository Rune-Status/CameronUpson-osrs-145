package com.jagex;

import java.io.File;
import java.io.IOException;

public class TextureProviderImpl implements TextureProvider {
    NodeDeque<Node_Sub16> aNodeDeque885 = new NodeDeque<>();
    int anInt881;
    int anInt883 = 128;
    ReferenceTable table;
    Node_Sub16[] aNode_Sub16Array879;
    double aDouble882 = 1.0D;
    int anInt880 = 0;

    public TextureProviderImpl(ReferenceTable var1, ReferenceTable var2, int var3, double var4, int var6) {
        this.table = var2;
        this.anInt881 = var3;
        this.anInt880 = this.anInt881;
        this.aDouble882 = var4;
        this.anInt883 = var6;
        int[] var7 = var1.method1087(0);
        int var8 = var7.length;
        this.aNode_Sub16Array879 = new Node_Sub16[var1.method1101(0)];

        for (int var9 = 0; var9 < var8; ++var9) {
            Buffer var10 = new Buffer(var1.unpack(0, var7[var9]));
            this.aNode_Sub16Array879[var7[var9]] = new Node_Sub16(var10);
        }

    }

    public static Class82 method502(String var0, String var1, boolean var2) {
        File var3 = new File(HealthBar.aFile416, "preferences" + var0 + ".dat");
        if (var3.exists()) {
            try {
                return new Class82(var3, "rw", 10000L);
            } catch (IOException var9) {
            }
        }

        String var4 = "";
        if (Class102.anInt1151 == 33) {
            var4 = "_rc";
        } else if (Class102.anInt1151 == 34) {
            var4 = "_wip";
        }

        File var5 = new File(Class10.aString76, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
        Class82 var6;
        if (!var2 && var5.exists()) {
            try {
                var6 = new Class82(var5, "rw", 10000L);
                return var6;
            } catch (IOException var8) {
            }
        }

        try {
            var6 = new Class82(var3, "rw", 10000L);
            return var6;
        } catch (IOException var7) {
            throw new RuntimeException();
        }
    }

    static void method499() {
        if (InterfaceNode.aGameSocket317 != null) {
            InterfaceNode.aGameSocket317.method882();
            InterfaceNode.aGameSocket317 = null;
        }

        ReferenceCache.clearCaches();
        Class60.aSceneGraph631.method710();

        for (int var0 = 0; var0 < 4; ++var0) {
            Client.collisionMaps[var0].method757();
        }

        System.gc();
        Class133.anInt1725 = 1;
        Class133.aReferenceTable1727 = null;
        Class133.anInt1728 = -1;
        Class5.anInt38 = -1;
        Class141.anInt1784 = 0;
        Class46.aBoolean371 = false;
        CollisionMap.anInt1323 = 2;
        Client.anInt1703 = -1;
        Client.aBoolean1707 = false;
        Class34.method223();
        Class45.method304(10);
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

        this.aNodeDeque885 = new NodeDeque();
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

    public int[] method506(int var1) {
        Node_Sub16 var2 = this.aNode_Sub16Array879[var1];
        if (var2 != null) {
            if (var2.anIntArray1171 != null) {
                this.aNodeDeque885.method993(var2);
                var2.aBoolean1318 = true;
                return var2.anIntArray1171;
            }

            boolean var3 = var2.method754(this.aDouble882, this.anInt883, this.table);
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
