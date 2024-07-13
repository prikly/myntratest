package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.banner.MultiAdsBannerInterface;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import java.util.HashMap;

public abstract class MultiAdsBannerBaseAdapter implements MultiAdsBannerInterface {
    protected AdNetworkSdkModel adNetworkSdkModel;
    HashMap<String, String> bannerDetails;
    ViewGroup bannerViewContainer;
    protected Context context;
    Handler handler;
    protected MultiAdsBannerInterface.BannerListener listener;
    protected int priority;

    /* access modifiers changed from: protected */
    public abstract void init();

    public void onPause() {
    }

    public void onResume() {
    }

    protected MultiAdsBannerBaseAdapter(Context context2, AdNetworkSdkModel adNetworkSdkModel2, HashMap<String, String> hashMap) {
        this.context = context2;
        this.adNetworkSdkModel = adNetworkSdkModel2;
        this.bannerDetails = hashMap;
        this.priority = adNetworkSdkModel2.getPriority();
        this.handler = new Handler(context2.getMainLooper());
        init();
    }

    public void setListener(MultiAdsBannerInterface.BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    public int getPriority() {
        return this.priority;
    }
}
