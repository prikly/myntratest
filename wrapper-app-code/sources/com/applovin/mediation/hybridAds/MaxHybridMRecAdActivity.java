package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.n;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;

public class MaxHybridMRecAdActivity extends b {

    /* renamed from: c  reason: collision with root package name */
    private View f15999c;

    /* access modifiers changed from: protected */
    public void a(c cVar, View view, n nVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, nVar, maxAdapterListener);
        this.f15999c = view;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewGroup) findViewById(16908290)).addView(this.f15999c);
        this.f16004a.bringToFront();
    }
}
