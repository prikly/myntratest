package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.C0361ei;
import com.yandex.metrica.impl.ob.C0635pi;
import com.yandex.metrica.impl.ob.C0659qi;
import com.yandex.metrica.impl.ob.Mg;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.metrica.impl.ob.ri  reason: case insensitive filesystem */
public class C0682ri {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6722a;

    /* renamed from: b  reason: collision with root package name */
    private final I3 f6723b;

    /* renamed from: c  reason: collision with root package name */
    private final C0610oi f6724c;

    /* renamed from: d  reason: collision with root package name */
    private final C0635pi.b f6725d;

    /* renamed from: e  reason: collision with root package name */
    private volatile NetworkTask f6726e;

    /* renamed from: f  reason: collision with root package name */
    private C0386fi f6727f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeProvider f6728g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final I f6729h;
    private final Rh i;
    private final C0520l3 j;

    /* renamed from: com.yandex.metrica.impl.ob.ri$a */
    class a implements Function0<I> {
        a() {
        }

        public Object invoke() {
            return C0682ri.this.f6729h;
        }
    }

    public C0682ri(Context context, String str, Mg.b bVar, C0610oi oiVar) {
        this(context, new E3(str), bVar, oiVar, new C0635pi.b(context), new Pl(context), new SystemTimeProvider(), F0.g().d(), new Rh(), C0520l3.a());
    }

    public Context b() {
        return this.f6722a;
    }

    public synchronized NetworkTask c() {
        if (!e()) {
            return null;
        }
        if (this.f6726e == null) {
            this.f6726e = C0677rd.a(this, (Mg) this.f6727f.b());
        }
        return this.f6726e;
    }

    public C0635pi d() {
        return this.f6727f.d();
    }

    public synchronized boolean e() {
        boolean b2;
        C0635pi d2 = this.f6727f.d();
        b2 = C0585ni.b(d2);
        if (!b2 && !(!C0585ni.a(d2)) && !this.i.a(((Mg) this.f6727f.b()).C(), d2, this.f6729h)) {
            b2 = true;
        }
        return b2;
    }

    private void a(Pl pl, C0337dj djVar, C0635pi piVar) {
        C0635pi.a a2 = piVar.a();
        if (!C0585ni.a(piVar.V())) {
            a2 = a2.k(djVar.a().f5240a);
        }
        String a3 = pl.a();
        if (!C0585ni.a(piVar.i())) {
            a2 = a2.c(a3).d("");
        }
        C0635pi a4 = a2.a();
        b(a4);
        a(a4);
    }

    private synchronized void b(C0635pi piVar) {
        this.f6727f.a(piVar);
        this.f6725d.a(piVar);
        F0.g().a(piVar);
        this.j.a((C0570n3) new C0644q3(this.f6723b.b(), piVar));
    }

    private C0682ri(Context context, I3 i3, Mg.b bVar, C0610oi oiVar, C0635pi.b bVar2, Pl pl, TimeProvider timeProvider, I i2, Rh rh, C0520l3 l3Var) {
        this(context, i3, bVar, oiVar, bVar2, bVar2.a(), pl, timeProvider, i2, rh, l3Var);
    }

    public I3 a() {
        return this.f6723b;
    }

