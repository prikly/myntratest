package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class MaxFullscreenAdImpl extends a implements b.a, e.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f14476a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final com.applovin.impl.sdk.b f14477b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final com.applovin.impl.mediation.b f14478c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f14479d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public com.applovin.impl.mediation.a.c f14480e = null;

    /* renamed from: f  reason: collision with root package name */
    private c f14481f = c.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f14482g = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f14483h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public WeakReference<Activity> j = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public WeakReference<ViewGroup> k = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public WeakReference<Lifecycle> l = new WeakReference<>((Object) null);
    protected final b listenerWrapper;

    public interface a {
        Activity getActivity();
    }

    private class b implements a.C0141a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            k.d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            final boolean e2 = MaxFullscreenAdImpl.this.i;
            boolean unused = MaxFullscreenAdImpl.this.i = false;
            final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
            final MaxAd maxAd2 = maxAd;
            final MaxError maxError2 = maxError;
            MaxFullscreenAdImpl.this.a(c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd2);
                    if (e2 || !cVar.G() || !MaxFullscreenAdImpl.this.sdk.M().a(MaxFullscreenAdImpl.this.adUnitId)) {
                        k.a(MaxFullscreenAdImpl.this.adListener, maxAd2, maxError2, true);
                    } else {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                            public void run() {
                                boolean unused = MaxFullscreenAdImpl.this.i = true;
                                MaxFullscreenAdImpl.this.loadAd(MaxFullscreenAdImpl.this.f14476a != null ? MaxFullscreenAdImpl.this.f14476a.getActivity() : null);
                            }
                        });
                    }
                }
            });
        }

        public void onAdDisplayed(MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.i = false;
            MaxFullscreenAdImpl.this.f14477b.a();
            k.b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdHidden(final MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.i = false;
            MaxFullscreenAdImpl.this.f14478c.a(maxAd);
            MaxFullscreenAdImpl.this.a(c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    k.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.b();
            MaxFullscreenAdImpl.this.a(c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    k.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.c) maxAd);
            if (MaxFullscreenAdImpl.this.f14482g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.a(c.READY, (Runnable) new Runnable() {
                    public void run() {
                        if (MaxFullscreenAdImpl.this.i) {
                            Activity activity = (Activity) MaxFullscreenAdImpl.this.j.get();
                            if (activity == null) {
                                activity = MaxFullscreenAdImpl.this.sdk.ar();
                            }
                            Activity activity2 = activity;
                            if (MaxFullscreenAdImpl.this.f14483h) {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f14480e.getPlacement(), MaxFullscreenAdImpl.this.f14480e.ag(), (ViewGroup) MaxFullscreenAdImpl.this.k.get(), (Lifecycle) MaxFullscreenAdImpl.this.l.get(), activity2);
                            } else {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f14480e.getPlacement(), MaxFullscreenAdImpl.this.f14480e.ag(), activity2);
                            }
                        } else {
                            k.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                        }
                    }
                });
            }
        }

        public void onAdRequestStarted(String str) {
            k.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            k.a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            k.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            k.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            k.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, n nVar) {
        super(str, maxAdFormat, str2, nVar);
        this.f14476a = aVar;
        this.listenerWrapper = new b();
        this.f14477b = new com.applovin.impl.sdk.b(nVar, this);
        this.f14478c = new com.applovin.impl.mediation.b(nVar, this.listenerWrapper);
        nVar.E().a((e.a) this);
        v.f(str2, "Created new " + str2 + " (" + this + ")");
    }

    private void a() {
        com.applovin.impl.mediation.a.c cVar;
        synchronized (this.f14479d) {
            cVar = this.f14480e;
            this.f14480e = null;
        }
        this.sdk.H().destroyAd(cVar);
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar) {
        if (this.f14477b.a((com.applovin.impl.mediation.a.a) cVar)) {
            v vVar = this.logger;
            if (v.a()) {
                v vVar2 = this.logger;
                String str = this.tag;
                vVar2.b(str, "Handle ad loaded for regular ad: " + cVar);
            }
            this.f14480e = cVar;
            return;
        }
        v vVar3 = this.logger;
        if (v.a()) {
            this.logger.b(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c r7, java.lang.Runnable r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = r6.f14481f
            java.lang.Object r1 = r6.f14479d
            monitor-enter(r1)
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.IDLE     // Catch:{ all -> 0x01c5 }
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x0041
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0011
            goto L_0x015e
        L_0x0011:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0017
            goto L_0x015e
        L_0x0017:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0020
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "No ad is loading or loaded"
            goto L_0x0053
        L_0x0020:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
        L_0x003d:
            r0.e(r2, r3)     // Catch:{ all -> 0x01c5 }
            goto L_0x0056
        L_0x0041:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x008c
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.IDLE     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x004b
            goto L_0x015e
        L_0x004b:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0059
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "An ad is already loading"
        L_0x0053:
            com.applovin.impl.sdk.v.i(r0, r2)     // Catch:{ all -> 0x01c5 }
        L_0x0056:
            r3 = 0
            goto L_0x015e
        L_0x0059:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.READY     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x005f
            goto L_0x015e
        L_0x005f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0068
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "An ad is not ready to be shown yet"
            goto L_0x0053
        L_0x0068:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x006e
            goto L_0x015e
        L_0x006e:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x008c:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.READY     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x00dd
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.IDLE     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0096
            goto L_0x015e
        L_0x0096:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x009f
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "An ad is already loaded"
            goto L_0x0053
        L_0x009f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.READY     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00b2
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = "An ad is already marked as ready"
            goto L_0x003d
        L_0x00b2:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00b8
            goto L_0x015e
        L_0x00b8:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00be
            goto L_0x015e
        L_0x00be:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x00dd:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x0133
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.IDLE     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00e7
            goto L_0x015e
        L_0x00e7:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00f1
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "Can not load another ad while the ad is showing"
            goto L_0x0053
        L_0x00f1:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.READY     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0105
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = "An ad is already showing, ignoring"
            goto L_0x003d
        L_0x0105:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x010f
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "The ad is already showing, not showing another one"
            goto L_0x0053
        L_0x010f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0114
            goto L_0x015e
        L_0x0114:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x0133:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x013d
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "No operations are allowed on a destroyed instance"
            goto L_0x0053
        L_0x013d:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unknown state: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f14481f     // Catch:{ all -> 0x01c5 }
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x015e:
            if (r3 == 0) goto L_0x0192
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x018f
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r4.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Transitioning from "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f14481f     // Catch:{ all -> 0x01c5 }
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            r4.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "..."
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01c5 }
            r0.b(r2, r4)     // Catch:{ all -> 0x01c5 }
        L_0x018f:
            r6.f14481f = r7     // Catch:{ all -> 0x01c5 }
            goto L_0x01bc
        L_0x0192:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01bc
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r4.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Not allowed transition from "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f14481f     // Catch:{ all -> 0x01c5 }
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            r4.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x01c5 }
            r0.d(r2, r7)     // Catch:{ all -> 0x01c5 }
        L_0x01bc:
            monitor-exit(r1)     // Catch:{ all -> 0x01c5 }
            if (r3 == 0) goto L_0x01c4
            if (r8 == 0) goto L_0x01c4
            r8.run()
        L_0x01c4:
            return
        L_0x01c5:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c5 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c, java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f14477b.a();
        a();
        this.sdk.J().b((com.applovin.impl.mediation.a.a) maxAd);
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2) {
        this.f14478c.b(this.f14480e);
        this.f14480e.e(str);
        this.f14480e.f(str2);
        this.sdk.an().a((Object) this.f14480e);
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str3 = this.tag;
            vVar2.b(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f14480e + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a(this.f14480e);
    }

    private boolean a(Activity activity) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        } else if (!isReady()) {
            String str = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            v.i(this.tag, str);
            k.a(this.adListener, (MaxAd) this.f14480e, (MaxError) new MaxErrorImpl(-24, str), true);
            return false;
        } else {
            if (Utils.getAlwaysFinishActivitiesSetting(this.sdk.P()) != 0 && this.sdk.q().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                if (Utils.isPubInDebugMode(this.sdk.P(), this.sdk)) {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                } else if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.T)).booleanValue()) {
                    v.i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    k.a(this.adListener, (MaxAd) this.f14480e, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
                    return false;
                }
            }
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.z)).booleanValue() && (this.sdk.ah().a() || this.sdk.ah().b())) {
                v.i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                k.a(this.adListener, (MaxAd) this.f14480e, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
                return false;
            } else if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.A)).booleanValue() || i.a(this.sdk.P())) {
                String str2 = this.sdk.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.BLOCK_FULLSCREEN_ADS_SHOWING_IF_ACTIVITY_FINISHING);
                if ((!(StringUtils.isValidString(str2) && Boolean.valueOf(str2).booleanValue()) && !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.B)).booleanValue()) || activity == null || !activity.isFinishing()) {
                    return true;
                }
                v.i(this.tag, "Attempting to show ad when activity is finishing");
                k.a(this.adListener, (MaxAd) this.f14480e, (MaxError) new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing"), true);
                return false;
            } else {
                v.i(this.tag, "Attempting to show ad with no internet connection");
                k.a(this.adListener, (MaxAd) this.f14480e, (MaxError) new MaxErrorImpl(-1009), true);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        com.applovin.impl.mediation.a.c cVar;
        if (this.f14482g.compareAndSet(true, false)) {
            synchronized (this.f14479d) {
                cVar = this.f14480e;
                this.f14480e = null;
            }
            this.sdk.H().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public void destroy() {
        a(c.DESTROYED, (Runnable) new Runnable() {
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f14479d) {
                    if (MaxFullscreenAdImpl.this.f14480e != null) {
                        v vVar = MaxFullscreenAdImpl.this.logger;
                        if (v.a()) {
                            v vVar2 = MaxFullscreenAdImpl.this.logger;
                            String str = MaxFullscreenAdImpl.this.tag;
                            vVar2.b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f14480e + APSSharedUtil.TRUNCATE_SEPARATOR);
                        }
                        MaxFullscreenAdImpl.this.sdk.H().destroyAd(MaxFullscreenAdImpl.this.f14480e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.E().b((e.a) MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f14479d) {
            z = this.f14480e != null && this.f14480e.e() && this.f14481f == c.READY;
        }
        return z;
    }

    public void loadAd(Activity activity) {
        loadAd(activity, d.a.PUBLISHER_INITIATED);
    }

    public void loadAd(final Activity activity, final d.a aVar) {
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str = this.tag;
            vVar2.b(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (isReady()) {
            v vVar3 = this.logger;
            if (v.a()) {
                v vVar4 = this.logger;
                String str2 = this.tag;
                vVar4.b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            k.a(this.adListener, (MaxAd) this.f14480e, true);
            return;
        }
        a(c.LOADING, (Runnable) new Runnable() {
            public void run() {
                Context context = activity;
                if (context == null) {
                    context = MaxFullscreenAdImpl.this.sdk.ar() != null ? MaxFullscreenAdImpl.this.sdk.ar() : MaxFullscreenAdImpl.this.sdk.P();
                }
                MaxFullscreenAdImpl.this.sdk.H().loadAd(MaxFullscreenAdImpl.this.adUnitId, (String) null, MaxFullscreenAdImpl.this.adFormat, aVar, MaxFullscreenAdImpl.this.localExtraParameters, MaxFullscreenAdImpl.this.extraParameters, context, MaxFullscreenAdImpl.this.listenerWrapper);
            }
        });
    }

    public void onAdExpired() {
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str = this.tag;
            vVar2.b(str, "Ad expired " + getAdUnitId());
        }
        this.f14482g.set(true);
        a aVar = this.f14476a;
        Activity activity = aVar != null ? aVar.getActivity() : this.sdk.ai().a();
        if (activity == null) {
            b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.H().loadAd(this.adUnitId, (String) null, this.adFormat, d.a.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.c cVar = this.f14480e;
        if (cVar != null && cVar.f().equalsIgnoreCase(str)) {
            this.f14480e.b(str2);
            k.a(this.adReviewListener, str2, (MaxAd) this.f14480e);
        }
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        String c2 = this.sdk.N().c();
        if (!this.sdk.N().b() || c2 == null || c2.equals(this.f14480e.S())) {
            if (activity == null) {
                activity = this.sdk.ar();
            }
            if (a(activity)) {
                a(c.SHOWING, (Runnable) new Runnable() {
                    public void run() {
                        MaxFullscreenAdImpl.this.a(str, str2);
                        boolean unused = MaxFullscreenAdImpl.this.f14483h = false;
                        WeakReference unused2 = MaxFullscreenAdImpl.this.j = new WeakReference(activity);
                        MaxFullscreenAdImpl.this.sdk.H().showFullscreenAd(MaxFullscreenAdImpl.this.f14480e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f14480e.S() + "> which does not match selected ad network <" + c2 + ">";
        v.i(this.tag, str3);
        a(c.IDLE, (Runnable) new Runnable() {
            public void run() {
                com.applovin.impl.mediation.a.c b2 = MaxFullscreenAdImpl.this.f14480e;
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.f14480e);
                k.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) b2, (MaxError) new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str3), true);
            }
        });
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        if (viewGroup == null || lifecycle == null) {
            v.i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            k.a(this.adListener, (MaxAd) this.f14480e, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle."), true);
            return;
        }
        String c2 = this.sdk.N().c();
        if (!this.sdk.N().b() || c2 == null || c2.equals(this.f14480e.S())) {
            if (activity == null) {
                activity = this.sdk.ar();
            }
            final Activity activity2 = activity;
            if (a(activity2)) {
                final String str3 = str;
                final String str4 = str2;
                final ViewGroup viewGroup2 = viewGroup;
                final Lifecycle lifecycle2 = lifecycle;
                a(c.SHOWING, (Runnable) new Runnable() {
                    public void run() {
                        MaxFullscreenAdImpl.this.a(str3, str4);
                        boolean unused = MaxFullscreenAdImpl.this.f14483h = true;
                        WeakReference unused2 = MaxFullscreenAdImpl.this.j = new WeakReference(activity2);
                        WeakReference unused3 = MaxFullscreenAdImpl.this.k = new WeakReference(viewGroup2);
                        WeakReference unused4 = MaxFullscreenAdImpl.this.l = new WeakReference(lifecycle2);
                        MaxFullscreenAdImpl.this.sdk.H().showFullscreenAd(MaxFullscreenAdImpl.this.f14480e, viewGroup2, lifecycle2, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            return;
        }
        final String str5 = "Attempting to show ad from <" + this.f14480e.S() + "> which does not match selected ad network <" + c2 + ">";
        v.i(this.tag, str5);
        a(c.IDLE, (Runnable) new Runnable() {
            public void run() {
                com.applovin.impl.mediation.a.c b2 = MaxFullscreenAdImpl.this.f14480e;
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.f14480e);
                k.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) b2, (MaxError) new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str5), true);
            }
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f14476a ? "this" : this.adListener);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }
}
