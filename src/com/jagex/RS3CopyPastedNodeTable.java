package com.jagex;

import java.util.Iterator;

public final class RS3CopyPastedNodeTable implements Iterable {
    int size;
    Node[] buckets;
    Node tail;
    Node head;
    int index = 0;

    public RS3CopyPastedNodeTable(int var1) {
        this.size = var1;
        this.buckets = new Node[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            Node var3 = this.buckets[var2] = new Node();
            var3.next = var3;
            var3.previous = var3;
        }

    }

    static String getObjectOrDefault(RS3CopyPastedNodeTable var0, int key, String default_) {
        if (var0 == null) {
            return default_;
        } else {
            ObjectNode var3 = (ObjectNode) var0.lookup((long) key);
            return var3 == null ? default_ : (String) var3.anObject1720;
        }
    }

    static RS3CopyPastedNodeTable readFrom(Buffer buffer, RS3CopyPastedNodeTable table) {
        int var2 = buffer.readUnsignedByte();
        int var3;
        if (table == null) {
            var3 = nextPowerOf2(var2);
            table = new RS3CopyPastedNodeTable(var3);
        }

        for (var3 = 0; var3 < var2; ++var3) {
            boolean object = buffer.readUnsignedByte() == 1;
            int var5 = buffer.method868();
            Object node;
            if (object) {
                node = new ObjectNode(buffer.method819());
            } else {
                node = new IntegerNode(buffer.method835());
            }

            table.put((Node) node, (long) var5);
        }

        return table;
    }

    static int getOrDefault(RS3CopyPastedNodeTable table, int key, int default_) {
        if (table == null) {
            return default_;
        } else {
            IntegerNode var3 = (IntegerNode) table.lookup((long) key);
            return var3 == null ? default_ : var3.value;
        }
    }

    public static int nextPowerOf2(int var0) {
        --var0;
        var0 |= var0 >>> 1;
        var0 |= var0 >>> 2;
        var0 |= var0 >>> 4;
        var0 |= var0 >>> 8;
        var0 |= var0 >>> 16;
        return var0 + 1;
    }

    public Node lookup(long var1) {
        Node var3 = this.buckets[(int) (var1 & (long) (this.size - 1))];

        for (this.head = var3.next; this.head != var3; this.head = this.head.next) {
            if (this.head.key == var1) {
                Node var4 = this.head;
                this.head = this.head.next;
                return var4;
            }
        }

        this.head = null;
        return null;
    }

    public Node first() {
        this.index = 0;
        return this.next();
    }

    public void clear() {
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

    public Node next() {
        Node var1;
        if (this.index > 0 && this.tail != this.buckets[this.index - 1]) {
            var1 = this.tail;
            this.tail = var1.next;
            return var1;
        } else {
            do {
                if (this.index >= this.size) {
                    return null;
                }

                var1 = this.buckets[this.index++].next;
            } while (var1 == this.buckets[this.index - 1]);

            this.tail = var1.next;
            return var1;
        }
    }

    public Iterator iterator() {
        return new IterableNodeTableIterator(this);
    }

    public void put(Node var1, long var2) {
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
}
