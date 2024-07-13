package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.a;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.C0242a;
import com.yandex.metrica.impl.ob.C0640q;
import com.yandex.metrica.impl.ob.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.j1  reason: case insensitive filesystem */
public class C0468j1 extends B implements K0 {
    private static final Kn<String> y = new Hn(new Fn("Referral url"));
    private static final Long z = Long.valueOf(TimeUnit.SECONDS.toMillis(5));
    private final com.yandex.metrica.a p;
    private final i q;
    private final C0436hi r;
    private C0242a s;
    private final C0757ul t;
    private final r u;
    private final AtomicBoolean v;
    /* access modifiers changed from: private */
    public final C0495k3 w;
    private final C0474j7 x;

    /* renamed from: com.yandex.metrica.impl.ob.j1$a */
    class a implements C0242a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ICommonExecutor f6005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0344e1 f6006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0834y2 f6007c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C0834y2 f6008d;

        /* renamed from: com.yandex.metrica.impl.ob.j1$a$a  reason: collision with other inner class name */
        class C0052a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0790w6 f6010a;

            C0052a(C0790w6 w6Var) {
                this.f6010a = w6Var;
            }

            public void run() {
                C0468j1.this.a(this.f6010a);
                if (a.this.f6006b.a(this.f6010a.f7020a.f3927f)) {
                    a.this.f6007c.a().a(this.f6010a);
                }
                if (a.this.f6006b.b(this.f6010a.f7020a.f3927f)) {
                    a.this.f6008d.a().a(this.f6010a);
                }
            }
        }

        a(ICommonExecutor iCommonExecutor, C0344e1 e1Var, C0834y2 y2Var, C0834y2 y2Var2) {
            this.f6005a = iCommonExecutor;
            this.f6006b = e1Var;
            this.f6007c = y2Var;
            this.f6008d = y2Var2;
        }

        public void a() {
            this.f6005a.execute(new C0052a(C0468j1.this.w.a()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j1$b */
    class b implements a.C0041a {
        b() {
        }

        public void a() {
            C0468j1 j1Var = C0468j1.this;
            j1Var.i.a(j1Var.f3721b.a());
        }

        public void b() {
            C0468j1 j1Var = C0468j1.this;
            j1Var.i.b(j1Var.f3721b.a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j1$c */
    static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public C0757ul a(Context context, ICommonExecutor iCommonExecutor, C0277b9 b9Var, C0468j1 j1Var, C0436hi hiVar) {
            return new C0757ul(context, b9Var, j1Var, iCommonExecutor, hiVar.d());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0468j1(android.content.Context r26, com.yandex.metrica.impl.ob.A3 r27, com.yandex.metrica.i r28, com.yandex.metrica.impl.ob.T1 r29, com.yandex.metrica.impl.ob.C0474j7 r30, com.yandex.metrica.impl.ob.C0436hi r31, com.yandex.metrica.impl.ob.C0834y2 r32, com.yandex.metrica.impl.ob.C0834y2 r33, com.yandex.metrica.impl.ob.C0277b9 r34, com.yandex.metrica.impl.ob.P r35, com.yandex.metrica.impl.ob.A0 r36) {
        /*
            r25 = this;
            r2 = r28
            com.yandex.metrica.impl.ob.Q1 r5 = new com.yandex.metrica.impl.ob.Q1
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            com.yandex.metrica.CounterConfiguration$b r1 = com.yandex.metrica.CounterConfiguration.b.MAIN
            r0.<init>(r2, r1)
            java.lang.String r1 = r2.userProfileID
            r3 = r27
            r5.<init>(r3, r0, r1)
            com.yandex.metrica.a r6 = new com.yandex.metrica.a
            java.lang.Integer r0 = r2.sessionTimeout
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 10
            long r0 = r0.toMillis(r3)
            goto L_0x0026
        L_0x0021:
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x0026:
            r6.<init>(r0)
            com.yandex.metrica.impl.ob.e1 r0 = new com.yandex.metrica.impl.ob.e1
            r8 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.bm r9 = r35.j()
            com.yandex.metrica.core.api.executors.ICommonExecutor r13 = r35.c()
            com.yandex.metrica.impl.ob.j1$c r0 = new com.yandex.metrica.impl.ob.j1$c
            r15 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.r r0 = new com.yandex.metrica.impl.ob.r
            r16 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.Zg r0 = new com.yandex.metrica.impl.ob.Zg
            r17 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.Yg r0 = new com.yandex.metrica.impl.ob.Yg
            r18 = r0
            java.lang.String r1 = r2.appVersion
            java.lang.String r3 = r2.f3627a
            r0.<init>(r1, r3)
            com.yandex.metrica.impl.ob.s6 r0 = new com.yandex.metrica.impl.ob.s6
            r19 = r0
            r14 = r36
            r0.<init>(r14)
            com.yandex.metrica.impl.ob.X6 r0 = new com.yandex.metrica.impl.ob.X6
            r20 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.S6 r0 = new com.yandex.metrica.impl.ob.S6
            r21 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.M6 r0 = new com.yandex.metrica.impl.ob.M6
            r22 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.K6 r0 = new com.yandex.metrica.impl.ob.K6
            r23 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.zg r24 = r35.k()
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = r29
            r4 = r30
            r7 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0468j1.<init>(android.content.Context, com.yandex.metrica.impl.ob.A3, com.yandex.metrica.i, com.yandex.metrica.impl.ob.T1, com.yandex.metrica.impl.ob.j7, com.yandex.metrica.impl.ob.hi, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.b9, com.yandex.metrica.impl.ob.P, com.yandex.metrica.impl.ob.A0):void");
    }

    private void h() {
        this.i.a(this.f3721b.a());
        this.p.a(new b(), z.longValue());
    }

    public void a(boolean z2) {
    }

    public void b(Activity activity) {
        if (this.u.a(activity, r.a.PAUSED)) {
            String str = null;
            if (activity != null) {
                str = activity.getClass().getSimpleName();
            }
            d(str);
            this.p.a();
            if (activity != null) {
                this.t.a(activity);
            }
        }
    }

    public void c(String str, String str2) {
        super.c(str, str2);
        this.x.a(this.f3721b.f4805c.a());
    }

    public final void g() {
        if (this.v.compareAndSet(false, true)) {
            this.s.c();
        }
    }

    public void a(String str, boolean z2) {
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("App opened via deeplink: " + f(str));
        }
        this.i.a(C0856z0.a("open", str, z2, this.f3722c), this.f3721b);
    }

    public void b(boolean z2) {
        this.f3721b.b().b(z2);
    }

    public void b(JSONObject jSONObject) {
        T1 t1 = this.i;
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J(jSONObject.toString(), "view_tree", C0244a1.EVENT_TYPE_VIEW_TREE.b(), 0, cmVar), this.f3721b);
    }

    public void a(String str) {
        ((Hn) y).a(str);
        this.i.a(C0856z0.a("referral", str, false, this.f3722c), this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("Referral URL received: " + f(str));
        }
    }

    public void a(C0640q.c cVar) {
        if (cVar == C0640q.c.WATCHING) {
            if (this.f3722c.isEnabled()) {
                this.f3722c.i("Enable activity auto tracking");
            }
        } else if (this.f3722c.isEnabled()) {
            C0315cm cmVar = this.f3722c;
            cmVar.w("Could not enable activity auto tracking. " + cVar.f6502a);
        }
    }

    public void a(Activity activity) {
        if (this.u.a(activity, r.a.RESUMED)) {
            String str = null;
            if (activity != null) {
                str = activity.getClass().getSimpleName();
            }
            e(str);
            this.p.b();
            if (activity != null) {
                this.t.b(activity);
            }
        }
    }

    public void a(Location location) {
        this.f3721b.b().a(location);
        if (this.f3722c.isEnabled()) {
            this.f3722c.fi("Set location: %s", location);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0468j1(android.content.Context r17, com.yandex.metrica.i r18, com.yandex.metrica.impl.ob.T1 r19, com.yandex.metrica.impl.ob.C0474j7 r20, com.yandex.metrica.impl.ob.Q1 r21, com.yandex.metrica.a r22, com.yandex.metrica.impl.ob.C0436hi r23, com.yandex.metrica.impl.ob.C0344e1 r24, com.yandex.metrica.impl.ob.C0290bm r25, com.yandex.metrica.impl.ob.C0834y2 r26, com.yandex.metrica.impl.ob.C0834y2 r27, com.yandex.metrica.impl.ob.C0277b9 r28, com.yandex.metrica.core.api.executors.ICommonExecutor r29, com.yandex.metrica.impl.ob.A0 r30, com.yandex.metrica.impl.ob.C0468j1.c r31, com.yandex.metrica.impl.ob.r r32, com.yandex.metrica.impl.ob.Zg r33, com.yandex.metrica.impl.ob.Yg r34, com.yandex.metrica.impl.ob.C0694s6 r35, com.yandex.metrica.impl.ob.X6 r36, com.yandex.metrica.impl.ob.S6 r37, com.yandex.metrica.impl.ob.M6 r38, com.yandex.metrica.impl.ob.K6 r39, com.yandex.metrica.impl.ob.C0872zg r40) {
        /*
            r16 = this;
            r13 = r16
            r14 = r18
            r15 = r23
            com.yandex.metrica.rtm.wrapper.k r0 = r19.b()
            java.lang.String r1 = r14.apiKey
            r2 = 1
            r3 = r33
            com.yandex.metrica.rtm.wrapper.d r6 = r3.a(r0, r1, r2)
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r30
            r5 = r25
            r7 = r34
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r13.v = r0
            com.yandex.metrica.impl.ob.k3 r0 = new com.yandex.metrica.impl.ob.k3
            r0.<init>()
            r13.w = r0
            com.yandex.metrica.impl.ob.Q1 r0 = r13.f3721b
            com.yandex.metrica.impl.ob.ie r1 = r13.a((com.yandex.metrica.i) r14)
            r0.a((com.yandex.metrica.impl.ob.C0457ie) r1)
            r0 = r22
            r13.p = r0
            r0 = r20
            r13.x = r0
            r13.q = r14
            r0 = r32
            r13.u = r0
            r30 = r31
            r31 = r17
            r32 = r29
            r33 = r28
            r34 = r16
            r35 = r23
            com.yandex.metrica.impl.ob.ul r0 = r30.a(r31, r32, r33, r34, r35)
            r13.t = r0
            r13.r = r15
            r15.a((com.yandex.metrica.impl.ob.C0414gl) r0)
            java.lang.Boolean r0 = r14.nativeCrashReporting
            com.yandex.metrica.impl.ob.Q1 r1 = r13.f3721b
            r13.a((java.lang.Boolean) r0, (com.yandex.metrica.impl.ob.Q1) r1)
            r17.getApplicationContext()
            r23.b()
            com.yandex.metrica.impl.ob.Bg r0 = com.yandex.metrica.impl.ob.Bg.f3771b
            r1 = r24
            r2 = r26
            r3 = r27
            r4 = r29
            com.yandex.metrica.impl.ob.a r0 = r13.a(r4, r1, r2, r3)
            r13.s = r0
            java.lang.Boolean r0 = r14.k
            boolean r0 = com.yandex.metrica.impl.ob.C0267b.a((java.lang.Boolean) r0)
            if (r0 == 0) goto L_0x0093
            r16.g()
        L_0x0093:
            r16.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0468j1.<init>(android.content.Context, com.yandex.metrica.i, com.yandex.metrica.impl.ob.T1, com.yandex.metrica.impl.ob.j7, com.yandex.metrica.impl.ob.Q1, com.yandex.metrica.a, com.yandex.metrica.impl.ob.hi, com.yandex.metrica.impl.ob.e1, com.yandex.metrica.impl.ob.bm, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.y2, com.yandex.metrica.impl.ob.b9, com.yandex.metrica.core.api.executors.ICommonExecutor, com.yandex.metrica.impl.ob.A0, com.yandex.metrica.impl.ob.j1$c, com.yandex.metrica.impl.ob.r, com.yandex.metrica.impl.ob.Zg, com.yandex.metrica.impl.ob.Yg, com.yandex.metrica.impl.ob.s6, com.yandex.metrica.impl.ob.X6, com.yandex.metrica.impl.ob.S6, com.yandex.metrica.impl.ob.M6, com.yandex.metrica.impl.ob.K6, com.yandex.metrica.impl.ob.zg):void");
    }

    private C0242a a(ICommonExecutor iCommonExecutor, C0344e1 e1Var, C0834y2 y2Var, C0834y2 y2Var2) {
        return new C0242a(new a(iCommonExecutor, e1Var, y2Var, y2Var2));
    }

    public void a(JSONObject jSONObject) {
        T1 t1 = this.i;
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J(jSONObject.toString(), "view_tree", C0244a1.EVENT_TYPE_RAW_VIEW_TREE.b(), 0, cmVar), this.f3721b);
    }

    public void a(C0538ll llVar, boolean z2) {
        this.t.a(llVar, z2);
    }

    public void a(D2 d2) {
        d2.a(this.f3722c);
    }

    private void a(Boolean bool, Q1 q1) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        boolean booleanValue = bool.booleanValue();
        this.x.a(booleanValue, q1.b().a(), q1.f4805c.a());
        if (this.f3722c.isEnabled()) {
            this.f3722c.fi("Set report native crashes enabled: %b", Boolean.valueOf(booleanValue));
        }
    }

    private C0457ie a(i iVar) {
        PreloadInfo preloadInfo = iVar.preloadInfo;
        C0315cm cmVar = this.f3722c;
        Boolean bool = iVar.i;
        Boolean bool2 = Boolean.FALSE;
        if (bool == null) {
            bool = bool2;
        }
        return new C0457ie(preloadInfo, cmVar, bool.booleanValue());
    }
}
