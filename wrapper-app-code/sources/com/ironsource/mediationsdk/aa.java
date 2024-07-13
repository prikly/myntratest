package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;

public final class aa {

    /* renamed from: b  reason: collision with root package name */
    private static final aa f8437b = new aa();

    /* renamed from: a  reason: collision with root package name */
    public RewardedVideoListener f8438a = null;

    private aa() {
    }

    public static aa a() {
        return f8437b;
    }

    public final void a(final IronSourceError ironSourceError) {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAdShowFailed(ironSourceError);
                    aa aaVar = aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                }
            }
        });
    }

    public final void a(final Placement placement) {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAdRewarded(placement);
                    aa aaVar = aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement + ")", 1);
                }
            }
        });
    }

    public final void a(final boolean z) {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAvailabilityChanged(z);
                    aa aaVar = aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + z, 1);
                }
            }
        });
    }

    public final void b() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAdOpened();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
                }
            }
        });
    }

    public final void b(final Placement placement) {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAdClicked(placement);
                    aa aaVar = aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement + ")", 1);
                }
            }
        });
    }

    public final void c() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAdClosed();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
                }
            }
        });
    }

    public final void d() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAdStarted();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
                }
            }
        });
    }

    public final void e() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (aa.this.f8438a != null) {
                    aa.this.f8438a.onRewardedVideoAdEnded();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
                }
            }
        });
    }
}
