package com.criteo.publisher.advancednative;

import com.criteo.publisher.CriteoErrorCode;

public interface CriteoNativeAdListener {

    /* renamed from: com.criteo.publisher.advancednative.CriteoNativeAdListener$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAdClicked(CriteoNativeAdListener criteoNativeAdListener) {
        }

        public static void $default$onAdClosed(CriteoNativeAdListener criteoNativeAdListener) {
        }

        public static void $default$onAdFailedToReceive(CriteoNativeAdListener criteoNativeAdListener, CriteoErrorCode criteoErrorCode) {
        }

        public static void $default$onAdImpression(CriteoNativeAdListener criteoNativeAdListener) {
        }

        public static void $default$onAdLeftApplication(CriteoNativeAdListener criteoNativeAdListener) {
        }
    }

    void onAdClicked();

    void onAdClosed();

    void onAdFailedToReceive(CriteoErrorCode criteoErrorCode);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdReceived(CriteoNativeAd criteoNativeAd);
}
