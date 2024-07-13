package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static DateFormat f10737a;

    public static DateFormat a() {
        if (f10737a == null) {
            f10737a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f10737a;
    }
}
