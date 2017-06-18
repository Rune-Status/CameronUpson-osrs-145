public class DoublyNode extends Node {
    public DoublyNode previousDoubly;
    public DoublyNode nextDoubly;

    public void method977() {
        if (this.previousDoubly != null) {
            this.previousDoubly.nextDoubly = this.nextDoubly;
            this.nextDoubly.previousDoubly = this.previousDoubly;
            this.nextDoubly = null;
            this.previousDoubly = null;
        }
    }
}
