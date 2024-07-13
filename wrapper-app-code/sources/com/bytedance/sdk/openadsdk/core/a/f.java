package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.k;
import java.util.List;

/* compiled from: NativeExpressAdListenerAdapter */
public class f implements TTAdNative.NativeExpressAdListener {

    /* renamed from: a  reason: collision with root package name */
    TTAdNative.NativeExpressAdListener f922a;

    public f(TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        this.f922a = nativeExpressAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f922a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f922a.onError(i, str);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        f.this.f922a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeExpressAdLoad(final List<TTNativeExpressAd> list) {
        if (this.f922a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f922a.onNativeExpressAdLoad(list);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        f.this.f922a.onNativeExpressAdLoad(list);
                    }
                });
            }
        }
    }
}
