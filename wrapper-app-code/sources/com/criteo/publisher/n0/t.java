package com.criteo.publisher.n0;

/* compiled from: URLUtil */
public class t {
    public static boolean c(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (a(str) || b(str)) {
            return true;
        }
        return false;
    }

    private static boolean a(String str) {
        if (str == null || str.length() <= 6 || !str.substring(0, 7).equalsIgnoreCase("http://")) {
            return false;
        }
        return true;
    }

    private static boolean b(String str) {
        if (str == null || str.length() <= 7 || !str.substring(0, 8).equalsIgnoreCase("https://")) {
            return false;
        }
        return true;
    }
}
