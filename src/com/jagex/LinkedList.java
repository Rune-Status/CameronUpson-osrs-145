package com.jagex;

import java.util.Iterator;

public class LinkedList<T extends Node> implements Iterable<T> {
    Node sentinel = new Node();
    Node tail;

    public LinkedList() {
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    public static void method908(Node var0, Node var1) {
        if (var0.previous != null) {
            var0.unlink();
        }

        var0.previous = var1;
        var0.next = var1.next;
        var0.previous.next = var0;
        var0.next.previous = var0;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator<>(this);
    }

    public void method905(T var1) {
        if (var1.previous != null) {
            var1.unlink();
        }

        var1.previous = this.sentinel.previous;
        var1.next = this.sentinel;
        var1.previous.next = var1;
        var1.next.previous = var1;
    }

    public void method912(T var1) {
        if (var1.previous != null) {
            var1.unlink();
        }

        var1.previous = this.sentinel;
        var1.next = this.sentinel.next;
        var1.previous.next = var1;
        var1.next.previous = var1;
    }

    public T method907() {
        Node var1 = this.sentinel.next;
        if (var1 == this.sentinel) {
            return null;
        }
        var1.unlink();
        return (T) var1;
    }

    T method910(T var1) {
        Node var2;
        if (var1 == null) {
            var2 = this.sentinel.next;
        } else {
            var2 = var1;
        }

        if (var2 == this.sentinel) {
            this.tail = null;
            return null;
        }
        this.tail = var2.next;
        return (T) var2;
    }

    public T method911() {
        Node var1 = this.tail;
        if (var1 == this.sentinel) {
            this.tail = null;
            return null;
        }
        this.tail = var1.next;
        return (T) var1;
    }

    public boolean method906() {
        return this.sentinel.next == this.sentinel;
    }

    public T method909() {
        return this.method910(null);
    }
}
