package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.billing_interface.b;
import com.yandex.metrica.impl.ob.C0783w;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.e3  reason: case insensitive filesystem */
public class C0346e3 {

    /* renamed from: a  reason: collision with root package name */
    private C0491k f5700a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5701b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5702c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f5703d;

    /* renamed from: e  reason: collision with root package name */
    private final b f5704e;

    /* renamed from: f  reason: collision with root package name */
    private final C0566n f5705f;

    /* renamed from: g  reason: collision with root package name */
    private final C0541m f5706g;

    /* renamed from: h  reason: collision with root package name */
    private final C0783w f5707h;
    private final C0321d3 i;

    /* renamed from: com.yandex.metrica.impl.ob.e3$a */
    class a implements C0783w.b {
        a() {
        }

        public void a(C0783w.a aVar) {
            C0346e3.a(C0346e3.this, aVar);
        }
    }

    public C0346e3(Context context, Executor executor, Executor executor2, b bVar, C0566n nVar, C0541m mVar, C0783w wVar, C0321d3 d3Var) {
        this.f5701b = context;
        this.f5702c = executor;
        this.f5703d = executor2;
        this.f5704e = bVar;
        this.f5705f = nVar;
        this.f5706g = mVar;
        this.f5707h = wVar;
        this.i = d3Var;
    }

    static void a(C0346e3 e3Var, C0783w.a aVar) {
        e3Var.getClass();
        if (aVar == C0783w.a.VISIBLE) {
            try {
                C0491k kVar = e3Var.f5700a;
                if (kVar != null) {
                    kVar.b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(C0635pi piVar, Boolean bool) {
        C0491k a2;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                a2 = this.i.a(this.f5701b, this.f5702c, this.f5703d, this.f5704e, this.f5705f, this.f5706g);
                this.f5700a = a2;
            }
            a2.a(piVar.c());
            if (this.f5707h.a((C0783w.b) new a()) == C0783w.a.VISIBLE) {
                try {
                    C0491k kVar = this.f5700a;
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Throwable unused) {
                }
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(com.yandex.metrica.impl.ob.C0635pi r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.k r0 = r1.f5700a     // Catch:{ all -> 0x0010 }
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x000e
            com.yandex.metrica.impl.ob.i r2 = r2.c()     // Catch:{ all -> 0x0013 }
            r0.a(r2)     // Catch:{ all -> 0x0013 }
        L_0x000e:
            monitor-exit(r1)
            return
        L_0x0010:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            throw r2     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0346e3.a(com.yandex.metrica.impl.ob.pi):void");
    }
}
