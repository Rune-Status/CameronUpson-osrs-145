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
        anIntArray895[0] = 0;
        anIntArray895[1] = 65535;
        phases[0] = 0;
        phases[1] = 65535;
    }

    final void method507(Buffer var1) {
        anInt893 = var1.readUnsignedByte();
        start = var1.readInt();
        end = var1.readInt();
        method510(var1);
    }

    final void method509() {
        ticks = 0;
        phaseIndex = 0;
        step = 0;
        amplitude = 0;
        max = 0;
    }

    final int method508(int var1) {
        if (max >= ticks) {
            amplitude = phases[phaseIndex++] << 15;
            if (phaseIndex >= anInt886) {
                phaseIndex = anInt886 - 1;
            }

            ticks = (int) ((double) anIntArray895[phaseIndex] / 65536.0D * (double) var1);
            if (ticks > max) {
                step = ((phases[phaseIndex] << 15) - amplitude) / (ticks - max);
            }
        }

        amplitude += step;
        ++max;
        return amplitude - step >> 15;
    }

    final void method510(Buffer var1) {
        anInt886 = var1.readUnsignedByte();
        anIntArray895 = new int[anInt886];
        phases = new int[anInt886];

        for (int var2 = 0; var2 < anInt886; ++var2) {
            anIntArray895[var2] = var1.readUnsignedShort();
            phases[var2] = var1.readUnsignedShort();
        }

    }
}
