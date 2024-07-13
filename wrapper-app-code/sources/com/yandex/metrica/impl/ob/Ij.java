package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.If;
import java.util.Collection;

class Ij extends C0660qj {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final TelephonyManager f4274a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public PhoneStateListener f4275b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f4276c;

    /* renamed from: d  reason: collision with root package name */
    private C0635pi f4277d;

    /* renamed from: e  reason: collision with root package name */
    private C0554mc f4278e;

    /* renamed from: f  reason: collision with root package name */
    private final G<Zj> f4279f;

    /* renamed from: g  reason: collision with root package name */
    private final G<Collection<C0755uj>> f4280g;

    /* renamed from: h  reason: collision with root package name */
    private final ICommonExecutor f4281h;
    private final Context i;
    private final C0803wj j;
    private final Uj k;
    private final C0683rj l;
    private final Ed m;
    private C0845yd n;
    private Lj o;
    private final C0869zd p;
    /* access modifiers changed from: private */
    public final C0520l3 q;

    class a implements Runnable {
        a() {
        }

        public void run() {
            PhoneStateListener unused = Ij.this.f4275b = new d(Ij.this, (a) null);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (!Ij.this.f4276c) {
                boolean unused = Ij.this.f4276c = true;
                if (Ij.this.f4275b != null && Ij.this.f4274a != null) {
                    try {
                        Ij.this.f4274a.listen(Ij.this.f4275b, 256);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            if (Ij.this.f4276c) {
                boolean unused = Ij.this.f4276c = false;
                Ij.this.q.a((Object) Ij.this);
                if (Ij.this.f4275b != null && Ij.this.f4274a != null) {
                    try {
                        Ij.this.f4274a.listen(Ij.this.f4275b, 0);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    private class d extends PhoneStateListener {
        private d() {
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            Ij.a(Ij.this, signalStrength);
        }

        /* synthetic */ d(Ij ij, a aVar) {
            this();
        }
    }

    protected Ij(Context context, ICommonExecutor iCommonExecutor) {
        this(context, new Ed(), iCommonExecutor);
    }

    public Context e() {
        return this.i;
    }

    public TelephonyManager f() {
        return this.f4274a;
    }

    /* access modifiers changed from: package-private */
    public synchronized Zj g() {
        C0755uj b2;
        if (this.f4279f.b() || this.f4279f.d()) {
            Zj zj = new Zj(this.j, this.k, this.l);
            C0755uj b3 = zj.b();
            if (b3 != null && b3.p() == null && !this.f4279f.b() && (b2 = this.f4279f.a().b()) != null) {
                zj.b().a(b2.p());
            }
            this.f4279f.a(zj);
        }
        return this.f4279f.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected Ij(Context context, Ed ed, ICommonExecutor iCommonExecutor) {
        this(context, ed, new C0845yd(ed.a()), iCommonExecutor, A2.a(17) ? new C0707sj() : new C0731tj(), new G1(), C0520l3.a());
    }

    public synchronized void b() {
        this.f4281h.execute(new c());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean c() {
        C0554mc mcVar;
        mcVar = this.f4278e;
        return mcVar != null && mcVar.l;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    synchronized boolean d() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x001d }
            com.yandex.metrica.impl.ob.pi r0 = r4.f4277d     // Catch:{ all -> 0x001a }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0017
            com.yandex.metrica.impl.ob.Sh r0 = r0.f()     // Catch:{ all -> 0x001d }
            boolean r0 = r0.s     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r4)
            return r1
        L_0x001a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ij.d():boolean");
    }

    public synchronized void a() {
        this.f4281h.execute(new b());
    }

    public synchronized void a(C0263ak akVar) {
        if (akVar != null) {
            akVar.a(g());
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(com.yandex.metrica.impl.ob.C0779vj r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto L_0x009d
            monitor-enter(r8)     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f4280g     // Catch:{ all -> 0x0097 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0014
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f4280g     // Catch:{ all -> 0x0097 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x008a
        L_0x0014:
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f4280g     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0097 }
            r1.<init>()     // Catch:{ all -> 0x0097 }
            r2 = 17
            boolean r2 = com.yandex.metrica.impl.ob.A2.a((int) r2)     // Catch:{ all -> 0x0097 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x006c
            com.yandex.metrica.impl.ob.zd r2 = r8.p     // Catch:{ all -> 0x0097 }
            android.content.Context r5 = r8.i     // Catch:{ all -> 0x0097 }
            boolean r2 = r2.a(r5)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x006c
            monitor-enter(r8)     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.mc r2 = r8.f4278e     // Catch:{ all -> 0x0069 }
            r5 = 0
            if (r2 == 0) goto L_0x003b
            boolean r2 = r2.k     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            monitor-exit(r8)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x006c
            android.telephony.TelephonyManager r2 = r8.f4274a     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0048
            java.util.List r2 = r2.getAllCellInfo()     // Catch:{ all -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r2 = r3
        L_0x0049:
            boolean r6 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r2)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x006c
        L_0x004f:
            int r6 = r2.size()     // Catch:{ all -> 0x0097 }
            if (r5 >= r6) goto L_0x006c
            java.lang.Object r6 = r2.get(r5)     // Catch:{ all -> 0x0097 }
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.Lj r7 = r8.o     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.uj r6 = r7.a(r6)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0066
            r1.add(r6)     // Catch:{ all -> 0x0097 }
        L_0x0066:
            int r5 = r5 + 1
            goto L_0x004f
        L_0x0069:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x006c:
            int r2 = r1.size()     // Catch:{ all -> 0x0097 }
            if (r2 >= r4) goto L_0x0082
            com.yandex.metrica.impl.ob.Zj r1 = r8.g()     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.uj r1 = r1.b()     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x007d
            goto L_0x0087
        L_0x007d:
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x0097 }
            goto L_0x0086
        L_0x0082:
            java.util.List r1 = com.yandex.metrica.impl.ob.A2.c(r1)     // Catch:{ all -> 0x0097 }
        L_0x0086:
            r3 = r1
        L_0x0087:
            r0.a(r3)     // Catch:{ all -> 0x0097 }
        L_0x008a:
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f4280g     // Catch:{ all -> 0x0097 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0097 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0097 }
            monitor-exit(r8)     // Catch:{ all -> 0x009a }
            r9.a(r0)     // Catch:{ all -> 0x009a }
            goto L_0x009d
        L_0x0097:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009a }
            throw r9     // Catch:{ all -> 0x009a }
        L_0x009a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x009d:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ij.a(com.yandex.metrica.impl.ob.vj):void");
    }

    protected Ij(Context context, Ed ed, C0845yd ydVar, ICommonExecutor iCommonExecutor, Lj lj, G1 g1, C0520l3 l3Var) {
        TelephonyManager telephonyManager;
        this.f4276c = false;
        If.c cVar = G.f4018e;
        long j2 = cVar.f4153a;
        this.f4279f = new G<>(j2, j2 * 2);
        long j3 = cVar.f4153a;
        this.f4280g = new G<>(j3, 2 * j3);
        this.i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f4274a = telephonyManager;
        this.p = a(ydVar, g1);
        this.f4281h = iCommonExecutor;
        iCommonExecutor.execute(new a());
        this.j = new C0803wj(this, ydVar);
        this.k = new Uj(this, ydVar);
        this.l = new C0683rj(this);
        this.m = ed;
        this.n = ydVar;
        this.o = lj;
        this.q = l3Var;
    }

    static void a(Ij ij, SignalStrength signalStrength) {
        C0755uj b2;
        int i2;
        synchronized (ij) {
            if (!ij.f4279f.b() && !ij.f4279f.d() && (b2 = ij.f4279f.a().b()) != null) {
                if (signalStrength.isGsm()) {
                    int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                    i2 = 99 == gsmSignalStrength ? -1 : (gsmSignalStrength * 2) - 113;
                } else {
                    int cdmaDbm = signalStrength.getCdmaDbm();
                    i2 = signalStrength.getEvdoDbm();
                    if (-120 == i2) {
                        i2 = cdmaDbm;
                    } else if (-120 != cdmaDbm) {
                        i2 = Math.min(cdmaDbm, i2);
                    }
                }
                b2.a(Integer.valueOf(i2));
            }
        }
    }

    public void a(C0635pi piVar) {
        this.f4277d = piVar;
        this.m.a(piVar);
        this.n.a(this.m.a());
        this.o.a(piVar.f());
        if (piVar.d() != null) {
            this.f4279f.a(piVar.d().f4783a, piVar.d().f4783a * 2);
            this.f4280g.a(piVar.d().f4783a, piVar.d().f4783a * 2);
        }
    }

    public synchronized void a(C0554mc mcVar) {
        this.f4278e = mcVar;
    }

    public void a(boolean z) {
        this.m.a(z);
        this.n.a(this.m.a());
    }

    private static C0869zd a(C0845yd ydVar, G1 g1) {
        if (A2.a(29)) {
            return g1.c(ydVar);
        }
        return g1.b(ydVar);
    }
}
