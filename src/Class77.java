public class Class77 {
    public static final Class77 aClass77_837 = new Class77("MEDIUM", 1, 1, 2);
    public static final Class77 aClass77_830 = new Class77("LARGE", 0, 2, 0);
    public static final Class77 aClass77_827 = new Class77("SMALL", 2, 0, 4);
    public static char aChar836;
    static int anInt832;
    static int anInt828;
    static int anInt833;
    final String aString829;
    final int anInt834;
    final int anInt835;
    final int anInt831;

    Class77(String var1, int var2, int var3, int var4) {
        this.aString829 = var1;
        this.anInt831 = var2;
        this.anInt834 = var3;
        this.anInt835 = var4;
    }

    static Class77 method465(int var0) {

        for (int var3 = 0; var3 < new Class77[]{aClass77_837, aClass77_827, aClass77_830}.length; ++var3) {
            Class77 var4 = new Class77[]{aClass77_837, aClass77_827, aClass77_830}[var3];
            if (var0 == var4.anInt834) {
                return var4;
            }
        }

        return null;
    }

    public static AnimationFrame method462(ReferenceTable var0, ReferenceTable var1, int var2, boolean var3) {
        boolean var4 = true;
        int[] var5 = var0.method1087(var2);

        for (int var6 = 0; var6 < var5.length; ++var6) {
            byte[] var7 = var0.method1095(var2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
                byte[] var9 = var1.method1095(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }

        if (!var4) {
            return null;
        } else {
            try {
                return new AnimationFrame(var0, var1, var2, var3);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    static void method464() {
        int var0;
        if (Client.anInt1492 == 0) {
            Class60.aSceneGraph631 = new SceneGraph(4, 104, 104, Class26.anIntArrayArrayArray191);

            for (var0 = 0; var0 < 4; ++var0) {
                Client.collisionMaps[var0] = new CollisionMap(104, 104);
            }

            PathingEntity.aSprite794 = new Sprite(512, 512);
            Login.aString686 = "Starting game engine...";
            Login.anInt699 = 5;
            Client.anInt1492 = 20;
        } else {
            int var2;
            int var3;
            int var4;
            int var5;
            if (Client.anInt1492 != 20) {
                if (Client.anInt1492 == 30) {
                    Client.aCacheReferenceTable1493 = Socket.method887(0, false, true, true);
                    Client.aCacheReferenceTable1496 = Socket.method887(1, false, true, true);
                    Class73.aCacheReferenceTable741 = Socket.method887(2, true, false, true);
                    BoundingBox.aCacheReferenceTable372 = Socket.method887(3, false, true, true);
                    Class34.aCacheReferenceTable274 = Socket.method887(4, false, true, true);
                    Class126.aCacheReferenceTable1368 = Socket.method887(5, true, true, true);
                    Class100.aCacheReferenceTable1119 = Socket.method887(6, true, true, false);
                    Class76.aCacheReferenceTable823 = Socket.method887(7, false, true, true);
                    Class21.aCacheReferenceTable139 = Socket.method887(8, false, true, true);
                    Class60.aCacheReferenceTable630 = Socket.method887(9, false, true, true);
                    Class82.aCacheReferenceTable848 = Socket.method887(10, false, true, true);
                    Applet_Sub1.aCacheReferenceTable681 = Socket.method887(11, false, true, true);
                    ScriptEvent.aCacheReferenceTable322 = Socket.method887(12, false, true, true);
                    Class2.aCacheReferenceTable8 = Socket.method887(13, true, false, true);
                    Class147.aCacheReferenceTable1810 = Socket.method887(14, false, true, false);
                    Class119.aCacheReferenceTable1357 = Socket.method887(15, false, true, true);
                    Class73.aCacheReferenceTable740 = Socket.method887(16, false, true, false);
                    Login.aString686 = "Connecting to update server";
                    Login.anInt699 = 20;
                    Client.anInt1492 = 40;
                } else if (Client.anInt1492 == 40) {
                    byte var29 = 0;
                    var0 = var29 + Client.aCacheReferenceTable1493.method1130() * 4 / 100;
                    var0 += Client.aCacheReferenceTable1496.method1130() * 4 / 100;
                    var0 += Class73.aCacheReferenceTable741.method1130() * 2 / 100;
                    var0 += BoundingBox.aCacheReferenceTable372.method1130() * 2 / 100;
                    var0 += Class34.aCacheReferenceTable274.method1130() * 6 / 100;
                    var0 += Class126.aCacheReferenceTable1368.method1130() * 4 / 100;
                    var0 += Class100.aCacheReferenceTable1119.method1130() * 2 / 100;
                    var0 += Class76.aCacheReferenceTable823.method1130() * 58 / 100;
                    var0 += Class21.aCacheReferenceTable139.method1130() * 2 / 100;
                    var0 += Class60.aCacheReferenceTable630.method1130() * 2 / 100;
                    var0 += Class82.aCacheReferenceTable848.method1130() * 2 / 100;
                    var0 += Applet_Sub1.aCacheReferenceTable681.method1130() * 2 / 100;
                    var0 += ScriptEvent.aCacheReferenceTable322.method1130() * 2 / 100;
                    var0 += Class2.aCacheReferenceTable8.method1130() * 2 / 100;
                    var0 += Class147.aCacheReferenceTable1810.method1130() * 2 / 100;
                    var0 += Class119.aCacheReferenceTable1357.method1130() * 2 / 100;
                    var0 += Class73.aCacheReferenceTable740.method1130() * 2 / 100;
                    if (var0 != 100) {
                        if (var0 != 0) {
                            Login.aString686 = "Checking for updates - " + var0 + "%";
                        }

                        Login.anInt699 = 30;
                    } else {
                        Login.aString686 = "Loaded update list";
                        Login.anInt699 = 30;
                        Client.anInt1492 = 45;
                    }
                } else {
                    CacheReferenceTable var6;
                    CacheReferenceTable var7;
                    CacheReferenceTable var8;
                    if (Client.anInt1492 == 45) {
                        AudioEffect.method358(22050, !Client.lowMemory, 2);
                        Node_Sub10_Sub3 var27 = new Node_Sub10_Sub3();
                        var27.method554(9, 128);
                        Class105.aClass84_1244 = Class7.method39(Client.aClass108_301, 0, 22050);
                        Class105.aClass84_1244.method480(var27);
                        var6 = Class119.aCacheReferenceTable1357;
                        var7 = Class147.aCacheReferenceTable1810;
                        var8 = Class34.aCacheReferenceTable274;
                        Class133.aReferenceTable1722 = var6;
                        Class133.aReferenceTable1729 = var7;
                        Class133.aReferenceTable1724 = var8;
                        Class133.aNode_Sub10_Sub3_1723 = var27;
                        Player.aClass84_231 = Class7.method39(Client.aClass108_301, 1, 2048);
                        Class15.aNode_Sub10_Sub1_123 = new Node_Sub10_Sub1();
                        Player.aClass84_231.method480(Class15.aNode_Sub10_Sub1_123);
                        Class33.aClass94_254 = new Class94(22050, Class84.anInt870);
                        Login.aString686 = "Prepared sound engine";
                        Login.anInt699 = 35;
                        Client.anInt1492 = 50;
                        ScriptEvent.aClass176_329 = new Class176(Class21.aCacheReferenceTable139, Class2.aCacheReferenceTable8);
                    } else if (Client.anInt1492 == 50) {
                        Class180[] var26 = new Class180[]{Class180.aClass180_2147, Class180.aClass180_2153, Class180.aClass180_2148, Class180.aClass180_2149, Class180.aClass180_2146, Class180.aClass180_2151};
                        var2 = var26.length;
                        Class176 var28 = ScriptEvent.aClass176_329;
                        Class180[] var30 = new Class180[]{Class180.aClass180_2147, Class180.aClass180_2153, Class180.aClass180_2148, Class180.aClass180_2149, Class180.aClass180_2146, Class180.aClass180_2151};
                        Client.aHashMap1513 = var28.method1187(var30);
                        if (Client.aHashMap1513.size() < var2) {
                            Login.aString686 = "Loading fonts - " + Client.aHashMap1513.size() * 100 / var2 + "%";
                            Login.anInt699 = 40;
                        } else {
                            Class78.aFont838 = (Font) Client.aHashMap1513.get(Class180.aClass180_2146);
                            Boundary.aFont1150 = (Font) Client.aHashMap1513.get(Class180.aClass180_2153);
                            Class35.aFont313 = (Font) Client.aHashMap1513.get(Class180.aClass180_2148);
                            Class62.aNode_Sub28_635 = new Node_Sub28(true);
                            Login.aString686 = "Loaded fonts";
                            Login.anInt699 = 40;
                            Client.anInt1492 = 60;
                        }
                    } else if (Client.anInt1492 == 60) {
                        var0 = Class49.method313(Class82.aCacheReferenceTable848, Class21.aCacheReferenceTable139);
                        var2 = Class6.method24();
                        if (var0 < var2) {
                            Login.aString686 = "Loading title screen - " + var0 * 100 / var2 + "%";
                            Login.anInt699 = 50;
                        } else {
                            Login.aString686 = "Loaded title screen";
                            Login.anInt699 = 50;
                            Class45.method304(5);
                            Client.anInt1492 = 70;
                        }
                    } else if (Client.anInt1492 == 70) {
                        if (!Class73.aCacheReferenceTable741.method1088()) {
                            Login.aString686 = "Loading config - " + Class73.aCacheReferenceTable741.method1132() + "%";
                            Login.anInt699 = 60;
                        } else {
                            Node_Sub21_Sub12.aReferenceTable2012 = Class73.aCacheReferenceTable741;
                            PlayerAppearance.method1038(Class73.aCacheReferenceTable741);
                            var6 = Class73.aCacheReferenceTable741;
                            var7 = Class76.aCacheReferenceTable823;
                            Node_Sub21_Sub21.aReferenceTable2012 = var6;
                            Node_Sub21_Sub21.aReferenceTable2017 = var7;
                            Node_Sub21_Sub21.anInt206 = Node_Sub21_Sub21.aReferenceTable2012.method1101(3);
                            var8 = Class73.aCacheReferenceTable741;
                            CacheReferenceTable var9 = Class76.aCacheReferenceTable823;
                            boolean var10 = Client.lowMemory;
                            ObjectDefinition.aReferenceTable2017 = var8;
                            ObjectDefinition.aReferenceTable2039 = var9;
                            ObjectDefinition.aBoolean1083 = var10;
                            Node_Sub21_Sub10.method1064(Class73.aCacheReferenceTable741, Class76.aCacheReferenceTable823);
                            GraphicsObject.method455(Class73.aCacheReferenceTable741);
                            CacheReferenceTable var11 = Class73.aCacheReferenceTable741;
                            CacheReferenceTable var12 = Class76.aCacheReferenceTable823;
                            boolean var13 = Client.membersWorld;
                            Font var14 = Class78.aFont838;
                            Class55.aReferenceTable424 = var11;
                            Class44.aReferenceTable369 = var12;
                            Node_Sub21_Sub19.aBoolean2098 = var13;
                            Class120.anInt1358 = Class55.aReferenceTable424.method1101(10);
                            Class53.aFont413 = var14;
                            GraphicsObject.method456(Class73.aCacheReferenceTable741, Client.aCacheReferenceTable1493, Client.aCacheReferenceTable1496);
                            CacheReferenceTable var15 = Class73.aCacheReferenceTable741;
                            CacheReferenceTable var16 = Class76.aCacheReferenceTable823;
                            Node_Sub21_Sub7.aReferenceTable2012 = var15;
                            Class156.aReferenceTable1844 = var16;
                            Class30.method202(Class73.aCacheReferenceTable741);
                            Node_Sub21_Sub20.aReferenceTable2012 = Class73.aCacheReferenceTable741;
                            Node_Sub21_Sub20.anInt209 = Node_Sub21_Sub20.aReferenceTable2012.method1101(16);
                            Class46.method307(BoundingBox.aCacheReferenceTable372, Class76.aCacheReferenceTable823, Class21.aCacheReferenceTable139, Class2.aCacheReferenceTable8);
                            Class168.method1114(Class73.aCacheReferenceTable741);
                            Login.method411(Class73.aCacheReferenceTable741);
                            Node_Sub21_Sub16.aReferenceTable2012 = Class73.aCacheReferenceTable741;
                            Class15.method131(Class73.aCacheReferenceTable741);
                            DefinitionProperty.aReferenceTable2012 = Class73.aCacheReferenceTable741;
                            Class34.aClass67_277 = new Class67();
                            CacheReferenceTable var20 = Class73.aCacheReferenceTable741;
                            CacheReferenceTable var21 = Class21.aCacheReferenceTable139;
                            CacheReferenceTable var22 = Class2.aCacheReferenceTable8;
                            HitsplatDefinition.aReferenceTable2012 = var20;
                            HitsplatDefinition.aReferenceTable2017 = var21;
                            HitsplatDefinition.aReferenceTable2039 = var22;
                            Class78.method466(Class73.aCacheReferenceTable741, Class21.aCacheReferenceTable139);
                            Class6_Sub1.method159(Class73.aCacheReferenceTable741, Class21.aCacheReferenceTable139);
                            Login.aString686 = "Loaded config";
                            Login.anInt699 = 60;
                            Client.anInt1492 = 80;
                        }
                    } else if (Client.anInt1492 == 80) {
                        var0 = 0;
                        if (Class122.aSprite1360 == null) {
                            Class122.aSprite1360 = Class108.method751(Class21.aCacheReferenceTable139, "compass", "");
                        } else {
                            ++var0;
                        }

                        if (Class75.aSprite805 == null) {
                            Class75.aSprite805 = Class108.method751(Class21.aCacheReferenceTable139, "mapedge", "");
                        } else {
                            ++var0;
                        }

                        if (Client.aNode_Sub21_Sub26_Sub2Array1542 == null) {
                            Client.aNode_Sub21_Sub26_Sub2Array1542 = InterfaceNode.method267(Class21.aCacheReferenceTable139, "mapscene", "");
                        } else {
                            ++var0;
                        }

                        if (Class150.aSpriteArray1827 == null) {
                            Class150.aSpriteArray1827 = RuntimeException_Sub1.method742(Class21.aCacheReferenceTable139, "headicons_pk", "");
                        } else {
                            ++var0;
                        }

                        if (Class169.aSpriteArray2119 == null) {
                            Class169.aSpriteArray2119 = RuntimeException_Sub1.method742(Class21.aCacheReferenceTable139, "headicons_prayer", "");
                        } else {
                            ++var0;
                        }

                        if (Class70.aSpriteArray715 == null) {
                            Class70.aSpriteArray715 = RuntimeException_Sub1.method742(Class21.aCacheReferenceTable139, "headicons_hint", "");
                        } else {
                            ++var0;
                        }

                        if (Class54.aSpriteArray419 == null) {
                            Class54.aSpriteArray419 = RuntimeException_Sub1.method742(Class21.aCacheReferenceTable139, "mapmarker", "");
                        } else {
                            ++var0;
                        }

                        if (Class12_Sub1.aSpriteArray110 == null) {
                            Class12_Sub1.aSpriteArray110 = RuntimeException_Sub1.method742(Class21.aCacheReferenceTable139, "cross", "");
                        } else {
                            ++var0;
                        }

                        if (Class6_Sub2.aSpriteArray825 == null) {
                            Class6_Sub2.aSpriteArray825 = RuntimeException_Sub1.method742(Class21.aCacheReferenceTable139, "mapdots", "");
                        } else {
                            ++var0;
                        }

                        if (Class64.aNode_Sub21_Sub26_Sub2Array656 == null) {
                            Class64.aNode_Sub21_Sub26_Sub2Array656 = InterfaceNode.method267(Class21.aCacheReferenceTable139, "scrollbar", "");
                        } else {
                            ++var0;
                        }

                        if (Class2.aNode_Sub21_Sub26_Sub2Array12 == null) {
                            Class2.aNode_Sub21_Sub26_Sub2Array12 = InterfaceNode.method267(Class21.aCacheReferenceTable139, "mod_icons", "");
                        } else {
                            ++var0;
                        }

                        if (var0 < 11) {
                            Login.aString686 = "Loading sprites - " + var0 * 100 / 12 + "%";
                            Login.anInt699 = 70;
                        } else {
                            Node_Sub21_Sub26_Sub3.aNode_Sub21_Sub26_Sub2Array2131 = Class2.aNode_Sub21_Sub26_Sub2Array12;
                            Class75.aSprite805.method935();
                            var2 = (int) (Math.random() * 21.0D) - 10;
                            var3 = (int) (Math.random() * 21.0D) - 10;
                            var4 = (int) (Math.random() * 21.0D) - 10;
                            var5 = (int) (Math.random() * 41.0D) - 20;
                            Client.aNode_Sub21_Sub26_Sub2Array1542[0].method1158(var5 + var2, var5 + var3, var5 + var4);
                            Login.aString686 = "Loaded sprites";
                            Login.anInt699 = 70;
                            Client.anInt1492 = 90;
                        }
                    } else if (Client.anInt1492 == 90) {
                        if (!Class60.aCacheReferenceTable630.method1088()) {
                            Login.aString686 = "Loading textures - " + Class60.aCacheReferenceTable630.method1132() + "%";
                            Login.anInt699 = 90;
                        } else {
                            TextureProviderImpl var24 = new TextureProviderImpl(Class60.aCacheReferenceTable630, Class21.aCacheReferenceTable139, 20, 0.8D, Client.lowMemory ? 64 : 128);
                            Node_Sub21_Sub26_Sub1.method645(var24);
                            Node_Sub21_Sub26_Sub1.method648(0.8D);
                            Login.aString686 = "Loaded textures";
                            Login.anInt699 = 90;
                            Client.anInt1492 = 110;
                        }
                    } else if (Client.anInt1492 == 110) {
                        Client.mouseRecorder = new MouseRecorder();
                        Client.aClass108_301.method747(Client.mouseRecorder, 10);
                        Login.aString686 = "Loaded input handler";
                        Login.anInt699 = 94;
                        Client.anInt1492 = 120;
                    } else if (Client.anInt1492 == 120) {
                        if (!Class82.aCacheReferenceTable848.method1100("huffman", "")) {
                            Login.aString686 = "Loading wordpack - " + 0 + "%";
                            Login.anInt699 = 96;
                        } else {
                            Class118 var23 = new Class118(Class82.aCacheReferenceTable848.method1105("huffman", ""));
                            GrandExchangeOffer.method419(var23);
                            Login.aString686 = "Loaded wordpack";
                            Login.anInt699 = 96;
                            Client.anInt1492 = 130;
                        }
                    } else if (Client.anInt1492 == 130) {
                        if (!BoundingBox.aCacheReferenceTable372.method1088()) {
                            Login.aString686 = "Loading interfaces - " + BoundingBox.aCacheReferenceTable372.method1132() * 4 / 5 + "%";
                            Login.anInt699 = 100;
                        } else if (!ScriptEvent.aCacheReferenceTable322.method1088()) {
                            Login.aString686 = "Loading interfaces - " + (ScriptEvent.aCacheReferenceTable322.method1132() / 6 + 80) + "%";
                            Login.anInt699 = 100;
                        } else if (!Class2.aCacheReferenceTable8.method1088()) {
                            Login.aString686 = "Loading interfaces - " + (Class2.aCacheReferenceTable8.method1132() / 50 + 96) + "%";
                            Login.anInt699 = 100;
                        } else {
                            Login.aString686 = "Loaded interfaces";
                            Login.anInt699 = 98;
                            Client.anInt1492 = 140;
                        }
                    } else if (Client.anInt1492 == 140) {
                        if (!Class73.aCacheReferenceTable740.method1099(Class10.aClass10_70.aString77)) {
                            Login.aString686 = "Loading world map - " + Class73.aCacheReferenceTable740.method1086(Class10.aClass10_70.aString77) / 10 + "%";
                        } else {
                            if (Class9.aClass189_68 == null) {
                                Class9.aClass189_68 = new Class189();
                                Class9.aClass189_68.method1296(Class73.aCacheReferenceTable740, Class35.aFont313, Client.aHashMap1513, Client.aNode_Sub21_Sub26_Sub2Array1542);
                            }

                            var0 = Class9.aClass189_68.method1293();
                            if (var0 < 100) {
                                Login.aString686 = "Loading world map - " + (var0 * 9 / 10 + 10) + "%";
                            } else {
                                Login.aString686 = "Loaded world map";
                                Login.anInt699 = 100;
                                Client.anInt1492 = 150;
                            }
                        }
                    } else if (Client.anInt1492 == 150) {
                        Class45.method304(10);
                    }
                }
            } else {
                int[] var1 = new int[9];

                for (var2 = 0; var2 < 9; ++var2) {
                    var3 = var2 * 32 + 128 + 15;
                    var4 = var3 * 3 + 600;
                    var5 = Node_Sub21_Sub26_Sub1.SINE[var3];
                    var1[var2] = var5 * var4 >> 16;
                }

                SceneGraph.method667(var1, 500, 800, 512, 334);
                Login.aString686 = "Prepared visibility map";
                Login.anInt699 = 10;
                Client.anInt1492 = 30;
            }
        }
    }

    public static HitsplatDefinition getHitsplatDefinition(int var0) {
        HitsplatDefinition var1 = (HitsplatDefinition) HitsplatDefinition.aReferenceCache2013.method973((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = HitsplatDefinition.aReferenceTable2012.method1085(32, var0);
            var1 = new HitsplatDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }

            HitsplatDefinition.aReferenceCache2013.method975(var1, (long) var0);
            return var1;
        }
    }

    boolean method461(float var1) {
        return var1 >= (float) this.anInt835;
    }
}
