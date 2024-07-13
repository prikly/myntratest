package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.a.a;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.mediation.a.h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a  reason: collision with root package name */
    private String f14365a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f14366b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f14367c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f14368d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f14369e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f14370f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f14371g;

    /* renamed from: h  reason: collision with root package name */
    private String f14372h;
    private boolean i;
    private String j;
    private String k;
    private long l;
    private MaxAdFormat m;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(a aVar) {
        MaxAdapterParametersImpl a2 = a((f) aVar);
        a2.j = aVar.p();
        a2.k = aVar.j();
        a2.l = aVar.k();
        return a2;
    }

    static MaxAdapterParametersImpl a(f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f14365a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f14369e = fVar.V();
        maxAdapterParametersImpl.f14370f = fVar.W();
        maxAdapterParametersImpl.f14371g = fVar.X();
        maxAdapterParametersImpl.f14372h = fVar.Y();
        maxAdapterParametersImpl.f14366b = fVar.aa();
        maxAdapterParametersImpl.f14367c = fVar.ab();
        maxAdapterParametersImpl.f14368d = fVar.ac();
        maxAdapterParametersImpl.i = fVar.U();
        return maxAdapterParametersImpl;
    }

    static MaxAdapterParametersImpl a(h hVar, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a2 = a((f) hVar);
        a2.m = maxAdFormat;
        return a2;
    }

    public MaxAdFormat getAdFormat() {
        return this.m;
    }

    public String getAdUnitId() {
        return this.f14365a;
    }

    public long getBidExpirationMillis() {
        return this.l;
    }

    public String getBidResponse() {
        return this.k;
    }

    public String getConsentString() {
        return this.f14372h;
    }

    public Bundle getCustomParameters() {
        return this.f14368d;
    }

    public Map<String, Object> getLocalExtraParameters() {
        return this.f14366b;
    }

    public Bundle getServerParameters() {
        return this.f14367c;
    }

    public String getThirdPartyAdPlacementId() {
        return this.j;
    }

    public Boolean hasUserConsent() {
        return this.f14369e;
    }

    public Boolean isAgeRestrictedUser() {
        return this.f14370f;
    }

    public Boolean isDoNotSell() {
        return this.f14371g;
    }

    public boolean isTesting() {
        return this.i;
    }
}
