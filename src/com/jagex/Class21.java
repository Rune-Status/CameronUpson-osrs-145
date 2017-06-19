package com.jagex;

public class Class21 implements Class16 {
    public static Class93[] aClass93Array141;
    static CacheReferenceTable materials;
    int anInt143;
    int anInt6;
    int anInt3;
    int anInt4;
    int anInt142;
    int anInt5;
    int anInt1;
    int anInt121;
    int anInt120;
    int anInt119;
    int anInt2;
    int anInt144;
    int anInt122;
    int anInt140;

    static void method144(int var0) {
        if (Class33.method220(var0)) {
            InterfaceComponent[] var1 = InterfaceComponent.interfaces[var0];

            for (int var2 = 0; var2 < var1.length; ++var2) {
                InterfaceComponent var3 = var1[var2];
                if (var3 != null) {
                    var3.anInt1932 = 0;
                    var3.anInt1929 = 0;
                }
            }

        }
    }

    static void method145() {
        boolean var0 = false;

        while (!var0) {
            var0 = true;

            for (int var1 = 0; var1 < Client.menuRowCount - 1; ++var1) {
                if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
                    String var2 = Client.menuTargets[var1];
                    Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
                    Client.menuTargets[var1 + 1] = var2;
                    String var3 = Client.menuActions[var1];
                    Client.menuActions[var1] = Client.menuActions[var1 + 1];
                    Client.menuActions[var1 + 1] = var3;
                    int var4 = Client.menuOpcodes[var1];
                    Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
                    Client.menuOpcodes[var1 + 1] = var4;
                    var4 = Client.menuSecondaryArgs[var1];
                    Client.menuSecondaryArgs[var1] = Client.menuSecondaryArgs[var1 + 1];
                    Client.menuSecondaryArgs[var1 + 1] = var4;
                    var4 = Client.menuTertiaryArgs[var1];
                    Client.menuTertiaryArgs[var1] = Client.menuTertiaryArgs[var1 + 1];
                    Client.menuTertiaryArgs[var1 + 1] = var4;
                    var4 = Client.menuPrimaryArgs[var1];
                    Client.menuPrimaryArgs[var1] = Client.menuPrimaryArgs[var1 + 1];
                    Client.menuPrimaryArgs[var1 + 1] = var4;
                    if (Client.anInt1624 != -1) {
                        if (var1 == Client.anInt1624) {
                            Client.anInt1624 = var1 + 1;
                        } else if (Client.anInt1624 == var1 + 1) {
                            Client.anInt1624 = var1;
                        }
                    }

                    var0 = false;
                }
            }
        }

    }

    public boolean method10(int var1, int var2, int var3) {
        if (var1 >= this.anInt1 && var1 < this.anInt6 + this.anInt1) {
            return var2 >= (this.anInt122 << 3) + (this.anInt3 << 6) && var2 <= (this.anInt120 << 3) + (this.anInt3 << 6) + 7 && var3 >= (this.anInt2 << 6) + (this.anInt121 << 3) && var3 <= (this.anInt2 << 6) + (this.anInt119 << 3) + 7;
        }
        return false;
    }

    public boolean method5(int var1, int var2) {
        return var1 >= (this.anInt143 << 3) + (this.anInt4 << 6) && var1 <= (this.anInt4 << 6) + (this.anInt142 << 3) + 7 && var2 >= (this.anInt5 << 6) + (this.anInt144 << 3) && var2 <= (this.anInt5 << 6) + (this.anInt140 << 3) + 7;
    }

    public SceneOffset method7(int var1, int var2) {
        if (!this.method5(var1, var2)) {
            return null;
        }
        int var3 = var1 + (this.anInt3 * 64 - this.anInt4 * 64) + (this.anInt122 * 8 - this.anInt143 * 8);
        int var4 = var2 + (this.anInt2 * 64 - this.anInt5 * 64) + (this.anInt121 * 8 - this.anInt144 * 8);
        return new SceneOffset(this.anInt1, var3, var4);
    }

    public void decode(Buffer var1) {
        this.anInt1 = var1.readUnsignedByte();
        this.anInt6 = var1.readUnsignedByte();
        this.anInt3 = var1.readUnsignedShort();
        this.anInt122 = var1.readUnsignedByte();
        this.anInt120 = var1.readUnsignedByte();
        this.anInt2 = var1.readUnsignedShort();
        this.anInt121 = var1.readUnsignedByte();
        this.anInt119 = var1.readUnsignedByte();
        this.anInt4 = var1.readUnsignedShort();
        this.anInt143 = var1.readUnsignedByte();
        this.anInt142 = var1.readUnsignedByte();
        this.anInt5 = var1.readUnsignedShort();
        this.anInt144 = var1.readUnsignedByte();
        this.anInt140 = var1.readUnsignedByte();
        this.method8();
    }

    void method8() {
    }

    public int[] method2(int var1, int var2, int var3) {
        if (!this.method10(var1, var2, var3)) {
            return null;
        }
        return new int[]{this.anInt4 * 64 - this.anInt3 * 64 + var2 + (this.anInt143 * 8 - this.anInt122 * 8), var3 + (this.anInt5 * 64 - this.anInt2 * 64) + (this.anInt144 * 8 - this.anInt121 * 8)};
    }

    public void method1(WorldMapTransportation var1) {
        if (var1.minX > this.anInt4) {
            var1.minX = this.anInt4;
        }

        if (var1.maxX < this.anInt4) {
            var1.maxX = this.anInt4;
        }

        if (var1.minY > this.anInt5) {
            var1.minY = this.anInt5;
        }

        if (var1.maxY < this.anInt5) {
            var1.maxY = this.anInt5;
        }

    }
}
