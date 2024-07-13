package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.coreutils.services.UtilityServiceConfiguration;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.impl.ob.C0378fa;
import com.yandex.metrica.impl.ob.C0690s2;
import com.yandex.metrica.impl.ob.C0819xb;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import kotlin.jvm.internal.Intrinsics;

public final class F0 {
    private static volatile F0 x;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3973a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C0704sg f3974b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C0509kh f3975c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Jf f3976d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C0454ib f3977e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C0690s2 f3978f;

    /* renamed from: g  reason: collision with root package name */
    private volatile C0335dh f3979g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Pm f3980h;
    private volatile Xj i;
    private volatile E j;
    private volatile C0469j2 k;
    private volatile C0653qc l;
    private volatile C0819xb m;
    private volatile Bb n;
    private volatile I1 o;
    private volatile I p;
    private volatile C0352e9 q;
    private volatile C0351e8 r;
    private C0345e2 s;
    private C0369f1 t;
    private C0701sd u;
    private final C0519l2 v = new a(this);
    private C0480jd w;

    class a implements C0519l2 {
        a(F0 f0) {
        }

        public void a() {
            NetworkServiceLocator.getInstance().onCreate();
        }

        public void b() {
            NetworkServiceLocator.getInstance().onDestroy();
        }
    }

    private F0(Context context) {
        this.f3973a = context;
        this.f3980h = new Pm();
        this.t = new C0369f1(context, this.f3980h.a());
        this.j = new E(this.f3980h.a(), this.t.b());
        this.s = new C0345e2();
        this.w = new C0480jd();
        NetworkServiceLocator.init();
    }

    public static void a(Context context) {
        if (x == null) {
            synchronized (F0.class) {
                if (x == null) {
                    x = new F0(context.getApplicationContext());
                }
            }
        }
    }

    public static F0 g() {
        return x;
    }

