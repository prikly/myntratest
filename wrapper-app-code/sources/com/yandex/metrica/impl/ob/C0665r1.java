package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.A1;
import com.yandex.metrica.impl.ob.C0635pi;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.r1  reason: case insensitive filesystem */
public class C0665r1 implements C0618p1 {
    private final C0345e2 A;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C0635pi f6676a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6677b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Context f6678c;

    /* renamed from: d  reason: collision with root package name */
    private volatile MetricaService.d f6679d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Eh f6680e;

    /* renamed from: f  reason: collision with root package name */
    private X0 f6681f;

    /* renamed from: g  reason: collision with root package name */
    private final B0 f6682g;

    /* renamed from: h  reason: collision with root package name */
    private C0471j4 f6683h;
    private final A1 i;
    private Vc j;
    private C0352e9 k;
    private L1 l;
    private final E0 m;
    private final C0866za n;
    private final C0520l3 o;
    private Y6 p;
    private final C0598o6 q;
    private final B7 r;
    private final C0783w s;
    private final ICommonExecutor t;
    private final C0833y1 u;
    private C0564mm<String> v;
    private C0564mm<File> w;
    /* access modifiers changed from: private */
    public C0350e7<String> x;
    private ICommonExecutor y;
    private M1 z;

    /* renamed from: com.yandex.metrica.impl.ob.r1$a */
    class a implements C0564mm<File> {
        a() {
        }

        public void b(Object obj) {
            C0665r1.this.a((File) obj);
        }
    }

    public C0665r1(Context context, MetricaService.d dVar) {
        this(context, dVar, new C0621p4(context));
    }

    static void d(C0665r1 r1Var) {
        if (r1Var.f6676a != null) {
            F0.g().o().a(r1Var.f6676a);
        }
    }

