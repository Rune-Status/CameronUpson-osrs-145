public class Class190 {
    int anInt2241 = 0;
    boolean aBoolean2240 = false;
    String aString2242;
    ReferenceTable aReferenceTable2243;

    Class190(ReferenceTable var1) {
        this.aReferenceTable2243 = var1;
    }

    void method1307(String var1) {
        if (var1 != null && !var1.isEmpty()) {
            if (var1 != this.aString2242) {
                this.aString2242 = var1;
                this.anInt2241 = 0;
                this.aBoolean2240 = false;
                this.method1310();
            }
        }
    }

    int method1310() {
        if (this.anInt2241 < 25) {
            if (!this.aReferenceTable2243.method1100(Class10.aClass10_78.aString77, this.aString2242)) {
                return this.anInt2241;
            }

            this.anInt2241 = 25;
        }

        if (this.anInt2241 == 25) {
            if (!this.aReferenceTable2243.method1100(this.aString2242, Class10.aClass10_71.aString77)) {
                return this.aReferenceTable2243.method1086(this.aString2242) * 25 / 100 + 25;
            }

            this.anInt2241 = 50;
        }

        if (this.anInt2241 == 50) {
            if (this.aReferenceTable2243.method1082(Class10.aClass10_73.aString77, this.aString2242) && !this.aReferenceTable2243.method1100(Class10.aClass10_73.aString77, this.aString2242)) {
                return 50;
            }

            this.anInt2241 = 75;
        }

        if (this.anInt2241 == 75) {
            if (!this.aReferenceTable2243.method1100(this.aString2242, Class10.aClass10_75.aString77)) {
                return 75;
            }

            this.anInt2241 = 100;
            this.aBoolean2240 = true;
        }

        return this.anInt2241;
    }

    boolean method1309() {
        return this.aBoolean2240;
    }

    int method1308() {
        return this.anInt2241;
    }
}
