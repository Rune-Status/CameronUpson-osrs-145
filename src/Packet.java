public final class Packet extends Buffer {
    static final int[] anIntArray1271 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    Class116 aClass116_1337;
    int anInt226;

    public Packet(int var1) {
        super(var1);
    }

    static int method785(int var0) {
        Node_Sub21_Sub1 var1 = (Node_Sub21_Sub1) Class59.A_ITERABLE_NODE_TABLE___628.lookup((long) var0);
        if (var1 == null) {
            return -1;
        } else {
            return Class59.aClass142_627.aDoublyNode1786 == var1.previousDoubly ? -1 : ((Node_Sub21_Sub1) var1.previousDoubly).anInt204;
        }
    }

    public void method787(int[] var1) {
        this.aClass116_1337 = new Class116(var1);
    }

    public void writeHeader(int var1) {
        this.payload[++this.caret - 1] = (byte) (var1 + this.aClass116_1337.method792());
    }

    public int method788(int var1) {
        int var2 = this.anInt226 >> 3;
        int var3 = 8 - (this.anInt226 & 7);
        int var4 = 0;

        for (this.anInt226 += var1; var1 > var3; var3 = 8) {
            var4 += (this.payload[var2++] & anIntArray1271[var3]) << var1 - var3;
            var1 -= var3;
        }

        if (var1 == var3) {
            var4 += this.payload[var2] & anIntArray1271[var3];
        } else {
            var4 += this.payload[var2] >> var3 - var1 & anIntArray1271[var1];
        }

        return var4;
    }

    public void method790() {
        this.anInt226 = this.caret * 8;
    }

    public void method789() {
        this.caret = (this.anInt226 + 7) / 8;
    }

    public int method786(int var1) {
        return var1 * 8 - this.anInt226;
    }

    public int method784() {
        return this.payload[++this.caret - 1] - this.aClass116_1337.method792() & 255;
    }
}
