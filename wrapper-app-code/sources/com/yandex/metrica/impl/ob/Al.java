package com.yandex.metrica.impl.ob;

import java.lang.ref.WeakReference;
import java.util.List;

class Al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeakReference f3713a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f3714b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0389fl f3715c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0805wl f3716d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Bk f3717e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f3718f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Bl f3719g;

    Al(Bl bl, WeakReference weakReference, List list, C0389fl flVar, C0805wl wlVar, Bk bk, boolean z) {
        this.f3719g = bl;
        this.f3713a = weakReference;
        this.f3714b = list;
        this.f3715c = flVar;
        this.f3716d = wlVar;
        this.f3717e = bk;
        this.f3718f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f3713a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            com.yandex.metrica.impl.ob.Bl r1 = r11.f3719g
            com.yandex.metrica.impl.ob.Bl$a r1 = r1.f3782f
            java.util.List r2 = r11.f3714b
            com.yandex.metrica.impl.ob.Bl r3 = r11.f3719g
            java.util.List r3 = r3.f3783g
            com.yandex.metrica.impl.ob.fl r4 = r11.f3715c
            r1.getClass()
            java.util.Iterator r1 = r2.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.vl r2 = (com.yandex.metrica.impl.ob.C0781vl) r2
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L_0x0022
            goto L_0x004b
        L_0x0035:
            java.util.Iterator r1 = r3.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004d
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.vl r2 = (com.yandex.metrica.impl.ob.C0781vl) r2
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L_0x0039
        L_0x004b:
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r1 == 0) goto L_0x0056
            com.yandex.metrica.impl.ob.Uk r1 = new com.yandex.metrica.impl.ob.Uk
            r1.<init>()
            goto L_0x005b
        L_0x0056:
            com.yandex.metrica.impl.ob.pk r1 = new com.yandex.metrica.impl.ob.pk
            r1.<init>()
        L_0x005b:
            r7 = r1
            com.yandex.metrica.impl.ob.Bl r1 = r11.f3719g
            com.yandex.metrica.impl.ob.lk r1 = r1.f3779c
            long r8 = r1.a()
            com.yandex.metrica.impl.ob.Bl r1 = r11.f3719g
            com.yandex.metrica.impl.ob.Bl.a(r1, r0, r8)
            r10 = 0
            com.yandex.metrica.impl.ob.Bl r1 = r11.f3719g     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.el r1 = r1.f3780d     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.wl r3 = r11.f3716d     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.Bk r2 = r11.f3717e     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.Ak r4 = r2.c()     // Catch:{ all -> 0x0084 }
            boolean r6 = r11.f3718f     // Catch:{ all -> 0x0084 }
            r2 = r0
            r5 = r7
            com.yandex.metrica.impl.ob.dl r1 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0084 }
            r3 = r1
            goto L_0x008f
        L_0x0084:
            r1 = move-exception
            com.yandex.metrica.impl.ob.Bl r2 = r11.f3719g
            java.util.List r3 = r11.f3714b
            com.yandex.metrica.impl.ob.wl r4 = r11.f3716d
            com.yandex.metrica.impl.ob.Bl.a(r2, r3, r1, r4)
            r3 = r10
        L_0x008f:
            if (r3 == 0) goto L_0x00a1
            com.yandex.metrica.impl.ob.Bl r1 = r11.f3719g
            java.util.List r2 = r11.f3714b
            java.util.List r4 = r7.a()
            com.yandex.metrica.impl.ob.fl r6 = r11.f3715c
            com.yandex.metrica.impl.ob.Bk r7 = r11.f3717e
            r5 = r0
            com.yandex.metrica.impl.ob.Bl.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Al.run():void");
    }
}
