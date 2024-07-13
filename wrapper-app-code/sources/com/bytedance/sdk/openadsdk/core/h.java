package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.d;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.u;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.core.video.b.c;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.a;
import com.bytedance.sdk.openadsdk.utils.f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GlobalInfo */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static TTAdSdk.InitCallback f1210a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f1211b = new HashSet<String>() {
        {
            add("8025677");
            add("5001121");
        }
    };
    private static final h u = new h();

    /* renamed from: c  reason: collision with root package name */
    private String f1212c;

    /* renamed from: d  reason: collision with root package name */
    private String f1213d;

    /* renamed from: e  reason: collision with root package name */
    private int f1214e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1215f;

    /* renamed from: g  reason: collision with root package name */
    private String f1216g;

    /* renamed from: h  reason: collision with root package name */
    private String f1217h;
    private AtomicBoolean i = new AtomicBoolean(false);
    private int j = 0;
    private boolean k = true;
    private final Set<Integer> l = Collections.synchronizedSet(new HashSet());
    private boolean m = false;
    private Bitmap n = null;
    private a o = new a();
    private String[] p;
    private int q = 0;
    private int r = 0;
    private boolean s = false;
    private String t;
    private c v;
    private volatile ConcurrentHashMap<String, a.C0004a> w = null;

    public static void a(TTAdSdk.InitCallback initCallback) {
        f1210a = initCallback;
    }

    public boolean a() {
        return this.o.a();
    }

    public boolean b() {
        return this.s;
    }

    public com.bytedance.sdk.openadsdk.utils.a c() {
        return this.o;
    }

    private h() {
        try {
            com.bykv.vk.openvk.component.video.api.f.a.a(m.a());
            this.l.add(4);
            Context a2 = m.a();
            if (a2 instanceof Application) {
                ((Application) a2).registerActivityLifecycleCallbacks(this.o);
            } else if (a2 != null && a2.getApplicationContext() != null) {
                ((Application) a2.getApplicationContext()).registerActivityLifecycleCallbacks(this.o);
            }
        } catch (Throwable unused) {
        }
    }

    public static h d() {
        return u;
    }

    public boolean e() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_activate_init", true);
        }
        return u.a((String) null, m.a()).b("sdk_activate_init", true);
    }

    public void a(boolean z) {
        this.s = z;
    }

    public void b(boolean z) {
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_activate_init", Boolean.valueOf(z));
        }
        u.a((String) null, m.a()).a("sdk_activate_init", z);
    }

    public String f() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", OSOutcomeConstants.APP_ID, (String) null);
        }
        return this.f1212c;
    }

    public void a(String str) {
        g(str);
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", OSOutcomeConstants.APP_ID, str);
        }
        this.f1212c = str;
    }

    public String g() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "name", (String) null);
        }
        return this.f1213d;
    }

    public void b(String str) {
        h(str);
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "name", str);
        }
        this.f1213d = str;
    }

    public void a(int i2) {
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "icon_id", Integer.valueOf(i2));
        }
        this.f1214e = i2;
    }

    public int h() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "icon_id", 0);
        }
        return this.f1214e;
    }

    public void b(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == -1) {
            if (b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_coppa", Integer.valueOf(i2));
            } else {
                u.a((String) null, m.a()).a("sdk_coppa", i2);
            }
            this.q = i2;
        }
    }

    public int i() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "sdk_coppa", -1);
        }
        int b2 = u.a((String) null, m.a()).b("sdk_coppa", -1);
        this.q = b2;
        return b2;
    }

    public int j() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "tt_gdpr", -1);
        }
        return u.a((String) null, m.a()).b("tt_gdpr", -1);
    }

    public void c(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != -1) {
            return;
        }
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "tt_gdpr", Integer.valueOf(i2));
        } else {
            u.a((String) null, m.a()).a("tt_gdpr", i2);
        }
    }

    public void d(int i2) {
        if (!(i2 == 0 || i2 == 1)) {
            i2 = -99;
        }
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_coppa", Integer.valueOf(i2));
        } else {
            u.a((String) null, m.a()).a("global_coppa", i2);
        }
        this.r = i2;
    }

    public int k() {
        if (b.c()) {
            this.r = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_coppa", -99);
        } else {
            this.r = u.a((String) null, m.a()).b("global_coppa", -99);
        }
        if (this.r == -99) {
            this.r = i();
        }
        return this.r;
    }

    public boolean l() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_paid", false);
        }
        return this.f1215f;
    }

    public void c(boolean z) {
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_paid", Boolean.valueOf(z));
        }
        this.f1215f = z;
    }

    public String m() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "keywords", (String) null);
        }
        return this.f1216g;
    }

    public void c(String str) {
        i(str);
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "keywords", str);
        }
        this.f1216g = str;
    }

    public String n() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "extra_data", (String) null);
        }
        return this.f1217h;
    }

    public void d(String str) {
        j(str);
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "extra_data", str);
        }
        this.f1217h = str;
    }

    public void e(int i2) {
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "title_bar_theme", Integer.valueOf(i2));
        }
        this.j = i2;
    }

    public int o() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "title_bar_theme", 0);
        }
        return this.j;
    }

    public void d(boolean z) {
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "allow_show_notify", Boolean.valueOf(z));
        }
        this.k = z;
    }

    private static void g(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f1210a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "appid cannot be empty");
        }
        l.e("GlobalInfo", "appid cannot be empty");
    }

    private static void h(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f1210a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "name cannot be empty");
        }
        l.e("GlobalInfo", "name cannot be empty");
    }

    private static void i(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f1210a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "keyword is super long, the longest is 1000");
            }
            l.e("GlobalInfo", "keyword is super long, the longest is 1000");
        }
    }

    private static void j(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f1210a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "Data is very long, the longest is 1000");
            }
            l.e("GlobalInfo", "Data is very long, the longest is 1000");
        }
    }

    public c p() {
        if (this.v == null) {
            this.v = new c(10, 8);
        }
        return this.v;
    }

    public boolean q() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_use_texture", false);
        }
        return this.m;
    }

    public void e(boolean z) {
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "is_use_texture", Boolean.valueOf(z));
        }
        this.m = z;
    }

    public Bitmap r() {
        if (b.c()) {
            return d.a(com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", "pause_icon", (String) null));
        }
        return this.n;
    }

    public void a(String[] strArr) {
        if (b.c() && strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    int i3 = i2 + 1;
                    if (i2 > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                    i2 = i3;
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "need_clear_task_reset", sb2);
            }
        }
        this.p = strArr;
    }

    public boolean s() {
        return f1211b.contains(this.f1212c);
    }

    public boolean t() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.u.d());
    }

    public String u() {
        if (!TextUtils.isEmpty(this.t)) {
            return this.t;
        }
        String a2 = f.a();
        this.t = a2;
        if (!TextUtils.isEmpty(a2)) {
            return this.t;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        f.a(valueOf);
        this.t = valueOf;
        return valueOf;
    }

    private static JSONObject k(String str) {
        String str2;
        if (b.c()) {
            str2 = com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_global_info", str, (String) null);
        } else {
            str2 = u.a((String) null, m.a()).b(str, (String) null);
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
                jSONObject.put("time", System.currentTimeMillis());
                if (b.c()) {
                    com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", str, jSONObject.toString());
                } else {
                    u.a((String) null, m.a()).a(str, jSONObject.toString());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String a(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject k2 = k(str);
            if (k2 == null) {
                return null;
            }
            if (System.currentTimeMillis() - k2.getLong("time") <= j2) {
                return k2.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public int v() {
        if (b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_ccpa", -1);
        }
        return u.a((String) null, m.a()).b("global_ccpa", -1);
    }

    public void f(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != -1) {
            return;
        }
        if (b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_global_info", "global_ccpa", Integer.valueOf(i2));
        } else {
            u.a((String) null, m.a()).a("global_ccpa", i2);
        }
    }

    public a.C0004a e(String str) {
        if (this.w == null || str == null) {
            return null;
        }
        return this.w.get(str);
    }

    public void a(String str, a.C0004a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (b.c()) {
                TTDislikeListView.a(6, str, aVar);
                return;
            }
            if (this.w == null) {
                synchronized (h.class) {
                    if (this.w == null) {
                        this.w = new ConcurrentHashMap<>();
                    }
                }
            }
            this.w.put(str, aVar);
        }
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (b.c()) {
            TTDislikeListView.a(6, str);
        } else if (this.w != null) {
            this.w.remove(str);
        }
    }

    public void w() {
        if (this.w != null && this.w.size() == 0) {
            this.w = null;
        }
    }
}
