package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.multipro.d.a;
import org.json.JSONObject;

/* compiled from: SpCache */
class j {

    /* renamed from: a  reason: collision with root package name */
    private String f784a;

    /* renamed from: b  reason: collision with root package name */
    private Context f785b;

    j(Context context, String str) {
        this.f785b = context;
        this.f784a = TextUtils.isEmpty(str) ? "" : str;
    }

    private Context b() {
        Context context = this.f785b;
        return context == null ? m.a() : context;
    }

    private SharedPreferences f(String str) {
        try {
            if (b() != null) {
                return b().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private String g(String str) {
        if (TextUtils.isEmpty(str)) {
            str = BuildConfig.ADAPTER_VERSION;
        }
        return this.f784a + "_cache_" + str;
    }

    private String c() {
        return this.f784a + "_adslot";
    }

    private String d() {
        return this.f784a + "_adslot_preload";
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        try {
            if (b.c()) {
                return a.b(g(str), "material_data", (String) null);
            }
            SharedPreferences f2 = f(g(str));
            if (f2 != null) {
                return f2.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public long b(String str) {
        try {
            if (b.c()) {
                return a.a(g(str), "create_time", 0);
            }
            SharedPreferences f2 = f(g(str));
            if (f2 != null) {
                return f2.getLong("create_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        try {
            if (b.c()) {
                return a.a(g(str), "has_played", true);
            }
            SharedPreferences f2 = f(g(str));
            if (f2 != null) {
                return f2.getBoolean("has_played", true);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        try {
            if (b.c()) {
                a.a(g(str), "has_played", (Boolean) false);
                a.a(g(str), "create_time", Long.valueOf(System.currentTimeMillis()));
                a.a(g(str), "material_data", str2);
                return;
            }
            SharedPreferences f2 = f(g(str));
            if (f2 != null) {
                f2.edit().putBoolean("has_played", false).putLong("create_time", System.currentTimeMillis()).putString("material_data", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        try {
            if (b.c()) {
                a.a(g(str));
                return;
            }
            SharedPreferences f2 = f(g(str));
            if (f2 != null) {
                f2.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public AdSlot e(String str) {
        String str2;
        try {
            if (b.c()) {
                str2 = a.b(c(), str, (String) null);
            } else {
                SharedPreferences f2 = f(c());
                str2 = f2 != null ? f2.getString(str, (String) null) : null;
            }
            return AdSlot.getSlot(str2 != null ? new JSONObject(str2) : null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (b.c()) {
                        a.a(c(), adSlot.getCodeId(), jSONObject);
                        return;
                    }
                    SharedPreferences f2 = f(c());
                    if (f2 != null) {
                        f2.edit().putString(adSlot.getCodeId(), jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (b.c()) {
                        a.a(d(), "preload_data", jSONObject);
                        return;
                    }
                    SharedPreferences f2 = f(d());
                    if (f2 != null) {
                        f2.edit().putString("preload_data", jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public AdSlot a() {
        String str;
        try {
            if (b.c()) {
                str = a.b(d(), "preload_data", (String) null);
                a.a(d());
            } else {
                SharedPreferences f2 = f(d());
                if (f2 != null) {
                    String string = f2.getString("preload_data", (String) null);
                    f2.edit().clear().apply();
                    str = string;
                } else {
                    str = null;
                }
            }
            return AdSlot.getSlot(str != null ? new JSONObject(str) : null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
