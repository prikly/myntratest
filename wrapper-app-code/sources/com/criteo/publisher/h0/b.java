package com.criteo.publisher.h0;

import android.util.Base64;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.b0.n;
import com.criteo.publisher.model.b0.r;
import com.criteo.publisher.model.s;
import com.criteo.publisher.n0.k;
import com.criteo.publisher.n0.o;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: DfpHeaderBidding */
public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final com.criteo.publisher.n0.c f2521a;

    /* renamed from: b  reason: collision with root package name */
    private final k f2522b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2523c = h.b(getClass());

    public void a(Object obj) {
    }

    public b(com.criteo.publisher.n0.c cVar, k kVar) {
        this.f2521a = cVar;
        this.f2522b = kVar;
    }

    public boolean b(Object obj) {
        return d.a(obj);
    }

    public com.criteo.publisher.i0.a a() {
        return com.criteo.publisher.i0.a.GAM_APP_BIDDING;
    }

    public void a(Object obj, com.criteo.publisher.n0.a aVar, s sVar) {
        d b2 = d.b(obj);
        if (b2 != null) {
            b2.a("crt_cpm", sVar.a());
            int i = a.f2524a[aVar.ordinal()];
            if (i == 1) {
                a(b2, sVar);
                b2.a("crt_size", sVar.k() + "x" + sVar.e());
            } else if (i == 2 || i == 3) {
                a(b2, sVar);
                b2.a("crt_size", a(sVar));
            } else if (i == 4) {
                b(b2, sVar);
            }
            if (sVar.p()) {
                b2.a("crt_format", "video");
            }
            this.f2523c.a(a.a(a(), b2.a()));
        }
    }

    /* compiled from: DfpHeaderBidding */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2524a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.criteo.publisher.n0.a[] r0 = com.criteo.publisher.n0.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2524a = r0
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2524a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2524a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2524a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_CUSTOM_NATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.h0.b.a.<clinit>():void");
        }
    }

    private void a(d dVar, s sVar) {
        String str;
        String d2 = sVar.d();
        if (!com.criteo.publisher.n0.s.a((CharSequence) d2)) {
            if (sVar.p()) {
                try {
                    str = b(b(d2));
                } catch (UnsupportedEncodingException e2) {
                    o.a((Throwable) e2);
                    return;
                }
            } else {
                str = a(d2);
            }
            dVar.a("crt_displayurl", str);
        }
    }

    private String a(s sVar) {
        boolean z = true;
        if (this.f2521a.a() != 1) {
            z = false;
        }
        if (this.f2522b.c()) {
            if (z && sVar.k() >= 768 && sVar.e() >= 1024) {
                return "768x1024";
            }
            if (!z && sVar.k() >= 1024 && sVar.e() >= 768) {
                return "1024x768";
            }
        }
        return z ? "320x480" : "480x320";
    }

    private void b(d dVar, s sVar) {
        n g2 = sVar.g();
        if (g2 != null) {
            r n = g2.n();
            a(dVar, n.g(), "crtn_title");
            a(dVar, n.c(), "crtn_desc");
            a(dVar, n.f(), "crtn_price");
            a(dVar, n.b().toString(), "crtn_clickurl");
            a(dVar, n.a(), "crtn_cta");
            a(dVar, n.e().toString(), "crtn_imageurl");
            a(dVar, g2.c(), "crtn_advname");
            a(dVar, g2.d(), "crtn_advdomain");
            a(dVar, g2.f().toString(), "crtn_advlogourl");
            a(dVar, g2.e().toString(), "crtn_advurl");
            a(dVar, g2.l().toString(), "crtn_prurl");
            a(dVar, g2.m().toString(), "crtn_primageurl");
            a(dVar, g2.k(), "crtn_prtext");
            List<URL> g3 = g2.g();
            for (int i = 0; i < g3.size(); i++) {
                String url = g3.get(i).toString();
                a(dVar, url, "crtn_pixurl_" + i);
            }
            dVar.a("crtn_pixcount", g3.size() + "");
        }
    }

    private void a(d dVar, String str, String str2) {
        if (!com.criteo.publisher.n0.s.a((CharSequence) str)) {
            dVar.a(str2, a(str));
        }
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        if (com.criteo.publisher.n0.s.a((CharSequence) str)) {
            return null;
        }
        try {
            return b(b(Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 2)));
        } catch (UnsupportedEncodingException e2) {
            o.a((Throwable) e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String b(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, Charset.forName("UTF-8").name());
    }

    /* compiled from: DfpHeaderBidding */
    private static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f2529a;

        /* renamed from: b  reason: collision with root package name */
        private final StringBuilder f2530b;

        /* synthetic */ d(String str, a aVar) {
            this(str);
        }

        private d(String str) {
            this.f2529a = str;
            this.f2530b = new StringBuilder();
        }

        static boolean a(Object obj) {
            return c.a(obj) || C0023b.a(obj);
        }

        static d b(Object obj) {
            if (c.a(obj)) {
                return new c((AdManagerAdRequest.Builder) obj, (a) null);
            }
            if (C0023b.a(obj)) {
                return new C0023b(obj, (a) null);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void a(String str, String str2) {
            if (this.f2530b.length() != 0) {
                this.f2530b.append(",");
            } else {
                StringBuilder sb = this.f2530b;
                sb.append(this.f2529a);
                sb.append(':');
            }
            StringBuilder sb2 = this.f2530b;
            sb2.append(str);
            sb2.append("=");
            sb2.append(str2);
        }

        /* access modifiers changed from: package-private */
        public final String a() {
            return this.f2530b.toString();
        }
    }

    /* compiled from: DfpHeaderBidding */
    private static class c extends d {

        /* renamed from: c  reason: collision with root package name */
        private final AdManagerAdRequest.Builder f2528c;

        /* synthetic */ c(AdManagerAdRequest.Builder builder, a aVar) {
            this(builder);
        }

        private c(AdManagerAdRequest.Builder builder) {
            super("AdMob20", (a) null);
            this.f2528c = builder;
        }

        static boolean a(Object obj) {
            try {
                return obj instanceof AdManagerAdRequest.Builder;
            } catch (LinkageError unused) {
                return false;
            }
        }

        /* access modifiers changed from: protected */
        public void a(String str, String str2) {
            try {
                this.f2528c.addCustomTargeting(str, str2);
                super.a(str, str2);
            } catch (LinkageError e2) {
                o.a((Throwable) e2);
            }
        }
    }

    /* renamed from: com.criteo.publisher.h0.b$b  reason: collision with other inner class name */
    /* compiled from: DfpHeaderBidding */
    private static class C0023b extends d {

        /* renamed from: d  reason: collision with root package name */
        private static Class<?> f2525d;

        /* renamed from: e  reason: collision with root package name */
        private static Method f2526e;

        /* renamed from: c  reason: collision with root package name */
        private final Object f2527c;

        /* synthetic */ C0023b(Object obj, a aVar) {
            this(obj);
        }

        private C0023b(Object obj) {
            super("AdMob19", (a) null);
            this.f2527c = obj;
        }

        static boolean a(Object obj) {
            return a(obj.getClass().getClassLoader()) && f2525d.isAssignableFrom(obj.getClass());
        }

        /* access modifiers changed from: protected */
        public void a(String str, String str2) {
            try {
                f2526e.invoke(this.f2527c, new Object[]{str, str2});
            } catch (IllegalAccessException e2) {
                o.a((Throwable) e2);
            } catch (InvocationTargetException e3) {
                o.a((Throwable) e3);
            }
            super.a(str, str2);
        }

        private static boolean a(ClassLoader classLoader) {
            if (f2525d != null && f2526e != null) {
                return true;
            }
            try {
                Class<?> cls = Class.forName("com.google.android.gms.ads.doubleclick.PublisherAdRequest$Builder", false, classLoader);
                f2525d = cls;
                f2526e = cls.getMethod("addCustomTargeting", new Class[]{String.class, String.class});
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            } catch (NoSuchMethodException e2) {
                o.a((Throwable) e2);
                return false;
            }
        }
    }
}
