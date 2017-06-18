import java.util.Iterator;

public class Class146 implements Iterator {
    DoublyNode aDoublyNode1792;
    Class142 aClass142_1790;
    DoublyNode aDoublyNode1791 = null;

    Class146(Class142 var1) {
        this.aClass142_1790 = var1;
        this.aDoublyNode1792 = this.aClass142_1790.aDoublyNode1786.nextDoubly;
        this.aDoublyNode1791 = null;
    }

    public void remove() {
        this.aDoublyNode1791.method977();
        this.aDoublyNode1791 = null;
    }

    public boolean hasNext() {
        return this.aDoublyNode1792 != this.aClass142_1790.aDoublyNode1786;
    }

    public Object next() {
        DoublyNode var1 = this.aDoublyNode1792;
        if (var1 == this.aClass142_1790.aDoublyNode1786) {
            var1 = null;
            this.aDoublyNode1792 = null;
        } else {
            this.aDoublyNode1792 = var1.nextDoubly;
        }

        this.aDoublyNode1791 = var1;
        return var1;
    }
}
