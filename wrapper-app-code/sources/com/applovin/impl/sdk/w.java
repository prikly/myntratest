package com.applovin.impl.sdk;

import com.applovin.impl.mediation.a.a;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private final v f15964a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a> f15965b = CollectionUtils.map(4);

    /* renamed from: c  reason: collision with root package name */
    private final Object f15966c = new Object();

    w(n nVar) {
        this.f15964a = nVar.D();
    }

    public a a(String str) {
        a aVar;
        synchronized (this.f15966c) {
            aVar = this.f15965b.get(str);
        }
        return aVar;
    }

    public void a(a aVar) {
        synchronized (this.f15966c) {
            if (v.a()) {
                v vVar = this.f15964a;
                vVar.b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            this.f15965b.put(aVar.getAdUnitId(), aVar);
        }
    }

    public void b(a aVar) {
        synchronized (this.f15966c) {
            String adUnitId = aVar.getAdUnitId();
            f fVar = this.f15965b.get(adUnitId);
            if (aVar == fVar) {
                if (v.a()) {
                    v vVar = this.f15964a;
                    vVar.b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + fVar);
                }
                this.f15965b.remove(adUnitId);
            } else if (v.a()) {
                v vVar2 = this.f15964a;
                vVar2.b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + fVar);
            }
        }
    }
}
