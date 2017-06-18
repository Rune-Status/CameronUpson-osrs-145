package com.jagex;

import java.nio.ByteBuffer;

public class Class111_Sub1 extends Class111 {
    ByteBuffer aByteBuffer1355;

    void method769(byte[] var1) {
        this.aByteBuffer1355 = ByteBuffer.allocateDirect(var1.length);
        this.aByteBuffer1355.position(0);
        this.aByteBuffer1355.put(var1);
    }

    byte[] method768() {
        byte[] var1 = new byte[this.aByteBuffer1355.capacity()];
        this.aByteBuffer1355.position(0);
        this.aByteBuffer1355.get(var1);
        return var1;
    }
}
