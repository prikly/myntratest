package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    private static final B f8142a = new B();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public InterstitialListener f8143b = null;

    private B() {
    }

    public static synchronized B a() {
        B b2;
        synchronized (B.class) {
            b2 = f8142a;
        }
        return b2;
    }

    public final void a(final IronSourceError ironSourceError) {
        if (this.f8143b != null) {
            c.f8074a.a(new Runnable() {
                public final void run() {
                    B.this.f8143b.onInterstitialAdLoadFailed(ironSourceError);
                    B b2 = B.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    public final synchronized void a(InterstitialListener interstitialListener) {
        this.f8143b = interstitialListener;
    }

    public final void b() {
        if (this.f8143b != null) {
            c.f8074a.a(new Runnable() {
                public final void run() {
                    B.this.f8143b.onInterstitialAdReady();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
                }
            });
        }
    }

    public final void b(final IronSourceError ironSourceError) {
        if (this.f8143b != null) {
            c.f8074a.a(new Runnable() {
                public final void run() {
                    B.this.f8143b.onInterstitialAdShowFailed(ironSourceError);
                    B b2 = B.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    public final void c() {
        if (this.f8143b != null) {
            c.f8074a.a(new Runnable() {
                public final void run() {
                    B.this.f8143b.onInterstitialAdOpened();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
                }
            });
        }
    }

    public final void d() {
        if (this.f8143b != null) {
            c.f8074a.a(new Runnable() {
                public final void run() {
                    B.this.f8143b.onInterstitialAdClosed();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
                }
            });
        }
    }

    public final void e() {
        if (this.f8143b != null) {
            c.f8074a.a(new Runnable() {
                public final void run() {
                    B.this.f8143b.onInterstitialAdShowSucceeded();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
                }
            });
        }
    }

    public final void f() {
        if (this.f8143b != null) {
            c.f8074a.a(new Runnable() {
                public final void run() {
                    B.this.f8143b.onInterstitialAdClicked();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
                }
            });
        }
    }
}
