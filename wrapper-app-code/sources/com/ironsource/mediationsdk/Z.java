package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

public final class Z {

    /* renamed from: b  reason: collision with root package name */
    private static final Z f8367b = new Z();
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public ISDemandOnlyRewardedVideoListener f8368a = null;

    private Z() {
    }

    public static Z a() {
        return f8367b;
    }

    public final void a(final String str, final IronSourceError ironSourceError) {
        if (this.f8368a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    Z.this.f8368a.onRewardedVideoAdLoadFailed(str, ironSourceError);
                    Z z = Z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    public final void b(final String str, final IronSourceError ironSourceError) {
        if (this.f8368a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    Z.this.f8368a.onRewardedVideoAdShowFailed(str, ironSourceError);
                    Z z = Z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
