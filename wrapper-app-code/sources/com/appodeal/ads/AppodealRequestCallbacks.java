package com.appodeal.ads;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&J,\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&J4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J,\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\tH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/AppodealRequestCallbacks;", "", "onClick", "", "adType", "", "networkName", "adUnitName", "loadedEcpm", "", "onImpression", "onRequestFinish", "fill", "", "onRequestStart", "predictedEcpm", "onWaterfallFinish", "onWaterfallStart", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface AppodealRequestCallbacks {
    void onClick(String str, String str2, String str3, double d2);

    void onImpression(String str, String str2, String str3, double d2);

    void onRequestFinish(String str, String str2, String str3, double d2, boolean z);

    void onRequestStart(String str, String str2, String str3, double d2);

    void onWaterfallFinish(String str, double d2, boolean z);

    void onWaterfallStart(String str);
}
