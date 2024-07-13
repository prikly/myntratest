package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.l3  reason: case insensitive filesystem */
public class C0520l3 {

    /* renamed from: a  reason: collision with root package name */
    private final Lm f6114a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<b> f6115b = new LinkedBlockingQueue();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<C0620p3<? extends C0570n3>>> f6116c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private WeakHashMap<Object, CopyOnWriteArrayList<d>> f6117d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap<Class, C0570n3> f6118e = new ConcurrentHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.l3$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            while (true) {
                C0520l3.this.getClass();
                try {
                    ((b) C0520l3.this.f6115b.take()).a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C0570n3 f6120a;

        /* renamed from: b  reason: collision with root package name */
        private final C0620p3<? extends C0570n3> f6121b;

        /* synthetic */ b(C0570n3 n3Var, C0620p3 p3Var, a aVar) {
            this(n3Var, p3Var);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                if (!this.f6121b.a(this.f6120a)) {
                    this.f6121b.b(this.f6120a);
                }
            } catch (Throwable unused) {
            }
        }

        private b(C0570n3 n3Var, C0620p3<? extends C0570n3> p3Var) {
            this.f6120a = n3Var;
            this.f6121b = p3Var;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$c */
    private static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C0520l3 f6122a = new C0520l3();
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$d */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final CopyOnWriteArrayList<C0620p3<? extends C0570n3>> f6123a;

        /* renamed from: b  reason: collision with root package name */
        final C0620p3<? extends C0570n3> f6124b;

        /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, C0620p3 p3Var, a aVar) {
            this(copyOnWriteArrayList, p3Var);
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            super.finalize();
            this.f6123a.remove(this.f6124b);
        }

        private d(CopyOnWriteArrayList<C0620p3<? extends C0570n3>> copyOnWriteArrayList, C0620p3<? extends C0570n3> p3Var) {
            this.f6123a = copyOnWriteArrayList;
            this.f6124b = p3Var;
        }
    }

    C0520l3() {
        Lm a2 = Mm.a("YMM-BD", new a());
        this.f6114a = a2;
        a2.start();
    }

    public static final C0520l3 a() {
        return c.f6122a;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(com.yandex.metrica.impl.ob.C0570n3 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x003b }
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.util.concurrent.CopyOnWriteArrayList<com.yandex.metrica.impl.ob.p3<? extends com.yandex.metrica.impl.ob.n3>>> r0 = r5.f6116c     // Catch:{ all -> 0x0038 }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x0014:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0038 }
            com.yandex.metrica.impl.ob.p3 r1 = (com.yandex.metrica.impl.ob.C0620p3) r1     // Catch:{ all -> 0x0038 }
            java.util.concurrent.BlockingQueue<com.yandex.metrica.impl.ob.l3$b> r2 = r5.f6115b     // Catch:{ all -> 0x0038 }
            com.yandex.metrica.impl.ob.l3$b r3 = new com.yandex.metrica.impl.ob.l3$b     // Catch:{ all -> 0x0038 }
            r4 = 0
            r3.<init>(r6, r1, r4)     // Catch:{ all -> 0x0038 }
            r2.add(r3)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, com.yandex.metrica.impl.ob.n3> r0 = r5.f6118e     // Catch:{ all -> 0x003b }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x003b }
            r0.put(r1, r6)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return
        L_0x0038:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r6     // Catch:{ all -> 0x003b }
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0520l3.a(com.yandex.metrica.impl.ob.n3):void");
    }

    public synchronized void a(Object obj, Class cls, C0620p3<? extends C0570n3> p3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6116c.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f6116c.put(cls, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(p3Var);
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f6117d.get(obj);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            this.f6117d.put(obj, copyOnWriteArrayList2);
        }
        copyOnWriteArrayList2.add(new d(copyOnWriteArrayList, p3Var, (a) null));
        C0570n3 n3Var = this.f6118e.get(cls);
        if (n3Var != null) {
            this.f6115b.add(new b(n3Var, p3Var, (a) null));
        }
    }

    public synchronized void a(Object obj) {
        List<d> remove = this.f6117d.remove(obj);
        if (remove != null) {
            for (d dVar : remove) {
                dVar.f6123a.remove(dVar.f6124b);
            }
        }
    }
}
