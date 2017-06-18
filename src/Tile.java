public final class Tile extends Node {
    static long aLong1166;
    int anInt219;
    int sceneX;
    int anInt668;
    TilePaint paint;
    TileModel model;
    Tile aTile1176;
    Boundary boundary;
    int anInt229;
    TileDecor decor;
    int anInt226;
    EntityMarker[] markers = new EntityMarker[5];
    int[] anIntArray1171 = new int[5];
    int anInt212 = 0;
    boolean aBoolean1174;
    boolean aBoolean1173;
    boolean aBoolean980;
    Class90 aClass90_1167;
    int anInt981;
    int anInt232;
    int level;
    BoundaryDecor boundaryDecor;
    int sceneY;
    int anInt919;

    Tile(int var1, int var2, int var3) {
        this.anInt232 = this.level = var1;
        this.sceneX = var2;
        this.sceneY = var3;
    }

    static void method664() {
        Client.packet.caret = 0;
        Client.aPacket1521.caret = 0;
        Client.anInt1511 = -1;
        Client.anInt1520 = 1;
        Client.anInt1516 = -1;
        Client.anInt1517 = -1;
        Client.anInt1514 = 0;
        Client.anInt1518 = 0;
        Client.anInt1466 = 0;
        Client.menuRowCount = 0;
        Client.anInt1624 = -1;
        Client.menuOpen = false;
        Client.anInt1698 = 0;
        Client.destinationX = 0;

        int var0;
        for (var0 = 0; var0 < 2048; ++var0) {
            Client.players[var0] = null;
        }

        Client.player = null;

        for (var0 = 0; var0 < Client.npcs.length; ++var0) {
            Npc var1 = Client.npcs[var0];
            if (var1 != null) {
                var1.targetIndex = -1;
                var1.aBoolean789 = false;
            }
        }

        ItemTable.itemTables = new NodeTable<>(32);
        Class45.method304(30);

        for (var0 = 0; var0 < 100; ++var0) {
            Client.aBooleanArray1656[var0] = true;
        }

        Class34.method224();
    }
}
