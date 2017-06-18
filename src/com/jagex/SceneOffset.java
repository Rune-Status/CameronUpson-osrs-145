package com.jagex;

public class SceneOffset {

    public int x;
    public int z;
    public int y;

    public SceneOffset(int hash) {
        if (hash == -1) {
            z = -1;
        } else {
            z = hash >> 28 & 0x3;
            x = hash >> 14 & 0x3fff;
            y = hash & 0x3fff;
        }

    }

    public SceneOffset(int z, int x, int y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public SceneOffset(SceneOffset other) {
        this.z = other.z;
        this.x = other.x;
        this.y = other.y;
    }

    public SceneOffset() {
        z = -1;
    }

    public void set(int z, int x, int y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public int getHash() {
        return z << 28 | x << 14 | y;
    }

    boolean _equals(SceneOffset other) {
        return other.z == z && other.x == x && y == other.y;
    }

    public int hashCode() {
        return this.getHash();
    }

    public String toString() {
        return z + "," + (x >> 6) + "," + (y >> 6) + "," + (x & 63) + "," + (y & 63);
    }

    public boolean equals(Object other) {
        return other == this || other instanceof SceneOffset && this._equals((SceneOffset) other);
    }
}
