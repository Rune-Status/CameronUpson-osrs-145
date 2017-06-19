package com.jagex;

public class FriendLogin extends Linkable {

    String name;
    short world;
    int time = (int) (GzipDecompresser.currentTime() / 1000L);

    FriendLogin(String var1, int var2) {
        this.name = var1;
        this.world = (short) var2;
    }

}
