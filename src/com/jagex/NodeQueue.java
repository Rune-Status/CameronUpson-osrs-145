package com.jagex;

public final class NodeQueue<T extends DoublyNode> {

    DoublyNode root = new DoublyNode();

    public NodeQueue() {
        this.root.nextDoubly = this.root;
        this.root.previousDoubly = this.root;
    }

    T pop() {
        DoublyNode var1 = this.root.nextDoubly;
        if (var1 == this.root) {
            return null;
        }
        var1.method977();
        return (T) var1;
    }

    public T head() {
        DoublyNode var1 = this.root.nextDoubly;
        return var1 == this.root ? null : (T) var1;
    }

    public void insert(T var1) {
        if (var1.previousDoubly != null) {
            var1.method977();
        }

        var1.previousDoubly = this.root;
        var1.nextDoubly = this.root.nextDoubly;
        var1.previousDoubly.nextDoubly = var1;
        var1.nextDoubly.previousDoubly = var1;
    }

    void clear() {
        while (true) {
            DoublyNode var1 = this.root.nextDoubly;
            if (var1 == this.root) {
                return;
            }

            var1.method977();
        }
    }

    public void add(T var1) {
        if (var1.previousDoubly != null) {
            var1.method977();
        }

        var1.previousDoubly = this.root.previousDoubly;
        var1.nextDoubly = this.root;
        var1.previousDoubly.nextDoubly = var1;
        var1.nextDoubly.previousDoubly = var1;
    }
}
