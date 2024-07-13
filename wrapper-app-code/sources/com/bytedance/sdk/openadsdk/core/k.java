package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.i.c;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.r;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: InitHelper */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f1349a = false;

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f1350b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f1351c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final List<TTAdSdk.InitCallback> f1352d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e  reason: collision with root package name */
    private static AtomicBoolean f1353e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private static volatile HandlerThread f1354f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Handler f1355g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile int f1356h = 0;

    /* compiled from: InitHelper */
    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Handler f1357a = new Handler(Looper.getMainLooper());
    }

    static {
        f1354f = null;
        f1355g = null;
        f1354f = new HandlerThread("tt_pangle_thread_init", 10);
        f1354f.start();
        f1355g = new Handler(f1354f.getLooper());
    }

    public static void a() {
        Context a2;
        if (m.h().d() && (a2 = m.a()) != null) {
            try {
                d.a().b().a(a2, b.c(), true, new c(a2));
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context) {
        r.a();
        v.a(context);
        b(context);
        m.i().a();
        s.a(j.a(context));
        m.g().a();
        com.bytedance.sdk.component.adexpress.a.b.a.a();
        com.bytedance.sdk.openadsdk.core.video.b.a.a().b();
    }

    public static void b() {
        com.bytedance.sdk.component.adexpress.a.a.a.a().a((com.bytedance.sdk.component.adexpress.a.a.b) new com.bytedance.sdk.component.adexpress.a.a.b() {
            public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, contentValues, str2, strArr);
            }

            public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.c(com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            public int a(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, str2, strArr);
            }

            public void a(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.a.a.a.a().a((com.bytedance.sdk.component.adexpress.a.a.c) new com.bytedance.sdk.component.adexpress.a.a.c() {
            public void d() {
            }

            public int i() {
                return 1;
            }

            public int k() {
                return 0;
            }

            public int a() {
                if (m.h() == null) {
                    return 0;
                }
                return m.h().b();
            }

            public Context b() {
                return m.a();
            }

            public Handler c() {
                return k.d();
            }

            public com.bytedance.sdk.component.adexpress.a.c.a e() {
                return m.f().a();
            }

            public com.bytedance.sdk.component.e.b.a f() {
                return d.a().b().d();
            }

            public com.bytedance.sdk.component.e.b.b g() {
                return d.a().b().c();
            }

            public String h() {
                return h.d().f();
            }

            public int j() {
                return m.h().H();
            }
        });
        com.bytedance.sdk.component.adexpress.a.a.a.a().a((com.bytedance.sdk.component.adexpress.a.a.d) new com.bytedance.sdk.component.adexpress.a.a.d() {
            public void a(int i) {
                com.bytedance.sdk.openadsdk.h.b.a().b(com.bytedance.sdk.openadsdk.h.a.b.b().b(i).f(g.a(i)));
            }
        });
        com.bytedance.sdk.component.widget.a.a.a().a(new com.bytedance.sdk.component.widget.a.b() {
            public boolean a() {
                return true;
            }

            public void a(com.bytedance.sdk.component.widget.b.a aVar, String str, String str2, JSONObject jSONObject, long j) {
                n nVar = new n();
                nVar.q(aVar.a());
                nVar.m(aVar.b());
                nVar.k(aVar.c());
                e.a(m.a(), nVar, str, str2, jSONObject, j);
            }
        });
    }

    private static void b(Context context) {
        c.a(context).a(Constants.UUID, l.a());
    }

    public static Handler c() {
        if (f1354f == null || !f1354f.isAlive()) {
            synchronized (k.class) {
                if (f1354f == null || !f1354f.isAlive()) {
                    f1354f = new HandlerThread("tt_pangle_thread_init", -1);
                    f1354f.start();
                    f1355g = new Handler(f1354f.getLooper());
                }
            }
        }
        return f1355g;
    }

    public static Handler d() {
        return a.f1357a;
    }

    public static int e() {
        return f1356h;
    }

    public static void a(int i) {
        f1356h = i;
    }
}
