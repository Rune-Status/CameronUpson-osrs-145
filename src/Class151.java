public class Class151 {
    public int anInt1832;
    public int anInt1830;
    public int anInt1831;

    public Class151(int var1) {
        if (var1 == -1) {
            this.anInt1830 = -1;
        } else {
            this.anInt1830 = var1 >> 28 & 3;
            this.anInt1832 = var1 >> 14 & 16383;
            this.anInt1831 = var1 & 16383;
        }

    }

    public Class151(int var1, int var2, int var3) {
        this.anInt1830 = var1;
        this.anInt1832 = var2;
        this.anInt1831 = var3;
    }

    public Class151(Class151 var1) {
        this.anInt1830 = var1.anInt1830;
        this.anInt1832 = var1.anInt1832;
        this.anInt1831 = var1.anInt1831;
    }

    public Class151() {
        this.anInt1830 = -1;
    }

    public void method1004(int var1, int var2, int var3) {
        this.anInt1830 = var1;
        this.anInt1832 = var2;
        this.anInt1831 = var3;
    }

    public int method1006() {
        return this.anInt1830 << 28 | this.anInt1832 << 14 | this.anInt1831;
    }

    boolean method1005(Class151 var1) {
        if (var1.anInt1830 != this.anInt1830) {
            return false;
        } else if (var1.anInt1832 != this.anInt1832) {
            return false;
        } else {
            return this.anInt1831 == var1.anInt1831;
        }
    }

    public int hashCode() {
        return this.method1006();
    }

    public String toString() {
        return this.anInt1830 + "," + (this.anInt1832 >> 6) + "," + (this.anInt1831 >> 6) + "," + (this.anInt1832 & 63) + "," + (this.anInt1831 & 63);
    }

    public boolean equals(Object var1) {
        if (var1 == this) {
            return true;
        } else {
            return var1 instanceof Class151 && this.method1005((Class151) var1);
        }
    }
}
