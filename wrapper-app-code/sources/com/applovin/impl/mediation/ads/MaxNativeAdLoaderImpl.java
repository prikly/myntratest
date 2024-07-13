package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class MaxNativeAdLoaderImpl extends a implements d.a {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f14522a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f14523b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f14524c;

    /* renamed from: d  reason: collision with root package name */
    private d.a f14525d = d.a.PUBLISHER_INITIATED;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public MaxNativeAdListener f14526e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, MaxNativeAdView> f14527f = CollectionUtils.map();

    /* renamed from: g  reason: collision with root package name */
    private final Object f14528g = new Object();

    private class a implements a.C0141a {
        private a() {
        }

        /* access modifiers changed from: private */
        public void a(MaxNativeAdView maxNativeAdView) {
            com.applovin.impl.mediation.a.d c2;
            b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker != null && (c2 = adViewTracker.c()) != null) {
                v vVar = MaxNativeAdLoaderImpl.this.logger;
                if (v.a()) {
                    MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "Destroying previous ad");
                }
                MaxNativeAdLoaderImpl.this.destroy(c2);
            }
        }

        public void onAdClicked(MaxAd maxAd) {
            k.a(MaxNativeAdLoaderImpl.this.f14526e, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdView unused = MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            k.a(MaxNativeAdLoaderImpl.this.f14526e, str, maxError, true);
        }

        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    v vVar = MaxNativeAdLoaderImpl.this.logger;
                    if (v.a()) {
                        MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "Native ad loaded");
                    }
                    com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
                    dVar.e(MaxNativeAdLoaderImpl.this.f14523b);
                    dVar.f(MaxNativeAdLoaderImpl.this.f14524c);
                    MaxNativeAdLoaderImpl.this.sdk.an().a((Object) dVar);
                    MaxNativeAdView a2 = MaxNativeAdLoaderImpl.this.a(dVar.a());
                    if (a2 == null) {
                        v vVar2 = MaxNativeAdLoaderImpl.this.logger;
                        if (v.a()) {
                            MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "No custom view provided, checking template");
                        }
                        String A = dVar.A();
                        if (StringUtils.isValidString(A)) {
                            v vVar3 = MaxNativeAdLoaderImpl.this.logger;
                            if (v.a()) {
                                v vVar4 = MaxNativeAdLoaderImpl.this.logger;
                                String str = MaxNativeAdLoaderImpl.this.tag;
                                vVar4.b(str, "Using template: " + A + APSSharedUtil.TRUNCATE_SEPARATOR);
                            }
                            a2 = new MaxNativeAdView(A, MaxNativeAdLoaderImpl.this.sdk.P());
                        }
                    }
                    if (a2 == null) {
                        v vVar5 = MaxNativeAdLoaderImpl.this.logger;
                        if (v.a()) {
                            MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                        }
                        k.a(MaxNativeAdLoaderImpl.this.f14526e, (MaxNativeAdView) null, maxAd, true);
                        dVar.a((d.a) MaxNativeAdLoaderImpl.this);
                        return;
                    }
                    a.this.a(a2);
                    MaxNativeAdLoaderImpl.this.a(a2, dVar, dVar.getNativeAd());
                    k.a(MaxNativeAdLoaderImpl.this.f14526e, a2, maxAd, true);
                    dVar.a((d.a) MaxNativeAdLoaderImpl.this);
                    MaxNativeAdLoaderImpl.this.a(a2);
                }
            });
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            k.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, n nVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", nVar);
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str2 = this.tag;
            vVar2.b(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f14528g) {
            remove = this.f14527f.remove(str);
        }
        return remove;
    }

    /* access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (h.c()) {
                if (!maxNativeAdView.isAttachedToWindow()) {
                    return;
                }
            } else if (maxNativeAdView.getParent() == null) {
                return;
            }
            adViewTracker.b();
        }
    }

    /* access modifiers changed from: private */
    public void a(final MaxNativeAdView maxNativeAdView, final com.applovin.impl.mediation.a.d dVar, final MaxNativeAd maxNativeAd) {
        dVar.a(maxNativeAdView);
        a(dVar);
        AnonymousClass2 r0 = new Runnable() {
            public void run() {
                v vVar = MaxNativeAdLoaderImpl.this.logger;
                if (v.a()) {
                    v vVar2 = MaxNativeAdLoaderImpl.this.logger;
                    String str = MaxNativeAdLoaderImpl.this.tag;
                    vVar2.b(str, "Rendering native ad view: " + maxNativeAdView);
                }
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f14522a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                if (!maxNativeAd.prepareForInteraction(maxNativeAdView.getClickableViews(), maxNativeAdView)) {
                    maxNativeAd.prepareViewForInteraction(maxNativeAdView);
                }
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(r0);
        } else {
            this.sdk.V().a((com.applovin.impl.sdk.e.a) new z(this.sdk, r0), o.a.MEDIATION_MAIN);
        }
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f14528g) {
                this.f14527f.put(str, maxNativeAdView);
            }
        }
    }

    public void destroy() {
        this.f14526e = null;
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        b adViewTracker;
        if (maxAd instanceof com.applovin.impl.mediation.a.d) {
            com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
            if (dVar.D()) {
                v vVar = this.logger;
                if (v.a()) {
                    v vVar2 = this.logger;
                    String str = this.tag;
                    vVar2.b(str, "Native ad (" + dVar + ") has already been destroyed");
                    return;
                }
                return;
            }
            MaxNativeAdView z = dVar.z();
            if (!(z == null || (adViewTracker = z.getAdViewTracker()) == null || !maxAd.equals(adViewTracker.c()))) {
                z.recycle();
            }
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (!(nativeAd == null || nativeAd.getAdViewTracker() == null)) {
                nativeAd.getAdViewTracker().a();
            }
            dVar.G();
            this.sdk.H().destroyAd(dVar);
            this.sdk.M().a(this.adUnitId, dVar.a());
            return;
        }
        v vVar3 = this.logger;
        if (v.a()) {
            v vVar4 = this.logger;
            String str2 = this.tag;
            vVar4.b(str2, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    public String getPlacement() {
        return this.f14523b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((com.applovin.impl.mediation.a.d) maxAd).getNativeAd();
        if (nativeAd == null) {
            v vVar = this.logger;
            if (v.a()) {
                this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker == null) {
            v vVar2 = this.logger;
            if (v.a()) {
                this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
                return;
            }
            return;
        }
        adViewTracker.b();
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str = this.tag;
            vVar2.b(str, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f14522a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.H().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f14525d, this.localExtraParameters, this.extraParameters, this.sdk.P(), this.f14522a);
    }

    public void onAdExpired(com.applovin.impl.mediation.a.d dVar) {
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str = this.tag;
            vVar2.b(str, "Ad expired for ad unit id " + getAdUnitId());
        }
        k.b(this.f14526e, (MaxAd) dVar, true);
    }

    public void registerClickableViews(final List<View> list, final ViewGroup viewGroup, MaxAd maxAd) {
        com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd == null) {
            v vVar = this.logger;
            if (v.a()) {
                this.logger.e(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        this.sdk.an().a((Object) dVar);
        a(dVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new b(dVar, viewGroup, this.f14522a, this.sdk));
        AnonymousClass1 r7 = new Runnable() {
            public void run() {
                if (!nativeAd.prepareForInteraction(list, viewGroup)) {
                    v.i(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
                }
            }
        };
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(r7);
        } else {
            this.sdk.V().a((com.applovin.impl.sdk.e.a) new z(this.sdk, r7), o.a.MEDIATION_MAIN);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        String str;
        String str2;
        if (!(maxAd instanceof com.applovin.impl.mediation.a.d)) {
            str = this.tag;
            str2 = "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.";
        } else if (maxNativeAdView == null) {
            str = this.tag;
            str2 = "Failed to render native ad. `adView` to render cannot be null.";
        } else {
            com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd == null) {
                v vVar = this.logger;
                if (v.a()) {
                    this.logger.e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                }
                return false;
            } else if (!nativeAd.isExpired() || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.E)).booleanValue()) {
                a(maxNativeAdView, dVar, nativeAd);
                a(maxNativeAdView);
                return true;
            } else {
                str = this.tag;
                str2 = "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`";
            }
        }
        v.i(str, str2);
        return false;
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f14524c = str;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.a)) {
            this.f14525d = (d.a) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str = this.tag;
            vVar2.b(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f14526e = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f14523b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + '\'' + ", nativeAdListener=" + this.f14526e + ", revenueListener=" + this.revenueListener + '}';
    }
}
