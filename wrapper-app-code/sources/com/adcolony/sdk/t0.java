package com.adcolony.sdk;

import android.os.SystemClock;
import com.adcolony.sdk.e0;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.LinkedHashMap;

class t0 {

    /* renamed from: a  reason: collision with root package name */
    private long f10294a = 1800000;

    /* renamed from: b  reason: collision with root package name */
    private int f10295b;

    /* renamed from: c  reason: collision with root package name */
    private long f10296c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10297d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10298e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10299f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f10300g = false;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f10301h = false;
    private boolean i;
    /* access modifiers changed from: private */
    public boolean j;
    private boolean k;
    private u0 l;

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            boolean unused = t0.this.j = true;
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f10303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f10304b;

        b(t0 t0Var, l lVar, k kVar) {
            this.f10303a = lVar;
            this.f10304b = kVar;
        }

        public void run() {
            this.f10303a.b();
            this.f10304b.q().d();
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f10305a;

        c(boolean z) {
            this.f10305a = z;
        }

        public void run() {
            LinkedHashMap<Integer, k0> d2 = a.b().r().d();
            synchronized (d2) {
                for (k0 next : d2.values()) {
                    f1 b2 = c0.b();
                    c0.b(b2, "from_window_focus", this.f10305a);
                    if (t0.this.f10301h && !t0.this.f10300g) {
                        c0.b(b2, "app_in_foreground", false);
                        boolean unused = t0.this.f10301h = false;
                    }
                    new h0("SessionInfo.on_pause", next.getModuleId(), b2).c();
                }
            }
            a.f();
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f10307a;

        d(boolean z) {
            this.f10307a = z;
        }

        public void run() {
            k b2 = a.b();
            LinkedHashMap<Integer, k0> d2 = b2.r().d();
            synchronized (d2) {
                for (k0 next : d2.values()) {
                    f1 b3 = c0.b();
                    c0.b(b3, "from_window_focus", this.f10307a);
                    if (t0.this.f10301h && t0.this.f10300g) {
                        c0.b(b3, "app_in_foreground", true);
                        boolean unused = t0.this.f10301h = false;
                    }
                    new h0("SessionInfo.on_resume", next.getModuleId(), b3).c();
                }
            }
            b2.q().d();
        }
    }

    t0() {
    }

    private void h() {
        a(false);
    }

    private void i() {
        b(false);
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        k b2 = a.b();
        if (!this.f10299f) {
            if (this.i) {
                b2.c(false);
                this.i = false;
            }
            this.f10295b = 0;
            this.f10296c = SystemClock.uptimeMillis();
            this.f10297d = true;
            this.f10299f = true;
            this.f10300g = true;
            this.f10301h = false;
            AdColony.c();
            if (z) {
                f1 b3 = c0.b();
                c0.a(b3, OSOutcomeConstants.OUTCOME_ID, z0.a());
                new h0("SessionInfo.on_start", 1, b3).c();
                l c2 = a.b().r().c();
                if (c2 != null && !AdColony.a((Runnable) new b(this, c2, b2))) {
                    new e0.a().a("RejectedExecutionException on controller update.").a(e0.i);
                }
            }
            b2.r().h();
            v.a().b();
        }
    }

    public void d() {
        a.a("SessionInfo.stopped", (j0) new a());
        this.l = new u0(this);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f10297d;
    }

    public void f(boolean z) {
        this.i = z;
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        this.k = z;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        s0 a2 = a.b().q().a();
        this.f10299f = false;
        this.f10297d = false;
        if (a2 != null) {
            a2.b();
        }
        f1 b2 = c0.b();
        c0.a(b2, "session_length", ((double) (SystemClock.uptimeMillis() - this.f10296c)) / 1000.0d);
        new h0("SessionInfo.on_stop", 1, b2).c();
        a.f();
        AdColony.g();
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z) {
        if (this.f10300g != z) {
            this.f10300g = z;
            this.f10301h = true;
            if (!z) {
                h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f10299f;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f10298e = true;
        this.l.b();
        if (!AdColony.a((Runnable) new c(z))) {
            new e0.a().a("RejectedExecutionException on session pause.").a(e0.i);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        this.f10298e = false;
        this.l.c();
        if (!AdColony.a((Runnable) new d(z))) {
            new e0.a().a("RejectedExecutionException on session resume.").a(e0.i);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z) {
        if (z && this.f10298e) {
            i();
        } else if (!z && !this.f10298e) {
            h();
        }
        this.f10297d = z;
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f10294a;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.f10294a = i2 <= 0 ? this.f10294a : (long) (i2 * 1000);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f10295b;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f10295b++;
    }
}
