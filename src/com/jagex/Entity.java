package com.jagex;

public abstract class Entity extends DoublyNode {
    public int height = 1000;

    static int method660(char var0, int var1) {
        int var2 = var0 << 4;
        if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
            var0 = Character.toLowerCase(var0);
            var2 = (var0 << 4) + 1;
        }

        return var2;
    }

    static int method658(int var0, RuneScript var1, boolean var2) {
        int var3;
        int var4;
        if (var0 == 4000) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 + var4;
            return 1;
        }
        if (var0 == 4001) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 - var4;
            return 1;
        }
        if (var0 == 4002) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var4 * var3;
            return 1;
        }
        if (var0 == 4003) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 / var4;
            return 1;
        }
        if (var0 == 4004) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = (int) (Math.random() * (double) var3);
            return 1;
        }
        if (var0 == 4005) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            Class63.anIntArray645[++Class63.anInt644 - 1] = (int) (Math.random() * (double) (var3 + 1));
            return 1;
        }
        if (var0 == 4006) {
            Class63.anInt644 -= 5;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            int var5 = Class63.anIntArray645[Class63.anInt644 + 2];
            int var6 = Class63.anIntArray645[Class63.anInt644 + 3];
            int var7 = Class63.anIntArray645[Class63.anInt644 + 4];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
            return 1;
        }
        if (var0 == 4007) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var4 * var3 / 100 + var3;
            return 1;
        }
        if (var0 == 4008) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 | 1 << var4;
            return 1;
        }
        if (var0 == 4009) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 & -1 - (1 << var4);
            return 1;
        }
        if (var0 == 4010) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
            return 1;
        }
        if (var0 == 4011) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 % var4;
            return 1;
        }
        if (var0 == 4012) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            if (var3 == 0) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = (int) Math.pow((double) var3, (double) var4);
            }

            return 1;
        }
        if (var0 == 4013) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            if (var3 == 0) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
            } else if (var4 == 0) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Integer.MAX_VALUE;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = (int) Math.pow((double) var3, 1.0D / (double) var4);
            }

            return 1;
        }
        if (var0 == 4014) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 & var4;
            return 1;
        }
        if (var0 == 4015) {
            Class63.anInt644 -= 2;
            var3 = Class63.anIntArray645[Class63.anInt644];
            var4 = Class63.anIntArray645[Class63.anInt644 + 1];
            Class63.anIntArray645[++Class63.anInt644 - 1] = var3 | var4;
            return 1;
        }
        if (var0 == 4018) {
            Class63.anInt644 -= 3;
            long var8 = (long) Class63.anIntArray645[Class63.anInt644];
            long var10 = (long) Class63.anIntArray645[Class63.anInt644 + 1];
            long var12 = (long) Class63.anIntArray645[Class63.anInt644 + 2];
            Class63.anIntArray645[++Class63.anInt644 - 1] = (int) (var12 * var8 / var10);
            return 1;
        }
        return 2;
    }

    static void method659(Node_Sub21_Sub26_Sub2 var0) {
        short var1 = 256;

        int var2;
        for (var2 = 0; var2 < Class53.anIntArray411.length; ++var2) {
            Class53.anIntArray411[var2] = 0;
        }

        int var3;
        for (var2 = 0; var2 < 5000; ++var2) {
            var3 = (int) (Math.random() * 128.0D * (double) var1);
            Class53.anIntArray411[var3] = (int) (Math.random() * 256.0D);
        }

        int var4;
        int var5;
        for (var2 = 0; var2 < 20; ++var2) {
            for (var3 = 1; var3 < var1 - 1; ++var3) {
                for (var4 = 1; var4 < 127; ++var4) {
                    var5 = var4 + (var3 << 7);
                    RuneScript.anIntArray666[var5] = (Class53.anIntArray411[var5 + 128] + Class53.anIntArray411[var5 - 1] + Class53.anIntArray411[var5 + 1] + Class53.anIntArray411[var5 - 128]) / 4;
                }
            }

            int[] var8 = Class53.anIntArray411;
            Class53.anIntArray411 = RuneScript.anIntArray666;
            RuneScript.anIntArray666 = var8;
        }

        if (var0 != null) {
            var2 = 0;

            for (var3 = 0; var3 < var0.anInt232; ++var3) {
                for (var4 = 0; var4 < var0.anInt206; ++var4) {
                    if (var0.aByteArray1361[var2++] != 0) {
                        var5 = var4 + 16 + var0.anInt327;
                        int var6 = var3 + 16 + var0.anInt328;
                        int var7 = (var6 << 7) + var5;
                        Class53.anIntArray411[var7] = 0;
                    }
                }
            }
        }

    }

    void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        Model var10 = this.method191();
        if (var10 != null) {
            this.height = var10.height;
            var10.render(var1, var2, var3, var4, var5, var6, var7, var8, var9);
        }

    }

    protected Model method191() {
        return null;
    }
}
