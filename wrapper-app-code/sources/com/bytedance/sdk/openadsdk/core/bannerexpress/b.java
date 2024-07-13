package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.multipro.b.a;

/* compiled from: TTBannerExpressVideoAdImpl */
public class b extends a {
    public b(Context context, n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    public void a(Context context, n nVar, AdSlot adSlot) {
        this.f987a = new BannerExpressVideoView(context, nVar, adSlot);
        a(this.f987a.getCurView(), this.f989c);
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        if (this.f987a != null) {
            this.f987a.setVideoAdListener(expressVideoAdListener);
        }
    }

    public a getVideoModel() {
        if (this.f987a != null) {
            return ((BannerExpressVideoView) this.f987a).getVideoModel();
        }
        return null;
    }
}
