package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.content.Context;
import android.os.Handler;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen.MultiAdsFullscreenInterface;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.util.HashMap;

public abstract class MultiAdsFullscreenBaseAdapter implements MultiAdsFullscreenInterface {
    protected AdNetworkSdkModel adNetworkSdkModel;
    protected Context context;
    HashMap<String, String> fullscreenDetails;
    Handler handler;
    protected MultiAdsFullscreenInterface.FullscreenListener listener;
    protected int priority;
    AppsgeyserProgressDialog progressDialog;

    /* access modifiers changed from: protected */
    public abstract void init();

    public void initCompleted() {
    }

    protected MultiAdsFullscreenBaseAdapter(Context context2, AdNetworkSdkModel adNetworkSdkModel2, HashMap<String, String> hashMap) {
        this.context = context2;
        this.adNetworkSdkModel = adNetworkSdkModel2;
        this.fullscreenDetails = hashMap;
        this.priority = adNetworkSdkModel2.getPriority();
        this.handler = new Handler(context2.getMainLooper());
        init();
    }

    public void setListener(MultiAdsFullscreenInterface.FullscreenListener fullscreenListener) {
        this.listener = fullscreenListener;
    }

    public int getPriority() {
        return this.priority;
    }
}
