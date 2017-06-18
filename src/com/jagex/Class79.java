package com.jagex;

public class Class79 implements Runnable {
    volatile Class84[] aClass84Array842 = new Class84[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; ++var1) {
                Class84 var2 = this.aClass84Array842[var1];
                if (var2 != null) {
                    var2.method491();
                }
            }
        } catch (Exception var4) {
            Client.method332(null, var4);
        }

    }
}
