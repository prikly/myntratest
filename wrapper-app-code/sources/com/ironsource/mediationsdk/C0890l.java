package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.l  reason: case insensitive filesystem */
public final class C0890l implements BannerSmashListener {

    /* renamed from: a  reason: collision with root package name */
    public AbstractAdapter f8672a;

    /* renamed from: b  reason: collision with root package name */
    public NetworkSettings f8673b;
    /* access modifiers changed from: package-private */

    /* renamed from: c  reason: collision with root package name */
    public com.ironsource.mediationsdk.sdk.a f8674c;

    /* renamed from: d  reason: collision with root package name */
    boolean f8675d;

    /* renamed from: e  reason: collision with root package name */
    IronSourceBannerLayout f8676e;

    /* renamed from: f  reason: collision with root package name */
    public int f8677f;

    /* renamed from: g  reason: collision with root package name */
    private Timer f8678g;

    /* renamed from: h  reason: collision with root package name */
    private long f8679h;
    /* access modifiers changed from: private */
    public a i = a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.l$a */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C0890l(com.ironsource.mediationsdk.sdk.a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i2) {
        this.f8677f = i2;
        this.f8674c = aVar;
        this.f8672a = abstractAdapter;
        this.f8673b = networkSettings;
        this.f8679h = j;
        abstractAdapter.addBannerListener(this);
    }

    private void a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + a() + " | " + str2, 3);
    }

    private void c() {
        if (this.f8672a != null) {
            try {
                String str = H.a().l;
                if (!TextUtils.isEmpty(str)) {
                    this.f8672a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f8672a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e2) {
                a(":setCustomParams():" + e2.toString());
            }
        }
    }

    private void d() {
        try {
            if (this.f8678g != null) {
                this.f8678g.cancel();
            }
        } catch (Exception e2) {
            a("stopLoadTimer", e2.getLocalizedMessage());
        } finally {
            this.f8678g = null;
        }
    }

    public final String a() {
        return this.f8673b.isMultipleInstances() ? this.f8673b.getProviderTypeForReflection() : this.f8673b.getProviderName();
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        a("loadBanner");
        this.f8675d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            a("loadBanner - bannerLayout is null or destroyed");
            this.f8674c.a(new IronSourceError(610, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.f8672a == null) {
            a("loadBanner - mAdapter is null");
            this.f8674c.a(new IronSourceError(611, "adapter==null"), this, false);
        } else {
            this.f8676e = ironSourceBannerLayout;
            b();
            if (this.i == a.NO_INIT) {
                a(a.INIT_IN_PROGRESS);
                c();
                this.f8672a.initBanners(str, str2, this.f8673b.getBannerSettings(), this);
                return;
            }
            a(a.LOAD_IN_PROGRESS);
            this.f8672a.loadBanner(ironSourceBannerLayout, this.f8673b.getBannerSettings(), this);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.i = aVar;
        a("state=" + aVar.name());
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + a() + " " + str, 1);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            d();
            Timer timer = new Timer();
            this.f8678g = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    com.ironsource.mediationsdk.sdk.a b2;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C0890l.this.i == a.INIT_IN_PROGRESS) {
                        C0890l.this.a(a.NO_INIT);
                        C0890l.this.a("init timed out");
                        b2 = C0890l.this.f8674c;
                        ironSourceError = new IronSourceError(607, "Timed out");
                    } else if (C0890l.this.i == a.LOAD_IN_PROGRESS) {
                        C0890l.this.a(a.LOAD_FAILED);
                        C0890l.this.a("load timed out");
                        b2 = C0890l.this.f8674c;
                        ironSourceError = new IronSourceError(608, "Timed out");
                    } else if (C0890l.this.i == a.LOADED) {
                        C0890l.this.a(a.LOAD_FAILED);
                        C0890l.this.a("reload timed out");
                        C0890l.this.f8674c.b(new IronSourceError(609, "Timed out"), C0890l.this, false);
                        return;
                    } else {
                        return;
                    }
                    b2.a(ironSourceError, C0890l.this, false);
                }
            }, this.f8679h);
        } catch (Exception e2) {
            a("startLoadTimer", e2.getLocalizedMessage());
        }
    }

    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f8674c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f8674c;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        a("onBannerAdLoadFailed()");
        d();
        boolean z = ironSourceError.getErrorCode() == 606;
        if (this.i == a.LOAD_IN_PROGRESS) {
            a(a.LOAD_FAILED);
            this.f8674c.a(ironSourceError, this, z);
        } else if (this.i == a.LOADED) {
            this.f8674c.b(ironSourceError, this, z);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        a("onBannerAdLoaded()");
        d();
        if (this.i == a.LOAD_IN_PROGRESS) {
            a(a.LOADED);
            this.f8674c.a(this, view, layoutParams);
        } else if (this.i == a.LOADED) {
            this.f8674c.a(this, view, layoutParams, this.f8672a.shouldBindBannerViewOnReload());
        }
    }

    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f8674c;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f8674c;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.a aVar = this.f8674c;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        d();
        if (this.i == a.INIT_IN_PROGRESS) {
            this.f8674c.a(new IronSourceError(612, "Banner init failed"), this, false);
            a(a.NO_INIT);
        }
    }

    public final void onBannerInitSuccess() {
        d();
        if (this.i == a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f8676e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.f8674c.a(new IronSourceError(605, this.f8676e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            b();
            a(a.LOAD_IN_PROGRESS);
            this.f8672a.loadBanner(this.f8676e, this.f8673b.getBannerSettings(), this);
        }
    }
}
