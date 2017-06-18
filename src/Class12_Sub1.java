import java.util.HashSet;
import java.util.List;

public class Class12_Sub1 extends Class12 {
    static Sprite[] aSpriteArray110;
    HashSet aHashSet113;
    HashSet aHashSet111;
    List aList112;

    public static void method125(String var0, String var1, int var2, int var3, int var4, int var5) {
        Class61.method373(var0, var1, var2, var3, var4, var5, false);
    }

    void method126(Buffer var1, Buffer var2, Buffer var3, int var4, boolean var5) {
        this.method75(var1, var4);
        int var6 = var3.readUnsignedShort();
        this.aHashSet113 = new HashSet(var6);

        int var7;
        for (var7 = 0; var7 < var6; ++var7) {
            Class6_Sub2 var8 = new Class6_Sub2();

            try {
                var8.method157(var2, var3);
            } catch (IllegalStateException var13) {
                continue;
            }

            this.aHashSet113.add(var8);
        }

        var7 = var3.readUnsignedShort();
        this.aHashSet111 = new HashSet(var7);

        for (int var9 = 0; var9 < var7; ++var9) {
            Class6_Sub1 var10 = new Class6_Sub1();

            try {
                var10.method157(var2, var3);
            } catch (IllegalStateException var12) {
                continue;
            }

            this.aHashSet111.add(var10);
        }

        this.method127(var2, var5);
    }

    void method127(Buffer var1, boolean var2) {
        this.aList112 = new java.util.LinkedList();
        int var3 = var1.readUnsignedShort();

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.readSmart32();
            SceneOffset var6 = new SceneOffset(var1.method835());
            boolean var7 = var1.readUnsignedByte() == 1;
            if (var2 || !var7) {
                this.aList112.add(new Class74(var5, var6));
            }
        }

    }
}
