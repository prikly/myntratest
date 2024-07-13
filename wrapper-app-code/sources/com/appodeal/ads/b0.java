package com.appodeal.ads;

import android.os.Handler;
import android.text.TextUtils;
import com.appodeal.ads.Native;
import com.appodeal.ads.context.b;
import com.appodeal.ads.l;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.o1;
import com.appodeal.ads.r;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.EventsTracker;
import com.appodeal.ads.utils.ExchangeAd;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.d0;
import com.appodeal.ads.utils.o;
import com.appodeal.ads.utils.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public abstract class b0<AdObjectType extends l, AdRequestType extends r<AdObjectType>, ReferenceObjectType> {

    /* renamed from: a  reason: collision with root package name */
    public u<AdObjectType, AdRequestType, ?> f16300a;

    /* renamed from: b  reason: collision with root package name */
    public final g<AdRequestType, AdObjectType, ReferenceObjectType> f16301b;

    public b0(g<AdRequestType, AdObjectType, ReferenceObjectType> gVar) {
        this.f16301b = gVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(r rVar, l lVar, Object obj) {
        this.f16301b.a(rVar, lVar, obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(r rVar, l lVar, Object obj, LoadingError loadingError) {
        this.f16301b.b(rVar, lVar, obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(r rVar, l lVar) {
        this.f16301b.b(rVar, lVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(r rVar, l lVar) {
        this.f16301b.e(rVar, lVar);
    }

    public void a(r rVar, j1 j1Var) {
    }

    public final void a(t2 t2Var, l lVar) {
        a(t2Var, lVar, (LoadingError) null);
    }

    public final void a(u<AdObjectType, AdRequestType, ?> uVar) {
        this.f16300a = uVar;
    }

    @Deprecated
    public boolean a() {
        return !(this instanceof Native.b);
    }

    public boolean a(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return adrequesttype.v;
    }

    public final void b(AdRequestType adrequesttype) {
        this.f16300a.a(adrequesttype, 0, false, false);
    }

    public boolean b() {
        return this instanceof o1.b;
    }

    public boolean b(r rVar, l lVar, l2 l2Var) {
        return rVar.z;
    }

    public boolean c(r rVar, l lVar, l2 l2Var) {
        return rVar.C;
    }

    public final void d(r rVar, l lVar, l2 l2Var) {
        h5.f16458a.post(new Runnable(rVar, lVar, l2Var) {
            public final /* synthetic */ r f$1;
            public final /* synthetic */ l f$2;
            public final /* synthetic */ Object f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                b0.this.a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public boolean d(AdRequestType adrequesttype) {
        return true;
    }

    public g e(r rVar, l lVar, l2 l2Var) {
        return this.f16300a.e();
    }

    public final void f(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        h5.f16458a.post(new Runnable(adrequesttype, adobjecttype) {
            public final /* synthetic */ r f$1;
            public final /* synthetic */ l f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                b0.this.c(this.f$1, this.f$2);
            }
        });
    }

    public abstract void f(r rVar, l lVar, l2 l2Var);

    public final void g(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        h5.f16458a.post(new Runnable(adrequesttype, adobjecttype) {
            public final /* synthetic */ r f$1;
            public final /* synthetic */ l f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                b0.this.d(this.f$1, this.f$2);
            }
        });
    }

    public abstract void g(r rVar, l lVar, l2 l2Var);

    public void h(AdRequestType adrequesttype, AdObjectType adobjecttype) {
    }

    public abstract void h(r rVar, l lVar, l2 l2Var);

    public void i(r rVar, l lVar) {
    }

    public final void i(r rVar, l lVar, l2 l2Var) {
        try {
            if (!b(rVar, lVar, l2Var)) {
                rVar.z = true;
                rVar.o = System.currentTimeMillis();
                lVar.getClass();
                d0.a(lVar);
                ExchangeAd exchangeAd = lVar.i;
                if (exchangeAd != null) {
                    exchangeAd.trackFinish();
                }
                UnifiedAdType unifiedadtype = lVar.f16573f;
                if (unifiedadtype != null) {
                    unifiedadtype.onFinished();
                }
                if (lVar.q == 0) {
                    lVar.q = System.currentTimeMillis();
                }
                this.f16300a.a(LogConstants.EVENT_FINISHED, (AdUnit) lVar, (LoadingError) null);
                EventsTracker.get().a(this.f16300a.f17435f, lVar, EventsTracker.EventType.Finish);
                k0.a(rVar, lVar, Integer.valueOf(e(rVar, lVar, l2Var).f17248a), Double.valueOf(this.f16300a.h()));
                g(rVar, lVar, l2Var);
                h5.f16458a.post(new z(this, rVar, lVar, l2Var));
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public void j(r rVar, l lVar) {
    }

    public final synchronized void j(r rVar, l lVar, l2 l2Var) {
        if (rVar != null) {
            try {
                if (!c(rVar, lVar, l2Var)) {
                    rVar.C = true;
                    rVar.m = System.currentTimeMillis();
                    rVar.a(false, true);
                    if (!rVar.B) {
                        o(rVar, lVar);
                    }
                    a(rVar);
                    o.b(lVar);
                    y.a(this.f16300a.f17435f);
                    q4.a(this.f16300a.f17435f, lVar.f16569b.getName(), lVar.f16571d, lVar.f16570c.getAdUnitName(), e(rVar, lVar, l2Var), lVar.f16570c.getEcpm());
                    this.f16300a.a(LogConstants.EVENT_SHOWN, (AdUnit) lVar, (LoadingError) null);
                    rVar.u = false;
                    rVar.v = false;
                    rVar.e(lVar);
                    if (b()) {
                        UnifiedAdType unifiedadtype = lVar.f16573f;
                        if (unifiedadtype != null) {
                            unifiedadtype.onShow();
                        }
                        if (lVar.n == 0) {
                            lVar.n = System.currentTimeMillis();
                        }
                    }
                    lVar.b(this.f16300a.e().f17248a);
                    EventsTracker.get().a(this.f16300a.f17435f, lVar, EventsTracker.EventType.Impression);
                    k0.b(rVar, lVar, Integer.valueOf(e(rVar, lVar, l2Var).f17248a), Double.valueOf(this.f16300a.h()));
                    h(rVar, lVar, l2Var);
                    h5.f16458a.post(new a0(this, rVar, lVar, l2Var));
                }
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
        return;
    }

    public final void k(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        int i = 0;
        if (!adobjecttype.f()) {
            if (adobjecttype.f16570c.isPrecache()) {
                adrequesttype.v = true;
            } else {
                adrequesttype.u = true;
            }
            o.b(adrequesttype.s);
            AdObjectType adobjecttype2 = adrequesttype.s;
            if (!(adobjecttype2 == null || adobjecttype2 == adobjecttype || adobjecttype2.f())) {
                adobjecttype2.k();
            }
            adrequesttype.s = adobjecttype;
            AdRequestType adrequesttype2 = this.f16300a.x;
            if (!(adrequesttype2 != null && adrequesttype2 == adrequesttype)) {
                adrequesttype.a(false, true);
            } else if (!adobjecttype.f16570c.isPrecache()) {
                adrequesttype.a(false, false);
            }
        } else {
            adrequesttype.getClass();
            while (i < adobjecttype.f16572e.size()) {
                try {
                    String str = (String) adobjecttype.f16572e.get(i);
                    l lVar = (l) adrequesttype.q.get(str);
                    if (lVar == null || adobjecttype.f16570c.getEcpm() > lVar.f16570c.getEcpm()) {
                        adrequesttype.q.put(str, adobjecttype);
                    }
                    i++;
                } catch (Exception e2) {
                    Log.log(e2);
                }
            }
            adrequesttype.f17079c.remove(adobjecttype);
        }
    }

    public abstract boolean k(r rVar, l lVar, l2 l2Var);

    public void l(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        adrequesttype.t = adobjecttype.f16570c.getEcpm();
    }

    /* renamed from: m */
    public final void e(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        u<AdObjectType, AdRequestType, ?> uVar = this.f16300a;
        AdRequestType adrequesttype2 = uVar.x;
        boolean z = true;
        if ((adrequesttype2 != null && adrequesttype2 == adrequesttype) && uVar.f17436g.contains(adrequesttype)) {
            this.f16300a.a(LogConstants.EVENT_EXPIRED, (AdUnit) adobjecttype, (LoadingError) null);
            EventsTracker.get().a(this.f16300a.f17435f, adobjecttype, EventsTracker.EventType.Expired);
            if (!a()) {
                if (adobjecttype != null) {
                    o.b(adobjecttype);
                    String id = adobjecttype.f16570c.getId();
                    adrequesttype.getClass();
                    try {
                        Iterator it = adrequesttype.q.values().iterator();
                        while (it.hasNext()) {
                            if (((l) it.next()).f16570c.getId().equals(id)) {
                                it.remove();
                            }
                        }
                    } catch (Exception e2) {
                        Log.log(e2);
                    }
                }
                AdObjectType adobjecttype2 = adrequesttype.s;
                if (adobjecttype2 != null) {
                    adobjecttype2.k();
                    adrequesttype.s = null;
                    adrequesttype.I.f17412a = null;
                    adrequesttype.u = false;
                    adrequesttype.v = false;
                }
            } else if (adobjecttype.f()) {
                o.b(adobjecttype);
                String id2 = adobjecttype.f16570c.getId();
                adrequesttype.getClass();
                try {
                    Iterator it2 = adrequesttype.q.values().iterator();
                    while (it2.hasNext()) {
                        if (((l) it2.next()).f16570c.getId().equals(id2)) {
                            it2.remove();
                        }
                    }
                } catch (Exception e3) {
                    Log.log(e3);
                }
                adobjecttype.k();
                return;
            } else {
                AdObjectType adobjecttype3 = adrequesttype.s;
                if (adobjecttype3 == null || adobjecttype3 != adobjecttype) {
                    z = false;
                }
                if (z) {
                    o.b(adobjecttype);
                    o.a((Collection<? extends l>) adrequesttype.q.values());
                    AdObjectType adobjecttype4 = adrequesttype.s;
                    if (adobjecttype4 != null) {
                        adobjecttype4.k();
                        adrequesttype.s = null;
                        adrequesttype.I.f17412a = null;
                        adrequesttype.u = false;
                        adrequesttype.v = false;
                    }
                    try {
                        Iterator it3 = adrequesttype.q.values().iterator();
                        while (it3.hasNext()) {
                            l lVar = (l) it3.next();
                            if (lVar != null) {
                                lVar.k();
                            }
                            it3.remove();
                        }
                    } catch (Exception e4) {
                        Log.log(e4);
                    }
                } else {
                    return;
                }
            }
            adrequesttype.y();
            h(adrequesttype, adobjecttype);
            f(adrequesttype, adobjecttype);
        }
    }

    public final void n(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        AdObjectType adobjecttype2;
        AdObjectType adobjecttype3;
        if (adrequesttype != null) {
            try {
                if (!adrequesttype.F && !adrequesttype.C) {
                    if (!adrequesttype.B) {
                        AdRequestType adrequesttype2 = this.f16300a.y;
                        boolean z = false;
                        if (adrequesttype2 != null && adrequesttype2 == adrequesttype) {
                            if (!(adobjecttype == null || (adobjecttype3 = adrequesttype.s) == null || adobjecttype3 != adobjecttype)) {
                                z = true;
                            }
                            if (!z) {
                                adobjecttype.k();
                                return;
                            }
                            return;
                        } else if (adobjecttype.l == 3) {
                            adobjecttype.k();
                            return;
                        } else {
                            if (adrequesttype.f17081e.contains(adobjecttype)) {
                                adrequesttype.f17081e.remove(adobjecttype);
                            }
                            adobjecttype.l = 2;
                            this.f16300a.a(LogConstants.EVENT_LOADED, (AdUnit) adobjecttype, (LoadingError) null);
                            ExchangeAd exchangeAd = adobjecttype.i;
                            if (exchangeAd != null) {
                                exchangeAd.trackFill();
                            }
                            UnifiedAdType unifiedadtype = adobjecttype.f16573f;
                            if (unifiedadtype != null) {
                                unifiedadtype.onLoaded();
                            }
                            if (!adrequesttype.f17082f.contains(adobjecttype)) {
                                adrequesttype.f17082f.add(adobjecttype);
                            }
                            if ((!TextUtils.isEmpty(adobjecttype.f16570c.getId())) && adobjecttype.f16570c.getRequestResult() == null) {
                                adobjecttype.f16570c.a(e0.Successful);
                                adobjecttype.f16570c.a(System.currentTimeMillis());
                            }
                            r.a aVar = adrequesttype.I;
                            aVar.getClass();
                            if (!adobjecttype.f()) {
                                AdObjectType adobjecttype4 = aVar.f17412a;
                                if (adobjecttype4 == null || adobjecttype4.f16570c.getEcpm() < adobjecttype.f16570c.getEcpm()) {
                                    aVar.f17412a = adobjecttype;
                                }
                            }
                            AdObjectType adobjecttype5 = adrequesttype.I.f17412a;
                            if (adobjecttype5 == null) {
                                adobjecttype5 = adobjecttype;
                            }
                            if (adobjecttype5.f() || (adobjecttype2 = adrequesttype.s) == null || adobjecttype2 == adobjecttype || adobjecttype2.f16570c.getEcpm() < adobjecttype5.f16570c.getEcpm()) {
                                l(adrequesttype, adobjecttype5);
                                k(adrequesttype, adobjecttype5);
                            }
                            q4.k().c(this.f16300a.f17435f, adrequesttype.t, adobjecttype.f16571d, adobjecttype.f16570c.getAdUnitName());
                            AdRequestType adrequesttype3 = this.f16300a.x;
                            boolean z2 = adrequesttype3 != null && adrequesttype3 == adrequesttype;
                            if (!adrequesttype.f17084h && (adrequesttype.f17077a.isEmpty() ^ true) && p(adrequesttype, adobjecttype)) {
                                b(adrequesttype);
                                z = true;
                            }
                            if ((!z && !(true ^ adrequesttype.f17081e.isEmpty()) && d(adrequesttype)) || !z2) {
                                o(adrequesttype, adobjecttype);
                            }
                            if (z2) {
                                $$Lambda$b0$LG08XYbEAP0z5TaAUpQIbL5DaIk r1 = new o.b(adrequesttype) {
                                    public final /* synthetic */ r f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    public final void a(l lVar) {
                                        b0.this.e(this.f$1, lVar);
                                    }
                                };
                                Handler handler = o.f17549a;
                                if (adobjecttype.f16570c.getExpTime() > 0) {
                                    Runnable runnable = (Runnable) o.f17550b.get(adobjecttype);
                                    if (runnable != null) {
                                        o.f17549a.removeCallbacks(runnable);
                                    }
                                    o.f17550b.put(adobjecttype, new o.a(adobjecttype, r1));
                                    o.a((l) adobjecttype);
                                }
                                if (adrequesttype.H == null && !adobjecttype.f()) {
                                    a(adrequesttype, adobjecttype, z);
                                    this.f16300a.B = 5000;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Exception e2) {
                Log.log(e2);
                b(adrequesttype, adobjecttype, (l2) null, LoadingError.InternalError);
                return;
            }
        }
        adobjecttype.k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[Catch:{ Exception -> 0x003d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[Catch:{ Exception -> 0x003d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(AdRequestType r7, AdObjectType r8) {
        /*
            r6 = this;
            boolean r0 = r7.B     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f17079c     // Catch:{ Exception -> 0x003d }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x003d }
            r1 = 1
            if (r0 == 0) goto L_0x0019
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f17080d     // Catch:{ Exception -> 0x003d }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            boolean r0 = r7.F     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x0032
            com.appodeal.ads.n0 r0 = com.appodeal.ads.q4.k()     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r6.f16300a     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.modules.common.internal.adtype.AdType r2 = r2.f17435f     // Catch:{ Exception -> 0x003d }
            double r3 = r7.t     // Catch:{ Exception -> 0x003d }
            boolean r5 = r6.b(r7, r8)     // Catch:{ Exception -> 0x003d }
            r0.a(r2, r3, r5)     // Catch:{ Exception -> 0x003d }
        L_0x0032:
            r7.b(r8)     // Catch:{ Exception -> 0x003d }
            r7.B = r1     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f16300a     // Catch:{ Exception -> 0x003d }
            com.appodeal.ads.k0.a(r0, r7, r8)     // Catch:{ Exception -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.b0.o(com.appodeal.ads.r, com.appodeal.ads.l):void");
    }

    public boolean p(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        if (!adobjecttype.f16570c.isPrecache() && !adobjecttype.f()) {
            this.f16300a.getClass();
            return u.b((r) adrequesttype, (l) adobjecttype);
        }
    }

    public boolean q(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return true;
    }

    public boolean a(r rVar, l lVar, l2 l2Var) {
        return rVar.D;
    }

    public boolean b(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return adrequesttype.u || adrequesttype.v;
    }

    public final void c(AdRequestType adrequesttype) {
        JSONObject jSONObject;
        u<AdObjectType, AdRequestType, ?> uVar = this.f16300a;
        int indexOf = uVar.f17436g.indexOf(adrequesttype) + 1;
        r rVar = (indexOf <= 0 || indexOf >= uVar.f17436g.size()) ? null : (r) uVar.f17436g.get(indexOf);
        if (rVar != null && (jSONObject = rVar.G) != null) {
            ArrayList arrayList = rVar.f17077a;
            arrayList.remove(arrayList.size() - 1);
            rVar.f17077a.add(0, jSONObject);
            if (rVar.t < rVar.G.optDouble("ecpm", 0.0d) && (rVar.f17077a.size() == 1 || rVar.u)) {
                b(rVar);
            } else if (rVar.u && !rVar.u()) {
                o(rVar, rVar.s);
            }
        }
    }

    public final void a(r rVar, l lVar, l2 l2Var, LoadingError loadingError) {
        if (loadingError == LoadingError.ShowFailed) {
            h5.f16458a.post(new Runnable(rVar, lVar, l2Var, loadingError) {
                public final /* synthetic */ r f$1;
                public final /* synthetic */ l f$2;
                public final /* synthetic */ Object f$3;
                public final /* synthetic */ LoadingError f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    b0.this.a(this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
            return;
        }
        h5.f16458a.post(new w(this, rVar, lVar, loadingError));
    }

    public final void b(r rVar, j1 j1Var) {
        if (rVar != null) {
            try {
                if (!rVar.A) {
                    rVar.A = true;
                    UnifiedAdType unifiedadtype = j1Var.f16573f;
                    if (unifiedadtype != null) {
                        unifiedadtype.onHide();
                    }
                    this.f16300a.a(LogConstants.EVENT_CLOSED, (AdUnit) j1Var, (LoadingError) null);
                    a(rVar, j1Var);
                    h5.f16458a.post(new y((v2) this, rVar, j1Var));
                }
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
    }

    public boolean l(r rVar, l lVar, l2 l2Var) {
        return !rVar.C;
    }

    public void a(AdRequestType adrequesttype) {
        HashSet hashSet = new HashSet();
        while (adrequesttype != null) {
            hashSet.addAll(adrequesttype.f17082f);
            adrequesttype = adrequesttype.H;
        }
        if (!hashSet.isEmpty()) {
            l lVar = null;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                l lVar2 = (l) it.next();
                if (lVar == null || lVar.f16570c.getEcpm() < lVar2.f16570c.getEcpm()) {
                    lVar = lVar2;
                }
            }
            if (lVar != null) {
                lVar.j();
                hashSet.remove(lVar);
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((l) it2.next()).a(lVar.f16571d, lVar.f16570c.getEcpm());
                }
            }
        }
    }

    public final void b(r rVar, l lVar, l2 l2Var, LoadingError loadingError) {
        if (loadingError == null) {
            try {
                loadingError = LoadingError.InternalError;
            } catch (Exception e2) {
                Log.log(e2);
                return;
            }
        }
        this.f16300a.a(LogConstants.EVENT_LOAD_FAILED_SOFT, (AdUnit) lVar, loadingError);
        EventsTracker.get().a(this.f16300a.f17435f, lVar, EventsTracker.EventType.InternalError);
        if (rVar != null) {
            rVar.a(false, false);
            rVar.u = false;
            rVar.v = false;
        }
        if (lVar != null) {
            ExchangeAd exchangeAd = lVar.i;
            if (exchangeAd != null && loadingError == LoadingError.TimeoutError) {
                exchangeAd.trackError(1005);
            }
            UnifiedAdType unifiedadtype = lVar.f16573f;
            if (unifiedadtype != null) {
                unifiedadtype.onError(loadingError);
            }
        }
        if (rVar == null || rVar.H == null) {
            j(rVar, lVar);
            u<AdObjectType, AdRequestType, ?> uVar = this.f16300a;
            int i = uVar.B;
            if (uVar.k()) {
                h5.f16458a.postDelayed(new x(this), (long) i);
            }
            a(rVar, lVar, l2Var, loadingError);
        }
    }

    public void a(AdRequestType adrequesttype, AdObjectType adobjecttype, boolean z) {
        if (b(adrequesttype, adobjecttype, z)) {
            adrequesttype.y = true;
            g(adrequesttype, adobjecttype);
        }
    }

    public final void a(r rVar, l lVar, l2 l2Var, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        try {
            if (l(rVar, lVar, l2Var)) {
                j(rVar, lVar, l2Var);
            }
            if (k(rVar, lVar, l2Var)) {
                i(rVar, lVar, l2Var);
            }
            if (!a(rVar, lVar, l2Var)) {
                rVar.D = true;
                rVar.n = System.currentTimeMillis();
                q4.k().a(this.f16300a.f17435f, lVar.f16570c.getEcpm(), lVar.f16571d, lVar.f16570c.getAdUnitName());
                this.f16300a.a(LogConstants.EVENT_CLICKED, (AdUnit) lVar, (LoadingError) null);
                b.f16327b.f16328a.getApplicationContext();
                lVar.h();
                EventsTracker.get().a(this.f16300a.f17435f, lVar, EventsTracker.EventType.Click);
                k0.a((r<?>) rVar, (l<?, ?, ?, ?>) lVar, Integer.valueOf(e(rVar, lVar, l2Var).f17248a), Double.valueOf(this.f16300a.h()), unifiedAdCallbackClickTrackListener);
                f(rVar, lVar, l2Var);
                d(rVar, lVar, l2Var);
            } else if (unifiedAdCallbackClickTrackListener != null) {
                unifiedAdCallbackClickTrackListener.onTrackError();
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public boolean b(AdRequestType adrequesttype, AdObjectType adobjecttype, boolean z) {
        return !adrequesttype.y && (!z || this.f16300a.t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017a A[Catch:{ Exception -> 0x0185 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(AdRequestType r12, AdObjectType r13, com.appodeal.ads.f5 r14, com.appodeal.ads.networking.LoadingError r15) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x018f
            boolean r0 = r12.F     // Catch:{ Exception -> 0x0185 }
            if (r0 != 0) goto L_0x018f
            boolean r0 = r12.C     // Catch:{ Exception -> 0x0185 }
            if (r0 == 0) goto L_0x000c
            goto L_0x018f
        L_0x000c:
            boolean r0 = r12.f17084h     // Catch:{ Exception -> 0x0185 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r12.f17081e     // Catch:{ Exception -> 0x0185 }
            boolean r1 = r1.contains(r13)     // Catch:{ Exception -> 0x0185 }
            if (r1 == 0) goto L_0x001b
            java.util.concurrent.CopyOnWriteArrayList r1 = r12.f17081e     // Catch:{ Exception -> 0x0185 }
            r1.remove(r13)     // Catch:{ Exception -> 0x0185 }
        L_0x001b:
            r1 = 1
            if (r13 == 0) goto L_0x0023
            int r2 = r13.l     // Catch:{ Exception -> 0x0185 }
            if (r2 == r1) goto L_0x0023
            return
        L_0x0023:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            java.lang.String r3 = "Load Failed"
            r2.a((java.lang.String) r3, (com.appodeal.ads.AdUnit) r13, (com.appodeal.ads.networking.LoadingError) r15)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r3 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = r3.f17435f     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.utils.EventsTracker$EventType r4 = com.appodeal.ads.utils.EventsTracker.EventType.FailedToLoad     // Catch:{ Exception -> 0x0185 }
            r2.a(r3, r13, r4)     // Catch:{ Exception -> 0x0185 }
            if (r13 == 0) goto L_0x006e
            r2 = 3
            r13.l = r2     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.n0 r3 = com.appodeal.ads.q4.k()     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.modules.common.internal.adtype.AdType r4 = r2.f17435f     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.f5 r2 = r13.f16570c     // Catch:{ Exception -> 0x0185 }
            double r5 = r2.getEcpm()     // Catch:{ Exception -> 0x0185 }
            java.lang.String r7 = r13.f16571d     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.f5 r2 = r13.f16570c     // Catch:{ Exception -> 0x0185 }
            java.lang.String r8 = r2.getAdUnitName()     // Catch:{ Exception -> 0x0185 }
            r9 = 0
            int r10 = r15.getCode()     // Catch:{ Exception -> 0x0185 }
            r3.a(r4, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.utils.ExchangeAd r2 = r13.i     // Catch:{ Exception -> 0x0185 }
            if (r2 == 0) goto L_0x0067
            com.appodeal.ads.networking.LoadingError r3 = com.appodeal.ads.networking.LoadingError.TimeoutError     // Catch:{ Exception -> 0x0185 }
            if (r15 != r3) goto L_0x0067
            r3 = 1005(0x3ed, float:1.408E-42)
            r2.trackError(r3)     // Catch:{ Exception -> 0x0185 }
        L_0x0067:
            UnifiedAdType r2 = r13.f16573f     // Catch:{ Exception -> 0x0185 }
            if (r2 == 0) goto L_0x006e
            r2.onError(r15)     // Catch:{ Exception -> 0x0185 }
        L_0x006e:
            if (r14 == 0) goto L_0x0089
            com.appodeal.ads.e0 r2 = r14.getRequestResult()     // Catch:{ Exception -> 0x0185 }
            if (r2 != 0) goto L_0x0089
            if (r15 == 0) goto L_0x007d
            com.appodeal.ads.e0 r2 = r15.getRequestResult()     // Catch:{ Exception -> 0x0185 }
            goto L_0x007f
        L_0x007d:
            com.appodeal.ads.e0 r2 = com.appodeal.ads.e0.Exception     // Catch:{ Exception -> 0x0185 }
        L_0x007f:
            r14.a((com.appodeal.ads.e0) r2)     // Catch:{ Exception -> 0x0185 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0185 }
            r14.a(r2)     // Catch:{ Exception -> 0x0185 }
        L_0x0089:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            AdRequestType r14 = r14.x     // Catch:{ Exception -> 0x0185 }
            r2 = 0
            if (r14 == 0) goto L_0x0094
            if (r14 != r12) goto L_0x0094
            r14 = 1
            goto L_0x0095
        L_0x0094:
            r14 = 0
        L_0x0095:
            if (r14 == 0) goto L_0x017e
            java.util.concurrent.CopyOnWriteArrayList r14 = r12.f17081e     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 == 0) goto L_0x00be
            if (r13 == 0) goto L_0x00bd
            com.appodeal.ads.f5 r14 = r13.f16570c     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isAsync()     // Catch:{ Exception -> 0x0185 }
            if (r14 != 0) goto L_0x00bd
            int r14 = r12.a()     // Catch:{ Exception -> 0x0185 }
            if (r14 <= 0) goto L_0x00bd
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.f5 r15 = r13.f16570c     // Catch:{ Exception -> 0x0185 }
            boolean r15 = r15.isPrecache()     // Catch:{ Exception -> 0x0185 }
            boolean r0 = r12.f17084h     // Catch:{ Exception -> 0x0185 }
            r14.a(r12, (int) r2, (boolean) r15, (boolean) r0)     // Catch:{ Exception -> 0x0185 }
        L_0x00bd:
            return
        L_0x00be:
            if (r13 == 0) goto L_0x010e
            com.appodeal.ads.f5 r14 = r13.f16570c     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isPrecache()     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x010e
            if (r0 != 0) goto L_0x0178
            java.util.ArrayList r14 = r12.f17078b     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 == 0) goto L_0x00da
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            r14.a(r12, (int) r2, (boolean) r1, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x00da:
            java.util.ArrayList r14 = r12.f17077a     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 == 0) goto L_0x00e5
            goto L_0x0162
        L_0x00e5:
            r11.o(r12, r13)     // Catch:{ Exception -> 0x0185 }
            r12.a((boolean) r2, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.r<AdObjectType> r14 = r12.H     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x00f0
            return
        L_0x00f0:
            r11.i(r12, r13)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.w r14 = new com.appodeal.ads.w     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11, r12, r13, r15)     // Catch:{ Exception -> 0x0185 }
            android.os.Handler r15 = com.appodeal.ads.h5.f16458a     // Catch:{ Exception -> 0x0185 }
            r15.post(r14)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            int r0 = r14.B     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.k()     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0178
            com.appodeal.ads.x r14 = new com.appodeal.ads.x     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11)     // Catch:{ Exception -> 0x0185 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0185 }
            goto L_0x015c
        L_0x010e:
            java.util.ArrayList r14 = r12.f17077a     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r14.isEmpty()     // Catch:{ Exception -> 0x0185 }
            r14 = r14 ^ r1
            if (r14 != 0) goto L_0x0160
            r12.a((boolean) r2, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            boolean r14 = r11.q(r12, r13)     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0123
            r11.o(r12, r13)     // Catch:{ Exception -> 0x0185 }
        L_0x0123:
            AdObjectType r14 = r12.s     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x012b
            r11.a(r12, r14, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x012b:
            com.appodeal.ads.r<AdObjectType> r14 = r12.H     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0130
            return
        L_0x0130:
            r11.i(r12, r13)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.w r14 = new com.appodeal.ads.w     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11, r12, r13, r15)     // Catch:{ Exception -> 0x0185 }
            android.os.Handler r15 = com.appodeal.ads.h5.f16458a     // Catch:{ Exception -> 0x0185 }
            r15.post(r14)     // Catch:{ Exception -> 0x0185 }
            if (r0 != 0) goto L_0x0178
            boolean r14 = r11.a(r12, r13)     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x0148
            r14 = 30000(0x7530, float:4.2039E-41)
            goto L_0x014c
        L_0x0148:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r14 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            int r14 = r14.B     // Catch:{ Exception -> 0x0185 }
        L_0x014c:
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r11.f16300a     // Catch:{ Exception -> 0x0185 }
            boolean r0 = r0.k()     // Catch:{ Exception -> 0x0185 }
            if (r0 == 0) goto L_0x0178
            com.appodeal.ads.x r0 = new com.appodeal.ads.x     // Catch:{ Exception -> 0x0185 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0185 }
            long r1 = (long) r14     // Catch:{ Exception -> 0x0185 }
            r14 = r0
            r0 = r1
        L_0x015c:
            r15.postDelayed(r14, r0)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x0160:
            if (r0 != 0) goto L_0x0166
        L_0x0162:
            r11.b(r12)     // Catch:{ Exception -> 0x0185 }
            goto L_0x0178
        L_0x0166:
            com.appodeal.ads.r<AdObjectType> r14 = r12.H     // Catch:{ Exception -> 0x0185 }
            if (r14 == 0) goto L_0x016b
            return
        L_0x016b:
            r11.i(r12, r13)     // Catch:{ Exception -> 0x0185 }
            com.appodeal.ads.w r14 = new com.appodeal.ads.w     // Catch:{ Exception -> 0x0185 }
            r14.<init>(r11, r12, r13, r15)     // Catch:{ Exception -> 0x0185 }
            android.os.Handler r15 = com.appodeal.ads.h5.f16458a     // Catch:{ Exception -> 0x0185 }
            r15.post(r14)     // Catch:{ Exception -> 0x0185 }
        L_0x0178:
            if (r13 == 0) goto L_0x018f
            r13.k()     // Catch:{ Exception -> 0x0185 }
            goto L_0x018f
        L_0x017e:
            r12.a((boolean) r2, (boolean) r2)     // Catch:{ Exception -> 0x0185 }
            r11.o(r12, r13)     // Catch:{ Exception -> 0x0185 }
            return
        L_0x0185:
            r14 = move-exception
            com.appodeal.ads.utils.Log.log(r14)
            com.appodeal.ads.networking.LoadingError r14 = com.appodeal.ads.networking.LoadingError.InternalError
            r15 = 0
            r11.b(r12, r13, r15, r14)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.b0.a(com.appodeal.ads.r, com.appodeal.ads.l, com.appodeal.ads.f5, com.appodeal.ads.networking.LoadingError):void");
    }

    public final void a(AdRequestType adrequesttype, AdObjectType adobjecttype, LoadingError loadingError) {
        f5 f5Var = adobjecttype != null ? adobjecttype.f16570c : null;
        if (loadingError == null) {
            loadingError = LoadingError.NoFill;
        }
        a(adrequesttype, adobjecttype, f5Var, loadingError);
    }
}
