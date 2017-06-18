package com.jagex;

import java.util.Iterator;

public class Class142 implements Iterable {
    public DoublyNode aDoublyNode1786 = new DoublyNode();

    public Class142() {
        this.aDoublyNode1786.nextDoubly = this.aDoublyNode1786;
        this.aDoublyNode1786.previousDoubly = this.aDoublyNode1786;
    }

    public void method979() {
        while (this.aDoublyNode1786.nextDoubly != this.aDoublyNode1786) {
            this.aDoublyNode1786.nextDoubly.method977();
        }

    }

    public void method980(DoublyNode var1) {
        if (var1.previousDoubly != null) {
            var1.method977();
        }

        var1.previousDoubly = this.aDoublyNode1786.previousDoubly;
        var1.nextDoubly = this.aDoublyNode1786;
        var1.previousDoubly.nextDoubly = var1;
        var1.nextDoubly.previousDoubly = var1;
    }

    public Iterator iterator() {
        return new Class146(this);
    }
}
