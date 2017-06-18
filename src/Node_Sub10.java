public abstract class Node_Sub10 extends Node {
    int anInt222;
    volatile boolean aBoolean845 = true;
    Node_Sub11 aNode_Sub11_843;
    Node_Sub10 aNode_Sub10_844;

    protected abstract Node_Sub10 method434();

    protected abstract Node_Sub10 method426();

    protected abstract int method425();

    final void method471(int[] var1, int var2, int var3) {
        if (this.aBoolean845) {
            this.method429(var1, var2, var3);
        } else {
            this.method428(var3);
        }

    }

    protected abstract void method429(int[] var1, int var2, int var3);

    int method472() {
        return 255;
    }

    protected abstract void method428(int var1);
}
