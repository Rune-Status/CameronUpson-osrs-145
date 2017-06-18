import java.io.EOFException;
import java.io.IOException;

public final class CacheIndex {
    static byte[] aByteArray1350 = new byte[520];
    int anInt1353 = 65000;
    int anInt1351;
    Class93 aClass93_1352 = null;
    Class93 aClass93_1354 = null;

    public CacheIndex(int var1, Class93 var2, Class93 var3, int var4) {
        this.anInt1351 = var1;
        this.aClass93_1354 = var2;
        this.aClass93_1352 = var3;
        this.anInt1353 = var4;
    }

    public static boolean method803(CharSequence var0) {
        return Class108.method748(var0, 10, true);
    }

    public byte[] method801(int var1) {
        Class93 var2 = this.aClass93_1354;
        synchronized (this.aClass93_1354) {
            Object var10000;
            try {
                if (this.aClass93_1352.method600() < (long) (var1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }

                this.aClass93_1352.method605((long) (var1 * 6));
                this.aClass93_1352.method602(aByteArray1350, 0, 6);
                int var3 = (aByteArray1350[2] & 255) + ((aByteArray1350[1] & 255) << 8) + ((aByteArray1350[0] & 255) << 16);
                int var4 = ((aByteArray1350[3] & 255) << 16) + ((aByteArray1350[4] & 255) << 8) + (aByteArray1350[5] & 255);
                if (var3 < 0 || var3 > this.anInt1353) {
                    var10000 = null;
                    return (byte[]) var10000;
                }

                if (var4 > 0 && (long) var4 <= this.aClass93_1354.method600() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;

                    for (int var7 = 0; var6 < var3; ++var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }

                        this.aClass93_1354.method605((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }

                        this.aClass93_1354.method602(aByteArray1350, 0, var8 + 8);
                        int var9 = ((aByteArray1350[0] & 255) << 8) + (aByteArray1350[1] & 255);
                        int var10 = ((aByteArray1350[2] & 255) << 8) + (aByteArray1350[3] & 255);
                        int var11 = (aByteArray1350[6] & 255) + ((aByteArray1350[4] & 255) << 16) + ((aByteArray1350[5] & 255) << 8);
                        int var12 = aByteArray1350[7] & 255;
                        if (var1 != var9 || var7 != var10 || this.anInt1351 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }

                        if (var11 < 0 || (long) var11 > this.aClass93_1354.method600() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }

                        for (int var13 = 0; var13 < var8; ++var13) {
                            var5[var6++] = aByteArray1350[var13 + 8];
                        }

                        var4 = var11;
                    }

                    return var5;
                }

                var10000 = null;
            } catch (IOException var16) {
                return null;
            }

            return (byte[]) var10000;
        }
    }

    public boolean method804(int var1, byte[] var2, int var3) {
        Class93 var4 = this.aClass93_1354;
        synchronized (this.aClass93_1354) {
            if (var3 >= 0 && var3 <= this.anInt1353) {
                boolean var5 = this.method802(var1, var2, var3, true);
                if (!var5) {
                    var5 = this.method802(var1, var2, var3, false);
                }

                return var5;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    boolean method802(int var1, byte[] var2, int var3, boolean var4) {
        Class93 var5 = this.aClass93_1354;
        synchronized (this.aClass93_1354) {
            try {
                int var6;
                boolean var10000;
                if (var4) {
                    if (this.aClass93_1352.method600() < (long) (var1 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }

                    this.aClass93_1352.method605((long) (var1 * 6));
                    this.aClass93_1352.method602(aByteArray1350, 0, 6);
                    var6 = (aByteArray1350[5] & 255) + ((aByteArray1350[3] & 255) << 16) + ((aByteArray1350[4] & 255) << 8);
                    if (var6 <= 0 || (long) var6 > this.aClass93_1354.method600() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.aClass93_1354.method600() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }

                aByteArray1350[0] = (byte) (var3 >> 16);
                aByteArray1350[1] = (byte) (var3 >> 8);
                aByteArray1350[2] = (byte) var3;
                aByteArray1350[3] = (byte) (var6 >> 16);
                aByteArray1350[4] = (byte) (var6 >> 8);
                aByteArray1350[5] = (byte) var6;
                this.aClass93_1352.method605((long) (var1 * 6));
                this.aClass93_1352.method604(aByteArray1350, 0, 6);
                int var7 = 0;
                int var8 = 0;

                while (true) {
                    if (var7 < var3) {
                        label140:
                        {
                            int var9 = 0;
                            int var10;
                            if (var4) {
                                this.aClass93_1354.method605((long) (var6 * 520));

                                try {
                                    this.aClass93_1354.method602(aByteArray1350, 0, 8);
                                } catch (EOFException var16) {
                                    break label140;
                                }

                                var10 = (aByteArray1350[1] & 255) + ((aByteArray1350[0] & 255) << 8);
                                int var11 = ((aByteArray1350[2] & 255) << 8) + (aByteArray1350[3] & 255);
                                var9 = ((aByteArray1350[4] & 255) << 16) + ((aByteArray1350[5] & 255) << 8) + (aByteArray1350[6] & 255);
                                int var12 = aByteArray1350[7] & 255;
                                if (var10 != var1 || var11 != var8 || this.anInt1351 != var12) {
                                    var10000 = false;
                                    return var10000;
                                }

                                if (var9 < 0 || (long) var9 > this.aClass93_1354.method600() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }

                            if (var9 == 0) {
                                var4 = false;
                                var9 = (int) ((this.aClass93_1354.method600() + 519L) / 520L);
                                if (var9 == 0) {
                                    ++var9;
                                }

                                if (var9 == var6) {
                                    ++var9;
                                }
                            }

                            if (var3 - var7 <= 512) {
                                var9 = 0;
                            }

                            aByteArray1350[0] = (byte) (var1 >> 8);
                            aByteArray1350[1] = (byte) var1;
                            aByteArray1350[2] = (byte) (var8 >> 8);
                            aByteArray1350[3] = (byte) var8;
                            aByteArray1350[4] = (byte) (var9 >> 16);
                            aByteArray1350[5] = (byte) (var9 >> 8);
                            aByteArray1350[6] = (byte) var9;
                            aByteArray1350[7] = (byte) this.anInt1351;
                            this.aClass93_1354.method605((long) (var6 * 520));
                            this.aClass93_1354.method604(aByteArray1350, 0, 8);
                            var10 = var3 - var7;
                            if (var10 > 512) {
                                var10 = 512;
                            }

                            this.aClass93_1354.method604(var2, var7, var10);
                            var7 += var10;
                            var6 = var9;
                            ++var8;
                            continue;
                        }
                    }

                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var17) {
                return false;
            }
        }
    }
}
