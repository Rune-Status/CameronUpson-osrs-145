import java.util.Comparator;

final class Class70 implements Comparator {
    public static boolean[] aBooleanArray716;
    static Sprite[] aSpriteArray715;
    static int anInt714;

    public static boolean method417() {
        ClassStructure var0 = Class171.aLinkedList2124.method909();
        return var0 != null;
    }

    int method416(Class53 var1, Class53 var2) {
        return var1.method336().compareTo(var2.method336());
    }

    public int compare(Object var1, Object var2) {
        return this.method416((Class53) var1, (Class53) var2);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
