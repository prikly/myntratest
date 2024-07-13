package com.yandex.metrica;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.P;
import java.util.HashSet;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ICommonExecutor f3410a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f3411b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3412c;

    /* renamed from: com.yandex.metrica.a$a  reason: collision with other inner class name */
    public interface C0041a {
        void a();

        void b();
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        final ICommonExecutor f3413a;

        /* renamed from: b  reason: collision with root package name */
        final C0041a f3414b;

        /* renamed from: c  reason: collision with root package name */
        private final long f3415c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3416d = true;

        /* renamed from: e  reason: collision with root package name */
        private final Runnable f3417e = new C0042a();

        /* renamed from: com.yandex.metrica.a$b$a  reason: collision with other inner class name */
        class C0042a implements Runnable {
            C0042a() {
            }

            public void run() {
                b.this.f3414b.a();
            }
        }

        b(a aVar, C0041a aVar2, ICommonExecutor iCommonExecutor, long j) {
            this.f3414b = aVar2;
            this.f3413a = iCommonExecutor;
            this.f3415c = j;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f3416d) {
                this.f3416d = true;
                this.f3413a.executeDelayed(this.f3417e, this.f3415c);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.f3416d) {
                this.f3416d = false;
                this.f3413a.remove(this.f3417e);
                this.f3414b.b();
            }
        }
    }

    public a(long j) {
        this(j, P.g().d().b());
    }

    public synchronized void a() {
        this.f3412c = true;
        for (b a2 : this.f3411b) {
            a2.a();
        }
    }

    public synchronized void b() {
        this.f3412c = false;
        for (b b2 : this.f3411b) {
            b2.b();
        }
    }

    a(long j, ICommonExecutor iCommonExecutor) {
        this.f3411b = new HashSet();
        this.f3412c = true;
        this.f3410a = iCommonExecutor;
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
    public synchronized void a(com.yandex.metrica.a.C0041a r8, long r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            monitor-enter(r7)     // Catch:{ all -> 0x0018 }
            com.yandex.metrica.a$b r6 = new com.yandex.metrica.a$b     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r3 = r7.f3410a     // Catch:{ all -> 0x0015 }
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)     // Catch:{ all -> 0x0015 }
            java.util.Set<com.yandex.metrica.a$b> r8 = r7.f3411b     // Catch:{ all -> 0x0015 }
            r8.add(r6)     // Catch:{ all -> 0x0015 }
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            monitor-exit(r7)
            return
        L_0x0015:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            throw r8     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.a.a(com.yandex.metrica.a$a, long):void");
    }
}
