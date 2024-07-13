package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.k;

/* compiled from: RewardVideoAdListenerAdapter */
public class g implements TTAdNative.RewardVideoAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TTAdNative.RewardVideoAdListener f928a;

    public g(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f928a = rewardVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f928a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f928a.onError(i, str);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        g.this.f928a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f928a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f928a.onRewardVideoAdLoad(tTRewardVideoAd);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        g.this.f928a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                });
            }
        }
    }

    public void onRewardVideoCached() {
        if (this.f928a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f928a.onRewardVideoCached();
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        g.this.f928a.onRewardVideoCached();
                    }
                });
            }
        }
    }
}
