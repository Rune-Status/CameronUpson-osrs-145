package com.jagex;

public class Node_Sub21_Sub1 extends DoublyNode {
    static int anInt210;
    int anInt209;
    int anInt206;
    String aString205;
    String aString208;
    String aString207;
    int anInt204 = Client.method357();

    Node_Sub21_Sub1(int var1, String var2, String var3, String var4) {
        this.anInt209 = Client.engineCycle;
        this.anInt206 = var1;
        this.aString205 = var2;
        this.aString207 = var3;
        this.aString208 = var4;
    }

    static void method182() {
        Client.aPacket1521.method790();
        int var0 = Client.aPacket1521.method788(8);
        int var1;
        if (var0 < Client.anInt1501) {
            for (var1 = var0; var1 < Client.anInt1501; ++var1) {
                Client.anIntArray1584[++Client.anInt1580 - 1] = Client.npcIndices[var1];
            }
        }

        if (var0 > Client.anInt1501) {
            throw new RuntimeException("");
        }
        Client.anInt1501 = 0;

        for (var1 = 0; var1 < var0; ++var1) {
            int var2 = Client.npcIndices[var1];
            NpcEntity var3 = Client.npcEntities[var2];
            int var4 = Client.aPacket1521.method788(1);
            if (var4 == 0) {
                Client.npcIndices[++Client.anInt1501 - 1] = var2;
                var3.anInt769 = Client.engineCycle;
            } else {
                int var5 = Client.aPacket1521.method788(2);
                if (var5 == 0) {
                    Client.npcIndices[++Client.anInt1501 - 1] = var2;
                    var3.anInt769 = Client.engineCycle;
                    Client.anIntArray1507[++Client.anInt1508 - 1] = var2;
                } else {
                    int var6;
                    int var7;
                    if (var5 == 1) {
                        Client.npcIndices[++Client.anInt1501 - 1] = var2;
                        var3.anInt769 = Client.engineCycle;
                        var6 = Client.aPacket1521.method788(3);
                        var3.method384(var6, (byte) 1);
                        var7 = Client.aPacket1521.method788(1);
                        if (var7 == 1) {
                            Client.anIntArray1507[++Client.anInt1508 - 1] = var2;
                        }
                    } else if (var5 == 2) {
                        Client.npcIndices[++Client.anInt1501 - 1] = var2;
                        var3.anInt769 = Client.engineCycle;
                        var6 = Client.aPacket1521.method788(3);
                        var3.method384(var6, (byte) 2);
                        var7 = Client.aPacket1521.method788(3);
                        var3.method384(var7, (byte) 2);
                        int var8 = Client.aPacket1521.method788(1);
                        if (var8 == 1) {
                            Client.anIntArray1507[++Client.anInt1508 - 1] = var2;
                        }
                    } else if (var5 == 3) {
                        Client.anIntArray1584[++Client.anInt1580 - 1] = var2;
                    }
                }
            }
        }

    }

    static void method183() {
        Client.packet.writeHeader(105);
        Client.packet.method451(0);
    }

    static void method184(int var0, int var1) {
        IgnoredPlayer.method210(Node_Sub21_Sub16.aClass42_2097, var0, var1);
        Node_Sub21_Sub16.aClass42_2097 = null;
    }

