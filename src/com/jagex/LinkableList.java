package com.jagex;

public class LinkableList {
    Linkable current;
    Linkable head = new Linkable();

    public LinkableList() {
        head.next = head;
        head.previous = head;
    }

    public Linkable next() {
        Linkable var1 = this.current;
        if (var1 == this.head) {
            this.current = null;
            return null;
        }
        this.current = var1.next;
        return var1;
    }

    public Linkable head() {
        Linkable var1 = this.head.next;
        if (var1 == this.head) {
            this.current = null;
            return null;
        }
        this.current = var1.next;
        return var1;
    }

    public void add(Linkable var1) {
        if (var1.previous != null) {
            var1.unlink();
        }

        var1.previous = this.head.previous;
        var1.next = this.head;
        var1.previous.next = var1;
        var1.next.previous = var1;
    }
}
