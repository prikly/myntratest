package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SPUtils */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, u> f19267a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f19268b;

    public static u a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        u uVar = f19267a.get(str);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(str, context);
        f19267a.put(str, uVar2);
        return uVar2;
    }

    private u(String str, Context context) {
        if (context != null) {
            this.f19268b = context.getApplicationContext().getSharedPreferences(str, 0);
        }
    }

    public void a(String str, String str2) {
        try {
            this.f19268b.edit().putString(str, str2).apply();
        } catch (Throwable unused) {
        }
    }

    public String a(String str) {
        try {
            return b(str, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public String b(String str, String str2) {
        try {
            return this.f19268b.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void a(String str, int i) {
        try {
            this.f19268b.edit().putInt(str, i).apply();
        } catch (Throwable unused) {
        }
    }

    public int b(String str) {
        return b(str, -1);
    }

    public int b(String str, int i) {
        try {
            return this.f19268b.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    public void a(String str, long j) {
        try {
            this.f19268b.edit().putLong(str, j).apply();
        } catch (Throwable unused) {
        }
    }

    public long b(String str, long j) {
        try {
            return this.f19268b.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    public void a(String str, float f2) {
        try {
            this.f19268b.edit().putFloat(str, f2).apply();
        } catch (Throwable unused) {
        }
    }

    public float b(String str, float f2) {
        try {
            return this.f19268b.getFloat(str, f2);
        } catch (Throwable unused) {
            return f2;
        }
    }

    public void a(String str, boolean z) {
        try {
            this.f19268b.edit().putBoolean(str, z).apply();
        } catch (Throwable unused) {
        }
    }

    public boolean b(String str, boolean z) {
        try {
            return this.f19268b.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    public void a(String str, Set<String> set) {
        try {
            this.f19268b.edit().putStringSet(str, set).apply();
        } catch (Throwable unused) {
        }
    }

    public Set<String> b(String str, Set<String> set) {
        try {
            return this.f19268b.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    public void c(String str) {
        try {
            this.f19268b.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