    static void f(C0665r1 r1Var) {
        r1Var.f6680e.b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C0394g1.a(this.f6678c).b(configuration);
    }

    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f6681f.a();
        this.l.a(C0293c0.a(bundle), bundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0665r1(android.content.Context r18, com.yandex.metrica.MetricaService.d r19, com.yandex.metrica.impl.ob.C0621p4 r20) {
        /*
            r17 = this;
            r10 = r18
            r0 = r17
            r1 = r18
            r2 = r19
            com.yandex.metrica.impl.ob.j4 r4 = new com.yandex.metrica.impl.ob.j4
            r3 = r4
            r5 = r20
            r4.<init>(r10, r5)
            com.yandex.metrica.impl.ob.A1 r5 = new com.yandex.metrica.impl.ob.A1
            r4 = r5
            r5.<init>()
            com.yandex.metrica.impl.ob.B0 r6 = new com.yandex.metrica.impl.ob.B0
            r5 = r6
            r6.<init>()
            com.yandex.metrica.impl.ob.E0 r7 = new com.yandex.metrica.impl.ob.E0
            r6 = r7
            r7.<init>()
            com.yandex.metrica.impl.ob.za r8 = new com.yandex.metrica.impl.ob.za
            r7 = r8
            r8.<init>(r10)
            com.yandex.metrica.impl.ob.l3 r8 = com.yandex.metrica.impl.ob.C0520l3.a()
            com.yandex.metrica.impl.ob.Eh r11 = new com.yandex.metrica.impl.ob.Eh
            r9 = r11
            r11.<init>(r10)
            com.yandex.metrica.impl.ob.F0 r10 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.w r10 = r10.b()
            com.yandex.metrica.impl.ob.F0 r11 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.f1 r11 = r11.h()
            com.yandex.metrica.impl.ob.o6 r11 = r11.c()
            com.yandex.metrica.impl.ob.B7 r12 = com.yandex.metrica.impl.ob.B7.a()
            com.yandex.metrica.impl.ob.F0 r13 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Pm r13 = r13.q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r13 = r13.e()
            com.yandex.metrica.impl.ob.F0 r14 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Pm r14 = r14.q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r14 = r14.a()
            com.yandex.metrica.impl.ob.y1 r16 = new com.yandex.metrica.impl.ob.y1
            r15 = r16
            r16.<init>()
            com.yandex.metrica.impl.ob.F0 r16 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.e2 r16 = r16.n()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0665r1.<init>(android.content.Context, com.yandex.metrica.MetricaService$d, com.yandex.metrica.impl.ob.p4):void");
    }

    public void a() {
        if (!this.f6677b) {
            this.k = F0.g().s();
            this.m.a(this.f6678c);
            F0.g().x();
            C0390fm.c().d();
            this.j = new Vc(C0772vc.a(this.f6678c), H2.a(this.f6678c), this.k);
            this.f6676a = new C0635pi.b(this.f6678c).a();
            F0.g().t().getClass();
            this.i.b((A1.e) new C0761v1(this));
            this.i.c((A1.e) new C0785w1(this));
            this.i.a((A1.e) new C0809x1(this));
            this.o.a(this, C0644q3.class, C0620p3.a(new C0713t1(this)).a(new C0689s1(this)).a());
            F0.g().r().a(this.f6678c, this.f6676a);
            this.f6681f = new X0(this.k, this.f6676a.t(), new SystemTimeProvider(), new C0810x2(), C0609oh.a());
            C0635pi piVar = this.f6676a;
            if (piVar != null) {
                this.f6680e.b(piVar);
            }
            a(this.f6676a);
            C0833y1 y1Var = this.u;
            Context context = this.f6678c;
            C0471j4 j4Var = this.f6683h;
            y1Var.getClass();
            this.l = new L1(context, j4Var, F0.g().q().e(), new B0());
            YandexMetrica.getReporter(this.f6678c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File a2 = this.f6682g.a(this.f6678c, "appmetrica_crashes");
            if (a2 != null) {
                C0833y1 y1Var2 = this.u;
                C0564mm<File> mmVar = this.w;
                y1Var2.getClass();
                this.p = new Y6(a2, mmVar);
                this.t.execute(new C0742u6(this.f6678c, a2, this.w));
                this.p.a();
            }
            if (A2.a(21)) {
                C0833y1 y1Var3 = this.u;
                L1 l1 = this.l;
                y1Var3.getClass();
                this.x = new C0719t7(new C0767v7(l1));
                this.v = new C0737u1(this);
                if (this.r.b()) {
                    this.x.a();
                    this.y.executeDelayed(new F7(), 1, TimeUnit.MINUTES);
                }
            }
            F0.g().f().a(this.f6676a);
            this.f6677b = true;
        } else {
            C0394g1.a(this.f6678c).b(this.f6678c.getResources().getConfiguration());
        }
        if (A2.a(21)) {
            this.q.a(this.v);
        }
    }

    public void b(Intent intent) {
        String str;
        this.i.b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data == null) {
                str = null;
            } else {
                str = data.getEncodedAuthority();
            }
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
                this.f6683h.a(str, parseInt, data.getQueryParameter("psid"));
                this.s.a(parseInt);
            }
        }
    }

    public void c(Intent intent) {
        this.i.c(intent);
    }

    private Integer c(Bundle bundle) {
        A3 a3;
        bundle.setClassLoader(A3.class.getClassLoader());
        String str = A3.f3684c;
        try {
            a3 = (A3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            a3 = null;
        }
        if (a3 == null) {
            return null;
        }
        return a3.g();
    }

    public void b() {
        if (A2.a(21)) {
            this.q.b(this.v);
        }
    }

    public void b(Bundle bundle) {
        Integer c2 = c(bundle);
        if (c2 != null) {
            this.s.c(c2.intValue());
        }
    }

    C0665r1(Context context, MetricaService.d dVar, C0471j4 j4Var, A1 a1, B0 b0, E0 e0, C0866za zaVar, C0520l3 l3Var, Eh eh, C0783w wVar, C0598o6 o6Var, B7 b7, ICommonExecutor iCommonExecutor, ICommonExecutor iCommonExecutor2, C0833y1 y1Var, C0345e2 e2Var) {
        this.f6677b = false;
        this.w = new a();
        this.f6678c = context;
        this.f6679d = dVar;
        this.f6683h = j4Var;
        this.i = a1;
        this.f6682g = b0;
        this.m = e0;
        this.n = zaVar;
        this.o = l3Var;
        this.f6680e = eh;
        this.s = wVar;
        this.t = iCommonExecutor;
        this.y = iCommonExecutor2;
        this.u = y1Var;
        this.q = o6Var;
        this.r = b7;
        this.z = new M1((C0618p1) this, context);
        this.A = e2Var;
    }

    private void b(Intent intent, int i2) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            boolean z2 = true;
            if (!(intent.getData() == null)) {
                Bundle extras = intent.getExtras();
                C0859z3 z3Var = new C0859z3(extras);
                if (!C0859z3.a(z3Var, this.f6678c)) {
                    C0293c0 a2 = C0293c0.a(extras);
                    boolean z3 = a2.f5574a == null;
                    if (C0244a1.EVENT_TYPE_UNDEFINED.b() != a2.f5578e) {
                        z2 = false;
                    }
                    if (!z2 && !z3) {
                        try {
                            this.l.a(C0447i4.a(z3Var), a2, new D3(z3Var));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        this.f6679d.a(i2);
    }

    static void b(C0665r1 r1Var, C0635pi piVar) {
        Vc vc = r1Var.j;
        if (vc != null) {
            vc.a(piVar);
        }
    }

    public void a(Intent intent, int i2) {
        b(intent, i2);
    }

    public void a(Intent intent, int i2, int i3) {
        b(intent, i3);
    }

    public void a(Intent intent) {
        this.i.a(intent);
    }

    static void a(C0665r1 r1Var, C0635pi piVar) {
        r1Var.f6676a = piVar;
        Vc vc = r1Var.j;
        if (vc != null) {
            vc.a(piVar);
        }
        r1Var.f6681f.a(r1Var.f6676a.t());
        r1Var.n.a(piVar);
        r1Var.f6680e.b(piVar);
    }

    static void a(C0665r1 r1Var, Intent intent) {
        r1Var.f6680e.a();
        r1Var.A.a(Tl.f(intent.getStringExtra("screen_size")));
    }

    @Deprecated
    public void a(String str, int i2, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.l.a(new C0293c0(str2, str, i2), bundle);
    }

    public void a(int i2, Bundle bundle) {
        this.z.a(i2, bundle);
    }

    public void a(Bundle bundle) {
        Integer c2 = c(bundle);
        if (c2 != null) {
            this.s.b(c2.intValue());
        }
    }

    public void a(MetricaService.d dVar) {
        this.f6679d = dVar;
    }

    public void a(File file) {
        this.l.a(file);
    }

    private void a(C0635pi piVar) {
        Vc vc = this.j;
        if (vc != null) {
            vc.a(piVar);
        }
    }
}
