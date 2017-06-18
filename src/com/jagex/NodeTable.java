package com.jagex;

public final class NodeTable<T extends Node> {
    int index = 0;
    Node[] buckets;
    Node head;
    Node tail;
    int size;

    public NodeTable(int var1) {
        this.size = var1;
        this.buckets = new Node[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            Node var3 = this.buckets[var2] = new Node();
            var3.next = var3;
            var3.previous = var3;
        }

    }

    public T lookup(long var1) {
        Node var3 = this.buckets[(int) (var1 & (long) (this.size - 1))];

        for (this.head = var3.next; this.head != var3; this.head = this.head.next) {
            if (this.head.key == var1) {
                Node var4 = this.head;
                this.head = this.head.next;
                return (T) var4;
            }
        }

        this.head = null;
        return null;
    }

    public void put(T var1, long var2) {
        if (var1.previous != null) {
            var1.unlink();
        }

        Node var4 = this.buckets[(int) (var2 & (long) (this.size - 1))];
        var1.previous = var4.previous;
        var1.next = var4;
        var1.previous.next = var1;
        var1.next.previous = var1;
        var1.key = var2;
    }

    void clear() {
        for (int var1 = 0; var1 < this.size; ++var1) {
            Node var2 = this.buckets[var1];

            while (true) {
                Node var3 = var2.next;
                if (var3 == var2) {
                    break;
                }

                var3.unlink();
            }
        }

        this.head = null;
        this.tail = null;
    }

    public T next() {
        Node var1;
        if (this.index > 0 && this.tail != this.buckets[this.index - 1]) {
            var1 = this.tail;
            this.tail = var1.next;
            return (T) var1;
        } else {
            do {
                if (this.index >= this.size) {
                    return null;
                }

                var1 = this.buckets[this.index++].next;
            } while (var1 == this.buckets[this.index - 1]);

            this.tail = var1.next;
            return (T) var1;
        }
    }

    public T first() {
        this.index = 0;
        return this.next();
    }
}
