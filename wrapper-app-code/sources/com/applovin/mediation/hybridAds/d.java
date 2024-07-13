package com.applovin.mediation.hybridAds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final n f16009a;

    private static class a extends com.applovin.impl.sdk.utils.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f16010a;

        /* renamed from: b  reason: collision with root package name */
        private final n f16011b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdapterListener f16012c;

        public a(c cVar, n nVar, MaxAdapterListener maxAdapterListener) {
            this.f16010a = cVar;
            this.f16011b = nVar;
            this.f16012c = maxAdapterListener;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                c cVar = this.f16010a;
                ((MaxHybridMRecAdActivity) activity).a(cVar, cVar.o(), this.f16011b, this.f16012c);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && this.f16010a.x().get()) {
                this.f16011b.ai().b(this);
            }
        }
    }

    private static class b extends com.applovin.impl.sdk.utils.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f16013a;

        /* renamed from: b  reason: collision with root package name */
        private final n f16014b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdapterListener f16015c;

        public b(c cVar, n nVar, MaxAdapterListener maxAdapterListener) {
            this.f16013a = cVar;
            this.f16014b = nVar;
            this.f16015c = maxAdapterListener;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                c cVar = this.f16013a;
                ((MaxHybridNativeAdActivity) activity).a(cVar, cVar.getNativeAd(), this.f16014b, this.f16015c);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && this.f16013a.x().get()) {
                this.f16014b.ai().b(this);
            }
        }
    }

    public d(n nVar) {
        this.f16009a = nVar;
    }

    public void a(c cVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        Intent intent;
        Utils.assertMainThread();
        if (activity == null) {
            activity = this.f16009a.ai().a();
        }
        if (cVar.getNativeAd() != null) {
            this.f16009a.D();
            if (v.a()) {
                this.f16009a.D().b("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f16009a.ai().a(new b(cVar, this.f16009a, maxAdapterListener));
            intent = new Intent(activity, MaxHybridNativeAdActivity.class);
        } else if (cVar.o() != null) {
            this.f16009a.D();
            if (v.a()) {
                this.f16009a.D().b("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f16009a.ai().a(new a(cVar, this.f16009a, maxAdapterListener));
            intent = new Intent(activity, MaxHybridMRecAdActivity.class);
        } else if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
            return;
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
            return;
        } else {
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
        activity.startActivity(intent);
    }
}
