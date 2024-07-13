package com.criteo.publisher;

import android.content.Context;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.context.UserData;
import com.criteo.publisher.m0.d;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.u;
import com.criteo.publisher.n0.h;
import java.util.concurrent.Future;

/* compiled from: DummyCriteo */
public class t extends Criteo {
    public void enrichAdObjectWithBid(Object obj, Bid bid) {
    }

    public void setMopubConsent(String str) {
    }

    public void setUsPrivacyOptOut(boolean z) {
    }

    public void setUserData(UserData userData) {
    }

    /* access modifiers changed from: package-private */
    public void getBidForAdUnit(AdUnit adUnit, ContextData contextData, d dVar) {
        dVar.a();
    }

    public void loadBid(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener) {
        bidResponseListener.onResponse((Bid) null);
    }

    /* access modifiers changed from: package-private */
    public u getDeviceInfo() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public com.criteo.publisher.model.t getConfig() {
        return new com.criteo.publisher.model.t();
    }

    /* access modifiers changed from: package-private */
    public com.criteo.publisher.j0.a getInterstitialActivityHelper() {
        return new c();
    }

    public l createBannerController(CriteoBannerView criteoBannerView) {
        return new l(criteoBannerView, this, s.c().i1(), s.c().c1());
    }

    /* compiled from: DummyCriteo */
    private static class b extends u {
        public void d() {
        }

        private b() {
            super((Context) null, new com.criteo.publisher.e0.c());
        }

        public Future<String> b() {
            return h.b("");
        }
    }

    /* compiled from: DummyCriteo */
    private static class c extends com.criteo.publisher.j0.a {
        public void a(String str, d dVar) {
        }

        public boolean b() {
            return false;
        }

        c() {
            super((Context) null, (com.criteo.publisher.a0.b) null);
        }
    }
}
