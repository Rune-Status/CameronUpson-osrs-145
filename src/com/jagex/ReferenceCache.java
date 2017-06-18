package com.jagex;

public final class ReferenceCache<T extends DoublyNode> { //TODO generics here and in nodequeue
    int anInt1777;
    int anInt1779;
    DoublyNode aDoublyNode1775 = new DoublyNode();
    NodeTable<T> table;
    NodeQueue<T> nodeQueue = new NodeQueue<>();

    public ReferenceCache(int var1) {
        this.anInt1779 = var1;
        this.anInt1777 = var1;

        int var2;
        for (var2 = 1; var2 + var2 < var1; var2 += var2) {
        }

        this.table = new NodeTable<>(var2);
    }

    static void clearCaches() {
        HealthBarDefinition.method1123();
        Node_Sub21_Sub24.aReferenceCache2025.clear();
        ClientPreferences.method291();
        ObjectDefinition.aReferenceCache2013.clear();
        ObjectDefinition.aReferenceCache2045.clear();
        ObjectDefinition.aReferenceCache2047.clear();
        ObjectDefinition.aReferenceCache2042.clear();
        Class100.method650();
        ItemDefinition.aReferenceCache2115.clear();
        ItemDefinition.aReferenceCache2116.clear();
        ItemDefinition.aReferenceCache1891.clear();
        AnimationSequence.sequenceCache.clear();
        AnimationSequence.aReferenceCache2045.clear();
        GraphicDefinition.definitionCache.clear();
        GraphicDefinition.modelCache.clear();
        Varpbit.varpbitCache.clear();
        Node_Sub21_Sub20.aReferenceCache2008.clear();
        HitsplatDefinition.definitionCache.clear();
        HitsplatDefinition.spriteCache.clear();
        HitsplatDefinition.fontCache.clear();
        HealthBarDefinition.aReferenceCache2008.clear();
        HealthBarDefinition.aReferenceCache2013.clear();
        Class40.method288();
        DefinitionProperty.aReferenceCache2025.clear();
        Node_Sub21_Sub15.aReferenceCache2013.clear();
        PlayerAppearance.aReferenceCache1985.clear();
        InterfaceComponent.aReferenceCache1891.clear();
        InterfaceComponent.aReferenceCache1886.clear();
        InterfaceComponent.aReferenceCache1873.clear();
        InterfaceComponent.aReferenceCache1880.clear();
        ((TextureProviderImpl) Node_Sub21_Sub26_Sub1.aTextureProvider1085).method504();
        RuneScript.aReferenceCache664.clear();
        Client.aCacheReferenceTable1493.method1096();
        Client.aCacheReferenceTable1496.method1096();
        BoundingBox.aCacheReferenceTable372.method1096();
        Class34.aCacheReferenceTable274.method1096();
        Class126.aCacheReferenceTable1368.method1096();
        Class100.aCacheReferenceTable1119.method1096();
        Class76.aCacheReferenceTable823.method1096();
        Class21.aCacheReferenceTable139.method1096();
        Class60.aCacheReferenceTable630.method1096();
        Class82.aCacheReferenceTable848.method1096();
        Applet_Sub1.aCacheReferenceTable681.method1096();
        ScriptEvent.aCacheReferenceTable322.method1096();
    }

    public void method976(long var1) {
        T var3 = this.table.lookup(var1);
        if (var3 != null) {
            var3.unlink();
            var3.method977();
            ++this.anInt1777;
        }

    }

    public void put(T var1, long var2) {
        if (this.anInt1777 == 0) {
            T var4 = this.nodeQueue.pop();
            var4.unlink();
            var4.method977();
            if (var4 == this.aDoublyNode1775) {
                var4 = this.nodeQueue.pop();
                var4.unlink();
                var4.method977();
            }
        } else {
            --this.anInt1777;
        }

        this.table.put(var1, var2);
        this.nodeQueue.add(var1);
    }

    public void clear() {
        this.nodeQueue.clear();
        this.table.clear();
        this.aDoublyNode1775 = new DoublyNode();
        this.anInt1777 = this.anInt1779;
    }

    public T get(long var1) {
        T var3 = this.table.lookup(var1);
        if (var3 != null) {
            this.nodeQueue.add(var3);
        }

        return var3;
    }
}
