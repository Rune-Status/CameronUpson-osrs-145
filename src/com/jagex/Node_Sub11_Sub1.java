package com.jagex;

public class Node_Sub11_Sub1 extends Node_Sub11 {
    public int anInt204;
    public byte[] aByteArray846;
    public int anInt206;
    public boolean aBoolean845;
    int anInt232;

    Node_Sub11_Sub1(int var1, byte[] var2, int var3, int var4) {
        this.anInt204 = var1;
        this.aByteArray846 = var2;
        this.anInt206 = var3;
        this.anInt232 = var4;
    }

    Node_Sub11_Sub1(int var1, byte[] var2, int var3, int var4, boolean var5) {
        this.anInt204 = var1;
        this.aByteArray846 = var2;
        this.anInt206 = var3;
        this.anInt232 = var4;
        this.aBoolean845 = var5;
    }

    public Node_Sub11_Sub1 method473(Class94 var1) {
        this.aByteArray846 = var1.method614(this.aByteArray846);
        this.anInt204 = var1.method618(this.anInt204);
        if (this.anInt206 == this.anInt232) {
            this.anInt206 = this.anInt232 = var1.method616(this.anInt206);
        } else {
            this.anInt206 = var1.method616(this.anInt206);
            this.anInt232 = var1.method616(this.anInt232);
            if (this.anInt206 == this.anInt232) {
                --this.anInt206;
            }
        }

        return this;
    }
}
