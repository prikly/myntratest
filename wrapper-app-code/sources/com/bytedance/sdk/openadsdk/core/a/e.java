package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.k;
import java.util.List;

/* compiled from: NativeAdListenerAdapter */
public class e implements TTAdNative.NativeAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TTAdNative.NativeAdListener f916a;

    public e(TTAdNative.NativeAdListener nativeAdListener) {
        this.f916a = nativeAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f916a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f916a.onError(i, str);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        e.this.f916a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeAdLoad(final List<TTNativeAd> list) {
        if (this.f916a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f916a.onNativeAdLoad(list);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        e.this.f916a.onNativeAdLoad(list);
                    }
                });
            }
        }
    }
}
