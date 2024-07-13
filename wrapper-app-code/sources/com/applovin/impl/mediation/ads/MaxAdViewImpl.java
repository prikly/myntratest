package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.y;
import com.applovin.impl.sdk.z;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;

public class MaxAdViewImpl extends a implements d.a, e.a, z.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f14457a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final MaxAdView f14458b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f14459c = UUID.randomUUID().toString().toLowerCase(Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final View f14460d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f14461e = Long.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.mediation.a.b f14462f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f14463g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f14464h;
    /* access modifiers changed from: private */
    public final a i;
    /* access modifiers changed from: private */
    public final c j;
    /* access modifiers changed from: private */
    public final d k;
    /* access modifiers changed from: private */
    public final y l;
    /* access modifiers changed from: private */
    public final z m;
    /* access modifiers changed from: private */
    public final Object n = new Object();
    /* access modifiers changed from: private */
    public com.applovin.impl.mediation.a.b o = null;
    private boolean p;
    /* access modifiers changed from: private */
    public boolean q;
    private boolean r;
    private boolean s;
    /* access modifiers changed from: private */
    public boolean t = false;
    private boolean u;
    /* access modifiers changed from: private */
    public boolean v;
    private boolean w;
    /* access modifiers changed from: private */
    public boolean x;
    private boolean y;
    private boolean z;

    private class a extends b {
        private a() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            v vVar = MaxAdViewImpl.this.logger;
            if (v.a()) {
                v vVar2 = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar2.b(str2, "Calling ad load failed callback for publisher: " + MaxAdViewImpl.this.adListener);
            }
            k.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.t) {
                v vVar = MaxAdViewImpl.this.logger;
                if (v.a()) {
                    v vVar2 = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar2.b(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.H().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            bVar.e(MaxAdViewImpl.this.f14463g);
            bVar.f(MaxAdViewImpl.this.f14464h);
            if (bVar.o() != null) {
                MaxAdViewImpl.this.a(bVar);
                if (bVar.C()) {
                    long D = bVar.D();
                    MaxAdViewImpl.this.sdk.D();
                    if (v.a()) {
                        v D2 = MaxAdViewImpl.this.sdk.D();
                        String str2 = MaxAdViewImpl.this.tag;
                        D2.b(str2, "Scheduling banner ad refresh " + D + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    }
                    MaxAdViewImpl.this.k.a(D);
                    if (MaxAdViewImpl.this.k.f() || MaxAdViewImpl.this.q) {
                        v vVar3 = MaxAdViewImpl.this.logger;
                        if (v.a()) {
                            MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.k.d();
                    }
                }
                v vVar4 = MaxAdViewImpl.this.logger;
                if (v.a()) {
                    v vVar5 = MaxAdViewImpl.this.logger;
                    String str3 = MaxAdViewImpl.this.tag;
                    vVar5.b(str3, "Calling ad load success callback for publisher: " + MaxAdViewImpl.this.adListener);
                }
                k.a(MaxAdViewImpl.this.adListener, maxAd, true);
                return;
            }
            MaxAdViewImpl.this.sdk.H().destroyAd(bVar);
            onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    private abstract class b implements a.C0141a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14473a;

        private b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                k.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.E() || MaxAdViewImpl.this.x) && this.f14473a) {
                    this.f14473a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                k.h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                k.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                k.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.E() || MaxAdViewImpl.this.x) && !MaxAdViewImpl.this.k.f()) {
                    this.f14473a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                k.g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                k.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdRequestStarted(String str) {
            k.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            k.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    private class c extends b {
        private c() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            v vVar = MaxAdViewImpl.this.logger;
            if (v.a()) {
                v vVar2 = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar2.b(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.t) {
                v vVar = MaxAdViewImpl.this.logger;
                if (v.a()) {
                    v vVar2 = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar2.b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.H().destroyAd(maxAd);
                return;
            }
            v vVar3 = MaxAdViewImpl.this.logger;
            if (v.a()) {
                MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, n nVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", nVar);
        if (context != null) {
            this.f14457a = context.getApplicationContext();
            this.f14458b = maxAdView;
            this.f14460d = view;
            this.i = new a();
            this.j = new c();
            this.k = new d(nVar, this);
            this.l = new y(maxAdView, nVar);
            this.m = new z(maxAdView, nVar, this);
            nVar.E().a((e.a) this);
            v vVar = this.logger;
            if (v.a()) {
                v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.b(str2, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.f14458b;
        if (maxAdView != null) {
            com.applovin.impl.sdk.utils.c.a(maxAdView, this.f14460d);
        }
        this.m.a();
        synchronized (this.n) {
            bVar = this.o;
        }
        if (bVar != null) {
            this.sdk.H().destroyAd(bVar);
        }
    }

    /* access modifiers changed from: private */
    public void a(long j2) {
        if (!Utils.bitMaskContainsFlag(j2, ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.x)).longValue()) || this.y) {
            v vVar = this.logger;
            if (v.a()) {
                this.logger.b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.p = false;
            b();
            return;
        }
        v vVar2 = this.logger;
        if (v.a()) {
            v vVar3 = this.logger;
            String str = this.tag;
            vVar3.b(str, "Undesired flags matched - current: " + Long.toBinaryString(j2) + ", undesired: " + Long.toBinaryString(j2));
        }
        v vVar4 = this.logger;
        if (v.a()) {
            this.logger.b(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.p = true;
    }

    /* access modifiers changed from: private */
    public void a(View view, com.applovin.impl.mediation.a.b bVar) {
        int z2 = bVar.z();
        int A = bVar.A();
        int i2 = -1;
        int dpToPx = z2 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), z2);
        if (A != -1) {
            i2 = AppLovinSdkUtils.dpToPx(view.getContext(), A);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, i2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = i2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            v vVar = this.logger;
            if (v.a()) {
                this.logger.b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + i2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int addRule : r.a(this.f14458b.getGravity(), 10, 14)) {
                layoutParams2.addRule(addRule);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
                	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
                	at java.util.ArrayList.get(ArrayList.java:435)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
                */
            public void run() {
                /*
                    r7 = this;
                    com.applovin.impl.mediation.a.b r0 = r2
                    android.view.View r0 = r0.o()
                    if (r0 != 0) goto L_0x000b
                    java.lang.String r1 = "MaxAdView does not have a loaded ad view"
                    goto L_0x000c
                L_0x000b:
                    r1 = 0
                L_0x000c:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.ads.MaxAdView r2 = r2.f14458b
                    if (r2 != 0) goto L_0x0016
                    java.lang.String r1 = "MaxAdView does not have a parent view"
                L_0x0016:
                    if (r1 == 0) goto L_0x003d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    boolean r0 = com.applovin.impl.sdk.v.a()
                    if (r0 == 0) goto L_0x002d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.tag
                    r0.e(r2, r1)
                L_0x002d:
                    com.applovin.impl.mediation.MaxErrorImpl r0 = new com.applovin.impl.mediation.MaxErrorImpl
                    r2 = -1
                    r0.<init>(r2, r1)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdListener r1 = r1.adListener
                    com.applovin.impl.mediation.a.b r2 = r2
                    com.applovin.impl.sdk.utils.k.a((com.applovin.mediation.MaxAdListener) r1, (com.applovin.mediation.MaxAd) r2, (com.applovin.mediation.MaxError) r0)
                    return
                L_0x003d:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    r1.a()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r3 = r2
                    r1.a(r3)
                    com.applovin.impl.mediation.a.b r1 = r2
                    boolean r1 = r1.N()
                    if (r1 == 0) goto L_0x005c
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.z r1 = r1.m
                    com.applovin.impl.mediation.a.b r3 = r2
                    r1.a((com.applovin.impl.mediation.a.e) r3)
                L_0x005c:
                    r1 = 393216(0x60000, float:5.51013E-40)
                    r2.setDescendantFocusability(r1)
                    com.applovin.impl.mediation.a.b r1 = r2
                    long r3 = r1.F()
                    r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 == 0) goto L_0x0081
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r1 = r1.f14460d
                    com.applovin.impl.mediation.a.b r3 = r2
                    long r3 = r3.F()
                L_0x007c:
                    int r4 = (int) r3
                    r1.setBackgroundColor(r4)
                    goto L_0x00a2
                L_0x0081:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r3 = r1.f14461e
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 == 0) goto L_0x0098
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r1 = r1.f14460d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r3 = r3.f14461e
                    goto L_0x007c
                L_0x0098:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r1 = r1.f14460d
                    r3 = 0
                    r1.setBackgroundColor(r3)
                L_0x00a2:
                    r2.addView(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r2 = r2
                    r1.a((android.view.View) r0, (com.applovin.impl.mediation.a.b) r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.n r0 = r0.sdk
                    com.applovin.impl.a.a.a r0 = r0.an()
                    com.applovin.impl.mediation.a.b r1 = r2
                    r0.a((java.lang.Object) r1)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r1 = r2
                    r0.b((com.applovin.impl.mediation.a.b) r1)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.Object r0 = r0.n
                    monitor-enter(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this     // Catch:{ all -> 0x0130 }
                    com.applovin.impl.mediation.a.b r2 = r2     // Catch:{ all -> 0x0130 }
                    com.applovin.impl.mediation.a.b unused = r1.o = r2     // Catch:{ all -> 0x0130 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0130 }
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    boolean r0 = com.applovin.impl.sdk.v.a()
                    if (r0 == 0) goto L_0x00e6
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r1 = r1.tag
                    java.lang.String r2 = "Scheduling impression for ad manually..."
                    r0.b(r1, r2)
                L_0x00e6:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.n r0 = r0.sdk
                    com.applovin.impl.mediation.MediationServiceImpl r0 = r0.H()
                    com.applovin.impl.mediation.a.b r1 = r2
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$a r2 = r2.i
                    r0.processRawAdImpressionPostback(r1, r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r0 = r0.o
                    java.lang.String r0 = r0.getAdReviewCreativeId()
                    boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
                    if (r0 == 0) goto L_0x0121
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdReviewListener r0 = r0.adReviewListener
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r1 = r1.o
                    java.lang.String r1 = r1.getAdReviewCreativeId()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r2 = r2.o
                    r3 = 1
                    com.applovin.impl.sdk.utils.k.a((com.applovin.mediation.MaxAdReviewListener) r0, (java.lang.String) r1, (com.applovin.mediation.MaxAd) r2, (boolean) r3)
                L_0x0121:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1 r0 = new com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1
                    r0.<init>()
                    com.applovin.impl.mediation.a.b r1 = r2
                    long r1 = r1.B()
                    com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r0, r1)
                    return
                L_0x0130:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0130 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.AnonymousClass2.run():void");
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j2) {
        v vVar = this.logger;
        if (v.a()) {
            this.logger.b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.H().processViewabilityAdImpressionPostback(bVar, j2, this.i);
    }

    /* access modifiers changed from: private */
    public void a(final d.a aVar, final a.C0141a aVar2) {
        if (e()) {
            v.i(this.tag, "Failed to load new ad - this instance is already destroyed");
        } else {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                public void run() {
                    if (MaxAdViewImpl.this.o != null) {
                        long a2 = MaxAdViewImpl.this.l.a(MaxAdViewImpl.this.o);
                        MaxAdViewImpl.this.extraParameters.put("visible_ad_ad_unit_id", MaxAdViewImpl.this.o.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(a2));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int pxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f14458b.getContext(), MaxAdViewImpl.this.f14458b.getWidth());
                    int pxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f14458b.getContext(), MaxAdViewImpl.this.f14458b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
                    MaxAdViewImpl.this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(MaxAdViewImpl.this.k.f() || MaxAdViewImpl.this.q));
                    MaxAdViewImpl.this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(MaxAdViewImpl.this.v));
                    v vVar = MaxAdViewImpl.this.logger;
                    if (v.a()) {
                        v vVar2 = MaxAdViewImpl.this.logger;
                        String str = MaxAdViewImpl.this.tag;
                        vVar2.b(str, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + aVar2 + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    MaxAdViewImpl.this.sdk.H().loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.f14459c, MaxAdViewImpl.this.adFormat, aVar, MaxAdViewImpl.this.localExtraParameters, MaxAdViewImpl.this.extraParameters, MaxAdViewImpl.this.f14457a, aVar2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.s = false;
        if (this.r) {
            this.r = false;
            v vVar = this.logger;
            if (v.a()) {
                v vVar2 = this.logger;
                String str = this.tag;
                vVar2.b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.i.onAdLoaded(maxAd);
            return;
        }
        v vVar3 = this.logger;
        if (v.a()) {
            this.logger.b(this.tag, "Saving pre-cache ad...");
        }
        com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
        this.f14462f = bVar;
        bVar.e(this.f14463g);
        this.f14462f.f(this.f14464h);
    }

    /* access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (this.sdk.b(com.applovin.impl.sdk.c.a.n).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.D();
            if (v.a()) {
                v D = this.sdk.D();
                String str = this.tag;
                D.b(str, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (this.q || this.k.f()) {
            if (this.s) {
                v vVar = this.logger;
                if (v.a()) {
                    this.logger.b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                }
                this.s = false;
            }
            if (this.r) {
                v vVar2 = this.logger;
                if (v.a()) {
                    this.logger.b(this.tag, "Refresh pre-cache failed - calling ad load failed callback for publisher");
                }
                k.a(this.adListener, this.adUnitId, maxError);
            }
        } else {
            this.p = true;
            this.s = false;
            long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.m)).longValue();
            if (longValue >= 0) {
                this.sdk.D();
                if (v.a()) {
                    v D2 = this.sdk.D();
                    String str2 = this.tag;
                    D2.b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.k.a(longValue);
            }
        }
    }

    private void a(String str, String str2) {
        if (AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE.equalsIgnoreCase(str)) {
            v vVar = this.logger;
            if (v.a()) {
                v vVar2 = this.logger;
                String str3 = this.tag;
                vVar2.b(str3, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.u = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES.equalsIgnoreCase(str)) {
            v vVar3 = this.logger;
            if (v.a()) {
                v vVar4 = this.logger;
                String str4 = this.tag;
                vVar4.b(str4, "Updated disable auto-retries to: " + str2);
            }
            this.v = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.DISABLE_PRECACHE.equalsIgnoreCase(str)) {
            v vVar5 = this.logger;
            if (v.a()) {
                v vVar6 = this.logger;
                String str5 = this.tag;
                vVar6.b(str5, "Updated precached disabled to: " + str2);
            }
            this.w = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_REFRESH_ON_AD_EXPAND.equals(str)) {
            v vVar7 = this.logger;
            if (v.a()) {
                v vVar8 = this.logger;
                String str6 = this.tag;
                vVar8.b(str6, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.x = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.FORCE_PRECACHE.equals(str)) {
            v vVar9 = this.logger;
            if (v.a()) {
                v vVar10 = this.logger;
                String str7 = this.tag;
                vVar10.b(str7, "Updated force precache to: " + str2);
            }
            this.y = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER.equalsIgnoreCase(str)) {
            v vVar11 = this.logger;
            if (v.a()) {
                v vVar12 = this.logger;
                String str8 = this.tag;
                vVar12.b(str8, "Updated is adaptive banner to: " + str2);
            }
            this.z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    private void b() {
        if (d()) {
            v vVar = this.logger;
            if (v.a()) {
                this.logger.b(this.tag, "Scheduling refresh precache request now");
            }
            this.s = true;
            this.sdk.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.z(this.sdk, new Runnable() {
                public void run() {
                    v vVar = MaxAdViewImpl.this.logger;
                    if (v.a()) {
                        MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl.this.a(d.a.SEQUENTIAL_OR_PRECACHE, (a.C0141a) MaxAdViewImpl.this.j);
                }
            }), com.applovin.impl.mediation.c.c.a(this.adFormat));
        }
    }

    /* access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.b bVar) {
        int height = this.f14458b.getHeight();
        int width = this.f14458b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f14457a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f14457a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.z ? format.getAdaptiveSize(pxToDp2, this.f14457a) : format.getSize()).getHeight();
            int width2 = format.getSize().getWidth();
            if (pxToDp < height2 || pxToDp2 < width2) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(pxToDp2);
                sb.append("x");
                sb.append(pxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.z ? "adaptive " : "");
                sb.append("size: ");
                sb.append(width2);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String sb2 = sb.toString();
                v vVar = this.logger;
                if (v.a()) {
                    this.logger.e("AppLovinSdk", sb2);
                }
            }
        }
    }

    private void c() {
        v vVar = this.logger;
        if (v.a()) {
            v vVar2 = this.logger;
            String str = this.tag;
            vVar2.b(str, "Rendering for cached ad: " + this.f14462f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.i.onAdLoaded(this.f14462f);
        this.f14462f = null;
    }

    private boolean d() {
        if (this.w) {
            return false;
        }
        return ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.y)).booleanValue();
    }

    private boolean e() {
        boolean z2;
        synchronized (this.n) {
            z2 = this.t;
        }
        return z2;
    }

    public void destroy() {
        a();
        if (this.f14462f != null) {
            this.sdk.H().destroyAd(this.f14462f);
        }
        synchronized (this.n) {
            this.t = true;
        }
        this.k.c();
        this.sdk.E().b((e.a) this);
        this.sdk.M().a(this.adUnitId, this.f14459c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f14463g;
    }

    public void loadAd() {
        loadAd(d.a.PUBLISHER_INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        if (com.applovin.impl.sdk.v.a() != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (com.applovin.impl.sdk.v.a() != false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadAd(com.applovin.impl.mediation.d.a r5) {
        /*
            r4 = this;
            com.applovin.impl.sdk.v r0 = r4.logger
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x002f
            com.applovin.impl.sdk.v r0 = r4.logger
            java.lang.String r1 = r4.tag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " Loading ad for "
            r2.append(r3)
            java.lang.String r3 = r4.adUnitId
            r2.append(r3)
            java.lang.String r3 = "..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.b(r1, r2)
        L_0x002f:
            boolean r0 = r4.u
            r1 = 1
            if (r0 != 0) goto L_0x0047
            com.applovin.impl.sdk.n r0 = r4.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.c.a.t
            java.lang.Object r0 = r0.a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = 0
            goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            if (r0 == 0) goto L_0x0082
            com.applovin.impl.sdk.d r2 = r4.k
            boolean r2 = r2.f()
            if (r2 != 0) goto L_0x0082
            com.applovin.impl.sdk.d r2 = r4.k
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0082
            java.lang.String r5 = r4.tag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to load a new ad. An ad refresh has already been scheduled in "
            r0.append(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.applovin.impl.sdk.d r2 = r4.k
            long r2 = r2.b()
            long r1 = r1.toSeconds(r2)
            r0.append(r1)
            java.lang.String r1 = " seconds."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.sdk.v.i(r5, r0)
            return
        L_0x0082:
            java.lang.String r2 = "Loading ad..."
            if (r0 == 0) goto L_0x00c0
            com.applovin.impl.mediation.a.b r0 = r4.f14462f
            if (r0 == 0) goto L_0x009f
            com.applovin.impl.sdk.v r5 = r4.logger
            boolean r5 = com.applovin.impl.sdk.v.a()
            if (r5 == 0) goto L_0x009b
            com.applovin.impl.sdk.v r5 = r4.logger
            java.lang.String r0 = r4.tag
            java.lang.String r1 = "Rendering cached ad"
            r5.b(r0, r1)
        L_0x009b:
            r4.c()
            goto L_0x00d4
        L_0x009f:
            boolean r0 = r4.s
            if (r0 == 0) goto L_0x00b7
            com.applovin.impl.sdk.v r5 = r4.logger
            boolean r5 = com.applovin.impl.sdk.v.a()
            if (r5 == 0) goto L_0x00b4
            com.applovin.impl.sdk.v r5 = r4.logger
            java.lang.String r0 = r4.tag
            java.lang.String r2 = "Waiting for precache ad to load to render"
            r5.b(r0, r2)
        L_0x00b4:
            r4.r = r1
            goto L_0x00d4
        L_0x00b7:
            com.applovin.impl.sdk.v r0 = r4.logger
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x00cf
            goto L_0x00c8
        L_0x00c0:
            com.applovin.impl.sdk.v r0 = r4.logger
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x00cf
        L_0x00c8:
            com.applovin.impl.sdk.v r0 = r4.logger
            java.lang.String r1 = r4.tag
            r0.b(r1, r2)
        L_0x00cf:
            com.applovin.impl.mediation.ads.MaxAdViewImpl$a r0 = r4.i
            r4.a((com.applovin.impl.mediation.d.a) r5, (com.applovin.impl.mediation.ads.a.C0141a) r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.loadAd(com.applovin.impl.mediation.d$a):void");
    }

    public void onAdRefresh() {
        String str;
        String str2;
        v vVar;
        this.r = false;
        if (this.f14462f != null) {
            c();
            return;
        }
        if (!d()) {
            v vVar2 = this.logger;
            if (v.a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network...";
            }
            loadAd(d.a.REFRESH);
        } else if (this.p) {
            v vVar3 = this.logger;
            if (v.a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network due to viewability requirements not met for refresh request...";
            }
            loadAd(d.a.REFRESH);
        } else {
            v vVar4 = this.logger;
            if (v.a()) {
                this.logger.e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.r = true;
            return;
        }
        vVar.b(str2, str);
        loadAd(d.a.REFRESH);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.b bVar = this.o;
        if (bVar == null || !bVar.f().equalsIgnoreCase(str)) {
            com.applovin.impl.mediation.a.b bVar2 = this.f14462f;
            if (bVar2 != null && bVar2.f().equalsIgnoreCase(str)) {
                this.f14462f.b(str2);
                return;
            }
            return;
        }
        this.o.b(str2);
        k.a(this.adReviewListener, str2, (MaxAd) this.o);
    }

    public void onLogVisibilityImpression() {
        a(this.o, this.l.a(this.o));
    }

    public void onWindowVisibilityChanged(int i2) {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.r)).booleanValue() && this.k.a()) {
            if (r.a(i2)) {
                v vVar = this.logger;
                if (v.a()) {
                    this.logger.b(this.tag, "Ad view visible");
                }
                this.k.h();
                return;
            }
            v vVar2 = this.logger;
            if (v.a()) {
                this.logger.b(this.tag, "Ad view hidden");
            }
            this.k.g();
        }
    }

    public void setCustomData(String str) {
        if (this.o != null) {
            String str2 = this.tag;
            v.i(str2, "Custom data for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this custom data, please set the custom data before loading the " + this.adFormat.getLabel() + ".");
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f14464h = str;
    }

    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.o != null) {
            String str2 = this.tag;
            v.i(str2, "Placement for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f14463g = str;
    }

    public void setPublisherBackgroundColor(int i2) {
        this.f14461e = (long) i2;
    }

    public void startAutoRefresh() {
        String str;
        String str2;
        v vVar;
        this.q = false;
        if (this.k.f()) {
            this.k.e();
            v vVar2 = this.logger;
            if (v.a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Resumed auto-refresh with remaining time: " + this.k.b() + "ms";
            } else {
                return;
            }
        } else {
            v vVar3 = this.logger;
            if (v.a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
            } else {
                return;
            }
        }
        vVar.b(str2, str);
    }

    public void stopAutoRefresh() {
        if (this.o != null) {
            v vVar = this.logger;
            if (v.a()) {
                v vVar2 = this.logger;
                String str = this.tag;
                vVar2.b(str, "Pausing auto-refresh with remaining time: " + this.k.b() + "ms");
            }
            this.k.d();
        } else if (this.u || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.t)).booleanValue()) {
            this.q = true;
        } else {
            v.h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f14458b ? "this" : this.adListener);
        sb.append(", isDestroyed=");
        sb.append(e());
        sb.append('}');
        return sb.toString();
    }
}
