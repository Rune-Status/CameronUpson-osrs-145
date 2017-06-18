package com.jagex;

public class Class139 {
    Class134 aClass134_1770;
    Class134 aClass134_1769 = new Class134();

    public Class139() {
        this.aClass134_1769.aClass134_1738 = this.aClass134_1769;
        this.aClass134_1769.aClass134_1739 = this.aClass134_1769;
    }

    public Class134 method968() {
        Class134 var1 = this.aClass134_1770;
        if (var1 == this.aClass134_1769) {
            this.aClass134_1770 = null;
            return null;
        }
        this.aClass134_1770 = var1.aClass134_1738;
        return var1;
    }

    public Class134 method969() {
        Class134 var1 = this.aClass134_1769.aClass134_1738;
        if (var1 == this.aClass134_1769) {
            this.aClass134_1770 = null;
            return null;
        }
        this.aClass134_1770 = var1.aClass134_1738;
        return var1;
    }

    public void method967(Class134 var1) {
        if (var1.aClass134_1739 != null) {
            var1.method939();
        }

        var1.aClass134_1739 = this.aClass134_1769.aClass134_1739;
        var1.aClass134_1738 = this.aClass134_1769;
        var1.aClass134_1739.aClass134_1738 = var1;
        var1.aClass134_1738.aClass134_1739 = var1;
    }
}
