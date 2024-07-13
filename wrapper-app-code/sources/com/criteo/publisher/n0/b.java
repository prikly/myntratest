package com.criteo.publisher.n0;

import android.content.Context;
import android.os.Looper;
import com.appodeal.advertising.AdvertisingInfo;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.x;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AdvertisingInfo */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final g f2874a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final f f2875b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2876c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f2877d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<c> f2878e = new AtomicReference<>();

    public b(Context context, Executor executor, f fVar) {
        this.f2876c = context;
        this.f2877d = executor;
        this.f2875b = fVar;
    }

    /* compiled from: AdvertisingInfo */
    class a extends x {
        a() {
        }

        public void a() {
            b.this.b();
        }
    }

    public void f() {
        this.f2877d.execute(new a());
    }

    public String b() {
        return c().b();
    }

    public boolean d() {
        return c().c();
    }

    private c c() {
        if (this.f2878e.get() == null) {
            if (e()) {
                this.f2877d.execute(new C0029b());
            } else {
                a();
            }
        }
        c cVar = this.f2878e.get();
        return cVar == null ? c.a() : cVar;
    }

    /* renamed from: com.criteo.publisher.n0.b$b  reason: collision with other inner class name */
    /* compiled from: AdvertisingInfo */
    class C0029b extends x {
        C0029b() {
        }

        public void a() {
            b.this.a();
        }
    }

    private boolean e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return Thread.currentThread().equals(mainLooper.getThread());
    }

    /* access modifiers changed from: private */
    public void a() {
        c cVar;
        try {
            c a2 = this.f2875b.a(this.f2876c);
            if (a2.c()) {
                cVar = c.d();
            } else {
                cVar = c.a(a2.b());
            }
        } catch (e e2) {
            c a3 = c.a();
            this.f2874a.a("Error getting advertising id", (Throwable) e2);
            cVar = a3;
        } catch (Exception e3) {
            o.a((Throwable) new d(e3));
            return;
        }
        this.f2878e.compareAndSet((Object) null, cVar);
    }

    /* compiled from: AdvertisingInfo */
    public static class f {
        /* access modifiers changed from: package-private */
        public c a(Context context) throws Exception {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                return new c(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (LinkageError e2) {
                throw new e(e2);
            }
        }
    }

    /* compiled from: AdvertisingInfo */
    static class c {

        /* renamed from: c  reason: collision with root package name */
        private static final c f2881c = new c((String) null, false);

        /* renamed from: d  reason: collision with root package name */
        private static final c f2882d = new c(AdvertisingInfo.defaultAdvertisingId, true);

        /* renamed from: a  reason: collision with root package name */
        private final String f2883a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2884b;

        c(String str, boolean z) {
            this.f2883a = str;
            this.f2884b = z;
        }

        static c a(String str) {
            return new c(str, false);
        }

        static c d() {
            return f2882d;
        }

        static c a() {
            return f2881c;
        }

        public String b() {
            return this.f2883a;
        }

        public boolean c() {
            return this.f2884b;
        }
    }

    /* compiled from: AdvertisingInfo */
    static class e extends Exception {
        e(Throwable th) {
            super("play-services-ads-identifier does not seems to be in the classpath", th);
        }
    }

    /* compiled from: AdvertisingInfo */
    static class d extends Exception {
        d(Throwable th) {
            super("Error getting advertising id", th);
        }
    }
}
