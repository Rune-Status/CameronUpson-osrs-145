package com.jagex;

import java.util.Calendar;
import java.util.TimeZone;

public class Class141 {
    static final String[] days = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static final String[][] months = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
    public static int anInt1784;
    static Calendar aCalendar1783;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        aCalendar1783 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

}
