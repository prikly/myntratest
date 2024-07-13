package com.applovin.impl.mediation.debugger.a;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f14656a;

    /* renamed from: b  reason: collision with root package name */
    private final DTBAdSize f14657b;

    private enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public b(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f14656a = str;
        this.f14657b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    private DTBAdSize a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    public DTBAdSize a() {
        return this.f14657b;
    }
}
