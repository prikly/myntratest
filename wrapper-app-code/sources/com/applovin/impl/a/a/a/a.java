package com.applovin.impl.a.a.a;

import com.applovin.impl.sdk.ad.e;
import com.appodeal.ads.modules.common.internal.LogConstants;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f13966a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f13967b;

    /* renamed from: c  reason: collision with root package name */
    private String f13968c;

    /* renamed from: d  reason: collision with root package name */
    private String f13969d;

    public a(Object obj, long j) {
        String networkName;
        this.f13967b = obj;
        this.f13966a = j;
        String str = null;
        if (obj instanceof e) {
            e eVar = (e) obj;
            this.f13968c = eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : str;
            networkName = "AppLovin";
        } else if (obj instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) obj;
            this.f13968c = aVar.getFormat() != null ? aVar.getFormat().getLabel() : str;
            networkName = aVar.getNetworkName();
        } else {
            return;
        }
        this.f13969d = networkName;
    }

    public String a() {
        String str = this.f13968c;
        return str != null ? str : LogConstants.KEY_UNKNOWN;
    }

    public String b() {
        String str = this.f13969d;
        return str != null ? str : LogConstants.KEY_UNKNOWN;
    }

    public Object c() {
        return this.f13967b;
    }

    public long d() {
        return this.f13966a;
    }
}
