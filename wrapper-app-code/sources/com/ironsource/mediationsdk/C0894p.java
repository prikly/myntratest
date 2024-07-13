package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.p  reason: case insensitive filesystem */
public final class C0894p {

    /* renamed from: c  reason: collision with root package name */
    private static final C0894p f8806c = new C0894p();

    /* renamed from: a  reason: collision with root package name */
    InterstitialListener f8807a = null;

    /* renamed from: b  reason: collision with root package name */
    RewardedVideoManualListener f8808b = null;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Long> f8809d = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Map<String, Boolean> f8810e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private int f8811f;

    /* renamed from: g  reason: collision with root package name */
    private int f8812g;

    private C0894p() {
    }

    public static synchronized C0894p a() {
        C0894p pVar;
        synchronized (C0894p.class) {
            pVar = f8806c;
        }
        return pVar;
    }

    /* access modifiers changed from: private */
    public void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f8809d.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            if (this.f8807a != null) {
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onInterstitialAdLoadFailed - error = " + ironSourceError.toString());
                this.f8807a.onInterstitialAdLoadFailed(ironSourceError);
                return;
            }
            IronLog.INTERNAL.error("mInterstitialListener is null");
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("ad unit not supported - " + ad_unit);
        } else if (this.f8808b != null) {
            IronLog ironLog3 = IronLog.CALLBACK;
            ironLog3.info("onRewardedVideoAdLoadFailed - error = " + ironSourceError.toString());
            this.f8808b.onRewardedVideoAdLoadFailed(ironSourceError);
        } else {
            IronLog.INTERNAL.warning("mRewardedVideoListener is null");
        }
    }

    public final void a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f8811f = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f8812g = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final synchronized void a(final IronSource.AD_UNIT ad_unit, final IronSourceError ironSourceError) {
        int i;
        if (!a(ad_unit)) {
            final String ad_unit2 = ad_unit.toString();
            if (!this.f8809d.containsKey(ad_unit2)) {
                b(ad_unit, ironSourceError);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = this.f8811f;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = this.f8812g;
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = 0;
            }
            long j = (long) (i * 1000);
            long currentTimeMillis = System.currentTimeMillis() - this.f8809d.get(ad_unit2).longValue();
            if (currentTimeMillis > j) {
                b(ad_unit, ironSourceError);
                return;
            }
            this.f8810e.put(ad_unit2, Boolean.TRUE);
            long j2 = j - currentTimeMillis;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("delaying callback by " + j2);
            c cVar = c.f8074a;
            c.a(new Runnable() {
                public final void run() {
                    C0894p.this.b(ad_unit, ironSourceError);
                    C0894p.this.f8810e.put(ad_unit2, Boolean.FALSE);
                }
            }, j2);
        }
    }

    public final synchronized boolean a(IronSource.AD_UNIT ad_unit) {
        if (!this.f8810e.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f8810e.get(ad_unit.toString()).booleanValue();
    }
}
