import java.util.Iterator;

public class Class12 {
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array85;
    int anInt84 = 0;
    int anInt89 = Integer.MAX_VALUE;
    String aString86;
    int anInt94 = -1;
    String aString90;
    Class151 aClass151_96 = null;
    int anInt88 = 0;
    int anInt87 = Integer.MAX_VALUE;
    int anInt92 = -1;
    boolean aBoolean91 = false;
    java.util.LinkedList aLinkedList93;
    int anInt95 = -1;

    static int method69(int var0, RuneScript var1, boolean var2) {
        InterfaceComponent var3;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
        } else {
            var3 = var2 ? Class18.anInterfaceComponent129 : Class11.anInterfaceComponent83;
        }

        int var4;
        if (var0 == 1300) {
            var4 = Class63.anIntArray645[--Class63.anInt644] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method1024(var4, Class63.aStringArray640[--Class77.anInt828]);
                return 1;
            } else {
                --Class77.anInt828;
                return 1;
            }
        } else if (var0 == 1301) {
            Class63.anInt644 -= 2;
            var4 = Class63.anIntArray645[Class63.anInt644];
            int var5 = Class63.anIntArray645[Class63.anInt644 + 1];
            var3.parent = Class127.method877(var4, var5);
            return 1;
        } else if (var0 == 1302) {
            var3.aBoolean1882 = Class63.anIntArray645[--Class63.anInt644] == 1;
            return 1;
        } else if (var0 == 1303) {
            var3.anInt1892 = Class63.anIntArray645[--Class63.anInt644];
            return 1;
        } else if (var0 == 1304) {
            var3.anInt1889 = Class63.anIntArray645[--Class63.anInt644];
            return 1;
        } else if (var0 == 1305) {
            var3.aString1895 = Class63.aStringArray640[--Class77.anInt828];
            return 1;
        } else if (var0 == 1306) {
            var3.selectedAction = Class63.aStringArray640[--Class77.anInt828];
            return 1;
        } else if (var0 == 1307) {
            var3.actions = null;
            return 1;
        } else {
            return 2;
        }
    }

    static boolean method66(int var0) {
        if (var0 < 0) {
            return false;
        } else {
            int var1 = Client.menuOpcodes[var0];
            if (var1 >= 2000) {
                var1 -= 2000;
            }

            return var1 == 1007;
        }
    }

    public void method75(Buffer var1, int var2) {
        this.anInt92 = var2;
        this.aString90 = var1.method819();
        this.aString86 = var1.method819();
        this.aClass151_96 = new Class151(var1.method835());
        this.anInt94 = var1.method835();
        var1.readUnsignedByte();
        this.aBoolean91 = var1.readUnsignedByte() == 1;
        this.anInt95 = var1.readUnsignedByte();
        int var3 = var1.readUnsignedByte();
        this.aLinkedList93 = new java.util.LinkedList();

        for (int var4 = 0; var4 < var3; ++var4) {
            this.aLinkedList93.add(this.method72(var1));
        }

        this.method68();
    }

    public boolean method65(int var1, int var2, int var3) {
        Iterator var4 = this.aLinkedList93.iterator();

        Class16 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }

            var5 = (Class16) var4.next();
        } while (!var5.method10(var1, var2, var3));

        return true;
    }

    public boolean method79(int var1, int var2) {
        int var3 = var1 / 64;
        int var4 = var2 / 64;
        if (var3 >= this.anInt89 && var3 <= this.anInt88) {
            if (var4 >= this.anInt87 && var4 <= this.anInt84) {
                Iterator var5 = this.aLinkedList93.iterator();

                Class16 var6;
                do {
                    if (!var5.hasNext()) {
                        return false;
                    }

                    var6 = (Class16) var5.next();
                } while (!var6.method5(var1, var2));

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int method82() {
        return this.aClass151_96.anInt1831;
    }

    public int method63() {
        return this.anInt92;
    }

    public boolean method74() {
        return this.aBoolean91;
    }

    void method68() {
        Iterator var1 = this.aLinkedList93.iterator();

        while (var1.hasNext()) {
            Class16 var2 = (Class16) var1.next();
            var2.method1(this);
        }

    }

    int method61() {
        return this.anInt94;
    }

    public int method80() {
        return this.anInt89;
    }

    public int method78() {
        return this.anInt88;
    }

    public int method77() {
        return this.anInt84;
    }

    public int method71() {
        return this.aClass151_96.anInt1832;
    }

    public int method64() {
        return this.aClass151_96.anInt1830;
    }

    public Class151 method62() {
        return new Class151(this.aClass151_96);
    }

    public int method70() {
        return this.anInt87;
    }

    public int method67() {
        return this.anInt95;
    }

    public String method76() {
        return this.aString90;
    }

    public Class151 method83(int var1, int var2) {
        Iterator var3 = this.aLinkedList93.iterator();

        Class16 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            var4 = (Class16) var3.next();
        } while (!var4.method5(var1, var2));

        return var4.method7(var1, var2);
    }

    public String method73() {
        return this.aString86;
    }

    public int[] method81(int var1, int var2, int var3) {
        Iterator var4 = this.aLinkedList93.iterator();

        Class16 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }

            var5 = (Class16) var4.next();
        } while (!var5.method10(var1, var2, var3));

        return var5.method2(var1, var2, var3);
    }

    Class16 method72(Buffer var1) {
        int var2 = var1.readUnsignedByte();
        Class23[] var3 = new Class23[]{Class23.aClass23_152, Class23.aClass23_155, Class23.aClass23_154, Class23.aClass23_159};
        Class23 var4 = (Class23) Canvas.method185(var3, var2);
        Object var5 = null;
        switch (var4.anInt157) {
            case 0:
                var5 = new Class1();
                break;
            case 1:
                var5 = new Class15();
                break;
            case 2:
                var5 = new Class21();
                break;
            case 3:
                var5 = new Class20();
                break;
            default:
                throw new IllegalStateException("");
        }

        ((Class16) var5).method9(var1);
        return (Class16) var5;
    }
}
