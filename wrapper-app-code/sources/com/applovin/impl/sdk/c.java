package com.applovin.impl.sdk;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.ad.f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final n f15330a;

    /* renamed from: b  reason: collision with root package name */
    private final v f15331b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f15332c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map<d, x> f15333d = CollectionUtils.map();

    /* renamed from: e  reason: collision with root package name */
    private final Map<d, x> f15334e = CollectionUtils.map();

    c(n nVar) {
        this.f15330a = nVar;
        this.f15331b = nVar.D();
        for (d next : d.f()) {
            this.f15333d.put(next, new x());
            this.f15334e.put(next, new x());
        }
    }

    private x d(d dVar) {
        x xVar;
        synchronized (this.f15332c) {
            xVar = this.f15333d.get(dVar);
            if (xVar == null) {
                xVar = new x();
                this.f15333d.put(dVar, xVar);
            }
        }
        return xVar;
    }

    private x e(d dVar) {
        x xVar;
        synchronized (this.f15332c) {
            xVar = this.f15334e.get(dVar);
            if (xVar == null) {
                xVar = new x();
                this.f15334e.put(dVar, xVar);
            }
        }
        return xVar;
    }

    private x f(d dVar) {
        synchronized (this.f15332c) {
            x e2 = e(dVar);
            if (e2.a() > 0) {
                return e2;
            }
            x d2 = d(dVar);
            return d2;
        }
    }

    public AppLovinAdImpl a(d dVar) {
        f fVar;
        String str;
        StringBuilder sb;
        String str2;
        v vVar;
        synchronized (this.f15332c) {
            x d2 = d(dVar);
            if (d2.a() > 0) {
                e(dVar).a(d2.c());
                fVar = new f(dVar, this.f15330a);
            } else {
                fVar = null;
            }
        }
        boolean a2 = v.a();
        if (fVar != null) {
            if (a2) {
                vVar = this.f15331b;
                str2 = "AdPreloadManager";
                sb = new StringBuilder();
                str = "Retrieved ad of zone ";
            }
            return fVar;
        }
        if (a2) {
            vVar = this.f15331b;
            str2 = "AdPreloadManager";
            sb = new StringBuilder();
            str = "Unable to retrieve ad of zone ";
        }
        return fVar;
        sb.append(str);
        sb.append(dVar);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        vVar.b(str2, sb.toString());
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f15332c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (v.a()) {
                v vVar = this.f15331b;
                vVar.b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public AppLovinAdImpl b(d dVar) {
        AppLovinAdImpl c2;
        synchronized (this.f15332c) {
            c2 = f(dVar).c();
        }
        return c2;
    }

    public AppLovinAdBase c(d dVar) {
        AppLovinAdImpl d2;
        synchronized (this.f15332c) {
            d2 = f(dVar).d();
        }
        return d2;
    }
}
