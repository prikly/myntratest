package com.criteo.publisher;

public interface CriteoInterstitialAdListener extends k {

    /* renamed from: com.criteo.publisher.CriteoInterstitialAdListener$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAdClosed(CriteoInterstitialAdListener criteoInterstitialAdListener) {
        }

        public static void $default$onAdOpened(CriteoInterstitialAdListener criteoInterstitialAdListener) {
        }
    }

    void onAdClosed();

    void onAdOpened();

    void onAdReceived(CriteoInterstitial criteoInterstitial);
}
