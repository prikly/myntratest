package com.applovin.impl.mediation.a;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.hybridAds.c;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class a extends f implements MaxAd {

    /* renamed from: a  reason: collision with root package name */
    protected g f14429a;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f14430c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f14431d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private final String f14432e;

    /* renamed from: f  reason: collision with root package name */
    private MaxAdWaterfallInfo f14433f;

    /* renamed from: g  reason: collision with root package name */
    private long f14434g;

    /* renamed from: h  reason: collision with root package name */
    private String f14435h;
    private String i;
    private c j;

    protected a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, g gVar, n nVar) {
        super(map, jSONObject, jSONObject2, nVar);
        this.f14429a = gVar;
        this.f14432e = gVar != null ? gVar.i() : null;
    }

    public static a a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, n nVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", (String) null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new b(map, jSONObject, jSONObject2, nVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new d(map, jSONObject, jSONObject2, nVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new c(map, jSONObject, jSONObject2, nVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    private long z() {
        return b("load_started_time_ms", 0);
    }

    public abstract a a(g gVar);

    public String a() {
        return this.f14435h;
    }

    public void a(long j2) {
        this.f14434g = j2;
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("creative_id") && !c("creative_id")) {
                c("creative_id", BundleUtils.getString("creative_id", bundle));
            }
            if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
                int i2 = BundleUtils.getInt("ad_width", bundle);
                int i3 = BundleUtils.getInt("ad_height", bundle);
                c("ad_width", i2);
                c("ad_height", i3);
            }
        }
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f14433f = maxAdWaterfallInfo;
    }

    public void a(String str) {
        this.f14435h = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            JSONObject b2 = b();
            JsonUtils.putAll(b2, jSONObject);
            a(Utils.KEY_AD_VALUES, (Object) b2);
        }
    }

    public JSONObject b() {
        return a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    public void b(String str) {
        this.i = str;
    }

    public JSONObject c() {
        return a("revenue_parameters", new JSONObject());
    }

    public String d() {
        return JsonUtils.getString(c(), "revenue_event", "");
    }

    public boolean e() {
        g gVar = this.f14429a;
        return gVar != null && gVar.f() && this.f14429a.g();
    }

    public String f() {
        return a("event_id", "");
    }

    public g g() {
        return this.f14429a;
    }

    public String getAdReviewCreativeId() {
        return this.i;
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public String getAdValue(String str, String str2) {
        JSONObject b2 = b();
        if (b2.has(str)) {
            return JsonUtils.getString(b2, str, str2);
        }
        Bundle ab = ab();
        return ab.containsKey(str) ? ab.getString(str) : b(str, str2);
    }

    public String getCreativeId() {
        return b("creative_id", (String) null);
    }

    public String getDspId() {
        return b("dsp_id", (String) null);
    }

    public String getDspName() {
        return b("dsp_name", (String) null);
    }

    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(b("ad_format", a("ad_format", (String) null)));
    }

    public MaxNativeAd getNativeAd() {
        g gVar = this.f14429a;
        if (gVar != null) {
            return gVar.b();
        }
        return null;
    }

    public String getNetworkName() {
        return b("network_name", "");
    }

    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(p());
    }

    public long getRequestLatencyMillis() {
        return this.f14434g;
    }

    public double getRevenue() {
        if (!((Boolean) this.f14445b.a(com.applovin.impl.sdk.c.a.U)).booleanValue() || !getFormat().isFullscreenAd() || w().get()) {
            return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f14445b.D();
        if (!v.a()) {
            return 0.0d;
        }
        this.f14445b.D().e("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    public String getRevenuePrecision() {
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public AppLovinSdkUtils.Size getSize() {
        int b2 = b("ad_width", -3);
        int b3 = b("ad_height", -3);
        return (b2 == -3 || b3 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(b2, b3);
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return this.f14433f;
    }

    public String h() {
        return this.f14432e;
    }

    public Bundle i() {
        JSONObject jSONObject;
        if (c("credentials")) {
            jSONObject = a("credentials", new JSONObject());
        } else {
            jSONObject = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObject, "placement_id", p());
        }
        return JsonUtils.toBundle(jSONObject);
    }

    public String j() {
        return b("bid_response", (String) null);
    }

    public long k() {
        return b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1, ab()));
    }

    public boolean l() {
        return b("is_js_tag_ad", (Boolean) false).booleanValue();
    }

    public MaxAdFormat m() {
        String b2 = b("haf", (String) null);
        if (StringUtils.isValidString(b2)) {
            return MaxAdFormat.formatFromString(b2);
        }
        return null;
    }

    public c n() {
        c cVar = this.j;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(a("hybrid_ad_config", (JSONObject) null));
        this.j = cVar2;
        return cVar2;
    }

    public View o() {
        g gVar;
        if (!e() || (gVar = this.f14429a) == null) {
            return null;
        }
        return gVar.a();
    }

    public String p() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public String q() {
        return a("waterfall_name", "");
    }

    public String r() {
        return a("waterfall_test_name", "");
    }

    public long s() {
        if (z() > 0) {
            return u() - z();
        }
        return -1;
    }

    public void t() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + p() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public long u() {
        return b("load_completed_time_ms", 0);
    }

    public void v() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean w() {
        return this.f14430c;
    }

    public AtomicBoolean x() {
        return this.f14431d;
    }

    public void y() {
        this.f14429a = null;
        this.f14433f = null;
    }
}
