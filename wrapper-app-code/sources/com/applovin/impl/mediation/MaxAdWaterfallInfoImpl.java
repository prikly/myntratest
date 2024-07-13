package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a  reason: collision with root package name */
    private final a f14360a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14361b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14362c;

    /* renamed from: d  reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f14363d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14364e;

    public MaxAdWaterfallInfoImpl(a aVar, long j, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.q(), aVar.r(), j, list);
    }

    public MaxAdWaterfallInfoImpl(a aVar, String str, String str2, long j, List<MaxNetworkResponseInfo> list) {
        this.f14360a = aVar;
        this.f14361b = str;
        this.f14362c = str2;
        this.f14363d = list;
        this.f14364e = j;
    }

    public long getLatencyMillis() {
        return this.f14364e;
    }

    public MaxAd getLoadedAd() {
        return this.f14360a;
    }

    public String getName() {
        return this.f14361b;
    }

    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f14363d;
    }

    public String getTestName() {
        return this.f14362c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f14361b + ", testName=" + this.f14362c + ", networkResponses=" + this.f14363d + ", latencyMillis=" + this.f14364e + '}';
    }
}
