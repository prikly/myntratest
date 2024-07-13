package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.nativeAds.a.a;
import com.applovin.impl.mediation.nativeAds.a.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;

public class MaxAdPlacer implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private AppLovinSdkUtils.Size f16049a;

    /* renamed from: b  reason: collision with root package name */
    private MaxNativeAdViewBinder f16050b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f16051c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final b f16052d;

    /* renamed from: e  reason: collision with root package name */
    private Listener f16053e;
    protected final v logger;
    protected final n sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f16049a = AppLovinSdkUtils.Size.ZERO;
        n nVar = appLovinSdk.coreSdk;
        this.sdk = nVar;
        this.logger = nVar.D();
        this.f16051c = new a(maxAdPlacerSettings);
        this.f16052d = new b(maxAdPlacerSettings.getAdUnitId(), maxAdPlacerSettings.getMaxPreloadedAdCount(), context, this);
        if (v.a()) {
            v vVar = this.logger;
            vVar.b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    private void a() {
        int a2;
        while (this.f16052d.b() && (a2 = this.f16051c.a()) != -1) {
            if (v.a()) {
                v vVar = this.logger;
                vVar.b("MaxAdPlacer", "Placing ad at position: " + a2);
            }
            this.f16051c.a(this.f16052d.d(), a2);
            Listener listener = this.f16053e;
            if (listener != null) {
                listener.onAdLoaded(a2);
            }
        }
    }

    private void a(Collection<Integer> collection, Runnable runnable) {
        for (Integer intValue : collection) {
            this.f16052d.a(this.f16051c.c(intValue.intValue()));
        }
        runnable.run();
        if (!collection.isEmpty()) {
            if (v.a()) {
                v vVar = this.logger;
                vVar.b("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
            }
            if (this.f16053e != null) {
                for (Integer intValue2 : collection) {
                    this.f16053e.onAdRemoved(intValue2.intValue());
                }
            }
        }
    }

    public void clearAds() {
        a(this.f16051c.b(), new Runnable() {
            public void run() {
                v vVar = MaxAdPlacer.this.logger;
                if (v.a()) {
                    MaxAdPlacer.this.logger.b("MaxAdPlacer", "Clearing all cached ads");
                }
                MaxAdPlacer.this.f16051c.c();
                MaxAdPlacer.this.f16052d.e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i) {
        final Collection<Integer> d2 = this.f16051c.d(i);
        if (!d2.isEmpty()) {
            a(d2, new Runnable() {
                public void run() {
                    v vVar = MaxAdPlacer.this.logger;
                    if (v.a()) {
                        v vVar2 = MaxAdPlacer.this.logger;
                        vVar2.b("MaxAdPlacer", "Clearing trailing ads after position " + i);
                    }
                    MaxAdPlacer.this.f16051c.a((Collection<Integer>) d2);
                }
            });
        }
        return d2;
    }

    public void destroy() {
        if (v.a()) {
            this.logger.b("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f16052d.a();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return (long) (-System.identityHashCode(this.f16051c.c(i)));
        }
        return 0;
    }

    public AppLovinSdkUtils.Size getAdSize(int i, int i2) {
        if (isFilledPosition(i)) {
            boolean z = this.f16049a != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z ? this.f16049a.getWidth() : 360, i2);
            d dVar = (d) this.f16051c.c(i);
            if ("small_template_1".equalsIgnoreCase(dVar.A())) {
                return new AppLovinSdkUtils.Size(min, z ? this.f16049a.getHeight() : 120);
            } else if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(dVar.A())) {
                return new AppLovinSdkUtils.Size(min, (int) (((double) min) / (z ? ((double) this.f16049a.getWidth()) / ((double) this.f16049a.getHeight()) : 1.2d)));
            } else if (z) {
                return this.f16049a;
            } else {
                if (dVar.z() != null) {
                    View mainView = dVar.z().getMainView();
                    return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
                }
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.f16051c.e(i);
    }

    public int getAdjustedPosition(int i) {
        return this.f16051c.f(i);
    }

    public int getOriginalPosition(int i) {
        return this.f16051c.g(i);
    }

    public void insertItem(int i) {
        if (v.a()) {
            v vVar = this.logger;
            vVar.b("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.f16051c.h(i);
    }

    public boolean isAdPosition(int i) {
        return this.f16051c.a(i);
    }

    public boolean isFilledPosition(int i) {
        return this.f16051c.b(i);
    }

    public void loadAds() {
        if (v.a()) {
            this.logger.b("MaxAdPlacer", "Loading ads");
        }
        this.f16052d.c();
    }

    public void moveItem(int i, int i2) {
        this.f16051c.b(i, i2);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f16053e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f16053e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (v.a()) {
            v vVar = this.logger;
            vVar.e("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    public void onNativeAdLoaded() {
        if (v.a()) {
            this.logger.b("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i) {
        a(isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.emptyList(), new Runnable() {
            public void run() {
                v vVar = MaxAdPlacer.this.logger;
                if (v.a()) {
                    v vVar2 = MaxAdPlacer.this.logger;
                    vVar2.b("MaxAdPlacer", "Removing item at position: " + i);
                }
                MaxAdPlacer.this.f16051c.i(i);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderAd(int r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.nativeAds.a.a r0 = r6.f16051c
            com.applovin.mediation.MaxAd r0 = r0.c(r7)
            java.lang.String r1 = "MaxAdPlacer"
            if (r0 != 0) goto L_0x0027
            boolean r8 = com.applovin.impl.sdk.v.a()
            if (r8 == 0) goto L_0x0026
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "An ad is not available for position: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.b(r1, r7)
        L_0x0026:
            return
        L_0x0027:
            r2 = r0
            com.applovin.impl.mediation.a.d r2 = (com.applovin.impl.mediation.a.d) r2
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = r2.z()
            if (r2 == 0) goto L_0x004d
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0090
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Using pre-rendered ad at position: "
        L_0x003f:
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.b(r1, r7)
            goto L_0x0090
        L_0x004d:
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r2 = r6.f16050b
            java.lang.String r3 = "Unable to render ad at position: "
            if (r2 == 0) goto L_0x00b8
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = new com.applovin.mediation.nativeAds.MaxNativeAdView
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r6.f16050b
            android.content.Context r5 = r8.getContext()
            r2.<init>((com.applovin.mediation.nativeAds.MaxNativeAdViewBinder) r4, (android.content.Context) r5)
            com.applovin.impl.mediation.nativeAds.a.b r4 = r6.f16052d
            boolean r0 = r4.a(r2, r0)
            if (r0 == 0) goto L_0x0076
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0090
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Rendered ad at position: "
            goto L_0x003f
        L_0x0076:
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0090
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r0.e(r1, r7)
        L_0x0090:
            int r7 = r8.getChildCount()
        L_0x0094:
            if (r7 < 0) goto L_0x00a4
            android.view.View r0 = r8.getChildAt(r7)
            boolean r0 = r0 instanceof com.applovin.mediation.nativeAds.MaxNativeAdView
            if (r0 == 0) goto L_0x00a1
            r8.removeViewAt(r7)
        L_0x00a1:
            int r7 = r7 + -1
            goto L_0x0094
        L_0x00a4:
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == 0) goto L_0x00b3
            android.view.ViewParent r7 = r2.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r2)
        L_0x00b3:
            r7 = -1
            r8.addView(r2, r7, r7)
            return
        L_0x00b8:
            boolean r8 = com.applovin.impl.sdk.v.a()
            if (r8 == 0) goto L_0x00d7
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r7)
            java.lang.String r7 = ". If you're using a custom ad template, check that nativeAdViewBinder is set."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.e(r1, r7)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.renderAd(int, android.view.ViewGroup):void");
    }

    public void setAdSize(int i, int i2) {
        this.f16049a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(Listener listener) {
        this.f16053e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f16050b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.f16051c.a(i, i2);
        if (i != -1 && i2 != -1) {
            a();
        }
    }
}
