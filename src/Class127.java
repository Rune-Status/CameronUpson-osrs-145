public final class Class127 {
    final int anInt1401 = 6;
    final int anInt1391 = 16;
    final int anInt1405 = 50;
    final int anInt1408 = 18002;
    final int anInt1396 = 4096;
    final int anInt1380 = 258;
    byte[] aByteArray1385 = new byte[18002];
    boolean[] aBooleanArray1402 = new boolean[256];
    int anInt1383;
    int anInt1384 = 0;
    int anInt1381;
    byte[] aByteArray1386;
    int anInt1389;
    int anInt1397;
    int anInt1392;
    int[] anIntArray1377 = new int[256];
    int anInt1382;
    int anInt1404;
    int anInt1400;
    int anInt1387;
    int anInt1394 = 0;
    boolean[] aBooleanArray1406 = new boolean[16];
    int anInt1399;
    int anInt1407;
    int[] anIntArray1374 = new int[257];
    int[][] anIntArrayArray1390 = new int[6][258];
    byte[] aByteArray1379 = new byte[256];
    byte aByte1372;
    byte[][] aByteArrayArray1373 = new byte[6][258];
    byte[] aByteArray1378 = new byte[4096];
    int[] anIntArray1395 = new int[16];
    byte[] aByteArray1388 = new byte[18002];
    byte[] aByteArray1376;
    int[][] anIntArrayArray1398 = new int[6][258];
    int[][] anIntArrayArray1393 = new int[6][258];
    int[] anIntArray1375 = new int[6];
    int anInt1371;
    int anInt1403;

    public static void method875(long var0) {
        if (var0 > 0L) {
            if (0L == var0 % 10L) {
                BoundaryDecor.method649(var0 - 1L);
                BoundaryDecor.method649(1L);
            } else {
                BoundaryDecor.method649(var0);
            }

        }
    }

    public static InterfaceComponent method877(int var0, int var1) {
        InterfaceComponent var2 = Class161.method1016(var0);
        if (var1 == -1) {
            return var2;
        } else {
            return var2 != null && var2.components != null && var1 < var2.components.length ? var2.components[var1] : null;
        }
    }

}