    static void method181(int var0) {
        if (var0 == -3) {
            Class22.setLoginResponse("Connection timed out.", "Please try using a different world.", "");
        } else if (var0 == -2) {
            Class22.setLoginResponse("", "Error connecting to server.", "");
        } else if (var0 == -1) {
            Class22.setLoginResponse("No response from server.", "Please try using a different world.", "");
        } else if (var0 == 3) {
            Login.anInt701 = 3;
        } else if (var0 == 4) {
            Class22.setLoginResponse("Your account has been disabled.", "Please check your message-centre for details.", "");
        } else if (var0 == 5) {
            Class22.setLoginResponse("Your account has not logged out from its last", "session or the server is too busy rightSpriteId now.", "Please try again in a few minutes.");
        } else if (var0 == 6) {
            Class22.setLoginResponse("RuneScape has been updated!", "Please reload this page.", "");
        } else if (var0 == 7) {
            Class22.setLoginResponse("This world is full.", "Please use a different world.", "");
        } else if (var0 == 8) {
            Class22.setLoginResponse("Unable to connect.", "Login server offline.", "");
        } else if (var0 == 9) {
            Class22.setLoginResponse("Login limit exceeded.", "Too many connections from your address.", "");
        } else if (var0 == 10) {
            Class22.setLoginResponse("Unable to connect.", "Bad session id.", "");
        } else if (var0 == 11) {
            Class22.setLoginResponse("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
        } else if (var0 == 12) {
            Class22.setLoginResponse("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
        } else if (var0 == 13) {
            Class22.setLoginResponse("Could not complete login.", "Please try using a different world.", "");
        } else if (var0 == 14) {
            Class22.setLoginResponse("The server is being updated.", "Please wait 1 minute and try again.", "");
        } else if (var0 == 16) {
            Class22.setLoginResponse("Too many login attempts.", "Please wait a few minutes before trying again.", "");
        } else if (var0 == 17) {
            Class22.setLoginResponse("You are standing in a members-only area.", "To play on this world move to a free area first", "");
        } else if (var0 == 18) {
            Class22.setLoginResponse("Account locked as we suspect it has been stolen.", "Press 'recover a locked account' on front page.", "");
        } else if (var0 == 19) {
            Class22.setLoginResponse("This world is running a closed Beta.", "Sorry invited playerEntities only.", "Please use a different world.");
        } else if (var0 == 20) {
            Class22.setLoginResponse("Invalid loginserver requested.", "Please try using a different world.", "");
        } else if (var0 == 22) {
            Class22.setLoginResponse("Malformed login packet.", "Please try again.", "");
        } else if (var0 == 23) {
            Class22.setLoginResponse("No reply from loginserver.", "Please wait 1 minute and try again.", "");
        } else if (var0 == 24) {
            Class22.setLoginResponse("Error loading your profile.", "Please contact customer support.", "");
        } else if (var0 == 25) {
            Class22.setLoginResponse("Unexpected loginserver response.", "Please try using a different world.", "");
        } else if (var0 == 26) {
            Class22.setLoginResponse("This computers address has been blocked", "as it was used to break our rules.", "");
        } else if (var0 == 27) {
            Class22.setLoginResponse("", "Service unavailable.", "");
        } else if (var0 == 31) {
            Class22.setLoginResponse("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
        } else if (var0 == 32) {
            Class22.setLoginResponse("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
        } else if (var0 == 37) {
            Class22.setLoginResponse("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
        } else if (var0 == 38) {
            Class22.setLoginResponse("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
        } else if (var0 == 55) {
            Class22.setLoginResponse("Sorry, but your account is not eligible to", "play this version of the game.  Please try", "playing the main game instead!");
        } else {
            if (var0 == 56) {
                Class22.setLoginResponse("Enter the 6-digit code generated by your", "authenticator app.", "");
                Class45.method304(11);
                return;
            }

            if (var0 == 57) {
                Class22.setLoginResponse("The code you entered was incorrect.", "Please try again.", "");
                Class45.method304(11);
                return;
            }

            Class22.setLoginResponse("Unexpected server response", "Please try using a different world.", "");
        }

        Class45.method304(10);
    }

    static Node_Sub21_Sub1 method309(int var0) {
        return (Node_Sub21_Sub1) Class59.A_ITERABLE_NODE_TABLE___628.lookup((long) var0);
    }

    void method180(int var1, String var2, String var3, String var4) {
        this.anInt204 = Client.method357();
        this.anInt209 = Client.engineCycle;
        this.anInt206 = var1;
        this.aString205 = var2;
        this.aString207 = var3;
        this.aString208 = var4;
    }
}
