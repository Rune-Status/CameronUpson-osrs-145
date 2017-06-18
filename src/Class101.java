public class Class101 {
    int anInt1138;
    int anInt1135;
    int anInt1136;
    int anInt1137;

    Class101() {
    }

    Class101(Class101 var1) {
        this.anInt1135 = var1.anInt1135;
        this.anInt1138 = var1.anInt1138;
        this.anInt1137 = var1.anInt1137;
        this.anInt1136 = var1.anInt1136;
    }

    static int method654(int var0, RuneScript var1, boolean var2) {
        InterfaceComponent var3;
        if (var0 >= 2000) {
            var0 -= 1000;
            var3 = Class161.method1016(Class63.anIntArray645[--Class63.anInt644]);
        } else {
            var3 = var2 ? Class18.anInterfaceComponent129 : Class11.anInterfaceComponent83;
        }

        if (var0 == 1927) {
            if (Class63.anInt647 >= 10) {
                throw new RuntimeException();
            } else if (var3.anObjectArray1920 == null) {
                return 0;
            } else {
                ScriptEvent var4 = new ScriptEvent();
                var4.source = var3;
                var4.args = var3.anObjectArray1920;
                var4.anInt226 = Class63.anInt647 + 1;
                Client.aNodeDeque1661.method997(var4);
                return 1;
            }
        } else {
            return 2;
        }
    }

    public static int method653(String var0) {
        return var0.length() + 2;
    }
}