    public void a(C0411gi giVar) {
        ArrayList<C0510ki> arrayList;
        synchronized (this) {
            this.f6726e = null;
        }
        C0610oi oiVar = this.f6724c;
        String b2 = this.f6723b.b();
        C0635pi d2 = this.f6727f.d();
        C0361ei.a aVar = (C0361ei.a) oiVar;
        synchronized (C0361ei.this.f5759b) {
            Collection a2 = C0361ei.this.f5758a.a(b2);
            if (a2 == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(a2);
            }
        }
        for (C0510ki a3 : arrayList) {
            a3.a(giVar, d2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0682ri(android.content.Context r14, com.yandex.metrica.impl.ob.I3 r15, com.yandex.metrica.impl.ob.Mg.b r16, com.yandex.metrica.impl.ob.C0610oi r17, com.yandex.metrica.impl.ob.C0635pi.b r18, com.yandex.metrica.impl.ob.C0635pi r19, com.yandex.metrica.impl.ob.Pl r20, com.yandex.metrica.coreutils.services.TimeProvider r21, com.yandex.metrica.impl.ob.I r22, com.yandex.metrica.impl.ob.Rh r23, com.yandex.metrica.impl.ob.C0520l3 r24) {
        /*
            r13 = this;
            r1 = r14
            com.yandex.metrica.impl.ob.fi r7 = new com.yandex.metrica.impl.ob.fi
            com.yandex.metrica.impl.ob.Mg$c r0 = new com.yandex.metrica.impl.ob.Mg$c
            java.lang.String r2 = r15.b()
            r0.<init>(r14, r2)
            r2 = r16
            r5 = r19
            r7.<init>(r0, r5, r2)
            com.yandex.metrica.impl.ob.ej r0 = com.yandex.metrica.impl.ob.C0362ej.a(r14)
            com.yandex.metrica.impl.ob.ij r2 = new com.yandex.metrica.impl.ob.ij
            r4 = r18
            r2.<init>(r4)
            com.yandex.metrica.impl.ob.dj r11 = r0.a(r14, r2)
            r0 = r13
            r2 = r15
            r3 = r17
            r6 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0682ri.<init>(android.content.Context, com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.Mg$b, com.yandex.metrica.impl.ob.oi, com.yandex.metrica.impl.ob.pi$b, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.Pl, com.yandex.metrica.coreutils.services.TimeProvider, com.yandex.metrica.impl.ob.I, com.yandex.metrica.impl.ob.Rh, com.yandex.metrica.impl.ob.l3):void");
    }

    C0682ri(Context context, I3 i3, C0610oi oiVar, C0635pi.b bVar, C0635pi piVar, Pl pl, C0386fi fiVar, TimeProvider timeProvider, I i2, Rh rh, C0337dj djVar, C0520l3 l3Var) {
        this.f6722a = context;
        this.f6723b = i3;
        this.f6724c = oiVar;
        this.f6725d = bVar;
        this.f6727f = fiVar;
        this.f6728g = timeProvider;
        this.f6729h = i2;
        this.i = rh;
        this.j = l3Var;
        a(pl, djVar, piVar);
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void a(com.yandex.metrica.impl.ob.Ui r6, com.yandex.metrica.impl.ob.Mg r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.yandex.metrica.impl.ob.A2.b((java.util.Map) r8)     // Catch:{ all -> 0x005f }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "Date"
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x005f }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x005f }
            boolean r0 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r8)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0033
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0033 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0033 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0033 }
            java.util.Date r8 = r0.parse(r8)     // Catch:{ all -> 0x0033 }
            long r2 = r8.getTime()     // Catch:{ all -> 0x0033 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r8 = r1
        L_0x0034:
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x005f }
            if (r8 != 0) goto L_0x003d
            r8 = r0
        L_0x003d:
            java.lang.Long r0 = r6.N()     // Catch:{ all -> 0x005f }
            com.yandex.metrica.impl.ob.fm r2 = com.yandex.metrica.impl.ob.C0390fm.c()     // Catch:{ all -> 0x005f }
            long r3 = r8.longValue()     // Catch:{ all -> 0x005f }
            r2.a(r3, r0)     // Catch:{ all -> 0x005f }
            com.yandex.metrica.impl.ob.pi r6 = r5.a((com.yandex.metrica.impl.ob.Ui) r6, (com.yandex.metrica.impl.ob.Mg) r7, (java.lang.Long) r8)     // Catch:{ all -> 0x005f }
            monitor-enter(r5)     // Catch:{ all -> 0x005f }
            r5.f6726e = r1     // Catch:{ all -> 0x005c }
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r5.b(r6)     // Catch:{ all -> 0x005f }
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r5.a((com.yandex.metrica.impl.ob.C0635pi) r6)
            return
        L_0x005c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r6     // Catch:{ all -> 0x005f }
        L_0x005f:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0682ri.a(com.yandex.metrica.impl.ob.Ui, com.yandex.metrica.impl.ob.Mg, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    public C0635pi a(Ui ui, Mg mg, Long l) {
        boolean z;
        String c2 = Tl.c(mg.C());
        Map<String, String> b2 = mg.B().b();
        String n = ui.n();
        String n2 = this.f6727f.d().n();
        if (!Tl.d(Tl.a(n))) {
            n = Tl.d(Tl.a(n2)) ? n2 : null;
        }
        String i2 = this.f6727f.d().i();
        if (TextUtils.isEmpty(i2)) {
            i2 = ui.i();
        }
        C0635pi.a h2 = new C0635pi.a(new C0659qi.b(ui.e())).c(i2).d(ui.h()).c(this.f6728g.currentTimeSeconds()).k(this.f6727f.d().V()).f(ui.o()).c(ui.G()).b(mg.J()).i(ui.y()).e(ui.r()).i(ui.x()).j(ui.D()).a(ui.d()).a(ui.j()).g(ui.t()).a((Map<String, ? extends List<String>>) ui.g()).e(n).h(c2);
        this.i.getClass();
        Map<String, String> a2 = Tl.a(n);
        if (A2.b((Map) b2)) {
            z = A2.b((Map) a2);
        } else {
            z = a2.equals(b2);
        }
        C0635pi.a a3 = h2.c(z).g(Tl.c(b2)).a(ui.E()).d((List<? extends C0604oc>) ui.q()).j((List<? extends C0286bi>) ui.z()).b(ui.f()).a(ui.w()).h((List<? extends Bd>) ui.v()).a(ui.C()).a(ui.H()).a(true);
        Long valueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l != null) {
            valueOf = l;
        }
        return a3.b(valueOf.longValue()).a(((Mg) this.f6727f.b()).a(l.longValue())).b(false).a(ui.p()).a(ui.B()).a(ui.L()).b(ui.K()).c(ui.M()).a(ui.J()).a(ui.I()).a(ui.c()).a(ui.k()).f(ui.s()).a(ui.b()).a(ui.a()).a(ui.l()).a(ui.m()).a(ui.F()).b((Map<String, ? extends Object>) ui.u()).a();
    }

    private void a(C0635pi piVar) {
        ArrayList<C0510ki> arrayList;
        C0610oi oiVar = this.f6724c;
        String b2 = this.f6723b.b();
        C0361ei.a aVar = (C0361ei.a) oiVar;
        synchronized (C0361ei.this.f5759b) {
            C0635pi unused = C0361ei.this.f5760c = piVar;
            Collection a2 = C0361ei.this.f5758a.a(b2);
            if (a2 == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(a2);
            }
        }
        for (C0510ki a3 : arrayList) {
            a3.a(piVar);
        }
    }

    public synchronized boolean a(List<String> list, Map<String, String> map) {
        return !C0585ni.a(this.f6727f.d(), list, map, new a());
    }

    public synchronized void a(Mg.b bVar) {
        this.f6727f.a(bVar);
        Mg mg = (Mg) this.f6727f.b();
        if (mg.K()) {
            boolean z = false;
            List<String> G = mg.G();
            boolean z2 = true;
            C0635pi.a aVar = null;
            if (A2.b((Collection) G) && !A2.b((Collection) mg.J())) {
                aVar = this.f6727f.d().a().b((List<String>) null);
                z = true;
            }
            if (A2.b((Collection) G) || A2.a((Object) G, (Object) mg.J())) {
                z2 = z;
            } else {
                aVar = this.f6727f.d().a().b(G);
            }
            if (z2) {
                C0635pi a2 = aVar.a();
                b(a2);
                a(a2);
            }
        }
    }
}
