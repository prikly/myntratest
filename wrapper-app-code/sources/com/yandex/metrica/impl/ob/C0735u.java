package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0640q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.u  reason: case insensitive filesystem */
public class C0735u implements C0640q.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<E1<C0467j0>> f6860a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C0467j0 f6861b;

    /* renamed from: c  reason: collision with root package name */
    private final C0640q f6862c;

    /* renamed from: d  reason: collision with root package name */
    private final ICommonExecutor f6863d;

    /* renamed from: com.yandex.metrica.impl.ob.u$a */
    class a implements E1<C0467j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6864a;

        a(C0735u uVar, String str) {
            this.f6864a = str;
        }

        public void b(Object obj) {
            ((C0467j0) obj).b(this.f6864a);
        }
    }

    public C0735u(ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, P.g().b());
    }

    public void a() {
        this.f6862c.a((C0640q.b) this, C0640q.a.CREATED);
    }

    C0735u(ICommonExecutor iCommonExecutor, C0640q qVar) {
        this.f6860a = new ArrayList();
        this.f6861b = null;
        this.f6863d = iCommonExecutor;
        this.f6862c = qVar;
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
    public void a(com.yandex.metrica.impl.ob.C0467j0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f6861b = r3     // Catch:{ all -> 0x002a }
            monitor-enter(r2)     // Catch:{ all -> 0x002a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0027 }
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r1 = r2.f6860a     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r1 = r2.f6860a     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            com.yandex.metrica.impl.ob.E1 r1 = (com.yandex.metrica.impl.ob.E1) r1
            r1.b(r3)
            goto L_0x0016
        L_0x0026:
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0735u.a(com.yandex.metrica.impl.ob.j0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.app.Activity r3, com.yandex.metrica.impl.ob.C0640q.a r4) {
        /*
            r2 = this;
            r4 = 0
            if (r3 == 0) goto L_0x0008
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r3 = r4
        L_0x0009:
            if (r3 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            java.lang.String r4 = r3.getDataString()
        L_0x0010:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0035
            com.yandex.metrica.impl.ob.u$a r3 = new com.yandex.metrica.impl.ob.u$a
            r3.<init>(r2, r4)
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.j0 r4 = r2.f6861b     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0026
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r4 = r2.f6860a     // Catch:{ all -> 0x0032 }
            r4.add(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0030
        L_0x0026:
            com.yandex.metrica.core.api.executors.ICommonExecutor r0 = r2.f6863d     // Catch:{ all -> 0x0032 }
            com.yandex.metrica.impl.ob.t r1 = new com.yandex.metrica.impl.ob.t     // Catch:{ all -> 0x0032 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0032 }
            r0.execute(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r2)
            goto L_0x0035
        L_0x0032:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0735u.a(android.app.Activity, com.yandex.metrica.impl.ob.q$a):void");
    }
}
