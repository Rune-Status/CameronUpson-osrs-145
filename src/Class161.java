public class Class161 {
    public static InterfaceComponent method1016(int var0) {
        int var1 = var0 >> 16;
        int var2 = var0 & '\uffff';
        if (InterfaceComponent.interfaces[var1] == null || InterfaceComponent.interfaces[var1][var2] == null) {
            boolean var3 = Class33.method220(var1);
            if (!var3) {
                return null;
            }
        }

        return InterfaceComponent.interfaces[var1][var2];
    }
}
