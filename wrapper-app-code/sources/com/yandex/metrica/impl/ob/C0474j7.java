package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.j7  reason: case insensitive filesystem */
public class C0474j7 {

    /* renamed from: a  reason: collision with root package name */
    private String f6030a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6031b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C0499k7> f6032c;

    /* renamed from: d  reason: collision with root package name */
    private final C0275b7 f6033d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6034e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6035f;

    /* renamed from: g  reason: collision with root package name */
    private C0499k7 f6036g;

    /* renamed from: h  reason: collision with root package name */
    private final B0 f6037h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0474j7(android.content.Context r3, com.yandex.metrica.impl.ob.A3 r4) {
        /*
            r2 = this;
            r0 = 21
            boolean r0 = com.yandex.metrica.impl.ob.A2.a((int) r0)
            if (r0 == 0) goto L_0x0020
            r0 = 2
            com.yandex.metrica.impl.ob.k7[] r0 = new com.yandex.metrica.impl.ob.C0499k7[r0]
            com.yandex.metrica.impl.ob.A7 r1 = new com.yandex.metrica.impl.ob.A7
            r1.<init>(r3, r4)
            r4 = 0
            r0[r4] = r1
            com.yandex.metrica.impl.ob.o7 r4 = new com.yandex.metrica.impl.ob.o7
            r4.<init>()
            r1 = 1
            r0[r1] = r4
            java.util.List r4 = java.util.Arrays.asList(r0)
            goto L_0x0029
        L_0x0020:
            com.yandex.metrica.impl.ob.o7 r4 = new com.yandex.metrica.impl.ob.o7
            r4.<init>()
            java.util.List r4 = java.util.Collections.singletonList(r4)
        L_0x0029:
            com.yandex.metrica.impl.ob.B0 r0 = new com.yandex.metrica.impl.ob.B0
            r0.<init>()
            com.yandex.metrica.impl.ob.b7 r1 = new com.yandex.metrica.impl.ob.b7
            r1.<init>()
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0474j7.<init>(android.content.Context, com.yandex.metrica.impl.ob.A3):void");
    }

    private void a() {
        C0499k7 k7Var;
        if (!this.f6035f) {
            Iterator<C0499k7> it = this.f6032c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    k7Var = null;
                    break;
                }
                k7Var = it.next();
                try {
                    C0275b7 b7Var = this.f6033d;
                    String c2 = k7Var.c();
                    b7Var.getClass();
                    System.loadLibrary(c2);
                    break;
                } catch (Throwable unused) {
                }
            }
            this.f6036g = k7Var;
            if (k7Var != null) {
                try {
                    k7Var.a(false);
                } catch (Throwable unused2) {
                }
                this.f6030a = this.f6037h.b(this.f6031b, this.f6036g.a());
            }
        }
        this.f6035f = true;
    }

    C0474j7(Context context, List<C0499k7> list, B0 b0, C0275b7 b7Var) {
        this.f6031b = context;
        this.f6032c = list;
        this.f6037h = b0;
        this.f6033d = b7Var;
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
    public synchronized void a(boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            r4.a()     // Catch:{ all -> 0x0024 }
            monitor-enter(r4)     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.k7 r5 = r4.f6036g     // Catch:{ all -> 0x0021 }
            if (r5 == 0) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = r4.f6030a     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0040
            boolean r3 = r4.f6034e     // Catch:{ all -> 0x0024 }
            if (r3 != 0) goto L_0x0040
            r5.a(r6, r2, r7)     // Catch:{ all -> 0x0024 }
            r4.f6034e = r0     // Catch:{ all -> 0x0024 }
            goto L_0x0040
        L_0x0021:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4.f6034e = r1     // Catch:{ all -> 0x0045 }
            goto L_0x0040
        L_0x0027:
            monitor-enter(r4)     // Catch:{ all -> 0x0045 }
            monitor-enter(r4)     // Catch:{ all -> 0x003d }
            com.yandex.metrica.impl.ob.k7 r5 = r4.f6036g     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003d
            boolean r6 = r4.f6034e     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x003d
            r5.b()     // Catch:{ all -> 0x003d }
            goto L_0x003d
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            throw r5     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4.f6034e = r1     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            throw r5     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0474j7.a(boolean, java.lang.String, java.lang.String):void");
    }

    public void a(String str) {
        C0499k7 k7Var = this.f6036g;
        if (k7Var != null) {
            k7Var.a(str);
        }
    }
}
