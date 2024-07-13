package com.applovin.mediation.hybridAds;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.adview.q;
import com.applovin.sdk.AppLovinSdkUtils;

public class a extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private C0154a f16003a;

    /* renamed from: com.applovin.mediation.hybridAds.a$a  reason: collision with other inner class name */
    interface C0154a {
        void a(a aVar);
    }

    public a(c cVar, Context context) {
        super(context);
        setOnClickListener(this);
        q qVar = new q(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, cVar.d());
        qVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        qVar.a(dpToPx);
        addView(qVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, cVar.d() + (cVar.e() * 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, cVar.b());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, cVar.c());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        this.f16003a.a(this);
    }

    public void setListener(C0154a aVar) {
        this.f16003a = aVar;
    }
}
