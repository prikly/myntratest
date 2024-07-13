package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.core.k;

/* compiled from: AppOpenAdListenerAdapter */
public class b implements TTAdNative.AppOpenAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final TTAdNative.AppOpenAdListener f897a;

    public b(TTAdNative.AppOpenAdListener appOpenAdListener) {
        this.f897a = appOpenAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f897a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f897a.onError(i, str);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        b.this.f897a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onAppOpenAdLoaded(final TTAppOpenAd tTAppOpenAd) {
        if (this.f897a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f897a.onAppOpenAdLoaded(tTAppOpenAd);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        b.this.f897a.onAppOpenAdLoaded(tTAppOpenAd);
                    }
                });
            }
        }
    }
}
