package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.sg  reason: case insensitive filesystem */
public class C0704sg {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C0728tg> f6785a;

    /* renamed from: b  reason: collision with root package name */
    private C0334dg f6786b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6787c;

    /* renamed from: d  reason: collision with root package name */
    private final C0251a8 f6788d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f6789e;

    /* renamed from: com.yandex.metrica.impl.ob.sg$a */
    public interface a {
        void a(C0334dg dgVar);
    }

    public C0704sg(Context context) {
        this(context, F0.g().w().a());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(com.yandex.metrica.impl.ob.C0334dg r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f6786b = r3     // Catch:{ all -> 0x002f }
            r0 = 1
            r2.f6787c = r0     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.a8 r1 = r2.f6788d     // Catch:{ all -> 0x002f }
            r1.a((com.yandex.metrica.impl.ob.C0334dg) r3)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.a8 r3 = r2.f6788d     // Catch:{ all -> 0x002f }
            r3.a((boolean) r0)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.dg r3 = r2.f6786b     // Catch:{ all -> 0x002f }
            monitor-enter(r2)     // Catch:{ all -> 0x002f }
            java.util.Set<com.yandex.metrica.impl.ob.tg> r0 = r2.f6785a     // Catch:{ all -> 0x002c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002c }
        L_0x0019:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.tg r1 = (com.yandex.metrica.impl.ob.C0728tg) r1     // Catch:{ all -> 0x002c }
            r1.a(r3)     // Catch:{ all -> 0x002c }
            goto L_0x0019
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0704sg.a(com.yandex.metrica.impl.ob.dg):void");
    }

    public void b() {
        if (!this.f6787c) {
            Context context = this.f6789e;
            F0 g2 = F0.g();
            Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
            Pm q = g2.q();
            Intrinsics.checkNotNullExpressionValue(q, "GlobalServiceLocator.get…).serviceExecutorProvider");
            new C0558mg(this, new C0800wg(context, q.a()), new C0409gg(context), new C0824xg(context, (C0565mn) null, (M0) null, 6)).b();
        }
    }

    C0704sg(Context context, C0251a8 a8Var) {
        this.f6785a = new HashSet();
        this.f6789e = context;
        this.f6788d = a8Var;
        this.f6786b = a8Var.g();
        this.f6787c = a8Var.h();
    }

    public C0334dg a() {
        return this.f6786b;
    }

    public synchronized void a(C0728tg tgVar) {
        this.f6785a.add(tgVar);
        if (this.f6787c) {
            tgVar.a(this.f6786b);
        }
    }
}
