package com.criteo.publisher;

import com.criteo.publisher.logging.e;
import com.criteo.publisher.model.BannerAdUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerLogMessage.kt */
public final class b {
    static {
        new b();
    }

    private b() {
    }

    public static final e a(BannerAdUnit bannerAdUnit) {
        return new e(0, "BannerView initialized for " + bannerAdUnit, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e c(CriteoBannerView criteoBannerView) {
        Intrinsics.checkParameterIsNotNull(criteoBannerView, "bannerView");
        return new e(0, "BannerView(" + criteoBannerView.bannerAdUnit + ") is loading", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoBannerView criteoBannerView, Bid bid) {
        Intrinsics.checkParameterIsNotNull(criteoBannerView, "bannerView");
        StringBuilder sb = new StringBuilder();
        sb.append("BannerView(");
        sb.append(criteoBannerView.bannerAdUnit);
        sb.append(") is loading with bid ");
        sb.append(bid != null ? c.a(bid) : null);
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e b(CriteoBannerView criteoBannerView) {
        StringBuilder sb = new StringBuilder();
        sb.append("BannerView(");
        sb.append(criteoBannerView != null ? criteoBannerView.bannerAdUnit : null);
        sb.append(") is loaded");
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoBannerView criteoBannerView) {
        StringBuilder sb = new StringBuilder();
        sb.append("BannerView(");
        sb.append(criteoBannerView != null ? criteoBannerView.bannerAdUnit : null);
        sb.append(") failed to load");
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
