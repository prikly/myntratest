package com.unity3d.scar.adapter.common;

public interface IScarInterstitialAdListenerWrapper extends IScarAdListenerWrapper {
    void onAdFailedToShow(int i, String str);

    void onAdImpression();
}
