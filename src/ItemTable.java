public class ItemTable extends Node {
    static int anInt328;
    static int[][] anIntArrayArray341;
    static NodeTable<ItemTable> itemTables = new NodeTable<>(32);
    int[] ids = new int[]{-1};
    int[] stackSizes = new int[]{0};

    static void method284(InterfaceComponent var0) {
        if (Client.anInt1655 == var0.renderCycle) {
            Client.aBooleanArray1656[var0.boundsIndex] = true;
        }

    }
}
