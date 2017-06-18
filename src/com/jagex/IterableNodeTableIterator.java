package com.jagex;

import java.util.Iterator;

public class IterableNodeTableIterator implements Iterator {
    Node aNode1756 = null;
    Node current;
    int anInt1757;
    RS3CopyPastedNodeTable table;

    IterableNodeTableIterator(RS3CopyPastedNodeTable var1) {
        this.table = var1;
        this.method965();
    }

    void method965() {
        this.current = this.table.buckets[0].next;
        this.anInt1757 = 1;
        this.aNode1756 = null;
    }

    public Object next() {
        Node var1;
        if (this.current != this.table.buckets[this.anInt1757 - 1]) {
            var1 = this.current;
            this.current = var1.next;
            this.aNode1756 = var1;
            return var1;
        } else {
            do {
                if (this.anInt1757 >= this.table.size) {
                    return null;
                }

                var1 = this.table.buckets[this.anInt1757++].next;
            } while (var1 == this.table.buckets[this.anInt1757 - 1]);

            this.current = var1.next;
            this.aNode1756 = var1;
            return var1;
        }
    }

    public boolean hasNext() {
        if (this.current != this.table.buckets[this.anInt1757 - 1]) {
            return true;
        } else {
            while (this.anInt1757 < this.table.size) {
                if (this.table.buckets[this.anInt1757++].next != this.table.buckets[this.anInt1757 - 1]) {
                    this.current = this.table.buckets[this.anInt1757 - 1].next;
                    return true;
                }

                this.current = this.table.buckets[this.anInt1757 - 1];
            }

            return false;
        }
    }

    public void remove() {
        this.aNode1756.unlink();
        this.aNode1756 = null;
    }
}
