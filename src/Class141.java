import java.util.Calendar;
import java.util.TimeZone;

public class Class141 {
    static final String[] aStringArray1785 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static final String[][] aStringArrayArray1782 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
    public static int anInt1784;
    static Calendar aCalendar1783;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        aCalendar1783 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    static void method978(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (Class33.method220(var0)) {
            Class183.method1201(InterfaceComponent.interfaces[var0], -1, var1, var2, var3, var4, var5, var6);
        }
    }
}
