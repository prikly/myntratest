package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.multipro.d.a;

/* compiled from: SpAdUtile */
public class p {
    private static String f() {
        return "sp_last_ad_show_cache_show_ad";
    }

    private static Context e() {
        return m.a();
    }

    private static SharedPreferences a(String str) {
        try {
            if (e() != null) {
                return e().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a() {
        try {
            if (b.c()) {
                return a.b(f(), "material_data", (String) null);
            }
            SharedPreferences a2 = a(f());
            if (a2 != null) {
                return a2.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b() {
        try {
            if (b.c()) {
                return a.b(f(), "show_ad_tag", (String) null);
            }
            SharedPreferences a2 = a(f());
            if (a2 != null) {
                return a2.getString("show_ad_tag", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long c() {
        try {
            if (b.c()) {
                return a.a(f(), "show_time", 0);
            }
            SharedPreferences a2 = a(f());
            if (a2 != null) {
                return a2.getLong("show_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void a(String str, String str2) {
        try {
            if (b.c()) {
                a.a(f(), "show_time", Long.valueOf(System.currentTimeMillis()));
                a.a(f(), "material_data", str);
                a.a(f(), "show_ad_tag", str2);
                return;
            }
            SharedPreferences a2 = a(f());
            if (a2 != null) {
                a2.edit().putLong("show_time", System.currentTimeMillis()).putString("material_data", str).putString("show_ad_tag", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static void d() {
        try {
            if (b.c()) {
                a.a(f());
                return;
            }
            SharedPreferences a2 = a(f());
            if (a2 != null) {
                a2.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }
}
