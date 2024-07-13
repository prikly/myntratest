package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.b.b;
import com.applovin.impl.sdk.d.d;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a implements AppLovinBroadcastManager.Receiver, b.a {
    private long A;
    private boolean B;
    /* access modifiers changed from: private */
    public int C = 0;
    /* access modifiers changed from: private */
    public final ArrayList<Long> D = new ArrayList<>();
    /* access modifiers changed from: private */
    public final i E;
    /* access modifiers changed from: private */
    public boolean F = false;

    /* renamed from: a  reason: collision with root package name */
    protected final e f14043a;

    /* renamed from: b  reason: collision with root package name */
    protected final n f14044b;

    /* renamed from: c  reason: collision with root package name */
    protected final v f14045c;

    /* renamed from: d  reason: collision with root package name */
    protected final d f14046d;

    /* renamed from: e  reason: collision with root package name */
    protected Activity f14047e;

    /* renamed from: f  reason: collision with root package name */
    protected AppLovinAdView f14048f;

    /* renamed from: g  reason: collision with root package name */
    protected final m f14049g;

    /* renamed from: h  reason: collision with root package name */
    protected final m f14050h;
    protected final long i = SystemClock.elapsedRealtime();
    protected long j = -1;
    protected boolean k;
    protected int l = 0;
    protected int m = 0;
    protected int n = h.f15535a;
    protected boolean o;
    protected AppLovinAdClickListener p;
    protected AppLovinAdDisplayListener q;
    protected AppLovinAdVideoPlaybackListener r;
    protected final com.applovin.impl.sdk.b.b s;
    protected p t;
    private final Handler u = new Handler(Looper.getMainLooper());
    private final com.applovin.impl.sdk.utils.a v;
    /* access modifiers changed from: private */
    public final AppLovinBroadcastManager.Receiver w;
    private final h.a x;
    private final AtomicBoolean y = new AtomicBoolean();
    /* access modifiers changed from: private */
    public final AtomicBoolean z = new AtomicBoolean();

    /* renamed from: com.applovin.impl.adview.activity.b.a$a  reason: collision with other inner class name */
    public interface C0137a {
        void a(a aVar);

        void a(String str, Throwable th);
    }

    private class b implements View.OnClickListener, AppLovinAdClickListener {
        private b() {
        }

        public void adClicked(AppLovinAd appLovinAd) {
            v vVar = a.this.f14045c;
            if (v.a()) {
                a.this.f14045c.b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            k.a(a.this.p, appLovinAd);
            a.this.f14046d.b();
            a.this.m++;
        }

        public void onClick(View view) {
            if (view != a.this.f14049g || !((Boolean) a.this.f14044b.a(com.applovin.impl.sdk.c.b.cv)).booleanValue()) {
                v vVar = a.this.f14045c;
                if (v.a()) {
                    v vVar2 = a.this.f14045c;
                    vVar2.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            a.d(a.this);
            if (a.this.f14043a.V()) {
                a aVar = a.this;
                aVar.b("javascript:al_onCloseButtonTapped(" + a.this.C + "," + a.this.l + "," + a.this.m + ");");
            }
            List<Integer> u = a.this.f14043a.u();
            v vVar3 = a.this.f14045c;
            if (v.a()) {
                v vVar4 = a.this.f14045c;
                vVar4.b("AppLovinFullscreenActivity", "Handling close button tap " + a.this.C + " with multi close delay: " + u);
            }
            if (u == null || u.size() <= a.this.C) {
                a.this.h();
                return;
            }
            a.this.D.add(Long.valueOf(SystemClock.elapsedRealtime() - a.this.j));
            List<i.a> w = a.this.f14043a.w();
            if (w != null && w.size() > a.this.C) {
                a.this.f14049g.a(w.get(a.this.C));
            }
            v vVar5 = a.this.f14045c;
            if (v.a()) {
                v vVar6 = a.this.f14045c;
                vVar6.b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + u.get(a.this.C));
            }
            a.this.f14049g.setVisibility(8);
            a aVar2 = a.this;
            aVar2.a(aVar2.f14049g, (long) u.get(a.this.C).intValue(), new Runnable() {
                public void run() {
                    a.this.j = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    a(final e eVar, Activity activity, final n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f14043a = eVar;
        this.f14044b = nVar;
        this.f14045c = nVar.D();
        this.f14047e = activity;
        this.p = appLovinAdClickListener;
        this.q = appLovinAdDisplayListener;
        this.r = appLovinAdVideoPlaybackListener;
        com.applovin.impl.sdk.b.b bVar = new com.applovin.impl.sdk.b.b(activity, nVar);
        this.s = bVar;
        bVar.a((b.a) this);
        this.f14046d = new d(eVar, nVar);
        this.E = new com.applovin.impl.sdk.i(nVar);
        b bVar2 = new b();
        if (((Boolean) nVar.a(com.applovin.impl.sdk.c.b.cN)).booleanValue()) {
            nVar.am().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        com.applovin.impl.adview.n nVar2 = new com.applovin.impl.adview.n(nVar.ab(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f14048f = nVar2;
        nVar2.setAdClickListener(bVar2);
        this.f14048f.setAdDisplayListener(new AppLovinAdDisplayListener() {
            public void adDisplayed(AppLovinAd appLovinAd) {
                v vVar = a.this.f14045c;
                if (v.a()) {
                    a.this.f14045c.b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            public void adHidden(AppLovinAd appLovinAd) {
                v vVar = a.this.f14045c;
                if (v.a()) {
                    a.this.f14045c.b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                a.this.h();
            }
        });
        this.f14048f.getController().a(this.f14046d);
        nVar.v().trackImpression(eVar);
        List<Integer> u2 = eVar.u();
        if (eVar.t() >= 0 || u2 != null) {
            m mVar = new m(eVar.v(), activity);
            this.f14049g = mVar;
            mVar.setVisibility(8);
            this.f14049g.setOnClickListener(bVar2);
        } else {
            this.f14049g = null;
        }
        m mVar2 = new m(i.a.WHITE_ON_TRANSPARENT, activity);
        this.f14050h = mVar2;
        mVar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                a.this.h();
            }
        });
        if (((Boolean) nVar.a(com.applovin.impl.sdk.c.b.cx)).booleanValue()) {
            this.w = new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    nVar.v().trackAppKilled(eVar);
                    nVar.am().unregisterReceiver(this);
                }
            };
        } else {
            this.w = null;
        }
        if (eVar.al()) {
            this.x = new h.a() {
                public void a(int i) {
                    String str;
                    if (a.this.n != h.f15535a) {
                        a.this.o = true;
                    }
                    com.applovin.impl.adview.d s = a.this.f14048f.getController().s();
                    if (!h.a(i) || h.a(a.this.n)) {
                        if (i == 2) {
                            str = "javascript:al_muteSwitchOff();";
                        }
                        a.this.n = i;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    s.a(str);
                    a.this.n = i;
                }
            };
        } else {
            this.x = null;
        }
        if (((Boolean) nVar.a(com.applovin.impl.sdk.c.b.eN)).booleanValue()) {
            this.v = new com.applovin.impl.sdk.utils.a() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (!a.this.z.get()) {
                        if (activity.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity.getApplicationContext()))) {
                            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                                public void run() {
                                    v.i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                    try {
                                        a.this.h();
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    }
                }
            };
        } else {
            this.v = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.applovin.impl.adview.activity.b.a] */
    /* JADX WARNING: type inference failed for: r1v27, types: [com.applovin.impl.adview.activity.b.b] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.applovin.impl.adview.activity.b.e] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.applovin.impl.adview.activity.b.g] */
    /* JADX WARNING: type inference failed for: r1v32, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v33, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.applovin.impl.adview.activity.b.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.applovin.impl.sdk.ad.e r15, com.applovin.sdk.AppLovinAdClickListener r16, com.applovin.sdk.AppLovinAdDisplayListener r17, com.applovin.sdk.AppLovinAdVideoPlaybackListener r18, com.applovin.impl.sdk.n r19, android.app.Activity r20, com.applovin.impl.adview.activity.b.a.C0137a r21) {
        /*
            r8 = r19
            r9 = r21
            boolean r0 = r15.aH()
            r10 = r15
            boolean r1 = r10 instanceof com.applovin.impl.b.a
            java.lang.String r11 = "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter."
            java.lang.String r12 = "AppLovinFullscreenActivity"
            java.lang.String r13 = " and throwable: "
            if (r1 == 0) goto L_0x009d
            java.lang.String r14 = "Failed to create FullscreenVastVideoAdPresenter with sdk: "
            if (r0 == 0) goto L_0x006c
            com.applovin.impl.adview.activity.b.c r0 = new com.applovin.impl.adview.activity.b.c     // Catch:{ all -> 0x002a }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x002a }
            goto L_0x0177
        L_0x002a:
            r0 = move-exception
            r19.D()
            boolean r1 = com.applovin.impl.sdk.v.a()
            if (r1 == 0) goto L_0x003b
            com.applovin.impl.sdk.v r1 = r19.D()
            r1.a((java.lang.String) r12, (java.lang.String) r11, (java.lang.Throwable) r0)
        L_0x003b:
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x004e }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            goto L_0x0177
        L_0x004e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.a(r1, r0)
            return
        L_0x006c:
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x007f }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007f }
            goto L_0x0177
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.a(r1, r0)
            return
        L_0x009d:
            boolean r1 = r15.hasVideoUrl()
            if (r1 == 0) goto L_0x0166
            boolean r1 = r15.aK()
            if (r1 == 0) goto L_0x00dc
            com.applovin.impl.adview.activity.b.g r0 = new com.applovin.impl.adview.activity.b.g     // Catch:{ all -> 0x00bc }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bc }
            goto L_0x0177
        L_0x00bc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenWebVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.a(r1, r0)
            return
        L_0x00dc:
            if (r0 == 0) goto L_0x0134
            com.applovin.impl.adview.activity.b.e r0 = new com.applovin.impl.adview.activity.b.e     // Catch:{ all -> 0x00f1 }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00f1 }
            goto L_0x0177
        L_0x00f1:
            r0 = move-exception
            r19.D()
            boolean r1 = com.applovin.impl.sdk.v.a()
            if (r1 == 0) goto L_0x0102
            com.applovin.impl.sdk.v r1 = r19.D()
            r1.a((java.lang.String) r12, (java.lang.String) r11, (java.lang.Throwable) r0)
        L_0x0102:
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x0114 }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0114 }
            goto L_0x0177
        L_0x0114:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.a(r1, r0)
            return
        L_0x0134:
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x0146 }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0146 }
            goto L_0x0177
        L_0x0146:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.a(r1, r0)
            return
        L_0x0166:
            com.applovin.impl.adview.activity.b.b r0 = new com.applovin.impl.adview.activity.b.b     // Catch:{ all -> 0x017e }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x017e }
        L_0x0177:
            r0.c()
            r9.a(r0)
            return
        L_0x017e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenGraphicAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.b.a.a(com.applovin.impl.sdk.ad.e, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.impl.sdk.n, android.app.Activity, com.applovin.impl.adview.activity.b.a$a):void");
    }

    private void c() {
        if (this.w != null) {
            this.f14044b.am().registerReceiver(this.w, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.x != null) {
            this.f14044b.al().a(this.x);
        }
        if (this.v != null) {
            this.f14044b.ai().a(this.v);
        }
    }

    static /* synthetic */ int d(a aVar) {
        int i2 = aVar.C;
        aVar.C = i2 + 1;
        return i2;
    }

    public void a(int i2, KeyEvent keyEvent) {
        if (this.f14045c != null && v.a()) {
            v vVar = this.f14045c;
            vVar.c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i2 + ", " + keyEvent);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z2, boolean z3, long j2) {
        int i3 = i2;
        if (this.y.compareAndSet(false, true)) {
            if (this.f14043a.hasVideoUrl() || t()) {
                k.a(this.r, (AppLovinAd) this.f14043a, (double) i3, z3);
            }
            if (this.f14043a.hasVideoUrl()) {
                this.f14046d.c((long) i3);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
            this.f14044b.v().trackVideoEnd(this.f14043a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i2, z2);
            long j3 = -1;
            if (this.j != -1) {
                j3 = SystemClock.elapsedRealtime() - this.j;
            }
            this.f14044b.v().trackFullScreenAdClosed(this.f14043a, j3, this.D, j2, this.o, this.n);
            if (v.a()) {
                v vVar = this.f14045c;
                vVar.b("AppLovinFullscreenActivity", "Video ad ended at percent: " + i3 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j2 + "ms, closeTimeMillis: " + j3 + "ms");
            }
        }
    }

    public abstract void a(long j2);

    public void a(Configuration configuration) {
        if (v.a()) {
            v vVar = this.f14045c;
            vVar.c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public abstract void a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void a(final m mVar, long j2, final Runnable runnable) {
        if (j2 < ((Long) this.f14044b.a(com.applovin.impl.sdk.c.b.cu)).longValue()) {
            this.f14044b.V().a(new z(this.f14044b, new Runnable() {
                public void run() {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            r.a((View) mVar, 400, (Runnable) new Runnable() {
                                public void run() {
                                    mVar.bringToFront();
                                    runnable.run();
                                }
                            });
                        }
                    });
                }
            }), o.a.MAIN, TimeUnit.SECONDS.toMillis(j2), true);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Runnable runnable, long j2) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j2, this.u);
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        if (this.f14043a.W()) {
            a(str, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void a(final String str, long j2) {
        if (j2 >= 0) {
            a((Runnable) new Runnable() {
                public void run() {
                    com.applovin.impl.adview.d s;
                    if (StringUtils.isValidString(str) && a.this.f14048f != null && (s = a.this.f14048f.getController().s()) != null) {
                        s.a(str);
                    }
                }
            }, j2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z2, this.f14043a, this.f14044b, this.f14047e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (((Boolean) this.f14044b.a(com.applovin.impl.sdk.c.b.eR)).booleanValue()) {
            if (v.a()) {
                v vVar = this.f14045c;
                vVar.e("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + checkCachedResourcesExist);
            }
            com.applovin.impl.adview.o.a(this.f14043a, this.q, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            h();
            return;
        }
        if (v.a()) {
            v vVar2 = this.f14045c;
            vVar2.e("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + checkCachedResourcesExist);
        }
        this.f14043a.a();
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2, long j2) {
        if (this.f14043a.U()) {
            a(z2 ? "javascript:al_mute();" : "javascript:al_unmute();", j2);
        }
    }

    /* access modifiers changed from: protected */
    public void b(long j2) {
        if (v.a()) {
            v vVar = this.f14045c;
            vVar.b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j2) + " seconds...");
        }
        this.t = p.a(j2, this.f14044b, new Runnable() {
            public void run() {
                if (!a.this.f14043a.ag().getAndSet(true)) {
                    a.this.f14044b.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.v(a.this.f14043a, a.this.f14044b), o.a.REWARD);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        a(str, 0);
    }

    /* access modifiers changed from: protected */
    public void b(boolean z2) {
        a(z2, ((Long) this.f14044b.a(com.applovin.impl.sdk.c.b.cK)).longValue());
        k.a(this.q, (AppLovinAd) this.f14043a);
        this.f14044b.ah().a((Object) this.f14043a);
        if (this.f14043a.hasVideoUrl() || t()) {
            k.a(this.r, (AppLovinAd) this.f14043a);
        }
        new com.applovin.impl.adview.activity.b(this.f14047e).a(this.f14043a);
        this.f14046d.a();
        this.f14043a.setHasShown(true);
    }

    public void c(boolean z2) {
        if (v.a()) {
            v vVar = this.f14045c;
            vVar.c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z2);
        }
        a("javascript:al_onWindowFocusChanged( " + z2 + " );");
    }

    public abstract void d();

    public abstract void e();

    public void f() {
        if (v.a()) {
            this.f14045c.c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f14046d.d(SystemClock.elapsedRealtime() - this.A);
        a("javascript:al_onAppResumed();");
        q();
        if (this.s.c()) {
            this.s.a();
        }
    }

    public void g() {
        if (v.a()) {
            this.f14045c.c("AppLovinFullscreenActivity", "onPause()");
        }
        this.A = SystemClock.elapsedRealtime();
        a("javascript:al_onAppPaused();");
        if (this.s.c()) {
            this.s.a();
        }
        p();
    }

    public void h() {
        this.B = true;
        if (v.a()) {
            this.f14045c.c("AppLovinFullscreenActivity", "dismiss()");
        }
        e eVar = this.f14043a;
        if (eVar != null) {
            eVar.o().e();
        }
        this.u.removeCallbacksAndMessages((Object) null);
        a("javascript:al_onPoststitialDismiss();", (long) this.f14043a.T());
        n();
        this.f14046d.c();
        this.E.a();
        if (this.w != null) {
            p.a(TimeUnit.SECONDS.toMillis(2), this.f14044b, new Runnable() {
                public void run() {
                    a.this.f14047e.stopService(new Intent(a.this.f14047e.getApplicationContext(), AppKilledService.class));
                    a.this.f14044b.am().unregisterReceiver(a.this.w);
                }
            });
        }
        if (this.x != null) {
            this.f14044b.al().b(this.x);
        }
        if (this.v != null) {
            this.f14044b.ai().b(this.v);
        }
        if (o()) {
            this.f14047e.finish();
            return;
        }
        this.f14044b.D();
        if (v.a()) {
            this.f14044b.D().b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        k();
    }

    public boolean i() {
        return this.B;
    }

    public void j() {
        if (v.a()) {
            this.f14045c.c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public void k() {
        AppLovinAdView appLovinAdView = this.f14048f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f14048f.destroy();
            this.f14048f = null;
            if ((parent instanceof ViewGroup) && o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        n();
        this.p = null;
        this.q = null;
        this.r = null;
        this.f14047e = null;
        this.f14044b.am().unregisterReceiver(this);
    }

    public void l() {
        if (v.a()) {
            this.f14045c.c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.F) {
            h();
        }
        if (this.f14043a.V()) {
            b("javascript:onBackPressed();");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void m();

    /* access modifiers changed from: protected */
    public void n() {
        if (this.z.compareAndSet(false, true)) {
            k.b(this.q, (AppLovinAd) this.f14043a);
            this.f14044b.ah().b((Object) this.f14043a);
        }
    }

    /* access modifiers changed from: protected */
    public boolean o() {
        return this.f14047e instanceof AppLovinFullscreenActivity;
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.k) {
            w();
        }
    }

    /* access modifiers changed from: protected */
    public void p() {
        p pVar = this.t;
        if (pVar != null) {
            pVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        p pVar = this.t;
        if (pVar != null) {
            pVar.c();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: protected */
    public abstract boolean s();

    /* access modifiers changed from: protected */
    public boolean t() {
        return AppLovinAdType.INCENTIVIZED == this.f14043a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f14043a.getType();
    }

    /* access modifiers changed from: protected */
    public abstract void u();

    /* access modifiers changed from: protected */
    public void v() {
        com.applovin.impl.adview.d s2;
        AppLovinAdView appLovinAdView = this.f14048f;
        if (appLovinAdView != null && (s2 = appLovinAdView.getController().s()) != null) {
            this.E.a((View) s2, (i.a) new i.a() {
                public void a(View view) {
                    a.this.E.a(CollectionUtils.map("clcode", a.this.f14043a.getClCode()));
                    if (((Boolean) a.this.f14044b.a(com.applovin.impl.sdk.c.b.fm)).booleanValue()) {
                        a.this.h();
                        return;
                    }
                    a aVar = a.this;
                    boolean unused = aVar.F = ((Boolean) aVar.f14044b.a(com.applovin.impl.sdk.c.b.fn)).booleanValue();
                    if (((Boolean) a.this.f14044b.a(com.applovin.impl.sdk.c.b.fo)).booleanValue() && a.this.f14049g != null) {
                        a.this.f14049g.setVisibility(0);
                    }
                }
            });
        }
    }

    public void w() {
        if (v.a()) {
            this.f14045c.c("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.k = true;
    }
}
