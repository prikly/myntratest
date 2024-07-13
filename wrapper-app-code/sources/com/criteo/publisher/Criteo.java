package com.criteo.publisher;

import android.app.Application;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.context.UserData;
import com.criteo.publisher.j0.a;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.t;
import com.criteo.publisher.model.u;
import java.util.ArrayList;
import java.util.List;

public abstract class Criteo {
    private static Criteo criteo;

    public abstract l createBannerController(CriteoBannerView criteoBannerView);

    public abstract void enrichAdObjectWithBid(Object obj, Bid bid);

    /* access modifiers changed from: package-private */
    public abstract void getBidForAdUnit(AdUnit adUnit, ContextData contextData, d dVar);

    /* access modifiers changed from: package-private */
    public abstract t getConfig();

    /* access modifiers changed from: package-private */
    public abstract u getDeviceInfo();

    /* access modifiers changed from: package-private */
    public abstract a getInterstitialActivityHelper();

    public abstract void loadBid(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener);

    public abstract void setMopubConsent(String str);

    public abstract void setUsPrivacyOptOut(boolean z);

    public abstract void setUserData(UserData userData);

    public static class Builder {
        /* access modifiers changed from: private */
        public List<AdUnit> adUnits = new ArrayList();
        /* access modifiers changed from: private */
        public final Application application;
        /* access modifiers changed from: private */
        public final String criteoPublisherId;
        /* access modifiers changed from: private */
        public boolean isDebugLogsEnabled = false;
        /* access modifiers changed from: private */
        public String mopubConsent;
        /* access modifiers changed from: private */
        public Boolean usPrivacyOptOut;

        public Builder(Application application2, String str) {
            this.application = application2;
            this.criteoPublisherId = str;
        }

        public Builder adUnits(List<AdUnit> list) {
            if (list == null) {
                this.adUnits = new ArrayList();
            } else {
                this.adUnits = list;
            }
            return this;
        }

        public Builder usPrivacyOptOut(boolean z) {
            this.usPrivacyOptOut = Boolean.valueOf(z);
            return this;
        }

        public Builder mopubConsent(String str) {
            this.mopubConsent = str;
            return this;
        }

        public Builder debugLogsEnabled(boolean z) {
            this.isDebugLogsEnabled = z;
            return this;
        }

        public Criteo init() throws CriteoInitException {
            return Criteo.init(this);
        }
    }

    /* access modifiers changed from: private */
    public static Criteo init(Builder builder) throws CriteoInitException {
        Criteo criteo2;
        Class<Criteo> cls = Criteo.class;
        g b2 = h.b(cls);
        synchronized (cls) {
            if (criteo == null) {
                try {
                    s c2 = s.c();
                    c2.a(builder.application);
                    c2.a(builder.criteoPublisherId);
                    if (builder.isDebugLogsEnabled) {
                        c2.t0().b(4);
                    }
                    if (c2.A0().d()) {
                        criteo = new m(builder.application, builder.adUnits, builder.usPrivacyOptOut, builder.mopubConsent, c2);
                        b2.a(y.a(builder.criteoPublisherId, builder.adUnits, getVersion()));
                    } else {
                        criteo = new t();
                        b2.a(y.a());
                    }
                } catch (Throwable th) {
                    criteo = new t();
                    CriteoInitException criteoInitException = new CriteoInitException("Internal error initializing Criteo instance.", th);
                    b2.a(y.a(criteoInitException));
                    throw criteoInitException;
                }
            } else {
                b2.a(y.b());
            }
            criteo2 = criteo;
        }
        return criteo2;
    }

    public static Criteo getInstance() {
        Criteo criteo2 = criteo;
        if (criteo2 != null) {
            return criteo2;
        }
        throw new q("You must initialize the SDK before calling Criteo.getInstance()");
    }

    static void setInstance(Criteo criteo2) {
        criteo = criteo2;
    }

    public void loadBid(AdUnit adUnit, BidResponseListener bidResponseListener) {
        loadBid(adUnit, new ContextData(), bidResponseListener);
    }

    public static String getVersion() {
        try {
            return s.c().m0().q();
        } catch (Throwable th) {
            h.b(Criteo.class).a(v.b(th));
            return "";
        }
    }
}
