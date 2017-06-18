import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.util.Comparator;

final class Class60 implements Comparator {
    static GarbageCollectorMXBean aGarbageCollectorMXBean629;
    static CacheReferenceTable aCacheReferenceTable630;
    static SceneGraph aSceneGraph631;

    static int method367(int var0, int var1) {
        Node_Sub21_Sub12 var2 = Node_Sub21_Sub10.method1063(var0);
        if (var2 == null) {
            return var1;
        } else if (var2.anInt328 >= 0) {
            return var2.anInt328 | -16777216;
        } else {
            int var3;
            if (var2.anInt232 >= 0) {
                var3 = Class23.method152(Node_Sub21_Sub26_Sub1.aTextureProvider1085.method501(var2.anInt232), 96);
                return Node_Sub21_Sub26_Sub1.anIntArray240[var3] | -16777216;
            } else if (var2.anInt206 == 16711935) {
                return var1;
            } else {
                var3 = Class6_Sub2.method459(var2.anInt221, var2.anInt220, var2.anInt217);
                int var4 = Class23.method152(var3, 96);
                return Node_Sub21_Sub26_Sub1.anIntArray240[var4] | -16777216;
            }
        }
    }

    static boolean method369() {
        try {
            if (World.aClass25_384 == null) {
                World.aClass25_384 = new Class25(Applet_Sub1.aClass108_301, new URL(Class122_Sub1.aString1184));
            } else {
                byte[] var0 = World.aClass25_384.method173();
                if (var0 != null) {
                    Buffer var1 = new Buffer(var0);
                    World.anInt397 = var1.readUnsignedShort();
                    World.aWorldArray396 = new World[World.anInt397];

                    World var3;
                    for (int var2 = 0; var2 < World.anInt397; var3.anInt394 = var2++) {
                        var3 = World.aWorldArray396[var2] = new World();
                        var3.id = var1.readUnsignedShort();
                        var3.mask = var1.method835();
                        var3.domain = var1.method819();
                        var3.activity = var1.method819();
                        var3.location = var1.readUnsignedByte();
                        var3.population = var1.readShort();
                    }

                    Player.method192(World.aWorldArray396, 0, World.aWorldArray396.length - 1, World.anIntArray385, World.anIntArray387);
                    World.aClass25_384 = null;
                    return true;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            World.aClass25_384 = null;
        }

        return false;
    }

    static void method371(int var0, int var1) {
        if (Client.anInt1485 == 2) {
            RuntimeException_Sub1.method741((Client.hintArrowX - Class62.anInt636 << 7) + Client.anInt1494, (Client.hintArrowY - Class49.anInt377 << 7) + Client.anInt1488, Client.hintArrowType * 2);
            if (Client.anInt1561 > -1 && Client.engineCycle % 20 < 10) {
                Class70.aSpriteArray715[0].method1230(Client.anInt1561 + var0 - 12, Client.anInt1571 + var1 - 28);
            }

        }
    }

    public static int method370(int var0, Class147 var1) {
        return var1.anInt1811 + (var0 << 8);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method368((Class53) var1, (Class53) var2);
    }

    int method368(Class53 var1, Class53 var2) {
        return var1.aGrandExchangeOffer408.itemPrice < var2.aGrandExchangeOffer408.itemPrice ? -1 : (var1.aGrandExchangeOffer408.itemPrice == var2.aGrandExchangeOffer408.itemPrice ? 0 : 1);
    }
}
