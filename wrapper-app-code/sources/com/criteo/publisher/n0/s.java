package com.criteo.publisher.n0;

/* compiled from: TextUtils */
public class s {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String a(String str) {
        if (!str.isEmpty()) {
            return str;
        }
        return null;
    }
}
