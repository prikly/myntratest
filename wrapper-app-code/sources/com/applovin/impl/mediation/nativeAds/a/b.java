package com.applovin.impl.mediation.nativeAds.a;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.LinkedList;
import java.util.Queue;

public class b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f15076a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxNativeAdLoader f15077b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue<MaxAd> f15078c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f15079d = false;

    /* renamed from: e  reason: collision with root package name */
    private final Object f15080e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private a f15081f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public b(String str, int i, Context context, a aVar) {
        this.f15076a = i;
        this.f15081f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.f15077b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        this.f15077b.setRevenueListener(this);
        this.f15077b.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.a.NATIVE_AD_PLACER);
    }

    public void a() {
        this.f15081f = null;
        e();
        this.f15077b.destroy();
    }

    public void a(MaxAd maxAd) {
        this.f15077b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f15077b.render(maxNativeAdView, maxAd);
    }

    public boolean b() {
        boolean z;
        synchronized (this.f15080e) {
            z = !this.f15078c.isEmpty();
        }
        return z;
    }

    public void c() {
        synchronized (this.f15080e) {
            if (!this.f15079d && this.f15078c.size() < this.f15076a) {
                this.f15079d = true;
                this.f15077b.loadAd();
            }
        }
    }

    public MaxAd d() {
        MaxAd maxAd;
        synchronized (this.f15080e) {
            maxAd = null;
            while (!this.f15078c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = this.f15078c.remove();
            }
            c();
        }
        return maxAd;
    }

    public void e() {
        synchronized (this.f15080e) {
            for (MaxAd a2 : this.f15078c) {
                a(a2);
            }
            this.f15078c.clear();
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f15081f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f15081f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f15081f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f15080e) {
            this.f15078c.add(maxAd);
            this.f15079d = false;
            c();
        }
        a aVar = this.f15081f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
