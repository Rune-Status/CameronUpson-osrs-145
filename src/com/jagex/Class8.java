package com.jagex;

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class Class8 implements Class115, MouseWheelListener {
    int anInt64 = 0;

    void method42(Component var1) {
        var1.addMouseWheelListener(this);
    }

    void method44(Component var1) {
        var1.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
        this.anInt64 += var1.getWheelRotation();
    }

    public synchronized int method43() {
        int var1 = this.anInt64;
        this.anInt64 = 0;
        return var1;
    }
}
