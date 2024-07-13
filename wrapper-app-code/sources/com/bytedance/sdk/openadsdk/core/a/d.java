package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.core.k;

/* compiled from: FullScreenVideoAdListenerAdapter */
public class d implements TTAdNative.FullScreenVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    TTAdNative.FullScreenVideoAdListener f909a;

    public d(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f909a = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f909a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f909a.onError(i, str);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        d.this.f909a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f909a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f909a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        d.this.f909a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f909a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f909a.onFullScreenVideoCached();
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        d.this.f909a.onFullScreenVideoCached();
                    }
                });
            }
        }
    }
}
