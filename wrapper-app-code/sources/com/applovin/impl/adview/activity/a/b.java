package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;

public class b extends a {
    public b(e eVar, Activity activity, n nVar) {
        super(eVar, activity, nVar);
    }

    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    public /* bridge */ /* synthetic */ void a(m mVar) {
        super.a(mVar);
    }

    public void a(m mVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f14027d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.f14026c.X(), (this.f14026c.ab() ? 3 : 5) | 48, mVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f14027d);
        } else {
            this.f14025b.setContentView(this.f14027d);
        }
    }
}
