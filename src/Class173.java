import java.net.MalformedURLException;
import java.net.URL;

public final class Class173 {
    static int[] anIntArray2135;

    static boolean method1185(String var0) {
        if (var0 == null) {
            return false;
        } else {
            try {
                new URL(var0);
                return true;
            } catch (MalformedURLException var2) {
                return false;
            }
        }
    }
}
