public class Class100 {
    static CacheReferenceTable aCacheReferenceTable1119;
    int anInt1118;
    int anInt1120;
    int anInt1117;

    static void method651(AnimationSequence var0, int var1, int var2, int var3) {
        if (Client.anInt1430 < 50 && Client.anInt1699 != 0) {
            if (var0.anIntArray1319 != null && var1 < var0.anIntArray1319.length) {
                int var4 = var0.anIntArray1319[var1];
                if (var4 != 0) {
                    int var5 = var4 >> 8;
                    int var6 = var4 >> 4 & 7;
                    int var7 = var4 & 15;
                    Client.anIntArray1709[Client.anInt1430] = var5;
                    Client.anIntArray1713[Client.anInt1430] = var6;
                    Client.anIntArray1712[Client.anInt1430] = 0;
                    Client.audioEffects[Client.anInt1430] = null;
                    int var8 = (var2 - 64) / 128;
                    int var9 = (var3 - 64) / 128;
                    Client.anIntArray1429[Client.anInt1430] = (var9 << 8) + (var8 << 16) + var7;
                    ++Client.anInt1430;
                }
            }
        }
    }

    public static void method650() {
        NpcDefinition.aReferenceCache2008.clear();
        NpcDefinition.aReferenceCache2013.clear();
    }
}
