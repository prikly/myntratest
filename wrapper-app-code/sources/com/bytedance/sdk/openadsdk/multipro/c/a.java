package com.bytedance.sdk.openadsdk.multipro.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.b.f;
import com.bytedance.sdk.openadsdk.b.g;
import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.b.q;
import com.bytedance.sdk.openadsdk.b.s;
import com.bytedance.sdk.openadsdk.b.t;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.bytedance.sdk.openadsdk.multipro.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AdEventProviderImpl */
public class a implements com.bytedance.sdk.openadsdk.multipro.a {
    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        return null;
    }

    public String a() {
        return "t_event_ad_event";
    }

    public void b() {
    }

    private static IListenerManager f() {
        try {
            if (m.a() != null) {
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void c() {
        if (m.a() != null) {
            try {
                IListenerManager f2 = f();
                if (f2 != null) {
                    f2.getType(Uri.parse(g() + "adEventStart"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(boolean z) {
        if (m.a() != null) {
            try {
                IListenerManager f2 = f();
                if (f2 != null) {
                    f2.getType(Uri.parse(g() + "logStatusStart" + ("?isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            l.b("AdEventProviderImpl", "dispatch event");
            try {
                IListenerManager f2 = f();
                if (f2 != null) {
                    String a2 = com.bytedance.sdk.openadsdk.multipro.c.a(str);
                    f2.getType(Uri.parse(g() + "adEventDispatch" + "?event=" + a2));
                }
            } catch (Throwable th) {
                l.e("AdEventProviderImpl", "dispatch event Throwable:" + th.toString());
            }
        }
    }

    public static void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb = new StringBuilder();
                for (String a2 : list) {
                    sb.append(com.bytedance.sdk.openadsdk.multipro.c.a(a2));
                    sb.append(",");
                }
                String a3 = com.bytedance.sdk.openadsdk.multipro.c.a(sb.toString());
                String str = "?track=" + String.valueOf(a3);
                IListenerManager f2 = f();
                if (f2 != null) {
                    f2.getType(Uri.parse(g() + "trackUrl" + str));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        try {
            IListenerManager f2 = f();
            if (f2 != null) {
                f2.getType(Uri.parse(g() + "trackFailed"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void e() {
        try {
            IListenerManager f2 = f();
            if (f2 != null) {
                f2.getType(Uri.parse(g() + "logStatusInit"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f2 = f();
                if (f2 != null) {
                    String a2 = com.bytedance.sdk.openadsdk.multipro.c.a(str);
                    f2.getType(Uri.parse(g() + "logStatusUpload" + "?event=" + a2));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f2 = f();
                if (f2 != null) {
                    f2.getType(Uri.parse(g() + "logStatusDispatch" + ("?event=" + com.bytedance.sdk.openadsdk.multipro.c.a(str) + "&isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String g() {
        return e.f2178b + "/" + "t_event_ad_event" + "/";
    }

    public String a(Uri uri) {
        String str = uri.getPath().split("/")[2];
        if ("adEventStart".equals(str)) {
            l.b("AdEventProviderImpl", "====ad event function will be start====");
            b.a().a();
        } else if ("logStatusStart".equals(str)) {
            l.b("AdEventProviderImpl", "====log stats function will be start====");
            if (Boolean.valueOf(uri.getQueryParameter("isRealTime")).booleanValue()) {
                b.c().a();
            } else {
                b.b().a();
            }
        } else if ("adEventDispatch".equals(str)) {
            l.b("AdEventProviderImpl", "dispatch FUN_AD_EVENT_DISPATCH");
            com.bytedance.sdk.openadsdk.b.a a2 = com.bytedance.sdk.openadsdk.b.a.a(com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("event")));
            if (a2 != null) {
                b.a().a(a2);
            }
        } else if ("logStatusDispatch".equals(str)) {
            Boolean valueOf = Boolean.valueOf(uri.getQueryParameter("isRealTime"));
            c.a a3 = c.a.a(com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("event")));
            if (a3 == null) {
                return null;
            }
            if (valueOf.booleanValue()) {
                b.c().a(a3);
            } else {
                b.b().a(a3);
            }
        } else if ("trackUrl".equals(str)) {
            try {
                String[] split = com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("track")).split(",");
                if (split.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String b2 : split) {
                        String b3 = com.bytedance.sdk.openadsdk.multipro.c.b(b2);
                        if (!TextUtils.isEmpty(b3)) {
                            arrayList.add(b3);
                        }
                    }
                    d.a().a(arrayList);
                }
            } catch (Throwable unused) {
            }
        } else if ("trackFailed".equals(str)) {
            d.a().a();
            l.b("AdEventProviderImpl", "track failed: ");
        } else if ("logStatusInit".equals(str)) {
            c.a().a();
        } else if ("logStatusUpload".equals(str)) {
            final String b4 = com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("event"));
            if (!TextUtils.isEmpty(b4)) {
                c.a().a((com.bytedance.sdk.openadsdk.h.a) new com.bytedance.sdk.openadsdk.h.a() {
                    public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                        return C0015a.b(b4);
                    }
                });
            }
        }
        return null;
    }

    /* compiled from: AdEventProviderImpl */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.b.c<com.bytedance.sdk.openadsdk.b.a> f2169a;

        /* renamed from: b  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.b.c<c.a> f2170b;

        /* renamed from: c  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.b.c<c.a> f2171c;

        static com.bytedance.sdk.openadsdk.b.c<com.bytedance.sdk.openadsdk.b.a> a() {
            if (f2169a == null) {
                synchronized (m.class) {
                    if (f2169a == null) {
                        f2169a = new com.bytedance.sdk.openadsdk.b.c<>(new g(m.a()), m.f(), h.c.a(), d());
                    }
                }
            }
            return f2169a;
        }

        public static com.bytedance.sdk.openadsdk.b.c<c.a> b() {
            if (f2171c == null) {
                synchronized (m.class) {
                    if (f2171c == null) {
                        f2171c = a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
            return f2171c;
        }

        public static com.bytedance.sdk.openadsdk.b.c<c.a> c() {
            if (f2170b == null) {
                synchronized (m.class) {
                    if (f2170b == null) {
                        f2170b = a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
            return f2170b;
        }

        public static com.bytedance.sdk.openadsdk.b.c<c.a> a(String str, String str2, boolean z) {
            f fVar;
            h.c cVar;
            if (z) {
                fVar = new s(m.a());
                cVar = h.c.a();
            } else {
                cVar = h.c.b();
                fVar = new q(m.a());
            }
            h.b d2 = d();
            return new com.bytedance.sdk.openadsdk.b.c(fVar, (n) null, cVar, d2, new t(str, str2, fVar, (n) null, cVar, d2));
        }

        private static h.b d() {
            return new h.b() {
                public boolean a() {
                    return o.a(m.a());
                }
            };
        }
    }

    /* compiled from: AdEventProviderImpl */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.k.a f2173a;

        public static com.bytedance.sdk.openadsdk.k.a a() {
            if (f2173a == null) {
                synchronized (com.bytedance.sdk.openadsdk.k.a.class) {
                    if (f2173a == null) {
                        f2173a = new com.bytedance.sdk.openadsdk.k.b(m.a(), new com.bytedance.sdk.openadsdk.k.h(m.a()));
                    }
                }
            }
            return f2173a;
        }
    }

    /* compiled from: AdEventProviderImpl */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.h.c.c f2172a;

        public static com.bytedance.sdk.openadsdk.h.c.c a() {
            if (f2172a == null) {
                synchronized (com.bytedance.sdk.openadsdk.h.c.c.class) {
                    if (f2172a == null) {
                        f2172a = new com.bytedance.sdk.openadsdk.h.c.c();
                    }
                }
            }
            return f2172a;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$a  reason: collision with other inner class name */
    /* compiled from: AdEventProviderImpl */
    private static class C0015a implements com.bytedance.sdk.openadsdk.h.a.a {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f2168a;

        /* access modifiers changed from: private */
        public static C0015a b(String str) {
            return new C0015a(str);
        }

        private C0015a(String str) {
            try {
                this.f2168a = new JSONObject(str);
            } catch (Throwable unused) {
            }
        }

        public JSONObject a() {
            return this.f2168a;
        }
    }
}
