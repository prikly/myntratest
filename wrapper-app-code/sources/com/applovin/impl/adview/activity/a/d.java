package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinSdkUtils;

public class d extends a {
    public d(e eVar, Activity activity, n nVar) {
        super(eVar, activity, nVar);
    }

    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    public void a(ImageView imageView, m mVar, m mVar2, a aVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f14027d.addView(appLovinAdView);
        int i = 3;
        if (mVar != null) {
            a(this.f14026c.X(), (this.f14026c.ac() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            if (!this.f14026c.ab()) {
                i = 5;
            }
            a(this.f14026c.X(), i | 48, mVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f14025b, ((Integer) this.f14024a.a(b.cD)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f14024a.a(b.cF)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f14025b, ((Integer) this.f14024a.a(b.cE)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f14027d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f14027d.addView(aVar, this.f14028e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f14027d);
        } else {
            this.f14025b.setContentView(this.f14027d);
        }
    }

    public /* bridge */ /* synthetic */ void a(m mVar) {
        super.a(mVar);
    }
}
