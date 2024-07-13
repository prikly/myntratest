package com.applovin.impl.adview;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import io.bidmachine.utils.IabUtils;
import org.json.JSONObject;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final int f14229a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14230b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14231c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14232d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14233e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14234f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14235g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14236h;
    private final float i;
    private final float j;

    public s(JSONObject jSONObject, n nVar) {
        nVar.D();
        if (v.a()) {
            v D = nVar.D();
            D.c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f14229a = JsonUtils.getInt(jSONObject, IabUtils.KEY_WIDTH, 64);
        this.f14230b = JsonUtils.getInt(jSONObject, IabUtils.KEY_HEIGHT, 7);
        this.f14231c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f14232d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f14233e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", false).booleanValue();
        this.f14234f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f14235g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f14236h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public int a() {
        return this.f14229a;
    }

    public int b() {
        return this.f14230b;
    }

    public int c() {
        return this.f14231c;
    }

    public int d() {
        return this.f14232d;
    }

    public boolean e() {
        return this.f14233e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f14229a == sVar.f14229a && this.f14230b == sVar.f14230b && this.f14231c == sVar.f14231c && this.f14232d == sVar.f14232d && this.f14233e == sVar.f14233e && this.f14234f == sVar.f14234f && this.f14235g == sVar.f14235g && this.f14236h == sVar.f14236h && Float.compare(sVar.i, this.i) == 0 && Float.compare(sVar.j, this.j) == 0;
    }

    public long f() {
        return (long) this.f14234f;
    }

    public long g() {
        return (long) this.f14235g;
    }

    public long h() {
        return (long) this.f14236h;
    }

    public int hashCode() {
        int i2 = ((((((((((((((this.f14229a * 31) + this.f14230b) * 31) + this.f14231c) * 31) + this.f14232d) * 31) + (this.f14233e ? 1 : 0)) * 31) + this.f14234f) * 31) + this.f14235g) * 31) + this.f14236h) * 31;
        float f2 = this.i;
        int i3 = 0;
        int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.j;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        }
        return floatToIntBits + i3;
    }

    public float i() {
        return this.i;
    }

    public float j() {
        return this.j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f14229a + ", heightPercentOfScreen=" + this.f14230b + ", margin=" + this.f14231c + ", gravity=" + this.f14232d + ", tapToFade=" + this.f14233e + ", tapToFadeDurationMillis=" + this.f14234f + ", fadeInDurationMillis=" + this.f14235g + ", fadeOutDurationMillis=" + this.f14236h + ", fadeInDelay=" + this.i + ", fadeOutDelay=" + this.j + '}';
    }
}
