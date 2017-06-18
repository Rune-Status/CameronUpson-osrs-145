package com.jagex;

public class Node_Sub28 extends Node {
    int anInt767;
    int anInt328;
    boolean aBoolean2187;
    int[] anIntArray762 = new int[3];
    int anInt1864;
    int anInt818;
    int anInt1257;
    int anInt753;
    int anInt754;
    boolean aBoolean2016;
    int anInt760;
    int anInt746;
    String aString2186;
    int anInt933;
    String aString2185;
    String aString2189;
    String aString405;
    String aString2188;
    int anInt2032;
    int anInt2036;
    int anInt766;
    int anInt745;
    String aString2184;
    int anInt1868;

    public Node_Sub28(boolean var1) {
        if (InterfaceNode.aString319.startsWith("win")) {
            this.anInt328 = 1;
        } else if (InterfaceNode.aString319.startsWith("mac")) {
            this.anInt328 = 2;
        } else if (InterfaceNode.aString319.startsWith("linux")) {
            this.anInt328 = 3;
        } else {
            this.anInt328 = 4;
        }

        String var2;
        try {
            var2 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var13) {
            var2 = "";
        }

        String var3;
        try {
            var3 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var12) {
            var3 = "";
        }

        String var4 = "Unknown";
        String var5 = "1.1";

        try {
            var4 = System.getProperty("java.vendor");
            var5 = System.getProperty("java.version");
        } catch (Exception var11) {
        }

        this.aBoolean2187 = !(!var2.startsWith("amd64") && !var2.startsWith("x86_64"));

        if (this.anInt328 == 1) {
            if (var3.indexOf("4.0") != -1) {
                this.anInt818 = 1;
            } else if (var3.indexOf("4.1") != -1) {
                this.anInt818 = 2;
            } else if (var3.indexOf("4.9") != -1) {
                this.anInt818 = 3;
            } else if (var3.indexOf("5.0") != -1) {
                this.anInt818 = 4;
            } else if (var3.indexOf("5.1") != -1) {
                this.anInt818 = 5;
            } else if (var3.indexOf("5.2") != -1) {
                this.anInt818 = 8;
            } else if (var3.indexOf("6.0") != -1) {
                this.anInt818 = 6;
            } else if (var3.indexOf("6.1") != -1) {
                this.anInt818 = 7;
            } else if (var3.indexOf("6.2") != -1) {
                this.anInt818 = 9;
            } else if (var3.indexOf("6.3") != -1) {
                this.anInt818 = 10;
            }
        } else if (this.anInt328 == 2) {
            if (var3.indexOf("10.4") != -1) {
                this.anInt818 = 20;
            } else if (var3.indexOf("10.5") != -1) {
                this.anInt818 = 21;
            } else if (var3.indexOf("10.6") != -1) {
                this.anInt818 = 22;
            } else if (var3.indexOf("10.7") != -1) {
                this.anInt818 = 23;
            } else if (var3.indexOf("10.8") != -1) {
                this.anInt818 = 24;
            } else if (var3.indexOf("10.9") != -1) {
                this.anInt818 = 25;
            } else if (var3.indexOf("10.10") != -1) {
                this.anInt818 = 26;
            }
        }

        if (var4.toLowerCase().indexOf("sun") != -1) {
            this.anInt1257 = 1;
        } else if (var4.toLowerCase().indexOf("microsoft") != -1) {
            this.anInt1257 = 2;
        } else if (var4.toLowerCase().indexOf("apple") != -1) {
            this.anInt1257 = 3;
        } else if (var4.toLowerCase().indexOf("oracle") != -1) {
            this.anInt1257 = 5;
        } else {
            this.anInt1257 = 4;
        }

        int var6 = 2;
        int var7 = 0;

        char var8;
        try {
            while (var6 < var5.length()) {
                var8 = var5.charAt(var6);
                if (var8 < '0' || var8 > '9') {
                    break;
                }

                var7 = var7 * 10 + (var8 - 48);
                ++var6;
            }
        } catch (Exception var16) {
        }

        this.anInt753 = var7;
        var6 = var5.indexOf(46, 2) + 1;
        var7 = 0;

        try {
            while (var6 < var5.length()) {
                var8 = var5.charAt(var6);
                if (var8 < '0' || var8 > '9') {
                    break;
                }

                var7 = var8 - 48 + var7 * 10;
                ++var6;
            }
        } catch (Exception var15) {
        }

        this.anInt754 = var7;
        var6 = var5.indexOf(95, 4) + 1;
        var7 = 0;

        try {
            while (var6 < var5.length()) {
                var8 = var5.charAt(var6);
                if (var8 < '0' || var8 > '9') {
                    break;
                }

                var7 = var8 - 48 + var7 * 10;
                ++var6;
            }
        } catch (Exception var14) {
        }

        this.anInt745 = var7;
        this.aBoolean2016 = false;
        this.anInt760 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
        if (this.anInt753 > 3) {
            this.anInt746 = Runtime.getRuntime().availableProcessors();
        } else {
            this.anInt746 = 0;
        }

        this.anInt766 = 0;
        if (this.aString2185 == null) {
            this.aString2185 = "";
        }

        if (this.aString2189 == null) {
            this.aString2189 = "";
        }

        if (this.aString405 == null) {
            this.aString405 = "";
        }

        if (this.aString2188 == null) {
            this.aString2188 = "";
        }

        if (this.aString2186 == null) {
            this.aString2186 = "";
        }

        if (this.aString2184 == null) {
            this.aString2184 = "";
        }

        this.method308();
    }

    void method308() {
        if (this.aString2185.length() > 40) {
            this.aString2185 = this.aString2185.substring(0, 40);
        }

        if (this.aString2189.length() > 40) {
            this.aString2189 = this.aString2189.substring(0, 40);
        }

        if (this.aString405.length() > 10) {
            this.aString405 = this.aString405.substring(0, 10);
        }

        if (this.aString2188.length() > 10) {
            this.aString2188 = this.aString2188.substring(0, 10);
        }

    }

    public int method591() {
        byte var1 = 38;
        int var2 = var1 + Class101.method653(this.aString2185);
        var2 += Class101.method653(this.aString2189);
        var2 += Class101.method653(this.aString405);
        var2 += Class101.method653(this.aString2188);
        var2 += Class101.method653(this.aString2186);
        var2 += Class101.method653(this.aString2184);
        return var2;
    }

    public void method1052(Buffer var1) {
        var1.method451(6);
        var1.method451(this.anInt328);
        var1.method451(this.aBoolean2187 ? 1 : 0);
        var1.method451(this.anInt818);
        var1.method451(this.anInt1257);
        var1.method451(this.anInt753);
        var1.method451(this.anInt754);
        var1.method451(this.anInt745);
        var1.method451(this.aBoolean2016 ? 1 : 0);
        var1.method755(this.anInt760);
        var1.method451(this.anInt746);
        var1.method867(this.anInt766);
        var1.method755(this.anInt933);
        var1.method864(this.aString2185);
        var1.method864(this.aString2189);
        var1.method864(this.aString405);
        var1.method864(this.aString2188);
        var1.method451(this.anInt2032);
        var1.method755(this.anInt767);
        var1.method864(this.aString2186);
        var1.method864(this.aString2184);
        var1.method451(this.anInt2036);
        var1.method451(this.anInt1864);

        for (int var2 = 0; var2 < this.anIntArray762.length; ++var2) {
            var1.method869(this.anIntArray762[var2]);
        }

        var1.method869(this.anInt1868);
    }
}
