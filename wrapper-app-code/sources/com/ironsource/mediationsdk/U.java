package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C0880b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public final class U extends Y implements InterstitialSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public a f8326a = a.NO_INIT;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public T f8327b;
    private Timer j;
    private int k;
    private String l;
    private String m;
    /* access modifiers changed from: private */
    public long n;
    private final Object o = new Object();

    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public U(String str, String str2, NetworkSettings networkSettings, T t, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.l = str;
        this.m = str2;
        this.f8327b = t;
        this.j = null;
        this.k = i;
        this.f8361c.addInterstitialListener(this);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        d("current state=" + this.f8326a + ", new state=" + aVar);
        this.f8326a = aVar;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + k() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 0);
    }

    private void e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 3);
    }

    private void q() {
        try {
            String str = H.a().l;
            if (!TextUtils.isEmpty(str)) {
                this.f8361c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f8361c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e2) {
            d("setCustomParams() " + e2.getMessage());
        }
    }

    private void r() {
        synchronized (this.o) {
            if (this.j != null) {
                this.j.cancel();
                this.j = null;
            }
        }
    }

    private void s() {
        synchronized (this.o) {
            d("start timer");
            r();
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    U u = U.this;
                    u.d("timed out state=" + U.this.f8326a.name() + " isBidder=" + U.this.h());
                    if (U.this.f8326a != a.INIT_IN_PROGRESS || !U.this.h()) {
                        U.this.a(a.LOAD_FAILED);
                        U.this.f8327b.a(ErrorBuilder.buildLoadFailedError("timed out"), U.this, new Date().getTime() - U.this.n);
                        return;
                    }
                    U.this.a(a.NO_INIT);
                }
            }, (long) (this.k * 1000));
        }
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.f8361c.getInterstitialBiddingData(this.f8364f);
            }
            return null;
        } catch (Throwable th) {
            e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        try {
            this.n = new Date().getTime();
            d("loadInterstitial");
            this.f8363e = false;
            if (h()) {
                s();
                a(a.LOAD_IN_PROGRESS);
                this.f8361c.loadInterstitialForBidding(this.f8364f, this, str);
            } else if (this.f8326a == a.NO_INIT) {
                s();
                a(a.INIT_IN_PROGRESS);
                q();
                this.f8361c.initInterstitial(this.l, this.m, this.f8364f, this);
            } else {
                s();
                a(a.LOAD_IN_PROGRESS);
                this.f8361c.loadInterstitial(this.f8364f, this);
            }
        } catch (Throwable th) {
            e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    public final void b() {
        d("initForBidding()");
        a(a.INIT_IN_PROGRESS);
        q();
        try {
            this.f8361c.initInterstitialForBidding(this.l, this.m, this.f8364f, this);
        } catch (Throwable th) {
            e(k() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void c() {
        try {
            this.f8361c.showInterstitial(this.f8364f, this);
        } catch (Throwable th) {
            e(k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void f() {
        this.f8361c.setMediationState(C0880b.a.CAPPED_PER_SESSION, "interstitial");
    }

    public final boolean g() {
        try {
            return this.f8361c.isInterstitialReady(this.f8364f);
        } catch (Throwable th) {
            e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        c("onInterstitialAdClicked");
        this.f8327b.d(this);
    }

    public final void onInterstitialAdClosed() {
        c("onInterstitialAdClosed");
        this.f8327b.b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f8326a.name());
        r();
        if (this.f8326a == a.LOAD_IN_PROGRESS) {
            a(a.LOAD_FAILED);
            this.f8327b.a(ironSourceError, this, new Date().getTime() - this.n);
        }
    }

    public final void onInterstitialAdOpened() {
        c("onInterstitialAdOpened");
        this.f8327b.a(this);
    }

    public final void onInterstitialAdReady() {
        c("onInterstitialAdReady state=" + this.f8326a.name());
        r();
        if (this.f8326a == a.LOAD_IN_PROGRESS) {
            a(a.LOADED);
            this.f8327b.a(this, new Date().getTime() - this.n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f8327b.a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        c("onInterstitialAdShowSucceeded");
        this.f8327b.c(this);
    }

    public final void onInterstitialAdVisible() {
        c("onInterstitialAdVisible");
        this.f8327b.e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f8326a.name());
        if (this.f8326a == a.INIT_IN_PROGRESS) {
            r();
            a(a.NO_INIT);
            this.f8327b.b(ironSourceError, this);
            if (!h()) {
                this.f8327b.a(ironSourceError, this, new Date().getTime() - this.n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        c("onInterstitialInitSuccess state=" + this.f8326a.name());
        if (this.f8326a == a.INIT_IN_PROGRESS) {
            r();
            if (h()) {
                a(a.INIT_SUCCESS);
            } else {
                a(a.LOAD_IN_PROGRESS);
                s();
                try {
                    this.f8361c.loadInterstitial(this.f8364f, this);
                } catch (Throwable th) {
                    e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
                }
            }
            this.f8327b.f(this);
        }
    }
}
