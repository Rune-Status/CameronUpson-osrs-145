package com.jagex;

public class Node_Sub10_Sub1 extends Node_Sub10 {
    NodeDeque<Node_Sub12> aNodeDeque739 = new NodeDeque<>();
    int anInt206 = 0;
    NodeDeque<Node_Sub10> aNodeDeque403 = new NodeDeque<>();
    int anInt232 = -1;

    public final synchronized void method427(Node_Sub10 var1) {
        var1.unlink();
    }

    void method335() {
        if (this.anInt206 > 0) {
            for (Node_Sub12 var1 = this.aNodeDeque739.method995(); var1 != null; var1 = this.aNodeDeque739.next()) {
                var1.anInt204 -= this.anInt206;
            }

            this.anInt232 -= this.anInt206;
            this.anInt206 = 0;
        }

    }

    void method432(Node var1, Node_Sub12 var2) {
        while (var1 != this.aNodeDeque739.tail && ((Node_Sub12) var1).anInt204 <= var2.anInt204) {
            var1 = var1.next;
        }

        NodeDeque.method992(var2, var1);
        this.anInt232 = ((Node_Sub12) this.aNodeDeque739.tail.next).anInt204;
    }

    void method433(Node_Sub12 var1) {
        var1.unlink();
        var1.method308();
        Node var2 = this.aNodeDeque739.tail.next;
        if (var2 == this.aNodeDeque739.tail) {
            this.anInt232 = -1;
        } else {
            this.anInt232 = ((Node_Sub12) var2).anInt204;
        }

    }

    protected Node_Sub10 method434() {
        return this.aNodeDeque403.method995();
    }

    protected Node_Sub10 method426() {
        return this.aNodeDeque403.next();
    }

    protected int method425() {
        return 0;
    }

    public final synchronized void method429(int[] var1, int var2, int var3) {
        do {
            if (this.anInt232 < 0) {
                this.method431(var1, var2, var3);
                return;
            }

            if (this.anInt206 + var3 < this.anInt232) {
                this.anInt206 += var3;
                this.method431(var1, var2, var3);
                return;
            }

            int var4 = this.anInt232 - this.anInt206;
            this.method431(var1, var2, var4);
            var2 += var4;
            var3 -= var4;
            this.anInt206 += var4;
            this.method335();
            Node_Sub12 var5 = this.aNodeDeque739.method995();
            synchronized (var5) {
                int var7 = var5.method561(this);
                if (var7 < 0) {
                    var5.anInt204 = 0;
                    this.method433(var5);
                } else {
                    var5.anInt204 = var7;
                    this.method432(var5.next, var5);
                }
            }
        } while (var3 != 0);

    }

    void method431(int[] var1, int var2, int var3) {
        for (Node_Sub10 var4 = this.aNodeDeque403.method995(); var4 != null; var4 = this.aNodeDeque403.next()) {
            var4.method471(var1, var2, var3);
        }

    }

    public final synchronized void method428(int var1) {
        do {
            if (this.anInt232 < 0) {
                this.method424(var1);
                return;
            }

            if (this.anInt206 + var1 < this.anInt232) {
                this.anInt206 += var1;
                this.method424(var1);
                return;
            }

            int var2 = this.anInt232 - this.anInt206;
            this.method424(var2);
            var1 -= var2;
            this.anInt206 += var2;
            this.method335();
            Node_Sub12 var3 = this.aNodeDeque739.method995();
            synchronized (var3) {
                int var5 = var3.method561(this);
                if (var5 < 0) {
                    var3.anInt204 = 0;
                    this.method433(var3);
                } else {
                    var3.anInt204 = var5;
                    this.method432(var3.next, var3);
                }
            }
        } while (var1 != 0);

    }

    void method424(int var1) {
        for (Node_Sub10 var2 = this.aNodeDeque403.method995(); var2 != null; var2 = this.aNodeDeque403.next()) {
            var2.method428(var1);
        }

    }

    public final synchronized void method430(Node_Sub10 var1) {
        this.aNodeDeque403.method993(var1);
    }
}
