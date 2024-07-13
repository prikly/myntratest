package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public NetworkSettings f8725a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f8726b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8727c;

    /* renamed from: d  reason: collision with root package name */
    public int f8728d;

    /* renamed from: e  reason: collision with root package name */
    public int f8729e;

    /* renamed from: f  reason: collision with root package name */
    public IronSource.AD_UNIT f8730f;

    public a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f8725a = networkSettings;
        this.f8726b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f8728d = optInt;
        this.f8727c = optInt == 2;
        this.f8729e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f8730f = ad_unit;
    }
}
