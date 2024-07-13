package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.k;
import java.util.List;

/* compiled from: FeedAdListenerAdapter */
public class c implements TTAdNative.FeedAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TTAdNative.FeedAdListener f903a = null;

    public c(TTAdNative.FeedAdListener feedAdListener) {
        this.f903a = feedAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f903a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f903a.onError(i, str);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        c.this.f903a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFeedAdLoad(final List<TTFeedAd> list) {
        if (this.f903a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f903a.onFeedAdLoad(list);
            } else {
                k.d().post(new Runnable() {
                    public void run() {
                        c.this.f903a.onFeedAdLoad(list);
                    }
                });
            }
        }
    }
}
