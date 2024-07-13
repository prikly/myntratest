package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0394g1;
import com.yandex.metrica.impl.ob.Dg;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Eg.d;

public abstract class Gg<T extends Eg, IA, A extends Dg<IA, A>, L extends Eg.d<T, Eg.c<A>>> implements C0394g1.a {

    /* renamed from: a  reason: collision with root package name */
    private T f4052a;

    /* renamed from: b  reason: collision with root package name */
    private L f4053b;

    /* renamed from: c  reason: collision with root package name */
    private Eg.c<A> f4054c;

    public Gg(L l, C0635pi piVar, A a2) {
        this.f4053b = l;
        C0394g1.a(F0.g().e()).a((C0394g1.a) this);
        a(new Eg.c(piVar, a2));
    }

    public void a() {
        synchronized (this) {
            this.f4052a = null;
        }
    }

    public synchronized T b() {
        if (this.f4052a == null) {
            this.f4052a = this.f4053b.a(this.f4054c);
        }
        return this.f4052a;
    }

    public synchronized A c() {
        return (Dg) this.f4054c.f3958b;
    }

    public synchronized C0635pi d() {
        return this.f4054c.f3957a;
    }

    public synchronized void e() {
        this.f4052a = null;
    }

    /* access modifiers changed from: protected */
    public synchronized void a(Eg.c<A> cVar) {
        this.f4054c = cVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(IA r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.yandex.metrica.impl.ob.Eg$c<A> r0 = r3.f4054c     // Catch:{ all -> 0x0035 }
            A r0 = r0.f3958b     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.Dg r0 = (com.yandex.metrica.impl.ob.Dg) r0     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.b(r4)     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            com.yandex.metrica.impl.ob.Eg$c r0 = new com.yandex.metrica.impl.ob.Eg$c     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.Eg$c<A> r1 = r3.f4054c     // Catch:{ all -> 0x0030 }
            com.yandex.metrica.impl.ob.pi r2 = r1.f3957a     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            A r1 = r1.f3958b     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.Dg r1 = (com.yandex.metrica.impl.ob.Dg) r1     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ all -> 0x0035 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            r3.f4054c = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            r4 = 0
            r3.f4052a = r4     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x0033
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r3)
            return
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Gg.a(java.lang.Object):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(com.yandex.metrica.impl.ob.C0635pi r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.Eg$c r0 = new com.yandex.metrica.impl.ob.Eg$c     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            com.yandex.metrica.impl.ob.Eg$c<A> r1 = r2.f4054c     // Catch:{ all -> 0x001f }
            A r1 = r1.f3958b     // Catch:{ all -> 0x001f }
            com.yandex.metrica.impl.ob.Dg r1 = (com.yandex.metrica.impl.ob.Dg) r1     // Catch:{ all -> 0x001f }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            r2.f4054c = r0     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            r3 = 0
            r2.f4052a = r3     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Gg.a(com.yandex.metrica.impl.ob.pi):void");
    }
}
