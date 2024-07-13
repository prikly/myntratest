package com.bytedance.sdk.openadsdk.multipro.aidl.b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;

/* compiled from: AppOpenAdListenerImpl */
public class a extends IAppOpenAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TTAppOpenAd.AppOpenAdInteractionListener f2123a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f2124b = new Handler(Looper.getMainLooper());

    public a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f2123a = appOpenAdInteractionListener;
    }

    private void a() {
        this.f2123a = null;
        this.f2124b = null;
    }

    private Handler b() {
        Handler handler = this.f2124b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f2124b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        a();
    }

    public void onAdShow() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (a.this.f2123a != null) {
                    a.this.f2123a.onAdShow();
                }
            }
        });
    }

    public void onAdClicked() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (a.this.f2123a != null) {
                    a.this.f2123a.onAdClicked();
                }
            }
        });
    }

    public void onAdSkip() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (a.this.f2123a != null) {
                    a.this.f2123a.onAdSkip();
                }
            }
        });
    }

    public void onAdTimeOver() throws RemoteException {
        b().post(new Runnable() {
            public void run() {
                if (a.this.f2123a != null) {
                    a.this.f2123a.onAdCountdownToZero();
                }
            }
        });
    }
}
