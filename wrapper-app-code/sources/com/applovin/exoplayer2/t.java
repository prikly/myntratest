package com.applovin.exoplayer2;

import android.os.Build;
import java.util.HashSet;

public final class t {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final String f13829a = ("ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") " + "ExoPlayerLib/2.15.1");

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<String> f13830b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private static String f13831c = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (t.class) {
            str = f13831c;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (t.class) {
            if (f13830b.add(str)) {
                f13831c += ", " + str;
            }
        }
    }
}
