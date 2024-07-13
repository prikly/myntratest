package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.c.a.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

public abstract class a<Listener extends com.ironsource.mediationsdk.adunit.c.a.a> extends c<Listener> implements AdapterAdInteractionListener {

    /* renamed from: g  reason: collision with root package name */
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> f8531g;

    public a(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.f8531g = baseAdInteractionAdapter;
    }

    public final void a(Placement placement) {
        int i;
        IronLog.INTERNAL.verbose(c("placementName = " + placement.getPlacementName()));
        try {
            this.f8537e = placement;
            this.f8535c.f8473d.a(q());
            this.f8531g.showAd(this.f8538f, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str));
            if (this.f8535c != null) {
                this.f8535c.f8474e.l(str);
            }
            IronSource.AD_UNIT ad_unit = this.f8533a.f8523a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = IronSourceError.ERROR_RV_SHOW_EXCEPTION;
            } else {
                IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                i = 510;
            }
            onAdShowFailed(i, str);
        }
    }

    public final void a(boolean z) {
        if (this.f8535c != null) {
            this.f8535c.f8473d.a(z);
        }
    }

    public final boolean a() {
        if (this.f8538f != null) {
            try {
                return h() ? this.f8536d == c.a.LOADED && this.f8531g.isAdAvailable(this.f8538f) : this.f8531g.isAdAvailable(this.f8538f);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                if (this.f8535c != null) {
                    this.f8535c.f8474e.l(str);
                }
            }
        }
        return false;
    }

    public void onAdClosed() {
        String str;
        String str2 = "";
        IronLog.INTERNAL.verbose(c(str2));
        a(c.a.NONE);
        if (this.f8535c != null) {
            if (this.f8533a.f8523a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                String c2 = ((com.ironsource.mediationsdk.adunit.c.a.a) this.f8534b).c();
                StringBuilder sb = new StringBuilder("otherInstanceAvailable = ");
                if (c2.length() > 0) {
                    str = "true|" + c2;
                } else {
                    str = "false";
                }
                sb.append(str);
                str2 = sb.toString();
            }
            this.f8535c.f8473d.a(q(), str2);
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f8534b).c(this);
    }

    public void onAdEnded() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.f8535c != null) {
            this.f8535c.f8473d.f(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f8534b).e(this);
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(c(""));
        a(c.a.SHOWING);
        if (this.f8535c != null) {
            this.f8535c.f8473d.c(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f8534b).b(this);
    }

    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i + ", " + str));
        if (this.f8535c != null) {
            this.f8535c.f8473d.a(q(), i, str, "");
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f8534b).a(new IronSourceError(i, str), this);
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.f8535c != null) {
            this.f8535c.f8473d.b(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f8534b).a(this);
    }

    public void onAdStarted() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.f8535c != null) {
            this.f8535c.f8473d.e(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f8534b).d(this);
    }

    public void onAdVisible() {
        IronLog.INTERNAL.verbose(c(""));
        if (this.f8535c != null) {
            this.f8535c.f8473d.g(q());
        }
    }
}
