public class Class184 {
    public static final Class184 aClass184_2165 = new Class184("13", "13");
    public static final Class184 aClass184_2166 = new Class184("12", "12");
    public static final Class184 aClass184_2177 = new Class184("15", "15");
    public static final Class184 aClass184_2178 = new Class184("1", "1");
    public static final Class184 aClass184_2171 = new Class184("8", "8");
    public static final Class184 aClass184_2168 = new Class184("10", "10");
    public static final Class184 aClass184_2169 = new Class184("7", "7");
    public static final Class184 aClass184_2173 = new Class184("6", "6");
    public static final Class184 aClass184_2167 = new Class184("4", "4");
    public static final Class184 aClass184_2174 = new Class184("14", "14");
    public static final Class184 aClass184_2164 = new Class184("11", "11");
    public static final Class184 aClass184_2163 = new Class184("5", "5");
    public static final Class184 aClass184_2172 = new Class184("3", "3");
    public static final Class184 aClass184_2175 = new Class184("9", "9");
    public static final Class184 aClass184_2170 = new Class184("2", "2");
    public final String aString2176;

    Class184(String var1, String var2) {
        this.aString2176 = var2;
    }

    static void method1202() {
        Login.username = Login.username.trim();
        if (Login.username.length() == 0) {
            Class22.setLoginResponse("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
        } else {
            long var0 = Class84.method485();
            int var2;
            if (0L == var0) {
                var2 = 5;
            } else {
                var2 = Class165.method1049(var0, Login.username);
            }

            switch (var2) {
                case 2:
                    Class22.setLoginResponse("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                    Login.anInt701 = 6;
                    break;
                case 3:
                    Class22.setLoginResponse("", "Error connecting to server.", "");
                    break;
                case 4:
                    Class22.setLoginResponse("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                    break;
                case 5:
                    Class22.setLoginResponse("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                    break;
                case 6:
                    Class22.setLoginResponse("", "Error connecting to server.", "");
                    break;
                case 7:
                    Class22.setLoginResponse("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
            }

        }
    }
}
