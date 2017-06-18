package com.jagex;

public class Class171 {
    public static LinkedList<ClassStructure> aLinkedList2124 = new LinkedList<>();
    static ReferenceTable aReferenceTable2125;

    static void method1153() {
        Client.anInt1589 = 0;
        int var0 = Class62.anInt636 + (Client.playerEntity.strictX >> 7);
        int var1 = Class49.anInt377 + (Client.playerEntity.strictY >> 7);
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            Client.anInt1589 = 1;
        }

        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            Client.anInt1589 = 1;
        }

        if (Client.anInt1589 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            Client.anInt1589 = 0;
        }

    }
}
