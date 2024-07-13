package com.bytedance.sdk.openadsdk.component.reward;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* compiled from: RewardFullProxyListener */
public class f implements TTAdNative.FullScreenVideoAdListener, TTAdNative.RewardVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    final TTAdNative.RewardVideoAdListener f724a;

    /* renamed from: b  reason: collision with root package name */
    final TTAdNative.FullScreenVideoAdListener f725b;

    public f(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f724a = rewardVideoAdListener;
        this.f725b = null;
    }

    public f(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f724a = null;
        this.f725b = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f724a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (f.this.f724a != null) {
                        f.this.f724a.onError(i, str);
                    }
                }
            });
        }
        if (this.f725b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (f.this.f725b != null) {
                        f.this.f725b.onError(i, str);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f725b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (f.this.f725b != null) {
                        f.this.f725b.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f725b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (f.this.f725b != null) {
                        f.this.f725b.onFullScreenVideoCached();
                    }
                }
            });
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f724a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (f.this.f724a != null) {
                        f.this.f724a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                }
            });
        }
    }

    public void onRewardVideoCached() {
        if (this.f724a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (f.this.f724a != null) {
                        f.this.f724a.onRewardVideoCached();
                    }
                }
            });
        }
    }
}
