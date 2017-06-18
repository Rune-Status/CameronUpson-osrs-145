public class Class135 {
    static final byte[] aByteArray1742 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int anInt1749;
    int[] anIntArray1747;
    int[] anIntArray1743;
    int[] anIntArray1746;
    int anInt1748;
    int[] anIntArray1744;
    long aLong1745;
    Buffer aBuffer1741 = new Buffer((byte[]) null);

    Class135(byte[] var1) {
        this.method953(var1);
    }

    Class135() {
    }

    void method953(byte[] var1) {
        this.aBuffer1741.payload = var1;
        this.aBuffer1741.caret = 10;
        int var2 = this.aBuffer1741.readUnsignedShort();
        this.anInt1749 = this.aBuffer1741.readUnsignedShort();
        this.anInt1748 = 500000;
        this.anIntArray1744 = new int[var2];

        int var3;
        int var5;
        for (var3 = 0; var3 < var2; this.aBuffer1741.caret += var5) {
            int var4 = this.aBuffer1741.method835();
            var5 = this.aBuffer1741.method835();
            if (var4 == 1297379947) {
                this.anIntArray1744[var3] = this.aBuffer1741.caret;
                ++var3;
            }
        }

        this.aLong1745 = 0L;
        this.anIntArray1743 = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            this.anIntArray1743[var3] = this.anIntArray1744[var3];
        }

        this.anIntArray1746 = new int[var2];
        this.anIntArray1747 = new int[var2];
    }

    void method950() {
        this.aBuffer1741.payload = null;
        this.anIntArray1744 = null;
        this.anIntArray1743 = null;
        this.anIntArray1746 = null;
        this.anIntArray1747 = null;
    }

    boolean method947() {
        return this.aBuffer1741.payload != null;
    }

    int method956() {
        return this.anIntArray1743.length;
    }

    void method958(int var1) {
        this.aBuffer1741.caret = this.anIntArray1743[var1];
    }

    void method949() {
        this.aBuffer1741.caret = -1;
    }

    long method945(int var1) {
        return this.aLong1745 + (long) var1 * (long) this.anInt1748;
    }

    void method946(int var1) {
        int var2 = this.aBuffer1741.method817();
        this.anIntArray1746[var1] += var2;
    }

    void method959(int var1) {
        this.anIntArray1743[var1] = this.aBuffer1741.caret;
    }

    int method954(int var1) {
        byte var2 = this.aBuffer1741.payload[this.aBuffer1741.caret];
        int var5;
        if (var2 < 0) {
            var5 = var2 & 255;
            this.anIntArray1747[var1] = var5;
            ++this.aBuffer1741.caret;
        } else {
            var5 = this.anIntArray1747[var1];
        }

        if (var5 != 240 && var5 != 247) {
            return this.method951(var1, var5);
        } else {
            int var3 = this.aBuffer1741.method817();
            if (var5 == 247 && var3 > 0) {
                int var4 = this.aBuffer1741.payload[this.aBuffer1741.caret] & 255;
                if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
                    ++this.aBuffer1741.caret;
                    this.anIntArray1747[var1] = var4;
                    return this.method951(var1, var4);
                }
            }

            this.aBuffer1741.caret += var3;
            return 0;
        }
    }

    int method951(int var1, int var2) {
        int var4;
        if (var2 == 255) {
            int var7 = this.aBuffer1741.readUnsignedByte();
            var4 = this.aBuffer1741.method817();
            if (var7 == 47) {
                this.aBuffer1741.caret += var4;
                return 1;
            } else if (var7 == 81) {
                int var5 = this.aBuffer1741.method868();
                var4 -= 3;
                int var6 = this.anIntArray1746[var1];
                this.aLong1745 += (long) var6 * (long) (this.anInt1748 - var5);
                this.anInt1748 = var5;
                this.aBuffer1741.caret += var4;
                return 2;
            } else {
                this.aBuffer1741.caret += var4;
                return 3;
            }
        } else {
            byte var3 = aByteArray1742[var2 - 128];
            var4 = var2;
            if (var3 >= 1) {
                var4 = var2 | this.aBuffer1741.readUnsignedByte() << 8;
            }

            if (var3 >= 2) {
                var4 |= this.aBuffer1741.readUnsignedByte() << 16;
            }

            return var4;
        }
    }

    int method948() {
        int var1 = this.anIntArray1743.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;

        for (int var4 = 0; var4 < var1; ++var4) {
            if (this.anIntArray1743[var4] >= 0 && this.anIntArray1746[var4] < var3) {
                var2 = var4;
                var3 = this.anIntArray1746[var4];
            }
        }

        return var2;
    }

    void method955(long var1) {
        this.aLong1745 = var1;
        int var3 = this.anIntArray1743.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            this.anIntArray1746[var4] = 0;
            this.anIntArray1747[var4] = 0;
            this.aBuffer1741.caret = this.anIntArray1744[var4];
            this.method946(var4);
            this.anIntArray1743[var4] = this.aBuffer1741.caret;
        }

    }

    boolean method957() {
        int var1 = this.anIntArray1743.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            if (this.anIntArray1743[var2] >= 0) {
                return false;
            }
        }

        return true;
    }

    int method952(int var1) {
        return this.method954(var1);
    }
}
