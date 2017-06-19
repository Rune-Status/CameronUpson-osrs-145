package com.jagex;

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
            byte[] var7 = var0.get(var2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
                byte[] var9 = var1.get(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }

        if (!var4) {
            return null;
        }
        try {
            return new AnimationFrame(var0, var1, var2, var3);
        } catch (Exception var11) {
            return null;
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
                    Client.skeletons = GameSocket.method887(0, false, true, true);
                    Client.mesh = GameSocket.method887(1, false, true, true);
                    Class73.config = GameSocket.method887(2, true, false, true);
                    BoundingBox.interfaceComponents = GameSocket.method887(3, false, true, true);
                    Class34.audioEffects = GameSocket.method887(4, false, true, true);
                    Class126.landscapes = GameSocket.method887(5, true, true, true);
                    Class100.midi = GameSocket.method887(6, true, true, false);
                    Class76.models = GameSocket.method887(7, false, true, true);
                    Class21.materials = GameSocket.method887(8, false, true, true);
                    Class60.textures = GameSocket.method887(9, false, true, true);
                    Class82.binary = GameSocket.method887(10, false, true, true);
                    Applet_Sub1.midi2 = GameSocket.method887(11, false, true, true);
                    ScriptEvent.runescripts = GameSocket.method887(12, false, true, true);
                    Class2.fontMetrics = GameSocket.method887(13, true, false, true);
                    Class147.vorbis = GameSocket.method887(14, false, true, false);
                    Class119.instruments = GameSocket.method887(15, false, true, true);
                    Class73.worldMap = GameSocket.method887(16, false, true, false);
                    Login.aString686 = "Connecting to update server";
                    Login.anInt699 = 20;
                    Client.anInt1492 = 40;
                } else if (Client.anInt1492 == 40) {
                    byte var29 = 0;
                    var0 = var29 + Client.skeletons.method1130() * 4 / 100;
                    var0 += Client.mesh.method1130() * 4 / 100;
                    var0 += Class73.config.method1130() * 2 / 100;
                    var0 += BoundingBox.interfaceComponents.method1130() * 2 / 100;
                    var0 += Class34.audioEffects.method1130() * 6 / 100;
                    var0 += Class126.landscapes.method1130() * 4 / 100;
                    var0 += Class100.midi.method1130() * 2 / 100;
                    var0 += Class76.models.method1130() * 58 / 100;
                    var0 += Class21.materials.method1130() * 2 / 100;
                    var0 += Class60.textures.method1130() * 2 / 100;
                    var0 += Class82.binary.method1130() * 2 / 100;
                    var0 += Applet_Sub1.midi2.method1130() * 2 / 100;
                    var0 += ScriptEvent.runescripts.method1130() * 2 / 100;
                    var0 += Class2.fontMetrics.method1130() * 2 / 100;
                    var0 += Class147.vorbis.method1130() * 2 / 100;
                    var0 += Class119.instruments.method1130() * 2 / 100;
                    var0 += Class73.worldMap.method1130() * 2 / 100;
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
                        var6 = Class119.instruments;
                        var7 = Class147.vorbis;
                        var8 = Class34.audioEffects;
                        Class133.aReferenceTable1722 = var6;
                        Class133.aReferenceTable1729 = var7;
                        Class133.aReferenceTable1724 = var8;
                        Class133.aNode_Sub10_Sub3_1723 = var27;
                        PlayerEntity.aClass84_231 = Class7.method39(Client.aClass108_301, 1, 2048);
                        Class15.aNode_Sub10_Sub1_123 = new Node_Sub10_Sub1();
                        PlayerEntity.aClass84_231.method480(Class15.aNode_Sub10_Sub1_123);
                        Class33.aClass94_254 = new Class94(22050, Class84.anInt870);
                        Login.aString686 = "Prepared sound engine";
                        Login.anInt699 = 35;
                        Client.anInt1492 = 50;
                        ScriptEvent.aClass176_329 = new Class176(Class21.materials, Class2.fontMetrics);
                    } else if (Client.anInt1492 == 50) {
                        Class180[] var26 = new Class180[]{Class180.aClass180_2147, Class180.aClass180_2153, Class180.aClass180_2148, Class180.aClass180_2149, Class180.aClass180_2146, Class180.aClass180_2151};
                        var2 = var26.length;
                        Class176 var28 = ScriptEvent.aClass176_329;
                        Class180[] var30 = new Class180[]{Class180.aClass180_2147, Class180.aClass180_2153, Class180.aClass180_2148, Class180.aClass180_2149, Class180.aClass180_2146, Class180.aClass180_2151};
                        Client.fonts = var28.method1187(var30);
                        if (Client.fonts.size() < var2) {
                            Login.aString686 = "Loading fonts - " + Client.fonts.size() * 100 / var2 + "%";
                            Login.anInt699 = 40;
                        } else {
                            Class78.aFont838 = (Font) Client.fonts.get(Class180.aClass180_2146);
                            Boundary.aFont1150 = (Font) Client.fonts.get(Class180.aClass180_2153);
                            Class35.font_b12_full = (Font) Client.fonts.get(Class180.aClass180_2148);
                            Class62.aNode_Sub28_635 = new Node_Sub28(true);
                            Login.aString686 = "Loaded fonts";
                            Login.anInt699 = 40;
                            Client.anInt1492 = 60;
                        }
                    } else if (Client.anInt1492 == 60) {
                        var0 = Class49.method313(Class82.binary, Class21.materials);
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
                        if (!Class73.config.method1088()) {
                            Login.aString686 = "Loading config - " + Class73.config.getPercentLoaded() + "%";
                            Login.anInt699 = 60;
                        } else {
                            Node_Sub21_Sub12.aReferenceTable2012 = Class73.config;
                            PlayerAppearance.method1038(Class73.config);
                            var6 = Class73.config;
                            var7 = Class76.models;
                            Node_Sub21_Sub21.aReferenceTable2012 = var6;
                            Node_Sub21_Sub21.aReferenceTable2017 = var7;
                            Node_Sub21_Sub21.anInt206 = Node_Sub21_Sub21.aReferenceTable2012.method1101(3);
                            var8 = Class73.config;
                            CacheReferenceTable var9 = Class76.models;
                            boolean var10 = Client.lowMemory;
                            ObjectDefinition.aReferenceTable2017 = var8;
                            ObjectDefinition.aReferenceTable2039 = var9;
                            ObjectDefinition.aBoolean1083 = var10;
                            Node_Sub21_Sub10.method1064(Class73.config, Class76.models);
                            GraphicsObject.method455(Class73.config);
                            CacheReferenceTable var11 = Class73.config;
                            CacheReferenceTable var12 = Class76.models;
                            boolean var13 = Client.membersWorld;
                            Font var14 = Class78.aFont838;
                            Class55.aReferenceTable424 = var11;
                            Class44.aReferenceTable369 = var12;
                            Node_Sub21_Sub19.aBoolean2098 = var13;
                            Class120.anInt1358 = Class55.aReferenceTable424.method1101(10);
                            Class53.aFont413 = var14;
                            AnimationSequence.setTables(Class73.config, Client.skeletons, Client.mesh);
                            CacheReferenceTable var15 = Class73.config;
                            CacheReferenceTable var16 = Class76.models;
                            GraphicDefinition.definitionTable = var15;
                            ModelHeader.aReferenceTable1844 = var16;
                            Class30.method202(Class73.config);
                            Node_Sub21_Sub20.aReferenceTable2012 = Class73.config;
                            Node_Sub21_Sub20.anInt209 = Node_Sub21_Sub20.aReferenceTable2012.method1101(16);
                            Class46.method307(BoundingBox.interfaceComponents, Class76.models, Class21.materials, Class2.fontMetrics);
                            Class168.method1114(Class73.config);
                            Login.method411(Class73.config);
                            Node_Sub21_Sub16.aReferenceTable2012 = Class73.config;
                            Class15.method131(Class73.config);
                            DefinitionProperty.aReferenceTable2012 = Class73.config;
                            Class34.aClass67_277 = new Class67();
                            CacheReferenceTable var20 = Class73.config;
                            CacheReferenceTable var21 = Class21.materials;
                            CacheReferenceTable var22 = Class2.fontMetrics;
                            HitsplatDefinition.definitionTable = var20;
                            HitsplatDefinition.spriteTable = var21;
                            HitsplatDefinition.fontTable = var22;
                            Class78.method466(Class73.config, Class21.materials);
                            Class6_Sub1.method159(Class73.config, Class21.materials);
                            Login.aString686 = "Loaded config";
                            Login.anInt699 = 60;
                            Client.anInt1492 = 80;
                        }
                    } else if (Client.anInt1492 == 80) {
                        var0 = 0;
                        if (Class122.aSprite1360 == null) {
                            Class122.aSprite1360 = Class108.method751(Class21.materials, "compass", "");
                        } else {
                            ++var0;
                        }

                        if (Class75.aSprite805 == null) {
                            Class75.aSprite805 = Class108.method751(Class21.materials, "mapedge", "");
                        } else {
                            ++var0;
                        }

                        if (Client.aCompressedImageArray1542 == null) {
                            Client.aCompressedImageArray1542 = InterfaceNode.method267(Class21.materials, "mapscene", "");
                        } else {
                            ++var0;
                        }

                        if (Hitbar.aSpriteArray1827 == null) {
                            Hitbar.aSpriteArray1827 = RuntimeException_Sub1.method742(Class21.materials, "headicons_pk", "");
                        } else {
                            ++var0;
                        }

                        if (Class169.aSpriteArray2119 == null) {
                            Class169.aSpriteArray2119 = RuntimeException_Sub1.method742(Class21.materials, "headicons_prayer", "");
                        } else {
                            ++var0;
                        }

                        if (Class70.aSpriteArray715 == null) {
                            Class70.aSpriteArray715 = RuntimeException_Sub1.method742(Class21.materials, "headicons_hint", "");
                        } else {
                            ++var0;
                        }

                        if (Class54.aSpriteArray419 == null) {
                            Class54.aSpriteArray419 = RuntimeException_Sub1.method742(Class21.materials, "mapmarker", "");
                        } else {
                            ++var0;
                        }

                        if (WorldMapTransportation_Sub1.aSpriteArray110 == null) {
                            WorldMapTransportation_Sub1.aSpriteArray110 = RuntimeException_Sub1.method742(Class21.materials, "cross", "");
                        } else {
                            ++var0;
                        }

                        if (Class6_Sub2.aSpriteArray825 == null) {
                            Class6_Sub2.aSpriteArray825 = RuntimeException_Sub1.method742(Class21.materials, "mapdots", "");
                        } else {
                            ++var0;
                        }

                        if (InterfaceComponent.scrollBarImages == null) {
                            InterfaceComponent.scrollBarImages = InterfaceNode.method267(Class21.materials, "scrollbar", "");
                        } else {
                            ++var0;
                        }

                        if (Class2.aCompressedImageArray12 == null) {
                            Class2.aCompressedImageArray12 = InterfaceNode.method267(Class21.materials, "mod_icons", "");
                        } else {
                            ++var0;
                        }

                        if (var0 < 11) {
                            Login.aString686 = "Loading sprites - " + var0 * 100 / 12 + "%";
                            Login.anInt699 = 70;
                        } else {
                            Node_Sub21_Sub26_Sub3.aCompressedImageArray2131 = Class2.aCompressedImageArray12;
                            Class75.aSprite805.method935();
                            var2 = (int) (Math.random() * 21.0D) - 10;
                            var3 = (int) (Math.random() * 21.0D) - 10;
                            var4 = (int) (Math.random() * 21.0D) - 10;
                            var5 = (int) (Math.random() * 41.0D) - 20;
                            Client.aCompressedImageArray1542[0].method1158(var5 + var2, var5 + var3, var5 + var4);
                            Login.aString686 = "Loaded sprites";
                            Login.anInt699 = 70;
                            Client.anInt1492 = 90;
                        }
                    } else if (Client.anInt1492 == 90) {
                        if (!Class60.textures.method1088()) {
                            Login.aString686 = "Loading textures - " + Class60.textures.getPercentLoaded() + "%";
                            Login.anInt699 = 90;
                        } else {
                            TextureProviderImpl var24 = new TextureProviderImpl(Class60.textures, Class21.materials, 20, 0.8D, Client.lowMemory ? 64 : 128);
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
                        if (!Class82.binary.method1100("huffman", "")) {
                            Login.aString686 = "Loading wordpack - " + 0 + "%";
                            Login.anInt699 = 96;
                        } else {
                            Class118 var23 = new Class118(Class82.binary.method1105("huffman", ""));
                            GrandExchangeOffer.method419(var23);
                            Login.aString686 = "Loaded wordpack";
                            Login.anInt699 = 96;
                            Client.anInt1492 = 130;
                        }
                    } else if (Client.anInt1492 == 130) {
                        if (!BoundingBox.interfaceComponents.method1088()) {
                            Login.aString686 = "Loading interfaces - " + BoundingBox.interfaceComponents.getPercentLoaded() * 4 / 5 + "%";
                            Login.anInt699 = 100;
                        } else if (!ScriptEvent.runescripts.method1088()) {
                            Login.aString686 = "Loading interfaces - " + (ScriptEvent.runescripts.getPercentLoaded() / 6 + 80) + "%";
                            Login.anInt699 = 100;
                        } else if (!Class2.fontMetrics.method1088()) {
                            Login.aString686 = "Loading interfaces - " + (Class2.fontMetrics.getPercentLoaded() / 50 + 96) + "%";
                            Login.anInt699 = 100;
                        } else {
                            Login.aString686 = "Loaded interfaces";
                            Login.anInt699 = 98;
                            Client.anInt1492 = 140;
                        }
                    } else if (Client.anInt1492 == 140) {
                        if (!Class73.worldMap.method1099(Class10.aClass10_70.aString77)) {
                            Login.aString686 = "Loading world map - " + Class73.worldMap.method1086(Class10.aClass10_70.aString77) / 10 + "%";
                        } else {
                            if (Class9.worldMap == null) {
                                Class9.worldMap = new WorldMap();
                                Class9.worldMap.initialize(Class73.worldMap, Class35.font_b12_full, Client.fonts, Client.aCompressedImageArray1542);
                            }

                            var0 = Class9.worldMap.getPercentLoaded();
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

    boolean method461(float var1) {
        return var1 >= (float) this.anInt835;
    }
}
