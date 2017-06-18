package com.jagex;

public class Linkable {

    Linkable next;
    Linkable previous;

    public void unlink() {
        if (this.previous != null) {
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.next = null;
            this.previous = null;
        }
    }
}
