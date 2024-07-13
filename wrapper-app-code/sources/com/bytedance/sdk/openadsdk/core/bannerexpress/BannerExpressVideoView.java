package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import com.bytedance.sdk.openadsdk.utils.v;

public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(Context context, n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f977b = new NativeExpressVideoView(this.f976a, this.f979d, this.f980e, this.j);
        addView(this.f977b, new ViewGroup.LayoutParams(-1, -1));
    }

    public void a(n nVar, AdSlot adSlot) {
        this.f978c = new NativeExpressVideoView(this.f976a, nVar, adSlot, this.j);
        this.f978c.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressVideoView.this.f981f != null) {
                    BannerExpressVideoView.this.f981f.onAdClicked(BannerExpressVideoView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f2, float f3) {
                BannerExpressVideoView.this.a(f2, f3);
                BannerExpressVideoView.this.e();
            }
        });
        v.a((View) this.f978c, 8);
        addView(this.f978c, new ViewGroup.LayoutParams(-1, -1));
    }

    public a getVideoModel() {
        if (this.f977b != null) {
            return ((NativeExpressVideoView) this.f977b).getVideoModel();
        }
        return null;
    }
}
