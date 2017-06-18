package com.jagex;

public class Class102 {
    static int anInt1151;

    static void method657(InterfaceComponent[] var0, int var1) {
        for (int var2 = 0; var2 < var0.length; ++var2) {
            InterfaceComponent var3 = var0[var2];
            if (var3 != null && var1 == var3.parentUid && (!var3.aBoolean1173 || !Class1.method6(var3))) {
                int var5;
                if (var3.type == 0) {
                    if (!var3.aBoolean1173 && Class1.method6(var3) && var3 != PickableNode.anInterfaceComponent673) {
                        continue;
                    }

                    method657(var0, var3.uid);
                    if (var3.components != null) {
                        method657(var3.components, var3.uid);
                    }

                    InterfaceNode var4 = Client.interfaceNodes.lookup((long) var3.uid);
                    if (var4 != null) {
                        var5 = var4.id;
                        if (Class33.method220(var5)) {
                            method657(InterfaceComponent.interfaces[var5], -1);
                        }
                    }
                }

                if (var3.type == 6) {
                    if (var3.anInt784 != -1 || var3.anInt771 != -1) {
                        boolean var6 = Class30.method205(var3);
                        if (var6) {
                            var5 = var3.anInt771;
                        } else {
                            var5 = var3.anInt784;
                        }

                        if (var5 != -1) {
                            AnimationSequence var7 = Applet_Sub1.method251(var5);

                            for (var3.anInt1929 += Client.anInt1544; var3.anInt1929 > var7.frameLengths[var3.anInt1932]; ItemTable.method284(var3)) {
                                var3.anInt1929 -= var7.frameLengths[var3.anInt1932];
                                ++var3.anInt1932;
                                if (var3.anInt1932 >= var7.frames.length) {
                                    var3.anInt1932 -= var7.loopOffset;
                                    if (var3.anInt1932 < 0 || var3.anInt1932 >= var7.frames.length) {
                                        var3.anInt1932 = 0;
                                    }
                                }
                            }
                        }
                    }

                    if (var3.anInt792 != 0 && !var3.aBoolean1173) {
                        int var8 = var3.anInt792 >> 16;
                        var5 = var3.anInt792 << 16 >> 16;
                        var8 *= Client.anInt1544;
                        var5 *= Client.anInt1544;
                        var3.xRotation = var3.xRotation + var8 & 2047;
                        var3.zRotation = var5 + var3.zRotation & 2047;
                        ItemTable.method284(var3);
                    }
                }
            }
        }

    }
}
