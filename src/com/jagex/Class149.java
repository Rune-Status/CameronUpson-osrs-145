package com.jagex;

public class Class149 {
    public static ItemDefinition method1001(int var0) {
        ItemDefinition var1 = (ItemDefinition) ItemDefinition.aReferenceCache2115.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Class55.aReferenceTable424.method1085(10, var0);
            var1 = new ItemDefinition();
            var1.id = var0;
            if (var2 != null) {
                var1.method1066(new Buffer(var2));
            }

            var1.method756();
            if (var1.anInt1864 != -1) {
                var1.method1146(method1001(var1.anInt1864), method1001(var1.noteId));
            }

            if (var1.anInt783 != -1) {
                var1.method1147(method1001(var1.anInt783), method1001(var1.anInt768));
            }

            if (var1.anInt785 != -1) {
                var1.method1138(method1001(var1.anInt785), method1001(var1.anInt781));
            }

            if (!Node_Sub21_Sub19.aBoolean2098 && var1.aBoolean1731) {
                var1.name = "Members object";
                var1.aBoolean2114 = false;
                var1.groundActions = null;
                var1.actions = null;
                var1.anInt754 = -1;
                var1.anInt776 = 0;
                if (var1.properties != null) {
                    boolean var3 = false;

                    for (Node var4 = var1.properties.first(); var4 != null; var4 = var1.properties.next()) {
                        DefinitionProperty var5 = Class158.method1012((int) var4.key);
                        if (var5.deleteOnUse) {
                            var4.unlink();
                        } else {
                            var3 = true;
                        }
                    }

                    if (!var3) {
                        var1.properties = null;
                    }
                }
            }

            ItemDefinition.aReferenceCache2115.method975(var1, (long) var0);
            return var1;
        }
    }

    public static byte method1002(char var0) {
        byte var1;
        if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
            var1 = (byte) var0;
        } else if (var0 == 8364) {
            var1 = -128;
        } else if (var0 == 8218) {
            var1 = -126;
        } else if (var0 == 402) {
            var1 = -125;
        } else if (var0 == 8222) {
            var1 = -124;
        } else if (var0 == 8230) {
            var1 = -123;
        } else if (var0 == 8224) {
            var1 = -122;
        } else if (var0 == 8225) {
            var1 = -121;
        } else if (var0 == 710) {
            var1 = -120;
        } else if (var0 == 8240) {
            var1 = -119;
        } else if (var0 == 352) {
            var1 = -118;
        } else if (var0 == 8249) {
            var1 = -117;
        } else if (var0 == 338) {
            var1 = -116;
        } else if (var0 == 381) {
            var1 = -114;
        } else if (var0 == 8216) {
            var1 = -111;
        } else if (var0 == 8217) {
            var1 = -110;
        } else if (var0 == 8220) {
            var1 = -109;
        } else if (var0 == 8221) {
            var1 = -108;
        } else if (var0 == 8226) {
            var1 = -107;
        } else if (var0 == 8211) {
            var1 = -106;
        } else if (var0 == 8212) {
            var1 = -105;
        } else if (var0 == 732) {
            var1 = -104;
        } else if (var0 == 8482) {
            var1 = -103;
        } else if (var0 == 353) {
            var1 = -102;
        } else if (var0 == 8250) {
            var1 = -101;
        } else if (var0 == 339) {
            var1 = -100;
        } else if (var0 == 382) {
            var1 = -98;
        } else if (var0 == 376) {
            var1 = -97;
        } else {
            var1 = 63;
        }

        return var1;
    }
}
