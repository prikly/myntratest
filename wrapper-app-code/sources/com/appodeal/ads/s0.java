package com.appodeal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import com.appodeal.ads.AppodealUnityBannerView;

public final class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f17194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17195b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppodealUnityBannerView f17196c;

    public s0(AppodealUnityBannerView appodealUnityBannerView, Activity activity, int i) {
        this.f17196c = appodealUnityBannerView;
        this.f17194a = activity;
        this.f17195b = i;
    }

    public final void run() {
        if (this.f17196c.f16113a != null) {
            q4.b(this.f17194a, this.f17195b);
            AppodealUnityBannerView.b bVar = this.f17196c.f16113a;
            if (bVar.getParent() != null && (bVar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) bVar.getParent()).removeView(bVar);
            }
            this.f17196c.f16113a = null;
        }
    }
}
