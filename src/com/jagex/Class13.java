package com.jagex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Class13 {
    static final SceneOffset A_SCENE_OFFSET___100 = new SceneOffset();
    static int anInt102;
    final HashMap aHashMap97;
    int anInt107;
    int[][] anIntArrayArray98;
    java.util.LinkedList aLinkedList103;
    int anInt108;
    Class6_Sub2 aClass6_Sub2_109;
    int anInt101;
    HashMap aHashMap104;
    Sprite aSprite105;
    List aList106;
    int anInt99;

    Class13(int var1, int var2, int var3, HashMap var4) {
        this.anInt107 = var1;
        this.anInt108 = var2;
        this.aLinkedList103 = new java.util.LinkedList();
        this.aList106 = new java.util.LinkedList();
        this.aHashMap104 = new HashMap();
        this.anInt101 = var3 | -16777216;
        this.aHashMap97 = var4;
    }

    static void method103() {
        int var0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var35;
        if (Client.anInt1511 == 37) {
            var0 = Client.aPacket1521.readUnsignedByte();
            var35 = Class23.anInt153 + (var0 >> 4 & 7);
            var2 = Class5.anInt35 + (var0 & 7);
            var3 = Client.aPacket1521.readUnsignedByte();
            var4 = var3 >> 2;
            var5 = var3 & 3;
            var6 = Client.anIntArray1532[var4];
            if (var35 >= 0 && var2 >= 0 && var35 < 104 && var2 < 104) {
                Class128.method880(PlayerEntity.floorLevel, var35, var2, var6, -1, var4, var5, 0, -1);
            }

        } else {
            int var7;
            int var8;
            int var9;
            int var12;
            if (Client.anInt1511 == 173) {
                var0 = Client.aPacket1521.method849();
                byte var1 = Client.aPacket1521.method833();
                var2 = Client.aPacket1521.method849();
                var3 = Client.aPacket1521.method834();
                var4 = Class23.anInt153 + (var3 >> 4 & 7);
                var5 = Class5.anInt35 + (var3 & 7);
                var6 = Client.aPacket1521.method822();
                var7 = var6 >> 2;
                var8 = var6 & 3;
                var9 = Client.anIntArray1532[var7];
                byte var10 = Client.aPacket1521.method844();
                byte var11 = Client.aPacket1521.method844();
                var12 = Client.aPacket1521.method849();
                int var13 = Client.aPacket1521.method856();
                byte var14 = Client.aPacket1521.method870();
                PlayerEntity var15;
                if (var0 == Client.playerIndex) {
                    var15 = Client.playerEntity;
                } else {
                    var15 = Client.playerEntities[var0];
                }

                if (var15 != null) {
                    ObjectDefinition var16 = Class5.method17(var13);
                    int var17;
                    int var18;
                    if (var8 != 1 && var8 != 3) {
                        var17 = var16.anInt230;
                        var18 = var16.anInt222;
                    } else {
                        var17 = var16.anInt222;
                        var18 = var16.anInt230;
                    }

                    int var19 = (var17 >> 1) + var4;
                    int var20 = var4 + (var17 + 1 >> 1);
                    int var21 = var5 + (var18 >> 1);
                    int var22 = (var18 + 1 >> 1) + var5;
                    int[][] var23 = Class26.anIntArrayArrayArray191[PlayerEntity.floorLevel];
                    int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                    int var25 = (var17 << 6) + (var4 << 7);
                    int var26 = (var5 << 7) + (var18 << 6);
                    Model var27 = var16.method1070(var7, var8, var23, var25, var24, var26);
                    if (var27 != null) {
                        Class128.method880(PlayerEntity.floorLevel, var4, var5, var9, -1, 0, 0, var12 + 1, var2 + 1);
                        var15.anInt214 = var12 + Client.engineCycle;
                        var15.anInt226 = var2 + Client.engineCycle;
                        var15.aModel218 = var27;
                        var15.anInt228 = var4 * 128 + var17 * 64;
                        var15.anInt212 = var5 * 128 + var18 * 64;
                        var15.anInt225 = var24;
                        byte var28;
                        if (var10 > var11) {
                            var28 = var10;
                            var10 = var11;
                            var11 = var28;
                        }

                        if (var1 > var14) {
                            var28 = var1;
                            var1 = var14;
                            var14 = var28;
                        }

                        var15.anInt235 = var10 + var4;
                        var15.anInt222 = var11 + var4;
                        var15.anInt230 = var1 + var5;
                        var15.anInt229 = var14 + var5;
                    }
                }
            }

            if (Client.anInt1511 == 190) {
                var0 = Client.aPacket1521.method840();
                var35 = Client.aPacket1521.method818();
                var2 = (var35 >> 4 & 7) + Class23.anInt153;
                var3 = Class5.anInt35 + (var35 & 7);
                var4 = Client.aPacket1521.method822();
                var5 = var4 >> 2;
                var6 = var4 & 3;
                var7 = Client.anIntArray1532[var5];
                if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                    Class128.method880(PlayerEntity.floorLevel, var2, var3, var7, var0, var5, var6, 0, -1);
                }

            } else if (Client.anInt1511 == 66) {
                var0 = Client.aPacket1521.readUnsignedByte();
                var35 = Class23.anInt153 + (var0 >> 4 & 7);
                var2 = (var0 & 7) + Class5.anInt35;
                var3 = Client.aPacket1521.readUnsignedShort();
                var4 = Client.aPacket1521.readUnsignedShort();
                var5 = Client.aPacket1521.readUnsignedShort();
                if (var35 >= 0 && var2 >= 0 && var35 < 104 && var2 < 104) {
                    NodeDeque var38 = Client.pickableNodes[PlayerEntity.floorLevel][var35][var2];
                    if (var38 != null) {
                        for (PickableNode var30 = (PickableNode) var38.method995(); var30 != null; var30 = (PickableNode) var38.next()) {
                            if (var30.id == (var3 & 32767) && var4 == var30.stackSize) {
                                var30.stackSize = var5;
                                break;
                            }
                        }

                        Class22.method146(var35, var2);
                    }
                }

            } else if (Client.anInt1511 == 137) {
                var0 = Client.aPacket1521.readUnsignedByte();
                var35 = (var0 >> 4 & 7) + Class23.anInt153;
                var2 = Class5.anInt35 + (var0 & 7);
                var3 = Client.aPacket1521.readUnsignedShort();
                var4 = Client.aPacket1521.readUnsignedByte();
                var5 = Client.aPacket1521.readUnsignedShort();
                if (var35 >= 0 && var2 >= 0 && var35 < 104 && var2 < 104) {
                    var35 = var35 * 128 + 64;
                    var2 = var2 * 128 + 64;
                    GraphicsObject var29 = new GraphicsObject(var3, PlayerEntity.floorLevel, var35, var2, Class25.method175(var35, var2, PlayerEntity.floorLevel) - var4, var5, Client.engineCycle);
                    Client.graphicsObjects.method997(var29);
                }

            } else {
                if (Client.anInt1511 == 98) {
                    var0 = Client.aPacket1521.readUnsignedByte();
                    var35 = Class23.anInt153 + (var0 >> 4 & 7);
                    var2 = Class5.anInt35 + (var0 & 7);
                    var3 = Client.aPacket1521.readUnsignedShort();
                    var4 = Client.aPacket1521.readUnsignedByte();
                    var5 = var4 >> 4 & 15;
                    var6 = var4 & 7;
                    var7 = Client.aPacket1521.readUnsignedByte();
                    if (var35 >= 0 && var2 >= 0 && var35 < 104 && var2 < 104) {
                        var8 = var5 + 1;
                        if (Client.playerEntity.anIntArray800[0] >= var35 - var8 && Client.playerEntity.anIntArray800[0] <= var35 + var8 && Client.playerEntity.anIntArray804[0] >= var2 - var8 && Client.playerEntity.anIntArray804[0] <= var8 + var2 && Client.anInt1699 != 0 && var6 > 0 && Client.anInt1430 < 50) {
                            Client.anIntArray1709[Client.anInt1430] = var3;
                            Client.anIntArray1713[Client.anInt1430] = var6;
                            Client.anIntArray1712[Client.anInt1430] = var7;
                            Client.audioEffects[Client.anInt1430] = null;
                            Client.anIntArray1429[Client.anInt1430] = (var2 << 8) + (var35 << 16) + var5;
                            ++Client.anInt1430;
                        }
                    }
                }

                if (Client.anInt1511 == 209) {
                    var0 = Client.aPacket1521.method840();
                    var35 = Client.aPacket1521.readUnsignedByte();
                    var2 = var35 >> 2;
                    var3 = var35 & 3;
                    var4 = Client.anIntArray1532[var2];
                    var5 = Client.aPacket1521.method822();
                    var6 = Class23.anInt153 + (var5 >> 4 & 7);
                    var7 = (var5 & 7) + Class5.anInt35;
                    if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                        if (var4 == 0) {
                            Boundary var31 = Class60.aSceneGraph631.method715(PlayerEntity.floorLevel, var6, var7);
                            if (var31 != null) {
                                var9 = var31.uid >> 14 & 32767;
                                if (var2 == 2) {
                                    var31.entity = new DynamicObject(var9, 2, var3 + 4, PlayerEntity.floorLevel, var6, var7, var0, false, var31.entity);
                                    var31.anEntity1147 = new DynamicObject(var9, 2, var3 + 1 & 3, PlayerEntity.floorLevel, var6, var7, var0, false, var31.anEntity1147);
                                } else {
                                    var31.entity = new DynamicObject(var9, var2, var3, PlayerEntity.floorLevel, var6, var7, var0, false, var31.entity);
                                }
                            }
                        }

                        if (var4 == 1) {
                            BoundaryDecor var39 = Class60.aSceneGraph631.method688(PlayerEntity.floorLevel, var6, var7);
                            if (var39 != null) {
                                var9 = var39.uid >> 14 & 32767;
                                if (var2 != 4 && var2 != 5) {
                                    if (var2 == 6) {
                                        var39.entity = new DynamicObject(var9, 4, var3 + 4, PlayerEntity.floorLevel, var6, var7, var0, false, var39.entity);
                                    } else if (var2 == 7) {
                                        var39.entity = new DynamicObject(var9, 4, (var3 + 2 & 3) + 4, PlayerEntity.floorLevel, var6, var7, var0, false, var39.entity);
                                    } else if (var2 == 8) {
                                        var39.entity = new DynamicObject(var9, 4, var3 + 4, PlayerEntity.floorLevel, var6, var7, var0, false, var39.entity);
                                        var39.anEntity1110 = new DynamicObject(var9, 4, (var3 + 2 & 3) + 4, PlayerEntity.floorLevel, var6, var7, var0, false, var39.anEntity1110);
                                    }
                                } else {
                                    var39.entity = new DynamicObject(var9, 4, var3, PlayerEntity.floorLevel, var6, var7, var0, false, var39.entity);
                                }
                            }
                        }

                        if (var4 == 2) {
                            EntityMarker var40 = Class60.aSceneGraph631.method690(PlayerEntity.floorLevel, var6, var7);
                            if (var2 == 11) {
                                var2 = 10;
                            }

                            if (var40 != null) {
                                var40.entity = new DynamicObject(var40.uid >> 14 & 32767, var2, var3, PlayerEntity.floorLevel, var6, var7, var0, false, var40.entity);
                            }
                        }

                        if (var4 == 3) {
                            TileDecor var41 = Class60.aSceneGraph631.method672(PlayerEntity.floorLevel, var6, var7);
                            if (var41 != null) {
                                var41.entity = new DynamicObject(var41.uid >> 14 & 32767, 22, var3, PlayerEntity.floorLevel, var6, var7, var0, false, var41.entity);
                            }
                        }
                    }

                } else {
                    PickableNode var32;
                    if (Client.anInt1511 == 4) {
                        var0 = Client.aPacket1521.method856();
                        var35 = Client.aPacket1521.readUnsignedByte();
                        var2 = Class23.anInt153 + (var35 >> 4 & 7);
                        var3 = (var35 & 7) + Class5.anInt35;
                        var4 = Client.aPacket1521.method849();
                        if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                            var32 = new PickableNode();
                            var32.id = var4;
                            var32.stackSize = var0;
                            if (Client.pickableNodes[PlayerEntity.floorLevel][var2][var3] == null) {
                                Client.pickableNodes[PlayerEntity.floorLevel][var2][var3] = new NodeDeque<>();
                            }

                            Client.pickableNodes[PlayerEntity.floorLevel][var2][var3].method997(var32);
                            Class22.method146(var2, var3);
                        }

                    } else if (Client.anInt1511 != 111) {
                        if (Client.anInt1511 == 165) {
                            var0 = Client.aPacket1521.readUnsignedByte();
                            var35 = Class23.anInt153 + (var0 >> 4 & 7);
                            var2 = (var0 & 7) + Class5.anInt35;
                            var3 = var35 + Client.aPacket1521.method870();
                            var4 = var2 + Client.aPacket1521.method870();
                            var5 = Client.aPacket1521.readShort();
                            var6 = Client.aPacket1521.readUnsignedShort();
                            var7 = Client.aPacket1521.readUnsignedByte() * 4;
                            var8 = Client.aPacket1521.readUnsignedByte() * 4;
                            var9 = Client.aPacket1521.readUnsignedShort();
                            int var36 = Client.aPacket1521.readUnsignedShort();
                            int var37 = Client.aPacket1521.readUnsignedByte();
                            var12 = Client.aPacket1521.readUnsignedByte();
                            if (var35 >= 0 && var2 >= 0 && var35 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                                var35 = var35 * 128 + 64;
                                var2 = var2 * 128 + 64;
                                var3 = var3 * 128 + 64;
                                var4 = var4 * 128 + 64;
                                Projectile var34 = new Projectile(var6, PlayerEntity.floorLevel, var35, var2, Class25.method175(var35, var2, PlayerEntity.floorLevel) - var7, Client.engineCycle + var9, var36 + Client.engineCycle, var37, var12, var5, var8);
                                var34.method341(var3, var4, Class25.method175(var3, var4, PlayerEntity.floorLevel) - var8, Client.engineCycle + var9);
                                Client.projectiles.method997(var34);
                            }

                        }
                    } else {
                        var0 = Client.aPacket1521.method818();
                        var35 = (var0 >> 4 & 7) + Class23.anInt153;
                        var2 = Class5.anInt35 + (var0 & 7);
                        var3 = Client.aPacket1521.method849();
                        if (var35 >= 0 && var2 >= 0 && var35 < 104 && var2 < 104) {
                            NodeDeque var33 = Client.pickableNodes[PlayerEntity.floorLevel][var35][var2];
                            if (var33 != null) {
                                for (var32 = (PickableNode) var33.method995(); var32 != null; var32 = (PickableNode) var33.next()) {
                                    if ((var3 & 32767) == var32.id) {
                                        var32.unlink();
                                        break;
                                    }
                                }

                                if (var33.method995() == null) {
                                    Client.pickableNodes[PlayerEntity.floorLevel][var35][var2] = null;
                                }

                                Class22.method146(var35, var2);
                            }
                        }

                    }
                }
            }
        }
    }

    void method109(int var1, int var2, int var3) {
        if (this.aSprite105 != null) {
            if (this.anInt99 * 64 == var3) {
                this.aSprite105.method1242(var1, var2);
            } else {
                this.aSprite105.method1234(var1, var2, var3, var3);
            }

        }
    }

    void method115(int var1, int var2, int var3, int var4, Class6 var5) {
        for (int var6 = var1; var6 < var3 + var1; ++var6) {
            label55:
            for (int var7 = var2; var7 < var4 + var2; ++var7) {
                SceneOffset var8 = new SceneOffset(0, var6, var7);

                for (int var9 = 0; var9 < var5.anInt48; ++var9) {
                    MapTile[] var10 = var5.mapTiles[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {

                        for (int var12 = 0; var12 < var10.length; ++var12) {
                            MapTile var13 = var10[var12];
                            Node_Sub21_Sub15 var14 = this.method105(var13.z);
                            if (var14 != null) {
                                SceneOffset var15 = new SceneOffset(var9, var6 + this.anInt107 * 64, this.anInt108 * 64 + var7);
                                SceneOffset var16 = null;
                                if (this.aClass6_Sub2_109 != null) {
                                    var16 = new SceneOffset(var9 + this.aClass6_Sub2_109.anInt45, this.aClass6_Sub2_109.anInt40 * 64 + var6, this.aClass6_Sub2_109.anInt49 * 64 + var7);
                                } else {
                                    Class6_Sub1 var17 = (Class6_Sub1) var5;
                                    var16 = new SceneOffset(var17.anInt45 + var9, var17.anInt40 * 64 + var6 + var17.method161() * 8, var7 + var17.anInt49 * 64 + var17.method160() * 8);
                                }

                                Class24 var18 = new Class24(var14.anInt327, var16, var15, this.method84(var14));
                                this.aHashMap104.put(var8, var18);
                                continue label55;
                            }
                        }
                    }
                }
            }
        }

    }

    void method119(List var1) {
        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            Class74 var3 = (Class74) var2.next();
            if (this.anInt107 == var3.aSceneOffset_743.x >> 6 && var3.aSceneOffset_743.y >> 6 == this.anInt108) {
                Class24 var4 = new Class24(var3.anInt742, var3.aSceneOffset_743, var3.aSceneOffset_743, this.method88(var3.anInt742));
                this.aList106.add(var4);
            }
        }

    }

    boolean method124(int var1, Class9 var2, Class13[] var3, CompressedImage[] var4) {
        if (!this.method107(var1)) {
            return false;
        }
        if (this.aClass6_Sub2_109 == null && this.aLinkedList103.isEmpty()) {
            return false;
        }
        this.method114(var3);
        this.aSprite105.method335();
        if (this.aClass6_Sub2_109 != null) {
            this.method111(var2, var3, var4);
        } else {
            this.method106(var2, var4);
        }

        return true;
    }

    void method97(int var1, int var2, int var3, HashSet var4) {
        if (var4 == null) {
            var4 = new HashSet();
        }

        this.method117(var1, var2, var4, var3);
        this.method98(var1, var2, var4, var3);
    }

    void method89(HashSet var1, int var2, int var3) {
        Iterator var4 = this.aHashMap104.values().iterator();

        while (var4.hasNext()) {
            Class24 var5 = (Class24) var4.next();
            if (var1.contains(var5.anInt160)) {
                Node_Sub21_Sub15 var6 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var5.anInt160];
                this.method120(var6, var5.anInt165, var5.anInt164, var2, var3);
            }
        }

        this.method116(var1, var2, var3);
    }

    void method87(int var1, int var2, Class6 var3, CompressedImage[] var4) {
        for (int var5 = 0; var5 < var3.anInt48; ++var5) {
            MapTile[] var6 = var3.mapTiles[var5][var1][var2];
            if (var6 != null && var6.length != 0) {

                for (int var8 = 0; var8 < var6.length; ++var8) {
                    MapTile var9 = var6[var8];
                    int var10 = var9.x;
                    boolean var11 = var10 >= Class163.aClass163_1967.anInt1960 && var10 <= Class163.aClass163_1962.anInt1960;
                    if (!var11) {
                        int var12 = var9.x;
                        boolean var13 = var12 == Class163.aClass163_1982.anInt1960;
                        if (!var13) {
                            continue;
                        }
                    }

                    ObjectDefinition var14 = Class5.method17(var9.z);
                    if (var14.anInt1257 != -1) {
                        if (var14.anInt1257 != 46 && var14.anInt1257 != 52) {
                            var4[var14.anInt1257].method1156(this.anInt99 * var1, this.anInt99 * (63 - var2), this.anInt99 * 2, this.anInt99 * 2);
                        } else {
                            var4[var14.anInt1257].method1156(var1 * this.anInt99, this.anInt99 * (63 - var2), this.anInt99 * 2 + 1, this.anInt99 * 2 + 1);
                        }
                    }
                }
            }
        }

    }

    void method111(Class9 var1, Class13[] var2, CompressedImage[] var3) {
        int var4;
        int var5;
        for (var4 = 0; var4 < 64; ++var4) {
            for (var5 = 0; var5 < 64; ++var5) {
                this.method95(var4, var5, this.aClass6_Sub2_109, var1);
                this.method118(var4, var5, this.aClass6_Sub2_109, var1);
            }
        }

        for (var4 = 0; var4 < 64; ++var4) {
            for (var5 = 0; var5 < 64; ++var5) {
                this.method86(var4, var5, this.aClass6_Sub2_109, var1, var3);
            }
        }

    }

    void method116(HashSet var1, int var2, int var3) {
        Iterator var4 = this.aList106.iterator();

        while (var4.hasNext()) {
            Class24 var5 = (Class24) var4.next();
            Node_Sub21_Sub15 var6 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var5.anInt160];
            if (var6 != null && var1.contains(var6.method1118())) {
                this.method120(var6, var5.anInt165, var5.anInt164, var2, var3);
            }
        }

    }

    void method118(int var1, int var2, Class6 var3, Class9 var4) {
        for (int var5 = 1; var5 < var3.anInt48; ++var5) {
            int var6 = var3.aShortArrayArrayArray46[var5][var1][var2] - 1;
            if (var6 > -1) {
                int var7 = Class60.method367(var6, this.anInt101);
                if (var3.aByteArrayArrayArray44[var5][var1][var2] == 0) {
                    DrawingArea.method1223(var1 * this.anInt99, (63 - var2) * this.anInt99, this.anInt99, this.anInt99, var7);
                } else {
                    var4.method53(var1 * this.anInt99, this.anInt99 * (63 - var2), 0, var7, this.anInt99, this.anInt99, var3.aByteArrayArrayArray44[var5][var1][var2], var3.aByteArrayArrayArray41[var5][var1][var2]);
                }
            }
        }

    }

    boolean method114(Class13[] var1) {
        if (this.anIntArrayArray98 != null) {
            return false;
        }
        Class18 var2 = new Class18(64, 64);
        if (this.aClass6_Sub2_109 != null) {
            this.method101(0, 0, 64, 64, this.aClass6_Sub2_109, var2);
        } else {
            Iterator var3 = this.aLinkedList103.iterator();

            while (var3.hasNext()) {
                Class6_Sub1 var4 = (Class6_Sub1) var3.next();
                this.method101(var4.method164() * 8, var4.method165() * 8, 8, 8, var4, var2);
            }
        }

        this.method113(var1, var2);
        this.method99(var2);
        return true;
    }

    void method113(Class13[] var1, Class18 var2) {

        for (int var6 = 0; var6 < new Class148[]{Class148.aClass148_1825, Class148.aClass148_1818, Class148.aClass148_1821, Class148.aClass148_1816, Class148.aClass148_1822, Class148.aClass148_1819, Class148.aClass148_1824, Class148.aClass148_1823}.length; ++var6) {
            Class148 var7 = new Class148[]{Class148.aClass148_1825, Class148.aClass148_1818, Class148.aClass148_1821, Class148.aClass148_1816, Class148.aClass148_1822, Class148.aClass148_1819, Class148.aClass148_1824, Class148.aClass148_1823}[var6];
            if (var1[var7.ordinal()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch (var7.anInt1820) {
                    case 0:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 2:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                }

                this.method90(var12, var13, var8, var9, var10, var11, var1[var7.ordinal()], var2);
            }
        }

    }

    void method101(int var1, int var2, int var3, int var4, Class6 var5, Class18 var6) {
        for (int var7 = var1; var7 < var1 + var3; ++var7) {
            for (int var8 = var2; var8 < var2 + var4; ++var8) {
                int var9 = var5.aShortArrayArrayArray47[0][var7][var8] - 1;
                if (var9 != -1) {
                    Node_Sub21_Sub24 var10 = ClientPreferences.method293(var9);
                    var6.method136(var7, var8, 5, var10);
                }
            }
        }

    }

    int method121(int var1, int var2, Class6 var3) {
        return var3.aShortArrayArrayArray47[0][var1][var2] == 0 ? this.anInt101 : this.anIntArrayArray98[var1][var2];
    }

    void method99(Class18 var1) {
        this.anIntArrayArray98 = new int[64][64];

        for (int var2 = 0; var2 < 64; ++var2) {
            for (int var3 = 0; var3 < 64; ++var3) {
                this.anIntArrayArray98[var2][var3] = var1.method140(var2, var3) | -16777216;
            }
        }

    }

    void method123(int var1, int var2, Class6 var3) {
        for (int var4 = 0; var4 < var3.anInt48; ++var4) {
            MapTile[] var5 = var3.mapTiles[var4][var1][var2];
            if (var5 != null && var5.length != 0) {

                for (int var7 = 0; var7 < var5.length; ++var7) {
                    MapTile var8 = var5[var7];
                    if (IsaacCipher.method795(var8.x)) {
                        ObjectDefinition var9 = Class5.method17(var8.z);
                        int var10 = var9.anInt219 != 0 ? -3407872 : -3355444;
                        if (Class163.aClass163_1975.anInt1960 == var8.x) {
                            this.method94(var1, var2, var8.y, var10);
                        }

                        if (var8.x == Class163.aClass163_1963.anInt1960) {
                            this.method94(var1, var2, var8.y, -3355444);
                            this.method94(var1, var2, var8.y + 1, var10);
                        }

                        if (Class163.aClass163_1979.anInt1960 == var8.x) {
                            if (var8.y == 0) {
                                DrawingArea.drawHLine(var1 * this.anInt99, this.anInt99 * (63 - var2), 1, var10);
                            }

                            if (var8.y == 1) {
                                DrawingArea.drawHLine(this.anInt99 + this.anInt99 * var1 - 1, (63 - var2) * this.anInt99, 1, var10);
                            }

                            if (var8.y == 2) {
                                DrawingArea.drawHLine(this.anInt99 * var1 + this.anInt99 - 1, this.anInt99 * (63 - var2) + this.anInt99 - 1, 1, var10);
                            }

                            if (var8.y == 3) {
                                DrawingArea.drawHLine(this.anInt99 * var1, this.anInt99 + (63 - var2) * this.anInt99 - 1, 1, var10);
                            }
                        }

                        if (var8.x == Class163.aClass163_1981.anInt1960) {
                            int var11 = var8.y % 2;
                            int var12;
                            if (var11 == 0) {
                                for (var12 = 0; var12 < this.anInt99; ++var12) {
                                    DrawingArea.drawHLine(var1 * this.anInt99 + var12, (64 - var2) * this.anInt99 - 1 - var12, 1, var10);
                                }
                            } else {
                                for (var12 = 0; var12 < this.anInt99; ++var12) {
                                    DrawingArea.drawHLine(var1 * this.anInt99 + var12, var12 + (63 - var2) * this.anInt99, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    void method117(int var1, int var2, HashSet var3, int var4) {
        float var5 = (float) var4 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.aHashMap104.entrySet().iterator();

        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            SceneOffset var9 = (SceneOffset) var8.getKey();
            int var10 = (int) (var5 * (float) var9.x + (float) var1 - var6);
            int var11 = (int) ((float) (var4 + var2) - var5 * (float) var9.y - var6);
            Class24 var12 = (Class24) var8.getValue();
            if (var12 != null) {
                var12.anInt165 = var10;
                var12.anInt164 = var11;
                Node_Sub21_Sub15 var13 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var12.anInt160];
                if (!var3.contains(var13.method1118())) {
                    this.method93(var12, var10, var11, var5);
                }
            }
        }

    }

    void method92(HashSet var1, List var2) {
        this.aHashMap104.clear();
        Iterator var3 = var1.iterator();

        while (var3.hasNext()) {
            Class6_Sub1 var4 = (Class6_Sub1) var3.next();
            if (var4.method25() == this.anInt107 && var4.method21() == this.anInt108) {
                this.aLinkedList103.add(var4);
                this.method115(var4.method164() * 8, var4.method165() * 8, 8, 8, var4);
            }
        }

        this.method119(var2);
    }

    Class2 method84(Node_Sub21_Sub15 var1) {
        if (var1.aString2091 != null && this.aHashMap97 != null && this.aHashMap97.get(Class77.aClass77_827) != null) {
            Class77 var2 = Class77.method465(var1.anInt214);
            if (var2 == null) {
                return null;
            }
            Font var3 = (Font) this.aHashMap97.get(var2);
            if (var3 == null) {
                return null;
            }
            int var4 = var3.method1168(var1.aString2091, 1000000);
            String[] var5 = new String[var4];
            var3.method1181(var1.aString2091, null, var5);
            int var6 = var5.length * var3.anInt221 / 2;
            int var7 = 0;

            for (int var9 = 0; var9 < var5.length; ++var9) {
                String var10 = var5[var9];
                int var11 = var3.getTextWidth(var10);
                if (var11 > var7) {
                    var7 = var11;
                }
            }

            return new Class2(var1.aString2091, var7, var6, var2);
        }
        return null;
    }

    void method93(Class24 var1, int var2, int var3, float var4) {
        Node_Sub21_Sub15 var5 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var1.anInt160];
        this.method91(var5, var2, var3);
        this.method108(var1, var5, var2, var3, var4);
    }

    int method102(Sprite var1, Class167 var2) {
        switch (var2.anInt820) {
            case 0:
                return -var1.width / 2;
            case 2:
                return 0;
            default:
                return -var1.width;
        }
    }

    int method112(Sprite var1, Class166 var2) {
        switch (var2.anInt820) {
            case 0:
                return -var1.height / 2;
            case 2:
                return 0;
            default:
                return -var1.height;
        }
    }

    Node_Sub21_Sub15 method105(int var1) {
        ObjectDefinition var2 = Class5.method17(var1);
        if (var2.transformIds != null) {
            var2 = var2.method1073();
            if (var2 == null) {
                return null;
            }
        }

        return var2.mapFunction != -1 ? Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var2.mapFunction] : null;
    }

    Class2 method88(int var1) {
        Node_Sub21_Sub15 var2 = Node_Sub21_Sub15.aNode_Sub21_Sub15Array2093[var1];
        return this.method84(var2);
    }

    void method120(Node_Sub21_Sub15 var1, int var2, int var3, int var4, int var5) {
        Sprite var6 = var1.method1117(false);
        if (var6 != null) {
            var6.method1230(var2 - var6.width / 2, var3 - var6.height / 2);
            if (var4 % var5 < var5 / 2) {
                DrawingArea.method1221(var2, var3, 15, 16776960, 128);
                DrawingArea.method1221(var2, var3, 7, 16777215, 256);
            }

        }
    }

    List method96() {
        java.util.LinkedList var1 = new java.util.LinkedList();
        var1.addAll(this.aList106);
        var1.addAll(this.aHashMap104.values());
        return var1;
    }

    List method122(int var1, int var2, int var3, int var4, int var5) {
        java.util.LinkedList var6 = new java.util.LinkedList();
        if (var4 >= var1 && var5 >= var2) {
            if (var4 < var1 + var3 && var5 < var2 + var3) {
                Iterator var7 = this.aHashMap104.values().iterator();

                Class24 var8;
                while (var7.hasNext()) {
                    var8 = (Class24) var7.next();
                    if (var8.method154(var4, var5)) {
                        var6.add(var8);
                    }
                }

                var7 = this.aList106.iterator();

                while (var7.hasNext()) {
                    var8 = (Class24) var7.next();
                    if (var8.method154(var4, var5)) {
                        var6.add(var8);
                    }
                }

                return var6;
            }
            return var6;
        }
        return var6;
    }

    int method110(int var1, int var2) {
        if (this.aClass6_Sub2_109 != null) {
            return this.aClass6_Sub2_109.method20(var1, var2);
        }
        if (!this.aLinkedList103.isEmpty()) {
            Iterator var3 = this.aLinkedList103.iterator();

            while (var3.hasNext()) {
                Class6_Sub1 var4 = (Class6_Sub1) var3.next();
                if (var4.method166(var1, var2)) {
                    return var4.method20(var1, var2);
                }
            }
        }

        return -1;
    }

    void method94(int var1, int var2, int var3, int var4) {
        var3 %= 4;
        if (var3 == 0) {
            DrawingArea.drawVLine(this.anInt99 * var1, (63 - var2) * this.anInt99, this.anInt99, var4);
        }

        if (var3 == 1) {
            DrawingArea.drawHLine(var1 * this.anInt99, (63 - var2) * this.anInt99, this.anInt99, var4);
        }

        if (var3 == 2) {
            DrawingArea.drawVLine(this.anInt99 + this.anInt99 * var1 - 1, this.anInt99 * (63 - var2), this.anInt99, var4);
        }

        if (var3 == 3) {
            DrawingArea.drawHLine(this.anInt99 * var1, (63 - var2) * this.anInt99 + this.anInt99 - 1, this.anInt99, var4);
        }

    }

    void method85(int x, int y, Class6 var3) {
        A_SCENE_OFFSET___100.set(0, x, y);

        for (int var4 = 0; var4 < var3.anInt48; ++var4) {
            MapTile[] var5 = var3.mapTiles[var4][x][y];
            if (var5 != null && var5.length != 0) {

                for (int var7 = 0; var7 < var5.length; ++var7) {
                    MapTile var8 = var5[var7];
                    Node_Sub21_Sub15 var9 = this.method105(var8.z);
                    if (var9 != null) {
                        Class24 var10 = (Class24) this.aHashMap104.get(A_SCENE_OFFSET___100);
                        if (var10 != null) {
                            if (var10.anInt160 != var9.anInt327) {
                                Class24 var16 = new Class24(var9.anInt327, var10.aSceneOffset_162, var10.aSceneOffset_167, this.method84(var9));
                                this.aHashMap104.put(new SceneOffset(A_SCENE_OFFSET___100), var16);
                                var10 = var16;
                            }

                            int var12 = var10.aSceneOffset_162.z - var10.aSceneOffset_167.z;
                            var10.aSceneOffset_167.z = var4;
                            var10.aSceneOffset_162.z = var12 + var4;
                            return;
                        }

                        SceneOffset var11 = new SceneOffset(var4, this.anInt107 * 64 + x, y + this.anInt108 * 64);
                        SceneOffset var13 = null;
                        if (this.aClass6_Sub2_109 != null) {
                            var13 = new SceneOffset(this.aClass6_Sub2_109.anInt45 + var4, this.aClass6_Sub2_109.anInt40 * 64 + x, y + this.aClass6_Sub2_109.anInt49 * 64);
                        } else {
                            Iterator var14 = this.aLinkedList103.iterator();

                            while (var14.hasNext()) {
                                Class6_Sub1 var15 = (Class6_Sub1) var14.next();
                                if (var15.method166(x, y)) {
                                    var13 = new SceneOffset(var15.anInt45 + var4, x + var15.anInt40 * 64 + var15.method161() * 8, var15.anInt49 * 64 + y + var15.method160() * 8);
                                    break;
                                }
                            }
                        }

                        if (var13 != null) {
                            var10 = new Class24(var9.anInt327, var13, var11, this.method84(var9));
                            this.aHashMap104.put(new SceneOffset(A_SCENE_OFFSET___100), var10);
                            return;
                        }
                    }
                }
            }
        }

        this.aHashMap104.remove(A_SCENE_OFFSET___100);
    }

    boolean method107(int var1) {
        if (this.aSprite105 != null && var1 == this.anInt99) {
            return false;
        }
        this.anInt99 = var1;
        this.aSprite105 = new Sprite(this.anInt99 * 64, this.anInt99 * 64);
        return true;
    }

    void method90(int var1, int var2, int var3, int var4, int var5, int var6, Class13 var7, Class18 var8) {
        for (int var9 = 0; var9 < var5; ++var9) {
            for (int var10 = 0; var10 < var6; ++var10) {
                int var11 = var7.method110(var1 + var9, var2 + var10);
                if (var11 != -1) {
                    Node_Sub21_Sub24 var12 = ClientPreferences.method293(var11);
                    var8.method136(var3 + var9, var10 + var4, 5, var12);
                }
            }
        }

    }

    void method86(int var1, int var2, Class6 var3, Class9 var4, CompressedImage[] var5) {
        this.method123(var1, var2, var3);
        this.method87(var1, var2, var3, var5);
    }

    void method104(Class6_Sub2 var1, List var2) {
        this.aHashMap104.clear();
        this.aClass6_Sub2_109 = var1;
        this.method115(0, 0, 64, 64, this.aClass6_Sub2_109);
        this.method119(var2);
    }

    void method108(Class24 var1, Node_Sub21_Sub15 var2, int var3, int var4, float var5) {
        if (var1.aClass2_166 != null) {
            if (var1.aClass2_166.aClass77_10.method461(var5)) {
                Font var6 = (Font) this.aHashMap97.get(var1.aClass2_166.aClass77_10);
                var6.method1184(var1.aClass2_166.aString7, var3 - var1.aClass2_166.anInt14 / 2, var4, var1.aClass2_166.anInt14, var1.aClass2_166.anInt11, -16777216 | var2.anInt217, 0, 1, 0, var6.anInt221 / 2);
            }
        }
    }

    void method91(Node_Sub21_Sub15 var1, int var2, int var3) {
        Sprite var4 = var1.method1117(false);
        if (var4 != null) {
            int var5 = this.method102(var4, var1.aClass167_2096);
            int var6 = this.method112(var4, var1.aClass166_2092);
            var4.method1230(var5 + var2, var3 + var6);
        }

    }

    void method100() {
        if (this.aClass6_Sub2_109 != null) {
            for (int var1 = 0; var1 < 64; ++var1) {
                for (int var2 = 0; var2 < 64; ++var2) {
                    this.method85(var1, var2, this.aClass6_Sub2_109);
                }
            }
        } else {
            Iterator var3 = this.aLinkedList103.iterator();

            while (var3.hasNext()) {
                Class6_Sub1 var4 = (Class6_Sub1) var3.next();

                for (int var5 = var4.method164() * 8; var5 < var4.method164() * 8 + 8; ++var5) {
                    for (int var6 = var4.method165() * 8; var6 < var4.method165() * 8 + 8; ++var6) {
                        this.method85(var5, var6, var4);
                    }
                }
            }
        }

    }

    void method106(Class9 var1, CompressedImage[] var2) {
        Iterator var3 = this.aLinkedList103.iterator();

        Class6_Sub1 var4;
        int var5;
        int var6;
        while (var3.hasNext()) {
            var4 = (Class6_Sub1) var3.next();

            for (var5 = var4.method164() * 8; var5 < var4.method164() * 8 + 8; ++var5) {
                for (var6 = var4.method165() * 8; var6 < var4.method165() * 8 + 8; ++var6) {
                    this.method95(var5, var6, var4, var1);
                    this.method118(var5, var6, var4, var1);
                }
            }
        }

        var3 = this.aLinkedList103.iterator();

        while (var3.hasNext()) {
            var4 = (Class6_Sub1) var3.next();

            for (var5 = var4.method164() * 8; var5 < var4.method164() * 8 + 8; ++var5) {
                for (var6 = var4.method165() * 8; var6 < var4.method165() * 8 + 8; ++var6) {
                    this.method86(var5, var6, var4, var1, var2);
                }
            }
        }

    }

    void method95(int var1, int var2, Class6 var3, Class9 var4) {
        int var5 = var3.aShortArrayArrayArray47[0][var1][var2] - 1;
        int var6 = var3.aShortArrayArrayArray46[0][var1][var2] - 1;
        if (var5 == -1 && var6 == -1) {
            DrawingArea.method1223(this.anInt99 * var1, (63 - var2) * this.anInt99, this.anInt99, this.anInt99, this.anInt101);
        }

        int var7 = 16711935;
        if (var6 != -1) {
            var7 = Class60.method367(var6, this.anInt101);
        }

        if (var6 > -1 && var3.aByteArrayArrayArray44[0][var1][var2] == 0) {
            DrawingArea.method1223(this.anInt99 * var1, (63 - var2) * this.anInt99, this.anInt99, this.anInt99, var7);
        } else {
            int var8 = this.method121(var1, var2, var3);
            if (var6 == -1) {
                DrawingArea.method1223(var1 * this.anInt99, (63 - var2) * this.anInt99, this.anInt99, this.anInt99, var8);
            } else {
                var4.method53(var1 * this.anInt99, (63 - var2) * this.anInt99, var8, var7, this.anInt99, this.anInt99, var3.aByteArrayArrayArray44[0][var1][var2], var3.aByteArrayArrayArray41[0][var1][var2]);
            }
        }
    }

    void method98(int var1, int var2, HashSet var3, int var4) {
        float var5 = (float) var4 / 64.0F;
        Iterator var6 = this.aList106.iterator();

        while (var6.hasNext()) {
            Class24 var7 = (Class24) var6.next();
            int var8 = var7.aSceneOffset_167.x % 64;
            int var9 = var7.aSceneOffset_167.y % 64;
            var7.anInt165 = (int) (var5 * (float) var8 + (float) var1);
            var7.anInt164 = (int) ((float) var2 + var5 * (float) (63 - var9));
            if (!var3.contains(var7.anInt160)) {
                this.method93(var7, var7.anInt165, var7.anInt164, var5);
            }
        }

    }
}
