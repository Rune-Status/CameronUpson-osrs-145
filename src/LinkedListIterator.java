import java.util.Iterator;

public class LinkedListIterator<T extends Node> implements Iterator<T> {
    Node aNode1788 = null;
    LinkedList<T> list;
    Node aNode1789;

    LinkedListIterator(LinkedList<T> var1) {
        this.list = var1;
        this.aNode1789 = this.list.sentinel.next;
        this.aNode1788 = null;
    }

    public boolean hasNext() {
        return this.aNode1789 != this.list.sentinel;
    }

    public T next() {
        Node var1 = this.aNode1789;
        if (var1 == this.list.sentinel) {
            var1 = null;
            this.aNode1789 = null;
        } else {
            this.aNode1789 = var1.next;
        }

        this.aNode1788 = var1;
        return (T) var1;
    }

    public void remove() {
        if (this.aNode1788 == null) {
            throw new IllegalStateException();
        } else {
            this.aNode1788.unlink();
            this.aNode1788 = null;
        }
    }
}
