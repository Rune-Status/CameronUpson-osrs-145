public class SceneOffset {

    public int x;
    public int z;
    public int y;

    public SceneOffset(int hash) {
        if (hash == -1) {
            this.z = -1;
        } else {
            this.z = hash >> 28 & 0x3;
            this.x = hash >> 14 & 0x3fff;
            this.y = hash & 0x3fff;
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
        this.z = -1;
    }

    public void set(int z, int x, int y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public int getHash() {
        return this.z << 28 | this.x << 14 | this.y;
    }

    boolean _equals(SceneOffset other) {
        if (other.z != this.z) {
            return false;
        } else if (other.x != this.x) {
            return false;
        } else {
            return this.y == other.y;
        }
    }

    public int hashCode() {
        return this.getHash();
    }

    public String toString() {
        return this.z + "," + (this.x >> 6) + "," + (this.y >> 6) + "," + (this.x & 63) + "," + (this.y & 63);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else {
            return other instanceof SceneOffset && this._equals((SceneOffset) other);
        }
    }
}
