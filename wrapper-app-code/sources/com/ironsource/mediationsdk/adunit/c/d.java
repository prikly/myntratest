package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.B;
import com.ironsource.mediationsdk.C0886h;
import com.ironsource.mediationsdk.C0887i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.aa;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.c.e;
import com.ironsource.mediationsdk.adunit.d.a.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import java.util.Iterator;
import java.util.Set;

public abstract class d<Smash extends a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends e<Smash, Adapter> implements com.ironsource.mediationsdk.adunit.c.a.a {
    public d(a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    private void a(IronSourceError ironSourceError, String str) {
        this.q.f8473d.a(h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.o.b();
        this.r.b(ironSourceError);
        if (this.m.f8492h.b()) {
            a(false, false);
        }
    }

    public final void a(a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.l()));
        b bVar = this.r;
        if (bVar.f8493a == IronSource.AD_UNIT.INTERSTITIAL) {
            B.a().e();
        } else if (bVar.f8493a != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f8493a);
        }
    }

    public final void a(IronSourceError ironSourceError, a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.l() + " - error = " + ironSourceError));
        this.f8508c.put(aVar.k(), C0887i.a.ISAuctionPerformanceFailedToShow);
        a(e.a.READY_TO_LOAD);
        a(ironSourceError, "");
    }

    public final void a(Placement placement) {
        a aVar;
        IronSourceError ironSourceError;
        String stringBuffer;
        IronLog.INTERNAL.verbose(a("state = " + this.n));
        synchronized (this.t) {
            this.j = placement;
            this.q.f8473d.a(h());
            int i = 510;
            aVar = null;
            if (this.n == e.a.SHOWING) {
                IronSource.AD_UNIT ad_unit = this.m.f8485a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i, "can't show ad while an ad is already showing");
            } else if (this.n != e.a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(509, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.m.f8485a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i, "empty default placement");
            } else if (k.a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.m.f8485a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(a(ironSourceError.getErrorMessage()));
                stringBuffer = "";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it = this.f8506a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a aVar2 = (a) it.next();
                    if (aVar2.a()) {
                        a(e.a.SHOWING);
                        aVar2.a(true);
                        aVar = aVar2;
                        break;
                    }
                    if (aVar2.g() != null) {
                        stringBuffer2.append(aVar2.k() + ":" + aVar2.g() + ",");
                    }
                    aVar2.a(false);
                    IronLog.INTERNAL.verbose(a(aVar2.l() + " - not ready to show"));
                }
                if (aVar == null) {
                    ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.m.f8485a.toString());
                    stringBuffer = stringBuffer2.toString();
                }
            }
            a(ironSourceError, stringBuffer);
        }
        if (aVar != null) {
            Placement placement2 = this.j;
            if (this.m.f8492h.b()) {
                this.p.a();
            }
            aVar.a(placement2);
        }
    }

    public final void b(a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.l()));
        this.f8506a.a(aVar);
        this.l.a(aVar);
        if (this.l.b(aVar)) {
            IronLog.INTERNAL.verbose(a(aVar.k() + " was session capped"));
            aVar.f();
            IronSourceUtils.sendAutomationLog(aVar.k() + " was session capped");
        }
        k.b(ContextProvider.getInstance().getApplicationContext(), h(), this.m.f8485a);
        if (k.a(ContextProvider.getInstance().getApplicationContext(), h(), this.m.f8485a)) {
            IronLog.INTERNAL.verbose(a("placement " + h() + " is capped"));
            this.q.f8473d.h(h());
        }
        b bVar = this.r;
        if (bVar.f8493a == IronSource.AD_UNIT.INTERSTITIAL) {
            B.a().c();
        } else if (bVar.f8493a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            aa.a().b();
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + bVar.f8493a);
        }
        if (this.m.f8492h.b()) {
            a(false, false);
        }
        o.a().a(this.m.f8485a);
        if (this.m.a()) {
            b bVar2 = (b) this.f8507b.get(aVar.k());
            if (bVar2 != null) {
                C0886h.a(bVar2, aVar.i(), this.i, h());
                this.f8508c.put(aVar.k(), C0887i.a.ISAuctionPerformanceShowedSuccessfully);
                a(bVar2, h());
            } else {
                String k = aVar.k();
                String str = "showing instance missing from waterfall - " + k;
                IronLog.INTERNAL.verbose(a(str));
                this.q.f8474e.a(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, str, k);
            }
        }
        c cVar = this.o;
        if (cVar.f8502a.f8494a == a.C0085a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.a(cVar.f8502a.f8495b);
        }
    }

    public final boolean b() {
        if (!f()) {
            return false;
        }
        if (this.k && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f8506a.a().iterator();
        while (it.hasNext()) {
            if (((com.ironsource.mediationsdk.adunit.d.a.a) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        if (this.n == e.a.READY_TO_SHOW) {
            Iterator it = this.f8506a.a().iterator();
            while (it.hasNext()) {
                com.ironsource.mediationsdk.adunit.d.a.a aVar = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                if (aVar.d()) {
                    sb.append(aVar.k() + ";");
                }
            }
        }
        return sb.toString();
    }

    public final void c(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.l()));
        if (this.n == e.a.SHOWING) {
            a(e.a.READY_TO_LOAD);
        }
        c cVar = this.o;
        if (cVar.f8502a.f8494a == a.C0085a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.a(cVar.f8502a.f8495b);
        }
        b bVar = this.r;
        if (bVar.f8493a == IronSource.AD_UNIT.INTERSTITIAL) {
            B.a().d();
        } else if (bVar.f8493a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            aa.a().c();
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f8493a);
        }
    }

    public final void d(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.l()));
        b bVar = this.r;
        if (bVar.f8493a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            aa.a().d();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f8493a);
    }

    public final void e(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(a(aVar.l()));
        b bVar = this.r;
        if (bVar.f8493a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            aa.a().e();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar.f8493a);
    }
}
