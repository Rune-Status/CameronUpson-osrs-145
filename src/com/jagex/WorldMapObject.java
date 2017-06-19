package com.jagex;

public class WorldMapObject {
    static InterfaceComponent anInterfaceComponent83;

    final int x;
    final int y;
    final int id;

    WorldMapObject(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    static Sprite[] method60(ReferenceTable var0, int var1, int var2) {
        return !Class64.method381(var0, var1, var2) ? null : HealthBar.method343();
    }
}
