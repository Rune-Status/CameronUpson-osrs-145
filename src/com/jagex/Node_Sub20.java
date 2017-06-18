package com.jagex;

public class Node_Sub20 extends Node {
    int anInt235;
    Node_Sub18 aNode_Sub18_1772;
    Class138 aClass138_1774;
    int anInt327;
    Node_Sub11_Sub1 aNode_Sub11_Sub1_1771;
    int anInt221;
    int anInt220;
    int anInt217;
    int anInt214;
    int anInt226;
    Node_Sub10_Sub2 aNode_Sub10_Sub2_1773;
    int anInt225;
    int anInt212;
    int anInt668;
    int anInt228;
    int anInt230;
    int anInt222;
    int anInt919;
    int anInt981;
    int anInt328;
    int anInt204;

    static int method972(int var0, RuneScript var1, boolean var2) {
        if (var0 == 3600) {
            if (Client.wrongnamelol == 0) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = -2;
            } else if (Client.wrongnamelol == 1) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.friendCount;
            }

            return 1;
        }
        int var3;
        if (var0 == 3601) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            if (Client.wrongnamelol == 2 && var3 < Client.friendCount) {
                Class63.aStringArray640[++Class77.anInt828 - 1] = Client.befriendedPlayers[var3].name;
                Class63.aStringArray640[++Class77.anInt828 - 1] = Client.befriendedPlayers[var3].aString203;
            } else {
                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
            }

            return 1;
        }
        if (var0 == 3602) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            if (Client.wrongnamelol == 2 && var3 < Client.friendCount) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.befriendedPlayers[var3].world;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
            }

            return 1;
        }
        if (var0 == 3603) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            if (Client.wrongnamelol == 2 && var3 < Client.friendCount) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.befriendedPlayers[var3].anInt199;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
            }

            return 1;
        }
        String var4;
        if (var0 == 3604) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            int var5 = Class63.anIntArray645[--Class63.anInt644];
            Class123.method813(var4, var5);
            return 1;
        }
        int var7;
        BefriendedPlayer var8;
        String var10;
        String var14;
        String var16;
        if (var0 == 3605) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            if (var4 != null) {
                if ((Client.friendCount < 200 || Client.anInt1593 == 1) && Client.friendCount < 400) {
                    var14 = Class84.method484(var4, Class2.aClass188_13);
                    if (var14 != null) {
                        var7 = 0;

                        while (true) {
                            if (var7 >= Client.friendCount) {
                                for (var7 = 0; var7 < Client.ignoredPlayerCount; ++var7) {
                                    IgnoredPlayer var15 = Client.ignoredPlayers[var7];
                                    var16 = Class84.method484(var15.name, Class2.aClass188_13);
                                    if (var16 != null && var16.equals(var14)) {
                                        Class78.addChatMessage(30, "", "Please remove " + var4 + " from your ignore list first");
                                        return 1;
                                    }

                                    if (var15.aString243 != null) {
                                        var10 = Class84.method484(var15.aString243, Class2.aClass188_13);
                                        if (var10 != null && var10.equals(var14)) {
                                            Class78.addChatMessage(30, "", "Please remove " + var4 + " from your ignore list first");
                                            return 1;
                                        }
                                    }
                                }

                                if (Class84.method484(Client.player.name, Class2.aClass188_13).equals(var14)) {
                                    Class78.addChatMessage(30, "", "You can't insert yourself to your own friend list");
                                } else {
                                    Client.packet.writeHeader(186);
                                    Client.packet.method451(BefriendedPlayer.method179(var4));
                                    Client.packet.method865(var4);
                                }
                                break;
                            }

                            var8 = Client.befriendedPlayers[var7];
                            var16 = Class84.method484(var8.name, Class2.aClass188_13);
                            if (var16 != null && var16.equals(var14)) {
                                Class78.addChatMessage(30, "", var4 + " is already on your friend list");
                                break;
                            }

                            if (var8.aString203 != null) {
                                var10 = Class84.method484(var8.aString203, Class2.aClass188_13);
                                if (var10 != null && var10.equals(var14)) {
                                    Class78.addChatMessage(30, "", var4 + " is already on your friend list");
                                    break;
                                }
                            }

                            ++var7;
                        }
                    }
                } else {
                    Class78.addChatMessage(30, "", "Your friend list is full. Max of 200 for free users, and 400 for members");
                }
            }

            return 1;
        }
        if (var0 == 3606) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            if (var4 != null) {
                var14 = Class84.method484(var4, Class2.aClass188_13);
                if (var14 != null) {
                    for (var7 = 0; var7 < Client.friendCount; ++var7) {
                        var8 = Client.befriendedPlayers[var7];
                        var16 = var8.name;
                        var10 = Class84.method484(var16, Class2.aClass188_13);
                        if (Class170.method1152(var4, var14, var16, var10)) {
                            --Client.friendCount;

                            for (int var11 = var7; var11 < Client.friendCount; ++var11) {
                                Client.befriendedPlayers[var11] = Client.befriendedPlayers[var11 + 1];
                            }

                            Client.anInt1660 = Client.anInt1644;
                            Client.packet.writeHeader(22);
                            Client.packet.method451(BefriendedPlayer.method179(var4));
                            Client.packet.method865(var4);
                            break;
                        }
                    }
                }
            }

            return 1;
        }
        if (var0 == 3607) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            Class90.method585(var4, false);
            return 1;
        }
        if (var0 == 3608) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            Varps.method1045(var4);
            return 1;
        }
        if (var0 == 3609) {
            var4 = Class63.aStringArray640[--Class77.anInt828];

            for (int var13 = 0; var13 < new Class158[]{Class158.aClass158_1849, Class158.aClass158_1855, Class158.aClass158_1845, Class158.aClass158_1853, Class158.aClass158_1848, Class158.aClass158_1851}.length; ++var13) {
                Class158 var9 = new Class158[]{Class158.aClass158_1849, Class158.aClass158_1855, Class158.aClass158_1845, Class158.aClass158_1853, Class158.aClass158_1848, Class158.aClass158_1851}[var13];
                if (var9.anInt1852 != -1 && var4.startsWith(Canvas.method187(var9.anInt1852))) {
                    var4 = var4.substring(Integer.toString(var9.anInt1852).length() + 6);
                    break;
                }
            }

            Class63.anIntArray645[++Class63.anInt644 - 1] = Class112.method771(var4, false) ? 1 : 0;
            return 1;
        }
        if (var0 == 3611) {
            if (Client.clanChatOwner != null) {
                Class63.aStringArray640[++Class77.anInt828 - 1] = Class64.method380(Client.clanChatOwner);
            } else {
                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
            }

            return 1;
        }
        if (var0 == 3612) {
            if (Client.clanChatOwner != null) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = GrandExchangeOffer.anInt738;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
            }

            return 1;
        }
        if (var0 == 3613) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            if (Client.clanChatOwner != null && var3 < GrandExchangeOffer.anInt738) {
                Class63.aStringArray640[++Class77.anInt828 - 1] = Class126.aClanMateArray1370[var3].aString227;
            } else {
                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
            }

            return 1;
        }
        if (var0 == 3614) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            if (Client.clanChatOwner != null && var3 < GrandExchangeOffer.anInt738) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Class126.aClanMateArray1370[var3].world;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
            }

            return 1;
        }
        if (var0 == 3615) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            if (Client.clanChatOwner != null && var3 < GrandExchangeOffer.anInt738) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Class126.aClanMateArray1370[var3].rank;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
            }

            return 1;
        }
        if (var0 == 3616) {
            Class63.anIntArray645[++Class63.anInt644 - 1] = Class6_Sub2.aByte826;
            return 1;
        }
        if (var0 == 3617) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            Client.method894(var4);
            return 1;
        }
        if (var0 == 3618) {
            Class63.anIntArray645[++Class63.anInt644 - 1] = Client.aByte1826;
            return 1;
        }
        if (var0 == 3619) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            HealthBar.method344(var4);
            return 1;
        }
        if (var0 == 3620) {
            Node_Sub21_Sub1.method183();
            return 1;
        }
        if (var0 == 3621) {
            if (Client.wrongnamelol == 0) {
                Class63.anIntArray645[++Class63.anInt644 - 1] = -1;
            } else {
                Class63.anIntArray645[++Class63.anInt644 - 1] = Client.ignoredPlayerCount;
            }

            return 1;
        }
        if (var0 == 3622) {
            var3 = Class63.anIntArray645[--Class63.anInt644];
            if (Client.wrongnamelol != 0 && var3 < Client.ignoredPlayerCount) {
                Class63.aStringArray640[++Class77.anInt828 - 1] = Client.ignoredPlayers[var3].name;
                Class63.aStringArray640[++Class77.anInt828 - 1] = Client.ignoredPlayers[var3].aString243;
            } else {
                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                Class63.aStringArray640[++Class77.anInt828 - 1] = "";
            }

            return 1;
        }
        if (var0 == 3623) {
            var4 = Class63.aStringArray640[--Class77.anInt828];
            if (var4.startsWith(Canvas.method187(0)) || var4.startsWith(Canvas.method187(1))) {
                var4 = var4.substring(7);
            }

            Class63.anIntArray645[++Class63.anInt644 - 1] = Class61.method372(var4) ? 1 : 0;
            return 1;
        }
        if (var0 != 3624) {
            if (var0 == 3625) {
                if (Client.clanChatName != null) {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = Class64.method380(Client.clanChatName);
                } else {
                    Class63.aStringArray640[++Class77.anInt828 - 1] = "";
                }

                return 1;
            }
            return 2;
        }
        var3 = Class63.anIntArray645[--Class63.anInt644];
        if (Class126.aClanMateArray1370 != null && var3 < GrandExchangeOffer.anInt738 && Class126.aClanMateArray1370[var3].aString227.equalsIgnoreCase(Client.player.name)) {
            Class63.anIntArray645[++Class63.anInt644 - 1] = 1;
        } else {
            Class63.anIntArray645[++Class63.anInt644 - 1] = 0;
        }

        return 1;
    }

    public static int method970(CharSequence var0, CharSequence var1, int var2) {
        int var3 = var0.length();
        int var4 = var1.length();
        int var5 = 0;
        int var6 = 0;
        byte var7 = 0;
        byte var8 = 0;

        while (var5 - var7 < var3 || var6 - var8 < var4) {
            if (var5 - var7 >= var3) {
                return -1;
            }

            if (var6 - var8 >= var4) {
                return 1;
            }

            char var9;
            if (var7 != 0) {
                var9 = (char) var7;
                boolean var14 = false;
            } else {
                var9 = var0.charAt(var5++);
            }

            char var10;
            if (var8 != 0) {
                var10 = (char) var8;
                boolean var15 = false;
            } else {
                var10 = var1.charAt(var6++);
            }

            byte var11;
            if (var9 == 198) {
                var11 = 69;
            } else if (var9 == 230) {
                var11 = 101;
            } else if (var9 == 223) {
                var11 = 115;
            } else if (var9 == 338) {
                var11 = 69;
            } else if (var9 == 339) {
                var11 = 101;
            } else {
                var11 = 0;
            }

            var7 = var11;
            byte var12;
            if (var10 == 198) {
                var12 = 69;
            } else if (var10 == 230) {
                var12 = 101;
            } else if (var10 == 223) {
                var12 = 115;
            } else if (var10 == 338) {
                var12 = 69;
            } else if (var10 == 339) {
                var12 = 101;
            } else {
                var12 = 0;
            }

            var8 = var12;
            var9 = PendingSpawn.method276(var9, var2);
            var10 = PendingSpawn.method276(var10, var2);
            if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
                var9 = Character.toLowerCase(var9);
                var10 = Character.toLowerCase(var10);
                if (var10 != var9) {
                    return Entity.method660(var9, var2) - Entity.method660(var10, var2);
                }
            }
        }

        int var16 = Math.min(var3, var4);

        int var17;
        char var20;
        for (var17 = 0; var17 < var16; ++var17) {
            char var18 = var0.charAt(var17);
            var20 = var1.charAt(var17);
            if (var18 != var20 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
                var18 = Character.toLowerCase(var18);
                var20 = Character.toLowerCase(var20);
                if (var20 != var18) {
                    return Entity.method660(var18, var2) - Entity.method660(var20, var2);
                }
            }
        }

        var17 = var3 - var4;
        if (var17 != 0) {
            return var17;
        }
        for (int var19 = 0; var19 < var16; ++var19) {
            var20 = var0.charAt(var19);
            char var13 = var1.charAt(var19);
            if (var13 != var20) {
                return Entity.method660(var20, var2) - Entity.method660(var13, var2);
            }
        }

        return 0;
    }

    static void method971(PathingEntity var0, int var1) {
        RuntimeException_Sub1.method741(var0.strictX, var0.strictY, var1);
    }

    void method308() {
        this.aNode_Sub18_1772 = null;
        this.aNode_Sub11_Sub1_1771 = null;
        this.aClass138_1774 = null;
        this.aNode_Sub10_Sub2_1773 = null;
    }
}
