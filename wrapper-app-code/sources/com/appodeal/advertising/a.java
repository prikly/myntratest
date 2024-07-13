package com.appodeal.advertising;

import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f17777a = Pattern.compile("[a-f0-9]{8}(?:-[a-f0-9]{4}){4}[a-f0-9]{8}");

    public static final boolean a(String str) {
        return f17777a.matcher(str).matches();
    }
}
