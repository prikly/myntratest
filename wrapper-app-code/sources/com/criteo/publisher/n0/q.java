package com.criteo.publisher.n0;

import android.content.SharedPreferences;

/* compiled from: SafeSharedPreferences */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f2903a;

    public q(SharedPreferences sharedPreferences) {
        this.f2903a = sharedPreferences;
    }

    public String a(String str, String str2) {
        try {
            return this.f2903a.getString(str, str2);
        } catch (ClassCastException e2) {
            o.a((Throwable) new IllegalStateException("Expected a String type when reading: " + str, e2));
            return str2;
        }
    }

    public int a(String str, int i) {
        try {
            return this.f2903a.getInt(str, i);
        } catch (ClassCastException e2) {
            o.a((Throwable) new IllegalStateException("Expect an int type when reading " + str, e2));
            return i;
        }
    }
}