    private void y() {
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    ProtobufStateStorage<Ud> a2 = C0378fa.b.a(Ud.class).a(this.f3973a);
                    Ud ud = (Ud) a2.read();
                    Context context = this.f3973a;
                    C0282be beVar = new C0282be();
                    Td td = new Td(ud);
                    C0407ge geVar = new C0407ge();
                    C0257ae aeVar = new C0257ae(this.f3973a);
                    F0 g2 = g();
                    Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
                    C0352e9 s2 = g2.s();
                    Intrinsics.checkNotNullExpressionValue(s2, "GlobalServiceLocator.get…ance().servicePreferences");
                    this.o = new I1(context, a2, beVar, td, geVar, aeVar, new C0307ce(s2), new Vd(), ud, "[PreloadInfoStorage]");
                }
            }
        }
    }

    public C0783w b() {
        return this.t.a();
    }

    public E c() {
        return this.j;
    }

    public I d() {
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    ProtobufStateStorage<C0763v3> a2 = C0378fa.b.a(C0763v3.class).a(this.f3973a);
                    this.p = new I(this.f3973a, a2, new C0787w3(), new C0667r3(), new C0835y3(), new C0245a2(this.f3973a), new C0811x3(s()), new C0691s3(), (C0763v3) a2.read(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.p;
    }

    public Context e() {
        return this.f3973a;
    }

    public C0454ib f() {
        if (this.f3977e == null) {
            synchronized (this) {
                if (this.f3977e == null) {
                    this.f3977e = new C0454ib(this.t.a(), new C0429hb());
                }
            }
        }
        return this.f3977e;
    }

    public C0369f1 h() {
        return this.t;
    }

    public C0653qc i() {
        C0653qc qcVar = this.l;
        if (qcVar == null) {
            synchronized (this) {
                qcVar = this.l;
                if (qcVar == null) {
                    qcVar = new C0653qc(this.f3973a);
                    this.l = qcVar;
                }
            }
        }
        return qcVar;
    }

    public C0480jd j() {
        return this.w;
    }

    public I1 k() {
        y();
        return this.o;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public com.yandex.metrica.impl.ob.Jf l() {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.Jf r0 = r8.f3976d
            if (r0 != 0) goto L_0x004a
            monitor-enter(r8)
            com.yandex.metrica.impl.ob.Jf r0 = r8.f3976d     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0045
            com.yandex.metrica.impl.ob.Jf r0 = new com.yandex.metrica.impl.ob.Jf     // Catch:{ all -> 0x0047 }
            android.content.Context r2 = r8.f3973a     // Catch:{ all -> 0x0047 }
            java.lang.Class<com.yandex.metrica.impl.ob.Jf$e> r1 = com.yandex.metrica.impl.ob.Jf.e.class
            com.yandex.metrica.impl.ob.fa r1 = com.yandex.metrica.impl.ob.C0378fa.b.a(r1)     // Catch:{ all -> 0x0047 }
            android.content.Context r3 = r8.f3973a     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.core.api.ProtobufStateStorage r3 = r1.a(r3)     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.s2 r4 = r8.u()     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.kh r1 = r8.f3975c     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0032
            monitor-enter(r8)     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.kh r1 = r8.f3975c     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x002d
            com.yandex.metrica.impl.ob.kh r1 = new com.yandex.metrica.impl.ob.kh     // Catch:{ all -> 0x002f }
            r1.<init>()     // Catch:{ all -> 0x002f }
            r8.f3975c = r1     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0032:
            com.yandex.metrica.impl.ob.kh r5 = r8.f3975c     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.Pm r1 = r8.f3980h     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r6 = r1.g()     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.Ml r7 = new com.yandex.metrica.impl.ob.Ml     // Catch:{ all -> 0x0047 }
            r7.<init>()     // Catch:{ all -> 0x0047 }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0047 }
            r8.f3976d = r0     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            throw r0
        L_0x004a:
            com.yandex.metrica.impl.ob.Jf r0 = r8.f3976d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.F0.l():com.yandex.metrica.impl.ob.Jf");
    }

    public C0704sg m() {
        if (this.f3974b == null) {
            synchronized (this) {
                if (this.f3974b == null) {
                    this.f3974b = new C0704sg(this.f3973a);
                }
            }
        }
        return this.f3974b;
    }

    public C0345e2 n() {
        return this.s;
    }

    public C0335dh o() {
        if (this.f3979g == null) {
            synchronized (this) {
                if (this.f3979g == null) {
                    this.f3979g = new C0335dh(this.f3973a, this.f3980h.g());
                }
            }
        }
        return this.f3979g;
    }

    public synchronized C0469j2 p() {
        return this.k;
    }

    public Pm q() {
        return this.f3980h;
    }

    public C0819xb r() {
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = new C0819xb(new C0819xb.h(), new C0819xb.d(), new C0819xb.c(), this.f3980h.a(), "ServiceInternal");
                }
            }
        }
        return this.m;
    }

    public C0352e9 s() {
        if (this.q == null) {
            synchronized (this) {
                if (this.q == null) {
                    this.q = new C0352e9(C0477ja.a(this.f3973a).i());
                }
            }
        }
        return this.q;
    }

    public synchronized C0701sd t() {
        if (this.u == null) {
            this.u = new C0701sd(this.f3973a);
        }
        return this.u;
    }

    public C0690s2 u() {
        if (this.f3978f == null) {
            synchronized (this) {
                if (this.f3978f == null) {
                    this.f3978f = new C0690s2(new C0690s2.b(s()));
                }
            }
        }
        return this.f3978f;
    }

    public Xj v() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = new Xj(this.f3973a, this.f3980h.h());
                }
            }
        }
        return this.i;
    }

    public synchronized C0351e8 w() {
        if (this.r == null) {
            this.r = new C0351e8(this.f3973a);
        }
        return this.r;
    }

    public synchronized void x() {
        UtilityServiceLocator.getInstance().initAsync();
        NetworkServiceLocator.getInstance().initAsync();
        this.t.a(this.v);
        l().a();
        y();
        i().b();
    }

    public synchronized void a(C0635pi piVar) {
        if (this.m != null) {
            this.m.a(piVar);
        }
        if (this.f3979g != null) {
            this.f3979g.b(piVar);
        }
        UtilityServiceLocator.getInstance().updateConfiguration(new UtilityServiceConfiguration(piVar.o(), piVar.B()));
        if (this.f3977e != null) {
            this.f3977e.b(piVar);
        }
    }

    public Bb a() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = new Bb(this.f3973a, Cb.a());
                }
            }
        }
        return this.n;
    }

    public synchronized void a(C0494k2 k2Var) {
        this.k = new C0469j2(this.f3973a, k2Var);
    }
}
