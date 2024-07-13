package com.appodeal.ads;

import android.view.View;
import com.appodeal.ads.Native;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.d0;
import com.appodeal.ads.utils.exception_handler.a;
import java.util.ArrayList;
import java.util.HashMap;

public final class m2 implements d0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l2 f16612a;

    public m2(l2 l2Var) {
        this.f16612a = l2Var;
    }

    public final void a() {
        l2 l2Var = this.f16612a;
        l2Var.w = true;
        l2Var.f16578b.onAdImpression(l2Var.n);
        l2Var.a(l2Var.f16578b.getImpressionNotifyUrls());
        l2 l2Var2 = this.f16612a;
        l2Var2.f16579c.onAdShown(l2Var2.f16578b);
        l2 l2Var3 = this.f16612a;
        NativeAdView nativeAdView = l2Var3.n;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (nativeAdView.getTitleView() == null) {
            arrayList2.add("Title");
        } else {
            hashMap.put(nativeAdView.getTitleView(), "Title");
        }
        if (nativeAdView.getCallToActionView() == null) {
            arrayList2.add("CallToAction");
        } else {
            hashMap.put(nativeAdView.getCallToActionView(), "CallToAction");
        }
        if (nativeAdView.getNativeIconView() == null && nativeAdView.getNativeMediaView() == null) {
            arrayList2.add("NativeIconView/NativeMediaView");
        } else {
            if (Native.f16127c != Native.MediaAssetType.IMAGE) {
                hashMap.put(nativeAdView.getNativeIconView(), "NativeIconView");
            } else if (nativeAdView.getNativeIconView() != null) {
                arrayList.add("NativeIconView");
            }
            if (Native.f16127c != Native.MediaAssetType.ICON) {
                hashMap.put(nativeAdView.getNativeMediaView(), "NativeMediaView");
            } else if (nativeAdView.getNativeMediaView() != null) {
                arrayList.add("NativeMediaView");
            }
        }
        if (l2Var3.f16578b.obtainProviderView(nativeAdView.getContext()) != null) {
            if (nativeAdView.getProviderView() == null) {
                arrayList2.add("ProviderView");
            } else {
                hashMap.put(nativeAdView.getProviderView(), "ProviderView");
            }
        }
        if (!arrayList2.isEmpty()) {
            Log.log(new a(String.format("Required assets: %s are not added to NativeAdView", new Object[]{arrayList2})));
        }
        if (!arrayList.isEmpty()) {
            Log.log(new a(String.format("Non necessary assets: %s are not added to NativeAdView", new Object[]{arrayList})));
        }
        HashMap hashMap2 = (HashMap) l2.a(n5.a((View) nativeAdView), (View) nativeAdView, hashMap);
        if (!hashMap2.isEmpty()) {
            Log.log(new a(String.format("Required assets: %s are not visible or not found", new Object[]{hashMap2.values()})));
        }
    }

    public final void b() {
        l2 l2Var = this.f16612a;
        l2Var.f16578b.onAdFinish();
        l2Var.a(l2Var.f16578b.getFinishNotifyUrls());
        l2 l2Var2 = this.f16612a;
        l2Var2.f16579c.onAdFinished(l2Var2.f16578b);
    }
}
