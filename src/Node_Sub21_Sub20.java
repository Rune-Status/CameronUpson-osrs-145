import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Node_Sub21_Sub20 extends DoublyNode {
    public static int anInt209;
    public static ReferenceTable aReferenceTable2012;
    public static ReferenceCache aReferenceCache2008 = new ReferenceCache(64);
    public int anInt232 = 0;

    public static int method1125(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
        int var5 = var2 - var1;

        for (int var6 = 0; var6 < var5; ++var6) {
            char var7 = var0.charAt(var6 + var1);
            if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
                var3[var4 + var6] = (byte) var7;
            } else if (var7 == 8364) {
                var3[var6 + var4] = -128;
            } else if (var7 == 8218) {
                var3[var6 + var4] = -126;
            } else if (var7 == 402) {
                var3[var4 + var6] = -125;
            } else if (var7 == 8222) {
                var3[var6 + var4] = -124;
            } else if (var7 == 8230) {
                var3[var6 + var4] = -123;
            } else if (var7 == 8224) {
                var3[var6 + var4] = -122;
            } else if (var7 == 8225) {
                var3[var4 + var6] = -121;
            } else if (var7 == 710) {
                var3[var4 + var6] = -120;
            } else if (var7 == 8240) {
                var3[var4 + var6] = -119;
            } else if (var7 == 352) {
                var3[var4 + var6] = -118;
            } else if (var7 == 8249) {
                var3[var6 + var4] = -117;
            } else if (var7 == 338) {
                var3[var4 + var6] = -116;
            } else if (var7 == 381) {
                var3[var4 + var6] = -114;
            } else if (var7 == 8216) {
                var3[var4 + var6] = -111;
            } else if (var7 == 8217) {
                var3[var4 + var6] = -110;
            } else if (var7 == 8220) {
                var3[var6 + var4] = -109;
            } else if (var7 == 8221) {
                var3[var4 + var6] = -108;
            } else if (var7 == 8226) {
                var3[var4 + var6] = -107;
            } else if (var7 == 8211) {
                var3[var4 + var6] = -106;
            } else if (var7 == 8212) {
                var3[var6 + var4] = -105;
            } else if (var7 == 732) {
                var3[var6 + var4] = -104;
            } else if (var7 == 8482) {
                var3[var6 + var4] = -103;
            } else if (var7 == 353) {
                var3[var6 + var4] = -102;
            } else if (var7 == 8250) {
                var3[var4 + var6] = -101;
            } else if (var7 == 339) {
                var3[var6 + var4] = -100;
            } else if (var7 == 382) {
                var3[var4 + var6] = -98;
            } else if (var7 == 376) {
                var3[var4 + var6] = -97;
            } else {
                var3[var6 + var4] = 63;
            }
        }

        return var5;
    }

    static int method1126() {
        return Client.aBoolean1690 ? 2 : 1;
    }

    public static void method1127(Packet var0) {
        ClassStructure var1 = Class171.aLinkedList2124.method909();
        if (var1 != null) {
            int var2 = var0.caret;
            var0.method869(var1.anInt204);

            for (int var3 = 0; var3 < var1.anInt206; ++var3) {
                if (var1.anIntArray2134[var3] != 0) {
                    var0.method451(var1.anIntArray2134[var3]);
                } else {
                    try {
                        int var4 = var1.anIntArray950[var3];
                        Field var5;
                        int var6;
                        if (var4 == 0) {
                            var5 = var1.fields[var3];
                            var6 = var5.getInt(null);
                            var0.method451(0);
                            var0.method869(var6);
                        } else if (var4 == 1) {
                            var5 = var1.fields[var3];
                            var5.setInt(null, var1.anIntArray934[var3]);
                            var0.method451(0);
                        } else if (var4 == 2) {
                            var5 = var1.fields[var3];
                            var6 = var5.getModifiers();
                            var0.method451(0);
                            var0.method869(var6);
                        }

                        Method var25;
                        if (var4 != 3) {
                            if (var4 == 4) {
                                var25 = var1.methods[var3];
                                var6 = var25.getModifiers();
                                var0.method451(0);
                                var0.method869(var6);
                            }
                        } else {
                            var25 = var1.methods[var3];
                            byte[][] var7 = var1.methodArgs[var3];
                            Object[] var8 = new Object[var7.length];

                            for (int var9 = 0; var9 < var7.length; ++var9) {
                                ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var7[var9]));
                                var8[var9] = var10.readObject();
                            }

                            Object var11 = var25.invoke(null, var8);
                            if (var11 == null) {
                                var0.method451(0);
                            } else if (var11 instanceof Number) {
                                var0.method451(1);
                                var0.method861(((Number) var11).longValue());
                            } else if (var11 instanceof String) {
                                var0.method451(2);
                                var0.method865((String) var11);
                            } else {
                                var0.method451(4);
                            }
                        }
                    } catch (ClassNotFoundException var13) {
                        var0.method451(-10);
                    } catch (InvalidClassException var14) {
                        var0.method451(-11);
                    } catch (StreamCorruptedException var15) {
                        var0.method451(-12);
                    } catch (OptionalDataException var16) {
                        var0.method451(-13);
                    } catch (IllegalAccessException var17) {
                        var0.method451(-14);
                    } catch (IllegalArgumentException var18) {
                        var0.method451(-15);
                    } catch (InvocationTargetException var19) {
                        var0.method451(-16);
                    } catch (SecurityException var20) {
                        var0.method451(-17);
                    } catch (IOException var21) {
                        var0.method451(-18);
                    } catch (NullPointerException var22) {
                        var0.method451(-19);
                    } catch (Exception var23) {
                        var0.method451(-20);
                    } catch (Throwable var24) {
                        var0.method451(-21);
                    }
                }
            }

            var0.method832(var2);
            var1.unlink();
        }
    }

    void method1052(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method1051(var1, var2);
        }
    }

    void method1051(Buffer var1, int var2) {
        if (var2 == 5) {
            this.anInt232 = var1.readUnsignedShort();
        }

    }
}
