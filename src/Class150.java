public class Class150 {
    static Sprite[] aSpriteArray1827;
    static byte aByte1826;

    static byte[] method1003(byte[] var0) {
        Buffer var1 = new Buffer(var0);
        int var2 = var1.readUnsignedByte();
        int var3 = var1.method835();
        if (var3 < 0 || ReferenceTable.anInt2060 != 0 && var3 > ReferenceTable.anInt2060) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method826(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method835();
            if (var5 >= 0 && (ReferenceTable.anInt2060 == 0 || var5 <= ReferenceTable.anInt2060)) {
                byte[] var6 = new byte[var5];
                if (var2 == 1) {
                    Class114.method776(var6, var5, var0, var3, 9);
                } else {
                    ReferenceTable.aClass124_2056.method874(var1, var6);
                }

                return var6;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
