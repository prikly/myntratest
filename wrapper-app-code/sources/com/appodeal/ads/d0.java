package com.appodeal.ads;

import com.appodeal.ads.api.Stats;
import com.onesignal.outcomes.OSOutcomeConstants;
import org.json.JSONObject;

public final class d0 implements f5 {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f16357a;

    /* renamed from: b  reason: collision with root package name */
    public String f16358b;

    /* renamed from: c  reason: collision with root package name */
    public String f16359c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16360d;

    /* renamed from: e  reason: collision with root package name */
    public double f16361e;

    /* renamed from: f  reason: collision with root package name */
    public long f16362f;

    /* renamed from: g  reason: collision with root package name */
    public int f16363g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16364h;
    public String i;
    public String j;
    public int k;
    public Boolean l = null;
    public long m;
    public long n;
    public boolean o = false;
    public boolean p = false;
    public e0 q;

    public static d0 a(JSONObject jSONObject, boolean z) {
        d0 d0Var = new d0();
        d0Var.f16357a = jSONObject;
        d0Var.f16358b = jSONObject.optString(OSOutcomeConstants.OUTCOME_ID);
        d0Var.f16360d = z;
        d0Var.f16359c = jSONObject.optString("status");
        d0Var.f16361e = jSONObject.optDouble("ecpm", 0.0d);
        d0Var.f16362f = jSONObject.optLong("exptime", 0);
        d0Var.f16363g = jSONObject.optInt("tmax", 0);
        d0Var.f16364h = jSONObject.optBoolean("async");
        d0Var.i = n5.a(jSONObject, "mediator", (String) null);
        d0Var.j = n5.a(jSONObject, "unit_name", (String) null);
        d0Var.k = jSONObject.optInt("impression_interval", -1);
        if (jSONObject.has("mute")) {
            d0Var.l = Boolean.valueOf(jSONObject.optBoolean("mute", false));
        }
        return d0Var;
    }

    public final void a(double d2) {
        this.f16361e = d2;
    }

    public final void a(long j2) {
        if (!this.p) {
            this.p = true;
            this.n = j2;
        }
    }

    public final void a(e0 e0Var) {
        this.q = e0Var;
    }

    public final void a(String str) {
        this.f16358b = str;
    }

    public final void b() {
        this.f16360d = false;
    }

    public final void b(long j2) {
        if (!this.o) {
            this.o = true;
            this.m = j2;
        }
    }

    public final long c() {
        return this.n;
    }

    public final String getAdUnitName() {
        return this.j;
    }

    public final double getEcpm() {
        return this.f16361e;
    }

    public final long getExpTime() {
        return this.f16362f;
    }

    public final String getId() {
        return this.f16358b;
    }

    public final int getImpressionInterval() {
        return this.k;
    }

    public final JSONObject getJsonData() {
        return this.f16357a;
    }

    public final int getLoadingTimeout() {
        return this.f16363g;
    }

    public final String getMediatorName() {
        return this.i;
    }

    public final e0 getRequestResult() {
        return this.q;
    }

    public final String getStatus() {
        return this.f16359c;
    }

    public final boolean isAsync() {
        return this.f16364h;
    }

    public final Boolean isMuted() {
        return this.l;
    }

    public final boolean isPrecache() {
        return this.f16360d;
    }

    public final Stats.AdUnit a() {
        return Stats.AdUnit.newBuilder().setId(this.f16358b).setEcpm(this.f16361e).setPrecache(this.f16360d).setStart(this.m).setFinish(this.n).setResult(this.q.a()).build();
    }
}
