package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    final n f14024a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f14025b;

    /* renamed from: c  reason: collision with root package name */
    final e f14026c;

    /* renamed from: d  reason: collision with root package name */
    final ViewGroup f14027d;

    /* renamed from: e  reason: collision with root package name */
    final FrameLayout.LayoutParams f14028e = new FrameLayout.LayoutParams(-1, -1, 17);

    a(e eVar, Activity activity, n nVar) {
        this.f14026c = eVar;
        this.f14024a = nVar;
        this.f14025b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f14027d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f14027d.setLayoutParams(this.f14028e);
    }

    public void a(View view) {
        this.f14027d.removeView(view);
    }

    public void a(m mVar) {
        if (mVar != null && mVar.getParent() == null) {
            a(this.f14026c.X(), (this.f14026c.ab() ? 3 : 5) | 48, mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e.c cVar, int i, m mVar) {
        mVar.a(cVar.f15275a, cVar.f15279e, cVar.f15278d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        layoutParams.setMargins(cVar.f15277c, cVar.f15276b, cVar.f15277c, 0);
        layoutParams.gravity = i;
        this.f14027d.addView(mVar, layoutParams);
    }
}
