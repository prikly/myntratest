package com.criteo.publisher.advancednative;

import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.advancednative.CriteoNativeAdListener;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.Reference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggingCriteoNativeAdListener.kt */
public final class k implements CriteoNativeAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f2341a;

    /* renamed from: b  reason: collision with root package name */
    private final CriteoNativeAdListener f2342b;

    /* renamed from: c  reason: collision with root package name */
    private final Reference<CriteoNativeLoader> f2343c;

    public /* synthetic */ void onAdClosed() {
        CriteoNativeAdListener.CC.$default$onAdClosed(this);
    }

    public /* synthetic */ void onAdLeftApplication() {
        CriteoNativeAdListener.CC.$default$onAdLeftApplication(this);
    }

    public k(CriteoNativeAdListener criteoNativeAdListener, Reference<CriteoNativeLoader> reference) {
        Intrinsics.checkParameterIsNotNull(criteoNativeAdListener, "delegate");
        Intrinsics.checkParameterIsNotNull(reference, "nativeLoaderRef");
        this.f2342b = criteoNativeAdListener;
        this.f2343c = reference;
        g b2 = h.b(getClass());
        Intrinsics.checkExpressionValueIsNotNull(b2, "LoggerFactory.getLogger(javaClass)");
        this.f2341a = b2;
    }

    public void onAdReceived(CriteoNativeAd criteoNativeAd) {
        Intrinsics.checkParameterIsNotNull(criteoNativeAd, "nativeAd");
        this.f2341a.a(m.d(this.f2343c.get()));
        this.f2342b.onAdReceived(criteoNativeAd);
    }

    public void onAdFailedToReceive(CriteoErrorCode criteoErrorCode) {
        Intrinsics.checkParameterIsNotNull(criteoErrorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f2341a.a(m.b(this.f2343c.get()));
        this.f2342b.onAdFailedToReceive(criteoErrorCode);
    }

    public void onAdImpression() {
        this.f2341a.a(m.c(this.f2343c.get()));
        this.f2342b.onAdImpression();
    }

    public void onAdClicked() {
        this.f2341a.a(m.a(this.f2343c.get()));
        this.f2342b.onAdClicked();
    }
}
