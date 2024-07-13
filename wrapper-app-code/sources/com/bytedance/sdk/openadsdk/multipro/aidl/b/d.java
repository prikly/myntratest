package com.bytedance.sdk.openadsdk.multipro.aidl.b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* compiled from: RewardVideoListenerImpl */
public class d extends IRewardAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TTRewardVideoAd.RewardAdInteractionListener f2140a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f2141b = new Handler(Looper.getMainLooper());

    public d(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f2140a = rewardAdInteractionListener;
    }

    private void a() {
        this.f2140a = null;
        this.f2141b = null;
    }

    private Handler b() {
        Handler handler = this.f2141b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f2141b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        a();
    }

    public void onAdShow() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (d.this.f2140a != null) {
                    d.this.f2140a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (d.this.f2140a != null) {
                    d.this.f2140a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (d.this.f2140a != null) {
                    d.this.f2140a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (d.this.f2140a != null) {
                    d.this.f2140a.onVideoComplete();
                }
            }
        });
    }

    public void onVideoError() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (d.this.f2140a != null) {
                    d.this.f2140a.onVideoError();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (d.this.f2140a != null) {
                    d.this.f2140a.onSkippedVideo();
                }
            }
        });
    }

    public void onRewardVerify(boolean z, int i, String str, int i2, String str2) throws RemoteException {
        final boolean z2 = z;
        final int i3 = i;
        final String str3 = str;
        final int i4 = i2;
        final String str4 = str2;
        b().post(new Runnable() {
            public void run() {
                if (d.this.f2140a != null) {
                    d.this.f2140a.onRewardVerify(z2, i3, str3, i4, str4);
                }
            }
        });
    }
}
