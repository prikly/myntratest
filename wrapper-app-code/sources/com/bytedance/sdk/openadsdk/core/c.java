package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.multipro.d.a;

/* compiled from: AdPreference */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f1010a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f1011b;

    private c(Context context) {
        this.f1011b = context.getSharedPreferences("ttopenadsdk", 0);
    }

    public static c a(Context context) {
        Class<c> cls = c.class;
        if (f1010a == null) {
            synchronized (cls) {
                if (f1010a == null) {
                    f1010a = new c(context);
                }
            }
        }
        return f1010a;
    }

    public void a(String str, int i) {
        if (b.c()) {
            a.a("ttopenadsdk", str, Integer.valueOf(i));
        } else {
            this.f1011b.edit().putInt(str, i).apply();
        }
    }

    public void a(String str, long j) {
        if (b.c()) {
            a.a("ttopenadsdk", str, Long.valueOf(j));
        } else {
            this.f1011b.edit().putLong(str, j).apply();
        }
    }

    public void a(String str, String str2) {
        if (b.c()) {
            a.a("ttopenadsdk", str, str2);
        } else {
            this.f1011b.edit().putString(str, str2).apply();
        }
    }

    public void a(String str, boolean z) {
        if (b.c()) {
            a.a("ttopenadsdk", str, Boolean.valueOf(z));
        } else {
            this.f1011b.edit().putBoolean(str, z).apply();
        }
    }

    public int b(String str, int i) {
        return b.c() ? a.a("ttopenadsdk", str, i) : this.f1011b.getInt(str, i);
    }

    public Long b(String str, long j) {
        return Long.valueOf(b.c() ? a.a("ttopenadsdk", str, j) : this.f1011b.getLong(str, j));
    }

    public String b(String str, String str2) {
        return b.c() ? a.b("ttopenadsdk", str, str2) : this.f1011b.getString(str, str2);
    }

    public boolean b(String str, boolean z) {
        return b.c() ? a.a("ttopenadsdk", str, z) : this.f1011b.getBoolean(str, z);
    }
}
