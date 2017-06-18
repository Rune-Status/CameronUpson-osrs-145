public class Class20 implements Class16 {
    static int[] anIntArray138;
    int anInt2;
    int anInt1;
    int anInt122;
    int anInt121;
    int anInt4;
    int anInt6;
    int anInt3;
    int anInt120;
    int anInt119;
    int anInt5;

    public boolean method10(int var1, int var2, int var3) {
        if (var1 >= this.anInt1 && var1 < this.anInt6 + this.anInt1) {
            return var2 >= (this.anInt3 << 6) + (this.anInt122 << 3) && var2 <= (this.anInt122 << 3) + (this.anInt3 << 6) + 7 && var3 >= (this.anInt2 << 6) + (this.anInt121 << 3) && var3 <= (this.anInt2 << 6) + (this.anInt121 << 3) + 7;
        } else {
            return false;
        }
    }

    public boolean method5(int var1, int var2) {
        return var1 >= (this.anInt4 << 6) + (this.anInt120 << 3) && var1 <= (this.anInt4 << 6) + (this.anInt120 << 3) + 7 && var2 >= (this.anInt5 << 6) + (this.anInt119 << 3) && var2 <= (this.anInt119 << 3) + (this.anInt5 << 6) + 7;
    }

    public void method1(Class12 var1) {
        if (var1.anInt89 > this.anInt4) {
            var1.anInt89 = this.anInt4;
        }

        if (var1.anInt88 < this.anInt4) {
            var1.anInt88 = this.anInt4;
        }

        if (var1.anInt87 > this.anInt5) {
            var1.anInt87 = this.anInt5;
        }

        if (var1.anInt84 < this.anInt5) {
            var1.anInt84 = this.anInt5;
        }

    }

    void method8() {
    }

    public int[] method2(int var1, int var2, int var3) {
        if (!this.method10(var1, var2, var3)) {
            return null;
        } else {
            return new int[]{this.anInt120 * 8 - this.anInt122 * 8 + var2 + (this.anInt4 * 64 - this.anInt3 * 64), this.anInt119 * 8 - this.anInt121 * 8 + this.anInt5 * 64 - this.anInt2 * 64 + var3};
        }
    }

    public void method9(Buffer var1) {
        this.anInt1 = var1.readUnsignedByte();
        this.anInt6 = var1.readUnsignedByte();
        this.anInt3 = var1.readUnsignedShort();
        this.anInt122 = var1.readUnsignedByte();
        this.anInt2 = var1.readUnsignedShort();
        this.anInt121 = var1.readUnsignedByte();
        this.anInt4 = var1.readUnsignedShort();
        this.anInt120 = var1.readUnsignedByte();
        this.anInt5 = var1.readUnsignedShort();
        this.anInt119 = var1.readUnsignedByte();
        this.method8();
    }

    public Class151 method7(int var1, int var2) {
        if (!this.method5(var1, var2)) {
            return null;
        } else {
            int var3 = this.anInt122 * 8 - this.anInt120 * 8 + this.anInt3 * 64 - this.anInt4 * 64 + var1;
            int var4 = this.anInt121 * 8 - this.anInt119 * 8 + var2 + (this.anInt2 * 64 - this.anInt5 * 64);
            return new Class151(this.anInt1, var3, var4);
        }
    }
}
