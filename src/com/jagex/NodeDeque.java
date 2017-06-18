package com.jagex;

public class NodeDeque<T extends Node> {
    public Node tail = new Node();
    Node head;

    public NodeDeque() {
        this.tail.next = this.tail;
        this.tail.previous = this.tail;
    }

    public static void method992(Node var0, Node var1) {
        if (var0.previous != null) {
            var0.unlink();
        }

        var0.previous = var1.previous;
        var0.next = var1;
        var0.previous.next = var0;
        var0.next.previous = var0;
    }

    public void method989() {
        while (true) {
            Node var1 = this.tail.next;
            if (var1 == this.tail) {
                this.head = null;
                return;
            }

            var1.unlink();
        }
    }

    public T method994() {
        Node var1 = this.tail.next;
        if (var1 == this.tail) {
            return null;
        }
        var1.unlink();
        return (T) var1;
    }

    public T method995() {
        Node var1 = this.tail.next;
        if (var1 == this.tail) {
            this.head = null;
            return null;
        }
        this.head = var1.next;
        return (T) var1;
    }

    public T current() {
        Node var1 = this.tail.previous;
        if (var1 == this.tail) {
            this.head = null;
            return null;
        }
        this.head = var1.previous;
        return (T) var1;
    }

    public T method990() {
        Node var1 = this.head;
        if (var1 == this.tail) {
            this.head = null;
            return null;
        }
        this.head = var1.previous;
        return (T) var1;
    }

    public void method993(T var1) {
        if (var1.previous != null) {
            var1.unlink();
        }

        var1.previous = this.tail;
        var1.next = this.tail.next;
        var1.previous.next = var1;
        var1.next.previous = var1;
    }

    public void method997(T var1) {
        if (var1.previous != null) {
            var1.unlink();
        }

        var1.previous = this.tail.previous;
        var1.next = this.tail;
        var1.previous.next = var1;
        var1.next.previous = var1;
    }

    public T next() {
        Node var1 = this.head;
        if (var1 == this.tail) {
            this.head = null;
            return null;
        }
        this.head = var1.next;
        return (T) var1;
    }

    public T method996() {
        Node var1 = this.tail.previous;
        if (var1 == this.tail) {
            return null;
        }
        var1.unlink();
        return (T) var1;
    }
}
