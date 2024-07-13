package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Bk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Bl {

    /* renamed from: a  reason: collision with root package name */
    private Runnable f3777a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f3778b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0537lk f3779c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C0364el f3780d;

    /* renamed from: e  reason: collision with root package name */
    private final C0876zk f3781e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a f3782f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final List<C0829xl> f3783g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Vk> f3784h;
    private final Bk.a i;

    static class a {
        a() {
        }
    }

    Bl(ICommonExecutor iCommonExecutor, C0537lk lkVar, C0876zk zkVar) {
        this(iCommonExecutor, lkVar, zkVar, new C0364el(), new a(), Collections.emptyList(), new Bk.a());
    }

    static void a(Bl bl, List list, Throwable th, C0805wl wlVar) {
        bl.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0781vl) it.next()).a(th, wlVar);
        }
        for (C0829xl a2 : bl.f3783g) {
            a2.a(th, wlVar);
        }
    }

    Bl(ICommonExecutor iCommonExecutor, C0537lk lkVar, C0876zk zkVar, C0364el elVar, a aVar, List<Vk> list, Bk.a aVar2) {
        this.f3783g = new ArrayList();
        this.f3778b = iCommonExecutor;
        this.f3779c = lkVar;
        this.f3781e = zkVar;
        this.f3780d = elVar;
        this.f3782f = aVar;
        this.f3784h = list;
        this.i = aVar2;
    }

    static void a(Bl bl, List list, C0339dl dlVar, List list2, Activity activity, C0389fl flVar, Bk bk, long j) {
        bl.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0781vl) it.next()).a(j, activity, dlVar, list2, flVar, bk);
        }
        for (C0829xl a2 : bl.f3783g) {
            a2.a(j, activity, dlVar, list2, flVar, bk);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0829xl... xlVarArr) {
        this.f3783g.addAll(Arrays.asList(xlVarArr));
    }

    static void a(Bl bl, Activity activity, long j) {
        for (C0829xl a2 : bl.f3783g) {
            a2.a(activity, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Activity activity, long j, C0389fl flVar, C0805wl wlVar, List<C0781vl> list) {
        boolean z;
        Activity activity2 = activity;
        Iterator<Vk> it = this.f3784h.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().a(activity, wlVar)) {
                    z = true;
                    break;
                }
            } else {
                C0805wl wlVar2 = wlVar;
                z = false;
                break;
            }
        }
        WeakReference weakReference = new WeakReference(activity);
        Bk.a aVar = this.i;
        C0876zk zkVar = this.f3781e;
        aVar.getClass();
        C0389fl flVar2 = flVar;
        Al al = new Al(this, weakReference, list, flVar2, wlVar, new Bk(zkVar, flVar2), z);
        Runnable runnable = this.f3777a;
        if (runnable != null) {
            this.f3778b.remove(runnable);
        }
        this.f3777a = al;
        for (C0829xl a2 : this.f3783g) {
            a2.a(activity, z);
        }
        long j2 = j;
        this.f3778b.executeDelayed(al, j);
    }
}
