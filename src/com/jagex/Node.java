package com.jagex;

public class Node {
    public long key;
    public Node next;
    Node previous;

    public void unlink() {
        if (this.previous != null) {
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.next = null;
            this.previous = null;
        }
    }

    public boolean isLinked() {
        return this.previous != null;
    }
}
