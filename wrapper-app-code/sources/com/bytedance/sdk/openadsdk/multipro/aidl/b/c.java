package com.bytedance.sdk.openadsdk.multipro.aidl.b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;

/* compiled from: FullScreenVideoListenerImpl */
public class c extends IFullScreenVideoAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f2133a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f2134b = new Handler(Looper.getMainLooper());

    public c(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f2133a = fullScreenVideoAdInteractionListener;
    }

    private void a() {
        this.f2133a = null;
        this.f2134b = null;
    }

    private Handler b() {
        Handler handler = this.f2134b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f2134b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        a();
    }

    public void onAdShow() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (c.this.f2133a != null) {
                    c.this.f2133a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (c.this.f2133a != null) {
                    c.this.f2133a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (c.this.f2133a != null) {
                    c.this.f2133a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (c.this.f2133a != null) {
                    c.this.f2133a.onVideoComplete();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (c.this.f2133a != null) {
                    c.this.f2133a.onSkippedVideo();
                }
            }
        });
    }
}
