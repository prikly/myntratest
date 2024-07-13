package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.c;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    IronSource.AD_UNIT f8485a;

    /* renamed from: b  reason: collision with root package name */
    String f8486b;

    /* renamed from: c  reason: collision with root package name */
    List<NetworkSettings> f8487c;

    /* renamed from: d  reason: collision with root package name */
    c f8488d;

    /* renamed from: e  reason: collision with root package name */
    int f8489e;

    /* renamed from: f  reason: collision with root package name */
    int f8490f;

    /* renamed from: g  reason: collision with root package name */
    int f8491g;

    /* renamed from: h  reason: collision with root package name */
    com.ironsource.mediationsdk.adunit.c.b.a f8492h;
    int i;

    public a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, c cVar, int i2, int i3, int i4, int i5, com.ironsource.mediationsdk.adunit.c.b.a aVar) {
        this.f8485a = ad_unit;
        this.f8486b = str;
        this.f8487c = list;
        this.f8488d = cVar;
        this.f8489e = i2;
        this.f8491g = i3;
        this.f8490f = i4;
        this.f8492h = aVar;
        this.i = i5;
    }

    public final NetworkSettings a(String str) {
        for (NetworkSettings next : this.f8487c) {
            if (next.getProviderInstanceName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final boolean a() {
        return this.f8488d.f8898e > 0;
    }
}
