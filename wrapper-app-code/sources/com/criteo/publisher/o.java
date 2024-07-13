package com.criteo.publisher;

import com.criteo.publisher.model.InterstitialAdUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CriteoInterstitialExt.kt */
public final class o {
    public static final InterstitialAdUnit a(CriteoInterstitial criteoInterstitial) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "$this$adUnit");
        return criteoInterstitial.interstitialAdUnit;
    }
}
