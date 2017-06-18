package com.jagex;

import java.util.Calendar;

public class Class63 {
    static final String[] aStringArray641 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static String[] aStringArray638;
    static int[] anIntArray642 = new int[5];
    static Calendar aCalendar643 = Calendar.getInstance();
    static int[] anIntArray645 = new int[1000];
    static int anInt644;
    static String[] aStringArray640 = new String[1000];
    static int anInt648 = 0;
    static Class38[] aClass38Array637 = new Class38[50];
    static int[][] anIntArrayArray646 = new int[5][5000];
    static int anInt647 = 0;
    static int[] anIntArray639;

    public static Class method379(String var0) throws ClassNotFoundException {
        if (var0.equals("B")) {
            return Byte.TYPE;
        } else if (var0.equals("I")) {
            return Integer.TYPE;
        } else if (var0.equals("S")) {
            return Short.TYPE;
        } else if (var0.equals("J")) {
            return Long.TYPE;
        } else if (var0.equals("Z")) {
            return Boolean.TYPE;
        } else if (var0.equals("F")) {
            return Float.TYPE;
        } else if (var0.equals("D")) {
            return Double.TYPE;
        } else if (var0.equals("C")) {
            return Character.TYPE;
        } else {
            return var0.equals("void") ? Void.TYPE : Class.forName(var0);
        }
    }
}
