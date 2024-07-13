package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.a.a;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;
import com.appodeal.ads.modules.common.internal.LogConstants;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f15921a = new StringBuilder();

    public l a() {
        this.f15921a.append("\n========================================");
        return this;
    }

    public l a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }

    public l a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", r.b(appLovinAdView.getVisibility()));
    }

    public l a(a aVar) {
        String str = "None";
        l a2 = a(LogConstants.KEY_NETWORK, aVar.S()).a("Adapter Version", aVar.h()).a("Format", aVar.getFormat() != null ? aVar.getFormat().getLabel() : LogConstants.KEY_UNKNOWN).a("Ad Unit ID", aVar.getAdUnitId()).a("Placement", aVar.getPlacement()).a("Network Placement", aVar.p()).a("Serve ID", aVar.f()).a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : str).a("Ad Review Creative ID", StringUtils.isValidString(aVar.getAdReviewCreativeId()) ? aVar.getAdReviewCreativeId() : str).a("DSP Name", StringUtils.isValidString(aVar.getDspName()) ? aVar.getDspName() : str);
        if (StringUtils.isValidString(aVar.getDspId())) {
            str = aVar.getDspId();
        }
        return a2.a("DSP ID", str).a("Server Parameters", aVar.ab());
    }

    public l a(e eVar) {
        boolean z = eVar instanceof com.applovin.impl.b.a;
        a("Format", eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : null).a("Ad ID", Long.valueOf(eVar.getAdIdNumber())).a("Zone ID", eVar.getAdZone().a()).a("Source", eVar.getSource()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = eVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z) {
            a("VAST DSP", ((com.applovin.impl.b.a) eVar).n());
        }
        return this;
    }

    public l a(n nVar) {
        return a("Muted", Boolean.valueOf(nVar.q().isMuted()));
    }

    public l a(String str) {
        StringBuilder sb = this.f15921a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public l a(String str, Object obj) {
        return a(str, obj, "");
    }

    public l a(String str, Object obj, String str2) {
        StringBuilder sb = this.f15921a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public l b(e eVar) {
        a("Target", eVar.p()).a("close_style", eVar.v()).a("close_delay_graphic", Long.valueOf(eVar.t()), "s");
        if (eVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
            a("HTML", aVar.b().substring(0, Math.min(aVar.b().length(), 64)));
        }
        if (eVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(eVar.r()), "s").a("skip_style", eVar.x()).a("Streaming", Boolean.valueOf(eVar.f())).a("Video Location", eVar.d()).a("video_button_properties", eVar.D());
        }
        return this;
    }

    public l b(String str) {
        this.f15921a.append(str);
        return this;
    }

    public String toString() {
        return this.f15921a.toString();
    }
}
