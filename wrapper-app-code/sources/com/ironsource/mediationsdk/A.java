package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

public final class A {

    /* renamed from: b  reason: collision with root package name */
    private static final A f8126b = new A();
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public ISDemandOnlyInterstitialListener f8127a = null;

    private A() {
    }

    public static A a() {
        return f8126b;
    }

    public final void a(final String str, final IronSourceError ironSourceError) {
        if (this.f8127a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    A.this.f8127a.onInterstitialAdLoadFailed(str, ironSourceError);
                    A a2 = A.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    public final void b(final String str, final IronSourceError ironSourceError) {
        if (this.f8127a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    A.this.f8127a.onInterstitialAdShowFailed(str, ironSourceError);
                    A a2 = A.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
