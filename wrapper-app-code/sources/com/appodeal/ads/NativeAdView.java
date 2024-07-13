package com.appodeal.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.native_ad.views.NativeAdViewContainer;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.utils.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

public class NativeAdView extends NativeAdViewContainer {

    /* renamed from: c  reason: collision with root package name */
    public View f16133c;

    /* renamed from: d  reason: collision with root package name */
    public View f16134d;

    /* renamed from: e  reason: collision with root package name */
    public View f16135e;

    /* renamed from: f  reason: collision with root package name */
    public View f16136f;

    /* renamed from: g  reason: collision with root package name */
    public View f16137g;

    /* renamed from: h  reason: collision with root package name */
    public NativeIconView f16138h;
    public NativeMediaView i;
    public l2 j;

    public NativeAdView(Context context) {
        super(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void destroy() {
        h1.j.a((String) null);
        l2 l2Var = this.j;
        if (l2Var != null) {
            l2Var.destroy();
        }
    }

    public View getCallToActionView() {
        return this.f16134d;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList();
        View view = this.f16133c;
        if (view != null) {
            arrayList.add(view);
        }
        View view2 = this.f16136f;
        if (view2 != null) {
            arrayList.add(view2);
        }
        View view3 = this.f16134d;
        if (view3 != null) {
            arrayList.add(view3);
        }
        View view4 = this.f16135e;
        if (view4 != null) {
            arrayList.add(view4);
        }
        NativeIconView nativeIconView = this.f16138h;
        if (nativeIconView != null) {
            arrayList.add(nativeIconView);
        }
        NativeMediaView nativeMediaView = this.i;
        if (nativeMediaView != null) {
            arrayList.add(nativeMediaView);
        }
        return arrayList;
    }

    public View getDescriptionView() {
        return this.f16136f;
    }

    public View getNativeIconView() {
        return this.f16138h;
    }

    public NativeMediaView getNativeMediaView() {
        return this.i;
    }

    public View getProviderView() {
        return this.f16137g;
    }

    public View getRatingView() {
        return this.f16135e;
    }

    public View getTitleView() {
        return this.f16133c;
    }

    public void registerView(NativeAd nativeAd) {
        registerView(nativeAd, RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    public void registerView(NativeAd nativeAd, String str) {
        Timer timer;
        Timer timer2;
        h1.f16450h.a();
        NativeIconView nativeIconView = this.f16138h;
        if (nativeIconView != null) {
            nativeIconView.removeAllViews();
        }
        NativeMediaView nativeMediaView = this.i;
        if (nativeMediaView != null) {
            nativeMediaView.removeAllViews();
        }
        l2 l2Var = this.j;
        if (l2Var != null) {
            NativeAdView nativeAdView = l2Var.n;
            if (nativeAdView != null) {
                nativeAdView.setOnClickListener((View.OnClickListener) null);
                for (View next : nativeAdView.getClickableViews()) {
                    if (!(next instanceof g2)) {
                        next.setOnClickListener((View.OnClickListener) null);
                    }
                }
            }
            HashMap hashMap = d0.f17503a;
            synchronized (hashMap) {
                d0.a aVar = (d0.a) hashMap.get(l2Var);
                if (aVar != null) {
                    aVar.b();
                    hashMap.remove(l2Var);
                }
            }
            g2 g2Var = l2Var.o;
            if (!(g2Var == null || (timer2 = g2Var.i) == null)) {
                timer2.cancel();
                g2Var.i = null;
            }
            UnifiedNativeAd unifiedNativeAd = l2Var.f16578b;
            if (unifiedNativeAd != null) {
                unifiedNativeAd.onUnregisterForInteraction();
            }
        }
        l2 l2Var2 = (l2) nativeAd;
        this.j = l2Var2;
        if (l2Var2 != null) {
            NativeAdView nativeAdView2 = l2Var2.n;
            if (nativeAdView2 != null) {
                nativeAdView2.setOnClickListener((View.OnClickListener) null);
                for (View next2 : nativeAdView2.getClickableViews()) {
                    if (!(next2 instanceof g2)) {
                        next2.setOnClickListener((View.OnClickListener) null);
                    }
                }
            }
            HashMap hashMap2 = d0.f17503a;
            synchronized (hashMap2) {
                d0.a aVar2 = (d0.a) hashMap2.get(l2Var2);
                if (aVar2 != null) {
                    aVar2.b();
                    hashMap2.remove(l2Var2);
                }
            }
            g2 g2Var2 = l2Var2.o;
            if (!(g2Var2 == null || (timer = g2Var2.i) == null)) {
                timer.cancel();
                g2Var2.i = null;
            }
            UnifiedNativeAd unifiedNativeAd2 = l2Var2.f16578b;
            if (unifiedNativeAd2 != null) {
                unifiedNativeAd2.onUnregisterForInteraction();
            }
        }
        NativeIconView nativeIconView2 = this.f16138h;
        if (nativeIconView2 != null) {
            this.j.a(nativeIconView2);
        }
        NativeMediaView nativeMediaView2 = this.i;
        if (nativeMediaView2 != null) {
            this.j.a(nativeMediaView2);
        }
        this.j.a(this, str);
    }

    public void setCallToActionView(View view) {
        h1.f16444b.a((String) null);
        this.f16134d = view;
    }

    public void setDescriptionView(View view) {
        h1.f16446d.a((String) null);
        this.f16136f = view;
    }

    public void setNativeIconView(NativeIconView nativeIconView) {
        h1.f16448f.a((String) null);
        this.f16138h = nativeIconView;
    }

    public void setNativeMediaView(NativeMediaView nativeMediaView) {
        h1.f16449g.a((String) null);
        this.i = nativeMediaView;
    }

    public void setProviderView(View view) {
        h1.f16447e.a((String) null);
        this.f16137g = view;
    }

    public void setRatingView(View view) {
        h1.f16445c.a((String) null);
        this.f16135e = view;
    }

    public void setTitleView(View view) {
        h1.f16443a.a((String) null);
        this.f16133c = view;
    }

    public void unregisterViewForInteraction() {
        Timer timer;
        h1.i.a((String) null);
        l2 l2Var = this.j;
        if (l2Var != null) {
            NativeAdView nativeAdView = l2Var.n;
            if (nativeAdView != null) {
                nativeAdView.setOnClickListener((View.OnClickListener) null);
                for (View next : nativeAdView.getClickableViews()) {
                    if (!(next instanceof g2)) {
                        next.setOnClickListener((View.OnClickListener) null);
                    }
                }
            }
            HashMap hashMap = d0.f17503a;
            synchronized (hashMap) {
                d0.a aVar = (d0.a) hashMap.get(l2Var);
                if (aVar != null) {
                    aVar.b();
                    hashMap.remove(l2Var);
                }
            }
            g2 g2Var = l2Var.o;
            if (!(g2Var == null || (timer = g2Var.i) == null)) {
                timer.cancel();
                g2Var.i = null;
            }
            UnifiedNativeAd unifiedNativeAd = l2Var.f16578b;
            if (unifiedNativeAd != null) {
                unifiedNativeAd.onUnregisterForInteraction();
            }
        }
    }
}
