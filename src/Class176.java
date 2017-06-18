import java.util.HashMap;

public class Class176 {
    ReferenceTable aReferenceTable2137;
    ReferenceTable aReferenceTable2139;
    HashMap aHashMap2138;

    public Class176(ReferenceTable var1, ReferenceTable var2) {
        this.aReferenceTable2137 = var1;
        this.aReferenceTable2139 = var2;
        this.aHashMap2138 = new HashMap();
    }

    public static Sprite method1188(ReferenceTable var0, int var1, int var2) {
        return !Class64.method381(var0, var1, var2) ? null : ClanMate.method208();
    }

    public HashMap method1187(Class180[] var1) {
        HashMap var2 = new HashMap();

        for (int var4 = 0; var4 < var1.length; ++var4) {
            Class180 var5 = var1[var4];
            if (this.aHashMap2138.containsKey(var5)) {
                var2.put(var5, this.aHashMap2138.get(var5));
            } else {
                Font var6 = Class160.method1015(this.aReferenceTable2137, this.aReferenceTable2139, var5.aString2150, "");
                if (var6 != null) {
                    this.aHashMap2138.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }

        return var2;
    }
}
