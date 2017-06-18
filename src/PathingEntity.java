public abstract class PathingEntity extends Entity {
    static Sprite aSprite794;
    int targetIndex = -1;
    int strictY;
    int queueSize = 0;
    boolean aBoolean758 = false;
    int anInt753 = 1;
    int anInt772;
    int anInt745 = -1;
    int anInt755 = -1;
    int anInt760 = -1;
    int anInt757 = -1;
    int anInt746 = -1;
    int anInt744 = -1;
    int anInt766 = -1;
    int anInt782 = 0;
    boolean aBoolean750;
    boolean aBoolean759 = false;
    byte hitCount = 0;
    int anInt756 = 0;
    boolean aBoolean789 = false;
    int anInt795 = 32;
    int[] hitsplatTypes = new int[4];
    int[] hitsplats = new int[4];
    int anInt796 = 0;
    int anInt781 = 0;
    int[] specialHitsplats = new int[4];
    int strictX;
    int anInt761 = 100;
    String aString752 = null;
    int anInt793 = -1;
    int anInt768 = -1;
    int subAnimationFrame = 0;
    int anInt787;
    int anInt769 = 0;
    int[] hitsplatIds = new int[4];
    int anInt790 = 0;
    int anInt754 = -1;
    int anInt784 = 0;
    int anInt771 = -1;
    LinkedList<HealthBar> healthBars = new LinkedList<>();
    int anInt780 = 0;
    int anInt786;
    int orientation;
    int anInt778;
    int[] hitsplatCycles = new int[4];
    int animationFrame = 0;
    int anInt792;
    int anInt775;
    int anInt791 = 0;
    int anInt779;
    int anInt748;
    int anInt803 = 200;
    int anInt777;
    int animation = -1;
    int anInt788;
    int anInt767 = 0;
    int[] anIntArray800 = new int[10];
    int[] anIntArray804 = new int[10];
    byte[] aByteArray798 = new byte[10];
    int anInt801 = 0;
    int anInt799 = 0;

    final void method441() {
        this.queueSize = 0;
        this.anInt799 = 0;
    }

    final void method440(int var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var7 = true;
        boolean var8 = true;

        int var9;
        for (var9 = 0; var9 < 4; ++var9) {
            if (this.hitsplatCycles[var9] > var5) {
                var7 = false;
            } else {
                var8 = false;
            }
        }

        var9 = -1;
        int var10 = -1;
        int var11 = 0;
        if (var1 >= 0) {
            HitsplatDefinition var12 = Class77.getHitsplatDefinition(var1);
            var10 = var12.comparisonType;
            var11 = var12.duration;
        }

        int var13;
        if (var8) {
            if (var10 == -1) {
                return;
            }

            var9 = 0;
            var13 = 0;
            if (var10 == 0) {
                var13 = this.hitsplatCycles[0];
            } else if (var10 == 1) {
                var13 = this.hitsplats[0];
            }

            for (int var14 = 1; var14 < 4; ++var14) {
                if (var10 == 0) {
                    if (this.hitsplatCycles[var14] < var13) {
                        var9 = var14;
                        var13 = this.hitsplatCycles[var14];
                    }
                } else if (var10 == 1 && this.hitsplats[var14] < var13) {
                    var9 = var14;
                    var13 = this.hitsplats[var14];
                }
            }

            if (var10 == 1 && var13 >= var2) {
                return;
            }
        } else {
            if (var7) {
                this.hitCount = 0;
            }

            for (var13 = 0; var13 < 4; ++var13) {
                byte var15 = this.hitCount;
                this.hitCount = (byte) ((this.hitCount + 1) % 4);
                if (this.hitsplatCycles[var15] <= var5) {
                    var9 = var15;
                    break;
                }
            }
        }

        if (var9 >= 0) {
            this.hitsplatTypes[var9] = var1;
            this.hitsplats[var9] = var2;
            this.hitsplatIds[var9] = var3;
            this.specialHitsplats[var9] = var4;
            this.hitsplatCycles[var9] = var11 + var5 + var6;
        }
    }

    final void method439(int var1, int var2, int var3, int var4, int var5, int var6) {
        HealthBarDefinition var7 = (HealthBarDefinition) HealthBarDefinition.aReferenceCache2008.method973((long) var1);
        HealthBarDefinition var8;
        if (var7 != null) {
            var8 = var7;
        } else {
            byte[] var9 = HealthBarDefinition.aReferenceTable2012.method1085(33, var1);
            var7 = new HealthBarDefinition();
            if (var9 != null) {
                var7.method1052(new Buffer(var9));
            }

            HealthBarDefinition.aReferenceCache2008.method975(var7, (long) var1);
            var8 = var7;
        }

        var7 = var8;
        HealthBar var14 = null;
        HealthBar var10 = null;
        int var11 = var8.anInt217;
        int var12 = 0;

        HealthBar var13;
        for (var13 = this.healthBars.method909(); var13 != null; var13 = this.healthBars.method911()) {
            ++var12;
            if (var7.anInt327 == var13.definition.anInt327) {
                var13.method341(var4 + var2, var5, var6, var3);
                return;
            }

            if (var13.definition.anInt220 <= var7.anInt220) {
                var14 = var13;
            }

            if (var13.definition.anInt217 > var11) {
                var10 = var13;
                var11 = var13.definition.anInt217;
            }
        }

        if (var10 != null || var12 < 4) {
            var13 = new HealthBar(var7);
            if (var14 == null) {
                this.healthBars.method912(var13);
            } else {
                LinkedList.method908(var13, var14);
            }

            var13.method341(var4 + var2, var5, var6, var3);
            if (var12 >= 4) {
                var10.unlink();
            }

        }
    }

    final void method442(int var1) {
        HealthBarDefinition var2 = (HealthBarDefinition) HealthBarDefinition.aReferenceCache2008.method973((long) var1);
        HealthBarDefinition var3;
        if (var2 != null) {
            var3 = var2;
        } else {
            byte[] var4 = HealthBarDefinition.aReferenceTable2012.method1085(33, var1);
            var2 = new HealthBarDefinition();
            if (var4 != null) {
                var2.method1052(new Buffer(var4));
            }

            HealthBarDefinition.aReferenceCache2008.method975(var2, (long) var1);
            var3 = var2;
        }

        var2 = var3;

        for (HealthBar var5 = this.healthBars.method909(); var5 != null; var5 = this.healthBars.method911()) {
            if (var2 == var5.definition) {
                var5.unlink();
                return;
            }
        }

    }

    boolean method194() {
        return false;
    }
}
