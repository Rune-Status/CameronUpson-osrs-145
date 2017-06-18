package com.jagex;

public class Varpbit extends DoublyNode {

    public static ReferenceCache varpbitCache = new ReferenceCache(64);
    public static ReferenceTable varpbitTable;

    public int lower;
    public int upper;
    public int varpIndex;

    public static int getValue(int id) {
        Varpbit var1 = (Varpbit) varpbitCache.get((long) id);
        Varpbit var2;
        if (var1 != null) {
            var2 = var1;
        } else {
            byte[] var7 = varpbitTable.unpack(14, id);
            var1 = new Varpbit();
            if (var7 != null) {
                var1.decode(new Buffer(var7));
            }

            varpbitCache.put(var1, (long) id);
            var2 = var1;
        }

        int var3 = var2.varpIndex;
        int var4 = var2.lower;
        int var5 = var2.upper;
        int var6 = Varps.masks[var5 - var4];
        return Varps.values[var3] >> var4 & var6;
    }

    public void decode(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0) {
                return;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer var1, int opcode) {
        if (opcode == 1) {
            varpIndex = var1.readUnsignedShort();
            lower = var1.readUnsignedByte();
            upper = var1.readUnsignedByte();
        }

    }
}
