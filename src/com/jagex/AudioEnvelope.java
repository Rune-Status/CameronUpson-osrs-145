package com.jagex;

public class AudioEnvelope {
    int phaseIndex;
    int[] anIntArray895 = new int[2];
    int[] phases = new int[2];
    int anInt893;
    int end;
    int start;
    int ticks;
    int anInt886 = 2;
    int step;
    int amplitude;
    int max;

    AudioEnvelope() {
        this.anIntArray895[0] = 0;
        this.anIntArray895[1] = 65535;
        this.phases[0] = 0;
        this.phases[1] = 65535;
    }

    final void method507(Buffer var1) {
        this.anInt893 = var1.readUnsignedByte();
        this.start = var1.method835();
        this.end = var1.method835();
        this.method510(var1);
    }

    final void method509() {
        this.ticks = 0;
        this.phaseIndex = 0;
        this.step = 0;
        this.amplitude = 0;
        this.max = 0;
    }

    final int method508(int var1) {
        if (this.max >= this.ticks) {
            this.amplitude = this.phases[this.phaseIndex++] << 15;
            if (this.phaseIndex >= this.anInt886) {
                this.phaseIndex = this.anInt886 - 1;
            }

            this.ticks = (int) ((double) this.anIntArray895[this.phaseIndex] / 65536.0D * (double) var1);
            if (this.ticks > this.max) {
                this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
            }
        }

        this.amplitude += this.step;
        ++this.max;
        return this.amplitude - this.step >> 15;
    }

    final void method510(Buffer var1) {
        this.anInt886 = var1.readUnsignedByte();
        this.anIntArray895 = new int[this.anInt886];
        this.phases = new int[this.anInt886];

        for (int var2 = 0; var2 < this.anInt886; ++var2) {
            this.anIntArray895[var2] = var1.readUnsignedShort();
            this.phases[var2] = var1.readUnsignedShort();
        }

    }
}
