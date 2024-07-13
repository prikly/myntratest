package com.applovin.mediation.hybridAds;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.r;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.a;

public class b extends Activity implements a.C0154a {

    /* renamed from: a  reason: collision with root package name */
    protected a f16004a;

    /* renamed from: b  reason: collision with root package name */
    protected c f16005b;

    /* renamed from: c  reason: collision with root package name */
    private n f16006c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdapterListener f16007d;

    /* access modifiers changed from: protected */
    public void a(c cVar, n nVar, MaxAdapterListener maxAdapterListener) {
        this.f16006c = nVar;
        this.f16007d = maxAdapterListener;
        this.f16005b = cVar.n();
    }

    public void a(a aVar) {
        if (!isFinishing()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.setBackgroundColor(this.f16005b.a());
        com.applovin.impl.sdk.utils.b.a(((Boolean) this.f16006c.a(com.applovin.impl.sdk.c.b.cL)).booleanValue(), this);
        a aVar = new a(this.f16005b, this);
        this.f16004a = aVar;
        aVar.setListener(this);
        this.f16004a.setVisibility(4);
        viewGroup.addView(this.f16004a);
        r.a((View) this.f16004a, this.f16005b.f());
        MaxAdapterListener maxAdapterListener = this.f16007d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f16007d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            }
        }
        super.onDestroy();
    }
}
